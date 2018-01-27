// http://starwars.wikia.com/wiki/Cantonica
// Region : Outer Rim
// Sector : Wyl Sector
// Grid location : S4
// X : 11114.02, Y : 8366.03, Z : 391.6324793835114

Planet	"Cantonica/Cantonica System 3"
{
	ParentBody     "Cantonica System"
	Class	       "Terra"

	Mass            1
	Radius          5783.11
	InertiaMoment   0.328397

	Oblateness      0.00657296

	RotationPeriod  14.6784
	Obliquity       -57.1429
	EqAscendNode    102.857

	AbsMagn         -3.78263
	SlopeParam      5.44606
	AlbedoBond      0.336606
	AlbedoGeom      0.403927
	Brightness      0.555556
	Color          (0.377 0.257 0.164)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		SurfStyle       0.938889
		OceanStyle      0.0952381
		Randomize      (0.210, -0.844, 0.570)
		colorDistMagn   0.0667713
		colorDistFreq   841.673
		detailScale     17748.9
		colorConversion true
		drivenDarkening -1
		seaLevel        -1
		snowLevel       0.269841
		tropicLatitude  0.855162
		icecapLatitude  1
		icecapHeight    0.128119
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.07
		mainFreq        5
		venusFreq       0.269841
		venusMagn       0.386521
		mareFreq        2.28799
		mareDensity     0.206712
		terraceProb     0.194374
		erosion         0
		montesMagn      0.150416
		montesFreq      225.583
		montesSpiky     0.883729
		montesFraction  0.949624
		dunesMagn       0.0553337
		dunesFreq       49.4435
		dunesFraction   0.943761
		hillsMagn       0.13835
		hillsFreq       888.352
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.2604
		riversFreq      2.4096
		riversSin       4.02225
		riversOctaves   0
		canyonsMagn     0.0227393
		canyonsFreq     100
		canyonFraction  0.813756
		cracksMagn      0.108734
		cracksFreq      0.568279
		cracksOctaves   0
		craterMagn      0.634393
		craterFreq      15.1896
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.75329
		volcanoFreq     0.718212
		volcanoDensity  0.367416
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.638031
		volcanoRadius   0.424863
		volcanoTemp     1218.05
		lavaCoverTidal  0.326452
		lavaCoverSun    1
		lavaCoverYoung  0
		stripeZones     0
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      17.9851
		DiffMapAlpha   "Ice"
		SpecBrightWater 4.7619
		SpecBrightIce   0
		SpecularPower   1
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      1.98413
	}

	Clouds
	{
		Height          19.96
		Velocity        73.9576
		BumpHeight      5.78151
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateColor  (1.000 1.000 1.000 0.214)
		mainFreq        0.571429
		mainOctaves     3
		Coverage        0.0873016
		stripeZones     0
		stripeFluct     0
		stripeTwist     0
	}

	Clouds
	{
		Height          84.8345
		Velocity        73.9576
		BumpHeight      5.78151
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.571429
		mainOctaves     3
		Coverage        0.0873016
		stripeZones     0
		stripeFluct     0
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          401.028
		Density         1
		Pressure        1
		Greenhouse      252.381
		Bright          0.952381
		Opacity         0.198413
		SkyLight        1.19048
		Hue             -0.111111
		Saturation      0.396825

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
		SemiMajorAxis   0.8
		Period          0.286392
		Eccentricity    0.0600432
		Inclination     2.08221
		AscendingNode   141.32
		ArgOfPericenter 358.33
		MeanAnomaly     217.504
	}
}

// At least 2 moons

DwarfMoon	"Cantonica's Moon 1/Cantonica System 3.D1"
{
	ParentBody     "Cantonica System 3"
	Class	       "Asteroid"

	Mass            6.90963e-009
	Radius          13.8518
	InertiaMoment   0.398627

	Oblateness      0.166292

	Obliquity       0.00059956
	EqAscendNode    -67.7289
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.467 0.464)

	Surface
	{
		SurfStyle       0.344716
		OceanStyle      0.41723
		Randomize      (0.096, -0.734, 0.313)
		colorDistMagn   0.517818
		colorDistFreq   0.0668093
		detailScale     378.246
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344179
		terraceProb     0.150614
		erosion         0
		montesMagn      0.497069
		montesFreq      3.41283
		montesSpiky     0.963714
		montesFraction  0.67381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.464276
		hillsFraction   0.621932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253019
		craterFreq      0.230283
		craterDensity   1.02177
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462333
		volcanoTemp     1422.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.186, 0.000)
		colorShelf     (0.201, 0.198, 0.197, 0.000)
		colorBeach     (0.213, 0.210, 0.209, 0.000)
		colorDesert    (0.224, 0.222, 0.220, 0.000)
		colorLowland   (0.236, 0.233, 0.232, 0.000)
		colorUpland    (0.248, 0.245, 0.244, 0.000)
		colorRock      (0.260, 0.257, 0.255, 0.000)
		colorSnow      (0.272, 0.269, 0.267, 1.000)
		BumpHeight      12.4666
		BumpOffset      2.49332
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.643e-005
		Period          0.000534852
		Eccentricity    8.02081e-005
		Inclination     0.00059956
		AscendingNode   -67.7289
		ArgOfPericenter 129.327
		MeanAnomaly     -172.798
	}
}

Moon	"Cantonica's Moon 2/Cantonica System 3.1"
{
	ParentBody     "Cantonica System 3"
	Class	       "Selena"

	Mass            0.00176374
	Radius          811.049
	InertiaMoment   0.395214

	Oblateness      0.0221093

	Obliquity       0.447126
	EqAscendNode    -37.0681
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.499 0.496 0.494)

	Surface
	{
		SurfStyle       0.609396
		OceanStyle      0.512528
		Randomize      (0.072, 0.760, -0.779)
		colorDistMagn   0.0752839
		colorDistFreq   120.714
		detailScale     2086.06
		colorConversion true
		drivenDarkening 0
		seaLevel        0.163327
		snowLevel       2
		tropicLatitude  0.0147978
		icecapLatitude  10
		icecapHeight    0.164938
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91239
		venusFreq       0.965339
		venusMagn       0
		mareFreq        0.173858
		mareDensity     0.0020263
		terraceProb     0.387564
		erosion         0
		montesMagn      0.045447
		montesFreq      36.1707
		montesSpiky     0.972908
		montesFraction  0.698205
		dunesMagn       0.0274707
		dunesFreq       1069.97
		dunesFraction   0.58121
		hillsMagn       0.126542
		hillsFreq       109.776
		hillsFraction   0.342998
		hills2Fraction  0
		riversMagn      61.6119
		riversFreq      2.30924
		riversSin       6.02197
		riversOctaves   0
		canyonsMagn     0.620616
		canyonsFreq     0.189454
		canyonFraction  0.957372
		cracksMagn      0.0469386
		cracksFreq      0.531046
		cracksOctaves   0
		craterMagn      0.604222
		craterFreq      1.8557
		craterDensity   0.710249
		craterOctaves   9.12651
		craterRayedFactor 0.123512
		volcanoMagn     0.169935
		volcanoFreq     0.770866
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.278011
		volcanoRadius   0.165858
		volcanoTemp     1709.37
		lavaCoverTidal  0.0970546
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.310, 0.303, 0.267, 0.000)
		colorDesert    (0.325, 0.308, 0.272, 0.000)
		colorLowland   (0.255, 0.228, 0.207, 0.000)
		colorUpland    (0.374, 0.352, 0.306, 0.000)
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
		SemiMajorAxis   0.000137789
		Period          0.00129248
		Eccentricity    0.0029516
		Inclination     0.447126
		AscendingNode   -37.0681
		ArgOfPericenter 75.3451
		MeanAnomaly     55.2227
	}
}

DwarfMoon	"Cantonica System 3.D2"
{
	ParentBody     "Cantonica System 3"
	Class	       "Asteroid"

	Mass            1.28995e-008
	Radius          19.5939
	InertiaMoment   0.397393

	RotationPeriod  354.422
	Obliquity       29.2365
	EqAscendNode    -143.718

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.793 0.792)

	Surface
	{
		SurfStyle       0.99265
		OceanStyle      0.0721232
		Randomize      (0.207, 0.543, 0.300)
		colorDistMagn   0.843914
		colorDistFreq   0.144947
		detailScale     535.045
		colorConversion true
		snowLevel       2
		tropicLatitude  0.300607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553854
		terraceProb     0.347933
		erosion         0
		montesMagn      0.440971
		montesFreq      2.95716
		montesSpiky     0.956351
		montesFraction  0.645634
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.13506
		hillsFraction   0.945986
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244331
		craterFreq      0.194288
		craterDensity   1.07444
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465999
		volcanoTemp     1658.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.277, 0.317, 0.050)
		colorShelf     (0.318, 0.325, 0.364, 0.040)
		colorBeach     (0.365, 0.373, 0.412, 0.030)
		colorDesert    (0.413, 0.420, 0.467, 0.020)
		colorLowland   (0.461, 0.468, 0.515, 0.030)
		colorUpland    (0.508, 0.515, 0.562, 0.050)
		colorRock      (0.556, 0.563, 0.625, 0.020)
		colorSnow      (0.556, 0.563, 0.625, 1.000)
		BumpHeight      17.6346
		BumpOffset      3.52691
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000656922
		Period          0.0134775
		Eccentricity    0.202443
		Inclination     29.2365
		AscendingNode   -143.718
		ArgOfPericenter 6.57833
		MeanAnomaly     -102.383
	}
}

/*
DwarfMoon	"Cantonica System 3.D3"
{
	ParentBody     "Cantonica System 3"
	Class	       "Asteroid"

	Mass            1.75485e-008
	Radius          36.9351
	InertiaMoment   0.398781

	RotationPeriod  430.97
	Obliquity       9.92631
	EqAscendNode    89.3464

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.656 0.599)

	Surface
	{
		SurfStyle       0.724173
		OceanStyle      0.0378198
		Randomize      (0.363, 0.205, -0.523)
		colorDistMagn   0.781508
		colorDistFreq   0.523548
		detailScale     1008.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.243322
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45598
		terraceProb     0.225985
		erosion         0
		montesMagn      0.480316
		montesFreq      3.46206
		montesSpiky     0.994246
		montesFraction  0.200155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.49023
		hillsFraction   0.528952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249671
		craterFreq      0.151567
		craterDensity   0.791682
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487111
		volcanoTemp     1726.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.223, 0.168, 0.000)
		colorShelf     (0.313, 0.229, 0.192, 0.000)
		colorBeach     (0.368, 0.269, 0.228, 0.000)
		colorDesert    (0.399, 0.288, 0.222, 0.000)
		colorLowland   (0.438, 0.308, 0.252, 0.000)
		colorUpland    (0.485, 0.374, 0.306, 0.000)
		colorRock      (0.524, 0.406, 0.330, 0.000)
		colorSnow      (0.571, 0.433, 0.348, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00128505
		Period          0.0368736
		Eccentricity    0.476789
		Inclination     9.92631
		AscendingNode   89.3464
		ArgOfPericenter -126.053
		MeanAnomaly     -165.387
	}
}

DwarfMoon	"Cantonica System 3.D4"
{
	ParentBody     "Cantonica System 3"
	Class	       "Asteroid"

	Mass            2.38329e-008
	Radius          21.115
	InertiaMoment   0.399729

	Obliquity       -61.9876
	EqAscendNode    -17.4265
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.648 0.647)

	Surface
	{
		SurfStyle       0.448711
		OceanStyle      0.122211
		Randomize      (-0.906, -0.984, 0.051)
		colorDistMagn   0.700488
		colorDistFreq   0.0863447
		detailScale     576.581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.852295
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.31123
		terraceProb     0.618862
		erosion         0
		montesMagn      0.492111
		montesFreq      3.51464
		montesSpiky     0.9887
		montesFraction  0.329683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.587919
		hillsFraction   0.622518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249552
		craterFreq      0.236243
		craterDensity   0.962389
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459174
		volcanoTemp     1449.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.259, 0.259, 0.000)
		colorShelf     (0.277, 0.275, 0.275, 0.000)
		colorBeach     (0.293, 0.292, 0.291, 0.000)
		colorDesert    (0.309, 0.308, 0.307, 0.000)
		colorLowland   (0.325, 0.324, 0.323, 0.000)
		colorUpland    (0.342, 0.340, 0.340, 0.000)
		colorRock      (0.358, 0.356, 0.356, 0.000)
		colorSnow      (0.374, 0.373, 0.372, 1.000)
		BumpHeight      19.0035
		BumpOffset      3.8007
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00151343
		Period          0.047128
		Eccentricity    0.441479
		Inclination     -61.9876
		AscendingNode   -17.4265
		ArgOfPericenter -112.978
		MeanAnomaly     -177.649
	}
}*/

///////////////
// GENERATED //
///////////////
/*Star	"Cantonica System"
{
	ParentBody     "Cantonica System"
	Class	       "G8 V"
	Luminosity      0.711214
	MassSol         1.00693
	RadSol          1.12224
	Teff            5570

	Age             4.36205

	InertiaMoment   0.0691175

	RotationPeriod  535.53
	Obliquity       328.155
	EqAscendNode    298.404

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.845 0.763)

	Surface
	{
		Randomize      (-0.253, -0.029, 0.316)
		colorDistMagn   0.520376
		colorDistFreq   9.28523
		detailScale     2.00898e+006
		colorConversion true
		tropicLatitude  0.5
		icecapLatitude  1
		mareFreq        52.0406
		mareDensity     0.0108596
		erosion         1
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       6605.25
		craterOctaves   0
		BumpHeight      669.964
		BumpOffset      669.964
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
		Height          7810.77
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
		Radius      3.63764e+006
		Period      0.0210347
		Brightness  0.5
		RayDensity  3.74344
		RayCurv     17.4777
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     328.155
		AscendingNode   298.404
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}*/

DwarfPlanet	"Cantonica System 1"
{
	ParentBody     "Cantonica System"
	Class	       "Selena"

	Mass            0.0213812
	Radius          1638.53
	InertiaMoment   0.362862

	Obliquity       2.28188
	EqAscendNode    33.9923
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.844 0.791 0.711)

	Surface
	{
		SurfStyle       0.00793879
		OceanStyle      0.559244
		Randomize      (-0.909, -0.075, 0.628)
		colorDistMagn   0.0617026
		colorDistFreq   226.803
		detailScale     4214.39
		colorConversion true
		drivenDarkening 0
		seaLevel        0.167941
		snowLevel       2
		tropicLatitude  0.0760987
		icecapLatitude  10
		icecapHeight    0.177444
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.94591
		venusFreq       0.774633
		venusMagn       0
		mareFreq        0.822668
		mareDensity     0.0174172
		terraceProb     0.379187
		erosion         0
		montesMagn      0.0845558
		montesFreq      79.6706
		montesSpiky     0.902813
		montesFraction  0.405032
		dunesMagn       0.0291931
		dunesFreq       2201.76
		dunesFraction   0.0305946
		hillsMagn       0.149752
		hillsFreq       196.753
		hillsFraction   0.736105
		hills2Fraction  0
		riversMagn      56.5147
		riversFreq      3.09371
		riversSin       4.58492
		riversOctaves   0
		canyonsMagn     0.516971
		canyonsFreq     0.531211
		canyonFraction  0.0687059
		cracksMagn      0.042587
		cracksFreq      0.550275
		cracksOctaves   0
		craterMagn      0.550747
		craterFreq      5.3411
		craterDensity   0.909889
		craterOctaves   11
		craterRayedFactor 0.145012
		volcanoMagn     0.217698
		volcanoFreq     0.66267
		volcanoDensity  0.203313
		volcanoOctaves  3
		volcanoActivity 0.137112
		volcanoFlows    0.353506
		volcanoRadius   0.199158
		volcanoTemp     1064.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.422, 0.396, 0.355, 0.000)
		colorDesert    (0.523, 0.475, 0.405, 0.200)
		colorLowland   (0.566, 0.506, 0.455, 0.500)
		colorUpland    (0.591, 0.530, 0.469, 0.800)
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
		SemiMajorAxis   0.131365
		Period          0.0474481
		Eccentricity    0.0512324
		Inclination     2.7052
		AscendingNode   34.5183
		ArgOfPericenter 166.029
		MeanAnomaly     1.10761
	}
}

DwarfMoon	"Cantonica System 1.D1"
{
	ParentBody     "Cantonica System 1"
	Class	       "Asteroid"

	Mass            6.68269e-009
	Radius          25.8512
	InertiaMoment   0.398

	Oblateness      0.249

	Obliquity       -0.0117765
	EqAscendNode    92.2916
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.449 0.378)

	Surface
	{
		SurfStyle       0.900073
		OceanStyle      0.845659
		Randomize      (0.246, -0.657, 0.633)
		colorDistMagn   0.99788
		colorDistFreq   0.135027
		detailScale     705.911
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513627
		terraceProb     0.241184
		erosion         0
		montesMagn      0.501576
		montesFreq      3.33008
		montesSpiky     0.875296
		montesFraction  0.521979
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61813
		hillsFraction   0.742388
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244559
		craterFreq      0.166988
		craterDensity   0.777088
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513312
		volcanoTemp     1630.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.157, 0.151, 0.050)
		colorShelf     (0.201, 0.184, 0.174, 0.040)
		colorBeach     (0.231, 0.211, 0.197, 0.030)
		colorDesert    (0.262, 0.238, 0.223, 0.020)
		colorLowland   (0.292, 0.265, 0.246, 0.030)
		colorUpland    (0.322, 0.292, 0.268, 0.050)
		colorRock      (0.352, 0.319, 0.299, 0.020)
		colorSnow      (0.352, 0.319, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.13583e-005
		Period          0.00105198
		Eccentricity    1.97249e-005
		Inclination     -0.0117765
		AscendingNode   92.2916
		ArgOfPericenter -19.9462
		MeanAnomaly     107.872
	}
}

DwarfMoon	"Cantonica System 1.D2"
{
	ParentBody     "Cantonica System 1"
	Class	       "Asteroid"

	Mass            9.15104e-009
	Radius          14.354
	InertiaMoment   0.39914

	Oblateness      0.00781034

	Obliquity       -35.0005
	EqAscendNode    140.547
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.542 0.451 0.362)

	Surface
	{
		SurfStyle       0.174769
		OceanStyle      0.0556039
		Randomize      (-0.758, -0.774, -0.484)
		colorDistMagn   0.0196505
		colorDistFreq   0.120015
		detailScale     391.959
		colorConversion true
		snowLevel       2
		tropicLatitude  0.379876
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442701
		terraceProb     0.142723
		erosion         0
		montesMagn      0.424136
		montesFreq      3.42193
		montesSpiky     0.9713
		montesFraction  0.419988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.404162
		hillsFraction   0.58352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243747
		craterFreq      0.23507
		craterDensity   1.04475
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437347
		volcanoTemp     1618.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.180, 0.145, 0.000)
		colorShelf     (0.230, 0.191, 0.154, 0.000)
		colorBeach     (0.244, 0.203, 0.163, 0.000)
		colorDesert    (0.258, 0.214, 0.172, 0.000)
		colorLowland   (0.271, 0.225, 0.181, 0.000)
		colorUpland    (0.285, 0.237, 0.190, 0.000)
		colorRock      (0.298, 0.248, 0.199, 0.000)
		colorSnow      (0.312, 0.259, 0.208, 1.000)
		BumpHeight      12.9186
		BumpOffset      2.58371
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.89477e-005
		Period          0.00226435
		Eccentricity    0.41507
		Inclination     -35.0005
		AscendingNode   140.547
		ArgOfPericenter -150.709
		MeanAnomaly     -70.5971
	}
}

Planet	"Cantonica System 2"
{
	ParentBody     "Cantonica System"
	Class	       "GasGiant"

	Mass            94.7342
	Radius          60639.6
	InertiaMoment   0.299736

	Obliquity       -1.52589
	EqAscendNode    139.966
	TidalLocked     true

	AlbedoBond      0.498582
	AlbedoGeom      0.598299
	Brightness      2

	Surface
	{
		SurfStyle       0.146033
		Randomize      (-0.451, -0.173, -0.512)
		detailScale     155968
		colorConversion true
		tropicLatitude  0.0182299
		icecapLatitude  0.91823
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.33786
		stripeFluct     0.374135
		stripeTwist     10.334
		cycloneMagn     18.4177
		cycloneFreq     0.813179
		cycloneDensity  0.270631
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
		BumpHeight      19.5361
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          136.906
		Velocity        -73.0049
		BumpHeight      57.3044
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.935008
		mainOctaves     12
		Coverage        0.485825
		stripeZones     5.33786
		stripeFluct     0.374135
		stripeTwist     10.334
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          606.396
		Density         5445.07
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0494603
		Saturation      0.823016

		Composition
		{
			H2    	92.0073
			He    	7.56623
			CH4   	0.336747
			N2    	0.0433103
			NH3   	0.02873
			O2    	0.00831688
			C2H2  	0.00417129
			C2H4  	0.00172129
			Ne    	0.00130612
			Ar    	0.00102963
			C2H6  	0.000773517
			C3H8  	0.000343098
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.274277
		Period          0.143127
		Eccentricity    0.0135398
		Inclination     -1.52589
		AscendingNode   139.966
		ArgOfPericenter 234.516
		MeanAnomaly     30.7831
	}
}

DwarfMoon	"Cantonica System 2.D1"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            1.7504e-007
	Radius          52.4152
	InertiaMoment   0.398507

	Oblateness      0.150926

	Obliquity       0.00255553
	EqAscendNode    113.519
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.592 0.590)

	Surface
	{
		SurfStyle       0.287754
		OceanStyle      0.632495
		Randomize      (0.349, -0.760, 0.769)
		colorDistMagn   0.820315
		colorDistFreq   2.35163
		detailScale     1431.28
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
		terraceProb     0.251693
		erosion         0
		montesMagn      0.438474
		montesFreq      3.12237
		montesSpiky     0.999022
		montesFraction  0.392578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.84183
		hillsFraction   0.457875
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232177
		craterFreq      0.214515
		craterDensity   1.01883
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513619
		volcanoTemp     1762.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.237, 0.236, 0.000)
		colorShelf     (0.253, 0.252, 0.251, 0.000)
		colorBeach     (0.268, 0.267, 0.266, 0.000)
		colorDesert    (0.283, 0.281, 0.280, 0.000)
		colorLowland   (0.298, 0.296, 0.295, 0.000)
		colorUpland    (0.313, 0.311, 0.310, 0.000)
		colorRock      (0.328, 0.326, 0.325, 0.000)
		colorSnow      (0.343, 0.341, 0.339, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000575748
		Period          0.000820871
		Eccentricity    3.70737e-005
		Inclination     0.00255553
		AscendingNode   113.519
		ArgOfPericenter 85.1962
		MeanAnomaly     8.50513
	}
}

DwarfMoon	"Cantonica System 2.D2"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            2.41486e-007
	Radius          92.0034
	InertiaMoment   0.399507

	Oblateness      0.249

	Obliquity       0.0117306
	EqAscendNode    -168.872
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.747 0.744)

	Surface
	{
		SurfStyle       0.330575
		OceanStyle      0.431305
		Randomize      (-0.521, -0.328, 0.423)
		colorDistMagn   0.394148
		colorDistFreq   6.67732
		detailScale     2512.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62259
		terraceProb     0.184437
		erosion         0
		montesMagn      0.487207
		montesFreq      3.31637
		montesSpiky     0.942182
		montesFraction  0.40501
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.4256
		hillsFraction   0.757761
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236648
		craterFreq      0.204139
		craterDensity   0.953694
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514605
		volcanoTemp     1332.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.297, 0.000)
		colorShelf     (0.318, 0.317, 0.316, 0.000)
		colorBeach     (0.337, 0.336, 0.335, 0.000)
		colorDesert    (0.356, 0.355, 0.353, 0.000)
		colorLowland   (0.374, 0.373, 0.372, 0.000)
		colorUpland    (0.393, 0.392, 0.390, 0.000)
		colorRock      (0.412, 0.411, 0.409, 0.000)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000587464
		Period          0.000846054
		Eccentricity    3.11842e-005
		Inclination     0.0117306
		AscendingNode   -168.872
		ArgOfPericenter 28.1999
		MeanAnomaly     -8.8445
	}
}

DwarfMoon	"Cantonica System 2.D3"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            3.35324e-007
	Radius          53.5968
	InertiaMoment   0.397157

	Oblateness      0.0711026

	Obliquity       -0.0120485
	EqAscendNode    -118.501
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.720 0.715)

	Surface
	{
		SurfStyle       0.710471
		OceanStyle      0.0824641
		Randomize      (-0.893, 0.739, -0.393)
		colorDistMagn   0.346743
		colorDistFreq   1.86571
		detailScale     1463.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650744
		terraceProb     0.409614
		erosion         0
		montesMagn      0.446985
		montesFreq      2.86141
		montesSpiky     0.894615
		montesFraction  0.829755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.08545
		hillsFraction   0.861823
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200304
		craterFreq      0.179601
		craterDensity   0.864164
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502768
		volcanoTemp     1927.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.200, 0.000)
		colorShelf     (0.289, 0.252, 0.229, 0.000)
		colorBeach     (0.340, 0.295, 0.272, 0.000)
		colorDesert    (0.368, 0.317, 0.265, 0.000)
		colorLowland   (0.405, 0.338, 0.300, 0.000)
		colorUpland    (0.448, 0.410, 0.365, 0.000)
		colorRock      (0.484, 0.446, 0.393, 0.000)
		colorSnow      (0.527, 0.475, 0.415, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000608179
		Period          0.000891197
		Eccentricity    8.50432e-005
		Inclination     -0.0120485
		AscendingNode   -118.501
		ArgOfPericenter 28.6192
		MeanAnomaly     77.5964
	}
}

DwarfMoon	"Cantonica System 2.D4"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            4.69304e-007
	Radius          56.4894
	InertiaMoment   0.398667

	Oblateness      0.0397569

	Obliquity       0.00348739
	EqAscendNode    -114.375
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.689 0.685)

	Surface
	{
		SurfStyle       0.703025
		OceanStyle      0.132204
		Randomize      (0.572, -0.401, -0.056)
		colorDistMagn   0.570054
		colorDistFreq   1.09713
		detailScale     1542.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578793
		terraceProb     0.520157
		erosion         0
		montesMagn      0.442754
		montesFreq      2.66876
		montesSpiky     0.910831
		montesFraction  0.366549
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.29517
		hillsFraction   0.673598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257161
		craterFreq      0.243848
		craterDensity   0.954714
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486236
		volcanoTemp     1424.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.192, 0.000)
		colorShelf     (0.276, 0.241, 0.219, 0.000)
		colorBeach     (0.325, 0.282, 0.260, 0.000)
		colorDesert    (0.352, 0.303, 0.254, 0.000)
		colorLowland   (0.387, 0.324, 0.288, 0.000)
		colorUpland    (0.428, 0.392, 0.349, 0.000)
		colorRock      (0.463, 0.427, 0.377, 0.000)
		colorSnow      (0.505, 0.454, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000696906
		Period          0.00109317
		Eccentricity    5.4859e-005
		Inclination     0.00348739
		AscendingNode   -114.375
		ArgOfPericenter 162.403
		MeanAnomaly     40.8913
	}
}

DwarfMoon	"Cantonica System 2.D5"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            6.63064e-007
	Radius          155.48
	InertiaMoment   0.399635

	Oblateness      0.249

	Obliquity       -0.00600449
	EqAscendNode    62.857
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.435 0.433 0.430)

	Surface
	{
		SurfStyle       0.704773
		OceanStyle      0.804129
		Randomize      (0.293, 0.428, 0.737)
		colorDistMagn   0.579301
		colorDistFreq   11.6516
		detailScale     4245.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.33013
		terraceProb     0.287901
		erosion         0
		montesMagn      0.481046
		montesFreq      3.08918
		montesSpiky     0.908558
		montesFraction  0.617374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       52.7407
		hillsFraction   0.549821
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250764
		craterFreq      0.819461
		craterDensity   0.900807
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461879
		volcanoTemp     1437.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.147, 0.120, 0.000)
		colorShelf     (0.174, 0.151, 0.137, 0.000)
		colorBeach     (0.204, 0.177, 0.163, 0.000)
		colorDesert    (0.222, 0.190, 0.159, 0.000)
		colorLowland   (0.244, 0.203, 0.180, 0.000)
		colorUpland    (0.270, 0.247, 0.219, 0.000)
		colorRock      (0.291, 0.268, 0.236, 0.000)
		colorSnow      (0.318, 0.286, 0.249, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000748957
		Period          0.0012179
		Eccentricity    8.5579e-005
		Inclination     -0.00600449
		AscendingNode   62.857
		ArgOfPericenter -113.895
		MeanAnomaly     43.3182
	}
}

DwarfMoon	"Cantonica System 2.D6"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            9.47505e-007
	Radius          82.0054
	InertiaMoment   0.397465

	Oblateness      0.043802

	Obliquity       -0.00395491
	EqAscendNode    65.3647
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.446 0.444 0.440)

	Surface
	{
		SurfStyle       0.814157
		OceanStyle      0.465729
		Randomize      (0.020, -0.979, 0.635)
		colorDistMagn   0.797951
		colorDistFreq   2.42341
		detailScale     2239.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596042
		terraceProb     0.447567
		erosion         0
		montesMagn      0.46371
		montesFreq      3.63302
		montesSpiky     0.943205
		montesFraction  0.407982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.6659
		hillsFraction   0.555914
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221269
		craterFreq      0.254225
		craterDensity   0.826684
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531394
		volcanoTemp     1777.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.151, 0.123, 0.000)
		colorShelf     (0.178, 0.155, 0.141, 0.000)
		colorBeach     (0.210, 0.182, 0.167, 0.000)
		colorDesert    (0.228, 0.195, 0.163, 0.000)
		colorLowland   (0.250, 0.209, 0.185, 0.000)
		colorUpland    (0.277, 0.253, 0.225, 0.000)
		colorRock      (0.299, 0.275, 0.242, 0.000)
		colorSnow      (0.326, 0.293, 0.255, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000773858
		Period          0.00127914
		Eccentricity    1.33597e-006
		Inclination     -0.00395491
		AscendingNode   65.3647
		ArgOfPericenter -42.4844
		MeanAnomaly     -60.3154
	}
}

DwarfMoon	"Cantonica System 2.D7"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            1.37249e-006
	Radius          157.906
	InertiaMoment   0.398819

	Oblateness      0.163952

	Obliquity       0.00513882
	EqAscendNode    -41.8398
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.624 0.622)

	Surface
	{
		SurfStyle       0.941224
		OceanStyle      0.497215
		Randomize      (0.958, 0.453, -0.381)
		colorDistMagn   0.696851
		colorDistFreq   18.5534
		detailScale     4311.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49932
		terraceProb     0.399239
		erosion         0
		montesMagn      0.557504
		montesFreq      2.15792
		montesSpiky     0.888321
		montesFraction  0.412375
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.4162
		hillsFraction   0.660157
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241032
		craterFreq      0.822042
		craterDensity   0.895566
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532435
		volcanoTemp     1599.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.218, 0.249, 0.050)
		colorShelf     (0.251, 0.256, 0.286, 0.040)
		colorBeach     (0.289, 0.293, 0.323, 0.030)
		colorDesert    (0.326, 0.331, 0.367, 0.020)
		colorLowland   (0.364, 0.368, 0.404, 0.030)
		colorUpland    (0.402, 0.405, 0.442, 0.050)
		colorRock      (0.439, 0.443, 0.491, 0.020)
		colorSnow      (0.439, 0.443, 0.491, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00084964
		Period          0.00147156
		Eccentricity    8.75217e-005
		Inclination     0.00513882
		AscendingNode   -41.8398
		ArgOfPericenter -71.8024
		MeanAnomaly     88.6972
	}
}

DwarfMoon	"Cantonica System 2.D8"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            2.02082e-006
	Radius          92.7209
	InertiaMoment   0.399761

	Oblateness      0.0197717

	Obliquity       -0.00892074
	EqAscendNode    -155.538
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.544 0.540 0.535)

	Surface
	{
		SurfStyle       0.14745
		OceanStyle      0.0210897
		Randomize      (-0.969, -0.803, -0.571)
		colorDistMagn   0.841674
		colorDistFreq   4.29564
		detailScale     2531.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533231
		terraceProb     0.728703
		erosion         0
		montesMagn      0.452061
		montesFreq      2.7157
		montesSpiky     0.96219
		montesFraction  0.559602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.9097
		hillsFraction   0.834316
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227806
		craterFreq      0.332831
		craterDensity   0.969272
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.596301
		volcanoTemp     1176.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.216, 0.214, 0.000)
		colorShelf     (0.231, 0.229, 0.227, 0.000)
		colorBeach     (0.245, 0.243, 0.241, 0.000)
		colorDesert    (0.258, 0.256, 0.254, 0.000)
		colorLowland   (0.272, 0.270, 0.267, 0.000)
		colorUpland    (0.285, 0.283, 0.281, 0.000)
		colorRock      (0.299, 0.297, 0.294, 0.000)
		colorSnow      (0.313, 0.310, 0.308, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000888677
		Period          0.00157414
		Eccentricity    8.4105e-005
		Inclination     -0.00892074
		AscendingNode   -155.538
		ArgOfPericenter -160.911
		MeanAnomaly     -137.716
	}
}

DwarfMoon	"Cantonica System 2.D9"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            3.03482e-006
	Radius          97.6239
	InertiaMoment   0.397722

	RotationPeriod  190.459
	Obliquity       -76.1628
	EqAscendNode    -67.1612

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.677 0.632)

	Surface
	{
		SurfStyle       0.279766
		OceanStyle      0.0776701
		Randomize      (-0.091, -0.098, 0.073)
		colorDistMagn   0.595906
		colorDistFreq   2.59407
		detailScale     2665.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406197
		terraceProb     0.332948
		erosion         0
		montesMagn      0.588124
		montesFreq      3.43446
		montesSpiky     0.945523
		montesFraction  0.658725
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.0692
		hillsFraction   0.615165
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211439
		craterFreq      0.361908
		craterDensity   0.848502
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481791
		volcanoTemp     1235.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.271, 0.253, 0.000)
		colorShelf     (0.310, 0.288, 0.269, 0.000)
		colorBeach     (0.328, 0.305, 0.284, 0.000)
		colorDesert    (0.346, 0.322, 0.300, 0.000)
		colorLowland   (0.364, 0.339, 0.316, 0.000)
		colorUpland    (0.383, 0.356, 0.332, 0.000)
		colorRock      (0.401, 0.373, 0.348, 0.000)
		colorSnow      (0.419, 0.389, 0.363, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00245833
		Period          0.00724248
		Eccentricity    0.130437
		Inclination     -76.1628
		AscendingNode   -67.1612
		ArgOfPericenter -14.151
		MeanAnomaly     148.534
	}
}

DwarfMoon	"Cantonica System 2.D10"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            4.66909e-006
	Radius          251.117
	InertiaMoment   0.398965

	Oblateness      0.00175934

	RotationPeriod  135.434
	Obliquity       -40.0036
	EqAscendNode    -89.3339

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.713 0.601 0.559)

	Surface
	{
		SurfStyle       0.399896
		OceanStyle      0.308584
		Randomize      (-0.579, -0.789, 0.541)
		colorDistMagn   0.492607
		colorDistFreq   47.5109
		detailScale     6857.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.813218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624205
		terraceProb     0.267059
		erosion         0
		montesMagn      0.484744
		montesFreq      2.74765
		montesSpiky     0.968445
		montesFraction  0.553941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       154.094
		hillsFraction   0.494472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225428
		craterFreq      2.75624
		craterDensity   0.918778
		craterOctaves   17
		volcanoActivity 0.620583
		volcanoFlows    0
		volcanoRadius   0.430244
		volcanoTemp     1477.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.240, 0.224, 0.000)
		colorShelf     (0.303, 0.255, 0.238, 0.000)
		colorBeach     (0.321, 0.270, 0.252, 0.000)
		colorDesert    (0.339, 0.285, 0.266, 0.000)
		colorLowland   (0.357, 0.300, 0.280, 0.000)
		colorUpland    (0.374, 0.315, 0.294, 0.000)
		colorRock      (0.392, 0.330, 0.308, 0.000)
		colorSnow      (0.410, 0.345, 0.322, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00310894
		Period          0.0103002
		Eccentricity    0.499054
		Inclination     -40.0035
		AscendingNode   -89.3339
		ArgOfPericenter -104.427
		MeanAnomaly     -14.9017
	}
}

DwarfMoon	"Cantonica System 2.D11"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            1.30525e-011
	Radius          1.848
	InertiaMoment   0.399886

	RotationPeriod  500.914
	Obliquity       -41.3632
	EqAscendNode    -136.077

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.416 0.342)

	Surface
	{
		SurfStyle       0.994089
		OceanStyle      0.203868
		Randomize      (-0.104, -0.834, -0.016)
		colorDistMagn   0.786429
		colorDistFreq   0.000903759
		detailScale     50.4628
		colorConversion true
		snowLevel       2
		tropicLatitude  0.478944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51195
		terraceProb     0.262967
		erosion         0
		montesMagn      0.546696
		montesFreq      2.98644
		montesSpiky     0.9395
		montesFraction  0.604637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00624045
		hillsFraction   0.533837
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232425
		craterFreq      0.174344
		craterDensity   1.00288
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517846
		volcanoTemp     1604.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.146, 0.137, 0.050)
		colorShelf     (0.223, 0.171, 0.157, 0.040)
		colorBeach     (0.257, 0.196, 0.178, 0.030)
		colorDesert    (0.290, 0.221, 0.202, 0.020)
		colorLowland   (0.324, 0.246, 0.222, 0.030)
		colorUpland    (0.357, 0.271, 0.243, 0.050)
		colorRock      (0.390, 0.296, 0.270, 0.020)
		colorSnow      (0.390, 0.296, 0.270, 1.000)
		BumpHeight      1.6632
		BumpOffset      0.332641
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00333209
		Period          0.0114288
		Eccentricity    0.261689
		Inclination     -41.3632
		AscendingNode   -136.077
		ArgOfPericenter 15.8522
		MeanAnomaly     -57.4774
	}
}

DwarfMoon	"Cantonica System 2.D12"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            2.63743e-011
	Radius          4.08657
	InertiaMoment   0.397947

	Oblateness      0.00148635

	Obliquity       -30.2776
	EqAscendNode    -107.047
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.557 0.555 0.551)

	Surface
	{
		SurfStyle       0.0472357
		OceanStyle      0.287782
		Randomize      (-0.502, 0.373, -0.902)
		colorDistMagn   0.313533
		colorDistFreq   0.00803865
		detailScale     111.591
		colorConversion true
		snowLevel       2
		tropicLatitude  0.571911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483753
		terraceProb     0.294244
		erosion         0
		montesMagn      0.443047
		montesFreq      3.55561
		montesSpiky     0.854277
		montesFraction  0.759817
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0417289
		hillsFraction   0.463101
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245858
		craterFreq      0.191473
		craterDensity   0.92059
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506987
		volcanoTemp     1939.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.222, 0.220, 0.000)
		colorShelf     (0.237, 0.236, 0.234, 0.000)
		colorBeach     (0.250, 0.250, 0.248, 0.000)
		colorDesert    (0.264, 0.263, 0.262, 0.000)
		colorLowland   (0.278, 0.277, 0.275, 0.000)
		colorUpland    (0.292, 0.291, 0.289, 0.000)
		colorRock      (0.306, 0.305, 0.303, 0.000)
		colorSnow      (0.320, 0.319, 0.317, 1.000)
		BumpHeight      3.67792
		BumpOffset      0.735583
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00393276
		Period          0.0146545
		Eccentricity    0.026678
		Inclination     -30.2776
		AscendingNode   -107.047
		ArgOfPericenter 5.88741
		MeanAnomaly     -43.2026
	}
}

DwarfMoon	"Cantonica System 2.D13"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            4.85895e-011
	Radius          2.50625
	InertiaMoment   0.399105

	Obliquity       -35.2653
	EqAscendNode    -108.288
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.649 0.647)

	Surface
	{
		SurfStyle       0.638941
		OceanStyle      0.0462503
		Randomize      (0.893, 0.884, -0.245)
		colorDistMagn   0.506783
		colorDistFreq   0.00454777
		detailScale     68.4373
		colorConversion true
		snowLevel       2
		tropicLatitude  0.636528
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657266
		terraceProb     0.125163
		erosion         0
		montesMagn      0.59287
		montesFreq      3.29462
		montesSpiky     0.85475
		montesFraction  0.551647
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0210905
		hillsFraction   0.580174
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23927
		craterFreq      0.1434
		craterDensity   0.974337
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.589922
		volcanoTemp     1630.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.221, 0.181, 0.000)
		colorShelf     (0.261, 0.227, 0.207, 0.000)
		colorBeach     (0.307, 0.266, 0.246, 0.000)
		colorDesert    (0.333, 0.285, 0.239, 0.000)
		colorLowland   (0.365, 0.305, 0.272, 0.000)
		colorUpland    (0.405, 0.370, 0.330, 0.000)
		colorRock      (0.437, 0.402, 0.356, 0.000)
		colorSnow      (0.476, 0.428, 0.375, 1.000)
		BumpHeight      2.25562
		BumpOffset      0.451125
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0044105
		Period          0.0174044
		Eccentricity    0.0815331
		Inclination     -35.2653
		AscendingNode   -108.288
		ArgOfPericenter 55.9578
		MeanAnomaly     -65.737
	}
}

DwarfMoon	"Cantonica System 2.D14"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            8.38487e-011
	Radius          3.75559
	InertiaMoment   0.394321

	Obliquity       42.6509
	EqAscendNode    42.6801
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.416 0.364)

	Surface
	{
		SurfStyle       0.365042
		OceanStyle      0.562356
		Randomize      (-0.792, 0.497, -0.904)
		colorDistMagn   0.669453
		colorDistFreq   0.00628801
		detailScale     102.553
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979078
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739822
		terraceProb     0.149903
		erosion         0
		montesMagn      0.505505
		montesFreq      3.90402
		montesSpiky     0.911012
		montesFraction  0.872302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0273944
		hillsFraction   0.870615
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247188
		craterFreq      0.194955
		craterDensity   0.939966
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521213
		volcanoTemp     1269.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.166, 0.146, 0.000)
		colorShelf     (0.236, 0.177, 0.155, 0.000)
		colorBeach     (0.250, 0.187, 0.164, 0.000)
		colorDesert    (0.264, 0.197, 0.173, 0.000)
		colorLowland   (0.278, 0.208, 0.182, 0.000)
		colorUpland    (0.292, 0.218, 0.191, 0.000)
		colorRock      (0.305, 0.229, 0.200, 0.000)
		colorSnow      (0.319, 0.239, 0.209, 1.000)
		BumpHeight      3.38004
		BumpOffset      0.676007
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00504118
		Period          0.0212679
		Eccentricity    0.204302
		Inclination     42.6509
		AscendingNode   42.6801
		ArgOfPericenter 8.1624
		MeanAnomaly     144.169
	}
}

DwarfMoon	"Cantonica System 2.D15"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            1.3782e-010
	Radius          7.42657
	InertiaMoment   0.398148

	Oblateness      0.00153074

	Obliquity       -17.0697
	EqAscendNode    -174.342
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.650 0.648)

	Surface
	{
		SurfStyle       0.169174
		OceanStyle      0.0560645
		Randomize      (0.113, 0.283, 0.997)
		colorDistMagn   0.82523
		colorDistFreq   0.0207826
		detailScale     202.795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0289727
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62248
		terraceProb     0.130428
		erosion         0
		montesMagn      0.611072
		montesFreq      2.66344
		montesSpiky     0.947464
		montesFraction  0.099143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.115374
		hillsFraction   0.698982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224737
		craterFreq      0.241241
		craterDensity   1.01637
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.567622
		volcanoTemp     1608.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.259, 0.000)
		colorShelf     (0.277, 0.276, 0.275, 0.000)
		colorBeach     (0.293, 0.293, 0.292, 0.000)
		colorDesert    (0.310, 0.309, 0.308, 0.000)
		colorLowland   (0.326, 0.325, 0.324, 0.000)
		colorUpland    (0.342, 0.341, 0.340, 0.000)
		colorRock      (0.359, 0.358, 0.356, 0.000)
		colorSnow      (0.375, 0.374, 0.373, 1.000)
		BumpHeight      6.68392
		BumpOffset      1.33678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00534555
		Period          0.0232228
		Eccentricity    0.0729592
		Inclination     -17.0697
		AscendingNode   -174.342
		ArgOfPericenter 71.3813
		MeanAnomaly     87.7299
	}
}

DwarfMoon	"Cantonica System 2.D16"
{
	ParentBody     "Cantonica System 2"
	Class	       "Asteroid"

	Mass            2.18185e-010
	Radius          4.49081
	InertiaMoment   0.399241

	Obliquity       35.8032
	EqAscendNode    -60.0148
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.435 0.369)

	Surface
	{
		SurfStyle       0.0520996
		OceanStyle      0.327744
		Randomize      (-0.568, 0.294, -0.937)
		colorDistMagn   0.124542
		colorDistFreq   0.010181
		detailScale     122.629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873551
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.645525
		terraceProb     0.167128
		erosion         0
		montesMagn      0.53526
		montesFreq      3.27724
		montesSpiky     0.83677
		montesFraction  0.923175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0607631
		hillsFraction   0.554528
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258821
		craterFreq      0.236672
		craterDensity   0.730521
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473473
		volcanoTemp     1313.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.174, 0.148, 0.000)
		colorShelf     (0.269, 0.185, 0.157, 0.000)
		colorBeach     (0.285, 0.196, 0.166, 0.000)
		colorDesert    (0.301, 0.207, 0.175, 0.000)
		colorLowland   (0.317, 0.218, 0.185, 0.000)
		colorUpland    (0.333, 0.229, 0.194, 0.000)
		colorRock      (0.348, 0.240, 0.203, 0.000)
		colorSnow      (0.364, 0.250, 0.212, 1.000)
		BumpHeight      4.04173
		BumpOffset      0.808345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00599988
		Period          0.0276147
		Eccentricity    0.0824717
		Inclination     35.8032
		AscendingNode   -60.0148
		ArgOfPericenter 15.7119
		MeanAnomaly     -58.3226
	}
}

Planet	"Cantonica System 4"
{
	ParentBody     "Cantonica System"
	Class	       "GasGiant"

	Mass            707.338
	Radius          77620.3
	InertiaMoment   0.220515

	Oblateness      0.0434026

	RotationPeriod  8.75208
	Obliquity       41.3522
	EqAscendNode    -46.9497

	AlbedoBond      0.504979
	AlbedoGeom      0.605975
	Brightness      2

	Surface
	{
		SurfStyle       0.393986
		OceanStyle      0
		Randomize      (-0.241, 0.382, -0.526)
		colorDistMagn   0
		colorDistFreq   -1.#IND
		detailScale     199644
		colorConversion true
		drivenDarkening -1
		seaLevel        -1
		snowLevel       0
		tropicLatitude  0.673912
		icecapLatitude  1
		icecapHeight    0
		climatePole     0
		climateTropic   0
		climateEquator  0
		heightTempGrad  0
		tropicWidth     0
		mainFreq        0
		venusFreq       0
		venusMagn       0
		mareFreq        -1.#IND
		mareDensity     0
		terraceProb     0
		erosion         0
		montesMagn      0
		montesFreq      0
		montesSpiky     0
		montesFraction  0
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      0
		riversSin       0
		riversOctaves   0
		canyonsMagn     0
		canyonsFreq     0
		canyonFraction  0
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      0
		craterFreq      0
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
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.77812
		stripeFluct     0.35476
		stripeTwist     8.15972
		cycloneMagn     11.4636
		cycloneFreq     0.857023
		cycloneDensity  0.273166
		cycloneOctaves  5
		colorLayer0    (0.120, 0.200, 0.480, 1.100)
		colorLayer1    (0.330, 0.400, 0.720, 0.600)
		colorLayer2    (0.330, 0.400, 0.720, 0.100)
		colorLayer3    (0.600, 0.600, 0.600, 0.000)
		colorLayer4    (0.350, 0.430, 0.770, 0.000)
		colorLayer5    (0.470, 0.540, 0.850, 0.000)
		colorLayer6    (0.600, 0.650, 0.910, 0.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 0.000)
		colorUpPlants  (0.470, 0.540, 0.850, 0.000)
		BumpHeight      9.15162
		SpecBrightWater 0
		SpecBrightIce   0
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          50.5078
		Velocity        686.412
		BumpHeight      41.3551
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.10656
		mainOctaves     12
		Coverage        0.549793
		stripeZones     2.77812
		stripeFluct     0.35476
		stripeTwist     8.15972
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          215.927
		Density         5400.6
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.015621
		Saturation      0.940036

		Composition
		{
			H2    	92.4137
			He    	7.23765
			CH4   	0.26976
			N2    	0.0391226
			NH3   	0.024048
			O2    	0.00777064
			C2H2  	0.00357673
			C2H4  	0.00146341
			Ne    	0.00111638
			Ar    	0.000899886
			C2H6  	0.00057868
			C3H8  	0.000297107
		}
	}

	Aurora
	{
		Height      3769.43
		NorthLat    82.7503
		NorthLon    88.1938
		NorthRadius 14769.6
		NorthWidth  5723.33
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.4509
		SouthLon    260.334
		SouthRadius 19457.4
		SouthWidth  10652.3
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
		SemiMajorAxis   1.2
		Period          0.696188
		Eccentricity    0.0821246
		Inclination     1.73659
		AscendingNode   -54.9216
		ArgOfPericenter 251.998
		MeanAnomaly     132.756
	}
}

Moon	"Cantonica System 4.1"
{
	ParentBody     "Cantonica System 4"
	Class	       "Desert"

	Mass            0.169066
	Radius          4070.87
	InertiaMoment   0.329311

	Oblateness      0.00668092

	Obliquity       0.123083
	EqAscendNode    117.723
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.473 0.409 0.386)

	Surface
	{
		SurfStyle       0.233536
		OceanStyle      0.671113
		Randomize      (-0.556, -0.321, 0.403)
		colorDistMagn   0.0814293
		colorDistFreq   473.151
		detailScale     10470.5
		colorConversion true
		seaLevel        0.132295
		snowLevel       2
		tropicLatitude  0.00221079
		icecapLatitude  10
		icecapHeight    0.1906
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.990779
		venusFreq       0.705832
		venusMagn       0.435665
		mareFreq        1.69076
		mareDensity     0.0345469
		terraceProb     0.10498
		erosion         0
		montesMagn      0.245198
		montesFreq      191.262
		montesSpiky     0.875157
		montesFraction  0.71221
		dunesMagn       0.0509308
		dunesFreq       43.6603
		dunesFraction   0.81087
		hillsMagn       0.109774
		hillsFreq       352.46
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.8251
		riversFreq      2.99235
		riversSin       5.43134
		riversOctaves   0
		canyonsMagn     0.0173756
		canyonsFreq     121.207
		canyonFraction  0
		cracksMagn      0.125971
		cracksFreq      0.361922
		cracksOctaves   0
		craterMagn      0.5797
		craterFreq      12.1664
		craterDensity   0.319663
		craterOctaves   4.60547
		volcanoMagn     0.728355
		volcanoFreq     0.6387
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.393883
		volcanoRadius   0.434625
		volcanoTemp     1273.37
		lavaCoverTidal  0.620969
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
		Hapke           0.975926
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
		Height          108.509
		Density         0.00240739
		Pressure        0.00245439
		Greenhouse      0.569725
		Bright          4.7458
		Opacity         1
		SkyLight        1.58193
		Hue             -0.0220569
		Saturation      1

		Composition
		{
			CO2   	93.8578
			H2S   	3.79102
			SO2   	1.29478
			C2H2  	0.447143
			C2H6  	0.296105
			C2H4  	0.181611
			C3H8  	0.0996872
			N2    	0.0302622
			Ar    	0.00149704
			CO    	8.47654e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00229445
		Period          0.00238964
		Eccentricity    0.0290003
		Inclination     0.123083
		AscendingNode   117.723
		ArgOfPericenter 72.2105
		MeanAnomaly     124.492
	}
}

DwarfMoon	"Cantonica System 4.D1"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            6.88141e-007
	Radius          140.56
	InertiaMoment   0.395665

	RotationPeriod  462.363
	Obliquity       72.9208
	EqAscendNode    173.323

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.638 0.634)

	Surface
	{
		SurfStyle       0.420227
		OceanStyle      0.228673
		Randomize      (-0.673, 0.608, 0.561)
		colorDistMagn   0.799514
		colorDistFreq   12.2767
		detailScale     3838.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.111168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325929
		terraceProb     0.27448
		erosion         0
		montesMagn      0.538139
		montesFreq      2.79261
		montesSpiky     0.616988
		montesFraction  0.71963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       44.9207
		hillsFraction   0.495723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259316
		craterFreq      0.850664
		craterDensity   0.685903
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522101
		volcanoTemp     1429.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.255, 0.254, 0.000)
		colorShelf     (0.274, 0.271, 0.270, 0.000)
		colorBeach     (0.290, 0.287, 0.285, 0.000)
		colorDesert    (0.306, 0.303, 0.301, 0.000)
		colorLowland   (0.322, 0.319, 0.317, 0.000)
		colorUpland    (0.338, 0.335, 0.333, 0.000)
		colorRock      (0.354, 0.351, 0.349, 0.000)
		colorSnow      (0.371, 0.367, 0.365, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0128425
		Period          0.0316477
		Eccentricity    0.188662
		Inclination     72.9208
		AscendingNode   173.323
		ArgOfPericenter -120.798
		MeanAnomaly     89.8179
	}
}

DwarfMoon	"Cantonica System 4.D2"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.8464e-007
	Radius          81.2742
	InertiaMoment   0.398245

	RotationPeriod  1157.42
	Obliquity       11.682
	EqAscendNode    51.8336

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.484 0.479)

	Surface
	{
		SurfStyle       0.379687
		OceanStyle      0.286417
		Randomize      (0.477, 0.500, 0.012)
		colorDistMagn   0.29994
		colorDistFreq   3.36243
		detailScale     2219.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.358143
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486132
		terraceProb     0.211767
		erosion         0
		montesMagn      0.558886
		montesFreq      2.4477
		montesSpiky     0.929355
		montesFraction  0.812623
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.4711
		hillsFraction   0.633822
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236342
		craterFreq      0.256127
		craterDensity   0.964245
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508101
		volcanoTemp     935.542
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.193, 0.191, 0.000)
		colorShelf     (0.207, 0.206, 0.203, 0.000)
		colorBeach     (0.220, 0.218, 0.215, 0.000)
		colorDesert    (0.232, 0.230, 0.227, 0.000)
		colorLowland   (0.244, 0.242, 0.239, 0.000)
		colorUpland    (0.256, 0.254, 0.251, 0.000)
		colorRock      (0.268, 0.266, 0.263, 0.000)
		colorSnow      (0.280, 0.278, 0.275, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0132084
		Period          0.0330095
		Eccentricity    0.325124
		Inclination     11.682
		AscendingNode   51.8336
		ArgOfPericenter -29.5759
		MeanAnomaly     120.023
	}
}

DwarfMoon	"Cantonica System 4.D3"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.42854e-006
	Radius          158.316
	InertiaMoment   0.39931

	Obliquity       39.6253
	EqAscendNode    -45.8567
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.458 0.453 0.447)

	Surface
	{
		SurfStyle       0.283875
		OceanStyle      0.330842
		Randomize      (0.515, -0.888, -0.386)
		colorDistMagn   0.578504
		colorDistFreq   6.85808
		detailScale     4323.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561435
		terraceProb     0.111044
		erosion         0
		montesMagn      0.365291
		montesFreq      3.7953
		montesSpiky     0.992677
		montesFraction  0.210899
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.5186
		hillsFraction   0.58578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265529
		craterFreq      1.00036
		craterDensity   0.956837
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516896
		volcanoTemp     1399.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.181, 0.179, 0.000)
		colorShelf     (0.195, 0.193, 0.190, 0.000)
		colorBeach     (0.206, 0.204, 0.201, 0.000)
		colorDesert    (0.218, 0.215, 0.213, 0.000)
		colorLowland   (0.229, 0.227, 0.224, 0.000)
		colorUpland    (0.240, 0.238, 0.235, 0.000)
		colorRock      (0.252, 0.249, 0.246, 0.000)
		colorSnow      (0.263, 0.261, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0134975
		Period          0.0340995
		Eccentricity    0.367404
		Inclination     39.6253
		AscendingNode   -45.8567
		ArgOfPericenter 136.275
		MeanAnomaly     -109.505
	}
}

DwarfMoon	"Cantonica System 4.D4"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.10738e-006
	Radius          92.4269
	InertiaMoment   0.396499

	RotationPeriod  627.656
	Obliquity       45.0907
	EqAscendNode    -179.543

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.572 0.568)

	Surface
	{
		SurfStyle       0.956389
		OceanStyle      0.993905
		Randomize      (0.400, -0.873, -0.799)
		colorDistMagn   0.11461
		colorDistFreq   1.13856
		detailScale     2523.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00564169
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474265
		terraceProb     0.277651
		erosion         0
		montesMagn      0.332697
		montesFreq      1.20184
		montesSpiky     0.907105
		montesFraction  0.325869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.7014
		hillsFraction   0.560282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252984
		craterFreq      0.315774
		craterDensity   0.794814
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570594
		volcanoTemp     1756.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.200, 0.227, 0.050)
		colorShelf     (0.231, 0.234, 0.261, 0.040)
		colorBeach     (0.265, 0.269, 0.295, 0.030)
		colorDesert    (0.300, 0.303, 0.335, 0.020)
		colorLowland   (0.334, 0.337, 0.369, 0.030)
		colorUpland    (0.369, 0.372, 0.403, 0.050)
		colorRock      (0.404, 0.406, 0.449, 0.020)
		colorSnow      (0.404, 0.406, 0.449, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.013943
		Period          0.0358013
		Eccentricity    0.404208
		Inclination     45.0907
		AscendingNode   -179.543
		ArgOfPericenter -47.8611
		MeanAnomaly     -176.254
	}
}

DwarfMoon	"Cantonica System 4.D5"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.17217e-006
	Radius          241.429
	InertiaMoment   0.398422

	Obliquity       67.907
	EqAscendNode    -102.335
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.432 0.427 0.422)

	Surface
	{
		SurfStyle       0.919488
		OceanStyle      0.575146
		Randomize      (-0.995, 0.533, -0.786)
		colorDistMagn   0.921558
		colorDistFreq   19.2335
		detailScale     6592.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94576
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697905
		terraceProb     0.246106
		erosion         0
		montesMagn      0.532662
		montesFreq      2.70104
		montesSpiky     0.981319
		montesFraction  0.766848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       128.874
		hillsFraction   0.362715
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242078
		craterFreq      2.43252
		craterDensity   0.871973
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521772
		volcanoTemp     1677.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.147, 0.149, 0.169, 0.050)
		colorShelf     (0.173, 0.175, 0.194, 0.040)
		colorBeach     (0.199, 0.201, 0.220, 0.030)
		colorDesert    (0.225, 0.226, 0.249, 0.020)
		colorLowland   (0.251, 0.252, 0.274, 0.030)
		colorUpland    (0.277, 0.278, 0.300, 0.050)
		colorRock      (0.303, 0.303, 0.334, 0.020)
		colorSnow      (0.303, 0.303, 0.334, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0142207
		Period          0.0368763
		Eccentricity    0.397952
		Inclination     67.9069
		AscendingNode   -102.335
		ArgOfPericenter -25.5305
		MeanAnomaly     -70.2013
	}
}

DwarfMoon	"Cantonica System 4.D6"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.89439e-006
	Radius          140.253
	InertiaMoment   0.399441

	RotationPeriod  509.588
	Obliquity       -27.9395
	EqAscendNode    23.0651

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.543 0.539 0.531)

	Surface
	{
		SurfStyle       0.136849
		OceanStyle      0.293245
		Randomize      (-0.186, 0.638, 0.191)
		colorDistMagn   0.888257
		colorDistFreq   9.21545
		detailScale     3829.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.815689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709918
		terraceProb     0.506322
		erosion         0
		montesMagn      0.353971
		montesFreq      3.39224
		montesSpiky     0.873425
		montesFraction  0.607529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       44.5867
		hillsFraction   0.649572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255113
		craterFreq      0.739048
		craterDensity   0.998805
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462254
		volcanoTemp     1529.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.216, 0.212, 0.000)
		colorShelf     (0.231, 0.229, 0.225, 0.000)
		colorBeach     (0.244, 0.243, 0.239, 0.000)
		colorDesert    (0.258, 0.256, 0.252, 0.000)
		colorLowland   (0.272, 0.269, 0.265, 0.000)
		colorUpland    (0.285, 0.283, 0.279, 0.000)
		colorRock      (0.299, 0.296, 0.292, 0.000)
		colorSnow      (0.312, 0.310, 0.305, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0146999
		Period          0.0387557
		Eccentricity    0.24564
		Inclination     -27.9395
		AscendingNode   23.0651
		ArgOfPericenter -152.731
		MeanAnomaly     -54.0329
	}
}

DwarfMoon	"Cantonica System 4.D7"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.41369e-011
	Radius          3.41817
	InertiaMoment   0.396971

	Obliquity       -61.8389
	EqAscendNode    50.0279
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.386 0.333)

	Surface
	{
		SurfStyle       0.779766
		OceanStyle      0.113268
		Randomize      (0.855, -0.470, 0.941)
		colorDistMagn   0.324742
		colorDistFreq   0.00258088
		detailScale     93.3389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50169
		terraceProb     0.274855
		erosion         0
		montesMagn      0.330739
		montesFreq      2.43783
		montesSpiky     0.946165
		montesFraction  0.942865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.027729
		hillsFraction   0.404312
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234519
		craterFreq      0.2462
		craterDensity   0.812953
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476339
		volcanoTemp     1686
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.131, 0.093, 0.000)
		colorShelf     (0.208, 0.135, 0.107, 0.000)
		colorBeach     (0.245, 0.158, 0.127, 0.000)
		colorDesert    (0.266, 0.170, 0.123, 0.000)
		colorLowland   (0.292, 0.181, 0.140, 0.000)
		colorUpland    (0.323, 0.220, 0.170, 0.000)
		colorRock      (0.349, 0.239, 0.183, 0.000)
		colorSnow      (0.380, 0.255, 0.193, 1.000)
		BumpHeight      3.07636
		BumpOffset      0.615271
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0151702
		Period          0.0406304
		Eccentricity    0.00772705
		Inclination     -61.8389
		AscendingNode   50.0279
		ArgOfPericenter 178.583
		MeanAnomaly     61.5352
	}
}

DwarfMoon	"Cantonica System 4.D8"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.82385e-011
	Radius          2.21568
	InertiaMoment   0.398587

	Obliquity       31.2781
	EqAscendNode    14.7008
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.500 0.495)

	Surface
	{
		SurfStyle       0.94421
		OceanStyle      0.202403
		Randomize      (-0.906, -0.402, -0.213)
		colorDistMagn   0.167203
		colorDistFreq   0.00248112
		detailScale     60.5028
		colorConversion true
		snowLevel       2
		tropicLatitude  0.882824
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75048
		terraceProb     0.513165
		erosion         0
		montesMagn      0.362574
		montesFreq      2.96875
		montesSpiky     0.779649
		montesFraction  0.519437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00978834
		hillsFraction   0.733975
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243167
		craterFreq      0.149842
		craterDensity   0.799424
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449968
		volcanoTemp     1603.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.175, 0.198, 0.050)
		colorShelf     (0.201, 0.205, 0.228, 0.040)
		colorBeach     (0.231, 0.235, 0.257, 0.030)
		colorDesert    (0.262, 0.265, 0.292, 0.020)
		colorLowland   (0.292, 0.295, 0.322, 0.030)
		colorUpland    (0.322, 0.325, 0.351, 0.050)
		colorRock      (0.352, 0.355, 0.391, 0.020)
		colorSnow      (0.352, 0.355, 0.391, 1.000)
		BumpHeight      1.99411
		BumpOffset      0.398822
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0158178
		Period          0.04326
		Eccentricity    0.120878
		Inclination     31.2781
		AscendingNode   14.7008
		ArgOfPericenter 93.7288
		MeanAnomaly     -34.1168
	}
}

DwarfMoon	"Cantonica System 4.D9"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.16121e-011
	Radius          6.89767
	InertiaMoment   0.39957

	RotationPeriod  267.281
	Obliquity       -66.023
	EqAscendNode    -109.853

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.478 0.427)

	Surface
	{
		SurfStyle       0.998688
		OceanStyle      0.137471
		Randomize      (-0.807, -0.817, -0.516)
		colorDistMagn   0.436122
		colorDistFreq   0.0254461
		detailScale     188.352
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366052
		terraceProb     0.412064
		erosion         0
		montesMagn      0.547426
		montesFreq      3.44051
		montesSpiky     0.983272
		montesFraction  0.316679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.149577
		hillsFraction   0.496809
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270126
		craterFreq      0.262969
		craterDensity   0.698889
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.622239
		volcanoTemp     1626.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.167, 0.171, 0.050)
		colorShelf     (0.221, 0.196, 0.196, 0.040)
		colorBeach     (0.254, 0.225, 0.222, 0.030)
		colorDesert    (0.287, 0.253, 0.252, 0.020)
		colorLowland   (0.320, 0.282, 0.277, 0.030)
		colorUpland    (0.353, 0.311, 0.303, 0.050)
		colorRock      (0.386, 0.340, 0.337, 0.020)
		colorSnow      (0.386, 0.340, 0.337, 1.000)
		BumpHeight      6.2079
		BumpOffset      1.24158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.016416
		Period          0.0457369
		Eccentricity    0.186791
		Inclination     -66.023
		AscendingNode   -109.853
		ArgOfPericenter -61.0618
		MeanAnomaly     107.543
	}
}

DwarfMoon	"Cantonica System 4.D10"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.8549e-011
	Radius          3.72627
	InertiaMoment   0.397317

	Obliquity       -59.6309
	EqAscendNode    -109.526
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.558 0.500)

	Surface
	{
		SurfStyle       0.818884
		OceanStyle      0.645131
		Randomize      (0.115, 0.986, 0.539)
		colorDistMagn   0.881341
		colorDistFreq   0.00419836
		detailScale     101.752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86347
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425412
		terraceProb     0.239693
		erosion         0
		montesMagn      0.46277
		montesFreq      3.52546
		montesSpiky     0.990381
		montesFraction  0.479946
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0300854
		hillsFraction   0.501917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207409
		craterFreq      0.253081
		craterDensity   0.845458
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58082
		volcanoTemp     1299.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.190, 0.140, 0.000)
		colorShelf     (0.267, 0.195, 0.160, 0.000)
		colorBeach     (0.313, 0.229, 0.190, 0.000)
		colorDesert    (0.340, 0.246, 0.185, 0.000)
		colorLowland   (0.373, 0.262, 0.210, 0.000)
		colorUpland    (0.413, 0.318, 0.255, 0.000)
		colorRock      (0.447, 0.346, 0.275, 0.000)
		colorSnow      (0.487, 0.368, 0.290, 1.000)
		BumpHeight      3.35365
		BumpOffset      0.670729
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0169644
		Period          0.0480478
		Eccentricity    0.135055
		Inclination     -59.6309
		AscendingNode   -109.526
		ArgOfPericenter -27.0844
		MeanAnomaly     -120.521
	}
}

DwarfMoon	"Cantonica System 4.D11"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.44904e-010
	Radius          7.46764
	InertiaMoment   0.398743

	Obliquity       -39.0055
	EqAscendNode    112.354
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.762 0.760)

	Surface
	{
		SurfStyle       0.116693
		OceanStyle      0.924197
		Randomize      (-0.246, -0.038, 0.226)
		colorDistMagn   0.967158
		colorDistFreq   0.0389067
		detailScale     203.916
		colorConversion true
		snowLevel       2
		tropicLatitude  0.65627
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505214
		terraceProb     0.226213
		erosion         0
		montesMagn      0.554056
		montesFreq      2.48967
		montesSpiky     0.808447
		montesFraction  0.570711
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0818114
		hillsFraction   0.433062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272528
		craterFreq      0.181146
		craterDensity   0.752607
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548928
		volcanoTemp     1407.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.305, 0.304, 0.000)
		colorShelf     (0.326, 0.324, 0.323, 0.000)
		colorBeach     (0.345, 0.343, 0.342, 0.000)
		colorDesert    (0.364, 0.362, 0.361, 0.000)
		colorLowland   (0.383, 0.381, 0.380, 0.000)
		colorUpland    (0.402, 0.400, 0.399, 0.000)
		colorRock      (0.422, 0.419, 0.418, 0.000)
		colorSnow      (0.441, 0.438, 0.437, 1.000)
		BumpHeight      6.72088
		BumpOffset      1.34418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0174939
		Period          0.050315
		Eccentricity    0.445068
		Inclination     -39.0055
		AscendingNode   112.354
		ArgOfPericenter -97.7086
		MeanAnomaly     103.375
	}
}

DwarfMoon	"Cantonica System 4.D12"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.28608e-010
	Radius          4.48842
	InertiaMoment   0.399697

	RotationPeriod  924.248
	Obliquity       80.136
	EqAscendNode    -53.4128

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.611 0.608)

	Surface
	{
		SurfStyle       0.182224
		OceanStyle      0.633255
		Randomize      (-0.699, 0.899, -0.147)
		colorDistMagn   0.659668
		colorDistFreq   0.00432849
		detailScale     122.564
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357548
		terraceProb     0.208578
		erosion         0
		montesMagn      0.494778
		montesFreq      3.55017
		montesSpiky     0.830836
		montesFraction  0.812563
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0563318
		hillsFraction   0.676016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245422
		craterFreq      0.201401
		craterDensity   0.758506
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463552
		volcanoTemp     1671.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.244, 0.243, 0.000)
		colorShelf     (0.261, 0.260, 0.258, 0.000)
		colorBeach     (0.276, 0.275, 0.274, 0.000)
		colorDesert    (0.292, 0.290, 0.289, 0.000)
		colorLowland   (0.307, 0.305, 0.304, 0.000)
		colorUpland    (0.322, 0.321, 0.319, 0.000)
		colorRock      (0.338, 0.336, 0.335, 0.000)
		colorSnow      (0.353, 0.351, 0.350, 1.000)
		BumpHeight      4.03958
		BumpOffset      0.807916
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0180468
		Period          0.0527189
		Eccentricity    0.327357
		Inclination     80.136
		AscendingNode   -53.4128
		ArgOfPericenter 155.341
		MeanAnomaly     -126.055
	}
}

DwarfMoon	"Cantonica System 4.D13"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.5035e-010
	Radius          9.00486
	InertiaMoment   0.397597

	Obliquity       -87.9402
	EqAscendNode    52.1373
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.498 0.493 0.487)

	Surface
	{
		SurfStyle       0.721287
		OceanStyle      0.239061
		Randomize      (0.331, -0.328, 0.698)
		colorDistMagn   0.325547
		colorDistFreq   0.0362273
		detailScale     245.893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.7911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483038
		terraceProb     0.198314
		erosion         0
		montesMagn      0.357532
		montesFreq      3.88826
		montesSpiky     0.859441
		montesFraction  0.703698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.174037
		hillsFraction   0.67404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217227
		craterFreq      0.202407
		craterDensity   0.73385
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537557
		volcanoTemp     1630.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.168, 0.136, 0.000)
		colorShelf     (0.199, 0.173, 0.156, 0.000)
		colorBeach     (0.234, 0.202, 0.185, 0.000)
		colorDesert    (0.254, 0.217, 0.180, 0.000)
		colorLowland   (0.279, 0.232, 0.205, 0.000)
		colorUpland    (0.309, 0.281, 0.249, 0.000)
		colorRock      (0.333, 0.306, 0.268, 0.000)
		colorSnow      (0.363, 0.325, 0.283, 1.000)
		BumpHeight      8.10438
		BumpOffset      1.62088
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0184365
		Period          0.0544356
		Eccentricity    0.320527
		Inclination     -87.9402
		AscendingNode   52.1373
		ArgOfPericenter 71.5451
		MeanAnomaly     160.809
	}
}

DwarfMoon	"Cantonica System 4.D14"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.24485e-010
	Radius          6.83085
	InertiaMoment   0.398892

	RotationPeriod  1501.72
	Obliquity       -9.53463
	EqAscendNode    -143.678

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.608 0.605 0.601)

	Surface
	{
		SurfStyle       0.92655
		OceanStyle      0.233649
		Randomize      (-0.780, 0.743, -0.476)
		colorDistMagn   0.21092
		colorDistFreq   0.0359584
		detailScale     186.528
		colorConversion true
		snowLevel       2
		tropicLatitude  0.10312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624254
		terraceProb     0.174252
		erosion         0
		montesMagn      0.598948
		montesFreq      2.87457
		montesSpiky     0.985796
		montesFraction  0.668589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0529985
		hillsFraction   0.752215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247821
		craterFreq      0.270461
		craterDensity   0.816065
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.404982
		volcanoTemp     1560.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.212, 0.241, 0.050)
		colorShelf     (0.243, 0.248, 0.277, 0.040)
		colorBeach     (0.280, 0.284, 0.313, 0.030)
		colorDesert    (0.316, 0.321, 0.355, 0.020)
		colorLowland   (0.353, 0.357, 0.391, 0.030)
		colorUpland    (0.389, 0.393, 0.427, 0.050)
		colorRock      (0.426, 0.430, 0.475, 0.020)
		colorSnow      (0.426, 0.430, 0.475, 1.000)
		BumpHeight      6.14776
		BumpOffset      1.22955
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0190345
		Period          0.0571054
		Eccentricity    0.453598
		Inclination     -9.53463
		AscendingNode   -143.678
		ArgOfPericenter -1.75064
		MeanAnomaly     130.17
	}
}

DwarfMoon	"Cantonica System 4.D15"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            7.70234e-010
	Radius          13.1088
	InertiaMoment   0.399823

	RotationPeriod  1272.38
	Obliquity       -38.4787
	EqAscendNode    49.5486

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.481 0.476 0.472)

	Surface
	{
		SurfStyle       0.982193
		OceanStyle      0.769402
		Randomize      (-0.773, -0.809, -0.826)
		colorDistMagn   0.396309
		colorDistFreq   0.0634581
		detailScale     357.958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932316
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311763
		terraceProb     0.487781
		erosion         0
		montesMagn      0.359392
		montesFreq      2.79328
		montesSpiky     0.89035
		montesFraction  0.916047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.436358
		hillsFraction   0.649651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231315
		craterFreq      0.208797
		craterDensity   0.861088
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570441
		volcanoTemp     1218.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.167, 0.189, 0.050)
		colorShelf     (0.192, 0.195, 0.217, 0.040)
		colorBeach     (0.221, 0.224, 0.245, 0.030)
		colorDesert    (0.250, 0.252, 0.279, 0.020)
		colorLowland   (0.279, 0.281, 0.307, 0.030)
		colorUpland    (0.308, 0.309, 0.335, 0.050)
		colorRock      (0.337, 0.338, 0.373, 0.020)
		colorSnow      (0.337, 0.338, 0.373, 1.000)
		BumpHeight      11.7979
		BumpOffset      2.35959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0192463
		Period          0.0580611
		Eccentricity    0.107707
		Inclination     -38.4787
		AscendingNode   49.5486
		ArgOfPericenter 33.4261
		MeanAnomaly     115.259
	}
}

DwarfMoon	"Cantonica System 4.D16"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.1133e-009
	Radius          7.67339
	InertiaMoment   0.397837

	Obliquity       -43.5548
	EqAscendNode    -148.603
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.745 0.743)

	Surface
	{
		SurfStyle       0.81406
		OceanStyle      0.280464
		Randomize      (-0.900, 0.996, 0.306)
		colorDistMagn   0.579045
		colorDistFreq   0.0296226
		detailScale     209.535
		colorConversion true
		snowLevel       2
		tropicLatitude  0.366346
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.283793
		terraceProb     0.215831
		erosion         0
		montesMagn      0.551762
		montesFreq      3.46603
		montesSpiky     0.959847
		montesFraction  0.758873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.114128
		hillsFraction   0.564486
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260749
		craterFreq      0.194182
		craterDensity   0.81334
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46192
		volcanoTemp     1362.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.253, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.351, 0.305, 0.282, 0.000)
		colorDesert    (0.381, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.350, 0.312, 0.000)
		colorUpland    (0.463, 0.425, 0.379, 0.000)
		colorRock      (0.501, 0.462, 0.409, 0.000)
		colorSnow      (0.546, 0.492, 0.431, 1.000)
		BumpHeight      6.90605
		BumpOffset      1.38121
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0197557
		Period          0.0603815
		Eccentricity    0.342728
		Inclination     -43.5548
		AscendingNode   -148.603
		ArgOfPericenter -6.39321
		MeanAnomaly     -129.524
	}
}

DwarfMoon	"Cantonica System 4.D17"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.58801e-009
	Radius          15.1607
	InertiaMoment   0.399035

	RotationPeriod  2693.35
	Obliquity       41.4862
	EqAscendNode    86.7111

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.693 0.690)

	Surface
	{
		SurfStyle       0.779901
		OceanStyle      0.106944
		Randomize      (-0.102, 0.526, -0.757)
		colorDistMagn   0.894366
		colorDistFreq   0.188168
		detailScale     413.989
		colorConversion true
		snowLevel       2
		tropicLatitude  0.84422
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561775
		terraceProb     0.33673
		erosion         0
		montesMagn      0.38292
		montesFreq      2.81218
		montesSpiky     0.978862
		montesFraction  0.412188
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.579269
		hillsFraction   0.704589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249873
		craterFreq      0.26007
		craterDensity   0.848763
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56046
		volcanoTemp     1461.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.236, 0.193, 0.000)
		colorShelf     (0.278, 0.243, 0.221, 0.000)
		colorBeach     (0.327, 0.284, 0.262, 0.000)
		colorDesert    (0.355, 0.305, 0.255, 0.000)
		colorLowland   (0.389, 0.326, 0.290, 0.000)
		colorUpland    (0.431, 0.395, 0.352, 0.000)
		colorRock      (0.466, 0.430, 0.379, 0.000)
		colorSnow      (0.507, 0.457, 0.400, 1.000)
		BumpHeight      13.6446
		BumpOffset      2.72893
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0199883
		Period          0.0614512
		Eccentricity    0.380608
		Inclination     41.4862
		AscendingNode   86.7111
		ArgOfPericenter 124.213
		MeanAnomaly     -149.417
	}
}

DwarfMoon	"Cantonica System 4.D18"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.24028e-009
	Radius          11.2454
	InertiaMoment   0.399948

	RotationPeriod  735.439
	Obliquity       -51.0196
	EqAscendNode    -85.2575

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.687 0.653 0.590)

	Surface
	{
		SurfStyle       0.0298701
		OceanStyle      0.708219
		Randomize      (-0.006, 0.545, -0.358)
		colorDistMagn   0.220109
		colorDistFreq   0.0196748
		detailScale     307.075
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938328
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381549
		terraceProb     0.217822
		erosion         0
		montesMagn      0.455205
		montesFreq      3.22269
		montesSpiky     0.943132
		montesFraction  0.724434
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.340577
		hillsFraction   0.757962
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258573
		craterFreq      0.250495
		craterDensity   0.809841
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513196
		volcanoTemp     1546.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.261, 0.236, 0.000)
		colorShelf     (0.292, 0.277, 0.251, 0.000)
		colorBeach     (0.309, 0.294, 0.266, 0.000)
		colorDesert    (0.326, 0.310, 0.280, 0.000)
		colorLowland   (0.343, 0.326, 0.295, 0.000)
		colorUpland    (0.360, 0.343, 0.310, 0.000)
		colorRock      (0.378, 0.359, 0.325, 0.000)
		colorSnow      (0.395, 0.375, 0.339, 1.000)
		BumpHeight      10.1209
		BumpOffset      2.02418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0203064
		Period          0.0629239
		Eccentricity    0.338637
		Inclination     -51.0196
		AscendingNode   -85.2575
		ArgOfPericenter -101.026
		MeanAnomaly     -59.9805
	}
}

DwarfMoon	"Cantonica System 4.D19"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.13146e-009
	Radius          21.048
	InertiaMoment   0.398049

	Obliquity       -67.0445
	EqAscendNode    32.1764
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.718 0.674 0.652)

	Surface
	{
		SurfStyle       0.322755
		OceanStyle      0.854933
		Randomize      (-0.865, -0.704, 0.564)
		colorDistMagn   0.778288
		colorDistFreq   0.244022
		detailScale     574.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659858
		terraceProb     0.255212
		erosion         0
		montesMagn      0.459151
		montesFreq      3.82824
		montesSpiky     0.676029
		montesFraction  0.852226
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28831
		hillsFraction   0.561062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272602
		craterFreq      0.160159
		craterDensity   0.665942
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468883
		volcanoTemp     1399.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.270, 0.261, 0.000)
		colorShelf     (0.305, 0.286, 0.277, 0.000)
		colorBeach     (0.323, 0.303, 0.293, 0.000)
		colorDesert    (0.341, 0.320, 0.309, 0.000)
		colorLowland   (0.359, 0.337, 0.326, 0.000)
		colorUpland    (0.377, 0.354, 0.342, 0.000)
		colorRock      (0.395, 0.371, 0.358, 0.000)
		colorSnow      (0.413, 0.387, 0.375, 1.000)
		BumpHeight      18.9432
		BumpOffset      3.78864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0208369
		Period          0.0654058
		Eccentricity    0.476072
		Inclination     -67.0445
		AscendingNode   32.1764
		ArgOfPericenter 135.57
		MeanAnomaly     -173.228
	}
}

DwarfMoon	"Cantonica System 4.D20"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.34378e-009
	Radius          12.182
	InertiaMoment   0.399173

	Obliquity       -33.3576
	EqAscendNode    49.0927
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.657 0.655)

	Surface
	{
		SurfStyle       0.842435
		OceanStyle      0.0854794
		Randomize      (-0.102, -0.293, -0.353)
		colorDistMagn   0.74518
		colorDistFreq   0.110251
		detailScale     332.649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503053
		terraceProb     0.164667
		erosion         0
		montesMagn      0.465608
		montesFreq      3.19324
		montesSpiky     0.989597
		montesFraction  0.690498
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.387237
		hillsFraction   0.683359
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239386
		craterFreq      0.197589
		craterDensity   0.812659
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543112
		volcanoTemp     1482.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.223, 0.183, 0.000)
		colorShelf     (0.263, 0.230, 0.210, 0.000)
		colorBeach     (0.310, 0.269, 0.249, 0.000)
		colorDesert    (0.336, 0.289, 0.242, 0.000)
		colorLowland   (0.369, 0.309, 0.275, 0.000)
		colorUpland    (0.408, 0.375, 0.334, 0.000)
		colorRock      (0.441, 0.407, 0.360, 0.000)
		colorSnow      (0.481, 0.434, 0.380, 1.000)
		BumpHeight      10.9638
		BumpOffset      2.19275
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0210442
		Period          0.0663843
		Eccentricity    0.10522
		Inclination     -33.3576
		AscendingNode   49.0927
		ArgOfPericenter 18.3783
		MeanAnomaly     145.547
	}
}

DwarfMoon	"Cantonica System 4.D21"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.98762e-009
	Radius          23.8744
	InertiaMoment   0.395636

	Obliquity       31.9395
	EqAscendNode    -120.529
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.503 0.496)

	Surface
	{
		SurfStyle       0.38308
		OceanStyle      0.993647
		Randomize      (-0.886, -0.746, 0.703)
		colorDistMagn   0.452096
		colorDistFreq   0.267991
		detailScale     651.932
		colorConversion true
		snowLevel       2
		tropicLatitude  0.506401
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443423
		terraceProb     0.360064
		erosion         0
		montesMagn      0.636408
		montesFreq      2.92778
		montesSpiky     0.901214
		montesFraction  0.643975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40386
		hillsFraction   0.582464
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230524
		craterFreq      0.225738
		craterDensity   0.829697
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537178
		volcanoTemp     1651.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.201, 0.198, 0.000)
		colorShelf     (0.216, 0.214, 0.211, 0.000)
		colorBeach     (0.229, 0.226, 0.223, 0.000)
		colorDesert    (0.242, 0.239, 0.235, 0.000)
		colorLowland   (0.254, 0.252, 0.248, 0.000)
		colorUpland    (0.267, 0.264, 0.260, 0.000)
		colorRock      (0.280, 0.277, 0.273, 0.000)
		colorSnow      (0.293, 0.289, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0216863
		Period          0.0694457
		Eccentricity    0.478774
		Inclination     31.9395
		AscendingNode   -120.529
		ArgOfPericenter 165.873
		MeanAnomaly     -175.637
	}
}

DwarfMoon	"Cantonica System 4.D22"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.21158e-009
	Radius          17.6267
	InertiaMoment   0.398241

	RotationPeriod  414.641
	Obliquity       -18.8757
	EqAscendNode    73.2747

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.460 0.456 0.451)

	Surface
	{
		SurfStyle       0.790406
		OceanStyle      0.48447
		Randomize      (0.248, -0.878, -0.063)
		colorDistMagn   0.840564
		colorDistFreq   0.265723
		detailScale     481.327
		colorConversion true
		snowLevel       2
		tropicLatitude  0.501398
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399878
		terraceProb     0.352296
		erosion         0
		montesMagn      0.665372
		montesFreq      3.40247
		montesSpiky     0.992662
		montesFraction  0.389401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.807229
		hillsFraction   0.659116
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216761
		craterFreq      0.274768
		craterDensity   0.753584
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476352
		volcanoTemp     1685.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.155, 0.126, 0.000)
		colorShelf     (0.184, 0.160, 0.144, 0.000)
		colorBeach     (0.216, 0.187, 0.171, 0.000)
		colorDesert    (0.235, 0.201, 0.167, 0.000)
		colorLowland   (0.258, 0.214, 0.190, 0.000)
		colorUpland    (0.285, 0.260, 0.230, 0.000)
		colorRock      (0.308, 0.283, 0.248, 0.000)
		colorSnow      (0.336, 0.301, 0.262, 1.000)
		BumpHeight      15.864
		BumpOffset      3.17281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.021999
		Period          0.0709531
		Eccentricity    0.488994
		Inclination     -18.8757
		AscendingNode   73.2747
		ArgOfPericenter -92.7349
		MeanAnomaly     58.1737
	}
}

DwarfMoon	"Cantonica System 4.D23"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.12165e-008
	Radius          32.4054
	InertiaMoment   0.399307

	RotationPeriod  1267.5
	Obliquity       -68.1835
	EqAscendNode    -112.324

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.474 0.362)

	Surface
	{
		SurfStyle       0.619748
		OceanStyle      0.518081
		Randomize      (0.998, -0.938, -0.285)
		colorDistMagn   0.251842
		colorDistFreq   0.703266
		detailScale     884.884
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44826
		terraceProb     0.182965
		erosion         0
		montesMagn      0.521111
		montesFreq      3.98169
		montesSpiky     0.976309
		montesFraction  0.462265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.29584
		hillsFraction   0.73086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263372
		craterFreq      0.200122
		craterDensity   1.01641
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515588
		volcanoTemp     1658.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.161, 0.101, 0.000)
		colorShelf     (0.231, 0.166, 0.116, 0.000)
		colorBeach     (0.271, 0.194, 0.138, 0.000)
		colorDesert    (0.294, 0.209, 0.134, 0.000)
		colorLowland   (0.323, 0.223, 0.152, 0.000)
		colorUpland    (0.357, 0.270, 0.185, 0.000)
		colorRock      (0.386, 0.294, 0.199, 0.000)
		colorSnow      (0.421, 0.313, 0.210, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0222762
		Period          0.072298
		Eccentricity    0.495612
		Inclination     -68.1835
		AscendingNode   -112.324
		ArgOfPericenter 84.0609
		MeanAnomaly     -118.971
	}
}

DwarfMoon	"Cantonica System 4.D24"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.5275e-008
	Radius          18.6791
	InertiaMoment   0.396486

	Obliquity       -66.7916
	EqAscendNode    97.8165
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.421 0.417 0.414)

	Surface
	{
		SurfStyle       0.85114
		OceanStyle      0.791761
		Randomize      (0.844, -0.769, 0.176)
		colorDistMagn   0.702771
		colorDistFreq   0.252338
		detailScale     510.065
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962811
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35605
		terraceProb     0.158954
		erosion         0
		montesMagn      0.414924
		montesFreq      3.10903
		montesSpiky     0.901271
		montesFraction  0.318444
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.829973
		hillsFraction   0.655804
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199199
		craterFreq      0.213353
		craterDensity   0.93933
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5003
		volcanoTemp     1737.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.143, 0.146, 0.166, 0.050)
		colorShelf     (0.168, 0.171, 0.190, 0.040)
		colorBeach     (0.194, 0.196, 0.215, 0.030)
		colorDesert    (0.219, 0.221, 0.244, 0.020)
		colorLowland   (0.244, 0.246, 0.269, 0.030)
		colorUpland    (0.269, 0.271, 0.294, 0.050)
		colorRock      (0.295, 0.296, 0.327, 0.020)
		colorSnow      (0.295, 0.296, 0.327, 1.000)
		BumpHeight      16.8112
		BumpOffset      3.36224
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0225487
		Period          0.0736291
		Eccentricity    0.00601444
		Inclination     -66.7916
		AscendingNode   97.8165
		ArgOfPericenter 173.503
		MeanAnomaly     -153.461
	}
}

DwarfMoon	"Cantonica System 4.D25"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.07586e-008
	Radius          36.4736
	InertiaMoment   0.398418

	Obliquity       -78.9967
	EqAscendNode    -2.76387
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.490 0.486)

	Surface
	{
		SurfStyle       0.455565
		OceanStyle      0.874283
		Randomize      (0.138, -0.657, -0.485)
		colorDistMagn   0.804204
		colorDistFreq   0.623448
		detailScale     995.972
		colorConversion true
		snowLevel       2
		tropicLatitude  0.377474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367468
		terraceProb     0.352371
		erosion         0
		montesMagn      0.505566
		montesFreq      3.06631
		montesSpiky     0.942931
		montesFraction  0.286539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.75362
		hillsFraction   0.745431
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255956
		craterFreq      0.246456
		craterDensity   0.984024
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.420538
		volcanoTemp     1242.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.196, 0.194, 0.000)
		colorShelf     (0.210, 0.208, 0.207, 0.000)
		colorBeach     (0.222, 0.221, 0.219, 0.000)
		colorDesert    (0.234, 0.233, 0.231, 0.000)
		colorLowland   (0.246, 0.245, 0.243, 0.000)
		colorUpland    (0.259, 0.257, 0.255, 0.000)
		colorRock      (0.271, 0.270, 0.267, 0.000)
		colorSnow      (0.283, 0.282, 0.279, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0230281
		Period          0.0759893
		Eccentricity    0.227479
		Inclination     -78.9967
		AscendingNode   -2.76387
		ArgOfPericenter 74.847
		MeanAnomaly     -13.6099
	}
}

DwarfMoon	"Cantonica System 4.D26"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.81773e-008
	Radius          27.1012
	InertiaMoment   0.399438

	Obliquity       -23.2704
	EqAscendNode    -139.236
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.520 0.515)

	Surface
	{
		SurfStyle       0.964987
		OceanStyle      0.0113892
		Randomize      (-0.354, -0.216, -0.776)
		colorDistMagn   0.632446
		colorDistFreq   0.554567
		detailScale     740.044
		colorConversion true
		snowLevel       2
		tropicLatitude  0.27257
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560673
		terraceProb     0.451189
		erosion         0
		montesMagn      0.507854
		montesFreq      3.21085
		montesSpiky     0.985324
		montesFraction  0.450775
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85993
		hillsFraction   0.646489
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230413
		craterFreq      0.15261
		craterDensity   0.807704
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536124
		volcanoTemp     1453.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.182, 0.206, 0.050)
		colorShelf     (0.209, 0.213, 0.237, 0.040)
		colorBeach     (0.241, 0.244, 0.268, 0.030)
		colorDesert    (0.272, 0.275, 0.304, 0.020)
		colorLowland   (0.304, 0.307, 0.335, 0.030)
		colorUpland    (0.335, 0.338, 0.366, 0.050)
		colorRock      (0.367, 0.369, 0.407, 0.020)
		colorSnow      (0.367, 0.369, 0.407, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0236095
		Period          0.0788852
		Eccentricity    0.248421
		Inclination     -23.2704
		AscendingNode   -139.236
		ArgOfPericenter 119.61
		MeanAnomaly     -14.2936
	}
}

DwarfMoon	"Cantonica System 4.D27"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.82348e-008
	Radius          49.0887
	InertiaMoment   0.396962

	Obliquity       42.1395
	EqAscendNode    7.6642
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.761 0.758)

	Surface
	{
		SurfStyle       0.705409
		OceanStyle      0.678861
		Randomize      (-0.070, 0.134, 0.734)
		colorDistMagn   0.843621
		colorDistFreq   0.636858
		detailScale     1340.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994608
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425016
		terraceProb     0.47045
		erosion         0
		montesMagn      0.4442
		montesFreq      2.4048
		montesSpiky     0.881988
		montesFraction  0.457668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.91436
		hillsFraction   0.549403
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226024
		craterFreq      0.184089
		craterDensity   0.893802
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514288
		volcanoTemp     1556.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.212, 0.000)
		colorShelf     (0.305, 0.266, 0.242, 0.000)
		colorBeach     (0.359, 0.312, 0.288, 0.000)
		colorDesert    (0.389, 0.335, 0.280, 0.000)
		colorLowland   (0.427, 0.358, 0.318, 0.000)
		colorUpland    (0.473, 0.434, 0.386, 0.000)
		colorRock      (0.511, 0.472, 0.417, 0.000)
		colorSnow      (0.557, 0.502, 0.439, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0241125
		Period          0.0814197
		Eccentricity    0.0132501
		Inclination     42.1395
		AscendingNode   7.6642
		ArgOfPericenter -4.64963
		MeanAnomaly     22.2835
	}
}

DwarfMoon	"Cantonica System 4.D28"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.19099e-008
	Radius          28.3162
	InertiaMoment   0.398583

	Obliquity       29.0968
	EqAscendNode    -30.4002
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.438 0.357)

	Surface
	{
		SurfStyle       0.903782
		OceanStyle      0.597176
		Randomize      (0.048, 0.250, -0.147)
		colorDistMagn   0.747207
		colorDistFreq   0.106432
		detailScale     773.222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.828787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495714
		terraceProb     0.116413
		erosion         0
		montesMagn      0.604645
		montesFreq      3.93639
		montesSpiky     0.979117
		montesFraction  0.571766
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.50705
		hillsFraction   0.66184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221883
		craterFreq      0.219309
		craterDensity   0.998534
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495251
		volcanoTemp     1415.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.153, 0.143, 0.050)
		colorShelf     (0.206, 0.180, 0.164, 0.040)
		colorBeach     (0.237, 0.206, 0.186, 0.030)
		colorDesert    (0.268, 0.232, 0.211, 0.020)
		colorLowland   (0.299, 0.258, 0.232, 0.030)
		colorUpland    (0.330, 0.285, 0.254, 0.050)
		colorRock      (0.361, 0.311, 0.282, 0.020)
		colorSnow      (0.361, 0.311, 0.282, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0245426
		Period          0.083608
		Eccentricity    0.0132221
		Inclination     29.0968
		AscendingNode   -30.4002
		ArgOfPericenter 117.229
		MeanAnomaly     -166.719
	}
}

DwarfMoon	"Cantonica System 4.D29"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            7.05753e-008
	Radius          55.2874
	InertiaMoment   0.399567

	Obliquity       -0.510695
	EqAscendNode    -174.664
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.506 0.465)

	Surface
	{
		SurfStyle       0.167642
		OceanStyle      0.921951
		Randomize      (-0.334, -0.533, 0.284)
		colorDistMagn   0.429163
		colorDistFreq   2.05143
		detailScale     1509.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000845728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595823
		terraceProb     0.325648
		erosion         0
		montesMagn      0.507015
		montesFreq      2.77429
		montesSpiky     0.995983
		montesFraction  0.776894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.58297
		hillsFraction   0.929342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263224
		craterFreq      0.233919
		craterDensity   1.00292
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488448
		volcanoTemp     1831.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.202, 0.186, 0.000)
		colorShelf     (0.245, 0.215, 0.198, 0.000)
		colorBeach     (0.260, 0.228, 0.209, 0.000)
		colorDesert    (0.274, 0.240, 0.221, 0.000)
		colorLowland   (0.289, 0.253, 0.232, 0.000)
		colorUpland    (0.303, 0.266, 0.244, 0.000)
		colorRock      (0.317, 0.278, 0.256, 0.000)
		colorSnow      (0.332, 0.291, 0.267, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0249045
		Period          0.0854638
		Eccentricity    0.0794985
		Inclination     -0.510695
		AscendingNode   -174.664
		ArgOfPericenter -61.3769
		MeanAnomaly     107.88
	}
}

DwarfMoon	"Cantonica System 4.D30"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.61736e-008
	Radius          41.7604
	InertiaMoment   0.39731

	Obliquity       84.3153
	EqAscendNode    135.226
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.730 0.729)

	Surface
	{
		SurfStyle       0.0939969
		OceanStyle      0.43789
		Randomize      (-0.617, -0.120, -0.977)
		colorDistMagn   0.846587
		colorDistFreq   0.899675
		detailScale     1140.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.701428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522534
		terraceProb     0.354278
		erosion         0
		montesMagn      0.456454
		montesFreq      2.8926
		montesSpiky     0.987862
		montesFraction  0.848406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.09017
		hillsFraction   0.875816
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231186
		craterFreq      0.236888
		craterDensity   0.808987
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417207
		volcanoTemp     1469.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.292, 0.000)
		colorShelf     (0.311, 0.310, 0.310, 0.000)
		colorBeach     (0.330, 0.328, 0.328, 0.000)
		colorDesert    (0.348, 0.347, 0.346, 0.000)
		colorLowland   (0.366, 0.365, 0.364, 0.000)
		colorUpland    (0.385, 0.383, 0.383, 0.000)
		colorRock      (0.403, 0.401, 0.401, 0.000)
		colorSnow      (0.421, 0.420, 0.419, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0254394
		Period          0.0882323
		Eccentricity    0.00936017
		Inclination     84.3153
		AscendingNode   135.226
		ArgOfPericenter 117.804
		MeanAnomaly     144.808
	}
}

DwarfMoon	"Cantonica System 4.D31"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.31484e-007
	Radius          74.6072
	InertiaMoment   0.39874

	Obliquity       -82.7479
	EqAscendNode    -97.8343
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.625 0.623)

	Surface
	{
		SurfStyle       0.75948
		OceanStyle      0.14012
		Randomize      (0.872, -0.037, -0.057)
		colorDistMagn   0.417402
		colorDistFreq   2.89711
		detailScale     2037.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988675
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586281
		terraceProb     0.358558
		erosion         0
		montesMagn      0.500575
		montesFreq      3.31704
		montesSpiky     0.863659
		montesFraction  0.439349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.3271
		hillsFraction   0.861844
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223851
		craterFreq      0.247587
		craterDensity   0.767397
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480503
		volcanoTemp     1747.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.213, 0.174, 0.000)
		colorShelf     (0.251, 0.219, 0.199, 0.000)
		colorBeach     (0.295, 0.256, 0.237, 0.000)
		colorDesert    (0.320, 0.275, 0.230, 0.000)
		colorLowland   (0.351, 0.294, 0.262, 0.000)
		colorUpland    (0.389, 0.356, 0.318, 0.000)
		colorRock      (0.421, 0.388, 0.343, 0.000)
		colorSnow      (0.458, 0.413, 0.361, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0259727
		Period          0.0910212
		Eccentricity    0.0904131
		Inclination     -82.7479
		AscendingNode   -97.8343
		ArgOfPericenter 3.67979
		MeanAnomaly     174.881
	}
}

DwarfMoon	"Cantonica System 4.D32"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.80526e-007
	Radius          43.2581
	InertiaMoment   0.399694

	Obliquity       49.784
	EqAscendNode    108.079
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.664 0.659 0.654)

	Surface
	{
		SurfStyle       0.447412
		OceanStyle      0.369887
		Randomize      (-0.341, -0.964, 0.072)
		colorDistMagn   0.60616
		colorDistFreq   0.903377
		detailScale     1181.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.801614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430385
		terraceProb     0.200186
		erosion         0
		montesMagn      0.449005
		montesFreq      2.45003
		montesSpiky     0.991158
		montesFraction  0.506452
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.00297
		hillsFraction   0.609276
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236612
		craterFreq      0.161573
		craterDensity   0.898287
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468551
		volcanoTemp     1385.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.264, 0.262, 0.000)
		colorShelf     (0.282, 0.280, 0.278, 0.000)
		colorBeach     (0.299, 0.297, 0.294, 0.000)
		colorDesert    (0.315, 0.313, 0.311, 0.000)
		colorLowland   (0.332, 0.330, 0.327, 0.000)
		colorUpland    (0.348, 0.346, 0.343, 0.000)
		colorRock      (0.365, 0.363, 0.360, 0.000)
		colorSnow      (0.382, 0.379, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0262048
		Period          0.0922436
		Eccentricity    0.394478
		Inclination     49.784
		AscendingNode   108.079
		ArgOfPericenter 95.9045
		MeanAnomaly     111.156
	}
}

DwarfMoon	"Cantonica System 4.D33"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.49197e-007
	Radius          84.7997
	InertiaMoment   0.397591

	RotationPeriod  1639.74
	Obliquity       -86.3027
	EqAscendNode    -157.923

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.499 0.494 0.484)

	Surface
	{
		SurfStyle       0.0592343
		OceanStyle      0.214584
		Randomize      (-0.668, 0.168, -0.579)
		colorDistMagn   0.8882
		colorDistFreq   4.76978
		detailScale     2315.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.375098
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426814
		terraceProb     0.562918
		erosion         0
		montesMagn      0.545544
		montesFreq      2.93982
		montesSpiky     0.913706
		montesFraction  0.868866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.9263
		hillsFraction   0.690945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220778
		craterFreq      0.216532
		craterDensity   0.776908
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472182
		volcanoTemp     1210.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.197, 0.194, 0.000)
		colorShelf     (0.212, 0.210, 0.206, 0.000)
		colorBeach     (0.224, 0.222, 0.218, 0.000)
		colorDesert    (0.237, 0.234, 0.230, 0.000)
		colorLowland   (0.249, 0.247, 0.242, 0.000)
		colorUpland    (0.262, 0.259, 0.254, 0.000)
		colorRock      (0.274, 0.271, 0.266, 0.000)
		colorSnow      (0.287, 0.284, 0.278, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0264479
		Period          0.0935303
		Eccentricity    0.397028
		Inclination     -86.3027
		AscendingNode   -157.923
		ArgOfPericenter 164.842
		MeanAnomaly     68.8606
	}
}

DwarfMoon	"Cantonica System 4.D34"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.46272e-007
	Radius          65.9266
	InertiaMoment   0.398889

	RotationPeriod  1391.54
	Obliquity       -82.5032
	EqAscendNode    56.5794

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.771 0.769 0.768)

	Surface
	{
		SurfStyle       0.827369
		OceanStyle      0.0694127
		Randomize      (0.904, 0.896, -0.250)
		colorDistMagn   0.285008
		colorDistFreq   2.97293
		detailScale     1800.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.851483
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.360191
		terraceProb     0.19639
		erosion         0
		montesMagn      0.529448
		montesFreq      3.55565
		montesSpiky     0.945159
		montesFraction  0.411109
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.0795
		hillsFraction   0.655442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213619
		craterFreq      0.192299
		craterDensity   0.845143
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428216
		volcanoTemp     1837.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.215, 0.000)
		colorShelf     (0.308, 0.269, 0.246, 0.000)
		colorBeach     (0.362, 0.315, 0.292, 0.000)
		colorDesert    (0.393, 0.338, 0.284, 0.000)
		colorLowland   (0.432, 0.362, 0.323, 0.000)
		colorUpland    (0.478, 0.438, 0.392, 0.000)
		colorRock      (0.517, 0.477, 0.422, 0.000)
		colorSnow      (0.563, 0.508, 0.446, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0267707
		Period          0.0952478
		Eccentricity    0.496192
		Inclination     -82.5032
		AscendingNode   56.5794
		ArgOfPericenter -14.9856
		MeanAnomaly     172.287
	}
}

DwarfMoon	"Cantonica System 4.D35"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.85035e-007
	Radius          116.133
	InertiaMoment   0.39982

	RotationPeriod  4248.05
	Obliquity       42.5708
	EqAscendNode    118.005

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.451 0.446 0.442)

	Surface
	{
		SurfStyle       0.377144
		OceanStyle      0.314403
		Randomize      (-0.229, 0.060, -0.607)
		colorDistMagn   0.449426
		colorDistFreq   8.5103
		detailScale     3171.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.653142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566639
		terraceProb     0.335227
		erosion         0
		montesMagn      0.549322
		montesFreq      3.28422
		montesSpiky     0.988396
		montesFraction  0.335521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.6724
		hillsFraction   0.749245
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223572
		craterFreq      0.455239
		craterDensity   0.8471
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439777
		volcanoTemp     1625.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.178, 0.177, 0.000)
		colorShelf     (0.192, 0.190, 0.188, 0.000)
		colorBeach     (0.203, 0.201, 0.199, 0.000)
		colorDesert    (0.214, 0.212, 0.210, 0.000)
		colorLowland   (0.226, 0.223, 0.221, 0.000)
		colorUpland    (0.237, 0.234, 0.232, 0.000)
		colorRock      (0.248, 0.245, 0.243, 0.000)
		colorSnow      (0.259, 0.257, 0.254, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0270837
		Period          0.0969232
		Eccentricity    0.220818
		Inclination     42.5708
		AscendingNode   118.005
		ArgOfPericenter 12.5765
		MeanAnomaly     114.423
	}
}

DwarfMoon	"Cantonica System 4.D36"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            6.85981e-007
	Radius          68.0715
	InertiaMoment   0.397832

	Obliquity       -9.75659
	EqAscendNode    -40.0958
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.580 0.550)

	Surface
	{
		SurfStyle       0.299153
		OceanStyle      0.443327
		Randomize      (0.304, -0.547, 0.147)
		colorDistMagn   0.899185
		colorDistFreq   1.92466
		detailScale     1858.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.314329
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423988
		terraceProb     0.226983
		erosion         0
		montesMagn      0.457396
		montesFreq      2.66924
		montesSpiky     0.831014
		montesFraction  0.793893
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.9637
		hillsFraction   0.485507
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.296042
		craterFreq      0.192495
		craterDensity   0.886029
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497265
		volcanoTemp     1360.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.232, 0.220, 0.000)
		colorShelf     (0.277, 0.247, 0.234, 0.000)
		colorBeach     (0.293, 0.261, 0.247, 0.000)
		colorDesert    (0.309, 0.276, 0.261, 0.000)
		colorLowland   (0.326, 0.290, 0.275, 0.000)
		colorUpland    (0.342, 0.305, 0.289, 0.000)
		colorRock      (0.358, 0.319, 0.302, 0.000)
		colorSnow      (0.375, 0.334, 0.316, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0274575
		Period          0.098937
		Eccentricity    0.00992547
		Inclination     -9.75659
		AscendingNode   -40.0958
		ArgOfPericenter -177.57
		MeanAnomaly     -50.6001
	}
}

DwarfMoon	"Cantonica System 4.D37"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.81439e-007
	Radius          134.813
	InertiaMoment   0.399032

	Obliquity       -48.4673
	EqAscendNode    143.201
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.551 0.512)

	Surface
	{
		SurfStyle       0.274331
		OceanStyle      0.37637
		Randomize      (-0.172, -0.185, 0.263)
		colorDistMagn   0.718401
		colorDistFreq   11.5957
		detailScale     3681.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.459184
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470941
		terraceProb     0.186525
		erosion         0
		montesMagn      0.557762
		montesFreq      3.40048
		montesSpiky     0.958999
		montesFraction  0.202309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       55.3581
		hillsFraction   0.694358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265673
		craterFreq      0.763666
		craterDensity   0.955057
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502555
		volcanoTemp     1266.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.220, 0.205, 0.000)
		colorShelf     (0.265, 0.234, 0.218, 0.000)
		colorBeach     (0.280, 0.248, 0.231, 0.000)
		colorDesert    (0.296, 0.262, 0.243, 0.000)
		colorLowland   (0.312, 0.276, 0.256, 0.000)
		colorUpland    (0.327, 0.289, 0.269, 0.000)
		colorRock      (0.343, 0.303, 0.282, 0.000)
		colorSnow      (0.358, 0.317, 0.295, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0279437
		Period          0.101576
		Eccentricity    0.47669
		Inclination     -48.4673
		AscendingNode   143.201
		ArgOfPericenter -7.77202
		MeanAnomaly     126.496
	}
}

DwarfMoon	"Cantonica System 4.D38"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.4237e-006
	Radius          110.085
	InertiaMoment   0.399945

	Obliquity       -33.1516
	EqAscendNode    -46.3041
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.737 0.733)

	Surface
	{
		SurfStyle       0.0913901
		OceanStyle      0.255196
		Randomize      (0.462, -0.657, 0.190)
		colorDistMagn   0.886291
		colorDistFreq   3.53979
		detailScale     3006.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86926
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.762882
		terraceProb     0.223314
		erosion         0
		montesMagn      0.522208
		montesFreq      3.6174
		montesSpiky     0.919947
		montesFraction  0.351363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.5262
		hillsFraction   0.589121
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234933
		craterFreq      0.446286
		craterDensity   0.85336
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491871
		volcanoTemp     1203.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.293, 0.000)
		colorShelf     (0.314, 0.313, 0.311, 0.000)
		colorBeach     (0.333, 0.331, 0.330, 0.000)
		colorDesert    (0.351, 0.350, 0.348, 0.000)
		colorLowland   (0.370, 0.368, 0.366, 0.000)
		colorUpland    (0.388, 0.387, 0.385, 0.000)
		colorRock      (0.407, 0.405, 0.403, 0.000)
		colorSnow      (0.425, 0.424, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0281484
		Period          0.102694
		Eccentricity    0.0143411
		Inclination     -33.1516
		AscendingNode   -46.3041
		ArgOfPericenter 135.233
		MeanAnomaly     -123.241
	}
}

DwarfMoon	"Cantonica System 4.D39"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.0999e-006
	Radius          190.801
	InertiaMoment   0.398044

	Obliquity       11.8508
	EqAscendNode    11.765
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.571 0.563 0.559)

	Surface
	{
		SurfStyle       0.848869
		OceanStyle      0.205705
		Randomize      (0.858, 0.597, -0.125)
		colorDistMagn   0.115937
		colorDistFreq   19.5742
		detailScale     5210.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.399949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440761
		terraceProb     0.329955
		erosion         0
		montesMagn      0.42014
		montesFreq      2.96869
		montesSpiky     0.913738
		montesFraction  0.440609
		dunesFraction   0
		hillsMagn       0
		hillsFreq       80.6483
		hillsFraction   0.754009
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213441
		craterFreq      1.04154
		craterDensity   0.993739
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523499
		volcanoTemp     1166.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.191, 0.156, 0.000)
		colorShelf     (0.228, 0.197, 0.179, 0.000)
		colorBeach     (0.268, 0.231, 0.212, 0.000)
		colorDesert    (0.291, 0.248, 0.207, 0.000)
		colorLowland   (0.320, 0.265, 0.235, 0.000)
		colorUpland    (0.354, 0.321, 0.285, 0.000)
		colorRock      (0.382, 0.349, 0.307, 0.000)
		colorSnow      (0.417, 0.371, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.028581
		Period          0.105071
		Eccentricity    0.00730172
		Inclination     11.8508
		AscendingNode   11.765
		ArgOfPericenter -139.857
		MeanAnomaly     19.9736
	}
}

DwarfMoon	"Cantonica System 4.D40"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.16028e-006
	Radius          114.237
	InertiaMoment   0.39917

	Obliquity       88.9582
	EqAscendNode    179.772
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.772 0.770)

	Surface
	{
		SurfStyle       0.0439711
		OceanStyle      0.255917
		Randomize      (0.951, 0.271, -0.221)
		colorDistMagn   0.582605
		colorDistFreq   3.4843
		detailScale     3119.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0039818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444447
		terraceProb     0.449629
		erosion         0
		montesMagn      0.57289
		montesFreq      3.01904
		montesSpiky     0.979331
		montesFraction  0.426475
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.6766
		hillsFraction   0.491552
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250591
		craterFreq      0.353163
		craterDensity   0.872899
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585793
		volcanoTemp     1345.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.309, 0.308, 0.000)
		colorShelf     (0.329, 0.328, 0.327, 0.000)
		colorBeach     (0.348, 0.347, 0.346, 0.000)
		colorDesert    (0.367, 0.367, 0.366, 0.000)
		colorLowland   (0.387, 0.386, 0.385, 0.000)
		colorUpland    (0.406, 0.405, 0.404, 0.000)
		colorRock      (0.425, 0.425, 0.423, 0.000)
		colorSnow      (0.445, 0.444, 0.443, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.028789
		Period          0.10622
		Eccentricity    0.000648833
		Inclination     88.9582
		AscendingNode   179.772
		ArgOfPericenter -161.555
		MeanAnomaly     -94.0326
	}
}

DwarfMoon	"Cantonica System 4.D41"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.87486e-006
	Radius          231.468
	InertiaMoment   0.395606

	RotationPeriod  1419.32
	Obliquity       -74.1968
	EqAscendNode    -129.117

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.810 0.775 0.745)

	Surface
	{
		SurfStyle       0.671402
		OceanStyle      0.106861
		Randomize      (0.140, 0.112, -0.677)
		colorDistMagn   0.769328
		colorDistFreq   36.6126
		detailScale     6320.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.752771
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322213
		terraceProb     0.533186
		erosion         0
		montesMagn      0.495018
		montesFreq      2.61992
		montesSpiky     0.927071
		montesFraction  0.457947
		dunesFraction   0
		hillsMagn       0
		hillsFreq       95.2645
		hillsFraction   0.601601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230548
		craterFreq      2.003
		craterDensity   0.824379
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553033
		volcanoTemp     1652.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.263, 0.208, 0.000)
		colorShelf     (0.324, 0.271, 0.238, 0.000)
		colorBeach     (0.381, 0.318, 0.283, 0.000)
		colorDesert    (0.413, 0.341, 0.275, 0.000)
		colorLowland   (0.454, 0.364, 0.313, 0.000)
		colorUpland    (0.502, 0.442, 0.380, 0.000)
		colorRock      (0.543, 0.480, 0.410, 0.000)
		colorSnow      (0.592, 0.511, 0.432, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0290996
		Period          0.107943
		Eccentricity    0.227454
		Inclination     -74.1968
		AscendingNode   -129.117
		ArgOfPericenter -99.89
		MeanAnomaly     -139.297
	}
}

DwarfMoon	"Cantonica System 4.D42"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.40426e-011
	Radius          1.6288
	InertiaMoment   0.398237

	Obliquity       -37.7128
	EqAscendNode    -74.0406
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.465 0.383)

	Surface
	{
		SurfStyle       0.549459
		OceanStyle      0.596831
		Randomize      (0.778, -0.912, 0.783)
		colorDistMagn   0.0728157
		colorDistFreq   0.0010198
		detailScale     44.4771
		colorConversion true
		snowLevel       2
		tropicLatitude  0.852373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36066
		terraceProb     0.192706
		erosion         0
		montesMagn      0.278518
		montesFreq      3.21813
		montesSpiky     0.734081
		montesFraction  0.494849
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00476972
		hillsFraction   0.581313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218472
		craterFreq      0.161671
		craterDensity   0.992684
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.610412
		volcanoTemp     1539.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.158, 0.107, 0.000)
		colorShelf     (0.245, 0.163, 0.123, 0.000)
		colorBeach     (0.288, 0.190, 0.146, 0.000)
		colorDesert    (0.312, 0.204, 0.142, 0.000)
		colorLowland   (0.343, 0.218, 0.161, 0.000)
		colorUpland    (0.380, 0.265, 0.195, 0.000)
		colorRock      (0.410, 0.288, 0.211, 0.000)
		colorSnow      (0.447, 0.307, 0.222, 1.000)
		BumpHeight      1.46592
		BumpOffset      0.293184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0294193
		Period          0.109728
		Eccentricity    0.341576
		Inclination     -37.7128
		AscendingNode   -74.0406
		ArgOfPericenter -149.505
		MeanAnomaly     38.735
	}
}

DwarfMoon	"Cantonica System 4.D43"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.8077e-011
	Radius          4.56893
	InertiaMoment   0.399304

	RotationPeriod  1625.82
	Obliquity       -35.3516
	EqAscendNode    -19.7638

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.472 0.382)

	Surface
	{
		SurfStyle       0.0427957
		OceanStyle      0.72423
		Randomize      (-0.305, 0.886, -0.669)
		colorDistMagn   0.569619
		colorDistFreq   0.0138938
		detailScale     124.762
		colorConversion true
		snowLevel       2
		tropicLatitude  0.936682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.720548
		terraceProb     0.222969
		erosion         0
		montesMagn      0.6686
		montesFreq      3.19891
		montesSpiky     0.942825
		montesFraction  0.583689
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0388818
		hillsFraction   0.537258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234131
		craterFreq      0.258679
		craterDensity   0.690987
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413131
		volcanoTemp     1538.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.189, 0.153, 0.000)
		colorShelf     (0.237, 0.200, 0.163, 0.000)
		colorBeach     (0.251, 0.212, 0.172, 0.000)
		colorDesert    (0.265, 0.224, 0.182, 0.000)
		colorLowland   (0.279, 0.236, 0.191, 0.000)
		colorUpland    (0.293, 0.248, 0.201, 0.000)
		colorRock      (0.307, 0.259, 0.210, 0.000)
		colorSnow      (0.321, 0.271, 0.220, 1.000)
		BumpHeight      4.11204
		BumpOffset      0.822408
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0296968
		Period          0.111283
		Eccentricity    0.391294
		Inclination     -35.3516
		AscendingNode   -19.7638
		ArgOfPericenter 3.38174
		MeanAnomaly     -15.5976
	}
}

DwarfMoon	"Cantonica System 4.D44"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.13508e-011
	Radius          2.91883
	InertiaMoment   0.396474

	RotationPeriod  5031.66
	Obliquity       15.3487
	EqAscendNode    -140.223

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.664 0.569 0.435)

	Surface
	{
		SurfStyle       0.421698
		OceanStyle      0.351121
		Randomize      (0.699, 0.680, -0.703)
		colorDistMagn   0.977832
		colorDistFreq   0.00559426
		detailScale     79.7035
		colorConversion true
		snowLevel       2
		tropicLatitude  0.179362
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66741
		terraceProb     0.544111
		erosion         0
		montesMagn      0.46335
		montesFreq      2.79704
		montesSpiky     0.984095
		montesFraction  0.744861
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.016525
		hillsFraction   0.66605
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209838
		craterFreq      0.184118
		craterDensity   1.02948
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43919
		volcanoTemp     1424.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.227, 0.174, 0.000)
		colorShelf     (0.282, 0.242, 0.185, 0.000)
		colorBeach     (0.299, 0.256, 0.196, 0.000)
		colorDesert    (0.315, 0.270, 0.207, 0.000)
		colorLowland   (0.332, 0.284, 0.218, 0.000)
		colorUpland    (0.349, 0.298, 0.229, 0.000)
		colorRock      (0.365, 0.313, 0.239, 0.000)
		colorSnow      (0.382, 0.327, 0.250, 1.000)
		BumpHeight      2.62695
		BumpOffset      0.525389
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0303195
		Period          0.114802
		Eccentricity    0.309902
		Inclination     15.3487
		AscendingNode   -140.223
		ArgOfPericenter -62.2139
		MeanAnomaly     71.2349
	}
}

DwarfMoon	"Cantonica System 4.D45"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.81435e-011
	Radius          6.1119
	InertiaMoment   0.398414

	RotationPeriod  1539.04
	Obliquity       -75.7985
	EqAscendNode    30.1058

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.676 0.672)

	Surface
	{
		SurfStyle       0.825416
		OceanStyle      0.800912
		Randomize      (-0.195, -0.070, -0.163)
		colorDistMagn   0.782164
		colorDistFreq   0.00547579
		detailScale     166.896
		colorConversion true
		snowLevel       2
		tropicLatitude  0.6582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426843
		terraceProb     0.247253
		erosion         0
		montesMagn      0.389116
		montesFreq      3.63984
		montesSpiky     0.851404
		montesFraction  0.473436
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0912639
		hillsFraction   0.610219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218771
		craterFreq      0.223347
		craterDensity   0.781868
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586058
		volcanoTemp     1497.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.230, 0.188, 0.000)
		colorShelf     (0.272, 0.236, 0.215, 0.000)
		colorBeach     (0.319, 0.277, 0.255, 0.000)
		colorDesert    (0.346, 0.297, 0.249, 0.000)
		colorLowland   (0.380, 0.318, 0.282, 0.000)
		colorUpland    (0.421, 0.385, 0.343, 0.000)
		colorRock      (0.455, 0.419, 0.369, 0.000)
		colorSnow      (0.496, 0.446, 0.390, 1.000)
		BumpHeight      5.50071
		BumpOffset      1.10014
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0307138
		Period          0.117049
		Eccentricity    0.398315
		Inclination     -75.7985
		AscendingNode   30.1058
		ArgOfPericenter -121.388
		MeanAnomaly     -28.9018
	}
}

DwarfMoon	"Cantonica System 4.S1"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.98793e-015
	Radius          0.124832
	InertiaMoment   0.399436

	Oblateness      0.169079

	Obliquity       1.0927
	EqAscendNode    -99.8873
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.650 0.647)

	Surface
	{
		SurfStyle       0.0599086
		OceanStyle      0.618733
		Randomize      (-0.393, 0.296, -0.243)
		colorDistMagn   0.451883
		colorDistFreq   5.95878e-006
		detailScale     3.40876
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0245437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387065
		terraceProb     0.472774
		erosion         0
		montesMagn      0.350971
		montesFreq      2.47083
		montesSpiky     0.9567
		montesFraction  0.499767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.20912e-005
		hillsFraction   0.442019
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240781
		craterFreq      0.19597
		craterDensity   0.89087
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49954
		volcanoTemp     1309.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.259, 0.000)
		colorShelf     (0.278, 0.276, 0.275, 0.000)
		colorBeach     (0.294, 0.292, 0.291, 0.000)
		colorDesert    (0.311, 0.309, 0.307, 0.000)
		colorLowland   (0.327, 0.325, 0.324, 0.000)
		colorUpland    (0.343, 0.341, 0.340, 0.000)
		colorRock      (0.360, 0.357, 0.356, 0.000)
		colorSnow      (0.376, 0.374, 0.372, 1.000)
		BumpHeight      0.112349
		BumpOffset      0.0224698
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000795839
		Period          0.000488207
		Eccentricity    0
		Inclination     1.0927
		AscendingNode   -99.8873
		ArgOfPericenter 141.525
		MeanAnomaly     75.5691
	}
}

DwarfMoon	"Cantonica System 4.S2"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.81721e-015
	Radius          0.325128
	InertiaMoment   0.396954

	Oblateness      0.249

	Obliquity       1.46542
	EqAscendNode    149.505
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.531 0.410)

	Surface
	{
		SurfStyle       0.530283
		OceanStyle      0.662279
		Randomize      (0.128, -0.233, -0.934)
		colorDistMagn   0.342899
		colorDistFreq   7.06156e-005
		detailScale     8.87815
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0134518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534892
		terraceProb     0.578494
		erosion         0
		montesMagn      0.286822
		montesFreq      2.4953
		montesSpiky     0.9945
		montesFraction  0.55117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000371638
		hillsFraction   0.509065
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256935
		craterFreq      0.23948
		craterDensity   0.904067
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514776
		volcanoTemp     1490.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.181, 0.115, 0.000)
		colorShelf     (0.257, 0.186, 0.131, 0.000)
		colorBeach     (0.302, 0.218, 0.156, 0.000)
		colorDesert    (0.328, 0.234, 0.152, 0.000)
		colorLowland   (0.360, 0.250, 0.172, 0.000)
		colorUpland    (0.399, 0.303, 0.209, 0.000)
		colorRock      (0.431, 0.329, 0.226, 0.000)
		colorSnow      (0.469, 0.351, 0.238, 1.000)
		BumpHeight      0.292615
		BumpOffset      0.058523
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000798663
		Period          0.000490808
		Eccentricity    0
		Inclination     1.46542
		AscendingNode   149.505
		ArgOfPericenter -140.254
		MeanAnomaly     101.814
	}
}

DwarfMoon	"Cantonica System 4.S3"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.55889e-014
	Radius          0.197945
	InertiaMoment   0.39858

	Oblateness      0.249

	Obliquity       -0.331116
	EqAscendNode    150.262
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.454 0.453)

	Surface
	{
		SurfStyle       0.531437
		OceanStyle      0.503488
		Randomize      (-0.453, -0.555, -0.058)
		colorDistMagn   0.846111
		colorDistFreq   2.26494e-005
		detailScale     5.40523
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0029701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565322
		terraceProb     0.274104
		erosion         0
		montesMagn      0.32456
		montesFreq      3.06397
		montesSpiky     0.866802
		montesFraction  0.843102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.73193e-005
		hillsFraction   0.690879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235471
		craterFreq      0.207583
		craterDensity   0.942821
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517942
		volcanoTemp     1212.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.154, 0.127, 0.000)
		colorShelf     (0.183, 0.159, 0.145, 0.000)
		colorBeach     (0.215, 0.186, 0.172, 0.000)
		colorDesert    (0.233, 0.200, 0.167, 0.000)
		colorLowland   (0.256, 0.214, 0.190, 0.000)
		colorUpland    (0.284, 0.259, 0.231, 0.000)
		colorRock      (0.306, 0.282, 0.249, 0.000)
		colorSnow      (0.334, 0.300, 0.263, 1.000)
		BumpHeight      0.178151
		BumpOffset      0.0356302
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000805135
		Period          0.000496786
		Eccentricity    0
		Inclination     -0.331116
		AscendingNode   150.262
		ArgOfPericenter -128.593
		MeanAnomaly     -167.429
	}
}

DwarfMoon	"Cantonica System 4.S4"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.41326e-014
	Radius          0.399186
	InertiaMoment   0.399564

	Oblateness      0.249

	Obliquity       0.717163
	EqAscendNode    -166.839
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.719 0.716)

	Surface
	{
		SurfStyle       0.187075
		OceanStyle      0.712559
		Randomize      (0.609, 0.752, -0.749)
		colorDistMagn   0.669341
		colorDistFreq   8.20203e-005
		detailScale     10.9004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.002868
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654229
		terraceProb     0.430098
		erosion         0
		montesMagn      0.242505
		montesFreq      3.19239
		montesSpiky     0.909037
		montesFraction  0.182249
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000242253
		hillsFraction   0.615717
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218738
		craterFreq      0.229517
		craterDensity   0.886559
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495761
		volcanoTemp     1257.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.286, 0.000)
		colorShelf     (0.306, 0.305, 0.304, 0.000)
		colorBeach     (0.324, 0.323, 0.322, 0.000)
		colorDesert    (0.342, 0.341, 0.340, 0.000)
		colorLowland   (0.360, 0.359, 0.358, 0.000)
		colorUpland    (0.378, 0.377, 0.376, 0.000)
		colorRock      (0.396, 0.395, 0.394, 0.000)
		colorSnow      (0.414, 0.413, 0.412, 1.000)
		BumpHeight      0.359267
		BumpOffset      0.0718534
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000806597
		Period          0.000498139
		Eccentricity    0
		Inclination     0.717163
		AscendingNode   -166.839
		ArgOfPericenter 100.543
		MeanAnomaly     52.9131
	}
}

DwarfMoon	"Cantonica System 4.S5"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.66011e-014
	Radius          0.231483
	InertiaMoment   0.397303

	Oblateness      0.163204

	Obliquity       -0.874018
	EqAscendNode    -156.228
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.531 0.388)

	Surface
	{
		SurfStyle       0.0840264
		OceanStyle      0.291154
		Randomize      (-0.539, 0.627, -0.359)
		colorDistMagn   0.774987
		colorDistFreq   9.2012e-006
		detailScale     6.32102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00628155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.28185
		terraceProb     0.168323
		erosion         0
		montesMagn      0.424999
		montesFreq      2.65661
		montesSpiky     0.796153
		montesFraction  0.628324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.61329e-005
		hillsFraction   0.491664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213451
		craterFreq      0.159986
		craterDensity   0.785346
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58451
		volcanoTemp     1250.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.212, 0.155, 0.000)
		colorShelf     (0.259, 0.226, 0.165, 0.000)
		colorBeach     (0.274, 0.239, 0.175, 0.000)
		colorDesert    (0.289, 0.252, 0.184, 0.000)
		colorLowland   (0.304, 0.265, 0.194, 0.000)
		colorUpland    (0.319, 0.279, 0.204, 0.000)
		colorRock      (0.335, 0.292, 0.214, 0.000)
		colorSnow      (0.350, 0.305, 0.223, 1.000)
		BumpHeight      0.208334
		BumpOffset      0.0416669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000814527
		Period          0.000505504
		Eccentricity    0
		Inclination     -0.874018
		AscendingNode   -156.228
		ArgOfPericenter 95.6521
		MeanAnomaly     -72.4027
	}
}

DwarfMoon	"Cantonica System 4.S6"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.45951e-014
	Radius          0.582824
	InertiaMoment   0.398736

	Oblateness      0.249

	Obliquity       -0.141823
	EqAscendNode    -89.5249
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.706 0.700)

	Surface
	{
		SurfStyle       0.84525
		OceanStyle      0.909403
		Randomize      (-0.178, 0.435, 0.682)
		colorDistMagn   0.632955
		colorDistFreq   0.000110223
		detailScale     15.915
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00352104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612439
		terraceProb     0.210076
		erosion         0
		montesMagn      0.560898
		montesFreq      3.07773
		montesSpiky     0.966166
		montesFraction  0.753842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0006816
		hillsFraction   0.503599
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249657
		craterFreq      0.266074
		craterDensity   0.830322
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462639
		volcanoTemp     1085.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.240, 0.196, 0.000)
		colorShelf     (0.284, 0.247, 0.224, 0.000)
		colorBeach     (0.333, 0.289, 0.266, 0.000)
		colorDesert    (0.362, 0.311, 0.259, 0.000)
		colorLowland   (0.397, 0.332, 0.294, 0.000)
		colorUpland    (0.440, 0.402, 0.357, 0.000)
		colorRock      (0.475, 0.438, 0.385, 0.000)
		colorSnow      (0.518, 0.466, 0.406, 1.000)
		BumpHeight      0.524542
		BumpOffset      0.104908
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000816653
		Period          0.000507484
		Eccentricity    0
		Inclination     -0.141823
		AscendingNode   -89.5249
		ArgOfPericenter 112.19
		MeanAnomaly     -179.196
	}
}

DwarfMoon	"Cantonica System 4.S7"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.03377e-014
	Radius          0.345127
	InertiaMoment   0.399692

	Oblateness      0.240578

	Obliquity       -1.12272
	EqAscendNode    -137.696
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.483 0.481)

	Surface
	{
		SurfStyle       0.931478
		OceanStyle      0.986287
		Randomize      (-0.342, -0.440, 0.984)
		colorDistMagn   0.285687
		colorDistFreq   5.23096e-005
		detailScale     9.42426
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0141387
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414071
		terraceProb     0.505918
		erosion         0
		montesMagn      0.523037
		montesFreq      3.15803
		montesSpiky     0.814966
		montesFraction  0.628904
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000273896
		hillsFraction   0.701415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274118
		craterFreq      0.21692
		craterDensity   0.884524
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493158
		volcanoTemp     1317.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.169, 0.192, 0.050)
		colorShelf     (0.196, 0.198, 0.221, 0.040)
		colorBeach     (0.226, 0.227, 0.250, 0.030)
		colorDesert    (0.255, 0.256, 0.284, 0.020)
		colorLowland   (0.284, 0.285, 0.312, 0.030)
		colorUpland    (0.314, 0.314, 0.341, 0.050)
		colorRock      (0.343, 0.343, 0.380, 0.020)
		colorSnow      (0.343, 0.343, 0.380, 1.000)
		BumpHeight      0.310614
		BumpOffset      0.0621228
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000823529
		Period          0.000513907
		Eccentricity    0
		Inclination     -1.12272
		AscendingNode   -137.696
		ArgOfPericenter 108.778
		MeanAnomaly     -57.5351
	}
}

DwarfMoon	"Cantonica System 4.S8"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.1692e-013
	Radius          0.679325
	InertiaMoment   0.397586

	Oblateness      0.249

	Obliquity       -0.846805
	EqAscendNode    -8.76749
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.677 0.674)

	Surface
	{
		SurfStyle       0.91491
		OceanStyle      0.365968
		Randomize      (0.616, -0.485, -0.181)
		colorDistMagn   0.956764
		colorDistFreq   0.000188335
		detailScale     18.5501
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0294681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.686692
		terraceProb     0.231751
		erosion         0
		montesMagn      0.485044
		montesFreq      3.35392
		montesSpiky     0.936783
		montesFraction  0.523441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00149734
		hillsFraction   0.802754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268376
		craterFreq      0.257232
		craterDensity   0.857477
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428512
		volcanoTemp     1591.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.237, 0.270, 0.050)
		colorShelf     (0.272, 0.278, 0.310, 0.040)
		colorBeach     (0.313, 0.318, 0.351, 0.030)
		colorDesert    (0.354, 0.359, 0.398, 0.020)
		colorLowland   (0.394, 0.400, 0.438, 0.030)
		colorUpland    (0.435, 0.440, 0.479, 0.050)
		colorRock      (0.476, 0.481, 0.533, 0.020)
		colorSnow      (0.476, 0.481, 0.533, 1.000)
		BumpHeight      0.611392
		BumpOffset      0.122278
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000825995
		Period          0.000516217
		Eccentricity    0
		Inclination     -0.846805
		AscendingNode   -8.76749
		ArgOfPericenter 143.72
		MeanAnomaly     58.4202
	}
}

DwarfMoon	"Cantonica System 4.S9"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.6865e-013
	Radius          0.389844
	InertiaMoment   0.398885

	Oblateness      0.161643

	Obliquity       -0.958578
	EqAscendNode    72.5035
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.561 0.558 0.555)

	Surface
	{
		SurfStyle       0.247395
		OceanStyle      0.0463555
		Randomize      (-0.699, 0.848, 0.180)
		colorDistMagn   0.311072
		colorDistFreq   3.58464e-005
		detailScale     10.6453
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0269792
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510903
		terraceProb     0.254771
		erosion         0
		montesMagn      0.651717
		montesFreq      3.17437
		montesSpiky     0.888164
		montesFraction  0.587305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000271999
		hillsFraction   0.690262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257139
		craterFreq      0.160374
		craterDensity   0.922419
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48882
		volcanoTemp     1595.73
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
		BumpHeight      0.350859
		BumpOffset      0.0701719
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000828637
		Period          0.000518695
		Eccentricity    0
		Inclination     -0.958578
		AscendingNode   72.5035
		ArgOfPericenter -83.9416
		MeanAnomaly     164.033
	}
}

DwarfMoon	"Cantonica System 4.S10"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.41553e-013
	Radius          0.970664
	InertiaMoment   0.399817

	Oblateness      0.249

	Obliquity       0.869521
	EqAscendNode    -61.7548
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.506 0.502)

	Surface
	{
		SurfStyle       0.0179261
		OceanStyle      0.734933
		Randomize      (-0.488, 0.732, -0.877)
		colorDistMagn   0.415014
		colorDistFreq   0.000613306
		detailScale     26.5056
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0260466
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653316
		terraceProb     0.246421
		erosion         0
		montesMagn      0.402871
		montesFreq      2.46964
		montesSpiky     0.789389
		montesFraction  0.537324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00210431
		hillsFraction   0.81463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2141
		craterFreq      0.195625
		craterDensity   0.84377
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485071
		volcanoTemp     1182.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.202, 0.201, 0.000)
		colorShelf     (0.219, 0.215, 0.214, 0.000)
		colorBeach     (0.231, 0.228, 0.226, 0.000)
		colorDesert    (0.244, 0.240, 0.239, 0.000)
		colorLowland   (0.257, 0.253, 0.251, 0.000)
		colorUpland    (0.270, 0.266, 0.264, 0.000)
		colorRock      (0.283, 0.278, 0.276, 0.000)
		colorSnow      (0.296, 0.291, 0.289, 1.000)
		BumpHeight      0.873598
		BumpOffset      0.174719
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000835846
		Period          0.000525479
		Eccentricity    0
		Inclination     0.869521
		AscendingNode   -61.7548
		ArgOfPericenter -34.2785
		MeanAnomaly     -102.44
	}
}

DwarfMoon	"Cantonica System 4.S11"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.44087e-013
	Radius          0.566001
	InertiaMoment   0.397827

	Oblateness      0.23426

	Obliquity       -1.46965
	EqAscendNode    131.585
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.668 0.666)

	Surface
	{
		SurfStyle       0.962843
		OceanStyle      0.246376
		Randomize      (-0.836, 0.860, 0.949)
		colorDistMagn   0.776801
		colorDistFreq   0.000141351
		detailScale     15.4556
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0210318
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60941
		terraceProb     0.262989
		erosion         0
		montesMagn      0.544079
		montesFreq      3.03741
		montesSpiky     0.925271
		montesFraction  0.457204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000647064
		hillsFraction   0.619638
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218194
		craterFreq      0.253139
		craterDensity   0.855263
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531782
		volcanoTemp     1348.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.234, 0.266, 0.050)
		colorShelf     (0.269, 0.274, 0.306, 0.040)
		colorBeach     (0.309, 0.314, 0.346, 0.030)
		colorDesert    (0.349, 0.354, 0.393, 0.020)
		colorLowland   (0.389, 0.394, 0.433, 0.030)
		colorUpland    (0.430, 0.434, 0.473, 0.050)
		colorRock      (0.470, 0.474, 0.526, 0.020)
		colorSnow      (0.470, 0.474, 0.526, 1.000)
		BumpHeight      0.509401
		BumpOffset      0.10188
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000837097
		Period          0.000526659
		Eccentricity    0
		Inclination     -1.46965
		AscendingNode   131.585
		ArgOfPericenter -154.384
		MeanAnomaly     -27.5354
	}
}

DwarfMoon	"Cantonica System 4.S12"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.88193e-013
	Radius          1.10008
	InertiaMoment   0.399029

	Oblateness      0.249

	Obliquity       0.590946
	EqAscendNode    -81.1749
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.528 0.525 0.518)

	Surface
	{
		SurfStyle       0.14585
		OceanStyle      0.166578
		Randomize      (-0.058, -0.876, -0.045)
		colorDistMagn   0.40069
		colorDistFreq   0.000824354
		detailScale     30.0395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0156626
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647253
		terraceProb     0.160667
		erosion         0
		montesMagn      0.515797
		montesFreq      2.89777
		montesSpiky     0.983872
		montesFraction  0.361157
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00231262
		hillsFraction   0.767817
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234559
		craterFreq      0.265443
		craterDensity   0.717574
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540882
		volcanoTemp     1133.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.210, 0.207, 0.000)
		colorShelf     (0.224, 0.223, 0.220, 0.000)
		colorBeach     (0.238, 0.236, 0.233, 0.000)
		colorDesert    (0.251, 0.249, 0.246, 0.000)
		colorLowland   (0.264, 0.262, 0.259, 0.000)
		colorUpland    (0.277, 0.275, 0.272, 0.000)
		colorRock      (0.290, 0.289, 0.285, 0.000)
		colorSnow      (0.304, 0.302, 0.298, 1.000)
		BumpHeight      0.99007
		BumpOffset      0.198014
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000840152
		Period          0.000529545
		Eccentricity    0
		Inclination     0.590946
		AscendingNode   -81.1749
		ArgOfPericenter -145.881
		MeanAnomaly     -137.928
	}
}

DwarfMoon	"Cantonica System 4.S13"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            6.90834e-013
	Radius          0.630478
	InertiaMoment   0.399943

	Oblateness      0.155501

	Obliquity       0.958427
	EqAscendNode    51.4741
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.795 0.793)

	Surface
	{
		SurfStyle       0.507679
		OceanStyle      0.17857
		Randomize      (-0.542, -0.478, 0.190)
		colorDistMagn   0.299538
		colorDistFreq   0.000231457
		detailScale     17.2163
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0301319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556402
		terraceProb     0.106406
		erosion         0
		montesMagn      0.521964
		montesFreq      2.27153
		montesSpiky     0.948495
		montesFraction  0.617611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000915768
		hillsFraction   0.834223
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228082
		craterFreq      0.196183
		craterDensity   1.01323
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494554
		volcanoTemp     1395.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.270, 0.222, 0.000)
		colorShelf     (0.320, 0.278, 0.254, 0.000)
		colorBeach     (0.376, 0.326, 0.301, 0.000)
		colorDesert    (0.408, 0.350, 0.294, 0.000)
		colorLowland   (0.447, 0.374, 0.333, 0.000)
		colorUpland    (0.495, 0.453, 0.405, 0.000)
		colorRock      (0.535, 0.493, 0.436, 0.000)
		colorSnow      (0.583, 0.525, 0.460, 1.000)
		BumpHeight      0.56743
		BumpOffset      0.113486
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000849564
		Period          0.000538469
		Eccentricity    0
		Inclination     0.958427
		AscendingNode   51.4741
		ArgOfPericenter 78.2193
		MeanAnomaly     29.3426
	}
}

DwarfMoon	"Cantonica System 4.S14"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.76276e-013
	Radius          1.57594
	InertiaMoment   0.39804

	Oblateness      0.249

	Obliquity       0.248205
	EqAscendNode    -25.486
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.775 0.773)

	Surface
	{
		SurfStyle       0.773644
		OceanStyle      0.216018
		Randomize      (-0.345, 0.453, -0.248)
		colorDistMagn   0.613561
		colorDistFreq   0.00111671
		detailScale     43.0338
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00845015
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344275
		terraceProb     0.261631
		erosion         0
		montesMagn      0.482894
		montesFreq      3.91311
		montesSpiky     0.883914
		montesFraction  0.639997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00637782
		hillsFraction   0.52453
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246735
		craterFreq      0.2745
		craterDensity   0.884156
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522253
		volcanoTemp     1440.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.264, 0.217, 0.000)
		colorShelf     (0.311, 0.271, 0.248, 0.000)
		colorBeach     (0.365, 0.318, 0.294, 0.000)
		colorDesert    (0.396, 0.341, 0.286, 0.000)
		colorLowland   (0.435, 0.364, 0.325, 0.000)
		colorUpland    (0.482, 0.442, 0.394, 0.000)
		colorRock      (0.521, 0.481, 0.425, 0.000)
		colorSnow      (0.567, 0.512, 0.449, 1.000)
		BumpHeight      1.41835
		BumpOffset      0.28367
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000851324
		Period          0.000540142
		Eccentricity    0
		Inclination     0.248205
		AscendingNode   -25.486
		ArgOfPericenter 140.925
		MeanAnomaly     113.053
	}
}

DwarfMoon	"Cantonica System 4.S15"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.37954e-012
	Radius          0.908515
	InertiaMoment   0.399167

	Oblateness      0.223305

	Obliquity       -0.841673
	EqAscendNode    -153.073
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.484 0.483)

	Surface
	{
		SurfStyle       0.874597
		OceanStyle      0.501917
		Randomize      (-0.970, -0.553, 0.740)
		colorDistMagn   0.87715
		colorDistFreq   0.000343971
		detailScale     24.8085
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0068359
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642711
		terraceProb     0.336902
		erosion         0
		montesMagn      0.492329
		montesFreq      3.33661
		montesSpiky     0.810538
		montesFraction  0.30867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00148211
		hillsFraction   0.74574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246392
		craterFreq      0.267586
		craterDensity   0.861965
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504972
		volcanoTemp     1397.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.169, 0.193, 0.050)
		colorShelf     (0.195, 0.199, 0.222, 0.040)
		colorBeach     (0.224, 0.228, 0.251, 0.030)
		colorDesert    (0.254, 0.257, 0.285, 0.020)
		colorLowland   (0.283, 0.286, 0.314, 0.030)
		colorUpland    (0.312, 0.315, 0.343, 0.050)
		colorRock      (0.341, 0.344, 0.381, 0.020)
		colorSnow      (0.341, 0.344, 0.381, 1.000)
		BumpHeight      0.817664
		BumpOffset      0.163533
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000860854
		Period          0.000549237
		Eccentricity    0
		Inclination     -0.841673
		AscendingNode   -153.073
		ArgOfPericenter 161.604
		MeanAnomaly     103.266
	}
}

DwarfMoon	"Cantonica System 4.S16"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.95165e-012
	Radius          1.75575
	InertiaMoment   0.395575

	Oblateness      0.249

	Obliquity       -0.330444
	EqAscendNode    -179.15
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.459 0.386)

	Surface
	{
		SurfStyle       0.719892
		OceanStyle      0.415571
		Randomize      (0.181, -0.586, 0.504)
		colorDistMagn   0.717278
		colorDistFreq   0.00158033
		detailScale     47.9437
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668375
		terraceProb     0.383298
		erosion         0
		montesMagn      0.598574
		montesFreq      2.9428
		montesSpiky     0.899101
		montesFraction  0.637647
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00720662
		hillsFraction   0.791164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243639
		craterFreq      0.240859
		craterDensity   0.767169
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540777
		volcanoTemp     1482.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.156, 0.108, 0.000)
		colorShelf     (0.257, 0.161, 0.124, 0.000)
		colorBeach     (0.302, 0.188, 0.147, 0.000)
		colorDesert    (0.327, 0.202, 0.143, 0.000)
		colorLowland   (0.359, 0.216, 0.162, 0.000)
		colorUpland    (0.398, 0.262, 0.197, 0.000)
		colorRock      (0.430, 0.285, 0.212, 0.000)
		colorSnow      (0.469, 0.303, 0.224, 1.000)
		BumpHeight      1.58018
		BumpOffset      0.316035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00086747
		Period          0.000555581
		Eccentricity    0
		Inclination     -0.330444
		AscendingNode   -179.15
		ArgOfPericenter -121.844
		MeanAnomaly     16.7095
	}
}

DwarfMoon	"Cantonica System 4.S17"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.76778e-012
	Radius          1.01128
	InertiaMoment   0.398233

	Oblateness      0.14634

	Obliquity       -1.2126
	EqAscendNode    113.354
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.703 0.701)

	Surface
	{
		SurfStyle       0.631979
		OceanStyle      0.768382
		Randomize      (-0.426, -0.081, -0.605)
		colorDistMagn   0.897185
		colorDistFreq   0.000340953
		detailScale     27.6147
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0232495
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688946
		terraceProb     0.298544
		erosion         0
		montesMagn      0.648874
		montesFreq      3.19253
		montesSpiky     0.980709
		montesFraction  0.605959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00350846
		hillsFraction   0.887808
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205556
		craterFreq      0.277334
		craterDensity   0.812151
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525125
		volcanoTemp     959.277
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
		BumpHeight      0.910152
		BumpOffset      0.18203
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000873654
		Period          0.000561533
		Eccentricity    0
		Inclination     -1.2126
		AscendingNode   113.354
		ArgOfPericenter 75.5986
		MeanAnomaly     35.1538
	}
}

DwarfMoon	"Cantonica System 4.S18"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.94013e-012
	Radius          2.58494
	InertiaMoment   0.399301

	Oblateness      0.249

	Obliquity       0.391601
	EqAscendNode    -18.352
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.533 0.529)

	Surface
	{
		SurfStyle       0.0372947
		OceanStyle      0.1393
		Randomize      (0.607, -0.329, -0.147)
		colorDistMagn   0.757518
		colorDistFreq   0.00350004
		detailScale     70.586
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0134961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354712
		terraceProb     0.302497
		erosion         0
		montesMagn      0.487972
		montesFreq      3.40411
		montesSpiky     0.926223
		montesFraction  0.716125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0163699
		hillsFraction   0.650934
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226682
		craterFreq      0.245786
		craterDensity   0.974329
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476778
		volcanoTemp     1443.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.213, 0.212, 0.000)
		colorShelf     (0.228, 0.226, 0.225, 0.000)
		colorBeach     (0.241, 0.240, 0.238, 0.000)
		colorDesert    (0.254, 0.253, 0.251, 0.000)
		colorLowland   (0.268, 0.266, 0.265, 0.000)
		colorUpland    (0.281, 0.280, 0.278, 0.000)
		colorRock      (0.295, 0.293, 0.291, 0.000)
		colorSnow      (0.308, 0.306, 0.304, 1.000)
		BumpHeight      2.32644
		BumpOffset      0.465289
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000879985
		Period          0.000567648
		Eccentricity    0
		Inclination     0.391601
		AscendingNode   -18.352
		ArgOfPericenter -33.3786
		MeanAnomaly     -129.398
	}
}

DwarfMoon	"Cantonica System 4.S19"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.63852e-012
	Radius          1.4687
	InertiaMoment   0.396461

	Oblateness      0.210882

	Obliquity       0.604993
	EqAscendNode    140.771
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.693 0.646)

	Surface
	{
		SurfStyle       0.579029
		OceanStyle      0.0285731
		Randomize      (0.012, -0.621, 0.932)
		colorDistMagn   0.210901
		colorDistFreq   0.000779411
		detailScale     40.1052
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00709265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563939
		terraceProb     0.512812
		erosion         0
		montesMagn      0.596181
		montesFreq      2.92479
		montesSpiky     0.827025
		montesFraction  0.873064
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00515109
		hillsFraction   0.693108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256989
		craterFreq      0.172705
		craterDensity   0.835867
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43441
		volcanoTemp     1552.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.236, 0.181, 0.000)
		colorShelf     (0.318, 0.242, 0.207, 0.000)
		colorBeach     (0.374, 0.284, 0.246, 0.000)
		colorDesert    (0.406, 0.305, 0.239, 0.000)
		colorLowland   (0.445, 0.326, 0.271, 0.000)
		colorUpland    (0.493, 0.395, 0.330, 0.000)
		colorRock      (0.533, 0.430, 0.356, 0.000)
		colorSnow      (0.580, 0.457, 0.375, 1.000)
		BumpHeight      1.32183
		BumpOffset      0.264365
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000884169
		Period          0.000571701
		Eccentricity    0
		Inclination     0.604993
		AscendingNode   140.771
		ArgOfPericenter -113.486
		MeanAnomaly     -65.9121
	}
}

DwarfMoon	"Cantonica System 4.S20"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.12441e-012
	Radius          2.84036
	InertiaMoment   0.39841

	Oblateness      0.249

	Obliquity       1.46167
	EqAscendNode    144.033
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.542 0.369)

	Surface
	{
		SurfStyle       0.624497
		OceanStyle      0.180779
		Randomize      (-0.109, -0.140, 0.582)
		colorDistMagn   0.795127
		colorDistFreq   0.00525431
		detailScale     77.5609
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0157499
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335932
		terraceProb     0.417798
		erosion         0
		montesMagn      0.679635
		montesFreq      2.63443
		montesSpiky     0.86249
		montesFraction  0.543282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0253249
		hillsFraction   0.603375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247615
		craterFreq      0.171746
		craterDensity   0.982833
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506909
		volcanoTemp     1662.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.184, 0.103, 0.000)
		colorShelf     (0.263, 0.190, 0.118, 0.000)
		colorBeach     (0.308, 0.222, 0.140, 0.000)
		colorDesert    (0.335, 0.239, 0.137, 0.000)
		colorLowland   (0.368, 0.255, 0.155, 0.000)
		colorUpland    (0.407, 0.309, 0.188, 0.000)
		colorRock      (0.440, 0.336, 0.203, 0.000)
		colorSnow      (0.479, 0.358, 0.214, 1.000)
		BumpHeight      2.55633
		BumpOffset      0.511266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000886636
		Period          0.000574095
		Eccentricity    0
		Inclination     1.46167
		AscendingNode   144.033
		ArgOfPericenter 18.3603
		MeanAnomaly     -113.173
	}
}

DwarfMoon	"Cantonica System 4.S21"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.18079e-011
	Radius          1.65544
	InertiaMoment   0.399433

	Oblateness      0.143172

	Obliquity       1.18378
	EqAscendNode    -126.24
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.578 0.529)

	Surface
	{
		SurfStyle       0.936882
		OceanStyle      0.522141
		Randomize      (-0.160, 0.819, -0.254)
		colorDistMagn   0.405016
		colorDistFreq   0.00154494
		detailScale     45.2045
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0186819
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695232
		terraceProb     0.39248
		erosion         0
		montesMagn      0.40612
		montesFreq      2.98289
		montesSpiky     0.963469
		montesFraction  0.142847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00575734
		hillsFraction   0.614342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243631
		craterFreq      0.210006
		craterDensity   0.866675
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544913
		volcanoTemp     1660.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.202, 0.212, 0.050)
		colorShelf     (0.281, 0.237, 0.243, 0.040)
		colorBeach     (0.323, 0.272, 0.275, 0.030)
		colorDesert    (0.365, 0.306, 0.312, 0.020)
		colorLowland   (0.407, 0.341, 0.344, 0.030)
		colorUpland    (0.449, 0.376, 0.376, 0.050)
		colorRock      (0.491, 0.410, 0.418, 0.020)
		colorSnow      (0.491, 0.410, 0.418, 1.000)
		BumpHeight      1.48989
		BumpOffset      0.297979
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000889586
		Period          0.000576963
		Eccentricity    0
		Inclination     1.18378
		AscendingNode   -126.24
		ArgOfPericenter 156.829
		MeanAnomaly     -20.2537
	}
}

DwarfMoon	"Cantonica System 4.S22"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.73464e-011
	Radius          4.62756
	InertiaMoment   0.396945

	Oblateness      0.249

	Obliquity       -1.05353
	EqAscendNode    -116.223
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.592 0.585 0.583)

	Surface
	{
		SurfStyle       0.634071
		OceanStyle      0.954341
		Randomize      (-0.993, 0.642, -0.523)
		colorDistMagn   0.815839
		colorDistFreq   0.00698106
		detailScale     126.363
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0194263
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349881
		terraceProb     0.103074
		erosion         0
		montesMagn      0.47305
		montesFreq      3.41783
		montesSpiky     0.919724
		montesFraction  0.627995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0543533
		hillsFraction   0.640466
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249437
		craterFreq      0.209223
		craterDensity   0.767072
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457891
		volcanoTemp     1331.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.199, 0.163, 0.000)
		colorShelf     (0.237, 0.205, 0.186, 0.000)
		colorBeach     (0.278, 0.240, 0.221, 0.000)
		colorDesert    (0.302, 0.257, 0.216, 0.000)
		colorLowland   (0.331, 0.275, 0.245, 0.000)
		colorUpland    (0.367, 0.334, 0.297, 0.000)
		colorRock      (0.397, 0.363, 0.321, 0.000)
		colorSnow      (0.432, 0.386, 0.338, 1.000)
		BumpHeight      4.1648
		BumpOffset      0.832961
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000895308
		Period          0.000582539
		Eccentricity    0
		Inclination     -1.05353
		AscendingNode   -116.223
		ArgOfPericenter 42.6256
		MeanAnomaly     173.868
	}
}

DwarfMoon	"Cantonica System 4.S23"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.58212e-011
	Radius          2.4681
	InertiaMoment   0.398576

	Oblateness      0.20891

	Obliquity       1.2742
	EqAscendNode    156.121
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.603 0.601)

	Surface
	{
		SurfStyle       0.114852
		OceanStyle      0.149799
		Randomize      (-0.749, 0.500, 0.019)
		colorDistMagn   0.676998
		colorDistFreq   0.00139874
		detailScale     67.3955
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00919983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406534
		terraceProb     0.428836
		erosion         0
		montesMagn      0.53317
		montesFreq      3.64649
		montesSpiky     0.953867
		montesFraction  0.863373
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0184425
		hillsFraction   0.763249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247847
		craterFreq      0.198011
		craterDensity   0.81758
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563976
		volcanoTemp     1559.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.241, 0.240, 0.000)
		colorShelf     (0.258, 0.256, 0.255, 0.000)
		colorBeach     (0.273, 0.271, 0.270, 0.000)
		colorDesert    (0.288, 0.287, 0.285, 0.000)
		colorLowland   (0.303, 0.302, 0.300, 0.000)
		colorUpland    (0.318, 0.317, 0.315, 0.000)
		colorRock      (0.334, 0.332, 0.330, 0.000)
		colorSnow      (0.349, 0.347, 0.345, 1.000)
		BumpHeight      2.22129
		BumpOffset      0.444257
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00089992
		Period          0.000587046
		Eccentricity    0
		Inclination     1.2742
		AscendingNode   156.121
		ArgOfPericenter -78.4528
		MeanAnomaly     141.716
	}
}

DwarfMoon	"Cantonica System 4.S24"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.90634e-011
	Radius          4.82145
	InertiaMoment   0.399562

	Oblateness      0.249

	Obliquity       1.27487
	EqAscendNode    167.878
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.674 0.669)

	Surface
	{
		SurfStyle       0.67434
		OceanStyle      0.727166
		Randomize      (-0.970, -0.204, 0.151)
		colorDistMagn   0.154871
		colorDistFreq   0.0106211
		detailScale     131.658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00469613
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532582
		terraceProb     0.504488
		erosion         0
		montesMagn      0.485542
		montesFreq      3.4419
		montesSpiky     0.892984
		montesFraction  0.251143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0553876
		hillsFraction   0.594759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23839
		craterFreq      0.219653
		craterDensity   1.00118
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457084
		volcanoTemp     1357.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.229, 0.187, 0.000)
		colorShelf     (0.271, 0.236, 0.214, 0.000)
		colorBeach     (0.318, 0.276, 0.254, 0.000)
		colorDesert    (0.345, 0.297, 0.248, 0.000)
		colorLowland   (0.379, 0.317, 0.281, 0.000)
		colorUpland    (0.420, 0.384, 0.341, 0.000)
		colorRock      (0.453, 0.418, 0.368, 0.000)
		colorSnow      (0.494, 0.445, 0.388, 1.000)
		BumpHeight      4.3393
		BumpOffset      0.86786
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000905086
		Period          0.000592108
		Eccentricity    0
		Inclination     1.27487
		AscendingNode   167.878
		ArgOfPericenter -56.9714
		MeanAnomaly     64.7979
	}
}

DwarfMoon	"Cantonica System 4.S25"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            6.02846e-011
	Radius          2.87591
	InertiaMoment   0.397296

	Oblateness      0.134334

	Obliquity       1.45814
	EqAscendNode    75.485
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.577 0.573)

	Surface
	{
		SurfStyle       0.494339
		OceanStyle      0.167046
		Randomize      (0.318, -0.648, 0.295)
		colorDistMagn   0.415768
		colorDistFreq   0.00409152
		detailScale     78.5316
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0402358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387025
		terraceProb     0.146653
		erosion         0
		montesMagn      0.362854
		montesFreq      3.18201
		montesSpiky     0.845144
		montesFraction  0.193075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0251717
		hillsFraction   0.592803
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220352
		craterFreq      0.171615
		craterDensity   0.879079
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451073
		volcanoTemp     1543.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.229, 0.000)
		colorShelf     (0.247, 0.245, 0.243, 0.000)
		colorBeach     (0.262, 0.260, 0.258, 0.000)
		colorDesert    (0.276, 0.274, 0.272, 0.000)
		colorLowland   (0.291, 0.289, 0.286, 0.000)
		colorUpland    (0.306, 0.303, 0.301, 0.000)
		colorRock      (0.320, 0.317, 0.315, 0.000)
		colorSnow      (0.335, 0.332, 0.329, 1.000)
		BumpHeight      2.58832
		BumpOffset      0.517664
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000914331
		Period          0.000601203
		Eccentricity    0
		Inclination     1.45814
		AscendingNode   75.485
		ArgOfPericenter 48.2442
		MeanAnomaly     -38.1938
	}
}

DwarfMoon	"Cantonica System 4.S26"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.53565e-011
	Radius          5.82262
	InertiaMoment   0.398733

	Oblateness      0.249

	Obliquity       0.322805
	EqAscendNode    -54.7266
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.432 0.375)

	Surface
	{
		SurfStyle       0.32713
		OceanStyle      0.60694
		Randomize      (-0.485, 0.287, -0.970)
		colorDistMagn   0.633716
		colorDistFreq   0.0188544
		detailScale     158.996
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0100067
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.309163
		terraceProb     0.360775
		erosion         0
		montesMagn      0.462199
		montesFreq      2.79191
		montesSpiky     0.943182
		montesFraction  0.818687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0405282
		hillsFraction   0.630821
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220189
		craterFreq      0.223129
		craterDensity   0.853507
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54752
		volcanoTemp     1513.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.173, 0.150, 0.000)
		colorShelf     (0.213, 0.184, 0.159, 0.000)
		colorBeach     (0.226, 0.194, 0.169, 0.000)
		colorDesert    (0.238, 0.205, 0.178, 0.000)
		colorLowland   (0.251, 0.216, 0.187, 0.000)
		colorUpland    (0.263, 0.227, 0.197, 0.000)
		colorRock      (0.276, 0.238, 0.206, 0.000)
		colorSnow      (0.288, 0.248, 0.215, 1.000)
		BumpHeight      5.24036
		BumpOffset      1.04807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000916949
		Period          0.000603788
		Eccentricity    0
		Inclination     0.322804
		AscendingNode   -54.7266
		ArgOfPericenter -59.8032
		MeanAnomaly     30.8418
	}
}

DwarfMoon	"Cantonica System 4.S27"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.55571e-010
	Radius          4.54965
	InertiaMoment   0.399689

	Oblateness      0.204818

	Obliquity       1.29337
	EqAscendNode    -109.908
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.782 0.779)

	Surface
	{
		SurfStyle       0.146529
		OceanStyle      0.196868
		Randomize      (0.514, 0.824, 0.900)
		colorDistMagn   0.735621
		colorDistFreq   0.00348965
		detailScale     124.236
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0259205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719355
		terraceProb     0.18673
		erosion         0
		montesMagn      0.451598
		montesFreq      3.37653
		montesSpiky     0.839525
		montesFraction  0.596269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.043655
		hillsFraction   0.545873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230644
		craterFreq      0.268311
		craterDensity   0.951711
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481209
		volcanoTemp     1179.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.312, 0.000)
		colorShelf     (0.333, 0.332, 0.331, 0.000)
		colorBeach     (0.353, 0.352, 0.350, 0.000)
		colorDesert    (0.373, 0.372, 0.370, 0.000)
		colorLowland   (0.392, 0.391, 0.389, 0.000)
		colorUpland    (0.412, 0.411, 0.409, 0.000)
		colorRock      (0.431, 0.430, 0.428, 0.000)
		colorSnow      (0.451, 0.450, 0.448, 1.000)
		BumpHeight      4.09469
		BumpOffset      0.818937
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000918975
		Period          0.000605789
		Eccentricity    0
		Inclination     1.29337
		AscendingNode   -109.908
		ArgOfPericenter 26.3408
		MeanAnomaly     -164.631
	}
}

DwarfMoon	"Cantonica System 4.S28"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.64044e-010
	Radius          9.16937
	InertiaMoment   0.39758

	Oblateness      0.249

	Obliquity       -1.26657
	EqAscendNode    -120.433
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.636 0.503 0.399)

	Surface
	{
		SurfStyle       0.192033
		OceanStyle      0.460006
		Randomize      (-0.221, 0.437, 0.972)
		colorDistMagn   0.659422
		colorDistFreq   0.0445927
		detailScale     250.385
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0219578
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476801
		terraceProb     0.136515
		erosion         0
		montesMagn      0.542138
		montesFreq      3.29732
		montesSpiky     0.892593
		montesFraction  0.4614
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14445
		hillsFraction   0.593854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263499
		craterFreq      0.184664
		craterDensity   0.993633
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450721
		volcanoTemp     1815.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.201, 0.160, 0.000)
		colorShelf     (0.270, 0.214, 0.170, 0.000)
		colorBeach     (0.286, 0.226, 0.180, 0.000)
		colorDesert    (0.302, 0.239, 0.190, 0.000)
		colorLowland   (0.318, 0.251, 0.200, 0.000)
		colorUpland    (0.334, 0.264, 0.209, 0.000)
		colorRock      (0.350, 0.277, 0.219, 0.000)
		colorSnow      (0.366, 0.289, 0.229, 1.000)
		BumpHeight      8.25243
		BumpOffset      1.65049
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000928717
		Period          0.000615448
		Eccentricity    0
		Inclination     -1.26657
		AscendingNode   -120.433
		ArgOfPericenter 122.629
		MeanAnomaly     138.383
	}
}

DwarfMoon	"Cantonica System 4.S29"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.72009e-010
	Radius          5.75996
	InertiaMoment   0.398882

	Oblateness      0.131437

	Obliquity       0.551699
	EqAscendNode    -120.357
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.774 0.773)

	Surface
	{
		SurfStyle       0.256472
		OceanStyle      0.292511
		Randomize      (-0.379, 0.532, 0.114)
		colorDistMagn   0.750186
		colorDistFreq   0.00568547
		detailScale     157.285
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00957444
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.359807
		terraceProb     0.27533
		erosion         0
		montesMagn      0.324712
		montesFreq      2.7682
		montesSpiky     0.827053
		montesFraction  0.671742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0612376
		hillsFraction   0.742472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212585
		craterFreq      0.219238
		craterDensity   0.787206
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549417
		volcanoTemp     1370.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.330, 0.329, 0.328, 0.000)
		colorBeach     (0.349, 0.348, 0.348, 0.000)
		colorDesert    (0.369, 0.368, 0.367, 0.000)
		colorLowland   (0.388, 0.387, 0.386, 0.000)
		colorUpland    (0.408, 0.406, 0.406, 0.000)
		colorRock      (0.427, 0.426, 0.425, 0.000)
		colorSnow      (0.447, 0.445, 0.444, 1.000)
		BumpHeight      5.18396
		BumpOffset      1.03679
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000930787
		Period          0.000617506
		Eccentricity    0
		Inclination     0.551699
		AscendingNode   -120.357
		ArgOfPericenter 44.8852
		MeanAnomaly     -15.9391
	}
}

DwarfMoon	"Cantonica System 4.S30"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.05488e-010
	Radius          12.5554
	InertiaMoment   0.399815

	Oblateness      0.249

	Obliquity       0.292665
	EqAscendNode    -7.76121
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.823 0.788 0.739)

	Surface
	{
		SurfStyle       0.582784
		OceanStyle      0.330451
		Randomize      (-0.449, 0.822, -0.493)
		colorDistMagn   0.283856
		colorDistFreq   0.0674635
		detailScale     342.846
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0101896
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741995
		terraceProb     0.106769
		erosion         0
		montesMagn      0.509885
		montesFreq      2.5808
		montesSpiky     0.809838
		montesFraction  0.773888
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.467223
		hillsFraction   0.80007
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245524
		craterFreq      0.217472
		craterDensity   0.854049
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455765
		volcanoTemp     1669.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.268, 0.207, 0.000)
		colorShelf     (0.329, 0.276, 0.236, 0.000)
		colorBeach     (0.387, 0.323, 0.281, 0.000)
		colorDesert    (0.420, 0.347, 0.273, 0.000)
		colorLowland   (0.461, 0.370, 0.310, 0.000)
		colorUpland    (0.510, 0.449, 0.377, 0.000)
		colorRock      (0.551, 0.489, 0.406, 0.000)
		colorSnow      (0.601, 0.520, 0.428, 1.000)
		BumpHeight      11.2999
		BumpOffset      2.25997
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000935403
		Period          0.000622106
		Eccentricity    0
		Inclination     0.292665
		AscendingNode   -7.76121
		ArgOfPericenter 170.811
		MeanAnomaly     -43.0879
	}
}

DwarfMoon	"Cantonica System 4.S31"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.92227e-009
	Radius          10.6705
	InertiaMoment   0.397822

	Oblateness      0.197096

	Obliquity       -1.42158
	EqAscendNode    -162.813
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.835 0.796 0.762)

	Surface
	{
		SurfStyle       0.0778641
		OceanStyle      0.954242
		Randomize      (0.630, 0.392, -0.618)
		colorDistMagn   0.189681
		colorDistFreq   0.0317831
		detailScale     291.376
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00741315
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463671
		terraceProb     0.28211
		erosion         0
		montesMagn      0.440702
		montesFreq      3.16639
		montesSpiky     0.993765
		montesFraction  0.746343
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.329591
		hillsFraction   0.700177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257351
		craterFreq      0.206341
		craterDensity   0.724971
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46718
		volcanoTemp     1182.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.318, 0.305, 0.000)
		colorShelf     (0.355, 0.338, 0.324, 0.000)
		colorBeach     (0.376, 0.358, 0.343, 0.000)
		colorDesert    (0.397, 0.378, 0.362, 0.000)
		colorLowland   (0.418, 0.398, 0.381, 0.000)
		colorUpland    (0.439, 0.418, 0.400, 0.000)
		colorRock      (0.459, 0.438, 0.419, 0.000)
		colorSnow      (0.480, 0.457, 0.438, 1.000)
		BumpHeight      9.60346
		BumpOffset      1.92069
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000942103
		Period          0.000628802
		Eccentricity    0
		Inclination     -1.42158
		AscendingNode   -162.813
		ArgOfPericenter 159.758
		MeanAnomaly     8.01249
	}
}

DwarfMoon	"Cantonica System 4.S32"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.60097e-016
	Radius          0.111001
	InertiaMoment   0.399025

	Oblateness      0.249

	Obliquity       -0.312828
	EqAscendNode    143.436
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.745 0.743)

	Surface
	{
		SurfStyle       0.705456
		OceanStyle      0.583875
		Randomize      (-0.372, -0.521, 0.101)
		colorDistMagn   0.818144
		colorDistFreq   6.82867e-006
		detailScale     3.03108
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00341796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598071
		terraceProb     0.340002
		erosion         0
		montesMagn      0.562628
		montesFreq      4.07872
		montesSpiky     0.99173
		montesFraction  0.692693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.617e-005
		hillsFraction   0.688805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245497
		craterFreq      0.249912
		craterDensity   0.825582
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529944
		volcanoTemp     1688.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.253, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.282, 0.000)
		colorDesert    (0.381, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.350, 0.312, 0.000)
		colorUpland    (0.464, 0.425, 0.379, 0.000)
		colorRock      (0.501, 0.462, 0.409, 0.000)
		colorSnow      (0.546, 0.492, 0.431, 1.000)
		BumpHeight      0.0999012
		BumpOffset      0.0199802
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000948511
		Period          0.000635228
		Eccentricity    0
		Inclination     -0.312828
		AscendingNode   143.436
		ArgOfPericenter 28.5968
		MeanAnomaly     27.66
	}
}

DwarfMoon	"Cantonica System 4.S33"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.95327e-016
	Radius          0.074486
	InertiaMoment   0.39994

	Oblateness      0.125357

	Obliquity       -1.06332
	EqAscendNode    71.8552
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.421 0.419 0.416)

	Surface
	{
		SurfStyle       0.802471
		OceanStyle      0.778453
		Randomize      (0.734, 0.654, 0.325)
		colorDistMagn   0.0109527
		colorDistFreq   4.56887e-006
		detailScale     2.03396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0300507
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488391
		terraceProb     0.617149
		erosion         0
		montesMagn      0.623086
		montesFreq      3.19795
		montesSpiky     0.935066
		montesFraction  0.426876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.29229e-005
		hillsFraction   0.767758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244459
		craterFreq      0.237044
		craterDensity   0.733028
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535308
		volcanoTemp     1539.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.142, 0.117, 0.000)
		colorShelf     (0.168, 0.147, 0.133, 0.000)
		colorBeach     (0.198, 0.172, 0.158, 0.000)
		colorDesert    (0.215, 0.184, 0.154, 0.000)
		colorLowland   (0.236, 0.197, 0.175, 0.000)
		colorUpland    (0.261, 0.239, 0.212, 0.000)
		colorRock      (0.282, 0.260, 0.229, 0.000)
		colorSnow      (0.307, 0.276, 0.241, 1.000)
		BumpHeight      0.0670374
		BumpOffset      0.0134075
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00095484
		Period          0.000641597
		Eccentricity    0
		Inclination     -1.06332
		AscendingNode   71.8552
		ArgOfPericenter -136.888
		MeanAnomaly     -47.5776
	}
}

DwarfMoon	"Cantonica System 4.S34"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.9337e-015
	Radius          0.163638
	InertiaMoment   0.398035

	Oblateness      0.249

	Obliquity       -0.404185
	EqAscendNode    92.6236
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.800 0.797 0.796)

	Surface
	{
		SurfStyle       0.70387
		OceanStyle      0.723236
		Randomize      (-0.790, 0.527, -0.209)
		colorDistMagn   0.686512
		colorDistFreq   1.79199e-005
		detailScale     4.46842
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00974718
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498506
		terraceProb     0.271595
		erosion         0
		montesMagn      0.551513
		montesFreq      2.46376
		montesSpiky     0.979977
		montesFraction  0.781675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.00516e-005
		hillsFraction   0.53802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239701
		craterFreq      0.205818
		craterDensity   0.895364
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482833
		volcanoTemp     1413.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.271, 0.223, 0.000)
		colorShelf     (0.320, 0.279, 0.255, 0.000)
		colorBeach     (0.376, 0.327, 0.302, 0.000)
		colorDesert    (0.408, 0.351, 0.294, 0.000)
		colorLowland   (0.448, 0.375, 0.334, 0.000)
		colorUpland    (0.496, 0.454, 0.406, 0.000)
		colorRock      (0.536, 0.494, 0.438, 0.000)
		colorSnow      (0.584, 0.526, 0.461, 1.000)
		BumpHeight      0.147275
		BumpOffset      0.0294549
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000955855
		Period          0.00064262
		Eccentricity    0
		Inclination     -0.404185
		AscendingNode   92.6236
		ArgOfPericenter 103.879
		MeanAnomaly     140.177
	}
}

DwarfMoon	"Cantonica System 4.S35"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.48815e-015
	Radius          0.132284
	InertiaMoment   0.399164

	Oblateness      0.193789

	Obliquity       0.534314
	EqAscendNode    -154.584
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.622 0.619)

	Surface
	{
		SurfStyle       0.607965
		OceanStyle      0.355923
		Randomize      (-0.849, -0.010, 0.985)
		colorDistMagn   0.791523
		colorDistFreq   1.07716e-005
		detailScale     3.61224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00409981
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711807
		terraceProb     0.242802
		erosion         0
		montesMagn      0.493918
		montesFreq      3.62266
		montesSpiky     0.987613
		montesFraction  0.734575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5802e-005
		hillsFraction   0.517143
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243166
		craterFreq      0.250928
		craterDensity   0.998802
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517454
		volcanoTemp     1104.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.212, 0.173, 0.000)
		colorShelf     (0.250, 0.218, 0.198, 0.000)
		colorBeach     (0.293, 0.255, 0.235, 0.000)
		colorDesert    (0.318, 0.274, 0.229, 0.000)
		colorLowland   (0.350, 0.293, 0.260, 0.000)
		colorUpland    (0.387, 0.355, 0.316, 0.000)
		colorRock      (0.418, 0.386, 0.341, 0.000)
		colorSnow      (0.456, 0.411, 0.359, 1.000)
		BumpHeight      0.119056
		BumpOffset      0.0238111
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000964581
		Period          0.00065144
		Eccentricity    0
		Inclination     0.534314
		AscendingNode   -154.584
		ArgOfPericenter -167.403
		MeanAnomaly     174.736
	}
}

DwarfMoon	"Cantonica System 4.S36"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.96054e-015
	Radius          0.262321
	InertiaMoment   0.395543

	Oblateness      0.249

	Obliquity       -0.755638
	EqAscendNode    -134.349
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.599 0.596)

	Surface
	{
		SurfStyle       0.927303
		OceanStyle      0.930599
		Randomize      (-0.855, -0.441, 0.588)
		colorDistMagn   0.375823
		colorDistFreq   4.8829e-005
		detailScale     7.16311
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0102305
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334097
		terraceProb     0.285775
		erosion         0
		montesMagn      0.326487
		montesFreq      2.56719
		montesSpiky     0.983852
		montesFraction  0.332952
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000178976
		hillsFraction   0.588972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243024
		craterFreq      0.202693
		craterDensity   1.01456
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572705
		volcanoTemp     1313.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.210, 0.239, 0.050)
		colorShelf     (0.240, 0.245, 0.274, 0.040)
		colorBeach     (0.276, 0.281, 0.310, 0.030)
		colorDesert    (0.312, 0.317, 0.352, 0.020)
		colorLowland   (0.348, 0.353, 0.388, 0.030)
		colorUpland    (0.384, 0.389, 0.424, 0.050)
		colorRock      (0.420, 0.425, 0.471, 0.020)
		colorSnow      (0.420, 0.425, 0.471, 1.000)
		BumpHeight      0.236089
		BumpOffset      0.0472178
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000970913
		Period          0.000657865
		Eccentricity    0
		Inclination     -0.755638
		AscendingNode   -134.349
		ArgOfPericenter 80.1294
		MeanAnomaly     -120.512
	}
}

DwarfMoon	"Cantonica System 4.S37"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.77546e-015
	Radius          0.160843
	InertiaMoment   0.398229

	Oblateness      0.119602

	Obliquity       0.0508033
	EqAscendNode    61.5953
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.507 0.499)

	Surface
	{
		SurfStyle       0.660671
		OceanStyle      0.201109
		Randomize      (0.265, 0.190, 0.748)
		colorDistMagn   0.749578
		colorDistFreq   1.56427e-005
		detailScale     4.39209
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00150498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368587
		terraceProb     0.561408
		erosion         0
		montesMagn      0.607694
		montesFreq      3.12782
		montesSpiky     0.899119
		montesFraction  0.297557
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.60948e-005
		hillsFraction   0.83187
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246099
		craterFreq      0.191983
		craterDensity   0.889183
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469211
		volcanoTemp     1322.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.172, 0.140, 0.000)
		colorShelf     (0.205, 0.178, 0.160, 0.000)
		colorBeach     (0.241, 0.208, 0.190, 0.000)
		colorDesert    (0.261, 0.223, 0.185, 0.000)
		colorLowland   (0.287, 0.238, 0.210, 0.000)
		colorUpland    (0.318, 0.289, 0.255, 0.000)
		colorRock      (0.343, 0.314, 0.275, 0.000)
		colorSnow      (0.374, 0.335, 0.289, 1.000)
		BumpHeight      0.144759
		BumpOffset      0.0289518
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00097591
		Period          0.00066295
		Eccentricity    0
		Inclination     0.0508033
		AscendingNode   61.5954
		ArgOfPericenter 97.9411
		MeanAnomaly     166.263
	}
}

DwarfMoon	"Cantonica System 4.S38"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.55266e-014
	Radius          0.330813
	InertiaMoment   0.399298

	Oblateness      0.249

	Obliquity       1.22409
	EqAscendNode    0.604879
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.709 0.705)

	Surface
	{
		SurfStyle       0.221895
		OceanStyle      0.690381
		Randomize      (0.995, -0.784, -0.090)
		colorDistMagn   0.593073
		colorDistFreq   5.75361e-005
		detailScale     9.0334
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0427156
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55246
		terraceProb     0.347591
		erosion         0
		montesMagn      0.531832
		montesFreq      3.19401
		montesSpiky     0.874328
		montesFraction  0.555086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000184831
		hillsFraction   0.500166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272247
		craterFreq      0.196118
		craterDensity   0.714295
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481011
		volcanoTemp     1214.82
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
		BumpHeight      0.297732
		BumpOffset      0.0595463
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000981538
		Period          0.000668693
		Eccentricity    0
		Inclination     1.22409
		AscendingNode   0.60488
		ArgOfPericenter 164.032
		MeanAnomaly     2.09989
	}
}

DwarfMoon	"Cantonica System 4.S39"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.4041e-014
	Radius          0.256541
	InertiaMoment   0.396448

	Oblateness      0.188392

	Obliquity       -0.124128
	EqAscendNode    48.4059
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.707 0.591)

	Surface
	{
		SurfStyle       0.807726
		OceanStyle      0.448406
		Randomize      (0.754, 0.643, 0.820)
		colorDistMagn   0.422201
		colorDistFreq   4.69346e-005
		detailScale     7.00527
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00395175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673933
		terraceProb     0.225126
		erosion         0
		montesMagn      0.420005
		montesFreq      2.65734
		montesSpiky     0.923689
		montesFraction  0.511215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000135997
		hillsFraction   0.526698
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268074
		craterFreq      0.224794
		craterDensity   0.993057
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51984
		volcanoTemp     1717.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.240, 0.165, 0.000)
		colorShelf     (0.309, 0.248, 0.189, 0.000)
		colorBeach     (0.363, 0.290, 0.225, 0.000)
		colorDesert    (0.394, 0.311, 0.219, 0.000)
		colorLowland   (0.432, 0.332, 0.248, 0.000)
		colorUpland    (0.478, 0.403, 0.301, 0.000)
		colorRock      (0.517, 0.439, 0.325, 0.000)
		colorSnow      (0.563, 0.467, 0.343, 1.000)
		BumpHeight      0.230887
		BumpOffset      0.0461773
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000988893
		Period          0.000676224
		Eccentricity    0
		Inclination     -0.124128
		AscendingNode   48.4059
		ArgOfPericenter -179.662
		MeanAnomaly     -141.166
	}
}

DwarfMoon	"Cantonica System 4.S40"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.64681e-014
	Radius          0.482903
	InertiaMoment   0.398407

	Oblateness      0.249

	Obliquity       -0.0244827
	EqAscendNode    104.691
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.512 0.509)

	Surface
	{
		SurfStyle       0.532494
		OceanStyle      0.65926
		Randomize      (-0.662, 0.366, 0.516)
		colorDistMagn   0.300139
		colorDistFreq   0.00014849
		detailScale     13.1865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399685
		terraceProb     0.142949
		erosion         0
		montesMagn      0.434391
		montesFreq      3.49117
		montesSpiky     0.852877
		montesFraction  0.400548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000654661
		hillsFraction   0.558212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254336
		craterFreq      0.20637
		craterDensity   0.781889
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56874
		volcanoTemp     1918.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.143, 0.000)
		colorShelf     (0.207, 0.179, 0.163, 0.000)
		colorBeach     (0.243, 0.210, 0.194, 0.000)
		colorDesert    (0.264, 0.225, 0.188, 0.000)
		colorLowland   (0.289, 0.241, 0.214, 0.000)
		colorUpland    (0.321, 0.292, 0.260, 0.000)
		colorRock      (0.346, 0.318, 0.280, 0.000)
		colorSnow      (0.377, 0.338, 0.295, 1.000)
		BumpHeight      0.434612
		BumpOffset      0.0869225
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00099473
		Period          0.00068222
		Eccentricity    0
		Inclination     -0.0244827
		AscendingNode   104.691
		ArgOfPericenter -125.378
		MeanAnomaly     77.6363
	}
}

DwarfMoon	"Cantonica System 4.S41"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.4404e-014
	Radius          0.287402
	InertiaMoment   0.39943

	Oblateness      0.113776

	Obliquity       -0.374673
	EqAscendNode    42.829
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.749 0.748)

	Surface
	{
		SurfStyle       0.408956
		OceanStyle      0.857029
		Randomize      (-0.106, 0.358, -0.793)
		colorDistMagn   0.247967
		colorDistFreq   5.4477e-005
		detailScale     7.84799
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0121775
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595782
		terraceProb     0.554723
		erosion         0
		montesMagn      0.280869
		montesFreq      3.39559
		montesSpiky     0.914569
		montesFraction  0.7925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000185347
		hillsFraction   0.664912
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233193
		craterFreq      0.180115
		craterDensity   1.04203
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443799
		volcanoTemp     2046.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.300, 0.299, 0.000)
		colorShelf     (0.320, 0.319, 0.318, 0.000)
		colorBeach     (0.339, 0.337, 0.336, 0.000)
		colorDesert    (0.358, 0.356, 0.355, 0.000)
		colorLowland   (0.377, 0.375, 0.374, 0.000)
		colorUpland    (0.395, 0.393, 0.392, 0.000)
		colorRock      (0.414, 0.412, 0.411, 0.000)
		colorSnow      (0.433, 0.431, 0.430, 1.000)
		BumpHeight      0.258662
		BumpOffset      0.0517324
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00100203
		Period          0.00068974
		Eccentricity    0
		Inclination     -0.374673
		AscendingNode   42.829
		ArgOfPericenter 58.2292
		MeanAnomaly     -34.5526
	}
}

DwarfMoon	"Cantonica System 4.S42"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.00653e-014
	Radius          0.576206
	InertiaMoment   0.396936

	Oblateness      0.249

	Obliquity       0.806341
	EqAscendNode    160.846
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.518 0.445)

	Surface
	{
		SurfStyle       0.688604
		OceanStyle      0.0777826
		Randomize      (0.524, -0.573, -0.342)
		colorDistMagn   0.715763
		colorDistFreq   0.000146389
		detailScale     15.7343
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00468342
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550994
		terraceProb     0.256059
		erosion         0
		montesMagn      0.307891
		montesFreq      2.56363
		montesSpiky     0.905618
		montesFraction  0.439265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000674286
		hillsFraction   0.634319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269438
		craterFreq      0.212496
		craterDensity   0.804321
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502603
		volcanoTemp     1552.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.176, 0.125, 0.000)
		colorShelf     (0.269, 0.181, 0.143, 0.000)
		colorBeach     (0.316, 0.212, 0.169, 0.000)
		colorDesert    (0.343, 0.228, 0.165, 0.000)
		colorLowland   (0.377, 0.243, 0.187, 0.000)
		colorUpland    (0.417, 0.295, 0.227, 0.000)
		colorRock      (0.451, 0.321, 0.245, 0.000)
		colorSnow      (0.491, 0.342, 0.258, 1.000)
		BumpHeight      0.518585
		BumpOffset      0.103717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00100784
		Period          0.000695754
		Eccentricity    0
		Inclination     0.806341
		AscendingNode   160.846
		ArgOfPericenter 168.607
		MeanAnomaly     -143.36
	}
}

DwarfMoon	"Cantonica System 4.S43"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.16534e-013
	Radius          0.444136
	InertiaMoment   0.398573

	Oblateness      0.191151

	Obliquity       -1.19704
	EqAscendNode    -13.4027
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.574 0.570)

	Surface
	{
		SurfStyle       0.0449345
		OceanStyle      0.885852
		Randomize      (0.439, 0.296, -0.168)
		colorDistMagn   0.661264
		colorDistFreq   7.55276e-005
		detailScale     12.1279
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0414878
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427264
		terraceProb     0.246638
		erosion         0
		montesMagn      0.377361
		montesFreq      3.85397
		montesSpiky     0.994217
		montesFraction  0.413406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000334517
		hillsFraction   0.696376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247516
		craterFreq      0.221689
		craterDensity   0.928232
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505753
		volcanoTemp     1539.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.229, 0.228, 0.000)
		colorShelf     (0.246, 0.244, 0.242, 0.000)
		colorBeach     (0.261, 0.258, 0.257, 0.000)
		colorDesert    (0.275, 0.272, 0.271, 0.000)
		colorLowland   (0.290, 0.287, 0.285, 0.000)
		colorUpland    (0.304, 0.301, 0.299, 0.000)
		colorRock      (0.319, 0.315, 0.314, 0.000)
		colorSnow      (0.333, 0.330, 0.328, 1.000)
		BumpHeight      0.399723
		BumpOffset      0.0799445
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00100939
		Period          0.000697355
		Eccentricity    0
		Inclination     -1.19704
		AscendingNode   -13.4027
		ArgOfPericenter -125.946
		MeanAnomaly     116.197
	}
}

DwarfMoon	"Cantonica System 4.S44"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.68105e-013
	Radius          0.809207
	InertiaMoment   0.399559

	Oblateness      0.249

	Obliquity       0.084968
	EqAscendNode    -31.7126
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.675 0.636)

	Surface
	{
		SurfStyle       0.499054
		OceanStyle      0.78141
		Randomize      (0.008, 0.660, 0.066)
		colorDistMagn   0.332033
		colorDistFreq   0.000449702
		detailScale     22.0967
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00284714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366477
		terraceProb     0.27637
		erosion         0
		montesMagn      0.565694
		montesFreq      2.48222
		montesSpiky     0.899958
		montesFraction  0.576427
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00157771
		hillsFraction   0.710521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231695
		craterFreq      0.233573
		craterDensity   1.02699
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548653
		volcanoTemp     1433.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.270, 0.254, 0.000)
		colorShelf     (0.322, 0.287, 0.270, 0.000)
		colorBeach     (0.341, 0.304, 0.286, 0.000)
		colorDesert    (0.360, 0.321, 0.302, 0.000)
		colorLowland   (0.379, 0.337, 0.318, 0.000)
		colorUpland    (0.398, 0.354, 0.334, 0.000)
		colorRock      (0.417, 0.371, 0.350, 0.000)
		colorSnow      (0.436, 0.388, 0.366, 1.000)
		BumpHeight      0.728286
		BumpOffset      0.145657
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00101324
		Period          0.000701347
		Eccentricity    0
		Inclination     0.0849679
		AscendingNode   -31.7126
		ArgOfPericenter 87.3571
		MeanAnomaly     136.703
	}
}

DwarfMoon	"Cantonica System 4.S45"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.40786e-013
	Radius          0.475798
	InertiaMoment   0.39729

	Oblateness      0.110154

	Obliquity       -0.983919
	EqAscendNode    -25.936
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.780 0.685 0.619)

	Surface
	{
		SurfStyle       0.00660673
		OceanStyle      0.295848
		Randomize      (-0.687, 0.013, 0.034)
		colorDistMagn   0.210397
		colorDistFreq   7.97087e-005
		detailScale     12.9925
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0334631
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.331679
		terraceProb     0.350995
		erosion         0
		montesMagn      0.619567
		montesFreq      2.72699
		montesSpiky     0.951266
		montesFraction  0.535889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000466765
		hillsFraction   0.634465
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.282763
		craterFreq      0.243679
		craterDensity   0.927085
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.417658
		volcanoTemp     1466.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.274, 0.248, 0.000)
		colorShelf     (0.331, 0.291, 0.263, 0.000)
		colorBeach     (0.351, 0.308, 0.279, 0.000)
		colorDesert    (0.370, 0.325, 0.294, 0.000)
		colorLowland   (0.390, 0.343, 0.309, 0.000)
		colorUpland    (0.409, 0.360, 0.325, 0.000)
		colorRock      (0.429, 0.377, 0.340, 0.000)
		colorSnow      (0.448, 0.394, 0.356, 1.000)
		BumpHeight      0.428218
		BumpOffset      0.0856437
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00101859
		Period          0.000706917
		Eccentricity    0
		Inclination     -0.983919
		AscendingNode   -25.936
		ArgOfPericenter -117.158
		MeanAnomaly     -150.247
	}
}

DwarfMoon	"Cantonica System 4.S46"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.43009e-013
	Radius          0.942678
	InertiaMoment   0.39873

	Oblateness      0.249

	Obliquity       1.26586
	EqAscendNode    -41.7349
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.740 0.737)

	Surface
	{
		SurfStyle       0.257583
		OceanStyle      0.0767581
		Randomize      (-0.117, 0.859, 0.506)
		colorDistMagn   0.285715
		colorDistFreq   0.000586647
		detailScale     25.7414
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0412762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712849
		terraceProb     0.251853
		erosion         0
		montesMagn      0.329619
		montesFreq      2.86841
		montesSpiky     0.975598
		montesFraction  0.522575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00223354
		hillsFraction   0.665477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239753
		craterFreq      0.16841
		craterDensity   0.851099
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511996
		volcanoTemp     1507.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.296, 0.295, 0.000)
		colorShelf     (0.316, 0.315, 0.313, 0.000)
		colorBeach     (0.335, 0.333, 0.332, 0.000)
		colorDesert    (0.353, 0.352, 0.350, 0.000)
		colorLowland   (0.372, 0.370, 0.369, 0.000)
		colorUpland    (0.391, 0.389, 0.387, 0.000)
		colorRock      (0.409, 0.407, 0.405, 0.000)
		colorSnow      (0.428, 0.426, 0.424, 1.000)
		BumpHeight      0.84841
		BumpOffset      0.169682
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00102287
		Period          0.000711374
		Eccentricity    0
		Inclination     1.26586
		AscendingNode   -41.7349
		ArgOfPericenter 155.949
		MeanAnomaly     60.9904
	}
}

DwarfMoon	"Cantonica System 4.S47"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.86678e-013
	Radius          0.736131
	InertiaMoment   0.399686

	Oblateness      0.198672

	Obliquity       -1.4854
	EqAscendNode    40.6788
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.697 0.691 0.689)

	Surface
	{
		SurfStyle       0.33614
		OceanStyle      0.473126
		Randomize      (0.029, 0.574, -0.811)
		colorDistMagn   0.52098
		colorDistFreq   0.000325859
		detailScale     20.1013
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0485972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563974
		terraceProb     0.397019
		erosion         0
		montesMagn      0.58662
		montesFreq      3.3933
		montesSpiky     0.747764
		montesFraction  0.708317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00134081
		hillsFraction   0.704587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210346
		craterFreq      0.183251
		craterDensity   0.81211
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554435
		volcanoTemp     1529.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.277, 0.276, 0.000)
		colorShelf     (0.296, 0.294, 0.293, 0.000)
		colorBeach     (0.314, 0.311, 0.310, 0.000)
		colorDesert    (0.331, 0.328, 0.327, 0.000)
		colorLowland   (0.349, 0.346, 0.344, 0.000)
		colorUpland    (0.366, 0.363, 0.362, 0.000)
		colorRock      (0.384, 0.380, 0.379, 0.000)
		colorSnow      (0.401, 0.397, 0.396, 1.000)
		BumpHeight      0.662518
		BumpOffset      0.132504
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00102704
		Period          0.000715722
		Eccentricity    0
		Inclination     -1.4854
		AscendingNode   40.6788
		ArgOfPericenter -162.392
		MeanAnomaly     18.6612
	}
}

DwarfMoon	"Cantonica System 4.S48"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            6.88701e-013
	Radius          1.30435
	InertiaMoment   0.397574

	Oblateness      0.249

	Obliquity       1.09708
	EqAscendNode    -172.567
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.817 0.774 0.697)

	Surface
	{
		SurfStyle       0.0280936
		OceanStyle      0.714592
		Randomize      (-0.998, -0.986, 0.736)
		colorDistMagn   0.808426
		colorDistFreq   0.00110619
		detailScale     35.6174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00248975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653856
		terraceProb     0.135448
		erosion         0
		montesMagn      0.375548
		montesFreq      2.47185
		montesSpiky     0.863146
		montesFraction  0.615079
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00469247
		hillsFraction   0.650471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221924
		craterFreq      0.189095
		craterDensity   1.05659
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52518
		volcanoTemp     1402.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.310, 0.279, 0.000)
		colorShelf     (0.347, 0.329, 0.296, 0.000)
		colorBeach     (0.368, 0.348, 0.314, 0.000)
		colorDesert    (0.388, 0.368, 0.331, 0.000)
		colorLowland   (0.409, 0.387, 0.348, 0.000)
		colorUpland    (0.429, 0.406, 0.366, 0.000)
		colorRock      (0.449, 0.426, 0.383, 0.000)
		colorSnow      (0.470, 0.445, 0.401, 1.000)
		BumpHeight      1.17391
		BumpOffset      0.234783
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0010314
		Period          0.000720292
		Eccentricity    0
		Inclination     1.09708
		AscendingNode   -172.567
		ArgOfPericenter 36.0747
		MeanAnomaly     17.9487
	}
}

DwarfMoon	"Cantonica System 4.S49"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.73268e-013
	Radius          0.764291
	InertiaMoment   0.398879

	Oblateness      0.108812

	Obliquity       0.396742
	EqAscendNode    85.9409
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.736 0.733)

	Surface
	{
		SurfStyle       0.0607202
		OceanStyle      0.502477
		Randomize      (0.432, 0.012, 0.784)
		colorDistMagn   0.884492
		colorDistFreq   0.000230478
		detailScale     20.8703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.010131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405442
		terraceProb     0.318755
		erosion         0
		montesMagn      0.581578
		montesFreq      3.31177
		montesSpiky     0.977
		montesFraction  0.597889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00153351
		hillsFraction   0.492791
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216647
		craterFreq      0.206851
		craterDensity   0.868328
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.422872
		volcanoTemp     1767.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.293, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.330, 0.000)
		colorDesert    (0.350, 0.350, 0.348, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.387, 0.386, 0.385, 0.000)
		colorRock      (0.406, 0.405, 0.403, 0.000)
		colorSnow      (0.424, 0.423, 0.422, 1.000)
		BumpHeight      0.687862
		BumpOffset      0.137572
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00103341
		Period          0.000722398
		Eccentricity    0
		Inclination     0.396742
		AscendingNode   85.9409
		ArgOfPericenter 170.92
		MeanAnomaly     -123.709
	}
}

DwarfMoon	"Cantonica System 4.S50"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.37528e-012
	Radius          1.50767
	InertiaMoment   0.399812

	Oblateness      0.249

	Obliquity       -0.3279
	EqAscendNode    148.936
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.700 0.636 0.519)

	Surface
	{
		SurfStyle       0.696527
		OceanStyle      0.727275
		Randomize      (-0.241, 0.093, -0.822)
		colorDistMagn   0.0603725
		colorDistFreq   0.000732298
		detailScale     41.1696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0030688
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681213
		terraceProb     0.189939
		erosion         0
		montesMagn      0.446025
		montesFreq      3.87177
		montesSpiky     0.734767
		montesFraction  0.354917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00336972
		hillsFraction   0.763158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236846
		craterFreq      0.163458
		craterDensity   0.733736
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447186
		volcanoTemp     1766.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.216, 0.145, 0.000)
		colorShelf     (0.280, 0.222, 0.166, 0.000)
		colorBeach     (0.329, 0.261, 0.197, 0.000)
		colorDesert    (0.357, 0.280, 0.192, 0.000)
		colorLowland   (0.392, 0.299, 0.218, 0.000)
		colorUpland    (0.434, 0.362, 0.265, 0.000)
		colorRock      (0.469, 0.394, 0.285, 0.000)
		colorSnow      (0.511, 0.419, 0.301, 1.000)
		BumpHeight      1.35691
		BumpOffset      0.271381
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00104046
		Period          0.000729798
		Eccentricity    0
		Inclination     -0.3279
		AscendingNode   148.936
		ArgOfPericenter 65.1572
		MeanAnomaly     -18.9622
	}
}

DwarfMoon	"Cantonica System 4.S51"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.94559e-012
	Radius          1.21588
	InertiaMoment   0.397817

	Oblateness      0.211853

	Obliquity       0.79631
	EqAscendNode    30.3673
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.727 0.725)

	Surface
	{
		SurfStyle       0.953404
		OceanStyle      0.522298
		Randomize      (-0.974, -0.953, -0.909)
		colorDistMagn   0.42002
		colorDistFreq   0.000389052
		detailScale     33.2017
		colorConversion true
		snowLevel       2
		tropicLatitude  0.026822
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594159
		terraceProb     0.43777
		erosion         0
		montesMagn      0.62105
		montesFreq      2.88351
		montesSpiky     0.965067
		montesFraction  0.658994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00400714
		hillsFraction   0.706125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240851
		craterFreq      0.261146
		craterDensity   0.940362
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496664
		volcanoTemp     1702.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.254, 0.290, 0.050)
		colorShelf     (0.291, 0.298, 0.334, 0.040)
		colorBeach     (0.335, 0.342, 0.377, 0.030)
		colorDesert    (0.379, 0.385, 0.428, 0.020)
		colorLowland   (0.422, 0.429, 0.471, 0.030)
		colorUpland    (0.466, 0.472, 0.515, 0.050)
		colorRock      (0.510, 0.516, 0.573, 0.020)
		colorSnow      (0.510, 0.516, 0.573, 1.000)
		BumpHeight      1.0943
		BumpOffset      0.218859
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00104377
		Period          0.000733285
		Eccentricity    0
		Inclination     0.79631
		AscendingNode   30.3673
		ArgOfPericenter 149.269
		MeanAnomaly     26.915
	}
}

DwarfMoon	"Cantonica System 4.S52"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.75912e-012
	Radius          2.08814
	InertiaMoment   0.399022

	Oblateness      0.249

	Obliquity       1.35399
	EqAscendNode    108.078
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.482 0.411 0.332)

	Surface
	{
		SurfStyle       0.30852
		OceanStyle      0.317319
		Randomize      (0.771, 0.529, -0.611)
		colorDistMagn   0.79191
		colorDistFreq   0.00256378
		detailScale     57.0202
		colorConversion true
		snowLevel       2
		tropicLatitude  0.02775
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412699
		terraceProb     0.321094
		erosion         0
		montesMagn      0.426644
		montesFreq      3.22264
		montesSpiky     0.847386
		montesFraction  0.311702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00877751
		hillsFraction   0.837336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228807
		craterFreq      0.199201
		craterDensity   0.886932
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558065
		volcanoTemp     1276.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.165, 0.133, 0.000)
		colorShelf     (0.205, 0.175, 0.141, 0.000)
		colorBeach     (0.217, 0.185, 0.149, 0.000)
		colorDesert    (0.229, 0.195, 0.158, 0.000)
		colorLowland   (0.241, 0.206, 0.166, 0.000)
		colorUpland    (0.253, 0.216, 0.174, 0.000)
		colorRock      (0.265, 0.226, 0.183, 0.000)
		colorSnow      (0.277, 0.237, 0.191, 1.000)
		BumpHeight      1.87933
		BumpOffset      0.375866
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00105227
		Period          0.000742266
		Eccentricity    0
		Inclination     1.35399
		AscendingNode   108.078
		ArgOfPericenter -83.9443
		MeanAnomaly     -64.8344
	}
}

DwarfMoon	"Cantonica System 4.S53"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.92764e-012
	Radius          1.22722
	InertiaMoment   0.399937

	Oblateness      0.105117

	Obliquity       -0.576182
	EqAscendNode    154.487
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.773 0.771)

	Surface
	{
		SurfStyle       0.980323
		OceanStyle      0.119333
		Randomize      (-0.865, 0.716, 0.705)
		colorDistMagn   0.402159
		colorDistFreq   0.000984372
		detailScale     33.5113
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00443502
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465058
		terraceProb     0.370364
		erosion         0
		montesMagn      0.343331
		montesFreq      2.43085
		montesSpiky     0.863276
		montesFraction  0.219302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00466769
		hillsFraction   0.84632
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213385
		craterFreq      0.154214
		craterDensity   0.922422
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487245
		volcanoTemp     1627.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.271, 0.309, 0.050)
		colorShelf     (0.310, 0.317, 0.355, 0.040)
		colorBeach     (0.357, 0.363, 0.401, 0.030)
		colorDesert    (0.403, 0.410, 0.455, 0.020)
		colorLowland   (0.450, 0.456, 0.501, 0.030)
		colorUpland    (0.496, 0.503, 0.548, 0.050)
		colorRock      (0.543, 0.549, 0.609, 0.020)
		colorSnow      (0.543, 0.549, 0.609, 1.000)
		BumpHeight      1.1045
		BumpOffset      0.2209
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00105571
		Period          0.000745908
		Eccentricity    0
		Inclination     -0.576182
		AscendingNode   154.487
		ArgOfPericenter 9.36651
		MeanAnomaly     -169.435
	}
}

DwarfMoon	"Cantonica System 4.S54"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.62035e-012
	Radius          2.42571
	InertiaMoment   0.398031

	Oblateness      0.249

	Obliquity       -0.0413396
	EqAscendNode    -62.2538
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.511 0.346)

	Surface
	{
		SurfStyle       0.720796
		OceanStyle      0.0979455
		Randomize      (-0.976, 0.133, -0.174)
		colorDistMagn   0.368202
		colorDistFreq   0.00412551
		detailScale     66.2381
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00124488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554257
		terraceProb     0.704894
		erosion         0
		montesMagn      0.390797
		montesFreq      2.58349
		montesSpiky     0.821839
		montesFraction  0.212224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0125536
		hillsFraction   0.536136
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263947
		craterFreq      0.266452
		craterDensity   0.898036
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570203
		volcanoTemp     1634.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.174, 0.097, 0.000)
		colorShelf     (0.256, 0.179, 0.111, 0.000)
		colorBeach     (0.301, 0.209, 0.132, 0.000)
		colorDesert    (0.327, 0.225, 0.128, 0.000)
		colorLowland   (0.359, 0.240, 0.145, 0.000)
		colorUpland    (0.397, 0.291, 0.177, 0.000)
		colorRock      (0.429, 0.317, 0.190, 0.000)
		colorSnow      (0.468, 0.337, 0.201, 1.000)
		BumpHeight      2.18314
		BumpOffset      0.436628
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00106318
		Period          0.00075383
		Eccentricity    0
		Inclination     -0.0413396
		AscendingNode   -62.2538
		ArgOfPericenter 117.909
		MeanAnomaly     -95.324
	}
}

DwarfMoon	"Cantonica System 4.S55"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.09768e-012
	Radius          1.35293
	InertiaMoment   0.399161

	Oblateness      0.0651593

	Obliquity       0.165077
	EqAscendNode    1.66646
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.706 0.703)

	Surface
	{
		SurfStyle       0.364058
		OceanStyle      0.0382488
		Randomize      (-0.662, 0.888, 0.783)
		colorDistMagn   0.349301
		colorDistFreq   0.00134884
		detailScale     36.944
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00575673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311979
		terraceProb     0.190914
		erosion         0
		montesMagn      0.57193
		montesFreq      3.02544
		montesSpiky     0.820952
		montesFraction  0.470409
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00377565
		hillsFraction   0.534227
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211191
		craterFreq      0.263735
		craterDensity   0.764895
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430665
		volcanoTemp     1195.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.281, 0.000)
		colorShelf     (0.301, 0.300, 0.299, 0.000)
		colorBeach     (0.318, 0.318, 0.316, 0.000)
		colorDesert    (0.336, 0.335, 0.334, 0.000)
		colorLowland   (0.354, 0.353, 0.351, 0.000)
		colorUpland    (0.371, 0.371, 0.369, 0.000)
		colorRock      (0.389, 0.388, 0.387, 0.000)
		colorSnow      (0.407, 0.406, 0.404, 1.000)
		BumpHeight      1.21764
		BumpOffset      0.243528
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00107144
		Period          0.000762637
		Eccentricity    0
		Inclination     0.165077
		AscendingNode   1.66646
		ArgOfPericenter -44.1323
		MeanAnomaly     153.61
	}
}

DwarfMoon	"Cantonica System 4.S56"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.1768e-011
	Radius          3.41625
	InertiaMoment   0.39551

	Oblateness      0.249

	Obliquity       -0.628236
	EqAscendNode    -148.842
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.597 0.593 0.591)

	Surface
	{
		SurfStyle       0.642099
		OceanStyle      0.108615
		Randomize      (-0.854, -0.675, 0.275)
		colorDistMagn   0.176699
		colorDistFreq   0.00475463
		detailScale     93.2863
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00588979
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321501
		terraceProb     0.326651
		erosion         0
		montesMagn      0.557421
		montesFreq      3.14217
		montesSpiky     0.998135
		montesFraction  0.415311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0305938
		hillsFraction   0.510897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262083
		craterFreq      0.194608
		craterDensity   0.988856
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465397
		volcanoTemp     1588.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.202, 0.165, 0.000)
		colorShelf     (0.239, 0.208, 0.189, 0.000)
		colorBeach     (0.281, 0.243, 0.225, 0.000)
		colorDesert    (0.305, 0.261, 0.219, 0.000)
		colorLowland   (0.334, 0.279, 0.248, 0.000)
		colorUpland    (0.370, 0.338, 0.301, 0.000)
		colorRock      (0.400, 0.368, 0.325, 0.000)
		colorSnow      (0.436, 0.392, 0.343, 1.000)
		BumpHeight      3.07462
		BumpOffset      0.614924
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00107427
		Period          0.000765664
		Eccentricity    0
		Inclination     -0.628236
		AscendingNode   -148.842
		ArgOfPericenter -118.666
		MeanAnomaly     -151.284
	}
}

DwarfMoon	"Cantonica System 4.S57"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.7286e-011
	Radius          2.02875
	InertiaMoment   0.398225

	Oblateness      0.100354

	Obliquity       0.732678
	EqAscendNode    -91.8384
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.561 0.558 0.556)

	Surface
	{
		SurfStyle       0.221305
		OceanStyle      0.349229
		Randomize      (-0.635, 0.789, 0.996)
		colorDistMagn   0.486668
		colorDistFreq   0.00303895
		detailScale     55.3983
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0177898
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614995
		terraceProb     0.261357
		erosion         0
		montesMagn      0.5437
		montesFreq      2.86042
		montesSpiky     0.986918
		montesFraction  0.806125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00573849
		hillsFraction   0.81817
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257912
		craterFreq      0.229016
		craterDensity   1.06279
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527275
		volcanoTemp     1174.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.222, 0.000)
		colorShelf     (0.238, 0.237, 0.236, 0.000)
		colorBeach     (0.252, 0.251, 0.250, 0.000)
		colorDesert    (0.266, 0.265, 0.264, 0.000)
		colorLowland   (0.280, 0.279, 0.278, 0.000)
		colorUpland    (0.294, 0.293, 0.292, 0.000)
		colorRock      (0.308, 0.307, 0.306, 0.000)
		colorSnow      (0.322, 0.321, 0.320, 1.000)
		BumpHeight      1.82587
		BumpOffset      0.365175
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00107923
		Period          0.000770968
		Eccentricity    0
		Inclination     0.732678
		AscendingNode   -91.8384
		ArgOfPericenter 130.699
		MeanAnomaly     -83.2168
	}
}

DwarfMoon	"Cantonica System 4.S58"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.57279e-011
	Radius          4.05202
	InertiaMoment   0.399296

	Oblateness      0.249

	Obliquity       0.929305
	EqAscendNode    138.44
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.475 0.468 0.464)

	Surface
	{
		SurfStyle       0.788889
		OceanStyle      0.970902
		Randomize      (0.927, 0.788, 0.194)
		colorDistMagn   0.664275
		colorDistFreq   0.0108531
		detailScale     110.647
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0115081
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384061
		terraceProb     0.45723
		erosion         0
		montesMagn      0.477684
		montesFreq      3.06554
		montesSpiky     0.959795
		montesFraction  0.168194
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0358087
		hillsFraction   0.641387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246388
		craterFreq      0.198586
		craterDensity   0.898139
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505692
		volcanoTemp     1426.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.159, 0.130, 0.000)
		colorShelf     (0.190, 0.164, 0.148, 0.000)
		colorBeach     (0.223, 0.192, 0.176, 0.000)
		colorDesert    (0.242, 0.206, 0.172, 0.000)
		colorLowland   (0.266, 0.220, 0.195, 0.000)
		colorUpland    (0.294, 0.267, 0.237, 0.000)
		colorRock      (0.318, 0.290, 0.255, 0.000)
		colorSnow      (0.346, 0.309, 0.269, 1.000)
		BumpHeight      3.64682
		BumpOffset      0.729364
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00108851
		Period          0.000780933
		Eccentricity    0
		Inclination     0.929305
		AscendingNode   138.44
		ArgOfPericenter -117.03
		MeanAnomaly     126.095
	}
}

DwarfMoon	"Cantonica System 4.S59"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.89161e-011
	Radius          2.32611
	InertiaMoment   0.396434

	Oblateness      0.0646937

	Obliquity       -0.193717
	EqAscendNode    35.7265
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.729 0.725)

	Surface
	{
		SurfStyle       0.831597
		OceanStyle      0.999011
		Randomize      (-0.087, 0.338, -0.944)
		colorDistMagn   0.425872
		colorDistFreq   0.00274795
		detailScale     63.5184
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00643158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459192
		terraceProb     0.219954
		erosion         0
		montesMagn      0.628737
		montesFreq      2.08782
		montesSpiky     0.942101
		montesFraction  0.358332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0110374
		hillsFraction   0.472747
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261231
		craterFreq      0.22634
		craterDensity   0.911383
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462086
		volcanoTemp     1536.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.248, 0.203, 0.000)
		colorShelf     (0.293, 0.255, 0.232, 0.000)
		colorBeach     (0.344, 0.299, 0.276, 0.000)
		colorDesert    (0.373, 0.321, 0.268, 0.000)
		colorLowland   (0.410, 0.343, 0.305, 0.000)
		colorUpland    (0.453, 0.416, 0.370, 0.000)
		colorRock      (0.490, 0.452, 0.399, 0.000)
		colorSnow      (0.534, 0.481, 0.421, 1.000)
		BumpHeight      2.0935
		BumpOffset      0.4187
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0010905
		Period          0.000783073
		Eccentricity    0
		Inclination     -0.193717
		AscendingNode   35.7265
		ArgOfPericenter 157.606
		MeanAnomaly     -12.7115
	}
}

DwarfMoon	"Cantonica System 4.S60"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            6.00455e-011
	Radius          5.9399
	InertiaMoment   0.398403

	Oblateness      0.249

	Obliquity       -1.14822
	EqAscendNode    41.5558
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.470 0.467)

	Surface
	{
		SurfStyle       0.694492
		OceanStyle      0.625251
		Randomize      (-0.271, -0.928, 0.691)
		colorDistMagn   0.7489
		colorDistFreq   0.0221531
		detailScale     162.199
		colorConversion true
		snowLevel       2
		tropicLatitude  0.037464
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680088
		terraceProb     0.135681
		erosion         0
		montesMagn      0.331051
		montesFreq      3.09281
		montesSpiky     0.955026
		montesFraction  0.471543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0849394
		hillsFraction   0.733301
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250506
		craterFreq      0.263031
		craterDensity   1.06899
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582214
		volcanoTemp     1474.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.160, 0.131, 0.000)
		colorShelf     (0.189, 0.164, 0.150, 0.000)
		colorBeach     (0.222, 0.193, 0.178, 0.000)
		colorDesert    (0.241, 0.207, 0.173, 0.000)
		colorLowland   (0.265, 0.221, 0.196, 0.000)
		colorUpland    (0.293, 0.268, 0.238, 0.000)
		colorRock      (0.317, 0.291, 0.257, 0.000)
		colorSnow      (0.345, 0.310, 0.271, 1.000)
		BumpHeight      5.34591
		BumpOffset      1.06918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00109647
		Period          0.000789513
		Eccentricity    0
		Inclination     -1.14822
		AscendingNode   41.5558
		ArgOfPericenter 117.668
		MeanAnomaly     -64.1454
	}
}

DwarfMoon	"Cantonica System 4.S61"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.49548e-011
	Radius          3.6119
	InertiaMoment   0.399427

	Oblateness      0.0963172

	Obliquity       1.37402
	EqAscendNode    146.81
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.771 0.768 0.766)

	Surface
	{
		SurfStyle       0.0752985
		OceanStyle      0.429561
		Randomize      (0.815, -0.069, -0.629)
		colorDistMagn   0.19804
		colorDistFreq   0.00705131
		detailScale     98.6291
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0136977
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291659
		terraceProb     0.498028
		erosion         0
		montesMagn      0.509027
		montesFreq      2.9762
		montesSpiky     0.986131
		montesFraction  0.362497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0318601
		hillsFraction   0.346656
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263429
		craterFreq      0.261646
		craterDensity   0.955434
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526292
		volcanoTemp     1294.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.307, 0.000)
		colorShelf     (0.328, 0.327, 0.326, 0.000)
		colorBeach     (0.347, 0.346, 0.345, 0.000)
		colorDesert    (0.366, 0.365, 0.364, 0.000)
		colorLowland   (0.385, 0.384, 0.383, 0.000)
		colorUpland    (0.405, 0.403, 0.402, 0.000)
		colorRock      (0.424, 0.423, 0.422, 0.000)
		colorSnow      (0.443, 0.442, 0.441, 1.000)
		BumpHeight      3.25071
		BumpOffset      0.650143
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00110563
		Period          0.000799435
		Eccentricity    0
		Inclination     1.37402
		AscendingNode   146.81
		ArgOfPericenter 24.3641
		MeanAnomaly     83.0611
	}
}

DwarfMoon	"Cantonica System 4.S62"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.54868e-010
	Radius          7.41408
	InertiaMoment   0.396927

	Oblateness      0.249

	Obliquity       -0.27602
	EqAscendNode    -178.334
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.588 0.584 0.578)

	Surface
	{
		SurfStyle       0.750451
		OceanStyle      0.10968
		Randomize      (-0.463, -0.571, -0.313)
		colorDistMagn   0.830467
		colorDistFreq   0.0326259
		detailScale     202.454
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452239
		terraceProb     0.124697
		erosion         0
		montesMagn      0.421612
		montesFreq      2.89195
		montesSpiky     0.969302
		montesFraction  0.76735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.103053
		hillsFraction   0.763557
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224134
		craterFreq      0.238015
		craterDensity   0.890163
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488034
		volcanoTemp     1457.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.199, 0.162, 0.000)
		colorShelf     (0.235, 0.205, 0.185, 0.000)
		colorBeach     (0.277, 0.240, 0.220, 0.000)
		colorDesert    (0.300, 0.257, 0.214, 0.000)
		colorLowland   (0.330, 0.275, 0.243, 0.000)
		colorUpland    (0.365, 0.333, 0.295, 0.000)
		colorRock      (0.394, 0.362, 0.318, 0.000)
		colorSnow      (0.430, 0.386, 0.335, 1.000)
		BumpHeight      6.67268
		BumpOffset      1.33454
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00110753
		Period          0.000801496
		Eccentricity    0
		Inclination     -0.27602
		AscendingNode   -178.334
		ArgOfPericenter -145.972
		MeanAnomaly     154.173
	}
}

DwarfMoon	"Cantonica System 4.S63"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.62745e-010
	Radius          4.45999
	InertiaMoment   0.398569

	Oblateness      0.064307

	Obliquity       1.28704
	EqAscendNode    -37.5694
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.449 0.446 0.440)

	Surface
	{
		SurfStyle       0.255824
		OceanStyle      0.246451
		Randomize      (-0.178, 0.884, -0.980)
		colorDistMagn   0.288557
		colorDistFreq   0.00779618
		detailScale     121.787
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0425199
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.371262
		terraceProb     0.374311
		erosion         0
		montesMagn      0.519458
		montesFreq      2.2174
		montesSpiky     0.973468
		montesFraction  0.699923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0329561
		hillsFraction   0.906397
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230411
		craterFreq      0.214632
		craterDensity   1.05774
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.612249
		volcanoTemp     1239.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.178, 0.176, 0.000)
		colorShelf     (0.191, 0.189, 0.187, 0.000)
		colorBeach     (0.202, 0.201, 0.198, 0.000)
		colorDesert    (0.213, 0.212, 0.209, 0.000)
		colorLowland   (0.225, 0.223, 0.220, 0.000)
		colorUpland    (0.236, 0.234, 0.231, 0.000)
		colorRock      (0.247, 0.245, 0.242, 0.000)
		colorSnow      (0.258, 0.256, 0.253, 1.000)
		BumpHeight      4.01399
		BumpOffset      0.802798
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00111144
		Period          0.000805741
		Eccentricity    0
		Inclination     1.28704
		AscendingNode   -37.5694
		ArgOfPericenter 71.6696
		MeanAnomaly     177.757
	}
}

DwarfMoon	"Cantonica System 4.S64"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.69436e-010
	Radius          11.9259
	InertiaMoment   0.399556

	Oblateness      0.249

	Obliquity       -1.10568
	EqAscendNode    -123.357
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.535 0.532)

	Surface
	{
		SurfStyle       0.887895
		OceanStyle      0.119811
		Randomize      (-0.188, 0.362, 0.430)
		colorDistMagn   0.735058
		colorDistFreq   0.0268494
		detailScale     325.656
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0183082
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352762
		terraceProb     0.463437
		erosion         0
		montesMagn      0.534228
		montesFreq      3.24964
		montesSpiky     0.982821
		montesFraction  0.225016
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.429807
		hillsFraction   0.614043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234847
		craterFreq      0.170552
		craterDensity   0.895692
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493112
		volcanoTemp     1656.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.187, 0.213, 0.050)
		colorShelf     (0.216, 0.219, 0.245, 0.040)
		colorBeach     (0.249, 0.251, 0.276, 0.030)
		colorDesert    (0.281, 0.283, 0.314, 0.020)
		colorLowland   (0.314, 0.315, 0.346, 0.030)
		colorUpland    (0.346, 0.347, 0.377, 0.050)
		colorRock      (0.379, 0.380, 0.420, 0.020)
		colorSnow      (0.379, 0.380, 0.420, 1.000)
		BumpHeight      10.7333
		BumpOffset      2.14666
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00111951
		Period          0.000814536
		Eccentricity    0
		Inclination     -1.10568
		AscendingNode   -123.357
		ArgOfPericenter 22.8946
		MeanAnomaly     175.469
	}
}

DwarfMoon	"Cantonica System 4.S65"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.99884e-010
	Radius          7.71511
	InertiaMoment   0.397283

	Oblateness      0.0938014

	Obliquity       -0.949875
	EqAscendNode    -79.3368
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.704 0.648 0.562)

	Surface
	{
		SurfStyle       0.70563
		OceanStyle      0.8184
		Randomize      (0.028, 0.730, -0.023)
		colorDistMagn   0.519803
		colorDistFreq   0.0337261
		detailScale     210.674
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0255197
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422662
		terraceProb     0.395716
		erosion         0
		montesMagn      0.474457
		montesFreq      3.00678
		montesSpiky     0.956746
		montesFraction  0.786768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.109412
		hillsFraction   0.759404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231183
		craterFreq      0.275899
		craterDensity   0.832313
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517372
		volcanoTemp     1704.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.220, 0.157, 0.000)
		colorShelf     (0.282, 0.227, 0.180, 0.000)
		colorBeach     (0.331, 0.266, 0.213, 0.000)
		colorDesert    (0.359, 0.285, 0.208, 0.000)
		colorLowland   (0.394, 0.304, 0.236, 0.000)
		colorUpland    (0.436, 0.369, 0.286, 0.000)
		colorRock      (0.472, 0.402, 0.309, 0.000)
		colorSnow      (0.514, 0.428, 0.326, 1.000)
		BumpHeight      6.9436
		BumpOffset      1.38872
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00112287
		Period          0.000818199
		Eccentricity    0
		Inclination     -0.949875
		AscendingNode   -79.3368
		ArgOfPericenter -125.337
		MeanAnomaly     147.123
	}
}

DwarfMoon	"Cantonica System 4.S66"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.90828e-009
	Radius          17.2225
	InertiaMoment   0.398726

	Oblateness      0.249

	Obliquity       0.666646
	EqAscendNode    -133.341
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.510 0.501)

	Surface
	{
		SurfStyle       0.98745
		OceanStyle      0.438236
		Randomize      (0.612, 0.162, -0.259)
		colorDistMagn   0.125885
		colorDistFreq   0.138252
		detailScale     470.289
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00921277
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592684
		terraceProb     0.239071
		erosion         0
		montesMagn      0.381349
		montesFreq      2.53742
		montesSpiky     0.81408
		montesFraction  0.805842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01468
		hillsFraction   0.669196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219963
		craterFreq      0.178218
		craterDensity   1.07063
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531662
		volcanoTemp     1779.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.179, 0.200, 0.050)
		colorShelf     (0.206, 0.209, 0.230, 0.040)
		colorBeach     (0.237, 0.240, 0.260, 0.030)
		colorDesert    (0.268, 0.270, 0.295, 0.020)
		colorLowland   (0.299, 0.301, 0.326, 0.030)
		colorUpland    (0.330, 0.332, 0.356, 0.050)
		colorRock      (0.361, 0.362, 0.396, 0.020)
		colorSnow      (0.361, 0.362, 0.396, 1.000)
		BumpHeight      15.5002
		BumpOffset      3.10005
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00112876
		Period          0.000824646
		Eccentricity    0
		Inclination     0.666646
		AscendingNode   -133.341
		ArgOfPericenter 101.477
		MeanAnomaly     8.09335
	}
}

DwarfMoon	"Cantonica System 4.S67"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.56647e-016
	Radius          0.054278
	InertiaMoment   0.399683

	Oblateness      0.062669

	Obliquity       -0.219752
	EqAscendNode    -48.1666
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.633 0.630)

	Surface
	{
		SurfStyle       0.0803872
		OceanStyle      0.752931
		Randomize      (0.801, -0.436, -0.586)
		colorDistMagn   0.447341
		colorDistFreq   2.0905e-006
		detailScale     1.48215
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0069996
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32764
		terraceProb     0.222567
		erosion         0
		montesMagn      0.559164
		montesFreq      3.09482
		montesSpiky     0.955936
		montesFraction  0.547395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.13643e-006
		hillsFraction   0.571318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229514
		craterFreq      0.246157
		craterDensity   0.775298
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582877
		volcanoTemp     1472.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.253, 0.252, 0.000)
		colorShelf     (0.271, 0.269, 0.268, 0.000)
		colorBeach     (0.286, 0.285, 0.284, 0.000)
		colorDesert    (0.302, 0.301, 0.299, 0.000)
		colorLowland   (0.318, 0.316, 0.315, 0.000)
		colorUpland    (0.334, 0.332, 0.331, 0.000)
		colorRock      (0.350, 0.348, 0.347, 0.000)
		colorSnow      (0.366, 0.364, 0.363, 1.000)
		BumpHeight      0.0488502
		BumpOffset      0.00977004
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00113632
		Period          0.000832947
		Eccentricity    0
		Inclination     -0.219752
		AscendingNode   -48.1666
		ArgOfPericenter -107.255
		MeanAnomaly     33.5294
	}
}

DwarfMoon	"Cantonica System 4.S68"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.89026e-016
	Radius          0.155052
	InertiaMoment   0.397569

	Oblateness      0.249

	Obliquity       -1.28886
	EqAscendNode    155.011
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.408 0.399 0.396)

	Surface
	{
		SurfStyle       0.200903
		OceanStyle      0.0526878
		Randomize      (0.225, 0.184, -0.321)
		colorDistMagn   0.98617
		colorDistFreq   7.52747e-006
		detailScale     4.23395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00973494
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53856
		terraceProb     0.341967
		erosion         0
		montesMagn      0.495206
		montesFreq      2.86075
		montesSpiky     0.844234
		montesFraction  0.628514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.84625e-005
		hillsFraction   0.494542
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237979
		craterFreq      0.207871
		craterDensity   0.788711
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475296
		volcanoTemp     1350.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.160, 0.158, 0.000)
		colorShelf     (0.173, 0.170, 0.168, 0.000)
		colorBeach     (0.184, 0.180, 0.178, 0.000)
		colorDesert    (0.194, 0.190, 0.188, 0.000)
		colorLowland   (0.204, 0.200, 0.198, 0.000)
		colorUpland    (0.214, 0.210, 0.208, 0.000)
		colorRock      (0.224, 0.220, 0.218, 0.000)
		colorSnow      (0.235, 0.230, 0.228, 1.000)
		BumpHeight      0.139547
		BumpOffset      0.0279093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00113824
		Period          0.000835063
		Eccentricity    0
		Inclination     -1.28886
		AscendingNode   155.011
		ArgOfPericenter 100.29
		MeanAnomaly     155.357
	}
}

DwarfMoon	"Cantonica System 4.S69"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.92297e-015
	Radius          0.100348
	InertiaMoment   0.398876

	Oblateness      0.0929089

	Obliquity       -1.23967
	EqAscendNode    -32.502
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.670 0.666 0.663)

	Surface
	{
		SurfStyle       0.383462
		OceanStyle      0.483127
		Randomize      (-0.852, -0.740, 0.181)
		colorDistMagn   0.193888
		colorDistFreq   7.20739e-006
		detailScale     2.74016
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0415323
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447326
		terraceProb     0.354503
		erosion         0
		montesMagn      0.543591
		montesFreq      2.76029
		montesSpiky     0.992386
		montesFraction  0.661337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.36481e-005
		hillsFraction   0.711604
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20711
		craterFreq      0.218794
		craterDensity   0.989838
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458232
		volcanoTemp     1444.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.265, 0.000)
		colorShelf     (0.285, 0.283, 0.282, 0.000)
		colorBeach     (0.302, 0.300, 0.298, 0.000)
		colorDesert    (0.318, 0.316, 0.315, 0.000)
		colorLowland   (0.335, 0.333, 0.332, 0.000)
		colorUpland    (0.352, 0.350, 0.348, 0.000)
		colorRock      (0.369, 0.366, 0.365, 0.000)
		colorSnow      (0.385, 0.383, 0.381, 1.000)
		BumpHeight      0.0903128
		BumpOffset      0.0180626
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00113976
		Period          0.000836732
		Eccentricity    0
		Inclination     -1.23967
		AscendingNode   -32.502
		ArgOfPericenter -71.6013
		MeanAnomaly     98.1419
	}
}

DwarfMoon	"Cantonica System 4.S70"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.47074e-015
	Radius          0.211415
	InertiaMoment   0.399809

	Oblateness      0.249

	Obliquity       -0.833167
	EqAscendNode    -77.8158
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.704 0.702)

	Surface
	{
		SurfStyle       0.93914
		OceanStyle      0.709216
		Randomize      (-0.468, -0.068, -0.592)
		colorDistMagn   0.598574
		colorDistFreq   3.17984e-005
		detailScale     5.77304
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0226287
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647563
		terraceProb     0.511445
		erosion         0
		montesMagn      0.690864
		montesFreq      2.77884
		montesSpiky     0.864751
		montesFraction  0.627661
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.65545e-005
		hillsFraction   0.729962
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252538
		craterFreq      0.179007
		craterDensity   0.899396
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46494
		volcanoTemp     1685.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.246, 0.281, 0.050)
		colorShelf     (0.283, 0.289, 0.323, 0.040)
		colorBeach     (0.326, 0.331, 0.365, 0.030)
		colorDesert    (0.368, 0.373, 0.414, 0.020)
		colorLowland   (0.411, 0.415, 0.456, 0.030)
		colorUpland    (0.453, 0.458, 0.498, 0.050)
		colorRock      (0.496, 0.500, 0.554, 0.020)
		colorSnow      (0.496, 0.500, 0.554, 1.000)
		BumpHeight      0.190274
		BumpOffset      0.0380547
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00114892
		Period          0.00084684
		Eccentricity    0
		Inclination     -0.833167
		AscendingNode   -77.8158
		ArgOfPericenter 8.76413
		MeanAnomaly     -106.686
	}
}

DwarfMoon	"Cantonica System 4.S71"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.93327e-015
	Radius          0.12899
	InertiaMoment   0.397812

	Oblateness      0.0619956

	Obliquity       -0.716237
	EqAscendNode    166.575
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.599 0.552 0.493)

	Surface
	{
		SurfStyle       0.345814
		OceanStyle      0.279574
		Randomize      (0.800, -0.718, -0.739)
		colorDistMagn   0.868236
		colorDistFreq   9.20748e-006
		detailScale     3.52228
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00292968
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476305
		terraceProb     0.536916
		erosion         0
		montesMagn      0.645992
		montesFreq      4.00124
		montesSpiky     0.899684
		montesFraction  0.593738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.97453e-005
		hillsFraction   0.792954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26057
		craterFreq      0.268988
		craterDensity   1.0129
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.420383
		volcanoTemp     1728.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.221, 0.197, 0.000)
		colorShelf     (0.254, 0.235, 0.210, 0.000)
		colorBeach     (0.269, 0.248, 0.222, 0.000)
		colorDesert    (0.284, 0.262, 0.234, 0.000)
		colorLowland   (0.299, 0.276, 0.247, 0.000)
		colorUpland    (0.314, 0.290, 0.259, 0.000)
		colorRock      (0.329, 0.304, 0.271, 0.000)
		colorSnow      (0.344, 0.317, 0.284, 1.000)
		BumpHeight      0.116091
		BumpOffset      0.0232182
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00115012
		Period          0.000848164
		Eccentricity    0
		Inclination     -0.716237
		AscendingNode   166.575
		ArgOfPericenter -21.422
		MeanAnomaly     11.9679
	}
}

DwarfMoon	"Cantonica System 4.S72"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.73386e-015
	Radius          0.338477
	InertiaMoment   0.399019

	Oblateness      0.249

	Obliquity       -1.11606
	EqAscendNode    -23.9745
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.474 0.470)

	Surface
	{
		SurfStyle       0.89123
		OceanStyle      0.081166
		Randomize      (0.020, -0.708, 0.519)
		colorDistMagn   0.747218
		colorDistFreq   4.30071e-005
		detailScale     9.24269
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0380994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639513
		terraceProb     0.229454
		erosion         0
		montesMagn      0.431495
		montesFreq      2.62857
		montesSpiky     0.904923
		montesFraction  0.251035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000314768
		hillsFraction   0.596848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232133
		craterFreq      0.186322
		craterDensity   0.873495
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551289
		volcanoTemp     1602.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.166, 0.188, 0.050)
		colorShelf     (0.193, 0.194, 0.216, 0.040)
		colorBeach     (0.222, 0.223, 0.244, 0.030)
		colorDesert    (0.252, 0.251, 0.277, 0.020)
		colorLowland   (0.281, 0.280, 0.306, 0.030)
		colorUpland    (0.310, 0.308, 0.334, 0.050)
		colorRock      (0.339, 0.337, 0.371, 0.020)
		colorSnow      (0.339, 0.337, 0.371, 1.000)
		BumpHeight      0.30463
		BumpOffset      0.0609259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0011566
		Period          0.000855339
		Eccentricity    0
		Inclination     -1.11606
		AscendingNode   -23.9745
		ArgOfPericenter -179.433
		MeanAnomaly     -59.8315
	}
}

DwarfMoon	"Cantonica System 4.S73"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.54644e-014
	Radius          0.203125
	InertiaMoment   0.399934

	Oblateness      0.0913791

	Obliquity       1.21499
	EqAscendNode    16.0854
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.520 0.400 0.346)

	Surface
	{
		SurfStyle       0.127261
		OceanStyle      0.932237
		Randomize      (-0.853, 0.605, 0.275)
		colorDistMagn   0.614937
		colorDistFreq   2.09928e-005
		detailScale     5.54666
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0419815
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.313358
		terraceProb     0.51995
		erosion         0
		montesMagn      0.617284
		montesFreq      2.88936
		montesSpiky     0.941559
		montesFraction  0.554963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.57523e-005
		hillsFraction   0.684141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260587
		craterFreq      0.229799
		craterDensity   0.744359
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5242
		volcanoTemp     1418.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.160, 0.139, 0.000)
		colorShelf     (0.221, 0.170, 0.147, 0.000)
		colorBeach     (0.234, 0.180, 0.156, 0.000)
		colorDesert    (0.247, 0.190, 0.165, 0.000)
		colorLowland   (0.260, 0.200, 0.173, 0.000)
		colorUpland    (0.273, 0.210, 0.182, 0.000)
		colorRock      (0.286, 0.220, 0.190, 0.000)
		colorSnow      (0.299, 0.230, 0.199, 1.000)
		BumpHeight      0.182812
		BumpOffset      0.0365625
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00115947
		Period          0.000858532
		Eccentricity    0
		Inclination     1.21499
		AscendingNode   16.0854
		ArgOfPericenter 65.3783
		MeanAnomaly     40.3356
	}
}

DwarfMoon	"Cantonica System 4.S74"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.39496e-014
	Radius          0.404761
	InertiaMoment   0.398027

	Oblateness      0.249

	Obliquity       1.09677
	EqAscendNode    -147.647
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.483 0.480)

	Surface
	{
		SurfStyle       0.151436
		OceanStyle      0.489622
		Randomize      (-0.538, 0.599, -0.436)
		colorDistMagn   0.525913
		colorDistFreq   0.000113051
		detailScale     11.0527
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0106641
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463718
		terraceProb     0.483067
		erosion         0
		montesMagn      0.496803
		montesFreq      3.71514
		montesSpiky     0.903512
		montesFraction  0.581432
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000365957
		hillsFraction   0.662859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224924
		craterFreq      0.256119
		craterDensity   0.965598
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536074
		volcanoTemp     1349.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.193, 0.192, 0.000)
		colorShelf     (0.208, 0.205, 0.204, 0.000)
		colorBeach     (0.220, 0.218, 0.216, 0.000)
		colorDesert    (0.232, 0.230, 0.228, 0.000)
		colorLowland   (0.244, 0.242, 0.240, 0.000)
		colorUpland    (0.257, 0.254, 0.252, 0.000)
		colorRock      (0.269, 0.266, 0.264, 0.000)
		colorSnow      (0.281, 0.278, 0.276, 1.000)
		BumpHeight      0.364285
		BumpOffset      0.072857
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00116404
		Period          0.000863606
		Eccentricity    0
		Inclination     1.09677
		AscendingNode   -147.647
		ArgOfPericenter -46.0657
		MeanAnomaly     41.0118
	}
}

DwarfMoon	"Cantonica System 4.S75"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.63355e-014
	Radius          0.238348
	InertiaMoment   0.399158

	Oblateness      0.0606558

	Obliquity       0.0690784
	EqAscendNode    -91.6039
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.763 0.760)

	Surface
	{
		SurfStyle       0.216187
		OceanStyle      0.691757
		Randomize      (0.566, -0.429, -0.878)
		colorDistMagn   0.0504407
		colorDistFreq   3.01928e-005
		detailScale     6.5085
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00169146
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493526
		terraceProb     0.368874
		erosion         0
		montesMagn      0.496342
		montesFreq      3.6548
		montesSpiky     0.839697
		montesFraction  0.870294
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000161444
		hillsFraction   0.682641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276075
		craterFreq      0.190745
		craterDensity   1.05681
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487944
		volcanoTemp     1447.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.305, 0.304, 0.000)
		colorShelf     (0.326, 0.324, 0.323, 0.000)
		colorBeach     (0.345, 0.343, 0.342, 0.000)
		colorDesert    (0.364, 0.363, 0.361, 0.000)
		colorLowland   (0.383, 0.382, 0.380, 0.000)
		colorUpland    (0.402, 0.401, 0.399, 0.000)
		colorRock      (0.422, 0.420, 0.418, 0.000)
		colorSnow      (0.441, 0.439, 0.437, 1.000)
		BumpHeight      0.214513
		BumpOffset      0.0429027
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00117205
		Period          0.000872542
		Eccentricity    0
		Inclination     0.0690784
		AscendingNode   -91.6039
		ArgOfPericenter -41.2998
		MeanAnomaly     -27.2595
	}
}

DwarfMoon	"Cantonica System 4.S76"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.42136e-014
	Radius          0.617142
	InertiaMoment   0.395476

	Oblateness      0.249

	Obliquity       -0.0343224
	EqAscendNode    30.8224
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.660 0.543)

	Surface
	{
		SurfStyle       0.906902
		OceanStyle      0.498686
		Randomize      (-0.590, -0.245, -0.314)
		colorDistMagn   0.901222
		colorDistFreq   0.000172816
		detailScale     16.8521
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00114512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330781
		terraceProb     0.305614
		erosion         0
		montesMagn      0.4135
		montesFreq      2.52688
		montesSpiky     0.995652
		montesFraction  0.600136
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000904236
		hillsFraction   0.800478
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275475
		craterFreq      0.257526
		craterDensity   0.666575
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512776
		volcanoTemp     1731.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.231, 0.217, 0.050)
		colorShelf     (0.293, 0.271, 0.250, 0.040)
		colorBeach     (0.337, 0.310, 0.282, 0.030)
		colorDesert    (0.382, 0.350, 0.320, 0.020)
		colorLowland   (0.426, 0.389, 0.353, 0.030)
		colorUpland    (0.470, 0.429, 0.386, 0.050)
		colorRock      (0.514, 0.469, 0.429, 0.020)
		colorSnow      (0.514, 0.469, 0.429, 1.000)
		BumpHeight      0.555428
		BumpOffset      0.111086
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00117564
		Period          0.000876554
		Eccentricity    0
		Inclination     -0.0343224
		AscendingNode   30.8224
		ArgOfPericenter -81.8762
		MeanAnomaly     48.1349
	}
}

DwarfMoon	"Cantonica System 4.S77"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            7.97936e-014
	Radius          0.354867
	InertiaMoment   0.398221

	Oblateness      0.0892794

	Obliquity       -0.872552
	EqAscendNode    -25.9443
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.535 0.533)

	Surface
	{
		SurfStyle       0.198708
		OceanStyle      0.880923
		Randomize      (0.773, -0.050, 0.609)
		colorDistMagn   0.692236
		colorDistFreq   7.72437e-005
		detailScale     9.69023
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0296756
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581971
		terraceProb     0.285613
		erosion         0
		montesMagn      0.322464
		montesFreq      2.55719
		montesSpiky     0.959881
		montesFraction  0.317346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00027164
		hillsFraction   0.817226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245208
		craterFreq      0.207015
		craterDensity   0.813973
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503848
		volcanoTemp     1423.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.214, 0.213, 0.000)
		colorShelf     (0.230, 0.228, 0.226, 0.000)
		colorBeach     (0.243, 0.241, 0.240, 0.000)
		colorDesert    (0.257, 0.254, 0.253, 0.000)
		colorLowland   (0.270, 0.268, 0.266, 0.000)
		colorUpland    (0.284, 0.281, 0.280, 0.000)
		colorRock      (0.297, 0.294, 0.293, 0.000)
		colorSnow      (0.311, 0.308, 0.306, 1.000)
		BumpHeight      0.31938
		BumpOffset      0.0638761
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00117884
		Period          0.000880128
		Eccentricity    0
		Inclination     -0.872552
		AscendingNode   -25.9443
		ArgOfPericenter -85.1118
		MeanAnomaly     53.9457
	}
}

DwarfMoon	"Cantonica System 4.S78"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.16149e-013
	Radius          0.688995
	InertiaMoment   0.399293

	Oblateness      0.249

	Obliquity       0.816004
	EqAscendNode    -87.0411
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.440 0.436 0.432)

	Surface
	{
		SurfStyle       0.241333
		OceanStyle      0.541964
		Randomize      (-0.593, 0.527, -0.365)
		colorDistMagn   0.774346
		colorDistFreq   0.000160496
		detailScale     18.8142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0206515
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366375
		terraceProb     0.399482
		erosion         0
		montesMagn      0.530414
		montesFreq      3.5893
		montesSpiky     0.819337
		montesFraction  0.284563
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00136247
		hillsFraction   0.68114
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245978
		craterFreq      0.246715
		craterDensity   0.91197
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547685
		volcanoTemp     1597
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.174, 0.173, 0.000)
		colorShelf     (0.187, 0.185, 0.184, 0.000)
		colorBeach     (0.198, 0.196, 0.194, 0.000)
		colorDesert    (0.209, 0.207, 0.205, 0.000)
		colorLowland   (0.220, 0.218, 0.216, 0.000)
		colorUpland    (0.231, 0.229, 0.227, 0.000)
		colorRock      (0.242, 0.240, 0.238, 0.000)
		colorSnow      (0.253, 0.251, 0.248, 1.000)
		BumpHeight      0.620095
		BumpOffset      0.124019
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00118551
		Period          0.000887618
		Eccentricity    0
		Inclination     0.816004
		AscendingNode   -87.0411
		ArgOfPericenter 126.998
		MeanAnomaly     64.1342
	}
}

DwarfMoon	"Cantonica System 4.S79"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.67562e-013
	Radius          0.400444
	InertiaMoment   0.396421

	Oblateness      0.0588245

	Obliquity       1.34385
	EqAscendNode    21.8838
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.631 0.626 0.621)

	Surface
	{
		SurfStyle       0.557575
		OceanStyle      0.447449
		Randomize      (-0.208, 0.682, 0.750)
		colorDistMagn   0.1795
		colorDistFreq   8.80489e-005
		detailScale     10.9348
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0460405
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.490783
		terraceProb     0.552989
		erosion         0
		montesMagn      0.628091
		montesFreq      2.10473
		montesSpiky     0.840417
		montesFraction  0.654522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000276725
		hillsFraction   0.468948
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260169
		craterFreq      0.251237
		craterDensity   1.06919
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462833
		volcanoTemp     1713.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.174, 0.000)
		colorShelf     (0.252, 0.219, 0.199, 0.000)
		colorBeach     (0.296, 0.256, 0.236, 0.000)
		colorDesert    (0.322, 0.275, 0.230, 0.000)
		colorLowland   (0.353, 0.294, 0.261, 0.000)
		colorUpland    (0.391, 0.357, 0.317, 0.000)
		colorRock      (0.423, 0.388, 0.342, 0.000)
		colorSnow      (0.460, 0.413, 0.360, 1.000)
		BumpHeight      0.3604
		BumpOffset      0.0720799
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0011911
		Period          0.000893897
		Eccentricity    0
		Inclination     1.34385
		AscendingNode   21.8838
		ArgOfPericenter 34.4374
		MeanAnomaly     -4.77307
	}
}

DwarfMoon	"Cantonica System 4.S80"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.40021e-013
	Radius          1.08911
	InertiaMoment   0.398399

	Oblateness      0.249

	Obliquity       -0.0286054
	EqAscendNode    -64.6201
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.603 0.557)

	Surface
	{
		SurfStyle       0.00154885
		OceanStyle      0.327438
		Randomize      (0.843, -0.550, 0.746)
		colorDistMagn   0.505799
		colorDistFreq   0.000128066
		detailScale     29.7401
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000845728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553268
		terraceProb     0.291686
		erosion         0
		montesMagn      0.5511
		montesFreq      3.67726
		montesSpiky     0.925681
		montesFraction  0.414886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00435601
		hillsFraction   0.699517
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224504
		craterFreq      0.20107
		craterDensity   0.931463
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463769
		volcanoTemp     1573.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.241, 0.223, 0.000)
		colorShelf     (0.272, 0.256, 0.237, 0.000)
		colorBeach     (0.288, 0.271, 0.251, 0.000)
		colorDesert    (0.304, 0.286, 0.265, 0.000)
		colorLowland   (0.320, 0.301, 0.279, 0.000)
		colorUpland    (0.336, 0.316, 0.293, 0.000)
		colorRock      (0.352, 0.331, 0.306, 0.000)
		colorSnow      (0.368, 0.347, 0.320, 1.000)
		BumpHeight      0.980203
		BumpOffset      0.196041
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00119315
		Period          0.000896208
		Eccentricity    0
		Inclination     -0.0286054
		AscendingNode   -64.6201
		ArgOfPericenter 37.1822
		MeanAnomaly     114.717
	}
}

DwarfMoon	"Cantonica System 4.S81"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.41933e-013
	Radius          0.583236
	InertiaMoment   0.399424

	Oblateness      0.0888614

	Obliquity       -0.756746
	EqAscendNode    -11.6994
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.532 0.428)

	Surface
	{
		SurfStyle       0.158175
		OceanStyle      0.691079
		Randomize      (-0.975, 0.401, -0.795)
		colorDistMagn   0.64589
		colorDistFreq   0.000104866
		detailScale     15.9262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0262743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288446
		terraceProb     0.227572
		erosion         0
		montesMagn      0.44097
		montesFreq      3.44575
		montesSpiky     0.920115
		montesFraction  0.775447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000821693
		hillsFraction   0.719944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209746
		craterFreq      0.167772
		craterDensity   0.892723
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517458
		volcanoTemp     1305.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.213, 0.171, 0.000)
		colorShelf     (0.288, 0.226, 0.182, 0.000)
		colorBeach     (0.305, 0.239, 0.192, 0.000)
		colorDesert    (0.322, 0.253, 0.203, 0.000)
		colorLowland   (0.338, 0.266, 0.214, 0.000)
		colorUpland    (0.355, 0.279, 0.225, 0.000)
		colorRock      (0.372, 0.293, 0.235, 0.000)
		colorSnow      (0.389, 0.306, 0.246, 1.000)
		BumpHeight      0.524913
		BumpOffset      0.104983
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00119648
		Period          0.000899967
		Eccentricity    0
		Inclination     -0.756746
		AscendingNode   -11.6994
		ArgOfPericenter -48.7261
		MeanAnomaly     -20.776
	}
}

DwarfMoon	"Cantonica System 4.S82"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.85167e-013
	Radius          1.11596
	InertiaMoment   0.396918

	Oblateness      0.249

	Obliquity       0.765289
	EqAscendNode    113.94
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.380 0.294)

	Surface
	{
		SurfStyle       0.416986
		OceanStyle      0.92907
		Randomize      (0.297, -0.313, -0.737)
		colorDistMagn   0.953393
		colorDistFreq   0.000132632
		detailScale     30.4731
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0145583
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.678363
		terraceProb     0.453156
		erosion         0
		montesMagn      0.376528
		montesFreq      3.52221
		montesSpiky     0.966614
		montesFraction  0.574705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00297413
		hillsFraction   0.480036
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212447
		craterFreq      0.260674
		craterDensity   0.82103
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431104
		volcanoTemp     1388.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.152, 0.117, 0.000)
		colorShelf     (0.228, 0.161, 0.125, 0.000)
		colorBeach     (0.241, 0.171, 0.132, 0.000)
		colorDesert    (0.255, 0.180, 0.140, 0.000)
		colorLowland   (0.268, 0.190, 0.147, 0.000)
		colorUpland    (0.282, 0.199, 0.154, 0.000)
		colorRock      (0.295, 0.209, 0.162, 0.000)
		colorSnow      (0.308, 0.218, 0.169, 1.000)
		BumpHeight      1.00436
		BumpOffset      0.200873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00120354
		Period          0.000907935
		Eccentricity    0
		Inclination     0.765289
		AscendingNode   113.94
		ArgOfPericenter 43.7432
		MeanAnomaly     153.168
	}
}

DwarfMoon	"Cantonica System 4.S83"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            6.86575e-013
	Radius          0.646514
	InertiaMoment   0.398566

	Oblateness      0.057635

	Obliquity       -0.137301
	EqAscendNode    168.563
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.594 0.590)

	Surface
	{
		SurfStyle       0.396341
		OceanStyle      0.024034
		Randomize      (-0.144, 0.423, -0.584)
		colorDistMagn   0.0745732
		colorDistFreq   0.0002721
		detailScale     17.6541
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550505
		terraceProb     0.278722
		erosion         0
		montesMagn      0.54936
		montesFreq      3.36862
		montesSpiky     0.999391
		montesFraction  0.6708
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000893691
		hillsFraction   0.505267
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229152
		craterFreq      0.165446
		craterDensity   0.849125
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4989
		volcanoTemp     1374.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.238, 0.236, 0.000)
		colorShelf     (0.253, 0.253, 0.251, 0.000)
		colorBeach     (0.268, 0.267, 0.265, 0.000)
		colorDesert    (0.283, 0.282, 0.280, 0.000)
		colorLowland   (0.298, 0.297, 0.295, 0.000)
		colorUpland    (0.313, 0.312, 0.310, 0.000)
		colorRock      (0.328, 0.327, 0.324, 0.000)
		colorSnow      (0.343, 0.342, 0.339, 1.000)
		BumpHeight      0.581863
		BumpOffset      0.116373
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00121321
		Period          0.000918899
		Eccentricity    0
		Inclination     -0.137301
		AscendingNode   168.563
		ArgOfPericenter 88.3382
		MeanAnomaly     -149.506
	}
}

DwarfMoon	"Cantonica System 4.S84"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.70268e-013
	Radius          1.25865
	InertiaMoment   0.399553

	Oblateness      0.249

	Obliquity       -0.944295
	EqAscendNode    -173.719
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.406 0.403)

	Surface
	{
		SurfStyle       0.819433
		OceanStyle      0.517395
		Randomize      (0.645, 0.800, 0.347)
		colorDistMagn   0.36637
		colorDistFreq   0.000770013
		detailScale     34.3695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00179406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653347
		terraceProb     0.15108
		erosion         0
		montesMagn      0.567609
		montesFreq      2.33303
		montesSpiky     0.93239
		montesFraction  0.705585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00359581
		hillsFraction   0.652502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24572
		craterFreq      0.192806
		craterDensity   0.825885
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491191
		volcanoTemp     1608.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.193, 0.167, 0.153, 0.000)
		colorDesert    (0.210, 0.179, 0.149, 0.000)
		colorLowland   (0.230, 0.191, 0.169, 0.000)
		colorUpland    (0.255, 0.232, 0.206, 0.000)
		colorRock      (0.275, 0.252, 0.222, 0.000)
		colorSnow      (0.300, 0.268, 0.234, 1.000)
		BumpHeight      1.13278
		BumpOffset      0.226557
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00121725
		Period          0.000923498
		Eccentricity    0
		Inclination     -0.944295
		AscendingNode   -173.719
		ArgOfPericenter 13.4294
		MeanAnomaly     -128.713
	}
}

DwarfMoon	"Cantonica System 4.S85"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.37104e-012
	Radius          0.938562
	InertiaMoment   0.397276

	Oblateness      0.085762

	Obliquity       -1.28393
	EqAscendNode    -143.96
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.701 0.699)

	Surface
	{
		SurfStyle       0.43291
		OceanStyle      0.976345
		Randomize      (-0.576, -0.807, -0.636)
		colorDistMagn   0.134716
		colorDistFreq   0.000699489
		detailScale     25.629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.013862
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690578
		terraceProb     0.442631
		erosion         0
		montesMagn      0.620722
		montesFreq      2.75911
		montesSpiky     0.888835
		montesFraction  0.393097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00177097
		hillsFraction   0.687207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223512
		craterFreq      0.183426
		craterDensity   0.783536
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.397615
		volcanoTemp     1477.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.280, 0.280, 0.000)
		colorShelf     (0.300, 0.298, 0.297, 0.000)
		colorBeach     (0.318, 0.315, 0.315, 0.000)
		colorDesert    (0.336, 0.333, 0.332, 0.000)
		colorLowland   (0.353, 0.350, 0.350, 0.000)
		colorUpland    (0.371, 0.368, 0.367, 0.000)
		colorRock      (0.389, 0.386, 0.384, 0.000)
		colorSnow      (0.406, 0.403, 0.402, 1.000)
		BumpHeight      0.844706
		BumpOffset      0.168941
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0012231
		Period          0.000930165
		Eccentricity    0
		Inclination     -1.28393
		AscendingNode   -143.96
		ArgOfPericenter 131.745
		MeanAnomaly     -60.9471
	}
}

DwarfMoon	"Cantonica System 4.S86"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.93956e-012
	Radius          1.78145
	InertiaMoment   0.398723

	Oblateness      0.249

	Obliquity       0.301777
	EqAscendNode    33.597
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.766 0.765)

	Surface
	{
		SurfStyle       0.44408
		OceanStyle      0.420632
		Randomize      (-0.223, 0.841, -0.197)
		colorDistMagn   0.725108
		colorDistFreq   0.00170869
		detailScale     48.6454
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0100838
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6835
		terraceProb     0.110122
		erosion         0
		montesMagn      0.469873
		montesFreq      3.1781
		montesSpiky     0.892767
		montesFraction  0.729264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00673364
		hillsFraction   0.691576
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254204
		craterFreq      0.215947
		craterDensity   1.03013
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.580147
		volcanoTemp     1813.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.306, 0.000)
		colorShelf     (0.326, 0.325, 0.325, 0.000)
		colorBeach     (0.345, 0.344, 0.344, 0.000)
		colorDesert    (0.364, 0.364, 0.363, 0.000)
		colorLowland   (0.384, 0.383, 0.382, 0.000)
		colorUpland    (0.403, 0.402, 0.401, 0.000)
		colorRock      (0.422, 0.421, 0.420, 0.000)
		colorSnow      (0.441, 0.440, 0.440, 1.000)
		BumpHeight      1.6033
		BumpOffset      0.320661
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00122905
		Period          0.000936958
		Eccentricity    0
		Inclination     0.301777
		AscendingNode   33.597
		ArgOfPericenter -113.387
		MeanAnomaly     44.7685
	}
}

DwarfMoon	"Cantonica System 4.S87"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.75048e-012
	Radius          1.03568
	InertiaMoment   0.399681

	Oblateness      0.0569681

	Obliquity       -1.02944
	EqAscendNode    -45.5336
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.841 0.792 0.729)

	Surface
	{
		SurfStyle       0.335468
		OceanStyle      0.299227
		Randomize      (0.690, -0.352, -0.315)
		colorDistMagn   0.806978
		colorDistFreq   0.000383253
		detailScale     28.2809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0331285
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55891
		terraceProb     0.345129
		erosion         0
		montesMagn      0.622461
		montesFreq      3.82809
		montesSpiky     0.902197
		montesFraction  0.583876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00347797
		hillsFraction   0.630926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231421
		craterFreq      0.20723
		craterDensity   1.04269
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558236
		volcanoTemp     1522.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.336, 0.317, 0.291, 0.000)
		colorShelf     (0.357, 0.337, 0.310, 0.000)
		colorBeach     (0.379, 0.356, 0.328, 0.000)
		colorDesert    (0.400, 0.376, 0.346, 0.000)
		colorLowland   (0.421, 0.396, 0.364, 0.000)
		colorUpland    (0.442, 0.416, 0.383, 0.000)
		colorRock      (0.463, 0.436, 0.401, 0.000)
		colorSnow      (0.484, 0.455, 0.419, 1.000)
		BumpHeight      0.932109
		BumpOffset      0.186422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00123017
		Period          0.000938235
		Eccentricity    0
		Inclination     -1.02944
		AscendingNode   -45.5336
		ArgOfPericenter -128.862
		MeanAnomaly     148.464
	}
}

DwarfMoon	"Cantonica System 4.S88"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.91519e-012
	Radius          2.04269
	InertiaMoment   0.397563

	Oblateness      0.249

	Obliquity       -0.5764
	EqAscendNode    -30.2028
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.415 0.412 0.410)

	Surface
	{
		SurfStyle       0.465816
		OceanStyle      0.95492
		Randomize      (0.118, -0.470, -0.310)
		colorDistMagn   0.567462
		colorDistFreq   0.00161928
		detailScale     55.779
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0194232
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631872
		terraceProb     0.29011
		erosion         0
		montesMagn      0.62137
		montesFreq      3.04389
		montesSpiky     0.898839
		montesFraction  0.790723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0107195
		hillsFraction   0.618798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.28234
		craterFreq      0.203603
		craterDensity   0.964259
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531313
		volcanoTemp     1458.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.165, 0.164, 0.000)
		colorShelf     (0.176, 0.175, 0.174, 0.000)
		colorBeach     (0.187, 0.186, 0.184, 0.000)
		colorDesert    (0.197, 0.196, 0.195, 0.000)
		colorLowland   (0.208, 0.206, 0.205, 0.000)
		colorUpland    (0.218, 0.217, 0.215, 0.000)
		colorRock      (0.228, 0.227, 0.225, 0.000)
		colorSnow      (0.239, 0.237, 0.235, 1.000)
		BumpHeight      1.83842
		BumpOffset      0.367684
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00123448
		Period          0.000943175
		Eccentricity    0
		Inclination     -0.5764
		AscendingNode   -30.2028
		ArgOfPericenter -153.206
		MeanAnomaly     36.9778
	}
}

DwarfMoon	"Cantonica System 4.S89"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.60225e-012
	Radius          1.522
	InertiaMoment   0.398873

	Oblateness      0.0872805

	Obliquity       1.18967
	EqAscendNode    154.68
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.783 0.780)

	Surface
	{
		SurfStyle       0.601024
		OceanStyle      0.0128057
		Randomize      (0.862, 0.435, -0.685)
		colorDistMagn   0.286137
		colorDistFreq   0.00122079
		detailScale     41.5606
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00910213
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45418
		terraceProb     0.114791
		erosion         0
		montesMagn      0.432917
		montesFreq      3.16721
		montesSpiky     0.839453
		montesFraction  0.458921
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00345557
		hillsFraction   0.746795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222318
		craterFreq      0.245422
		craterDensity   0.914525
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524866
		volcanoTemp     1637.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.266, 0.218, 0.000)
		colorShelf     (0.314, 0.274, 0.249, 0.000)
		colorBeach     (0.369, 0.321, 0.296, 0.000)
		colorDesert    (0.400, 0.345, 0.288, 0.000)
		colorLowland   (0.440, 0.368, 0.327, 0.000)
		colorUpland    (0.487, 0.446, 0.398, 0.000)
		colorRock      (0.526, 0.486, 0.429, 0.000)
		colorSnow      (0.573, 0.517, 0.452, 1.000)
		BumpHeight      1.3698
		BumpOffset      0.273959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00123586
		Period          0.000944752
		Eccentricity    0
		Inclination     1.18967
		AscendingNode   154.68
		ArgOfPericenter -70.4691
		MeanAnomaly     -14.178
	}
}

DwarfMoon	"Cantonica System 4.S90"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.07103e-012
	Radius          2.88252
	InertiaMoment   0.399806

	Oblateness      0.249

	Obliquity       -0.802779
	EqAscendNode    80.2025
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.560 0.461)

	Surface
	{
		SurfStyle       0.199112
		OceanStyle      0.0296474
		Randomize      (0.850, -0.186, -0.935)
		colorDistMagn   0.342845
		colorDistFreq   0.00305888
		detailScale     78.712
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0214331
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390419
		terraceProb     0.31985
		erosion         0
		montesMagn      0.523667
		montesFreq      2.87287
		montesSpiky     0.983925
		montesFraction  0.581972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0272125
		hillsFraction   0.502562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2479
		craterFreq      0.235146
		craterDensity   0.888093
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.361689
		volcanoTemp     1369.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.224, 0.184, 0.000)
		colorShelf     (0.283, 0.238, 0.196, 0.000)
		colorBeach     (0.299, 0.252, 0.207, 0.000)
		colorDesert    (0.316, 0.266, 0.219, 0.000)
		colorLowland   (0.332, 0.280, 0.230, 0.000)
		colorUpland    (0.349, 0.294, 0.242, 0.000)
		colorRock      (0.366, 0.308, 0.254, 0.000)
		colorSnow      (0.382, 0.322, 0.265, 1.000)
		BumpHeight      2.59427
		BumpOffset      0.518853
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00124077
		Period          0.000950393
		Eccentricity    0
		Inclination     -0.802779
		AscendingNode   80.2025
		ArgOfPericenter -146.716
		MeanAnomaly     66.3591
	}
}

DwarfMoon	"Cantonica System 4.S91"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.17283e-011
	Radius          1.69364
	InertiaMoment   0.397807

	Oblateness      0.056123

	Obliquity       1.31313
	EqAscendNode    24.3113
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.623 0.571)

	Surface
	{
		SurfStyle       0.25701
		OceanStyle      0.151726
		Randomize      (-0.188, 0.797, -0.063)
		colorDistMagn   0.85392
		colorDistFreq   0.00158828
		detailScale     46.2477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0447937
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714665
		terraceProb     0.398575
		erosion         0
		montesMagn      0.614936
		montesFreq      2.33463
		montesSpiky     0.941293
		montesFraction  0.776854
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00732531
		hillsFraction   0.860493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223559
		craterFreq      0.263171
		craterDensity   0.984694
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447695
		volcanoTemp     1658.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.249, 0.228, 0.000)
		colorShelf     (0.324, 0.265, 0.243, 0.000)
		colorBeach     (0.343, 0.280, 0.257, 0.000)
		colorDesert    (0.362, 0.296, 0.271, 0.000)
		colorLowland   (0.382, 0.312, 0.285, 0.000)
		colorUpland    (0.401, 0.327, 0.300, 0.000)
		colorRock      (0.420, 0.343, 0.314, 0.000)
		colorSnow      (0.439, 0.358, 0.328, 1.000)
		BumpHeight      1.52428
		BumpOffset      0.304855
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00124384
		Period          0.000953927
		Eccentricity    0
		Inclination     1.31313
		AscendingNode   24.3113
		ArgOfPericenter 24.3897
		MeanAnomaly     -9.09193
	}
}

DwarfMoon	"Cantonica System 4.S92"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.72258e-011
	Radius          3.38881
	InertiaMoment   0.399016

	Oblateness      0.249

	Obliquity       1.27155
	EqAscendNode    144.921
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.533 0.524 0.521)

	Surface
	{
		SurfStyle       0.328315
		OceanStyle      0.234067
		Randomize      (-0.486, -0.288, 0.898)
		colorDistMagn   0.513387
		colorDistFreq   0.00761662
		detailScale     92.5371
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0133763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362842
		terraceProb     0.25465
		erosion         0
		montesMagn      0.501458
		montesFreq      3.5453
		montesSpiky     0.982885
		montesFraction  0.477119
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0277487
		hillsFraction   0.611278
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262703
		craterFreq      0.237673
		craterDensity   0.767933
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502768
		volcanoTemp     1449.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.209, 0.208, 0.000)
		colorShelf     (0.226, 0.223, 0.221, 0.000)
		colorBeach     (0.240, 0.236, 0.234, 0.000)
		colorDesert    (0.253, 0.249, 0.247, 0.000)
		colorLowland   (0.266, 0.262, 0.260, 0.000)
		colorUpland    (0.280, 0.275, 0.273, 0.000)
		colorRock      (0.293, 0.288, 0.286, 0.000)
		colorSnow      (0.306, 0.301, 0.299, 1.000)
		BumpHeight      3.04993
		BumpOffset      0.609986
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00124841
		Period          0.000959183
		Eccentricity    0
		Inclination     1.27155
		AscendingNode   144.921
		ArgOfPericenter -9.01973
		MeanAnomaly     91.8188
	}
}

DwarfMoon	"Cantonica System 4.S93"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.5635e-011
	Radius          2.5677
	InertiaMoment   0.399932

	Oblateness      0.0888323

	Obliquity       -0.304698
	EqAscendNode    -11.422
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.740 0.736)

	Surface
	{
		SurfStyle       0.844439
		OceanStyle      0.845993
		Randomize      (0.315, -0.946, 0.423)
		colorDistMagn   0.20682
		colorDistFreq   0.000319633
		detailScale     70.1153
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0105855
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633836
		terraceProb     0.306213
		erosion         0
		montesMagn      0.368411
		montesFreq      3.27273
		montesSpiky     0.958757
		montesFraction  0.17675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0139246
		hillsFraction   0.658042
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232298
		craterFreq      0.249612
		craterDensity   0.823533
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551314
		volcanoTemp     1528.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.252, 0.206, 0.000)
		colorShelf     (0.297, 0.259, 0.236, 0.000)
		colorBeach     (0.350, 0.303, 0.280, 0.000)
		colorDesert    (0.379, 0.326, 0.272, 0.000)
		colorLowland   (0.416, 0.348, 0.309, 0.000)
		colorUpland    (0.461, 0.422, 0.376, 0.000)
		colorRock      (0.498, 0.459, 0.405, 0.000)
		colorSnow      (0.543, 0.488, 0.427, 1.000)
		BumpHeight      2.31093
		BumpOffset      0.462186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00125016
		Period          0.000961201
		Eccentricity    0
		Inclination     -0.304698
		AscendingNode   -11.422
		ArgOfPericenter 105.516
		MeanAnomaly     -131.811
	}
}

DwarfMoon	"Cantonica System 4.S94"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.87694e-011
	Radius          4.89375
	InertiaMoment   0.398022

	Oblateness      0.249

	Obliquity       -1.02883
	EqAscendNode    -113.392
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.750 0.746)

	Surface
	{
		SurfStyle       0.200215
		OceanStyle      0.756865
		Randomize      (0.023, 0.397, -0.787)
		colorDistMagn   0.102087
		colorDistFreq   0.00314481
		detailScale     133.632
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0197186
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555944
		terraceProb     0.191514
		erosion         0
		montesMagn      0.569368
		montesFreq      2.41344
		montesSpiky     0.881188
		montesFraction  0.591878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0340062
		hillsFraction   0.528065
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249319
		craterFreq      0.25583
		craterDensity   0.86997
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.588642
		volcanoTemp     1324.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.300, 0.299, 0.000)
		colorShelf     (0.320, 0.319, 0.317, 0.000)
		colorBeach     (0.338, 0.337, 0.336, 0.000)
		colorDesert    (0.357, 0.356, 0.355, 0.000)
		colorLowland   (0.376, 0.375, 0.373, 0.000)
		colorUpland    (0.395, 0.394, 0.392, 0.000)
		colorRock      (0.414, 0.412, 0.411, 0.000)
		colorSnow      (0.432, 0.431, 0.429, 1.000)
		BumpHeight      4.40438
		BumpOffset      0.880875
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00125568
		Period          0.000967575
		Eccentricity    0
		Inclination     -1.02883
		AscendingNode   -113.392
		ArgOfPericenter -96.4335
		MeanAnomaly     9.83664
	}
}

DwarfMoon	"Cantonica System 4.S95"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.98073e-011
	Radius          2.93947
	InertiaMoment   0.399155

	Oblateness      0.054984

	Obliquity       1.19857
	EqAscendNode    45.3939
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.531 0.526)

	Surface
	{
		SurfStyle       0.888806
		OceanStyle      0.797206
		Randomize      (0.037, 0.411, -0.600)
		colorDistMagn   0.922355
		colorDistFreq   0.00610127
		detailScale     80.2672
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0385887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434226
		terraceProb     0.257154
		erosion         0
		montesMagn      0.48848
		montesFreq      3.29686
		montesSpiky     0.886359
		montesFraction  0.530437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0113526
		hillsFraction   0.665697
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227975
		craterFreq      0.232645
		craterDensity   1.01607
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.430989
		volcanoTemp     1702.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.186, 0.210, 0.050)
		colorShelf     (0.215, 0.218, 0.242, 0.040)
		colorBeach     (0.248, 0.250, 0.273, 0.030)
		colorDesert    (0.280, 0.282, 0.310, 0.020)
		colorLowland   (0.312, 0.313, 0.342, 0.030)
		colorUpland    (0.345, 0.345, 0.373, 0.050)
		colorRock      (0.377, 0.377, 0.415, 0.020)
		colorSnow      (0.377, 0.377, 0.415, 1.000)
		BumpHeight      2.64552
		BumpOffset      0.529105
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00126495
		Period          0.000978309
		Eccentricity    0
		Inclination     1.19857
		AscendingNode   45.3939
		ArgOfPericenter -173.119
		MeanAnomaly     90.8816
	}
}

DwarfMoon	"Cantonica System 4.S96"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.45551e-011
	Radius          6.03613
	InertiaMoment   0.39544

	Oblateness      0.249

	Obliquity       -0.694233
	EqAscendNode    -69.0372
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.713 0.711)

	Surface
	{
		SurfStyle       0.164848
		OceanStyle      0.393704
		Randomize      (0.778, -0.095, 0.415)
		colorDistMagn   0.186417
		colorDistFreq   0.00465186
		detailScale     164.827
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0199649
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538183
		terraceProb     0.237818
		erosion         0
		montesMagn      0.482884
		montesFreq      2.27078
		montesSpiky     0.992762
		montesFraction  0.62421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.111125
		hillsFraction   0.67916
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219823
		craterFreq      0.202737
		craterDensity   0.92686
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50001
		volcanoTemp     1517.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.284, 0.000)
		colorShelf     (0.303, 0.303, 0.302, 0.000)
		colorBeach     (0.321, 0.321, 0.320, 0.000)
		colorDesert    (0.339, 0.339, 0.338, 0.000)
		colorLowland   (0.357, 0.356, 0.355, 0.000)
		colorUpland    (0.375, 0.374, 0.373, 0.000)
		colorRock      (0.393, 0.392, 0.391, 0.000)
		colorSnow      (0.411, 0.410, 0.409, 1.000)
		BumpHeight      5.43252
		BumpOffset      1.0865
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00126623
		Period          0.00097979
		Eccentricity    0
		Inclination     -0.694233
		AscendingNode   -69.0372
		ArgOfPericenter 75.3833
		MeanAnomaly     69.2887
	}
}

DwarfMoon	"Cantonica System 4.S97"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.54168e-010
	Radius          4.75702
	InertiaMoment   0.398217

	Oblateness      0.0892693

	Obliquity       1.22392
	EqAscendNode    20.858
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.627 0.623 0.620)

	Surface
	{
		SurfStyle       0.273901
		OceanStyle      0.23479
		Randomize      (-0.805, -0.906, 0.991)
		colorDistMagn   0.473148
		colorDistFreq   0.0172966
		detailScale     129.898
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0420042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485672
		terraceProb     0.289219
		erosion         0
		montesMagn      0.571648
		montesFreq      3.69437
		montesSpiky     0.948033
		montesFraction  0.380305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0428331
		hillsFraction   0.653433
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255142
		craterFreq      0.217174
		craterDensity   0.952904
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536688
		volcanoTemp     1771.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.249, 0.248, 0.000)
		colorShelf     (0.266, 0.265, 0.263, 0.000)
		colorBeach     (0.282, 0.280, 0.279, 0.000)
		colorDesert    (0.298, 0.296, 0.294, 0.000)
		colorLowland   (0.313, 0.311, 0.310, 0.000)
		colorUpland    (0.329, 0.327, 0.325, 0.000)
		colorRock      (0.345, 0.343, 0.341, 0.000)
		colorSnow      (0.360, 0.358, 0.356, 1.000)
		BumpHeight      4.28132
		BumpOffset      0.856264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00126881
		Period          0.000982785
		Eccentricity    0
		Inclination     1.22392
		AscendingNode   20.858
		ArgOfPericenter 171.474
		MeanAnomaly     3.34739
	}
}

DwarfMoon	"Cantonica System 4.S98"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.61454e-010
	Radius          9.30567
	InertiaMoment   0.39929

	Oblateness      0.249

	Obliquity       0.981014
	EqAscendNode    53.4917
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.560 0.555 0.553)

	Surface
	{
		SurfStyle       0.756146
		OceanStyle      0.871364
		Randomize      (-0.870, -0.101, 0.212)
		colorDistMagn   0.870163
		colorDistFreq   0.0749531
		detailScale     254.107
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0305755
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600507
		terraceProb     0.260474
		erosion         0
		montesMagn      0.645531
		montesFreq      2.35435
		montesSpiky     0.979042
		montesFraction  0.673642
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.236195
		hillsFraction   0.600787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221954
		craterFreq      0.185113
		craterDensity   0.88422
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455686
		volcanoTemp     1541.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.189, 0.155, 0.000)
		colorShelf     (0.224, 0.194, 0.177, 0.000)
		colorBeach     (0.263, 0.228, 0.210, 0.000)
		colorDesert    (0.286, 0.244, 0.205, 0.000)
		colorLowland   (0.314, 0.261, 0.232, 0.000)
		colorUpland    (0.347, 0.317, 0.282, 0.000)
		colorRock      (0.375, 0.344, 0.304, 0.000)
		colorSnow      (0.409, 0.367, 0.321, 1.000)
		BumpHeight      8.3751
		BumpOffset      1.67502
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00127771
		Period          0.00099315
		Eccentricity    0
		Inclination     0.981014
		AscendingNode   53.4917
		ArgOfPericenter -134.758
		MeanAnomaly     -42.4992
	}
}

DwarfMoon	"Cantonica System 4.S99"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.6688e-010
	Radius          5.87952
	InertiaMoment   0.396407

	Oblateness      0.0535693

	Obliquity       -0.65496
	EqAscendNode    -45.6579
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.735 0.732)

	Surface
	{
		SurfStyle       0.0635715
		OceanStyle      0.625296
		Randomize      (0.918, -0.998, -0.015)
		colorDistMagn   0.909802
		colorDistFreq   0.0210087
		detailScale     160.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0210686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551257
		terraceProb     0.272836
		erosion         0
		montesMagn      0.34666
		montesFreq      3.4863
		montesSpiky     0.918218
		montesFraction  0.596945
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0734296
		hillsFraction   0.574871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243265
		craterFreq      0.252825
		craterDensity   0.958119
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503368
		volcanoTemp     1561.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.293, 0.000)
		colorShelf     (0.314, 0.313, 0.311, 0.000)
		colorBeach     (0.332, 0.331, 0.329, 0.000)
		colorDesert    (0.351, 0.349, 0.348, 0.000)
		colorLowland   (0.369, 0.368, 0.366, 0.000)
		colorUpland    (0.388, 0.386, 0.384, 0.000)
		colorRock      (0.406, 0.404, 0.403, 0.000)
		colorSnow      (0.425, 0.423, 0.421, 1.000)
		BumpHeight      5.29157
		BumpOffset      1.05831
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00128217
		Period          0.000998351
		Eccentricity    0
		Inclination     -0.65496
		AscendingNode   -45.6579
		ArgOfPericenter -117.033
		MeanAnomaly     -110.771
	}
}

DwarfMoon	"Cantonica System 4.S100"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.94323e-010
	Radius          12.871
	InertiaMoment   0.398395

	Oblateness      0.249

	Obliquity       0.134451
	EqAscendNode    40.3485
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.729 0.726)

	Surface
	{
		SurfStyle       0.723817
		OceanStyle      0.0735778
		Randomize      (-0.525, -0.359, 0.105)
		colorDistMagn   0.936536
		colorDistFreq   0.124333
		detailScale     351.464
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00440806
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63419
		terraceProb     0.226764
		erosion         0
		montesMagn      0.431911
		montesFreq      3.97963
		montesSpiky     0.900462
		montesFraction  0.880311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.404311
		hillsFraction   0.371848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263205
		craterFreq      0.246915
		craterDensity   0.910237
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490405
		volcanoTemp     1555.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.248, 0.203, 0.000)
		colorShelf     (0.292, 0.255, 0.232, 0.000)
		colorBeach     (0.343, 0.299, 0.276, 0.000)
		colorDesert    (0.373, 0.321, 0.269, 0.000)
		colorLowland   (0.409, 0.342, 0.305, 0.000)
		colorUpland    (0.453, 0.415, 0.370, 0.000)
		colorRock      (0.490, 0.452, 0.399, 0.000)
		colorSnow      (0.534, 0.481, 0.421, 1.000)
		BumpHeight      11.5839
		BumpOffset      2.31678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00128661
		Period          0.00100355
		Eccentricity    0
		Inclination     0.134451
		AscendingNode   40.3485
		ArgOfPericenter 25.0147
		MeanAnomaly     -83.5949
	}
}

DwarfMoon	"Cantonica System 4.S101"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.89441e-009
	Radius          11.2245
	InertiaMoment   0.399421

	Oblateness      0.0904269

	Obliquity       0.582553
	EqAscendNode    108.379
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.497 0.492 0.490)

	Surface
	{
		SurfStyle       0.0791809
		OceanStyle      0.822878
		Randomize      (-0.366, 0.020, -0.806)
		colorDistMagn   0.263707
		colorDistFreq   0.061436
		detailScale     306.503
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0118952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259064
		terraceProb     0.17875
		erosion         0
		montesMagn      0.236197
		montesFreq      2.82208
		montesSpiky     0.931115
		montesFraction  0.393178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.294384
		hillsFraction   0.645345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232231
		craterFreq      0.191491
		craterDensity   0.873927
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.608513
		volcanoTemp     1409.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.197, 0.196, 0.000)
		colorShelf     (0.211, 0.209, 0.208, 0.000)
		colorBeach     (0.224, 0.222, 0.220, 0.000)
		colorDesert    (0.236, 0.234, 0.233, 0.000)
		colorLowland   (0.248, 0.246, 0.245, 0.000)
		colorUpland    (0.261, 0.258, 0.257, 0.000)
		colorRock      (0.273, 0.271, 0.269, 0.000)
		colorSnow      (0.286, 0.283, 0.281, 1.000)
		BumpHeight      10.102
		BumpOffset      2.02041
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00129376
		Period          0.00101192
		Eccentricity    0
		Inclination     0.582553
		AscendingNode   108.379
		ArgOfPericenter -11.974
		MeanAnomaly     150.428
	}
}

DwarfMoon	"Cantonica System 4.S102"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.53216e-016
	Radius          0.11255
	InertiaMoment   0.396909

	Oblateness      0.249

	Obliquity       0.940685
	EqAscendNode    -133.142
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.513 0.393)

	Surface
	{
		SurfStyle       0.62406
		OceanStyle      0.305389
		Randomize      (-0.533, -0.097, -0.256)
		colorDistMagn   0.966861
		colorDistFreq   5.48147e-006
		detailScale     3.07336
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0130561
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327016
		terraceProb     0.107971
		erosion         0
		montesMagn      0.443806
		montesFreq      2.88556
		montesSpiky     0.877111
		montesFraction  0.372344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.92575e-005
		hillsFraction   0.638327
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237035
		craterFreq      0.239928
		craterDensity   0.981687
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44545
		volcanoTemp     1759.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.174, 0.110, 0.000)
		colorShelf     (0.231, 0.180, 0.126, 0.000)
		colorBeach     (0.272, 0.210, 0.150, 0.000)
		colorDesert    (0.295, 0.226, 0.146, 0.000)
		colorLowland   (0.324, 0.241, 0.165, 0.000)
		colorUpland    (0.358, 0.292, 0.201, 0.000)
		colorRock      (0.387, 0.318, 0.216, 0.000)
		colorSnow      (0.422, 0.339, 0.228, 1.000)
		BumpHeight      0.101295
		BumpOffset      0.020259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00129789
		Period          0.00101677
		Eccentricity    0
		Inclination     0.940685
		AscendingNode   -133.142
		ArgOfPericenter -50.5228
		MeanAnomaly     73.3361
	}
}

DwarfMoon	"Cantonica System 4.S103"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.82759e-016
	Radius          0.0759778
	InertiaMoment   0.398562

	Oblateness      0.0530412

	Obliquity       0.49829
	EqAscendNode    129.842
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.802 0.719 0.672)

	Surface
	{
		SurfStyle       0.7485
		OceanStyle      0.553157
		Randomize      (-0.563, 0.208, -0.307)
		colorDistMagn   0.618468
		colorDistFreq   1.2374e-006
		detailScale     2.0747
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00737284
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258936
		terraceProb     0.382776
		erosion         0
		montesMagn      0.606129
		montesFreq      3.05212
		montesSpiky     0.977413
		montesFraction  0.351291
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1326e-005
		hillsFraction   0.463184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267257
		craterFreq      0.189632
		craterDensity   0.838473
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462527
		volcanoTemp     1811.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.244, 0.188, 0.000)
		colorShelf     (0.321, 0.252, 0.215, 0.000)
		colorBeach     (0.377, 0.295, 0.256, 0.000)
		colorDesert    (0.409, 0.316, 0.249, 0.000)
		colorLowland   (0.449, 0.338, 0.282, 0.000)
		colorUpland    (0.497, 0.410, 0.343, 0.000)
		colorRock      (0.537, 0.446, 0.370, 0.000)
		colorSnow      (0.586, 0.474, 0.390, 1.000)
		BumpHeight      0.06838
		BumpOffset      0.013676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00130061
		Period          0.00101997
		Eccentricity    0
		Inclination     0.49829
		AscendingNode   129.842
		ArgOfPericenter 60.9436
		MeanAnomaly     -31.2137
	}
}

DwarfMoon	"Cantonica System 4.S104"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.91228e-015
	Radius          0.167042
	InertiaMoment   0.39955

	Oblateness      0.249

	Obliquity       0.580989
	EqAscendNode    -112.766
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.471 0.465 0.461)

	Surface
	{
		SurfStyle       0.412137
		OceanStyle      0.792452
		Randomize      (0.808, 0.066, -0.790)
		colorDistMagn   0.910144
		colorDistFreq   1.3673e-005
		detailScale     4.56136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0112303
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432452
		terraceProb     0.275995
		erosion         0
		montesMagn      0.54706
		montesFreq      3.08858
		montesSpiky     0.933884
		montesFraction  0.168731
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.0315e-005
		hillsFraction   0.65002
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237192
		craterFreq      0.26875
		craterDensity   0.78351
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.580931
		volcanoTemp     1473.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.186, 0.184, 0.000)
		colorShelf     (0.200, 0.198, 0.196, 0.000)
		colorBeach     (0.212, 0.209, 0.207, 0.000)
		colorDesert    (0.224, 0.221, 0.219, 0.000)
		colorLowland   (0.235, 0.233, 0.230, 0.000)
		colorUpland    (0.247, 0.244, 0.242, 0.000)
		colorRock      (0.259, 0.256, 0.253, 0.000)
		colorSnow      (0.271, 0.267, 0.265, 1.000)
		BumpHeight      0.150338
		BumpOffset      0.0300676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0013064
		Period          0.00102678
		Eccentricity    0
		Inclination     0.580989
		AscendingNode   -112.766
		ArgOfPericenter 74.0592
		MeanAnomaly     139.479
	}
}

DwarfMoon	"Cantonica System 4.S105"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.45339e-015
	Radius          0.141021
	InertiaMoment   0.397269

	Oblateness      0.0931428

	Obliquity       0.894266
	EqAscendNode    28.0003
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.606 0.556)

	Surface
	{
		SurfStyle       0.707609
		OceanStyle      0.178352
		Randomize      (-0.537, -0.803, -0.828)
		colorDistMagn   0.24044
		colorDistFreq   1.05055e-005
		detailScale     3.85081
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0302837
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395384
		terraceProb     0.311739
		erosion         0
		montesMagn      0.358488
		montesFreq      3.48241
		montesSpiky     0.968921
		montesFraction  0.588175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.37062e-005
		hillsFraction   0.648465
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233388
		craterFreq      0.248256
		craterDensity   0.952253
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514807
		volcanoTemp     1608.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.206, 0.156, 0.000)
		colorShelf     (0.268, 0.212, 0.178, 0.000)
		colorBeach     (0.315, 0.249, 0.211, 0.000)
		colorDesert    (0.342, 0.267, 0.206, 0.000)
		colorLowland   (0.376, 0.285, 0.234, 0.000)
		colorUpland    (0.416, 0.346, 0.284, 0.000)
		colorRock      (0.449, 0.376, 0.306, 0.000)
		colorSnow      (0.490, 0.400, 0.323, 1.000)
		BumpHeight      0.126919
		BumpOffset      0.0253838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.001314
		Period          0.00103576
		Eccentricity    0
		Inclination     0.894266
		AscendingNode   28.0003
		ArgOfPericenter -9.54019
		MeanAnomaly     -69.3448
	}
}

DwarfMoon	"Cantonica System 4.S106"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.90611e-015
	Radius          0.266792
	InertiaMoment   0.39872

	Oblateness      0.249

	Obliquity       1.29002
	EqAscendNode    -94.5729
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.415 0.337)

	Surface
	{
		SurfStyle       0.316699
		OceanStyle      0.991568
		Randomize      (-0.588, -0.769, 0.989)
		colorDistMagn   0.0822574
		colorDistFreq   4.75063e-005
		detailScale     7.28519
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0305384
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697663
		terraceProb     0.347018
		erosion         0
		montesMagn      0.405155
		montesFreq      3.12916
		montesSpiky     0.863743
		montesFraction  0.175418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000208055
		hillsFraction   0.363146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277421
		craterFreq      0.217029
		craterDensity   0.901233
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463548
		volcanoTemp     1920.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.166, 0.135, 0.000)
		colorShelf     (0.222, 0.177, 0.143, 0.000)
		colorBeach     (0.236, 0.187, 0.152, 0.000)
		colorDesert    (0.249, 0.197, 0.160, 0.000)
		colorLowland   (0.262, 0.208, 0.168, 0.000)
		colorUpland    (0.275, 0.218, 0.177, 0.000)
		colorRock      (0.288, 0.228, 0.185, 0.000)
		colorSnow      (0.301, 0.239, 0.194, 1.000)
		BumpHeight      0.240113
		BumpOffset      0.0480225
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00132011
		Period          0.00104299
		Eccentricity    0
		Inclination     1.29002
		AscendingNode   -94.5729
		ArgOfPericenter 16.4345
		MeanAnomaly     62.7699
	}
}

DwarfMoon	"Cantonica System 4.S107"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.69242e-015
	Radius          0.164303
	InertiaMoment   0.399678

	Oblateness      0.0516332

	Obliquity       0.153782
	EqAscendNode    -155.534
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.518 0.515)

	Surface
	{
		SurfStyle       0.173502
		OceanStyle      0.161283
		Randomize      (-0.027, -0.375, 0.897)
		colorDistMagn   0.641984
		colorDistFreq   2.37891e-005
		detailScale     4.48658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00114512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617512
		terraceProb     0.257345
		erosion         0
		montesMagn      0.636485
		montesFreq      2.91289
		montesSpiky     0.980974
		montesFraction  0.680863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.01983e-005
		hillsFraction   0.84905
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275405
		craterFreq      0.225701
		craterDensity   0.81246
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499349
		volcanoTemp     821.658
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.207, 0.206, 0.000)
		colorShelf     (0.221, 0.220, 0.219, 0.000)
		colorBeach     (0.234, 0.233, 0.232, 0.000)
		colorDesert    (0.247, 0.246, 0.244, 0.000)
		colorLowland   (0.260, 0.259, 0.257, 0.000)
		colorUpland    (0.273, 0.272, 0.270, 0.000)
		colorRock      (0.286, 0.285, 0.283, 0.000)
		colorSnow      (0.299, 0.298, 0.296, 1.000)
		BumpHeight      0.147873
		BumpOffset      0.0295746
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00132519
		Period          0.00104902
		Eccentricity    0
		Inclination     0.153782
		AscendingNode   -155.534
		ArgOfPericenter -0.419867
		MeanAnomaly     -83.0958
	}
}

DwarfMoon	"Cantonica System 4.S108"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.54025e-014
	Radius          0.337112
	InertiaMoment   0.397557

	Oblateness      0.249

	Obliquity       -0.285114
	EqAscendNode    -7.43224
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.703 0.702)

	Surface
	{
		SurfStyle       0.77674
		OceanStyle      0.30144
		Randomize      (-0.876, 0.997, 0.811)
		colorDistMagn   0.26873
		colorDistFreq   1.57039e-005
		detailScale     9.2054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00992893
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501392
		terraceProb     0.100957
		erosion         0
		montesMagn      0.385259
		montesFreq      3.31891
		montesSpiky     0.978663
		montesFraction  0.509731
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000278268
		hillsFraction   0.913767
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245891
		craterFreq      0.242062
		craterDensity   0.816759
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538175
		volcanoTemp     1678.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.239, 0.196, 0.000)
		colorShelf     (0.283, 0.246, 0.225, 0.000)
		colorBeach     (0.332, 0.288, 0.267, 0.000)
		colorDesert    (0.360, 0.310, 0.260, 0.000)
		colorLowland   (0.396, 0.331, 0.295, 0.000)
		colorUpland    (0.438, 0.401, 0.358, 0.000)
		colorRock      (0.474, 0.436, 0.386, 0.000)
		colorSnow      (0.516, 0.464, 0.407, 1.000)
		BumpHeight      0.303401
		BumpOffset      0.0606801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00132758
		Period          0.00105186
		Eccentricity    0
		Inclination     -0.285114
		AscendingNode   -7.43224
		ArgOfPericenter -141.311
		MeanAnomaly     -16.3427
	}
}

DwarfMoon	"Cantonica System 4.S109"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.38586e-014
	Radius          0.279126
	InertiaMoment   0.398869

	Oblateness      0.100423

	Obliquity       -1.149
	EqAscendNode    -7.74516
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.805 0.714 0.638)

	Surface
	{
		SurfStyle       0.524045
		OceanStyle      0.592121
		Randomize      (-0.818, -0.823, 0.801)
		colorDistMagn   0.720172
		colorDistFreq   2.11361e-005
		detailScale     7.62199
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0400057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381724
		terraceProb     0.280162
		erosion         0
		montesMagn      0.316775
		montesFreq      3.01749
		montesSpiky     0.808423
		montesFraction  0.519311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000196682
		hillsFraction   0.523369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21644
		craterFreq      0.247413
		craterDensity   0.897899
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.589715
		volcanoTemp     1740.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.243, 0.179, 0.000)
		colorShelf     (0.322, 0.250, 0.204, 0.000)
		colorBeach     (0.378, 0.293, 0.243, 0.000)
		colorDesert    (0.411, 0.314, 0.236, 0.000)
		colorLowland   (0.451, 0.335, 0.268, 0.000)
		colorUpland    (0.499, 0.407, 0.326, 0.000)
		colorRock      (0.539, 0.442, 0.351, 0.000)
		colorSnow      (0.588, 0.471, 0.370, 1.000)
		BumpHeight      0.251213
		BumpOffset      0.0502426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0013344
		Period          0.00105998
		Eccentricity    0
		Inclination     -1.149
		AscendingNode   -7.74516
		ArgOfPericenter 25.5141
		MeanAnomaly     29.8932
	}
}

DwarfMoon	"Cantonica System 4.S110"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.62035e-014
	Radius          0.49213
	InertiaMoment   0.399804

	Oblateness      0.249

	Obliquity       0.586508
	EqAscendNode    -176.478
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.426 0.423 0.420)

	Surface
	{
		SurfStyle       0.449624
		OceanStyle      0.220646
		Randomize      (-0.825, 0.662, 0.183)
		colorDistMagn   0.206084
		colorDistFreq   7.595e-005
		detailScale     13.4384
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00059802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.729514
		terraceProb     0.295761
		erosion         0
		montesMagn      0.564392
		montesFreq      2.34867
		montesSpiky     0.934575
		montesFraction  0.649492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000531914
		hillsFraction   0.864746
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249166
		craterFreq      0.264473
		craterDensity   0.776214
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.591485
		volcanoTemp     1312.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.169, 0.168, 0.000)
		colorShelf     (0.181, 0.180, 0.178, 0.000)
		colorBeach     (0.192, 0.191, 0.189, 0.000)
		colorDesert    (0.202, 0.201, 0.199, 0.000)
		colorLowland   (0.213, 0.212, 0.210, 0.000)
		colorUpland    (0.224, 0.222, 0.220, 0.000)
		colorRock      (0.234, 0.233, 0.231, 0.000)
		colorSnow      (0.245, 0.243, 0.241, 1.000)
		BumpHeight      0.442917
		BumpOffset      0.0885834
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0013377
		Period          0.00106391
		Eccentricity    0
		Inclination     0.586508
		AscendingNode   -176.478
		ArgOfPericenter -18.3034
		MeanAnomaly     174.033
	}
}

DwarfMoon	"Cantonica System 4.S111"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.40237e-014
	Radius          0.293801
	InertiaMoment   0.397802

	Oblateness      0.0500709

	Obliquity       0.367656
	EqAscendNode    -81.2694
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.606 0.600)

	Surface
	{
		SurfStyle       0.636192
		OceanStyle      0.127156
		Randomize      (0.093, 0.230, -0.744)
		colorDistMagn   0.156585
		colorDistFreq   3.50109e-005
		detailScale     8.02274
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00974107
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454573
		terraceProb     0.455267
		erosion         0
		montesMagn      0.523332
		montesFreq      2.63997
		montesSpiky     0.859756
		montesFraction  0.76853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000152625
		hillsFraction   0.75226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239378
		craterFreq      0.183583
		craterDensity   1.09572
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562046
		volcanoTemp     1460.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.206, 0.168, 0.000)
		colorShelf     (0.245, 0.212, 0.192, 0.000)
		colorBeach     (0.287, 0.249, 0.228, 0.000)
		colorDesert    (0.312, 0.267, 0.222, 0.000)
		colorLowland   (0.342, 0.285, 0.252, 0.000)
		colorUpland    (0.379, 0.346, 0.306, 0.000)
		colorRock      (0.410, 0.376, 0.330, 0.000)
		colorSnow      (0.446, 0.400, 0.348, 1.000)
		BumpHeight      0.264421
		BumpOffset      0.0528842
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00134709
		Period          0.00107513
		Eccentricity    0
		Inclination     0.367656
		AscendingNode   -81.2694
		ArgOfPericenter -129.054
		MeanAnomaly     -123.086
	}
}

DwarfMoon	"Cantonica System 4.S112"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            7.9523e-014
	Radius          0.586358
	InertiaMoment   0.399013

	Oblateness      0.249

	Obliquity       1.14736
	EqAscendNode    -83.7803
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.620 0.618)

	Surface
	{
		SurfStyle       0.815184
		OceanStyle      0.215657
		Randomize      (0.827, -0.812, 0.956)
		colorDistMagn   0.697679
		colorDistFreq   0.000123697
		detailScale     16.0115
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0298098
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631079
		terraceProb     0.230072
		erosion         0
		montesMagn      0.66906
		montesFreq      3.51097
		montesSpiky     0.973329
		montesFraction  0.555453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000765776
		hillsFraction   0.803939
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274143
		craterFreq      0.183792
		craterDensity   1.01277
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507347
		volcanoTemp     1444.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.211, 0.173, 0.000)
		colorShelf     (0.249, 0.217, 0.198, 0.000)
		colorBeach     (0.293, 0.254, 0.235, 0.000)
		colorDesert    (0.318, 0.273, 0.229, 0.000)
		colorLowland   (0.349, 0.291, 0.259, 0.000)
		colorUpland    (0.386, 0.353, 0.315, 0.000)
		colorRock      (0.418, 0.384, 0.340, 0.000)
		colorSnow      (0.455, 0.409, 0.358, 1.000)
		BumpHeight      0.527722
		BumpOffset      0.105544
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00135468
		Period          0.00108423
		Eccentricity    0
		Inclination     1.14736
		AscendingNode   -83.7803
		ArgOfPericenter 104.764
		MeanAnomaly     -75.6172
	}
}

DwarfMoon	"Cantonica System 4.S113"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.15765e-013
	Radius          0.327652
	InertiaMoment   0.399929

	Oblateness      0.0315789

	Obliquity       0.578768
	EqAscendNode    -97.433
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.487 0.485)

	Surface
	{
		SurfStyle       0.655423
		OceanStyle      0.775717
		Randomize      (0.701, 0.983, 0.203)
		colorDistMagn   0.303843
		colorDistFreq   4.89848e-005
		detailScale     8.94708
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0133272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611833
		terraceProb     0.227834
		erosion         0
		montesMagn      0.642733
		montesFreq      3.23213
		montesSpiky     0.938612
		montesFraction  0.697209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0002404
		hillsFraction   0.447393
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272562
		craterFreq      0.26829
		craterDensity   0.899426
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530039
		volcanoTemp     1695.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.166, 0.136, 0.000)
		colorShelf     (0.196, 0.171, 0.155, 0.000)
		colorBeach     (0.231, 0.200, 0.184, 0.000)
		colorDesert    (0.250, 0.214, 0.180, 0.000)
		colorLowland   (0.275, 0.229, 0.204, 0.000)
		colorUpland    (0.304, 0.278, 0.248, 0.000)
		colorRock      (0.329, 0.302, 0.267, 0.000)
		colorSnow      (0.358, 0.322, 0.281, 1.000)
		BumpHeight      0.294887
		BumpOffset      0.0589773
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00136241
		Period          0.00109353
		Eccentricity    0
		Inclination     0.578768
		AscendingNode   -97.433
		ArgOfPericenter 112.272
		MeanAnomaly     129.191
	}
}

DwarfMoon	"Cantonica System 4.S114"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.6702e-013
	Radius          0.826405
	InertiaMoment   0.398018

	Oblateness      0.249

	Obliquity       0.841456
	EqAscendNode    45.1016
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.836 0.787 0.742)

	Surface
	{
		SurfStyle       0.769107
		OceanStyle      0.347835
		Randomize      (0.845, -0.557, 0.360)
		colorDistMagn   0.897705
		colorDistFreq   0.000404337
		detailScale     22.5664
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0271224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538376
		terraceProb     0.206706
		erosion         0
		montesMagn      0.558032
		montesFreq      2.05487
		montesSpiky     0.955172
		montesFraction  0.601337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00210662
		hillsFraction   0.730118
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219459
		craterFreq      0.249273
		craterDensity   0.867345
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472466
		volcanoTemp     1144.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.268, 0.208, 0.000)
		colorShelf     (0.334, 0.275, 0.238, 0.000)
		colorBeach     (0.393, 0.323, 0.282, 0.000)
		colorDesert    (0.426, 0.346, 0.275, 0.000)
		colorLowland   (0.468, 0.370, 0.312, 0.000)
		colorUpland    (0.518, 0.448, 0.379, 0.000)
		colorRock      (0.560, 0.488, 0.408, 0.000)
		colorSnow      (0.610, 0.519, 0.431, 1.000)
		BumpHeight      0.743764
		BumpOffset      0.148753
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00136608
		Period          0.00109794
		Eccentricity    0
		Inclination     0.841456
		AscendingNode   45.1016
		ArgOfPericenter -115.858
		MeanAnomaly     -55.7564
	}
}

DwarfMoon	"Cantonica System 4.S115"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.39258e-013
	Radius          0.486695
	InertiaMoment   0.399152

	Oblateness      0.048996

	Obliquity       -0.609049
	EqAscendNode    110.498
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.697 0.692 0.689)

	Surface
	{
		SurfStyle       0.811771
		OceanStyle      0.722381
		Randomize      (-0.814, -0.202, -0.445)
		colorDistMagn   0.556625
		colorDistFreq   5.42323e-005
		detailScale     13.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0121186
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600703
		terraceProb     0.202083
		erosion         0
		montesMagn      0.331554
		montesFreq      3.372
		montesSpiky     0.86126
		montesFraction  0.704449
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00066353
		hillsFraction   0.602066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257009
		craterFreq      0.235467
		craterDensity   0.94848
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492716
		volcanoTemp     1320.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.235, 0.193, 0.000)
		colorShelf     (0.279, 0.242, 0.220, 0.000)
		colorBeach     (0.327, 0.284, 0.262, 0.000)
		colorDesert    (0.355, 0.305, 0.255, 0.000)
		colorLowland   (0.390, 0.325, 0.289, 0.000)
		colorUpland    (0.432, 0.395, 0.351, 0.000)
		colorRock      (0.467, 0.429, 0.379, 0.000)
		colorSnow      (0.508, 0.457, 0.400, 1.000)
		BumpHeight      0.438025
		BumpOffset      0.087605
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00137103
		Period          0.00110392
		Eccentricity    0
		Inclination     -0.609049
		AscendingNode   110.498
		ArgOfPericenter -102.35
		MeanAnomaly     79.1645
	}
}

DwarfMoon	"Cantonica System 4.S116"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.40861e-013
	Radius          0.958266
	InertiaMoment   0.395402

	Oblateness      0.249

	Obliquity       -1.11154
	EqAscendNode    136.81
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.430 0.364)

	Surface
	{
		SurfStyle       0.38099
		OceanStyle      0.377319
		Randomize      (-0.908, -0.920, -0.886)
		colorDistMagn   0.784542
		colorDistFreq   0.000313969
		detailScale     26.167
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0142772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453732
		terraceProb     0.231455
		erosion         0
		montesMagn      0.509436
		montesFreq      2.45562
		montesSpiky     0.996919
		montesFraction  0.699782
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00257114
		hillsFraction   0.855166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248636
		craterFreq      0.162757
		craterDensity   0.812336
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448871
		volcanoTemp     1274.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.172, 0.145, 0.000)
		colorShelf     (0.253, 0.183, 0.155, 0.000)
		colorBeach     (0.268, 0.193, 0.164, 0.000)
		colorDesert    (0.283, 0.204, 0.173, 0.000)
		colorLowland   (0.298, 0.215, 0.182, 0.000)
		colorUpland    (0.313, 0.226, 0.191, 0.000)
		colorRock      (0.328, 0.236, 0.200, 0.000)
		colorSnow      (0.343, 0.247, 0.209, 1.000)
		BumpHeight      0.862439
		BumpOffset      0.172488
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00138053
		Period          0.00111541
		Eccentricity    0
		Inclination     -1.11154
		AscendingNode   136.81
		ArgOfPericenter 76.0331
		MeanAnomaly     -141.112
	}
}

DwarfMoon	"Cantonica System 4.S117"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            4.8366e-013
	Radius          0.537986
	InertiaMoment   0.398212

	Oblateness      0.0316062

	Obliquity       -0.275509
	EqAscendNode    -21.8689
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.568 0.563)

	Surface
	{
		SurfStyle       0.972987
		OceanStyle      0.849158
		Randomize      (0.121, -0.991, 0.490)
		colorDistMagn   0.706457
		colorDistFreq   0.000177998
		detailScale     14.6906
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0094428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526162
		terraceProb     0.313505
		erosion         0
		montesMagn      0.447605
		montesFreq      3.90094
		montesSpiky     0.902102
		montesFraction  0.543227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0003387
		hillsFraction   0.685368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256446
		craterFreq      0.168781
		craterDensity   0.933498
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493682
		volcanoTemp     1858.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.199, 0.225, 0.050)
		colorShelf     (0.230, 0.233, 0.259, 0.040)
		colorBeach     (0.264, 0.267, 0.293, 0.030)
		colorDesert    (0.299, 0.301, 0.332, 0.020)
		colorLowland   (0.333, 0.335, 0.366, 0.030)
		colorUpland    (0.368, 0.369, 0.399, 0.050)
		colorRock      (0.402, 0.403, 0.444, 0.020)
		colorSnow      (0.402, 0.403, 0.444, 1.000)
		BumpHeight      0.484187
		BumpOffset      0.0968374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00138555
		Period          0.0011215
		Eccentricity    0
		Inclination     -0.275509
		AscendingNode   -21.8689
		ArgOfPericenter 50.2776
		MeanAnomaly     138.965
	}
}

DwarfMoon	"Cantonica System 4.S118"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            6.84454e-013
	Radius          1.33547
	InertiaMoment   0.399287

	Oblateness      0.249

	Obliquity       -0.527723
	EqAscendNode    -5.46259
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.586 0.581)

	Surface
	{
		SurfStyle       0.751311
		OceanStyle      0.425941
		Randomize      (0.380, 0.103, 0.179)
		colorDistMagn   0.479824
		colorDistFreq   0.000716927
		detailScale     36.4672
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0183991
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.28242
		terraceProb     0.146601
		erosion         0
		montesMagn      0.391686
		montesFreq      3.02946
		montesSpiky     0.895139
		montesFraction  0.674126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00448895
		hillsFraction   0.657937
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247636
		craterFreq      0.2117
		craterDensity   0.956666
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511217
		volcanoTemp     1713.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.163, 0.000)
		colorShelf     (0.236, 0.205, 0.186, 0.000)
		colorBeach     (0.277, 0.240, 0.221, 0.000)
		colorDesert    (0.301, 0.258, 0.215, 0.000)
		colorLowland   (0.330, 0.275, 0.244, 0.000)
		colorUpland    (0.366, 0.334, 0.297, 0.000)
		colorRock      (0.395, 0.363, 0.320, 0.000)
		colorSnow      (0.430, 0.387, 0.337, 1.000)
		BumpHeight      1.20192
		BumpOffset      0.240385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00139392
		Period          0.00113168
		Eccentricity    0
		Inclination     -0.527723
		AscendingNode   -5.46259
		ArgOfPericenter 25.8893
		MeanAnomaly     -16.6498
	}
}

DwarfMoon	"Cantonica System 4.S119"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.67279e-013
	Radius          0.7823
	InertiaMoment   0.396393

	Oblateness      0.0464233

	Obliquity       -0.388567
	EqAscendNode    -137.135
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.480 0.475)

	Surface
	{
		SurfStyle       0.645902
		OceanStyle      0.388912
		Randomize      (-0.532, 0.212, -0.748)
		colorDistMagn   0.341312
		colorDistFreq   0.000162352
		detailScale     21.362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0049555
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658434
		terraceProb     0.36202
		erosion         0
		montesMagn      0.500872
		montesFreq      2.74128
		montesSpiky     0.884915
		montesFraction  0.601157
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000884757
		hillsFraction   0.619091
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223583
		craterFreq      0.150443
		craterDensity   0.975288
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432602
		volcanoTemp     1605.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.163, 0.133, 0.000)
		colorShelf     (0.193, 0.168, 0.152, 0.000)
		colorBeach     (0.227, 0.197, 0.180, 0.000)
		colorDesert    (0.246, 0.211, 0.176, 0.000)
		colorLowland   (0.270, 0.225, 0.199, 0.000)
		colorUpland    (0.299, 0.273, 0.242, 0.000)
		colorRock      (0.323, 0.297, 0.261, 0.000)
		colorSnow      (0.352, 0.317, 0.275, 1.000)
		BumpHeight      0.70407
		BumpOffset      0.140814
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00140361
		Period          0.0011435
		Eccentricity    0
		Inclination     -0.388567
		AscendingNode   -137.135
		ArgOfPericenter 92.6169
		MeanAnomaly     -67.7421
	}
}

DwarfMoon	"Cantonica System 4.S120"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.36681e-012
	Radius          1.53133
	InertiaMoment   0.398392

	Oblateness      0.244332

	Obliquity       0.812578
	EqAscendNode    -170.144
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.429 0.368)

	Surface
	{
		SurfStyle       0.199324
		OceanStyle      0.65341
		Randomize      (-0.704, -0.178, -0.895)
		colorDistMagn   0.854993
		colorDistFreq   0.00178506
		detailScale     41.8156
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0024414
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573722
		terraceProb     0.384831
		erosion         0
		montesMagn      0.546993
		montesFreq      1.69249
		montesSpiky     0.999458
		montesFraction  0.46901
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00471088
		hillsFraction   0.817234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279292
		craterFreq      0.201409
		craterDensity   1.00641
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465917
		volcanoTemp     1330.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.171, 0.147, 0.000)
		colorShelf     (0.219, 0.182, 0.156, 0.000)
		colorBeach     (0.232, 0.193, 0.165, 0.000)
		colorDesert    (0.245, 0.204, 0.175, 0.000)
		colorLowland   (0.258, 0.214, 0.184, 0.000)
		colorUpland    (0.270, 0.225, 0.193, 0.000)
		colorRock      (0.283, 0.236, 0.202, 0.000)
		colorSnow      (0.296, 0.246, 0.211, 1.000)
		BumpHeight      1.3782
		BumpOffset      0.27564
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00141111
		Period          0.00115268
		Eccentricity    0
		Inclination     0.812578
		AscendingNode   -170.144
		ArgOfPericenter -121.524
		MeanAnomaly     -44.142
	}
}

DwarfMoon	"Cantonica System 4.S121"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.93354e-012
	Radius          0.866431
	InertiaMoment   0.399419

	Oblateness      0.0309147

	Obliquity       0.123919
	EqAscendNode    88.5795
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.557 0.554)

	Surface
	{
		SurfStyle       0.415356
		OceanStyle      0.259459
		Randomize      (-0.645, -0.274, 0.806)
		colorDistMagn   0.725556
		colorDistFreq   0.00020766
		detailScale     23.6593
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00308816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.338527
		terraceProb     0.143875
		erosion         0
		montesMagn      0.463471
		montesFreq      1.44651
		montesSpiky     0.985692
		montesFraction  0.587958
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00145243
		hillsFraction   0.499477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222378
		craterFreq      0.190084
		craterDensity   0.93131
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.424914
		volcanoTemp     1380.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.223, 0.222, 0.000)
		colorShelf     (0.240, 0.237, 0.235, 0.000)
		colorBeach     (0.254, 0.251, 0.249, 0.000)
		colorDesert    (0.268, 0.265, 0.263, 0.000)
		colorLowland   (0.282, 0.278, 0.277, 0.000)
		colorUpland    (0.297, 0.292, 0.291, 0.000)
		colorRock      (0.311, 0.306, 0.305, 0.000)
		colorSnow      (0.325, 0.320, 0.319, 1.000)
		BumpHeight      0.779788
		BumpOffset      0.155958
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00141853
		Period          0.00116178
		Eccentricity    0
		Inclination     0.123919
		AscendingNode   88.5795
		ArgOfPericenter -71.9932
		MeanAnomaly     -117.557
	}
}

DwarfMoon	"Cantonica System 4.S122"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.74188e-012
	Radius          2.1452
	InertiaMoment   0.3969

	Oblateness      0.249

	Obliquity       -0.707068
	EqAscendNode    -20.2152
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.505 0.500)

	Surface
	{
		SurfStyle       0.913391
		OceanStyle      0.593357
		Randomize      (0.698, 0.616, -0.755)
		colorDistMagn   0.781381
		colorDistFreq   0.0036766
		detailScale     58.5783
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0242948
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557002
		terraceProb     0.391188
		erosion         0
		montesMagn      0.470986
		montesFreq      3.1505
		montesSpiky     0.978877
		montesFraction  0.536641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0132624
		hillsFraction   0.570705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242685
		craterFreq      0.241401
		craterDensity   0.904883
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536189
		volcanoTemp     1368.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.177, 0.200, 0.050)
		colorShelf     (0.203, 0.207, 0.230, 0.040)
		colorBeach     (0.234, 0.237, 0.260, 0.030)
		colorDesert    (0.264, 0.268, 0.295, 0.020)
		colorLowland   (0.295, 0.298, 0.325, 0.030)
		colorUpland    (0.325, 0.328, 0.355, 0.050)
		colorRock      (0.356, 0.358, 0.395, 0.020)
		colorSnow      (0.356, 0.358, 0.395, 1.000)
		BumpHeight      1.93068
		BumpOffset      0.386136
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0014276
		Period          0.00117294
		Eccentricity    0
		Inclination     -0.707068
		AscendingNode   -20.2152
		ArgOfPericenter -115.066
		MeanAnomaly     -60.9589
	}
}

DwarfMoon	"Cantonica System 4.S123"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.90279e-012
	Radius          1.25704
	InertiaMoment   0.398559

	Oblateness      0.0450334

	Obliquity       1.03743
	EqAscendNode    -36.3552
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.457 0.364)

	Surface
	{
		SurfStyle       0.158731
		OceanStyle      0.660017
		Randomize      (-0.597, -0.906, -0.990)
		colorDistMagn   0.511797
		colorDistFreq   0.000766486
		detailScale     34.3255
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0343988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661895
		terraceProb     0.304241
		erosion         0
		montesMagn      0.528166
		montesFreq      3.35305
		montesSpiky     0.831309
		montesFraction  0.788574
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00390837
		hillsFraction   0.597269
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251219
		craterFreq      0.247686
		craterDensity   0.980132
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488168
		volcanoTemp     1600.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.183, 0.146, 0.000)
		colorShelf     (0.278, 0.194, 0.155, 0.000)
		colorBeach     (0.295, 0.206, 0.164, 0.000)
		colorDesert    (0.311, 0.217, 0.173, 0.000)
		colorLowland   (0.327, 0.229, 0.182, 0.000)
		colorUpland    (0.344, 0.240, 0.191, 0.000)
		colorRock      (0.360, 0.252, 0.200, 0.000)
		colorSnow      (0.377, 0.263, 0.209, 1.000)
		BumpHeight      1.13133
		BumpOffset      0.226267
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00143501
		Period          0.00118209
		Eccentricity    0
		Inclination     1.03743
		AscendingNode   -36.3552
		ArgOfPericenter -20.4716
		MeanAnomaly     145.1
	}
}

DwarfMoon	"Cantonica System 4.S124"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.5842e-012
	Radius          2.46209
	InertiaMoment   0.399548

	Oblateness      0.235775

	Obliquity       0.529244
	EqAscendNode    -135.138
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.510 0.506)

	Surface
	{
		SurfStyle       0.258662
		OceanStyle      0.121048
		Randomize      (0.565, 0.835, 0.167)
		colorDistMagn   0.722073
		colorDistFreq   0.00372212
		detailScale     67.2314
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00705051
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602792
		terraceProb     0.21598
		erosion         0
		montesMagn      0.399074
		montesFreq      3.00975
		montesSpiky     0.858645
		montesFraction  0.306654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.014628
		hillsFraction   0.507456
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240278
		craterFreq      0.220083
		craterDensity   0.710425
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49337
		volcanoTemp     1221.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.204, 0.202, 0.000)
		colorShelf     (0.220, 0.217, 0.215, 0.000)
		colorBeach     (0.233, 0.230, 0.228, 0.000)
		colorDesert    (0.245, 0.242, 0.240, 0.000)
		colorLowland   (0.258, 0.255, 0.253, 0.000)
		colorUpland    (0.271, 0.268, 0.265, 0.000)
		colorRock      (0.284, 0.281, 0.278, 0.000)
		colorSnow      (0.297, 0.293, 0.291, 1.000)
		BumpHeight      2.21588
		BumpOffset      0.443176
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00143824
		Period          0.00118608
		Eccentricity    0
		Inclination     0.529244
		AscendingNode   -135.138
		ArgOfPericenter -113.601
		MeanAnomaly     51.378
	}
}

DwarfMoon	"Cantonica System 4.S125"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            8.04447e-012
	Radius          1.41078
	InertiaMoment   0.397262

	Oblateness      0.0301248

	Obliquity       1.15996
	EqAscendNode    -111.434
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.657 0.653)

	Surface
	{
		SurfStyle       0.105521
		OceanStyle      0.520444
		Randomize      (-0.147, 0.825, 0.171)
		colorDistMagn   0.338654
		colorDistFreq   0.00058684
		detailScale     38.5238
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0228044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545407
		terraceProb     0.441121
		erosion         0
		montesMagn      0.545765
		montesFreq      2.93822
		montesSpiky     0.878561
		montesFraction  0.396259
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00582446
		hillsFraction   0.527317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219067
		craterFreq      0.219271
		craterDensity   0.840927
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517029
		volcanoTemp     1198.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.263, 0.261, 0.000)
		colorShelf     (0.280, 0.279, 0.278, 0.000)
		colorBeach     (0.296, 0.295, 0.294, 0.000)
		colorDesert    (0.313, 0.312, 0.310, 0.000)
		colorLowland   (0.329, 0.328, 0.327, 0.000)
		colorUpland    (0.346, 0.345, 0.343, 0.000)
		colorRock      (0.362, 0.361, 0.359, 0.000)
		colorSnow      (0.379, 0.378, 0.376, 1.000)
		BumpHeight      1.2697
		BumpOffset      0.253941
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00144464
		Period          0.001194
		Eccentricity    0
		Inclination     1.15996
		AscendingNode   -111.434
		ArgOfPericenter 74.8115
		MeanAnomaly     23.9809
	}
}

DwarfMoon	"Cantonica System 4.S126"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.16887e-011
	Radius          3.52659
	InertiaMoment   0.398716

	Oblateness      0.249

	Obliquity       -1.2857
	EqAscendNode    -106.444
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.522 0.428)

	Surface
	{
		SurfStyle       0.227122
		OceanStyle      0.295077
		Randomize      (-0.464, -0.554, -0.168)
		colorDistMagn   0.642261
		colorDistFreq   0.00590139
		detailScale     96.2993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0268664
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330543
		terraceProb     0.252333
		erosion         0
		montesMagn      0.285139
		montesFreq      2.80307
		montesSpiky     0.911379
		montesFraction  0.650556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0363803
		hillsFraction   0.662154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233901
		craterFreq      0.257645
		craterDensity   0.902448
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468918
		volcanoTemp     1454.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.209, 0.171, 0.000)
		colorShelf     (0.268, 0.222, 0.182, 0.000)
		colorBeach     (0.284, 0.235, 0.193, 0.000)
		colorDesert    (0.300, 0.248, 0.204, 0.000)
		colorLowland   (0.316, 0.261, 0.214, 0.000)
		colorUpland    (0.332, 0.274, 0.225, 0.000)
		colorRock      (0.347, 0.287, 0.236, 0.000)
		colorSnow      (0.363, 0.300, 0.246, 1.000)
		BumpHeight      3.17393
		BumpOffset      0.634786
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00144597
		Period          0.00119566
		Eccentricity    0
		Inclination     -1.2857
		AscendingNode   -106.444
		ArgOfPericenter -8.88891
		MeanAnomaly     -84.2371
	}
}

DwarfMoon	"Cantonica System 4.S127"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            1.71659e-011
	Radius          2.07968
	InertiaMoment   0.399675

	Oblateness      0.0449162

	Obliquity       -0.691997
	EqAscendNode    -120.422
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.481 0.345)

	Surface
	{
		SurfStyle       0.738163
		OceanStyle      0.941589
		Randomize      (0.064, 0.635, -0.002)
		colorDistMagn   0.575767
		colorDistFreq   0.000825039
		detailScale     56.789
		colorConversion true
		snowLevel       2
		tropicLatitude  0.012
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485983
		terraceProb     0.341392
		erosion         0
		montesMagn      0.621183
		montesFreq      2.9834
		montesSpiky     0.947084
		montesFraction  0.623092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00658039
		hillsFraction   0.660592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243476
		craterFreq      0.247781
		craterDensity   0.952045
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537519
		volcanoTemp     1489.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.164, 0.097, 0.000)
		colorShelf     (0.231, 0.168, 0.111, 0.000)
		colorBeach     (0.271, 0.197, 0.131, 0.000)
		colorDesert    (0.294, 0.212, 0.128, 0.000)
		colorLowland   (0.323, 0.226, 0.145, 0.000)
		colorUpland    (0.357, 0.274, 0.176, 0.000)
		colorRock      (0.386, 0.298, 0.190, 0.000)
		colorSnow      (0.421, 0.317, 0.200, 1.000)
		BumpHeight      1.87171
		BumpOffset      0.374342
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0014523
		Period          0.00120351
		Eccentricity    0
		Inclination     -0.691997
		AscendingNode   -120.422
		ArgOfPericenter -57.9432
		MeanAnomaly     -79.6007
	}
}

DwarfMoon	"Cantonica System 4.S128"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            2.55425e-011
	Radius          4.11011
	InertiaMoment   0.397552

	Oblateness      0.230473

	Obliquity       1.20606
	EqAscendNode    -88.0139
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.770 0.767)

	Surface
	{
		SurfStyle       0.594054
		OceanStyle      0.843666
		Randomize      (-0.650, 0.713, 0.305)
		colorDistMagn   0.075775
		colorDistFreq   0.00508135
		detailScale     112.233
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0302739
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598519
		terraceProb     0.782978
		erosion         0
		montesMagn      0.531037
		montesFreq      3.351
		montesSpiky     0.986144
		montesFraction  0.605709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0216771
		hillsFraction   0.94546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228981
		craterFreq      0.207572
		craterDensity   1.03846
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472152
		volcanoTemp     1449.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.215, 0.000)
		colorShelf     (0.309, 0.270, 0.245, 0.000)
		colorBeach     (0.363, 0.316, 0.291, 0.000)
		colorDesert    (0.394, 0.339, 0.284, 0.000)
		colorLowland   (0.432, 0.362, 0.322, 0.000)
		colorUpland    (0.479, 0.439, 0.391, 0.000)
		colorRock      (0.517, 0.478, 0.422, 0.000)
		colorSnow      (0.564, 0.508, 0.445, 1.000)
		BumpHeight      3.6991
		BumpOffset      0.739819
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00145375
		Period          0.00120531
		Eccentricity    0
		Inclination     1.20606
		AscendingNode   -88.0139
		ArgOfPericenter 85.9114
		MeanAnomaly     49.299
	}
}

DwarfMoon	"Cantonica System 4.S129"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            3.86234e-011
	Radius          2.40611
	InertiaMoment   0.398866

	Oblateness      0.0305214

	Obliquity       -0.329171
	EqAscendNode    142.386
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.725 0.724)

	Surface
	{
		SurfStyle       0.964926
		OceanStyle      0.914463
		Randomize      (0.224, -0.029, -0.821)
		colorDistMagn   0.98085
		colorDistFreq   0.00361129
		detailScale     65.7029
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00370257
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544993
		terraceProb     0.302247
		erosion         0
		montesMagn      0.486734
		montesFreq      3.33585
		montesSpiky     0.828414
		montesFraction  0.488911
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0184157
		hillsFraction   0.612329
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242144
		craterFreq      0.268617
		craterDensity   0.861518
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516627
		volcanoTemp     1418.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.254, 0.289, 0.050)
		colorShelf     (0.292, 0.297, 0.333, 0.040)
		colorBeach     (0.335, 0.341, 0.376, 0.030)
		colorDesert    (0.379, 0.384, 0.427, 0.020)
		colorLowland   (0.423, 0.428, 0.470, 0.030)
		colorUpland    (0.466, 0.471, 0.514, 0.050)
		colorRock      (0.510, 0.515, 0.572, 0.020)
		colorSnow      (0.510, 0.515, 0.572, 1.000)
		BumpHeight      2.1655
		BumpOffset      0.4331
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00145705
		Period          0.00120943
		Eccentricity    0
		Inclination     -0.329171
		AscendingNode   142.386
		ArgOfPericenter 169.468
		MeanAnomaly     -72.1025
	}
}

DwarfMoon	"Cantonica System 4.S130"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            5.95703e-011
	Radius          6.17869
	InertiaMoment   0.399801

	Oblateness      0.249

	Obliquity       0.0763953
	EqAscendNode    -131.875
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.738 0.664)

	Surface
	{
		SurfStyle       0.275706
		OceanStyle      0.664834
		Randomize      (0.216, -0.506, -0.589)
		colorDistMagn   0.00784785
		colorDistFreq   0.0306463
		detailScale     168.719
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00109183
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503302
		terraceProb     0.1901
		erosion         0
		montesMagn      0.542587
		montesFreq      3.25114
		montesSpiky     0.923652
		montesFraction  0.822081
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.114785
		hillsFraction   0.773328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245086
		craterFreq      0.269198
		craterDensity   0.768942
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425343
		volcanoTemp     1415.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.295, 0.265, 0.000)
		colorShelf     (0.334, 0.314, 0.282, 0.000)
		colorBeach     (0.353, 0.332, 0.299, 0.000)
		colorDesert    (0.373, 0.351, 0.315, 0.000)
		colorLowland   (0.393, 0.369, 0.332, 0.000)
		colorUpland    (0.412, 0.387, 0.348, 0.000)
		colorRock      (0.432, 0.406, 0.365, 0.000)
		colorSnow      (0.452, 0.424, 0.382, 1.000)
		BumpHeight      5.56082
		BumpOffset      1.11216
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00146587
		Period          0.00122042
		Eccentricity    0
		Inclination     0.0763953
		AscendingNode   -131.875
		ArgOfPericenter -114.003
		MeanAnomaly     110.963
	}
}

DwarfMoon	"Cantonica System 4.S131"
{
	ParentBody     "Cantonica System 4"
	Class	       "Asteroid"

	Mass            9.41573e-011
	Radius          3.70541
	InertiaMoment   0.397797

	Oblateness      0.0446318

	Obliquity       -1.03608
	EqAscendNode    18.3966
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.431 0.428 0.424)

	Surface
	{
		SurfStyle       0.750511
		OceanStyle      0.91943
		Randomize      (-0.547, -0.951, 0.237)
		colorDistMagn   0.994898
		colorDistFreq   0.00487202
		detailScale     101.182
		colorConversion true
		snowLevel       2
		tropicLatitude  0.035694
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434604
		terraceProb     0.478123
		erosion         0
		montesMagn      0.44523
		montesFreq      2.90682
		montesSpiky     0.887459
		montesFraction  0.551134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0184478
		hillsFraction   0.542446
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226891
		craterFreq      0.272856
		craterDensity   1.05835
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501068
		volcanoTemp     1230.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.119, 0.000)
		colorShelf     (0.172, 0.150, 0.136, 0.000)
		colorBeach     (0.202, 0.175, 0.161, 0.000)
		colorDesert    (0.220, 0.188, 0.157, 0.000)
		colorLowland   (0.241, 0.201, 0.178, 0.000)
		colorUpland    (0.267, 0.244, 0.216, 0.000)
		colorRock      (0.289, 0.265, 0.233, 0.000)
		colorSnow      (0.314, 0.282, 0.246, 1.000)
		BumpHeight      3.33487
		BumpOffset      0.666973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0014669
		Period          0.00122171
		Eccentricity    0
		Inclination     -1.03608
		AscendingNode   18.3966
		ArgOfPericenter -179.992
		MeanAnomaly     70.2378
	}
}

Planet	"Cantonica System 5"
{
	ParentBody     "Cantonica System"
	Class	       "IceGiant"

	Mass            12.3046
	Radius          19171.7
	InertiaMoment   0.238547

	Oblateness      0.0245578

	RotationPeriod  11.1594
	Obliquity       -6.40573
	EqAscendNode    -95.6751

	AlbedoBond      0.492493
	AlbedoGeom      0.590991
	Brightness      2

	Surface
	{
		SurfStyle       0.735224
		Randomize      (-0.092, -0.716, 0.290)
		detailScale     49310.8
		colorConversion true
		tropicLatitude  0.111642
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.08051
		stripeFluct     0.462293
		stripeTwist     10.9487
		cycloneMagn     12.7437
		cycloneFreq     0.719743
		cycloneDensity  0.354796
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
		BumpHeight      17.1382
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          86.9707
		Velocity        -1435.88
		BumpHeight      69.8317
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.23182
		mainOctaves     12
		Coverage        0.462463
		stripeZones     7.08051
		stripeFluct     0.462293
		stripeTwist     10.9487
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          191.717
		Density         618.316
		Pressure        115916
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0481616
		Saturation      0.998546

		Composition
		{
			H2    	93.4841
			He    	6.21304
			CH4   	0.243702
			N2    	0.0375311
			O2    	0.00758142
			NH3   	0.00685826
			C2H2  	0.00334302
			C2H4  	0.00118432
			Ne    	0.000905885
			Ar    	0.000849156
			C2H6  	0.000580987
			C3H8  	0.000279065
		}
	}

	Aurora
	{
		Height      282.072
		NorthLat    71.711
		NorthLon    32.1788
		NorthRadius 5517.16
		NorthWidth  1447.88
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -57.0609
		SouthLon    241.28
		SouthRadius 6338.06
		SouthWidth  2153.34
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     25425.4
		OuterRadius     47193.7
		RotationPeriod  5.46488
		RotationOffset  0
		FrontBright     0.728992
		BackBright      0.951574
		Density         0.933831
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.66688
		Period          2.14462
		Eccentricity    0.0914806
		Inclination     0.115954
		AscendingNode   -91.5672
		ArgOfPericenter 266.781
		MeanAnomaly     175.588
	}
}

DwarfMoon	"Cantonica System 5.D1"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            1.14568e-010
	Radius          6.9796
	InertiaMoment   0.396219

	Oblateness      0.249

	Obliquity       -0.00774828
	EqAscendNode    127.639
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.709 0.707)

	Surface
	{
		SurfStyle       0.727613
		OceanStyle      0.691145
		Randomize      (-0.572, 0.728, 0.604)
		colorDistMagn   0.476279
		colorDistFreq   0.0143071
		detailScale     190.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600295
		terraceProb     0.546893
		erosion         0
		montesMagn      0.601103
		montesFreq      1.83159
		montesSpiky     0.85216
		montesFraction  0.636461
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.138486
		hillsFraction   0.762861
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233097
		craterFreq      0.195531
		craterDensity   0.86657
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549631
		volcanoTemp     1377.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.241, 0.198, 0.000)
		colorShelf     (0.284, 0.248, 0.226, 0.000)
		colorBeach     (0.334, 0.291, 0.269, 0.000)
		colorDesert    (0.362, 0.312, 0.262, 0.000)
		colorLowland   (0.398, 0.333, 0.297, 0.000)
		colorUpland    (0.441, 0.404, 0.361, 0.000)
		colorRock      (0.476, 0.439, 0.389, 0.000)
		colorSnow      (0.519, 0.468, 0.410, 1.000)
		BumpHeight      6.28164
		BumpOffset      1.25633
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000292362
		Period          0.000824192
		Eccentricity    6.5562e-005
		Inclination     -0.00774828
		AscendingNode   127.639
		ArgOfPericenter 172.638
		MeanAnomaly     1.00726
	}
}

DwarfMoon	"Cantonica System 5.D2"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            1.83796e-010
	Radius          7.84773
	InertiaMoment   0.398348

	Oblateness      0.249

	Obliquity       -0.0149494
	EqAscendNode    20.4882
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.604 0.601)

	Surface
	{
		SurfStyle       0.777735
		OceanStyle      0.546655
		Randomize      (0.027, 0.810, -0.929)
		colorDistMagn   0.331514
		colorDistFreq   0.018833
		detailScale     214.295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443721
		terraceProb     0.15426
		erosion         0
		montesMagn      0.394585
		montesFreq      2.35086
		montesSpiky     0.940851
		montesFraction  0.456801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.171596
		hillsFraction   0.441825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257849
		craterFreq      0.175315
		craterDensity   1.02073
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491087
		volcanoTemp     1322.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.205, 0.168, 0.000)
		colorShelf     (0.243, 0.211, 0.192, 0.000)
		colorBeach     (0.285, 0.248, 0.228, 0.000)
		colorDesert    (0.309, 0.266, 0.222, 0.000)
		colorLowland   (0.340, 0.284, 0.252, 0.000)
		colorUpland    (0.376, 0.344, 0.307, 0.000)
		colorRock      (0.406, 0.375, 0.331, 0.000)
		colorSnow      (0.443, 0.399, 0.349, 1.000)
		BumpHeight      7.06296
		BumpOffset      1.41259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000317127
		Period          0.000931102
		Eccentricity    5.03695e-005
		Inclination     -0.0149494
		AscendingNode   20.4882
		ArgOfPericenter 86.4342
		MeanAnomaly     74.9567
	}
}

DwarfMoon	"Cantonica System 5.D3"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            2.85458e-010
	Radius          8.64022
	InertiaMoment   0.399385

	Oblateness      0.249

	Obliquity       0.00492162
	EqAscendNode    112.504
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.492 0.409 0.353)

	Surface
	{
		SurfStyle       0.0443552
		OceanStyle      0.6465
		Randomize      (-0.008, -0.514, 0.893)
		colorDistMagn   0.715188
		colorDistFreq   0.0255727
		detailScale     235.936
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448888
		terraceProb     0.294618
		erosion         0
		montesMagn      0.504746
		montesFreq      2.88438
		montesSpiky     0.967815
		montesFraction  0.310356
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.17823
		hillsFraction   0.725548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260506
		craterFreq      0.189804
		craterDensity   0.740015
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571063
		volcanoTemp     1461.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.164, 0.141, 0.000)
		colorShelf     (0.209, 0.174, 0.150, 0.000)
		colorBeach     (0.221, 0.184, 0.159, 0.000)
		colorDesert    (0.234, 0.194, 0.168, 0.000)
		colorLowland   (0.246, 0.205, 0.176, 0.000)
		colorUpland    (0.258, 0.215, 0.185, 0.000)
		colorRock      (0.271, 0.225, 0.194, 0.000)
		colorSnow      (0.283, 0.235, 0.203, 1.000)
		BumpHeight      7.7762
		BumpOffset      1.55524
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000328787
		Period          0.000982921
		Eccentricity    8.49947e-005
		Inclination     0.00492162
		AscendingNode   112.504
		ArgOfPericenter -159.139
		MeanAnomaly     167.013
	}
}

DwarfMoon	"Cantonica System 5.D4"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            4.3199e-010
	Radius          11.5938
	InertiaMoment   0.396791

	Oblateness      0.249

	Obliquity       0.000845246
	EqAscendNode    49.705
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.474 0.467 0.464)

	Surface
	{
		SurfStyle       0.546668
		OceanStyle      0.608143
		Randomize      (0.339, 0.559, 0.785)
		colorDistMagn   0.286029
		colorDistFreq   0.0375298
		detailScale     316.588
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683605
		terraceProb     0.273548
		erosion         0
		montesMagn      0.470558
		montesFreq      3.73599
		montesSpiky     0.999807
		montesFraction  0.571458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.372291
		hillsFraction   0.654656
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288172
		craterFreq      0.158175
		craterDensity   0.996688
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525907
		volcanoTemp     1438.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.159, 0.130, 0.000)
		colorShelf     (0.190, 0.164, 0.149, 0.000)
		colorBeach     (0.223, 0.192, 0.176, 0.000)
		colorDesert    (0.242, 0.206, 0.172, 0.000)
		colorLowland   (0.266, 0.220, 0.195, 0.000)
		colorUpland    (0.294, 0.266, 0.237, 0.000)
		colorRock      (0.318, 0.290, 0.255, 0.000)
		colorSnow      (0.346, 0.308, 0.269, 1.000)
		BumpHeight      10.4344
		BumpOffset      2.08688
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000344823
		Period          0.0010557
		Eccentricity    5.1147e-005
		Inclination     0.000845246
		AscendingNode   49.705
		ArgOfPericenter -45.3023
		MeanAnomaly     170.641
	}
}

DwarfMoon	"Cantonica System 5.D5"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            6.4007e-010
	Radius          12.4614
	InertiaMoment   0.398517

	Oblateness      0.249

	Obliquity       0.00198035
	EqAscendNode    -156.209
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.608 0.605)

	Surface
	{
		SurfStyle       0.281861
		OceanStyle      0.90701
		Randomize      (-0.747, 0.737, -0.371)
		colorDistMagn   0.090452
		colorDistFreq   0.0774265
		detailScale     340.281
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501868
		terraceProb     0.442848
		erosion         0
		montesMagn      0.434611
		montesFreq      3.09382
		montesSpiky     0.878532
		montesFraction  0.371557
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.398105
		hillsFraction   0.603658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213606
		craterFreq      0.23736
		craterDensity   0.852194
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542949
		volcanoTemp     1626.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.242, 0.000)
		colorShelf     (0.260, 0.259, 0.257, 0.000)
		colorBeach     (0.275, 0.274, 0.272, 0.000)
		colorDesert    (0.291, 0.289, 0.287, 0.000)
		colorLowland   (0.306, 0.304, 0.302, 0.000)
		colorUpland    (0.321, 0.319, 0.318, 0.000)
		colorRock      (0.337, 0.335, 0.333, 0.000)
		colorSnow      (0.352, 0.350, 0.348, 1.000)
		BumpHeight      11.2153
		BumpOffset      2.24306
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000362906
		Period          0.00113982
		Eccentricity    6.20087e-005
		Inclination     0.00198035
		AscendingNode   -156.209
		ArgOfPericenter 105.561
		MeanAnomaly     41.8558
	}
}

DwarfMoon	"Cantonica System 5.D6"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            9.32008e-010
	Radius          13.5598
	InertiaMoment   0.399515

	Oblateness      0.205693

	Obliquity       -0.00907896
	EqAscendNode    -146.456
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.704 0.701)

	Surface
	{
		SurfStyle       0.908422
		OceanStyle      0.392372
		Randomize      (0.526, 0.398, 0.215)
		colorDistMagn   0.69919
		colorDistFreq   0.106751
		detailScale     370.272
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414289
		terraceProb     0.34948
		erosion         0
		montesMagn      0.552353
		montesFreq      3.00349
		montesSpiky     0.967358
		montesFraction  0.304435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.496402
		hillsFraction   0.586419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217351
		craterFreq      0.16623
		craterDensity   0.888508
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540222
		volcanoTemp     1622.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.246, 0.280, 0.050)
		colorShelf     (0.283, 0.289, 0.322, 0.040)
		colorBeach     (0.325, 0.331, 0.364, 0.030)
		colorDesert    (0.368, 0.373, 0.414, 0.020)
		colorLowland   (0.410, 0.415, 0.456, 0.030)
		colorUpland    (0.452, 0.457, 0.498, 0.050)
		colorRock      (0.495, 0.500, 0.554, 0.020)
		colorSnow      (0.495, 0.500, 0.554, 1.000)
		BumpHeight      12.2038
		BumpOffset      2.44076
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000390105
		Period          0.00127034
		Eccentricity    1.42602e-005
		Inclination     -0.00907896
		AscendingNode   -146.456
		ArgOfPericenter 51.6441
		MeanAnomaly     66.8664
	}
}

Moon	"Cantonica System 5.1"
{
	ParentBody     "Cantonica System 5"
	Class	       "Selena"

	Mass            0.000165638
	Radius          455.802
	InertiaMoment   0.396079

	Oblateness      0.0138739

	Obliquity       -0.159333
	EqAscendNode    81.9264
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.427 0.419 0.415)

	Surface
	{
		SurfStyle       0.485297
		OceanStyle      0.682866
		Randomize      (-0.886, -0.165, -0.011)
		colorDistMagn   0.0405632
		colorDistFreq   65.9926
		detailScale     1172.35
		colorConversion true
		drivenDarkening 0
		seaLevel        0.219148
		snowLevel       2
		tropicLatitude  0.00420034
		icecapLatitude  1.98252
		icecapHeight    0.100781
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.0888
		venusFreq       0.531965
		venusMagn       0
		mareFreq        0
		mareDensity     0.000165628
		terraceProb     0.546376
		erosion         0
		montesMagn      0.0527868
		montesFreq      19.3197
		montesSpiky     0.894967
		montesFraction  0.52527
		dunesMagn       0.0576811
		dunesFreq       608.633
		dunesFraction   0.45467
		hillsMagn       0.12223
		hillsFreq       50.9905
		hillsFraction   0.444695
		hills2Fraction  0
		riversMagn      60.8045
		riversFreq      3.16293
		riversSin       6.18174
		riversOctaves   0
		canyonsMagn     0.663816
		canyonsFreq     0.193372
		canyonFraction  0.766768
		cracksMagn      0.0373334
		cracksFreq      0.248567
		cracksOctaves   0
		craterMagn      0.691998
		craterFreq      1.32791
		craterDensity   0.772935
		craterOctaves   8.5515
		craterRayedFactor 0.140567
		volcanoMagn     0.174238
		volcanoFreq     0.716997
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.46098
		volcanoRadius   0.153883
		volcanoTemp     1529.31
		lavaCoverTidal  0.0553709
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.235, 0.239, 0.249, 0.000)
		colorDesert    (0.205, 0.193, 0.191, 0.000)
		colorLowland   (0.261, 0.255, 0.233, 0.000)
		colorUpland    (0.278, 0.272, 0.253, 0.000)
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
		SemiMajorAxis   0.000570519
		Period          0.00224672
		Eccentricity    0.028461
		Inclination     -0.159333
		AscendingNode   81.9264
		ArgOfPericenter 5.90158
		MeanAnomaly     -67.283
	}
}

Moon	"Cantonica System 5.2"
{
	ParentBody     "Cantonica System 5"
	Class	       "Selena"

	Mass            0.00019789
	Radius          513.703
	InertiaMoment   0.399666

	Oblateness      0.00598549

	Obliquity       0.0933127
	EqAscendNode    -166.631
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.525 0.479 0.428)

	Surface
	{
		SurfStyle       0.114591
		OceanStyle      0.517116
		Randomize      (-0.750, -0.561, 0.918)
		colorDistMagn   0.0754365
		colorDistFreq   51.0456
		detailScale     1321.27
		colorConversion true
		drivenDarkening 0
		seaLevel        0.240691
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  0.690758
		icecapHeight    0.253396
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.52695
		venusFreq       1.04863
		venusMagn       0
		mareFreq        0
		mareDensity     0.000177149
		terraceProb     0.503018
		erosion         0
		montesMagn      0.0581346
		montesFreq      26.3116
		montesSpiky     0.756365
		montesFraction  0.376151
		dunesMagn       0.0413871
		dunesFreq       681.772
		dunesFraction   0.296337
		hillsMagn       0.107541
		hillsFreq       68.3392
		hillsFraction   0.531543
		hills2Fraction  0
		riversMagn      51.296
		riversFreq      3.61234
		riversSin       6.29997
		riversOctaves   0
		canyonsMagn     0.648115
		canyonsFreq     0.21308
		canyonFraction  0.375827
		cracksMagn      0.0691531
		cracksFreq      0.252358
		cracksOctaves   0
		craterMagn      0.617005
		craterFreq      1.55322
		craterDensity   0.897464
		craterOctaves   9
		craterRayedFactor 0.081163
		volcanoMagn     0.186518
		volcanoFreq     0.652371
		volcanoDensity  0.395164
		volcanoOctaves  3
		volcanoActivity 1.15338
		volcanoFlows    0.126142
		volcanoRadius   0.163167
		volcanoTemp     1556.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.263, 0.239, 0.214, 0.000)
		colorDesert    (0.326, 0.287, 0.244, 0.200)
		colorLowland   (0.352, 0.306, 0.274, 0.500)
		colorUpland    (0.368, 0.321, 0.283, 0.800)
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
		SemiMajorAxis   0.000805561
		Period          0.00376956
		Eccentricity    0.0167484
		Inclination     0.0933127
		AscendingNode   -166.631
		ArgOfPericenter 33.5733
		MeanAnomaly     157.3
	}
}

Moon	"Cantonica System 5.3"
{
	ParentBody     "Cantonica System 5"
	Class	       "Selena"

	Mass            0.000234588
	Radius          511.657
	InertiaMoment   0.399189

	Oblateness      0.00176912

	Obliquity       0.0217546
	EqAscendNode    71.8517
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.616 0.524 0.439)

	Surface
	{
		SurfStyle       0.228391
		OceanStyle      0.626328
		Randomize      (0.700, 0.525, -0.748)
		colorDistMagn   0.0572179
		colorDistFreq   60.9702
		detailScale     1316.01
		colorConversion true
		drivenDarkening 0
		seaLevel        0.174547
		snowLevel       2
		tropicLatitude  0.00059802
		icecapLatitude  0.850766
		icecapHeight    0.180848
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8022
		venusFreq       1.4084
		venusMagn       0
		mareFreq        0
		mareDensity     0.000198521
		terraceProb     0.296559
		erosion         0
		montesMagn      0.0657682
		montesFreq      16.8842
		montesSpiky     0.936358
		montesFraction  0.237715
		dunesMagn       0.0473096
		dunesFreq       667.673
		dunesFraction   0.10824
		hillsMagn       0.128903
		hillsFreq       59.5037
		hillsFraction   0.63374
		hills2Fraction  0
		riversMagn      67.6463
		riversFreq      2.87939
		riversSin       6.50069
		riversOctaves   0
		canyonsMagn     0.462756
		canyonsFreq     0.163189
		canyonFraction  0.645511
		cracksMagn      0.0633889
		cracksFreq      0.200383
		cracksOctaves   0
		craterMagn      0.570177
		craterFreq      1.29451
		craterDensity   0.817857
		craterOctaves   9
		craterRayedFactor 0.122459
		volcanoMagn     0.197576
		volcanoFreq     0.901115
		volcanoDensity  0.281121
		volcanoOctaves  3
		volcanoActivity 0.15824
		volcanoFlows    0.0909818
		volcanoRadius   0.174865
		volcanoTemp     1584.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.308, 0.262, 0.219, 0.000)
		colorDesert    (0.382, 0.314, 0.250, 0.200)
		colorLowland   (0.412, 0.335, 0.281, 0.500)
		colorUpland    (0.431, 0.351, 0.289, 0.800)
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
		SemiMajorAxis   0.00113743
		Period          0.00632459
		Eccentricity    0.00739405
		Inclination     0.0217546
		AscendingNode   71.8517
		ArgOfPericenter 101.996
		MeanAnomaly     123.756
	}
}

Moon	"Cantonica System 5.4"
{
	ParentBody     "Cantonica System 5"
	Class	       "Selena"

	Mass            0.00276353
	Radius          1070.43
	InertiaMoment   0.398659

	Obliquity       0.332983
	EqAscendNode    58.5386
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.423 0.419 0.417)

	Surface
	{
		SurfStyle       0.369785
		OceanStyle      0.0416123
		Randomize      (-0.340, -0.449, -0.022)
		colorDistMagn   0.0426552
		colorDistFreq   109.922
		detailScale     2753.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.234176
		snowLevel       2
		tropicLatitude  0.0101369
		icecapLatitude  0.588789
		icecapHeight    0.261876
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.04545
		venusFreq       0.753093
		venusMagn       0
		mareFreq        0.32688
		mareDensity     0.00147514
		terraceProb     0.468937
		erosion         0
		montesMagn      0.0732651
		montesFreq      44.7555
		montesSpiky     0.908289
		montesFraction  0.910346
		dunesMagn       0.0343924
		dunesFreq       1420.47
		dunesFraction   0.497407
		hillsMagn       0.134856
		hillsFreq       107.263
		hillsFraction   0.980143
		hills2Fraction  0
		riversMagn      54.5897
		riversFreq      3.49113
		riversSin       5.65725
		riversOctaves   0
		canyonsMagn     0.578209
		canyonsFreq     0.329807
		canyonFraction  0.180381
		cracksMagn      0.0526128
		cracksFreq      0.288805
		cracksOctaves   0
		craterMagn      0.509913
		craterFreq      3.08286
		craterDensity   0.941484
		craterOctaves   10
		craterRayedFactor 0.0884456
		volcanoMagn     0.189912
		volcanoFreq     0.582996
		volcanoDensity  0.385103
		volcanoOctaves  3
		volcanoActivity 1.23159
		volcanoFlows    0.400808
		volcanoRadius   0.167897
		volcanoTemp     1727.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.233, 0.239, 0.250, 0.000)
		colorDesert    (0.203, 0.193, 0.192, 0.000)
		colorLowland   (0.258, 0.256, 0.233, 0.000)
		colorUpland    (0.275, 0.272, 0.254, 0.000)
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
		SemiMajorAxis   0.00160603
		Period          0.0106104
		Eccentricity    0.0370571
		Inclination     0.332983
		AscendingNode   58.5386
		ArgOfPericenter 6.96261
		MeanAnomaly     59.1383
	}
}

DwarfMoon	"Cantonica System 5.D7"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            5.12421e-009
	Radius          23.0324
	InertiaMoment   0.398829

	Obliquity       35.7318
	EqAscendNode    166.384
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.700 0.696 0.693)

	Surface
	{
		SurfStyle       0.144998
		OceanStyle      0.221652
		Randomize      (0.441, 0.819, 0.588)
		colorDistMagn   0.580621
		colorDistFreq   0.452772
		detailScale     628.939
		colorConversion true
		snowLevel       2
		tropicLatitude  0.138126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.645778
		terraceProb     0.116686
		erosion         0
		montesMagn      0.566226
		montesFreq      3.20707
		montesSpiky     0.892887
		montesFraction  0.714639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33556
		hillsFraction   0.698884
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23026
		craterFreq      0.176311
		craterDensity   0.942621
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477064
		volcanoTemp     1468.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.279, 0.277, 0.000)
		colorShelf     (0.297, 0.296, 0.295, 0.000)
		colorBeach     (0.315, 0.313, 0.312, 0.000)
		colorDesert    (0.332, 0.331, 0.329, 0.000)
		colorLowland   (0.350, 0.348, 0.347, 0.000)
		colorUpland    (0.367, 0.366, 0.364, 0.000)
		colorRock      (0.385, 0.383, 0.381, 0.000)
		colorSnow      (0.402, 0.400, 0.398, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00696837
		Period          0.0959055
		Eccentricity    0.407763
		Inclination     35.7318
		AscendingNode   166.384
		ArgOfPericenter 67.1157
		MeanAnomaly     -85.2596
	}
}

DwarfMoon	"Cantonica System 5.D8"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            7.04395e-009
	Radius          30.3605
	InertiaMoment   0.399769

	RotationPeriod  2842.4
	Obliquity       -54.587
	EqAscendNode    -177.652

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.428 0.303)

	Surface
	{
		SurfStyle       0.807135
		OceanStyle      0.124034
		Randomize      (0.854, -0.527, 0.177)
		colorDistMagn   0.352565
		colorDistFreq   0.622104
		detailScale     829.045
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0333971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499255
		terraceProb     0.268813
		erosion         0
		montesMagn      0.6321
		montesFreq      3.61882
		montesSpiky     0.901927
		montesFraction  0.283829
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.24454
		hillsFraction   0.52851
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233681
		craterFreq      0.243086
		craterDensity   0.82404
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.584298
		volcanoTemp     1451.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.145, 0.085, 0.000)
		colorShelf     (0.213, 0.150, 0.097, 0.000)
		colorBeach     (0.250, 0.175, 0.115, 0.000)
		colorDesert    (0.271, 0.188, 0.112, 0.000)
		colorLowland   (0.298, 0.201, 0.127, 0.000)
		colorUpland    (0.330, 0.244, 0.155, 0.000)
		colorRock      (0.356, 0.265, 0.167, 0.000)
		colorSnow      (0.388, 0.282, 0.176, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00754657
		Period          0.108086
		Eccentricity    0.124003
		Inclination     -54.587
		AscendingNode   -177.652
		ArgOfPericenter 62.741
		MeanAnomaly     -17.8055
	}
}

DwarfMoon	"Cantonica System 5.D9"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            9.6392e-009
	Radius          31.1845
	InertiaMoment   0.397738

	Obliquity       82.9393
	EqAscendNode    -33.6658
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.737 0.733)

	Surface
	{
		SurfStyle       0.903364
		OceanStyle      0.434929
		Randomize      (-0.374, -0.572, -0.670)
		colorDistMagn   0.69606
		colorDistFreq   0.303444
		detailScale     851.545
		colorConversion true
		snowLevel       2
		tropicLatitude  0.593818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640113
		terraceProb     0.306475
		erosion         0
		montesMagn      0.514233
		montesFreq      2.63547
		montesSpiky     0.984862
		montesFraction  0.599624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.82412
		hillsFraction   0.549325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263858
		craterFreq      0.252011
		craterDensity   0.781959
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433074
		volcanoTemp     1499.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.258, 0.293, 0.050)
		colorShelf     (0.296, 0.302, 0.337, 0.040)
		colorBeach     (0.341, 0.346, 0.381, 0.030)
		colorDesert    (0.385, 0.391, 0.433, 0.020)
		colorLowland   (0.430, 0.435, 0.477, 0.030)
		colorUpland    (0.474, 0.479, 0.521, 0.050)
		colorRock      (0.518, 0.523, 0.579, 0.020)
		colorSnow      (0.518, 0.523, 0.579, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00775415
		Period          0.112577
		Eccentricity    0.478228
		Inclination     82.9393
		AscendingNode   -33.6658
		ArgOfPericenter -10.034
		MeanAnomaly     72.3432
	}
}

DwarfMoon	"Cantonica System 5.D10"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            1.31447e-008
	Radius          33.1319
	InertiaMoment   0.398974

	Obliquity       -72.7404
	EqAscendNode    74.7269
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.549 0.450 0.344)

	Surface
	{
		SurfStyle       0.144868
		OceanStyle      0.688632
		Randomize      (-0.061, -0.637, 0.643)
		colorDistMagn   0.972174
		colorDistFreq   0.0961893
		detailScale     904.721
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98835
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646458
		terraceProb     0.139899
		erosion         0
		montesMagn      0.502857
		montesFreq      3.35699
		montesSpiky     0.954795
		montesFraction  0.425603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.65332
		hillsFraction   0.591298
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212874
		craterFreq      0.251776
		craterDensity   0.91358
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539279
		volcanoTemp     1745.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.180, 0.138, 0.000)
		colorShelf     (0.233, 0.191, 0.146, 0.000)
		colorBeach     (0.247, 0.202, 0.155, 0.000)
		colorDesert    (0.261, 0.214, 0.164, 0.000)
		colorLowland   (0.275, 0.225, 0.172, 0.000)
		colorUpland    (0.288, 0.236, 0.181, 0.000)
		colorRock      (0.302, 0.247, 0.189, 0.000)
		colorSnow      (0.316, 0.259, 0.198, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00817206
		Period          0.121799
		Eccentricity    0.0522201
		Inclination     -72.7404
		AscendingNode   74.7269
		ArgOfPericenter -92.9484
		MeanAnomaly     -112.323
	}
}

DwarfMoon	"Cantonica System 5.D11"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            1.78796e-008
	Radius          35.1919
	InertiaMoment   0.399895

	RotationPeriod  4627.93
	Obliquity       66.4203
	EqAscendNode    -6.57844

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.733 0.641)

	Surface
	{
		SurfStyle       0.481553
		OceanStyle      0.77628
		Randomize      (0.506, 0.465, -0.607)
		colorDistMagn   0.823802
		colorDistFreq   0.592241
		detailScale     960.974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.738337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613039
		terraceProb     0.14164
		erosion         0
		montesMagn      0.401995
		montesFreq      3.70528
		montesSpiky     0.945034
		montesFraction  0.646472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.36645
		hillsFraction   0.521721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212157
		craterFreq      0.177823
		craterDensity   0.921801
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46247
		volcanoTemp     1372.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.293, 0.257, 0.000)
		colorShelf     (0.339, 0.311, 0.273, 0.000)
		colorBeach     (0.359, 0.330, 0.289, 0.000)
		colorDesert    (0.379, 0.348, 0.305, 0.000)
		colorLowland   (0.399, 0.366, 0.321, 0.000)
		colorUpland    (0.419, 0.385, 0.337, 0.000)
		colorRock      (0.439, 0.403, 0.353, 0.000)
		colorSnow      (0.459, 0.421, 0.369, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00862168
		Period          0.131988
		Eccentricity    0.36945
		Inclination     66.4204
		AscendingNode   -6.57844
		ArgOfPericenter 142.343
		MeanAnomaly     -132.121
	}
}

DwarfMoon	"Cantonica System 5.D12"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            2.42809e-008
	Radius          47.1441
	InertiaMoment   0.397961

	RotationPeriod  1606.4
	Obliquity       -46.0124
	EqAscendNode    55.57

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.546 0.458 0.422)

	Surface
	{
		SurfStyle       0.417298
		OceanStyle      0.109416
		Randomize      (0.883, -0.036, -0.731)
		colorDistMagn   0.790813
		colorDistFreq   0.911486
		detailScale     1287.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.290286
		terraceProb     0.662949
		erosion         0
		montesMagn      0.466357
		montesFreq      2.85973
		montesSpiky     0.964851
		montesFraction  0.611077
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.53459
		hillsFraction   0.711454
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238036
		craterFreq      0.168231
		craterDensity   0.903251
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456237
		volcanoTemp     1773.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.183, 0.169, 0.000)
		colorShelf     (0.232, 0.195, 0.179, 0.000)
		colorBeach     (0.246, 0.206, 0.190, 0.000)
		colorDesert    (0.260, 0.218, 0.200, 0.000)
		colorLowland   (0.273, 0.229, 0.211, 0.000)
		colorUpland    (0.287, 0.241, 0.221, 0.000)
		colorRock      (0.300, 0.252, 0.232, 0.000)
		colorSnow      (0.314, 0.264, 0.243, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00885763
		Period          0.137443
		Eccentricity    0.18125
		Inclination     -46.0124
		AscendingNode   55.57
		ArgOfPericenter -162.449
		MeanAnomaly     104.997
	}
}

DwarfMoon	"Cantonica System 5.D13"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            3.29493e-008
	Radius          47.3192
	InertiaMoment   0.399114

	RotationPeriod  7854.38
	Obliquity       89.4714
	EqAscendNode    -153.704

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.423 0.419 0.417)

	Surface
	{
		SurfStyle       0.0289542
		OceanStyle      0.266484
		Randomize      (-0.868, 0.461, -0.109)
		colorDistMagn   0.860925
		colorDistFreq   1.14046
		detailScale     1292.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.442999
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63614
		terraceProb     0.34068
		erosion         0
		montesMagn      0.588774
		montesFreq      2.10597
		montesSpiky     0.847708
		montesFraction  0.564446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.91746
		hillsFraction   0.700177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244343
		craterFreq      0.229209
		craterDensity   1.02474
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.521917
		volcanoTemp     1504.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.168, 0.167, 0.000)
		colorShelf     (0.180, 0.178, 0.177, 0.000)
		colorBeach     (0.190, 0.189, 0.188, 0.000)
		colorDesert    (0.201, 0.199, 0.198, 0.000)
		colorLowland   (0.212, 0.210, 0.209, 0.000)
		colorUpland    (0.222, 0.220, 0.219, 0.000)
		colorRock      (0.233, 0.231, 0.229, 0.000)
		colorSnow      (0.243, 0.241, 0.240, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00936155
		Period          0.149337
		Eccentricity    0.247645
		Inclination     89.4714
		AscendingNode   -153.703
		ArgOfPericenter -85.6662
		MeanAnomaly     131.631
	}
}

DwarfMoon	"Cantonica System 5.D14"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            4.47175e-008
	Radius          50.111
	InertiaMoment   0.394679

	Obliquity       -57.5086
	EqAscendNode    -164.507
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.573 0.568)

	Surface
	{
		SurfStyle       0.749598
		OceanStyle      0.573622
		Randomize      (-0.706, -0.519, -0.942)
		colorDistMagn   0.997828
		colorDistFreq   2.19512
		detailScale     1368.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.225916
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501374
		terraceProb     0.118553
		erosion         0
		montesMagn      0.515165
		montesFreq      3.23714
		montesSpiky     0.957691
		montesFraction  0.744483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.83216
		hillsFraction   0.858675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251427
		craterFreq      0.190643
		craterDensity   0.869239
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510307
		volcanoTemp     1632.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.195, 0.159, 0.000)
		colorShelf     (0.230, 0.201, 0.182, 0.000)
		colorBeach     (0.271, 0.235, 0.216, 0.000)
		colorDesert    (0.294, 0.252, 0.210, 0.000)
		colorLowland   (0.323, 0.269, 0.238, 0.000)
		colorUpland    (0.357, 0.327, 0.289, 0.000)
		colorRock      (0.386, 0.355, 0.312, 0.000)
		colorSnow      (0.421, 0.378, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00957068
		Period          0.154369
		Eccentricity    0.232691
		Inclination     -57.5087
		AscendingNode   -164.507
		ArgOfPericenter -75.9086
		MeanAnomaly     -167.943
	}
}

DwarfMoon	"Cantonica System 5.D15"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            6.07484e-008
	Radius          53.2643
	InertiaMoment   0.398161

	Obliquity       -6.02105
	EqAscendNode    102.036
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.484 0.480)

	Surface
	{
		SurfStyle       0.249746
		OceanStyle      0.800076
		Randomize      (0.888, 0.324, 0.089)
		colorDistMagn   0.921191
		colorDistFreq   1.86665
		detailScale     1454.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.131686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67862
		terraceProb     0.398517
		erosion         0
		montesMagn      0.585124
		montesFreq      3.07626
		montesSpiky     0.886917
		montesFraction  0.725978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.87872
		hillsFraction   0.736774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239141
		craterFreq      0.213089
		craterDensity   1.00715
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530715
		volcanoTemp     1522.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.194, 0.192, 0.000)
		colorShelf     (0.210, 0.206, 0.204, 0.000)
		colorBeach     (0.222, 0.218, 0.216, 0.000)
		colorDesert    (0.234, 0.230, 0.228, 0.000)
		colorLowland   (0.247, 0.242, 0.240, 0.000)
		colorUpland    (0.259, 0.254, 0.252, 0.000)
		colorRock      (0.271, 0.266, 0.264, 0.000)
		colorSnow      (0.284, 0.278, 0.276, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0101438
		Period          0.168442
		Eccentricity    0.450624
		Inclination     -6.02105
		AscendingNode   102.036
		ArgOfPericenter 133.914
		MeanAnomaly     -26.5273
	}
}

DwarfMoon	"Cantonica System 5.D16"
{
	ParentBody     "Cantonica System 5"
	Class	       "Asteroid"

	Mass            8.268e-008
	Radius          75.8377
	InertiaMoment   0.39925

	Obliquity       53.1425
	EqAscendNode    -72.9849
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.732 0.730)

	Surface
	{
		SurfStyle       0.0539428
		OceanStyle      0.345065
		Randomize      (-0.448, 0.799, -0.837)
		colorDistMagn   0.57006
		colorDistFreq   4.58659
		detailScale     2070.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344705
		terraceProb     0.164358
		erosion         0
		montesMagn      0.49216
		montesFreq      2.47766
		montesSpiky     0.882687
		montesFraction  0.526056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.6952
		hillsFraction   0.615863
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.184293
		craterFreq      0.238224
		craterDensity   0.817612
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512787
		volcanoTemp     1641.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.292, 0.000)
		colorShelf     (0.313, 0.311, 0.310, 0.000)
		colorBeach     (0.331, 0.329, 0.329, 0.000)
		colorDesert    (0.350, 0.348, 0.347, 0.000)
		colorLowland   (0.368, 0.366, 0.365, 0.000)
		colorUpland    (0.386, 0.384, 0.383, 0.000)
		colorRock      (0.405, 0.403, 0.402, 0.000)
		colorSnow      (0.423, 0.421, 0.420, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0104899
		Period          0.177134
		Eccentricity    0.490153
		Inclination     53.1425
		AscendingNode   -72.9849
		ArgOfPericenter -108
		MeanAnomaly     173.083
	}
}

Planet	"Cantonica System 6"
{
	ParentBody     "Cantonica System"
	Class	       "IceGiant"

	Mass            15.2218
	Radius          20231.3
	InertiaMoment   0.261799

	Oblateness      0.0255597

	RotationPeriod  11.0916
	Obliquity       -57.2473
	EqAscendNode    -3.17441

	AlbedoBond      0.489606
	AlbedoGeom      0.587527
	Brightness      2

	Surface
	{
		SurfStyle       0.731607
		Randomize      (-0.571, -0.616, -0.738)
		detailScale     52036
		colorConversion true
		tropicLatitude  0.836523
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.99282
		stripeFluct     0.47103
		stripeTwist     11.5233
		cycloneMagn     9.09302
		cycloneFreq     0.440157
		cycloneDensity  0.315967
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
		BumpHeight      16.2602
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          90.6816
		Velocity        947.654
		BumpHeight      67.4825
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.967981
		mainOctaves     12
		Coverage        0.448031
		stripeZones     4.99282
		stripeFluct     0.47103
		stripeTwist     11.5233
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          202.313
		Density         1046.87
		Pressure        161260
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0192977
		Saturation      0.557056

		Composition
		{
			H2    	92.6586
			He    	6.91115
			CH4   	0.377291
			N2    	0.0352776
			O2    	0.00958481
			C2H2  	0.00404884
			Ne    	0.00125971
			C2H4  	0.00124197
			Ar    	0.00078511
			C2H6  	0.000755846
		}
	}

	Aurora
	{
		Height      194.279
		NorthLat    51.7751
		NorthLon    77.2266
		NorthRadius 4770.47
		NorthWidth  1402.92
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -74.8296
		SouthLon    275.813
		SouthRadius 5024.34
		SouthWidth  773.675
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
		SemiMajorAxis   2.90713
		Period          4.93955
		Eccentricity    0.0217882
		Inclination     0.473492
		AscendingNode   3.63996
		ArgOfPericenter 45.6576
		MeanAnomaly     297.043
	}
}

DwarfMoon	"Cantonica System 6.D1"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            2.15924e-006
	Radius          201.177
	InertiaMoment   0.398638

	Oblateness      0.249

	Obliquity       -0.0046003
	EqAscendNode    68.1301
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.509 0.505)

	Surface
	{
		SurfStyle       0.265881
		OceanStyle      0.269427
		Randomize      (0.244, 0.356, 0.101)
		colorDistMagn   0.2705
		colorDistFreq   9.22173
		detailScale     5493.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629229
		terraceProb     0.131876
		erosion         0
		montesMagn      0.434853
		montesFreq      2.5871
		montesSpiky     0.915047
		montesFraction  0.464511
		dunesFraction   0
		hillsMagn       0
		hillsFreq       90.8668
		hillsFraction   0.825265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252013
		craterFreq      1.7677
		craterDensity   0.752937
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415649
		volcanoTemp     1574.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.204, 0.202, 0.000)
		colorShelf     (0.217, 0.216, 0.215, 0.000)
		colorBeach     (0.230, 0.229, 0.227, 0.000)
		colorDesert    (0.243, 0.242, 0.240, 0.000)
		colorLowland   (0.256, 0.255, 0.252, 0.000)
		colorUpland    (0.269, 0.267, 0.265, 0.000)
		colorRock      (0.281, 0.280, 0.278, 0.000)
		colorSnow      (0.294, 0.293, 0.290, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000352574
		Period          0.000981346
		Eccentricity    9.50399e-005
		Inclination     -0.0046003
		AscendingNode   68.1301
		ArgOfPericenter 93.6804
		MeanAnomaly     89.0537
	}
}

Moon	"Cantonica System 6.1"
{
	ParentBody     "Cantonica System 6"
	Class	       "Selena"

	Mass            0.0101052
	Radius          1885.53
	InertiaMoment   0.375902

	Oblateness      0.0111732

	Obliquity       0.217757
	EqAscendNode    34.9092
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.733 0.660 0.632)

	Surface
	{
		SurfStyle       0.249355
		OceanStyle      0.484505
		Randomize      (-0.474, 0.702, -0.911)
		colorDistMagn   0.0608683
		colorDistFreq   234.374
		detailScale     4849.69
		colorConversion true
		drivenDarkening 0
		seaLevel        0.119644
		snowLevel       2
		tropicLatitude  0.00725056
		icecapLatitude  0.475099
		icecapHeight    0.140462
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.08186
		venusFreq       0.703343
		venusMagn       0
		mareFreq        0.98013
		mareDensity     0.00160718
		terraceProb     0.465441
		erosion         0
		montesMagn      0.0884522
		montesFreq      105.871
		montesSpiky     0.993865
		montesFraction  0.444989
		dunesMagn       0.0236641
		dunesFreq       2503.47
		dunesFraction   0.747478
		hillsMagn       0.103436
		hillsFreq       259.413
		hillsFraction   0.60997
		hills2Fraction  0
		riversMagn      60.7428
		riversFreq      3.28603
		riversSin       6.00868
		riversOctaves   0
		canyonsMagn     0.64308
		canyonsFreq     0.708117
		canyonFraction  0.348969
		cracksMagn      0.0346062
		cracksFreq      0.642636
		cracksOctaves   0
		craterMagn      0.541217
		craterFreq      5.86214
		craterDensity   0.77637
		craterOctaves   9.95545
		craterRayedFactor 0.206547
		volcanoMagn     0.302381
		volcanoFreq     0.709763
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.236932
		volcanoRadius   0.222259
		volcanoTemp     1947.98
		lavaCoverTidal  0.10551
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.367, 0.330, 0.316, 0.000)
		colorDesert    (0.455, 0.396, 0.360, 0.200)
		colorLowland   (0.491, 0.422, 0.404, 0.500)
		colorUpland    (0.513, 0.442, 0.417, 0.800)
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
		SemiMajorAxis   0.000674677
		Period          0.00259684
		Eccentricity    0.00221013
		Inclination     0.217757
		AscendingNode   34.9092
		ArgOfPericenter 23.423
		MeanAnomaly     74.1813
	}
}

Moon	"Cantonica System 6.2"
{
	ParentBody     "Cantonica System 6"
	Class	       "Selena"

	Mass            0.013127
	Radius          1932.75
	InertiaMoment   0.36953

	Oblateness      0.00215184

	Obliquity       0.488935
	EqAscendNode    19.5987
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.472 0.409 0.339)

	Surface
	{
		SurfStyle       0.162913
		OceanStyle      0.772964
		Randomize      (-0.053, 0.481, 0.947)
		colorDistMagn   0.0783726
		colorDistFreq   246.39
		detailScale     4971.14
		colorConversion true
		drivenDarkening 0
		seaLevel        0.167538
		snowLevel       2
		tropicLatitude  0.0168185
		icecapLatitude  0.954878
		icecapHeight    0.169918
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.94209
		venusFreq       0.418951
		venusMagn       0
		mareFreq        1.10088
		mareDensity     0.00215821
		terraceProb     0.399179
		erosion         0
		montesMagn      0.09654
		montesFreq      78.8613
		montesSpiky     0.930807
		montesFraction  0.103294
		dunesMagn       0.0502442
		dunesFreq       2463.46
		dunesFraction   0.572177
		hillsMagn       0.128607
		hillsFreq       188.805
		hillsFraction   0.819892
		hills2Fraction  0
		riversMagn      63.6067
		riversFreq      2.68416
		riversSin       6.09705
		riversOctaves   0
		canyonsMagn     0.407338
		canyonsFreq     0.60965
		canyonFraction  0.523021
		cracksMagn      0.0339563
		cracksFreq      0.855946
		cracksOctaves   0
		craterMagn      0.579692
		craterFreq      5.30967
		craterDensity   0.905443
		craterOctaves   10.8744
		craterRayedFactor 0
		volcanoMagn     0.328644
		volcanoFreq     0.93529
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.252385
		volcanoRadius   0.246164
		volcanoTemp     1328.79
		lavaCoverTidal  0.0126919
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.236, 0.205, 0.169, 0.000)
		colorDesert    (0.293, 0.246, 0.193, 0.200)
		colorLowland   (0.317, 0.262, 0.217, 0.500)
		colorUpland    (0.331, 0.274, 0.224, 0.800)
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
		SemiMajorAxis   0.00108895
		Period          0.00532439
		Eccentricity    0.00455458
		Inclination     0.488935
		AscendingNode   19.5987
		ArgOfPericenter 107.75
		MeanAnomaly     -152.544
	}
}

Moon	"Cantonica System 6.3"
{
	ParentBody     "Cantonica System 6"
	Class	       "IceWorld"

	Mass            5.67268e-005
	Radius          295.103
	InertiaMoment   0.395554

	Obliquity       -0.653843
	EqAscendNode    85.1395
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.787 0.653 0.544)

	Surface
	{
		SurfStyle       0.91315
		OceanStyle      0.968284
		Randomize      (0.534, -0.849, -0.816)
		colorDistMagn   0.0726873
		colorDistFreq   29.2805
		detailScale     759.021
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.214766
		snowLevel       2
		tropicLatitude  0.0168079
		icecapLatitude  0.994166
		icecapHeight    0.21522
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.9433
		venusFreq       0.436943
		venusMagn       0
		mareFreq        0
		mareDensity     0.000113598
		terraceProb     0.446413
		erosion         0
		montesMagn      0.0495845
		montesFreq      13.9773
		montesSpiky     0.968557
		montesFraction  0.363192
		dunesMagn       0.0568219
		dunesFreq       380.641
		dunesFraction   0.81111
		hillsMagn       0.123236
		hillsFreq       34.1956
		hillsFraction   0.782594
		hills2Fraction  0.118011
		riversMagn      56.9651
		riversFreq      2.86212
		riversSin       6.01969
		riversOctaves   0
		canyonsMagn     0.342262
		canyonsFreq     0.0951121
		canyonFraction  0
		cracksMagn      0.0447444
		cracksFreq      0.062585
		cracksOctaves   0
		craterMagn      0.748567
		craterFreq      0.922819
		craterDensity   0.969758
		craterOctaves   8
		craterRayedFactor 0.0519664
		volcanoMagn     0.190322
		volcanoFreq     0.672036
		volcanoDensity  0.148637
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.235482
		volcanoRadius   0.153817
		volcanoTemp     1808.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.598, 0.464, 0.316, 1.000)
		colorShelf     (0.598, 0.464, 0.316, 1.000)
		colorBeach     (0.551, 0.405, 0.272, 1.000)
		colorDesert    (0.551, 0.405, 0.272, 1.000)
		colorLowland   (0.669, 0.529, 0.414, 1.000)
		colorUpland    (0.701, 0.581, 0.468, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.669, 0.529, 0.414, 1.000)
		colorUpPlants  (0.701, 0.581, 0.468, 1.000)
		BumpHeight      14.7551
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
		SemiMajorAxis   0.00175759
		Period          0.0109225
		Eccentricity    0.0325738
		Inclination     -0.653843
		AscendingNode   85.1395
		ArgOfPericenter -105.957
		MeanAnomaly     82.3875
	}
}

Moon	"Cantonica System 6.4"
{
	ParentBody     "Cantonica System 6"
	Class	       "IceWorld"

	Mass            1.61825e-005
	Radius          223.377
	InertiaMoment   0.399606

	Obliquity       -1.23572
	EqAscendNode    4.20357
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.701 0.694 0.693)

	Surface
	{
		SurfStyle       0.360931
		OceanStyle      0.464162
		Randomize      (0.672, -0.993, -0.002)
		colorDistMagn   0.0519373
		colorDistFreq   27.1789
		detailScale     574.539
		colorConversion true
		drivenDarkening 0.667414
		seaLevel        0.198513
		snowLevel       2
		tropicLatitude  0.0430917
		icecapLatitude  0.556775
		icecapHeight    0.246132
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.56076
		venusFreq       1.11143
		venusMagn       0
		mareFreq        0
		mareDensity     2.97453e-005
		terraceProb     0.41539
		erosion         0
		montesMagn      0.0692155
		montesFreq      10.1376
		montesSpiky     0.83924
		montesFraction  0.711453
		dunesMagn       0.047407
		dunesFreq       290.772
		dunesFraction   0.0475631
		hillsMagn       0.114049
		hillsFreq       26.5184
		hillsFraction   0.192308
		hills2Fraction  0.036467
		riversMagn      63.0354
		riversFreq      3.1873
		riversSin       7.54073
		riversOctaves   0
		canyonsMagn     0.510061
		canyonsFreq     0.0745343
		canyonFraction  0
		cracksMagn      0.0619936
		cracksFreq      0.129553
		cracksOctaves   0
		craterMagn      0.996189
		craterFreq      0.466449
		craterDensity   0.882776
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.163516
		volcanoFreq     0.668935
		volcanoDensity  0.221139
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.341524
		volcanoRadius   0.131051
		volcanoTemp     1304.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.701, 0.694, 0.693, 0.500)
		colorShelf     (0.666, 0.660, 0.658, 0.500)
		colorBeach     (0.491, 0.486, 0.485, 0.750)
		colorDesert    (0.596, 0.590, 0.589, 1.000)
		colorLowland   (0.617, 0.611, 0.609, 1.000)
		colorUpland    (0.652, 0.646, 0.644, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.617, 0.611, 0.609, 1.000)
		colorUpPlants  (0.652, 0.646, 0.644, 1.000)
		BumpHeight      11.1689
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
		SemiMajorAxis   0.00283681
		Period          0.0223971
		Eccentricity    0.00380136
		Inclination     -1.23572
		AscendingNode   4.20357
		ArgOfPericenter 32.6048
		MeanAnomaly     65.7052
	}
}

DwarfMoon	"Cantonica System 6.D2"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            5.34246e-011
	Radius          5.52076
	InertiaMoment   0.397677

	RotationPeriod  6489.99
	Obliquity       -39.8891
	EqAscendNode    30.7516

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.554 0.496)

	Surface
	{
		SurfStyle       0.723331
		OceanStyle      0.702501
		Randomize      (0.495, -0.020, -0.767)
		colorDistMagn   0.81466
		colorDistFreq   0.01027
		detailScale     150.754
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971926
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399503
		terraceProb     0.301404
		erosion         0
		montesMagn      0.548153
		montesFreq      2.90803
		montesSpiky     0.99809
		montesFraction  0.423843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0718953
		hillsFraction   0.466231
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225029
		craterFreq      0.180101
		craterDensity   0.86865
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.599328
		volcanoTemp     1554.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.188, 0.139, 0.000)
		colorShelf     (0.273, 0.194, 0.159, 0.000)
		colorBeach     (0.321, 0.227, 0.189, 0.000)
		colorDesert    (0.349, 0.244, 0.184, 0.000)
		colorLowland   (0.383, 0.260, 0.208, 0.000)
		colorUpland    (0.424, 0.316, 0.253, 0.000)
		colorRock      (0.458, 0.343, 0.273, 0.000)
		colorSnow      (0.499, 0.365, 0.288, 1.000)
		BumpHeight      4.96869
		BumpOffset      0.993737
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0140472
		Period          0.246792
		Eccentricity    0.485391
		Inclination     -39.8891
		AscendingNode   30.7516
		ArgOfPericenter 9.99461
		MeanAnomaly     -82.3416
	}
}

DwarfMoon	"Cantonica System 6.D3"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            9.13594e-011
	Radius          6.32472
	InertiaMoment   0.398938

	Obliquity       34.9929
	EqAscendNode    -88.9926
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.606 0.556)

	Surface
	{
		SurfStyle       0.746399
		OceanStyle      0.412324
		Randomize      (-0.538, -0.111, 0.354)
		colorDistMagn   0.124453
		colorDistFreq   0.0207516
		detailScale     172.707
		colorConversion true
		snowLevel       2
		tropicLatitude  0.746537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500659
		terraceProb     0.463464
		erosion         0
		montesMagn      0.526848
		montesFreq      2.73011
		montesSpiky     0.904381
		montesFraction  0.515508
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.111887
		hillsFraction   0.544109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242658
		craterFreq      0.163118
		craterDensity   0.851766
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541835
		volcanoTemp     1723.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.206, 0.156, 0.000)
		colorShelf     (0.298, 0.212, 0.178, 0.000)
		colorBeach     (0.350, 0.249, 0.211, 0.000)
		colorDesert    (0.379, 0.267, 0.206, 0.000)
		colorLowland   (0.417, 0.285, 0.234, 0.000)
		colorUpland    (0.461, 0.346, 0.284, 0.000)
		colorRock      (0.498, 0.376, 0.306, 0.000)
		colorSnow      (0.543, 0.400, 0.323, 1.000)
		BumpHeight      5.69225
		BumpOffset      1.13845
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0146253
		Period          0.262182
		Eccentricity    0.459107
		Inclination     34.9929
		AscendingNode   -88.9926
		ArgOfPericenter -152.896
		MeanAnomaly     -3.06761
	}
}

DwarfMoon	"Cantonica System 6.D4"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            1.4913e-010
	Radius          7.13955
	InertiaMoment   0.399863

	Obliquity       -12.7399
	EqAscendNode    31.3688
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.639 0.598)

	Surface
	{
		SurfStyle       0.0350116
		OceanStyle      0.959483
		Randomize      (0.829, -0.476, 0.023)
		colorDistMagn   0.455691
		colorDistFreq   0.0418031
		detailScale     194.957
		colorConversion true
		snowLevel       2
		tropicLatitude  0.414946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582911
		terraceProb     0.280378
		erosion         0
		montesMagn      0.610317
		montesFreq      3.23259
		montesSpiky     0.941482
		montesFraction  0.646085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.184555
		hillsFraction   0.911002
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226388
		craterFreq      0.200656
		craterDensity   0.943772
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.587523
		volcanoTemp     1765.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.256, 0.239, 0.000)
		colorShelf     (0.289, 0.272, 0.254, 0.000)
		colorBeach     (0.306, 0.288, 0.269, 0.000)
		colorDesert    (0.323, 0.304, 0.284, 0.000)
		colorLowland   (0.340, 0.320, 0.299, 0.000)
		colorUpland    (0.357, 0.336, 0.314, 0.000)
		colorRock      (0.374, 0.352, 0.329, 0.000)
		colorSnow      (0.391, 0.368, 0.344, 1.000)
		BumpHeight      6.4256
		BumpOffset      1.28512
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0152822
		Period          0.280043
		Eccentricity    0.366949
		Inclination     -12.7399
		AscendingNode   31.3688
		ArgOfPericenter -65.8292
		MeanAnomaly     -160.326
	}
}

DwarfMoon	"Cantonica System 6.D5"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            2.34814e-010
	Radius          10.0637
	InertiaMoment   0.397907

	RotationPeriod  6306.94
	Obliquity       -64.6699
	EqAscendNode    -122.649

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.611 0.607)

	Surface
	{
		SurfStyle       0.0626764
		OceanStyle      0.712157
		Randomize      (-0.895, -0.585, 0.124)
		colorDistMagn   0.59736
		colorDistFreq   0.0738269
		detailScale     274.806
		colorConversion true
		snowLevel       2
		tropicLatitude  0.781599
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632142
		terraceProb     0.237308
		erosion         0
		montesMagn      0.438773
		montesFreq      3.58149
		montesSpiky     0.986778
		montesFraction  0.664258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.259622
		hillsFraction   0.457909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213527
		craterFreq      0.210179
		craterDensity   0.762533
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.600143
		volcanoTemp     1763.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.243, 0.000)
		colorShelf     (0.263, 0.260, 0.258, 0.000)
		colorBeach     (0.278, 0.275, 0.273, 0.000)
		colorDesert    (0.294, 0.290, 0.288, 0.000)
		colorLowland   (0.309, 0.306, 0.304, 0.000)
		colorUpland    (0.325, 0.321, 0.319, 0.000)
		colorRock      (0.340, 0.336, 0.334, 0.000)
		colorSnow      (0.355, 0.351, 0.349, 1.000)
		BumpHeight      9.05732
		BumpOffset      1.81146
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.015563
		Period          0.287797
		Eccentricity    0.363461
		Inclination     -64.6699
		AscendingNode   -122.649
		ArgOfPericenter -55.0872
		MeanAnomaly     -2.3188
	}
}

DwarfMoon	"Cantonica System 6.D6"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            3.59297e-010
	Radius          10.4973
	InertiaMoment   0.399079

	Obliquity       -77.1259
	EqAscendNode    -39.7149
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.590 0.587)

	Surface
	{
		SurfStyle       0.616757
		OceanStyle      0.108351
		Randomize      (0.738, -0.548, 0.063)
		colorDistMagn   0.514161
		colorDistFreq   0.0642951
		detailScale     286.647
		colorConversion true
		snowLevel       2
		tropicLatitude  0.73191
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.7025
		terraceProb     0.179985
		erosion         0
		montesMagn      0.508569
		montesFreq      3.13932
		montesSpiky     0.852539
		montesFraction  0.949092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.325753
		hillsFraction   0.498256
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274544
		craterFreq      0.235058
		craterDensity   0.817795
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444265
		volcanoTemp     1625.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.201, 0.164, 0.000)
		colorShelf     (0.237, 0.206, 0.188, 0.000)
		colorBeach     (0.279, 0.242, 0.223, 0.000)
		colorDesert    (0.302, 0.260, 0.217, 0.000)
		colorLowland   (0.332, 0.277, 0.246, 0.000)
		colorUpland    (0.368, 0.336, 0.299, 0.000)
		colorRock      (0.397, 0.366, 0.323, 0.000)
		colorSnow      (0.433, 0.389, 0.340, 1.000)
		BumpHeight      9.44759
		BumpOffset      1.88952
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0157856
		Period          0.293993
		Eccentricity    0.311228
		Inclination     -77.1259
		AscendingNode   -39.7149
		ArgOfPericenter -104.144
		MeanAnomaly     9.76159
	}
}

DwarfMoon	"Cantonica System 6.D7"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            5.3719e-010
	Radius          11.4801
	InertiaMoment   0.399988

	RotationPeriod  5353.79
	Obliquity       66.3932
	EqAscendNode    -61.7498

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.514 0.508)

	Surface
	{
		SurfStyle       0.743049
		OceanStyle      0.599328
		Randomize      (-0.302, -0.787, -0.120)
		colorDistMagn   0.69563
		colorDistFreq   0.0713022
		detailScale     313.483
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540761
		terraceProb     0.18246
		erosion         0
		montesMagn      0.471897
		montesFreq      3.22384
		montesSpiky     0.930969
		montesFraction  0.690075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.324681
		hillsFraction   0.693467
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228351
		craterFreq      0.20588
		craterDensity   0.673832
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470038
		volcanoTemp     1490.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.175, 0.142, 0.000)
		colorShelf     (0.208, 0.180, 0.162, 0.000)
		colorBeach     (0.244, 0.211, 0.193, 0.000)
		colorDesert    (0.265, 0.226, 0.188, 0.000)
		colorLowland   (0.291, 0.242, 0.213, 0.000)
		colorUpland    (0.322, 0.293, 0.259, 0.000)
		colorRock      (0.348, 0.319, 0.279, 0.000)
		colorSnow      (0.379, 0.339, 0.294, 1.000)
		BumpHeight      10.3321
		BumpOffset      2.06642
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0161906
		Period          0.305379
		Eccentricity    0.124964
		Inclination     66.3932
		AscendingNode   -61.7497
		ArgOfPericenter -80.1823
		MeanAnomaly     43.523
	}
}

DwarfMoon	"Cantonica System 6.D8"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            7.88059e-010
	Radius          12.5196
	InertiaMoment   0.398112

	Obliquity       76.1045
	EqAscendNode    169.181
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.533 0.470)

	Surface
	{
		SurfStyle       0.734253
		OceanStyle      0.452672
		Randomize      (-0.337, 0.314, -0.362)
		colorDistMagn   0.380457
		colorDistFreq   0.0993343
		detailScale     341.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.18226
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40432
		terraceProb     0.101025
		erosion         0
		montesMagn      0.315582
		montesFreq      3.18573
		montesSpiky     0.741384
		montesFraction  0.429777
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.458195
		hillsFraction   0.671054
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265564
		craterFreq      0.255592
		craterDensity   1.0186
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490055
		volcanoTemp     1682.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.181, 0.132, 0.000)
		colorShelf     (0.281, 0.186, 0.150, 0.000)
		colorBeach     (0.330, 0.218, 0.179, 0.000)
		colorDesert    (0.358, 0.234, 0.174, 0.000)
		colorLowland   (0.393, 0.250, 0.197, 0.000)
		colorUpland    (0.435, 0.304, 0.240, 0.000)
		colorRock      (0.470, 0.330, 0.258, 0.000)
		colorSnow      (0.512, 0.352, 0.273, 1.000)
		BumpHeight      11.2677
		BumpOffset      2.25354
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0168362
		Period          0.323827
		Eccentricity    0.394275
		Inclination     76.1045
		AscendingNode   169.181
		ArgOfPericenter -35.9247
		MeanAnomaly     164.212
	}
}

DwarfMoon	"Cantonica System 6.D9"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            1.13806e-009
	Radius          18.3293
	InertiaMoment   0.399216

	Obliquity       -24.2605
	EqAscendNode    112.832
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.810 0.775 0.745)

	Surface
	{
		SurfStyle       0.627521
		OceanStyle      0.941248
		Randomize      (0.147, -0.700, -0.869)
		colorDistMagn   0.157911
		colorDistFreq   0.164688
		detailScale     500.512
		colorConversion true
		snowLevel       2
		tropicLatitude  0.442673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548455
		terraceProb     0.352414
		erosion         0
		montesMagn      0.295876
		montesFreq      3.65037
		montesSpiky     0.937841
		montesFraction  0.228408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.803802
		hillsFraction   0.6075
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260286
		craterFreq      0.204478
		craterDensity   0.847485
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539647
		volcanoTemp     1702.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.263, 0.209, 0.000)
		colorShelf     (0.324, 0.271, 0.239, 0.000)
		colorBeach     (0.381, 0.318, 0.283, 0.000)
		colorDesert    (0.413, 0.341, 0.276, 0.000)
		colorLowland   (0.454, 0.364, 0.313, 0.000)
		colorUpland    (0.502, 0.442, 0.380, 0.000)
		colorRock      (0.543, 0.480, 0.410, 0.000)
		colorSnow      (0.591, 0.511, 0.432, 1.000)
		BumpHeight      16.4964
		BumpOffset      3.29928
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.017393
		Period          0.340023
		Eccentricity    0.388853
		Inclination     -24.2605
		AscendingNode   112.832
		ArgOfPericenter -41.2311
		MeanAnomaly     29.6685
	}
}

DwarfMoon	"Cantonica System 6.D10"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            1.62216e-009
	Radius          17.4877
	InertiaMoment   0.395991

	Obliquity       -25.0114
	EqAscendNode    72.1905
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.608 0.603 0.600)

	Surface
	{
		SurfStyle       0.763998
		OceanStyle      0.348758
		Randomize      (0.425, 0.966, 0.457)
		colorDistMagn   0.604367
		colorDistFreq   0.156627
		detailScale     477.532
		colorConversion true
		snowLevel       2
		tropicLatitude  0.642164
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.490843
		terraceProb     0.444151
		erosion         0
		montesMagn      0.373589
		montesFreq      3.26166
		montesSpiky     0.934645
		montesFraction  0.869805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.80328
		hillsFraction   0.628417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27677
		craterFreq      0.217111
		craterDensity   0.835261
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530799
		volcanoTemp     1228.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.205, 0.168, 0.000)
		colorShelf     (0.243, 0.211, 0.192, 0.000)
		colorBeach     (0.286, 0.247, 0.228, 0.000)
		colorDesert    (0.310, 0.265, 0.222, 0.000)
		colorLowland   (0.341, 0.283, 0.252, 0.000)
		colorUpland    (0.377, 0.344, 0.306, 0.000)
		colorRock      (0.407, 0.374, 0.330, 0.000)
		colorSnow      (0.444, 0.398, 0.348, 1.000)
		BumpHeight      15.739
		BumpOffset      3.14779
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0178885
		Period          0.354655
		Eccentricity    0.0219432
		Inclination     -25.0114
		AscendingNode   72.1905
		ArgOfPericenter -27.7924
		MeanAnomaly     -13.2406
	}
}

DwarfMoon	"Cantonica System 6.D11"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            2.28704e-009
	Radius          18.7126
	InertiaMoment   0.398299

	RotationPeriod  9608.43
	Obliquity       -57.4537
	EqAscendNode    -86.3565

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.495 0.490 0.484)

	Surface
	{
		SurfStyle       0.0622748
		OceanStyle      0.124537
		Randomize      (-0.994, 0.992, 0.354)
		colorDistMagn   0.11002
		colorDistFreq   0.173354
		detailScale     510.979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969708
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370474
		terraceProb     0.388084
		erosion         0
		montesMagn      0.500541
		montesFreq      3.2507
		montesSpiky     0.980446
		montesFraction  0.0873872
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.84992
		hillsFraction   0.721185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213972
		craterFreq      0.184276
		craterDensity   0.79888
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421763
		volcanoTemp     1480.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.194, 0.000)
		colorShelf     (0.211, 0.208, 0.206, 0.000)
		colorBeach     (0.223, 0.221, 0.218, 0.000)
		colorDesert    (0.235, 0.233, 0.230, 0.000)
		colorLowland   (0.248, 0.245, 0.242, 0.000)
		colorUpland    (0.260, 0.257, 0.254, 0.000)
		colorRock      (0.272, 0.270, 0.266, 0.000)
		colorSnow      (0.285, 0.282, 0.278, 1.000)
		BumpHeight      16.8414
		BumpOffset      3.36827
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0182472
		Period          0.365375
		Eccentricity    0.391511
		Inclination     -57.4537
		AscendingNode   -86.3565
		ArgOfPericenter -144.902
		MeanAnomaly     -155.095
	}
}

DwarfMoon	"Cantonica System 6.D12"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            3.1952e-009
	Radius          20.0902
	InertiaMoment   0.399349

	Obliquity       11.5517
	EqAscendNode    -73.6329
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.617 0.615)

	Surface
	{
		SurfStyle       0.669485
		OceanStyle      0.60991
		Randomize      (-0.048, 0.931, 0.170)
		colorDistMagn   0.983026
		colorDistFreq   0.316309
		detailScale     548.598
		colorConversion true
		snowLevel       2
		tropicLatitude  0.31648
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328859
		terraceProb     0.158442
		erosion         0
		montesMagn      0.537196
		montesFreq      3.17583
		montesSpiky     0.993834
		montesFraction  0.208365
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.986483
		hillsFraction   0.63942
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270832
		craterFreq      0.238061
		craterDensity   0.779049
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513943
		volcanoTemp     1365.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.210, 0.172, 0.000)
		colorShelf     (0.248, 0.216, 0.197, 0.000)
		colorBeach     (0.291, 0.253, 0.234, 0.000)
		colorDesert    (0.316, 0.272, 0.228, 0.000)
		colorLowland   (0.347, 0.290, 0.258, 0.000)
		colorUpland    (0.384, 0.352, 0.314, 0.000)
		colorRock      (0.415, 0.383, 0.338, 0.000)
		colorSnow      (0.452, 0.407, 0.357, 1.000)
		BumpHeight      18.0812
		BumpOffset      3.61624
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0188041
		Period          0.382231
		Eccentricity    0.19561
		Inclination     11.5517
		AscendingNode   -73.6328
		ArgOfPericenter -169.535
		MeanAnomaly     173.64
	}
}

DwarfMoon	"Cantonica System 6.D13"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            4.43033e-009
	Radius          20.8868
	InertiaMoment   0.396659

	RotationPeriod  6878.9
	Obliquity       45.7175
	EqAscendNode    137.342

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.483 0.481)

	Surface
	{
		SurfStyle       0.864776
		OceanStyle      0.85031
		Randomize      (0.329, -0.868, 0.676)
		colorDistMagn   0.857727
		colorDistFreq   0.0836762
		detailScale     570.348
		colorConversion true
		snowLevel       2
		tropicLatitude  0.502814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417737
		terraceProb     0.105109
		erosion         0
		montesMagn      0.634711
		montesFreq      3.08777
		montesSpiky     0.908067
		montesFraction  0.460504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.02529
		hillsFraction   0.830901
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238008
		craterFreq      0.274774
		craterDensity   0.885844
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.389532
		volcanoTemp     1466.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.169, 0.192, 0.050)
		colorShelf     (0.195, 0.198, 0.221, 0.040)
		colorBeach     (0.225, 0.227, 0.250, 0.030)
		colorDesert    (0.254, 0.256, 0.284, 0.020)
		colorLowland   (0.283, 0.285, 0.313, 0.030)
		colorUpland    (0.313, 0.314, 0.342, 0.050)
		colorRock      (0.342, 0.343, 0.380, 0.020)
		colorSnow      (0.342, 0.343, 0.380, 1.000)
		BumpHeight      18.7981
		BumpOffset      3.75962
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0191352
		Period          0.392371
		Eccentricity    0.259467
		Inclination     45.7175
		AscendingNode   137.342
		ArgOfPericenter -63.9674
		MeanAnomaly     97.1442
	}
}

DwarfMoon	"Cantonica System 6.D14"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            6.10482e-009
	Radius          27.4404
	InertiaMoment   0.398472

	RotationPeriod  10532.7
	Obliquity       34.3015
	EqAscendNode    62.7656

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.422 0.418 0.414)

	Surface
	{
		SurfStyle       0.370772
		OceanStyle      0.641882
		Randomize      (0.088, 0.017, -0.689)
		colorDistMagn   0.16748
		colorDistFreq   0.661716
		detailScale     749.306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.843534
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672021
		terraceProb     0.471782
		erosion         0
		montesMagn      0.483269
		montesFreq      3.01911
		montesSpiky     0.943656
		montesFraction  0.535699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.63418
		hillsFraction   0.732151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266039
		craterFreq      0.236995
		craterDensity   0.951243
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421683
		volcanoTemp     1584.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.167, 0.166, 0.000)
		colorShelf     (0.179, 0.178, 0.176, 0.000)
		colorBeach     (0.190, 0.188, 0.186, 0.000)
		colorDesert    (0.200, 0.199, 0.197, 0.000)
		colorLowland   (0.211, 0.209, 0.207, 0.000)
		colorUpland    (0.221, 0.220, 0.217, 0.000)
		colorRock      (0.232, 0.230, 0.228, 0.000)
		colorSnow      (0.242, 0.241, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0193994
		Period          0.400523
		Eccentricity    0.212759
		Inclination     34.3015
		AscendingNode   62.7656
		ArgOfPericenter 147.025
		MeanAnomaly     55.2097
	}
}

DwarfMoon	"Cantonica System 6.D15"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            8.37002e-009
	Radius          29.0051
	InertiaMoment   0.39948

	Obliquity       -24.7401
	EqAscendNode    -80.1387
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.784 0.782)

	Surface
	{
		SurfStyle       0.419008
		OceanStyle      0.89476
		Randomize      (-0.403, 0.569, 0.511)
		colorDistMagn   0.923852
		colorDistFreq   0.325405
		detailScale     792.032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.606793
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473386
		terraceProb     0.188123
		erosion         0
		montesMagn      0.420585
		montesFreq      3.66225
		montesSpiky     0.895439
		montesFraction  0.439578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.22288
		hillsFraction   0.652889
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229647
		craterFreq      0.242581
		craterDensity   0.805703
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536547
		volcanoTemp     1418.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.313, 0.313, 0.000)
		colorShelf     (0.334, 0.333, 0.332, 0.000)
		colorBeach     (0.354, 0.353, 0.352, 0.000)
		colorDesert    (0.374, 0.372, 0.371, 0.000)
		colorLowland   (0.393, 0.392, 0.391, 0.000)
		colorUpland    (0.413, 0.411, 0.410, 0.000)
		colorRock      (0.433, 0.431, 0.430, 0.000)
		colorSnow      (0.452, 0.451, 0.449, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0198471
		Period          0.414468
		Eccentricity    0.0744935
		Inclination     -24.7401
		AscendingNode   -80.1387
		ArgOfPericenter 154.329
		MeanAnomaly     -151.938
	}
}

DwarfMoon	"Cantonica System 6.D16"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            1.14305e-008
	Radius          30.9122
	InertiaMoment   0.397083

	Obliquity       -39.724
	EqAscendNode    87.8387
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.697 0.612 0.567)

	Surface
	{
		SurfStyle       0.9685
		OceanStyle      0.990829
		Randomize      (0.756, -0.256, 0.836)
		colorDistMagn   0.981475
		colorDistFreq   0.610418
		detailScale     844.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.817337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.665581
		terraceProb     0.169092
		erosion         0
		montesMagn      0.491273
		montesFreq      3.16263
		montesSpiky     0.993245
		montesFraction  0.585197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28434
		hillsFraction   0.630252
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241012
		craterFreq      0.243017
		craterDensity   0.8275
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457018
		volcanoTemp     1642.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.214, 0.227, 0.050)
		colorShelf     (0.279, 0.251, 0.261, 0.040)
		colorBeach     (0.321, 0.288, 0.295, 0.030)
		colorDesert    (0.363, 0.325, 0.334, 0.020)
		colorLowland   (0.404, 0.361, 0.368, 0.030)
		colorUpland    (0.446, 0.398, 0.402, 0.050)
		colorRock      (0.488, 0.435, 0.448, 0.020)
		colorSnow      (0.488, 0.435, 0.448, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0203931
		Period          0.431689
		Eccentricity    0.151111
		Inclination     -39.724
		AscendingNode   87.8387
		ArgOfPericenter 26.3858
		MeanAnomaly     -163.598
	}
}

DwarfMoon	"Cantonica System 6.D17"
{
	ParentBody     "Cantonica System 6"
	Class	       "Asteroid"

	Mass            1.5564e-008
	Radius          32.3635
	InertiaMoment   0.398634

	RotationPeriod  15536.7
	Obliquity       70.0948
	EqAscendNode    -34.4956

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.609 0.602)

	Surface
	{
		SurfStyle       0.382911
		OceanStyle      0.539237
		Randomize      (0.917, 0.097, 0.600)
		colorDistMagn   0.325854
		colorDistFreq   0.444218
		detailScale     883.739
		colorConversion true
		snowLevel       2
		tropicLatitude  0.790302
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690983
		terraceProb     0.156675
		erosion         0
		montesMagn      0.382103
		montesFreq      2.74397
		montesSpiky     0.832396
		montesFraction  0.314621
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.06252
		hillsFraction   0.719151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263591
		craterFreq      0.16673
		craterDensity   0.723706
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476327
		volcanoTemp     1301.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.241, 0.000)
		colorShelf     (0.260, 0.259, 0.256, 0.000)
		colorBeach     (0.276, 0.274, 0.271, 0.000)
		colorDesert    (0.291, 0.289, 0.286, 0.000)
		colorLowland   (0.306, 0.304, 0.301, 0.000)
		colorUpland    (0.322, 0.320, 0.316, 0.000)
		colorRock      (0.337, 0.335, 0.331, 0.000)
		colorSnow      (0.352, 0.350, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0207511
		Period          0.443105
		Eccentricity    0.132509
		Inclination     70.0948
		AscendingNode   -34.4956
		ArgOfPericenter -18.987
		MeanAnomaly     -65.6858
	}
}

Barycenter	"Cantonica System 7-7.1"
{
	ParentBody     "Cantonica System"
	Mass            0.0258406
	Radius          42009.5
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.43957
		Period          12.6429
		Eccentricity    0.0602259
		Inclination     -0.0493511
		AscendingNode   3.07816
		ArgOfPericenter 182.42
		MeanAnomaly     351.357
	}
}

Planet	"Cantonica System 7"
{
	ParentBody     "Cantonica System 7-7.1"
	Class	       "IceWorld"

	Mass            0.0250681
	Radius          2537.56
	InertiaMoment   0.354912

	Oblateness      0.00325761

	RotationPeriod  40.1884
	Obliquity       36.8708
	EqAscendNode    -1.52555

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.411 0.407 0.405)

	Surface
	{
		SurfStyle       0.061731
		OceanStyle      0.103195
		Randomize      (0.961, -0.249, 0.063)
		colorDistMagn   0.053031
		colorDistFreq   256.58
		detailScale     6526.75
		colorConversion true
		drivenDarkening 0
		seaLevel        0.21916
		snowLevel       2
		tropicLatitude  0.583388
		icecapLatitude  1
		icecapHeight    0.21916
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.05578
		venusFreq       0.661372
		venusMagn       0.206413
		mareFreq        1.6989
		mareDensity     0.00268539
		terraceProb     0.256506
		erosion         0
		montesMagn      0.166154
		montesFreq      132.137
		montesSpiky     0.903827
		montesFraction  0.57289
		dunesMagn       0.0240688
		dunesFreq       3347.5
		dunesFraction   0.0736908
		hillsMagn       0.106361
		hillsFreq       228.714
		hillsFraction   0.407956
		hills2Fraction  0.258496
		riversMagn      64.1463
		riversFreq      2.16306
		riversSin       5.89875
		riversOctaves   0
		canyonsMagn     0.538894
		canyonsFreq     0.736427
		canyonFraction  0
		cracksMagn      0.0689585
		cracksFreq      1.09016
		cracksOctaves   2
		craterMagn      0.624442
		craterFreq      8.99128
		craterDensity   0.859767
		craterOctaves   12
		craterRayedFactor 0.141642
		volcanoMagn     0.407843
		volcanoFreq     0.75763
		volcanoDensity  0.253498
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.277376
		volcanoRadius   0.400953
		volcanoTemp     1272.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.411, 0.407, 0.405, 0.500)
		colorShelf     (0.390, 0.387, 0.385, 0.500)
		colorBeach     (0.288, 0.285, 0.283, 0.750)
		colorDesert    (0.349, 0.346, 0.344, 1.000)
		colorLowland   (0.362, 0.358, 0.356, 1.000)
		colorUpland    (0.382, 0.379, 0.377, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.362, 0.358, 0.356, 1.000)
		colorUpPlants  (0.382, 0.379, 0.377, 1.000)
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
		SemiMajorAxis   1.52812e-005
		Period          0.0423753
		Eccentricity    0.0420662
		Inclination     -1.21415
		AscendingNode   -13.0978
		ArgOfPericenter 106.346
		MeanAnomaly     4.10183
	}
}

Moon	"Cantonica System 7.1"
{
	ParentBody     "Cantonica System 7-7.1"
	Class	       "IceWorld"

	Mass            0.000762594
	Radius          756.512
	InertiaMoment   0.397806

	Obliquity       -1.21415
	EqAscendNode    -13.0978
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.720 0.595 0.513)

	Surface
	{
		SurfStyle       0.778005
		OceanStyle      0.598887
		Randomize      (-0.237, -0.204, 0.903)
		colorDistMagn   0.0647496
		colorDistFreq   97.4206
		detailScale     1945.79
		colorConversion true
		drivenDarkening 0
		seaLevel        0.218302
		snowLevel       2
		tropicLatitude  0.042092
		icecapLatitude  0.480491
		icecapHeight    0.254682
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.04662
		venusFreq       1.46871
		venusMagn       0
		mareFreq        0.125285
		mareDensity     0.000415415
		terraceProb     0.270289
		erosion         0
		montesMagn      0.0479166
		montesFreq      47.4525
		montesSpiky     0.981819
		montesFraction  0.129185
		dunesMagn       0.0491099
		dunesFreq       1015.82
		dunesFraction   0.977589
		hillsMagn       0.118964
		hillsFreq       103.948
		hillsFraction   0.201131
		hills2Fraction  0.0596964
		riversMagn      60.6187
		riversFreq      2.798
		riversSin       4.66325
		riversOctaves   0
		canyonsMagn     0.438254
		canyonsFreq     0.304178
		canyonFraction  0
		cracksMagn      0.0415543
		cracksFreq      0.396783
		cracksOctaves   0
		craterMagn      0.582536
		craterFreq      2.48148
		craterDensity   0.868649
		craterOctaves   10
		craterRayedFactor 0.177262
		volcanoMagn     0.186476
		volcanoFreq     0.639139
		volcanoDensity  0.202224
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.298397
		volcanoRadius   0.173186
		volcanoTemp     1509.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.461, 0.381, 0.344, 0.250)
		colorShelf     (0.504, 0.434, 0.390, 0.250)
		colorBeach     (0.410, 0.321, 0.298, 0.200)
		colorDesert    (0.382, 0.291, 0.262, 0.200)
		colorLowland   (0.281, 0.226, 0.215, 0.200)
		colorUpland    (0.533, 0.440, 0.390, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.281, 0.226, 0.215, 0.200)
		colorUpPlants  (0.533, 0.440, 0.390, 0.250)
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
		SemiMajorAxis   0.000502326
		Period          0.0423753
		Eccentricity    0.0420662
		Inclination     -1.21415
		AscendingNode   -13.0978
		ArgOfPericenter -73.6536
		MeanAnomaly     4.10183
	}
}

DwarfMoon	"Cantonica System 7.D1"
{
	ParentBody     "Cantonica System 7-7.1"
	Class	       "Asteroid"

	Mass            1.23299e-006
	Radius          190.215
	InertiaMoment   0.399182

	RotationPeriod  3475.82
	Obliquity       -70.4805
	EqAscendNode    101.291

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.480 0.357)

	Surface
	{
		SurfStyle       0.248483
		OceanStyle      0.978199
		Randomize      (0.738, 0.941, -0.728)
		colorDistMagn   0.64272
		colorDistFreq   24.204
		detailScale     5194.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958355
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431621
		terraceProb     0.406132
		erosion         0
		montesMagn      0.485962
		montesFreq      3.27687
		montesSpiky     0.95548
		montesFraction  0.693286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       67.1921
		hillsFraction   0.887089
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22802
		craterFreq      1.27601
		craterDensity   1.03019
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52862
		volcanoTemp     1342.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.192, 0.143, 0.000)
		colorShelf     (0.252, 0.204, 0.152, 0.000)
		colorBeach     (0.267, 0.216, 0.160, 0.000)
		colorDesert    (0.282, 0.228, 0.169, 0.000)
		colorLowland   (0.296, 0.240, 0.178, 0.000)
		colorUpland    (0.311, 0.252, 0.187, 0.000)
		colorRock      (0.326, 0.264, 0.196, 0.000)
		colorSnow      (0.341, 0.276, 0.205, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00298194
		Period          0.594781
		Eccentricity    0.427812
		Inclination     -70.4805
		AscendingNode   101.291
		ArgOfPericenter -42.2381
		MeanAnomaly     151.88
	}
}

DwarfMoon	"Cantonica System 7.D2"
{
	ParentBody     "Cantonica System 7-7.1"
	Class	       "Asteroid"

	Mass            1.80642e-006
	Radius          181.342
	InertiaMoment   0.395721

	RotationPeriod  13794.3
	Obliquity       83.4226
	EqAscendNode    100.643

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.647 0.644)

	Surface
	{
		SurfStyle       0.085398
		OceanStyle      0.391569
		Randomize      (0.278, 0.545, 0.955)
		colorDistMagn   0.788279
		colorDistFreq   22.9084
		detailScale     4951.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980725
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401957
		terraceProb     0.129432
		erosion         0
		montesMagn      0.478225
		montesFreq      2.53946
		montesSpiky     0.99764
		montesFraction  0.512362
		dunesFraction   0
		hillsMagn       0
		hillsFreq       77.6515
		hillsFraction   0.721245
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231544
		craterFreq      0.98938
		craterDensity   0.802109
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560478
		volcanoTemp     1568.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.259, 0.258, 0.000)
		colorShelf     (0.278, 0.275, 0.274, 0.000)
		colorBeach     (0.294, 0.291, 0.290, 0.000)
		colorDesert    (0.311, 0.307, 0.306, 0.000)
		colorLowland   (0.327, 0.324, 0.322, 0.000)
		colorUpland    (0.343, 0.340, 0.338, 0.000)
		colorRock      (0.360, 0.356, 0.354, 0.000)
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
		SemiMajorAxis   0.00359349
		Period          0.786826
		Eccentricity    0.104554
		Inclination     83.4226
		AscendingNode   100.643
		ArgOfPericenter -171.225
		MeanAnomaly     -90.8838
	}
}

DwarfMoon	"Cantonica System 7.D3"
{
	ParentBody     "Cantonica System 7-7.1"
	Class	       "Asteroid"

	Mass            2.69651e-006
	Radius          197.746
	InertiaMoment   0.398253

	RotationPeriod  511.586
	Obliquity       -101.926
	EqAscendNode    99.1248

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.780 0.777)

	Surface
	{
		SurfStyle       0.849836
		OceanStyle      0.293541
		Randomize      (-0.586, -0.595, 0.301)
		colorDistMagn   0.491334
		colorDistFreq   11.307
		detailScale     5399.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990572
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36704
		terraceProb     0.316464
		erosion         0
		montesMagn      0.287947
		montesFreq      3.31799
		montesSpiky     0.913879
		montesFraction  0.551951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       57.596
		hillsFraction   0.647728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262434
		craterFreq      1.2014
		craterDensity   0.954291
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513088
		volcanoTemp     1664.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.265, 0.218, 0.000)
		colorShelf     (0.313, 0.273, 0.249, 0.000)
		colorBeach     (0.368, 0.320, 0.295, 0.000)
		colorDesert    (0.399, 0.343, 0.288, 0.000)
		colorLowland   (0.438, 0.367, 0.326, 0.000)
		colorUpland    (0.485, 0.444, 0.396, 0.000)
		colorRock      (0.524, 0.483, 0.427, 0.000)
		colorSnow      (0.571, 0.515, 0.451, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00418283
		Period          0.988099
		Eccentricity    0.310996
		Inclination     -89.284
		AscendingNode   98.2022
		ArgOfPericenter -166.518
		MeanAnomaly     -67.0809
	}
}

Moon	"Cantonica System 7.2"
{
	ParentBody     "Cantonica System 7-7.1"
	Class	       "IceWorld"

	Mass            4.11798e-006
	Radius          218.702
	InertiaMoment   0.399316

	RotationPeriod  345.109
	Obliquity       44.1392
	EqAscendNode    -109.004

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.416 0.413 0.408)

	Surface
	{
		SurfStyle       0.106847
		OceanStyle      0.977601
		Randomize      (0.844, -0.593, 0.886)
		colorDistMagn   0.0783122
		colorDistFreq   30.7654
		detailScale     562.515
		colorConversion true
		drivenDarkening 0
		seaLevel        0.202531
		snowLevel       2
		tropicLatitude  0.669354
		icecapLatitude  1
		icecapHeight    0.202531
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.54314
		venusFreq       1.03059
		venusMagn       0
		mareFreq        0
		mareDensity     2.21731e-006
		terraceProb     0.191317
		erosion         0
		montesMagn      0.0715237
		montesFreq      13.4944
		montesSpiky     0.982967
		montesFraction  0.636411
		dunesMagn       0.0282405
		dunesFreq       288.769
		dunesFraction   0.584559
		hillsMagn       0.102723
		hillsFreq       24.5613
		hillsFraction   0.740926
		hills2Fraction  0.108559
		riversMagn      62.1407
		riversFreq      2.10271
		riversSin       6.05343
		riversOctaves   0
		canyonsMagn     0.510963
		canyonsFreq     0.0516628
		canyonFraction  0
		cracksMagn      0.0610495
		cracksFreq      0.132282
		cracksOctaves   0
		craterMagn      0.985882
		craterFreq      0.49514
		craterDensity   0.82551
		craterOctaves   8
		craterRayedFactor 0.238718
		volcanoMagn     0.175242
		volcanoFreq     0.584912
		volcanoDensity  0.198148
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.268409
		volcanoRadius   0.119994
		volcanoTemp     1579.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.416, 0.413, 0.408, 0.500)
		colorShelf     (0.395, 0.392, 0.387, 0.500)
		colorBeach     (0.291, 0.289, 0.285, 0.750)
		colorDesert    (0.354, 0.351, 0.347, 1.000)
		colorLowland   (0.366, 0.364, 0.359, 1.000)
		colorUpland    (0.387, 0.384, 0.379, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.366, 0.364, 0.359, 1.000)
		colorUpPlants  (0.387, 0.384, 0.379, 1.000)
		BumpHeight      10.9351
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
		SemiMajorAxis   0.00459023
		Period          1.13589
		Eccentricity    0.37372
		Inclination     16.0082
		AscendingNode   -106.058
		ArgOfPericenter 77.2012
		MeanAnomaly     105.222
	}
}

DwarfMoon	"Cantonica System 7.D4"
{
	ParentBody     "Cantonica System 7-7.1"
	Class	       "Asteroid"

	Mass            1.04398e-011
	Radius          2.78323
	InertiaMoment   0.396524

	RotationPeriod  4387.43
	Obliquity       55.7477
	EqAscendNode    -83.9816

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.619 0.616)

	Surface
	{
		SurfStyle       0.342573
		OceanStyle      0.504445
		Randomize      (-0.523, 0.259, 0.734)
		colorDistMagn   0.813003
		colorDistFreq   0.0039441
		detailScale     76.0008
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.724813
		terraceProb     0.195004
		erosion         0
		montesMagn      0.413099
		montesFreq      4.53794
		montesSpiky     0.915763
		montesFraction  0.488129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0212913
		hillsFraction   0.538896
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233506
		craterFreq      0.26285
		craterDensity   0.943147
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492652
		volcanoTemp     1425.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.246, 0.000)
		colorShelf     (0.266, 0.263, 0.262, 0.000)
		colorBeach     (0.282, 0.279, 0.277, 0.000)
		colorDesert    (0.297, 0.294, 0.293, 0.000)
		colorLowland   (0.313, 0.310, 0.308, 0.000)
		colorUpland    (0.328, 0.325, 0.323, 0.000)
		colorRock      (0.344, 0.341, 0.339, 0.000)
		colorSnow      (0.360, 0.356, 0.354, 1.000)
		BumpHeight      2.50491
		BumpOffset      0.500982
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00521521
		Period          1.37571
		Eccentricity    0.12678
		Inclination     55.8198
		AscendingNode   -83.9342
		ArgOfPericenter 51.2622
		MeanAnomaly     173.814
	}
}

DwarfMoon	"Cantonica System 7.D5"
{
	ParentBody     "Cantonica System 7-7.1"
	Class	       "Asteroid"

	Mass            2.18197e-011
	Radius          4.19752
	InertiaMoment   0.398429

	RotationPeriod  2833.53
	Obliquity       -18.36
	EqAscendNode    -105.53

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.377 0.321)

	Surface
	{
		SurfStyle       0.714415
		OceanStyle      0.329482
		Randomize      (0.516, -0.549, -0.317)
		colorDistMagn   0.639168
		colorDistFreq   0.00860861
		detailScale     114.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.391972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523198
		terraceProb     0.473687
		erosion         0
		montesMagn      0.445303
		montesFreq      2.71205
		montesSpiky     0.90225
		montesFraction  0.419513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.058196
		hillsFraction   0.8008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22218
		craterFreq      0.256796
		craterDensity   0.792912
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479583
		volcanoTemp     1659.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.128, 0.090, 0.000)
		colorShelf     (0.207, 0.132, 0.103, 0.000)
		colorBeach     (0.243, 0.155, 0.122, 0.000)
		colorDesert    (0.264, 0.166, 0.119, 0.000)
		colorLowland   (0.290, 0.177, 0.135, 0.000)
		colorUpland    (0.321, 0.215, 0.164, 0.000)
		colorRock      (0.346, 0.234, 0.177, 0.000)
		colorSnow      (0.377, 0.249, 0.186, 1.000)
		BumpHeight      3.77777
		BumpOffset      0.755554
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00574412
		Period          1.59021
		Eccentricity    0.0222488
		Inclination     -19.841
		AscendingNode   -104.751
		ArgOfPericenter 49.2645
		MeanAnomaly     -56.7706
	}
}

Barycenter	"Cantonica System 8-8.1"
{
	ParentBody     "Cantonica System"
	Mass            0.187607
	Radius          9060.64
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.7412
		Period          40.093
		Eccentricity    0.0352777
		Inclination     -1.69825
		AscendingNode   2.37397
		ArgOfPericenter 149.269
		MeanAnomaly     242.075
	}
}

Planet	"Cantonica System 8"
{
	ParentBody     "Cantonica System 8-8.1"
	Class	       "IceWorld"

	Mass            0.126422
	Radius          4020.07
	InertiaMoment   0.328778

	Oblateness      0.00311413

	RotationPeriod  34.7847
	Obliquity       -16.8051
	EqAscendNode    -13.312

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.553 0.539 0.535)

	Surface
	{
		SurfStyle       0.0120368
		OceanStyle      0.755961
		Randomize      (0.963, 0.495, -0.833)
		colorDistMagn   0.0653153
		colorDistFreq   417.558
		detailScale     10339.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.191449
		snowLevel       2
		tropicLatitude  0.299626
		icecapLatitude  0.856275
		icecapHeight    0.2018
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.75877
		venusFreq       0.907968
		venusMagn       0
		mareFreq        1.92699
		mareDensity     0.0160039
		terraceProb     0.51936
		erosion         0
		montesMagn      0.225242
		montesFreq      163.919
		montesSpiky     0.970988
		montesFraction  0.712523
		dunesMagn       0.0442919
		dunesFreq       5231.1
		dunesFraction   0.946691
		hillsMagn       0.126735
		hillsFreq       502.196
		hillsFraction   0.397063
		hills2Fraction  0.22677
		riversMagn      64.995
		riversFreq      4.1615
		riversSin       3.90254
		riversOctaves   0
		canyonsMagn     0.674787
		canyonsFreq     1.97662
		canyonFraction  0
		cracksMagn      0.0727478
		cracksFreq      2.01819
		cracksOctaves   4
		craterMagn      0.56823
		craterFreq      12.1912
		craterDensity   0.994865
		craterOctaves   12
		craterRayedFactor 0
		volcanoMagn     0.527015
		volcanoFreq     0.532466
		volcanoDensity  0.215512
		volcanoOctaves  3
		volcanoActivity 0.144783
		volcanoFlows    0.279959
		volcanoRadius   0.553251
		volcanoTemp     1366.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.553, 0.539, 0.535, 0.500)
		colorShelf     (0.526, 0.512, 0.509, 0.500)
		colorBeach     (0.387, 0.377, 0.375, 0.750)
		colorDesert    (0.470, 0.458, 0.455, 1.000)
		colorLowland   (0.487, 0.474, 0.471, 1.000)
		colorUpland    (0.514, 0.501, 0.498, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.487, 0.474, 0.471, 1.000)
		colorUpPlants  (0.514, 0.501, 0.498, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999997
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
		Height          83.1192
		Density         2.9089e-007
		Pressure        6.19197e-008
		Greenhouse      0.00615705
		Bright          0.78117
		Opacity         0
		SkyLight        0.26039
		Hue             -0.0151847
		Saturation      1

		Composition
		{
			N2    	96.6399
			CO    	2.57847
			Ar    	0.70734
			Ne    	0.0663838
			Kr    	0.00737394
			O2    	0.000543596
			C2H4  	1.01749e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000599127
		Period          0.105134
		Eccentricity    0.0214924
		Inclination     -0.68293
		AscendingNode   -23.1281
		ArgOfPericenter 72.2357
		MeanAnomaly     161.1
	}
}

Moon	"Cantonica System 8.1"
{
	ParentBody     "Cantonica System 8-8.1"
	Class	       "IceWorld"

	Mass            0.0611849
	Radius          3388.69
	InertiaMoment   0.344013

	Obliquity       -0.68293
	EqAscendNode    -23.1281
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.653 0.649 0.646)

	Surface
	{
		SurfStyle       0.395661
		OceanStyle      0.777489
		Randomize      (0.530, 0.829, -0.630)
		colorDistMagn   0.0629291
		colorDistFreq   368.514
		detailScale     8715.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0.146159
		snowLevel       2
		tropicLatitude  0.0233518
		icecapLatitude  0.464968
		icecapHeight    0.179856
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.9061
		venusFreq       1.185
		venusMagn       0
		mareFreq        1.67133
		mareDensity     0.0064401
		terraceProb     0.186286
		erosion         0
		montesMagn      0.227321
		montesFreq      178.207
		montesSpiky     0.780523
		montesFraction  0.520956
		dunesMagn       0.0469861
		dunesFreq       4520.6
		dunesFraction   0.0596369
		hillsMagn       0.117428
		hillsFreq       386.948
		hillsFraction   0.353964
		hills2Fraction  0.131736
		riversMagn      54.5407
		riversFreq      3.02014
		riversSin       6.31727
		riversOctaves   0
		canyonsMagn     0.609013
		canyonsFreq     1.18448
		canyonFraction  0
		cracksMagn      0.025523
		cracksFreq      2.00091
		cracksOctaves   4
		craterMagn      0.604113
		craterFreq      7.96158
		craterDensity   0.867416
		craterOctaves   12
		craterRayedFactor 0.235714
		volcanoMagn     0.590893
		volcanoFreq     0.804358
		volcanoDensity  0.207468
		volcanoOctaves  3
		volcanoActivity 0.0512013
		volcanoFlows    0.405894
		volcanoRadius   0.511869
		volcanoTemp     1391.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.653, 0.649, 0.646, 0.500)
		colorShelf     (0.620, 0.616, 0.614, 0.500)
		colorBeach     (0.457, 0.454, 0.453, 0.750)
		colorDesert    (0.555, 0.551, 0.549, 1.000)
		colorLowland   (0.574, 0.571, 0.569, 1.000)
		colorUpland    (0.607, 0.603, 0.601, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.574, 0.571, 0.569, 1.000)
		colorUpPlants  (0.607, 0.603, 0.601, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.998389
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
		Height          84.4019
		Density         0.000161135
		Pressure        2.40889e-005
		Greenhouse      0.0120184
		Bright          2.76336
		Opacity         0
		SkyLight        0.921121
		Hue             0.0378836
		Saturation      1

		Composition
		{
			Ar    	99.9619
			Kr    	0.0381487
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00123794
		Period          0.105134
		Eccentricity    0.0214924
		Inclination     -0.68293
		AscendingNode   -23.1281
		ArgOfPericenter -107.764
		MeanAnomaly     161.1
	}
}

Planet	"Cantonica System 9"
{
	ParentBody     "Cantonica System"
	Class	       "IceWorld"

	Mass            0.605667
	Radius          6986.7
	InertiaMoment   0.329912

	Oblateness      0.0089181

	RotationPeriod  21.5611
	Obliquity       -223.919
	EqAscendNode    -172.181

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.534 0.367 0.277)

	Surface
	{
		SurfStyle       0.851382
		OceanStyle      0.338089
		Randomize      (-0.231, 0.339, -0.584)
		colorDistMagn   0.0669721
		colorDistFreq   899.137
		detailScale     17970.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.137066
		snowLevel       2
		tropicLatitude  0.710833
		icecapLatitude  1
		icecapHeight    0.137066
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.62071
		venusFreq       0.400529
		venusMagn       0
		mareFreq        2.18736
		mareDensity     0.0402539
		terraceProb     0.226304
		erosion         0
		montesMagn      0.219372
		montesFreq      221.161
		montesSpiky     0.935823
		montesFraction  0.706597
		dunesMagn       0.0415469
		dunesFreq       9077.48
		dunesFraction   0.218101
		hillsMagn       0.134537
		hillsFreq       816.547
		hillsFraction   0.0306138
		hills2Fraction  0.214731
		riversMagn      59.2646
		riversFreq      2.33208
		riversSin       7.44537
		riversOctaves   0
		canyonsMagn     0.644496
		canyonsFreq     2.77445
		canyonFraction  0
		cracksMagn      0.0722706
		cracksFreq      2.67357
		cracksOctaves   5
		craterMagn      0.537765
		craterFreq      17.221
		craterDensity   0.820738
		craterOctaves   11.6647
		craterRayedFactor 0.166921
		volcanoMagn     0.574415
		volcanoFreq     0.544503
		volcanoDensity  0.192092
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.212404
		volcanoRadius   0.458172
		volcanoTemp     1513.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.534, 0.275, 0.159, 0.000)
		colorShelf     (0.507, 0.261, 0.151, 0.000)
		colorBeach     (0.267, 0.137, 0.080, 0.000)
		colorDesert    (0.454, 0.234, 0.135, 0.000)
		colorLowland   (0.432, 0.242, 0.151, 0.000)
		colorUpland    (0.496, 0.256, 0.148, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.432, 0.242, 0.151, 0.000)
		colorUpPlants  (0.496, 0.256, 0.148, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.872226
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          34.9335
		Density         0.0127774
		Pressure        0.00203307
		Greenhouse      0.289252
		Bright          6.62656
		Opacity         1
		SkyLight        2.20885
		Hue             -0.00348271
		Saturation      1

		Composition
		{
			N2    	99.8969
			Ne    	0.0836384
			CO    	0.0142494
			Ar    	0.00521683
		}
	}

	Aurora
	{
		Height      83.3866
		NorthLat    56.1757
		NorthLon    4.77452
		NorthRadius 2185.47
		NorthWidth  624.001
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -50.5096
		SouthLon    168.634
		SouthRadius 1605.01
		SouthWidth  413.237
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     9806.28
		OuterRadius     16815.7
		RotationPeriod  5.46741
		RotationOffset  0
		FrontBright     0.131652
		BackBright      0.547618
		Density         0.388449
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   23.2217
		Period          111.517
		Eccentricity    0.0652416
		Inclination     1.41769
		AscendingNode   -167.26
		ArgOfPericenter 285.27
		MeanAnomaly     55.1588
	}
}



