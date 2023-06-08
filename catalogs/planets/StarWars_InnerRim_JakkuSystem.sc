// http://starwars.wikia.com/wiki/Jakku
// Region : Inner Rim
// Sector : 
// Grid location : I13
// X : -4132.67, Y : -4751.32, Z : -419.11028371084785
Planet	"Jakku/Jakku System 1"
{
	ParentBody     "Jakku System"
	Class          "Terra"
	//Mass            0.046977
	Radius          3200
	InertiaMoment   0.34364
	Oblateness      0.003055
	RotationPeriod  26.808
	Obliquity       -63.135
	EqAscendNode    -139.03

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "terra_arid_mars2_green.cfg"
		SurfStyle       0.10079
		Randomize      (0.757, 0.418, 0.688)
		colorDistMagn   0.062375
		colorDistFreq   356.4
		detailScale     6110.4
		drivenDarkening -1
		seaLevel        -0.015267
		snowLevel       2
		tropicLatitude  0.89874
		icecapLatitude  0.99766
		icecapHeight    0.061723
		climatePole     0.9375
		climateTropic   0.83206
		climateEquator  0.6875
		climateSteppeMin 0
		climateSteppeMax 0.3125
		climateForestMin 0.25
		climateForestMax 0.5625
		climateGrassMin  0.5
		climateGrassMax  0.8125
		humidity        0
		heightTempGrad  0.625
		beachWidth      0.00041221
		tropicWidth     0.07
		mainFreq        0.038168
		venusFreq       0.10687
		venusMagn       0
		mareFreq        0.0015248
		mareDensity     0.023773
		terraceProb     0.64885
		erosion         1
		montesMagn      0
		montesFreq      19.841
		montesSpiky     0.0079365
		montesFraction  0.039683
		dunesMagn       0.91603
		dunesFreq       5343.5
		dunesFraction   0.19847
		hillsMagn       0.68702
		hillsFreq       1145
		hillsFraction   0.091603
		hills2Fraction  0
		riversMagn      0
		riversFreq      0
		riversSin       0
		riftsMagn       0
		riftsFreq       0
		riftsSin        0
		canyonsMagn     0.034601
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.39682
		cracksFreq      0.71429
		cracksOctaves   0
		craterMagn      7.9389
		craterFreq      1.5267
		craterDensity   0.16031
		craterOctaves   1
		craterRayedFactor 1
		volcanoMagn     0.28244
		volcanoFreq     0.031746
		volcanoDensity  0.061069
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.061069
		volcanoRadius   0.42748
		volcanoTemp     45.802
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
		BumpHeight      4.6145
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.50737
		RoughnessIce    0.50737
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          9.4864
		Density         0.10821
		Pressure        0.83605
		Greenhouse      17.557
		Bright          5
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			N2        	77.773
			O2        	20.862
			Ar        	0.9303
			H2O       	0.4
			CO2       	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.964
		SemiMajorAxis   1.01636785
		Eccentricity    0.0295915
		Inclination     1.2071
		AscendingNode   -135.067
		ArgOfPericenter 126.205
		MeanAnomaly     92.6924
	}
}

Moon	"Jakku Moon 1/Jakku System 1.1"
{
	ParentBody     "Jakku"
	Class	       "Selena"

	Mass            1.00691e-010
	Radius          644.946
	InertiaMoment   0.398521

	Oblateness		0.003

	Obliquity       0.00889273
	EqAscendNode    109.53
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2.5
	Color          (0.057 0.049 0.044)

	Surface
	{
		SurfStyle       0.601499
		OceanStyle      0.68254
		Randomize      (0.953, -0.452, -0.207)
		colorDistMagn   0.0905216
		colorDistFreq   79.8199
		detailScale     1658.84
		colorConversion true
		drivenDarkening 0
		seaLevel        0.146549
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.103
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71211
		venusFreq       1.39637
		venusMagn       0
		mareFreq        0.0325506
		mareDensity     1.33311e-017
		terraceProb     0.316965
		erosion         0
		montesMagn      0.0556294
		montesFreq      26.2737
		montesSpiky     0.942848
		montesFraction  0.935982
		dunesMagn       0.0414928
		dunesFreq       842.22
		dunesFraction   0.464588
		hillsMagn       0.141854
		hillsFreq       89.8632
		hillsFraction   0.79038
		hills2Fraction  0
		riversMagn      57.6709
		riversFreq      2.55433
		riversSin       7.2924
		riversOctaves   0
		canyonsMagn     0.417205
		canyonsFreq     0.234934
		canyonFraction  0.336823
		cracksMagn      0.0305516
		cracksFreq      0.29522
		cracksOctaves   0
		craterMagn      0.609563
		craterFreq      2.13485
		craterDensity   0.838144
		craterOctaves   9
		craterRayedFactor 0.194714
		volcanoMagn     0.167136
		volcanoFreq     0.54578
		volcanoDensity  0.233943
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.228526
		volcanoRadius   0.136696
		volcanoTemp     1428.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.350, 0.300, 0.300, 0.000)
		colorShelf     (0.350, 0.300, 0.300, 0.000)
		colorBeach     (0.350, 0.258, 0.232, 0.000)
		colorDesert    (0.300, 0.215, 0.193, 0.200)
		colorLowland   (0.350, 0.258, 0.232, 0.000)
		colorUpland    (0.350, 0.258, 0.232, 0.000)
		colorRock      (0.350, 0.300, 0.300, 0.000)
		colorSnow      (0.500, 0.500, 0.500, 1.000)
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
		SemiMajorAxisKm 19133.5538
		//Period          0.00082523
		Eccentricity    2.46663e-005
		Inclination     0.00889273
		AscendingNode   109.53
		ArgOfPericenter 3.431
		MeanAnomaly     -174.836
	}
}

Moon	"Jakku Moon 2/Jakku System 1.2"
{
	ParentBody     "Jakku System 4"
	Class	       "Selena"

	Mass            1.63116e-010
	Radius          248.851
	InertiaMoment   0.399518

	Oblateness      0.0840748

	Obliquity       0.00252832
	EqAscendNode    110.021
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.512 0.503)

	Surface
	{
		SurfStyle       0.263145
		OceanStyle      0.878483
		Randomize      (0.562, -0.017, -0.034)
		colorDistMagn   0.0904887
		colorDistFreq   24.2616
		detailScale     640.059
		colorConversion true
		drivenDarkening 0
		seaLevel        0.256955
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.171534
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82327
		venusFreq       1.23202
		venusMagn       0
		mareFreq        0
		mareDensity     1.3329e-015
		terraceProb     0.187741
		erosion         0
		montesMagn      0.0668848
		montesFreq      9.60495
		montesSpiky     0.639984
		montesFraction  0.709022
		dunesMagn       0.0423075
		dunesFreq       332.967
		dunesFraction   0.84404
		hillsMagn       0.103155
		hillsFreq       33.7922
		hillsFraction   0.330386
		hills2Fraction  0
		riversMagn      60.255
		riversFreq      2.55448
		riversSin       5.76621
		riversOctaves   0
		canyonsMagn     0.594818
		canyonsFreq     0.0979676
		canyonFraction  0.820896
		cracksMagn      0.0489014
		cracksFreq      0.164842
		cracksOctaves   0
		craterMagn      0.850649
		craterFreq      0.695965
		craterDensity   0.960923
		craterOctaves   8
		craterRayedFactor 0.158707
		volcanoMagn     0.212154
		volcanoFreq     0.75075
		volcanoDensity  0.17964
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.203927
		volcanoRadius   0.191014
		volcanoTemp     1786.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.900, 0.900, 0.900, 0.000)
		colorShelf     (0.500, 0.500, 0.500, 0.000)
		colorBeach     (0.400, 0.396, 0.389, 0.000)
		colorDesert    (0.600, 0.594, 0.584, 0.200)
		colorLowland   (0.800, 0.792, 0.778, 0.500)
		colorUpland    (0.700, 0.693, 0.681, 0.800)
		colorRock      (0.400, 0.400, 0.400, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      12.4425
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
		SemiMajorAxisKm 54930.1656
		//Period          0.00101655
		Eccentricity    5.47092e-005
		Inclination     0.00252832
		AscendingNode   110.021
		ArgOfPericenter 115.695
		MeanAnomaly     -13.88
	}
}

///////////////
// GENERATED //
///////////////

Planet	"Jakku System 2"
{
	ParentBody     "Jakku System"
	Class	       "GasGiant"

	Mass            150.931
	Radius          64898.9
	InertiaMoment   0.219706

	Oblateness      0.0847912

	RotationPeriod  10.3498
	Obliquity       5.36399
	EqAscendNode    -60.0069

	AlbedoBond      0.491696
	AlbedoGeom      0.590035
	Brightness      2

	Surface
	{
		SurfStyle       0.608718
		Randomize      (-0.312, -0.642, -0.354)
		detailScale     166924
		colorConversion true
		tropicLatitude  0.0842769
		icecapLatitude  0.984277
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.27512
		stripeFluct     0.484125
		stripeTwist     10.0247
		cycloneMagn     16.3946
		cycloneFreq     0.929283
		cycloneDensity  0.335767
		cycloneOctaves  5
		colorLayer0    (0.570, 0.550, 0.480, 1.100)
		colorLayer1    (0.850, 0.860, 0.870, 0.700)
		colorLayer2    (0.450, 0.390, 0.260, 0.200)
		colorLayer3    (0.430, 0.330, 0.170, 0.020)
		colorLayer4    (0.830, 0.830, 0.830, 0.000)
		colorLayer5    (0.510, 0.400, 0.140, 0.000)
		colorLayer6    (0.370, 0.350, 0.280, 0.000)
		colorLayer7    (0.420, 0.390, 0.310, 1.000)
		colorLowPlants (0.830, 0.830, 0.830, 0.000)
		colorUpPlants  (0.510, 0.400, 0.140, 0.000)
		BumpHeight      16.5647
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          269.535
		Velocity        1221.88
		BumpHeight      68.2303
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.81143
		mainOctaves     12
		Coverage        0.416956
		stripeZones     6.27512
		stripeFluct     0.484125
		stripeTwist     10.0247
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          648.989
		Density         5383.13
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0290151
		Saturation      0.756743

		Composition
		{
			H2    	93.0033
			He    	6.60847
			CH4   	0.310456
			N2    	0.0361775
			NH3   	0.0251962
			O2    	0.00887072
			C2H2  	0.00342461
			Ne    	0.00122647
			C2H4  	0.00118973
			Ar    	0.000761262
			C2H6  	0.000584585
			C3H8  	0.000363026
		}
	}

	Aurora
	{
		Height      1451.6
		NorthLat    81.4791
		NorthLon    -71.3457
		NorthRadius 19905.3
		NorthWidth  9854.71
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.8025
		SouthLon    113.909
		SouthRadius 13314.7
		SouthWidth  5812.66
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     94946.2
		OuterRadius     212980
		RotationPeriod  13.9713
		RotationOffset  0
		FrontBright     0.173929
		BackBright      0.328024
		Density         0.174881
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.89694
		Period          2.40159
		Eccentricity    0.0902906
		Inclination     -1.7657
		AscendingNode   -63.3005
		ArgOfPericenter 283.381
		MeanAnomaly     349.752
	}
}

DwarfMoon	"Jakku System 5.D1"
{
	ParentBody     "Jakku System 5"
	Class	       "Asteroid"

	Mass            1.44076e-008
	Radius          31.5803
	InertiaMoment   0.399085

	Oblateness      0.249

	Obliquity       -0.00463631
	EqAscendNode    -58.9445
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.592 0.543)

	Surface
	{
		SurfStyle       0.186472
		OceanStyle      0.795977
		Randomize      (-0.641, -0.821, -0.956)
		colorDistMagn   0.464081
		colorDistFreq   0.682686
		detailScale     862.354
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717385
		terraceProb     0.451326
		erosion         0
		montesMagn      0.403043
		montesFreq      3.44766
		montesSpiky     0.945385
		montesFraction  0.53564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.41536
		hillsFraction   0.797146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263807
		craterFreq      0.197949
		craterDensity   0.844763
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560602
		volcanoTemp     1529.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.237, 0.217, 0.000)
		colorShelf     (0.269, 0.252, 0.231, 0.000)
		colorBeach     (0.285, 0.266, 0.244, 0.000)
		colorDesert    (0.301, 0.281, 0.258, 0.000)
		colorLowland   (0.317, 0.296, 0.271, 0.000)
		colorUpland    (0.333, 0.311, 0.285, 0.000)
		colorRock      (0.349, 0.326, 0.299, 0.000)
		colorSnow      (0.364, 0.340, 0.312, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000660201
		Period          0.000798553
		Eccentricity    7.9093e-005
		Inclination     -0.00463631
		AscendingNode   -58.9445
		ArgOfPericenter -46.6649
		MeanAnomaly     -116.529
	}
}

DwarfMoon	"Jakku System 5.D2"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.95863e-008
	Radius          40.9104
	InertiaMoment   0.399993

	Oblateness      0.249

	Obliquity       -0.0120743
	EqAscendNode    -84.1402
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.791 0.788)

	Surface
	{
		SurfStyle       0.384997
		OceanStyle      0.598566
		Randomize      (0.010, 0.246, 0.712)
		colorDistMagn   0.837108
		colorDistFreq   0.941924
		detailScale     1117.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500329
		terraceProb     0.135352
		erosion         0
		montesMagn      0.548761
		montesFreq      3.26422
		montesSpiky     0.873258
		montesFraction  0.804639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.26173
		hillsFraction   0.786521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25057
		craterFreq      0.263244
		craterDensity   0.939246
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41556
		volcanoTemp     1834.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.315, 0.000)
		colorShelf     (0.337, 0.336, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.376, 0.374, 0.000)
		colorLowland   (0.397, 0.396, 0.394, 0.000)
		colorUpland    (0.417, 0.415, 0.414, 0.000)
		colorRock      (0.437, 0.435, 0.433, 0.000)
		colorSnow      (0.457, 0.455, 0.453, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000742519
		Period          0.00095247
		Eccentricity    7.9775e-005
		Inclination     -0.0120743
		AscendingNode   -84.1402
		ArgOfPericenter 142.703
		MeanAnomaly     -55.7162
	}
}

DwarfMoon	"Jakku System 2.D3"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.65902e-008
	Radius          42.9167
	InertiaMoment   0.39812

	Oblateness      0.235108

	Obliquity       -0.0069936
	EqAscendNode    65.6474
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.582 0.580)

	Surface
	{
		SurfStyle       0.927808
		OceanStyle      0.767445
		Randomize      (0.048, 0.433, 0.727)
		colorDistMagn   0.737326
		colorDistFreq   1.33355
		detailScale     1171.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503495
		terraceProb     0.16516
		erosion         0
		montesMagn      0.626539
		montesFreq      2.67416
		montesSpiky     0.953791
		montesFraction  0.522664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.75779
		hillsFraction   0.354993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23364
		craterFreq      0.185735
		craterDensity   0.832157
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499885
		volcanoTemp     1674.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.204, 0.232, 0.050)
		colorShelf     (0.234, 0.239, 0.267, 0.040)
		colorBeach     (0.270, 0.273, 0.302, 0.030)
		colorDesert    (0.305, 0.308, 0.342, 0.020)
		colorLowland   (0.340, 0.343, 0.377, 0.030)
		colorUpland    (0.375, 0.378, 0.412, 0.050)
		colorRock      (0.410, 0.413, 0.459, 0.020)
		colorSnow      (0.410, 0.413, 0.459, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00088972
		Period          0.00124931
		Eccentricity    6.47545e-005
		Inclination     -0.0069936
		AscendingNode   65.6474
		ArgOfPericenter 8.51412
		MeanAnomaly     -91.8394
	}
}

DwarfMoon	"Jakku System 2.D4"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            3.6081e-008
	Radius          45.634
	InertiaMoment   0.399222

	Oblateness      0.166142

	Obliquity       -0.00641544
	EqAscendNode    61.8103
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.496 0.419)

	Surface
	{
		SurfStyle       0.0838508
		OceanStyle      0.912302
		Randomize      (-0.777, 0.977, 0.338)
		colorDistMagn   0.287794
		colorDistFreq   0.999261
		detailScale     1246.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521232
		terraceProb     0.121786
		erosion         0
		montesMagn      0.514889
		montesFreq      3.348
		montesSpiky     0.945252
		montesFraction  0.370825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.64931
		hillsFraction   0.441711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230381
		craterFreq      0.224562
		craterDensity   0.997433
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515075
		volcanoTemp     1395.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.199, 0.168, 0.000)
		colorShelf     (0.253, 0.211, 0.178, 0.000)
		colorBeach     (0.268, 0.223, 0.188, 0.000)
		colorDesert    (0.283, 0.236, 0.199, 0.000)
		colorLowland   (0.298, 0.248, 0.209, 0.000)
		colorUpland    (0.313, 0.261, 0.220, 0.000)
		colorRock      (0.328, 0.273, 0.230, 0.000)
		colorSnow      (0.343, 0.285, 0.241, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000960707
		Period          0.00140177
		Eccentricity    2.41682e-005
		Inclination     -0.00641544
		AscendingNode   61.8103
		ArgOfPericenter 20.6972
		MeanAnomaly     136.227
	}
}

Moon	"Jakku System 2.1"
{
	ParentBody     "Jakku System 2"
	Class	       "Selena"

	Mass            0.0117572
	Radius          1864.28
	InertiaMoment   0.37355

	Oblateness      0.00649678

	Obliquity       -0.144322
	EqAscendNode    -93.9642
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.694 0.691 0.687)

	Surface
	{
		SurfStyle       0.939438
		OceanStyle      0.387106
		Randomize      (-0.225, -0.929, -0.882)
		colorDistMagn   0.055206
		colorDistFreq   221.34
		detailScale     4795.04
		colorConversion true
		drivenDarkening 0
		seaLevel        0.172128
		snowLevel       2
		tropicLatitude  0.00343536
		icecapLatitude  10
		icecapHeight    0.141088
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88843
		venusFreq       0.550748
		venusMagn       0
		mareFreq        0.704117
		mareDensity     0.00328364
		terraceProb     0.360048
		erosion         0
		montesMagn      0.103995
		montesFreq      100.43
		montesSpiky     0.957008
		montesFraction  0.505763
		dunesMagn       0.0326194
		dunesFreq       2402.58
		dunesFraction   0.768202
		hillsMagn       0.125832
		hillsFreq       227.669
		hillsFraction   0.651236
		hills2Fraction  0
		riversMagn      56.204
		riversFreq      3.19392
		riversSin       5.4246
		riversOctaves   0
		canyonsMagn     0.651593
		canyonsFreq     0.605425
		canyonFraction  0.379727
		cracksMagn      0.0528681
		cracksFreq      0.400084
		cracksOctaves   0
		craterMagn      0.603041
		craterFreq      5.63977
		craterDensity   0.512129
		craterOctaves   7.02087
		craterRayedFactor 0.0750629
		volcanoMagn     0.296338
		volcanoFreq     0.649322
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.176469
		volcanoRadius   0.268673
		volcanoTemp     1324.85
		lavaCoverTidal  0.401932
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.493, 0.456, 0.399, 0.000)
		colorDesert    (0.576, 0.532, 0.440, 0.000)
		colorLowland   (0.458, 0.401, 0.330, 0.000)
		colorUpland    (0.410, 0.360, 0.309, 0.000)
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
		SemiMajorAxis   0.00162741
		Period          0.00309041
		Eccentricity    0.0422696
		Inclination     -0.144322
		AscendingNode   -93.9642
		ArgOfPericenter -157.793
		MeanAnomaly     -120.754
	}
}

Moon	"Jakku System 2.2"
{
	ParentBody     "Jakku System 2"
	Class	       "Selena"

	Mass            0.0136195
	Radius          1807.74
	InertiaMoment   0.369636

	Oblateness      0.00116148

	Obliquity       -1.26326
	EqAscendNode    -38.4079
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.586 0.582 0.575)

	Surface
	{
		SurfStyle       0.0562408
		OceanStyle      0.502635
		Randomize      (-0.978, 0.544, -0.780)
		colorDistMagn   0.0576423
		colorDistFreq   210.732
		detailScale     4649.61
		colorConversion true
		drivenDarkening 0
		seaLevel        0.229371
		snowLevel       2
		tropicLatitude  0.0416297
		icecapLatitude  6.84062
		icecapHeight    0.165943
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95875
		venusFreq       1.16036
		venusMagn       0
		mareFreq        0.874898
		mareDensity     0.00531929
		terraceProb     0.271097
		erosion         0
		montesMagn      0.0889275
		montesFreq      107.082
		montesSpiky     0.895053
		montesFraction  0.599337
		dunesMagn       0.0421586
		dunesFreq       2389.41
		dunesFraction   0.522178
		hillsMagn       0.112538
		hillsFreq       245.592
		hillsFraction   0.245706
		hills2Fraction  0
		riversMagn      56.6377
		riversFreq      3.06625
		riversSin       5.45349
		riversOctaves   0
		canyonsMagn     0.476972
		canyonsFreq     0.502121
		canyonFraction  0.442246
		cracksMagn      0.0520118
		cracksFreq      1.14804
		cracksOctaves   0
		craterMagn      0.599951
		craterFreq      3.24437
		craterDensity   0.761666
		craterOctaves   9.61947
		craterRayedFactor 0.0945163
		volcanoMagn     0.28331
		volcanoFreq     0.5978
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.176951
		volcanoRadius   0.218037
		volcanoTemp     1854.84
		lavaCoverTidal  0.139448
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.293, 0.291, 0.288, 0.000)
		colorDesert    (0.363, 0.349, 0.328, 0.200)
		colorLowland   (0.393, 0.372, 0.368, 0.500)
		colorUpland    (0.410, 0.390, 0.380, 0.800)
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
		SemiMajorAxis   0.00265431
		Period          0.00643722
		Eccentricity    0.0293465
		Inclination     -1.26326
		AscendingNode   -38.4079
		ArgOfPericenter 129.794
		MeanAnomaly     156.524
	}
}

Moon	"Jakku System 2.3"
{
	ParentBody     "Jakku System 2"
	Class	       "Selena"

	Mass            0.0158004
	Radius          2053.49
	InertiaMoment   0.365469

	Obliquity       -1.42476
	EqAscendNode    -59.7003
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.631 0.603 0.547)

	Surface
	{
		SurfStyle       0.069936
		OceanStyle      0.493745
		Randomize      (0.809, -0.754, -0.558)
		colorDistMagn   0.0924578
		colorDistFreq   209.113
		detailScale     5281.69
		colorConversion true
		drivenDarkening 0
		seaLevel        0.172496
		snowLevel       2
		tropicLatitude  0.0431207
		icecapLatitude  6.65173
		icecapHeight    0.122563
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.63465
		venusFreq       1.14319
		venusMagn       0
		mareFreq        1.13986
		mareDensity     0.00374013
		terraceProb     0.319531
		erosion         0
		montesMagn      0.11302
		montesFreq      75.4791
		montesSpiky     0.993243
		montesFraction  0.891965
		dunesMagn       0.0317284
		dunesFreq       2716.39
		dunesFraction   0.092762
		hillsMagn       0.128816
		hillsFreq       248.841
		hillsFraction   0.917174
		hills2Fraction  0
		riversMagn      67.9005
		riversFreq      2.59918
		riversSin       6.71415
		riversOctaves   0
		canyonsMagn     0.582118
		canyonsFreq     0.566076
		canyonFraction  0.309446
		cracksMagn      0.0331375
		cracksFreq      1.06215
		cracksOctaves   0
		craterMagn      0.547385
		craterFreq      5.0686
		craterDensity   0.931574
		craterOctaves   11
		craterRayedFactor 0.150583
		volcanoMagn     0.325268
		volcanoFreq     0.74197
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.44258
		volcanoFlows    0.132761
		volcanoRadius   0.270373
		volcanoTemp     1918.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.316, 0.301, 0.273, 0.000)
		colorDesert    (0.391, 0.362, 0.312, 0.200)
		colorLowland   (0.423, 0.386, 0.350, 0.500)
		colorUpland    (0.442, 0.404, 0.361, 0.800)
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
		SemiMajorAxis   0.0043292
		Period          0.0134085
		Eccentricity    0.0190758
		Inclination     -1.42476
		AscendingNode   -59.7003
		ArgOfPericenter 75.7226
		MeanAnomaly     35.9268
	}
}

DwarfMoon	"Jakku System 2.D5"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.23866e-007
	Radius          69.2345
	InertiaMoment   0.396681

	Obliquity       17.658
	EqAscendNode    -121.84
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.467 0.462 0.460)

	Surface
	{
		SurfStyle       0.0716404
		OceanStyle      0.479051
		Randomize      (0.505, 0.963, 0.665)
		colorDistMagn   0.466304
		colorDistFreq   3.88877
		detailScale     1890.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.29164
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472103
		terraceProb     0.209892
		erosion         0
		montesMagn      0.552905
		montesFreq      2.79923
		montesSpiky     0.91604
		montesFraction  0.399776
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.7188
		hillsFraction   0.469682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255959
		craterFreq      0.188244
		craterDensity   1.02157
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4735
		volcanoTemp     1981.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.185, 0.184, 0.000)
		colorShelf     (0.198, 0.197, 0.196, 0.000)
		colorBeach     (0.210, 0.208, 0.207, 0.000)
		colorDesert    (0.222, 0.220, 0.219, 0.000)
		colorLowland   (0.233, 0.231, 0.230, 0.000)
		colorUpland    (0.245, 0.243, 0.242, 0.000)
		colorRock      (0.257, 0.254, 0.253, 0.000)
		colorSnow      (0.268, 0.266, 0.265, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0173548
		Period          0.107627
		Eccentricity    0.486951
		Inclination     17.658
		AscendingNode   -121.84
		ArgOfPericenter -119.386
		MeanAnomaly     15.4211
	}
}

DwarfMoon	"Jakku System 2.D6"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.69915e-007
	Radius          73.4477
	InertiaMoment   0.398479

	Obliquity       -84.8576
	EqAscendNode    -3.16204
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.565 0.563)

	Surface
	{
		SurfStyle       0.218395
		OceanStyle      0.880217
		Randomize      (-0.478, -0.511, 0.792)
		colorDistMagn   0.887712
		colorDistFreq   3.32816
		detailScale     2005.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.186673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.379838
		terraceProb     0.152554
		erosion         0
		montesMagn      0.520561
		montesFreq      2.71656
		montesSpiky     0.84141
		montesFraction  0.762705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.7186
		hillsFraction   0.589608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20551
		craterFreq      0.221195
		craterDensity   0.826723
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475492
		volcanoTemp     1281.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.226, 0.225, 0.000)
		colorShelf     (0.241, 0.240, 0.239, 0.000)
		colorBeach     (0.256, 0.254, 0.253, 0.000)
		colorDesert    (0.270, 0.268, 0.268, 0.000)
		colorLowland   (0.284, 0.282, 0.282, 0.000)
		colorUpland    (0.298, 0.297, 0.296, 0.000)
		colorRock      (0.312, 0.311, 0.310, 0.000)
		colorSnow      (0.327, 0.325, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0177058
		Period          0.110908
		Eccentricity    0.460544
		Inclination     -84.8576
		AscendingNode   -3.16204
		ArgOfPericenter 69.8123
		MeanAnomaly     -3.83764
	}
}

DwarfMoon	"Jakku System 2.D7"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.3429e-007
	Radius          96.0145
	InertiaMoment   0.399485

	RotationPeriod  1701.46
	Obliquity       -57.0175
	EqAscendNode    30.0785

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.412 0.408)

	Surface
	{
		SurfStyle       0.676957
		OceanStyle      0.597092
		Randomize      (0.188, -0.248, -1.000)
		colorDistMagn   0.553429
		colorDistFreq   6.82839
		detailScale     2621.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949904
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571533
		terraceProb     0.199926
		erosion         0
		montesMagn      0.599051
		montesFreq      2.50259
		montesSpiky     0.970297
		montesFraction  0.58575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.8527
		hillsFraction   0.476836
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263187
		craterFreq      0.40206
		craterDensity   0.839771
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531141
		volcanoTemp     1342.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.114, 0.000)
		colorShelf     (0.167, 0.144, 0.131, 0.000)
		colorBeach     (0.196, 0.169, 0.155, 0.000)
		colorDesert    (0.212, 0.181, 0.151, 0.000)
		colorLowland   (0.233, 0.193, 0.171, 0.000)
		colorUpland    (0.258, 0.235, 0.208, 0.000)
		colorRock      (0.279, 0.255, 0.225, 0.000)
		colorSnow      (0.304, 0.272, 0.237, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.018292
		Period          0.116461
		Eccentricity    0.44538
		Inclination     -57.0175
		AscendingNode   30.0785
		ArgOfPericenter 127.143
		MeanAnomaly     -170.332
	}
}

DwarfMoon	"Jakku System 2.D8"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            3.25116e-007
	Radius          100.133
	InertiaMoment   0.397098

	RotationPeriod  1772.54
	Obliquity       -28.628
	EqAscendNode    176.059

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.575 0.533)

	Surface
	{
		SurfStyle       0.661164
		OceanStyle      0.718696
		Randomize      (0.202, -0.096, -0.209)
		colorDistMagn   0.315117
		colorDistFreq   3.94117
		detailScale     2734.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0329446
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411209
		terraceProb     0.295424
		erosion         0
		montesMagn      0.501883
		montesFreq      3.39527
		montesSpiky     0.869276
		montesFraction  0.617161
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.2671
		hillsFraction   0.542746
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271892
		craterFreq      0.346654
		craterDensity   0.919102
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446193
		volcanoTemp     1554.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.196, 0.149, 0.000)
		colorShelf     (0.249, 0.201, 0.171, 0.000)
		colorBeach     (0.293, 0.236, 0.202, 0.000)
		colorDesert    (0.318, 0.253, 0.197, 0.000)
		colorLowland   (0.349, 0.270, 0.224, 0.000)
		colorUpland    (0.386, 0.328, 0.272, 0.000)
		colorRock      (0.418, 0.357, 0.293, 0.000)
		colorSnow      (0.455, 0.380, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0187979
		Period          0.121326
		Eccentricity    0.467369
		Inclination     -28.628
		AscendingNode   176.059
		ArgOfPericenter -114.137
		MeanAnomaly     -127.974
	}
}

DwarfMoon	"Jakku System 2.D9"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.54654e-007
	Radius          107.402
	InertiaMoment   0.398641

	RotationPeriod  5434.6
	Obliquity       -5.9361
	EqAscendNode    128.193

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.603 0.598)

	Surface
	{
		SurfStyle       0.225585
		OceanStyle      0.159944
		Randomize      (0.803, -0.691, 0.351)
		colorDistMagn   0.295847
		colorDistFreq   6.57128
		detailScale     2932.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0902668
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582639
		terraceProb     0.40803
		erosion         0
		montesMagn      0.516171
		montesFreq      2.96508
		montesSpiky     0.961174
		montesFraction  0.505236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.21
		hillsFraction   0.4299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230506
		craterFreq      0.444696
		craterDensity   0.792709
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431496
		volcanoTemp     1523.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.241, 0.239, 0.000)
		colorShelf     (0.257, 0.256, 0.254, 0.000)
		colorBeach     (0.272, 0.271, 0.269, 0.000)
		colorDesert    (0.288, 0.286, 0.284, 0.000)
		colorLowland   (0.303, 0.301, 0.299, 0.000)
		colorUpland    (0.318, 0.316, 0.314, 0.000)
		colorRock      (0.333, 0.332, 0.329, 0.000)
		colorSnow      (0.348, 0.347, 0.344, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0190726
		Period          0.123995
		Eccentricity    0.228615
		Inclination     -5.9361
		AscendingNode   128.193
		ArgOfPericenter 173.913
		MeanAnomaly     -43.7499
	}
}

DwarfMoon	"Jakku System 2.D10"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            6.41751e-007
	Radius          115.317
	InertiaMoment   0.399613

	Obliquity       -68.2175
	EqAscendNode    -104.985
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.608 0.606)

	Surface
	{
		SurfStyle       0.356131
		OceanStyle      0.0275856
		Randomize      (-0.966, 0.701, 0.002)
		colorDistMagn   0.224614
		colorDistFreq   4.28261
		detailScale     3148.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932698
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326485
		terraceProb     0.164055
		erosion         0
		montesMagn      0.497606
		montesFreq      2.97405
		montesSpiky     0.934484
		montesFraction  0.349403
		dunesFraction   0
		hillsMagn       0
		hillsFreq       46.3442
		hillsFraction   0.569797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224281
		craterFreq      0.48506
		craterDensity   0.675716
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443762
		volcanoTemp     1142.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.242, 0.000)
		colorShelf     (0.260, 0.259, 0.257, 0.000)
		colorBeach     (0.276, 0.274, 0.273, 0.000)
		colorDesert    (0.291, 0.289, 0.288, 0.000)
		colorLowland   (0.306, 0.304, 0.303, 0.000)
		colorUpland    (0.322, 0.319, 0.318, 0.000)
		colorRock      (0.337, 0.335, 0.333, 0.000)
		colorSnow      (0.352, 0.350, 0.348, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0196708
		Period          0.129874
		Eccentricity    0.324799
		Inclination     -68.2175
		AscendingNode   -104.985
		ArgOfPericenter 121.833
		MeanAnomaly     45.0836
	}
}

DwarfMoon	"Jakku System 2.D11"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            9.16e-007
	Radius          154.127
	InertiaMoment   0.397418

	Obliquity       -88.1003
	EqAscendNode    114.662
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.378 0.330)

	Surface
	{
		SurfStyle       0.198386
		OceanStyle      0.295483
		Randomize      (0.518, 0.338, 0.197)
		colorDistMagn   0.106887
		colorDistFreq   13.3923
		detailScale     4208.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.908493
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644321
		terraceProb     0.369655
		erosion         0
		montesMagn      0.460318
		montesFreq      2.00882
		montesSpiky     0.725451
		montesFraction  0.690981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       52.593
		hillsFraction   0.644969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238574
		craterFreq      0.520006
		craterDensity   0.786202
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455731
		volcanoTemp     1586.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.151, 0.132, 0.000)
		colorShelf     (0.205, 0.161, 0.140, 0.000)
		colorBeach     (0.217, 0.170, 0.148, 0.000)
		colorDesert    (0.229, 0.179, 0.157, 0.000)
		colorLowland   (0.242, 0.189, 0.165, 0.000)
		colorUpland    (0.254, 0.198, 0.173, 0.000)
		colorRock      (0.266, 0.208, 0.181, 0.000)
		colorSnow      (0.278, 0.217, 0.190, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.020093
		Period          0.134078
		Eccentricity    0.481974
		Inclination     -88.1003
		AscendingNode   114.662
		ArgOfPericenter -58.2386
		MeanAnomaly     32.5489
	}
}

DwarfMoon	"Jakku System 2.D12"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.32503e-006
	Radius          161.046
	InertiaMoment   0.398794

	Obliquity       -15.1462
	EqAscendNode    -18.2901
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.649 0.643)

	Surface
	{
		SurfStyle       0.697122
		OceanStyle      0.504782
		Randomize      (0.928, 0.894, -0.350)
		colorDistMagn   0.144468
		colorDistFreq   7.76819
		detailScale     4397.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.498463
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423072
		terraceProb     0.405294
		erosion         0
		montesMagn      0.605652
		montesFreq      2.53423
		montesSpiky     0.941419
		montesFraction  0.66139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       73.8445
		hillsFraction   0.572508
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221172
		craterFreq      0.76127
		craterDensity   0.924722
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489866
		volcanoTemp     1294.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.221, 0.180, 0.000)
		colorShelf     (0.261, 0.227, 0.206, 0.000)
		colorBeach     (0.307, 0.266, 0.245, 0.000)
		colorDesert    (0.333, 0.285, 0.238, 0.000)
		colorLowland   (0.365, 0.305, 0.270, 0.000)
		colorUpland    (0.405, 0.370, 0.328, 0.000)
		colorRock      (0.437, 0.402, 0.354, 0.000)
		colorSnow      (0.476, 0.428, 0.373, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0206699
		Period          0.139894
		Eccentricity    0.0976155
		Inclination     -15.1462
		AscendingNode   -18.2901
		ArgOfPericenter 21.2517
		MeanAnomaly     -155.582
	}
}

DwarfMoon	"Jakku System 2.D13"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.94772e-006
	Radius          175.413
	InertiaMoment   0.39974

	RotationPeriod  2495.25
	Obliquity       12.7636
	EqAscendNode    11.9847

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.654 0.571)

	Surface
	{
		SurfStyle       0.198221
		OceanStyle      0.321495
		Randomize      (-0.994, 0.380, 0.003)
		colorDistMagn   0.859431
		colorDistFreq   9.86221
		detailScale     4789.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.428705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420969
		terraceProb     0.189327
		erosion         0
		montesMagn      0.422794
		montesFreq      2.51084
		montesSpiky     0.772974
		montesFraction  0.476508
		dunesFraction   0
		hillsMagn       0
		hillsFreq       76.4362
		hillsFraction   0.782373
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229973
		craterFreq      0.762513
		craterDensity   0.887156
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481954
		volcanoTemp     1781.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.261, 0.228, 0.000)
		colorShelf     (0.307, 0.278, 0.243, 0.000)
		colorBeach     (0.325, 0.294, 0.257, 0.000)
		colorDesert    (0.343, 0.310, 0.271, 0.000)
		colorLowland   (0.361, 0.327, 0.285, 0.000)
		colorUpland    (0.380, 0.343, 0.300, 0.000)
		colorRock      (0.398, 0.359, 0.314, 0.000)
		colorSnow      (0.416, 0.376, 0.328, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0209091
		Period          0.142329
		Eccentricity    0.274105
		Inclination     12.7636
		AscendingNode   11.9847
		ArgOfPericenter 53.287
		MeanAnomaly     -101.1
	}
}

DwarfMoon	"Jakku System 2.D14"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.91916e-006
	Radius          192.467
	InertiaMoment   0.397682

	RotationPeriod  2114.79
	Obliquity       85.7349
	EqAscendNode    104.193

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.579 0.538)

	Surface
	{
		SurfStyle       0.672996
		OceanStyle      0.211443
		Randomize      (0.460, -0.573, 0.295)
		colorDistMagn   0.39724
		colorDistFreq   30.1109
		detailScale     5255.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306489
		terraceProb     0.244422
		erosion         0
		montesMagn      0.613799
		montesFreq      2.89227
		montesSpiky     0.911746
		montesFraction  0.360162
		dunesFraction   0
		hillsMagn       0
		hillsFreq       119.103
		hillsFraction   0.644616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201145
		craterFreq      1.29289
		craterDensity   0.825865
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526208
		volcanoTemp     1521.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.197, 0.151, 0.000)
		colorShelf     (0.262, 0.203, 0.172, 0.000)
		colorBeach     (0.308, 0.237, 0.204, 0.000)
		colorDesert    (0.335, 0.255, 0.199, 0.000)
		colorLowland   (0.367, 0.272, 0.226, 0.000)
		colorUpland    (0.407, 0.330, 0.274, 0.000)
		colorRock      (0.440, 0.359, 0.296, 0.000)
		colorSnow      (0.479, 0.382, 0.312, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0211458
		Period          0.144753
		Eccentricity    0.301119
		Inclination     85.7349
		AscendingNode   104.193
		ArgOfPericenter -168.176
		MeanAnomaly     -111.757
	}
}

DwarfMoon	"Jakku System 2.D15"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.48005e-006
	Radius          269.323
	InertiaMoment   0.398941

	Obliquity       -37.5077
	EqAscendNode    84.0793
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.478 0.473)

	Surface
	{
		SurfStyle       0.581175
		OceanStyle      0.989617
		Randomize      (-0.779, -0.742, 0.163)
		colorDistMagn   0.410753
		colorDistFreq   14.4157
		detailScale     7354.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.806643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642544
		terraceProb     0.112742
		erosion         0
		montesMagn      0.5695
		montesFreq      2.2564
		montesSpiky     0.904295
		montesFraction  0.609374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       216.026
		hillsFraction   0.553527
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221569
		craterFreq      2.0889
		craterDensity   0.882978
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468041
		volcanoTemp     1766.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.163, 0.132, 0.000)
		colorShelf     (0.193, 0.167, 0.151, 0.000)
		colorBeach     (0.227, 0.196, 0.180, 0.000)
		colorDesert    (0.246, 0.210, 0.175, 0.000)
		colorLowland   (0.271, 0.225, 0.199, 0.000)
		colorUpland    (0.299, 0.272, 0.241, 0.000)
		colorRock      (0.324, 0.296, 0.260, 0.000)
		colorSnow      (0.353, 0.315, 0.274, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0213768
		Period          0.147131
		Eccentricity    0.11106
		Inclination     -37.5077
		AscendingNode   84.0793
		ArgOfPericenter -146.901
		MeanAnomaly     32.4783
	}
}

DwarfMoon	"Jakku System 2.D16"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.21489e-011
	Radius          3.39551
	InertiaMoment   0.399866

	RotationPeriod  1744.7
	Obliquity       -41.4651
	EqAscendNode    42.4592

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.788 0.786)

	Surface
	{
		SurfStyle       0.687902
		OceanStyle      0.975504
		Randomize      (0.546, -0.263, -0.914)
		colorDistMagn   0.712946
		colorDistFreq   0.0100234
		detailScale     92.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42689
		terraceProb     0.359928
		erosion         0
		montesMagn      0.639258
		montesFreq      2.70499
		montesSpiky     0.998958
		montesFraction  0.486158
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0229994
		hillsFraction   0.534873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259106
		craterFreq      0.265235
		craterDensity   0.835915
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494825
		volcanoTemp     1637.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.268, 0.220, 0.000)
		colorShelf     (0.316, 0.276, 0.251, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.403, 0.347, 0.291, 0.000)
		colorLowland   (0.443, 0.370, 0.330, 0.000)
		colorUpland    (0.490, 0.449, 0.401, 0.000)
		colorRock      (0.530, 0.488, 0.432, 0.000)
		colorSnow      (0.577, 0.520, 0.456, 1.000)
		BumpHeight      3.05596
		BumpOffset      0.611191
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0215841
		Period          0.149276
		Eccentricity    0.319082
		Inclination     -41.4651
		AscendingNode   42.4592
		ArgOfPericenter -15.5568
		MeanAnomaly     -45.957
	}
}

DwarfMoon	"Jakku System 2.D17"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.48102e-011
	Radius          4.11981
	InertiaMoment   0.397911

	Obliquity       47.9235
	EqAscendNode    -101.981
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.703 0.701)

	Surface
	{
		SurfStyle       0.712019
		OceanStyle      0.0367555
		Randomize      (0.373, -0.190, 0.814)
		colorDistMagn   0.797651
		colorDistFreq   0.00884347
		detailScale     112.498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.82616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323382
		terraceProb     0.148933
		erosion         0
		montesMagn      0.470032
		montesFreq      2.90977
		montesSpiky     0.965214
		montesFraction  0.53516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0357333
		hillsFraction   0.816878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272159
		craterFreq      0.262791
		craterDensity   0.746874
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506396
		volcanoTemp     1347.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.239, 0.196, 0.000)
		colorShelf     (0.282, 0.246, 0.224, 0.000)
		colorBeach     (0.331, 0.288, 0.266, 0.000)
		colorDesert    (0.359, 0.309, 0.259, 0.000)
		colorLowland   (0.395, 0.330, 0.294, 0.000)
		colorUpland    (0.437, 0.401, 0.358, 0.000)
		colorRock      (0.472, 0.436, 0.386, 0.000)
		colorSnow      (0.514, 0.464, 0.407, 1.000)
		BumpHeight      3.70783
		BumpOffset      0.741565
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0220554
		Period          0.154192
		Eccentricity    0.38744
		Inclination     47.9235
		AscendingNode   -101.981
		ArgOfPericenter 81.0259
		MeanAnomaly     -125.975
	}
}

DwarfMoon	"Jakku System 2.D18"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.60407e-011
	Radius          4.85921
	InertiaMoment   0.399082

	Obliquity       85.7024
	EqAscendNode    168.216
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.731 0.728)

	Surface
	{
		SurfStyle       0.783221
		OceanStyle      0.687606
		Randomize      (-0.214, 0.987, 0.883)
		colorDistMagn   0.44731
		colorDistFreq   0.0144667
		detailScale     132.689
		colorConversion true
		snowLevel       2
		tropicLatitude  0.203653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310361
		terraceProb     0.507808
		erosion         0
		montesMagn      0.526746
		montesFreq      2.42699
		montesSpiky     0.979951
		montesFraction  0.565933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.053093
		hillsFraction   0.545161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241464
		craterFreq      0.252655
		craterDensity   0.825276
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515158
		volcanoTemp     1847.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.249, 0.204, 0.000)
		colorShelf     (0.294, 0.256, 0.233, 0.000)
		colorBeach     (0.345, 0.300, 0.277, 0.000)
		colorDesert    (0.374, 0.322, 0.269, 0.000)
		colorLowland   (0.411, 0.344, 0.306, 0.000)
		colorUpland    (0.455, 0.417, 0.371, 0.000)
		colorRock      (0.492, 0.453, 0.400, 0.000)
		colorSnow      (0.536, 0.483, 0.422, 1.000)
		BumpHeight      4.37329
		BumpOffset      0.874657
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0224521
		Period          0.158371
		Eccentricity    0.392797
		Inclination     85.7024
		AscendingNode   168.216
		ArgOfPericenter 32.195
		MeanAnomaly     -95.6124
	}
}

DwarfMoon	"Jakku System 2.D19"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            7.98709e-011
	Radius          7.61866
	InertiaMoment   0.399991

	RotationPeriod  3535.26
	Obliquity       35.3702
	EqAscendNode    91.8739

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.611 0.532 0.503)

	Surface
	{
		SurfStyle       0.21237
		OceanStyle      0.303101
		Randomize      (-0.245, -0.962, 0.876)
		colorDistMagn   0.171382
		colorDistFreq   0.0333152
		detailScale     208.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.73701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632269
		terraceProb     0.423551
		erosion         0
		montesMagn      0.536689
		montesFreq      2.43811
		montesSpiky     0.991151
		montesFraction  0.483169
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.116161
		hillsFraction   0.386582
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248203
		craterFreq      0.268241
		craterDensity   0.817137
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547882
		volcanoTemp     1407.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.213, 0.201, 0.000)
		colorShelf     (0.260, 0.226, 0.214, 0.000)
		colorBeach     (0.275, 0.240, 0.227, 0.000)
		colorDesert    (0.290, 0.253, 0.239, 0.000)
		colorLowland   (0.306, 0.266, 0.252, 0.000)
		colorUpland    (0.321, 0.279, 0.264, 0.000)
		colorRock      (0.336, 0.293, 0.277, 0.000)
		colorSnow      (0.351, 0.306, 0.289, 1.000)
		BumpHeight      6.8568
		BumpOffset      1.37136
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.02273
		Period          0.16132
		Eccentricity    0.292857
		Inclination     35.3702
		AscendingNode   91.8739
		ArgOfPericenter 72.7668
		MeanAnomaly     -97.5437
	}
}

DwarfMoon	"Jakku System 2.D20"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.31808e-010
	Radius          7.57694
	InertiaMoment   0.398116

	RotationPeriod  4387.7
	Obliquity       61.8164
	EqAscendNode    73.2737

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.683 0.681)

	Surface
	{
		SurfStyle       0.801533
		OceanStyle      0.278954
		Randomize      (-0.410, -0.470, -0.027)
		colorDistMagn   0.630446
		colorDistFreq   0.0195797
		detailScale     206.901
		colorConversion true
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727447
		terraceProb     0.161235
		erosion         0
		montesMagn      0.403564
		montesFreq      3.0275
		montesSpiky     0.925832
		montesFraction  0.609511
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.17253
		hillsFraction   0.580112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239704
		craterFreq      0.217944
		craterDensity   0.96561
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453247
		volcanoTemp     1348.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.232, 0.191, 0.000)
		colorShelf     (0.274, 0.239, 0.218, 0.000)
		colorBeach     (0.323, 0.280, 0.259, 0.000)
		colorDesert    (0.350, 0.301, 0.252, 0.000)
		colorLowland   (0.384, 0.321, 0.286, 0.000)
		colorUpland    (0.425, 0.390, 0.347, 0.000)
		colorRock      (0.460, 0.424, 0.375, 0.000)
		colorSnow      (0.501, 0.451, 0.395, 1.000)
		BumpHeight      6.81924
		BumpOffset      1.36385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0232464
		Period          0.166849
		Eccentricity    0.249769
		Inclination     61.8164
		AscendingNode   73.2737
		ArgOfPericenter 171.493
		MeanAnomaly     -174.239
	}
}

DwarfMoon	"Jakku System 2.D21"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.09322e-010
	Radius          8.43491
	InertiaMoment   0.399219

	Obliquity       -81.584
	EqAscendNode    -43.6884
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.487 0.484 0.479)

	Surface
	{
		SurfStyle       0.789656
		OceanStyle      0.216972
		Randomize      (-0.857, -0.811, -0.807)
		colorDistMagn   0.789324
		colorDistFreq   0.0562712
		detailScale     230.329
		colorConversion true
		snowLevel       2
		tropicLatitude  0.727417
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.28006
		terraceProb     0.506477
		erosion         0
		montesMagn      0.628574
		montesFreq      2.73447
		montesSpiky     0.904009
		montesFraction  0.42639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.114984
		hillsFraction   0.54993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261838
		craterFreq      0.217351
		craterDensity   0.776176
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.618473
		volcanoTemp     1663.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.165, 0.134, 0.000)
		colorShelf     (0.195, 0.169, 0.153, 0.000)
		colorBeach     (0.229, 0.198, 0.182, 0.000)
		colorDesert    (0.248, 0.213, 0.177, 0.000)
		colorLowland   (0.273, 0.228, 0.201, 0.000)
		colorUpland    (0.302, 0.276, 0.244, 0.000)
		colorRock      (0.326, 0.300, 0.263, 0.000)
		colorSnow      (0.355, 0.319, 0.278, 1.000)
		BumpHeight      7.59142
		BumpOffset      1.51828
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0238108
		Period          0.172962
		Eccentricity    0.0114595
		Inclination     -81.584
		AscendingNode   -43.6884
		ArgOfPericenter -144.776
		MeanAnomaly     -62.6238
	}
}

DwarfMoon	"Jakku System 2.D22"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            3.2249e-010
	Radius          9.35616
	InertiaMoment   0.396011

	Obliquity       -83.9681
	EqAscendNode    179.992
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.664 0.661)

	Surface
	{
		SurfStyle       0.561486
		OceanStyle      0.448093
		Randomize      (0.946, 0.556, 0.217)
		colorDistMagn   0.334514
		colorDistFreq   0.0641291
		detailScale     255.485
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651367
		terraceProb     0.10262
		erosion         0
		montesMagn      0.439566
		montesFreq      2.84376
		montesSpiky     0.812463
		montesFraction  0.57755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.207765
		hillsFraction   0.721126
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240695
		craterFreq      0.181952
		craterDensity   0.877916
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553217
		volcanoTemp     1238.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.226, 0.185, 0.000)
		colorShelf     (0.266, 0.232, 0.211, 0.000)
		colorBeach     (0.313, 0.272, 0.251, 0.000)
		colorDesert    (0.340, 0.292, 0.245, 0.000)
		colorLowland   (0.373, 0.312, 0.278, 0.000)
		colorUpland    (0.413, 0.378, 0.337, 0.000)
		colorRock      (0.446, 0.412, 0.364, 0.000)
		colorSnow      (0.486, 0.438, 0.383, 1.000)
		BumpHeight      8.42054
		BumpOffset      1.68411
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0242541
		Period          0.177815
		Eccentricity    0.179108
		Inclination     -83.9681
		AscendingNode   179.992
		ArgOfPericenter 13.0176
		MeanAnomaly     -118.28
	}
}

DwarfMoon	"Jakku System 2.D23"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.84852e-010
	Radius          10.0011
	InertiaMoment   0.398303

	Obliquity       82.0555
	EqAscendNode    8.92955
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.553 0.550)

	Surface
	{
		SurfStyle       0.950862
		OceanStyle      0.553543
		Randomize      (-0.126, -0.036, -0.905)
		colorDistMagn   0.356163
		colorDistFreq   0.033053
		detailScale     273.098
		colorConversion true
		snowLevel       2
		tropicLatitude  0.312537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420043
		terraceProb     0.171672
		erosion         0
		montesMagn      0.408558
		montesFreq      4.23087
		montesSpiky     0.951281
		montesFraction  0.469802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.168931
		hillsFraction   0.690898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245583
		craterFreq      0.168741
		craterDensity   1.07443
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493112
		volcanoTemp     1789.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.194, 0.220, 0.050)
		colorShelf     (0.222, 0.227, 0.253, 0.040)
		colorBeach     (0.255, 0.260, 0.286, 0.030)
		colorDesert    (0.288, 0.293, 0.324, 0.020)
		colorLowland   (0.322, 0.326, 0.357, 0.030)
		colorUpland    (0.355, 0.359, 0.390, 0.050)
		colorRock      (0.388, 0.393, 0.434, 0.020)
		colorSnow      (0.388, 0.393, 0.434, 1.000)
		BumpHeight      9.00102
		BumpOffset      1.8002
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0245717
		Period          0.181319
		Eccentricity    0.374245
		Inclination     82.0555
		AscendingNode   8.92955
		ArgOfPericenter 97.5587
		MeanAnomaly     -141.963
	}
}

DwarfMoon	"Jakku System 2.D24"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            7.14548e-010
	Radius          13.4277
	InertiaMoment   0.399352

	Obliquity       -52.684
	EqAscendNode    113.453
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.690 0.687)

	Surface
	{
		SurfStyle       0.872322
		OceanStyle      0.381067
		Randomize      (0.395, 0.931, -0.889)
		colorDistMagn   0.0763125
		colorDistFreq   0.0555344
		detailScale     366.667
		colorConversion true
		snowLevel       2
		tropicLatitude  0.785213
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413973
		terraceProb     0.275849
		erosion         0
		montesMagn      0.568642
		montesFreq      2.61102
		montesSpiky     0.935541
		montesFraction  0.809503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.311784
		hillsFraction   0.600624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249525
		craterFreq      0.218909
		craterDensity   0.86391
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532899
		volcanoTemp     1849.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.241, 0.275, 0.050)
		colorShelf     (0.277, 0.283, 0.316, 0.040)
		colorBeach     (0.318, 0.324, 0.357, 0.030)
		colorDesert    (0.360, 0.366, 0.406, 0.020)
		colorLowland   (0.401, 0.407, 0.447, 0.030)
		colorUpland    (0.443, 0.448, 0.488, 0.050)
		colorRock      (0.484, 0.490, 0.543, 0.020)
		colorSnow      (0.484, 0.490, 0.543, 1.000)
		BumpHeight      12.085
		BumpOffset      2.41699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0252067
		Period          0.188392
		Eccentricity    0.183738
		Inclination     -52.684
		AscendingNode   113.453
		ArgOfPericenter 42.8305
		MeanAnomaly     -56.3709
	}
}

DwarfMoon	"Jakku System 2.D25"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.03584e-009
	Radius          14.4576
	InertiaMoment   0.39667

	RotationPeriod  2788.33
	Obliquity       -85.9586
	EqAscendNode    -152.419

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.527 0.400)

	Surface
	{
		SurfStyle       0.868675
		OceanStyle      0.883593
		Randomize      (-0.995, -0.103, -0.925)
		colorDistMagn   0.490479
		colorDistFreq   0.0779564
		detailScale     394.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.461917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480956
		terraceProb     0.431673
		erosion         0
		montesMagn      0.357387
		montesFreq      2.6248
		montesSpiky     0.948012
		montesFraction  0.5043
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.596004
		hillsFraction   0.670846
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218713
		craterFreq      0.225041
		craterDensity   1.00245
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445415
		volcanoTemp     1347.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.184, 0.160, 0.050)
		colorShelf     (0.262, 0.216, 0.184, 0.040)
		colorBeach     (0.301, 0.248, 0.208, 0.030)
		colorDesert    (0.340, 0.279, 0.236, 0.020)
		colorLowland   (0.379, 0.311, 0.260, 0.030)
		colorUpland    (0.419, 0.343, 0.284, 0.050)
		colorRock      (0.458, 0.374, 0.316, 0.020)
		colorSnow      (0.458, 0.374, 0.316, 1.000)
		BumpHeight      13.0119
		BumpOffset      2.60238
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0254258
		Period          0.190855
		Eccentricity    0.154022
		Inclination     -85.9586
		AscendingNode   -152.419
		ArgOfPericenter 90.5551
		MeanAnomaly     -101.127
	}
}

DwarfMoon	"Jakku System 2.D26"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.48114e-009
	Radius          15.6462
	InertiaMoment   0.398475

	Obliquity       30.6756
	EqAscendNode    25.9907
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.508 0.503)

	Surface
	{
		SurfStyle       0.813937
		OceanStyle      0.789588
		Randomize      (-0.187, 0.600, 0.245)
		colorDistMagn   0.779332
		colorDistFreq   0.0955557
		detailScale     427.246
		colorConversion true
		snowLevel       2
		tropicLatitude  0.862673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339149
		terraceProb     0.205844
		erosion         0
		montesMagn      0.543787
		montesFreq      3.70016
		montesSpiky     0.87725
		montesFraction  0.575065
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.441158
		hillsFraction   0.926247
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246967
		craterFreq      0.263678
		craterDensity   0.984656
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489195
		volcanoTemp     1673.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.173, 0.141, 0.000)
		colorShelf     (0.205, 0.178, 0.161, 0.000)
		colorBeach     (0.240, 0.208, 0.191, 0.000)
		colorDesert    (0.261, 0.223, 0.186, 0.000)
		colorLowland   (0.286, 0.239, 0.211, 0.000)
		colorUpland    (0.317, 0.289, 0.257, 0.000)
		colorRock      (0.343, 0.315, 0.277, 0.000)
		colorSnow      (0.373, 0.335, 0.292, 1.000)
		BumpHeight      14.0816
		BumpOffset      2.81632
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0260775
		Period          0.198239
		Eccentricity    0.46366
		Inclination     30.6756
		AscendingNode   25.9907
		ArgOfPericenter 88.5254
		MeanAnomaly     -66.5584
	}
}

DwarfMoon	"Jakku System 2.D27"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.09377e-009
	Radius          16.5923
	InertiaMoment   0.399482

	RotationPeriod  2369.01
	Obliquity       69.0134
	EqAscendNode    118.173

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.466 0.462 0.460)

	Surface
	{
		SurfStyle       0.7659
		OceanStyle      0.581668
		Randomize      (-0.894, -0.268, 0.519)
		colorDistMagn   0.491479
		colorDistFreq   0.180034
		detailScale     453.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.841765
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63985
		terraceProb     0.107723
		erosion         0
		montesMagn      0.594462
		montesFreq      2.92736
		montesSpiky     0.93245
		montesFraction  0.485364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.594709
		hillsFraction   0.549087
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26046
		craterFreq      0.26641
		craterDensity   0.922467
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.414464
		volcanoTemp     1617.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.157, 0.129, 0.000)
		colorShelf     (0.186, 0.162, 0.147, 0.000)
		colorBeach     (0.219, 0.189, 0.175, 0.000)
		colorDesert    (0.237, 0.203, 0.170, 0.000)
		colorLowland   (0.261, 0.217, 0.193, 0.000)
		colorUpland    (0.289, 0.263, 0.234, 0.000)
		colorRock      (0.312, 0.286, 0.253, 0.000)
		colorSnow      (0.340, 0.305, 0.267, 1.000)
		BumpHeight      14.933
		BumpOffset      2.98661
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0264665
		Period          0.202692
		Eccentricity    0.217689
		Inclination     69.0134
		AscendingNode   118.173
		ArgOfPericenter 120.749
		MeanAnomaly     93.1695
	}
}

DwarfMoon	"Jakku System 2.D28"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.93166e-009
	Radius          21.7105
	InertiaMoment   0.397091

	Obliquity       -49.8134
	EqAscendNode    -162.141
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.678 0.676)

	Surface
	{
		SurfStyle       0.631081
		OceanStyle      0.644098
		Randomize      (0.219, -0.949, 0.921)
		colorDistMagn   0.112277
		colorDistFreq   0.338422
		detailScale     592.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.235484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597583
		terraceProb     0.43296
		erosion         0
		montesMagn      0.35507
		montesFreq      2.87127
		montesSpiky     0.889309
		montesFraction  0.774281
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32176
		hillsFraction   0.694953
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251936
		craterFreq      0.195554
		craterDensity   1.01193
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491669
		volcanoTemp     1388.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.231, 0.189, 0.000)
		colorShelf     (0.272, 0.237, 0.216, 0.000)
		colorBeach     (0.319, 0.278, 0.257, 0.000)
		colorDesert    (0.347, 0.299, 0.250, 0.000)
		colorLowland   (0.381, 0.319, 0.284, 0.000)
		colorUpland    (0.421, 0.387, 0.345, 0.000)
		colorRock      (0.455, 0.421, 0.372, 0.000)
		colorSnow      (0.496, 0.448, 0.392, 1.000)
		BumpHeight      19.5394
		BumpOffset      3.90788
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0270272
		Period          0.209166
		Eccentricity    0.0320142
		Inclination     -49.8134
		AscendingNode   -162.141
		ArgOfPericenter -124.974
		MeanAnomaly     -124.412
	}
}

DwarfMoon	"Jakku System 2.D29"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.07236e-009
	Radius          22.9549
	InertiaMoment   0.398637

	Obliquity       11.5379
	EqAscendNode    -49.4593
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.705 0.704)

	Surface
	{
		SurfStyle       0.231595
		OceanStyle      0.938742
		Randomize      (0.617, 0.186, -0.025)
		colorDistMagn   0.762665
		colorDistFreq   0.154179
		detailScale     626.823
		colorConversion true
		snowLevel       2
		tropicLatitude  0.357301
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589027
		terraceProb     0.163973
		erosion         0
		montesMagn      0.49746
		montesFreq      3.31928
		montesSpiky     0.899329
		montesFraction  0.585843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3425
		hillsFraction   0.499981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230791
		craterFreq      0.204723
		craterDensity   0.947812
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473358
		volcanoTemp     1684.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.282, 0.000)
		colorShelf     (0.301, 0.300, 0.299, 0.000)
		colorBeach     (0.318, 0.317, 0.317, 0.000)
		colorDesert    (0.336, 0.335, 0.335, 0.000)
		colorLowland   (0.354, 0.353, 0.352, 0.000)
		colorUpland    (0.371, 0.370, 0.370, 0.000)
		colorRock      (0.389, 0.388, 0.387, 0.000)
		colorSnow      (0.407, 0.405, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0272303
		Period          0.211528
		Eccentricity    0.080236
		Inclination     11.5379
		AscendingNode   -49.4593
		ArgOfPericenter 115.887
		MeanAnomaly     96.6672
	}
}

DwarfMoon	"Jakku System 2.D30"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            5.61994e-009
	Radius          24.5464
	InertiaMoment   0.399611

	RotationPeriod  5749.57
	Obliquity       -57.3038
	EqAscendNode    -86.5717

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.511 0.508)

	Surface
	{
		SurfStyle       0.0763126
		OceanStyle      0.388967
		Randomize      (0.081, -0.610, -0.730)
		colorDistMagn   0.768781
		colorDistFreq   0.337136
		detailScale     670.281
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478804
		terraceProb     0.39933
		erosion         0
		montesMagn      0.512393
		montesFreq      2.48303
		montesSpiky     0.906377
		montesFraction  0.145933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14682
		hillsFraction   0.770739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236868
		craterFreq      0.251021
		craterDensity   0.807918
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45687
		volcanoTemp     1508.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.203, 0.000)
		colorShelf     (0.219, 0.217, 0.216, 0.000)
		colorBeach     (0.232, 0.230, 0.229, 0.000)
		colorDesert    (0.244, 0.243, 0.242, 0.000)
		colorLowland   (0.257, 0.255, 0.254, 0.000)
		colorUpland    (0.270, 0.268, 0.267, 0.000)
		colorRock      (0.283, 0.281, 0.280, 0.000)
		colorSnow      (0.296, 0.294, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0278369
		Period          0.218636
		Eccentricity    0.419931
		Inclination     -57.3038
		AscendingNode   -86.5717
		ArgOfPericenter 65.1693
		MeanAnomaly     97.138
	}
}

DwarfMoon	"Jakku System 2.D31"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            7.71447e-009
	Radius          25.941
	InertiaMoment   0.397412

	RotationPeriod  11642.1
	Obliquity       46.9382
	EqAscendNode    -159.001

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.733 0.732)

	Surface
	{
		SurfStyle       0.447558
		OceanStyle      0.289184
		Randomize      (-0.302, 0.983, -0.963)
		colorDistMagn   0.538035
		colorDistFreq   0.109637
		detailScale     708.363
		colorConversion true
		snowLevel       2
		tropicLatitude  0.263903
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358622
		terraceProb     0.493801
		erosion         0
		montesMagn      0.578102
		montesFreq      2.96058
		montesSpiky     0.997054
		montesFraction  0.573155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32374
		hillsFraction   0.457667
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270187
		craterFreq      0.142076
		craterDensity   1.06834
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512407
		volcanoTemp     1255.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.293, 0.000)
		colorShelf     (0.312, 0.312, 0.311, 0.000)
		colorBeach     (0.331, 0.330, 0.329, 0.000)
		colorDesert    (0.349, 0.348, 0.348, 0.000)
		colorLowland   (0.368, 0.367, 0.366, 0.000)
		colorUpland    (0.386, 0.385, 0.384, 0.000)
		colorRock      (0.404, 0.403, 0.403, 0.000)
		colorSnow      (0.423, 0.422, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0280672
		Period          0.221354
		Eccentricity    0.486591
		Inclination     46.9382
		AscendingNode   -159.001
		ArgOfPericenter -95.5365
		MeanAnomaly     168.037
	}
}

DwarfMoon	"Jakku System 2.D32"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.0545e-008
	Radius          33.6508
	InertiaMoment   0.398791

	Obliquity       -87.4925
	EqAscendNode    135.352
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.694 0.692)

	Surface
	{
		SurfStyle       0.224764
		OceanStyle      0.377249
		Randomize      (-0.155, -0.209, -0.547)
		colorDistMagn   0.863679
		colorDistFreq   0.658767
		detailScale     918.891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.702184
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725226
		terraceProb     0.32567
		erosion         0
		montesMagn      0.424316
		montesFreq      2.55125
		montesSpiky     0.986838
		montesFraction  0.495079
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.76595
		hillsFraction   0.382346
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234063
		craterFreq      0.179507
		craterDensity   1.02278
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563647
		volcanoTemp     1352.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.278, 0.277, 0.000)
		colorShelf     (0.296, 0.295, 0.294, 0.000)
		colorBeach     (0.314, 0.312, 0.311, 0.000)
		colorDesert    (0.331, 0.330, 0.329, 0.000)
		colorLowland   (0.349, 0.347, 0.346, 0.000)
		colorUpland    (0.366, 0.365, 0.363, 0.000)
		colorRock      (0.384, 0.382, 0.381, 0.000)
		colorSnow      (0.401, 0.399, 0.398, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.028714
		Period          0.22905
		Eccentricity    0.439955
		Inclination     -87.4925
		AscendingNode   135.352
		ArgOfPericenter 79.9388
		MeanAnomaly     -58.1775
	}
}

DwarfMoon	"Jakku System 2.D33"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.4368e-008
	Radius          35.1626
	InertiaMoment   0.399737

	Obliquity       5.9672
	EqAscendNode    -151.632
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.704 0.699)

	Surface
	{
		SurfStyle       0.660254
		OceanStyle      0.19559
		Randomize      (-0.778, 0.650, -0.628)
		colorDistMagn   0.93558
		colorDistFreq   0.554054
		detailScale     960.174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0509311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58413
		terraceProb     0.248171
		erosion         0
		montesMagn      0.62103
		montesFreq      3.73402
		montesSpiky     0.979899
		montesFraction  0.755801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.17407
		hillsFraction   0.795844
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201803
		craterFreq      0.154169
		craterDensity   0.844365
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468321
		volcanoTemp     1569.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.239, 0.196, 0.000)
		colorShelf     (0.283, 0.246, 0.224, 0.000)
		colorBeach     (0.332, 0.289, 0.265, 0.000)
		colorDesert    (0.361, 0.310, 0.258, 0.000)
		colorLowland   (0.396, 0.331, 0.293, 0.000)
		colorUpland    (0.439, 0.401, 0.356, 0.000)
		colorRock      (0.474, 0.437, 0.384, 0.000)
		colorSnow      (0.516, 0.465, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0293741
		Period          0.236994
		Eccentricity    0.297542
		Inclination     5.9672
		AscendingNode   -151.632
		ArgOfPericenter 86.3673
		MeanAnomaly     55.9634
	}
}

DwarfMoon	"Jakku System 2.D34"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.95328e-008
	Radius          37.3947
	InertiaMoment   0.397677

	Obliquity       82.7976
	EqAscendNode    -102.89
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.598 0.550)

	Surface
	{
		SurfStyle       0.198838
		OceanStyle      0.157928
		Randomize      (-0.710, 0.555, -0.949)
		colorDistMagn   0.169381
		colorDistFreq   0.877516
		detailScale     1021.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971927
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326615
		terraceProb     0.247925
		erosion         0
		montesMagn      0.641896
		montesFreq      2.98161
		montesSpiky     0.854054
		montesFraction  0.493953
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.52154
		hillsFraction   0.556497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259656
		craterFreq      0.194979
		craterDensity   0.97107
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489732
		volcanoTemp     1564.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.239, 0.220, 0.000)
		colorShelf     (0.304, 0.254, 0.234, 0.000)
		colorBeach     (0.322, 0.269, 0.248, 0.000)
		colorDesert    (0.340, 0.284, 0.261, 0.000)
		colorLowland   (0.358, 0.299, 0.275, 0.000)
		colorUpland    (0.375, 0.314, 0.289, 0.000)
		colorRock      (0.393, 0.329, 0.303, 0.000)
		colorSnow      (0.411, 0.344, 0.316, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0299072
		Period          0.243475
		Eccentricity    0.108801
		Inclination     82.7976
		AscendingNode   -102.89
		ArgOfPericenter -27.5494
		MeanAnomaly     -45.3127
	}
}

DwarfMoon	"Jakku System 2.D35"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.65178e-008
	Radius          39.5276
	InertiaMoment   0.398938

	Obliquity       -62.0629
	EqAscendNode    104.178
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.766 0.764 0.761)

	Surface
	{
		SurfStyle       0.785016
		OceanStyle      0.40794
		Randomize      (-0.847, 0.868, -0.204)
		colorDistMagn   0.851709
		colorDistFreq   1.10261
		detailScale     1079.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911785
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533067
		terraceProb     0.368888
		erosion         0
		montesMagn      0.50517
		montesFreq      2.80561
		montesSpiky     0.957962
		montesFraction  0.852151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47419
		hillsFraction   0.443563
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246972
		craterFreq      0.270683
		craterDensity   0.957456
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52996
		volcanoTemp     1741.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.260, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.360, 0.313, 0.289, 0.000)
		colorDesert    (0.391, 0.336, 0.282, 0.000)
		colorLowland   (0.429, 0.359, 0.320, 0.000)
		colorUpland    (0.475, 0.435, 0.388, 0.000)
		colorRock      (0.513, 0.473, 0.418, 0.000)
		colorSnow      (0.559, 0.504, 0.441, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0304916
		Period          0.250646
		Eccentricity    0.326947
		Inclination     -62.0629
		AscendingNode   104.178
		ArgOfPericenter 81.5085
		MeanAnomaly     -70.8596
	}
}

DwarfMoon	"Jakku System 2.D36"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            3.59829e-008
	Radius          51.3796
	InertiaMoment   0.399863

	Obliquity       79.6535
	EqAscendNode    170.248
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.432 0.429 0.426)

	Surface
	{
		SurfStyle       0.445042
		OceanStyle      0.401919
		Randomize      (-0.525, -0.997, -0.801)
		colorDistMagn   0.173736
		colorDistFreq   1.63196
		detailScale     1403.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.166656
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412178
		terraceProb     0.133105
		erosion         0
		montesMagn      0.581273
		montesFreq      3.133
		montesSpiky     0.957568
		montesFraction  0.829739
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.37582
		hillsFraction   0.550317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.29113
		craterFreq      0.270401
		craterDensity   0.955323
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493221
		volcanoTemp     1447.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.172, 0.170, 0.000)
		colorShelf     (0.184, 0.183, 0.181, 0.000)
		colorBeach     (0.194, 0.193, 0.192, 0.000)
		colorDesert    (0.205, 0.204, 0.202, 0.000)
		colorLowland   (0.216, 0.215, 0.213, 0.000)
		colorUpland    (0.227, 0.225, 0.224, 0.000)
		colorRock      (0.238, 0.236, 0.234, 0.000)
		colorSnow      (0.248, 0.247, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0311203
		Period          0.258438
		Eccentricity    0.0591726
		Inclination     79.6535
		AscendingNode   170.248
		ArgOfPericenter -93.7786
		MeanAnomaly     -145.124
	}
}

DwarfMoon	"Jakku System 2.D37"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.8844e-008
	Radius          53.2145
	InertiaMoment   0.397907

	RotationPeriod  4670.8
	Obliquity       -78.0093
	EqAscendNode    150.625

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.518 0.514)

	Surface
	{
		SurfStyle       0.0889421
		OceanStyle      0.587885
		Randomize      (-0.965, 0.932, -0.202)
		colorDistMagn   0.244321
		colorDistFreq   1.22712
		detailScale     1453.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.480531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266953
		terraceProb     0.274982
		erosion         0
		montesMagn      0.576173
		montesFreq      3.23935
		montesSpiky     0.95567
		montesFraction  0.231092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.67719
		hillsFraction   0.83348
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222415
		craterFreq      0.207536
		craterDensity   0.857239
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504908
		volcanoTemp     1578.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.207, 0.205, 0.000)
		colorShelf     (0.222, 0.220, 0.218, 0.000)
		colorBeach     (0.235, 0.233, 0.231, 0.000)
		colorDesert    (0.248, 0.246, 0.244, 0.000)
		colorLowland   (0.261, 0.259, 0.257, 0.000)
		colorUpland    (0.274, 0.272, 0.270, 0.000)
		colorRock      (0.287, 0.285, 0.282, 0.000)
		colorSnow      (0.300, 0.298, 0.295, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.031758
		Period          0.266421
		Eccentricity    0.429782
		Inclination     -78.0093
		AscendingNode   150.625
		ArgOfPericenter 28.4462
		MeanAnomaly     160.15
	}
}

DwarfMoon	"Jakku System 2.D38"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            6.63838e-008
	Radius          56.5401
	InertiaMoment   0.399079

	RotationPeriod  4732.6
	Obliquity       20.3839
	EqAscendNode    175.092

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.788 0.787 0.786)

	Surface
	{
		SurfStyle       0.260839
		OceanStyle      0.476696
		Randomize      (0.049, 0.917, -0.095)
		colorDistMagn   0.501929
		colorDistFreq   0.484286
		detailScale     1543.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0298238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528351
		terraceProb     0.525876
		erosion         0
		montesMagn      0.291553
		montesFreq      3.94803
		montesSpiky     0.870417
		montesFraction  0.643489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.71386
		hillsFraction   0.645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277662
		craterFreq      0.227162
		craterDensity   0.913069
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462353
		volcanoTemp     1633.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.315, 0.314, 0.000)
		colorShelf     (0.335, 0.334, 0.334, 0.000)
		colorBeach     (0.355, 0.354, 0.353, 0.000)
		colorDesert    (0.375, 0.374, 0.373, 0.000)
		colorLowland   (0.394, 0.393, 0.393, 0.000)
		colorUpland    (0.414, 0.413, 0.412, 0.000)
		colorRock      (0.434, 0.433, 0.432, 0.000)
		colorSnow      (0.453, 0.453, 0.452, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0320375
		Period          0.269947
		Eccentricity    0.406799
		Inclination     20.3839
		AscendingNode   175.092
		ArgOfPericenter 61.1972
		MeanAnomaly     -140.576
	}
}

DwarfMoon	"Jakku System 2.D39"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            9.04137e-008
	Radius          59.9826
	InertiaMoment   0.399988

	RotationPeriod  7171.95
	Obliquity       36.902
	EqAscendNode    -85.0522

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.525 0.473)

	Surface
	{
		SurfStyle       0.278773
		OceanStyle      0.227529
		Randomize      (0.947, -0.412, -0.438)
		colorDistMagn   0.626857
		colorDistFreq   1.48184
		detailScale     1637.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.793656
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646447
		terraceProb     0.130069
		erosion         0
		montesMagn      0.577275
		montesFreq      3.11506
		montesSpiky     0.894409
		montesFraction  0.280141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.63892
		hillsFraction   0.44095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253065
		craterFreq      0.254338
		craterDensity   0.860656
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508371
		volcanoTemp     1344.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.210, 0.189, 0.000)
		colorShelf     (0.261, 0.223, 0.201, 0.000)
		colorBeach     (0.276, 0.236, 0.213, 0.000)
		colorDesert    (0.292, 0.250, 0.225, 0.000)
		colorLowland   (0.307, 0.263, 0.236, 0.000)
		colorUpland    (0.322, 0.276, 0.248, 0.000)
		colorRock      (0.338, 0.289, 0.260, 0.000)
		colorSnow      (0.353, 0.302, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0322569
		Period          0.272724
		Eccentricity    0.250679
		Inclination     36.902
		AscendingNode   -85.0522
		ArgOfPericenter -4.14939
		MeanAnomaly     -32.4895
	}
}

DwarfMoon	"Jakku System 2.D40"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.23519e-007
	Radius          78.9536
	InertiaMoment   0.398112

	Obliquity       -38.9988
	EqAscendNode    -28.0222
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.445 0.440 0.434)

	Surface
	{
		SurfStyle       0.73911
		OceanStyle      0.285896
		Randomize      (0.318, 0.521, 0.099)
		colorDistMagn   0.420649
		colorDistFreq   4.9574
		detailScale     2155.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466488
		terraceProb     0.104888
		erosion         0
		montesMagn      0.416328
		montesFreq      2.01725
		montesSpiky     0.916767
		montesFraction  0.562446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.9782
		hillsFraction   0.884763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214244
		craterFreq      0.19758
		craterDensity   0.915459
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.612181
		volcanoTemp     1483.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.150, 0.122, 0.000)
		colorShelf     (0.178, 0.154, 0.139, 0.000)
		colorBeach     (0.209, 0.180, 0.165, 0.000)
		colorDesert    (0.227, 0.194, 0.161, 0.000)
		colorLowland   (0.249, 0.207, 0.182, 0.000)
		colorUpland    (0.276, 0.251, 0.222, 0.000)
		colorRock      (0.298, 0.273, 0.239, 0.000)
		colorSnow      (0.325, 0.291, 0.252, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0328803
		Period          0.280669
		Eccentricity    0.212468
		Inclination     -38.9988
		AscendingNode   -28.0222
		ArgOfPericenter -33.0973
		MeanAnomaly     -118.189
	}
}

DwarfMoon	"Jakku System 2.D41"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.69433e-007
	Radius          81.1076
	InertiaMoment   0.399216

	Obliquity       17.3148
	EqAscendNode    -161.957
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.636 0.635 0.633)

	Surface
	{
		SurfStyle       0.332738
		OceanStyle      0.857027
		Randomize      (0.051, 0.935, -0.451)
		colorDistMagn   0.845908
		colorDistFreq   4.52814
		detailScale     2214.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0932341
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486452
		terraceProb     0.168796
		erosion         0
		montesMagn      0.550667
		montesFreq      3.29679
		montesSpiky     0.900943
		montesFraction  0.258971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.682
		hillsFraction   0.771686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2986
		craterFreq      0.213345
		craterDensity   0.924215
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426508
		volcanoTemp     1465.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.254, 0.253, 0.000)
		colorShelf     (0.271, 0.270, 0.269, 0.000)
		colorBeach     (0.286, 0.286, 0.285, 0.000)
		colorDesert    (0.302, 0.301, 0.301, 0.000)
		colorLowland   (0.318, 0.317, 0.316, 0.000)
		colorUpland    (0.334, 0.333, 0.332, 0.000)
		colorRock      (0.350, 0.349, 0.348, 0.000)
		colorSnow      (0.366, 0.365, 0.364, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.033322
		Period          0.286343
		Eccentricity    0.380701
		Inclination     17.3148
		AscendingNode   -161.957
		ArgOfPericenter 35.6472
		MeanAnomaly     -34.7916
	}
}

DwarfMoon	"Jakku System 2.D42"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.33612e-007
	Radius          86.4843
	InertiaMoment   0.395991

	Obliquity       -8.19138
	EqAscendNode    125.075
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.562 0.558)

	Surface
	{
		SurfStyle       0.244139
		OceanStyle      0.791979
		Randomize      (0.079, 0.028, 0.786)
		colorDistMagn   0.28271
		colorDistFreq   4.21516
		detailScale     2361.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.131131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266688
		terraceProb     0.28969
		erosion         0
		montesMagn      0.47122
		montesFreq      3.84321
		montesSpiky     0.896884
		montesFraction  0.327505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.0286
		hillsFraction   0.573991
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238635
		craterFreq      0.278372
		craterDensity   0.837968
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472212
		volcanoTemp     1226.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.225, 0.223, 0.000)
		colorShelf     (0.240, 0.239, 0.237, 0.000)
		colorBeach     (0.255, 0.253, 0.251, 0.000)
		colorDesert    (0.269, 0.267, 0.265, 0.000)
		colorLowland   (0.283, 0.281, 0.279, 0.000)
		colorUpland    (0.297, 0.295, 0.293, 0.000)
		colorRock      (0.311, 0.309, 0.307, 0.000)
		colorSnow      (0.325, 0.323, 0.321, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0337461
		Period          0.291827
		Eccentricity    0.213381
		Inclination     -8.19138
		AscendingNode   125.075
		ArgOfPericenter 115.271
		MeanAnomaly     81.7976
	}
}

DwarfMoon	"Jakku System 2.D43"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            3.24155e-007
	Radius          92.4793
	InertiaMoment   0.398299

	RotationPeriod  5252.71
	Obliquity       80.5074
	EqAscendNode    67.7001

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.632 0.492)

	Surface
	{
		SurfStyle       0.87338
		OceanStyle      0.0894892
		Randomize      (-0.998, 0.694, -0.833)
		colorDistMagn   0.772618
		colorDistFreq   3.29006
		detailScale     2525.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939723
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.273075
		terraceProb     0.341009
		erosion         0
		montesMagn      0.686409
		montesFreq      4.02578
		montesSpiky     0.862381
		montesFraction  0.312548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.3846
		hillsFraction   0.591296
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21167
		craterFreq      0.25105
		craterDensity   0.754701
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497112
		volcanoTemp     1470.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.221, 0.197, 0.050)
		colorShelf     (0.290, 0.259, 0.227, 0.040)
		colorBeach     (0.334, 0.297, 0.256, 0.030)
		colorDesert    (0.377, 0.335, 0.291, 0.020)
		colorLowland   (0.421, 0.373, 0.320, 0.030)
		colorUpland    (0.464, 0.411, 0.350, 0.050)
		colorRock      (0.508, 0.449, 0.389, 0.020)
		colorSnow      (0.508, 0.449, 0.389, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0343437
		Period          0.299613
		Eccentricity    0.46791
		Inclination     80.5074
		AscendingNode   67.7001
		ArgOfPericenter -54.3621
		MeanAnomaly     -82.8944
	}
}

DwarfMoon	"Jakku System 2.D44"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.53277e-007
	Radius          125.27
	InertiaMoment   0.399349

	Obliquity       18.4827
	EqAscendNode    -58.0355
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.478 0.472 0.469)

	Surface
	{
		SurfStyle       0.518336
		OceanStyle      0.949614
		Randomize      (0.761, 0.821, -0.100)
		colorDistMagn   0.925577
		colorDistFreq   9.47089
		detailScale     3420.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.532714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.728927
		terraceProb     0.244038
		erosion         0
		montesMagn      0.611406
		montesFreq      3.15371
		montesSpiky     0.956765
		montesFraction  0.620221
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.0857
		hillsFraction   0.473591
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255204
		craterFreq      0.570871
		craterDensity   0.918708
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521578
		volcanoTemp     1506.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.161, 0.131, 0.000)
		colorShelf     (0.191, 0.165, 0.150, 0.000)
		colorBeach     (0.225, 0.194, 0.178, 0.000)
		colorDesert    (0.244, 0.208, 0.173, 0.000)
		colorLowland   (0.268, 0.222, 0.197, 0.000)
		colorUpland    (0.297, 0.269, 0.239, 0.000)
		colorRock      (0.321, 0.293, 0.258, 0.000)
		colorSnow      (0.349, 0.312, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0347185
		Period          0.304531
		Eccentricity    0.330237
		Inclination     18.4827
		AscendingNode   -58.0355
		ArgOfPericenter 114.07
		MeanAnomaly     -129.55
	}
}

DwarfMoon	"Jakku System 2.D45"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            6.3975e-007
	Radius          127.225
	InertiaMoment   0.396659

	RotationPeriod  5448.95
	Obliquity       -73.1307
	EqAscendNode    16.4971

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.584 0.521)

	Surface
	{
		SurfStyle       0.0941591
		OceanStyle      0.357304
		Randomize      (0.063, 0.704, -0.942)
		colorDistMagn   0.143971
		colorDistFreq   1.89069
		detailScale     3474.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.608074
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35766
		terraceProb     0.278336
		erosion         0
		montesMagn      0.608229
		montesFreq      3.47923
		montesSpiky     0.953928
		montesFraction  0.491882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.4784
		hillsFraction   0.722777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202491
		craterFreq      0.59748
		craterDensity   0.791738
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520634
		volcanoTemp     1171.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.234, 0.208, 0.000)
		colorShelf     (0.263, 0.248, 0.221, 0.000)
		colorBeach     (0.278, 0.263, 0.235, 0.000)
		colorDesert    (0.294, 0.278, 0.248, 0.000)
		colorLowland   (0.309, 0.292, 0.261, 0.000)
		colorUpland    (0.324, 0.307, 0.274, 0.000)
		colorRock      (0.340, 0.321, 0.287, 0.000)
		colorSnow      (0.355, 0.336, 0.300, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0351939
		Period          0.310807
		Eccentricity    0.219411
		Inclination     -73.1307
		AscendingNode   16.4971
		ArgOfPericenter 140.671
		MeanAnomaly     -173.225
	}
}

DwarfMoon	"Jakku System 2.D46"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            9.13044e-007
	Radius          136.998
	InertiaMoment   0.398472

	RotationPeriod  8292.17
	Obliquity       -68.3374
	EqAscendNode    -90.5554

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.569 0.567)

	Surface
	{
		SurfStyle       0.60588
		OceanStyle      0.40732
		Randomize      (0.239, 0.411, -0.286)
		colorDistMagn   0.188552
		colorDistFreq   11.0901
		detailScale     3740.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989485
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405098
		terraceProb     0.106813
		erosion         0
		montesMagn      0.326018
		montesFreq      3.49835
		montesSpiky     0.975519
		montesFraction  0.575465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       37.208
		hillsFraction   0.473155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243806
		craterFreq      0.711291
		craterDensity   0.945653
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509746
		volcanoTemp     1421.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.159, 0.000)
		colorShelf     (0.229, 0.199, 0.181, 0.000)
		colorBeach     (0.270, 0.233, 0.215, 0.000)
		colorDesert    (0.293, 0.250, 0.210, 0.000)
		colorLowland   (0.321, 0.268, 0.238, 0.000)
		colorUpland    (0.356, 0.324, 0.289, 0.000)
		colorRock      (0.384, 0.353, 0.312, 0.000)
		colorSnow      (0.419, 0.376, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0355339
		Period          0.315322
		Eccentricity    0.446167
		Inclination     -68.3374
		AscendingNode   -90.5554
		ArgOfPericenter 129.355
		MeanAnomaly     68.2705
	}
}

DwarfMoon	"Jakku System 2.D47"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.32058e-006
	Radius          148.698
	InertiaMoment   0.39948

	RotationPeriod  13958.4
	Obliquity       -69.307
	EqAscendNode    -49.8152

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.484 0.378)

	Surface
	{
		SurfStyle       0.0387983
		OceanStyle      0.913731
		Randomize      (-0.063, -0.418, -0.687)
		colorDistMagn   0.307175
		colorDistFreq   12.3227
		detailScale     4060.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898085
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.706026
		terraceProb     0.234665
		erosion         0
		montesMagn      0.462236
		montesFreq      2.58522
		montesSpiky     0.912657
		montesFraction  0.378855
		dunesFraction   0
		hillsMagn       0
		hillsFreq       56.0701
		hillsFraction   0.603615
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251173
		craterFreq      0.742017
		craterDensity   0.937138
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478128
		volcanoTemp     1492.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.193, 0.151, 0.000)
		colorShelf     (0.229, 0.206, 0.161, 0.000)
		colorBeach     (0.243, 0.218, 0.170, 0.000)
		colorDesert    (0.256, 0.230, 0.180, 0.000)
		colorLowland   (0.270, 0.242, 0.189, 0.000)
		colorUpland    (0.283, 0.254, 0.199, 0.000)
		colorRock      (0.297, 0.266, 0.208, 0.000)
		colorSnow      (0.310, 0.278, 0.218, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0357704
		Period          0.318475
		Eccentricity    0.308093
		Inclination     -69.307
		AscendingNode   -49.8152
		ArgOfPericenter 101.59
		MeanAnomaly     -138.699
	}
}

DwarfMoon	"Jakku System 2.D48"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.94088e-006
	Radius          218.703
	InertiaMoment   0.397083

	RotationPeriod  1905.59
	Obliquity       32.3991
	EqAscendNode    120.895

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.703 0.698)

	Surface
	{
		SurfStyle       0.530398
		OceanStyle      0.597619
		Randomize      (0.534, 0.619, -0.476)
		colorDistMagn   0.0296596
		colorDistFreq   29.1971
		detailScale     5972.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.509754
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.7312
		terraceProb     0.450794
		erosion         0
		montesMagn      0.639014
		montesFreq      3.08242
		montesSpiky     0.899787
		montesFraction  0.780588
		dunesFraction   0
		hillsMagn       0
		hillsFreq       141.387
		hillsFraction   0.388971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224621
		craterFreq      1.96984
		craterDensity   0.917956
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487542
		volcanoTemp     1805.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.239, 0.195, 0.000)
		colorShelf     (0.282, 0.246, 0.223, 0.000)
		colorBeach     (0.332, 0.288, 0.265, 0.000)
		colorDesert    (0.360, 0.309, 0.258, 0.000)
		colorLowland   (0.395, 0.330, 0.293, 0.000)
		colorUpland    (0.437, 0.401, 0.356, 0.000)
		colorRock      (0.473, 0.436, 0.384, 0.000)
		colorSnow      (0.515, 0.464, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0363379
		Period          0.326084
		Eccentricity    0.497716
		Inclination     32.3991
		AscendingNode   120.895
		ArgOfPericenter -106.046
		MeanAnomaly     57.065
	}
}

DwarfMoon	"Jakku System 2.D49"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.90835e-006
	Radius          212.434
	InertiaMoment   0.398634

	Obliquity       -21.3801
	EqAscendNode    36.1789
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.567 0.492)

	Surface
	{
		SurfStyle       0.701261
		OceanStyle      0.869919
		Randomize      (-0.840, -0.375, -0.549)
		colorDistMagn   0.229698
		colorDistFreq   26.8641
		detailScale     5800.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.650125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439179
		terraceProb     0.160954
		erosion         0
		montesMagn      0.432323
		montesFreq      3.57443
		montesSpiky     0.794859
		montesFraction  0.394183
		dunesFraction   0
		hillsMagn       0
		hillsFreq       126.478
		hillsFraction   0.510362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222793
		craterFreq      1.39176
		craterDensity   0.68225
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497559
		volcanoTemp     1825.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.193, 0.138, 0.000)
		colorShelf     (0.281, 0.199, 0.158, 0.000)
		colorBeach     (0.330, 0.233, 0.187, 0.000)
		colorDesert    (0.358, 0.250, 0.182, 0.000)
		colorLowland   (0.393, 0.267, 0.207, 0.000)
		colorUpland    (0.435, 0.323, 0.251, 0.000)
		colorRock      (0.470, 0.352, 0.271, 0.000)
		colorSnow      (0.512, 0.374, 0.286, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0365473
		Period          0.328907
		Eccentricity    0.0123263
		Inclination     -21.3801
		AscendingNode   36.1789
		ArgOfPericenter -35.4633
		MeanAnomaly     -67.4522
	}
}

DwarfMoon	"Jakku System 2.D50"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.46241e-006
	Radius          233.82
	InertiaMoment   0.399608

	Obliquity       49.6263
	EqAscendNode    -81.1627
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.517 0.429)

	Surface
	{
		SurfStyle       0.14137
		OceanStyle      0.543939
		Randomize      (0.185, 0.071, 0.498)
		colorDistMagn   0.792596
		colorDistFreq   3.34805
		detailScale     6384.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.943826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668532
		terraceProb     0.273464
		erosion         0
		montesMagn      0.459807
		montesFreq      2.65894
		montesSpiky     0.831842
		montesFraction  0.53868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       168.182
		hillsFraction   0.528158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246223
		craterFreq      2.00636
		craterDensity   0.785548
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513794
		volcanoTemp     2028.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.207, 0.172, 0.000)
		colorShelf     (0.268, 0.220, 0.182, 0.000)
		colorBeach     (0.283, 0.233, 0.193, 0.000)
		colorDesert    (0.299, 0.246, 0.204, 0.000)
		colorLowland   (0.315, 0.259, 0.214, 0.000)
		colorUpland    (0.331, 0.272, 0.225, 0.000)
		colorRock      (0.346, 0.285, 0.236, 0.000)
		colorSnow      (0.362, 0.297, 0.247, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0368694
		Period          0.333265
		Eccentricity    0.388881
		Inclination     49.6263
		AscendingNode   -81.1627
		ArgOfPericenter -126.087
		MeanAnomaly     -73.8301
	}
}

DwarfMoon	"Jakku System 2.D51"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.2065e-011
	Radius          3.12829
	InertiaMoment   0.397405

	RotationPeriod  5969.63
	Obliquity       -8.7366
	EqAscendNode    -155.117

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.496 0.489 0.486)

	Surface
	{
		SurfStyle       0.778515
		OceanStyle      0.272819
		Randomize      (-0.361, -0.930, -0.477)
		colorDistMagn   0.373911
		colorDistFreq   0.00134961
		detailScale     85.4233
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0654119
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739184
		terraceProb     0.120168
		erosion         0
		montesMagn      0.562558
		montesFreq      3.41659
		montesSpiky     0.927357
		montesFraction  0.493249
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0270122
		hillsFraction   0.563437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250983
		craterFreq      0.220597
		craterDensity   1.00712
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497475
		volcanoTemp     1304.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.166, 0.136, 0.000)
		colorShelf     (0.198, 0.171, 0.156, 0.000)
		colorBeach     (0.233, 0.201, 0.185, 0.000)
		colorDesert    (0.253, 0.215, 0.180, 0.000)
		colorLowland   (0.278, 0.230, 0.204, 0.000)
		colorUpland    (0.307, 0.279, 0.248, 0.000)
		colorRock      (0.332, 0.303, 0.268, 0.000)
		colorSnow      (0.362, 0.323, 0.282, 1.000)
		BumpHeight      2.81546
		BumpOffset      0.563093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0374016
		Period          0.340507
		Eccentricity    0.139868
		Inclination     -8.7366
		AscendingNode   -155.117
		ArgOfPericenter -137.871
		MeanAnomaly     8.76128
	}
}

DwarfMoon	"Jakku System 2.D52"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.46643e-011
	Radius          3.70108
	InertiaMoment   0.398788

	Obliquity       -60.6778
	EqAscendNode    28.2484
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.608 0.506)

	Surface
	{
		SurfStyle       0.310514
		OceanStyle      0.178337
		Randomize      (0.774, 0.159, -0.391)
		colorDistMagn   0.167542
		colorDistFreq   0.00525104
		detailScale     101.064
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435105
		terraceProb     0.311262
		erosion         0
		montesMagn      0.479421
		montesFreq      3.5084
		montesSpiky     0.860688
		montesFraction  0.515225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0261402
		hillsFraction   0.74514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224861
		craterFreq      0.218055
		craterDensity   0.922059
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545443
		volcanoTemp     1554.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.243, 0.202, 0.000)
		colorShelf     (0.304, 0.258, 0.215, 0.000)
		colorBeach     (0.322, 0.274, 0.228, 0.000)
		colorDesert    (0.340, 0.289, 0.240, 0.000)
		colorLowland   (0.358, 0.304, 0.253, 0.000)
		colorUpland    (0.376, 0.319, 0.265, 0.000)
		colorRock      (0.393, 0.334, 0.278, 0.000)
		colorSnow      (0.411, 0.350, 0.291, 1.000)
		BumpHeight      3.33097
		BumpOffset      0.666194
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0380387
		Period          0.349244
		Eccentricity    0.0947761
		Inclination     -60.6778
		AscendingNode   28.2484
		ArgOfPericenter -66.0423
		MeanAnomaly     -55.4736
	}
}

DwarfMoon	"Jakku System 2.D53"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.58024e-011
	Radius          5.37154
	InertiaMoment   0.399735

	RotationPeriod  15641.5
	Obliquity       50.3938
	EqAscendNode    119.434

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.765 0.764)

	Surface
	{
		SurfStyle       0.280306
		OceanStyle      0.566428
		Randomize      (0.497, 0.107, 0.334)
		colorDistMagn   0.827995
		colorDistFreq   0.00937521
		detailScale     146.679
		colorConversion true
		snowLevel       2
		tropicLatitude  0.715986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518126
		terraceProb     0.619118
		erosion         0
		montesMagn      0.427502
		montesFreq      2.97955
		montesSpiky     0.892473
		montesFraction  0.632241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.060264
		hillsFraction   0.609122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238133
		craterFreq      0.233667
		craterDensity   0.994038
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48309
		volcanoTemp     1840.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.305, 0.000)
		colorShelf     (0.326, 0.325, 0.325, 0.000)
		colorBeach     (0.345, 0.344, 0.344, 0.000)
		colorDesert    (0.364, 0.363, 0.363, 0.000)
		colorLowland   (0.384, 0.382, 0.382, 0.000)
		colorUpland    (0.403, 0.402, 0.401, 0.000)
		colorRock      (0.422, 0.421, 0.420, 0.000)
		colorSnow      (0.441, 0.440, 0.439, 1.000)
		BumpHeight      4.83439
		BumpOffset      0.966877
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0385908
		Period          0.356875
		Eccentricity    0.209524
		Inclination     50.3938
		AscendingNode   119.434
		ArgOfPericenter 42.0699
		MeanAnomaly     -65.9259
	}
}

DwarfMoon	"Jakku System 2.D54"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            7.94982e-011
	Radius          6.14231
	InertiaMoment   0.397672

	RotationPeriod  12738
	Obliquity       -4.24611
	EqAscendNode    4.33211

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.445 0.440)

	Surface
	{
		SurfStyle       0.777607
		OceanStyle      0.000229602
		Randomize      (-0.179, -0.726, 0.128)
		colorDistMagn   0.694714
		colorDistFreq   0.0172814
		detailScale     167.726
		colorConversion true
		snowLevel       2
		tropicLatitude  0.14757
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519756
		terraceProb     0.227912
		erosion         0
		montesMagn      0.376686
		montesFreq      2.34328
		montesSpiky     0.961568
		montesFraction  0.680521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106253
		hillsFraction   0.650611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261578
		craterFreq      0.268398
		craterDensity   0.99829
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544766
		volcanoTemp     1920.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.151, 0.123, 0.000)
		colorShelf     (0.180, 0.156, 0.141, 0.000)
		colorBeach     (0.211, 0.182, 0.167, 0.000)
		colorDesert    (0.229, 0.196, 0.163, 0.000)
		colorLowland   (0.252, 0.209, 0.185, 0.000)
		colorUpland    (0.279, 0.254, 0.224, 0.000)
		colorRock      (0.301, 0.276, 0.242, 0.000)
		colorSnow      (0.328, 0.294, 0.255, 1.000)
		BumpHeight      5.52808
		BumpOffset      1.10562
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0390516
		Period          0.363286
		Eccentricity    0.231949
		Inclination     -4.24611
		AscendingNode   4.33211
		ArgOfPericenter 6.29671
		MeanAnomaly     -165.639
	}
}

DwarfMoon	"Jakku System 2.D55"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.31244e-010
	Radius          6.97346
	InertiaMoment   0.398935

	RotationPeriod  2164.6
	Obliquity       43.4938
	EqAscendNode    -25.0076

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.623 0.621)

	Surface
	{
		SurfStyle       0.392547
		OceanStyle      0.779723
		Randomize      (-0.824, -0.531, 0.509)
		colorDistMagn   0.815834
		colorDistFreq   0.0232993
		detailScale     190.422
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637368
		terraceProb     0.431725
		erosion         0
		montesMagn      0.577364
		montesFreq      2.8651
		montesSpiky     0.854217
		montesFraction  0.232718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.121607
		hillsFraction   0.740931
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26815
		craterFreq      0.245796
		craterDensity   0.82759
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521563
		volcanoTemp     1367.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.248, 0.000)
		colorShelf     (0.266, 0.265, 0.264, 0.000)
		colorBeach     (0.281, 0.280, 0.279, 0.000)
		colorDesert    (0.297, 0.296, 0.295, 0.000)
		colorLowland   (0.313, 0.311, 0.310, 0.000)
		colorUpland    (0.328, 0.327, 0.326, 0.000)
		colorRock      (0.344, 0.342, 0.341, 0.000)
		colorSnow      (0.360, 0.358, 0.357, 1.000)
		BumpHeight      6.27611
		BumpOffset      1.25522
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0395602
		Period          0.370405
		Eccentricity    0.478376
		Inclination     43.4938
		AscendingNode   -25.0076
		ArgOfPericenter 68.2163
		MeanAnomaly     -4.40494
	}
}

DwarfMoon	"Jakku System 2.D56"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.08489e-010
	Radius          7.68532
	InertiaMoment   0.39986

	RotationPeriod  8261.71
	Obliquity       -22.3134
	EqAscendNode    117.288

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.773 0.771)

	Surface
	{
		SurfStyle       0.9774
		OceanStyle      0.825305
		Randomize      (0.402, -0.496, 0.861)
		colorDistMagn   0.992329
		colorDistFreq   0.0319775
		detailScale     209.861
		colorConversion true
		snowLevel       2
		tropicLatitude  0.38734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523265
		terraceProb     0.303773
		erosion         0
		montesMagn      0.497247
		montesFreq      3.60142
		montesSpiky     0.969264
		montesFraction  0.496006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.10824
		hillsFraction   0.690082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245728
		craterFreq      0.26349
		craterDensity   0.976917
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476484
		volcanoTemp     1393.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.270, 0.309, 0.050)
		colorShelf     (0.310, 0.317, 0.355, 0.040)
		colorBeach     (0.356, 0.363, 0.401, 0.030)
		colorDesert    (0.403, 0.409, 0.455, 0.020)
		colorLowland   (0.449, 0.456, 0.501, 0.030)
		colorUpland    (0.496, 0.502, 0.548, 0.050)
		colorRock      (0.542, 0.549, 0.609, 0.020)
		colorSnow      (0.542, 0.549, 0.609, 1.000)
		BumpHeight      6.91679
		BumpOffset      1.38336
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0400281
		Period          0.376997
		Eccentricity    0.18891
		Inclination     -22.3134
		AscendingNode   117.288
		ArgOfPericenter -24.3663
		MeanAnomaly     94.3099
	}
}

DwarfMoon	"Jakku System 2.D57"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            3.21285e-010
	Radius          10.3843
	InertiaMoment   0.397902

	Obliquity       33.6131
	EqAscendNode    114.844
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.685 0.621 0.527)

	Surface
	{
		SurfStyle       0.316126
		OceanStyle      0.512222
		Randomize      (-0.389, -0.604, 0.324)
		colorDistMagn   0.421786
		colorDistFreq   0.0622307
		detailScale     283.561
		colorConversion true
		snowLevel       2
		tropicLatitude  0.569053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578941
		terraceProb     0.265521
		erosion         0
		montesMagn      0.546794
		montesFreq      2.9833
		montesSpiky     0.860095
		montesFraction  0.498874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.287136
		hillsFraction   0.585902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24046
		craterFreq      0.211658
		craterDensity   0.718656
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543021
		volcanoTemp     1367.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.248, 0.211, 0.000)
		colorShelf     (0.291, 0.264, 0.224, 0.000)
		colorBeach     (0.308, 0.280, 0.237, 0.000)
		colorDesert    (0.325, 0.295, 0.251, 0.000)
		colorLowland   (0.342, 0.311, 0.264, 0.000)
		colorUpland    (0.359, 0.326, 0.277, 0.000)
		colorRock      (0.377, 0.342, 0.290, 0.000)
		colorSnow      (0.394, 0.357, 0.303, 1.000)
		BumpHeight      9.34587
		BumpOffset      1.86917
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0404693
		Period          0.383247
		Eccentricity    0.381926
		Inclination     33.6131
		AscendingNode   114.844
		ArgOfPericenter 12.0509
		MeanAnomaly     11.6232
	}
}

DwarfMoon	"Jakku System 2.D58"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.83135e-010
	Radius          11.2761
	InertiaMoment   0.399076

	RotationPeriod  20547.1
	Obliquity       71.8622
	EqAscendNode    -7.12384

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.605 0.499)

	Surface
	{
		SurfStyle       0.18808
		OceanStyle      0.987991
		Randomize      (-0.808, 0.149, -0.242)
		colorDistMagn   0.61269
		colorDistFreq   0.0674268
		detailScale     307.913
		colorConversion true
		snowLevel       2
		tropicLatitude  0.601053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.621775
		terraceProb     0.372394
		erosion         0
		montesMagn      0.448692
		montesFreq      2.90992
		montesSpiky     0.962798
		montesFraction  0.474231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.214003
		hillsFraction   0.817861
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246148
		craterFreq      0.256513
		craterDensity   0.696069
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555681
		volcanoTemp     1162.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.242, 0.200, 0.000)
		colorShelf     (0.280, 0.257, 0.212, 0.000)
		colorBeach     (0.296, 0.272, 0.225, 0.000)
		colorDesert    (0.313, 0.287, 0.237, 0.000)
		colorLowland   (0.329, 0.302, 0.250, 0.000)
		colorUpland    (0.346, 0.317, 0.262, 0.000)
		colorRock      (0.362, 0.333, 0.275, 0.000)
		colorSnow      (0.378, 0.348, 0.287, 1.000)
		BumpHeight      10.1485
		BumpOffset      2.0297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.04099
		Period          0.390667
		Eccentricity    0.318772
		Inclination     71.8622
		AscendingNode   -7.12384
		ArgOfPericenter -106.092
		MeanAnomaly     -49.5732
	}
}

DwarfMoon	"Jakku System 2.D59"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            7.12133e-010
	Radius          12.3257
	InertiaMoment   0.399985

	Obliquity       -34.8675
	EqAscendNode    -26.1873
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.446 0.443 0.441)

	Surface
	{
		SurfStyle       0.0734441
		OceanStyle      0.804685
		Randomize      (-0.412, -0.944, 0.753)
		colorDistMagn   0.184443
		colorDistFreq   0.0716076
		detailScale     336.575
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280218
		terraceProb     0.252263
		erosion         0
		montesMagn      0.557241
		montesFreq      2.99981
		montesSpiky     0.954791
		montesFraction  0.60532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.408126
		hillsFraction   0.79623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247909
		craterFreq      0.238961
		craterDensity   0.857245
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49258
		volcanoTemp     1458.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.177, 0.176, 0.000)
		colorShelf     (0.190, 0.188, 0.187, 0.000)
		colorBeach     (0.201, 0.200, 0.198, 0.000)
		colorDesert    (0.212, 0.211, 0.209, 0.000)
		colorLowland   (0.223, 0.222, 0.220, 0.000)
		colorUpland    (0.234, 0.233, 0.231, 0.000)
		colorRock      (0.245, 0.244, 0.242, 0.000)
		colorSnow      (0.256, 0.255, 0.254, 1.000)
		BumpHeight      11.0932
		BumpOffset      2.21863
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0414191
		Period          0.396817
		Eccentricity    0.115075
		Inclination     -34.8675
		AscendingNode   -26.1873
		ArgOfPericenter -177.222
		MeanAnomaly     -103.645
	}
}

DwarfMoon	"Jakku System 2.D60"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.03248e-009
	Radius          13.2625
	InertiaMoment   0.398107

	RotationPeriod  4686.12
	Obliquity       75.8194
	EqAscendNode    63.1034

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.482 0.422 0.391)

	Surface
	{
		SurfStyle       0.889585
		OceanStyle      0.982963
		Randomize      (-0.295, -0.423, -0.605)
		colorDistMagn   0.800071
		colorDistFreq   0.0842913
		detailScale     362.155
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930922
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.764976
		terraceProb     0.145685
		erosion         0
		montesMagn      0.44627
		montesFreq      2.87452
		montesSpiky     0.955338
		montesFraction  0.653214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.330772
		hillsFraction   0.584734
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259056
		craterFreq      0.196413
		craterDensity   0.788535
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468035
		volcanoTemp     1514.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.148, 0.156, 0.050)
		colorShelf     (0.193, 0.173, 0.180, 0.040)
		colorBeach     (0.222, 0.198, 0.203, 0.030)
		colorDesert    (0.251, 0.224, 0.231, 0.020)
		colorLowland   (0.280, 0.249, 0.254, 0.030)
		colorUpland    (0.309, 0.274, 0.278, 0.050)
		colorRock      (0.338, 0.300, 0.309, 0.020)
		colorSnow      (0.338, 0.300, 0.309, 1.000)
		BumpHeight      11.9363
		BumpOffset      2.38726
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0417057
		Period          0.400943
		Eccentricity    0.420766
		Inclination     75.8194
		AscendingNode   63.1034
		ArgOfPericenter 61.1519
		MeanAnomaly     91.0043
	}
}

DwarfMoon	"Jakku System 2.D61"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            1.4765e-009
	Radius          17.4636
	InertiaMoment   0.399213

	Obliquity       65.9537
	EqAscendNode    79.1783
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.643 0.640)

	Surface
	{
		SurfStyle       0.803307
		OceanStyle      0.350666
		Randomize      (-0.929, -0.317, 0.365)
		colorDistMagn   0.448723
		colorDistFreq   0.0691502
		detailScale     476.871
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999955
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598801
		terraceProb     0.126466
		erosion         0
		montesMagn      0.672892
		montesFreq      2.96504
		montesSpiky     0.970793
		montesFraction  0.433982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.863553
		hillsFraction   0.621478
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25121
		craterFreq      0.181477
		craterDensity   0.878348
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538683
		volcanoTemp     1626.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.219, 0.179, 0.000)
		colorShelf     (0.259, 0.225, 0.205, 0.000)
		colorBeach     (0.304, 0.264, 0.243, 0.000)
		colorDesert    (0.330, 0.283, 0.237, 0.000)
		colorLowland   (0.362, 0.302, 0.269, 0.000)
		colorUpland    (0.401, 0.367, 0.327, 0.000)
		colorRock      (0.433, 0.399, 0.352, 0.000)
		colorSnow      (0.472, 0.425, 0.371, 1.000)
		BumpHeight      15.7172
		BumpOffset      3.14344
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.042332
		Period          0.410009
		Eccentricity    0.277114
		Inclination     65.9537
		AscendingNode   79.1783
		ArgOfPericenter -177.937
		MeanAnomaly     -140.57
	}
}

DwarfMoon	"Jakku System 2.D62"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.08741e-009
	Radius          18.4794
	InertiaMoment   0.39597

	RotationPeriod  7260.17
	Obliquity       -18.8096
	EqAscendNode    -137.277

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.789 0.788)

	Surface
	{
		SurfStyle       0.369496
		OceanStyle      0.97356
		Randomize      (-0.010, 0.133, 0.688)
		colorDistMagn   0.622869
		colorDistFreq   0.17705
		detailScale     504.611
		colorConversion true
		snowLevel       2
		tropicLatitude  0.23326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515861
		terraceProb     0.117695
		erosion         0
		montesMagn      0.352828
		montesFreq      2.07871
		montesSpiky     0.900189
		montesFraction  0.714101
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.881693
		hillsFraction   0.599427
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22644
		craterFreq      0.265828
		craterDensity   0.847343
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430538
		volcanoTemp     1189.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.316, 0.315, 0.000)
		colorShelf     (0.336, 0.335, 0.335, 0.000)
		colorBeach     (0.356, 0.355, 0.354, 0.000)
		colorDesert    (0.376, 0.375, 0.374, 0.000)
		colorLowland   (0.395, 0.394, 0.394, 0.000)
		colorUpland    (0.415, 0.414, 0.414, 0.000)
		colorRock      (0.435, 0.434, 0.433, 0.000)
		colorSnow      (0.455, 0.454, 0.453, 1.000)
		BumpHeight      16.6315
		BumpOffset      3.3263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0426144
		Period          0.414118
		Eccentricity    0.379862
		Inclination     -18.8096
		AscendingNode   -137.277
		ArgOfPericenter -102.723
		MeanAnomaly     137.685
	}
}

DwarfMoon	"Jakku System 2.D63"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            2.92297e-009
	Radius          19.8479
	InertiaMoment   0.398295

	Obliquity       -53.044
	EqAscendNode    16.9572
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.655 0.652)

	Surface
	{
		SurfStyle       0.663437
		OceanStyle      0.786795
		Randomize      (-0.412, -0.648, 0.568)
		colorDistMagn   0.61339
		colorDistFreq   0.267407
		detailScale     541.979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566681
		terraceProb     0.228255
		erosion         0
		montesMagn      0.424269
		montesFreq      2.74529
		montesSpiky     0.938158
		montesFraction  0.41857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.11583
		hillsFraction   0.839339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225575
		craterFreq      0.249769
		craterDensity   1.01173
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556349
		volcanoTemp     1891.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.223, 0.183, 0.000)
		colorShelf     (0.264, 0.229, 0.209, 0.000)
		colorBeach     (0.310, 0.269, 0.248, 0.000)
		colorDesert    (0.336, 0.288, 0.241, 0.000)
		colorLowland   (0.369, 0.308, 0.274, 0.000)
		colorUpland    (0.409, 0.374, 0.333, 0.000)
		colorRock      (0.442, 0.406, 0.359, 0.000)
		colorSnow      (0.481, 0.433, 0.378, 1.000)
		BumpHeight      17.8631
		BumpOffset      3.57262
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0428766
		Period          0.417947
		Eccentricity    0.208265
		Inclination     -53.044
		AscendingNode   16.9573
		ArgOfPericenter -35.8497
		MeanAnomaly     51.3004
	}
}

DwarfMoon	"Jakku System 2.D64"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            4.06055e-009
	Radius          21.1382
	InertiaMoment   0.399346

	Obliquity       47.8127
	EqAscendNode    34.0401
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.758 0.754)

	Surface
	{
		SurfStyle       0.927696
		OceanStyle      0.170138
		Randomize      (0.542, 0.268, 0.706)
		colorDistMagn   0.63321
		colorDistFreq   0.103778
		detailScale     577.214
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382137
		terraceProb     0.593711
		erosion         0
		montesMagn      0.35915
		montesFreq      2.47781
		montesSpiky     0.957169
		montesFraction  0.354333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23609
		hillsFraction   0.667552
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220978
		craterFreq      0.197486
		craterDensity   1.05881
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498317
		volcanoTemp     1378.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.265, 0.302, 0.050)
		colorShelf     (0.304, 0.311, 0.347, 0.040)
		colorBeach     (0.350, 0.356, 0.392, 0.030)
		colorDesert    (0.396, 0.402, 0.445, 0.020)
		colorLowland   (0.441, 0.447, 0.490, 0.030)
		colorUpland    (0.487, 0.493, 0.535, 0.050)
		colorRock      (0.533, 0.538, 0.595, 0.020)
		colorSnow      (0.533, 0.538, 0.595, 1.000)
		BumpHeight      19.0244
		BumpOffset      3.80488
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0434576
		Period          0.42647
		Eccentricity    0.083049
		Inclination     47.8127
		AscendingNode   34.0401
		ArgOfPericenter -96.63
		MeanAnomaly     1.43079
	}
}

DwarfMoon	"Jakku System 2.D65"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            5.60395e-009
	Radius          27.6228
	InertiaMoment   0.396648

	RotationPeriod  5047.21
	Obliquity       75.0238
	EqAscendNode    -7.17533

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.594 0.524 0.429)

	Surface
	{
		SurfStyle       0.441319
		OceanStyle      0.0585351
		Randomize      (-0.264, -0.844, 0.360)
		colorDistMagn   0.828418
		colorDistFreq   0.536274
		detailScale     754.287
		colorConversion true
		snowLevel       2
		tropicLatitude  0.511755
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394181
		terraceProb     0.545074
		erosion         0
		montesMagn      0.358239
		montesFreq      2.29846
		montesSpiky     0.91556
		montesFraction  0.295472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0164
		hillsFraction   0.775721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221856
		craterFreq      0.27875
		craterDensity   0.984064
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573089
		volcanoTemp     1370.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.210, 0.172, 0.000)
		colorShelf     (0.252, 0.223, 0.182, 0.000)
		colorBeach     (0.267, 0.236, 0.193, 0.000)
		colorDesert    (0.282, 0.249, 0.204, 0.000)
		colorLowland   (0.297, 0.262, 0.214, 0.000)
		colorUpland    (0.312, 0.275, 0.225, 0.000)
		colorRock      (0.327, 0.288, 0.236, 0.000)
		colorSnow      (0.342, 0.301, 0.247, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0438215
		Period          0.431838
		Eccentricity    0.258594
		Inclination     75.0238
		AscendingNode   -7.17533
		ArgOfPericenter -90.9237
		MeanAnomaly     -76.994
	}
}

DwarfMoon	"Jakku System 2.D66"
{
	ParentBody     "Jakku System 2"
	Class	       "Asteroid"

	Mass            7.69284e-009
	Radius          28.7289
	InertiaMoment   0.398468

	RotationPeriod  7723.87
	Obliquity       -66.8167
	EqAscendNode    30.7438

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.714 0.711)

	Surface
	{
		SurfStyle       0.571038
		OceanStyle      0.601941
		Randomize      (0.308, 0.794, -0.761)
		colorDistMagn   0.377167
		colorDistFreq   0.630036
		detailScale     784.491
		colorConversion true
		snowLevel       2
		tropicLatitude  0.820753
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494678
		terraceProb     0.419267
		erosion         0
		montesMagn      0.392172
		montesFreq      2.39524
		montesSpiky     0.973563
		montesFraction  0.366298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.67917
		hillsFraction   0.716178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234086
		craterFreq      0.221598
		craterDensity   0.860247
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467463
		volcanoTemp     1443.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.243, 0.199, 0.000)
		colorShelf     (0.288, 0.250, 0.228, 0.000)
		colorBeach     (0.338, 0.293, 0.270, 0.000)
		colorDesert    (0.367, 0.314, 0.263, 0.000)
		colorLowland   (0.403, 0.336, 0.299, 0.000)
		colorUpland    (0.446, 0.407, 0.363, 0.000)
		colorRock      (0.482, 0.443, 0.391, 0.000)
		colorSnow      (0.525, 0.472, 0.413, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0444101
		Period          0.440568
		Eccentricity    0.481344
		Inclination     -66.8167
		AscendingNode   30.7438
		ArgOfPericenter -67.9255
		MeanAnomaly     -71.0883
	}
}

DwarfMoon	"Jakku System 2.D67"
{
	ParentBody     "Jakku System 5"
	Class	       "Asteroid"

	Mass            1.05158e-008
	Radius          30.5845
	InertiaMoment   0.399477

	Obliquity       6.84393
	EqAscendNode    171.135
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.470 0.462)

	Surface
	{
		SurfStyle       0.150831
		OceanStyle      0.655932
		Randomize      (0.698, 0.115, -0.568)
		colorDistMagn   0.518322
		colorDistFreq   0.0899564
		detailScale     835.161
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0184185
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413426
		terraceProb     0.19346
		erosion         0
		montesMagn      0.656817
		montesFreq      2.64271
		montesSpiky     0.789052
		montesFraction  0.66458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.86491
		hillsFraction   0.500888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255823
		craterFreq      0.236359
		craterDensity   0.819874
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512419
		volcanoTemp     1807.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.185, 0.000)
		colorShelf     (0.202, 0.200, 0.196, 0.000)
		colorBeach     (0.214, 0.211, 0.208, 0.000)
		colorDesert    (0.226, 0.223, 0.219, 0.000)
		colorLowland   (0.238, 0.235, 0.231, 0.000)
		colorUpland    (0.250, 0.247, 0.243, 0.000)
		colorRock      (0.262, 0.258, 0.254, 0.000)
		colorSnow      (0.274, 0.270, 0.266, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0446912
		Period          0.444758
		Eccentricity    0.0333404
		Inclination     6.84393
		AscendingNode   171.135
		ArgOfPericenter 30.1713
		MeanAnomaly     -153.359
	}
}

Planet	"Jakku System 3"
{
	ParentBody     "Jakku System"
	Class	       "IceWorld"

	Mass            1.09867
	Radius          8368.49
	InertiaMoment   0.330639

	Oblateness      0.0106956

	RotationPeriod  19.1879
	Obliquity       -5.4701
	EqAscendNode    -109.187

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.599 0.596 0.593)

	Surface
	{
		SurfStyle       0.272512
		OceanStyle      0.0512781
		Randomize      (0.855, 0.579, 0.440)
		colorDistMagn   0.071423
		colorDistFreq   906.192
		detailScale     21524.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.178485
		snowLevel       2
		tropicLatitude  0.108478
		icecapLatitude  0.736433
		icecapHeight    0.195233
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91077
		venusFreq       0.45003
		venusMagn       0
		mareFreq        1.86017
		mareDensity     0.0779499
		terraceProb     0.454406
		erosion         0
		montesMagn      0.219327
		montesFreq      344.149
		montesSpiky     0.984009
		montesFraction  0.552169
		dunesMagn       0.0466837
		dunesFreq       11207
		dunesFraction   0.802147
		hillsMagn       0.143454
		hillsFreq       1056.61
		hillsFraction   0.652721
		hills2Fraction  0.279032
		riversMagn      60.095
		riversFreq      3.63481
		riversSin       6.38749
		riversOctaves   0
		canyonsMagn     0.459018
		canyonsFreq     3.16619
		canyonFraction  0
		cracksMagn      0.0682901
		cracksFreq      4.47965
		cracksOctaves   4
		craterMagn      0.660461
		craterFreq      24.8741
		craterDensity   0.355788
		craterOctaves   5.92757
		craterRayedFactor 0.0776952
		volcanoMagn     0.56734
		volcanoFreq     0.606028
		volcanoDensity  0.191061
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.266822
		volcanoRadius   0.566228
		volcanoTemp     879.736
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.75581
		stripeTwist     0
		cycloneMagn     2.7318
		cycloneFreq     0.578383
		cycloneDensity  0.349584
		cycloneOctaves  3
		colorSea       (0.599, 0.596, 0.593, 0.500)
		colorShelf     (0.569, 0.567, 0.563, 0.500)
		colorBeach     (0.419, 0.417, 0.415, 0.750)
		colorDesert    (0.509, 0.507, 0.504, 1.000)
		colorLowland   (0.527, 0.525, 0.522, 1.000)
		colorUpland    (0.557, 0.555, 0.552, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.527, 0.525, 0.522, 1.000)
		colorUpPlants  (0.557, 0.555, 0.552, 1.000)
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

	Clouds
	{
		Height          12.9316
		Velocity        168.793
		BumpHeight      2.9315
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.929608
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.75581
		stripeTwist     0
	}

	Clouds
	{
		Height          15.8633
		Velocity        127.157
		BumpHeight      2.9315
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.929608
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.75581
		stripeTwist     0
	}

	Clouds
	{
		Height          18.7949
		Velocity        146.926
		BumpHeight      2.9315
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.929608
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.75581
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          41.8425
		Density         0.133815
		Pressure        0.0536792
		Greenhouse      0.599658
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	57.849
			CH4   	23.6737
			C2H2  	13.3136
			C2H4  	3.64574
			C2H6  	0.996854
			N2    	0.356894
			H2S   	0.114934
			NH3   	0.0202502
			C3H8  	0.0150782
			CO    	0.0137313
			Ar    	0.000151458
			SO2   	5.50285e-005
			Ne    	3.28438e-005
		}
	}

	Aurora
	{
		Height      57.649
		NorthLat    60.6857
		NorthLon    -123.075
		NorthRadius 2307.53
		NorthWidth  627.669
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -49.5772
		SouthLon    54.0747
		SouthRadius 2383.07
		SouthWidth  801.268
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     9939.04
		OuterRadius     19835.1
		RotationPeriod  4.80135
		RotationOffset  0
		FrontBright     0.974433
		BackBright      0.926328
		Density         0.718333
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.04237
		Period          4.87885
		Eccentricity    0.0189692
		Inclination     1.65529
		AscendingNode   -109.779
		ArgOfPericenter 51.1265
		MeanAnomaly     203.794
	}
}

Planet	"Jakku System 7"
{
	ParentBody     "Jakku System"
	Class	       "GasGiant"

	Mass            1183.44
	Radius          77386.2
	InertiaMoment   0.260426

	Oblateness      0.026263

	RotationPeriod  9.26178
	Obliquity       -16.3071
	EqAscendNode    139.808

	AlbedoBond      0.490938
	AlbedoGeom      0.589126
	Brightness      2

	Surface
	{
		SurfStyle       0.668239
		Randomize      (0.871, 0.054, -0.153)
		detailScale     199042
		colorConversion true
		tropicLatitude  0.290567
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.8003
		stripeFluct     0.418274
		stripeTwist     12.8281
		cycloneMagn     14.0874
		cycloneFreq     0.866575
		cycloneDensity  0.512066
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
		BumpHeight      7.05384
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          31.0469
		Velocity        -1071.19
		BumpHeight      23.9928
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.15724
		mainOctaves     12
		Coverage        0.409383
		stripeZones     6.8003
		stripeFluct     0.418274
		stripeTwist     12.8281
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          127.018
		Density         5454.3
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0360662
		Saturation      0.873763

		Composition
		{
			H2    	91.4414
			He    	8.18361
			CH4   	0.321958
			N2    	0.0423059
			O2    	0.00811308
			Ne    	0.0013571
			Ar    	0.000861327
			C2H4  	0.000348764
			C2H2  	2.07316e-005
			C2H6  	1.59749e-005
		}
	}

	Aurora
	{
		Height      3459.51
		NorthLat    79.9762
		NorthLon    176.624
		NorthRadius 12897.8
		NorthWidth  8221.76
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -79.0824
		SouthLon    359.109
		SouthRadius 15126.4
		SouthWidth  7929.5
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     94807.7
		OuterRadius     168251
		RotationPeriod  3.84187
		RotationOffset  0
		FrontBright     0.837491
		BackBright      0.879242
		Density         0.667833
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.43727
		Period          11.6392
		Eccentricity    0.00613839
		Inclination     0.735405
		AscendingNode   141.918
		ArgOfPericenter 133.15
		MeanAnomaly     95.3466
	}
}

Moon	"Jakku System 7.1"
{
	ParentBody     "Jakku System 7"
	Class	       "Desert"

	Mass            0.975715
	Radius          8075.66
	InertiaMoment   0.330748

	RotationPeriod  114.445
	Obliquity       -0.929003
	EqAscendNode    47.5507

	AlbedoBond      0.342205
	AlbedoGeom      0.410646
	Brightness      2
	Color          (0.411 0.407 0.403)

	Surface
	{
		SurfStyle       0.418348
		OceanStyle      0.584358
		Randomize      (-0.924, 0.359, 0.426)
		colorDistMagn   0.0645195
		colorDistFreq   954.861
		detailScale     20771
		colorConversion true
		seaLevel        0.0830796
		snowLevel       2
		tropicLatitude  0.0296716
		icecapLatitude  10
		icecapHeight    0.146196
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.893235
		venusFreq       1.11428
		venusMagn       0.534961
		mareFreq        1.82852
		mareDensity     0.0741156
		terraceProb     0.577032
		erosion         0
		montesMagn      0.220917
		montesFreq      293.611
		montesSpiky     0.941773
		montesFraction  0.48305
		dunesMagn       0.0461636
		dunesFreq       64.1226
		dunesFraction   0.703004
		hillsMagn       0.17085
		hillsFreq       896.581
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.9941
		riversFreq      2.90224
		riversSin       5.43167
		riversOctaves   0
		canyonsMagn     0.0549262
		canyonsFreq     212.956
		canyonFraction  0
		cracksMagn      0.100064
		cracksFreq      0.754336
		cracksOctaves   0
		craterMagn      0.587168
		craterFreq      27.6311
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.728685
		volcanoFreq     0.760378
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.474016
		volcanoRadius   0.533402
		volcanoTemp     1737.75
		lavaCoverTidal  0.874143
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.88892
		stripeTwist     0.227325
		cycloneMagn     2.40755
		cycloneFreq     0.707513
		cycloneDensity  0.381266
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
		Height          70.1118
		Velocity        95.91
		BumpHeight      5.47609
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.902732
		mainOctaves     10
		Coverage        0.28441
		stripeZones     2.88892
		stripeTwist     0.227325
	}

	Clouds
	{
		Height          130.224
		Velocity        136.482
		BumpHeight      6.37197
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.902732
		mainOctaves     10
		Coverage        0.28441
		stripeZones     2.88892
		stripeTwist     0.227325
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          403.783
		Density         12.2328
		Pressure        36.5174
		Greenhouse      180.302
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.046752
		Saturation      0.642971

		Composition
		{
			CO2   	67.8427
			H2O   	26.9839
			SO2   	4.92028
			N2    	0.253088
			CO    	7.0968e-005
		}
	}

	Aurora
	{
		Height      162.2
		NorthLat    71.1706
		NorthLon    -165.472
		NorthRadius 2062.31
		NorthWidth  445.866
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -80.6634
		SouthLon    34.0311
		SouthRadius 2307.52
		SouthWidth  604.616
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     10547
		OuterRadius     14145.9
		RotationPeriod  3.84799
		RotationOffset  0
		FrontBright     0.873099
		BackBright      0.975933
		Density         0.806554
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00532393
		Period          0.00652792
		Eccentricity    0.519089
		Inclination     -0.929003
		AscendingNode   47.5507
		ArgOfPericenter 170.056
		MeanAnomaly     125.442
	}
}

Moon	"Jakku System 7.2"
{
	ParentBody     "Jakku System 7"
	Class	       "IceWorld"

	Mass            0.000316162
	Radius          564.944
	InertiaMoment   0.398533

	Obliquity       0.20828
	EqAscendNode    -167.128
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.769 0.765 0.762)

	Surface
	{
		SurfStyle       0.912241
		OceanStyle      0.530439
		Randomize      (-0.099, 0.967, 0.834)
		colorDistMagn   0.0600614
		colorDistFreq   54.5912
		detailScale     1453.07
		colorConversion true
		drivenDarkening 0.4817
		seaLevel        0.162113
		snowLevel       2
		tropicLatitude  0.000845728
		icecapLatitude  0.920327
		icecapHeight    0.168329
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.83688
		venusFreq       0.520881
		venusMagn       0
		mareFreq        0
		mareDensity     0.000197162
		terraceProb     0.397684
		erosion         0
		montesMagn      0.0623423
		montesFreq      30.2805
		montesSpiky     0.949368
		montesFraction  0.216786
		dunesMagn       0.0433268
		dunesFreq       735.086
		dunesFraction   0.0320768
		hillsMagn       0.11265
		hillsFreq       69.5398
		hillsFraction   0.920047
		hills2Fraction  0.0400439
		riversMagn      62.2277
		riversFreq      3.25121
		riversSin       5.72884
		riversOctaves   0
		canyonsMagn     0.490822
		canyonsFreq     0.21865
		canyonFraction  0
		cracksMagn      0.0404932
		cracksFreq      0.241234
		cracksOctaves   0
		craterMagn      0.606502
		craterFreq      1.25744
		craterDensity   0.799733
		craterOctaves   9
		craterRayedFactor 0.174111
		volcanoMagn     0.174747
		volcanoFreq     0.722551
		volcanoDensity  0.161297
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.128317
		volcanoRadius   0.152
		volcanoTemp     1569.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.584, 0.543, 0.442, 1.000)
		colorShelf     (0.584, 0.543, 0.442, 1.000)
		colorBeach     (0.538, 0.474, 0.381, 1.000)
		colorDesert    (0.538, 0.474, 0.381, 1.000)
		colorLowland   (0.653, 0.620, 0.579, 1.000)
		colorUpland    (0.684, 0.681, 0.655, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.653, 0.620, 0.579, 1.000)
		colorUpPlants  (0.684, 0.681, 0.655, 1.000)
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
		SemiMajorAxis   0.0150345
		Period          0.0309913
		Eccentricity    0.0476731
		Inclination     0.20828
		AscendingNode   -167.128
		ArgOfPericenter 118.258
		MeanAnomaly     140.466
	}
}

Moon	"Jakku System 7.3"
{
	ParentBody     "Jakku System 7"
	Class	       "IceWorld"

	Mass            0.00111633
	Radius          793.364
	InertiaMoment   0.397843

	Obliquity       0.738843
	EqAscendNode    122.57
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.775 0.774 0.771)

	Surface
	{
		SurfStyle       0.985298
		OceanStyle      0.0551322
		Randomize      (-0.739, -0.634, 0.581)
		colorDistMagn   0.0709028
		colorDistFreq   118.976
		detailScale     2040.58
		colorConversion true
		drivenDarkening 0.286647
		seaLevel        0.20548
		snowLevel       2
		tropicLatitude  0.012391
		icecapLatitude  0.678746
		icecapHeight    0.22642
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58571
		venusFreq       1.12409
		venusMagn       0
		mareFreq        0.146056
		mareDensity     0.000781441
		terraceProb     0.292897
		erosion         0
		montesMagn      0.0641985
		montesFreq      38.1837
		montesSpiky     0.922979
		montesFraction  0.780334
		dunesMagn       0.0588945
		dunesFreq       1050.64
		dunesFraction   0.770758
		hillsMagn       0.13753
		hillsFreq       100.111
		hillsFraction   0.965259
		hills2Fraction  3.17667e-005
		riversMagn      64.2631
		riversFreq      3.5965
		riversSin       5.50779
		riversOctaves   0
		canyonsMagn     0.637863
		canyonsFreq     0.289484
		canyonFraction  0
		cracksMagn      0.0570928
		cracksFreq      0.313985
		cracksOctaves   0
		craterMagn      0.541975
		craterFreq      3.04998
		craterDensity   0.915126
		craterOctaves   10
		craterRayedFactor 0.197325
		volcanoMagn     0.174802
		volcanoFreq     0.751427
		volcanoDensity  0.215206
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.247229
		volcanoRadius   0.162811
		volcanoTemp     1491.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.589, 0.549, 0.447, 1.000)
		colorShelf     (0.589, 0.549, 0.447, 1.000)
		colorBeach     (0.543, 0.480, 0.386, 1.000)
		colorDesert    (0.543, 0.480, 0.386, 1.000)
		colorLowland   (0.659, 0.627, 0.586, 1.000)
		colorUpland    (0.690, 0.689, 0.663, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.659, 0.627, 0.586, 1.000)
		colorUpPlants  (0.690, 0.689, 0.663, 1.000)
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
		SemiMajorAxis   0.025265
		Period          0.0675124
		Eccentricity    0.00671298
		Inclination     0.738843
		AscendingNode   122.57
		ArgOfPericenter 61.5241
		MeanAnomaly     64.5464
	}
}

DwarfMoon	"Jakku System 7.D1"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            4.86855e-011
	Radius          5.39571
	InertiaMoment   0.396371

	Obliquity       -33.052
	EqAscendNode    -27.1906
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.614 0.567)

	Surface
	{
		SurfStyle       0.582179
		OceanStyle      0.684336
		Randomize      (0.351, 0.691, -0.873)
		colorDistMagn   0.254232
		colorDistFreq   0.0229167
		detailScale     147.339
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898999
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413178
		terraceProb     0.645256
		erosion         0
		montesMagn      0.415438
		montesFreq      3.25259
		montesSpiky     0.994706
		montesFraction  0.305543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0893546
		hillsFraction   0.706693
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246192
		craterFreq      0.221176
		craterDensity   1.05161
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431156
		volcanoTemp     1380.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.209, 0.159, 0.000)
		colorShelf     (0.277, 0.215, 0.181, 0.000)
		colorBeach     (0.325, 0.252, 0.215, 0.000)
		colorDesert    (0.353, 0.270, 0.210, 0.000)
		colorLowland   (0.387, 0.288, 0.238, 0.000)
		colorUpland    (0.429, 0.350, 0.289, 0.000)
		colorRock      (0.463, 0.380, 0.312, 0.000)
		colorSnow      (0.505, 0.405, 0.329, 1.000)
		BumpHeight      4.85614
		BumpOffset      0.971229
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.107967
		Period          0.59641
		Eccentricity    0.147142
		Inclination     -33.052
		AscendingNode   -27.1906
		ArgOfPericenter -128.626
		MeanAnomaly     -119.632
	}
}

DwarfMoon	"Jakku System 7.D2"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            8.39983e-011
	Radius          6.18821
	InertiaMoment   0.398386

	Obliquity       -73.9043
	EqAscendNode    31.3448
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.412 0.408 0.405)

	Surface
	{
		SurfStyle       0.49815
		OceanStyle      0.651914
		Randomize      (0.924, 0.424, -0.477)
		colorDistMagn   0.6257
		colorDistFreq   0.0220307
		detailScale     168.979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.702642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.73428
		terraceProb     0.55607
		erosion         0
		montesMagn      0.365617
		montesFreq      3.16098
		montesSpiky     0.906062
		montesFraction  0.693096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0917787
		hillsFraction   0.516864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221522
		craterFreq      0.201437
		craterDensity   0.952906
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471148
		volcanoTemp     1613.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.163, 0.162, 0.000)
		colorShelf     (0.175, 0.174, 0.172, 0.000)
		colorBeach     (0.185, 0.184, 0.182, 0.000)
		colorDesert    (0.196, 0.194, 0.193, 0.000)
		colorLowland   (0.206, 0.204, 0.203, 0.000)
		colorUpland    (0.216, 0.214, 0.213, 0.000)
		colorRock      (0.227, 0.225, 0.223, 0.000)
		colorSnow      (0.237, 0.235, 0.233, 1.000)
		BumpHeight      5.56939
		BumpOffset      1.11388
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.108572
		Period          0.601424
		Eccentricity    0.00658049
		Inclination     -73.9043
		AscendingNode   31.3448
		ArgOfPericenter 56.4486
		MeanAnomaly     -150.997
	}
}

DwarfMoon	"Jakku System 7.D3"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            1.38046e-010
	Radius          7.0095
	InertiaMoment   0.399414

	Obliquity       35.8516
	EqAscendNode    -34.2981
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.612 0.607)

	Surface
	{
		SurfStyle       0.732219
		OceanStyle      0.513306
		Randomize      (-0.356, 0.059, 0.816)
		colorDistMagn   0.568017
		colorDistFreq   0.0362071
		detailScale     191.406
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927595
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.710308
		terraceProb     0.153337
		erosion         0
		montesMagn      0.534504
		montesFreq      3.15245
		montesSpiky     0.735723
		montesFraction  0.655862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.153112
		hillsFraction   0.578396
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220114
		craterFreq      0.213642
		craterDensity   0.818419
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498177
		volcanoTemp     1321.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.208, 0.170, 0.000)
		colorShelf     (0.246, 0.214, 0.194, 0.000)
		colorBeach     (0.289, 0.251, 0.231, 0.000)
		colorDesert    (0.313, 0.269, 0.225, 0.000)
		colorLowland   (0.344, 0.288, 0.255, 0.000)
		colorUpland    (0.381, 0.349, 0.309, 0.000)
		colorRock      (0.412, 0.379, 0.334, 0.000)
		colorSnow      (0.448, 0.404, 0.352, 1.000)
		BumpHeight      6.30855
		BumpOffset      1.26171
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.108778
		Period          0.603142
		Eccentricity    0.236652
		Inclination     35.8516
		AscendingNode   -34.2981
		ArgOfPericenter 144.275
		MeanAnomaly     -114.001
	}
}

DwarfMoon	"Jakku System 7.D4"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            2.18518e-010
	Radius          10.8051
	InertiaMoment   0.396886

	Obliquity       29.9503
	EqAscendNode    63.5506
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.435 0.337)

	Surface
	{
		SurfStyle       0.894816
		OceanStyle      0.193992
		Randomize      (0.201, 0.406, 0.328)
		colorDistMagn   0.0898638
		colorDistFreq   0.0828733
		detailScale     295.052
		colorConversion true
		snowLevel       2
		tropicLatitude  0.768596
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.735816
		terraceProb     0.229099
		erosion         0
		montesMagn      0.371154
		montesFreq      3.56451
		montesSpiky     0.837293
		montesFraction  0.558667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.243547
		hillsFraction   0.583507
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250486
		craterFreq      0.212929
		craterDensity   1.02204
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51504
		volcanoTemp     1492.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.152, 0.135, 0.050)
		colorShelf     (0.216, 0.178, 0.155, 0.040)
		colorBeach     (0.249, 0.204, 0.175, 0.030)
		colorDesert    (0.281, 0.230, 0.199, 0.020)
		colorLowland   (0.314, 0.256, 0.219, 0.030)
		colorUpland    (0.346, 0.283, 0.239, 0.050)
		colorRock      (0.379, 0.309, 0.266, 0.020)
		colorSnow      (0.379, 0.309, 0.266, 1.000)
		BumpHeight      9.72463
		BumpOffset      1.94493
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10939
		Period          0.608233
		Eccentricity    0.3191
		Inclination     29.9503
		AscendingNode   63.5506
		ArgOfPericenter -20.413
		MeanAnomaly     2.93331
	}
}

DwarfMoon	"Jakku System 7.D5"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            3.35786e-010
	Radius          10.3532
	InertiaMoment   0.398553

	RotationPeriod  13405.7
	Obliquity       21.2273
	EqAscendNode    -153.95

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.614 0.562)

	Surface
	{
		SurfStyle       0.806864
		OceanStyle      0.893757
		Randomize      (-0.849, 0.438, -0.320)
		colorDistMagn   0.386569
		colorDistFreq   0.0938482
		detailScale     282.712
		colorConversion true
		snowLevel       2
		tropicLatitude  0.162658
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.627872
		terraceProb     0.32635
		erosion         0
		montesMagn      0.446111
		montesFreq      2.24738
		montesSpiky     0.830621
		montesFraction  0.550761
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.301667
		hillsFraction   0.773696
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248967
		craterFreq      0.243571
		craterDensity   1.03363
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499308
		volcanoTemp     1629.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.209, 0.157, 0.000)
		colorShelf     (0.267, 0.215, 0.180, 0.000)
		colorBeach     (0.313, 0.252, 0.214, 0.000)
		colorDesert    (0.340, 0.270, 0.208, 0.000)
		colorLowland   (0.373, 0.289, 0.236, 0.000)
		colorUpland    (0.413, 0.350, 0.287, 0.000)
		colorRock      (0.446, 0.381, 0.309, 0.000)
		colorSnow      (0.486, 0.405, 0.326, 1.000)
		BumpHeight      9.3179
		BumpOffset      1.86358
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.109808
		Period          0.611727
		Eccentricity    0.480035
		Inclination     21.2273
		AscendingNode   -153.95
		ArgOfPericenter 168.434
		MeanAnomaly     -57.2068
	}
}

DwarfMoon	"Jakku System 7.D6"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            5.03781e-010
	Radius          11.3075
	InertiaMoment   0.399543

	Obliquity       67.4365
	EqAscendNode    149.779
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.755 0.754)

	Surface
	{
		SurfStyle       0.318763
		OceanStyle      0.477187
		Randomize      (-0.051, -0.453, -0.465)
		colorDistMagn   0.902918
		colorDistFreq   0.0845531
		detailScale     308.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.467298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497041
		terraceProb     0.175222
		erosion         0
		montesMagn      0.465721
		montesFreq      3.31349
		montesSpiky     0.937889
		montesFraction  0.471765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.354028
		hillsFraction   0.700071
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249102
		craterFreq      0.194905
		craterDensity   0.846315
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.406457
		volcanoTemp     1542.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.302, 0.302, 0.000)
		colorShelf     (0.322, 0.321, 0.321, 0.000)
		colorBeach     (0.341, 0.340, 0.339, 0.000)
		colorDesert    (0.360, 0.359, 0.358, 0.000)
		colorLowland   (0.378, 0.378, 0.377, 0.000)
		colorUpland    (0.397, 0.397, 0.396, 0.000)
		colorRock      (0.416, 0.416, 0.415, 0.000)
		colorSnow      (0.435, 0.434, 0.434, 1.000)
		BumpHeight      10.1768
		BumpOffset      2.03535
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.110043
		Period          0.613692
		Eccentricity    0.138845
		Inclination     67.4365
		AscendingNode   149.779
		ArgOfPericenter -128.078
		MeanAnomaly     -13.5257
	}
}

DwarfMoon	"Jakku System 7.D7"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            7.41159e-010
	Radius          12.3514
	InertiaMoment   0.397251

	RotationPeriod  21596.3
	Obliquity       -62.932
	EqAscendNode    136.143

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.584 0.580)

	Surface
	{
		SurfStyle       0.0837231
		OceanStyle      0.353748
		Randomize      (0.615, -0.485, -0.982)
		colorDistMagn   0.821209
		colorDistFreq   0.0850926
		detailScale     337.275
		colorConversion true
		snowLevel       2
		tropicLatitude  0.627236
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343796
		terraceProb     0.171199
		erosion         0
		montesMagn      0.683361
		montesFreq      3.77149
		montesSpiky     0.927724
		montesFraction  0.618578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.317235
		hillsFraction   0.67805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232342
		craterFreq      0.229895
		craterDensity   0.910135
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495124
		volcanoTemp     1198.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.234, 0.232, 0.000)
		colorShelf     (0.250, 0.248, 0.247, 0.000)
		colorBeach     (0.265, 0.263, 0.261, 0.000)
		colorDesert    (0.280, 0.278, 0.276, 0.000)
		colorLowland   (0.294, 0.292, 0.290, 0.000)
		colorUpland    (0.309, 0.307, 0.305, 0.000)
		colorRock      (0.324, 0.321, 0.319, 0.000)
		colorSnow      (0.338, 0.336, 0.334, 1.000)
		BumpHeight      11.1162
		BumpOffset      2.22325
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.11031
		Period          0.615925
		Eccentricity    0.304757
		Inclination     -62.932
		AscendingNode   136.143
		ArgOfPericenter 131.007
		MeanAnomaly     51.8901
	}
}

DwarfMoon	"Jakku System 7.D8"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            1.07287e-009
	Radius          13.0513
	InertiaMoment   0.398711

	Obliquity       26.5049
	EqAscendNode    -125.305
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.631 0.629)

	Surface
	{
		SurfStyle       0.00250445
		OceanStyle      0.95654
		Randomize      (0.789, 0.481, -0.718)
		colorDistMagn   0.93176
		colorDistFreq   0.0492499
		detailScale     356.388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.401313
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518351
		terraceProb     0.287462
		erosion         0
		montesMagn      0.404156
		montesFreq      3.36104
		montesSpiky     0.946775
		montesFraction  0.538788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.283807
		hillsFraction   0.833084
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235545
		craterFreq      0.172046
		craterDensity   0.958475
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449342
		volcanoTemp     1787.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.252, 0.251, 0.000)
		colorShelf     (0.271, 0.268, 0.267, 0.000)
		colorBeach     (0.287, 0.284, 0.283, 0.000)
		colorDesert    (0.303, 0.300, 0.299, 0.000)
		colorLowland   (0.319, 0.315, 0.314, 0.000)
		colorUpland    (0.335, 0.331, 0.330, 0.000)
		colorRock      (0.351, 0.347, 0.346, 0.000)
		colorSnow      (0.367, 0.363, 0.361, 1.000)
		BumpHeight      11.7462
		BumpOffset      2.34924
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.110826
		Period          0.620252
		Eccentricity    0.360705
		Inclination     26.5049
		AscendingNode   -125.305
		ArgOfPericenter 124.34
		MeanAnomaly     155.126
	}
}

DwarfMoon	"Jakku System 7.D9"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            1.53226e-009
	Radius          17.3248
	InertiaMoment   0.399671

	Obliquity       -14.7735
	EqAscendNode    168.064
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.570 0.566)

	Surface
	{
		SurfStyle       0.627962
		OceanStyle      0.198464
		Randomize      (-0.524, -0.189, -0.587)
		colorDistMagn   0.7375
		colorDistFreq   0.205955
		detailScale     473.083
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0530077
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.678506
		terraceProb     0.287499
		erosion         0
		montesMagn      0.539869
		montesFreq      2.61171
		montesSpiky     0.895854
		montesFraction  0.759108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.780944
		hillsFraction   0.782803
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224724
		craterFreq      0.231638
		craterDensity   0.727236
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446822
		volcanoTemp     1154.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.158, 0.000)
		colorShelf     (0.231, 0.200, 0.181, 0.000)
		colorBeach     (0.272, 0.234, 0.215, 0.000)
		colorDesert    (0.295, 0.251, 0.209, 0.000)
		colorLowland   (0.324, 0.268, 0.238, 0.000)
		colorUpland    (0.358, 0.325, 0.288, 0.000)
		colorRock      (0.387, 0.354, 0.311, 0.000)
		colorSnow      (0.422, 0.376, 0.328, 1.000)
		BumpHeight      15.5923
		BumpOffset      3.11847
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.11135
		Period          0.624654
		Eccentricity    0.0376394
		Inclination     -14.7735
		AscendingNode   168.064
		ArgOfPericenter -133.885
		MeanAnomaly     18.9919
	}
}

DwarfMoon	"Jakku System 7.D10"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            2.16386e-009
	Radius          18.488
	InertiaMoment   0.397542

	RotationPeriod  7354.62
	Obliquity       46.6258
	EqAscendNode    -61.4702

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.702 0.699)

	Surface
	{
		SurfStyle       0.964482
		OceanStyle      0.322086
		Randomize      (-0.062, -0.649, -0.908)
		colorDistMagn   0.772231
		colorDistFreq   0.0655852
		detailScale     504.846
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975661
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357326
		terraceProb     0.150448
		erosion         0
		montesMagn      0.628877
		montesFreq      3.72271
		montesSpiky     0.923226
		montesFraction  0.572616
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.764098
		hillsFraction   0.404429
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231368
		craterFreq      0.244286
		craterDensity   0.987137
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510264
		volcanoTemp     1467.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.246, 0.280, 0.050)
		colorShelf     (0.282, 0.288, 0.322, 0.040)
		colorBeach     (0.324, 0.330, 0.363, 0.030)
		colorDesert    (0.366, 0.372, 0.412, 0.020)
		colorLowland   (0.409, 0.414, 0.454, 0.030)
		colorUpland    (0.451, 0.456, 0.496, 0.050)
		colorRock      (0.493, 0.498, 0.552, 0.020)
		colorSnow      (0.493, 0.498, 0.552, 1.000)
		BumpHeight      16.6392
		BumpOffset      3.32784
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.111896
		Period          0.629259
		Eccentricity    0.420578
		Inclination     46.6258
		AscendingNode   -61.4702
		ArgOfPericenter 34.9804
		MeanAnomaly     -134.476
	}
}

DwarfMoon	"Jakku System 7.D11"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            3.02727e-009
	Radius          19.8629
	InertiaMoment   0.398861

	Obliquity       -70.2819
	EqAscendNode    -60.3774
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.602 0.597)

	Surface
	{
		SurfStyle       0.587739
		OceanStyle      0.0726574
		Randomize      (0.916, -0.052, 0.602)
		colorDistMagn   0.828181
		colorDistFreq   0.346749
		detailScale     542.388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579039
		terraceProb     0.164581
		erosion         0
		montesMagn      0.424061
		montesFreq      2.81599
		montesSpiky     0.868603
		montesFraction  0.268998
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.803629
		hillsFraction   0.552643
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23381
		craterFreq      0.188423
		craterDensity   0.878025
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421086
		volcanoTemp     1269.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.205, 0.167, 0.000)
		colorShelf     (0.242, 0.211, 0.191, 0.000)
		colorBeach     (0.284, 0.247, 0.227, 0.000)
		colorDesert    (0.308, 0.265, 0.221, 0.000)
		colorLowland   (0.339, 0.283, 0.251, 0.000)
		colorUpland    (0.375, 0.343, 0.304, 0.000)
		colorRock      (0.405, 0.373, 0.328, 0.000)
		colorSnow      (0.442, 0.397, 0.346, 1.000)
		BumpHeight      17.8766
		BumpOffset      3.57531
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.112391
		Period          0.633438
		Eccentricity    0.334051
		Inclination     -70.2819
		AscendingNode   -60.3774
		ArgOfPericenter 14.6474
		MeanAnomaly     82.2411
	}
}

DwarfMoon	"Jakku System 7.D12"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            4.20227e-009
	Radius          20.9464
	InertiaMoment   0.399797

	RotationPeriod  9289.95
	Obliquity       44.6949
	EqAscendNode    -22.1671

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.637 0.601)

	Surface
	{
		SurfStyle       0.194362
		OceanStyle      0.00830522
		Randomize      (-0.582, 0.611, -0.376)
		colorDistMagn   0.653446
		colorDistFreq   0.244829
		detailScale     571.976
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565037
		terraceProb     0.373973
		erosion         0
		montesMagn      0.437686
		montesFreq      2.72483
		montesSpiky     0.885214
		montesFraction  0.430991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.743741
		hillsFraction   0.68686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250152
		craterFreq      0.204465
		craterDensity   1.0042
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429491
		volcanoTemp     1372.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.255, 0.240, 0.000)
		colorShelf     (0.296, 0.271, 0.255, 0.000)
		colorBeach     (0.313, 0.287, 0.270, 0.000)
		colorDesert    (0.330, 0.303, 0.285, 0.000)
		colorLowland   (0.348, 0.318, 0.301, 0.000)
		colorUpland    (0.365, 0.334, 0.316, 0.000)
		colorRock      (0.382, 0.350, 0.331, 0.000)
		colorSnow      (0.400, 0.366, 0.346, 1.000)
		BumpHeight      18.8517
		BumpOffset      3.77035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.112679
		Period          0.635876
		Eccentricity    0.091952
		Inclination     44.6949
		AscendingNode   -22.1671
		ArgOfPericenter 58.1898
		MeanAnomaly     -139.937
	}
}

DwarfMoon	"Jakku System 7.D13"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            5.79594e-009
	Radius          27.265
	InertiaMoment   0.397789

	RotationPeriod  3730.65
	Obliquity       -6.19962
	EqAscendNode    43.2606

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.756 0.754)

	Surface
	{
		SurfStyle       0.130966
		OceanStyle      0.789814
		Randomize      (-0.321, 0.626, 0.953)
		colorDistMagn   0.303024
		colorDistFreq   0.399408
		detailScale     744.515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.199762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401023
		terraceProb     0.375471
		erosion         0
		montesMagn      0.513114
		montesFreq      3.47254
		montesSpiky     0.923198
		montesFraction  0.705184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.17038
		hillsFraction   0.511847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260538
		craterFreq      0.198633
		craterDensity   0.749188
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532085
		volcanoTemp     1120.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.302, 0.301, 0.000)
		colorShelf     (0.322, 0.321, 0.320, 0.000)
		colorBeach     (0.341, 0.340, 0.339, 0.000)
		colorDesert    (0.360, 0.359, 0.358, 0.000)
		colorLowland   (0.379, 0.378, 0.377, 0.000)
		colorUpland    (0.398, 0.397, 0.396, 0.000)
		colorRock      (0.417, 0.416, 0.415, 0.000)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.112976
		Period          0.638386
		Eccentricity    0.435273
		Inclination     -6.19962
		AscendingNode   43.2606
		ArgOfPericenter -65.2137
		MeanAnomaly     106.552
	}
}

DwarfMoon	"Jakku System 4.D14"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            7.95244e-009
	Radius          28.702
	InertiaMoment   0.399005

	RotationPeriod  16901.4
	Obliquity       33.7742
	EqAscendNode    171.309

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.758 0.755)

	Surface
	{
		SurfStyle       0.640712
		OceanStyle      0.97049
		Randomize      (-0.548, -0.897, 0.744)
		colorDistMagn   0.376192
		colorDistFreq   0.604014
		detailScale     783.756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0841739
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386634
		terraceProb     0.248256
		erosion         0
		montesMagn      0.29861
		montesFreq      2.93303
		montesSpiky     0.922334
		montesFraction  0.583638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.76193
		hillsFraction   0.651126
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221291
		craterFreq      0.210878
		craterDensity   0.934889
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538101
		volcanoTemp     1712.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.258, 0.211, 0.000)
		colorShelf     (0.304, 0.265, 0.242, 0.000)
		colorBeach     (0.357, 0.311, 0.287, 0.000)
		colorDesert    (0.388, 0.333, 0.279, 0.000)
		colorLowland   (0.426, 0.356, 0.317, 0.000)
		colorUpland    (0.472, 0.432, 0.385, 0.000)
		colorRock      (0.510, 0.470, 0.415, 0.000)
		colorSnow      (0.555, 0.500, 0.438, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.113484
		Period          0.642701
		Eccentricity    0.474914
		Inclination     33.7742
		AscendingNode   171.309
		ArgOfPericenter 157.323
		MeanAnomaly     157.749
	}
}

DwarfMoon	"Jakku System 4.D15"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.08665e-008
	Radius          30.5903
	InertiaMoment   0.399922

	Obliquity       1.27998
	EqAscendNode    -131.656
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.506 0.502)

	Surface
	{
		SurfStyle       0.19048
		OceanStyle      0.288053
		Randomize      (-0.137, -0.627, -0.096)
		colorDistMagn   0.223525
		colorDistFreq   0.591777
		detailScale     835.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0182919
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568983
		terraceProb     0.244983
		erosion         0
		montesMagn      0.530221
		montesFreq      2.87462
		montesSpiky     0.958864
		montesFraction  0.445296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.06834
		hillsFraction   0.657495
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244984
		craterFreq      0.255018
		craterDensity   0.91954
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490714
		volcanoTemp     1428.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.202, 0.201, 0.000)
		colorShelf     (0.216, 0.215, 0.214, 0.000)
		colorBeach     (0.229, 0.228, 0.226, 0.000)
		colorDesert    (0.242, 0.240, 0.239, 0.000)
		colorLowland   (0.254, 0.253, 0.251, 0.000)
		colorUpland    (0.267, 0.266, 0.264, 0.000)
		colorRock      (0.280, 0.278, 0.276, 0.000)
		colorSnow      (0.292, 0.291, 0.289, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.113983
		Period          0.646939
		Eccentricity    0.0675958
		Inclination     1.27998
		AscendingNode   -131.656
		ArgOfPericenter 100.653
		MeanAnomaly     -63.3967
	}
}

DwarfMoon	"Jakku System 4.D16"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.48022e-008
	Radius          32.2544
	InertiaMoment   0.398006

	Obliquity       0.987695
	EqAscendNode    -98.5365
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.775 0.771)

	Surface
	{
		SurfStyle       0.380587
		OceanStyle      0.599252
		Randomize      (-0.516, -0.274, 0.960)
		colorDistMagn   0.749817
		colorDistFreq   0.652498
		detailScale     880.761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.022494
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525513
		terraceProb     0.396722
		erosion         0
		montesMagn      0.521567
		montesFreq      2.61466
		montesSpiky     0.966636
		montesFraction  0.764988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.82677
		hillsFraction   0.601226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269893
		craterFreq      0.212008
		craterDensity   0.873838
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473488
		volcanoTemp     1619.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.308, 0.000)
		colorShelf     (0.330, 0.329, 0.328, 0.000)
		colorBeach     (0.349, 0.349, 0.347, 0.000)
		colorDesert    (0.369, 0.368, 0.366, 0.000)
		colorLowland   (0.388, 0.387, 0.386, 0.000)
		colorUpland    (0.408, 0.407, 0.405, 0.000)
		colorRock      (0.427, 0.426, 0.424, 0.000)
		colorSnow      (0.446, 0.445, 0.443, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.114193
		Period          0.648734
		Eccentricity    0.153486
		Inclination     0.987695
		AscendingNode   -98.5365
		ArgOfPericenter -17.7503
		MeanAnomaly     35.0837
	}
}

DwarfMoon	"Jakku System 4.D17"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.01196e-008
	Radius          41.7671
	InertiaMoment   0.399144

	RotationPeriod  9512.42
	Obliquity       57.5423
	EqAscendNode    81.9492

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.528 0.390)

	Surface
	{
		SurfStyle       0.767781
		OceanStyle      0.651831
		Randomize      (-0.789, 0.046, 0.404)
		colorDistMagn   0.723042
		colorDistFreq   0.28667
		detailScale     1140.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98211
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341265
		terraceProb     0.120251
		erosion         0
		montesMagn      0.54241
		montesFreq      3.2436
		montesSpiky     0.928203
		montesFraction  0.692184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.07023
		hillsFraction   0.437956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253465
		craterFreq      0.180308
		craterDensity   0.728362
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470304
		volcanoTemp     1366.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.180, 0.109, 0.000)
		colorShelf     (0.251, 0.185, 0.125, 0.000)
		colorBeach     (0.295, 0.217, 0.148, 0.000)
		colorDesert    (0.321, 0.232, 0.144, 0.000)
		colorLowland   (0.352, 0.248, 0.164, 0.000)
		colorUpland    (0.390, 0.301, 0.199, 0.000)
		colorRock      (0.421, 0.327, 0.214, 0.000)
		colorSnow      (0.459, 0.349, 0.226, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.114471
		Period          0.651104
		Eccentricity    0.470227
		Inclination     57.5423
		AscendingNode   81.9492
		ArgOfPericenter -171.329
		MeanAnomaly     25.0665
	}
}

DwarfMoon	"Jakku System 4.D18"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.73121e-008
	Radius          43.5738
	InertiaMoment   0.395296

	Obliquity       30.293
	EqAscendNode    -101.785
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.473 0.469 0.464)

	Surface
	{
		SurfStyle       0.960877
		OceanStyle      0.0789524
		Randomize      (0.006, -0.719, -0.280)
		colorDistMagn   0.367776
		colorDistFreq   1.34818
		detailScale     1189.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.603283
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567219
		terraceProb     0.121366
		erosion         0
		montesMagn      0.679707
		montesFreq      2.50035
		montesSpiky     0.773159
		montesFraction  0.504416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.94741
		hillsFraction   0.824466
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234351
		craterFreq      0.15295
		craterDensity   1.00594
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482843
		volcanoTemp     1267.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.164, 0.186, 0.050)
		colorShelf     (0.189, 0.192, 0.214, 0.040)
		colorBeach     (0.218, 0.221, 0.241, 0.030)
		colorDesert    (0.246, 0.249, 0.274, 0.020)
		colorLowland   (0.275, 0.277, 0.302, 0.030)
		colorUpland    (0.303, 0.305, 0.330, 0.050)
		colorRock      (0.331, 0.333, 0.367, 0.020)
		colorSnow      (0.331, 0.333, 0.367, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.114897
		Period          0.654743
		Eccentricity    0.0312445
		Inclination     30.293
		AscendingNode   -101.785
		ArgOfPericenter 115.932
		MeanAnomaly     -68.2463
	}
}

DwarfMoon	"Jakku System 4.D19"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            3.70606e-008
	Radius          46.3092
	InertiaMoment   0.398202

	Obliquity       87.0413
	EqAscendNode    -173.679
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.657 0.578)

	Surface
	{
		SurfStyle       0.886242
		OceanStyle      0.0692177
		Randomize      (-0.711, 0.852, 0.692)
		colorDistMagn   0.788319
		colorDistFreq   1.27323
		detailScale     1264.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.109947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487374
		terraceProb     0.196978
		erosion         0
		montesMagn      0.433856
		montesFreq      2.61589
		montesSpiky     0.984709
		montesFraction  0.520653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.81202
		hillsFraction   0.592754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206248
		craterFreq      0.223883
		craterDensity   0.907748
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439728
		volcanoTemp     1245.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.230, 0.231, 0.050)
		colorShelf     (0.303, 0.269, 0.266, 0.040)
		colorBeach     (0.348, 0.309, 0.301, 0.030)
		colorDesert    (0.393, 0.348, 0.341, 0.020)
		colorLowland   (0.439, 0.387, 0.376, 0.030)
		colorUpland    (0.484, 0.427, 0.411, 0.050)
		colorRock      (0.529, 0.466, 0.457, 0.020)
		colorSnow      (0.529, 0.466, 0.457, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.115409
		Period          0.659121
		Eccentricity    0.0353202
		Inclination     87.0413
		AscendingNode   -173.679
		ArgOfPericenter -162.007
		MeanAnomaly     -115.427
	}
}

DwarfMoon	"Jakku System 4.D20"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            5.0311e-008
	Radius          48.9583
	InertiaMoment   0.399279

	RotationPeriod  11649.6
	Obliquity       -15.321
	EqAscendNode    119.591

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.796 0.794 0.791)

	Surface
	{
		SurfStyle       0.613201
		OceanStyle      0.250726
		Randomize      (-0.538, 0.431, 0.570)
		colorDistMagn   0.902294
		colorDistFreq   1.75941
		detailScale     1336.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.2635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.265658
		terraceProb     0.470221
		erosion         0
		montesMagn      0.373499
		montesFreq      3.54006
		montesSpiky     0.97076
		montesFraction  0.671425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.34295
		hillsFraction   0.620103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226745
		craterFreq      0.241348
		craterDensity   0.846424
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558914
		volcanoTemp     1841.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.270, 0.221, 0.000)
		colorShelf     (0.318, 0.278, 0.253, 0.000)
		colorBeach     (0.374, 0.326, 0.301, 0.000)
		colorDesert    (0.406, 0.349, 0.293, 0.000)
		colorLowland   (0.446, 0.373, 0.332, 0.000)
		colorUpland    (0.493, 0.453, 0.403, 0.000)
		colorRock      (0.533, 0.492, 0.435, 0.000)
		colorSnow      (0.581, 0.524, 0.459, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.116035
		Period          0.664491
		Eccentricity    0.442096
		Inclination     -15.321
		AscendingNode   119.591
		ArgOfPericenter -44.4347
		MeanAnomaly     -159.912
	}
}

DwarfMoon	"Jakku System 4.D21"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            6.83888e-008
	Radius          63.7018
	InertiaMoment   0.396357

	Obliquity       76.1004
	EqAscendNode    -152.211
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.496 0.435)

	Surface
	{
		SurfStyle       0.195898
		OceanStyle      0.939198
		Randomize      (-0.672, 0.959, -0.269)
		colorDistMagn   0.0505111
		colorDistFreq   3.01619
		detailScale     1739.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.453361
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46788
		terraceProb     0.31517
		erosion         0
		montesMagn      0.554394
		montesFreq      2.9605
		montesSpiky     0.845415
		montesFraction  0.662957
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.8936
		hillsFraction   0.72352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235327
		craterFreq      0.225353
		craterDensity   0.84403
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463718
		volcanoTemp     1256.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.198, 0.174, 0.000)
		colorShelf     (0.275, 0.211, 0.185, 0.000)
		colorBeach     (0.291, 0.223, 0.196, 0.000)
		colorDesert    (0.307, 0.236, 0.207, 0.000)
		colorLowland   (0.323, 0.248, 0.218, 0.000)
		colorUpland    (0.339, 0.260, 0.229, 0.000)
		colorRock      (0.355, 0.273, 0.240, 0.000)
		colorSnow      (0.372, 0.285, 0.250, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.116468
		Period          0.668214
		Eccentricity    0.310352
		Inclination     76.1004
		AscendingNode   -152.211
		ArgOfPericenter -149.957
		MeanAnomaly     134.868
	}
}

DwarfMoon	"Jakku System 4.D22"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            9.31682e-008
	Radius          66.0209
	InertiaMoment   0.398382

	Obliquity       86.0801
	EqAscendNode    -24.454
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.407 0.404 0.403)

	Surface
	{
		SurfStyle       0.420122
		OceanStyle      0.428461
		Randomize      (0.622, 0.247, -0.677)
		colorDistMagn   0.518948
		colorDistFreq   2.01517
		detailScale     1802.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.433058
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36379
		terraceProb     0.575268
		erosion         0
		montesMagn      0.612196
		montesFreq      3.57826
		montesSpiky     0.894448
		montesFraction  0.231008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.9193
		hillsFraction   0.695709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218654
		craterFreq      0.266194
		craterDensity   0.87155
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544928
		volcanoTemp     1484.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.162, 0.161, 0.000)
		colorShelf     (0.173, 0.172, 0.171, 0.000)
		colorBeach     (0.183, 0.182, 0.181, 0.000)
		colorDesert    (0.193, 0.192, 0.191, 0.000)
		colorLowland   (0.204, 0.202, 0.201, 0.000)
		colorUpland    (0.214, 0.212, 0.211, 0.000)
		colorRock      (0.224, 0.222, 0.221, 0.000)
		colorSnow      (0.234, 0.232, 0.231, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.116995
		Period          0.672751
		Eccentricity    0.137956
		Inclination     86.0801
		AscendingNode   -24.454
		ArgOfPericenter -93.8017
		MeanAnomaly     -143.493
	}
}

DwarfMoon	"Jakku System 4.D23"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.27327e-007
	Radius          70.272
	InertiaMoment   0.399411

	RotationPeriod  11864.9
	Obliquity       0.454316
	EqAscendNode    17.1225

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.855 0.774 0.742)

	Surface
	{
		SurfStyle       0.0258157
		OceanStyle      0.164793
		Randomize      (-0.372, 0.213, -0.573)
		colorDistMagn   0.247489
		colorDistFreq   2.76874
		detailScale     1918.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0156816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521911
		terraceProb     0.324973
		erosion         0
		montesMagn      0.464698
		montesFreq      2.16664
		montesSpiky     0.945033
		montesFraction  0.745268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.3739
		hillsFraction   0.4812
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220624
		craterFreq      0.148062
		craterDensity   0.947397
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454432
		volcanoTemp     1337.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.342, 0.309, 0.297, 0.000)
		colorShelf     (0.364, 0.329, 0.315, 0.000)
		colorBeach     (0.385, 0.348, 0.334, 0.000)
		colorDesert    (0.406, 0.367, 0.352, 0.000)
		colorLowland   (0.428, 0.387, 0.371, 0.000)
		colorUpland    (0.449, 0.406, 0.390, 0.000)
		colorRock      (0.470, 0.426, 0.408, 0.000)
		colorSnow      (0.492, 0.445, 0.427, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.11746
		Period          0.676773
		Eccentricity    0.254043
		Inclination     0.454316
		AscendingNode   17.1225
		ArgOfPericenter -156.32
		MeanAnomaly     3.83771
	}
}

DwarfMoon	"Jakku System 4.D24"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.74734e-007
	Radius          74.7477
	InertiaMoment   0.396876

	Obliquity       -29.9351
	EqAscendNode    -105.543
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.747 0.685)

	Surface
	{
		SurfStyle       0.612958
		OceanStyle      0.449115
		Randomize      (-0.424, 0.712, -0.237)
		colorDistMagn   0.36729
		colorDistFreq   3.17781
		detailScale     2041.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.575635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.27507
		terraceProb     0.431794
		erosion         0
		montesMagn      0.501747
		montesFreq      1.7355
		montesSpiky     0.839611
		montesFraction  0.671665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.5968
		hillsFraction   0.630879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245051
		craterFreq      0.189394
		craterDensity   0.930119
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536399
		volcanoTemp     1360.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.254, 0.192, 0.000)
		colorShelf     (0.318, 0.262, 0.219, 0.000)
		colorBeach     (0.373, 0.306, 0.260, 0.000)
		colorDesert    (0.405, 0.329, 0.253, 0.000)
		colorLowland   (0.445, 0.351, 0.288, 0.000)
		colorUpland    (0.492, 0.426, 0.349, 0.000)
		colorRock      (0.532, 0.463, 0.377, 0.000)
		colorSnow      (0.580, 0.493, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.117939
		Period          0.680913
		Eccentricity    0.0874044
		Inclination     -29.9351
		AscendingNode   -105.543
		ArgOfPericenter 90.9312
		MeanAnomaly     -96.8309
	}
}

DwarfMoon	"Jakku System 4.D25"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.41056e-007
	Radius          98.7912
	InertiaMoment   0.398549

	RotationPeriod  18040.5
	Obliquity       36.1292
	EqAscendNode    -42.1975

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.588 0.584 0.581)

	Surface
	{
		SurfStyle       0.169325
		OceanStyle      0.528098
		Randomize      (-0.637, -0.298, -0.464)
		colorDistMagn   0.771176
		colorDistFreq   6.01476
		detailScale     2697.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.918758
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.26533
		terraceProb     0.401301
		erosion         0
		montesMagn      0.466624
		montesFreq      3.96499
		montesSpiky     0.895144
		montesFraction  0.502934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.5095
		hillsFraction   0.758293
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253342
		craterFreq      0.332767
		craterDensity   0.967648
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451754
		volcanoTemp     1389.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.233, 0.232, 0.000)
		colorShelf     (0.250, 0.248, 0.247, 0.000)
		colorBeach     (0.265, 0.263, 0.261, 0.000)
		colorDesert    (0.279, 0.277, 0.276, 0.000)
		colorLowland   (0.294, 0.292, 0.291, 0.000)
		colorUpland    (0.309, 0.306, 0.305, 0.000)
		colorRock      (0.324, 0.321, 0.320, 0.000)
		colorSnow      (0.338, 0.336, 0.334, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.118528
		Period          0.686018
		Eccentricity    0.192669
		Inclination     36.1292
		AscendingNode   -42.1975
		ArgOfPericenter 124.992
		MeanAnomaly     -136.014
	}
}

DwarfMoon	"Jakku System 4.D26"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            3.34713e-007
	Radius          101.811
	InertiaMoment   0.39954

	RotationPeriod  9073.16
	Obliquity       80.9211
	EqAscendNode    128.019

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.653 0.651)

	Surface
	{
		SurfStyle       0.573105
		OceanStyle      0.829537
		Randomize      (0.535, -0.134, -0.277)
		colorDistMagn   0.075576
		colorDistFreq   3.98766
		detailScale     2780.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596733
		terraceProb     0.504251
		erosion         0
		montesMagn      0.54436
		montesFreq      2.93355
		montesSpiky     0.994922
		montesFraction  0.696089
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.3129
		hillsFraction   0.747194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240544
		craterFreq      0.288896
		craterDensity   0.937399
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493289
		volcanoTemp     1282.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.222, 0.182, 0.000)
		colorShelf     (0.263, 0.228, 0.208, 0.000)
		colorBeach     (0.309, 0.268, 0.247, 0.000)
		colorDesert    (0.335, 0.287, 0.241, 0.000)
		colorLowland   (0.368, 0.307, 0.273, 0.000)
		colorUpland    (0.407, 0.372, 0.332, 0.000)
		colorRock      (0.440, 0.405, 0.358, 0.000)
		colorSnow      (0.479, 0.431, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.118991
		Period          0.690042
		Eccentricity    0.384834
		Inclination     80.9211
		AscendingNode   128.019
		ArgOfPericenter -75.9723
		MeanAnomaly     121.848
	}
}

DwarfMoon	"Jakku System 4.D27"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            4.68427e-007
	Radius          109.092
	InertiaMoment   0.397244

	RotationPeriod  10127.6
	Obliquity       -54.2867
	EqAscendNode    -65.9172

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.709 0.708)

	Surface
	{
		SurfStyle       0.184469
		OceanStyle      0.00527752
		Randomize      (-0.491, 0.495, 0.998)
		colorDistMagn   0.713531
		colorDistFreq   6.3715
		detailScale     2978.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430666
		terraceProb     0.41942
		erosion         0
		montesMagn      0.506959
		montesFreq      2.37243
		montesSpiky     0.999407
		montesFraction  0.728212
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.5652
		hillsFraction   0.516623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23634
		craterFreq      0.483353
		craterDensity   1.0194
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58721
		volcanoTemp     1259.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.284, 0.283, 0.000)
		colorShelf     (0.302, 0.301, 0.301, 0.000)
		colorBeach     (0.320, 0.319, 0.319, 0.000)
		colorDesert    (0.338, 0.337, 0.336, 0.000)
		colorLowland   (0.355, 0.355, 0.354, 0.000)
		colorUpland    (0.373, 0.372, 0.372, 0.000)
		colorRock      (0.391, 0.390, 0.389, 0.000)
		colorSnow      (0.409, 0.408, 0.407, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.119355
		Period          0.693214
		Eccentricity    0.240433
		Inclination     -54.2867
		AscendingNode   -65.9172
		ArgOfPericenter -110.108
		MeanAnomaly     108.363
	}
}

DwarfMoon	"Jakku System 4.D28"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            6.61786e-007
	Radius          117.365
	InertiaMoment   0.398708

	RotationPeriod  30589.2
	Obliquity       20.8882
	EqAscendNode    -3.17066

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.407 0.404)

	Surface
	{
		SurfStyle       0.851929
		OceanStyle      0.0631544
		Randomize      (0.517, -0.824, -0.837)
		colorDistMagn   0.852847
		colorDistFreq   9.69399
		detailScale     3204.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.666008
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456422
		terraceProb     0.199472
		erosion         0
		montesMagn      0.477934
		montesFreq      2.26076
		montesSpiky     0.972821
		montesFraction  0.734146
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.5608
		hillsFraction   0.577366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264349
		craterFreq      0.423018
		craterDensity   0.77769
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443447
		volcanoTemp     1529.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.142, 0.162, 0.050)
		colorShelf     (0.163, 0.167, 0.186, 0.040)
		colorBeach     (0.188, 0.191, 0.210, 0.030)
		colorDesert    (0.213, 0.216, 0.239, 0.020)
		colorLowland   (0.237, 0.240, 0.263, 0.030)
		colorUpland    (0.262, 0.264, 0.287, 0.050)
		colorRock      (0.286, 0.289, 0.319, 0.020)
		colorSnow      (0.286, 0.289, 0.319, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.119895
		Period          0.69792
		Eccentricity    0.402165
		Inclination     20.8882
		AscendingNode   -3.17066
		ArgOfPericenter 12.6171
		MeanAnomaly     49.297
	}
}

DwarfMoon	"Jakku System 4.D29"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            9.45616e-007
	Radius          160.419
	InertiaMoment   0.399668

	Obliquity       -43.5559
	EqAscendNode    7.70628
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.826 0.768 0.738)

	Surface
	{
		SurfStyle       0.309395
		OceanStyle      0.505532
		Randomize      (-0.407, 0.519, 0.505)
		colorDistMagn   0.528417
		colorDistFreq   18.1474
		detailScale     4380.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570897
		terraceProb     0.517258
		erosion         0
		montesMagn      0.581961
		montesFreq      2.37215
		montesSpiky     0.967107
		montesFraction  0.67728
		dunesFraction   0
		hillsMagn       0
		hillsFreq       51.3366
		hillsFraction   0.654141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245461
		craterFreq      0.89813
		craterDensity   0.736978
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46362
		volcanoTemp     1138.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.331, 0.307, 0.295, 0.000)
		colorShelf     (0.351, 0.327, 0.313, 0.000)
		colorBeach     (0.372, 0.346, 0.332, 0.000)
		colorDesert    (0.392, 0.365, 0.350, 0.000)
		colorLowland   (0.413, 0.384, 0.369, 0.000)
		colorUpland    (0.434, 0.403, 0.387, 0.000)
		colorRock      (0.454, 0.423, 0.406, 0.000)
		colorSnow      (0.475, 0.442, 0.424, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.120177
		Period          0.700383
		Eccentricity    0.102438
		Inclination     -43.5559
		AscendingNode   7.70628
		ArgOfPericenter -95.3164
		MeanAnomaly     -141.614
	}
}

DwarfMoon	"Jakku System 4.D30"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.36964e-006
	Radius          164.044
	InertiaMoment   0.397536

	RotationPeriod  12321.6
	Obliquity       -59.2854
	EqAscendNode    -41.1449

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.647 0.643)

	Surface
	{
		SurfStyle       0.181517
		OceanStyle      0.133764
		Randomize      (0.461, -0.629, 0.835)
		colorDistMagn   0.51074
		colorDistFreq   8.57385
		detailScale     4479.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955276
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516339
		terraceProb     0.319493
		erosion         0
		montesMagn      0.600369
		montesFreq      4.66135
		montesSpiky     0.89802
		montesFraction  0.396502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       70.449
		hillsFraction   0.6414
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25387
		craterFreq      1.00016
		craterDensity   0.893696
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555196
		volcanoTemp     1796.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.259, 0.257, 0.000)
		colorShelf     (0.277, 0.275, 0.273, 0.000)
		colorBeach     (0.293, 0.291, 0.289, 0.000)
		colorDesert    (0.310, 0.307, 0.305, 0.000)
		colorLowland   (0.326, 0.324, 0.321, 0.000)
		colorUpland    (0.342, 0.340, 0.338, 0.000)
		colorRock      (0.358, 0.356, 0.354, 0.000)
		colorSnow      (0.375, 0.372, 0.370, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.120455
		Period          0.70282
		Eccentricity    0.303659
		Inclination     -59.2854
		AscendingNode   -41.1449
		ArgOfPericenter 85.2822
		MeanAnomaly     177.398
	}
}

DwarfMoon	"Jakku System 4.D31"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.01643e-006
	Radius          178.465
	InertiaMoment   0.398858

	RotationPeriod  2266.4
	Obliquity       -19.9
	EqAscendNode    26.8519

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.410 0.408 0.406)

	Surface
	{
		SurfStyle       0.54262
		OceanStyle      0.870568
		Randomize      (-0.850, 0.779, 0.457)
		colorDistMagn   0.572682
		colorDistFreq   10.0051
		detailScale     4873.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.624944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.678396
		terraceProb     0.221818
		erosion         0
		montesMagn      0.430381
		montesFreq      2.77944
		montesSpiky     0.819721
		montesFraction  0.515051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       82.6075
		hillsFraction   0.528257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223855
		craterFreq      0.77772
		craterDensity   1.02864
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514515
		volcanoTemp     1401.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.139, 0.114, 0.000)
		colorShelf     (0.164, 0.143, 0.130, 0.000)
		colorBeach     (0.193, 0.167, 0.154, 0.000)
		colorDesert    (0.209, 0.180, 0.150, 0.000)
		colorLowland   (0.230, 0.192, 0.171, 0.000)
		colorUpland    (0.254, 0.233, 0.207, 0.000)
		colorRock      (0.275, 0.253, 0.223, 0.000)
		colorSnow      (0.299, 0.270, 0.236, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.120949
		Period          0.70715
		Eccentricity    0.313751
		Inclination     -19.9098
		AscendingNode   26.8498
		ArgOfPericenter -8.42387
		MeanAnomaly     -11.7195
	}
}

DwarfMoon	"Jakku System 4.D32"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            3.02786e-006
	Radius          196.152
	InertiaMoment   0.399794

	RotationPeriod  1173.65
	Obliquity       6.11655
	EqAscendNode    140.105

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.460 0.406)

	Surface
	{
		SurfStyle       0.0823699
		OceanStyle      0.0629758
		Randomize      (0.855, 0.351, -0.167)
		colorDistMagn   0.92569
		colorDistFreq   20.7118
		detailScale     5356.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0748537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.685412
		terraceProb     0.27126
		erosion         0
		montesMagn      0.523871
		montesFreq      2.90667
		montesSpiky     0.92428
		montesFraction  0.313075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       78.7469
		hillsFraction   0.603589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244892
		craterFreq      1.49144
		craterDensity   0.815296
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500009
		volcanoTemp     1746.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.184, 0.163, 0.000)
		colorShelf     (0.251, 0.195, 0.173, 0.000)
		colorBeach     (0.266, 0.207, 0.183, 0.000)
		colorDesert    (0.280, 0.218, 0.193, 0.000)
		colorLowland   (0.295, 0.230, 0.203, 0.000)
		colorUpland    (0.310, 0.241, 0.213, 0.000)
		colorRock      (0.325, 0.253, 0.223, 0.000)
		colorSnow      (0.339, 0.264, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

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
		Period          0.711524
		Eccentricity    0.278526
		Inclination     6.45999
		AscendingNode   140.128
		ArgOfPericenter -82.8906
		MeanAnomaly     35.2487
	}
}

Moon	"Jakku System 4.4"
{
	ParentBody     "Jakku System 4"
	Class	       "IceWorld"

	Mass            4.6577e-006
	Radius          296.086
	InertiaMoment   0.397784

	RotationPeriod  2970.44
	Obliquity       -33.6286
	EqAscendNode    -92.9128

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.458 0.445 0.440)

	Surface
	{
		SurfStyle       0.833595
		OceanStyle      0.612742
		Randomize      (0.234, 0.675, 0.320)
		colorDistMagn   0.0578264
		colorDistFreq   31.8613
		detailScale     761.551
		colorConversion true
		drivenDarkening 0.0593529
		seaLevel        0.255331
		snowLevel       2
		tropicLatitude  0.70545
		icecapLatitude  1
		icecapHeight    0.255331
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.50313
		venusFreq       0.688594
		venusMagn       0
		mareFreq        0
		mareDensity     8.52773e-007
		terraceProb     0.11961
		erosion         0
		montesMagn      0.0767868
		montesFreq      18.4502
		montesSpiky     0.938795
		montesFraction  0.291262
		dunesMagn       0.0224773
		dunesFreq       395.497
		dunesFraction   0.127637
		hillsMagn       0.138954
		hillsFreq       33.3318
		hillsFraction   0.275207
		hills2Fraction  0.047808
		riversMagn      60.5463
		riversFreq      2.6088
		riversSin       7.2959
		riversOctaves   0
		canyonsMagn     0.694077
		canyonsFreq     0.131588
		canyonFraction  0
		cracksMagn      0.0275914
		cracksFreq      0.0814079
		cracksOctaves   0
		craterMagn      0.89792
		craterFreq      0.831806
		craterDensity   0.802355
		craterOctaves   8
		craterRayedFactor 0.143242
		volcanoMagn     0.172395
		volcanoFreq     0.788949
		volcanoDensity  0.190002
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.398822
		volcanoRadius   0.173054
		volcanoTemp     1711.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.458, 0.333, 0.253, 0.000)
		colorShelf     (0.435, 0.317, 0.240, 0.000)
		colorBeach     (0.229, 0.167, 0.126, 0.000)
		colorDesert    (0.389, 0.284, 0.215, 0.000)
		colorLowland   (0.371, 0.293, 0.240, 0.000)
		colorUpland    (0.426, 0.310, 0.235, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.371, 0.293, 0.240, 0.000)
		colorUpPlants  (0.426, 0.310, 0.235, 0.000)
		BumpHeight      14.8043
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
		SemiMajorAxis   0.122018
		Period          0.716543
		Eccentricity    0.344189
		Inclination     -33.6447
		AscendingNode   -92.9128
		ArgOfPericenter -159.114
		MeanAnomaly     67.0194
	}
}

DwarfMoon	"Jakku System 4.D33"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.29978e-011
	Radius          3.50085
	InertiaMoment   0.399002

	Obliquity       -85.3403
	EqAscendNode    126.957
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.544 0.501 0.435)

	Surface
	{
		SurfStyle       0.279463
		OceanStyle      0.895603
		Randomize      (0.259, 0.311, 0.340)
		colorDistMagn   0.471062
		colorDistFreq   0.0056015
		detailScale     95.5965
		colorConversion true
		snowLevel       2
		tropicLatitude  0.797095
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404263
		terraceProb     0.171789
		erosion         0
		montesMagn      0.495227
		montesFreq      3.46049
		montesSpiky     0.987513
		montesFraction  0.564304
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0356812
		hillsFraction   0.76386
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239161
		craterFreq      0.207145
		craterDensity   0.883763
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.356596
		volcanoTemp     1723.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.200, 0.174, 0.000)
		colorShelf     (0.231, 0.213, 0.185, 0.000)
		colorBeach     (0.245, 0.225, 0.196, 0.000)
		colorDesert    (0.258, 0.238, 0.207, 0.000)
		colorLowland   (0.272, 0.250, 0.218, 0.000)
		colorUpland    (0.286, 0.263, 0.228, 0.000)
		colorRock      (0.299, 0.275, 0.239, 0.000)
		colorSnow      (0.313, 0.288, 0.250, 1.000)
		BumpHeight      3.15076
		BumpOffset      0.630153
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.122449
		Period          0.720342
		Eccentricity    0.0379771
		Inclination     -85.3403
		AscendingNode   126.957
		ArgOfPericenter -55.6663
		MeanAnomaly     -24.4434
	}
}

DwarfMoon	"Jakku System 4.D34"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.62801e-011
	Radius          4.22387
	InertiaMoment   0.399919

	RotationPeriod  12663.2
	Obliquity       77.4625
	EqAscendNode    -140.718

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.655 0.520)

	Surface
	{
		SurfStyle       0.042945
		OceanStyle      0.322835
		Randomize      (0.966, -0.560, 0.305)
		colorDistMagn   0.409929
		colorDistFreq   0.00780503
		detailScale     115.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.619889
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650309
		terraceProb     0.361398
		erosion         0
		montesMagn      0.420697
		montesFreq      2.27918
		montesSpiky     0.929975
		montesFraction  0.389699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0300315
		hillsFraction   0.803512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219998
		craterFreq      0.190445
		craterDensity   0.97251
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460303
		volcanoTemp     1196.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.262, 0.208, 0.000)
		colorShelf     (0.308, 0.279, 0.221, 0.000)
		colorBeach     (0.326, 0.295, 0.234, 0.000)
		colorDesert    (0.345, 0.311, 0.247, 0.000)
		colorLowland   (0.363, 0.328, 0.260, 0.000)
		colorUpland    (0.381, 0.344, 0.273, 0.000)
		colorRock      (0.399, 0.360, 0.286, 0.000)
		colorSnow      (0.417, 0.377, 0.299, 1.000)
		BumpHeight      3.80148
		BumpOffset      0.760296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.122672
		Period          0.722308
		Eccentricity    0.321242
		Inclination     77.4625
		AscendingNode   -140.718
		ArgOfPericenter 139.607
		MeanAnomaly     20.6684
	}
}

DwarfMoon	"Jakku System 4.D35"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            4.84362e-011
	Radius          4.97366
	InertiaMoment   0.398002

	Obliquity       76.9984
	EqAscendNode    -124.082
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.730 0.727 0.725)

	Surface
	{
		SurfStyle       0.813749
		OceanStyle      0.146897
		Randomize      (0.934, 0.986, 0.590)
		colorDistMagn   0.607579
		colorDistFreq   0.00898041
		detailScale     135.814
		colorConversion true
		snowLevel       2
		tropicLatitude  0.812736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626162
		terraceProb     0.461891
		erosion         0
		montesMagn      0.469773
		montesFreq      3.23377
		montesSpiky     0.976643
		montesFraction  0.767614
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0639508
		hillsFraction   0.59467
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251078
		craterFreq      0.228116
		craterDensity   0.904982
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533682
		volcanoTemp     1787.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.247, 0.203, 0.000)
		colorShelf     (0.292, 0.254, 0.232, 0.000)
		colorBeach     (0.343, 0.298, 0.276, 0.000)
		colorDesert    (0.372, 0.320, 0.268, 0.000)
		colorLowland   (0.409, 0.342, 0.305, 0.000)
		colorUpland    (0.452, 0.414, 0.370, 0.000)
		colorRock      (0.489, 0.451, 0.399, 0.000)
		colorSnow      (0.533, 0.480, 0.421, 1.000)
		BumpHeight      4.47629
		BumpOffset      0.895258
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.122938
		Period          0.724662
		Eccentricity    0.251421
		Inclination     76.9984
		AscendingNode   -124.082
		ArgOfPericenter -150.762
		MeanAnomaly     49.7185
	}
}

DwarfMoon	"Jakku System 4.D36"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            8.361e-011
	Radius          5.56816
	InertiaMoment   0.399141

	RotationPeriod  19186
	Obliquity       -11.1684
	EqAscendNode    139.002

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.464 0.458 0.451)

	Surface
	{
		SurfStyle       0.186863
		OceanStyle      0.0328746
		Randomize      (-0.245, 0.950, -0.174)
		colorDistMagn   0.965034
		colorDistFreq   0.0198796
		detailScale     152.048
		colorConversion true
		snowLevel       2
		tropicLatitude  0.135348
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534407
		terraceProb     0.591318
		erosion         0
		montesMagn      0.336919
		montesFreq      2.4269
		montesSpiky     0.905335
		montesFraction  0.2739
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.112887
		hillsFraction   0.786792
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271719
		craterFreq      0.158263
		craterDensity   0.867829
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496693
		volcanoTemp     1556.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.183, 0.181, 0.000)
		colorShelf     (0.197, 0.195, 0.192, 0.000)
		colorBeach     (0.209, 0.206, 0.203, 0.000)
		colorDesert    (0.221, 0.217, 0.214, 0.000)
		colorLowland   (0.232, 0.229, 0.226, 0.000)
		colorUpland    (0.244, 0.240, 0.237, 0.000)
		colorRock      (0.255, 0.252, 0.248, 0.000)
		colorSnow      (0.267, 0.263, 0.260, 1.000)
		BumpHeight      5.01135
		BumpOffset      1.00227
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.123493
		Period          0.729575
		Eccentricity    0.235546
		Inclination     -11.1684
		AscendingNode   139.002
		ArgOfPericenter 18.3369
		MeanAnomaly     -57.2136
	}
}

DwarfMoon	"Jakku System 4.D37"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.37459e-010
	Radius          7.75219
	InertiaMoment   0.395251

	Obliquity       64.3726
	EqAscendNode    127.412
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.676 0.671)

	Surface
	{
		SurfStyle       0.155746
		OceanStyle      0.127951
		Randomize      (0.765, -0.289, 0.270)
		colorDistMagn   0.690657
		colorDistFreq   0.0264204
		detailScale     211.687
		colorConversion true
		snowLevel       2
		tropicLatitude  0.732318
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329112
		terraceProb     0.368829
		erosion         0
		montesMagn      0.489032
		montesFreq      3.11157
		montesSpiky     0.974479
		montesFraction  0.576802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.122415
		hillsFraction   0.508409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24269
		craterFreq      0.254627
		craterDensity   0.97443
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472359
		volcanoTemp     1691.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.268, 0.000)
		colorShelf     (0.288, 0.287, 0.285, 0.000)
		colorBeach     (0.305, 0.304, 0.302, 0.000)
		colorDesert    (0.322, 0.321, 0.319, 0.000)
		colorLowland   (0.339, 0.338, 0.335, 0.000)
		colorUpland    (0.356, 0.355, 0.352, 0.000)
		colorRock      (0.373, 0.372, 0.369, 0.000)
		colorSnow      (0.390, 0.389, 0.386, 1.000)
		BumpHeight      6.97697
		BumpOffset      1.39539
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.123907
		Period          0.733246
		Eccentricity    0.168921
		Inclination     64.3726
		AscendingNode   127.412
		ArgOfPericenter 124.447
		MeanAnomaly     -110.612
	}
}

DwarfMoon	"Jakku System 4.D38"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.17654e-010
	Radius          8.59571
	InertiaMoment   0.398198

	Obliquity       -7.06392
	EqAscendNode    143.105
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.580 0.576)

	Surface
	{
		SurfStyle       0.288133
		OceanStyle      0.901256
		Randomize      (-0.955, 0.347, 0.502)
		colorDistMagn   0.704261
		colorDistFreq   0.0576894
		detailScale     234.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0777702
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.678909
		terraceProb     0.397314
		erosion         0
		montesMagn      0.457167
		montesFreq      2.97167
		montesSpiky     0.879017
		montesFraction  0.681405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.185336
		hillsFraction   0.736747
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223367
		craterFreq      0.197909
		craterDensity   0.996094
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481583
		volcanoTemp     1678.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.231, 0.000)
		colorShelf     (0.249, 0.246, 0.245, 0.000)
		colorBeach     (0.263, 0.261, 0.259, 0.000)
		colorDesert    (0.278, 0.275, 0.274, 0.000)
		colorLowland   (0.293, 0.290, 0.288, 0.000)
		colorUpland    (0.307, 0.304, 0.303, 0.000)
		colorRock      (0.322, 0.319, 0.317, 0.000)
		colorSnow      (0.337, 0.333, 0.331, 1.000)
		BumpHeight      7.73613
		BumpOffset      1.54723
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.124177
		Period          0.735648
		Eccentricity    0.074483
		Inclination     -7.06392
		AscendingNode   143.105
		ArgOfPericenter -14.1182
		MeanAnomaly     161.759
	}
}

DwarfMoon	"Jakku System 4.D39"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            3.34539e-010
	Radius          9.5291
	InertiaMoment   0.399276

	Obliquity       81.8834
	EqAscendNode    127.914
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.740 0.736 0.733)

	Surface
	{
		SurfStyle       0.577747
		OceanStyle      0.767395
		Randomize      (-0.063, -0.518, 0.900)
		colorDistMagn   0.349503
		colorDistFreq   0.053105
		detailScale     260.208
		colorConversion true
		snowLevel       2
		tropicLatitude  0.782892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573725
		terraceProb     0.539774
		erosion         0
		montesMagn      0.378094
		montesFreq      3.60215
		montesSpiky     0.958301
		montesFraction  0.400306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.209471
		hillsFraction   0.901963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218499
		craterFreq      0.233743
		craterDensity   0.984846
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517149
		volcanoTemp     1068.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.250, 0.205, 0.000)
		colorShelf     (0.296, 0.258, 0.234, 0.000)
		colorBeach     (0.348, 0.302, 0.278, 0.000)
		colorDesert    (0.377, 0.324, 0.271, 0.000)
		colorLowland   (0.414, 0.346, 0.308, 0.000)
		colorUpland    (0.459, 0.420, 0.374, 0.000)
		colorRock      (0.496, 0.457, 0.403, 0.000)
		colorSnow      (0.540, 0.486, 0.425, 1.000)
		BumpHeight      8.57619
		BumpOffset      1.71524
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.124736
		Period          0.740614
		Eccentricity    0.369269
		Inclination     81.8834
		AscendingNode   127.914
		ArgOfPericenter 67.954
		MeanAnomaly     -119.577
	}
}

DwarfMoon	"Jakku System 4.D40"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            5.02005e-010
	Radius          10.3093
	InertiaMoment   0.396342

	RotationPeriod  26152.7
	Obliquity       -67.1984
	EqAscendNode    -132.747

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.678 0.677 0.674)

	Surface
	{
		SurfStyle       0.67314
		OceanStyle      0.616027
		Randomize      (-0.668, -0.579, 0.871)
		colorDistMagn   0.663592
		colorDistFreq   0.0688936
		detailScale     281.512
		colorConversion true
		snowLevel       2
		tropicLatitude  0.686623
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50485
		terraceProb     0.192019
		erosion         0
		montesMagn      0.585874
		montesFreq      2.25807
		montesSpiky     0.997893
		montesFraction  0.494047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.196521
		hillsFraction   0.682635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204171
		craterFreq      0.221462
		craterDensity   0.975163
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487146
		volcanoTemp     1674.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.230, 0.189, 0.000)
		colorShelf     (0.271, 0.237, 0.216, 0.000)
		colorBeach     (0.319, 0.277, 0.256, 0.000)
		colorDesert    (0.346, 0.298, 0.249, 0.000)
		colorLowland   (0.380, 0.318, 0.283, 0.000)
		colorUpland    (0.421, 0.386, 0.344, 0.000)
		colorRock      (0.454, 0.419, 0.371, 0.000)
		colorSnow      (0.495, 0.447, 0.391, 1.000)
		BumpHeight      9.27835
		BumpOffset      1.85567
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.125325
		Period          0.745872
		Eccentricity    0.451131
		Inclination     -67.1984
		AscendingNode   -132.747
		ArgOfPericenter -147.835
		MeanAnomaly     178.196
	}
}

DwarfMoon	"Jakku System 4.D41"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            7.38665e-010
	Radius          13.7139
	InertiaMoment   0.398378

	RotationPeriod  32909.9
	Obliquity       25.8799
	EqAscendNode    -170.651

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.471 0.396 0.330)

	Surface
	{
		SurfStyle       0.20916
		OceanStyle      0.151893
		Randomize      (-0.246, 0.731, -0.988)
		colorDistMagn   0.143356
		colorDistFreq   0.156757
		detailScale     374.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0710967
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.273413
		terraceProb     0.353626
		erosion         0
		montesMagn      0.358261
		montesFreq      3.10322
		montesSpiky     0.990308
		montesFraction  0.686571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.406999
		hillsFraction   0.36516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254165
		craterFreq      0.242654
		craterDensity   0.823512
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56696
		volcanoTemp     1367.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.159, 0.132, 0.000)
		colorShelf     (0.200, 0.168, 0.140, 0.000)
		colorBeach     (0.212, 0.178, 0.149, 0.000)
		colorDesert    (0.224, 0.188, 0.157, 0.000)
		colorLowland   (0.236, 0.198, 0.165, 0.000)
		colorUpland    (0.248, 0.208, 0.173, 0.000)
		colorRock      (0.259, 0.218, 0.182, 0.000)
		colorSnow      (0.271, 0.228, 0.190, 1.000)
		BumpHeight      12.3425
		BumpOffset      2.4685
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.125884
		Period          0.750869
		Eccentricity    0.12622
		Inclination     25.8799
		AscendingNode   -170.651
		ArgOfPericenter -123.099
		MeanAnomaly     -16.8019
	}
}

DwarfMoon	"Jakku System 4.D42"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.0694e-009
	Radius          14.7006
	InertiaMoment   0.399408

	Obliquity       28.9227
	EqAscendNode    -20.7306
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.532 0.527)

	Surface
	{
		SurfStyle       0.024065
		OceanStyle      0.953854
		Randomize      (-0.261, 0.264, -0.553)
		colorDistMagn   0.799314
		colorDistFreq   0.116035
		detailScale     401.424
		colorConversion true
		snowLevel       2
		tropicLatitude  0.836904
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424162
		terraceProb     0.361041
		erosion         0
		montesMagn      0.496805
		montesFreq      3.62794
		montesSpiky     0.916905
		montesFraction  0.713167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.697159
		hillsFraction   0.664684
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193395
		craterFreq      0.218847
		craterDensity   0.934784
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467513
		volcanoTemp     1307.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.213, 0.211, 0.000)
		colorShelf     (0.228, 0.226, 0.224, 0.000)
		colorBeach     (0.242, 0.239, 0.237, 0.000)
		colorDesert    (0.255, 0.253, 0.250, 0.000)
		colorLowland   (0.269, 0.266, 0.263, 0.000)
		colorUpland    (0.282, 0.279, 0.277, 0.000)
		colorRock      (0.295, 0.293, 0.290, 0.000)
		colorSnow      (0.309, 0.306, 0.303, 1.000)
		BumpHeight      13.2305
		BumpOffset      2.6461
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.126522
		Period          0.756577
		Eccentricity    0.222821
		Inclination     28.9227
		AscendingNode   -20.7306
		ArgOfPericenter -1.36571
		MeanAnomaly     126.387
	}
}

DwarfMoon	"Jakku System 4.D43"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.52747e-009
	Radius          15.9011
	InertiaMoment   0.396867

	Obliquity       -88.1152
	EqAscendNode    -64.6919
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.501 0.445)

	Surface
	{
		SurfStyle       0.431931
		OceanStyle      0.950759
		Randomize      (-0.530, -0.492, -0.101)
		colorDistMagn   0.515204
		colorDistFreq   0.113325
		detailScale     434.206
		colorConversion true
		snowLevel       2
		tropicLatitude  0.904751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532143
		terraceProb     0.303482
		erosion         0
		montesMagn      0.525496
		montesFreq      3.11373
		montesSpiky     0.810781
		montesFraction  0.320968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.710868
		hillsFraction   0.655927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231977
		craterFreq      0.21457
		craterDensity   0.764805
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463419
		volcanoTemp     1355.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.200, 0.178, 0.000)
		colorShelf     (0.248, 0.213, 0.189, 0.000)
		colorBeach     (0.263, 0.225, 0.200, 0.000)
		colorDesert    (0.277, 0.238, 0.211, 0.000)
		colorLowland   (0.292, 0.250, 0.223, 0.000)
		colorUpland    (0.306, 0.263, 0.234, 0.000)
		colorRock      (0.321, 0.275, 0.245, 0.000)
		colorSnow      (0.335, 0.288, 0.256, 1.000)
		BumpHeight      14.311
		BumpOffset      2.8622
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.127153
		Period          0.762248
		Eccentricity    0.459275
		Inclination     -88.1152
		AscendingNode   -64.6919
		ArgOfPericenter -91.3811
		MeanAnomaly     -136.418
	}
}

DwarfMoon	"Jakku System 4.D44"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.1573e-009
	Radius          16.9656
	InertiaMoment   0.398546

	Obliquity       16.2846
	EqAscendNode    -134.995
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.401 0.398)

	Surface
	{
		SurfStyle       0.0162096
		OceanStyle      0.478311
		Randomize      (0.101, 0.455, -0.933)
		colorDistMagn   0.766215
		colorDistFreq   0.201853
		detailScale     463.273
		colorConversion true
		snowLevel       2
		tropicLatitude  0.213396
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423069
		terraceProb     0.464816
		erosion         0
		montesMagn      0.448907
		montesFreq      3.07803
		montesSpiky     0.849347
		montesFraction  0.361358
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.756743
		hillsFraction   0.665527
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240957
		craterFreq      0.24691
		craterDensity   0.990443
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541959
		volcanoTemp     1528.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.160, 0.159, 0.000)
		colorShelf     (0.174, 0.170, 0.169, 0.000)
		colorBeach     (0.184, 0.180, 0.179, 0.000)
		colorDesert    (0.194, 0.191, 0.189, 0.000)
		colorLowland   (0.204, 0.201, 0.199, 0.000)
		colorUpland    (0.215, 0.211, 0.209, 0.000)
		colorRock      (0.225, 0.221, 0.219, 0.000)
		colorSnow      (0.235, 0.231, 0.229, 1.000)
		BumpHeight      15.269
		BumpOffset      3.0538
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.127784
		Period          0.767932
		Eccentricity    0.446885
		Inclination     16.2846
		AscendingNode   -134.995
		ArgOfPericenter -31.7652
		MeanAnomaly     162.462
	}
}

DwarfMoon	"Jakku System 4.D45"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            3.01832e-009
	Radius          22.1797
	InertiaMoment   0.399538

	RotationPeriod  40687.7
	Obliquity       70.7513
	EqAscendNode    78.4018

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.800 0.799 0.798)

	Surface
	{
		SurfStyle       0.0491084
		OceanStyle      0.321184
		Randomize      (0.740, -0.802, 0.931)
		colorDistMagn   0.325177
		colorDistFreq   0.232609
		detailScale     605.654
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997511
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344717
		terraceProb     0.624501
		erosion         0
		montesMagn      0.532766
		montesFreq      2.10314
		montesSpiky     0.964327
		montesFraction  0.520086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.44555
		hillsFraction   0.656042
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2517
		craterFreq      0.180652
		craterDensity   0.863225
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496177
		volcanoTemp     1532.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.319, 0.319, 0.000)
		colorShelf     (0.340, 0.339, 0.339, 0.000)
		colorBeach     (0.360, 0.359, 0.359, 0.000)
		colorDesert    (0.380, 0.379, 0.379, 0.000)
		colorLowland   (0.400, 0.399, 0.399, 0.000)
		colorUpland    (0.420, 0.419, 0.419, 0.000)
		colorRock      (0.440, 0.439, 0.439, 0.000)
		colorSnow      (0.460, 0.459, 0.459, 1.000)
		BumpHeight      19.9618
		BumpOffset      3.99235
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.128413
		Period          0.773605
		Eccentricity    0.450812
		Inclination     70.7513
		AscendingNode   78.4018
		ArgOfPericenter -161.81
		MeanAnomaly     56.1713
	}
}

DwarfMoon	"Jakku System 4.D46"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            4.1901e-009
	Radius          23.3195
	InertiaMoment   0.397237

	RotationPeriod  20502.5
	Obliquity       29.3929
	EqAscendNode    -90.2892

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.563 0.559)

	Surface
	{
		SurfStyle       0.81532
		OceanStyle      0.754117
		Randomize      (0.001, -0.347, 0.266)
		colorDistMagn   0.797923
		colorDistFreq   0.245037
		detailScale     636.776
		colorConversion true
		snowLevel       2
		tropicLatitude  0.649531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47542
		terraceProb     0.193818
		erosion         0
		montesMagn      0.474334
		montesFreq      2.45121
		montesSpiky     0.794024
		montesFraction  0.702799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35838
		hillsFraction   0.629758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268355
		craterFreq      0.245002
		craterDensity   1.0667
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43447
		volcanoTemp     1489.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.191, 0.156, 0.000)
		colorShelf     (0.226, 0.197, 0.179, 0.000)
		colorBeach     (0.266, 0.231, 0.212, 0.000)
		colorDesert    (0.288, 0.248, 0.207, 0.000)
		colorLowland   (0.317, 0.264, 0.235, 0.000)
		colorUpland    (0.351, 0.321, 0.285, 0.000)
		colorRock      (0.379, 0.349, 0.307, 0.000)
		colorSnow      (0.413, 0.371, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.12908
		Period          0.779638
		Eccentricity    0.245055
		Inclination     29.3929
		AscendingNode   -90.2892
		ArgOfPericenter 81.6974
		MeanAnomaly     -29.4551
	}
}

DwarfMoon	"Jakku System 4.D47"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            5.77946e-009
	Radius          24.9197
	InertiaMoment   0.398704

	RotationPeriod  27461.8
	Obliquity       48.8044
	EqAscendNode    -2.00208

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.449 0.445 0.444)

	Surface
	{
		SurfStyle       0.479605
		OceanStyle      0.271229
		Randomize      (0.351, 0.157, -0.371)
		colorDistMagn   0.106297
		colorDistFreq   0.0816532
		detailScale     680.474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991241
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37177
		terraceProb     0.36025
		erosion         0
		montesMagn      0.534566
		montesFreq      2.75761
		montesSpiky     0.952101
		montesFraction  0.909197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.95218
		hillsFraction   0.703955
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270435
		craterFreq      0.238096
		craterDensity   0.950375
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553336
		volcanoTemp     1836.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.178, 0.177, 0.000)
		colorShelf     (0.191, 0.189, 0.189, 0.000)
		colorBeach     (0.202, 0.200, 0.200, 0.000)
		colorDesert    (0.213, 0.211, 0.211, 0.000)
		colorLowland   (0.225, 0.223, 0.222, 0.000)
		colorUpland    (0.236, 0.234, 0.233, 0.000)
		colorRock      (0.247, 0.245, 0.244, 0.000)
		colorSnow      (0.258, 0.256, 0.255, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.129473
		Period          0.783207
		Eccentricity    0.388663
		Inclination     48.8044
		AscendingNode   -2.00208
		ArgOfPericenter -68.1171
		MeanAnomaly     98.1842
	}
}

DwarfMoon	"Jakku System 4.D48"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            7.93017e-009
	Radius          26.4355
	InertiaMoment   0.399665

	RotationPeriod  10363.9
	Obliquity       61.8859
	EqAscendNode    128.047

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.509 0.427)

	Surface
	{
		SurfStyle       0.681615
		OceanStyle      0.221969
		Randomize      (-0.993, -0.732, 0.386)
		colorDistMagn   0.93979
		colorDistFreq   0.502209
		detailScale     721.865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.712656
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692963
		terraceProb     0.105739
		erosion         0
		montesMagn      0.564308
		montesFreq      3.35865
		montesSpiky     0.974294
		montesFraction  0.843709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.58397
		hillsFraction   0.623152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234309
		craterFreq      0.273196
		craterDensity   1.01618
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50193
		volcanoTemp     1161.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.173, 0.120, 0.000)
		colorShelf     (0.223, 0.178, 0.137, 0.000)
		colorBeach     (0.262, 0.209, 0.162, 0.000)
		colorDesert    (0.285, 0.224, 0.158, 0.000)
		colorLowland   (0.313, 0.239, 0.179, 0.000)
		colorUpland    (0.346, 0.290, 0.218, 0.000)
		colorRock      (0.374, 0.316, 0.235, 0.000)
		colorSnow      (0.407, 0.336, 0.248, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.130024
		Period          0.788208
		Eccentricity    0.446632
		Inclination     61.8859
		AscendingNode   128.047
		ArgOfPericenter 102.741
		MeanAnomaly     -149.192
	}
}

DwarfMoon	"Jakku System 4.D49"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.08364e-008
	Radius          34.4448
	InertiaMoment   0.397531

	Obliquity       -60.9715
	EqAscendNode    146.928
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.542 0.533)

	Surface
	{
		SurfStyle       0.752726
		OceanStyle      0.724387
		Randomize      (0.637, 0.414, 0.781)
		colorDistMagn   0.82031
		colorDistFreq   0.498432
		detailScale     940.574
		colorConversion true
		snowLevel       2
		tropicLatitude  0.482065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620452
		terraceProb     0.380574
		erosion         0
		montesMagn      0.420234
		montesFreq      2.76246
		montesSpiky     0.946149
		montesFraction  0.473876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.58474
		hillsFraction   0.70827
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257412
		craterFreq      0.166907
		craterDensity   1.05992
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438887
		volcanoTemp     1526.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.184, 0.149, 0.000)
		colorShelf     (0.219, 0.190, 0.171, 0.000)
		colorBeach     (0.257, 0.222, 0.203, 0.000)
		colorDesert    (0.279, 0.238, 0.197, 0.000)
		colorLowland   (0.306, 0.255, 0.224, 0.000)
		colorUpland    (0.339, 0.309, 0.272, 0.000)
		colorRock      (0.366, 0.336, 0.293, 0.000)
		colorSnow      (0.399, 0.357, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.130344
		Period          0.791117
		Eccentricity    0.195945
		Inclination     -60.9715
		AscendingNode   146.928
		ArgOfPericenter 69.9601
		MeanAnomaly     132.04
	}
}

DwarfMoon	"Jakku System 4.D50"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.47616e-008
	Radius          35.7136
	InertiaMoment   0.398855

	Obliquity       79.5992
	EqAscendNode    -146.214
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.695 0.692)

	Surface
	{
		SurfStyle       0.725077
		OceanStyle      0.750696
		Randomize      (-0.022, 0.533, -0.543)
		colorDistMagn   0.194649
		colorDistFreq   0.479038
		detailScale     975.219
		colorConversion true
		snowLevel       2
		tropicLatitude  0.547773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576591
		terraceProb     0.359543
		erosion         0
		montesMagn      0.583306
		montesFreq      2.6554
		montesSpiky     0.933069
		montesFraction  0.592229
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.84734
		hillsFraction   0.6864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258981
		craterFreq      0.228293
		craterDensity   0.881425
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.420282
		volcanoTemp     1673.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.236, 0.194, 0.000)
		colorShelf     (0.279, 0.243, 0.221, 0.000)
		colorBeach     (0.327, 0.285, 0.263, 0.000)
		colorDesert    (0.355, 0.306, 0.256, 0.000)
		colorLowland   (0.390, 0.327, 0.291, 0.000)
		colorUpland    (0.432, 0.396, 0.353, 0.000)
		colorRock      (0.467, 0.431, 0.381, 0.000)
		colorSnow      (0.508, 0.459, 0.401, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.130775
		Period          0.795048
		Eccentricity    0.269346
		Inclination     79.5992
		AscendingNode   -146.214
		ArgOfPericenter 40.8638
		MeanAnomaly     45.9809
	}
}

DwarfMoon	"Jakku System 4.D51"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.00647e-008
	Radius          37.9464
	InertiaMoment   0.399791

	RotationPeriod  9360.87
	Obliquity       17.74
	EqAscendNode    26.2131

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.419 0.417)

	Surface
	{
		SurfStyle       0.85433
		OceanStyle      0.147622
		Randomize      (-0.816, 0.240, -0.459)
		colorDistMagn   0.610142
		colorDistFreq   0.372722
		detailScale     1036.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.566784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702952
		terraceProb     0.172258
		erosion         0
		montesMagn      0.563114
		montesFreq      3.47977
		montesSpiky     0.881404
		montesFraction  0.505625
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.5148
		hillsFraction   0.745366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256595
		craterFreq      0.230854
		craterDensity   0.791043
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45664
		volcanoTemp     1663.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.144, 0.147, 0.167, 0.050)
		colorShelf     (0.170, 0.172, 0.192, 0.040)
		colorBeach     (0.195, 0.197, 0.217, 0.030)
		colorDesert    (0.221, 0.222, 0.246, 0.020)
		colorLowland   (0.246, 0.247, 0.271, 0.030)
		colorUpland    (0.272, 0.272, 0.296, 0.050)
		colorRock      (0.297, 0.297, 0.329, 0.020)
		colorSnow      (0.297, 0.297, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.131417
		Period          0.800913
		Eccentricity    0.320224
		Inclination     17.74
		AscendingNode   26.2131
		ArgOfPericenter -47.4581
		MeanAnomaly     67.0521
	}
}

DwarfMoon	"Jakku System 4.D52"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            2.72377e-008
	Radius          40.2135
	InertiaMoment   0.397779

	RotationPeriod  4704.8
	Obliquity       -2.52237
	EqAscendNode    90.2701

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.679 0.676)

	Surface
	{
		SurfStyle       0.255969
		OceanStyle      0.57585
		Randomize      (0.224, 0.026, -0.700)
		colorDistMagn   0.291361
		colorDistFreq   1.24653
		detailScale     1098.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0620615
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485373
		terraceProb     0.321502
		erosion         0
		montesMagn      0.552036
		montesFreq      1.80938
		montesSpiky     0.975577
		montesFraction  0.485907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.3487
		hillsFraction   0.843788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236892
		craterFreq      0.201978
		craterDensity   0.998634
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44894
		volcanoTemp     1380.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.272, 0.270, 0.000)
		colorShelf     (0.291, 0.289, 0.287, 0.000)
		colorBeach     (0.308, 0.305, 0.304, 0.000)
		colorDesert    (0.326, 0.322, 0.321, 0.000)
		colorLowland   (0.343, 0.339, 0.338, 0.000)
		colorUpland    (0.360, 0.356, 0.355, 0.000)
		colorRock      (0.377, 0.373, 0.372, 0.000)
		colorSnow      (0.394, 0.390, 0.389, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.131873
		Period          0.805083
		Eccentricity    0.226103
		Inclination     -2.52237
		AscendingNode   90.2701
		ArgOfPericenter 79.8206
		MeanAnomaly     -158.057
	}
}

DwarfMoon	"Jakku System 4.D53"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            3.69597e-008
	Radius          52.8201
	InertiaMoment   0.398999

	RotationPeriod  28361.1
	Obliquity       56.0283
	EqAscendNode    35.2824

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.789 0.786 0.785)

	Surface
	{
		SurfStyle       0.825143
		OceanStyle      0.137079
		Randomize      (0.234, 0.593, -0.189)
		colorDistMagn   0.460394
		colorDistFreq   1.93385
		detailScale     1442.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968455
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422947
		terraceProb     0.187998
		erosion         0
		montesMagn      0.304114
		montesFreq      2.50918
		montesSpiky     0.992253
		montesFraction  0.173353
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.343
		hillsFraction   0.694109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244807
		craterFreq      0.232323
		craterDensity   0.767554
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533007
		volcanoTemp     1650.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.267, 0.220, 0.000)
		colorShelf     (0.316, 0.275, 0.251, 0.000)
		colorBeach     (0.371, 0.322, 0.298, 0.000)
		colorDesert    (0.402, 0.346, 0.290, 0.000)
		colorLowland   (0.442, 0.370, 0.330, 0.000)
		colorUpland    (0.489, 0.448, 0.400, 0.000)
		colorRock      (0.529, 0.488, 0.432, 0.000)
		colorSnow      (0.576, 0.519, 0.455, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.132285
		Period          0.808856
		Eccentricity    0.24231
		Inclination     56.0283
		AscendingNode   35.2824
		ArgOfPericenter 9.56033
		MeanAnomaly     -11.2037
	}
}

DwarfMoon	"Jakku System 4.D54"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            5.01737e-008
	Radius          54.0653
	InertiaMoment   0.399916

	RotationPeriod  4970.6
	Obliquity       85.66
	EqAscendNode    -156.277

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.704 0.617)

	Surface
	{
		SurfStyle       0.738029
		OceanStyle      0.159014
		Randomize      (0.365, -0.397, 0.263)
		colorDistMagn   0.950542
		colorDistFreq   1.48716
		detailScale     1476.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.401205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391784
		terraceProb     0.455285
		erosion         0
		montesMagn      0.511462
		montesFreq      3.22555
		montesSpiky     0.835255
		montesFraction  0.929702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.08187
		hillsFraction   0.686455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21225
		craterFreq      0.18745
		craterDensity   0.907434
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479102
		volcanoTemp     1730.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.239, 0.173, 0.000)
		colorShelf     (0.313, 0.246, 0.198, 0.000)
		colorBeach     (0.368, 0.288, 0.235, 0.000)
		colorDesert    (0.399, 0.310, 0.228, 0.000)
		colorLowland   (0.438, 0.331, 0.259, 0.000)
		colorUpland    (0.485, 0.401, 0.315, 0.000)
		colorRock      (0.524, 0.436, 0.340, 0.000)
		colorSnow      (0.571, 0.464, 0.358, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.132883
		Period          0.814349
		Eccentricity    0.302694
		Inclination     85.6589
		AscendingNode   -156.277
		ArgOfPericenter -97.4773
		MeanAnomaly     80.2027
	}
}

DwarfMoon	"Jakku System 4.D55"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            6.82011e-008
	Radius          57.3756
	InertiaMoment   0.397997

	RotationPeriod  2483.76
	Obliquity       -8.84755
	EqAscendNode    38.1066

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.499 0.495)

	Surface
	{
		SurfStyle       0.243186
		OceanStyle      0.864391
		Randomize      (-0.357, -0.253, 0.407)
		colorDistMagn   0.26318
		colorDistFreq   2.60379
		detailScale     1566.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.286435
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364132
		terraceProb     0.193218
		erosion         0
		montesMagn      0.379084
		montesFreq      2.44683
		montesSpiky     0.954775
		montesFraction  0.630075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.52381
		hillsFraction   0.516731
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253901
		craterFreq      0.189217
		craterDensity   1.02869
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501576
		volcanoTemp     1584.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.200, 0.198, 0.000)
		colorShelf     (0.215, 0.212, 0.211, 0.000)
		colorBeach     (0.227, 0.225, 0.223, 0.000)
		colorDesert    (0.240, 0.237, 0.235, 0.000)
		colorLowland   (0.253, 0.250, 0.248, 0.000)
		colorUpland    (0.265, 0.262, 0.260, 0.000)
		colorRock      (0.278, 0.275, 0.273, 0.000)
		colorSnow      (0.291, 0.287, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.133494
		Period          0.819972
		Eccentricity    0.309545
		Inclination     -8.76857
		AscendingNode   38.094
		ArgOfPericenter -57.3461
		MeanAnomaly     -167.431
	}
}

DwarfMoon	"Jakku System 4.D56"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            9.29102e-008
	Radius          60.9788
	InertiaMoment   0.399138

	RotationPeriod  1647.57
	Obliquity       -32.0297
	EqAscendNode    -1.65726

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.495 0.379 0.319)

	Surface
	{
		SurfStyle       0.141833
		OceanStyle      0.272666
		Randomize      (-0.676, 0.952, -0.688)
		colorDistMagn   0.357981
		colorDistFreq   2.6678
		detailScale     1665.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90084
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427853
		terraceProb     0.291696
		erosion         0
		montesMagn      0.52564
		montesFreq      2.78749
		montesSpiky     0.909044
		montesFraction  0.260057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.25463
		hillsFraction   0.604362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238781
		craterFreq      0.241069
		craterDensity   0.869487
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484848
		volcanoTemp     1400.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.152, 0.127, 0.000)
		colorShelf     (0.211, 0.161, 0.135, 0.000)
		colorBeach     (0.223, 0.171, 0.143, 0.000)
		colorDesert    (0.235, 0.180, 0.151, 0.000)
		colorLowland   (0.248, 0.190, 0.159, 0.000)
		colorUpland    (0.260, 0.199, 0.167, 0.000)
		colorRock      (0.273, 0.209, 0.175, 0.000)
		colorSnow      (0.285, 0.218, 0.183, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.134049
		Period          0.825086
		Eccentricity    0.432667
		Inclination     -32.2459
		AscendingNode   -1.58992
		ArgOfPericenter -133.948
		MeanAnomaly     -13.0523
	}
}

DwarfMoon	"Jakku System 4.D57"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.2697e-007
	Radius          81.996
	InertiaMoment   0.395204

	RotationPeriod  2470.01
	Obliquity       89.7548
	EqAscendNode    -91.1866

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.687 0.571 0.488)

	Surface
	{
		SurfStyle       0.149016
		OceanStyle      0.334415
		Randomize      (0.617, 0.508, -0.378)
		colorDistMagn   0.693854
		colorDistFreq   2.97452
		detailScale     2239.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999783
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576953
		terraceProb     0.502586
		erosion         0
		montesMagn      0.511119
		montesFreq      2.70386
		montesSpiky     0.86275
		montesFraction  0.295888
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.5253
		hillsFraction   0.679423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25112
		craterFreq      0.206245
		craterDensity   0.970916
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481713
		volcanoTemp     1303.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.228, 0.195, 0.000)
		colorShelf     (0.292, 0.242, 0.207, 0.000)
		colorBeach     (0.309, 0.257, 0.220, 0.000)
		colorDesert    (0.326, 0.271, 0.232, 0.000)
		colorLowland   (0.343, 0.285, 0.244, 0.000)
		colorUpland    (0.361, 0.300, 0.256, 0.000)
		colorRock      (0.378, 0.314, 0.268, 0.000)
		colorSnow      (0.395, 0.328, 0.281, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.134609
		Period          0.830269
		Eccentricity    0.0978121
		Inclination     89.7707
		AscendingNode   -91.192
		ArgOfPericenter 67.4245
		MeanAnomaly     128.486
	}
}

DwarfMoon	"Jakku System 4.D58"
{
	ParentBody     "Jakku System 4"
	Class	       "Asteroid"

	Mass            1.74237e-007
	Radius          82.4739
	InertiaMoment   0.398194

	RotationPeriod  1429.15
	Obliquity       49.8813
	EqAscendNode    130.814

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.793 0.791)

	Surface
	{
		SurfStyle       0.0748937
		OceanStyle      0.643701
		Randomize      (0.796, -0.290, -0.653)
		colorDistMagn   0.496569
		colorDistFreq   3.43589
		detailScale     2252.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.602863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48904
		terraceProb     0.280542
		erosion         0
		montesMagn      0.56201
		montesFreq      3.31572
		montesSpiky     0.952759
		montesFraction  0.497372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.8931
		hillsFraction   0.632758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23471
		craterFreq      0.267941
		craterDensity   0.818717
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429255
		volcanoTemp     1671.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.316, 0.000)
		colorShelf     (0.338, 0.337, 0.336, 0.000)
		colorBeach     (0.358, 0.357, 0.356, 0.000)
		colorDesert    (0.378, 0.377, 0.376, 0.000)
		colorLowland   (0.398, 0.397, 0.396, 0.000)
		colorUpland    (0.417, 0.417, 0.415, 0.000)
		colorRock      (0.437, 0.436, 0.435, 0.000)
		colorSnow      (0.457, 0.456, 0.455, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.135076
		Period          0.834594
		Eccentricity    0.417285
		Inclination     49.7319
		AscendingNode   130.81
		ArgOfPericenter -62.9153
		MeanAnomaly     112.092
	}
}

DwarfMoon	"Jakku System 4.D59"
{
	ParentBody     "Jakku System 7"
	Class	       "Asteroid"

	Mass            2.40358e-007
	Radius          87.8069
	InertiaMoment   0.399273

	RotationPeriod  1093.31
	Obliquity       71.8396
	EqAscendNode    39.7846

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.415 0.409 0.406)

	Surface
	{
		SurfStyle       0.407094
		OceanStyle      0.0545953
		Randomize      (0.659, -0.091, -0.926)
		colorDistMagn   0.995417
		colorDistFreq   3.5425
		detailScale     2397.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.807199
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514196
		terraceProb     0.107937
		erosion         0
		montesMagn      0.354172
		montesFreq      3.48315
		montesSpiky     0.977386
		montesFraction  0.410965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.0468
		hillsFraction   0.837179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250802
		craterFreq      0.251443
		craterDensity   0.894457
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546588
		volcanoTemp     1492.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.163, 0.000)
		colorShelf     (0.176, 0.174, 0.173, 0.000)
		colorBeach     (0.187, 0.184, 0.183, 0.000)
		colorDesert    (0.197, 0.194, 0.193, 0.000)
		colorLowland   (0.207, 0.205, 0.203, 0.000)
		colorUpland    (0.218, 0.215, 0.213, 0.000)
		colorRock      (0.228, 0.225, 0.224, 0.000)
		colorSnow      (0.238, 0.235, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.135394
		Period          0.837535
		Eccentricity    0.159673
		Inclination     71.0024
		AscendingNode   39.6515
		ArgOfPericenter -79.5915
		MeanAnomaly     54.6955
	}
}

Planet	"Jakku System 8"
{
	ParentBody     "Jakku System"
	Class	       "IceGiant"

	Mass            27.1802
	Radius          23749.9
	InertiaMoment   0.186154

	Oblateness      0.0328255

	RotationPeriod  8.21841
	Obliquity       -27.1439
	EqAscendNode    -68.8577

	AlbedoBond      0.421287
	AlbedoGeom      0.505544
	Brightness      2

	Surface
	{
		SurfStyle       0.872363
		Randomize      (0.788, -0.221, -0.578)
		detailScale     61086.2
		colorConversion true
		tropicLatitude  0.466592
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.97849
		stripeFluct     0.363494
		stripeTwist     9.48153
		cycloneMagn     15.0156
		cycloneFreq     0.8214
		cycloneDensity  0.446978
		cycloneOctaves  1
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
		BumpHeight      14.2847
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          36.6055
		Velocity        886.211
		BumpHeight      22.3215
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.13658
		mainOctaves     12
		Coverage        0.106433
		stripeZones     5.97849
		stripeFluct     0.363494
		stripeTwist     9.48153
	}

	Clouds
	{
		Height          58.9277
		Velocity        1023.35
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.488)
		mainFreq        1.13658
		mainOctaves     12
		Coverage        0.106433
		stripeZones     5.97849
		stripeFluct     0.363494
		stripeTwist     9.48153
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          237.499
		Density         4349.33
		Pressure        606254
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0313932
		Saturation      0.932273

		Composition
		{
			H2    	92.8377
			He    	7.05067
			CH4   	0.0610573
			N2    	0.0407327
			O2    	0.00794434
			Ne    	0.00110523
			Ar    	0.00081573
		}
	}

	Aurora
	{
		Height      314.671
		NorthLat    64.428
		NorthLon    120.609
		NorthRadius 6659.37
		NorthWidth  1501.59
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    304.757
		SouthRadius 6483.22
		SouthWidth  2085.52
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     32209.4
		OuterRadius     69594.4
		RotationPeriod  6.10321
		RotationOffset  0
		FrontBright     0.917716
		BackBright      0.79551
		Density         0.91255
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.4385
		Period          35.5662
		Eccentricity    0.0745112
		Inclination     -1.46367
		AscendingNode   -64.0454
		ArgOfPericenter 64.0271
		MeanAnomaly     197.29
	}
}

DwarfMoon	"Jakku System 8.D1"
{
	ParentBody     "Jakku System 8"
	Class	       "Asteroid"

	Mass            1.93849e-011
	Radius          3.73133
	InertiaMoment   0.398665

	Oblateness      0.249

	Obliquity       0.00588484
	EqAscendNode    -122.434
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.547 0.458)

	Surface
	{
		SurfStyle       0.495772
		OceanStyle      0.587388
		Randomize      (-0.638, -0.667, -0.699)
		colorDistMagn   0.320241
		colorDistFreq   0.00978137
		detailScale     101.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629331
		terraceProb     0.260199
		erosion         0
		montesMagn      0.429079
		montesFreq      2.81234
		montesSpiky     0.981133
		montesFraction  0.514296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0371682
		hillsFraction   0.876272
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244196
		craterFreq      0.234832
		craterDensity   0.80898
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513366
		volcanoTemp     1573.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.219, 0.183, 0.000)
		colorShelf     (0.282, 0.232, 0.194, 0.000)
		colorBeach     (0.298, 0.246, 0.206, 0.000)
		colorDesert    (0.315, 0.260, 0.217, 0.000)
		colorLowland   (0.331, 0.273, 0.229, 0.000)
		colorUpland    (0.348, 0.287, 0.240, 0.000)
		colorRock      (0.364, 0.301, 0.252, 0.000)
		colorSnow      (0.381, 0.314, 0.263, 1.000)
		BumpHeight      3.3582
		BumpOffset      0.671639
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00037901
		Period          0.000818521
		Eccentricity    1.34709e-005
		Inclination     0.00588484
		AscendingNode   -122.434
		ArgOfPericenter 97.7735
		MeanAnomaly     -106.677
	}
}

DwarfMoon	"Jakku System 8.D2"
{
	ParentBody     "Jakku System 8"
	Class	       "Asteroid"

	Mass            3.70956e-011
	Radius          4.42316
	InertiaMoment   0.399633

	Oblateness      0.249

	Obliquity       -0.0149752
	EqAscendNode    54.8495
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.670 0.615)

	Surface
	{
		SurfStyle       0.751424
		OceanStyle      0.529664
		Randomize      (0.560, 0.755, 0.078)
		colorDistMagn   0.25551
		colorDistFreq   0.010576
		detailScale     120.782
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453988
		terraceProb     0.255261
		erosion         0
		montesMagn      0.56892
		montesFreq      3.33784
		montesSpiky     0.924002
		montesFraction  0.129185
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0341073
		hillsFraction   0.437078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221411
		craterFreq      0.229979
		craterDensity   0.848463
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451092
		volcanoTemp     1253.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.228, 0.172, 0.000)
		colorShelf     (0.297, 0.235, 0.197, 0.000)
		colorBeach     (0.349, 0.275, 0.234, 0.000)
		colorDesert    (0.379, 0.295, 0.228, 0.000)
		colorLowland   (0.416, 0.315, 0.258, 0.000)
		colorUpland    (0.461, 0.382, 0.314, 0.000)
		colorRock      (0.498, 0.416, 0.338, 0.000)
		colorSnow      (0.542, 0.442, 0.357, 1.000)
		BumpHeight      3.98084
		BumpOffset      0.796168
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000412139
		Period          0.000928152
		Eccentricity    4.51014e-005
		Inclination     -0.0149752
		AscendingNode   54.8495
		ArgOfPericenter -159.482
		MeanAnomaly     -58.3558
	}
}

Moon	"Jakku System 8.1"
{
	ParentBody     "Jakku System 8"
	Class	       "Selena"

	Mass            0.000600546
	Radius          698.929
	InertiaMoment   0.399655

	Oblateness      0.0114864

	Obliquity       -0.781636
	EqAscendNode    89.2896
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.433 0.425 0.422)

	Surface
	{
		SurfStyle       0.664157
		OceanStyle      0.544973
		Randomize      (-0.341, 0.915, -0.597)
		colorDistMagn   0.063699
		colorDistFreq   85.3263
		detailScale     1797.69
		colorConversion true
		drivenDarkening 0
		seaLevel        0.17493
		snowLevel       2
		tropicLatitude  0.019411
		icecapLatitude  0.651824
		icecapHeight    0.199691
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.50892
		venusFreq       1.52055
		venusMagn       0
		mareFreq        0.0765943
		mareDensity     0.000388092
		terraceProb     0.110551
		erosion         0
		montesMagn      0.0705392
		montesFreq      43.384
		montesSpiky     0.871861
		montesFraction  0.42269
		dunesMagn       0.039915
		dunesFreq       903.46
		dunesFraction   0.010156
		hillsMagn       0.125073
		hillsFreq       78.249
		hillsFraction   0.102416
		hills2Fraction  0
		riversMagn      65.7925
		riversFreq      3.76016
		riversSin       5.83968
		riversOctaves   0
		canyonsMagn     0.435264
		canyonsFreq     0.288375
		canyonFraction  0.605329
		cracksMagn      0.065659
		cracksFreq      0.150477
		cracksOctaves   0
		craterMagn      0.57997
		craterFreq      2.12959
		craterDensity   0.900508
		craterOctaves   9.59107
		craterRayedFactor 0
		volcanoMagn     0.180974
		volcanoFreq     0.871441
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.0980537
		volcanoRadius   0.140289
		volcanoTemp     1479.72
		lavaCoverTidal  0.045437
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.269, 0.259, 0.228, 0.000)
		colorDesert    (0.282, 0.264, 0.232, 0.000)
		colorLowland   (0.221, 0.196, 0.177, 0.000)
		colorUpland    (0.325, 0.302, 0.262, 0.000)
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
		SemiMajorAxis   0.000793367
		Period          0.0024789
		Eccentricity    0.0116041
		Inclination     -0.781636
		AscendingNode   89.2896
		ArgOfPericenter -12.9082
		MeanAnomaly     -87.694
	}
}

Moon	"Jakku System 8.2"
{
	ParentBody     "Jakku System 8"
	Class	       "IceWorld"

	Mass            8.72619e-005
	Radius          391.313
	InertiaMoment   0.399177

	Oblateness      0.00383141

	Obliquity       -0.202891
	EqAscendNode    -36.4053
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.725 0.639 0.596)

	Surface
	{
		SurfStyle       0.938268
		OceanStyle      0.264919
		Randomize      (0.452, 0.585, 0.186)
		colorDistMagn   0.0416261
		colorDistFreq   47.6973
		detailScale     1006.48
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.254801
		snowLevel       2
		tropicLatitude  0.00673045
		icecapLatitude  0.627836
		icecapHeight    0.284802
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81912
		venusFreq       0.594604
		venusMagn       0
		mareFreq        0
		mareDensity     8.33866e-005
		terraceProb     0.561717
		erosion         0
		montesMagn      0.0602514
		montesFreq      16.4401
		montesSpiky     0.941393
		montesFraction  0.784967
		dunesMagn       0.0508029
		dunesFreq       510.907
		dunesFraction   0.300192
		hillsMagn       0.124098
		hillsFreq       46.1505
		hillsFraction   0.114886
		hills2Fraction  0.0178988
		riversMagn      58.8901
		riversFreq      3.21906
		riversSin       4.24955
		riversOctaves   0
		canyonsMagn     0.569651
		canyonsFreq     0.130707
		canyonFraction  0
		cracksMagn      0.0279934
		cracksFreq      0.216198
		cracksOctaves   0
		craterMagn      0.681899
		craterFreq      0.806173
		craterDensity   0.825024
		craterOctaves   9
		craterRayedFactor 0.213102
		volcanoMagn     0.182677
		volcanoFreq     0.675758
		volcanoDensity  0.2259
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.175212
		volcanoRadius   0.155052
		volcanoTemp     1019.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.551, 0.453, 0.346, 1.000)
		colorShelf     (0.551, 0.453, 0.346, 1.000)
		colorBeach     (0.508, 0.396, 0.298, 1.000)
		colorDesert    (0.508, 0.396, 0.298, 1.000)
		colorLowland   (0.617, 0.517, 0.453, 1.000)
		colorUpland    (0.646, 0.568, 0.512, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.617, 0.517, 0.453, 1.000)
		colorUpPlants  (0.646, 0.568, 0.512, 1.000)
		BumpHeight      19.5657
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
		SemiMajorAxis   0.00121755
		Period          0.00471282
		Eccentricity    0.0419751
		Inclination     -0.202891
		AscendingNode   -36.4053
		ArgOfPericenter 176.717
		MeanAnomaly     -89.6562
	}
}

Moon	"Jakku System 8.3"
{
	ParentBody     "Jakku System 8"
	Class	       "IceWorld"

	Mass            0.000118793
	Radius          408.134
	InertiaMoment   0.398645

	Obliquity       0.854251
	EqAscendNode    175.716
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.801 0.729 0.620)

	Surface
	{
		SurfStyle       0.820524
		OceanStyle      0.34236
		Randomize      (-0.067, 0.909, -0.047)
		colorDistMagn   0.0632333
		colorDistFreq   54.5563
		detailScale     1049.74
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.0887919
		snowLevel       2
		tropicLatitude  0.00109183
		icecapLatitude  0.473043
		icecapHeight    0.108697
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7287
		venusFreq       1.18425
		venusMagn       0
		mareFreq        0
		mareDensity     0.000137239
		terraceProb     0.108773
		erosion         0
		montesMagn      0.0630248
		montesFreq      19.1684
		montesSpiky     0.877952
		montesFraction  0.625161
		dunesMagn       0.0343933
		dunesFreq       540.729
		dunesFraction   0.979196
		hillsMagn       0.116309
		hillsFreq       50.0765
		hillsFraction   0.93734
		hills2Fraction  0.0859997
		riversMagn      60.4269
		riversFreq      3.73262
		riversSin       4.25554
		riversOctaves   0
		canyonsMagn     0.308679
		canyonsFreq     0.124346
		canyonFraction  0
		cracksMagn      0.0416969
		cracksFreq      0.219128
		cracksOctaves   0
		craterMagn      0.526548
		craterFreq      0.72328
		craterDensity   0.908523
		craterOctaves   9
		craterRayedFactor 0.0715096
		volcanoMagn     0.146626
		volcanoFreq     0.732551
		volcanoDensity  0.218171
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.221509
		volcanoRadius   0.162344
		volcanoTemp     1499.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.801, 0.547, 0.356, 0.000)
		colorShelf     (0.761, 0.519, 0.338, 0.000)
		colorBeach     (0.400, 0.274, 0.178, 0.000)
		colorDesert    (0.681, 0.465, 0.302, 0.000)
		colorLowland   (0.649, 0.481, 0.338, 0.000)
		colorUpland    (0.745, 0.508, 0.331, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.649, 0.481, 0.338, 0.000)
		colorUpPlants  (0.745, 0.508, 0.331, 0.000)
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
		SemiMajorAxis   0.00186852
		Period          0.00895981
		Eccentricity    0.0339211
		Inclination     0.854251
		AscendingNode   175.716
		ArgOfPericenter -95.6053
		MeanAnomaly     129.835
	}
}

Moon	"Jakku System 8.4"
{
	ParentBody     "Jakku System 5"
	Class	       "IceWorld"

	Mass            0.000155128
	Radius          473.786
	InertiaMoment   0.397993

	Obliquity       0.543307
	EqAscendNode    74.3169
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.417 0.412 0.410)

	Surface
	{
		SurfStyle       0.636799
		OceanStyle      0.940349
		Randomize      (-0.310, 0.817, -0.101)
		colorDistMagn   0.0590028
		colorDistFreq   65.3603
		detailScale     1218.6
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.170694
		snowLevel       2
		tropicLatitude  0.0151126
		icecapLatitude  0.840867
		icecapHeight    0.184346
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.94593
		venusFreq       0.943279
		venusMagn       0
		mareFreq        0
		mareDensity     0.000129658
		terraceProb     0.420181
		erosion         0
		montesMagn      0.0611566
		montesFreq      15.2939
		montesSpiky     0.937662
		montesFraction  0.739337
		dunesMagn       0.0475405
		dunesFreq       628.762
		dunesFraction   0.0235575
		hillsMagn       0.128473
		hillsFreq       44.951
		hillsFraction   0.268612
		hills2Fraction  0.0179423
		riversMagn      62.6226
		riversFreq      3.54768
		riversSin       7.0799
		riversOctaves   0
		canyonsMagn     0.468114
		canyonsFreq     0.155631
		canyonFraction  0
		cracksMagn      0.0336442
		cracksFreq      0.256456
		cracksOctaves   0
		craterMagn      0.613227
		craterFreq      1.35332
		craterDensity   0.85075
		craterOctaves   9
		craterRayedFactor 0
		volcanoMagn     0.181484
		volcanoFreq     0.74045
		volcanoDensity  0.193233
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.279695
		volcanoRadius   0.153332
		volcanoTemp     1674.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.108, 0.078, 0.045, 1.000)
		colorShelf     (0.142, 0.107, 0.066, 1.000)
		colorBeach     (0.229, 0.140, 0.070, 0.200)
		colorDesert    (0.250, 0.157, 0.082, 0.200)
		colorLowland   (0.271, 0.165, 0.086, 0.200)
		colorUpland    (0.292, 0.198, 0.103, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.271, 0.165, 0.086, 0.200)
		colorUpPlants  (0.292, 0.198, 0.103, 0.200)
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
		SemiMajorAxis   0.00286754
		Period          0.017034
		Eccentricity    0.0413457
		Inclination     0.543307
		AscendingNode   74.3169
		ArgOfPericenter 72.5467
		MeanAnomaly     -82.8386
	}
}

Moon	"Jakku System 5.5"
{
	ParentBody     "Jakku System 5"
	Class	       "IceWorld"

	Mass            0.000196816
	Radius          482.678
	InertiaMoment   0.396997

	Obliquity       0.215732
	EqAscendNode    -120.754
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.798 0.667 0.532)

	Surface
	{
		SurfStyle       0.631371
		OceanStyle      0.820436
		Randomize      (-0.065, 0.552, 0.456)
		colorDistMagn   0.0642344
		colorDistFreq   49.1841
		detailScale     1241.47
		colorConversion true
		drivenDarkening 0.505061
		seaLevel        0.171127
		snowLevel       2
		tropicLatitude  0.00371863
		icecapLatitude  0.522937
		icecapHeight    0.213724
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71221
		venusFreq       1.37172
		venusMagn       0
		mareFreq        0
		mareDensity     0.000182069
		terraceProb     0.253947
		erosion         0
		montesMagn      0.0759207
		montesFreq      16.2981
		montesSpiky     0.903839
		montesFraction  0.876473
		dunesMagn       0.0415804
		dunesFreq       648.813
		dunesFraction   0.474675
		hillsMagn       0.122856
		hillsFreq       43.1455
		hillsFraction   0.6078
		hills2Fraction  0.107872
		riversMagn      49.7184
		riversFreq      3.48982
		riversSin       6.9203
		riversOctaves   0
		canyonsMagn     0.483499
		canyonsFreq     0.111618
		canyonFraction  0
		cracksMagn      0.0201254
		cracksFreq      0.228492
		cracksOctaves   0
		craterMagn      0.688183
		craterFreq      1.49415
		craterDensity   0.923927
		craterOctaves   9
		craterRayedFactor 0.0774425
		volcanoMagn     0.158
		volcanoFreq     0.583148
		volcanoDensity  0.172316
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.119129
		volcanoRadius   0.164642
		volcanoTemp     1762.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.127, 0.059, 1.000)
		colorShelf     (0.271, 0.173, 0.085, 1.000)
		colorBeach     (0.439, 0.227, 0.091, 0.200)
		colorDesert    (0.479, 0.253, 0.106, 0.200)
		colorLowland   (0.519, 0.267, 0.112, 0.200)
		colorUpland    (0.558, 0.320, 0.133, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.519, 0.267, 0.112, 0.200)
		colorUpPlants  (0.558, 0.320, 0.133, 0.200)
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
		SemiMajorAxis   0.00440069
		Period          0.0323842
		Eccentricity    0.0417116
		Inclination     0.215732
		AscendingNode   -120.754
		ArgOfPericenter -163.88
		MeanAnomaly     -145.67
	}
}

Moon	"Jakku System 5.6"
{
	ParentBody     "Jakku System 5"
	Class	       "IceWorld"

	Mass            0.00244494
	Radius          1181.78
	InertiaMoment   0.399876

	Obliquity       1.49475
	EqAscendNode    99.8442
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.617 0.559 0.484)

	Surface
	{
		SurfStyle       0.822933
		OceanStyle      0.311554
		Randomize      (-0.391, 0.825, -0.824)
		colorDistMagn   0.0509109
		colorDistFreq   140.206
		detailScale     3039.61
		colorConversion true
		drivenDarkening 0.329103
		seaLevel        0.221651
		snowLevel       2
		tropicLatitude  0.0335839
		icecapLatitude  0.55603
		icecapHeight    0.244028
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84034
		venusFreq       1.62223
		venusMagn       0
		mareFreq        0.331695
		mareDensity     0.000720097
		terraceProb     0.372241
		erosion         0
		montesMagn      0.0555341
		montesFreq      49.6742
		montesSpiky     0.940141
		montesFraction  0.673242
		dunesMagn       0.0359769
		dunesFreq       1556.66
		dunesFraction   0.413984
		hillsMagn       0.129035
		hillsFreq       158.037
		hillsFraction   0.474512
		hills2Fraction  0.279914
		riversMagn      58.9707
		riversFreq      2.90993
		riversSin       5.43326
		riversOctaves   0
		canyonsMagn     0.521366
		canyonsFreq     0.408274
		canyonFraction  0
		cracksMagn      0.0685903
		cracksFreq      0.582789
		cracksOctaves   0
		craterMagn      0.600641
		craterFreq      2.20143
		craterDensity   0.849456
		craterOctaves   10
		craterRayedFactor 0.221252
		volcanoMagn     0.17021
		volcanoFreq     0.610165
		volcanoDensity  0.194995
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.176511
		volcanoRadius   0.154171
		volcanoTemp     1518.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.617, 0.419, 0.278, 0.000)
		colorShelf     (0.586, 0.398, 0.264, 0.000)
		colorBeach     (0.309, 0.210, 0.139, 0.000)
		colorDesert    (0.525, 0.356, 0.236, 0.000)
		colorLowland   (0.500, 0.369, 0.264, 0.000)
		colorUpland    (0.574, 0.389, 0.259, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.500, 0.369, 0.264, 0.000)
		colorUpPlants  (0.574, 0.389, 0.259, 0.000)
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
		SemiMajorAxis   0.00675355
		Period          0.0615648
		Eccentricity    0.0207167
		Inclination     1.49475
		AscendingNode   99.8442
		ArgOfPericenter -87.2451
		MeanAnomaly     45.2775
	}
}

Moon	"Jakku System 5.7"
{
	ParentBody     "Jakku System 5"
	Class	       "IceWorld"

	Mass            0.000298898
	Radius          554.513
	InertiaMoment   0.399411

	Obliquity       0.171514
	EqAscendNode    -40.4233
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.621 0.415 0.329)

	Surface
	{
		SurfStyle       0.567091
		OceanStyle      0.622521
		Randomize      (-0.994, 0.945, 0.357)
		colorDistMagn   0.0491548
		colorDistFreq   76.8632
		detailScale     1426.24
		colorConversion true
		drivenDarkening 0.214447
		seaLevel        0.210675
		snowLevel       2
		tropicLatitude  0.00562052
		icecapLatitude  0.682057
		icecapHeight    0.235157
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79804
		venusFreq       0.8197
		venusMagn       0
		mareFreq        0
		mareDensity     0.000265541
		terraceProb     0.621479
		erosion         0
		montesMagn      0.0559716
		montesFreq      33.4608
		montesSpiky     0.991778
		montesFraction  0.466512
		dunesMagn       0.0278866
		dunesFreq       714.368
		dunesFraction   0.525461
		hillsMagn       0.113232
		hillsFreq       67.0328
		hillsFraction   0.721364
		hills2Fraction  0.106925
		riversMagn      52.9432
		riversFreq      1.65467
		riversSin       7.06316
		riversOctaves   0
		canyonsMagn     0.552068
		canyonsFreq     0.217646
		canyonFraction  0
		cracksMagn      0.056786
		cracksFreq      0.223064
		cracksOctaves   0
		craterMagn      0.623778
		craterFreq      1.77817
		craterDensity   0.834149
		craterOctaves   9
		craterRayedFactor 0.159551
		volcanoMagn     0.173863
		volcanoFreq     0.815645
		volcanoDensity  0.185074
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.221352
		volcanoRadius   0.169336
		volcanoTemp     1413.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.104, 0.072, 0.000)
		colorShelf     (0.230, 0.129, 0.092, 0.000)
		colorBeach     (0.348, 0.195, 0.138, 0.200)
		colorDesert    (0.316, 0.183, 0.122, 0.500)
		colorLowland   (0.242, 0.141, 0.092, 0.800)
		colorUpland    (0.410, 0.249, 0.171, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.242, 0.141, 0.092, 0.800)
		colorUpPlants  (0.410, 0.249, 0.171, 1.000)
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
		SemiMajorAxis   0.0103644
		Period          0.117049
		Eccentricity    0.0219126
		Inclination     0.171514
		AscendingNode   -40.4233
		ArgOfPericenter -52.1124
		MeanAnomaly     -144.743
	}
}

DwarfMoon	"Jakku System 5.D3"
{
	ParentBody     "Jakku System 5"
	Class	       "Asteroid"

	Mass            1.30227e-009
	Radius          14.7079
	InertiaMoment   0.399103

	RotationPeriod  1033.99
	Obliquity       10.8251
	EqAscendNode    60.0053

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.485 0.479)

	Surface
	{
		SurfStyle       0.118863
		OceanStyle      0.154535
		Randomize      (0.398, 0.938, 0.662)
		colorDistMagn   0.352766
		colorDistFreq   0.138269
		detailScale     401.622
		colorConversion true
		snowLevel       2
		tropicLatitude  0.46258
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440487
		terraceProb     0.461645
		erosion         0
		montesMagn      0.417818
		montesFreq      2.56116
		montesSpiky     0.733989
		montesFraction  0.490895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.564448
		hillsFraction   0.748964
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243119
		craterFreq      0.201763
		craterDensity   1.00229
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474527
		volcanoTemp     1769.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.192, 0.000)
		colorShelf     (0.208, 0.206, 0.204, 0.000)
		colorBeach     (0.220, 0.218, 0.216, 0.000)
		colorDesert    (0.232, 0.231, 0.228, 0.000)
		colorLowland   (0.245, 0.243, 0.240, 0.000)
		colorUpland    (0.257, 0.255, 0.252, 0.000)
		colorRock      (0.269, 0.267, 0.263, 0.000)
		colorSnow      (0.281, 0.279, 0.275, 1.000)
		BumpHeight      13.2371
		BumpOffset      2.64741
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.060121
		Period          1.63528
		Eccentricity    0.450967
		Inclination     19.8608
		AscendingNode   54.33
		ArgOfPericenter -88.5136
		MeanAnomaly     -105.355
	}
}

DwarfMoon	"Jakku System 5.D4"
{
	ParentBody     "Jakku System 5"
	Class	       "Asteroid"

	Mass            1.84816e-009
	Radius          20.0609
	InertiaMoment   0.394223

	RotationPeriod  1166.08
	Obliquity       -80.0247
	EqAscendNode    -174.303

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.663 0.661)

	Surface
	{
		SurfStyle       0.148944
		OceanStyle      0.658111
		Randomize      (-0.805, -0.734, -0.231)
		colorDistMagn   0.256783
		colorDistFreq   0.290275
		detailScale     547.797
		colorConversion true
		snowLevel       2
		tropicLatitude  0.458003
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486159
		terraceProb     0.181895
		erosion         0
		montesMagn      0.561492
		montesFreq      2.91642
		montesSpiky     0.885412
		montesFraction  0.594971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.04041
		hillsFraction   0.690109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279525
		craterFreq      0.226694
		craterDensity   0.943216
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464598
		volcanoTemp     1622.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.265, 0.264, 0.000)
		colorShelf     (0.283, 0.282, 0.281, 0.000)
		colorBeach     (0.299, 0.298, 0.298, 0.000)
		colorDesert    (0.316, 0.315, 0.314, 0.000)
		colorLowland   (0.333, 0.331, 0.331, 0.000)
		colorUpland    (0.349, 0.348, 0.347, 0.000)
		colorRock      (0.366, 0.364, 0.364, 0.000)
		colorSnow      (0.383, 0.381, 0.380, 1.000)
		BumpHeight      18.0548
		BumpOffset      3.61097
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0605938
		Period          1.65461
		Eccentricity    0.417255
		Inclination     -53.1238
		AscendingNode   -175.134
		ArgOfPericenter -113.38
		MeanAnomaly     -70.2651
	}
}

DwarfMoon	"Jakku System 8.D5"
{
	ParentBody     "Jakku System 8"
	Class	       "Asteroid"

	Mass            2.59625e-009
	Radius          20.3029
	InertiaMoment   0.398146

	RotationPeriod  1005.16
	Obliquity       -121.238
	EqAscendNode    -66.4904

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.729 0.700)

	Surface
	{
		SurfStyle       0.326739
		OceanStyle      0.766006
		Randomize      (0.753, -0.610, 0.627)
		colorDistMagn   0.278804
		colorDistFreq   0.147566
		detailScale     554.404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.876518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593534
		terraceProb     0.183437
		erosion         0
		montesMagn      0.465133
		montesFreq      2.8059
		montesSpiky     0.808151
		montesFraction  0.708628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15799
		hillsFraction   0.510211
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274027
		craterFreq      0.20497
		craterDensity   0.874892
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485061
		volcanoTemp     1593.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.292, 0.280, 0.000)
		colorShelf     (0.325, 0.310, 0.298, 0.000)
		colorBeach     (0.344, 0.328, 0.315, 0.000)
		colorDesert    (0.363, 0.346, 0.333, 0.000)
		colorLowland   (0.382, 0.365, 0.350, 0.000)
		colorUpland    (0.401, 0.383, 0.368, 0.000)
		colorRock      (0.421, 0.401, 0.385, 0.000)
		colorSnow      (0.440, 0.419, 0.403, 1.000)
		BumpHeight      18.2726
		BumpOffset      3.65452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0609878
		Period          1.67078
		Eccentricity    0.0724158
		Inclination     -73.2281
		AscendingNode   -66.0959
		ArgOfPericenter 86.2965
		MeanAnomaly     32.541
	}
}

Planet	"Jakku System 9"
{
	ParentBody     "Jakku System"
	Class	       "IceGiant"

	Mass            24.0762
	Radius          22905
	InertiaMoment   0.206954

	Oblateness      0.0304468

	RotationPeriod  8.87964
	Obliquity       -170.913
	EqAscendNode    -119.761

	AlbedoBond      0.421507
	AlbedoGeom      0.505808
	Brightness      2

	Surface
	{
		SurfStyle       0.80934
		Randomize      (0.111, -0.212, 0.326)
		detailScale     58913
		colorConversion true
		tropicLatitude  0.154633
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     9.37377
		stripeFluct     0.449136
		stripeTwist     11.4271
		cycloneMagn     8.95535
		cycloneFreq     0.815693
		cycloneDensity  0.423218
		cycloneOctaves  0
		colorLayer0    (0.190, 0.430, 0.850, 1.000)
		colorLayer1    (0.170, 0.450, 0.800, 1.000)
		colorLayer2    (0.180, 0.450, 0.830, 1.000)
		colorLayer3    (0.160, 0.460, 0.890, 1.000)
		colorLayer4    (0.180, 0.480, 0.860, 1.000)
		colorLayer5    (0.100, 0.450, 0.830, 1.000)
		colorLayer6    (0.190, 0.440, 0.860, 1.000)
		colorLayer7    (0.180, 0.430, 0.850, 1.000)
		colorLowPlants (0.180, 0.480, 0.860, 1.000)
		colorUpPlants  (0.100, 0.450, 0.830, 1.000)
		BumpHeight      14.6377
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          36.0781
		Velocity        1684.17
		BumpHeight      21.4413
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.31525
		mainOctaves     12
		Coverage        0.107533
		stripeZones     9.37377
		stripeFluct     0.449136
		stripeTwist     11.4271
	}

	Clouds
	{
		Height          57.5195
		Velocity        2358.69
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.31525
		mainOctaves     12
		Coverage        0.107533
		stripeZones     9.37377
		stripeFluct     0.449136
		stripeTwist     11.4271
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          229.05
		Density         4517.48
		Pressure        422443
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.570945
		Saturation      0.990783

		Composition
		{
			H2    	93.9052
			He    	6.05201
			N2    	0.0390723
			O2    	0.00167033
			Ne    	0.00118597
			Ar    	0.000769677
			CH4   	0.000109503
		}
	}

	Aurora
	{
		Height      170.424
		NorthLat    87.2792
		NorthLon    98.8271
		NorthRadius 5217.51
		NorthWidth  1383.45
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    279.86
		SouthRadius 4284.03
		SouthWidth  1540.16
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
		SemiMajorAxis   20.7215
		Period          86.7202
		Eccentricity    0.00335597
		Inclination     0.436492
		AscendingNode   -117.247
		ArgOfPericenter 214.276
		MeanAnomaly     87.2031
	}
}

DwarfMoon	"Jakku System 9.D1"
{
	ParentBody     "Jakku System 9"
	Class	       "Asteroid"

	Mass            5.18226e-008
	Radius          53.9641
	InertiaMoment   0.397062

	Oblateness      0.249

	Obliquity       0.0149187
	EqAscendNode    -111.848
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.621 0.572)

	Surface
	{
		SurfStyle       0.767691
		OceanStyle      0.596957
		Randomize      (0.267, 0.550, -0.691)
		colorDistMagn   0.762666
		colorDistFreq   1.70155
		detailScale     1473.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559494
		terraceProb     0.326305
		erosion         0
		montesMagn      0.569454
		montesFreq      2.67547
		montesSpiky     0.922139
		montesFraction  0.528472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.7882
		hillsFraction   0.71586
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266084
		craterFreq      0.244031
		craterDensity   0.930415
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476028
		volcanoTemp     1651.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.211, 0.160, 0.000)
		colorShelf     (0.276, 0.217, 0.183, 0.000)
		colorBeach     (0.325, 0.255, 0.217, 0.000)
		colorDesert    (0.352, 0.273, 0.212, 0.000)
		colorLowland   (0.387, 0.292, 0.240, 0.000)
		colorUpland    (0.428, 0.354, 0.292, 0.000)
		colorRock      (0.463, 0.385, 0.314, 0.000)
		colorSnow      (0.504, 0.410, 0.332, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000362835
		Period          0.000814607
		Eccentricity    4.93536e-006
		Inclination     0.0149187
		AscendingNode   -111.848
		ArgOfPericenter -60.2089
		MeanAnomaly     -43.677
	}
}

DwarfMoon	"Jakku System 9.D2"
{
	ParentBody     "Jakku System 9"
	Class	       "Asteroid"

	Mass            7.04559e-008
	Radius          57.3865
	InertiaMoment   0.398625

	Oblateness      0.249

	Obliquity       0.0127175
	EqAscendNode    44.2743
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.781 0.780)

	Surface
	{
		SurfStyle       0.58323
		OceanStyle      0.826529
		Randomize      (-0.353, 0.273, 0.519)
		colorDistMagn   0.947152
		colorDistFreq   0.60496
		detailScale     1567.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479692
		terraceProb     0.130768
		erosion         0
		montesMagn      0.605794
		montesFreq      4.58958
		montesSpiky     0.968968
		montesFraction  0.80011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.81444
		hillsFraction   0.564174
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25345
		craterFreq      0.155065
		craterDensity   0.955231
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49891
		volcanoTemp     1343.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.266, 0.218, 0.000)
		colorShelf     (0.313, 0.273, 0.250, 0.000)
		colorBeach     (0.368, 0.320, 0.297, 0.000)
		colorDesert    (0.399, 0.344, 0.289, 0.000)
		colorLowland   (0.438, 0.367, 0.328, 0.000)
		colorUpland    (0.485, 0.445, 0.398, 0.000)
		colorRock      (0.524, 0.484, 0.429, 0.000)
		colorSnow      (0.571, 0.516, 0.453, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000407298
		Period          0.000968843
		Eccentricity    4.49255e-005
		Inclination     0.0127175
		AscendingNode   44.2743
		ArgOfPericenter -7.84629
		MeanAnomaly     -174.009
	}
}

DwarfMoon	"Jakku System 9.D3"
{
	ParentBody     "Jakku System 9"
	Class	       "Asteroid"

	Mass            9.60095e-008
	Radius          60.7565
	InertiaMoment   0.399601

	Oblateness      0.249

	Obliquity       0.0146706
	EqAscendNode    21.7952
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.669 0.667)

	Surface
	{
		SurfStyle       0.538414
		OceanStyle      0.442208
		Randomize      (-0.498, -0.239, 0.358)
		colorDistMagn   0.649921
		colorDistFreq   0.545635
		detailScale     1659.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365258
		terraceProb     0.512665
		erosion         0
		montesMagn      0.563595
		montesFreq      3.89203
		montesSpiky     0.839722
		montesFraction  0.365598
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.1918
		hillsFraction   0.660726
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204439
		craterFreq      0.255926
		craterDensity   0.863615
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51983
		volcanoTemp     1623.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.227, 0.187, 0.000)
		colorShelf     (0.269, 0.234, 0.213, 0.000)
		colorBeach     (0.316, 0.274, 0.254, 0.000)
		colorDesert    (0.342, 0.294, 0.247, 0.000)
		colorLowland   (0.376, 0.314, 0.280, 0.000)
		colorUpland    (0.416, 0.381, 0.340, 0.000)
		colorRock      (0.450, 0.415, 0.367, 0.000)
		colorSnow      (0.490, 0.441, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000436625
		Period          0.00107535
		Eccentricity    6.66386e-005
		Inclination     0.0146706
		AscendingNode   21.7952
		ArgOfPericenter 51.5689
		MeanAnomaly     111.36
	}
}

Moon	"Jakku System 9.1"
{
	ParentBody     "Jakku System 9"
	Class	       "Selena"

	Mass            0.00301382
	Radius          1266.28
	InertiaMoment   0.398862

	Oblateness      0.0208495

	Obliquity       -1.34878
	EqAscendNode    -163.502
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.619 0.616 0.611)

	Surface
	{
		SurfStyle       0.591147
		OceanStyle      0.481044
		Randomize      (-0.302, 0.923, 0.435)
		colorDistMagn   0.0664216
		colorDistFreq   138.059
		detailScale     3256.95
		colorConversion true
		drivenDarkening 0
		seaLevel        0.244518
		snowLevel       2
		tropicLatitude  0.00675697
		icecapLatitude  10
		icecapHeight    0.184676
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87039
		venusFreq       1.5703
		venusMagn       0
		mareFreq        0.406395
		mareDensity     0.000977878
		terraceProb     0.44256
		erosion         0
		montesMagn      0.0732993
		montesFreq      71.4865
		montesSpiky     0.949748
		montesFraction  0.335813
		dunesMagn       0.0460791
		dunesFreq       1644.33
		dunesFraction   0.0057597
		hillsMagn       0.12371
		hillsFreq       121.743
		hillsFraction   0.401046
		hills2Fraction  0
		riversMagn      58.2046
		riversFreq      3.63006
		riversSin       4.22907
		riversOctaves   0
		canyonsMagn     0.384356
		canyonsFreq     0.48434
		canyonFraction  0.986935
		cracksMagn      0.0334077
		cracksFreq      0.354248
		cracksOctaves   0
		craterMagn      0.592992
		craterFreq      3.35636
		craterDensity   0.596538
		craterOctaves   7.57697
		craterRayedFactor 0.127563
		volcanoMagn     0.158306
		volcanoFreq     0.664552
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.0733431
		volcanoRadius   0.146008
		volcanoTemp     1241
		lavaCoverTidal  0.345761
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.384, 0.375, 0.330, 0.000)
		colorDesert    (0.402, 0.382, 0.336, 0.000)
		colorLowland   (0.315, 0.283, 0.257, 0.000)
		colorUpland    (0.464, 0.437, 0.379, 0.000)
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
		SemiMajorAxis   0.000660349
		Period          0.00199995
		Eccentricity    0.0243056
		Inclination     -1.34878
		AscendingNode   -163.502
		ArgOfPericenter 104.743
		MeanAnomaly     -109.708
	}
}

Moon	"Jakku System 9.2"
{
	ParentBody     "Jakku System 6"
	Class	       "Selena"

	Mass            0.0351632
	Radius          2664.29
	InertiaMoment   0.350607

	Oblateness      0.00200194

	Obliquity       -0.966646
	EqAscendNode    -57.7077
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.677 0.672 0.669)

	Surface
	{
		SurfStyle       0.657216
		OceanStyle      0.184803
		Randomize      (0.501, -0.854, 0.119)
		colorDistMagn   0.0703222
		colorDistFreq   391.392
		detailScale     6852.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.120725
		snowLevel       2
		tropicLatitude  0.0295489
		icecapLatitude  0.633925
		icecapHeight    0.153955
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76501
		venusFreq       0.375008
		venusMagn       0
		mareFreq        1.93449
		mareDensity     0.00589565
		terraceProb     0.486151
		erosion         0
		montesMagn      0.13164
		montesFreq      100.791
		montesSpiky     0.968163
		montesFraction  0.300357
		dunesMagn       0.0465727
		dunesFreq       3541.07
		dunesFraction   0.532348
		hillsMagn       0.142052
		hillsFreq       361.366
		hillsFraction   0.384578
		hills2Fraction  0
		riversMagn      56.7255
		riversFreq      3.42694
		riversSin       8.59246
		riversOctaves   0
		canyonsMagn     0.474635
		canyonsFreq     0.992194
		canyonFraction  0.530106
		cracksMagn      0.0676538
		cracksFreq      1.03493
		cracksOctaves   0
		craterMagn      0.649497
		craterFreq      6.85447
		craterDensity   0.67861
		craterOctaves   8.85759
		craterRayedFactor 0.0914121
		volcanoMagn     0.426631
		volcanoFreq     0.591753
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.309819
		volcanoRadius   0.453056
		volcanoTemp     1087.45
		lavaCoverTidal  0.290964
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.420, 0.410, 0.361, 0.000)
		colorDesert    (0.440, 0.417, 0.368, 0.000)
		colorLowland   (0.345, 0.309, 0.281, 0.000)
		colorUpland    (0.508, 0.477, 0.415, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999958
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
		Height          147.681
		Density         4.23314e-006
		Pressure        8.00563e-007
		Greenhouse      0.00210198
		Bright          1.33454
		Opacity         0
		SkyLight        0.444848
		Hue             0.0139394
		Saturation      1

		Composition
		{
			SO2   	91.3333
			CO2   	6.94569
			Kr    	1.01033
			Cl2   	0.58948
			Xe    	0.113921
			C3H8  	0.00723403
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00126041
		Period          0.00527033
		Eccentricity    0.0281514
		Inclination     -0.966646
		AscendingNode   -57.7077
		ArgOfPericenter -120.506
		MeanAnomaly     119.417
	}
}

Moon	"Jakku System 6.3"
{
	ParentBody     "Jakku System 6"
	Class	       "IceWorld"

	Mass            0.00411858
	Radius          1403.65
	InertiaMoment   0.392987

	Oblateness      0.00110862

	Obliquity       0.834712
	EqAscendNode    155.165
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.619 0.615 0.613)

	Surface
	{
		SurfStyle       0.436661
		OceanStyle      0.991892
		Randomize      (0.951, 0.503, -0.972)
		colorDistMagn   0.0655985
		colorDistFreq   182.211
		detailScale     3610.28
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.163293
		snowLevel       2
		tropicLatitude  0.00626255
		icecapLatitude  0.496192
		icecapHeight    0.197229
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67312
		venusFreq       0.592237
		venusMagn       0
		mareFreq        0.541202
		mareDensity     0.00109366
		terraceProb     0.174032
		erosion         0
		montesMagn      0.0627347
		montesFreq      49.7648
		montesSpiky     0.966677
		montesFraction  0.640853
		dunesMagn       0.0314983
		dunesFreq       1878.21
		dunesFraction   0.227718
		hillsMagn       0.105355
		hillsFreq       159.223
		hillsFraction   0.927797
		hills2Fraction  0.0228192
		riversMagn      60.0744
		riversFreq      3.85344
		riversSin       6.68713
		riversOctaves   0
		canyonsMagn     0.326626
		canyonsFreq     0.500365
		canyonFraction  0
		cracksMagn      0.0754911
		cracksFreq      0.300307
		cracksOctaves   1
		craterMagn      0.614216
		craterFreq      3.07822
		craterDensity   0.963667
		craterOctaves   11
		craterRayedFactor 0.123724
		volcanoMagn     0.190123
		volcanoFreq     0.861075
		volcanoDensity  0.194582
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.117728
		volcanoRadius   0.154137
		volcanoTemp     1557.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.619, 0.615, 0.613, 0.500)
		colorShelf     (0.588, 0.585, 0.582, 0.500)
		colorBeach     (0.433, 0.431, 0.429, 0.750)
		colorDesert    (0.526, 0.523, 0.521, 1.000)
		colorLowland   (0.545, 0.541, 0.539, 1.000)
		colorUpland    (0.576, 0.572, 0.570, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.545, 0.541, 0.539, 1.000)
		colorUpPlants  (0.576, 0.572, 0.570, 1.000)
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
		SemiMajorAxis   0.00174133
		Period          0.0085639
		Eccentricity    0.0111946
		Inclination     0.834712
		AscendingNode   155.165
		ArgOfPericenter -92.9894
		MeanAnomaly     92.7267
	}
}

Moon	"Jakku System 6.4"
{
	ParentBody     "Jakku System 6"
	Class	       "IceWorld"

	Mass            0.00484758
	Radius          1393.72
	InertiaMoment   0.387308

	Obliquity       -1.02934
	EqAscendNode    123.639
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.832 0.735 0.655)

	Surface
	{
		SurfStyle       0.640385
		OceanStyle      0.634389
		Randomize      (-0.595, 0.493, -0.108)
		colorDistMagn   0.057117
		colorDistFreq   165.116
		detailScale     3584.73
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.209003
		snowLevel       2
		tropicLatitude  0.0169667
		icecapLatitude  0.606793
		icecapHeight    0.223436
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.66519
		venusFreq       1.02249
		venusMagn       0
		mareFreq        0.481809
		mareDensity     0.00157546
		terraceProb     0.210792
		erosion         0
		montesMagn      0.0664985
		montesFreq      48.8219
		montesSpiky     0.933521
		montesFraction  0.0195679
		dunesMagn       0.0316469
		dunesFreq       1837.07
		dunesFraction   0.503128
		hillsMagn       0.127425
		hillsFreq       189.693
		hillsFraction   0.254505
		hills2Fraction  0.216726
		riversMagn      56.2601
		riversFreq      2.36318
		riversSin       6.28644
		riversOctaves   0
		canyonsMagn     0.502586
		canyonsFreq     0.452578
		canyonFraction  0
		cracksMagn      0.0678998
		cracksFreq      0.549924
		cracksOctaves   0
		craterMagn      0.638225
		craterFreq      4.06338
		craterDensity   0.963005
		craterOctaves   11
		craterRayedFactor 0.186315
		volcanoMagn     0.191093
		volcanoFreq     0.682374
		volcanoDensity  0.218886
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.247964
		volcanoRadius   0.145152
		volcanoTemp     1602.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.140, 0.072, 1.000)
		colorShelf     (0.283, 0.191, 0.105, 1.000)
		colorBeach     (0.457, 0.250, 0.111, 0.200)
		colorDesert    (0.499, 0.279, 0.131, 0.200)
		colorLowland   (0.541, 0.294, 0.138, 0.200)
		colorUpland    (0.582, 0.353, 0.164, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.541, 0.294, 0.138, 0.200)
		colorUpPlants  (0.582, 0.353, 0.164, 0.200)
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
		SemiMajorAxis   0.00240576
		Period          0.0139065
		Eccentricity    0.0371005
		Inclination     -1.02934
		AscendingNode   123.639
		ArgOfPericenter -58.3058
		MeanAnomaly     29.6914
	}
}

Moon	"Jakku System 6.5"
{
	ParentBody     "Jakku System 6"
	Class	       "IceWorld"

	Mass            0.00574033
	Radius          1565.83
	InertiaMoment   0.3899

	Obliquity       0.881055
	EqAscendNode    169.246
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.435 0.432 0.427)

	Surface
	{
		SurfStyle       0.773622
		OceanStyle      0.675365
		Randomize      (0.478, 0.536, 0.088)
		colorDistMagn   0.0562404
		colorDistFreq   218.36
		detailScale     4027.39
		colorConversion true
		drivenDarkening 0.644929
		seaLevel        0.2054
		snowLevel       2
		tropicLatitude  0.00288871
		icecapLatitude  0.881329
		icecapHeight    0.209606
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.59592
		venusFreq       1.05287
		venusMagn       0.183537
		mareFreq        0.680937
		mareDensity     0.00131839
		terraceProb     0.168821
		erosion         0
		montesMagn      0.0634903
		montesFreq      52.8392
		montesSpiky     0.938775
		montesFraction  0.087627
		dunesMagn       0.0452842
		dunesFreq       2063.42
		dunesFraction   0.585587
		hillsMagn       0.116406
		hillsFreq       189.314
		hillsFraction   0.877905
		hills2Fraction  0.0761884
		riversMagn      58.6411
		riversFreq      3.88292
		riversSin       5.41106
		riversOctaves   0
		canyonsMagn     0.487198
		canyonsFreq     0.540318
		canyonFraction  0
		cracksMagn      0.045554
		cracksFreq      0.759887
		cracksOctaves   1
		craterMagn      0.572155
		craterFreq      5.03543
		craterDensity   0.852959
		craterOctaves   11
		craterRayedFactor 0.0510626
		volcanoMagn     0.213229
		volcanoFreq     0.675481
		volcanoDensity  0.274385
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.333208
		volcanoRadius   0.220384
		volcanoTemp     1446.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.277, 0.286, 0.250)
		colorShelf     (0.305, 0.315, 0.324, 0.250)
		colorBeach     (0.248, 0.233, 0.247, 0.200)
		colorDesert    (0.231, 0.212, 0.218, 0.200)
		colorLowland   (0.170, 0.164, 0.179, 0.200)
		colorUpland    (0.322, 0.320, 0.324, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.170, 0.164, 0.179, 0.200)
		colorUpPlants  (0.322, 0.320, 0.324, 0.250)
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
		SemiMajorAxis   0.0033237
		Period          0.0225822
		Eccentricity    0.0452396
		Inclination     0.881055
		AscendingNode   169.246
		ArgOfPericenter 123.335
		MeanAnomaly     -136.369
	}
}

Moon	"Jakku System 6.6"
{
	ParentBody     "Jakku System 6"
	Class	       "IceWorld"

	Mass            0.00684881
	Radius          1561.47
	InertiaMoment   0.385146

	Obliquity       -0.872994
	EqAscendNode    -72.8105
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.606 0.600 0.593)

	Surface
	{
		SurfStyle       0.426961
		OceanStyle      0.315945
		Randomize      (0.288, 0.033, -0.003)
		colorDistMagn   0.0943718
		colorDistFreq   227.386
		detailScale     4016.19
		colorConversion true
		drivenDarkening 0.466812
		seaLevel        0.162623
		snowLevel       2
		tropicLatitude  0.0245243
		icecapLatitude  0.474007
		icecapHeight    0.190485
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.60598
		venusFreq       0.783449
		venusMagn       0
		mareFreq        0.735974
		mareDensity     0.00146132
		terraceProb     0.30913
		erosion         0
		montesMagn      0.0785727
		montesFreq      65.8081
		montesSpiky     0.958952
		montesFraction  0.757215
		dunesMagn       0.0529818
		dunesFreq       2023.03
		dunesFraction   0.325697
		hillsMagn       0.14295
		hillsFreq       185.188
		hillsFraction   0.754248
		hills2Fraction  0.234499
		riversMagn      52.7068
		riversFreq      4.58192
		riversSin       6.38392
		riversOctaves   0
		canyonsMagn     0.472263
		canyonsFreq     0.613956
		canyonFraction  0
		cracksMagn      0.0315968
		cracksFreq      0.787164
		cracksOctaves   1
		craterMagn      0.651077
		craterFreq      5.10709
		craterDensity   0.889748
		craterOctaves   11
		craterRayedFactor 0.127776
		volcanoMagn     0.203793
		volcanoFreq     0.769946
		volcanoDensity  0.150712
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.187216
		volcanoRadius   0.129351
		volcanoTemp     1400.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.606, 0.600, 0.593, 0.500)
		colorShelf     (0.575, 0.570, 0.564, 0.500)
		colorBeach     (0.424, 0.420, 0.415, 0.750)
		colorDesert    (0.515, 0.510, 0.504, 1.000)
		colorLowland   (0.533, 0.528, 0.522, 1.000)
		colorUpland    (0.563, 0.558, 0.552, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.533, 0.528, 0.522, 1.000)
		colorUpPlants  (0.563, 0.558, 0.552, 1.000)
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
		SemiMajorAxis   0.00459188
		Period          0.0366699
		Eccentricity    0.0267938
		Inclination     -0.872994
		AscendingNode   -72.8105
		ArgOfPericenter 95.1504
		MeanAnomaly     -89.6193
	}
}

Moon	"Jakku System 9.7"
{
	ParentBody     "Jakku System 9"
	Class	       "IceWorld"

	Mass            0.0082483
	Radius          1763.98
	InertiaMoment   0.380441

	Obliquity       0.738371
	EqAscendNode    104.702
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.645 0.491 0.334)

	Surface
	{
		SurfStyle       0.754473
		OceanStyle      0.582452
		Randomize      (-0.050, 0.307, 0.009)
		colorDistMagn   0.0703695
		colorDistFreq   217.795
		detailScale     4537.06
		colorConversion true
		drivenDarkening 0.337888
		seaLevel        0.206281
		snowLevel       2
		tropicLatitude  0.0157423
		icecapLatitude  0.569242
		icecapHeight    0.237784
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.64681
		venusFreq       1.39382
		venusMagn       0
		mareFreq        1.01195
		mareDensity     0.00174967
		terraceProb     0.171988
		erosion         0
		montesMagn      0.0876841
		montesFreq      85.9771
		montesSpiky     0.907538
		montesFraction  0.398527
		dunesMagn       0.0498953
		dunesFreq       2278.26
		dunesFraction   0.0281594
		hillsMagn       0.128702
		hillsFreq       217.606
		hillsFraction   0.243109
		hills2Fraction  0.0478997
		riversMagn      61.0407
		riversFreq      4.23141
		riversSin       6.72565
		riversOctaves   0
		canyonsMagn     0.299639
		canyonsFreq     0.763259
		canyonFraction  0
		cracksMagn      0.0765413
		cracksFreq      0.985947
		cracksOctaves   2
		craterMagn      0.572053
		craterFreq      3.68582
		craterDensity   0.899665
		craterOctaves   11
		craterRayedFactor 0.132904
		volcanoMagn     0.276921
		volcanoFreq     0.638754
		volcanoDensity  0.208314
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.340596
		volcanoRadius   0.215555
		volcanoTemp     1234.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.413, 0.314, 0.224, 0.250)
		colorShelf     (0.451, 0.359, 0.254, 0.250)
		colorBeach     (0.367, 0.265, 0.194, 0.200)
		colorDesert    (0.342, 0.241, 0.170, 0.200)
		colorLowland   (0.251, 0.187, 0.140, 0.200)
		colorUpland    (0.477, 0.363, 0.254, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.251, 0.187, 0.140, 0.200)
		colorUpPlants  (0.477, 0.363, 0.254, 0.250)
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
		SemiMajorAxis   0.00634396
		Period          0.0595459
		Eccentricity    0.0184521
		Inclination     0.738371
		AscendingNode   104.702
		ArgOfPericenter -45.9258
		MeanAnomaly     37.7201
	}
}

Planet	"Jakku System 7"
{
	ParentBody     "Jakku System"
	Class	       "IceWorld"

	Mass            0.0548378
	Radius          3076.01
	InertiaMoment   0.342039

	Oblateness      0.00395923

	RotationPeriod  32.122
	Obliquity       -48.8174
	EqAscendNode    -53.4805

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.656 0.651 0.643)

	Surface
	{
		SurfStyle       0.318159
		OceanStyle      0.541227
		Randomize      (0.166, -0.906, -0.233)
		colorDistMagn   0.0837056
		colorDistFreq   375.972
		detailScale     7911.67
		colorConversion true
		drivenDarkening 0
		seaLevel        0.243003
		snowLevel       2
		tropicLatitude  0.743932
		icecapLatitude  1
		icecapHeight    0.243003
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.60446
		venusFreq       0.604536
		venusMagn       0
		mareFreq        1.5099
		mareDensity     0.00581523
		terraceProb     0.225468
		erosion         0
		montesMagn      0.237631
		montesFreq      184.483
		montesSpiky     0.964524
		montesFraction  0.628421
		dunesMagn       0.0410479
		dunesFreq       4106.3
		dunesFraction   0.341786
		hillsMagn       0.115061
		hillsFreq       293.82
		hillsFraction   0.771132
		hills2Fraction  0.208872
		riversMagn      60.5664
		riversFreq      3.54153
		riversSin       4.72855
		riversOctaves   0
		canyonsMagn     0.544208
		canyonsFreq     1.04294
		canyonFraction  0
		cracksMagn      0.0690312
		cracksFreq      0.969717
		cracksOctaves   3
		craterMagn      0.641155
		craterFreq      9.92597
		craterDensity   0.997249
		craterOctaves   12
		craterRayedFactor 0.128119
		volcanoMagn     0.618494
		volcanoFreq     0.549485
		volcanoDensity  0.253571
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.23769
		volcanoRadius   0.474635
		volcanoTemp     1459.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.656, 0.651, 0.643, 0.500)
		colorShelf     (0.623, 0.618, 0.611, 0.500)
		colorBeach     (0.459, 0.456, 0.450, 0.750)
		colorDesert    (0.557, 0.553, 0.547, 1.000)
		colorLowland   (0.577, 0.573, 0.566, 1.000)
		colorUpland    (0.610, 0.605, 0.598, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.577, 0.573, 0.566, 1.000)
		colorUpPlants  (0.610, 0.605, 0.598, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.99998
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
		Height          107.946
		Density         2.0216e-006
		Pressure        2.38984e-007
		Greenhouse      0.00135794
		Bright          1.15117
		Opacity         0
		SkyLight        0.383723
		Hue             -0.0401414
		Saturation      1

		Composition
		{
			Ar    	52.096
			O2    	47.904
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.0744
		Period          174.88
		Eccentricity    0.0653805
		Inclination     1.26725
		AscendingNode   -53.2636
		ArgOfPericenter 299.818
		MeanAnomaly     280.693
	}
}

Comet	"Jakku System C1"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            6.66508e-013
	Radius          1.29535
	InertiaMoment   0.398638

	Oblateness      0.00244321

	RotationPeriod  112.625
	Obliquity       141.706
	EqAscendNode    147.218

	AbsMagn         9.28661
	SlopeParam      2.76102
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.592 0.587 0.582)

	Surface
	{
		SurfStyle       0.536201
		OceanStyle      0.138902
		Randomize      (-0.806, -0.268, -0.850)
		colorDistMagn   0.25177
		colorDistFreq   0.00132345
		detailScale     35.3716
		colorConversion true
		snowLevel       2
		tropicLatitude  0.85761
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311955
		terraceProb     0.348071
		erosion         0
		montesMagn      0.399421
		montesFreq      2.1312
		montesSpiky     0.776491
		montesFraction  0.441093
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00325623
		hillsFraction   0.828787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252776
		craterFreq      0.245515
		craterDensity   1.06972
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498933
		volcanoTemp     1323.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.200, 0.163, 0.000)
		colorShelf     (0.237, 0.205, 0.186, 0.000)
		colorBeach     (0.278, 0.241, 0.221, 0.000)
		colorDesert    (0.302, 0.258, 0.215, 0.000)
		colorLowland   (0.332, 0.276, 0.244, 0.000)
		colorUpland    (0.367, 0.334, 0.297, 0.000)
		colorRock      (0.397, 0.364, 0.320, 0.000)
		colorSnow      (0.432, 0.387, 0.337, 1.000)
		BumpHeight      1.16581
		BumpOffset      0.233162
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.359446
		GasToDust   0.25
		Particles   1705
		GasBright   0.067071
		DustBright  0.191287
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.1812
		Period          144.929
		Eccentricity    0.951133
		Inclination     22.8729
		AscendingNode   150.111
		ArgOfPericenter 162.148
		MeanAnomaly     39.4291
	}
}

Comet	"Jakku System C2"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.15496e-009
	Radius          23.4129
	InertiaMoment   0.396491

	Oblateness      0.00212489

	RotationPeriod  105.098
	Obliquity       94.9119
	EqAscendNode    131.795

	AbsMagn         5.76765
	SlopeParam      3.38837
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.608 0.605 0.603)

	Surface
	{
		SurfStyle       0.349869
		OceanStyle      0.251518
		Randomize      (0.096, -0.194, -0.882)
		colorDistMagn   0.68288
		colorDistFreq   0.294774
		detailScale     639.329
		colorConversion true
		snowLevel       2
		tropicLatitude  0.675854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479518
		terraceProb     0.35378
		erosion         0
		montesMagn      0.637199
		montesFreq      3.16629
		montesSpiky     0.941368
		montesFraction  0.517455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.18224
		hillsFraction   0.623947
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272248
		craterFreq      0.27451
		craterDensity   0.959114
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511506
		volcanoTemp     1573.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.242, 0.241, 0.000)
		colorShelf     (0.259, 0.257, 0.256, 0.000)
		colorBeach     (0.274, 0.272, 0.271, 0.000)
		colorDesert    (0.289, 0.287, 0.286, 0.000)
		colorLowland   (0.304, 0.302, 0.302, 0.000)
		colorUpland    (0.319, 0.317, 0.317, 0.000)
		colorRock      (0.335, 0.333, 0.332, 0.000)
		colorSnow      (0.350, 0.348, 0.347, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.840638
		GasToDust   0.25
		Particles   2678
		GasBright   0.236708
		DustBright  0.506137
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.4793
		Period          219.453
		Eccentricity    0.948888
		Inclination     -127.607
		AscendingNode   -179.629
		ArgOfPericenter -104.466
		MeanAnomaly     -130.341
	}
}

Comet	"Jakku System C3"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.58725e-016
	Radius          0.0802153
	InertiaMoment   0.399128

	Oblateness      0.00312932

	RotationPeriod  99.4664
	Obliquity       48.1176
	EqAscendNode    116.373

	AbsMagn         14.3248
	SlopeParam      3.95964
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.600 0.596)

	Surface
	{
		SurfStyle       0.725009
		OceanStyle      0.242131
		Randomize      (-0.297, -0.519, -0.801)
		colorDistMagn   0.129885
		colorDistFreq   4.92497e-006
		detailScale     2.19041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40762
		terraceProb     0.44483
		erosion         0
		montesMagn      0.630153
		montesFreq      2.77633
		montesSpiky     0.959873
		montesFraction  0.427026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.69181e-005
		hillsFraction   0.615379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244504
		craterFreq      0.239227
		craterDensity   1.02622
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533672
		volcanoTemp     1604.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.204, 0.167, 0.000)
		colorShelf     (0.241, 0.210, 0.191, 0.000)
		colorBeach     (0.283, 0.246, 0.227, 0.000)
		colorDesert    (0.307, 0.264, 0.221, 0.000)
		colorLowland   (0.337, 0.282, 0.250, 0.000)
		colorUpland    (0.373, 0.342, 0.304, 0.000)
		colorRock      (0.403, 0.372, 0.328, 0.000)
		colorSnow      (0.440, 0.396, 0.346, 1.000)
		BumpHeight      0.0721938
		BumpOffset      0.0144388
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.161401
		DustBright  0.26593
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.8104
		Period          93.6475
		Eccentricity    0.931988
		Inclination     102.166
		AscendingNode   -83.0485
		ArgOfPericenter 136.791
		MeanAnomaly     139.747
	}
}

Comet	"Jakku System C4"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.22763e-012
	Radius          1.4501
	InertiaMoment   0.397682

	Oblateness      0.00261324

	RotationPeriod  94.8713
	Obliquity       1.32333
	EqAscendNode    100.95

	AbsMagn         9.06871
	SlopeParam      4.52756
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.791 0.789 0.788)

	Surface
	{
		SurfStyle       0.82872
		OceanStyle      0.0710271
		Randomize      (0.906, 0.665, -0.561)
		colorDistMagn   0.498842
		colorDistFreq   0.00129007
		detailScale     39.5974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.348686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534223
		terraceProb     0.329807
		erosion         0
		montesMagn      0.486213
		montesFreq      3.37133
		montesSpiky     0.823374
		montesFraction  0.362463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00444096
		hillsFraction   0.569895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230355
		craterFreq      0.227924
		craterDensity   0.855889
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482754
		volcanoTemp     1978.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.268, 0.221, 0.000)
		colorShelf     (0.317, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.404, 0.347, 0.291, 0.000)
		colorLowland   (0.443, 0.371, 0.331, 0.000)
		colorUpland    (0.491, 0.450, 0.402, 0.000)
		colorRock      (0.530, 0.489, 0.433, 0.000)
		colorSnow      (0.578, 0.521, 0.457, 1.000)
		BumpHeight      1.30509
		BumpOffset      0.261018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.392272
		GasToDust   0.25
		Particles   1772
		GasBright   0.398228
		DustBright  0.513589
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.64
		Period          99.0412
		Eccentricity    0.99464
		Inclination     20.427
		AscendingNode   92.6456
		ArgOfPericenter -110.426
		MeanAnomaly     -104.924
	}
}

Comet	"Jakku System C5"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            9.4948e-009
	Radius          31.3425
	InertiaMoment   0.39957

	Oblateness      0.00373986

	RotationPeriod  90.9342
	Obliquity       314.529
	EqAscendNode    85.5277

	AbsMagn         5.51946
	SlopeParam      5.14261
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.568 0.502)

	Surface
	{
		SurfStyle       0.080716
		OceanStyle      0.0928359
		Randomize      (0.682, -0.557, -0.425)
		colorDistMagn   0.540942
		colorDistFreq   0.358591
		detailScale     855.858
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43199
		terraceProb     0.250924
		erosion         0
		montesMagn      0.698613
		montesFreq      2.31671
		montesSpiky     0.835873
		montesFraction  0.937107
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.60926
		hillsFraction   0.495473
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232736
		craterFreq      0.186697
		craterDensity   0.865758
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443023
		volcanoTemp     1507.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.227, 0.201, 0.000)
		colorShelf     (0.269, 0.241, 0.213, 0.000)
		colorBeach     (0.285, 0.256, 0.226, 0.000)
		colorDesert    (0.301, 0.270, 0.238, 0.000)
		colorLowland   (0.317, 0.284, 0.251, 0.000)
		colorUpland    (0.333, 0.298, 0.264, 0.000)
		colorRock      (0.349, 0.312, 0.276, 0.000)
		colorSnow      (0.364, 0.327, 0.289, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.873464
		GasToDust   0.25
		Particles   2744
		GasBright   0.295639
		DustBright  0.300665
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.7167
		Period          172.05
		Eccentricity    0.972954
		Inclination     -67.5919
		AscendingNode   -13.5235
		ArgOfPericenter -53.4299
		MeanAnomaly     -136.883
	}
}

Comet	"Jakku System C6"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.92352e-016
	Radius          0.0898128
	InertiaMoment   0.398364

	Oblateness      0.00307604

	RotationPeriod  87.4528
	Obliquity       267.735
	EqAscendNode    70.1051

	AbsMagn         13.6822
	SlopeParam      5.89399
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.479 0.474 0.466)

	Surface
	{
		SurfStyle       0.0751105
		OceanStyle      0.502679
		Randomize      (0.844, 0.523, -0.498)
		colorDistMagn   0.680546
		colorDistFreq   6.89315e-006
		detailScale     2.45249
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390535
		terraceProb     0.321429
		erosion         0
		montesMagn      0.491928
		montesFreq      2.76853
		montesSpiky     0.915603
		montesFraction  0.289388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.76041e-005
		hillsFraction   0.563569
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241445
		craterFreq      0.152538
		craterDensity   0.918339
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547791
		volcanoTemp     1384.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.190, 0.187, 0.000)
		colorShelf     (0.203, 0.201, 0.198, 0.000)
		colorBeach     (0.215, 0.213, 0.210, 0.000)
		colorDesert    (0.227, 0.225, 0.222, 0.000)
		colorLowland   (0.239, 0.237, 0.233, 0.000)
		colorUpland    (0.251, 0.249, 0.245, 0.000)
		colorRock      (0.263, 0.261, 0.257, 0.000)
		colorSnow      (0.275, 0.273, 0.268, 1.000)
		BumpHeight      0.0808315
		BumpOffset      0.0161663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0153962
		DustBright  0.265395
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.1866
		Period          191.897
		Eccentricity    0.968958
		Inclination     10.4426
		AscendingNode   -131.251
		ArgOfPericenter 13.9229
		MeanAnomaly     114.599
	}
}

Comet	"Jakku System C7"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.26113e-012
	Radius          1.94094
	InertiaMoment   0.399992

	Oblateness      0.00434588

	RotationPeriod  84.306
	Obliquity       220.94
	EqAscendNode    54.6825

	AbsMagn         8.85394
	SlopeParam      7.11386
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.726 0.725)

	Surface
	{
		SurfStyle       0.768265
		OceanStyle      0.668255
		Randomize      (0.230, 0.898, -0.737)
		colorDistMagn   0.724888
		colorDistFreq   0.00133512
		detailScale     53.0006
		colorConversion true
		snowLevel       2
		tropicLatitude  0.368196
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465691
		terraceProb     0.341168
		erosion         0
		montesMagn      0.495399
		montesFreq      2.95888
		montesSpiky     0.978513
		montesFraction  0.490435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011951
		hillsFraction   0.768979
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251216
		craterFreq      0.255078
		craterDensity   0.800959
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453624
		volcanoTemp     1248.03
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
		BumpHeight      1.74685
		BumpOffset      0.349369
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.425098
		GasToDust   0.25
		Particles   1838
		GasBright   0.0871473
		DustBright  0.67813
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.3101
		Period          145.89
		Eccentricity    0.93539
		Inclination     -62.1475
		AscendingNode   5.35773
		ArgOfPericenter -114.004
		MeanAnomaly     159.24
	}
}

Comet	"Jakku System C8"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.74882e-008
	Radius          35.0974
	InertiaMoment   0.398894

	Oblateness      0.00354789

	RotationPeriod  81.4147
	Obliquity       174.146
	EqAscendNode    39.2599

	AbsMagn         5.26132
	SlopeParam      2.39401
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.547 0.544)

	Surface
	{
		SurfStyle       0.855464
		OceanStyle      0.215346
		Randomize      (-0.192, -0.700, 0.120)
		colorDistMagn   0.671975
		colorDistFreq   0.67719
		detailScale     958.393
		colorConversion true
		snowLevel       2
		tropicLatitude  0.687248
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450786
		terraceProb     0.431924
		erosion         0
		montesMagn      0.24907
		montesFreq      2.9408
		montesSpiky     0.973119
		montesFraction  0.348372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75196
		hillsFraction   0.739346
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241131
		craterFreq      0.224886
		craterDensity   0.927695
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59208
		volcanoTemp     1539.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.191, 0.218, 0.050)
		colorShelf     (0.220, 0.224, 0.250, 0.040)
		colorBeach     (0.253, 0.257, 0.283, 0.030)
		colorDesert    (0.285, 0.290, 0.321, 0.020)
		colorLowland   (0.318, 0.323, 0.354, 0.030)
		colorUpland    (0.351, 0.356, 0.386, 0.050)
		colorRock      (0.384, 0.388, 0.430, 0.020)
		colorSnow      (0.384, 0.388, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.90629
		GasToDust   0.25
		Particles   2810
		GasBright   0.0777741
		DustBright  0.37199
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.055
		Period          101.777
		Eccentricity    0.927689
		Inclination     142.252
		AscendingNode   -15.5198
		ArgOfPericenter -48.8794
		MeanAnomaly     -115.824
	}
}

Comet	"Jakku System C9"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.38475e-016
	Radius          0.120198
	InertiaMoment   0.397216

	Oblateness      0.00491888

	RotationPeriod  78.7243
	Obliquity       127.352
	EqAscendNode    23.8373

	AbsMagn         13.1598
	SlopeParam      3.08171
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.702 0.615 0.557)

	Surface
	{
		SurfStyle       0.901393
		OceanStyle      0.870177
		Randomize      (-0.865, 0.191, -0.993)
		colorDistMagn   0.0229911
		colorDistFreq   8.34672e-006
		detailScale     3.28219
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999993
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32904
		terraceProb     0.365205
		erosion         0
		montesMagn      0.363673
		montesFreq      2.34768
		montesSpiky     0.869391
		montesFraction  0.498821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.63403e-005
		hillsFraction   0.587977
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.183524
		craterFreq      0.214646
		craterDensity   0.987916
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527192
		volcanoTemp     1436.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.215, 0.223, 0.050)
		colorShelf     (0.281, 0.252, 0.256, 0.040)
		colorBeach     (0.323, 0.289, 0.289, 0.030)
		colorDesert    (0.365, 0.326, 0.328, 0.020)
		colorLowland   (0.407, 0.363, 0.362, 0.030)
		colorUpland    (0.449, 0.400, 0.395, 0.050)
		colorRock      (0.491, 0.437, 0.440, 0.020)
		colorSnow      (0.491, 0.437, 0.440, 1.000)
		BumpHeight      0.108178
		BumpOffset      0.0216356
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.216716
		DustBright  0.717535
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.0149
		Period          115.026
		Eccentricity    0.959773
		Inclination     123.889
		AscendingNode   58.7756
		ArgOfPericenter -1.06121
		MeanAnomaly     -166.783
	}
}

Comet	"Jakku System C10"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.16473e-012
	Radius          2.17375
	InertiaMoment   0.399356

	Oblateness      0.00404792

	RotationPeriod  76.1954
	Obliquity       80.5575
	EqAscendNode    8.41472

	AbsMagn         8.6416
	SlopeParam      3.6734
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.580 0.575)

	Surface
	{
		SurfStyle       0.524553
		OceanStyle      0.288989
		Randomize      (0.360, 0.835, -0.494)
		colorDistMagn   0.60669
		colorDistFreq   0.00383507
		detailScale     59.3579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.336786
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539049
		terraceProb     0.321624
		erosion         0
		montesMagn      0.472043
		montesFreq      3.27443
		montesSpiky     0.934918
		montesFraction  0.713868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0116829
		hillsFraction   0.56802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243566
		craterFreq      0.189764
		craterDensity   0.896554
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484471
		volcanoTemp     1708.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.197, 0.161, 0.000)
		colorShelf     (0.233, 0.203, 0.184, 0.000)
		colorBeach     (0.274, 0.238, 0.219, 0.000)
		colorDesert    (0.298, 0.255, 0.213, 0.000)
		colorLowland   (0.327, 0.273, 0.242, 0.000)
		colorUpland    (0.362, 0.331, 0.293, 0.000)
		colorRock      (0.391, 0.360, 0.317, 0.000)
		colorSnow      (0.426, 0.383, 0.334, 1.000)
		BumpHeight      1.95638
		BumpOffset      0.391275
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.457924
		GasToDust   0.25
		Particles   1904
		GasBright   0.18006
		DustBright  0.438677
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.8323
		Period          120.71
		Eccentricity    0.948892
		Inclination     -85.3467
		AscendingNode   166.218
		ArgOfPericenter 69.9787
		MeanAnomaly     135.038
	}
}

Comet	"Jakku System C11"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.22111e-008
	Radius          46.9659
	InertiaMoment   0.398056

	Oblateness      0.00559984

	RotationPeriod  73.7986
	Obliquity       33.7632
	EqAscendNode    352.992

	AbsMagn         4.99123
	SlopeParam      4.23727
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.700 0.698 0.694)

	Surface
	{
		SurfStyle       0.675532
		OceanStyle      0.118835
		Randomize      (0.533, -0.293, -0.460)
		colorDistMagn   0.0289984
		colorDistFreq   1.62426
		detailScale     1282.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.509567
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.33508
		terraceProb     0.487585
		erosion         0
		montesMagn      0.587324
		montesFreq      3.59221
		montesSpiky     0.960619
		montesFraction  0.429837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.21061
		hillsFraction   0.766873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274989
		craterFreq      0.173154
		craterDensity   1.02504
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466777
		volcanoTemp     1691.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.237, 0.194, 0.000)
		colorShelf     (0.280, 0.244, 0.222, 0.000)
		colorBeach     (0.329, 0.286, 0.264, 0.000)
		colorDesert    (0.357, 0.307, 0.257, 0.000)
		colorLowland   (0.392, 0.328, 0.292, 0.000)
		colorUpland    (0.434, 0.398, 0.354, 0.000)
		colorRock      (0.469, 0.433, 0.382, 0.000)
		colorSnow      (0.511, 0.461, 0.403, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.939116
		GasToDust   0.25
		Particles   2877
		GasBright   0.106146
		DustBright  0.197078
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.3607
		Period          138.859
		Eccentricity    0.97013
		Inclination     -6.62965
		AscendingNode   -57.3154
		ArgOfPericenter -21.9222
		MeanAnomaly     -1.55372
	}
}

Comet	"Jakku System C12"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            9.91804e-016
	Radius          0.13463
	InertiaMoment   0.399785

	Oblateness      0.00459194

	RotationPeriod  71.5111
	Obliquity       346.969
	EqAscendNode    337.57

	AbsMagn         12.7131
	SlopeParam      4.82108
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.408 0.404 0.399)

	Surface
	{
		SurfStyle       0.748839
		OceanStyle      0.722641
		Randomize      (-0.859, 0.702, -0.703)
		colorDistMagn   0.354652
		colorDistFreq   1.23925e-005
		detailScale     3.67629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891128
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576118
		terraceProb     0.306459
		erosion         0
		montesMagn      0.59614
		montesFreq      2.67918
		montesSpiky     0.986746
		montesFraction  0.488518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.3409e-005
		hillsFraction   0.568315
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23172
		craterFreq      0.202018
		craterDensity   0.875641
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.399588
		volcanoTemp     1522.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.137, 0.112, 0.000)
		colorShelf     (0.163, 0.141, 0.128, 0.000)
		colorBeach     (0.192, 0.165, 0.151, 0.000)
		colorDesert    (0.208, 0.178, 0.147, 0.000)
		colorLowland   (0.229, 0.190, 0.167, 0.000)
		colorUpland    (0.253, 0.230, 0.203, 0.000)
		colorRock      (0.273, 0.250, 0.219, 0.000)
		colorSnow      (0.298, 0.266, 0.231, 1.000)
		BumpHeight      0.121167
		BumpOffset      0.0242333
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.322255
		DustBright  0.465456
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.5252
		Period          140.069
		Eccentricity    0.969157
		Inclination     113.011
		AscendingNode   -110.567
		ArgOfPericenter -13.7161
		MeanAnomaly     142.844
	}
}

Comet	"Jakku System C13"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            7.6709e-012
	Radius          2.90853
	InertiaMoment   0.398645

	Oblateness      0.00634471

	RotationPeriod  69.3149
	Obliquity       300.175
	EqAscendNode    322.147

	AbsMagn         8.43106
	SlopeParam      5.48674
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.588 0.476 0.431)

	Surface
	{
		SurfStyle       0.755969
		OceanStyle      0.726163
		Randomize      (-0.072, -0.180, -0.431)
		colorDistMagn   0.946051
		colorDistFreq   0.00341508
		detailScale     79.4223
		colorConversion true
		snowLevel       2
		tropicLatitude  0.730451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635535
		terraceProb     0.234134
		erosion         0
		montesMagn      0.350495
		montesFreq      3.5655
		montesSpiky     0.980747
		montesFraction  0.322591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0210141
		hillsFraction   0.528837
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231184
		craterFreq      0.150184
		craterDensity   0.937476
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498012
		volcanoTemp     1523.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.162, 0.121, 0.000)
		colorShelf     (0.235, 0.167, 0.138, 0.000)
		colorBeach     (0.277, 0.195, 0.164, 0.000)
		colorDesert    (0.300, 0.210, 0.160, 0.000)
		colorLowland   (0.329, 0.224, 0.181, 0.000)
		colorUpland    (0.365, 0.272, 0.220, 0.000)
		colorRock      (0.394, 0.295, 0.237, 0.000)
		colorSnow      (0.429, 0.314, 0.250, 1.000)
		BumpHeight      2.61768
		BumpOffset      0.523536
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.49075
		GasToDust   0.25
		Particles   1971
		GasBright   0.221058
		DustBright  0.251139
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.6491
		Period          119.428
		Eccentricity    0.931403
		Inclination     105.441
		AscendingNode   -11.4216
		ArgOfPericenter 166.858
		MeanAnomaly     -177.993
	}
}

Comet	"Jakku System C14"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.93289e-008
	Radius          52.6101
	InertiaMoment   0.396515

	Oblateness      0.00512491

	RotationPeriod  67.1952
	Obliquity       253.38
	EqAscendNode    306.724

	AbsMagn         4.70667
	SlopeParam      6.38481
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.738 0.593 0.526)

	Surface
	{
		SurfStyle       0.949137
		OceanStyle      0.0356512
		Randomize      (0.551, 0.154, -0.579)
		colorDistMagn   0.176792
		colorDistFreq   1.78535
		detailScale     1436.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99016
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584666
		terraceProb     0.113821
		erosion         0
		montesMagn      0.465301
		montesFreq      3.29618
		montesSpiky     0.949535
		montesFraction  0.352017
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.65673
		hillsFraction   0.446221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215182
		craterFreq      0.141315
		craterDensity   0.988303
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505435
		volcanoTemp     1638.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.207, 0.210, 0.050)
		colorShelf     (0.295, 0.243, 0.242, 0.040)
		colorBeach     (0.339, 0.279, 0.274, 0.030)
		colorDesert    (0.384, 0.314, 0.310, 0.020)
		colorLowland   (0.428, 0.350, 0.342, 0.030)
		colorUpland    (0.472, 0.385, 0.374, 0.050)
		colorRock      (0.517, 0.421, 0.416, 0.020)
		colorSnow      (0.517, 0.421, 0.416, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.971942
		GasToDust   0.25
		Particles   2943
		GasBright   0.0260156
		DustBright  0.930668
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.6866
		Period          99.3469
		Eccentricity    0.939263
		Inclination     59.3322
		AscendingNode   69.7087
		ArgOfPericenter 26.0013
		MeanAnomaly     -10.6821
	}
}

Comet	"Jakku System C15"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.82678e-015
	Radius          0.180123
	InertiaMoment   0.399134

	Oblateness      0.00717806

	RotationPeriod  65.1402
	Obliquity       206.586
	EqAscendNode    291.302

	AbsMagn         12.3186
	SlopeParam      9.22792
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.573 0.569 0.565)

	Surface
	{
		SurfStyle       0.744152
		OceanStyle      0.683323
		Randomize      (-0.370, 0.819, -0.751)
		colorDistMagn   0.882087
		colorDistFreq   2.60097e-005
		detailScale     4.91855
		colorConversion true
		snowLevel       2
		tropicLatitude  0.543735
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54009
		terraceProb     0.569435
		erosion         0
		montesMagn      0.556819
		montesFreq      2.55646
		montesSpiky     0.92417
		montesFraction  0.646124
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.73325e-005
		hillsFraction   0.682052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256471
		craterFreq      0.252359
		craterDensity   0.940983
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441312
		volcanoTemp     1782.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.193, 0.158, 0.000)
		colorShelf     (0.229, 0.199, 0.181, 0.000)
		colorBeach     (0.270, 0.233, 0.215, 0.000)
		colorDesert    (0.292, 0.250, 0.209, 0.000)
		colorLowland   (0.321, 0.267, 0.237, 0.000)
		colorUpland    (0.356, 0.324, 0.288, 0.000)
		colorRock      (0.384, 0.353, 0.311, 0.000)
		colorSnow      (0.419, 0.375, 0.328, 1.000)
		BumpHeight      0.16211
		BumpOffset      0.0324221
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0423837
		GasToDust   0.25
		Particles   1065
		GasBright   0.0552937
		DustBright  0.585876
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.146
		Period          199.798
		Eccentricity    0.943319
		Inclination     -123.135
		AscendingNode   -159.244
		ArgOfPericenter 63.9398
		MeanAnomaly     122.556
	}
}

Comet	"Jakku System C16"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.41288e-011
	Radius          3.25832
	InertiaMoment   0.397692

	Oblateness      0.00581583

	RotationPeriod  63.1395
	Obliquity       159.792
	EqAscendNode    275.879

	AbsMagn         8.22171
	SlopeParam      2.75165
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.477 0.472 0.466)

	Surface
	{
		SurfStyle       0.413884
		OceanStyle      0.516539
		Randomize      (-0.700, 0.734, 0.125)
		colorDistMagn   0.155881
		colorDistFreq   0.00738975
		detailScale     88.974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.820014
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407001
		terraceProb     0.390457
		erosion         0
		montesMagn      0.495307
		montesFreq      3.27161
		montesSpiky     0.899333
		montesFraction  0.760496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0186787
		hillsFraction   0.656725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26411
		craterFreq      0.212736
		craterDensity   0.968876
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540388
		volcanoTemp     1895.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.189, 0.186, 0.000)
		colorShelf     (0.203, 0.201, 0.198, 0.000)
		colorBeach     (0.214, 0.212, 0.210, 0.000)
		colorDesert    (0.226, 0.224, 0.221, 0.000)
		colorLowland   (0.238, 0.236, 0.233, 0.000)
		colorUpland    (0.250, 0.248, 0.245, 0.000)
		colorRock      (0.262, 0.260, 0.256, 0.000)
		colorSnow      (0.274, 0.272, 0.268, 1.000)
		BumpHeight      2.93249
		BumpOffset      0.586498
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.523576
		GasToDust   0.25
		Particles   2037
		GasBright   0.0473127
		DustBright  0.278344
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.0354
		Period          122.137
		Eccentricity    0.949526
		Inclination     104.844
		AscendingNode   -173.748
		ArgOfPericenter -169.023
		MeanAnomaly     76.3938
	}
}

Comet	"Jakku System C17"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.09276e-007
	Radius          70.3828
	InertiaMoment   0.399576

	Oblateness      0.00812819

	RotationPeriod  61.1846
	Obliquity       112.997
	EqAscendNode    260.457

	AbsMagn         4.40437
	SlopeParam      3.38028
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.612 0.607 0.601)

	Surface
	{
		SurfStyle       0.0147327
		OceanStyle      0.103823
		Randomize      (-0.800, -0.995, -0.100)
		colorDistMagn   0.351245
		colorDistFreq   2.0833
		detailScale     1921.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.793544
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606643
		terraceProb     0.277076
		erosion         0
		montesMagn      0.434313
		montesFreq      4.03301
		montesSpiky     0.931721
		montesFraction  0.620105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.1541
		hillsFraction   0.69164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207451
		craterFreq      0.197361
		craterDensity   0.935112
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462305
		volcanoTemp     1288.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.240, 0.000)
		colorShelf     (0.260, 0.258, 0.255, 0.000)
		colorBeach     (0.276, 0.273, 0.270, 0.000)
		colorDesert    (0.291, 0.288, 0.285, 0.000)
		colorLowland   (0.306, 0.303, 0.300, 0.000)
		colorUpland    (0.321, 0.319, 0.316, 0.000)
		colorRock      (0.337, 0.334, 0.331, 0.000)
		colorSnow      (0.352, 0.349, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.165536
		DustBright  0.644607
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.1296
		Period          183.314
		Eccentricity    0.971931
		Inclination     -94.1459
		AscendingNode   -133.912
		ArgOfPericenter 90.1563
		MeanAnomaly     60.7115
	}
}

Comet	"Jakku System C18"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.36469e-015
	Radius          0.201798
	InertiaMoment   0.398371

	Oblateness      0.00660097

	RotationPeriod  59.2679
	Obliquity       66.2032
	EqAscendNode    245.034

	AbsMagn         11.9621
	SlopeParam      3.95192
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.729 0.726)

	Surface
	{
		SurfStyle       0.0469991
		OceanStyle      0.338802
		Randomize      (-0.791, -0.526, 0.467)
		colorDistMagn   0.359515
		colorDistFreq   9.98568e-007
		detailScale     5.51042
		colorConversion true
		snowLevel       2
		tropicLatitude  0.87785
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591255
		terraceProb     0.15386
		erosion         0
		montesMagn      0.540253
		montesFreq      3.67615
		montesSpiky     0.982394
		montesFraction  0.720671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.12728e-005
		hillsFraction   0.602645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247906
		craterFreq      0.249008
		craterDensity   0.617672
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548076
		volcanoTemp     1261.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.291, 0.291, 0.000)
		colorShelf     (0.312, 0.310, 0.309, 0.000)
		colorBeach     (0.330, 0.328, 0.327, 0.000)
		colorDesert    (0.348, 0.346, 0.345, 0.000)
		colorLowland   (0.367, 0.364, 0.363, 0.000)
		colorUpland    (0.385, 0.383, 0.381, 0.000)
		colorRock      (0.403, 0.401, 0.399, 0.000)
		colorSnow      (0.422, 0.419, 0.418, 1.000)
		BumpHeight      0.181618
		BumpOffset      0.0363236
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0752095
		GasToDust   0.25
		Particles   1131
		GasBright   0.130273
		DustBright  0.364357
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.2217
		Period          137.84
		Eccentricity    0.945214
		Inclination     5.07546
		AscendingNode   -162.088
		ArgOfPericenter -132.857
		MeanAnomaly     -147.148
	}
}

Comet	"Jakku System C19"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.60235e-011
	Radius          4.35881
	InertiaMoment   0.399997

	Oblateness      0.00923144

	RotationPeriod  57.3826
	Obliquity       19.4089
	EqAscendNode    229.611

	AbsMagn         8.01296
	SlopeParam      4.51958
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.502 0.382)

	Surface
	{
		SurfStyle       0.162249
		OceanStyle      0.365315
		Randomize      (-0.777, 0.287, -0.378)
		colorDistMagn   0.129926
		colorDistFreq   0.00498875
		detailScale     119.024
		colorConversion true
		snowLevel       2
		tropicLatitude  0.356528
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.371219
		terraceProb     0.311289
		erosion         0
		montesMagn      0.421692
		montesFreq      2.4015
		montesSpiky     0.908617
		montesFraction  0.244706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0568005
		hillsFraction   0.622483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240442
		craterFreq      0.150001
		craterDensity   0.921172
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462824
		volcanoTemp     1121.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.201, 0.153, 0.000)
		colorShelf     (0.281, 0.213, 0.162, 0.000)
		colorBeach     (0.297, 0.226, 0.172, 0.000)
		colorDesert    (0.314, 0.238, 0.181, 0.000)
		colorLowland   (0.330, 0.251, 0.191, 0.000)
		colorUpland    (0.347, 0.264, 0.200, 0.000)
		colorRock      (0.363, 0.276, 0.210, 0.000)
		colorSnow      (0.380, 0.289, 0.219, 1.000)
		BumpHeight      3.92293
		BumpOffset      0.784585
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.556401
		GasToDust   0.25
		Particles   2103
		GasBright   0.315686
		DustBright  0.66343
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.9209
		Period          107.564
		Eccentricity    0.975674
		Inclination     178.396
		AscendingNode   156.28
		ArgOfPericenter 137.963
		MeanAnomaly     -118.048
	}
}

Comet	"Jakku System C20"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.01273e-007
	Radius          78.8559
	InertiaMoment   0.398901

	Oblateness      0.00751767

	RotationPeriod  55.5226
	Obliquity       332.615
	EqAscendNode    214.189

	AbsMagn         4.07999
	SlopeParam      5.13353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.730 0.727 0.724)

	Surface
	{
		SurfStyle       0.172349
		OceanStyle      0.217143
		Randomize      (0.785, 0.245, -0.949)
		colorDistMagn   0.641265
		colorDistFreq   5.20477
		detailScale     2153.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.360995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595556
		terraceProb     0.260478
		erosion         0
		montesMagn      0.583127
		montesFreq      3.1486
		montesSpiky     0.977664
		montesFraction  0.824487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.3471
		hillsFraction   0.640888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232072
		craterFreq      0.165683
		craterDensity   0.936176
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53889
		volcanoTemp     1095.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.310, 0.309, 0.308, 0.000)
		colorBeach     (0.328, 0.327, 0.326, 0.000)
		colorDesert    (0.347, 0.345, 0.344, 0.000)
		colorLowland   (0.365, 0.363, 0.362, 0.000)
		colorUpland    (0.383, 0.382, 0.380, 0.000)
		colorRock      (0.401, 0.400, 0.398, 0.000)
		colorSnow      (0.419, 0.418, 0.416, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.253141
		DustBright  0.410461
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.6567
		Period          163.757
		Eccentricity    0.93262
		Inclination     17.43
		AscendingNode   51.6934
		ArgOfPericenter 75.216
		MeanAnomaly     73.4626
	}
}

Comet	"Jakku System C21"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            6.19735e-015
	Radius          0.269943
	InertiaMoment   0.39723

	Oblateness      0.0104119

	RotationPeriod  53.6826
	Obliquity       285.82
	EqAscendNode    198.766

	AbsMagn         11.6346
	SlopeParam      5.88194
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.525 0.519 0.513)

	Surface
	{
		SurfStyle       0.28168
		OceanStyle      0.302745
		Randomize      (0.151, -0.458, 0.639)
		colorDistMagn   0.259823
		colorDistFreq   4.68916e-005
		detailScale     7.37125
		colorConversion true
		snowLevel       2
		tropicLatitude  0.391549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499786
		terraceProb     0.413033
		erosion         0
		montesMagn      0.640649
		montesFreq      2.93518
		montesSpiky     0.935182
		montesFraction  0.619403
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000161919
		hillsFraction   0.679542
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233417
		craterFreq      0.268224
		craterDensity   0.969767
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551875
		volcanoTemp     1755.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.205, 0.000)
		colorShelf     (0.223, 0.221, 0.218, 0.000)
		colorBeach     (0.236, 0.234, 0.231, 0.000)
		colorDesert    (0.249, 0.247, 0.244, 0.000)
		colorLowland   (0.262, 0.260, 0.257, 0.000)
		colorUpland    (0.276, 0.273, 0.269, 0.000)
		colorRock      (0.289, 0.286, 0.282, 0.000)
		colorSnow      (0.302, 0.299, 0.295, 1.000)
		BumpHeight      0.242949
		BumpOffset      0.0485898
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.108035
		GasToDust   0.25
		Particles   1198
		GasBright   0.153337
		DustBright  0.194752
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.1448
		Period          137.277
		Eccentricity    0.933737
		Inclination     -82.9182
		AscendingNode   2.64067
		ArgOfPericenter -56.6089
		MeanAnomaly     -8.00123
	}
}

Comet	"Jakku System C22"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.79321e-011
	Radius          4.8837
	InertiaMoment   0.399361

	Oblateness      0.00861109

	RotationPeriod  51.8573
	Obliquity       239.026
	EqAscendNode    183.344

	AbsMagn         7.80424
	SlopeParam      7.08819
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.442 0.434 0.430)

	Surface
	{
		SurfStyle       0.0326185
		OceanStyle      0.583247
		Randomize      (-0.352, 0.374, -0.210)
		colorDistMagn   0.513078
		colorDistFreq   0.0033224
		detailScale     133.358
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619924
		terraceProb     0.691526
		erosion         0
		montesMagn      0.411465
		montesFreq      2.9224
		montesSpiky     0.926967
		montesFraction  0.373315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0570727
		hillsFraction   0.6787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196299
		craterFreq      0.238474
		craterDensity   0.9243
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492578
		volcanoTemp     1625.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.174, 0.172, 0.000)
		colorShelf     (0.188, 0.185, 0.183, 0.000)
		colorBeach     (0.199, 0.196, 0.193, 0.000)
		colorDesert    (0.210, 0.206, 0.204, 0.000)
		colorLowland   (0.221, 0.217, 0.215, 0.000)
		colorUpland    (0.232, 0.228, 0.226, 0.000)
		colorRock      (0.243, 0.239, 0.236, 0.000)
		colorSnow      (0.254, 0.250, 0.247, 1.000)
		BumpHeight      4.39533
		BumpOffset      0.879066
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.589227
		GasToDust   0.25
		Particles   2170
		GasBright   0.415918
		DustBright  0.416658
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.1509
		Period          130.07
		Eccentricity    0.956472
		Inclination     41.2686
		AscendingNode   23.7745
		ArgOfPericenter -16.0935
		MeanAnomaly     -49.3758
	}
}

Comet	"Jakku System C23"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.7072e-007
	Radius          105.482
	InertiaMoment   0.398064

	Oblateness      0.0119887

	RotationPeriod  50.0419
	Obliquity       192.232
	EqAscendNode    167.921

	AbsMagn         3.72754
	SlopeParam      2.38333
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.643 0.545)

	Surface
	{
		SurfStyle       0.394043
		OceanStyle      0.435391
		Randomize      (0.849, 0.178, 0.473)
		colorDistMagn   0.470146
		colorDistFreq   2.49044
		detailScale     2880.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.265028
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56556
		terraceProb     0.655213
		erosion         0
		montesMagn      0.642002
		montesFreq      3.26942
		montesSpiky     0.891907
		montesFraction  0.225166
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.6632
		hillsFraction   0.679349
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270491
		craterFreq      0.330899
		craterDensity   0.963695
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540466
		volcanoTemp     1364.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.257, 0.218, 0.000)
		colorShelf     (0.308, 0.273, 0.232, 0.000)
		colorBeach     (0.327, 0.289, 0.245, 0.000)
		colorDesert    (0.345, 0.305, 0.259, 0.000)
		colorLowland   (0.363, 0.322, 0.272, 0.000)
		colorUpland    (0.381, 0.338, 0.286, 0.000)
		colorRock      (0.399, 0.354, 0.300, 0.000)
		colorSnow      (0.417, 0.370, 0.313, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0303003
		DustBright  0.486762
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.6053
		Period          179.107
		Eccentricity    0.959625
		Inclination     152.436
		AscendingNode   3.34589
		ArgOfPericenter -159.496
		MeanAnomaly     -35.2866
	}
}

Comet	"Jakku System C24"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.14147e-014
	Radius          0.302454
	InertiaMoment   0.39979

	Oblateness      0.00994501

	RotationPeriod  48.2316
	Obliquity       145.437
	EqAscendNode    152.498

	AbsMagn         11.3298
	SlopeParam      3.07313
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.565 0.489)

	Surface
	{
		SurfStyle       0.406547
		OceanStyle      0.979958
		Randomize      (-0.914, -0.313, -0.754)
		colorDistMagn   0.82709
		colorDistFreq   4.59381e-005
		detailScale     8.25902
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794758
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610532
		terraceProb     0.11828
		erosion         0
		montesMagn      0.548338
		montesFreq      2.81691
		montesSpiky     0.936493
		montesFraction  0.500617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000219494
		hillsFraction   0.388445
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231143
		craterFreq      0.173403
		craterDensity   0.745812
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561942
		volcanoTemp     1605.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.226, 0.196, 0.000)
		colorShelf     (0.262, 0.240, 0.208, 0.000)
		colorBeach     (0.278, 0.254, 0.220, 0.000)
		colorDesert    (0.293, 0.268, 0.232, 0.000)
		colorLowland   (0.309, 0.283, 0.244, 0.000)
		colorUpland    (0.324, 0.297, 0.257, 0.000)
		colorRock      (0.339, 0.311, 0.269, 0.000)
		colorSnow      (0.355, 0.325, 0.281, 1.000)
		BumpHeight      0.272209
		BumpOffset      0.0544418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.140861
		GasToDust   0.25
		Particles   1264
		GasBright   0.0237115
		DustBright  0.177838
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.4018
		Period          131.877
		Eccentricity    0.964168
		Inclination     40.4853
		AscendingNode   93.0208
		ArgOfPericenter -74.383
		MeanAnomaly     -1.49387
	}
}

Comet	"Jakku System C25"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            8.82846e-011
	Radius          6.53267
	InertiaMoment   0.398651

	Oblateness      0.0139264

	RotationPeriod  46.422
	Obliquity       98.6431
	EqAscendNode    137.076

	AbsMagn         7.595
	SlopeParam      3.66558
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.509 0.506)

	Surface
	{
		SurfStyle       0.0791476
		OceanStyle      0.473028
		Randomize      (-0.670, -0.434, 0.928)
		colorDistMagn   0.414456
		colorDistFreq   0.00214468
		detailScale     178.385
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928247
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546692
		terraceProb     0.587796
		erosion         0
		montesMagn      0.562238
		montesFreq      3.09209
		montesSpiky     0.948046
		montesFraction  0.571502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.112854
		hillsFraction   0.443615
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225594
		craterFreq      0.237169
		craterDensity   0.966734
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518578
		volcanoTemp     1519.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.204, 0.202, 0.000)
		colorShelf     (0.218, 0.216, 0.215, 0.000)
		colorBeach     (0.231, 0.229, 0.228, 0.000)
		colorDesert    (0.244, 0.242, 0.240, 0.000)
		colorLowland   (0.257, 0.254, 0.253, 0.000)
		colorUpland    (0.270, 0.267, 0.266, 0.000)
		colorRock      (0.282, 0.280, 0.278, 0.000)
		colorSnow      (0.295, 0.293, 0.291, 1.000)
		BumpHeight      5.8794
		BumpOffset      1.17588
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.622053
		GasToDust   0.25
		Particles   2236
		GasBright   0.121217
		DustBright  0.564819
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.4223
		Period          177.646
		Eccentricity    0.942734
		Inclination     16.742
		AscendingNode   -36.7949
		ArgOfPericenter 98.345
		MeanAnomaly     2.48344
	}
}

Comet	"Jakku System C26"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            6.8282e-007
	Radius          118.186
	InertiaMoment   0.396539

	Oblateness      0.0114557

	RotationPeriod  44.6083
	Obliquity       51.8488
	EqAscendNode    121.653

	AbsMagn         3.33835
	SlopeParam      4.2295
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.635 0.585)

	Surface
	{
		SurfStyle       0.43742
		OceanStyle      0.568988
		Randomize      (0.830, -0.652, -0.355)
		colorDistMagn   0.093632
		colorDistFreq   1.56272
		detailScale     3227.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99148
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444457
		terraceProb     0.266509
		erosion         0
		montesMagn      0.552707
		montesFreq      3.26108
		montesSpiky     0.919338
		montesFraction  0.490824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.1875
		hillsFraction   0.58386
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259517
		craterFreq      0.538096
		craterDensity   0.93369
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434523
		volcanoTemp     1603.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.254, 0.234, 0.000)
		colorShelf     (0.286, 0.270, 0.249, 0.000)
		colorBeach     (0.303, 0.286, 0.263, 0.000)
		colorDesert    (0.320, 0.301, 0.278, 0.000)
		colorLowland   (0.337, 0.317, 0.293, 0.000)
		colorUpland    (0.354, 0.333, 0.307, 0.000)
		colorRock      (0.371, 0.349, 0.322, 0.000)
		colorSnow      (0.388, 0.365, 0.336, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0873456
		DustBright  0.283177
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.0159
		Period          224.059
		Eccentricity    0.965996
		Inclination     -51.414
		AscendingNode   147.002
		ArgOfPericenter 114.648
		MeanAnomaly     129.688
	}
}

Comet	"Jakku System C27"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.10245e-014
	Radius          0.40458
	InertiaMoment   0.39914

	Oblateness      0.0163825

	RotationPeriod  42.786
	Obliquity       5.05449
	EqAscendNode    106.231

	AbsMagn         11.0433
	SlopeParam      4.81269
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.603 0.599 0.595)

	Surface
	{
		SurfStyle       0.855205
		OceanStyle      0.0544714
		Randomize      (0.660, -0.300, -0.970)
		colorDistMagn   0.653099
		colorDistFreq   4.79334e-005
		detailScale     11.0477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44931
		terraceProb     0.135736
		erosion         0
		montesMagn      0.36449
		montesFreq      2.87913
		montesSpiky     0.834735
		montesFraction  0.613845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000324336
		hillsFraction   0.653299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266793
		craterFreq      0.202516
		craterDensity   0.783366
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514025
		volcanoTemp     1329.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.210, 0.238, 0.050)
		colorShelf     (0.241, 0.246, 0.274, 0.040)
		colorBeach     (0.278, 0.282, 0.309, 0.030)
		colorDesert    (0.314, 0.318, 0.351, 0.020)
		colorLowland   (0.350, 0.354, 0.387, 0.030)
		colorUpland    (0.386, 0.390, 0.423, 0.050)
		colorRock      (0.422, 0.426, 0.470, 0.020)
		colorSnow      (0.422, 0.426, 0.470, 1.000)
		BumpHeight      0.364122
		BumpOffset      0.0728244
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.173687
		GasToDust   0.25
		Particles   1330
		GasBright   0.252041
		DustBright  0.602968
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.2267
		Period          152.787
		Eccentricity    0.990734
		Inclination     80.3726
		AscendingNode   145.926
		ArgOfPericenter -79.6039
		MeanAnomaly     169.116
	}
}

Comet	"Jakku System C28"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.62609e-010
	Radius          7.3193
	InertiaMoment   0.397702

	Oblateness      0.0136177

	RotationPeriod  40.9502
	Obliquity       318.26
	EqAscendNode    90.8081

	AbsMagn         7.38463
	SlopeParam      5.47659
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.608 0.604 0.602)

	Surface
	{
		SurfStyle       0.129976
		OceanStyle      0.882675
		Randomize      (-0.127, 0.816, -0.825)
		colorDistMagn   0.357944
		colorDistFreq   0.0311699
		detailScale     199.866
		colorConversion true
		snowLevel       2
		tropicLatitude  0.952181
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740804
		terraceProb     0.427718
		erosion         0
		montesMagn      0.585156
		montesFreq      2.50415
		montesSpiky     0.954226
		montesFraction  0.642652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.143022
		hillsFraction   0.602757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255816
		craterFreq      0.217761
		craterDensity   0.915706
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.406021
		volcanoTemp     1315.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.242, 0.241, 0.000)
		colorShelf     (0.258, 0.257, 0.256, 0.000)
		colorBeach     (0.274, 0.272, 0.271, 0.000)
		colorDesert    (0.289, 0.287, 0.286, 0.000)
		colorLowland   (0.304, 0.302, 0.301, 0.000)
		colorUpland    (0.319, 0.317, 0.316, 0.000)
		colorRock      (0.334, 0.332, 0.331, 0.000)
		colorSnow      (0.350, 0.348, 0.346, 1.000)
		BumpHeight      6.58737
		BumpOffset      1.31747
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.654879
		GasToDust   0.25
		Particles   2302
		GasBright   0.190888
		DustBright  0.348607
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.3945
		Period          146.521
		Eccentricity    0.946137
		Inclination     136.267
		AscendingNode   -59.4941
		ArgOfPericenter 107.899
		MeanAnomaly     -155.699
	}
}

Comet	"Jakku System C29"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.00687e-018
	Radius          0.0250566
	InertiaMoment   0.399581

	Oblateness      0.0196043

	RotationPeriod  39.0959
	Obliquity       271.466
	EqAscendNode    75.3855

	AbsMagn         2.89916
	SlopeParam      6.36917
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.624 0.619 0.618)

	Surface
	{
		SurfStyle       0.611541
		OceanStyle      0.137563
		Randomize      (0.830, 0.469, 0.063)
		colorDistMagn   0.379261
		colorDistFreq   4.16249e-007
		detailScale     0.684211
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.299993
		terraceProb     0.384757
		erosion         0
		montesMagn      0.291763
		montesFreq      2.65722
		montesSpiky     0.838107
		montesFraction  0.296719
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2819e-006
		hillsFraction   0.467493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257629
		craterFreq      0.159047
		craterDensity   0.827029
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461158
		volcanoTemp     1175.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.211, 0.173, 0.000)
		colorShelf     (0.250, 0.217, 0.198, 0.000)
		colorBeach     (0.293, 0.254, 0.235, 0.000)
		colorDesert    (0.318, 0.272, 0.228, 0.000)
		colorLowland   (0.349, 0.291, 0.259, 0.000)
		colorUpland    (0.387, 0.353, 0.315, 0.000)
		colorRock      (0.418, 0.384, 0.340, 0.000)
		colorSnow      (0.455, 0.409, 0.358, 1.000)
		BumpHeight      0.0225509
		BumpOffset      0.00451018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0924759
		DustBright  0.131506
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.0541
		Period          95.2217
		Eccentricity    0.939742
		Inclination     130.617
		AscendingNode   118.883
		ArgOfPericenter 66.5272
		MeanAnomaly     -84.7748
	}
}

Comet	"Jakku System C30"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.87245e-014
	Radius          0.453281
	InertiaMoment   0.398379

	Oblateness      0.0164845

	RotationPeriod  37.2176
	Obliquity       224.672
	EqAscendNode    59.9629

	AbsMagn         10.7715
	SlopeParam      9.02262
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.666 0.590)

	Surface
	{
		SurfStyle       0.344942
		OceanStyle      0.287162
		Randomize      (-0.239, 0.604, -0.197)
		colorDistMagn   0.712555
		colorDistFreq   0.000152515
		detailScale     12.3776
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991194
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381905
		terraceProb     0.339194
		erosion         0
		montesMagn      0.537803
		montesFreq      3.12178
		montesSpiky     0.897004
		montesFraction  0.474589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000463867
		hillsFraction   0.822695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229693
		craterFreq      0.208044
		craterDensity   0.767661
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478312
		volcanoTemp     1488.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.266, 0.236, 0.000)
		colorShelf     (0.300, 0.283, 0.251, 0.000)
		colorBeach     (0.317, 0.300, 0.266, 0.000)
		colorDesert    (0.335, 0.316, 0.280, 0.000)
		colorLowland   (0.352, 0.333, 0.295, 0.000)
		colorUpland    (0.370, 0.350, 0.310, 0.000)
		colorRock      (0.388, 0.366, 0.325, 0.000)
		colorSnow      (0.405, 0.383, 0.339, 1.000)
		BumpHeight      0.407953
		BumpOffset      0.0815906
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.206513
		GasToDust   0.25
		Particles   1396
		GasBright   0.334339
		DustBright  0.37413
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.6394
		Period          155.927
		Eccentricity    0.977993
		Inclination     -78.5088
		AscendingNode   -113.443
		ArgOfPericenter 88.073
		MeanAnomaly     151.668
	}
}

Comet	"Jakku System C31"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.99507e-010
	Radius          9.79132
	InertiaMoment   0.393467

	Oblateness      0.023431

	RotationPeriod  35.3095
	Obliquity       177.877
	EqAscendNode    44.5403

	AbsMagn         7.17255
	SlopeParam      2.74226
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.514 0.513)

	Surface
	{
		SurfStyle       0.518874
		OceanStyle      0.495801
		Randomize      (0.002, 0.615, -0.536)
		colorDistMagn   0.699605
		colorDistFreq   0.0671793
		detailScale     267.368
		colorConversion true
		snowLevel       2
		tropicLatitude  0.564902
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270406
		terraceProb     0.143687
		erosion         0
		montesMagn      0.41779
		montesFreq      3.09019
		montesSpiky     0.811732
		montesFraction  0.659398
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.202494
		hillsFraction   0.696217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239409
		craterFreq      0.189016
		craterDensity   0.868231
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430833
		volcanoTemp     1670.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.175, 0.144, 0.000)
		colorShelf     (0.207, 0.180, 0.164, 0.000)
		colorBeach     (0.243, 0.211, 0.195, 0.000)
		colorDesert    (0.264, 0.226, 0.190, 0.000)
		colorLowland   (0.290, 0.242, 0.215, 0.000)
		colorUpland    (0.321, 0.293, 0.262, 0.000)
		colorRock      (0.347, 0.319, 0.282, 0.000)
		colorSnow      (0.378, 0.339, 0.297, 1.000)
		BumpHeight      8.81218
		BumpOffset      1.76244
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.687705
		GasToDust   0.25
		Particles   2369
		GasBright   0.012167
		DustBright  0.380788
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.3289
		Period          176.902
		Eccentricity    0.946067
		Inclination     33.0073
		AscendingNode   -129.622
		ArgOfPericenter 97.4505
		MeanAnomaly     56.1279
	}
}

Comet	"Jakku System C32"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            9.22204e-018
	Radius          0.0280712
	InertiaMoment   0.398907

	Oblateness      0.020497

	RotationPeriod  33.3651
	Obliquity       131.083
	EqAscendNode    29.1177

	AbsMagn         2.38802
	SlopeParam      3.37218
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.556 0.552 0.546)

	Surface
	{
		SurfStyle       0.312818
		OceanStyle      0.625424
		Randomize      (-0.462, 0.888, 0.597)
		colorDistMagn   0.443738
		colorDistFreq   4.01986e-007
		detailScale     0.766532
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94819
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478858
		terraceProb     0.357337
		erosion         0
		montesMagn      0.22803
		montesFreq      2.63288
		montesSpiky     0.874936
		montesFraction  0.484607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68295e-006
		hillsFraction   0.727516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270031
		craterFreq      0.214882
		craterDensity   0.882449
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495388
		volcanoTemp     1422.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.221, 0.218, 0.000)
		colorShelf     (0.236, 0.235, 0.232, 0.000)
		colorBeach     (0.250, 0.248, 0.246, 0.000)
		colorDesert    (0.264, 0.262, 0.259, 0.000)
		colorLowland   (0.278, 0.276, 0.273, 0.000)
		colorUpland    (0.292, 0.290, 0.287, 0.000)
		colorRock      (0.306, 0.304, 0.300, 0.000)
		colorSnow      (0.320, 0.317, 0.314, 1.000)
		BumpHeight      0.0252641
		BumpOffset      0.00505282
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0789769
		DustBright  0.798465
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.3804
		Period          60.9518
		Eccentricity    0.972715
		Inclination     -117.93
		AscendingNode   159.928
		ArgOfPericenter 9.38059
		MeanAnomaly     24.4437
	}
}

Comet	"Jakku System C33"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            7.13257e-014
	Radius          0.606405
	InertiaMoment   0.397243

	Oblateness      0.0300213

	RotationPeriod  31.3769
	Obliquity       84.2887
	EqAscendNode    13.6952

	AbsMagn         10.512
	SlopeParam      3.9442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.668 0.666)

	Surface
	{
		SurfStyle       0.8738
		OceanStyle      0.695757
		Randomize      (0.782, 0.811, 0.982)
		colorDistMagn   0.551675
		colorDistFreq   0.000274764
		detailScale     16.5589
		colorConversion true
		snowLevel       2
		tropicLatitude  0.709339
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42174
		terraceProb     0.119988
		erosion         0
		montesMagn      0.352059
		montesFreq      2.84562
		montesSpiky     0.912197
		montesFraction  0.680319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000448417
		hillsFraction   0.534387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261734
		craterFreq      0.23495
		craterDensity   0.979917
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515919
		volcanoTemp     1597.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.234, 0.266, 0.050)
		colorShelf     (0.269, 0.274, 0.306, 0.040)
		colorBeach     (0.310, 0.314, 0.346, 0.030)
		colorDesert    (0.350, 0.354, 0.393, 0.020)
		colorLowland   (0.390, 0.394, 0.433, 0.030)
		colorUpland    (0.431, 0.434, 0.473, 0.050)
		colorRock      (0.471, 0.474, 0.526, 0.020)
		colorSnow      (0.471, 0.474, 0.526, 1.000)
		BumpHeight      0.545765
		BumpOffset      0.109153
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.239339
		GasToDust   0.25
		Particles   1463
		GasBright   0.0837573
		DustBright  0.478171
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.9658
		Period          107.867
		Eccentricity    0.932956
		Inclination     75.1513
		AscendingNode   -40.5911
		ArgOfPericenter -38.3262
		MeanAnomaly     2.22916
	}
}

Comet	"Jakku System C34"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.51652e-010
	Radius          10.9686
	InertiaMoment   0.399367

	Oblateness      0.0264867

	RotationPeriod  29.3367
	Obliquity       37.4944
	EqAscendNode    358.273

	AbsMagn         6.95812
	SlopeParam      4.5116
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.535 0.448)

	Surface
	{
		SurfStyle       0.0136976
		OceanStyle      0.23602
		Randomize      (0.429, -0.987, 0.713)
		colorDistMagn   0.99595
		colorDistFreq   0.0259773
		detailScale     299.515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327651
		terraceProb     0.467501
		erosion         0
		montesMagn      0.567435
		montesFreq      3.35665
		montesSpiky     0.902725
		montesFraction  0.70929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.300504
		hillsFraction   0.628445
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242395
		craterFreq      0.215027
		craterDensity   1.01821
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512546
		volcanoTemp     1377.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.214, 0.179, 0.000)
		colorShelf     (0.249, 0.228, 0.191, 0.000)
		colorBeach     (0.263, 0.241, 0.202, 0.000)
		colorDesert    (0.278, 0.254, 0.213, 0.000)
		colorLowland   (0.293, 0.268, 0.224, 0.000)
		colorUpland    (0.307, 0.281, 0.235, 0.000)
		colorRock      (0.322, 0.294, 0.247, 0.000)
		colorSnow      (0.337, 0.308, 0.258, 1.000)
		BumpHeight      9.87171
		BumpOffset      1.97434
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.720531
		GasToDust   0.25
		Particles   2435
		GasBright   0.0512786
		DustBright  0.195136
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.0423
		Period          166.758
		Eccentricity    0.973013
		Inclination     50.7367
		AscendingNode   -86.84
		ArgOfPericenter -154.259
		MeanAnomaly     -14.7424
	}
}

Comet	"Jakku System C35"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.69858e-017
	Radius          0.0375567
	InertiaMoment   0.398072

	Oblateness      0.0398741

	RotationPeriod  27.2347
	Obliquity       350.7
	EqAscendNode    342.85

	AbsMagn         1.76409
	SlopeParam      5.12448
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.545 0.504 0.444)

	Surface
	{
		SurfStyle       0.342964
		OceanStyle      0.543691
		Randomize      (0.431, -0.539, -0.007)
		colorDistMagn   0.643507
		colorDistFreq   8.64462e-007
		detailScale     1.02555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400662
		terraceProb     0.348216
		erosion         0
		montesMagn      0.531074
		montesFreq      2.36137
		montesSpiky     0.745933
		montesFraction  0.829641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.06975e-006
		hillsFraction   0.532278
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227742
		craterFreq      0.247955
		craterDensity   0.856573
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489772
		volcanoTemp     1328.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.201, 0.178, 0.000)
		colorShelf     (0.232, 0.214, 0.189, 0.000)
		colorBeach     (0.245, 0.227, 0.200, 0.000)
		colorDesert    (0.259, 0.239, 0.211, 0.000)
		colorLowland   (0.273, 0.252, 0.222, 0.000)
		colorUpland    (0.286, 0.264, 0.233, 0.000)
		colorRock      (0.300, 0.277, 0.244, 0.000)
		colorSnow      (0.314, 0.290, 0.255, 1.000)
		BumpHeight      0.0338011
		BumpOffset      0.00676021
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.195256
		DustBright  0.535645
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.4853
		Period          139.776
		Eccentricity    0.945494
		Inclination     73.0556
		AscendingNode   -22.0627
		ArgOfPericenter 164.953
		MeanAnomaly     -38.0844
	}
}

Comet	"Jakku System C36"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.31373e-013
	Radius          0.679256
	InertiaMoment   0.399796

	Oblateness      0.0362595

	RotationPeriod  25.0593
	Obliquity       303.906
	EqAscendNode    327.427

	AbsMagn         10.2627
	SlopeParam      5.86996
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.753 0.752 0.749)

	Surface
	{
		SurfStyle       0.0404466
		OceanStyle      0.560135
		Randomize      (0.606, -0.742, 0.764)
		colorDistMagn   0.883583
		colorDistFreq   0.000162508
		detailScale     18.5482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.417032
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42135
		terraceProb     0.223614
		erosion         0
		montesMagn      0.563487
		montesFreq      3.05364
		montesSpiky     0.912386
		montesFraction  0.4979
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00126784
		hillsFraction   0.591336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270912
		craterFreq      0.179567
		craterDensity   0.751796
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484442
		volcanoTemp     1593.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.301, 0.300, 0.000)
		colorShelf     (0.320, 0.320, 0.318, 0.000)
		colorBeach     (0.339, 0.338, 0.337, 0.000)
		colorDesert    (0.358, 0.357, 0.356, 0.000)
		colorLowland   (0.377, 0.376, 0.375, 0.000)
		colorUpland    (0.396, 0.395, 0.393, 0.000)
		colorRock      (0.414, 0.414, 0.412, 0.000)
		colorSnow      (0.433, 0.432, 0.431, 1.000)
		BumpHeight      0.611331
		BumpOffset      0.122266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.272165
		GasToDust   0.25
		Particles   1529
		GasBright   0.135495
		DustBright  0.279893
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.9893
		Period          88.409
		Eccentricity    0.969361
		Inclination     112.729
		AscendingNode   -154.926
		ArgOfPericenter -138.515
		MeanAnomaly     -134.148
	}
}

Comet	"Jakku System C37"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.01608e-009
	Radius          14.6763
	InertiaMoment   0.398658

	Oblateness      0.0568966

	RotationPeriod  22.7967
	Obliquity       257.112
	EqAscendNode    312.005

	AbsMagn         6.74065
	SlopeParam      7.06301
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.521 0.479 0.403)

	Surface
	{
		SurfStyle       0.620203
		OceanStyle      0.611823
		Randomize      (-0.933, 0.993, 0.725)
		colorDistMagn   0.456831
		colorDistFreq   0.163633
		detailScale     400.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.30655
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585851
		terraceProb     0.331152
		erosion         0
		montesMagn      0.574512
		montesFreq      2.72117
		montesSpiky     0.907906
		montesFraction  0.393114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.45699
		hillsFraction   0.57536
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271528
		craterFreq      0.224745
		craterDensity   0.871471
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476566
		volcanoTemp     1547.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.163, 0.113, 0.000)
		colorShelf     (0.208, 0.168, 0.129, 0.000)
		colorBeach     (0.245, 0.197, 0.153, 0.000)
		colorDesert    (0.266, 0.211, 0.149, 0.000)
		colorLowland   (0.292, 0.225, 0.169, 0.000)
		colorUpland    (0.323, 0.273, 0.206, 0.000)
		colorRock      (0.349, 0.297, 0.222, 0.000)
		colorSnow      (0.380, 0.316, 0.234, 1.000)
		BumpHeight      13.2086
		BumpOffset      2.64173
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.753357
		GasToDust   0.25
		Particles   2501
		GasBright   0.346663
		DustBright  0.553212
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   43.3067
		Period          262.02
		Eccentricity    0.982014
		Inclination     119.956
		AscendingNode   5.65009
		ArgOfPericenter 162.247
		MeanAnomaly     -163.054
	}
}

Comet	"Jakku System C38"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.12857e-017
	Radius          0.0420642
	InertiaMoment   0.396562

	Oblateness      0.0537476

	RotationPeriod  20.4298
	Obliquity       210.317
	EqAscendNode    296.582

	AbsMagn         0.935747
	SlopeParam      2.37261
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.596 0.591 0.586)

	Surface
	{
		SurfStyle       0.0908606
		OceanStyle      0.917571
		Randomize      (0.082, -0.670, -0.562)
		colorDistMagn   0.935559
		colorDistFreq   1.11746e-006
		detailScale     1.14863
		colorConversion true
		snowLevel       2
		tropicLatitude  0.691231
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62527
		terraceProb     0.166615
		erosion         0
		montesMagn      0.494886
		montesFreq      2.72108
		montesSpiky     0.819665
		montesFraction  0.384394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.03565e-006
		hillsFraction   0.725054
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248306
		craterFreq      0.157118
		craterDensity   0.774084
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536313
		volcanoTemp     1556.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.236, 0.234, 0.000)
		colorShelf     (0.253, 0.251, 0.249, 0.000)
		colorBeach     (0.268, 0.266, 0.263, 0.000)
		colorDesert    (0.283, 0.281, 0.278, 0.000)
		colorLowland   (0.298, 0.296, 0.293, 0.000)
		colorUpland    (0.313, 0.310, 0.307, 0.000)
		colorRock      (0.328, 0.325, 0.322, 0.000)
		colorSnow      (0.343, 0.340, 0.337, 1.000)
		BumpHeight      0.0378578
		BumpOffset      0.00757155
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.25962
		DustBright  0.324741
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.7498
		Period          196.522
		Eccentricity    0.943506
		Inclination     165.864
		AscendingNode   -158.21
		ArgOfPericenter -175.44
		MeanAnomaly     98.7227
	}
}

Comet	"Jakku System C39"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.41973e-013
	Radius          0.908961
	InertiaMoment   0.399145

	Oblateness      0.0918459

	RotationPeriod  17.9373
	Obliquity       163.523
	EqAscendNode    281.16

	AbsMagn         10.0219
	SlopeParam      3.06453
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.425 0.420 0.416)

	Surface
	{
		SurfStyle       0.659387
		OceanStyle      0.897142
		Randomize      (0.347, -0.378, 0.987)
		colorDistMagn   0.717597
		colorDistFreq   0.000228759
		detailScale     24.8207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504715
		terraceProb     0.163759
		erosion         0
		montesMagn      0.471384
		montesFreq      2.51507
		montesSpiky     0.996045
		montesFraction  0.53707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00103303
		hillsFraction   0.855775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231354
		craterFreq      0.243875
		craterDensity   0.912348
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484593
		volcanoTemp     1125.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.143, 0.116, 0.000)
		colorShelf     (0.170, 0.147, 0.133, 0.000)
		colorBeach     (0.200, 0.172, 0.158, 0.000)
		colorDesert    (0.217, 0.185, 0.154, 0.000)
		colorLowland   (0.238, 0.198, 0.175, 0.000)
		colorUpland    (0.263, 0.240, 0.212, 0.000)
		colorRock      (0.285, 0.261, 0.229, 0.000)
		colorSnow      (0.310, 0.277, 0.241, 1.000)
		BumpHeight      0.818065
		BumpOffset      0.163613
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.304991
		GasToDust   0.25
		Particles   1595
		GasBright   0.000893899
		DustBright  0.267954
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.7087
		Period          141.423
		Eccentricity    0.966995
		Inclination     97.6468
		AscendingNode   17.2271
		ArgOfPericenter 12.1681
		MeanAnomaly     -149.661
	}
}

Comet	"Jakku System C40"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.87148e-009
	Radius          16.4356
	InertiaMoment   0.397712

	Oblateness      0.0960807

	RotationPeriod  15.2916
	Obliquity       116.729
	EqAscendNode    265.737

	AbsMagn         6.51938
	SlopeParam      3.65775
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.432 0.428 0.421)

	Surface
	{
		SurfStyle       0.83307
		OceanStyle      0.314619
		Randomize      (0.068, 0.785, 0.115)
		colorDistMagn   0.852972
		colorDistFreq   0.126037
		detailScale     448.801
		colorConversion true
		snowLevel       2
		tropicLatitude  0.446205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358007
		terraceProb     0.46683
		erosion         0
		montesMagn      0.588676
		montesFreq      3.00598
		montesSpiky     0.936743
		montesFraction  0.161763
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.409317
		hillsFraction   0.558024
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231799
		craterFreq      0.187475
		craterDensity   0.925586
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484318
		volcanoTemp     1742.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.118, 0.000)
		colorShelf     (0.173, 0.150, 0.135, 0.000)
		colorBeach     (0.203, 0.175, 0.160, 0.000)
		colorDesert    (0.220, 0.188, 0.156, 0.000)
		colorLowland   (0.242, 0.201, 0.177, 0.000)
		colorUpland    (0.268, 0.244, 0.215, 0.000)
		colorRock      (0.289, 0.265, 0.232, 0.000)
		colorSnow      (0.315, 0.282, 0.244, 1.000)
		BumpHeight      14.792
		BumpOffset      2.9584
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.786183
		GasToDust   0.25
		Particles   2568
		GasBright   0.0469856
		DustBright  0.706349
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.607
		Period          163.371
		Eccentricity    0.951821
		Inclination     -116.882
		AscendingNode   -29.7599
		ArgOfPericenter 42.2339
		MeanAnomaly     61.2622
	}
}

Comet	"Jakku System C41"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.76242e-017
	Radius          0.0562959
	InertiaMoment   0.399586

	Oblateness      0.190319

	RotationPeriod  12.4561
	Obliquity       69.9343
	EqAscendNode    250.314

	AbsMagn         -0.398195
	SlopeParam      4.22174
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.461 0.404)

	Surface
	{
		SurfStyle       0.959161
		OceanStyle      0.240772
		Randomize      (-0.352, 0.979, -0.466)
		colorDistMagn   0.563386
		colorDistFreq   7.21508e-007
		detailScale     1.53725
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937068
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480575
		terraceProb     0.548524
		erosion         0
		montesMagn      0.697336
		montesFreq      2.52086
		montesSpiky     0.976799
		montesFraction  0.464418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.60452e-006
		hillsFraction   0.595732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244824
		craterFreq      0.26651
		craterDensity   0.955257
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558274
		volcanoTemp     1310.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.161, 0.162, 0.050)
		colorShelf     (0.200, 0.189, 0.186, 0.040)
		colorBeach     (0.230, 0.216, 0.210, 0.030)
		colorDesert    (0.260, 0.244, 0.238, 0.020)
		colorLowland   (0.290, 0.272, 0.263, 0.030)
		colorUpland    (0.320, 0.299, 0.287, 0.050)
		colorRock      (0.350, 0.327, 0.319, 0.020)
		colorSnow      (0.350, 0.327, 0.319, 1.000)
		BumpHeight      0.0506664
		BumpOffset      0.0101333
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0531582
		DustBright  0.384663
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.5532
		Period          111.857
		Eccentricity    0.934983
		Inclination     110.306
		AscendingNode   122.107
		ArgOfPericenter -106.063
		MeanAnomaly     26.77
	}
}

Comet	"Jakku System C42"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.45682e-013
	Radius          1.01777
	InertiaMoment   0.398386

	Oblateness      0.249

	RotationPeriod  9.38105
	Obliquity       23.14
	EqAscendNode    234.892

	AbsMagn         9.78814
	SlopeParam      4.80432
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.590 0.585)

	Surface
	{
		SurfStyle       0.869895
		OceanStyle      0.405512
		Randomize      (0.109, 0.381, 0.913)
		colorDistMagn   0.50145
		colorDistFreq   0.000902799
		detailScale     27.792
		colorConversion true
		snowLevel       2
		tropicLatitude  0.386193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62864
		terraceProb     0.156158
		erosion         0
		montesMagn      0.353744
		montesFreq      3.33722
		montesSpiky     0.932211
		montesFraction  0.343617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00271214
		hillsFraction   0.63004
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234956
		craterFreq      0.213195
		craterDensity   0.930404
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570423
		volcanoTemp     1746.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.207, 0.234, 0.050)
		colorShelf     (0.238, 0.242, 0.269, 0.040)
		colorBeach     (0.273, 0.277, 0.304, 0.030)
		colorDesert    (0.309, 0.313, 0.345, 0.020)
		colorLowland   (0.344, 0.348, 0.380, 0.030)
		colorUpland    (0.380, 0.384, 0.415, 0.050)
		colorRock      (0.416, 0.419, 0.462, 0.020)
		colorSnow      (0.416, 0.419, 0.462, 1.000)
		BumpHeight      0.915997
		BumpOffset      0.183199
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.337817
		GasToDust   0.25
		Particles   1662
		GasBright   0.16644
		DustBright  0.755867
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.7113
		Period          119.864
		Eccentricity    0.946731
		Inclination     37.7044
		AscendingNode   144.184
		ArgOfPericenter -100.706
		MeanAnomaly     -47.6021
	}
}

Comet	"Jakku System C43"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.44703e-009
	Radius          21.9995
	InertiaMoment   0.394101

	Oblateness      0.249

	RotationPeriod  5.99481
	Obliquity       336.346
	EqAscendNode    219.469

	AbsMagn         6.29349
	SlopeParam      5.46648
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.533 0.442)

	Surface
	{
		SurfStyle       0.915812
		OceanStyle      0.656484
		Randomize      (0.873, 0.777, -0.030)
		colorDistMagn   0.362013
		colorDistFreq   0.384243
		detailScale     600.732
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897029
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53209
		terraceProb     0.219565
		erosion         0
		montesMagn      0.581964
		montesFreq      2.75546
		montesSpiky     0.947579
		montesFraction  0.826669
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28358
		hillsFraction   0.711558
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244755
		craterFreq      0.197673
		craterDensity   0.911818
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429099
		volcanoTemp     1309.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.187, 0.177, 0.050)
		colorShelf     (0.269, 0.219, 0.203, 0.040)
		colorBeach     (0.309, 0.251, 0.230, 0.030)
		colorDesert    (0.350, 0.282, 0.261, 0.020)
		colorLowland   (0.390, 0.314, 0.287, 0.030)
		colorUpland    (0.430, 0.346, 0.314, 0.050)
		colorRock      (0.471, 0.378, 0.349, 0.020)
		colorSnow      (0.471, 0.378, 0.349, 1.000)
		BumpHeight      19.7995
		BumpOffset      3.9599
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.819009
		GasToDust   0.25
		Particles   2634
		GasBright   0.145331
		DustBright  0.461463
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.9378
		Period          150.602
		Eccentricity    0.955336
		Inclination     40.8247
		AscendingNode   -163.249
		ArgOfPericenter 6.83453
		MeanAnomaly     -34.5455
	}
}

Comet	"Jakku System C44"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.06137e-016
	Radius          0.063025
	InertiaMoment   0.398913

	RotationPeriod  158.803
	Obliquity       289.551
	EqAscendNode    204.047

	AbsMagn         17.2343
	SlopeParam      6.35368
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.567 0.509)

	Surface
	{
		SurfStyle       0.704627
		OceanStyle      0.527007
		Randomize      (-0.866, 0.946, -0.774)
		colorDistMagn   0.378705
		colorDistFreq   9.19266e-007
		detailScale     1.721
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992398
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.293865
		terraceProb     0.288458
		erosion         0
		montesMagn      0.630879
		montesFreq      3.70798
		montesSpiky     0.897963
		montesFraction  0.133957
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.10149e-006
		hillsFraction   0.458459
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237169
		craterFreq      0.22407
		craterDensity   1.07322
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566063
		volcanoTemp     1144.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.193, 0.143, 0.000)
		colorShelf     (0.254, 0.198, 0.163, 0.000)
		colorBeach     (0.299, 0.232, 0.194, 0.000)
		colorDesert    (0.324, 0.249, 0.188, 0.000)
		colorLowland   (0.356, 0.266, 0.214, 0.000)
		colorUpland    (0.394, 0.323, 0.260, 0.000)
		colorRock      (0.426, 0.351, 0.280, 0.000)
		colorSnow      (0.464, 0.374, 0.295, 1.000)
		BumpHeight      0.0567225
		BumpOffset      0.0113445
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0869621
		DustBright  0.204318
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.5266
		Period          132.779
		Eccentricity    0.94789
		Inclination     -89.3497
		AscendingNode   -97.2719
		ArgOfPericenter 18.7528
		MeanAnomaly     81.7331
	}
}

Comet	"Jakku System C45"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            8.20892e-013
	Radius          1.36254
	InertiaMoment   0.397257

	Oblateness      0.00198519

	RotationPeriod  121.142
	Obliquity       242.757
	EqAscendNode    188.624

	AbsMagn         9.56038
	SlopeParam      8.85962
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.774 0.772)

	Surface
	{
		SurfStyle       0.589604
		OceanStyle      0.495218
		Randomize      (-0.579, -0.145, 0.734)
		colorDistMagn   0.796155
		colorDistFreq   0.000302487
		detailScale     37.2064
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999412
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377855
		terraceProb     0.214024
		erosion         0
		montesMagn      0.484106
		montesFreq      4.12583
		montesSpiky     0.83806
		montesFraction  0.429842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00307693
		hillsFraction   0.774599
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272566
		craterFreq      0.253799
		craterDensity   0.930176
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518268
		volcanoTemp     1438.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.263, 0.216, 0.000)
		colorShelf     (0.310, 0.271, 0.247, 0.000)
		colorBeach     (0.365, 0.317, 0.294, 0.000)
		colorDesert    (0.396, 0.341, 0.286, 0.000)
		colorLowland   (0.435, 0.364, 0.324, 0.000)
		colorUpland    (0.481, 0.441, 0.394, 0.000)
		colorRock      (0.520, 0.480, 0.425, 0.000)
		colorSnow      (0.566, 0.511, 0.448, 1.000)
		BumpHeight      1.22628
		BumpOffset      0.245257
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.370643
		GasToDust   0.25
		Particles   1728
		GasBright   0.277412
		DustBright  0.498355
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.7773
		Period          205.055
		Eccentricity    0.967157
		Inclination     29.6374
		AscendingNode   -10.5883
		ArgOfPericenter 132.158
		MeanAnomaly     -14.4565
	}
}

Comet	"Jakku System C46"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            6.34901e-009
	Radius          24.6245
	InertiaMoment   0.399372

	Oblateness      0.00183366

	RotationPeriod  110.554
	Obliquity       195.963
	EqAscendNode    173.201

	AbsMagn         6.06202
	SlopeParam      2.73285
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.558 0.554 0.552)

	Surface
	{
		SurfStyle       0.295255
		OceanStyle      0.125079
		Randomize      (-0.685, -0.661, -0.449)
		colorDistMagn   0.585177
		colorDistFreq   0.44522
		detailScale     672.412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894528
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481886
		terraceProb     0.154301
		erosion         0
		montesMagn      0.501359
		montesFreq      3.09458
		montesSpiky     0.89596
		montesFraction  0.643703
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28673
		hillsFraction   0.917464
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273794
		craterFreq      0.218137
		craterDensity   0.700522
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505805
		volcanoTemp     1428.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.222, 0.221, 0.000)
		colorShelf     (0.237, 0.236, 0.235, 0.000)
		colorBeach     (0.251, 0.249, 0.248, 0.000)
		colorDesert    (0.265, 0.263, 0.262, 0.000)
		colorLowland   (0.279, 0.277, 0.276, 0.000)
		colorUpland    (0.293, 0.291, 0.290, 0.000)
		colorRock      (0.307, 0.305, 0.304, 0.000)
		colorSnow      (0.321, 0.319, 0.317, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.851835
		GasToDust   0.25
		Particles   2700
		GasBright   0.191761
		DustBright  0.268493
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.5843
		Period          73.6581
		Eccentricity    0.926187
		Inclination     -59.123
		AscendingNode   101.336
		ArgOfPericenter 125.053
		MeanAnomaly     91.1886
	}
}

Comet	"Jakku System C47"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.95491e-016
	Radius          0.0843894
	InertiaMoment   0.398081

	Oblateness      0.00271556

	RotationPeriod  103.615
	Obliquity       149.169
	EqAscendNode    157.779

	AbsMagn         15.4485
	SlopeParam      3.36407
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.595 0.515)

	Surface
	{
		SurfStyle       0.410587
		OceanStyle      0.221134
		Randomize      (-0.843, -0.242, -0.067)
		colorDistMagn   0.919523
		colorDistFreq   5.23662e-006
		detailScale     2.30439
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879951
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557355
		terraceProb     0.42356
		erosion         0
		montesMagn      0.418059
		montesFreq      2.84695
		montesSpiky     0.930663
		montesFraction  0.528713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8623e-005
		hillsFraction   0.802366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24726
		craterFreq      0.209464
		craterDensity   0.914914
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518725
		volcanoTemp     1622.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.238, 0.206, 0.000)
		colorShelf     (0.288, 0.253, 0.219, 0.000)
		colorBeach     (0.305, 0.268, 0.232, 0.000)
		colorDesert    (0.322, 0.283, 0.244, 0.000)
		colorLowland   (0.339, 0.297, 0.257, 0.000)
		colorUpland    (0.356, 0.312, 0.270, 0.000)
		colorRock      (0.373, 0.327, 0.283, 0.000)
		colorSnow      (0.390, 0.342, 0.296, 1.000)
		BumpHeight      0.0759505
		BumpOffset      0.0151901
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.449401
		DustBright  0.49534
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.861
		Period          150.023
		Eccentricity    0.958045
		Inclination     76.0468
		AscendingNode   57.3957
		ArgOfPericenter -62.3309
		MeanAnomaly     44.0124
	}
}

Comet	"Jakku System C48"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.51198e-012
	Radius          1.5248
	InertiaMoment   0.399801

	Oblateness      0.00231683

	RotationPeriod  98.2848
	Obliquity       102.374
	EqAscendNode    142.356

	AbsMagn         9.33757
	SlopeParam      3.93648
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.782 0.779)

	Surface
	{
		SurfStyle       0.789073
		OceanStyle      0.45616
		Randomize      (-0.522, 0.071, -0.679)
		colorDistMagn   0.108784
		colorDistFreq   0.0019377
		detailScale     41.6373
		colorConversion true
		snowLevel       2
		tropicLatitude  0.566582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677125
		terraceProb     0.266742
		erosion         0
		montesMagn      0.600865
		montesFreq      3.67145
		montesSpiky     0.89936
		montesFraction  0.812496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00312247
		hillsFraction   0.721206
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221437
		craterFreq      0.237943
		craterDensity   0.886427
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550677
		volcanoTemp     1443.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.266, 0.218, 0.000)
		colorShelf     (0.314, 0.274, 0.249, 0.000)
		colorBeach     (0.368, 0.321, 0.296, 0.000)
		colorDesert    (0.400, 0.344, 0.288, 0.000)
		colorLowland   (0.439, 0.367, 0.327, 0.000)
		colorUpland    (0.486, 0.446, 0.397, 0.000)
		colorRock      (0.525, 0.485, 0.428, 0.000)
		colorSnow      (0.572, 0.516, 0.452, 1.000)
		BumpHeight      1.37232
		BumpOffset      0.274465
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.403469
		GasToDust   0.25
		Particles   1794
		GasBright   0.0218544
		DustBright  0.607372
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.017
		Period          115.041
		Eccentricity    0.933302
		Inclination     -102.223
		AscendingNode   35.3489
		ArgOfPericenter 169.768
		MeanAnomaly     -90.8576
	}
}

Comet	"Jakku System C49"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.16941e-008
	Radius          32.9784
	InertiaMoment   0.398664

	Oblateness      0.00330794

	RotationPeriod  93.8734
	Obliquity       55.58
	EqAscendNode    126.934

	AbsMagn         5.82386
	SlopeParam      4.50363
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.685 0.640)

	Surface
	{
		SurfStyle       0.944594
		OceanStyle      0.806139
		Randomize      (0.003, 0.487, 0.073)
		colorDistMagn   0.188269
		colorDistFreq   0.378361
		detailScale     900.529
		colorConversion true
		snowLevel       2
		tropicLatitude  0.923293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59521
		terraceProb     0.306448
		erosion         0
		montesMagn      0.486983
		montesFreq      2.91445
		montesSpiky     0.892666
		montesFraction  0.621879
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.30574
		hillsFraction   0.588724
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235754
		craterFreq      0.212284
		craterDensity   0.953627
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529532
		volcanoTemp     1696.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.240, 0.256, 0.050)
		colorShelf     (0.293, 0.281, 0.294, 0.040)
		colorBeach     (0.337, 0.322, 0.333, 0.030)
		colorDesert    (0.381, 0.363, 0.377, 0.020)
		colorLowland   (0.425, 0.404, 0.416, 0.030)
		colorUpland    (0.469, 0.445, 0.454, 0.050)
		colorRock      (0.513, 0.487, 0.505, 0.020)
		colorSnow      (0.513, 0.487, 0.505, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.884661
		GasToDust   0.25
		Particles   2766
		GasBright   0.0294192
		DustBright  0.284294
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.8841
		Period          142.721
		Eccentricity    0.953019
		Inclination     -157.946
		AscendingNode   -63.1692
		ArgOfPericenter 24.5525
		MeanAnomaly     26.0522
	}
}

Comet	"Jakku System C50"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.60069e-016
	Radius          0.0944177
	InertiaMoment   0.396585

	Oblateness      0.00271796

	RotationPeriod  90.0604
	Obliquity       8.78566
	EqAscendNode    111.511

	AbsMagn         14.4993
	SlopeParam      5.11546
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.725 0.723)

	Surface
	{
		SurfStyle       0.667277
		OceanStyle      0.235425
		Randomize      (-0.126, -0.229, 0.714)
		colorDistMagn   0.372319
		colorDistFreq   1.15826e-006
		detailScale     2.57823
		colorConversion true
		snowLevel       2
		tropicLatitude  0.672705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595775
		terraceProb     0.290446
		erosion         0
		montesMagn      0.655071
		montesFreq      2.20809
		montesSpiky     0.949946
		montesFraction  0.56057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35551e-005
		hillsFraction   0.905292
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234197
		craterFreq      0.194489
		craterDensity   0.772564
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493991
		volcanoTemp     1502.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.202, 0.000)
		colorShelf     (0.290, 0.254, 0.231, 0.000)
		colorBeach     (0.341, 0.297, 0.275, 0.000)
		colorDesert    (0.370, 0.319, 0.267, 0.000)
		colorLowland   (0.407, 0.341, 0.304, 0.000)
		colorUpland    (0.450, 0.413, 0.369, 0.000)
		colorRock      (0.486, 0.449, 0.398, 0.000)
		colorSnow      (0.530, 0.478, 0.419, 1.000)
		BumpHeight      0.0849759
		BumpOffset      0.0169952
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.121983
		DustBright  0.676217
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.6811
		Period          171.77
		Eccentricity    0.961811
		Inclination     136.291
		AscendingNode   75.9979
		ArgOfPericenter 39.8037
		MeanAnomaly     -82.9294
	}
}

Comet	"Jakku System C51"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.78488e-012
	Radius          2.04255
	InertiaMoment   0.399151

	Oblateness      0.00387884

	RotationPeriod  86.6686
	Obliquity       321.991
	EqAscendNode    96.0885

	AbsMagn         9.11884
	SlopeParam      5.85805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.409 0.401 0.398)

	Surface
	{
		SurfStyle       0.911457
		OceanStyle      0.176627
		Randomize      (-0.251, -0.660, -0.145)
		colorDistMagn   0.956635
		colorDistFreq   0.00120439
		detailScale     55.7752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.901383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.371253
		terraceProb     0.262562
		erosion         0
		montesMagn      0.470605
		montesFreq      4.28335
		montesSpiky     0.891384
		montesFraction  0.732727
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0101952
		hillsFraction   0.627034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231274
		craterFreq      0.24137
		craterDensity   0.978945
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541468
		volcanoTemp     1888.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.140, 0.159, 0.050)
		colorShelf     (0.164, 0.164, 0.183, 0.040)
		colorBeach     (0.188, 0.189, 0.207, 0.030)
		colorDesert    (0.213, 0.213, 0.235, 0.020)
		colorLowland   (0.237, 0.237, 0.259, 0.030)
		colorUpland    (0.262, 0.261, 0.283, 0.050)
		colorRock      (0.287, 0.285, 0.314, 0.020)
		colorSnow      (0.287, 0.285, 0.314, 1.000)
		BumpHeight      1.83829
		BumpOffset      0.367659
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.436295
		GasToDust   0.25
		Particles   1861
		GasBright   0.102266
		DustBright  0.380421
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.9484
		Period          121.525
		Eccentricity    0.947236
		Inclination     98.6848
		AscendingNode   24.931
		ArgOfPericenter 116.865
		MeanAnomaly     -32.0404
	}
}

Comet	"Jakku System C52"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.15391e-008
	Radius          36.8881
	InertiaMoment   0.397722

	Oblateness      0.00315876

	RotationPeriod  83.5893
	Obliquity       275.197
	EqAscendNode    80.6659

	AbsMagn         5.57772
	SlopeParam      7.03832
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.421 0.419 0.417)

	Surface
	{
		SurfStyle       0.612166
		OceanStyle      0.483686
		Randomize      (-0.535, 0.612, -0.899)
		colorDistMagn   0.789825
		colorDistFreq   0.359331
		detailScale     1007.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.373437
		terraceProb     0.24687
		erosion         0
		montesMagn      0.617301
		montesFreq      3.26808
		montesSpiky     0.823482
		montesFraction  0.436755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.80375
		hillsFraction   0.57716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217926
		craterFreq      0.271299
		craterDensity   0.984486
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530767
		volcanoTemp     1260.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.143, 0.117, 0.000)
		colorShelf     (0.169, 0.147, 0.133, 0.000)
		colorBeach     (0.198, 0.172, 0.158, 0.000)
		colorDesert    (0.215, 0.184, 0.154, 0.000)
		colorLowland   (0.236, 0.197, 0.175, 0.000)
		colorUpland    (0.261, 0.239, 0.213, 0.000)
		colorRock      (0.282, 0.260, 0.229, 0.000)
		colorSnow      (0.308, 0.277, 0.242, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.917487
		GasToDust   0.25
		Particles   2833
		GasBright   0.26202
		DustBright  0.705153
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.0023
		Period          182.29
		Eccentricity    0.942852
		Inclination     174.488
		AscendingNode   98.9212
		ArgOfPericenter 8.10624
		MeanAnomaly     -31.3117
	}
}

Comet	"Jakku System C53"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            6.63202e-016
	Radius          0.126508
	InertiaMoment   0.399592

	Oblateness      0.00446526

	RotationPeriod  80.7506
	Obliquity       228.403
	EqAscendNode    65.2433

	AbsMagn         13.8179
	SlopeParam      2.36184
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.554 0.549)

	Surface
	{
		SurfStyle       0.757798
		OceanStyle      0.0806954
		Randomize      (-0.640, -0.915, -0.343)
		colorDistMagn   0.362993
		colorDistFreq   8.00814e-006
		detailScale     3.45451
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4225
		terraceProb     0.304303
		erosion         0
		montesMagn      0.505865
		montesFreq      3.3453
		montesSpiky     0.99095
		montesFraction  0.914228
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.7374e-005
		hillsFraction   0.71886
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234541
		craterFreq      0.253834
		craterDensity   0.901149
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.396862
		volcanoTemp     1682.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.188, 0.154, 0.000)
		colorShelf     (0.225, 0.194, 0.176, 0.000)
		colorBeach     (0.264, 0.227, 0.209, 0.000)
		colorDesert    (0.286, 0.244, 0.203, 0.000)
		colorLowland   (0.314, 0.260, 0.231, 0.000)
		colorUpland    (0.348, 0.316, 0.280, 0.000)
		colorRock      (0.376, 0.343, 0.302, 0.000)
		colorSnow      (0.410, 0.365, 0.319, 1.000)
		BumpHeight      0.113857
		BumpOffset      0.0227714
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.215021
		DustBright  0.436639
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.0203
		Period          166.586
		Eccentricity    0.942702
		Inclination     54.8208
		AscendingNode   -25.2374
		ArgOfPericenter 153.49
		MeanAnomaly     -147.472
	}
}

Comet	"Jakku System C54"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.1294e-012
	Radius          2.28407
	InertiaMoment   0.398393

	Oblateness      0.00361589

	RotationPeriod  78.1023
	Obliquity       181.608
	EqAscendNode    49.8208

	AbsMagn         8.90341
	SlopeParam      3.05591
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.629 0.625)

	Surface
	{
		SurfStyle       0.250401
		OceanStyle      0.255177
		Randomize      (0.735, -0.412, 0.105)
		colorDistMagn   0.171161
		colorDistFreq   0.00213861
		detailScale     62.3703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.138474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420811
		terraceProb     0.26039
		erosion         0
		montesMagn      0.408594
		montesFreq      3.06595
		montesSpiky     0.95439
		montesFraction  0.315185
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00947912
		hillsFraction   0.487443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244388
		craterFreq      0.265295
		craterDensity   0.867295
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.420618
		volcanoTemp     1302.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.252, 0.250, 0.000)
		colorShelf     (0.269, 0.267, 0.266, 0.000)
		colorBeach     (0.285, 0.283, 0.281, 0.000)
		colorDesert    (0.300, 0.299, 0.297, 0.000)
		colorLowland   (0.316, 0.315, 0.313, 0.000)
		colorUpland    (0.332, 0.330, 0.328, 0.000)
		colorRock      (0.348, 0.346, 0.344, 0.000)
		colorSnow      (0.364, 0.362, 0.359, 1.000)
		BumpHeight      2.05566
		BumpOffset      0.411133
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.469121
		GasToDust   0.25
		Particles   1927
		GasBright   0.130762
		DustBright  0.205384
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.8908
		Period          114.172
		Eccentricity    0.922246
		Inclination     -6.35635
		AscendingNode   -174.821
		ArgOfPericenter 126.861
		MeanAnomaly     141.59
	}
}

Comet	"Jakku System C55"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.96722e-008
	Radius          49.4385
	InertiaMoment   0.394421

	Oblateness      0.00498412

	RotationPeriod  75.6076
	Obliquity       134.814
	EqAscendNode    34.3982

	AbsMagn         5.32205
	SlopeParam      3.64992
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.669 0.666)

	Surface
	{
		SurfStyle       0.298689
		OceanStyle      0.99902
		Randomize      (-0.801, 0.008, 0.843)
		colorDistMagn   0.672283
		colorDistFreq   1.86074
		detailScale     1350
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648609
		terraceProb     0.373005
		erosion         0
		montesMagn      0.582965
		montesFreq      3.14567
		montesSpiky     0.820587
		montesFraction  0.357421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.98173
		hillsFraction   0.598144
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250201
		craterFreq      0.264262
		craterDensity   0.942311
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512776
		volcanoTemp     1499.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.268, 0.266, 0.000)
		colorShelf     (0.285, 0.284, 0.283, 0.000)
		colorBeach     (0.302, 0.301, 0.300, 0.000)
		colorDesert    (0.319, 0.318, 0.316, 0.000)
		colorLowland   (0.335, 0.335, 0.333, 0.000)
		colorUpland    (0.352, 0.351, 0.350, 0.000)
		colorRock      (0.369, 0.368, 0.366, 0.000)
		colorSnow      (0.386, 0.385, 0.383, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.950313
		GasToDust   0.25
		Particles   2899
		GasBright   0.367684
		DustBright  0.452949
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.6857
		Period          195.994
		Eccentricity    0.93896
		Inclination     -71.4755
		AscendingNode   82.5093
		ArgOfPericenter -37.4087
		MeanAnomaly     56.9375
	}
}

Comet	"Jakku System C56"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.22154e-015
	Radius          0.141424
	InertiaMoment   0.398919

	Oblateness      0.00410694

	RotationPeriod  73.239
	Obliquity       88.0199
	EqAscendNode    18.9756

	AbsMagn         13.2728
	SlopeParam      4.21398
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.722 0.720)

	Surface
	{
		SurfStyle       0.33689
		OceanStyle      0.773179
		Randomize      (0.430, -0.176, -0.804)
		colorDistMagn   0.214822
		colorDistFreq   1.4395e-005
		detailScale     3.86183
		colorConversion true
		snowLevel       2
		tropicLatitude  0.177894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365059
		terraceProb     0.310285
		erosion         0
		montesMagn      0.686977
		montesFreq      3.01305
		montesSpiky     0.929316
		montesFraction  0.23275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.20557e-005
		hillsFraction   0.642006
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257174
		craterFreq      0.225859
		craterDensity   0.915141
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485026
		volcanoTemp     1781.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.289, 0.288, 0.000)
		colorShelf     (0.308, 0.307, 0.306, 0.000)
		colorBeach     (0.326, 0.325, 0.324, 0.000)
		colorDesert    (0.344, 0.343, 0.342, 0.000)
		colorLowland   (0.362, 0.361, 0.360, 0.000)
		colorUpland    (0.380, 0.379, 0.378, 0.000)
		colorRock      (0.398, 0.397, 0.396, 0.000)
		colorSnow      (0.416, 0.415, 0.414, 1.000)
		BumpHeight      0.127282
		BumpOffset      0.0254564
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0207547
		GasToDust   0.25
		Particles   1021
		GasBright   0.00358345
		DustBright  0.501536
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.1992
		Period          175.87
		Eccentricity    0.96462
		Inclination     100.815
		AscendingNode   -5.229
		ArgOfPericenter 3.19782
		MeanAnomaly     -18.6103
	}
}

Comet	"Jakku System C57"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            9.4477e-012
	Radius          3.06206
	InertiaMoment   0.39727

	Oblateness      0.00570371

	RotationPeriod  70.9749
	Obliquity       41.2256
	EqAscendNode    3.55299

	AbsMagn         8.69057
	SlopeParam      4.79596
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.606 0.602)

	Surface
	{
		SurfStyle       0.818427
		OceanStyle      0.610253
		Randomize      (0.669, -0.067, 0.148)
		colorDistMagn   0.485003
		colorDistFreq   0.00695914
		detailScale     83.6147
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933476
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753592
		terraceProb     0.273723
		erosion         0
		montesMagn      0.486924
		montesFreq      3.17561
		montesSpiky     0.829342
		montesFraction  0.696448
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0180318
		hillsFraction   0.532765
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218436
		craterFreq      0.146609
		craterDensity   0.76948
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457455
		volcanoTemp     1634.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.206, 0.169, 0.000)
		colorShelf     (0.245, 0.212, 0.193, 0.000)
		colorBeach     (0.287, 0.248, 0.229, 0.000)
		colorDesert    (0.312, 0.267, 0.223, 0.000)
		colorLowland   (0.342, 0.285, 0.253, 0.000)
		colorUpland    (0.379, 0.345, 0.307, 0.000)
		colorRock      (0.410, 0.376, 0.331, 0.000)
		colorSnow      (0.446, 0.400, 0.349, 1.000)
		BumpHeight      2.75586
		BumpOffset      0.551171
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.501947
		GasToDust   0.25
		Particles   1993
		GasBright   0.065452
		DustBright  0.924154
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.4994
		Period          186.302
		Eccentricity    0.979453
		Inclination     120.869
		AscendingNode   -92.7616
		ArgOfPericenter 38.5653
		MeanAnomaly     -66.8529
	}
}

Comet	"Jakku System C58"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            7.30712e-008
	Radius          55.2497
	InertiaMoment   0.399378

	Oblateness      0.00464699

	RotationPeriod  68.7983
	Obliquity       354.431
	EqAscendNode    348.13

	AbsMagn         5.05493
	SlopeParam      5.4564
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.623 0.620)

	Surface
	{
		SurfStyle       0.237824
		OceanStyle      0.821769
		Randomize      (-0.240, -0.417, -0.406)
		colorDistMagn   0.763763
		colorDistFreq   1.7997
		detailScale     1508.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.18116
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438135
		terraceProb     0.149075
		erosion         0
		montesMagn      0.420003
		montesFreq      3.2203
		montesSpiky     0.969011
		montesFraction  0.321112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.32786
		hillsFraction   0.58091
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264559
		craterFreq      0.224738
		craterDensity   0.93652
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559979
		volcanoTemp     1620.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.248, 0.000)
		colorShelf     (0.266, 0.265, 0.264, 0.000)
		colorBeach     (0.282, 0.280, 0.279, 0.000)
		colorDesert    (0.297, 0.296, 0.295, 0.000)
		colorLowland   (0.313, 0.311, 0.310, 0.000)
		colorUpland    (0.329, 0.327, 0.326, 0.000)
		colorRock      (0.344, 0.343, 0.341, 0.000)
		colorSnow      (0.360, 0.358, 0.357, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.983139
		GasToDust   0.25
		Particles   2965
		GasBright   0.0843861
		DustBright  0.589706
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.3146
		Period          161.109
		Eccentricity    0.943171
		Inclination     -6.07743
		AscendingNode   52.6483
		ArgOfPericenter 37.393
		MeanAnomaly     -161.637
	}
}

Comet	"Jakku System C59"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.24991e-015
	Radius          0.189655
	InertiaMoment   0.398089

	Oblateness      0.00646432

	RotationPeriod  66.6953
	Obliquity       307.637
	EqAscendNode    332.708

	AbsMagn         12.8112
	SlopeParam      6.33832
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.498 0.397)

	Surface
	{
		SurfStyle       0.623237
		OceanStyle      0.654806
		Randomize      (-0.451, 0.228, -0.193)
		colorDistMagn   0.353558
		colorDistFreq   2.84286e-005
		detailScale     5.17885
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99585
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539815
		terraceProb     0.134023
		erosion         0
		montesMagn      0.528806
		montesFreq      2.81468
		montesSpiky     0.960294
		montesFraction  0.464779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.5616e-005
		hillsFraction   0.871484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276774
		craterFreq      0.263191
		craterDensity   0.886681
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.385867
		volcanoTemp     1204.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.169, 0.111, 0.000)
		colorShelf     (0.257, 0.174, 0.127, 0.000)
		colorBeach     (0.302, 0.204, 0.151, 0.000)
		colorDesert    (0.328, 0.219, 0.147, 0.000)
		colorLowland   (0.360, 0.234, 0.167, 0.000)
		colorUpland    (0.399, 0.284, 0.203, 0.000)
		colorRock      (0.431, 0.308, 0.218, 0.000)
		colorSnow      (0.470, 0.328, 0.230, 1.000)
		BumpHeight      0.17069
		BumpOffset      0.0341379
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0535804
		GasToDust   0.25
		Particles   1088
		GasBright   0.066061
		DustBright  0.292518
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.521
		Period          111.637
		Eccentricity    0.955716
		Inclination     -127.734
		AscendingNode   -116.834
		ArgOfPericenter -178.506
		MeanAnomaly     -79.2166
	}
}

Comet	"Jakku System C60"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.74015e-011
	Radius          3.42078
	InertiaMoment   0.399806

	Oblateness      0.00525265

	RotationPeriod  64.6542
	Obliquity       260.843
	EqAscendNode    317.285

	AbsMagn         8.47966
	SlopeParam      8.72366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.554 0.471 0.371)

	Surface
	{
		SurfStyle       0.560636
		OceanStyle      0.602309
		Randomize      (-0.496, 0.808, -0.001)
		colorDistMagn   0.772144
		colorDistFreq   0.00238362
		detailScale     93.4102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577969
		terraceProb     0.261468
		erosion         0
		montesMagn      0.387359
		montesFreq      3.51321
		montesSpiky     0.983803
		montesFraction  0.673332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0236353
		hillsFraction   0.573266
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223274
		craterFreq      0.218564
		craterDensity   0.948142
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556062
		volcanoTemp     1422.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.160, 0.104, 0.000)
		colorShelf     (0.222, 0.165, 0.119, 0.000)
		colorBeach     (0.261, 0.193, 0.141, 0.000)
		colorDesert    (0.283, 0.207, 0.137, 0.000)
		colorLowland   (0.310, 0.222, 0.156, 0.000)
		colorUpland    (0.344, 0.269, 0.189, 0.000)
		colorRock      (0.371, 0.292, 0.204, 0.000)
		colorSnow      (0.405, 0.311, 0.215, 1.000)
		BumpHeight      3.0787
		BumpOffset      0.615741
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.534772
		GasToDust   0.25
		Particles   2060
		GasBright   0.205097
		DustBright  0.637969
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.9842
		Period          166.304
		Eccentricity    0.969705
		Inclination     69.326
		AscendingNode   -92.7674
		ArgOfPericenter 163.573
		MeanAnomaly     -23.4145
	}
}

Comet	"Jakku System C61"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.34588e-007
	Radius          74.117
	InertiaMoment   0.398671

	Oblateness      0.00732192

	RotationPeriod  62.6653
	Obliquity       214.048
	EqAscendNode    301.863

	AbsMagn         4.77397
	SlopeParam      2.7234
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.811 0.788 0.754)

	Surface
	{
		SurfStyle       0.930284
		OceanStyle      0.131723
		Randomize      (0.346, 0.073, -0.618)
		colorDistMagn   0.964583
		colorDistFreq   4.2647
		detailScale     2023.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.752541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.324056
		terraceProb     0.402297
		erosion         0
		montesMagn      0.544025
		montesFreq      2.89685
		montesSpiky     0.841518
		montesFraction  0.855046
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.0307
		hillsFraction   0.716192
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227809
		craterFreq      0.240325
		craterDensity   1.01297
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537264
		volcanoTemp     1885.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.276, 0.302, 0.050)
		colorShelf     (0.324, 0.323, 0.347, 0.040)
		colorBeach     (0.373, 0.370, 0.392, 0.030)
		colorDesert    (0.422, 0.418, 0.445, 0.020)
		colorLowland   (0.470, 0.465, 0.490, 0.030)
		colorUpland    (0.519, 0.512, 0.535, 0.050)
		colorRock      (0.568, 0.560, 0.596, 0.020)
		colorSnow      (0.568, 0.560, 0.596, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.15949
		DustBright  0.368062
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.8962
		Period          150.288
		Eccentricity    0.933795
		Inclination     81.2926
		AscendingNode   164.422
		ArgOfPericenter -40.8995
		MeanAnomaly     -7.46762
	}
}

Comet	"Jakku System C62"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.14406e-015
	Radius          0.211792
	InertiaMoment   0.396607

	Oblateness      0.00586422

	RotationPeriod  60.7202
	Obliquity       167.254
	EqAscendNode    286.44

	AbsMagn         12.4061
	SlopeParam      3.35595
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.827 0.728 0.684)

	Surface
	{
		SurfStyle       0.775737
		OceanStyle      0.725196
		Randomize      (0.388, -0.315, 0.513)
		colorDistMagn   0.171529
		colorDistFreq   2.31072e-005
		detailScale     5.78335
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445336
		terraceProb     0.460702
		erosion         0
		montesMagn      0.449667
		montesFreq      2.98116
		montesSpiky     0.793244
		montesFraction  0.695499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000126071
		hillsFraction   0.67211
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248559
		craterFreq      0.194845
		craterDensity   0.794374
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487186
		volcanoTemp     1757.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.247, 0.191, 0.000)
		colorShelf     (0.331, 0.255, 0.219, 0.000)
		colorBeach     (0.389, 0.298, 0.260, 0.000)
		colorDesert    (0.422, 0.320, 0.253, 0.000)
		colorLowland   (0.463, 0.342, 0.287, 0.000)
		colorUpland    (0.513, 0.415, 0.349, 0.000)
		colorRock      (0.554, 0.451, 0.376, 0.000)
		colorSnow      (0.604, 0.480, 0.397, 1.000)
		BumpHeight      0.190613
		BumpOffset      0.0381226
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0864065
		GasToDust   0.25
		Particles   1154
		GasBright   0.0766236
		DustBright  0.135415
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.4515
		Period          169.962
		Eccentricity    0.972612
		Inclination     131.904
		AscendingNode   1.43023
		ArgOfPericenter 52.9186
		MeanAnomaly     -24.424
	}
}

Comet	"Jakku System C63"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.20514e-011
	Radius          4.59063
	InertiaMoment   0.399157

	Oblateness      0.00830937

	RotationPeriod  58.8116
	Obliquity       120.46
	EqAscendNode    271.017

	AbsMagn         8.27009
	SlopeParam      3.92876
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.508 0.505 0.502)

	Surface
	{
		SurfStyle       0.220576
		OceanStyle      0.42446
		Randomize      (0.856, -0.755, -0.950)
		colorDistMagn   0.478829
		colorDistFreq   0.00595506
		detailScale     125.355
		colorConversion true
		snowLevel       2
		tropicLatitude  0.753259
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698947
		terraceProb     0.340212
		erosion         0
		montesMagn      0.253798
		montesFreq      2.34061
		montesSpiky     0.951997
		montesFraction  0.533625
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.031621
		hillsFraction   0.540212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25407
		craterFreq      0.24919
		craterDensity   0.834559
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575045
		volcanoTemp     1562.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.202, 0.201, 0.000)
		colorShelf     (0.216, 0.215, 0.213, 0.000)
		colorBeach     (0.229, 0.227, 0.226, 0.000)
		colorDesert    (0.241, 0.240, 0.239, 0.000)
		colorLowland   (0.254, 0.252, 0.251, 0.000)
		colorUpland    (0.267, 0.265, 0.264, 0.000)
		colorRock      (0.279, 0.278, 0.276, 0.000)
		colorSnow      (0.292, 0.290, 0.289, 1.000)
		BumpHeight      4.13157
		BumpOffset      0.826313
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.567598
		GasToDust   0.25
		Particles   2126
		GasBright   0.292827
		DustBright  0.403698
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.5119
		Period          98.2014
		Eccentricity    0.931709
		Inclination     -153.978
		AscendingNode   -57.6812
		ArgOfPericenter -88.8028
		MeanAnomaly     -167.97
	}
}

Comet	"Jakku System C64"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.47894e-007
	Radius          82.734
	InertiaMoment   0.397732

	Oblateness      0.00667517

	RotationPeriod  56.9329
	Obliquity       73.6655
	EqAscendNode    255.595

	AbsMagn         4.47612
	SlopeParam      4.49567
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.746 0.744)

	Surface
	{
		SurfStyle       0.492262
		OceanStyle      0.133397
		Randomize      (0.048, -0.723, -0.817)
		colorDistMagn   0.782962
		colorDistFreq   4.67647
		detailScale     2259.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.852655
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462975
		terraceProb     0.148196
		erosion         0
		montesMagn      0.385215
		montesFreq      2.06221
		montesSpiky     0.922722
		montesFraction  0.262422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.2973
		hillsFraction   0.785098
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234406
		craterFreq      0.23909
		craterDensity   0.758596
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432842
		volcanoTemp     1533.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.298, 0.000)
		colorShelf     (0.319, 0.317, 0.316, 0.000)
		colorBeach     (0.338, 0.336, 0.335, 0.000)
		colorDesert    (0.356, 0.354, 0.353, 0.000)
		colorLowland   (0.375, 0.373, 0.372, 0.000)
		colorUpland    (0.394, 0.392, 0.391, 0.000)
		colorRock      (0.413, 0.410, 0.409, 0.000)
		colorSnow      (0.431, 0.429, 0.428, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.182679
		DustBright  0.198333
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.9199
		Period          142.987
		Eccentricity    0.928907
		Inclination     -92.3708
		AscendingNode   56.1479
		ArgOfPericenter 59.3651
		MeanAnomaly     -135.565
	}
}

Comet	"Jakku System C65"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            7.63285e-015
	Radius          0.284334
	InertiaMoment   0.399597

	Oblateness      0.00946844

	RotationPeriod  55.0783
	Obliquity       26.8712
	EqAscendNode    240.172

	AbsMagn         12.0418
	SlopeParam      5.10645
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.533 0.528 0.523)

	Surface
	{
		SurfStyle       0.340535
		OceanStyle      0.495347
		Randomize      (-0.387, -0.770, 0.049)
		colorDistMagn   0.778526
		colorDistFreq   2.13484e-005
		detailScale     7.76421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.6717
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46796
		terraceProb     0.700425
		erosion         0
		montesMagn      0.371611
		montesFreq      2.75313
		montesSpiky     0.906624
		montesFraction  0.556585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000168353
		hillsFraction   0.741653
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240288
		craterFreq      0.237141
		craterDensity   0.763765
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532142
		volcanoTemp     1475.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.211, 0.209, 0.000)
		colorShelf     (0.227, 0.224, 0.222, 0.000)
		colorBeach     (0.240, 0.237, 0.235, 0.000)
		colorDesert    (0.253, 0.251, 0.248, 0.000)
		colorLowland   (0.267, 0.264, 0.262, 0.000)
		colorUpland    (0.280, 0.277, 0.275, 0.000)
		colorRock      (0.293, 0.290, 0.288, 0.000)
		colorSnow      (0.307, 0.303, 0.301, 1.000)
		BumpHeight      0.255901
		BumpOffset      0.0511801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.119232
		GasToDust   0.25
		Particles   1220
		GasBright   0.033323
		DustBright  0.832175
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.5607
		Period          163.012
		Eccentricity    0.954485
		Inclination     47.8502
		AscendingNode   115.112
		ArgOfPericenter -103.356
		MeanAnomaly     24.251
	}
}

Comet	"Jakku System C66"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.90347e-011
	Radius          5.12207
	InertiaMoment   0.398401

	Oblateness      0.00762445

	RotationPeriod  53.2422
	Obliquity       340.077
	EqAscendNode    224.75

	AbsMagn         8.06125
	SlopeParam      5.8462
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.782 0.779 0.777)

	Surface
	{
		SurfStyle       0.000246539
		OceanStyle      0.606807
		Randomize      (-0.913, 0.602, -0.044)
		colorDistMagn   0.716274
		colorDistFreq   0.0146754
		detailScale     139.867
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902097
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.359825
		terraceProb     0.120155
		erosion         0
		montesMagn      0.563468
		montesFreq      2.31585
		montesSpiky     0.933751
		montesFraction  0.194751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0546199
		hillsFraction   0.525955
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241178
		craterFreq      0.250194
		craterDensity   0.772728
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500311
		volcanoTemp     1461.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.312, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.330, 0.000)
		colorBeach     (0.352, 0.351, 0.350, 0.000)
		colorDesert    (0.371, 0.370, 0.369, 0.000)
		colorLowland   (0.391, 0.390, 0.388, 0.000)
		colorUpland    (0.411, 0.409, 0.408, 0.000)
		colorRock      (0.430, 0.429, 0.427, 0.000)
		colorSnow      (0.450, 0.448, 0.447, 1.000)
		BumpHeight      4.60986
		BumpOffset      0.921973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.600424
		GasToDust   0.25
		Particles   2192
		GasBright   0.0536493
		DustBright  0.496336
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.466
		Period          125.179
		Eccentricity    0.953297
		Inclination     118.652
		AscendingNode   86.3085
		ArgOfPericenter 27.8086
		MeanAnomaly     108.486
	}
}

Comet	"Jakku System C67"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.5659e-007
	Radius          111.118
	InertiaMoment   0.394641

	Oblateness      0.01064

	RotationPeriod  51.4197
	Obliquity       293.283
	EqAscendNode    209.327

	AbsMagn         4.15732
	SlopeParam      7.01408
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.597 0.593 0.590)

	Surface
	{
		SurfStyle       0.770819
		OceanStyle      0.52775
		Randomize      (-0.581, 0.949, 0.712)
		colorDistMagn   0.603827
		colorDistFreq   6.85482
		detailScale     3034.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316165
		terraceProb     0.159259
		erosion         0
		montesMagn      0.484573
		montesFreq      3.08805
		montesSpiky     0.983079
		montesFraction  0.842783
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.8313
		hillsFraction   0.609176
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250046
		craterFreq      0.325884
		craterDensity   0.867299
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562075
		volcanoTemp     1472
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.202, 0.165, 0.000)
		colorShelf     (0.239, 0.208, 0.189, 0.000)
		colorBeach     (0.280, 0.243, 0.224, 0.000)
		colorDesert    (0.304, 0.261, 0.218, 0.000)
		colorLowland   (0.334, 0.279, 0.248, 0.000)
		colorUpland    (0.370, 0.338, 0.301, 0.000)
		colorRock      (0.400, 0.368, 0.324, 0.000)
		colorSnow      (0.436, 0.391, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0367164
		DustBright  0.197755
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.377
		Period          153.928
		Eccentricity    0.954954
		Inclination     -62.1776
		AscendingNode   -49.731
		ArgOfPericenter -17.2013
		MeanAnomaly     -61.5963
	}
}

Comet	"Jakku System C68"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.40587e-014
	Radius          0.317098
	InertiaMoment   0.398925

	Oblateness      0.0087682

	RotationPeriod  49.606
	Obliquity       246.488
	EqAscendNode    193.904

	AbsMagn         11.7082
	SlopeParam      2.35103
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.596 0.592)

	Surface
	{
		SurfStyle       0.58717
		OceanStyle      0.638081
		Randomize      (-0.791, -0.013, -0.333)
		colorDistMagn   0.0790856
		colorDistFreq   2.43356e-005
		detailScale     8.65888
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.373758
		terraceProb     0.229204
		erosion         0
		montesMagn      0.477132
		montesFreq      3.30036
		montesSpiky     0.950959
		montesFraction  0.797229
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000262832
		hillsFraction   0.713364
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247875
		craterFreq      0.169713
		craterDensity   0.884526
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491262
		volcanoTemp     1472.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.203, 0.166, 0.000)
		colorShelf     (0.239, 0.209, 0.189, 0.000)
		colorBeach     (0.281, 0.244, 0.225, 0.000)
		colorDesert    (0.305, 0.262, 0.219, 0.000)
		colorLowland   (0.335, 0.280, 0.249, 0.000)
		colorUpland    (0.371, 0.340, 0.302, 0.000)
		colorRock      (0.401, 0.369, 0.326, 0.000)
		colorSnow      (0.437, 0.393, 0.343, 1.000)
		BumpHeight      0.285388
		BumpOffset      0.0570776
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.152058
		GasToDust   0.25
		Particles   1286
		GasBright   0.155034
		DustBright  0.563924
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.1353
		Period          76.9582
		Eccentricity    0.943656
		Inclination     160.872
		AscendingNode   89.3666
		ArgOfPericenter -75.1927
		MeanAnomaly     88.4178
	}
}

Comet	"Jakku System C69"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.08734e-010
	Radius          6.88249
	InertiaMoment   0.397284

	Oblateness      0.0124095

	RotationPeriod  47.7963
	Obliquity       199.694
	EqAscendNode    178.482

	AbsMagn         7.85258
	SlopeParam      3.04728
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.629 0.587)

	Surface
	{
		SurfStyle       0.153832
		OceanStyle      0.642054
		Randomize      (0.543, 0.753, -0.389)
		colorDistMagn   0.183279
		colorDistFreq   0.0309174
		detailScale     187.938
		colorConversion true
		snowLevel       2
		tropicLatitude  0.900083
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512402
		terraceProb     0.120515
		erosion         0
		montesMagn      0.471689
		montesFreq      2.94356
		montesSpiky     0.992361
		montesFraction  0.649486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0998868
		hillsFraction   0.68447
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246655
		craterFreq      0.256088
		craterDensity   1.01794
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489844
		volcanoTemp     1190.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.252, 0.235, 0.000)
		colorShelf     (0.300, 0.267, 0.250, 0.000)
		colorBeach     (0.317, 0.283, 0.264, 0.000)
		colorDesert    (0.335, 0.299, 0.279, 0.000)
		colorLowland   (0.352, 0.314, 0.294, 0.000)
		colorUpland    (0.370, 0.330, 0.308, 0.000)
		colorRock      (0.388, 0.346, 0.323, 0.000)
		colorSnow      (0.405, 0.362, 0.338, 1.000)
		BumpHeight      6.19424
		BumpOffset      1.23885
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.63325
		GasToDust   0.25
		Particles   2259
		GasBright   0.110819
		DustBright  0.292626
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.3978
		Period          161.752
		Eccentricity    0.95807
		Inclination     45.4641
		AscendingNode   -20.7641
		ArgOfPericenter -82.5292
		MeanAnomaly     -136.684
	}
}

Comet	"Jakku System C70"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.34801e-018
	Radius          0.0196303
	InertiaMoment   0.399384

	Oblateness      0.010182

	RotationPeriod  45.9861
	Obliquity       152.9
	EqAscendNode    163.059

	AbsMagn         3.81201
	SlopeParam      3.64208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.420 0.415 0.413)

	Surface
	{
		SurfStyle       0.290125
		OceanStyle      0.963757
		Randomize      (0.400, -0.991, 0.111)
		colorDistMagn   0.957278
		colorDistFreq   2.53426e-007
		detailScale     0.536038
		colorConversion true
		snowLevel       2
		tropicLatitude  0.547985
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440439
		terraceProb     0.140795
		erosion         0
		montesMagn      0.4154
		montesFreq      4.40801
		montesSpiky     0.899693
		montesFraction  0.563622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.64691e-007
		hillsFraction   0.642923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285762
		craterFreq      0.246851
		craterDensity   0.950287
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480379
		volcanoTemp     1575.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.166, 0.165, 0.000)
		colorShelf     (0.179, 0.176, 0.175, 0.000)
		colorBeach     (0.189, 0.187, 0.186, 0.000)
		colorDesert    (0.200, 0.197, 0.196, 0.000)
		colorLowland   (0.210, 0.207, 0.206, 0.000)
		colorUpland    (0.221, 0.218, 0.217, 0.000)
		colorRock      (0.231, 0.228, 0.227, 0.000)
		colorSnow      (0.242, 0.238, 0.237, 1.000)
		BumpHeight      0.0176673
		BumpOffset      0.00353345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.296327
		DustBright  0.591604
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.6281
		Period          220.727
		Eccentricity    0.966501
		Inclination     -55.9791
		AscendingNode   -153.676
		ArgOfPericenter 131.785
		MeanAnomaly     111.921
	}
}

Comet	"Jakku System C71"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.58944e-014
	Radius          0.426291
	InertiaMoment   0.398097

	Oblateness      0.0145425

	RotationPeriod  44.1708
	Obliquity       106.105
	EqAscendNode    147.637

	AbsMagn         11.3986
	SlopeParam      4.20622
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.614 0.610 0.606)

	Surface
	{
		SurfStyle       0.445751
		OceanStyle      0.378918
		Randomize      (0.858, -0.165, -0.552)
		colorDistMagn   0.162723
		colorDistFreq   6.68826e-005
		detailScale     11.6406
		colorConversion true
		snowLevel       2
		tropicLatitude  0.555208
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407659
		terraceProb     0.181342
		erosion         0
		montesMagn      0.646967
		montesFreq      2.97983
		montesSpiky     0.977405
		montesFraction  0.688269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000511125
		hillsFraction   0.486733
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203294
		craterFreq      0.215502
		craterDensity   0.869268
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511832
		volcanoTemp     1354.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.244, 0.243, 0.000)
		colorShelf     (0.261, 0.259, 0.258, 0.000)
		colorBeach     (0.276, 0.274, 0.273, 0.000)
		colorDesert    (0.292, 0.290, 0.288, 0.000)
		colorLowland   (0.307, 0.305, 0.303, 0.000)
		colorUpland    (0.322, 0.320, 0.318, 0.000)
		colorRock      (0.338, 0.335, 0.333, 0.000)
		colorSnow      (0.353, 0.350, 0.349, 1.000)
		BumpHeight      0.383662
		BumpOffset      0.0767324
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.184884
		GasToDust   0.25
		Particles   1353
		GasBright   0.22483
		DustBright  0.347588
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.5311
		Period          178.514
		Eccentricity    0.9629
		Inclination     -109.892
		AscendingNode   -35.2998
		ArgOfPericenter 63.3747
		MeanAnomaly     -164.671
	}
}

Comet	"Jakku System C72"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.00275e-010
	Radius          7.66735
	InertiaMoment   0.399812

	Oblateness      0.0119807

	RotationPeriod  42.3457
	Obliquity       59.3111
	EqAscendNode    132.214

	AbsMagn         7.6435
	SlopeParam      4.78761
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.666 0.661 0.657)

	Surface
	{
		SurfStyle       0.968501
		OceanStyle      0.441711
		Randomize      (0.635, -0.785, -0.679)
		colorDistMagn   0.993343
		colorDistFreq   0.0122469
		detailScale     209.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911002
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751774
		terraceProb     0.285752
		erosion         0
		montesMagn      0.578235
		montesFreq      3.34543
		montesSpiky     0.95122
		montesFraction  0.180004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.16973
		hillsFraction   0.697332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227325
		craterFreq      0.19749
		craterDensity   0.910623
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464981
		volcanoTemp     1183.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.231, 0.263, 0.050)
		colorShelf     (0.266, 0.271, 0.302, 0.040)
		colorBeach     (0.306, 0.310, 0.342, 0.030)
		colorDesert    (0.346, 0.350, 0.388, 0.020)
		colorLowland   (0.386, 0.390, 0.427, 0.030)
		colorUpland    (0.426, 0.429, 0.466, 0.050)
		colorRock      (0.466, 0.469, 0.519, 0.020)
		colorSnow      (0.466, 0.469, 0.519, 1.000)
		BumpHeight      6.90062
		BumpOffset      1.38012
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.666076
		GasToDust   0.25
		Particles   2325
		GasBright   0.116074
		DustBright  0.14083
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   20.5577
		Period          85.6965
		Eccentricity    0.965176
		Inclination     134.239
		AscendingNode   -84.7538
		ArgOfPericenter -39.2646
		MeanAnomaly     117.834
	}
}

Comet	"Jakku System C73"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            6.16662e-018
	Radius          0.0264039
	InertiaMoment   0.398677

	Oblateness      0.0172928

	RotationPeriod  40.5059
	Obliquity       12.5168
	EqAscendNode    116.792

	AbsMagn         3.43229
	SlopeParam      5.44636
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.644 0.639)

	Surface
	{
		SurfStyle       0.497414
		OceanStyle      0.843511
		Randomize      (-0.036, -0.146, 0.103)
		colorDistMagn   0.915052
		colorDistFreq   4.23244e-007
		detailScale     0.721004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.443114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546697
		terraceProb     0.327318
		erosion         0
		montesMagn      0.535083
		montesFreq      3.71668
		montesSpiky     0.868089
		montesFraction  0.802795
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.58794e-006
		hillsFraction   0.506636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258158
		craterFreq      0.255059
		craterDensity   0.918239
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490684
		volcanoTemp     1732.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.257, 0.255, 0.000)
		colorShelf     (0.276, 0.274, 0.271, 0.000)
		colorBeach     (0.292, 0.290, 0.287, 0.000)
		colorDesert    (0.308, 0.306, 0.303, 0.000)
		colorLowland   (0.324, 0.322, 0.319, 0.000)
		colorUpland    (0.341, 0.338, 0.335, 0.000)
		colorRock      (0.357, 0.354, 0.351, 0.000)
		colorSnow      (0.373, 0.370, 0.367, 1.000)
		BumpHeight      0.0237636
		BumpOffset      0.00475271
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00805417
		DustBright  0.733337
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.8111
		Period          180.754
		Eccentricity    0.974466
		Inclination     -145.279
		AscendingNode   -139.642
		ArgOfPericenter -164.917
		MeanAnomaly     -161.315
	}
}

Comet	"Jakku System C74"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.76944e-014
	Radius          0.474621
	InertiaMoment   0.396629

	Oblateness      0.0141568

	RotationPeriod  38.6463
	Obliquity       325.723
	EqAscendNode    101.369

	AbsMagn         11.1082
	SlopeParam      6.32311
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.677 0.672)

	Surface
	{
		SurfStyle       0.188501
		OceanStyle      0.349757
		Randomize      (0.837, 0.923, -0.842)
		colorDistMagn   0.452628
		colorDistFreq   0.000102479
		detailScale     12.9603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958626
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37178
		terraceProb     0.597847
		erosion         0
		montesMagn      0.529659
		montesFreq      2.70606
		montesSpiky     0.960013
		montesFraction  0.854334
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000365926
		hillsFraction   0.646873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25356
		craterFreq      0.233175
		craterDensity   0.970685
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472251
		volcanoTemp     1830.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.269, 0.000)
		colorShelf     (0.289, 0.288, 0.285, 0.000)
		colorBeach     (0.306, 0.304, 0.302, 0.000)
		colorDesert    (0.323, 0.321, 0.319, 0.000)
		colorLowland   (0.340, 0.338, 0.336, 0.000)
		colorUpland    (0.357, 0.355, 0.353, 0.000)
		colorRock      (0.374, 0.372, 0.369, 0.000)
		colorSnow      (0.391, 0.389, 0.386, 1.000)
		BumpHeight      0.427159
		BumpOffset      0.0854318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.21771
		GasToDust   0.25
		Particles   1419
		GasBright   0.0297726
		DustBright  0.396105
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.2013
		Period          217.079
		Eccentricity    0.963907
		Inclination     79.1546
		AscendingNode   -142.724
		ArgOfPericenter 152.423
		MeanAnomaly     112.778
	}
}

Comet	"Jakku System C75"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.68881e-010
	Radius          10.3189
	InertiaMoment   0.399163

	Oblateness      0.0209874

	RotationPeriod  36.7614
	Obliquity       278.928
	EqAscendNode    85.9464

	AbsMagn         7.43345
	SlopeParam      8.60655
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.564 0.560 0.559)

	Surface
	{
		SurfStyle       0.533404
		OceanStyle      0.549881
		Randomize      (-0.296, 0.594, -0.739)
		colorDistMagn   0.779565
		colorDistFreq   0.073693
		detailScale     281.774
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480257
		terraceProb     0.253946
		erosion         0
		montesMagn      0.428598
		montesFreq      3.44237
		montesSpiky     0.856235
		montesFraction  0.481627
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.350045
		hillsFraction   0.564656
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216632
		craterFreq      0.209504
		craterDensity   0.883276
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568417
		volcanoTemp     1973.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.191, 0.157, 0.000)
		colorShelf     (0.225, 0.196, 0.179, 0.000)
		colorBeach     (0.265, 0.230, 0.212, 0.000)
		colorDesert    (0.287, 0.247, 0.207, 0.000)
		colorLowland   (0.316, 0.263, 0.235, 0.000)
		colorUpland    (0.349, 0.319, 0.285, 0.000)
		colorRock      (0.378, 0.347, 0.307, 0.000)
		colorSnow      (0.411, 0.370, 0.324, 1.000)
		BumpHeight      9.28699
		BumpOffset      1.8574
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.698902
		GasToDust   0.25
		Particles   2391
		GasBright   0.117395
		DustBright  0.792969
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.4697
		Period          219.371
		Eccentricity    0.983581
		Inclination     22.2347
		AscendingNode   163.179
		ArgOfPericenter 118.478
		MeanAnomaly     -61.5772
	}
}

Comet	"Jakku System C76"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.13581e-017
	Radius          0.0293785
	InertiaMoment   0.397742

	Oblateness      0.0174147

	RotationPeriod  34.8452
	Obliquity       232.134
	EqAscendNode    70.5238

	AbsMagn         3.00621
	SlopeParam      2.71393
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.552 0.549)

	Surface
	{
		SurfStyle       0.212605
		OceanStyle      0.103103
		Randomize      (0.878, 0.208, 0.184)
		colorDistMagn   0.769047
		colorDistFreq   5.02125e-007
		detailScale     0.802229
		colorConversion true
		snowLevel       2
		tropicLatitude  0.402212
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389371
		terraceProb     0.125394
		erosion         0
		montesMagn      0.400372
		montesFreq      3.07107
		montesSpiky     0.8988
		montesFraction  0.757526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.55859e-006
		hillsFraction   0.539747
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214437
		craterFreq      0.244877
		craterDensity   1.01571
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439798
		volcanoTemp     1425.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.221, 0.219, 0.000)
		colorShelf     (0.239, 0.235, 0.233, 0.000)
		colorBeach     (0.253, 0.248, 0.247, 0.000)
		colorDesert    (0.267, 0.262, 0.261, 0.000)
		colorLowland   (0.281, 0.276, 0.274, 0.000)
		colorUpland    (0.295, 0.290, 0.288, 0.000)
		colorRock      (0.309, 0.304, 0.302, 0.000)
		colorSnow      (0.323, 0.317, 0.315, 1.000)
		BumpHeight      0.0264407
		BumpOffset      0.00528813
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.111832
		DustBright  0.483019
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   14.4084
		Period          50.2836
		Eccentricity    0.952471
		Inclination     -104.542
		AscendingNode   175.152
		ArgOfPericenter -2.91342
		MeanAnomaly     -179.697
	}
}

Comet	"Jakku System C77"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            8.78468e-014
	Radius          0.639142
	InertiaMoment   0.399603

	Oblateness      0.0262037

	RotationPeriod  32.891
	Obliquity       185.34
	EqAscendNode    55.1012

	AbsMagn         10.8333
	SlopeParam      3.34781
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.689 0.624)

	Surface
	{
		SurfStyle       0.452811
		OceanStyle      0.407993
		Randomize      (-0.853, -0.074, -0.031)
		colorDistMagn   0.690094
		colorDistFreq   0.000172141
		detailScale     17.4528
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938889
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598803
		terraceProb     0.312437
		erosion         0
		montesMagn      0.611695
		montesFreq      2.11153
		montesSpiky     0.888871
		montesFraction  0.41274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000970655
		hillsFraction   0.56876
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253119
		craterFreq      0.187596
		craterDensity   1.05016
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.583096
		volcanoTemp     1689.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.276, 0.250, 0.000)
		colorShelf     (0.338, 0.293, 0.265, 0.000)
		colorBeach     (0.358, 0.310, 0.281, 0.000)
		colorDesert    (0.378, 0.327, 0.296, 0.000)
		colorLowland   (0.398, 0.345, 0.312, 0.000)
		colorUpland    (0.418, 0.362, 0.328, 0.000)
		colorRock      (0.438, 0.379, 0.343, 0.000)
		colorSnow      (0.457, 0.396, 0.359, 1.000)
		BumpHeight      0.575228
		BumpOffset      0.115046
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.250536
		GasToDust   0.25
		Particles   1485
		GasBright   0.0690088
		DustBright  0.210329
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.8636
		Period          173.21
		Eccentricity    0.948539
		Inclination     -65.6286
		AscendingNode   -141.827
		ArgOfPericenter -47.2927
		MeanAnomaly     -14.2377
	}
}

Comet	"Jakku System C78"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            6.79432e-010
	Radius          11.4734
	InertiaMoment   0.398408

	Oblateness      0.0221192

	RotationPeriod  30.8911
	Obliquity       138.545
	EqAscendNode    39.6786

	AbsMagn         7.22182
	SlopeParam      3.92104
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.739 0.737 0.736)

	Surface
	{
		SurfStyle       0.696621
		OceanStyle      0.912726
		Randomize      (-0.577, 0.445, 0.758)
		colorDistMagn   0.633762
		colorDistFreq   0.0862892
		detailScale     313.301
		colorConversion true
		snowLevel       2
		tropicLatitude  0.609494
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66468
		terraceProb     0.285151
		erosion         0
		montesMagn      0.299528
		montesFreq      2.78296
		montesSpiky     0.931973
		montesFraction  0.280085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.280719
		hillsFraction   0.442747
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259817
		craterFreq      0.224994
		craterDensity   0.898745
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438316
		volcanoTemp     1031.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.251, 0.206, 0.000)
		colorShelf     (0.296, 0.258, 0.236, 0.000)
		colorBeach     (0.347, 0.302, 0.280, 0.000)
		colorDesert    (0.377, 0.324, 0.272, 0.000)
		colorLowland   (0.414, 0.347, 0.309, 0.000)
		colorUpland    (0.458, 0.420, 0.375, 0.000)
		colorRock      (0.495, 0.457, 0.405, 0.000)
		colorSnow      (0.540, 0.487, 0.427, 1.000)
		BumpHeight      10.3261
		BumpOffset      2.06522
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.731728
		GasToDust   0.25
		Particles   2458
		GasBright   0.233799
		DustBright  0.530025
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.7176
		Period          141.489
		Eccentricity    0.950754
		Inclination     -121.015
		AscendingNode   44.2216
		ArgOfPericenter -122.354
		MeanAnomaly     62.5252
	}
}

Comet	"Jakku System C79"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.09202e-017
	Radius          0.039588
	InertiaMoment   0.394811

	Oblateness      0.0334097

	RotationPeriod  28.8369
	Obliquity       91.751
	EqAscendNode    24.256

	AbsMagn         2.51441
	SlopeParam      4.48772
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.529 0.449 0.351)

	Surface
	{
		SurfStyle       0.18079
		OceanStyle      0.769554
		Randomize      (-0.349, -0.643, 0.889)
		colorDistMagn   0.170111
		colorDistFreq   6.32284e-007
		detailScale     1.08102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995056
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482345
		terraceProb     0.308976
		erosion         0
		montesMagn      0.495928
		montesFreq      3.48177
		montesSpiky     0.858672
		montesFraction  0.288459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2851e-006
		hillsFraction   0.711297
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247681
		craterFreq      0.202932
		craterDensity   0.984822
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446319
		volcanoTemp     1686.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.180, 0.140, 0.000)
		colorShelf     (0.225, 0.191, 0.149, 0.000)
		colorBeach     (0.238, 0.202, 0.158, 0.000)
		colorDesert    (0.251, 0.213, 0.167, 0.000)
		colorLowland   (0.265, 0.225, 0.175, 0.000)
		colorUpland    (0.278, 0.236, 0.184, 0.000)
		colorRock      (0.291, 0.247, 0.193, 0.000)
		colorSnow      (0.304, 0.258, 0.202, 1.000)
		BumpHeight      0.0356292
		BumpOffset      0.00712585
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.163694
		DustBright  0.284617
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22.192
		Period          96.1162
		Eccentricity    0.965759
		Inclination     -7.02678
		AscendingNode   -124.346
		ArgOfPericenter 74.6364
		MeanAnomaly     -24.0003
	}
}

Comet	"Jakku System C80"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.61803e-013
	Radius          0.710124
	InertiaMoment   0.398931

	Oblateness      0.0294952

	RotationPeriod  26.7184
	Obliquity       44.9567
	EqAscendNode    8.83342

	AbsMagn         10.5711
	SlopeParam      5.09747
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.559 0.370)

	Surface
	{
		SurfStyle       0.32688
		OceanStyle      0.595261
		Randomize      (0.523, 0.992, -0.508)
		colorDistMagn   0.718858
		colorDistFreq   0.000208382
		detailScale     19.3911
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478723
		terraceProb     0.226546
		erosion         0
		montesMagn      0.518712
		montesFreq      4.138
		montesSpiky     0.806385
		montesFraction  0.441858
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00129938
		hillsFraction   0.569045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245767
		craterFreq      0.198939
		craterDensity   0.805907
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456871
		volcanoTemp     1771.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.224, 0.148, 0.000)
		colorShelf     (0.279, 0.238, 0.157, 0.000)
		colorBeach     (0.295, 0.252, 0.167, 0.000)
		colorDesert    (0.311, 0.266, 0.176, 0.000)
		colorLowland   (0.328, 0.280, 0.185, 0.000)
		colorUpland    (0.344, 0.294, 0.194, 0.000)
		colorRock      (0.361, 0.308, 0.204, 0.000)
		colorSnow      (0.377, 0.322, 0.213, 1.000)
		BumpHeight      0.639112
		BumpOffset      0.127822
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.283362
		GasToDust   0.25
		Particles   1552
		GasBright   0.395674
		DustBright  0.537123
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.947
		Period          150.671
		Eccentricity    0.957588
		Inclination     117.291
		AscendingNode   -164.042
		ArgOfPericenter -124.601
		MeanAnomaly     114.267
	}
}

Comet	"Jakku System C81"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.25143e-009
	Radius          15.4715
	InertiaMoment   0.397297

	Oblateness      0.0465288

	RotationPeriod  24.5234
	Obliquity       358.162
	EqAscendNode    353.411

	AbsMagn         7.00799
	SlopeParam      5.83442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.818 0.737 0.676)

	Surface
	{
		SurfStyle       0.019766
		OceanStyle      0.305205
		Randomize      (-0.337, 0.226, 0.605)
		colorDistMagn   0.698429
		colorDistFreq   0.00669557
		detailScale     422.474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0987533
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337276
		terraceProb     0.509144
		erosion         0
		montesMagn      0.539216
		montesFreq      3.12153
		montesSpiky     0.874477
		montesFraction  0.495857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.595113
		hillsFraction   0.677001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220134
		craterFreq      0.177965
		craterDensity   0.98806
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537564
		volcanoTemp     1614.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.295, 0.270, 0.000)
		colorShelf     (0.348, 0.313, 0.287, 0.000)
		colorBeach     (0.368, 0.332, 0.304, 0.000)
		colorDesert    (0.389, 0.350, 0.321, 0.000)
		colorLowland   (0.409, 0.369, 0.338, 0.000)
		colorUpland    (0.430, 0.387, 0.355, 0.000)
		colorRock      (0.450, 0.405, 0.372, 0.000)
		colorSnow      (0.470, 0.424, 0.389, 1.000)
		BumpHeight      13.9243
		BumpOffset      2.78487
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.764554
		GasToDust   0.25
		Particles   2524
		GasBright   0.298287
		DustBright  0.318996
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.5357
		Period          178.551
		Eccentricity    0.953648
		Inclination     -176.17
		AscendingNode   -178.991
		ArgOfPericenter 5.79986
		MeanAnomaly     -21.1041
	}
}

Comet	"Jakku System C82"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.85325e-017
	Radius          0.0439493
	InertiaMoment   0.399389

	Oblateness      0.042458

	RotationPeriod  22.2374
	Obliquity       311.368
	EqAscendNode    337.988

	AbsMagn         1.92196
	SlopeParam      6.99027
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.607 0.604 0.598)

	Surface
	{
		SurfStyle       0.892808
		OceanStyle      0.659996
		Randomize      (-0.840, -0.501, -0.324)
		colorDistMagn   0.185625
		colorDistFreq   7.12978e-007
		detailScale     1.20011
		colorConversion true
		snowLevel       2
		tropicLatitude  0.365622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443401
		terraceProb     0.209698
		erosion         0
		montesMagn      0.458326
		montesFreq      3.32498
		montesSpiky     0.950699
		montesFraction  0.634975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.4985e-006
		hillsFraction   0.607063
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232468
		craterFreq      0.237495
		craterDensity   0.84355
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551944
		volcanoTemp     1475.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.211, 0.239, 0.050)
		colorShelf     (0.243, 0.248, 0.275, 0.040)
		colorBeach     (0.279, 0.284, 0.311, 0.030)
		colorDesert    (0.316, 0.320, 0.353, 0.020)
		colorLowland   (0.352, 0.356, 0.389, 0.030)
		colorUpland    (0.388, 0.393, 0.425, 0.050)
		colorRock      (0.425, 0.429, 0.473, 0.020)
		colorSnow      (0.425, 0.429, 0.473, 1.000)
		BumpHeight      0.0395543
		BumpOffset      0.00791087
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0127561
		DustBright  0.289014
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.3828
		Period          103.955
		Eccentricity    0.923221
		Inclination     -55.2668
		AscendingNode   153.975
		ArgOfPericenter -161.768
		MeanAnomaly     29.7004
	}
}

Comet	"Jakku System C83"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.98021e-013
	Radius          0.958299
	InertiaMoment   0.398105

	Oblateness      0.0711337

	RotationPeriod  19.8425
	Obliquity       264.574
	EqAscendNode    322.566

	AbsMagn         10.3196
	SlopeParam      2.34016
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.848 0.786 0.742)

	Surface
	{
		SurfStyle       0.14543
		OceanStyle      0.537444
		Randomize      (-0.868, -0.872, 0.658)
		colorDistMagn   0.635781
		colorDistFreq   0.000338937
		detailScale     26.1679
		colorConversion true
		snowLevel       2
		tropicLatitude  0.598557
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312131
		terraceProb     0.210407
		erosion         0
		montesMagn      0.408652
		montesFreq      3.1198
		montesSpiky     0.998296
		montesFraction  0.824695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00144586
		hillsFraction   0.647918
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212107
		craterFreq      0.167649
		craterDensity   0.899433
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497778
		volcanoTemp     1312.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.339, 0.314, 0.297, 0.000)
		colorShelf     (0.361, 0.334, 0.315, 0.000)
		colorBeach     (0.382, 0.354, 0.334, 0.000)
		colorDesert    (0.403, 0.373, 0.352, 0.000)
		colorLowland   (0.424, 0.393, 0.371, 0.000)
		colorUpland    (0.445, 0.413, 0.390, 0.000)
		colorRock      (0.467, 0.432, 0.408, 0.000)
		colorSnow      (0.488, 0.452, 0.427, 1.000)
		BumpHeight      0.862469
		BumpOffset      0.172494
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.316188
		GasToDust   0.25
		Particles   1618
		GasBright   0.0796605
		DustBright  0.706596
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.8339
		Period          149.818
		Eccentricity    0.951609
		Inclination     83.0075
		AscendingNode   -143.041
		ArgOfPericenter -158.144
		MeanAnomaly     1.56825
	}
}

Comet	"Jakku System C84"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.30498e-009
	Radius          17.1609
	InertiaMoment   0.399817

	Oblateness      0.0698016

	RotationPeriod  17.3159
	Obliquity       217.78
	EqAscendNode    307.143

	AbsMagn         6.79129
	SlopeParam      3.03862
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.765 0.655 0.593)

	Surface
	{
		SurfStyle       0.998125
		OceanStyle      0.502703
		Randomize      (-0.439, 0.468, -0.729)
		colorDistMagn   0.600758
		colorDistFreq   0.124743
		detailScale     468.608
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437226
		terraceProb     0.370147
		erosion         0
		montesMagn      0.484538
		montesFreq      2.86128
		montesSpiky     0.896794
		montesFraction  0.33613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.626195
		hillsFraction   0.629475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259972
		craterFreq      0.236888
		craterDensity   0.865752
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39443
		volcanoTemp     1541.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.229, 0.237, 0.050)
		colorShelf     (0.306, 0.269, 0.273, 0.040)
		colorBeach     (0.352, 0.308, 0.309, 0.030)
		colorDesert    (0.398, 0.347, 0.350, 0.020)
		colorLowland   (0.444, 0.386, 0.386, 0.030)
		colorUpland    (0.490, 0.426, 0.421, 0.050)
		colorRock      (0.536, 0.465, 0.469, 0.020)
		colorSnow      (0.536, 0.465, 0.469, 1.000)
		BumpHeight      15.4448
		BumpOffset      3.08897
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.79738
		GasToDust   0.25
		Particles   2590
		GasBright   0.0754891
		DustBright  0.395254
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.7583
		Period          106.469
		Eccentricity    0.919055
		Inclination     120.043
		AscendingNode   -97.4565
		ArgOfPericenter -168.686
		MeanAnomaly     21.4855
	}
}

Comet	"Jakku System C85"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            7.09718e-017
	Radius          0.0593569
	InertiaMoment   0.398684

	Oblateness      0.130887

	RotationPeriod  14.6283
	Obliquity       170.985
	EqAscendNode    291.72

	AbsMagn         1.15462
	SlopeParam      3.63424
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.597 0.590)

	Surface
	{
		SurfStyle       0.628021
		OceanStyle      0.413163
		Randomize      (0.345, 0.697, 0.744)
		colorDistMagn   0.638862
		colorDistFreq   1.13711e-006
		detailScale     1.62084
		colorConversion true
		snowLevel       2
		tropicLatitude  0.42759
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633216
		terraceProb     0.213225
		erosion         0
		montesMagn      0.268825
		montesFreq      3.61542
		montesSpiky     0.923016
		montesFraction  0.414137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.64031e-006
		hillsFraction   0.58774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260872
		craterFreq      0.252721
		craterDensity   0.927701
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520885
		volcanoTemp     1279.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.203, 0.165, 0.000)
		colorShelf     (0.241, 0.209, 0.189, 0.000)
		colorBeach     (0.283, 0.245, 0.224, 0.000)
		colorDesert    (0.307, 0.263, 0.218, 0.000)
		colorLowland   (0.337, 0.281, 0.248, 0.000)
		colorUpland    (0.373, 0.341, 0.301, 0.000)
		colorRock      (0.404, 0.370, 0.325, 0.000)
		colorSnow      (0.440, 0.394, 0.342, 1.000)
		BumpHeight      0.0534212
		BumpOffset      0.0106842
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.209584
		DustBright  0.745646
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.8564
		Period          149.988
		Eccentricity    0.959352
		Inclination     145.676
		AscendingNode   178.328
		ArgOfPericenter -95.4585
		MeanAnomaly     143.88
	}
}

Comet	"Jakku System C86"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.48916e-013
	Radius          1.06194
	InertiaMoment   0.396651

	Oblateness      0.149305

	RotationPeriod  11.7404
	Obliquity       124.191
	EqAscendNode    276.298

	AbsMagn         10.0769
	SlopeParam      4.19846
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.624 0.620 0.618)

	Surface
	{
		SurfStyle       0.079738
		OceanStyle      0.0916664
		Randomize      (0.200, 0.747, -0.443)
		colorDistMagn   0.805127
		colorDistFreq   0.000680894
		detailScale     28.9981
		colorConversion true
		snowLevel       2
		tropicLatitude  0.735745
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.744753
		terraceProb     0.177717
		erosion         0
		montesMagn      0.50645
		montesFreq      3.21373
		montesSpiky     0.943121
		montesFraction  0.331824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00224231
		hillsFraction   0.568387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244463
		craterFreq      0.200245
		craterDensity   0.87268
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564003
		volcanoTemp     1616.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.247, 0.000)
		colorShelf     (0.265, 0.264, 0.263, 0.000)
		colorBeach     (0.281, 0.279, 0.278, 0.000)
		colorDesert    (0.296, 0.295, 0.294, 0.000)
		colorLowland   (0.312, 0.310, 0.309, 0.000)
		colorUpland    (0.328, 0.326, 0.325, 0.000)
		colorRock      (0.343, 0.341, 0.340, 0.000)
		colorSnow      (0.359, 0.357, 0.356, 1.000)
		BumpHeight      0.955748
		BumpOffset      0.19115
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.349014
		GasToDust   0.25
		Particles   1684
		GasBright   0.17813
		DustBright  0.461586
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.0983
		Period          136.937
		Eccentricity    0.977606
		Inclination     166.41
		AscendingNode   -132.392
		ArgOfPericenter -109.691
		MeanAnomaly     132.412
	}
}

Comet	"Jakku System C87"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.24547e-009
	Radius          23.1976
	InertiaMoment   0.399168

	Oblateness      0.249

	RotationPeriod  8.598
	Obliquity       77.3967
	EqAscendNode    260.875

	AbsMagn         6.57098
	SlopeParam      4.77928
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.647 0.642 0.639)

	Surface
	{
		SurfStyle       0.696294
		OceanStyle      0.179613
		Randomize      (-0.620, 0.448, 0.202)
		colorDistMagn   0.79846
		colorDistFreq   0.38085
		detailScale     633.448
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984349
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555253
		terraceProb     0.427827
		erosion         0
		montesMagn      0.299774
		montesFreq      3.4456
		montesSpiky     0.991411
		montesFraction  0.471721
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.45577
		hillsFraction   0.494475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253559
		craterFreq      0.247064
		craterDensity   0.889283
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450121
		volcanoTemp     1803.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.218, 0.179, 0.000)
		colorShelf     (0.259, 0.225, 0.205, 0.000)
		colorBeach     (0.304, 0.263, 0.243, 0.000)
		colorDesert    (0.330, 0.283, 0.236, 0.000)
		colorLowland   (0.362, 0.302, 0.268, 0.000)
		colorUpland    (0.401, 0.366, 0.326, 0.000)
		colorRock      (0.434, 0.398, 0.351, 0.000)
		colorSnow      (0.472, 0.424, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.830206
		GasToDust   0.25
		Particles   2656
		GasBright   0.109418
		DustBright  0.214785
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.0478
		Period          108.421
		Eccentricity    0.947806
		Inclination     -42.564
		AscendingNode   -120.692
		ArgOfPericenter 56.1199
		MeanAnomaly     -33.6672
	}
}

Comet	"Jakku System C88"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.30721e-016
	Radius          0.0657093
	InertiaMoment   0.397752

	Oblateness      0.249

	RotationPeriod  5.12262
	Obliquity       30.6024
	EqAscendNode    245.453

	AbsMagn         -0.0036869
	SlopeParam      5.43635
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.558 0.553)

	Surface
	{
		SurfStyle       0.439526
		OceanStyle      0.501017
		Randomize      (-0.951, -0.824, -0.194)
		colorDistMagn   0.383615
		colorDistFreq   1.88266e-006
		detailScale     1.7943
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652483
		terraceProb     0.18825
		erosion         0
		montesMagn      0.455319
		montesFreq      2.2779
		montesSpiky     0.993806
		montesFraction  0.761845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.89859e-006
		hillsFraction   0.56268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239283
		craterFreq      0.263687
		craterDensity   0.745873
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512471
		volcanoTemp     1381.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.221, 0.000)
		colorShelf     (0.239, 0.237, 0.235, 0.000)
		colorBeach     (0.253, 0.251, 0.249, 0.000)
		colorDesert    (0.267, 0.265, 0.263, 0.000)
		colorLowland   (0.281, 0.279, 0.276, 0.000)
		colorUpland    (0.295, 0.293, 0.290, 0.000)
		colorRock      (0.309, 0.307, 0.304, 0.000)
		colorSnow      (0.323, 0.321, 0.318, 1.000)
		BumpHeight      0.0591383
		BumpOffset      0.0118277
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.32068
		DustBright  0.48801
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.8104
		Period          142.175
		Eccentricity    0.96398
		Inclination     -125.944
		AscendingNode   -69.7014
		ArgOfPericenter 157.073
		MeanAnomaly     -160.46
	}
}

Comet	"Jakku System C89"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.01104e-012
	Radius          1.43686
	InertiaMoment   0.399608

	Oblateness      0.00145426

	RotationPeriod  138.723
	Obliquity       343.808
	EqAscendNode    230.03

	AbsMagn         9.84167
	SlopeParam      6.30802
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.590 0.504 0.369)

	Surface
	{
		SurfStyle       0.962569
		OceanStyle      0.340279
		Randomize      (0.726, 0.216, 0.365)
		colorDistMagn   0.42306
		colorDistFreq   0.00157661
		detailScale     39.2359
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550792
		terraceProb     0.278934
		erosion         0
		montesMagn      0.411374
		montesFreq      3.13364
		montesSpiky     0.903403
		montesFraction  0.521205
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.004776
		hillsFraction   0.78229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220106
		craterFreq      0.207532
		craterDensity   0.70417
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437922
		volcanoTemp     1611.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.176, 0.148, 0.050)
		colorShelf     (0.236, 0.206, 0.170, 0.040)
		colorBeach     (0.272, 0.237, 0.192, 0.030)
		colorDesert    (0.307, 0.267, 0.218, 0.020)
		colorLowland   (0.342, 0.297, 0.240, 0.030)
		colorUpland    (0.378, 0.327, 0.262, 0.050)
		colorRock      (0.413, 0.358, 0.292, 0.020)
		colorSnow      (0.413, 0.358, 0.292, 1.000)
		BumpHeight      1.29318
		BumpOffset      0.258635
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.38184
		GasToDust   0.25
		Particles   1751
		GasBright   0.224685
		DustBright  0.268491
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.5731
		Period          147.858
		Eccentricity    0.945017
		Inclination     -71.8492
		AscendingNode   -106.777
		ArgOfPericenter 116.34
		MeanAnomaly     -49.5455
	}
}

Comet	"Jakku System C90"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            7.81963e-009
	Radius          25.6515
	InertiaMoment   0.398415

	Oblateness      0.00147191

	RotationPeriod  118.003
	Obliquity       297.014
	EqAscendNode    214.608

	AbsMagn         6.34623
	SlopeParam      8.50339
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.694 0.629)

	Surface
	{
		SurfStyle       0.913164
		OceanStyle      0.0927621
		Randomize      (0.002, 0.319, -0.610)
		colorDistMagn   0.1365
		colorDistFreq   0.48631
		detailScale     700.458
		colorConversion true
		snowLevel       2
		tropicLatitude  0.680438
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495017
		terraceProb     0.811533
		erosion         0
		montesMagn      0.489562
		montesFreq      3.11208
		montesSpiky     0.995172
		montesFraction  0.469791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.11481
		hillsFraction   0.819676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249409
		craterFreq      0.143865
		craterDensity   1.07278
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446777
		volcanoTemp     1448.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.243, 0.252, 0.050)
		colorShelf     (0.309, 0.285, 0.290, 0.040)
		colorBeach     (0.355, 0.326, 0.327, 0.030)
		colorDesert    (0.402, 0.368, 0.371, 0.020)
		colorLowland   (0.448, 0.410, 0.409, 0.030)
		colorUpland    (0.494, 0.451, 0.447, 0.050)
		colorRock      (0.541, 0.493, 0.497, 0.020)
		colorSnow      (0.541, 0.493, 0.497, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.863032
		GasToDust   0.25
		Particles   2723
		GasBright   0.0143061
		DustBright  0.963357
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.9291
		Period          189.793
		Eccentricity    0.961945
		Inclination     -74.6856
		AscendingNode   -7.04879
		ArgOfPericenter -42.1413
		MeanAnomaly     110.84
	}
}

Comet	"Jakku System C91"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.40773e-016
	Radius          0.0889998
	InertiaMoment   0.39495

	Oblateness      0.00232381

	RotationPeriod  108.671
	Obliquity       250.219
	EqAscendNode    199.185

	AbsMagn         18.1288
	SlopeParam      2.70442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.606 0.599 0.597)

	Surface
	{
		SurfStyle       0.0547755
		OceanStyle      0.425158
		Randomize      (0.611, 0.796, 0.954)
		colorDistMagn   0.834164
		colorDistFreq   2.68515e-006
		detailScale     2.43029
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.747799
		terraceProb     0.257952
		erosion         0
		montesMagn      0.387367
		montesFreq      2.90624
		montesSpiky     0.92936
		montesFraction  0.317902
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15415e-005
		hillsFraction   0.792484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238227
		craterFreq      0.226849
		craterDensity   0.994472
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516481
		volcanoTemp     1709.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.240, 0.239, 0.000)
		colorShelf     (0.257, 0.255, 0.254, 0.000)
		colorBeach     (0.273, 0.270, 0.269, 0.000)
		colorDesert    (0.288, 0.285, 0.284, 0.000)
		colorLowland   (0.303, 0.300, 0.299, 0.000)
		colorUpland    (0.318, 0.315, 0.314, 0.000)
		colorRock      (0.333, 0.330, 0.329, 0.000)
		colorSnow      (0.348, 0.345, 0.343, 1.000)
		BumpHeight      0.0800998
		BumpOffset      0.01602
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.048786
		DustBright  0.613363
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.569
		Period          118.87
		Eccentricity    0.948477
		Inclination     -51.7292
		AscendingNode   -75.2021
		ArgOfPericenter -58.1146
		MeanAnomaly     11.6927
	}
}

Comet	"Jakku System C92"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.8622e-012
	Radius          1.58693
	InertiaMoment   0.398937

	Oblateness      0.00195398

	RotationPeriod  102.222
	Obliquity       203.425
	EqAscendNode    183.762

	AbsMagn         9.61262
	SlopeParam      3.33967
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.479 0.405)

	Surface
	{
		SurfStyle       0.414396
		OceanStyle      0.634262
		Randomize      (-0.410, -0.338, 0.739)
		colorDistMagn   0.758953
		colorDistFreq   0.00199595
		detailScale     43.3337
		colorConversion true
		snowLevel       2
		tropicLatitude  0.625991
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740615
		terraceProb     0.381702
		erosion         0
		montesMagn      0.634207
		montesFreq      3.21564
		montesSpiky     0.970276
		montesFraction  0.757308
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00785548
		hillsFraction   0.775675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227957
		craterFreq      0.220144
		craterDensity   0.867398
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535261
		volcanoTemp     1641.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.192, 0.162, 0.000)
		colorShelf     (0.233, 0.204, 0.172, 0.000)
		colorBeach     (0.247, 0.216, 0.182, 0.000)
		colorDesert    (0.261, 0.228, 0.192, 0.000)
		colorLowland   (0.274, 0.240, 0.203, 0.000)
		colorUpland    (0.288, 0.252, 0.213, 0.000)
		colorRock      (0.302, 0.264, 0.223, 0.000)
		colorSnow      (0.315, 0.276, 0.233, 1.000)
		BumpHeight      1.42823
		BumpOffset      0.285647
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.414666
		GasToDust   0.25
		Particles   1817
		GasBright   0.0460067
		DustBright  0.300629
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.5841
		Period          186.989
		Eccentricity    0.950791
		Inclination     -157.79
		AscendingNode   -62.3804
		ArgOfPericenter 144.019
		MeanAnomaly     -5.6678
	}
}

Comet	"Jakku System C93"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.44028e-008
	Radius          34.7827
	InertiaMoment   0.39731

	Oblateness      0.00292704

	RotationPeriod  97.155
	Obliquity       156.631
	EqAscendNode    168.34

	AbsMagn         6.11615
	SlopeParam      3.91332
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.800 0.797 0.794)

	Surface
	{
		SurfStyle       0.118016
		OceanStyle      0.0257664
		Randomize      (0.894, -0.956, 0.251)
		colorDistMagn   0.329386
		colorDistFreq   0.633246
		detailScale     949.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945303
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426237
		terraceProb     0.563899
		erosion         0
		montesMagn      0.420291
		montesFreq      3.87863
		montesSpiky     0.934627
		montesFraction  0.663835
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15855
		hillsFraction   0.842337
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238148
		craterFreq      0.268569
		craterDensity   0.891839
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505473
		volcanoTemp     1579.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.319, 0.318, 0.000)
		colorShelf     (0.340, 0.339, 0.337, 0.000)
		colorBeach     (0.360, 0.359, 0.357, 0.000)
		colorDesert    (0.380, 0.378, 0.377, 0.000)
		colorLowland   (0.400, 0.398, 0.397, 0.000)
		colorUpland    (0.420, 0.418, 0.417, 0.000)
		colorRock      (0.440, 0.438, 0.437, 0.000)
		colorSnow      (0.460, 0.458, 0.457, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.895858
		GasToDust   0.25
		Particles   2789
		GasBright   0.159383
		DustBright  0.671739
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.7174
		Period          164.228
		Eccentricity    0.947616
		Inclination     47.6627
		AscendingNode   174.921
		ArgOfPericenter -111.67
		MeanAnomaly     104.804
	}
}

Comet	"Jakku System C94"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.43472e-016
	Radius          0.0981631
	InertiaMoment   0.399395

	Oblateness      0.00235488

	RotationPeriod  92.9095
	Obliquity       109.837
	EqAscendNode    152.917

	AbsMagn         15.7413
	SlopeParam      4.47977
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.501 0.499)

	Surface
	{
		SurfStyle       0.215211
		OceanStyle      0.224793
		Randomize      (0.256, -0.472, -0.299)
		colorDistMagn   0.905174
		colorDistFreq   2.31689e-006
		detailScale     2.68051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.883146
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694051
		terraceProb     0.508948
		erosion         0
		montesMagn      0.390047
		montesFreq      2.98824
		montesSpiky     0.982689
		montesFraction  0.469199
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.2074e-005
		hillsFraction   0.742541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216523
		craterFreq      0.25499
		craterDensity   0.94734
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478892
		volcanoTemp     1816.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.201, 0.200, 0.000)
		colorShelf     (0.215, 0.213, 0.212, 0.000)
		colorBeach     (0.228, 0.226, 0.225, 0.000)
		colorDesert    (0.241, 0.238, 0.237, 0.000)
		colorLowland   (0.253, 0.251, 0.250, 0.000)
		colorUpland    (0.266, 0.263, 0.262, 0.000)
		colorRock      (0.279, 0.276, 0.275, 0.000)
		colorSnow      (0.291, 0.288, 0.287, 1.000)
		BumpHeight      0.0883468
		BumpOffset      0.0176694
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.129322
		DustBright  0.386287
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.5315
		Period          118.608
		Eccentricity    0.939622
		Inclination     96.5352
		AscendingNode   57.093
		ArgOfPericenter 55.2111
		MeanAnomaly     -20.2684
	}
}

Comet	"Jakku System C95"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.42994e-012
	Radius          2.15446
	InertiaMoment   0.398114

	Oblateness      0.00347474

	RotationPeriod  89.2107
	Obliquity       63.0423
	EqAscendNode    137.495

	AbsMagn         9.38875
	SlopeParam      5.08852
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.435 0.428 0.423)

	Surface
	{
		SurfStyle       0.016342
		OceanStyle      0.83132
		Randomize      (0.508, 0.783, -0.167)
		colorDistMagn   0.433752
		colorDistFreq   0.00274052
		detailScale     58.8312
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880002
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445439
		terraceProb     0.200383
		erosion         0
		montesMagn      0.611375
		montesFreq      2.72404
		montesSpiky     0.992929
		montesFraction  0.611433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0123742
		hillsFraction   0.692853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245817
		craterFreq      0.247655
		craterDensity   0.836294
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529958
		volcanoTemp     1614.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.171, 0.169, 0.000)
		colorShelf     (0.185, 0.182, 0.180, 0.000)
		colorBeach     (0.196, 0.193, 0.190, 0.000)
		colorDesert    (0.207, 0.203, 0.201, 0.000)
		colorLowland   (0.218, 0.214, 0.211, 0.000)
		colorUpland    (0.228, 0.225, 0.222, 0.000)
		colorRock      (0.239, 0.235, 0.232, 0.000)
		colorSnow      (0.250, 0.246, 0.243, 1.000)
		BumpHeight      1.93902
		BumpOffset      0.387803
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.447492
		GasToDust   0.25
		Particles   1883
		GasBright   0.0620015
		DustBright  0.138094
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.4587
		Period          104.462
		Eccentricity    0.936144
		Inclination     176.938
		AscendingNode   -62.0894
		ArgOfPericenter -145.412
		MeanAnomaly     41.7429
	}
}

Comet	"Jakku System C96"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.65281e-008
	Radius          38.3072
	InertiaMoment   0.399822

	Oblateness      0.00274115

	RotationPeriod  85.9023
	Obliquity       16.248
	EqAscendNode    122.072

	AbsMagn         5.87964
	SlopeParam      5.8227
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.645 0.641)

	Surface
	{
		SurfStyle       0.264805
		OceanStyle      0.155852
		Randomize      (-0.352, -0.179, 0.103)
		colorDistMagn   0.55693
		colorDistFreq   1.00755
		detailScale     1046.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609868
		terraceProb     0.333558
		erosion         0
		montesMagn      0.418391
		montesFreq      4.02907
		montesSpiky     0.925493
		montesFraction  0.857811
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.31546
		hillsFraction   0.650688
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212921
		craterFreq      0.204837
		craterDensity   0.970996
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574775
		volcanoTemp     1686
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.256, 0.000)
		colorShelf     (0.276, 0.274, 0.273, 0.000)
		colorBeach     (0.293, 0.290, 0.289, 0.000)
		colorDesert    (0.309, 0.306, 0.305, 0.000)
		colorLowland   (0.325, 0.323, 0.321, 0.000)
		colorUpland    (0.341, 0.339, 0.337, 0.000)
		colorRock      (0.358, 0.355, 0.353, 0.000)
		colorSnow      (0.374, 0.371, 0.369, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.928684
		GasToDust   0.25
		Particles   2855
		GasBright   0.252545
		DustBright  0.432037
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.7474
		Period          230.39
		Eccentricity    0.963004
		Inclination     102.428
		AscendingNode   158.411
		ArgOfPericenter -94.9026
		MeanAnomaly     -107.416
	}
}

Comet	"Jakku System C97"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            8.16821e-016
	Radius          0.133449
	InertiaMoment   0.39869

	Oblateness      0.00402548

	RotationPeriod  82.8865
	Obliquity       329.454
	EqAscendNode    106.649

	AbsMagn         14.6871
	SlopeParam      6.96688
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.558 0.490 0.451)

	Surface
	{
		SurfStyle       0.34766
		OceanStyle      0.571484
		Randomize      (0.141, 0.770, -0.115)
		colorDistMagn   0.335889
		colorDistFreq   1.10753e-005
		detailScale     3.64405
		colorConversion true
		snowLevel       2
		tropicLatitude  0.531912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450523
		terraceProb     0.28662
		erosion         0
		montesMagn      0.261904
		montesFreq      3.28821
		montesSpiky     0.988257
		montesFraction  0.740804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.57634e-005
		hillsFraction   0.702891
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231159
		craterFreq      0.270419
		craterDensity   1.01778
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498132
		volcanoTemp     1334.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.196, 0.180, 0.000)
		colorShelf     (0.237, 0.208, 0.192, 0.000)
		colorBeach     (0.251, 0.221, 0.203, 0.000)
		colorDesert    (0.265, 0.233, 0.214, 0.000)
		colorLowland   (0.279, 0.245, 0.225, 0.000)
		colorUpland    (0.293, 0.257, 0.237, 0.000)
		colorRock      (0.307, 0.270, 0.248, 0.000)
		colorSnow      (0.321, 0.282, 0.259, 1.000)
		BumpHeight      0.120104
		BumpOffset      0.0240209
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.157943
		DustBright  0.211126
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.6493
		Period          74.045
		Eccentricity    0.943006
		Inclination     -168.718
		AscendingNode   -88.7187
		ArgOfPericenter 149.872
		MeanAnomaly     -37.9428
	}
}

Comet	"Jakku System C98"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            6.31753e-012
	Radius          2.36887
	InertiaMoment   0.396672

	Oblateness      0.00309397

	RotationPeriod  80.0976
	Obliquity       282.659
	EqAscendNode    91.2268

	AbsMagn         9.16915
	SlopeParam      2.32925
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.439 0.433 0.429)

	Surface
	{
		SurfStyle       0.425361
		OceanStyle      0.80736
		Randomize      (0.858, -0.789, -0.010)
		colorDistMagn   0.0703
		colorDistFreq   0.000125119
		detailScale     64.686
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514631
		terraceProb     0.40426
		erosion         0
		montesMagn      0.515369
		montesFreq      3.27565
		montesSpiky     0.832945
		montesFraction  0.596685
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0178299
		hillsFraction   0.567713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252828
		craterFreq      0.174671
		craterDensity   0.686038
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.400957
		volcanoTemp     1506.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.173, 0.172, 0.000)
		colorShelf     (0.186, 0.184, 0.182, 0.000)
		colorBeach     (0.197, 0.195, 0.193, 0.000)
		colorDesert    (0.208, 0.205, 0.204, 0.000)
		colorLowland   (0.219, 0.216, 0.215, 0.000)
		colorUpland    (0.230, 0.227, 0.225, 0.000)
		colorRock      (0.241, 0.238, 0.236, 0.000)
		colorSnow      (0.252, 0.249, 0.247, 1.000)
		BumpHeight      2.13199
		BumpOffset      0.426397
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.480318
		GasToDust   0.25
		Particles   1950
		GasBright   0.415677
		DustBright  0.437878
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.1215
		Period          144.485
		Eccentricity    0.96009
		Inclination     11.4498
		AscendingNode   -141.121
		ArgOfPericenter -50.4499
		MeanAnomaly     -39.0923
	}
}

Comet	"Jakku System C99"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.88614e-008
	Radius          52.1547
	InertiaMoment   0.399174

	Oblateness      0.00460452

	RotationPeriod  77.4891
	Obliquity       235.865
	EqAscendNode    75.8042

	AbsMagn         5.63548
	SlopeParam      3.02995
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.652 0.650)

	Surface
	{
		SurfStyle       0.643461
		OceanStyle      0.63535
		Randomize      (-0.347, -0.342, -0.999)
		colorDistMagn   0.279324
		colorDistFreq   1.01602
		detailScale     1424.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976235
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75532
		terraceProb     0.157575
		erosion         0
		montesMagn      0.365284
		montesFreq      3.3739
		montesSpiky     0.973733
		montesFraction  0.303862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.76515
		hillsFraction   0.665849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2183
		craterFreq      0.201314
		craterDensity   1.07994
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536977
		volcanoTemp     1351.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.222, 0.182, 0.000)
		colorShelf     (0.261, 0.228, 0.208, 0.000)
		colorBeach     (0.307, 0.267, 0.247, 0.000)
		colorDesert    (0.333, 0.287, 0.240, 0.000)
		colorLowland   (0.366, 0.307, 0.273, 0.000)
		colorUpland    (0.405, 0.372, 0.331, 0.000)
		colorRock      (0.438, 0.404, 0.357, 0.000)
		colorSnow      (0.477, 0.430, 0.377, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.96151
		GasToDust   0.25
		Particles   2922
		GasBright   0.0247716
		DustBright  0.51327
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.3193
		Period          192.983
		Eccentricity    0.959188
		Inclination     36.7793
		AscendingNode   -61.991
		ArgOfPericenter -136.86
		MeanAnomaly     15.7736
	}
}

Comet	"Jakku System C100"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.50448e-015
	Radius          0.146459
	InertiaMoment   0.397762

	Oblateness      0.00351381

	RotationPeriod  75.0271
	Obliquity       189.071
	EqAscendNode    60.3816

	AbsMagn         13.9606
	SlopeParam      3.62639
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.609 0.576)

	Surface
	{
		SurfStyle       0.0232101
		OceanStyle      0.94854
		Randomize      (-0.753, -0.839, 0.052)
		colorDistMagn   0.773593
		colorDistFreq   1.25612e-005
		detailScale     3.99931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.263753
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446153
		terraceProb     0.660196
		erosion         0
		montesMagn      0.506896
		montesFreq      2.77349
		montesSpiky     0.857122
		montesFraction  0.454186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.33289e-005
		hillsFraction   0.696728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245236
		craterFreq      0.234453
		craterDensity   0.88381
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569863
		volcanoTemp     1472.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.244, 0.230, 0.000)
		colorShelf     (0.292, 0.259, 0.245, 0.000)
		colorBeach     (0.309, 0.274, 0.259, 0.000)
		colorDesert    (0.326, 0.289, 0.274, 0.000)
		colorLowland   (0.344, 0.305, 0.288, 0.000)
		colorUpland    (0.361, 0.320, 0.302, 0.000)
		colorRock      (0.378, 0.335, 0.317, 0.000)
		colorSnow      (0.395, 0.350, 0.331, 1.000)
		BumpHeight      0.131813
		BumpOffset      0.0263627
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0319517
		GasToDust   0.25
		Particles   1044
		GasBright   0.0233845
		DustBright  0.199144
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.0071
		Period          151.125
		Eccentricity    0.946501
		Inclination     -169.833
		AscendingNode   74.5847
		ArgOfPericenter 37.3542
		MeanAnomaly     14.3367
	}
}

Comet	"Jakku System C101"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.16361e-011
	Radius          3.23052
	InertiaMoment   0.399613

	Oblateness      0.00523097

	RotationPeriod  72.6854
	Obliquity       142.277
	EqAscendNode    44.959

	AbsMagn         8.95302
	SlopeParam      4.19071
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.604 0.529)

	Surface
	{
		SurfStyle       0.922935
		OceanStyle      0.00835631
		Randomize      (-0.668, -0.490, 0.816)
		colorDistMagn   0.315516
		colorDistFreq   0.00435955
		detailScale     88.2146
		colorConversion true
		snowLevel       2
		tropicLatitude  0.735611
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703584
		terraceProb     0.19704
		erosion         0
		montesMagn      0.524268
		montesFreq      3.6346
		montesSpiky     0.969937
		montesFraction  0.462583
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0324718
		hillsFraction   0.534181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22467
		craterFreq      0.168367
		craterDensity   1.00356
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466197
		volcanoTemp     1486.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.211, 0.212, 0.050)
		colorShelf     (0.274, 0.248, 0.244, 0.040)
		colorBeach     (0.315, 0.284, 0.275, 0.030)
		colorDesert    (0.357, 0.320, 0.312, 0.020)
		colorLowland   (0.398, 0.356, 0.344, 0.030)
		colorUpland    (0.439, 0.393, 0.376, 0.050)
		colorRock      (0.480, 0.429, 0.418, 0.020)
		colorSnow      (0.480, 0.429, 0.418, 1.000)
		BumpHeight      2.90746
		BumpOffset      0.581493
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.513143
		GasToDust   0.25
		Particles   2016
		GasBright   0.116043
		DustBright  0.590972
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.6225
		Period          171.308
		Eccentricity    0.966505
		Inclination     139.244
		AscendingNode   101.296
		ArgOfPericenter -64.9466
		MeanAnomaly     -21.209
	}
}

Comet	"Jakku System C102"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            8.99968e-008
	Radius          57.1195
	InertiaMoment   0.398422

	Oblateness      0.0039625

	RotationPeriod  70.4438
	Obliquity       95.4822
	EqAscendNode    29.5364

	AbsMagn         5.38217
	SlopeParam      4.77096
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.535 0.530)

	Surface
	{
		SurfStyle       0.892265
		OceanStyle      0.430424
		Randomize      (-0.285, 0.871, -0.549)
		colorDistMagn   0.402107
		colorDistFreq   0.353702
		detailScale     1559.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995228
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400033
		terraceProb     0.185632
		erosion         0
		montesMagn      0.405846
		montesFreq      2.22166
		montesSpiky     0.996047
		montesFraction  0.290221
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.61339
		hillsFraction   0.643373
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209104
		craterFreq      0.181396
		craterDensity   1.00226
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517183
		volcanoTemp     1348.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.187, 0.212, 0.050)
		colorShelf     (0.216, 0.219, 0.244, 0.040)
		colorBeach     (0.248, 0.251, 0.276, 0.030)
		colorDesert    (0.281, 0.283, 0.313, 0.020)
		colorLowland   (0.313, 0.315, 0.345, 0.030)
		colorUpland    (0.346, 0.348, 0.376, 0.050)
		colorRock      (0.378, 0.380, 0.419, 0.020)
		colorSnow      (0.378, 0.380, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.994336
		GasToDust   0.25
		Particles   2988
		GasBright   0.0873738
		DustBright  0.304128
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.8931
		Period          181.413
		Eccentricity    0.957573
		Inclination     -179.775
		AscendingNode   -58.5872
		ArgOfPericenter -96.5897
		MeanAnomaly     55.7578
	}
}

Comet	"Jakku System C103"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.77106e-015
	Radius          0.200102
	InertiaMoment   0.395068

	Oblateness      0.00581444

	RotationPeriod  68.286
	Obliquity       48.6879
	EqAscendNode    14.1138

	AbsMagn         13.3902
	SlopeParam      5.42638
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.460 0.456 0.454)

	Surface
	{
		SurfStyle       0.170448
		OceanStyle      0.861264
		Randomize      (-0.949, -0.837, -0.876)
		colorDistMagn   0.0557639
		colorDistFreq   3.18604e-005
		detailScale     5.46412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.637679
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661673
		terraceProb     0.321101
		erosion         0
		montesMagn      0.473565
		montesFreq      2.55605
		montesSpiky     0.802492
		montesFraction  0.561986
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000113803
		hillsFraction   0.87241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260317
		craterFreq      0.214952
		craterDensity   0.899637
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58355
		volcanoTemp     1559.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.182, 0.182, 0.000)
		colorShelf     (0.196, 0.194, 0.193, 0.000)
		colorBeach     (0.207, 0.205, 0.204, 0.000)
		colorDesert    (0.219, 0.217, 0.216, 0.000)
		colorLowland   (0.230, 0.228, 0.227, 0.000)
		colorUpland    (0.242, 0.240, 0.239, 0.000)
		colorRock      (0.253, 0.251, 0.250, 0.000)
		colorSnow      (0.265, 0.262, 0.261, 1.000)
		BumpHeight      0.180092
		BumpOffset      0.0360184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0647774
		GasToDust   0.25
		Particles   1110
		GasBright   0.247222
		DustBright  0.628766
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.1339
		Period          242.55
		Eccentricity    0.969295
		Inclination     -164.452
		AscendingNode   131.839
		ArgOfPericenter 132.429
		MeanAnomaly     -119.23
	}
}

Comet	"Jakku System C104"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.14322e-011
	Radius          3.52953
	InertiaMoment   0.398943

	Oblateness      0.00445409

	RotationPeriod  66.1989
	Obliquity       1.89361
	EqAscendNode    358.691

	AbsMagn         8.73963
	SlopeParam      6.29307
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.642 0.546)

	Surface
	{
		SurfStyle       0.935221
		OceanStyle      0.789125
		Randomize      (-0.923, 0.357, 0.581)
		colorDistMagn   0.195323
		colorDistFreq   0.00698477
		detailScale     96.3798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.383714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45456
		terraceProb     0.38109
		erosion         0
		montesMagn      0.512702
		montesFreq      2.93047
		montesSpiky     0.910466
		montesFraction  0.753155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0266663
		hillsFraction   0.464055
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235702
		craterFreq      0.243409
		craterDensity   0.733205
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479681
		volcanoTemp     1536.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.225, 0.218, 0.050)
		colorShelf     (0.292, 0.263, 0.251, 0.040)
		colorBeach     (0.336, 0.302, 0.284, 0.030)
		colorDesert    (0.380, 0.340, 0.322, 0.020)
		colorLowland   (0.424, 0.379, 0.355, 0.030)
		colorUpland    (0.468, 0.417, 0.387, 0.050)
		colorRock      (0.511, 0.456, 0.431, 0.020)
		colorSnow      (0.511, 0.456, 0.431, 1.000)
		BumpHeight      3.17658
		BumpOffset      0.635316
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.545969
		GasToDust   0.25
		Particles   2082
		GasBright   0.191271
		DustBright  0.369204
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.6838
		Period          141.239
		Eccentricity    0.941012
		Inclination     20.9276
		AscendingNode   -31.439
		ArgOfPericenter -155.562
		MeanAnomaly     45.4535
	}
}

Comet	"Jakku System C105"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.65763e-007
	Radius          78.2045
	InertiaMoment   0.397323

	Oblateness      0.00662621

	RotationPeriod  64.1712
	Obliquity       315.099
	EqAscendNode    343.269

	AbsMagn         5.11789
	SlopeParam      8.41097
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.615 0.511)

	Surface
	{
		SurfStyle       0.868813
		OceanStyle      0.950489
		Randomize      (0.389, 0.667, -0.839)
		colorDistMagn   0.820408
		colorDistFreq   3.93058
		detailScale     2135.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975372
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56768
		terraceProb     0.217816
		erosion         0
		montesMagn      0.65527
		montesFreq      2.77219
		montesSpiky     0.850997
		montesFraction  0.531665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.3622
		hillsFraction   0.661252
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274479
		craterFreq      0.219275
		craterDensity   0.813903
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456277
		volcanoTemp     1396.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.215, 0.204, 0.050)
		colorShelf     (0.277, 0.252, 0.235, 0.040)
		colorBeach     (0.319, 0.289, 0.266, 0.030)
		colorDesert    (0.360, 0.326, 0.301, 0.020)
		colorLowland   (0.402, 0.363, 0.332, 0.030)
		colorUpland    (0.443, 0.400, 0.363, 0.050)
		colorRock      (0.485, 0.436, 0.404, 0.020)
		colorSnow      (0.485, 0.436, 0.404, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0980609
		DustBright  0.1469
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.5113
		Period          154.95
		Eccentricity    0.958531
		Inclination     -32.5525
		AscendingNode   7.59152
		ArgOfPericenter 5.18901
		MeanAnomaly     -154.475
	}
}

Comet	"Jakku System C106"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.10396e-015
	Radius          0.218007
	InertiaMoment   0.3994

	Oblateness      0.00500189

	RotationPeriod  62.1935
	Obliquity       268.305
	EqAscendNode    327.846

	AbsMagn         12.9123
	SlopeParam      2.69489
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.605 0.443 0.357)

	Surface
	{
		SurfStyle       0.459497
		OceanStyle      0.787861
		Randomize      (-0.346, -0.739, -0.485)
		colorDistMagn   0.390816
		colorDistFreq   1.24904e-005
		detailScale     5.95305
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999896
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310608
		terraceProb     0.115627
		erosion         0
		montesMagn      0.494349
		montesFreq      4.75651
		montesSpiky     0.835288
		montesFraction  0.53702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000101123
		hillsFraction   0.737677
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210785
		craterFreq      0.217604
		craterDensity   0.826748
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512916
		volcanoTemp     1168.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.177, 0.143, 0.000)
		colorShelf     (0.257, 0.188, 0.152, 0.000)
		colorBeach     (0.272, 0.199, 0.161, 0.000)
		colorDesert    (0.288, 0.210, 0.170, 0.000)
		colorLowland   (0.303, 0.222, 0.179, 0.000)
		colorUpland    (0.318, 0.233, 0.188, 0.000)
		colorRock      (0.333, 0.244, 0.196, 0.000)
		colorSnow      (0.348, 0.255, 0.205, 1.000)
		BumpHeight      0.196206
		BumpOffset      0.0392413
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0976035
		GasToDust   0.25
		Particles   1176
		GasBright   0.335077
		DustBright  0.394371
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.9399
		Period          206.417
		Eccentricity    0.965236
		Inclination     -25.6838
		AscendingNode   -95.4442
		ArgOfPericenter -22.8219
		MeanAnomaly     -22.2581
	}
}

Comet	"Jakku System C107"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.94755e-011
	Radius          4.8441
	InertiaMoment   0.398122

	Oblateness      0.00752179

	RotationPeriod  60.2579
	Obliquity       221.511
	EqAscendNode    312.423

	AbsMagn         8.52834
	SlopeParam      3.33152
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.493 0.439)

	Surface
	{
		SurfStyle       0.510853
		OceanStyle      0.759597
		Randomize      (-0.572, -0.746, 0.034)
		colorDistMagn   0.442507
		colorDistFreq   0.00536073
		detailScale     132.276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597816
		terraceProb     0.347916
		erosion         0
		montesMagn      0.423212
		montesFreq      2.7993
		montesSpiky     0.905146
		montesFraction  0.504678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0596122
		hillsFraction   0.573701
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267889
		craterFreq      0.212753
		craterDensity   0.666464
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502676
		volcanoTemp     1590.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.168, 0.123, 0.000)
		colorShelf     (0.253, 0.173, 0.141, 0.000)
		colorBeach     (0.298, 0.202, 0.167, 0.000)
		colorDesert    (0.323, 0.217, 0.162, 0.000)
		colorLowland   (0.355, 0.232, 0.184, 0.000)
		colorUpland    (0.393, 0.281, 0.224, 0.000)
		colorRock      (0.424, 0.306, 0.241, 0.000)
		colorSnow      (0.462, 0.326, 0.255, 1.000)
		BumpHeight      4.35969
		BumpOffset      0.871938
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.578795
		GasToDust   0.25
		Particles   2149
		GasBright   0.00761733
		DustBright  0.406317
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.6121
		Period          133.398
		Eccentricity    0.971878
		Inclination     -82.0871
		AscendingNode   -53.9693
		ArgOfPericenter -134.18
		MeanAnomaly     -136.086
	}
}

Comet	"Jakku System C108"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.05314e-007
	Radius          84.9133
	InertiaMoment   0.399827

	Oblateness      0.00562094

	RotationPeriod  58.357
	Obliquity       174.716
	EqAscendNode    297.001

	AbsMagn         4.84038
	SlopeParam      3.90559
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.525 0.400 0.328)

	Surface
	{
		SurfStyle       0.971626
		OceanStyle      0.973511
		Randomize      (-0.460, -0.975, -0.983)
		colorDistMagn   0.30248
		colorDistFreq   3.30443
		detailScale     2318.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999835
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608213
		terraceProb     0.516402
		erosion         0
		montesMagn      0.677075
		montesFreq      2.98235
		montesSpiky     0.964983
		montesFraction  0.638462
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.5852
		hillsFraction   0.776311
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26361
		craterFreq      0.27184
		craterDensity   0.806578
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538333
		volcanoTemp     1724.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.140, 0.131, 0.050)
		colorShelf     (0.210, 0.164, 0.151, 0.040)
		colorBeach     (0.241, 0.188, 0.171, 0.030)
		colorDesert    (0.273, 0.212, 0.194, 0.020)
		colorLowland   (0.304, 0.236, 0.214, 0.030)
		colorUpland    (0.336, 0.260, 0.233, 0.050)
		colorRock      (0.367, 0.284, 0.259, 0.020)
		colorSnow      (0.367, 0.284, 0.259, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0695805
		DustBright  0.828841
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.0719
		Period          182.85
		Eccentricity    0.987785
		Inclination     92.7468
		AscendingNode   -44.2322
		ArgOfPericenter -120.902
		MeanAnomaly     -109.883
	}
}

Comet	"Jakku System C109"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            9.40086e-015
	Radius          0.300051
	InertiaMoment   0.398697

	Oblateness      0.00856111

	RotationPeriod  56.4847
	Obliquity       127.922
	EqAscendNode    281.578

	AbsMagn         12.4958
	SlopeParam      4.47184
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.592 0.587 0.583)

	Surface
	{
		SurfStyle       0.59083
		OceanStyle      0.340099
		Randomize      (0.806, 0.015, -0.603)
		colorDistMagn   0.376034
		colorDistFreq   3.92056e-005
		detailScale     8.19339
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473806
		terraceProb     0.383847
		erosion         0
		montesMagn      0.311666
		montesFreq      2.81097
		montesSpiky     0.939958
		montesFraction  0.357747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000163983
		hillsFraction   0.601972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231411
		craterFreq      0.23805
		craterDensity   0.930953
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514379
		volcanoTemp     1388.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.199, 0.163, 0.000)
		colorShelf     (0.237, 0.205, 0.187, 0.000)
		colorBeach     (0.278, 0.241, 0.222, 0.000)
		colorDesert    (0.302, 0.258, 0.216, 0.000)
		colorLowland   (0.331, 0.276, 0.245, 0.000)
		colorUpland    (0.367, 0.334, 0.297, 0.000)
		colorRock      (0.396, 0.364, 0.321, 0.000)
		colorSnow      (0.432, 0.387, 0.338, 1.000)
		BumpHeight      0.270046
		BumpOffset      0.0540092
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.130429
		GasToDust   0.25
		Particles   1243
		GasBright   0.0795627
		DustBright  0.503345
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.2775
		Period          116.843
		Eccentricity    0.924611
		Inclination     -110.044
		AscendingNode   148.924
		ArgOfPericenter -8.68088
		MeanAnomaly     -140.774
	}
}

Comet	"Jakku System C110"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            7.27086e-011
	Radius          5.23732
	InertiaMoment   0.396693

	Oblateness      0.00624467

	RotationPeriod  54.635
	Obliquity       81.1278
	EqAscendNode    266.156

	AbsMagn         8.31851
	SlopeParam      5.07958
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.794 0.792 0.788)

	Surface
	{
		SurfStyle       0.0483788
		OceanStyle      0.972935
		Randomize      (0.240, -0.430, -0.772)
		colorDistMagn   0.183485
		colorDistFreq   0.00860079
		detailScale     143.014
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956842
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418825
		terraceProb     0.326171
		erosion         0
		montesMagn      0.52815
		montesFreq      3.61417
		montesSpiky     0.881511
		montesFraction  0.211626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0538293
		hillsFraction   0.660026
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25878
		craterFreq      0.261923
		craterDensity   1.04793
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515671
		volcanoTemp     1432.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.315, 0.000)
		colorShelf     (0.338, 0.337, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.376, 0.374, 0.000)
		colorLowland   (0.397, 0.396, 0.394, 0.000)
		colorUpland    (0.417, 0.416, 0.414, 0.000)
		colorRock      (0.437, 0.436, 0.434, 0.000)
		colorSnow      (0.457, 0.455, 0.453, 1.000)
		BumpHeight      4.71358
		BumpOffset      0.942717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.611621
		GasToDust   0.25
		Particles   2215
		GasBright   0.0522857
		DustBright  0.215108
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.7027
		Period          126.863
		Eccentricity    0.939
		Inclination     -11.0315
		AscendingNode   -42.5726
		ArgOfPericenter 51.5914
		MeanAnomaly     164.89
	}
}

Comet	"Jakku System C111"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.62349e-007
	Radius          117.267
	InertiaMoment   0.39918

	Oblateness      0.0097943

	RotationPeriod  52.8027
	Obliquity       34.3335
	EqAscendNode    250.733

	AbsMagn         4.54676
	SlopeParam      5.81104
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.460 0.456 0.451)

	Surface
	{
		SurfStyle       0.00800869
		OceanStyle      0.908296
		Randomize      (0.438, -0.255, -0.804)
		colorDistMagn   0.626901
		colorDistFreq   5.65662
		detailScale     3202.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.530403
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381235
		terraceProb     0.335097
		erosion         0
		montesMagn      0.471801
		montesFreq      3.22703
		montesSpiky     0.934324
		montesFraction  0.584592
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.9004
		hillsFraction   0.611419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246977
		craterFreq      0.436152
		craterDensity   0.920427
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510938
		volcanoTemp     1338.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.182, 0.181, 0.000)
		colorShelf     (0.195, 0.194, 0.192, 0.000)
		colorBeach     (0.207, 0.205, 0.203, 0.000)
		colorDesert    (0.218, 0.216, 0.214, 0.000)
		colorLowland   (0.230, 0.228, 0.226, 0.000)
		colorUpland    (0.241, 0.239, 0.237, 0.000)
		colorRock      (0.253, 0.251, 0.248, 0.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.191416
		DustBright  0.560465
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.9668
		Period          174.027
		Eccentricity    0.953285
		Inclination     147.957
		AscendingNode   -60.4051
		ArgOfPericenter -152.346
		MeanAnomaly     45.0798
	}
}

Comet	"Jakku System C112"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.73152e-014
	Radius          0.322566
	InertiaMoment   0.397772

	Oblateness      0.00706403

	RotationPeriod  50.9827
	Obliquity       347.539
	EqAscendNode    235.311

	AbsMagn         12.1231
	SlopeParam      6.94389
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.601 0.554)

	Surface
	{
		SurfStyle       0.157798
		OceanStyle      0.0677511
		Randomize      (0.763, -0.886, -0.450)
		colorDistMagn   0.913667
		colorDistFreq   2.07266e-005
		detailScale     8.80821
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.623044
		terraceProb     0.272389
		erosion         0
		montesMagn      0.51748
		montesFreq      3.24186
		montesSpiky     0.99707
		montesFraction  0.399553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000110435
		hillsFraction   0.574956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222314
		craterFreq      0.20984
		craterDensity   0.933566
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541198
		volcanoTemp     1406.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.240, 0.222, 0.000)
		colorShelf     (0.310, 0.255, 0.235, 0.000)
		colorBeach     (0.328, 0.270, 0.249, 0.000)
		colorDesert    (0.347, 0.285, 0.263, 0.000)
		colorLowland   (0.365, 0.300, 0.277, 0.000)
		colorUpland    (0.383, 0.315, 0.291, 0.000)
		colorRock      (0.401, 0.330, 0.305, 0.000)
		colorSnow      (0.419, 0.345, 0.319, 1.000)
		BumpHeight      0.29031
		BumpOffset      0.058062
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.163255
		GasToDust   0.25
		Particles   1309
		GasBright   0.136857
		DustBright  0.29951
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.3021
		Period          138.43
		Eccentricity    0.952456
		Inclination     -111.299
		AscendingNode   97.1406
		ArgOfPericenter 165.685
		MeanAnomaly     -36.6697
	}
}

Comet	"Jakku System C113"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.3392e-010
	Radius          7.26374
	InertiaMoment   0.399619

	Oblateness      0.0112902

	RotationPeriod  49.1703
	Obliquity       300.745
	EqAscendNode    219.888

	AbsMagn         8.10955
	SlopeParam      2.31829
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.694 0.691)

	Surface
	{
		SurfStyle       0.659316
		OceanStyle      0.736397
		Randomize      (-0.412, 0.394, 0.106)
		colorDistMagn   0.590161
		colorDistFreq   0.00448998
		detailScale     198.348
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935799
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482962
		terraceProb     0.290484
		erosion         0
		montesMagn      0.456667
		montesFreq      2.86327
		montesSpiky     0.980416
		montesFraction  0.623562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0874388
		hillsFraction   0.498082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243756
		craterFreq      0.245865
		craterDensity   0.776469
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539542
		volcanoTemp     1551.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.236, 0.194, 0.000)
		colorShelf     (0.279, 0.243, 0.221, 0.000)
		colorBeach     (0.328, 0.285, 0.263, 0.000)
		colorDesert    (0.355, 0.306, 0.256, 0.000)
		colorLowland   (0.390, 0.326, 0.290, 0.000)
		colorUpland    (0.432, 0.396, 0.353, 0.000)
		colorRock      (0.467, 0.431, 0.380, 0.000)
		colorSnow      (0.509, 0.458, 0.401, 1.000)
		BumpHeight      6.53736
		BumpOffset      1.30747
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.644447
		GasToDust   0.25
		Particles   2281
		GasBright   0.343178
		DustBright  0.577676
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.0936
		Period          183.025
		Eccentricity    0.961734
		Inclination     101.496
		AscendingNode   -107.314
		ArgOfPericenter -143.289
		MeanAnomaly     135.805
	}
}

Comet	"Jakku System C114"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.12351e-018
	Radius          0.0198074
	InertiaMoment   0.398429

	Oblateness      0.00797831

	RotationPeriod  47.3609
	Obliquity       253.951
	EqAscendNode    204.465

	AbsMagn         4.23323
	SlopeParam      3.02126
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.656 0.654)

	Surface
	{
		SurfStyle       0.190998
		OceanStyle      0.626308
		Randomize      (0.747, 0.873, -0.987)
		colorDistMagn   0.66235
		colorDistFreq   2.02718e-007
		detailScale     0.540873
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794804
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384679
		terraceProb     0.200039
		erosion         0
		montesMagn      0.596382
		montesFreq      3.18941
		montesSpiky     0.888586
		montesFraction  0.348036
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.62351e-007
		hillsFraction   0.905292
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237999
		craterFreq      0.235617
		craterDensity   0.931882
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489097
		volcanoTemp     1615.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.263, 0.262, 0.000)
		colorShelf     (0.281, 0.279, 0.278, 0.000)
		colorBeach     (0.297, 0.295, 0.294, 0.000)
		colorDesert    (0.314, 0.312, 0.311, 0.000)
		colorLowland   (0.330, 0.328, 0.327, 0.000)
		colorUpland    (0.347, 0.345, 0.343, 0.000)
		colorRock      (0.364, 0.361, 0.360, 0.000)
		colorSnow      (0.380, 0.377, 0.376, 1.000)
		BumpHeight      0.0178266
		BumpOffset      0.00356533
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.261337
		DustBright  0.344003
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.6777
		Period          148.643
		Eccentricity    0.964433
		Inclination     85.7154
		AscendingNode   -49.0954
		ArgOfPericenter -149.76
		MeanAnomaly     -87.6961
	}
}

Comet	"Jakku System C115"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            3.18924e-014
	Radius          0.449929
	InertiaMoment   0.395171

	Oblateness      0.0129122

	RotationPeriod  45.5499
	Obliquity       207.156
	EqAscendNode    189.043

	AbsMagn         11.7831
	SlopeParam      3.61853
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.647 0.643 0.638)

	Surface
	{
		SurfStyle       0.319369
		OceanStyle      0.552868
		Randomize      (0.440, 0.382, 0.883)
		colorDistMagn   0.382623
		colorDistFreq   9.61145e-005
		detailScale     12.2861
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323989
		terraceProb     0.153228
		erosion         0
		montesMagn      0.486426
		montesFreq      3.23322
		montesSpiky     0.976958
		montesFraction  0.59781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000453511
		hillsFraction   0.649493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245553
		craterFreq      0.190145
		craterDensity   0.839644
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5101
		volcanoTemp     1791.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.257, 0.255, 0.000)
		colorShelf     (0.275, 0.273, 0.271, 0.000)
		colorBeach     (0.291, 0.289, 0.287, 0.000)
		colorDesert    (0.307, 0.306, 0.303, 0.000)
		colorLowland   (0.324, 0.322, 0.319, 0.000)
		colorUpland    (0.340, 0.338, 0.335, 0.000)
		colorRock      (0.356, 0.354, 0.351, 0.000)
		colorSnow      (0.372, 0.370, 0.367, 1.000)
		BumpHeight      0.404936
		BumpOffset      0.0809873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.196081
		GasToDust   0.25
		Particles   1375
		GasBright   0.142237
		DustBright  0.14759
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.8106
		Period          134.839
		Eccentricity    0.95866
		Inclination     111.677
		AscendingNode   116.427
		ArgOfPericenter -54.25
		MeanAnomaly     -70.6599
	}
}

Comet	"Jakku System C116"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.46664e-010
	Radius          7.58008
	InertiaMoment   0.398949

	Oblateness      0.00878389

	RotationPeriod  43.7327
	Obliquity       160.362
	EqAscendNode    173.62

	AbsMagn         7.90089
	SlopeParam      4.18296
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.585 0.551)

	Surface
	{
		SurfStyle       0.798609
		OceanStyle      0.800682
		Randomize      (-0.880, -0.174, -0.396)
		colorDistMagn   0.650928
		colorDistFreq   0.0250524
		detailScale     206.987
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349019
		terraceProb     0.463817
		erosion         0
		montesMagn      0.365615
		montesFreq      3.24629
		montesSpiky     0.860874
		montesFraction  0.390972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.180428
		hillsFraction   0.602633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231811
		craterFreq      0.261926
		craterDensity   0.898788
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485792
		volcanoTemp     2103.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.199, 0.154, 0.000)
		colorShelf     (0.257, 0.205, 0.176, 0.000)
		colorBeach     (0.301, 0.240, 0.210, 0.000)
		colorDesert    (0.327, 0.257, 0.204, 0.000)
		colorLowland   (0.359, 0.275, 0.232, 0.000)
		colorUpland    (0.398, 0.333, 0.281, 0.000)
		colorRock      (0.430, 0.362, 0.303, 0.000)
		colorSnow      (0.468, 0.386, 0.320, 1.000)
		BumpHeight      6.82207
		BumpOffset      1.36441
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.677273
		GasToDust   0.25
		Particles   2348
		GasBright   0.0385682
		DustBright  0.735745
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.8613
		Period          150.025
		Eccentricity    0.9489
		Inclination     -120.593
		AscendingNode   151.623
		ArgOfPericenter -137.347
		MeanAnomaly     43.4166
	}
}

Comet	"Jakku System C117"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            7.59497e-018
	Radius          0.0278694
	InertiaMoment   0.397335

	Oblateness      0.0153495

	RotationPeriod  41.9045
	Obliquity       113.568
	EqAscendNode    158.198

	AbsMagn         3.89466
	SlopeParam      4.76266
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.746 0.742)

	Surface
	{
		SurfStyle       0.266494
		OceanStyle      0.851539
		Randomize      (-0.467, -0.197, 0.815)
		colorDistMagn   0.917346
		colorDistFreq   2.57293e-007
		detailScale     0.761021
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993858
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.372617
		terraceProb     0.268326
		erosion         0
		montesMagn      0.422548
		montesFreq      2.30423
		montesSpiky     0.924594
		montesFraction  0.373951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.2456e-006
		hillsFraction   0.441134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242982
		craterFreq      0.277568
		craterDensity   0.964148
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531067
		volcanoTemp     1226.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.297, 0.000)
		colorShelf     (0.318, 0.317, 0.315, 0.000)
		colorBeach     (0.337, 0.336, 0.334, 0.000)
		colorDesert    (0.356, 0.354, 0.353, 0.000)
		colorLowland   (0.374, 0.373, 0.371, 0.000)
		colorUpland    (0.393, 0.392, 0.390, 0.000)
		colorRock      (0.412, 0.410, 0.408, 0.000)
		colorSnow      (0.431, 0.429, 0.427, 1.000)
		BumpHeight      0.0250825
		BumpOffset      0.0050165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0499426
		DustBright  0.408858
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21.3835
		Period          90.9114
		Eccentricity    0.969683
		Inclination     -100.041
		AscendingNode   87.3993
		ArgOfPericenter -80.6418
		MeanAnomaly     -177.382
	}
}

Comet	"Jakku System C118"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            5.87416e-014
	Radius          0.706225
	InertiaMoment   0.399406

	Oblateness      0.0356105

	RotationPeriod  40.0605
	Obliquity       66.7734
	EqAscendNode    142.775

	AbsMagn         11.4684
	SlopeParam      5.41645
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.701 0.697)

	Surface
	{
		SurfStyle       0.716552
		OceanStyle      0.577212
		Randomize      (-0.898, -0.008, 0.837)
		colorDistMagn   0.896721
		colorDistFreq   0.000296851
		detailScale     19.2846
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958543
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684999
		terraceProb     0.394894
		erosion         0
		montesMagn      0.326388
		montesFreq      2.78474
		montesSpiky     0.977611
		montesFraction  0.561745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000882921
		hillsFraction   0.520499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238945
		craterFreq      0.232286
		craterDensity   0.939847
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508974
		volcanoTemp     1327.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.238, 0.195, 0.000)
		colorShelf     (0.282, 0.245, 0.223, 0.000)
		colorBeach     (0.331, 0.288, 0.265, 0.000)
		colorDesert    (0.359, 0.309, 0.258, 0.000)
		colorLowland   (0.395, 0.330, 0.293, 0.000)
		colorUpland    (0.437, 0.400, 0.355, 0.000)
		colorRock      (0.472, 0.435, 0.383, 0.000)
		colorSnow      (0.515, 0.463, 0.404, 1.000)
		BumpHeight      0.635602
		BumpOffset      0.12712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.228907
		GasToDust   0.25
		Particles   1442
		GasBright   0.158378
		DustBright  0.784909
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.4313
		Period          40.2972
		Eccentricity    0.923317
		Inclination     -45.12
		AscendingNode   -149.878
		ArgOfPericenter 42.0642
		MeanAnomaly     -175.346
	}
}

Comet	"Jakku System C119"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            4.54324e-010
	Radius          10.8921
	InertiaMoment   0.39813

	Oblateness      0.0184929

	RotationPeriod  38.1953
	Obliquity       19.9792
	EqAscendNode    127.352

	AbsMagn         7.69196
	SlopeParam      6.27825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.760 0.757)

	Surface
	{
		SurfStyle       0.575261
		OceanStyle      0.0139128
		Randomize      (0.008, 0.389, -0.522)
		colorDistMagn   0.906808
		colorDistFreq   0.0967432
		detailScale     297.428
		colorConversion true
		snowLevel       2
		tropicLatitude  0.832711
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539342
		terraceProb     0.142176
		erosion         0
		montesMagn      0.451032
		montesFreq      3.21998
		montesSpiky     0.865961
		montesFraction  0.647056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.24705
		hillsFraction   0.736605
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212415
		craterFreq      0.227221
		craterDensity   0.824374
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521793
		volcanoTemp     1481.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.258, 0.212, 0.000)
		colorShelf     (0.305, 0.266, 0.242, 0.000)
		colorBeach     (0.359, 0.312, 0.288, 0.000)
		colorDesert    (0.389, 0.334, 0.280, 0.000)
		colorLowland   (0.428, 0.357, 0.318, 0.000)
		colorUpland    (0.473, 0.433, 0.386, 0.000)
		colorRock      (0.512, 0.471, 0.416, 0.000)
		colorSnow      (0.557, 0.501, 0.439, 1.000)
		BumpHeight      9.80293
		BumpOffset      1.96059
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.710099
		GasToDust   0.25
		Particles   2414
		GasBright   0.14247
		DustBright  0.485303
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.1119
		Period          159.547
		Eccentricity    0.964443
		Inclination     39.4828
		AscendingNode   37.8033
		ArgOfPericenter -146.098
		MeanAnomaly     179.461
	}
}

Comet	"Jakku System C120"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.3989e-017
	Radius          0.0424345
	InertiaMoment   0.399833

	Oblateness      0.0395638

	RotationPeriod  36.3035
	Obliquity       333.185
	EqAscendNode    111.93

	AbsMagn         3.52378
	SlopeParam      8.32711
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.673 0.669)

	Surface
	{
		SurfStyle       0.926977
		OceanStyle      0.363789
		Randomize      (0.277, 0.464, 0.311)
		colorDistMagn   0.617576
		colorDistFreq   8.01184e-007
		detailScale     1.15874
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307353
		terraceProb     0.308865
		erosion         0
		montesMagn      0.574893
		montesFreq      3.22307
		montesSpiky     0.98996
		montesFraction  0.566891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.03488e-006
		hillsFraction   0.7763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214163
		craterFreq      0.265667
		craterDensity   0.890765
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505984
		volcanoTemp     1683.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.236, 0.268, 0.050)
		colorShelf     (0.271, 0.276, 0.308, 0.040)
		colorBeach     (0.312, 0.316, 0.348, 0.030)
		colorDesert    (0.353, 0.357, 0.395, 0.020)
		colorLowland   (0.394, 0.397, 0.435, 0.030)
		colorUpland    (0.434, 0.437, 0.475, 0.050)
		colorRock      (0.475, 0.478, 0.529, 0.020)
		colorSnow      (0.475, 0.478, 0.529, 1.000)
		BumpHeight      0.0381911
		BumpOffset      0.00763821
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0893034
		DustBright  0.222957
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.2621
		Period          217.597
		Eccentricity    0.972413
		Inclination     -74.4805
		AscendingNode   48.6663
		ArgOfPericenter 165.056
		MeanAnomaly     -75.4804
	}
}

Comet	"Jakku System C121"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.08195e-013
	Radius          0.674682
	InertiaMoment   0.398703

	Oblateness      0.0228295

	RotationPeriod  34.3787
	Obliquity       286.391
	EqAscendNode    96.5072

	AbsMagn         11.1739
	SlopeParam      2.68533
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.791 0.790)

	Surface
	{
		SurfStyle       0.122047
		OceanStyle      0.286764
		Randomize      (-0.741, -0.845, -0.396)
		colorDistMagn   0.811784
		colorDistFreq   0.000287591
		detailScale     18.4233
		colorConversion true
		snowLevel       2
		tropicLatitude  0.869714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631533
		terraceProb     0.213357
		erosion         0
		montesMagn      0.448835
		montesFreq      2.62918
		montesSpiky     0.936636
		montesFraction  0.330715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000967791
		hillsFraction   0.60013
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275852
		craterFreq      0.150558
		craterDensity   0.933026
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529479
		volcanoTemp     1477.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.316, 0.000)
		colorShelf     (0.338, 0.336, 0.336, 0.000)
		colorBeach     (0.358, 0.356, 0.355, 0.000)
		colorDesert    (0.378, 0.376, 0.375, 0.000)
		colorLowland   (0.398, 0.396, 0.395, 0.000)
		colorUpland    (0.418, 0.415, 0.415, 0.000)
		colorRock      (0.438, 0.435, 0.434, 0.000)
		colorSnow      (0.457, 0.455, 0.454, 1.000)
		BumpHeight      0.607214
		BumpOffset      0.121443
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.261733
		GasToDust   0.25
		Particles   1508
		GasBright   0.274906
		DustBright  0.52184
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.7944
		Period          164.826
		Eccentricity    0.959433
		Inclination     48.9001
		AscendingNode   -64.7787
		ArgOfPericenter 154.481
		MeanAnomaly     -89.0319
	}
}

Comet	"Jakku System C122"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            8.36808e-010
	Radius          16.2933
	InertiaMoment   0.396713

	Oblateness      0.0464169

	RotationPeriod  32.4142
	Obliquity       239.596
	EqAscendNode    81.0846

	AbsMagn         7.48219
	SlopeParam      3.32335
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.660 0.658 0.655)

	Surface
	{
		SurfStyle       0.0441289
		OceanStyle      0.868418
		Randomize      (0.055, 0.436, -0.677)
		colorDistMagn   0.303566
		colorDistFreq   0.104882
		detailScale     444.917
		colorConversion true
		snowLevel       2
		tropicLatitude  0.48876
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546527
		terraceProb     0.123829
		erosion         0
		montesMagn      0.686311
		montesFreq      2.97651
		montesSpiky     0.865116
		montesFraction  0.532279
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.642278
		hillsFraction   0.820781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237156
		craterFreq      0.155096
		craterDensity   0.914658
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487638
		volcanoTemp     1451.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.263, 0.262, 0.000)
		colorShelf     (0.281, 0.280, 0.278, 0.000)
		colorBeach     (0.297, 0.296, 0.295, 0.000)
		colorDesert    (0.314, 0.313, 0.311, 0.000)
		colorLowland   (0.330, 0.329, 0.328, 0.000)
		colorUpland    (0.347, 0.346, 0.344, 0.000)
		colorRock      (0.363, 0.362, 0.360, 0.000)
		colorSnow      (0.380, 0.378, 0.377, 1.000)
		BumpHeight      14.664
		BumpOffset      2.9328
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.742925
		GasToDust   0.25
		Particles   2480
		GasBright   0.194457
		DustBright  0.286776
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.7888
		Period          127.476
		Eccentricity    0.921286
		Inclination     38.0741
		AscendingNode   -153.027
		ArgOfPericenter 103.857
		MeanAnomaly     -51.3194
	}
}

Comet	"Jakku System C123"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            2.5766e-017
	Radius          0.0417913
	InertiaMoment   0.399185

	Oblateness      0.0291857

	RotationPeriod  30.4021
	Obliquity       192.802
	EqAscendNode    65.662

	AbsMagn         3.1098
	SlopeParam      3.89787
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.758 0.756)

	Surface
	{
		SurfStyle       0.202677
		OceanStyle      0.240163
		Randomize      (0.825, -0.984, 0.798)
		colorDistMagn   0.997482
		colorDistFreq   1.18973e-006
		detailScale     1.14118
		colorConversion true
		snowLevel       2
		tropicLatitude  0.856896
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449702
		terraceProb     0.297886
		erosion         0
		montesMagn      0.520268
		montesFreq      2.20234
		montesSpiky     0.676892
		montesFraction  0.155901
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.78713e-006
		hillsFraction   0.520004
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214425
		craterFreq      0.216137
		craterDensity   0.922593
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521825
		volcanoTemp     1230.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.303, 0.303, 0.000)
		colorShelf     (0.324, 0.322, 0.321, 0.000)
		colorBeach     (0.343, 0.341, 0.340, 0.000)
		colorDesert    (0.362, 0.360, 0.359, 0.000)
		colorLowland   (0.382, 0.379, 0.378, 0.000)
		colorUpland    (0.401, 0.398, 0.397, 0.000)
		colorRock      (0.420, 0.417, 0.416, 0.000)
		colorSnow      (0.439, 0.436, 0.435, 1.000)
		BumpHeight      0.0376121
		BumpOffset      0.00752243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.44725
		DustBright  0.518469
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.914
		Period          189.67
		Eccentricity    0.961655
		Inclination     -71.2997
		AscendingNode   14.8852
		ArgOfPericenter -165.619
		MeanAnomaly     28.4058
	}
}

Comet	"Jakku System C124"
{
	ParentBody     "Jakku System"
	Class	       "Asteroid"

	Mass            1.99281e-013
	Radius          0.996746
	InertiaMoment   0.397781

	Oblateness      0.0586368

	RotationPeriod  28.3335
	Obliquity       146.008
	EqAscendNode    50.2394

	AbsMagn         10.8957
	SlopeParam      4.46391
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.406 0.402 0.396)

	Surface
	{
		SurfStyle       0.554172
		OceanStyle      0.633927
		Randomize      (-0.686, 0.115, 0.885)
		colorDistMagn   0.511648
		colorDistFreq   0.000489276
		detailScale     27.2178
		colorConversion true
		snowLevel       2
		tropicLatitude  0.237929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35669
		terraceProb     0.221219
		erosion         0
		montesMagn      0.634888
		montesFreq      3.25759
		montesSpiky     0.877881
		montesFraction  0.61618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00234531
		hillsFraction   0.483322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207598
		craterFreq      0.218596
		craterDensity   0.767188
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576721
		volcanoTemp     1440.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.137, 0.111, 0.000)
		colorShelf     (0.162, 0.141, 0.127, 0.000)
		colorBeach     (0.191, 0.165, 0.151, 0.000)
		colorDesert    (0.207, 0.177, 0.147, 0.000)
		colorLowland   (0.227, 0.189, 0.166, 0.000)
		colorUpland    (0.252, 0.229, 0.202, 0.000)
		colorRock      (0.272, 0.249, 0.218, 0.000)
		colorSnow      (0.296, 0.266, 0.230, 1.000)
		BumpHeight      0.897071
		BumpOffset      0.179414
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.294559
		GasToDust   0.25
		Particles   1574
		GasBright   0.0144161
		DustBright  0.63579
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.4748
		Period          154.672
		Eccentricity    0.955179
		Inclination     -159.768
		AscendingNode   0.729459
		ArgOfPericenter 7.0487
		MeanAnomaly     69.1034
	}
}
