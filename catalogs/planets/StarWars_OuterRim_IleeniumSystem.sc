// http://starwars.wikia.com/wiki/D%27Qar
// Region : Outer Rim
// Sector : Sanbra Sector
// Grid location : O17
// X : 5066.38, Y : -11776.55, Z : -376.6042786598674
// Two habitable planets

Planet	"D'Qar/Ileenium System 8"
{
	ParentBody     "Ileenium"
	Class	       "Terra"

	Radius          5200
	InertiaMoment   0.372801

	Oblateness      0.00210191

	RotationPeriod  34.7619
	Obliquity       -47.1339
	EqAscendNode    0.631442

	AlbedoBond      0.283831
	AlbedoGeom      0.340597
	Brightness      0.634921
	Color          (0.285 0.357 0.403)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.624603
		OceanStyle      0.15873
		Randomize      (0.197, 0.050, -0.285)
		colorDistMagn   0.0606753
		colorDistFreq   973.164
		detailScale     101.06
		colorConversion false
		drivenDarkening -0.761905
		seaLevel        0.0158731
		snowLevel       0
		tropicLatitude  0.726434
		icecapLatitude  0
		icecapHeight    0
		climatePole     0.452381
		climateTropic   0.539683
		climateEquator  0.214286
		heightTempGrad  0.436508
		tropicWidth     0.0717336
		mainFreq        0.0793651
		venusFreq       0
		venusMagn       0.31746
		mareFreq        215.444
		mareDensity     1
		terraceProb     0.691478
		erosion         0.126984
		montesMagn      0.793651
		montesFreq      15.873
		montesSpiky     0.896825
		montesFraction  0.388889
		dunesMagn       0.0793651
		dunesFreq       3.1746
		dunesFraction   0.0396825
		hillsMagn       0.238095
		hillsFreq       333.333
		hillsFraction   0.777778
		hills2Fraction  0.301587
		riversMagn      8.73016
		riversFreq      0.31746
		riversSin       0.47619
		riversOctaves   1
		canyonsMagn     0.15873
		canyonsFreq     7.93651
		canyonFraction  0.47016
		cracksMagn      1.19048
		cracksFreq      0.277778
		cracksOctaves   1
		craterMagn      0
		craterFreq      0
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.015873
		volcanoFreq     0.0793651
		volcanoDensity  0.015873
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.047619
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
		cycloneMagn     2.83283
		cycloneFreq     1.05742
		cycloneDensity  0.401564
		cycloneOctaves  4
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.780, 0.750, 0.740, 0.000)
		colorDesert    (0.470, 0.420, 0.390, 0.000)
		colorLowland   (0.270, 0.250, 0.230, 0.000)
		colorUpland    (0.490, 0.480, 0.460, 0.000)
		colorRock      (0.260, 0.240, 0.230, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.180, 0.330, 0.390, 0.000)
		colorUpPlants  (0.150, 0.260, 0.330, 0.000)
		BumpHeight      16.6667
		BumpOffset      15.0794
		DiffMapAlpha   "Water"
		SpecBrightWater 1.5873
		SpecBrightIce   1.11111
		SpecularPower   1.57252
		Hapke           0.444444
		SpotBright      4
		SpotWidth       0.0873016
		DayAmbient      1.19048
	}

	Clouds
	{
		Height          5.64453
		Velocity        25.196
		BumpHeight      5.64433
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.961617
		mainOctaves     10
		Coverage        0.0238095
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
	}

	Clouds
	{
		Height          11.2886
		Velocity        102.513
		BumpHeight      5.64433
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateColor  (1.000 1.000 1.000 0.849)
		mainFreq        0.961617
		mainOctaves     10
		Coverage        0.0238095
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
	}

	Ocean
	{
		Height          0.264459
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	Atmosphere
	{
		Model          "Earth"
		Height          179.46
		Density         1.07584
		Pressure        1.07584
		Greenhouse      23.8095
		Bright          5.55556
		Opacity         0.873016
		SkyLight        4.20635
		Hue             -0.103175
		Saturation      0.15873

		Composition
		{
			N2    	78.951
			O2    	20.7233
			CO2   	0.258892
			H2O   	0.0497247
			Ne    	0.0170738
		}
	}

	Aurora
	{
		Height      139.036
		NorthLat    47.7648
		NorthLon    -44.2708
		NorthRadius 2246.56
		NorthWidth  776.464
		NorthRings  4
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -52.5734
		SouthLon    111.297
		SouthRadius 1951.44
		SouthWidth  653.853
		SouthRings  3
		SouthBright 0.3
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     14959.8
		OuterRadius     12014
		RotationPeriod  10.3476
		RotationOffset  0
		FrontBright     0.555556
		BackBright      2.14286
		Density         0.0061054
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.63565
		Eccentricity    0.0180743
		Inclination     -2.83744
		AscendingNode   102.386
		ArgOfPericenter 92.227
		MeanAnomaly     256.404
	}
}

Moon	"D'Qar's Moon 1/Ileenium System 8.1"
{
	ParentBody     "Ileenium System 8"
	Class	       "Selena"

	Mass            0.000168539
	Radius          372.439
	InertiaMoment   0.399733

	Oblateness      0.0211965

	Obliquity       -0.78928
	EqAscendNode    -91.8993
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.701 0.698 0.695)

	Surface
	{
		SurfStyle       0.295427
		OceanStyle      0.408119
		Randomize      (-0.679, 0.295, 0.932)
		colorDistMagn   0.0520723
		colorDistFreq   41.3959
		detailScale     957.934
		colorConversion true
		drivenDarkening 0
		seaLevel        0.201352
		snowLevel       2
		tropicLatitude  0.0191544
		icecapLatitude  10
		icecapHeight    0.106625
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91367
		venusFreq       1.32092
		venusMagn       0
		mareFreq        0
		mareDensity     0.000421896
		terraceProb     0.401987
		erosion         0
		montesMagn      0.0516837
		montesFreq      23.1408
		montesSpiky     0.929608
		montesFraction  0.999146
		dunesMagn       0.0454577
		dunesFreq       489.129
		dunesFraction   0.0886812
		hillsMagn       0.120636
		hillsFreq       35.7012
		hillsFraction   0.295085
		hills2Fraction  0
		riversMagn      56.4943
		riversFreq      2.97565
		riversSin       4.92918
		riversOctaves   0
		canyonsMagn     0.300352
		canyonsFreq     0.110121
		canyonFraction  0.594321
		cracksMagn      0.0588455
		cracksFreq      0.213353
		cracksOctaves   0
		craterMagn      0.644561
		craterFreq      1.12908
		craterDensity   0.743788
		craterOctaves   7.64954
		craterRayedFactor 0.209825
		volcanoMagn     0.201784
		volcanoFreq     0.461428
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.129594
		volcanoRadius   0.148548
		volcanoTemp     1291.2
		lavaCoverTidal  0.0486751
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.385, 0.398, 0.417, 0.000)
		colorDesert    (0.336, 0.321, 0.320, 0.000)
		colorLowland   (0.427, 0.426, 0.389, 0.000)
		colorUpland    (0.455, 0.454, 0.424, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      18.622
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
		SemiMajorAxis   0.000223463
		Period          0.0013401
		Eccentricity    0.0117765
		Inclination     -0.78928
		AscendingNode   -91.8993
		ArgOfPericenter -62.5544
		MeanAnomaly     123.618
	}
}

Moon	"D'Qar's Moon 2/Ileenium System 8.2"
{
	ParentBody     "Ileenium System 8"
	Class	       "Selena"

	Mass            0.000196834
	Radius          446.229
	InertiaMoment   0.39926

	Oblateness      0.00130664

	Obliquity       -1.24629
	EqAscendNode    -66.6022
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.730 0.685 0.659)

	Surface
	{
		SurfStyle       0.522506
		OceanStyle      0.0152491
		Randomize      (0.558, -0.905, -0.070)
		colorDistMagn   0.0886725
		colorDistFreq   44.1114
		detailScale     1147.73
		colorConversion true
		drivenDarkening 0
		seaLevel        0.221842
		snowLevel       2
		tropicLatitude  0.0363521
		icecapLatitude  10
		icecapHeight    0.162489
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90192
		venusFreq       1.78774
		venusMagn       0
		mareFreq        0
		mareDensity     0.000222339
		terraceProb     0.203563
		erosion         0
		montesMagn      0.0552841
		montesFreq      24.8457
		montesSpiky     0.941421
		montesFraction  0.747426
		dunesMagn       0.0329307
		dunesFreq       590.408
		dunesFraction   0.411449
		hillsMagn       0.126753
		hillsFreq       54.3326
		hillsFraction   0.183214
		hills2Fraction  0
		riversMagn      60.4401
		riversFreq      1.98288
		riversSin       4.81494
		riversOctaves   0
		canyonsMagn     0.461871
		canyonsFreq     0.154438
		canyonFraction  0.121221
		cracksMagn      0.0552478
		cracksFreq      0.230066
		cracksOctaves   0
		craterMagn      0.661086
		craterFreq      1.38561
		craterDensity   0.871939
		craterOctaves   9
		craterRayedFactor 0.132983
		volcanoMagn     0.184955
		volcanoFreq     0.712092
		volcanoDensity  0.261302
		volcanoOctaves  3
		volcanoActivity 0.287066
		volcanoFlows    0.252359
		volcanoRadius   0.123365
		volcanoTemp     1330.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.452, 0.418, 0.356, 0.000)
		colorDesert    (0.474, 0.425, 0.362, 0.000)
		colorLowland   (0.372, 0.315, 0.277, 0.000)
		colorUpland    (0.547, 0.486, 0.409, 0.000)
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
		SemiMajorAxis   0.000120704
		Period          0.00654428
		Eccentricity    0.0163831
		Inclination     -1.24629
		AscendingNode   -66.6022
		ArgOfPericenter 23.8005
		MeanAnomaly     -102.085
	}
}

// 2nd habitable planet
Planet	"Ileenium System 9"
{
	ParentBody     "Ileenium System"
	Class	       "Desert"

	Radius          3081.14
	InertiaMoment   0.334318

	Oblateness      0.00394553

	RotationPeriod  28.045
	Obliquity       -325.428
	EqAscendNode    -136.117

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "false"
	}

	Clouds
	{
		Height		23.216
	}

	Atmosphere
	{
		Model          "Earth"
		Height          89.3078
		Density         1.26173
		Pressure        0.54592
		Greenhouse      56.8206
		Bright          3.55556
		Opacity         0.573016
		SkyLight        3.20635

		Composition
		{
			N2    	78.921
			O2    	20.7333
			CO2   	0.288892
			H2O   	0.0397247
			Ar    	0.0170738
		}
	}

	NoOcean		true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.98411
		Eccentricity    0.0396365
		Inclination     1.68363
		AscendingNode   -146.278
		ArgOfPericenter 181.132
		MeanAnomaly     346.17
	}
}


///////////////
// GENERATED //
///////////////

Planet	"Ileenium System 1"
{
	ParentBody     "Ileenium System"
	Class	       "IceGiant"

	Mass            30.1146
	Radius          40921.2
	InertiaMoment   0.217704

	Oblateness      0.00270947

	Obliquity       0.926561
	EqAscendNode    66.4043
	TidalLocked     true

	AbsMagn         -7.64792
	SlopeParam      3.04042
	AlbedoBond      0.504379
	AlbedoGeom      0.605255
	Brightness      2
	Color          (0.630 0.607 0.596)

	Surface
	{
		SurfStyle       0.0809587
		Randomize      (0.752, 0.703, -0.060)
		detailScale     105252
		colorConversion true
		tropicLatitude  0.0270586
		icecapLatitude  0.927059
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.571237
		lavaCoverSun    1.59537
		lavaCoverYoung  0
		stripeZones     2.08815
		stripeFluct     0.457951
		stripeTwist     11.6133
		cycloneMagn     13.9916
		cycloneFreq     0.889658
		cycloneDensity  0.318884
		cycloneOctaves  1
		colorLayer0    (0.280, 0.260, 0.250, 1.000)
		colorLayer1    (0.300, 0.280, 0.270, 1.000)
		colorLayer2    (0.360, 0.330, 0.320, 1.000)
		colorLayer3    (0.400, 0.370, 0.360, 1.000)
		colorLayer4    (0.440, 0.430, 0.420, 1.000)
		colorLayer5    (0.520, 0.470, 0.460, 1.000)
		colorLayer6    (0.640, 0.620, 0.590, 1.000)
		colorLayer7    (0.610, 0.590, 0.700, 1.000)
		colorLowPlants (0.440, 0.430, 0.420, 1.000)
		colorUpPlants  (0.520, 0.470, 0.460, 1.000)
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
		Height          51.7148
		Velocity        32.7325
		BumpHeight      31.7142
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.4744
		mainOctaves     12
		Coverage        0.521897
		stripeZones     2.08815
		stripeFluct     0.457951
		stripeTwist     11.6133
	}

	Clouds
	{
		Height          83.4297
		Velocity        2373.59
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.4744
		mainOctaves     12
		Coverage        0.521897
		stripeZones     2.08815
		stripeFluct     0.457951
		stripeTwist     11.6133
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          337.142
		Density         4162.34
		Pressure        95501.3
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0137722
		Saturation      0.71879

		Composition
		{
			CH4   	78.7746
			N2    	10.2548
			NH3   	7.17825
			O2    	2.08234
			C2H2  	0.707919
			C2H4  	0.330892
			Ne    	0.249364
			Ar    	0.192753
			C2H6  	0.136696
			C3H8  	0.0878392
			He    	0.0028148
			H2O   	0.000793899
			H2S   	0.000429851
			CO2   	0.00036999
			Kr    	9.77081e-005
			Xe    	1.04547e-005
		}
	}

	Aurora
	{
		Height      590.194
		NorthLat    63.2031
		NorthLon    43.8129
		NorthRadius 14919.9
		NorthWidth  2803.34
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -74.4449
		SouthLon    230.429
		SouthRadius 9173.8
		SouthWidth  2461.16
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   2.04924
		GasToDust   1
		Particles   3859
		GasBright   0.0673127
		DustBright  0.111074
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0484973
		Period          0.007379
		Eccentricity    0.0237575
		Inclination     0.926561
		AscendingNode   66.4043
		ArgOfPericenter 148.564
		MeanAnomaly     120.024
	}
}

DwarfPlanet	"Ileenium System 2"
{
	ParentBody     "Ileenium System"
	Class	       "Selena"

	Mass            0.0114959
	Radius          1502.94
	InertiaMoment   0.374353

	Obliquity       -1.99252
	EqAscendNode    -122.311
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.766 0.726 0.696)

	Surface
	{
		SurfStyle       0.804233
		OceanStyle      0.935783
		Randomize      (-0.072, 0.407, -0.200)
		colorDistMagn   0.097857
		colorDistFreq   176.993
		detailScale     3865.64
		colorConversion true
		drivenDarkening 0
		seaLevel        0.239331
		snowLevel       2
		tropicLatitude  0.0335431
		icecapLatitude  10
		icecapHeight    0.178863
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.07042
		venusFreq       0.858092
		venusMagn       0
		mareFreq        0.623772
		mareDensity     0.00629569
		terraceProb     0.639071
		erosion         0
		montesMagn      0.0740186
		montesFreq      77.7107
		montesSpiky     0.870389
		montesFraction  0.931041
		dunesMagn       0.0285646
		dunesFreq       2000.83
		dunesFraction   0.785238
		hillsMagn       0.137152
		hillsFreq       149.381
		hillsFraction   0.674366
		hills2Fraction  0
		riversMagn      58.5636
		riversFreq      1.66397
		riversSin       5.94982
		riversOctaves   0
		canyonsMagn     0.41746
		canyonsFreq     0.551939
		canyonFraction  0.885392
		cracksMagn      0.0450801
		cracksFreq      0.392797
		cracksOctaves   0
		craterMagn      0.504616
		craterFreq      4.05323
		craterDensity   0.551956
		craterOctaves   6.90433
		craterRayedFactor 0.0535505
		volcanoMagn     0.170381
		volcanoFreq     0.600637
		volcanoDensity  0.348119
		volcanoOctaves  3
		volcanoActivity 0.595907
		volcanoFlows    0.330311
		volcanoRadius   0.154898
		volcanoTemp     1537.82
		lavaCoverTidal  0
		lavaCoverSun    0.413704
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.429, 0.341, 0.292, 0.000)
		colorDesert    (0.391, 0.320, 0.258, 0.000)
		colorLowland   (0.299, 0.247, 0.195, 0.000)
		colorUpland    (0.505, 0.436, 0.362, 0.000)
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
		SemiMajorAxis   0.104212
		Period          0.0232436
		Eccentricity    0.0139313
		Inclination     -1.406
		AscendingNode   -123.047
		ArgOfPericenter 279.669
		MeanAnomaly     139.551
	}
}

DwarfMoon	"Ileenium System 2.D1"
{
	ParentBody     "Ileenium System 2"
	Class	       "Asteroid"

	Mass            6.76991e-007
	Radius          123.98
	InertiaMoment   0.396022

	Oblateness      0.249

	Obliquity       0.00374483
	EqAscendNode    -24.0952
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.507 0.501 0.495)

	Surface
	{
		SurfStyle       0.0539928
		OceanStyle      0.557222
		Randomize      (-0.233, 0.444, 0.318)
		colorDistMagn   0.823794
		colorDistFreq   9.46559
		detailScale     3385.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403759
		terraceProb     0.433077
		erosion         0
		montesMagn      0.605376
		montesFreq      3.29788
		montesSpiky     0.918586
		montesFraction  0.369028
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.5627
		hillsFraction   0.687248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223047
		craterFreq      0.414746
		craterDensity   0.554761
		craterOctaves   5.51998
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440732
		volcanoTemp     1643.56
		lavaCoverTidal  0
		lavaCoverSun    0.413704
		lavaCoverYoung  0
		colorSea       (0.203, 0.200, 0.198, 0.000)
		colorShelf     (0.215, 0.213, 0.210, 0.000)
		colorBeach     (0.228, 0.226, 0.223, 0.000)
		colorDesert    (0.241, 0.238, 0.235, 0.000)
		colorLowland   (0.253, 0.251, 0.247, 0.000)
		colorUpland    (0.266, 0.263, 0.260, 0.000)
		colorRock      (0.279, 0.276, 0.272, 0.000)
		colorSnow      (0.291, 0.288, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.31505e-005
		Period          0.00102951
		Eccentricity    6.78461e-005
		Inclination     0.00374483
		AscendingNode   -24.0952
		ArgOfPericenter -147.57
		MeanAnomaly     -63.152
	}
}

DwarfMoon	"Ileenium System 2.D2"
{
	ParentBody     "Ileenium System 2"
	Class	       "Asteroid"

	Mass            9.6812e-007
	Radius          71.8416
	InertiaMoment   0.398305

	Obliquity       81.0853
	EqAscendNode    133.565
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.455 0.450 0.448)

	Surface
	{
		SurfStyle       0.509607
		OceanStyle      0.150374
		Randomize      (-0.764, 0.002, 0.170)
		colorDistMagn   0.426783
		colorDistFreq   3.3972
		detailScale     1961.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.717424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57932
		terraceProb     0.533864
		erosion         0
		montesMagn      0.52448
		montesFreq      3.20306
		montesSpiky     0.940564
		montesFraction  0.778998
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.2279
		hillsFraction   0.57241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251424
		craterFreq      0.189971
		craterDensity   0.573637
		craterOctaves   5.51998
		volcanoActivity 0.991357
		volcanoFlows    0
		volcanoRadius   0.481697
		volcanoTemp     1443.99
		lavaCoverTidal  0
		lavaCoverSun    0.413704
		lavaCoverYoung  0
		colorSea       (0.177, 0.153, 0.125, 0.000)
		colorShelf     (0.182, 0.157, 0.143, 0.000)
		colorBeach     (0.214, 0.184, 0.170, 0.000)
		colorDesert    (0.232, 0.198, 0.166, 0.000)
		colorLowland   (0.255, 0.211, 0.188, 0.000)
		colorUpland    (0.282, 0.256, 0.228, 0.000)
		colorRock      (0.305, 0.279, 0.246, 0.000)
		colorSnow      (0.332, 0.297, 0.260, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.52092e-005
		Period          0.00163957
		Eccentricity    0.191946
		Inclination     81.0853
		AscendingNode   133.565
		ArgOfPericenter 3.22598
		MeanAnomaly     -178.692
	}
}

Planet	"Ileenium System 3"
{
	ParentBody     "Ileenium System"
	Class	       "Selena"

	Mass            0.0604856
	Radius          2577.29
	InertiaMoment   0.341966

	RotationPeriod  278.935
	Obliquity       -0.139172
	EqAscendNode    23.4099

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.785 0.782 0.780)

	Surface
	{
		SurfStyle       0.688736
		OceanStyle      0.829698
		Randomize      (0.782, -0.285, 0.041)
		colorDistMagn   0.0498226
		colorDistFreq   284.951
		detailScale     6628.93
		colorConversion true
		drivenDarkening 0
		seaLevel        0.169607
		snowLevel       2
		tropicLatitude  0.00475916
		icecapLatitude  10
		icecapHeight    0.152681
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.78304
		venusFreq       1.12231
		venusMagn       0
		mareFreq        1.7688
		mareDensity     0.0195273
		terraceProb     0.31305
		erosion         0
		montesMagn      0.16744
		montesFreq      123.121
		montesSpiky     0.917031
		montesFraction  0.590081
		dunesMagn       0.0426544
		dunesFreq       3400.08
		dunesFraction   0.33928
		hillsMagn       0.126272
		hillsFreq       304.583
		hillsFraction   0.641907
		hills2Fraction  0
		riversMagn      61.9213
		riversFreq      2.67688
		riversSin       4.89415
		riversOctaves   0
		canyonsMagn     0.598174
		canyonsFreq     0.96757
		canyonFraction  0.944852
		cracksMagn      0.0600444
		cracksFreq      0.956941
		cracksOctaves   0
		craterMagn      0.569789
		craterFreq      7.57527
		craterDensity   0.801893
		craterOctaves   10.3695
		craterRayedFactor 0.188467
		volcanoMagn     0.536224
		volcanoFreq     0.704664
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.444613
		volcanoRadius   0.362223
		volcanoTemp     1446.11
		lavaCoverTidal  0
		lavaCoverSun    0.15097
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.487, 0.477, 0.421, 0.000)
		colorDesert    (0.510, 0.485, 0.429, 0.000)
		colorLowland   (0.400, 0.360, 0.328, 0.000)
		colorUpland    (0.589, 0.555, 0.484, 0.000)
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
		SemiMajorAxis   0.168364
		Period          0.0477313
		Eccentricity    0.0595294
		Inclination     -0.139172
		AscendingNode   23.4099
		ArgOfPericenter 49.604
		MeanAnomaly     36.2118
	}
}

DwarfMoon	"Ileenium System 3.D1"
{
	ParentBody     "Ileenium System 3"
	Class	       "Asteroid"

	Mass            1.83647e-010
	Radius          4.00786
	InertiaMoment   0.397347

	Oblateness      0.249

	Obliquity       -0.00524133
	EqAscendNode    91.0286
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.614 0.610)

	Surface
	{
		SurfStyle       0.938648
		OceanStyle      0.0979995
		Randomize      (0.482, -0.823, -0.817)
		colorDistMagn   0.21083
		colorDistFreq   0.00522135
		detailScale     109.441
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626302
		terraceProb     0.187935
		erosion         0
		montesMagn      0.356069
		montesFreq      2.78479
		montesSpiky     0.908561
		montesFraction  0.656094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0422899
		hillsFraction   0.643872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234482
		craterFreq      0.271057
		craterDensity   0.709049
		craterOctaves   7.3367
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.619593
		volcanoTemp     1540.15
		lavaCoverTidal  0
		lavaCoverSun    0.15097
		lavaCoverYoung  0
		colorSea       (0.211, 0.215, 0.244, 0.050)
		colorShelf     (0.248, 0.252, 0.281, 0.040)
		colorBeach     (0.285, 0.288, 0.317, 0.030)
		colorDesert    (0.322, 0.325, 0.360, 0.020)
		colorLowland   (0.359, 0.362, 0.396, 0.030)
		colorUpland    (0.396, 0.399, 0.433, 0.050)
		colorRock      (0.433, 0.436, 0.482, 0.020)
		colorSnow      (0.433, 0.436, 0.482, 1.000)
		BumpHeight      3.60707
		BumpOffset      0.721414
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.84665e-005
		Period          0.000357153
		Eccentricity    8.01886e-006
		Inclination     -0.00524133
		AscendingNode   91.0286
		ArgOfPericenter -97.0347
		MeanAnomaly     94.6143
	}
}

DwarfMoon	"Ileenium System 3.D2"
{
	ParentBody     "Ileenium System 3"
	Class	       "Asteroid"

	Mass            2.85241e-010
	Radius          10.2493
	InertiaMoment   0.398758

	Oblateness      0.249

	Obliquity       0.00534252
	EqAscendNode    117.797
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.689 0.687 0.683)

	Surface
	{
		SurfStyle       0.711865
		OceanStyle      0.399151
		Randomize      (0.971, -0.268, -0.068)
		colorDistMagn   0.37368
		colorDistFreq   0.0750819
		detailScale     279.873
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384254
		terraceProb     0.196586
		erosion         0
		montesMagn      0.44603
		montesFreq      3.47805
		montesSpiky     0.789682
		montesFraction  0.402499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.259027
		hillsFraction   0.805127
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266267
		craterFreq      0.229123
		craterDensity   0.735117
		craterOctaves   8.07036
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547388
		volcanoTemp     1452.03
		lavaCoverTidal  0
		lavaCoverSun    0.15097
		lavaCoverYoung  0
		colorSea       (0.269, 0.234, 0.191, 0.000)
		colorShelf     (0.276, 0.240, 0.219, 0.000)
		colorBeach     (0.324, 0.282, 0.260, 0.000)
		colorDesert    (0.351, 0.302, 0.253, 0.000)
		colorLowland   (0.386, 0.323, 0.287, 0.000)
		colorUpland    (0.427, 0.392, 0.348, 0.000)
		colorRock      (0.462, 0.426, 0.376, 0.000)
		colorSnow      (0.503, 0.453, 0.396, 1.000)
		BumpHeight      9.22434
		BumpOffset      1.84487
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.58008e-005
		Period          0.00125516
		Eccentricity    1.83302e-005
		Inclination     0.00534252
		AscendingNode   117.797
		ArgOfPericenter -42.4176
		MeanAnomaly     -119.758
	}
}

DwarfMoon	"Ileenium System 3.D3"
{
	ParentBody     "Ileenium System 3"
	Class	       "Asteroid"

	Mass            4.3168e-010
	Radius          6.1006
	InertiaMoment   0.39971

	Oblateness      0.00726952

	Obliquity       -4.37255
	EqAscendNode    -41.8462
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.621 0.619)

	Surface
	{
		SurfStyle       0.113158
		OceanStyle      0.237729
		Randomize      (0.019, 0.679, 0.068)
		colorDistMagn   0.479359
		colorDistFreq   0.0258517
		detailScale     166.587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.142066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459235
		terraceProb     0.68646
		erosion         0
		montesMagn      0.465149
		montesFreq      2.92491
		montesSpiky     0.760006
		montesFraction  0.562045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.110907
		hillsFraction   0.703108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236937
		craterFreq      0.239656
		craterDensity   0.879077
		craterOctaves   7.3367
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543785
		volcanoTemp     1861.36
		lavaCoverTidal  0
		lavaCoverSun    0.15097
		lavaCoverYoung  0
		colorSea       (0.249, 0.248, 0.248, 0.000)
		colorShelf     (0.265, 0.264, 0.263, 0.000)
		colorBeach     (0.281, 0.280, 0.279, 0.000)
		colorDesert    (0.296, 0.295, 0.294, 0.000)
		colorLowland   (0.312, 0.311, 0.309, 0.000)
		colorUpland    (0.327, 0.326, 0.325, 0.000)
		colorRock      (0.343, 0.342, 0.340, 0.000)
		colorSnow      (0.358, 0.357, 0.356, 1.000)
		BumpHeight      5.49054
		BumpOffset      1.09811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.70438e-005
		Period          0.00224805
		Eccentricity    0.106206
		Inclination     -4.37255
		AscendingNode   -41.8462
		ArgOfPericenter 115.492
		MeanAnomaly     -140.869
	}
}

Planet	"Ileenium System 4"
{
	ParentBody     "Ileenium System"
	Class	       "Desert"

	Mass            0.29486
	Radius          4847.35
	InertiaMoment   0.326066

	Obliquity       -1.37093
	EqAscendNode    -23.2355
	TidalLocked     true

	AlbedoBond      0.34743
	AlbedoGeom      0.416915
	Brightness      2
	Color          (0.500 0.497 0.495)

	Surface
	{
		SurfStyle       0.389197
		OceanStyle      0.439655
		Randomize      (0.900, -0.727, -0.027)
		colorDistMagn   0.0876349
		colorDistFreq   641.445
		detailScale     12467.7
		colorConversion true
		seaLevel        0.0543955
		snowLevel       2
		tropicLatitude  0.046857
		icecapLatitude  10
		icecapHeight    0.170513
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.28903
		venusFreq       1.10646
		venusMagn       0
		mareFreq        1.11812
		mareDensity     0.0526049
		terraceProb     0.148799
		erosion         0
		montesMagn      0.232934
		montesFreq      221.128
		montesSpiky     0.917333
		montesFraction  0.455712
		dunesMagn       0.0441801
		dunesFreq       46.6853
		dunesFraction   0.494662
		hillsMagn       0.101776
		hillsFreq       450.876
		hillsFraction   0
		hills2Fraction  0
		riversMagn      57.7167
		riversFreq      2.05922
		riversSin       5.88838
		riversOctaves   0
		canyonsMagn     0.01733
		canyonsFreq     116.087
		canyonFraction  0
		cracksMagn      0.118017
		cracksFreq      0.45263
		cracksOctaves   0
		craterMagn      0.614794
		craterFreq      12.495
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.703645
		volcanoFreq     0.803932
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.637521
		volcanoRadius   0.477434
		volcanoTemp     1456.68
		lavaCoverTidal  0
		lavaCoverSun    0.00396488
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.594398
		cycloneDensity  0.4418
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
		Height          15.7773
		Velocity        93.2104
		BumpHeight      5.77732
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05622
		mainOctaves     10
		Coverage        0.294859
		stripeZones     1
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          242.367
		Density         4.92572
		Pressure        7.81527
		Greenhouse      11.8041
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0847035
		Saturation      0.979571

		Composition
		{
			CO2   	90.5844
			SO2   	9.38886
			C3H8  	0.0256985
			H2S   	0.000974622
			Ar    	0.000119166
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.350375
		Period          0.143295
		Eccentricity    0.0547806
		Inclination     -1.37093
		AscendingNode   -23.2355
		ArgOfPericenter 71.7335
		MeanAnomaly     262.121
	}
}

DwarfMoon	"Ileenium System 4.D1"
{
	ParentBody     "Ileenium System 4"
	Class	       "Asteroid"

	Mass            1.14559e-008
	Radius          17.7008
	InertiaMoment   0.399155

	Oblateness      0.144208

	Obliquity       -0.0071973
	EqAscendNode    -90.2189
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.762 0.759)

	Surface
	{
		SurfStyle       0.550861
		OceanStyle      0.538813
		Randomize      (-0.556, -0.409, -0.869)
		colorDistMagn   0.866489
		colorDistFreq   0.108294
		detailScale     483.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450132
		terraceProb     0.15416
		erosion         0
		montesMagn      0.363408
		montesFreq      3.42772
		montesSpiky     0.935585
		montesFraction  0.712567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.898762
		hillsFraction   0.880493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237091
		craterFreq      0.198789
		craterDensity   1.08942
		craterOctaves   11.9098
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453447
		volcanoTemp     1266.17
		lavaCoverTidal  0
		lavaCoverSun    0.00396488
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.212, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.360, 0.312, 0.288, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.434, 0.387, 0.000)
		colorRock      (0.513, 0.472, 0.417, 0.000)
		colorSnow      (0.558, 0.503, 0.440, 1.000)
		BumpHeight      15.9307
		BumpOffset      3.18615
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.15789e-005
		Period          0.000644984
		Eccentricity    5.11532e-005
		Inclination     -0.0071973
		AscendingNode   -90.2189
		ArgOfPericenter -52.9041
		MeanAnomaly     -86.6884
	}
}

DwarfMoon	"Ileenium System 4.D2"
{
	ParentBody     "Ileenium System 4"
	Class	       "Asteroid"

	Mass            1.55983e-008
	Radius          34.3118
	InertiaMoment   0.395438

	Oblateness      0.249

	Obliquity       -0.00924107
	EqAscendNode    173.578
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.755 0.753)

	Surface
	{
		SurfStyle       0.86583
		OceanStyle      0.329329
		Randomize      (-0.505, -0.247, 0.485)
		colorDistMagn   0.167563
		colorDistFreq   0.695679
		detailScale     936.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398879
		terraceProb     0.15655
		erosion         0
		montesMagn      0.486684
		montesFreq      3.76829
		montesSpiky     0.992543
		montesFraction  0.459894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.87565
		hillsFraction   0.705708
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226291
		craterFreq      0.270449
		craterDensity   0.818556
		craterOctaves   12.9023
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487904
		volcanoTemp     1738.25
		lavaCoverTidal  0
		lavaCoverSun    0.00396488
		lavaCoverYoung  0
		colorSea       (0.258, 0.264, 0.301, 0.050)
		colorShelf     (0.304, 0.310, 0.346, 0.040)
		colorBeach     (0.349, 0.355, 0.392, 0.030)
		colorDesert    (0.395, 0.400, 0.444, 0.020)
		colorLowland   (0.440, 0.446, 0.489, 0.030)
		colorUpland    (0.486, 0.491, 0.535, 0.050)
		colorRock      (0.532, 0.536, 0.595, 0.020)
		colorSnow      (0.532, 0.536, 0.595, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.10691e-005
		Period          0.000777418
		Eccentricity    9.07647e-005
		Inclination     -0.00924107
		AscendingNode   173.578
		ArgOfPericenter -51.2776
		MeanAnomaly     63.4158
	}
}

DwarfMoon	"Ileenium System 4.D3"
{
	ParentBody     "Ileenium System 4"
	Class	       "Asteroid"

	Mass            2.11957e-008
	Radius          19.0214
	InertiaMoment   0.398216

	Oblateness      0.0312903

	Obliquity       -0.0041794
	EqAscendNode    73.4229
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.562 0.558)

	Surface
	{
		SurfStyle       0.448335
		OceanStyle      0.0637043
		Randomize      (0.247, -0.188, 0.300)
		colorDistMagn   0.481518
		colorDistFreq   0.192069
		detailScale     519.411
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555034
		terraceProb     0.180697
		erosion         0
		montesMagn      0.399642
		montesFreq      2.73128
		montesSpiky     0.960713
		montesFraction  0.596224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.29764
		hillsFraction   0.431433
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255887
		craterFreq      0.241383
		craterDensity   0.694139
		craterOctaves   11.9098
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497374
		volcanoTemp     1495.72
		lavaCoverTidal  0
		lavaCoverSun    0.00396488
		lavaCoverYoung  0
		colorSea       (0.227, 0.225, 0.223, 0.000)
		colorShelf     (0.241, 0.239, 0.237, 0.000)
		colorBeach     (0.255, 0.253, 0.251, 0.000)
		colorDesert    (0.270, 0.267, 0.265, 0.000)
		colorLowland   (0.284, 0.281, 0.279, 0.000)
		colorUpland    (0.298, 0.295, 0.293, 0.000)
		colorRock      (0.312, 0.309, 0.307, 0.000)
		colorSnow      (0.326, 0.323, 0.321, 1.000)
		BumpHeight      17.1193
		BumpOffset      3.42385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000104146
		Period          0.00113198
		Eccentricity    2.83755e-005
		Inclination     -0.0041794
		AscendingNode   73.4229
		ArgOfPericenter -149.598
		MeanAnomaly     162.283
	}
}

DwarfMoon	"Ileenium System 4.D4"
{
	ParentBody     "Ileenium System 4"
	Class	       "Asteroid"

	Mass            2.87691e-008
	Radius          26.3105
	InertiaMoment   0.39929

	RotationPeriod  178.825
	Obliquity       18.6985
	EqAscendNode    141.283

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.699 0.694)

	Surface
	{
		SurfStyle       0.152619
		OceanStyle      0.67257
		Randomize      (-0.564, -0.407, -0.553)
		colorDistMagn   0.502043
		colorDistFreq   0.358995
		detailScale     718.452
		colorConversion true
		snowLevel       2
		tropicLatitude  0.211334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536904
		terraceProb     0.383124
		erosion         0
		montesMagn      0.369254
		montesFreq      2.35242
		montesSpiky     0.921835
		montesFraction  0.666015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70462
		hillsFraction   0.629873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224641
		craterFreq      0.186761
		craterDensity   1.02289
		craterOctaves   12.9023
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449234
		volcanoTemp     1229.15
		lavaCoverTidal  0
		lavaCoverSun    0.00396488
		lavaCoverYoung  0
		colorSea       (0.281, 0.280, 0.278, 0.000)
		colorShelf     (0.299, 0.297, 0.295, 0.000)
		colorBeach     (0.316, 0.315, 0.313, 0.000)
		colorDesert    (0.334, 0.332, 0.330, 0.000)
		colorLowland   (0.351, 0.349, 0.347, 0.000)
		colorUpland    (0.369, 0.367, 0.365, 0.000)
		colorRock      (0.386, 0.384, 0.382, 0.000)
		colorSnow      (0.404, 0.402, 0.399, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000344161
		Period          0.00680007
		Eccentricity    0.320174
		Inclination     18.6985
		AscendingNode   141.283
		ArgOfPericenter -179.829
		MeanAnomaly     11.2171
	}
}

Planet	"Ileenium System 5"
{
	ParentBody     "Ileenium System"
	Class	       "Desert"

	Mass            1.4017
	Radius          6085.88
	InertiaMoment   0.328564

	Oblateness      0.00640616

	RotationPeriod  13.5615
	Obliquity       -95.8366
	EqAscendNode    -134.662

	AlbedoBond      0.387576
	AlbedoGeom      0.465091
	Brightness      2
	Color          (0.798 0.720 0.661)

	Surface
	{
		SurfStyle       0.0983783
		OceanStyle      0.3018
		Randomize      (0.899, -0.103, -0.208)
		colorDistMagn   0.0474418
		colorDistFreq   776.222
		detailScale     15653.2
		colorConversion true
		seaLevel        0.0590016
		snowLevel       2
		tropicLatitude  0.992121
		icecapLatitude  10
		icecapHeight    0.258513
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.31842
		venusFreq       1.35701
		venusMagn       0.441292
		mareFreq        1.70223
		mareDensity     0.203251
		terraceProb     0.348843
		erosion         0
		montesMagn      0.236674
		montesFreq      299.04
		montesSpiky     0.723674
		montesFraction  0.666784
		dunesMagn       0.0670068
		dunesFreq       39.1813
		dunesFraction   0.60994
		hillsMagn       0.128163
		hillsFreq       885.284
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.4781
		riversFreq      3.9256
		riversSin       5.25611
		riversOctaves   0
		canyonsMagn     0.0317711
		canyonsFreq     161.19
		canyonFraction  0
		cracksMagn      0.0904381
		cracksFreq      0.64831
		cracksOctaves   0
		craterMagn      0.798078
		craterFreq      23.4106
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.73686
		volcanoFreq     0.726208
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.714273
		volcanoRadius   0.478635
		volcanoTemp     1431.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.94798
		stripeTwist     0
		cycloneMagn     1.42487
		cycloneFreq     0.746634
		cycloneDensity  0.531605
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
		BumpHeight      16.1188
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
		Height          15.8325
		Velocity        98.7371
		BumpHeight      5.50508
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01744
		mainOctaves     10
		Coverage        0.375152
		stripeZones     1.94798
		stripeTwist     0
	}

	Clouds
	{
		Height          23.605
		Velocity        12.6962
		BumpHeight      5.4056
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01744
		mainOctaves     10
		Coverage        0.375152
		stripeZones     1.94798
		stripeTwist     0
	}

	Clouds
	{
		Height          31.3779
		Velocity        131.7
		BumpHeight      5.75619
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01744
		mainOctaves     10
		Coverage        0.375152
		stripeZones     1.94798
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          109.418
		Density         22.4021
		Pressure        33.0183
		Greenhouse      98.5824
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0484565
		Saturation      1.98456

		Composition
		{
			CO2   	69.1233
			SO2   	16.3339
			H2O   	14.4092
			N2    	0.124127
			CO    	0.00827954
			NH3   	0.000606708
			Ar    	0.000362978
			CH4   	0.000156206
			C2H4  	4.74575e-005
			C2H2  	1.61002e-005
			H2S   	1.47167e-005
			Ne    	1.22147e-005
		}
	}

	Aurora
	{
		Height      87.3483
		NorthLat    82.4543
		NorthLon    122.864
		NorthRadius 1307.56
		NorthWidth  263.897
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -88.4247
		SouthLon    299.96
		SouthRadius 2144.69
		SouthWidth  552.84
		SouthRings  3
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
		SemiMajorAxis   0.596227
		Period          0.318088
		Eccentricity    0.0874187
		Inclination     1.91393
		AscendingNode   -135.378
		ArgOfPericenter 18.9794
		MeanAnomaly     166.907
	}
}

Planet	"Ileenium System 6"
{
	ParentBody     "Ileenium System"
	Class	       "GasGiant"

	Mass            1406.24
	Radius          78126.3
	InertiaMoment   0.222571

	Oblateness      0.0229688

	RotationPeriod  8.64555
	Obliquity       -39.6563
	EqAscendNode    8.51563

	AlbedoBond      0.50426
	AlbedoGeom      0.605112
	Brightness      2

	Surface
	{
		SurfStyle       0.208846
		Randomize      (-0.929, 0.888, -0.171)
		detailScale     200945
		colorConversion true
		tropicLatitude  0.616232
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.02371
		stripeFluct     0.442155
		stripeTwist     9.46095
		cycloneMagn     11.5231
		cycloneFreq     0.950163
		cycloneDensity  0.48863
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
		BumpHeight      6.53287
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          27.0859
		Velocity        -676.757
		BumpHeight      20.5528
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.0315
		mainOctaves     12
		Coverage        0.542602
		stripeZones     7.02371
		stripeFluct     0.442155
		stripeTwist     9.46095
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          109.297
		Density         5436.92
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0489309
		Saturation      0.51134

		Composition
		{
			H2    	91.7663
			He    	7.86742
			CH4   	0.286964
			N2    	0.0381401
			NH3   	0.0253769
			O2    	0.00842666
			C2H2  	0.00305688
			Ne    	0.00122846
			C2H4  	0.00121625
			Ar    	0.000873032
			C2H6  	0.000638304
			C3H8  	0.000293959
		}
	}

	Aurora
	{
		Height      1514.14
		NorthLat    86.9962
		NorthLon    -95.9867
		NorthRadius 12942.8
		NorthWidth  5379.84
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -87.4432
		SouthLon    80.8436
		SouthRadius 21856.8
		SouthWidth  9509.77
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
		SemiMajorAxis   1.16439
		Period          0.867244
		Eccentricity    0.0868749
		Inclination     1.67575
		AscendingNode   15.224
		ArgOfPericenter 112.118
		MeanAnomaly     75.5104
	}
}

DwarfMoon	"Ileenium System 6.D1"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.69127e-011
	Radius          3.36632
	InertiaMoment   0.399871

	Oblateness      0.249

	Obliquity       0.00777304
	EqAscendNode    11.2519
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.740 0.735 0.732)

	Surface
	{
		SurfStyle       0.962707
		OceanStyle      0.796119
		Randomize      (0.554, 0.549, 0.942)
		colorDistMagn   0.842153
		colorDistFreq   0.0034324
		detailScale     91.9229
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674243
		terraceProb     0.279746
		erosion         0
		montesMagn      0.459447
		montesFreq      2.36524
		montesSpiky     0.929925
		montesFraction  0.347989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.022634
		hillsFraction   0.576784
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24264
		craterFreq      0.204957
		craterDensity   0.908877
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495557
		volcanoTemp     1745.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.257, 0.293, 0.050)
		colorShelf     (0.296, 0.301, 0.337, 0.040)
		colorBeach     (0.340, 0.345, 0.381, 0.030)
		colorDesert    (0.385, 0.389, 0.432, 0.020)
		colorLowland   (0.429, 0.433, 0.476, 0.030)
		colorUpland    (0.473, 0.477, 0.520, 0.050)
		colorRock      (0.518, 0.522, 0.578, 0.020)
		colorSnow      (0.518, 0.522, 0.578, 1.000)
		BumpHeight      3.02968
		BumpOffset      0.605937
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000918695
		Period          0.000429445
		Eccentricity    1.36832e-005
		Inclination     0.00777304
		AscendingNode   11.2519
		ArgOfPericenter 45.0147
		MeanAnomaly     -170.016
	}
}

DwarfMoon	"Ileenium System 6.D2"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            9.67513e-011
	Radius          6.64982
	InertiaMoment   0.397921

	Oblateness      0.249

	Obliquity       -0.000528059
	EqAscendNode    129.681
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.725 0.720)

	Surface
	{
		SurfStyle       0.829915
		OceanStyle      0.277647
		Randomize      (-0.625, -0.662, -0.236)
		colorDistMagn   0.0907046
		colorDistFreq   0.0368461
		detailScale     181.584
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471672
		terraceProb     0.290603
		erosion         0
		montesMagn      0.36039
		montesFreq      2.48417
		montesSpiky     0.823152
		montesFraction  0.381393
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.114821
		hillsFraction   0.662952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229239
		craterFreq      0.241777
		craterDensity   0.971826
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544414
		volcanoTemp     1366.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.246, 0.202, 0.000)
		colorShelf     (0.291, 0.254, 0.230, 0.000)
		colorBeach     (0.342, 0.297, 0.274, 0.000)
		colorDesert    (0.371, 0.319, 0.267, 0.000)
		colorLowland   (0.407, 0.341, 0.303, 0.000)
		colorUpland    (0.451, 0.413, 0.367, 0.000)
		colorRock      (0.487, 0.449, 0.396, 0.000)
		colorSnow      (0.531, 0.478, 0.418, 1.000)
		BumpHeight      5.98483
		BumpOffset      1.19697
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00158158
		Period          0.000970034
		Eccentricity    7.99706e-005
		Inclination     -0.000528059
		AscendingNode   129.681
		ArgOfPericenter -18.1896
		MeanAnomaly     -1.36067
	}
}

DwarfMoon	"Ileenium System 6.D3"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.5722e-010
	Radius          4.06632
	InertiaMoment   0.399088

	Oblateness      0.0442844

	Obliquity       0.012295
	EqAscendNode    11.3843
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.750 0.749)

	Surface
	{
		SurfStyle       0.612034
		OceanStyle      0.388515
		Randomize      (0.625, -0.798, -0.855)
		colorDistMagn   0.865844
		colorDistFreq   0.0143477
		detailScale     111.038
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.666322
		terraceProb     0.124219
		erosion         0
		montesMagn      0.553174
		montesFreq      3.85571
		montesSpiky     0.851866
		montesFraction  0.28848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0309832
		hillsFraction   0.571309
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252726
		craterFreq      0.233015
		craterDensity   0.982488
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488526
		volcanoTemp     1254.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.255, 0.210, 0.000)
		colorShelf     (0.301, 0.263, 0.240, 0.000)
		colorBeach     (0.353, 0.308, 0.284, 0.000)
		colorDesert    (0.383, 0.330, 0.277, 0.000)
		colorLowland   (0.421, 0.353, 0.314, 0.000)
		colorUpland    (0.466, 0.428, 0.382, 0.000)
		colorRock      (0.504, 0.465, 0.412, 0.000)
		colorSnow      (0.549, 0.495, 0.434, 1.000)
		BumpHeight      3.65969
		BumpOffset      0.731937
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0017134
		Period          0.0010938
		Eccentricity    3.76082e-005
		Inclination     0.012295
		AscendingNode   11.3843
		ArgOfPericenter -164.662
		MeanAnomaly     176.703
	}
}

DwarfMoon	"Ileenium System 6.D4"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.46674e-010
	Radius          8.32979
	InertiaMoment   0.399996

	Oblateness      0.203751

	Obliquity       -0.0107715
	EqAscendNode    8.61715
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.754 0.750)

	Surface
	{
		SurfStyle       0.352621
		OceanStyle      0.232162
		Randomize      (0.719, -0.410, -0.382)
		colorDistMagn   0.308087
		colorDistFreq   0.0449906
		detailScale     227.459
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.693406
		terraceProb     0.420145
		erosion         0
		montesMagn      0.462411
		montesFreq      2.82993
		montesSpiky     0.79718
		montesFraction  0.544272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.149445
		hillsFraction   0.544422
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248156
		craterFreq      0.245834
		craterDensity   1.07524
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469372
		volcanoTemp     1584.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.302, 0.300, 0.000)
		colorShelf     (0.322, 0.320, 0.319, 0.000)
		colorBeach     (0.341, 0.339, 0.338, 0.000)
		colorDesert    (0.360, 0.358, 0.356, 0.000)
		colorLowland   (0.379, 0.377, 0.375, 0.000)
		colorUpland    (0.398, 0.396, 0.394, 0.000)
		colorRock      (0.417, 0.415, 0.413, 0.000)
		colorSnow      (0.436, 0.433, 0.431, 1.000)
		BumpHeight      7.49681
		BumpOffset      1.49936
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00181814
		Period          0.00119562
		Eccentricity    9.17863e-005
		Inclination     -0.0107715
		AscendingNode   8.61715
		ArgOfPericenter -7.22334
		MeanAnomaly     67.5669
	}
}

DwarfMoon	"Ileenium System 6.D5"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.76367e-010
	Radius          6.44292
	InertiaMoment   0.398124

	Oblateness      0.0201081

	Obliquity       0.0806894
	EqAscendNode    -14.7872
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.395 0.345)

	Surface
	{
		SurfStyle       0.609464
		OceanStyle      0.649043
		Randomize      (0.104, -0.674, -0.094)
		colorDistMagn   0.173954
		colorDistFreq   0.027702
		detailScale     175.935
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00278363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452249
		terraceProb     0.710189
		erosion         0
		montesMagn      0.402017
		montesFreq      3.3039
		montesSpiky     0.783647
		montesFraction  0.537456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.101761
		hillsFraction   0.607849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216611
		craterFreq      0.204729
		craterDensity   0.890793
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536261
		volcanoTemp     1339.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.134, 0.097, 0.000)
		colorShelf     (0.191, 0.138, 0.110, 0.000)
		colorBeach     (0.224, 0.162, 0.131, 0.000)
		colorDesert    (0.243, 0.174, 0.128, 0.000)
		colorLowland   (0.267, 0.186, 0.145, 0.000)
		colorUpland    (0.296, 0.225, 0.176, 0.000)
		colorRock      (0.319, 0.245, 0.190, 0.000)
		colorSnow      (0.348, 0.261, 0.200, 1.000)
		BumpHeight      5.79862
		BumpOffset      1.15973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00263718
		Period          0.00208863
		Eccentricity    0.0193686
		Inclination     0.0806894
		AscendingNode   -14.7872
		ArgOfPericenter -27.445
		MeanAnomaly     43.5172
	}
}

Moon	"Ileenium System 6.1"
{
	ParentBody     "Ileenium System 6"
	Class	       "Selena"

	Mass            0.0119673
	Radius          1522.83
	InertiaMoment   0.373079

	Oblateness      0.00296355

	Obliquity       -0.514907
	EqAscendNode    109.68
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.792 0.751 0.716)

	Surface
	{
		SurfStyle       0.641736
		OceanStyle      0.513925
		Randomize      (0.045, -0.679, 0.346)
		colorDistMagn   0.0824738
		colorDistFreq   181.911
		detailScale     3916.81
		colorConversion true
		drivenDarkening 0
		seaLevel        0.259082
		snowLevel       2
		tropicLatitude  0.0103521
		icecapLatitude  10
		icecapHeight    0.233061
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.56278
		venusFreq       1.71401
		venusMagn       0
		mareFreq        0.806465
		mareDensity     0.0065539
		terraceProb     0.373117
		erosion         0
		montesMagn      0.068491
		montesFreq      59.535
		montesSpiky     0.980918
		montesFraction  0.52949
		dunesMagn       0.0376176
		dunesFreq       2046.69
		dunesFraction   0.0645944
		hillsMagn       0.148741
		hillsFreq       147.099
		hillsFraction   0.145821
		hills2Fraction  0
		riversMagn      59.4411
		riversFreq      2.45432
		riversSin       7.95124
		riversOctaves   0
		canyonsMagn     0.449742
		canyonsFreq     0.669538
		canyonFraction  0.993424
		cracksMagn      0.0436531
		cracksFreq      0.680927
		cracksOctaves   0
		craterMagn      0.560466
		craterFreq      4.71961
		craterDensity   0.733513
		craterOctaves   8.60852
		craterRayedFactor 0.142302
		volcanoMagn     0.19605
		volcanoFreq     0.74349
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.264674
		volcanoRadius   0.160819
		volcanoTemp     1343.48
		lavaCoverTidal  0.241563
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.491, 0.458, 0.387, 0.000)
		colorDesert    (0.515, 0.465, 0.394, 0.000)
		colorLowland   (0.404, 0.345, 0.301, 0.000)
		colorUpland    (0.594, 0.533, 0.444, 0.000)
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
		SemiMajorAxis   0.00361019
		Period          0.00334536
		Eccentricity    0.0239454
		Inclination     -0.514907
		AscendingNode   109.68
		ArgOfPericenter 17.9383
		MeanAnomaly     -47.9389
	}
}

DwarfMoon	"Ileenium System 6.D6"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            8.21999e-010
	Radius          13.0976
	InertiaMoment   0.396049

	RotationPeriod  2057.31
	Obliquity       -34.9255
	EqAscendNode    11.9024

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.564 0.399)

	Surface
	{
		SurfStyle       0.273373
		OceanStyle      0.891394
		Randomize      (0.853, 0.732, 0.416)
		colorDistMagn   0.955903
		colorDistFreq   0.107448
		detailScale     357.653
		colorConversion true
		snowLevel       2
		tropicLatitude  0.936185
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682843
		terraceProb     0.234256
		erosion         0
		montesMagn      0.465089
		montesFreq      2.80369
		montesSpiky     0.987782
		montesFraction  0.48339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.392743
		hillsFraction   0.759332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242264
		craterFreq      0.155144
		craterDensity   1.05019
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55976
		volcanoTemp     1370.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.159, 0.000)
		colorShelf     (0.276, 0.239, 0.169, 0.000)
		colorBeach     (0.292, 0.254, 0.179, 0.000)
		colorDesert    (0.309, 0.268, 0.189, 0.000)
		colorLowland   (0.325, 0.282, 0.199, 0.000)
		colorUpland    (0.341, 0.296, 0.209, 0.000)
		colorRock      (0.357, 0.310, 0.219, 0.000)
		colorSnow      (0.374, 0.324, 0.229, 1.000)
		BumpHeight      11.7879
		BumpOffset      2.35758
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0185982
		Period          0.0391162
		Eccentricity    0.382483
		Inclination     -34.9255
		AscendingNode   11.9024
		ArgOfPericenter -28.2494
		MeanAnomaly     77.3163
	}
}

DwarfMoon	"Ileenium System 6.D7"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.18518e-009
	Radius          7.55839
	InertiaMoment   0.39831

	Obliquity       -58.989
	EqAscendNode    34.459
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.403 0.358)

	Surface
	{
		SurfStyle       0.899785
		OceanStyle      0.409862
		Randomize      (0.248, -0.692, -0.281)
		colorDistMagn   0.580138
		colorDistFreq   0.0300489
		detailScale     206.394
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940339
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719892
		terraceProb     0.412714
		erosion         0
		montesMagn      0.477662
		montesFreq      2.98172
		montesSpiky     0.972583
		montesFraction  0.302599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0871252
		hillsFraction   0.457635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223368
		craterFreq      0.279445
		craterDensity   0.827609
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.366003
		volcanoTemp     1367.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.155, 0.141, 0.143, 0.050)
		colorShelf     (0.183, 0.165, 0.164, 0.040)
		colorBeach     (0.210, 0.189, 0.186, 0.030)
		colorDesert    (0.238, 0.213, 0.211, 0.020)
		colorLowland   (0.265, 0.238, 0.232, 0.030)
		colorUpland    (0.292, 0.262, 0.254, 0.050)
		colorRock      (0.320, 0.286, 0.282, 0.020)
		colorSnow      (0.320, 0.286, 0.282, 1.000)
		BumpHeight      6.80255
		BumpOffset      1.36051
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0190302
		Period          0.0404871
		Eccentricity    0.481119
		Inclination     -58.989
		AscendingNode   34.459
		ArgOfPericenter 177.672
		MeanAnomaly     -174.986
	}
}

DwarfMoon	"Ileenium System 6.D8"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.68707e-009
	Radius          18.9741
	InertiaMoment   0.399358

	Obliquity       -8.65585
	EqAscendNode    0.572923
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.481 0.479)

	Surface
	{
		SurfStyle       0.290277
		OceanStyle      0.545626
		Randomize      (0.139, -0.379, 0.859)
		colorDistMagn   0.413541
		colorDistFreq   0.304724
		detailScale     518.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.297566
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717384
		terraceProb     0.392811
		erosion         0
		montesMagn      0.484367
		montesFreq      2.82079
		montesSpiky     0.965912
		montesFraction  0.854802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.938937
		hillsFraction   0.699508
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24333
		craterFreq      0.238277
		craterDensity   0.940087
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.619327
		volcanoTemp     1263.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.192, 0.000)
		colorShelf     (0.206, 0.204, 0.204, 0.000)
		colorBeach     (0.218, 0.216, 0.216, 0.000)
		colorDesert    (0.230, 0.229, 0.228, 0.000)
		colorLowland   (0.242, 0.241, 0.240, 0.000)
		colorUpland    (0.254, 0.253, 0.252, 0.000)
		colorRock      (0.266, 0.265, 0.264, 0.000)
		colorSnow      (0.279, 0.277, 0.276, 1.000)
		BumpHeight      17.0767
		BumpOffset      3.41534
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0193851
		Period          0.0416249
		Eccentricity    0.244275
		Inclination     -8.65585
		AscendingNode   0.572923
		ArgOfPericenter 101.65
		MeanAnomaly     89.9712
	}
}

DwarfMoon	"Ileenium System 6.D9"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.37592e-009
	Radius          10.9065
	InertiaMoment   0.396691

	Obliquity       1.89841
	EqAscendNode    179.036
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.568 0.565)

	Surface
	{
		SurfStyle       0.411943
		OceanStyle      0.63031
		Randomize      (-0.963, 0.538, -0.819)
		colorDistMagn   0.664361
		colorDistFreq   0.0994433
		detailScale     297.821
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00059802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590769
		terraceProb     0.238435
		erosion         0
		montesMagn      0.589314
		montesFreq      3.14436
		montesSpiky     0.874957
		montesFraction  0.672831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.26658
		hillsFraction   0.463211
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275792
		craterFreq      0.193654
		craterDensity   0.857054
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566822
		volcanoTemp     1483.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.227, 0.226, 0.000)
		colorShelf     (0.244, 0.242, 0.240, 0.000)
		colorBeach     (0.258, 0.256, 0.254, 0.000)
		colorDesert    (0.273, 0.270, 0.268, 0.000)
		colorLowland   (0.287, 0.284, 0.283, 0.000)
		colorUpland    (0.301, 0.298, 0.297, 0.000)
		colorRock      (0.316, 0.313, 0.311, 0.000)
		colorSnow      (0.330, 0.327, 0.325, 1.000)
		BumpHeight      9.81588
		BumpOffset      1.96318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0196501
		Period          0.0424814
		Eccentricity    0.0181527
		Inclination     1.89841
		AscendingNode   179.036
		ArgOfPericenter -136.526
		MeanAnomaly     98.1939
	}
}

DwarfMoon	"Ileenium System 6.D10"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.3163e-009
	Radius          11.4229
	InertiaMoment   0.398483

	Obliquity       42.3706
	EqAscendNode    49.8937
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.520 0.516 0.511)

	Surface
	{
		SurfStyle       0.55875
		OceanStyle      0.522212
		Randomize      (0.068, -0.710, -0.452)
		colorDistMagn   0.695374
		colorDistFreq   0.0307467
		detailScale     311.922
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967402
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567107
		terraceProb     0.556604
		erosion         0
		montesMagn      0.583702
		montesFreq      3.96648
		montesSpiky     0.857423
		montesFraction  0.940372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.206982
		hillsFraction   0.533208
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249996
		craterFreq      0.267885
		craterDensity   0.858808
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501423
		volcanoTemp     1563.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.175, 0.143, 0.000)
		colorShelf     (0.208, 0.181, 0.163, 0.000)
		colorBeach     (0.245, 0.212, 0.194, 0.000)
		colorDesert    (0.265, 0.227, 0.189, 0.000)
		colorLowland   (0.291, 0.243, 0.214, 0.000)
		colorUpland    (0.323, 0.294, 0.260, 0.000)
		colorRock      (0.349, 0.320, 0.281, 0.000)
		colorSnow      (0.380, 0.341, 0.296, 1.000)
		BumpHeight      10.2806
		BumpOffset      2.05613
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0200017
		Period          0.0436267
		Eccentricity    0.00284897
		Inclination     42.3706
		AscendingNode   49.8937
		ArgOfPericenter -27.1441
		MeanAnomaly     -91.0208
	}
}

DwarfMoon	"Ileenium System 6.D11"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            4.59472e-009
	Radius          22.4171
	InertiaMoment   0.399488

	Obliquity       58.1214
	EqAscendNode    -59.1005
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.563 0.508)

	Surface
	{
		SurfStyle       0.476111
		OceanStyle      0.351403
		Randomize      (-0.818, 0.496, 0.484)
		colorDistMagn   0.347011
		colorDistFreq   0.113876
		detailScale     612.136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995815
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681282
		terraceProb     0.346822
		erosion         0
		montesMagn      0.315452
		montesFreq      3.27815
		montesSpiky     0.83866
		montesFraction  0.787339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.22994
		hillsFraction   0.754412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252142
		craterFreq      0.239689
		craterDensity   0.989359
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504025
		volcanoTemp     1171
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.225, 0.203, 0.000)
		colorShelf     (0.268, 0.239, 0.216, 0.000)
		colorBeach     (0.284, 0.253, 0.229, 0.000)
		colorDesert    (0.300, 0.267, 0.241, 0.000)
		colorLowland   (0.316, 0.281, 0.254, 0.000)
		colorUpland    (0.332, 0.295, 0.267, 0.000)
		colorRock      (0.347, 0.310, 0.279, 0.000)
		colorSnow      (0.363, 0.324, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.020478
		Period          0.045194
		Eccentricity    0.0559939
		Inclination     58.1214
		AscendingNode   -59.1005
		ArgOfPericenter 103.806
		MeanAnomaly     -162.506
	}
}

DwarfMoon	"Ileenium System 6.D12"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            6.32739e-009
	Radius          17.421
	InertiaMoment   0.397106

	RotationPeriod  2459.51
	Obliquity       -7.46288
	EqAscendNode    -65.6332

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.492 0.485 0.482)

	Surface
	{
		SurfStyle       0.961051
		OceanStyle      0.456211
		Randomize      (-0.396, 0.506, -0.987)
		colorDistMagn   0.353291
		colorDistFreq   0.104099
		detailScale     475.709
		colorConversion true
		snowLevel       2
		tropicLatitude  0.217007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624858
		terraceProb     0.291144
		erosion         0
		montesMagn      0.44289
		montesFreq      3.08354
		montesSpiky     0.901067
		montesFraction  0.79394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.967437
		hillsFraction   0.734564
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246077
		craterFreq      0.232192
		craterDensity   0.93023
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492505
		volcanoTemp     1288.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.170, 0.193, 0.050)
		colorShelf     (0.197, 0.199, 0.222, 0.040)
		colorBeach     (0.226, 0.228, 0.251, 0.030)
		colorDesert    (0.256, 0.257, 0.284, 0.020)
		colorLowland   (0.285, 0.286, 0.313, 0.030)
		colorUpland    (0.315, 0.315, 0.342, 0.050)
		colorRock      (0.344, 0.344, 0.381, 0.020)
		colorSnow      (0.344, 0.344, 0.381, 1.000)
		BumpHeight      15.6789
		BumpOffset      3.13578
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0209493
		Period          0.0467632
		Eccentricity    0.41271
		Inclination     -7.46288
		AscendingNode   -65.6332
		ArgOfPericenter 34.5775
		MeanAnomaly     149.141
	}
}

DwarfMoon	"Ileenium System 6.D13"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            8.67087e-009
	Radius          30.3877
	InertiaMoment   0.398644

	Obliquity       -32.332
	EqAscendNode    -85.9841
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.407 0.403 0.402)

	Surface
	{
		SurfStyle       0.793346
		OceanStyle      0.652933
		Randomize      (-0.706, -0.548, -0.953)
		colorDistMagn   0.300197
		colorDistFreq   0.573138
		detailScale     829.786
		colorConversion true
		snowLevel       2
		tropicLatitude  0.720042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39231
		terraceProb     0.275886
		erosion         0
		montesMagn      0.563008
		montesFreq      3.64595
		montesSpiky     0.919908
		montesFraction  0.805317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10588
		hillsFraction   0.685793
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24398
		craterFreq      0.241015
		craterDensity   0.986917
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45915
		volcanoTemp     1153.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.137, 0.113, 0.000)
		colorShelf     (0.163, 0.141, 0.129, 0.000)
		colorBeach     (0.191, 0.165, 0.153, 0.000)
		colorDesert    (0.208, 0.178, 0.149, 0.000)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.021154
		Period          0.0474503
		Eccentricity    0.0511927
		Inclination     -32.332
		AscendingNode   -85.9841
		ArgOfPericenter -73.8059
		MeanAnomaly     40.1599
	}
}

DwarfMoon	"Ileenium System 6.D14"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.18369e-008
	Radius          17.6042
	InertiaMoment   0.399616

	Obliquity       10.4469
	EqAscendNode    -177.481
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.701 0.699)

	Surface
	{
		SurfStyle       0.36663
		OceanStyle      0.812141
		Randomize      (0.936, -0.537, 0.639)
		colorDistMagn   0.761182
		colorDistFreq   0.19368
		detailScale     480.713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00797104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383645
		terraceProb     0.522683
		erosion         0
		montesMagn      0.561556
		montesFreq      2.96472
		montesSpiky     0.841536
		montesFraction  0.73138
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.757122
		hillsFraction   0.691086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197727
		craterFreq      0.161113
		craterDensity   0.941175
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.587576
		volcanoTemp     1731.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.281, 0.280, 0.000)
		colorShelf     (0.300, 0.298, 0.297, 0.000)
		colorBeach     (0.317, 0.316, 0.315, 0.000)
		colorDesert    (0.335, 0.333, 0.332, 0.000)
		colorLowland   (0.353, 0.351, 0.350, 0.000)
		colorUpland    (0.370, 0.368, 0.367, 0.000)
		colorRock      (0.388, 0.386, 0.384, 0.000)
		colorSnow      (0.406, 0.403, 0.402, 1.000)
		BumpHeight      15.8438
		BumpOffset      3.16876
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0215259
		Period          0.0487071
		Eccentricity    0.14475
		Inclination     10.4469
		AscendingNode   -177.481
		ArgOfPericenter 31.6596
		MeanAnomaly     31.9204
	}
}

DwarfMoon	"Ileenium System 6.D15"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.61129e-008
	Radius          18.3851
	InertiaMoment   0.397424

	Obliquity       50.9562
	EqAscendNode    -140.796
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.730 0.727)

	Surface
	{
		SurfStyle       0.0775222
		OceanStyle      0.86567
		Randomize      (-0.840, -0.215, -0.148)
		colorDistMagn   0.644288
		colorDistFreq   0.161331
		detailScale     502.034
		colorConversion true
		snowLevel       2
		tropicLatitude  0.503122
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.283386
		terraceProb     0.124926
		erosion         0
		montesMagn      0.609427
		montesFreq      3.94217
		montesSpiky     0.933924
		montesFraction  0.783154
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.856322
		hillsFraction   0.586915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248519
		craterFreq      0.217517
		craterDensity   0.821587
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578567
		volcanoTemp     1311.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.291, 0.000)
		colorShelf     (0.312, 0.310, 0.309, 0.000)
		colorBeach     (0.330, 0.329, 0.327, 0.000)
		colorDesert    (0.348, 0.347, 0.345, 0.000)
		colorLowland   (0.367, 0.365, 0.363, 0.000)
		colorUpland    (0.385, 0.383, 0.381, 0.000)
		colorRock      (0.403, 0.402, 0.400, 0.000)
		colorSnow      (0.422, 0.420, 0.418, 1.000)
		BumpHeight      16.5465
		BumpOffset      3.30931
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0220073
		Period          0.0503502
		Eccentricity    0.399134
		Inclination     50.9562
		AscendingNode   -140.796
		ArgOfPericenter -146.48
		MeanAnomaly     -147.913
	}
}

DwarfMoon	"Ileenium System 6.D16"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.18914e-008
	Radius          32.4558
	InertiaMoment   0.398798

	Obliquity       -43.9568
	EqAscendNode    -30.9022
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.561 0.558)

	Surface
	{
		SurfStyle       0.755391
		OceanStyle      0.239322
		Randomize      (0.931, -0.733, 0.934)
		colorDistMagn   0.0260253
		colorDistFreq   0.0377026
		detailScale     886.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994493
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736795
		terraceProb     0.106683
		erosion         0
		montesMagn      0.365617
		montesFreq      3.07863
		montesSpiky     0.856069
		montesFraction  0.82359
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.44273
		hillsFraction   0.759719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252898
		craterFreq      0.246514
		craterDensity   0.926295
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473005
		volcanoTemp     991.548
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.191, 0.156, 0.000)
		colorShelf     (0.226, 0.196, 0.179, 0.000)
		colorBeach     (0.265, 0.230, 0.212, 0.000)
		colorDesert    (0.288, 0.247, 0.207, 0.000)
		colorLowland   (0.316, 0.264, 0.235, 0.000)
		colorUpland    (0.350, 0.320, 0.285, 0.000)
		colorRock      (0.378, 0.348, 0.307, 0.000)
		colorSnow      (0.412, 0.370, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0225175
		Period          0.052111
		Eccentricity    0.445186
		Inclination     -43.9568
		AscendingNode   -30.9022
		ArgOfPericenter 62.5968
		MeanAnomaly     71.2229
	}
}

DwarfMoon	"Ileenium System 6.D17"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.97114e-008
	Radius          25.9083
	InertiaMoment   0.399743

	Obliquity       -64.5852
	EqAscendNode    131.42
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.558 0.556)

	Surface
	{
		SurfStyle       0.406585
		OceanStyle      0.644472
		Randomize      (-0.821, 0.352, -0.173)
		colorDistMagn   0.780255
		colorDistFreq   0.299509
		detailScale     707.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.689893
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479271
		terraceProb     0.254313
		erosion         0
		montesMagn      0.61119
		montesFreq      3.72818
		montesSpiky     0.835499
		montesFraction  0.670575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.66903
		hillsFraction   0.575197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262333
		craterFreq      0.27296
		craterDensity   1.03439
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573457
		volcanoTemp     1898.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.222, 0.000)
		colorShelf     (0.239, 0.237, 0.236, 0.000)
		colorBeach     (0.253, 0.251, 0.250, 0.000)
		colorDesert    (0.267, 0.265, 0.264, 0.000)
		colorLowland   (0.281, 0.279, 0.278, 0.000)
		colorUpland    (0.295, 0.293, 0.292, 0.000)
		colorRock      (0.309, 0.307, 0.306, 0.000)
		colorSnow      (0.324, 0.321, 0.320, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0230741
		Period          0.0540551
		Eccentricity    0.199505
		Inclination     -64.5852
		AscendingNode   131.42
		ArgOfPericenter 95.6195
		MeanAnomaly     3.29889
	}
}

DwarfMoon	"Ileenium System 6.D18"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            4.03178e-008
	Radius          26.7146
	InertiaMoment   0.397687

	Obliquity       13.0687
	EqAscendNode    5.51845
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.624 0.620)

	Surface
	{
		SurfStyle       0.755215
		OceanStyle      0.492295
		Randomize      (0.556, 0.908, -0.030)
		colorDistMagn   0.889673
		colorDistFreq   0.374559
		detailScale     729.486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.440043
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753708
		terraceProb     0.22758
		erosion         0
		montesMagn      0.399396
		montesFreq      2.88777
		montesSpiky     0.835007
		montesFraction  0.599533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85682
		hillsFraction   0.684993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262829
		craterFreq      0.254495
		craterDensity   0.941072
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526636
		volcanoTemp     1561.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.212, 0.174, 0.000)
		colorShelf     (0.252, 0.218, 0.198, 0.000)
		colorBeach     (0.296, 0.256, 0.236, 0.000)
		colorDesert    (0.321, 0.275, 0.229, 0.000)
		colorLowland   (0.353, 0.293, 0.260, 0.000)
		colorUpland    (0.390, 0.356, 0.316, 0.000)
		colorRock      (0.422, 0.387, 0.341, 0.000)
		colorSnow      (0.460, 0.412, 0.360, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0235904
		Period          0.0558795
		Eccentricity    0.209895
		Inclination     13.0687
		AscendingNode   5.51845
		ArgOfPericenter -122.31
		MeanAnomaly     -80.7942
	}
}

DwarfMoon	"Ileenium System 6.D19"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.47479e-008
	Radius          27.8843
	InertiaMoment   0.398944

	Obliquity       -0.108609
	EqAscendNode    135.516
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.509 0.390)

	Surface
	{
		SurfStyle       0.221396
		OceanStyle      0.546106
		Randomize      (0.482, 0.018, -0.427)
		colorDistMagn   0.925827
		colorDistFreq   0.459832
		detailScale     761.429
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00142357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361004
		terraceProb     0.181182
		erosion         0
		montesMagn      0.543996
		montesFreq      3.29896
		montesSpiky     0.908214
		montesFraction  0.235171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33441
		hillsFraction   0.517955
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209116
		craterFreq      0.180104
		craterDensity   1.0081
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556656
		volcanoTemp     1087.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.203, 0.156, 0.000)
		colorShelf     (0.242, 0.216, 0.166, 0.000)
		colorBeach     (0.256, 0.229, 0.175, 0.000)
		colorDesert    (0.270, 0.242, 0.185, 0.000)
		colorLowland   (0.284, 0.254, 0.195, 0.000)
		colorUpland    (0.299, 0.267, 0.205, 0.000)
		colorRock      (0.313, 0.280, 0.214, 0.000)
		colorSnow      (0.327, 0.292, 0.224, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0239814
		Period          0.0572745
		Eccentricity    0.193876
		Inclination     -0.108609
		AscendingNode   135.516
		ArgOfPericenter 148.9
		MeanAnomaly     58.8058
	}
}

DwarfMoon	"Ileenium System 6.D20"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            7.44586e-008
	Radius          28.4583
	InertiaMoment   0.399868

	RotationPeriod  2580.29
	Obliquity       -86.503
	EqAscendNode    103.305

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.793 0.791)

	Surface
	{
		SurfStyle       0.835078
		OceanStyle      0.741149
		Randomize      (0.482, 0.480, 0.550)
		colorDistMagn   0.247374
		colorDistFreq   0.535335
		detailScale     777.102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589651
		terraceProb     0.62635
		erosion         0
		montesMagn      0.615674
		montesFreq      3.45778
		montesSpiky     0.860996
		montesFraction  0.435686
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68557
		hillsFraction   0.450685
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274077
		craterFreq      0.231586
		craterDensity   0.918719
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516361
		volcanoTemp     1336.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.270, 0.221, 0.000)
		colorShelf     (0.318, 0.278, 0.253, 0.000)
		colorBeach     (0.373, 0.325, 0.300, 0.000)
		colorDesert    (0.405, 0.349, 0.292, 0.000)
		colorLowland   (0.445, 0.373, 0.332, 0.000)
		colorUpland    (0.493, 0.452, 0.403, 0.000)
		colorRock      (0.532, 0.492, 0.435, 0.000)
		colorSnow      (0.580, 0.523, 0.459, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0244252
		Period          0.0588718
		Eccentricity    0.271326
		Inclination     -86.503
		AscendingNode   103.305
		ArgOfPericenter 102.085
		MeanAnomaly     -85.0489
	}
}

DwarfMoon	"Ileenium System 6.D21"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.01516e-007
	Radius          70.1875
	InertiaMoment   0.397916

	Obliquity       -71.1266
	EqAscendNode    -21.7181
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.773 0.772 0.769)

	Surface
	{
		SurfStyle       0.191547
		OceanStyle      0.900966
		Randomize      (-0.376, -0.355, 0.357)
		colorDistMagn   0.666243
		colorDistFreq   1.15626
		detailScale     1916.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.68646
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525716
		terraceProb     0.337667
		erosion         0
		montesMagn      0.606877
		montesFreq      2.77809
		montesSpiky     0.893787
		montesFraction  0.36337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.7057
		hillsFraction   0.498535
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232677
		craterFreq      0.238564
		craterDensity   0.989543
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479066
		volcanoTemp     1719.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.309, 0.308, 0.000)
		colorShelf     (0.329, 0.328, 0.327, 0.000)
		colorBeach     (0.348, 0.347, 0.346, 0.000)
		colorDesert    (0.367, 0.367, 0.365, 0.000)
		colorLowland   (0.387, 0.386, 0.385, 0.000)
		colorUpland    (0.406, 0.405, 0.404, 0.000)
		colorRock      (0.425, 0.424, 0.423, 0.000)
		colorSnow      (0.444, 0.444, 0.442, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0249001
		Period          0.060597
		Eccentricity    0.0775904
		Inclination     -71.1266
		AscendingNode   -21.7181
		ArgOfPericenter 174.838
		MeanAnomaly     -84.6343
	}
}

DwarfMoon	"Ileenium System 6.D22"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.38879e-007
	Radius          40.7005
	InertiaMoment   0.399085

	Obliquity       -32.2841
	EqAscendNode    -105.34
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.584 0.425)

	Surface
	{
		SurfStyle       0.19685
		OceanStyle      0.0194387
		Randomize      (0.170, 0.295, 0.606)
		colorDistMagn   0.567527
		colorDistFreq   0.953066
		detailScale     1111.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.612863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699173
		terraceProb     0.309886
		erosion         0
		montesMagn      0.467387
		montesFreq      2.66433
		montesSpiky     0.905188
		montesFraction  0.55479
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.79725
		hillsFraction   0.844618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270736
		craterFreq      0.203447
		craterDensity   1.05511
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480569
		volcanoTemp     1520.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.170, 0.000)
		colorShelf     (0.287, 0.248, 0.181, 0.000)
		colorBeach     (0.304, 0.263, 0.191, 0.000)
		colorDesert    (0.321, 0.277, 0.202, 0.000)
		colorLowland   (0.338, 0.292, 0.213, 0.000)
		colorUpland    (0.355, 0.307, 0.223, 0.000)
		colorRock      (0.371, 0.321, 0.234, 0.000)
		colorSnow      (0.388, 0.336, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0254027
		Period          0.062441
		Eccentricity    0.066665
		Inclination     -32.2841
		AscendingNode   -105.34
		ArgOfPericenter 131.046
		MeanAnomaly     146.614
	}
}

DwarfMoon	"Ileenium System 6.D23"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.90843e-007
	Radius          42.6428
	InertiaMoment   0.399993

	RotationPeriod  1121.86
	Obliquity       16.3441
	EqAscendNode    -177.78

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.622 0.618)

	Surface
	{
		SurfStyle       0.621584
		OceanStyle      0.171202
		Randomize      (-0.564, 0.330, -0.774)
		colorDistMagn   0.394009
		colorDistFreq   1.23746
		detailScale     1164.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0109017
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681238
		terraceProb     0.211591
		erosion         0
		montesMagn      0.601937
		montesFreq      3.43706
		montesSpiky     0.993277
		montesFraction  0.228806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.29875
		hillsFraction   0.609562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246735
		craterFreq      0.263412
		craterDensity   0.876938
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.618099
		volcanoTemp     1237.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.212, 0.173, 0.000)
		colorShelf     (0.251, 0.218, 0.198, 0.000)
		colorBeach     (0.296, 0.255, 0.235, 0.000)
		colorDesert    (0.321, 0.274, 0.229, 0.000)
		colorLowland   (0.352, 0.293, 0.259, 0.000)
		colorUpland    (0.390, 0.355, 0.315, 0.000)
		colorRock      (0.421, 0.386, 0.340, 0.000)
		colorSnow      (0.459, 0.411, 0.358, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0258213
		Period          0.0639909
		Eccentricity    0.325362
		Inclination     16.3441
		AscendingNode   -177.78
		ArgOfPericenter -81.3106
		MeanAnomaly     0.410396
	}
}

DwarfMoon	"Ileenium System 6.D24"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.63716e-007
	Radius          44.1477
	InertiaMoment   0.39812

	RotationPeriod  2874.72
	Obliquity       30.8767
	EqAscendNode    169.344

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.685 0.682)

	Surface
	{
		SurfStyle       0.718448
		OceanStyle      0.081781
		Randomize      (0.741, -0.277, -0.743)
		colorDistMagn   0.996769
		colorDistFreq   0.341815
		detailScale     1205.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0951985
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484991
		terraceProb     0.465407
		erosion         0
		montesMagn      0.485566
		montesFreq      3.5565
		montesSpiky     0.867747
		montesFraction  0.803151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47959
		hillsFraction   0.61103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235999
		craterFreq      0.276287
		craterDensity   0.834252
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.442061
		volcanoTemp     1660.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.233, 0.191, 0.000)
		colorShelf     (0.275, 0.240, 0.218, 0.000)
		colorBeach     (0.323, 0.281, 0.259, 0.000)
		colorDesert    (0.351, 0.301, 0.252, 0.000)
		colorLowland   (0.385, 0.322, 0.286, 0.000)
		colorUpland    (0.427, 0.390, 0.348, 0.000)
		colorRock      (0.461, 0.425, 0.375, 0.000)
		colorSnow      (0.502, 0.452, 0.396, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0262496
		Period          0.0655894
		Eccentricity    0.216528
		Inclination     30.8767
		AscendingNode   169.344
		ArgOfPericenter -24.7532
		MeanAnomaly     -52.7721
	}
}

DwarfMoon	"Ileenium System 6.D25"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.66919e-007
	Radius          61.571
	InertiaMoment   0.399222

	RotationPeriod  1167.14
	Obliquity       41.2369
	EqAscendNode    -169.525

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.475 0.469)

	Surface
	{
		SurfStyle       0.376788
		OceanStyle      0.461389
		Randomize      (-0.855, 0.664, -0.498)
		colorDistMagn   0.71665
		colorDistFreq   2.06574
		detailScale     1681.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.120131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49918
		terraceProb     0.98404
		erosion         0
		montesMagn      0.24814
		montesFreq      3.4986
		montesSpiky     0.862531
		montesFraction  0.529286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.17779
		hillsFraction   0.701869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262322
		craterFreq      0.190229
		craterDensity   0.852543
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496716
		volcanoTemp     1269.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.190, 0.188, 0.000)
		colorShelf     (0.204, 0.202, 0.199, 0.000)
		colorBeach     (0.216, 0.214, 0.211, 0.000)
		colorDesert    (0.228, 0.226, 0.223, 0.000)
		colorLowland   (0.240, 0.238, 0.234, 0.000)
		colorUpland    (0.252, 0.250, 0.246, 0.000)
		colorRock      (0.264, 0.261, 0.258, 0.000)
		colorSnow      (0.276, 0.273, 0.270, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0265115
		Period          0.0665735
		Eccentricity    0.446242
		Inclination     41.2369
		AscendingNode   -169.525
		ArgOfPericenter 147.377
		MeanAnomaly     -99.8388
	}
}

DwarfMoon	"Ileenium System 6.D26"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.14753e-007
	Radius          115.332
	InertiaMoment   0.39603

	Obliquity       -6.36905
	EqAscendNode    154.21
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.773 0.676 0.615)

	Surface
	{
		SurfStyle       0.930866
		OceanStyle      0.631712
		Randomize      (0.030, -0.127, -0.838)
		colorDistMagn   0.386123
		colorDistFreq   5.81427
		detailScale     3149.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0494978
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505298
		terraceProb     0.478809
		erosion         0
		montesMagn      0.393648
		montesFreq      2.21215
		montesSpiky     0.964674
		montesFraction  0.271865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.9761
		hillsFraction   0.543576
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217187
		craterFreq      0.445598
		craterDensity   0.855782
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443753
		volcanoTemp     1677.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.237, 0.246, 0.050)
		colorShelf     (0.309, 0.277, 0.283, 0.040)
		colorBeach     (0.356, 0.318, 0.320, 0.030)
		colorDesert    (0.402, 0.358, 0.363, 0.020)
		colorLowland   (0.448, 0.399, 0.400, 0.030)
		colorUpland    (0.495, 0.440, 0.437, 0.050)
		colorRock      (0.541, 0.480, 0.486, 0.020)
		colorSnow      (0.541, 0.480, 0.486, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0270921
		Period          0.0687726
		Eccentricity    0.397087
		Inclination     -6.36905
		AscendingNode   154.21
		ArgOfPericenter 60.4121
		MeanAnomaly     99.437
	}
}

DwarfMoon	"Ileenium System 6.D27"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            7.29365e-007
	Radius          67.2322
	InertiaMoment   0.398306

	RotationPeriod  1227.52
	Obliquity       18.7368
	EqAscendNode    111.775

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.797 0.763 0.738)

	Surface
	{
		SurfStyle       0.0273438
		OceanStyle      0.704314
		Randomize      (0.911, -0.422, -0.486)
		colorDistMagn   0.630316
		colorDistFreq   1.88565
		detailScale     1835.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.3544
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.26127
		terraceProb     0.119794
		erosion         0
		montesMagn      0.467738
		montesFreq      3.41868
		montesSpiky     0.903175
		montesFraction  0.429589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.5789
		hillsFraction   0.771443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222596
		craterFreq      0.207998
		craterDensity   0.946766
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505271
		volcanoTemp     1284.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.305, 0.295, 0.000)
		colorShelf     (0.339, 0.324, 0.314, 0.000)
		colorBeach     (0.358, 0.343, 0.332, 0.000)
		colorDesert    (0.378, 0.362, 0.351, 0.000)
		colorLowland   (0.398, 0.381, 0.369, 0.000)
		colorUpland    (0.418, 0.400, 0.388, 0.000)
		colorRock      (0.438, 0.419, 0.406, 0.000)
		colorSnow      (0.458, 0.438, 0.425, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0274181
		Period          0.0700174
		Eccentricity    0.197745
		Inclination     18.7368
		AscendingNode   111.775
		ArgOfPericenter 84.7083
		MeanAnomaly     111.905
	}
}

DwarfMoon	"Ileenium System 6.D28"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.04583e-006
	Radius          70.8533
	InertiaMoment   0.399355

	Obliquity       -82.2434
	EqAscendNode    -103.064
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.561 0.559)

	Surface
	{
		SurfStyle       0.274351
		OceanStyle      0.795403
		Randomize      (-0.471, 0.074, -0.714)
		colorDistMagn   0.24884
		colorDistFreq   1.89789
		detailScale     1934.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592784
		terraceProb     0.29946
		erosion         0
		montesMagn      0.476669
		montesFreq      3.047
		montesSpiky     0.903495
		montesFraction  0.145321
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.88514
		hillsFraction   0.715593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27661
		craterFreq      0.199304
		craterDensity   1.01564
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46788
		volcanoTemp     1359.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.224, 0.224, 0.000)
		colorShelf     (0.240, 0.238, 0.238, 0.000)
		colorBeach     (0.254, 0.252, 0.252, 0.000)
		colorDesert    (0.268, 0.267, 0.266, 0.000)
		colorLowland   (0.282, 0.281, 0.279, 0.000)
		colorUpland    (0.296, 0.295, 0.293, 0.000)
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
		SemiMajorAxis   0.0279012
		Period          0.0718761
		Eccentricity    0.420896
		Inclination     -82.2434
		AscendingNode   -103.064
		ArgOfPericenter 118.28
		MeanAnomaly     -30.1733
	}
}

DwarfMoon	"Ileenium System 6.D29"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.52117e-006
	Radius          100.565
	InertiaMoment   0.396681

	RotationPeriod  1296.22
	Obliquity       -69.4423
	EqAscendNode    -165.379

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.718 0.716)

	Surface
	{
		SurfStyle       0.10606
		OceanStyle      0.0962432
		Randomize      (0.173, 0.852, -0.238)
		colorDistMagn   0.467927
		colorDistFreq   6.29815
		detailScale     2746.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.236584
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471719
		terraceProb     0.337999
		erosion         0
		montesMagn      0.580917
		montesFreq      3.53827
		montesSpiky     0.979684
		montesFraction  0.489814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.9597
		hillsFraction   0.791099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256668
		craterFreq      0.313801
		craterDensity   0.878605
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536788
		volcanoTemp     1611.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.287, 0.286, 0.000)
		colorShelf     (0.307, 0.305, 0.304, 0.000)
		colorBeach     (0.325, 0.323, 0.322, 0.000)
		colorDesert    (0.344, 0.341, 0.340, 0.000)
		colorLowland   (0.362, 0.359, 0.358, 0.000)
		colorUpland    (0.380, 0.377, 0.376, 0.000)
		colorRock      (0.398, 0.395, 0.394, 0.000)
		colorSnow      (0.416, 0.413, 0.411, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0284317
		Period          0.0739358
		Eccentricity    0.373467
		Inclination     -69.4423
		AscendingNode   -165.379
		ArgOfPericenter 44.8419
		MeanAnomaly     39.9244
	}
}

DwarfMoon	"Ileenium System 6.D30"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.25091e-006
	Radius          104.917
	InertiaMoment   0.398479

	Obliquity       68.2132
	EqAscendNode    145.208
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.460 0.452 0.447)

	Surface
	{
		SurfStyle       0.586935
		OceanStyle      0.420958
		Randomize      (0.534, 0.311, -0.843)
		colorDistMagn   0.448534
		colorDistFreq   1.69012
		detailScale     2864.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.533414
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69726
		terraceProb     0.261862
		erosion         0
		montesMagn      0.51003
		montesFreq      3.84568
		montesSpiky     0.971546
		montesFraction  0.124468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.4922
		hillsFraction   0.720262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265465
		craterFreq      0.44423
		craterDensity   0.916824
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481626
		volcanoTemp     1344.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.154, 0.125, 0.000)
		colorShelf     (0.184, 0.158, 0.143, 0.000)
		colorBeach     (0.216, 0.185, 0.170, 0.000)
		colorDesert    (0.235, 0.199, 0.165, 0.000)
		colorLowland   (0.258, 0.213, 0.188, 0.000)
		colorUpland    (0.285, 0.258, 0.228, 0.000)
		colorRock      (0.308, 0.280, 0.246, 0.000)
		colorSnow      (0.336, 0.299, 0.259, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0286944
		Period          0.0749627
		Eccentricity    0.166887
		Inclination     68.2132
		AscendingNode   145.208
		ArgOfPericenter -107.862
		MeanAnomaly     -0.105876
	}
}

DwarfMoon	"Ileenium System 6.D31"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.40087e-006
	Radius          209.029
	InertiaMoment   0.399485

	Obliquity       37.7127
	EqAscendNode    -111.774
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.490 0.484)

	Surface
	{
		SurfStyle       0.610114
		OceanStyle      0.915549
		Randomize      (0.100, 0.916, -0.597)
		colorDistMagn   0.555499
		colorDistFreq   35.0257
		detailScale     5707.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.644478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583499
		terraceProb     0.140245
		erosion         0
		montesMagn      0.396697
		montesFreq      3.70999
		montesSpiky     0.975485
		montesFraction  0.433398
		dunesFraction   0
		hillsMagn       0
		hillsFreq       104.056
		hillsFraction   0.682099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270085
		craterFreq      1.3836
		craterDensity   0.907214
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484323
		volcanoTemp     1587.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.167, 0.136, 0.000)
		colorShelf     (0.197, 0.171, 0.155, 0.000)
		colorBeach     (0.232, 0.201, 0.184, 0.000)
		colorDesert    (0.252, 0.215, 0.179, 0.000)
		colorLowland   (0.276, 0.230, 0.203, 0.000)
		colorUpland    (0.306, 0.279, 0.247, 0.000)
		colorRock      (0.331, 0.304, 0.266, 0.000)
		colorSnow      (0.360, 0.323, 0.281, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0293575
		Period          0.0775765
		Eccentricity    0.137408
		Inclination     37.7127
		AscendingNode   -111.774
		ArgOfPericenter 107.919
		MeanAnomaly     -142.13
	}
}

DwarfMoon	"Ileenium System 6.D32"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.27143e-006
	Radius          122.93
	InertiaMoment   0.397098

	Obliquity       -15.0733
	EqAscendNode    26.5247
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.643 0.637)

	Surface
	{
		SurfStyle       0.244428
		OceanStyle      0.338659
		Randomize      (0.927, -0.233, -0.766)
		colorDistMagn   0.230195
		colorDistFreq   8.71559
		detailScale     3356.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.489753
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503177
		terraceProb     0.307604
		erosion         0
		montesMagn      0.474571
		montesFreq      2.93331
		montesSpiky     0.989016
		montesFraction  0.882262
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.4396
		hillsFraction   0.728385
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25834
		craterFreq      0.522297
		craterDensity   0.992563
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515778
		volcanoTemp     1680.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.257, 0.255, 0.000)
		colorShelf     (0.274, 0.273, 0.271, 0.000)
		colorBeach     (0.291, 0.289, 0.287, 0.000)
		colorDesert    (0.307, 0.305, 0.303, 0.000)
		colorLowland   (0.323, 0.321, 0.319, 0.000)
		colorUpland    (0.339, 0.337, 0.335, 0.000)
		colorRock      (0.355, 0.353, 0.350, 0.000)
		colorSnow      (0.371, 0.370, 0.366, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0295642
		Period          0.0783972
		Eccentricity    0.0656979
		Inclination     -15.0733
		AscendingNode   26.5247
		ArgOfPericenter -5.01603
		MeanAnomaly     -5.58413
	}
}

DwarfMoon	"Ileenium System 6.D33"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.59657e-011
	Radius          2.24478
	InertiaMoment   0.398641

	RotationPeriod  941.574
	Obliquity       -20.2935
	EqAscendNode    29.4097

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.636 0.630 0.627)

	Surface
	{
		SurfStyle       0.214248
		OceanStyle      0.738525
		Randomize      (-0.145, 0.167, -0.257)
		colorDistMagn   0.797391
		colorDistFreq   0.00310991
		detailScale     61.2975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.632059
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321269
		terraceProb     0.200486
		erosion         0
		montesMagn      0.563376
		montesFreq      2.42571
		montesSpiky     0.963822
		montesFraction  0.566545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0108074
		hillsFraction   0.557979
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252767
		craterFreq      0.142149
		craterDensity   0.875296
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503194
		volcanoTemp     1441.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.252, 0.251, 0.000)
		colorShelf     (0.270, 0.268, 0.267, 0.000)
		colorBeach     (0.286, 0.284, 0.282, 0.000)
		colorDesert    (0.302, 0.299, 0.298, 0.000)
		colorLowland   (0.318, 0.315, 0.314, 0.000)
		colorUpland    (0.334, 0.331, 0.329, 0.000)
		colorRock      (0.350, 0.347, 0.345, 0.000)
		colorSnow      (0.366, 0.362, 0.361, 1.000)
		BumpHeight      2.0203
		BumpOffset      0.40406
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0301057
		Period          0.0805607
		Eccentricity    0.201492
		Inclination     -20.2935
		AscendingNode   29.4097
		ArgOfPericenter -93.0798
		MeanAnomaly     148.149
	}
}

DwarfMoon	"Ileenium System 6.D34"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.13532e-011
	Radius          4.59612
	InertiaMoment   0.399613

	Obliquity       -79.8862
	EqAscendNode    101.432
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.603 0.600)

	Surface
	{
		SurfStyle       0.407049
		OceanStyle      0.687275
		Randomize      (-0.371, 0.216, 0.225)
		colorDistMagn   0.778298
		colorDistFreq   0.00512153
		detailScale     125.505
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974833
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571413
		terraceProb     0.382256
		erosion         0
		montesMagn      0.367352
		montesFreq      2.81638
		montesSpiky     0.986838
		montesFraction  0.710737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0528392
		hillsFraction   0.619583
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230408
		craterFreq      0.187811
		craterDensity   1.07624
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.578505
		volcanoTemp     1538.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.241, 0.240, 0.000)
		colorShelf     (0.258, 0.256, 0.255, 0.000)
		colorBeach     (0.273, 0.271, 0.270, 0.000)
		colorDesert    (0.288, 0.286, 0.285, 0.000)
		colorLowland   (0.303, 0.301, 0.300, 0.000)
		colorUpland    (0.318, 0.316, 0.315, 0.000)
		colorRock      (0.333, 0.332, 0.330, 0.000)
		colorSnow      (0.349, 0.347, 0.345, 1.000)
		BumpHeight      4.1365
		BumpOffset      0.827301
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0305523
		Period          0.08236
		Eccentricity    0.0532888
		Inclination     -79.8862
		AscendingNode   101.432
		ArgOfPericenter -4.88
		MeanAnomaly     -87.5381
	}
}

DwarfMoon	"Ileenium System 6.D35"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.66299e-011
	Radius          2.91609
	InertiaMoment   0.397418

	Obliquity       27.9417
	EqAscendNode    66.5228
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.730 0.728)

	Surface
	{
		SurfStyle       0.663777
		OceanStyle      0.578847
		Randomize      (0.698, -0.210, 0.768)
		colorDistMagn   0.363575
		colorDistFreq   0.00177858
		detailScale     79.6286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.720967
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564597
		terraceProb     0.225024
		erosion         0
		montesMagn      0.506439
		montesFreq      4.09621
		montesSpiky     0.975137
		montesFraction  0.0908528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0184974
		hillsFraction   0.651295
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246678
		craterFreq      0.246317
		craterDensity   0.793673
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473278
		volcanoTemp     1661.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.248, 0.204, 0.000)
		colorShelf     (0.293, 0.256, 0.233, 0.000)
		colorBeach     (0.345, 0.299, 0.277, 0.000)
		colorDesert    (0.374, 0.321, 0.270, 0.000)
		colorLowland   (0.411, 0.343, 0.306, 0.000)
		colorUpland    (0.455, 0.416, 0.372, 0.000)
		colorRock      (0.491, 0.453, 0.401, 0.000)
		colorSnow      (0.535, 0.482, 0.423, 1.000)
		BumpHeight      2.62448
		BumpOffset      0.524896
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0308272
		Period          0.0834741
		Eccentricity    0.414628
		Inclination     27.9417
		AscendingNode   66.5228
		ArgOfPericenter 141.128
		MeanAnomaly     142.113
	}
}

DwarfMoon	"Ileenium System 6.D36"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            9.6315e-011
	Radius          6.13469
	InertiaMoment   0.398794

	Obliquity       -48.7844
	EqAscendNode    -135.3
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.590 0.551)

	Surface
	{
		SurfStyle       0.746836
		OceanStyle      0.857804
		Randomize      (-0.818, -0.322, 0.279)
		colorDistMagn   0.777503
		colorDistFreq   0.0223984
		detailScale     167.518
		colorConversion true
		snowLevel       2
		tropicLatitude  0.548193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521403
		terraceProb     0.401805
		erosion         0
		montesMagn      0.425928
		montesFreq      2.83432
		montesSpiky     0.893829
		montesFraction  0.576827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0885849
		hillsFraction   0.559085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274139
		craterFreq      0.272955
		craterDensity   1.09509
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507025
		volcanoTemp     1328.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.201, 0.154, 0.000)
		colorShelf     (0.257, 0.206, 0.176, 0.000)
		colorBeach     (0.302, 0.242, 0.209, 0.000)
		colorDesert    (0.328, 0.259, 0.204, 0.000)
		colorLowland   (0.360, 0.277, 0.231, 0.000)
		colorUpland    (0.399, 0.336, 0.281, 0.000)
		colorRock      (0.431, 0.366, 0.303, 0.000)
		colorSnow      (0.470, 0.389, 0.320, 1.000)
		BumpHeight      5.52122
		BumpOffset      1.10424
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0312751
		Period          0.0853
		Eccentricity    0.294249
		Inclination     -48.7844
		AscendingNode   -135.3
		ArgOfPericenter 86.8469
		MeanAnomaly     107.429
	}
}

DwarfMoon	"Ileenium System 6.D37"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.56566e-010
	Radius          4.91851
	InertiaMoment   0.39974

	Obliquity       31.0597
	EqAscendNode    -29.0703
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.706 0.658)

	Surface
	{
		SurfStyle       0.543355
		OceanStyle      0.435202
		Randomize      (0.998, 0.246, -0.601)
		colorDistMagn   0.582222
		colorDistFreq   0.0180788
		detailScale     134.308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.865352
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314758
		terraceProb     0.128316
		erosion         0
		montesMagn      0.680616
		montesFreq      2.46709
		montesSpiky     0.943588
		montesFraction  0.64842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0510302
		hillsFraction   0.445859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217433
		craterFreq      0.225172
		craterDensity   0.955643
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524086
		volcanoTemp     1260.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.240, 0.184, 0.000)
		colorShelf     (0.295, 0.247, 0.211, 0.000)
		colorBeach     (0.347, 0.290, 0.250, 0.000)
		colorDesert    (0.376, 0.311, 0.243, 0.000)
		colorLowland   (0.413, 0.332, 0.276, 0.000)
		colorUpland    (0.458, 0.403, 0.336, 0.000)
		colorRock      (0.495, 0.438, 0.362, 0.000)
		colorSnow      (0.539, 0.466, 0.382, 1.000)
		BumpHeight      4.42666
		BumpOffset      0.885333
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0317937
		Period          0.0874302
		Eccentricity    0.438222
		Inclination     31.0597
		AscendingNode   -29.0703
		ArgOfPericenter 148.048
		MeanAnomaly     -176.968
	}
}

DwarfMoon	"Ileenium System 6.D38"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.45716e-010
	Radius          5.11682
	InertiaMoment   0.397682

	Obliquity       72.7284
	EqAscendNode    -55.3463
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.719 0.717)

	Surface
	{
		SurfStyle       0.644269
		OceanStyle      0.0914224
		Randomize      (-0.958, -0.757, 0.970)
		colorDistMagn   0.436471
		colorDistFreq   0.0118126
		detailScale     139.723
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257688
		terraceProb     0.347356
		erosion         0
		montesMagn      0.444112
		montesFreq      2.71015
		montesSpiky     0.989003
		montesFraction  0.71547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0658645
		hillsFraction   0.499685
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237113
		craterFreq      0.167146
		craterDensity   0.934366
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483094
		volcanoTemp     1733.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.201, 0.000)
		colorShelf     (0.289, 0.252, 0.229, 0.000)
		colorBeach     (0.339, 0.295, 0.273, 0.000)
		colorDesert    (0.368, 0.316, 0.265, 0.000)
		colorLowland   (0.404, 0.338, 0.301, 0.000)
		colorUpland    (0.447, 0.410, 0.366, 0.000)
		colorRock      (0.484, 0.446, 0.394, 0.000)
		colorSnow      (0.527, 0.474, 0.416, 1.000)
		BumpHeight      4.60514
		BumpOffset      0.921028
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.032428
		Period          0.0900599
		Eccentricity    0.0309318
		Inclination     72.7283
		AscendingNode   -55.3463
		ArgOfPericenter -149.695
		MeanAnomaly     170.431
	}
}

DwarfMoon	"Ileenium System 6.D39"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.74991e-010
	Radius          10.1367
	InertiaMoment   0.398941

	Obliquity       -22.1246
	EqAscendNode    111.885
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.546 0.542)

	Surface
	{
		SurfStyle       0.63401
		OceanStyle      0.447384
		Randomize      (-0.504, 0.139, 0.719)
		colorDistMagn   0.855363
		colorDistFreq   0.0539477
		detailScale     276.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.412344
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697154
		terraceProb     0.236746
		erosion         0
		montesMagn      0.499952
		montesFreq      2.21621
		montesSpiky     0.917209
		montesFraction  0.443868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.212785
		hillsFraction   0.66981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201633
		craterFreq      0.184317
		craterDensity   1.06738
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530968
		volcanoTemp     1564.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.152, 0.000)
		colorShelf     (0.222, 0.191, 0.174, 0.000)
		colorBeach     (0.261, 0.224, 0.206, 0.000)
		colorDesert    (0.283, 0.240, 0.201, 0.000)
		colorLowland   (0.311, 0.257, 0.228, 0.000)
		colorUpland    (0.344, 0.311, 0.277, 0.000)
		colorRock      (0.371, 0.338, 0.298, 0.000)
		colorSnow      (0.405, 0.360, 0.315, 1.000)
		BumpHeight      9.12305
		BumpOffset      1.82461
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0329664
		Period          0.0923121
		Eccentricity    0.0922318
		Inclination     -22.1246
		AscendingNode   111.885
		ArgOfPericenter 54.2699
		MeanAnomaly     -67.8767
	}
}

Moon	"Ileenium System 6.2"
{
	ParentBody     "Ileenium System 6"
	Class	       "Desert"

	Mass            0.119446
	Radius          3646.27
	InertiaMoment   0.327686

	Obliquity       -76.04
	EqAscendNode    99.1158
	TidalLocked     true

	AlbedoBond      0.348781
	AlbedoGeom      0.418537
	Brightness      2
	Color          (0.509 0.502 0.496)

	Surface
	{
		SurfStyle       0.464538
		OceanStyle      0.355266
		Randomize      (-0.618, -0.215, 0.116)
		colorDistMagn   0.0905187
		colorDistFreq   506.757
		detailScale     9378.41
		colorConversion true
		seaLevel        0.0844426
		snowLevel       0.85
		tropicLatitude  0.978254
		icecapLatitude  10
		icecapHeight    0.100909
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.849543
		venusFreq       0.783616
		venusMagn       0.418668
		mareFreq        2.3617
		mareDensity     0.0269512
		terraceProb     0.309474
		erosion         0
		montesMagn      0.2166
		montesFreq      222.808
		montesSpiky     0.947872
		montesFraction  0.452968
		dunesMagn       0.0505719
		dunesFreq       29.1031
		dunesFraction   0.147726
		hillsMagn       0.156886
		hillsFreq       372.37
		hillsFraction   0
		hills2Fraction  0
		riversMagn      55.5556
		riversFreq      2.64994
		riversSin       5.72889
		riversOctaves   0
		canyonsMagn     0.0588829
		canyonsFreq     108.075
		canyonFraction  0
		cracksMagn      0.0673677
		cracksFreq      0.257764
		cracksOctaves   0
		craterMagn      0.504468
		craterFreq      9.11084
		craterDensity   0.115906
		craterOctaves   1.59899
		volcanoMagn     0.742179
		volcanoFreq     0.708144
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.681689
		volcanoRadius   0.538877
		volcanoTemp     1494.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.52155
		stripeTwist     0.456676
		cycloneMagn     2.559
		cycloneFreq     0.989093
		cycloneDensity  0.320966
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
		Height          15.7375
		Velocity        79.5492
		BumpHeight      5.73748
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.09384
		mainOctaves     10
		Coverage        0.297562
		stripeZones     2.52155
		stripeTwist     0.456676
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          126.181
		Density         0.63469
		Pressure        0.398338
		Greenhouse      1.3444
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0494376
		Saturation      1

		Composition
		{
			SO2   	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0334401
		Period          0.0943049
		Eccentricity    0.23604
		Inclination     -76.04
		AscendingNode   99.1158
		ArgOfPericenter 93.6309
		MeanAnomaly     17.3909
	}
}

DwarfMoon	"Ileenium System 6.D40"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            8.19263e-010
	Radius          15.3743
	InertiaMoment   0.397911

	RotationPeriod  3385.93
	Obliquity       -41.2942
	EqAscendNode    -54.8799

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.459 0.455)

	Surface
	{
		SurfStyle       0.672021
		OceanStyle      0.599578
		Randomize      (-0.043, -0.120, 0.203)
		colorDistMagn   0.972489
		colorDistFreq   0.125996
		detailScale     419.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411069
		terraceProb     0.316292
		erosion         0
		montesMagn      0.396137
		montesFreq      3.51014
		montesSpiky     0.957292
		montesFraction  0.601272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.522773
		hillsFraction   0.688982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228666
		craterFreq      0.273014
		craterDensity   0.90786
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467113
		volcanoTemp     1658.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.156, 0.127, 0.000)
		colorShelf     (0.185, 0.161, 0.145, 0.000)
		colorBeach     (0.218, 0.188, 0.173, 0.000)
		colorDesert    (0.236, 0.202, 0.168, 0.000)
		colorLowland   (0.259, 0.216, 0.191, 0.000)
		colorUpland    (0.287, 0.262, 0.232, 0.000)
		colorRock      (0.310, 0.285, 0.250, 0.000)
		colorSnow      (0.338, 0.303, 0.264, 1.000)
		BumpHeight      13.8368
		BumpOffset      2.76737
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0339717
		Period          0.0965664
		Eccentricity    0.397161
		Inclination     -41.2942
		AscendingNode   -54.8799
		ArgOfPericenter -5.39756
		MeanAnomaly     46.7337
	}
}

DwarfMoon	"Ileenium System 6.D41"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.18139e-009
	Radius          8.73253
	InertiaMoment   0.399082

	Obliquity       55.1465
	EqAscendNode    -73.3435
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.547 0.542)

	Surface
	{
		SurfStyle       0.395004
		OceanStyle      0.545302
		Randomize      (-0.909, -0.815, 0.909)
		colorDistMagn   0.831783
		colorDistFreq   0.0621101
		detailScale     238.456
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382798
		terraceProb     0.224796
		erosion         0
		montesMagn      0.551439
		montesFreq      3.07325
		montesSpiky     0.857635
		montesFraction  0.662889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.229476
		hillsFraction   0.636793
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264747
		craterFreq      0.22896
		craterDensity   0.821452
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507402
		volcanoTemp     1758.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.219, 0.217, 0.000)
		colorShelf     (0.236, 0.232, 0.230, 0.000)
		colorBeach     (0.250, 0.246, 0.244, 0.000)
		colorDesert    (0.264, 0.260, 0.257, 0.000)
		colorLowland   (0.277, 0.274, 0.271, 0.000)
		colorUpland    (0.291, 0.287, 0.284, 0.000)
		colorRock      (0.305, 0.301, 0.298, 0.000)
		colorSnow      (0.319, 0.315, 0.311, 1.000)
		BumpHeight      7.85927
		BumpOffset      1.57185
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0343714
		Period          0.0982757
		Eccentricity    0.195233
		Inclination     55.1465
		AscendingNode   -73.3435
		ArgOfPericenter 105.065
		MeanAnomaly     173.344
	}
}

DwarfMoon	"Ileenium System 6.D42"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.68184e-009
	Radius          9.18247
	InertiaMoment   0.39999

	Obliquity       48.6693
	EqAscendNode    -116.16
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.584 0.579)

	Surface
	{
		SurfStyle       0.0895982
		OceanStyle      0.632727
		Randomize      (-0.149, -0.136, -0.195)
		colorDistMagn   0.0375332
		colorDistFreq   0.0432639
		detailScale     250.743
		colorConversion true
		snowLevel       2
		tropicLatitude  0.728794
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53206
		terraceProb     0.368108
		erosion         0
		montesMagn      0.465377
		montesFreq      2.47304
		montesSpiky     0.972639
		montesFraction  0.72823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.203446
		hillsFraction   0.587767
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230981
		craterFreq      0.176908
		craterDensity   0.988567
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462459
		volcanoTemp     1617.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.234, 0.232, 0.000)
		colorShelf     (0.250, 0.248, 0.246, 0.000)
		colorBeach     (0.265, 0.263, 0.261, 0.000)
		colorDesert    (0.280, 0.278, 0.275, 0.000)
		colorLowland   (0.295, 0.292, 0.290, 0.000)
		colorUpland    (0.309, 0.307, 0.304, 0.000)
		colorRock      (0.324, 0.321, 0.318, 0.000)
		colorSnow      (0.339, 0.336, 0.333, 1.000)
		BumpHeight      8.26422
		BumpOffset      1.65284
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0349075
		Period          0.100584
		Eccentricity    0.152212
		Inclination     48.6693
		AscendingNode   -116.16
		ArgOfPericenter -24.8112
		MeanAnomaly     49.9956
	}
}

DwarfMoon	"Ileenium System 6.D43"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.36877e-009
	Radius          18.0889
	InertiaMoment   0.398116

	RotationPeriod  1207.19
	Obliquity       56.9319
	EqAscendNode    -64.0382

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.658 0.655)

	Surface
	{
		SurfStyle       0.255062
		OceanStyle      0.784371
		Randomize      (-0.084, 0.354, -0.295)
		colorDistMagn   0.531668
		colorDistFreq   0.162472
		detailScale     493.949
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999953
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67678
		terraceProb     0.297765
		erosion         0
		montesMagn      0.444965
		montesFreq      3.42599
		montesSpiky     0.989209
		montesFraction  0.711255
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.80514
		hillsFraction   0.526758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193775
		craterFreq      0.227572
		craterDensity   0.874232
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.580159
		volcanoTemp     1442.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.263, 0.262, 0.000)
		colorShelf     (0.281, 0.280, 0.278, 0.000)
		colorBeach     (0.298, 0.296, 0.295, 0.000)
		colorDesert    (0.314, 0.313, 0.311, 0.000)
		colorLowland   (0.331, 0.329, 0.328, 0.000)
		colorUpland    (0.347, 0.346, 0.344, 0.000)
		colorRock      (0.364, 0.362, 0.360, 0.000)
		colorSnow      (0.381, 0.379, 0.377, 1.000)
		BumpHeight      16.28
		BumpOffset      3.25601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0355302
		Period          0.103287
		Eccentricity    0.304926
		Inclination     56.9319
		AscendingNode   -64.0382
		ArgOfPericenter -136.281
		MeanAnomaly     31.6067
	}
}

DwarfMoon	"Ileenium System 6.D44"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.30656e-009
	Radius          14.6134
	InertiaMoment   0.399219

	Obliquity       -24.8646
	EqAscendNode    -6.7888
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.791 0.789)

	Surface
	{
		SurfStyle       0.70146
		OceanStyle      0.523721
		Randomize      (0.325, 0.901, -0.866)
		colorDistMagn   0.402611
		colorDistFreq   0.147985
		detailScale     399.044
		colorConversion true
		snowLevel       2
		tropicLatitude  0.761947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327039
		terraceProb     0.187186
		erosion         0
		montesMagn      0.574677
		montesFreq      3.35215
		montesSpiky     0.893299
		montesFraction  0.552546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.492829
		hillsFraction   0.788208
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259104
		craterFreq      0.221103
		craterDensity   0.821276
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519436
		volcanoTemp     1246.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.252, 0.000)
		colorBeach     (0.372, 0.324, 0.300, 0.000)
		colorDesert    (0.404, 0.348, 0.292, 0.000)
		colorLowland   (0.444, 0.372, 0.331, 0.000)
		colorUpland    (0.491, 0.451, 0.402, 0.000)
		colorRock      (0.531, 0.491, 0.434, 0.000)
		colorSnow      (0.579, 0.522, 0.458, 1.000)
		BumpHeight      13.1521
		BumpOffset      2.63042
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.036131
		Period          0.105918
		Eccentricity    0.245222
		Inclination     -24.8646
		AscendingNode   -6.7888
		ArgOfPericenter -11.5978
		MeanAnomaly     1.68691
	}
}

DwarfMoon	"Ileenium System 6.D45"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            4.58149e-009
	Radius          24.7563
	InertiaMoment   0.39601

	RotationPeriod  631.571
	Obliquity       5.6402
	EqAscendNode    94.4408

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.653 0.649)

	Surface
	{
		SurfStyle       0.747518
		OceanStyle      0.954022
		Randomize      (-0.235, 0.883, -0.223)
		colorDistMagn   0.812456
		colorDistFreq   0.213937
		detailScale     676.011
		colorConversion true
		snowLevel       2
		tropicLatitude  0.133203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404344
		terraceProb     0.447807
		erosion         0
		montesMagn      0.541838
		montesFreq      3.09718
		montesSpiky     0.910708
		montesFraction  0.446242
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.79084
		hillsFraction   0.848859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23082
		craterFreq      0.236651
		craterDensity   1.0035
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479871
		volcanoTemp     1222.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.222, 0.182, 0.000)
		colorShelf     (0.263, 0.229, 0.208, 0.000)
		colorBeach     (0.310, 0.268, 0.246, 0.000)
		colorDesert    (0.336, 0.288, 0.240, 0.000)
		colorLowland   (0.369, 0.307, 0.272, 0.000)
		colorUpland    (0.408, 0.372, 0.331, 0.000)
		colorRock      (0.441, 0.405, 0.357, 0.000)
		colorSnow      (0.481, 0.431, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0366196
		Period          0.108074
		Eccentricity    0.329763
		Inclination     5.6402
		AscendingNode   94.4408
		ArgOfPericenter -14.3266
		MeanAnomaly     160.201
	}
}

DwarfMoon	"Ileenium System 6.D46"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            6.30949e-009
	Radius          14.3903
	InertiaMoment   0.398302

	RotationPeriod  2390.98
	Obliquity       -87.057
	EqAscendNode    -38.6234

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.814 0.756 0.694)

	Surface
	{
		SurfStyle       0.67313
		OceanStyle      0.19167
		Randomize      (-0.400, -0.971, -0.448)
		colorDistMagn   0.613353
		colorDistFreq   0.119644
		detailScale     392.952
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630031
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739477
		terraceProb     0.334372
		erosion         0
		montesMagn      0.517342
		montesFreq      3.24075
		montesSpiky     0.785485
		montesFraction  0.702789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.557373
		hillsFraction   0.724962
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262032
		craterFreq      0.189119
		craterDensity   0.923721
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54542
		volcanoTemp     1514.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.257, 0.194, 0.000)
		colorShelf     (0.326, 0.265, 0.222, 0.000)
		colorBeach     (0.383, 0.310, 0.264, 0.000)
		colorDesert    (0.415, 0.333, 0.257, 0.000)
		colorLowland   (0.456, 0.355, 0.291, 0.000)
		colorUpland    (0.505, 0.431, 0.354, 0.000)
		colorRock      (0.545, 0.469, 0.382, 0.000)
		colorSnow      (0.594, 0.499, 0.402, 1.000)
		BumpHeight      12.9513
		BumpOffset      2.59026
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0368521
		Period          0.109105
		Eccentricity    0.113038
		Inclination     -87.057
		AscendingNode   -38.6234
		ArgOfPericenter 175.691
		MeanAnomaly     -22.6354
	}
}

DwarfMoon	"Ileenium System 6.D47"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            8.64668e-009
	Radius          15.0664
	InertiaMoment   0.399352

	Obliquity       -80.7425
	EqAscendNode    5.33307
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.698 0.694)

	Surface
	{
		SurfStyle       0.376762
		OceanStyle      0.267623
		Randomize      (-0.407, -0.119, 0.538)
		colorDistMagn   0.402168
		colorDistFreq   0.149653
		detailScale     411.414
		colorConversion true
		snowLevel       2
		tropicLatitude  0.329876
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470356
		terraceProb     0.275748
		erosion         0
		montesMagn      0.482709
		montesFreq      3.25832
		montesSpiky     0.935358
		montesFraction  0.842403
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.422121
		hillsFraction   0.715077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245619
		craterFreq      0.261644
		craterDensity   0.952216
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471058
		volcanoTemp     1342.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.279, 0.278, 0.000)
		colorShelf     (0.299, 0.297, 0.295, 0.000)
		colorBeach     (0.316, 0.314, 0.312, 0.000)
		colorDesert    (0.334, 0.332, 0.330, 0.000)
		colorLowland   (0.351, 0.349, 0.347, 0.000)
		colorUpland    (0.369, 0.366, 0.364, 0.000)
		colorRock      (0.386, 0.384, 0.382, 0.000)
		colorSnow      (0.404, 0.401, 0.399, 1.000)
		BumpHeight      13.5598
		BumpOffset      2.71195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.037268
		Period          0.110957
		Eccentricity    0.172555
		Inclination     -80.7425
		AscendingNode   5.33307
		ArgOfPericenter 80.8224
		MeanAnomaly     -128.409
	}
}

DwarfMoon	"Ileenium System 6.D48"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.18042e-008
	Radius          29.0834
	InertiaMoment   0.39667

	RotationPeriod  4984.58
	Obliquity       -46.5859
	EqAscendNode    -66.6645

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.663 0.658 0.656)

	Surface
	{
		SurfStyle       0.618058
		OceanStyle      0.607647
		Randomize      (0.604, 0.981, -0.180)
		colorDistMagn   0.00780374
		colorDistFreq   0.179298
		detailScale     794.172
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964708
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314912
		terraceProb     0.639744
		erosion         0
		montesMagn      0.474099
		montesFreq      3.70579
		montesSpiky     0.882057
		montesFraction  0.603649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.18219
		hillsFraction   0.707795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215525
		craterFreq      0.203187
		craterDensity   0.715128
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465073
		volcanoTemp     1615.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.224, 0.184, 0.000)
		colorShelf     (0.265, 0.230, 0.210, 0.000)
		colorBeach     (0.311, 0.270, 0.249, 0.000)
		colorDesert    (0.338, 0.290, 0.243, 0.000)
		colorLowland   (0.371, 0.309, 0.276, 0.000)
		colorUpland    (0.411, 0.375, 0.335, 0.000)
		colorRock      (0.444, 0.408, 0.361, 0.000)
		colorSnow      (0.484, 0.434, 0.381, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0378859
		Period          0.113728
		Eccentricity    0.254019
		Inclination     -46.5859
		AscendingNode   -66.6645
		ArgOfPericenter -22.6298
		MeanAnomaly     -112.651
	}
}

DwarfMoon	"Ileenium System 6.D49"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.60687e-008
	Radius          21.374
	InertiaMoment   0.398475

	RotationPeriod  1350.06
	Obliquity       -32.5405
	EqAscendNode    25.7908

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.601 0.595)

	Surface
	{
		SurfStyle       0.690217
		OceanStyle      0.250778
		Randomize      (-0.641, -0.895, 0.246)
		colorDistMagn   0.575716
		colorDistFreq   0.140227
		detailScale     583.652
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89295
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506669
		terraceProb     0.135377
		erosion         0
		montesMagn      0.634086
		montesFreq      3.51329
		montesSpiky     0.928374
		montesFraction  0.143035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.978933
		hillsFraction   0.573344
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216198
		craterFreq      0.272533
		craterDensity   1.01352
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512922
		volcanoTemp     1829.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.204, 0.167, 0.000)
		colorShelf     (0.242, 0.210, 0.190, 0.000)
		colorBeach     (0.285, 0.246, 0.226, 0.000)
		colorDesert    (0.309, 0.264, 0.220, 0.000)
		colorLowland   (0.339, 0.282, 0.250, 0.000)
		colorUpland    (0.376, 0.343, 0.303, 0.000)
		colorRock      (0.406, 0.373, 0.327, 0.000)
		colorSnow      (0.443, 0.397, 0.345, 1.000)
		BumpHeight      19.2366
		BumpOffset      3.84732
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0382808
		Period          0.115511
		Eccentricity    0.378112
		Inclination     -32.5405
		AscendingNode   25.7908
		ArgOfPericenter -10.6763
		MeanAnomaly     -132.613
	}
}

DwarfMoon	"Ileenium System 6.D50"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.18317e-008
	Radius          39.9684
	InertiaMoment   0.399482

	RotationPeriod  6154.26
	Obliquity       -83.7606
	EqAscendNode    -88.2894

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.497 0.452)

	Surface
	{
		SurfStyle       0.21908
		OceanStyle      0.911685
		Randomize      (-0.951, -0.354, -0.802)
		colorDistMagn   0.28595
		colorDistFreq   0.948523
		detailScale     1091.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999844
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395239
		terraceProb     0.58231
		erosion         0
		montesMagn      0.666376
		montesFreq      2.70298
		montesSpiky     0.82594
		montesFraction  0.606334
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.66098
		hillsFraction   0.555727
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252193
		craterFreq      0.168761
		craterDensity   0.783693
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539351
		volcanoTemp     1547.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.199, 0.181, 0.000)
		colorShelf     (0.265, 0.211, 0.192, 0.000)
		colorBeach     (0.280, 0.224, 0.203, 0.000)
		colorDesert    (0.296, 0.236, 0.215, 0.000)
		colorLowland   (0.311, 0.248, 0.226, 0.000)
		colorUpland    (0.327, 0.261, 0.237, 0.000)
		colorRock      (0.343, 0.273, 0.249, 0.000)
		colorSnow      (0.358, 0.286, 0.260, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0386119
		Period          0.117013
		Eccentricity    0.318601
		Inclination     -83.7606
		AscendingNode   -88.2894
		ArgOfPericenter 77.844
		MeanAnomaly     41.9294
	}
}

DwarfMoon	"Ileenium System 6.D51"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.96306e-008
	Radius          22.9101
	InertiaMoment   0.39709

	Obliquity       -74.4226
	EqAscendNode    107.331
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.630 0.626)

	Surface
	{
		SurfStyle       0.264044
		OceanStyle      0.394353
		Randomize      (-0.637, -0.650, 0.268)
		colorDistMagn   0.70271
		colorDistFreq   0.281529
		detailScale     625.599
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56355
		terraceProb     0.491508
		erosion         0
		montesMagn      0.632186
		montesFreq      3.10414
		montesSpiky     0.984244
		montesFraction  0.300308
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06525
		hillsFraction   0.503132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248835
		craterFreq      0.209594
		craterDensity   0.870827
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520131
		volcanoTemp     1981.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.252, 0.250, 0.000)
		colorShelf     (0.271, 0.268, 0.266, 0.000)
		colorBeach     (0.286, 0.284, 0.282, 0.000)
		colorDesert    (0.302, 0.299, 0.297, 0.000)
		colorLowland   (0.318, 0.315, 0.313, 0.000)
		colorUpland    (0.334, 0.331, 0.329, 0.000)
		colorRock      (0.350, 0.347, 0.344, 0.000)
		colorSnow      (0.366, 0.362, 0.360, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.038921
		Period          0.118421
		Eccentricity    0.155789
		Inclination     -74.4226
		AscendingNode   107.331
		ArgOfPericenter -48.7369
		MeanAnomaly     142.949
	}
}

DwarfMoon	"Ileenium System 6.D52"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            4.0208e-008
	Radius          23.5677
	InertiaMoment   0.398637

	Obliquity       0.0493366
	EqAscendNode    13.5982
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.528 0.526)

	Surface
	{
		SurfStyle       0.403231
		OceanStyle      0.0593843
		Randomize      (0.564, 0.090, 0.748)
		colorDistMagn   0.194803
		colorDistFreq   0.449547
		detailScale     643.556
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00172633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514363
		terraceProb     0.27041
		erosion         0
		montesMagn      0.450067
		montesFreq      3.13973
		montesSpiky     0.918891
		montesFraction  0.366331
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.65666
		hillsFraction   0.687007
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247489
		craterFreq      0.243359
		craterDensity   0.845036
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512421
		volcanoTemp     1662.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.211, 0.210, 0.000)
		colorShelf     (0.227, 0.225, 0.224, 0.000)
		colorBeach     (0.240, 0.238, 0.237, 0.000)
		colorDesert    (0.254, 0.251, 0.250, 0.000)
		colorLowland   (0.267, 0.264, 0.263, 0.000)
		colorUpland    (0.280, 0.277, 0.276, 0.000)
		colorRock      (0.294, 0.291, 0.289, 0.000)
		colorSnow      (0.307, 0.304, 0.302, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0395092
		Period          0.121115
		Eccentricity    0.484687
		Inclination     0.0493366
		AscendingNode   13.5982
		ArgOfPericenter -74.6467
		MeanAnomaly     -13.286
	}
}

DwarfMoon	"Ileenium System 6.D53"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.45982e-008
	Radius          57.6326
	InertiaMoment   0.399611

	Obliquity       70.0214
	EqAscendNode    95.6189
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.678 0.651 0.605)

	Surface
	{
		SurfStyle       0.166216
		OceanStyle      0.130508
		Randomize      (0.391, -0.185, -0.129)
		colorDistMagn   0.250901
		colorDistFreq   1.15494
		detailScale     1573.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.685758
		terraceProb     0.249604
		erosion         0
		montesMagn      0.522598
		montesFreq      3.72859
		montesSpiky     0.972565
		montesFraction  0.596673
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.85435
		hillsFraction   0.666986
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199826
		craterFreq      0.246791
		craterDensity   0.851364
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590113
		volcanoTemp     1812.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.260, 0.242, 0.000)
		colorShelf     (0.288, 0.277, 0.257, 0.000)
		colorBeach     (0.305, 0.293, 0.272, 0.000)
		colorDesert    (0.322, 0.309, 0.287, 0.000)
		colorLowland   (0.339, 0.325, 0.302, 0.000)
		colorUpland    (0.356, 0.342, 0.317, 0.000)
		colorRock      (0.373, 0.358, 0.333, 0.000)
		colorSnow      (0.390, 0.374, 0.348, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0400807
		Period          0.123753
		Eccentricity    0.212514
		Inclination     70.0214
		AscendingNode   95.6189
		ArgOfPericenter -82.3001
		MeanAnomaly     97.0509
	}
}

DwarfMoon	"Ileenium System 6.D54"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            7.42538e-008
	Radius          33.3194
	InertiaMoment   0.397411

	Obliquity       -1.29241
	EqAscendNode    -101.041
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.775 0.773)

	Surface
	{
		SurfStyle       0.175996
		OceanStyle      0.314663
		Randomize      (-0.037, 0.807, 0.146)
		colorDistMagn   0.301628
		colorDistFreq   0.840095
		detailScale     909.842
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0286771
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420787
		terraceProb     0.23678
		erosion         0
		montesMagn      0.66194
		montesFreq      2.37854
		montesSpiky     0.894024
		montesFraction  0.878387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.38573
		hillsFraction   0.501712
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218283
		craterFreq      0.232616
		craterDensity   0.926486
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504771
		volcanoTemp     1612.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.330, 0.329, 0.329, 0.000)
		colorBeach     (0.350, 0.349, 0.348, 0.000)
		colorDesert    (0.369, 0.368, 0.367, 0.000)
		colorLowland   (0.388, 0.388, 0.387, 0.000)
		colorUpland    (0.408, 0.407, 0.406, 0.000)
		colorRock      (0.427, 0.426, 0.425, 0.000)
		colorSnow      (0.447, 0.446, 0.444, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0406759
		Period          0.126519
		Eccentricity    0.185727
		Inclination     -1.29241
		AscendingNode   -101.041
		ArgOfPericenter -142.011
		MeanAnomaly     -74.8907
	}
}

DwarfMoon	"Ileenium System 6.D55"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.01234e-007
	Radius          64.3968
	InertiaMoment   0.398791

	Obliquity       86.9825
	EqAscendNode    -42.8868
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.482 0.359)

	Surface
	{
		SurfStyle       0.3424
		OceanStyle      0.109904
		Randomize      (0.068, -0.821, 0.530)
		colorDistMagn   0.946436
		colorDistFreq   1.03885
		detailScale     1758.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.685685
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582514
		terraceProb     0.163644
		erosion         0
		montesMagn      0.638231
		montesFreq      2.16107
		montesSpiky     0.848005
		montesFraction  0.659758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.65589
		hillsFraction   0.639838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240927
		craterFreq      0.259256
		craterDensity   0.940559
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482027
		volcanoTemp     1425.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.143, 0.000)
		colorShelf     (0.237, 0.205, 0.152, 0.000)
		colorBeach     (0.251, 0.217, 0.161, 0.000)
		colorDesert    (0.265, 0.229, 0.170, 0.000)
		colorLowland   (0.279, 0.241, 0.179, 0.000)
		colorUpland    (0.293, 0.253, 0.188, 0.000)
		colorRock      (0.307, 0.265, 0.197, 0.000)
		colorSnow      (0.321, 0.277, 0.206, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0412119
		Period          0.129028
		Eccentricity    0.0713733
		Inclination     86.9825
		AscendingNode   -42.8868
		ArgOfPericenter 176.233
		MeanAnomaly     142.163
	}
}

DwarfMoon	"Ileenium System 6.D56"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.38489e-007
	Radius          36.0924
	InertiaMoment   0.399737

	RotationPeriod  2302.91
	Obliquity       62.3931
	EqAscendNode    57.9135

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.436 0.432 0.428)

	Surface
	{
		SurfStyle       0.393934
		OceanStyle      0.65226
		Randomize      (-0.911, -0.778, -0.595)
		colorDistMagn   0.908694
		colorDistFreq   0.852641
		detailScale     985.564
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979306
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480568
		terraceProb     0.418073
		erosion         0
		montesMagn      0.331704
		montesFreq      2.66013
		montesSpiky     0.998306
		montesFraction  0.741759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.23243
		hillsFraction   0.669417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223428
		craterFreq      0.260387
		craterDensity   1.08863
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527284
		volcanoTemp     1901.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.173, 0.171, 0.000)
		colorShelf     (0.185, 0.184, 0.182, 0.000)
		colorBeach     (0.196, 0.194, 0.193, 0.000)
		colorDesert    (0.207, 0.205, 0.204, 0.000)
		colorLowland   (0.218, 0.216, 0.214, 0.000)
		colorUpland    (0.229, 0.227, 0.225, 0.000)
		colorRock      (0.240, 0.238, 0.236, 0.000)
		colorSnow      (0.251, 0.248, 0.246, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0417064
		Period          0.131358
		Eccentricity    0.299805
		Inclination     62.3931
		AscendingNode   57.9135
		ArgOfPericenter -94.2961
		MeanAnomaly     -35.0916
	}
}

DwarfMoon	"Ileenium System 6.D57"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.90297e-007
	Radius          50.2535
	InertiaMoment   0.397677

	RotationPeriod  1949.6
	Obliquity       21.2997
	EqAscendNode    31.7124

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.485 0.479)

	Surface
	{
		SurfStyle       0.0234022
		OceanStyle      0.751378
		Randomize      (-0.272, 0.550, 0.173)
		colorDistMagn   0.760178
		colorDistFreq   0.767499
		detailScale     1372.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.654797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.721765
		terraceProb     0.366813
		erosion         0
		montesMagn      0.454183
		montesFreq      3.67262
		montesSpiky     0.794117
		montesFraction  0.570355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.09305
		hillsFraction   0.487225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.286239
		craterFreq      0.205578
		craterDensity   0.770171
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519214
		volcanoTemp     1615.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.192, 0.000)
		colorShelf     (0.208, 0.206, 0.204, 0.000)
		colorBeach     (0.220, 0.218, 0.215, 0.000)
		colorDesert    (0.233, 0.231, 0.227, 0.000)
		colorLowland   (0.245, 0.243, 0.239, 0.000)
		colorUpland    (0.257, 0.255, 0.251, 0.000)
		colorRock      (0.269, 0.267, 0.263, 0.000)
		colorSnow      (0.282, 0.279, 0.275, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0421473
		Period          0.133446
		Eccentricity    0.321263
		Inclination     21.2997
		AscendingNode   31.7124
		ArgOfPericenter 59.5817
		MeanAnomaly     123.855
	}
}

DwarfMoon	"Ileenium System 6.D58"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.62948e-007
	Radius          92.744
	InertiaMoment   0.398938

	Obliquity       -41.9851
	EqAscendNode    100.73
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.764 0.762 0.761)

	Surface
	{
		SurfStyle       0.529017
		OceanStyle      0.700955
		Randomize      (0.411, 0.959, 0.012)
		colorDistMagn   0.120578
		colorDistFreq   4.24553
		detailScale     2532.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.771824
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301751
		terraceProb     0.187813
		erosion         0
		montesMagn      0.453674
		montesFreq      3.1312
		montesSpiky     0.973695
		montesFraction  0.21859
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.0547
		hillsFraction   0.724326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252885
		craterFreq      0.336137
		craterDensity   0.981066
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545263
		volcanoTemp     1694.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.359, 0.312, 0.289, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.434, 0.388, 0.000)
		colorRock      (0.512, 0.472, 0.418, 0.000)
		colorSnow      (0.558, 0.503, 0.441, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0424766
		Period          0.135013
		Eccentricity    0.162985
		Inclination     -41.9851
		AscendingNode   100.73
		ArgOfPericenter 145.347
		MeanAnomaly     -118.929
	}
}

DwarfMoon	"Ileenium System 6.D59"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.65826e-007
	Radius          53.8416
	InertiaMoment   0.399863

	RotationPeriod  805.68
	Obliquity       -74.6496
	EqAscendNode    57.8587

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.622 0.616)

	Surface
	{
		SurfStyle       0.976552
		OceanStyle      0.942632
		Randomize      (-0.327, -0.622, 0.875)
		colorDistMagn   0.0256189
		colorDistFreq   2.12825
		detailScale     1470.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522106
		terraceProb     0.233861
		erosion         0
		montesMagn      0.420819
		montesFreq      4.17112
		montesSpiky     0.857617
		montesFraction  0.436527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.0237
		hillsFraction   0.552235
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252336
		craterFreq      0.231025
		craterDensity   0.966619
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51283
		volcanoTemp     1251.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.218, 0.247, 0.050)
		colorShelf     (0.251, 0.255, 0.284, 0.040)
		colorBeach     (0.289, 0.292, 0.320, 0.030)
		colorDesert    (0.326, 0.330, 0.364, 0.020)
		colorLowland   (0.364, 0.367, 0.401, 0.030)
		colorUpland    (0.402, 0.404, 0.438, 0.050)
		colorRock      (0.439, 0.442, 0.487, 0.020)
		colorSnow      (0.439, 0.442, 0.487, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0430732
		Period          0.137867
		Eccentricity    0.447562
		Inclination     -74.6496
		AscendingNode   57.8587
		ArgOfPericenter -58.9658
		MeanAnomaly     161.658
	}
}

DwarfMoon	"Ileenium System 6.D60"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.13178e-007
	Radius          106.251
	InertiaMoment   0.397907

	RotationPeriod  2434.37
	Obliquity       31.7486
	EqAscendNode    115.184

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.647 0.645)

	Surface
	{
		SurfStyle       0.416502
		OceanStyle      0.558697
		Randomize      (0.265, -0.926, -0.229)
		colorDistMagn   0.0958498
		colorDistFreq   7.70413
		detailScale     2901.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.541125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599624
		terraceProb     0.469631
		erosion         0
		montesMagn      0.468849
		montesFreq      2.62999
		montesSpiky     0.95238
		montesFraction  0.321821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.7438
		hillsFraction   0.475776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257343
		craterFreq      0.25909
		craterDensity   0.862789
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50038
		volcanoTemp     1651.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.259, 0.258, 0.000)
		colorShelf     (0.277, 0.275, 0.274, 0.000)
		colorBeach     (0.293, 0.291, 0.290, 0.000)
		colorDesert    (0.309, 0.307, 0.306, 0.000)
		colorLowland   (0.326, 0.323, 0.322, 0.000)
		colorUpland    (0.342, 0.340, 0.338, 0.000)
		colorRock      (0.358, 0.356, 0.355, 0.000)
		colorSnow      (0.375, 0.372, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0432789
		Period          0.138856
		Eccentricity    0.287999
		Inclination     31.7486
		AscendingNode   115.184
		ArgOfPericenter -155.191
		MeanAnomaly     164.593
	}
}

DwarfMoon	"Ileenium System 6.D61"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            7.27063e-007
	Radius          80.0826
	InertiaMoment   0.399079

	Obliquity       30.6636
	EqAscendNode    -121.423
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.797 0.797)

	Surface
	{
		SurfStyle       0.529881
		OceanStyle      0.65428
		Randomize      (0.922, -0.518, -0.530)
		colorDistMagn   0.590311
		colorDistFreq   5.31509
		detailScale     2186.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.483206
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528283
		terraceProb     0.163048
		erosion         0
		montesMagn      0.522699
		montesFreq      3.36123
		montesSpiky     0.934053
		montesFraction  0.398261
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.0445
		hillsFraction   0.897716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25769
		craterFreq      0.248664
		craterDensity   0.992108
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492817
		volcanoTemp     1362.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.271, 0.223, 0.000)
		colorShelf     (0.320, 0.279, 0.255, 0.000)
		colorBeach     (0.376, 0.327, 0.303, 0.000)
		colorDesert    (0.408, 0.351, 0.295, 0.000)
		colorLowland   (0.448, 0.375, 0.335, 0.000)
		colorUpland    (0.496, 0.454, 0.406, 0.000)
		colorRock      (0.536, 0.494, 0.438, 0.000)
		colorSnow      (0.583, 0.526, 0.462, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0438641
		Period          0.141682
		Eccentricity    0.0158217
		Inclination     30.6636
		AscendingNode   -121.423
		ArgOfPericenter -172.57
		MeanAnomaly     -164.685
	}
}

DwarfMoon	"Ileenium System 6.D62"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.04241e-006
	Radius          81.9364
	InertiaMoment   0.399988

	RotationPeriod  5027.84
	Obliquity       14.882
	EqAscendNode    -119.884

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.629 0.551)

	Surface
	{
		SurfStyle       0.143201
		OceanStyle      0.456318
		Randomize      (0.039, -0.578, 0.647)
		colorDistMagn   0.454276
		colorDistFreq   3.14953
		detailScale     2237.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.255141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570655
		terraceProb     0.259662
		erosion         0
		montesMagn      0.510213
		montesFreq      3.21187
		montesSpiky     0.905317
		montesFraction  0.148907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.4615
		hillsFraction   0.464996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214133
		craterFreq      0.250636
		craterDensity   0.94949
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537749
		volcanoTemp     1924.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.251, 0.220, 0.000)
		colorShelf     (0.290, 0.267, 0.234, 0.000)
		colorBeach     (0.307, 0.283, 0.248, 0.000)
		colorDesert    (0.324, 0.299, 0.262, 0.000)
		colorLowland   (0.341, 0.314, 0.275, 0.000)
		colorUpland    (0.358, 0.330, 0.289, 0.000)
		colorRock      (0.375, 0.346, 0.303, 0.000)
		colorSnow      (0.392, 0.362, 0.317, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0442167
		Period          0.143394
		Eccentricity    0.482902
		Inclination     14.882
		AscendingNode   -119.884
		ArgOfPericenter -55.1238
		MeanAnomaly     125.13
	}
}

DwarfMoon	"Ileenium System 6.D63"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.51599e-006
	Radius          160.535
	InertiaMoment   0.398112

	Obliquity       -72.1404
	EqAscendNode    -37.1522
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.600 0.568)

	Surface
	{
		SurfStyle       0.59966
		OceanStyle      0.652402
		Randomize      (-0.394, 0.193, -0.573)
		colorDistMagn   0.972276
		colorDistFreq   12.2672
		detailScale     4383.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.778204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614081
		terraceProb     0.162401
		erosion         0
		montesMagn      0.337133
		montesFreq      3.50604
		montesSpiky     0.846162
		montesFraction  0.620544
		dunesFraction   0
		hillsMagn       0
		hillsFreq       66.8996
		hillsFraction   0.801428
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252695
		craterFreq      0.88039
		craterDensity   1.07457
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479107
		volcanoTemp     1194.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.204, 0.159, 0.000)
		colorShelf     (0.261, 0.210, 0.182, 0.000)
		colorBeach     (0.307, 0.246, 0.216, 0.000)
		colorDesert    (0.333, 0.264, 0.210, 0.000)
		colorLowland   (0.366, 0.282, 0.239, 0.000)
		colorUpland    (0.405, 0.342, 0.290, 0.000)
		colorRock      (0.438, 0.372, 0.312, 0.000)
		colorSnow      (0.477, 0.396, 0.330, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0447312
		Period          0.145904
		Eccentricity    0.443158
		Inclination     -72.1404
		AscendingNode   -37.1522
		ArgOfPericenter 139.464
		MeanAnomaly     -177.513
	}
}

DwarfMoon	"Ileenium System 6.D64"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.24285e-006
	Radius          93.4009
	InertiaMoment   0.399216

	Obliquity       61.0538
	EqAscendNode    -74.1994
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.491 0.422 0.356)

	Surface
	{
		SurfStyle       0.187107
		OceanStyle      0.149838
		Randomize      (0.256, -0.195, 0.839)
		colorDistMagn   0.770413
		colorDistFreq   4.25825
		detailScale     2550.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.490032
		terraceProb     0.108242
		erosion         0
		montesMagn      0.550779
		montesFreq      1.97348
		montesSpiky     0.938938
		montesFraction  0.700759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.409
		hillsFraction   0.683447
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268784
		craterFreq      0.278658
		craterDensity   1.05331
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575205
		volcanoTemp     1294.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.169, 0.142, 0.000)
		colorShelf     (0.209, 0.180, 0.151, 0.000)
		colorBeach     (0.221, 0.190, 0.160, 0.000)
		colorDesert    (0.233, 0.201, 0.169, 0.000)
		colorLowland   (0.245, 0.211, 0.178, 0.000)
		colorUpland    (0.258, 0.222, 0.187, 0.000)
		colorRock      (0.270, 0.232, 0.196, 0.000)
		colorSnow      (0.282, 0.243, 0.205, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0452546
		Period          0.148472
		Eccentricity    0.489683
		Inclination     61.0538
		AscendingNode   -74.1994
		ArgOfPericenter -83.2759
		MeanAnomaly     -48.282
	}
}

DwarfMoon	"Ileenium System 6.D65"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.388e-006
	Radius          238.851
	InertiaMoment   0.39599

	Obliquity       -23.7906
	EqAscendNode    9.73646
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.479 0.347)

	Surface
	{
		SurfStyle       0.761482
		OceanStyle      0.519239
		Randomize      (0.192, 0.847, -0.689)
		colorDistMagn   0.0586289
		colorDistFreq   35.1911
		detailScale     6522.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.736085
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390982
		terraceProb     0.364898
		erosion         0
		montesMagn      0.506422
		montesFreq      3.45103
		montesSpiky     0.908777
		montesFraction  0.53424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       108.159
		hillsFraction   0.473292
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247419
		craterFreq      1.46287
		craterDensity   0.827278
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469396
		volcanoTemp     1364.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.163, 0.097, 0.000)
		colorShelf     (0.249, 0.168, 0.111, 0.000)
		colorBeach     (0.292, 0.196, 0.132, 0.000)
		colorDesert    (0.317, 0.211, 0.128, 0.000)
		colorLowland   (0.348, 0.225, 0.146, 0.000)
		colorUpland    (0.386, 0.273, 0.177, 0.000)
		colorRock      (0.417, 0.297, 0.191, 0.000)
		colorSnow      (0.454, 0.316, 0.201, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0458518
		Period          0.151421
		Eccentricity    0.465355
		Inclination     -23.7906
		AscendingNode   9.73646
		ArgOfPericenter -69.8825
		MeanAnomaly     -170.089
	}
}

DwarfMoon	"Ileenium System 6.D66"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.25016e-006
	Radius          141.915
	InertiaMoment   0.398299

	RotationPeriod  5362.65
	Obliquity       14.4933
	EqAscendNode    16.5122

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.627 0.498 0.411)

	Surface
	{
		SurfStyle       0.725008
		OceanStyle      0.894999
		Randomize      (-0.986, 0.583, -0.287)
		colorDistMagn   0.811107
		colorDistFreq   9.71506
		detailScale     3875.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.479913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637775
		terraceProb     0.218862
		erosion         0
		montesMagn      0.529838
		montesFreq      3.56938
		montesSpiky     0.719012
		montesFraction  0.662638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       52.4242
		hillsFraction   0.6108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237058
		craterFreq      0.757683
		craterDensity   0.693587
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513505
		volcanoTemp     1387.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.169, 0.115, 0.000)
		colorShelf     (0.251, 0.174, 0.132, 0.000)
		colorBeach     (0.294, 0.204, 0.156, 0.000)
		colorDesert    (0.320, 0.219, 0.152, 0.000)
		colorLowland   (0.351, 0.234, 0.173, 0.000)
		colorUpland    (0.388, 0.284, 0.210, 0.000)
		colorRock      (0.420, 0.309, 0.226, 0.000)
		colorSnow      (0.457, 0.329, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0461585
		Period          0.152942
		Eccentricity    0.218598
		Inclination     14.4933
		AscendingNode   16.5122
		ArgOfPericenter -13.562
		MeanAnomaly     172.303
	}
}

DwarfMoon	"Ileenium System 6.D67"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.58622e-011
	Radius          1.92311
	InertiaMoment   0.399349

	RotationPeriod  4107.56
	Obliquity       35.181
	EqAscendNode    -21.1249

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.526 0.523 0.518)

	Surface
	{
		SurfStyle       0.534916
		OceanStyle      0.380064
		Randomize      (0.820, 0.095, 0.344)
		colorDistMagn   0.582019
		colorDistFreq   0.00189022
		detailScale     52.5138
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933573
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545424
		terraceProb     0.522319
		erosion         0
		montesMagn      0.340193
		montesFreq      2.40009
		montesSpiky     0.959686
		montesFraction  0.369975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00986278
		hillsFraction   0.576972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.19862
		craterFreq      0.227667
		craterDensity   0.861674
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539086
		volcanoTemp     1289.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.178, 0.145, 0.000)
		colorShelf     (0.210, 0.183, 0.166, 0.000)
		colorBeach     (0.247, 0.214, 0.197, 0.000)
		colorDesert    (0.268, 0.230, 0.192, 0.000)
		colorLowland   (0.295, 0.246, 0.218, 0.000)
		colorUpland    (0.326, 0.298, 0.264, 0.000)
		colorRock      (0.352, 0.324, 0.285, 0.000)
		colorSnow      (0.384, 0.345, 0.300, 1.000)
		BumpHeight      1.7308
		BumpOffset      0.346161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0468109
		Period          0.156196
		Eccentricity    0.311036
		Inclination     35.181
		AscendingNode   -21.1249
		ArgOfPericenter 150.977
		MeanAnomaly     154.112
	}
}

DwarfMoon	"Ileenium System 6.D68"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.11778e-011
	Radius          4.24123
	InertiaMoment   0.396659

	RotationPeriod  2082.64
	Obliquity       25.4339
	EqAscendNode    12.5382

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.740 0.736)

	Surface
	{
		SurfStyle       0.244433
		OceanStyle      0.214112
		Randomize      (-0.645, -0.851, 0.847)
		colorDistMagn   0.531141
		colorDistFreq   0.00660615
		detailScale     115.814
		colorConversion true
		snowLevel       2
		tropicLatitude  0.772093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672813
		terraceProb     0.125298
		erosion         0
		montesMagn      0.439538
		montesFreq      2.68241
		montesSpiky     0.865407
		montesFraction  0.850551
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0585156
		hillsFraction   0.592575
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214104
		craterFreq      0.200143
		craterDensity   1.03375
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516667
		volcanoTemp     1601.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.295, 0.000)
		colorShelf     (0.316, 0.314, 0.313, 0.000)
		colorBeach     (0.335, 0.333, 0.331, 0.000)
		colorDesert    (0.353, 0.351, 0.350, 0.000)
		colorLowland   (0.372, 0.370, 0.368, 0.000)
		colorUpland    (0.390, 0.388, 0.387, 0.000)
		colorRock      (0.409, 0.407, 0.405, 0.000)
		colorSnow      (0.427, 0.425, 0.423, 1.000)
		BumpHeight      3.81711
		BumpOffset      0.763422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0472484
		Period          0.158391
		Eccentricity    0.306421
		Inclination     25.4339
		AscendingNode   12.5382
		ArgOfPericenter 18.3705
		MeanAnomaly     3.45349
	}
}

DwarfMoon	"Ileenium System 6.D69"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            5.63482e-011
	Radius          3.59916
	InertiaMoment   0.398472

	Obliquity       -85.2886
	EqAscendNode    -142.562
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.718 0.715 0.712)

	Surface
	{
		SurfStyle       0.814474
		OceanStyle      0.149362
		Randomize      (0.321, 0.374, 0.032)
		colorDistMagn   0.0455853
		colorDistFreq   0.00171982
		detailScale     98.2811
		colorConversion true
		snowLevel       2
		tropicLatitude  0.606087
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52103
		terraceProb     0.50745
		erosion         0
		montesMagn      0.54641
		montesFreq      2.74782
		montesSpiky     0.823683
		montesFraction  0.624402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0338168
		hillsFraction   0.522591
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221177
		craterFreq      0.247281
		craterDensity   0.717564
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553531
		volcanoTemp     1387.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.243, 0.199, 0.000)
		colorShelf     (0.287, 0.250, 0.228, 0.000)
		colorBeach     (0.338, 0.293, 0.271, 0.000)
		colorDesert    (0.366, 0.315, 0.264, 0.000)
		colorLowland   (0.402, 0.336, 0.299, 0.000)
		colorUpland    (0.445, 0.408, 0.363, 0.000)
		colorRock      (0.481, 0.443, 0.392, 0.000)
		colorSnow      (0.524, 0.472, 0.413, 1.000)
		BumpHeight      3.23924
		BumpOffset      0.647849
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0477921
		Period          0.161133
		Eccentricity    0.232041
		Inclination     -85.2886
		AscendingNode   -142.562
		ArgOfPericenter 167.052
		MeanAnomaly     109.765
	}
}

DwarfMoon	"Ileenium System 6.D70"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            9.58803e-011
	Radius          3.77877
	InertiaMoment   0.39948

	Obliquity       81.9026
	EqAscendNode    -159.138
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.526 0.522 0.518)

	Surface
	{
		SurfStyle       0.29258
		OceanStyle      0.217063
		Randomize      (-0.718, -0.742, 0.719)
		colorDistMagn   0.545268
		colorDistFreq   0.00655159
		detailScale     103.186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.352691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.336705
		terraceProb     0.501516
		erosion         0
		montesMagn      0.478715
		montesFreq      3.06652
		montesSpiky     0.992787
		montesFraction  0.701879
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0377955
		hillsFraction   0.673461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246762
		craterFreq      0.245407
		craterDensity   0.877337
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486329
		volcanoTemp     1567.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.209, 0.207, 0.000)
		colorShelf     (0.224, 0.222, 0.220, 0.000)
		colorBeach     (0.237, 0.235, 0.233, 0.000)
		colorDesert    (0.250, 0.248, 0.246, 0.000)
		colorLowland   (0.263, 0.261, 0.259, 0.000)
		colorUpland    (0.276, 0.274, 0.272, 0.000)
		colorRock      (0.289, 0.287, 0.285, 0.000)
		colorSnow      (0.303, 0.300, 0.298, 1.000)
		BumpHeight      3.40089
		BumpOffset      0.680178
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0481017
		Period          0.162701
		Eccentricity    0.292205
		Inclination     81.9026
		AscendingNode   -159.138
		ArgOfPericenter 79.963
		MeanAnomaly     105.507
	}
}

DwarfMoon	"Ileenium System 6.D71"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            1.55914e-010
	Radius          4.15419
	InertiaMoment   0.397082

	RotationPeriod  2884.31
	Obliquity       10.4531
	EqAscendNode    -7.48836

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.474 0.427 0.384)

	Surface
	{
		SurfStyle       0.587651
		OceanStyle      0.313529
		Randomize      (-0.888, -0.932, 0.854)
		colorDistMagn   0.513557
		colorDistFreq   0.0111823
		detailScale     113.437
		colorConversion true
		snowLevel       2
		tropicLatitude  0.356105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434255
		terraceProb     0.297979
		erosion         0
		montesMagn      0.50858
		montesFreq      3.43684
		montesSpiky     0.870305
		montesFraction  0.703559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.038673
		hillsFraction   0.664308
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255714
		craterFreq      0.206612
		craterDensity   0.910446
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459397
		volcanoTemp     1710.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.145, 0.107, 0.000)
		colorShelf     (0.190, 0.150, 0.123, 0.000)
		colorBeach     (0.223, 0.175, 0.146, 0.000)
		colorDesert    (0.242, 0.188, 0.142, 0.000)
		colorLowland   (0.265, 0.201, 0.161, 0.000)
		colorUpland    (0.294, 0.244, 0.196, 0.000)
		colorRock      (0.318, 0.265, 0.211, 0.000)
		colorSnow      (0.346, 0.282, 0.223, 1.000)
		BumpHeight      3.73877
		BumpOffset      0.747754
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0484595
		Period          0.16452
		Eccentricity    0.391451
		Inclination     10.4531
		AscendingNode   -7.48836
		ArgOfPericenter 128.622
		MeanAnomaly     167.958
	}
}

DwarfMoon	"Ileenium System 6.D72"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            2.44762e-010
	Radius          4.54938
	InertiaMoment   0.398634

	Obliquity       86.9439
	EqAscendNode    -88.8408
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.475 0.471)

	Surface
	{
		SurfStyle       0.93021
		OceanStyle      0.297871
		Randomize      (0.125, 0.680, 0.352)
		colorDistMagn   0.867195
		colorDistFreq   0.0163885
		detailScale     124.228
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99985
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.65835
		terraceProb     0.272814
		erosion         0
		montesMagn      0.475162
		montesFreq      3.56782
		montesSpiky     0.891922
		montesFraction  0.505171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0601064
		hillsFraction   0.881903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243452
		craterFreq      0.202327
		craterDensity   0.796861
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495655
		volcanoTemp     1514.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.166, 0.188, 0.050)
		colorShelf     (0.192, 0.195, 0.217, 0.040)
		colorBeach     (0.221, 0.223, 0.245, 0.030)
		colorDesert    (0.250, 0.252, 0.278, 0.020)
		colorLowland   (0.279, 0.280, 0.306, 0.030)
		colorUpland    (0.307, 0.309, 0.334, 0.050)
		colorRock      (0.336, 0.337, 0.372, 0.020)
		colorSnow      (0.336, 0.337, 0.372, 1.000)
		BumpHeight      4.09444
		BumpOffset      0.818888
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0488958
		Period          0.166747
		Eccentricity    0.341825
		Inclination     86.9439
		AscendingNode   -88.8408
		ArgOfPericenter -64.9338
		MeanAnomaly     -53.2711
	}
}

DwarfMoon	"Ileenium System 6.D73"
{
	ParentBody     "Ileenium System 6"
	Class	       "Asteroid"

	Mass            3.73618e-010
	Radius          13.0588
	InertiaMoment   0.399608

	RotationPeriod  3678.07
	Obliquity       74.4828
	EqAscendNode    -48.206

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.454 0.450 0.445)

	Surface
	{
		SurfStyle       0.0465869
		OceanStyle      0.322949
		Randomize      (-0.728, 0.883, -0.534)
		colorDistMagn   0.430028
		colorDistFreq   0.134358
		detailScale     356.591
		colorConversion true
		snowLevel       2
		tropicLatitude  0.837013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702049
		terraceProb     0.129728
		erosion         0
		montesMagn      0.578977
		montesFreq      2.56798
		montesSpiky     0.995675
		montesFraction  0.445984
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.291046
		hillsFraction   0.805739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234
		craterFreq      0.206823
		craterDensity   0.802657
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459305
		volcanoTemp     1437.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.180, 0.178, 0.000)
		colorShelf     (0.193, 0.191, 0.189, 0.000)
		colorBeach     (0.204, 0.202, 0.200, 0.000)
		colorDesert    (0.216, 0.214, 0.211, 0.000)
		colorLowland   (0.227, 0.225, 0.222, 0.000)
		colorUpland    (0.238, 0.236, 0.234, 0.000)
		colorRock      (0.250, 0.247, 0.245, 0.000)
		colorSnow      (0.261, 0.259, 0.256, 1.000)
		BumpHeight      11.7529
		BumpOffset      2.35058
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0491086
		Period          0.167837
		Eccentricity    0.455118
		Inclination     74.4828
		AscendingNode   -48.206
		ArgOfPericenter 120.115
		MeanAnomaly     -45.8732
	}
}

DwarfPlanet	"Ileenium System 7"
{
	ParentBody     "Ileenium System"
	Class	       "Selena"

	Mass            0.0022626
	Radius          1002.06
	InertiaMoment   0.399121

	Oblateness      0.00137519

	RotationPeriod  55.4863
	Obliquity       -50.5947
	EqAscendNode    163.262

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.773 0.801 0.867)

	Surface
	{
		SurfStyle       0.224207
		OceanStyle      0.684865
		Randomize      (0.816, -0.841, 0.686)
		colorDistMagn   0.0526194
		colorDistFreq   109.645
		detailScale     2577.35
		colorConversion true
		drivenDarkening 0
		seaLevel        0.213234
		snowLevel       2
		tropicLatitude  0.795993
		icecapLatitude  10
		icecapHeight    0.174833
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.75809
		venusFreq       0.61961
		venusMagn       0
		mareFreq        0.35025
		mareDensity     0.00132877
		terraceProb     0.151885
		erosion         0
		montesMagn      0.0644829
		montesFreq      52.1787
		montesSpiky     0.927916
		montesFraction  0.453966
		dunesMagn       0.0307321
		dunesFreq       1281.64
		dunesFraction   0.389267
		hillsMagn       0.13375
		hillsFreq       97.1927
		hillsFraction   0.904973
		hills2Fraction  0
		riversMagn      59.6293
		riversFreq      2.28286
		riversSin       3.72542
		riversOctaves   0
		canyonsMagn     0.578414
		canyonsFreq     0.350516
		canyonFraction  0.316283
		cracksMagn      0.057613
		cracksFreq      0.32196
		cracksOctaves   0
		craterMagn      0.579907
		craterFreq      2.44157
		craterDensity   0.900868
		craterOctaves   10
		craterRayedFactor 0.166468
		volcanoMagn     0.193003
		volcanoFreq     0.718311
		volcanoDensity  0.182208
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.236294
		volcanoRadius   0.141119
		volcanoTemp     1551.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.250, 0.249, 0.248, 0.000)
		colorDesert    (0.310, 0.298, 0.282, 0.200)
		colorLowland   (0.335, 0.318, 0.317, 0.500)
		colorUpland    (0.350, 0.333, 0.327, 0.800)
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
		SemiMajorAxis   1.9931
		Period          1.94412
		Eccentricity    0.0542495
		Inclination     2.42132
		AscendingNode   173.571
		ArgOfPericenter 45.4544
		MeanAnomaly     354.824
	}
}

Planet	"Ileenium System 10"
{
	ParentBody     "Ileenium System"
	Class	       "Selena"

	Mass            0.0705258
	Radius          3081.14
	InertiaMoment   0.334318

	Oblateness      0.00394553

	RotationPeriod  28.045
	Obliquity       -325.428
	EqAscendNode    -136.117

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.613 0.606 0.603)

	Surface
	{
		SurfStyle       0.446943
		OceanStyle      0.571773
		Randomize      (0.087, 0.843, -0.660)
		colorDistMagn   0.0876756
		colorDistFreq   390.046
		detailScale     7924.88
		colorConversion true
		drivenDarkening 0
		seaLevel        0.206573
		snowLevel       2
		tropicLatitude  0.547313
		icecapLatitude  1
		icecapHeight    0.206573
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.78147
		venusFreq       0.932733
		venusMagn       0
		mareFreq        1.82493
		mareDensity     0.0110601
		terraceProb     0.279906
		erosion         0
		montesMagn      0.23676
		montesFreq      121.393
		montesSpiky     0.926815
		montesFraction  0.00264001
		dunesMagn       0.0358738
		dunesFreq       4157.36
		dunesFraction   0.603127
		hillsMagn       0.143282
		hillsFreq       393.733
		hillsFraction   0.228479
		hills2Fraction  0
		riversMagn      62.0235
		riversFreq      3.64704
		riversSin       5.7729
		riversOctaves   0
		canyonsMagn     0.553875
		canyonsFreq     0.913909
		canyonFraction  0.0672753
		cracksMagn      0.0402872
		cracksFreq      1.32805
		cracksOctaves   0
		craterMagn      0.617144
		craterFreq      8.96528
		craterDensity   0.985746
		craterOctaves   12
		craterRayedFactor 0.146576
		volcanoMagn     0.594281
		volcanoFreq     0.703093
		volcanoDensity  0.38921
		volcanoOctaves  3
		volcanoActivity 0.838899
		volcanoFlows    0.220208
		volcanoRadius   0.50635
		volcanoTemp     1340.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.337, 0.346, 0.362, 0.000)
		colorDesert    (0.294, 0.279, 0.278, 0.000)
		colorLowland   (0.374, 0.370, 0.338, 0.000)
		colorUpland    (0.398, 0.394, 0.368, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.997705
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
		Height          89.3078
		Density         0.000229513
		Pressure        5.35614e-005
		Greenhouse      0.0141765
		Bright          2.96593
		Opacity         0
		SkyLight        0.988645
		Hue             -0.012626
		Saturation      1

		Composition
		{
			SO2   	99.5428
			Cl2   	0.443189
			Kr    	0.013903
			Xe    	0.00015535
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.96246
		Period          15.5239
		Eccentricity    0.0396365
		Inclination     1.68363
		AscendingNode   -146.278
		ArgOfPericenter 181.132
		MeanAnomaly     346.17
	}
}

DwarfMoon	"Ileenium System 10.D1"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            1.45019e-006
	Radius          100.027
	InertiaMoment   0.398972

	Oblateness      0.0524757

	Obliquity       0.504751
	EqAscendNode    86.798
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.674 0.670)

	Surface
	{
		SurfStyle       0.404393
		OceanStyle      0.278516
		Randomize      (0.706, -0.645, 0.599)
		colorDistMagn   0.741024
		colorDistFreq   2.82533
		detailScale     2731.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0128026
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307087
		terraceProb     0.166956
		erosion         0
		montesMagn      0.586583
		montesFreq      2.97735
		montesSpiky     0.984415
		montesFraction  0.660846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.0615
		hillsFraction   0.744035
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242327
		craterFreq      0.429998
		craterDensity   0.910781
		craterOctaves   15
		volcanoActivity 0.83221
		volcanoFlows    0
		volcanoRadius   0.538385
		volcanoTemp     1762.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.268, 0.000)
		colorShelf     (0.288, 0.286, 0.285, 0.000)
		colorBeach     (0.305, 0.303, 0.301, 0.000)
		colorDesert    (0.322, 0.320, 0.318, 0.000)
		colorLowland   (0.338, 0.337, 0.335, 0.000)
		colorUpland    (0.355, 0.354, 0.352, 0.000)
		colorRock      (0.372, 0.371, 0.368, 0.000)
		colorSnow      (0.389, 0.387, 0.385, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.00277e-005
		Period          0.00127616
		Eccentricity    0.0366033
		Inclination     0.504751
		AscendingNode   86.798
		ArgOfPericenter -140.47
		MeanAnomaly     167.749
	}
}

DwarfMoon	"Ileenium System 10.D2"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            5.95979e-006
	Radius          139.402
	InertiaMoment   0.398403

	Oblateness      0.00805034

	Obliquity       0.969775
	EqAscendNode    -170.547
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.417 0.412 0.407)

	Surface
	{
		SurfStyle       0.159544
		OceanStyle      0.404128
		Randomize      (-0.084, -0.943, 0.548)
		colorDistMagn   0.511004
		colorDistFreq   12.9961
		detailScale     3806.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00278363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479326
		terraceProb     0.460736
		erosion         0
		montesMagn      0.553502
		montesFreq      2.90564
		montesSpiky     0.964607
		montesFraction  0.426897
		dunesFraction   0
		hillsMagn       0
		hillsFreq       44.8052
		hillsFraction   0.655888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219343
		craterFreq      0.690879
		craterDensity   0.99883
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513393
		volcanoTemp     1560.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.165, 0.163, 0.000)
		colorShelf     (0.177, 0.175, 0.173, 0.000)
		colorBeach     (0.188, 0.185, 0.183, 0.000)
		colorDesert    (0.198, 0.195, 0.193, 0.000)
		colorLowland   (0.209, 0.206, 0.203, 0.000)
		colorUpland    (0.219, 0.216, 0.213, 0.000)
		colorRock      (0.229, 0.226, 0.224, 0.000)
		colorSnow      (0.240, 0.237, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000113737
		Period          0.00264143
		Eccentricity    0.00275492
		Inclination     0.969775
		AscendingNode   -170.547
		ArgOfPericenter -170.423
		MeanAnomaly     -113.168
	}
}

DwarfMoon	"Ileenium System 10.D3"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            1.11835e-005
	Radius          197.521
	InertiaMoment   0.397661

	Oblateness      0.00284069

	Obliquity       -1.33143
	EqAscendNode    98.5319
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.663 0.661)

	Surface
	{
		SurfStyle       0.772502
		OceanStyle      0.721699
		Randomize      (0.032, 0.965, -0.003)
		colorDistMagn   0.0446146
		colorDistFreq   16.7027
		detailScale     5393.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0303211
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38928
		terraceProb     0.344369
		erosion         0
		montesMagn      0.62293
		montesFreq      3.16923
		montesSpiky     0.915187
		montesFraction  0.148034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       85.0723
		hillsFraction   0.660027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263303
		craterFreq      1.33187
		craterDensity   0.940799
		craterOctaves   16
		volcanoActivity 0.123335
		volcanoFlows    0
		volcanoRadius   0.53505
		volcanoTemp     1434.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.225, 0.185, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.314, 0.272, 0.251, 0.000)
		colorDesert    (0.341, 0.292, 0.244, 0.000)
		colorLowland   (0.374, 0.311, 0.277, 0.000)
		colorUpland    (0.414, 0.378, 0.337, 0.000)
		colorRock      (0.448, 0.411, 0.363, 0.000)
		colorSnow      (0.488, 0.437, 0.383, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000184728
		Period          0.00546727
		Eccentricity    0.0485419
		Inclination     -1.33143
		AscendingNode   98.5319
		ArgOfPericenter -14.0188
		MeanAnomaly     102.966
	}
}

DwarfMoon	"Ileenium System 10.D4"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            1.73064e-005
	Radius          215.035
	InertiaMoment   0.396234

	Obliquity       1.10405
	EqAscendNode    132.079
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.828 0.779 0.732)

	Surface
	{
		SurfStyle       0.272179
		OceanStyle      0.396206
		Randomize      (-0.896, -0.110, -0.675)
		colorDistMagn   0.942494
		colorDistFreq   30.7715
		detailScale     5871.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0156474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487174
		terraceProb     0.229621
		erosion         0
		montesMagn      0.494563
		montesFreq      3.00056
		montesSpiky     0.92546
		montesFraction  0.548956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       126.223
		hillsFraction   0.512242
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227487
		craterFreq      1.5791
		craterDensity   0.864044
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.625385
		volcanoTemp     1490.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.331, 0.312, 0.293, 0.000)
		colorShelf     (0.352, 0.331, 0.311, 0.000)
		colorBeach     (0.373, 0.351, 0.330, 0.000)
		colorDesert    (0.394, 0.370, 0.348, 0.000)
		colorLowland   (0.414, 0.390, 0.366, 0.000)
		colorUpland    (0.435, 0.409, 0.385, 0.000)
		colorRock      (0.456, 0.429, 0.403, 0.000)
		colorSnow      (0.476, 0.448, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00030003
		Period          0.0113161
		Eccentricity    0.0368552
		Inclination     1.10405
		AscendingNode   132.079
		ArgOfPericenter 19.4165
		MeanAnomaly     -59.6365
	}
}

DwarfMoon	"Ileenium System 10.D5"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            2.44328e-005
	Radius          222.98
	InertiaMoment   0.399691

	Obliquity       -1.23537
	EqAscendNode    12.8898
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.408 0.405)

	Surface
	{
		SurfStyle       0.854497
		OceanStyle      0.806731
		Randomize      (0.087, 0.469, -0.388)
		colorDistMagn   0.81304
		colorDistFreq   34.5912
		detailScale     6088.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0428367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.73129
		terraceProb     0.22894
		erosion         0
		montesMagn      0.458833
		montesFreq      3.19059
		montesSpiky     0.893386
		montesFraction  0.514788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       100.909
		hillsFraction   0.681712
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242279
		craterFreq      1.53275
		craterDensity   0.59482
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52973
		volcanoTemp     2184.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.142, 0.143, 0.162, 0.050)
		colorShelf     (0.166, 0.167, 0.186, 0.040)
		colorBeach     (0.191, 0.192, 0.211, 0.030)
		colorDesert    (0.216, 0.216, 0.239, 0.020)
		colorLowland   (0.241, 0.241, 0.263, 0.030)
		colorUpland    (0.266, 0.265, 0.287, 0.050)
		colorRock      (0.291, 0.290, 0.320, 0.020)
		colorSnow      (0.291, 0.290, 0.320, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000487299
		Period          0.023422
		Eccentricity    0.0203217
		Inclination     -1.23537
		AscendingNode   12.8898
		ArgOfPericenter 100.811
		MeanAnomaly     -91.8924
	}
}

DwarfMoon	"Ileenium System 10.D6"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            3.26724e-005
	Radius          282.229
	InertiaMoment   0.399215

	Obliquity       -0.192275
	EqAscendNode    -93.2318
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.526 0.521)

	Surface
	{
		SurfStyle       0.137343
		OceanStyle      0.364027
		Randomize      (0.845, -0.893, -0.598)
		colorDistMagn   0.985838
		colorDistFreq   42.9472
		detailScale     7706.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00460642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.621364
		terraceProb     0.202753
		erosion         0
		montesMagn      0.616746
		montesFreq      2.91818
		montesSpiky     0.943804
		montesFraction  0.422145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       183.98
		hillsFraction   0.597219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238371
		craterFreq      3.22774
		craterDensity   0.998508
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42866
		volcanoTemp     1669.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.210, 0.209, 0.000)
		colorShelf     (0.227, 0.223, 0.222, 0.000)
		colorBeach     (0.241, 0.237, 0.235, 0.000)
		colorDesert    (0.254, 0.250, 0.248, 0.000)
		colorLowland   (0.268, 0.263, 0.261, 0.000)
		colorUpland    (0.281, 0.276, 0.274, 0.000)
		colorRock      (0.294, 0.289, 0.287, 0.000)
		colorSnow      (0.308, 0.302, 0.300, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000791456
		Period          0.0484781
		Eccentricity    0.0449393
		Inclination     -0.192275
		AscendingNode   -93.2317
		ArgOfPericenter -41.215
		MeanAnomaly     154.872
	}
}

DwarfMoon	"Ileenium System 10.D7"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            3.24865e-010
	Radius          9.33778
	InertiaMoment   0.397962

	RotationPeriod  1844.36
	Obliquity       32.9064
	EqAscendNode    26.7656

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.467 0.459 0.456)

	Surface
	{
		SurfStyle       0.0535061
		OceanStyle      0.3936
		Randomize      (0.966, 0.614, -0.602)
		colorDistMagn   0.534267
		colorDistFreq   0.0505485
		detailScale     254.984
		colorConversion true
		snowLevel       2
		tropicLatitude  0.906891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575576
		terraceProb     0.217818
		erosion         0
		montesMagn      0.520793
		montesFreq      2.11602
		montesSpiky     0.893977
		montesFraction  0.842011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.287041
		hillsFraction   0.516687
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249163
		craterFreq      0.191036
		craterDensity   0.91147
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564964
		volcanoTemp     1065.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.184, 0.182, 0.000)
		colorShelf     (0.198, 0.195, 0.194, 0.000)
		colorBeach     (0.210, 0.207, 0.205, 0.000)
		colorDesert    (0.222, 0.218, 0.217, 0.000)
		colorLowland   (0.233, 0.230, 0.228, 0.000)
		colorUpland    (0.245, 0.241, 0.239, 0.000)
		colorRock      (0.257, 0.253, 0.251, 0.000)
		colorSnow      (0.268, 0.264, 0.262, 1.000)
		BumpHeight      8.404
		BumpOffset      1.6808
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00493275
		Period          0.754464
		Eccentricity    0.339727
		Inclination     34.2108
		AscendingNode   26.6791
		ArgOfPericenter -111.338
		MeanAnomaly     -117.393
	}
}

DwarfMoon	"Ileenium System 10.D8"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            4.88235e-010
	Radius          9.68218
	InertiaMoment   0.399115

	RotationPeriod  1152.89
	Obliquity       -72.1754
	EqAscendNode    68.0798

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.728 0.726)

	Surface
	{
		SurfStyle       0.854376
		OceanStyle      0.257651
		Randomize      (0.926, 0.929, 0.265)
		colorDistMagn   0.629532
		colorDistFreq   0.0580491
		detailScale     264.388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944511
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55675
		terraceProb     0.141669
		erosion         0
		montesMagn      0.483208
		montesFreq      2.77514
		montesSpiky     0.968649
		montesFraction  0.609269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.203105
		hillsFraction   0.746449
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255087
		craterFreq      0.21014
		craterDensity   0.907326
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567968
		volcanoTemp     1426.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.255, 0.290, 0.050)
		colorShelf     (0.293, 0.299, 0.334, 0.040)
		colorBeach     (0.337, 0.342, 0.377, 0.030)
		colorDesert    (0.381, 0.386, 0.428, 0.020)
		colorLowland   (0.425, 0.430, 0.472, 0.030)
		colorUpland    (0.468, 0.473, 0.515, 0.050)
		colorRock      (0.512, 0.517, 0.573, 0.020)
		colorSnow      (0.512, 0.517, 0.573, 1.000)
		BumpHeight      8.71396
		BumpOffset      1.74279
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00551283
		Period          0.891389
		Eccentricity    0.190162
		Inclination     -85.6458
		AscendingNode   68.2521
		ArgOfPericenter -167.093
		MeanAnomaly     94.0797
	}
}

DwarfMoon	"Ileenium System 10.D9"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            7.19307e-010
	Radius          13.3732
	InertiaMoment   0.394711

	RotationPeriod  1243.36
	Obliquity       -2.96576
	EqAscendNode    30.4409

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.448 0.360)

	Surface
	{
		SurfStyle       0.264963
		OceanStyle      0.147379
		Randomize      (-0.012, 0.468, -0.938)
		colorDistMagn   0.910024
		colorDistFreq   0.142919
		detailScale     365.177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.429338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479089
		terraceProb     0.321589
		erosion         0
		montesMagn      0.419413
		montesFreq      3.12527
		montesSpiky     0.942325
		montesFraction  0.615907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.556213
		hillsFraction   0.626832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211022
		craterFreq      0.214053
		craterDensity   1.01463
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498187
		volcanoTemp     1462.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.179, 0.144, 0.000)
		colorShelf     (0.269, 0.190, 0.153, 0.000)
		colorBeach     (0.284, 0.201, 0.162, 0.000)
		colorDesert    (0.300, 0.213, 0.171, 0.000)
		colorLowland   (0.316, 0.224, 0.180, 0.000)
		colorUpland    (0.332, 0.235, 0.189, 0.000)
		colorRock      (0.348, 0.246, 0.198, 0.000)
		colorSnow      (0.363, 0.257, 0.207, 1.000)
		BumpHeight      12.0358
		BumpOffset      2.40717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00572695
		Period          0.943824
		Eccentricity    0.224056
		Inclination     27.9762
		AscendingNode   29.2112
		ArgOfPericenter 157.071
		MeanAnomaly     -132.216
	}
}

DwarfMoon	"Ileenium System 10.D10"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            1.04246e-009
	Radius          14.429
	InertiaMoment   0.398162

	RotationPeriod  1056.99
	Obliquity       19.148
	EqAscendNode    60.1917

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.571 0.567 0.564)

	Surface
	{
		SurfStyle       0.402336
		OceanStyle      0.889413
		Randomize      (-0.652, 0.782, -0.644)
		colorDistMagn   0.471069
		colorDistFreq   0.0962594
		detailScale     394.007
		colorConversion true
		snowLevel       2
		tropicLatitude  0.688152
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540688
		terraceProb     0.463878
		erosion         0
		montesMagn      0.532463
		montesFreq      3.52263
		montesSpiky     0.916788
		montesFraction  0.440139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.508523
		hillsFraction   0.388403
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193342
		craterFreq      0.270811
		craterDensity   0.928041
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513342
		volcanoTemp     1796.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.227, 0.226, 0.000)
		colorShelf     (0.243, 0.241, 0.240, 0.000)
		colorBeach     (0.257, 0.255, 0.254, 0.000)
		colorDesert    (0.271, 0.269, 0.268, 0.000)
		colorLowland   (0.286, 0.284, 0.282, 0.000)
		colorUpland    (0.300, 0.298, 0.296, 0.000)
		colorRock      (0.314, 0.312, 0.310, 0.000)
		colorSnow      (0.328, 0.326, 0.324, 1.000)
		BumpHeight      12.9861
		BumpOffset      2.59721
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00633247
		Period          1.0974
		Eccentricity    0.337502
		Inclination     30.8437
		AscendingNode   59.4408
		ArgOfPericenter -170.645
		MeanAnomaly     159.054
	}
}

DwarfMoon	"Ileenium System 10.D11"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            1.49029e-009
	Radius          15.6123
	InertiaMoment   0.399251

	RotationPeriod  949.741
	Obliquity       0.625936
	EqAscendNode    -70.3712

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.486 0.481)

	Surface
	{
		SurfStyle       0.295978
		OceanStyle      0.859817
		Randomize      (0.001, -0.080, -0.339)
		colorDistMagn   0.277282
		colorDistFreq   0.174511
		detailScale     426.319
		colorConversion true
		snowLevel       2
		tropicLatitude  0.484201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.744736
		terraceProb     0.262417
		erosion         0
		montesMagn      0.415233
		montesFreq      2.55727
		montesSpiky     0.904153
		montesFraction  0.505311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.526222
		hillsFraction   0.73799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254619
		craterFreq      0.249245
		craterDensity   1.0166
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484064
		volcanoTemp     1011.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.192, 0.000)
		colorShelf     (0.208, 0.206, 0.204, 0.000)
		colorBeach     (0.220, 0.218, 0.216, 0.000)
		colorDesert    (0.233, 0.231, 0.229, 0.000)
		colorLowland   (0.245, 0.243, 0.241, 0.000)
		colorUpland    (0.257, 0.255, 0.253, 0.000)
		colorRock      (0.269, 0.267, 0.265, 0.000)
		colorSnow      (0.282, 0.279, 0.277, 1.000)
		BumpHeight      14.051
		BumpOffset      2.81021
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00689525
		Period          1.2469
		Eccentricity    0.41405
		Inclination     -29.17
		AscendingNode   -69.8735
		ArgOfPericenter -54.6266
		MeanAnomaly     138.889
	}
}

DwarfMoon	"Ileenium System 10.D12"
{
	ParentBody     "Ileenium System 10"
	Class	       "Asteroid"

	Mass            2.10632e-009
	Radius          16.429
	InertiaMoment   0.396209

	RotationPeriod  845.421
	Obliquity       14.5778
	EqAscendNode    -131.169

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.528 0.426 0.294)

	Surface
	{
		SurfStyle       0.545254
		OceanStyle      0.782511
		Randomize      (-0.900, 0.906, -0.527)
		colorDistMagn   0.473463
		colorDistFreq   0.141176
		detailScale     448.622
		colorConversion true
		snowLevel       2
		tropicLatitude  0.21518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.272795
		terraceProb     0.294145
		erosion         0
		montesMagn      0.48057
		montesFreq      3.78352
		montesSpiky     0.825816
		montesFraction  0.198039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.761725
		hillsFraction   0.630185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26373
		craterFreq      0.239523
		craterDensity   0.787035
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521189
		volcanoTemp     1640.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.145, 0.082, 0.000)
		colorShelf     (0.211, 0.149, 0.094, 0.000)
		colorBeach     (0.248, 0.174, 0.112, 0.000)
		colorDesert    (0.269, 0.187, 0.109, 0.000)
		colorLowland   (0.296, 0.200, 0.123, 0.000)
		colorUpland    (0.327, 0.243, 0.150, 0.000)
		colorRock      (0.354, 0.264, 0.161, 0.000)
		colorSnow      (0.386, 0.281, 0.170, 1.000)
		BumpHeight      14.7861
		BumpOffset      2.95722
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00749417
		Period          1.41283
		Eccentricity    0.423339
		Inclination     4.99255
		AscendingNode   -124.604
		ArgOfPericenter 165.422
		MeanAnomaly     -144.717
	}
}