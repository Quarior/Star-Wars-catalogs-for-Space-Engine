// http://starwars.wikia.com/wiki/Naboo
// Region : Mid Rim
// Sector : Chommel Sector
// Grid location : O17
// X : 5016.62, Y : -10608.46, Z : 545.398828227475
Planet	"Behpour"
{
	ParentBody     "Naboo System"
	Class	       "Desert"

	Mass            0.98
	Radius          3905.7
	InertiaMoment   0.328827

	Obliquity       0.04
	EqAscendNode    -0.711
	Precession      9.002
	TidalLocked     true

	AlbedoBond      0.372543
	AlbedoGeom      0.447051
	Brightness      2
	Color          (1.042 1.040 1.013)

	Surface
	{
		SurfStyle       0.729365
		OceanStyle      0.46564
		Randomize      (0.979, -0.648, -0.275)
		colorDistMagn   0.0746733
		colorDistFreq   503.199
		detailScale     10045.7
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0894428
		snowLevel       0.85
		tropicLatitude  0.00138107
		icecapLatitude  1
		icecapHeight    0.252278
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.563492
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.34921
		venusFreq       1.28357
		venusMagn       0.446897
		mareFreq        0.644947
		mareDensity     0.214286
		terraceProb     0.452381
		erosion         0.444444
		montesMagn      0.155459
		montesFreq      209.889
		montesSpiky     0.539683
		montesFraction  0.734374
		dunesMagn       0.634921
		dunesFreq       12.6984
		dunesFraction   0.047619
		hillsMagn       0.104964
		hillsFreq       345.406
		hillsFraction   0
		hills2Fraction  0
		riversMagn      55.8372
		riversFreq      3.33333
		riversSin       5.81206
		riversOctaves   0
		canyonsMagn     4.28571
		canyonsFreq     69.0476
		canyonFraction  0.261905
		cracksMagn      0
		cracksFreq      0.314744
		cracksOctaves   0
		craterMagn      0.985383
		craterFreq      10.9171
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.735145
		volcanoFreq     0.627782
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.68946
		volcanoFlows    0.580797
		volcanoRadius   0.496306
		volcanoTemp     1140.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
		cycloneMagn     1.2418
		cycloneFreq     0
		cycloneDensity  0.345509
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
		BumpHeight      9.52381
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
		Height          12.144
		Velocity        131.135
		BumpHeight      5.95834
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.980885
		mainOctaves     10
		Coverage        0.539683
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Chlorine"
		Height          133.963
		Density         0.639368
		Pressure        0.8
		Greenhouse      4.7619
		Bright          5
		Opacity         1
		SkyLight        1.66667
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	79.9959
			H2O   	15.9915
			SO2   	3.98193
			N2    	0.0215004
			CH4   	0.00651233
			C2H2  	0.00165922
			C2H4  	0.000567664
			H2S   	0.000118554
			NH3   	0.0001145
			CO    	0.000100679
			Ar    	3.2428e-005
			Ne    	2.2625e-005
			C2H6  	1.16362e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.231782
		Eccentricity    0.06
		Inclination     5.71429
		AscendingNode   -205.714
		ArgOfPericenter 34.2857
		MeanAnomaly     125.714
	}
}

DwarfPlanet	"Moth"
{
	ParentBody     "Naboo System"
	Class	       "Selena"

	Mass            0.00324193
	Radius          891
	InertiaMoment   0.397003

	Obliquity       0.18
	EqAscendNode    0
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.991 0.991 0.991)

	Surface
	{
		SurfStyle       0.310854
		OceanStyle      0.826104
		Randomize      (0.244, -0.487, 0.426)
		colorDistMagn   0.0809366
		colorDistFreq   109.63
		detailScale     2291.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.162025
		snowLevel       1
		tropicLatitude  0.00628155
		icecapLatitude  1
		icecapHeight    0.223787
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72563
		venusFreq       1.3259
		venusMagn       0
		mareFreq        0.220289
		mareDensity     0.0040181
		terraceProb     0.351314
		erosion         0
		montesMagn      0.0601866
		montesFreq      43.0403
		montesSpiky     0.968652
		montesFraction  0.921446
		dunesMagn       0.0233121
		dunesFreq       100
		dunesFraction   0.252759
		hillsMagn       0.125288
		hillsFreq       86.0365
		hillsFraction   0.245478
		hills2Fraction  0
		riversMagn      57.4912
		riversFreq      3.4916
		riversSin       7.9245
		riversOctaves   0
		canyonsMagn     0.542656
		canyonsFreq     0.293553
		canyonFraction  0.733607
		cracksMagn      0.0485987
		cracksFreq      0.343052
		cracksOctaves   0
		craterMagn      0.531667
		craterFreq      2.9595
		craterDensity   0.889584
		craterOctaves   10
		craterRayedFactor 0.0766119
		volcanoMagn     0.204748
		volcanoFreq     0.720845
		volcanoDensity  0.237846
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.136288
		volcanoRadius   0.15599
		volcanoTemp     1464.28
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
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.431, 0.445, 0.467, 0.000)
		colorDesert    (0.376, 0.359, 0.358, 0.000)
		colorLowland   (0.478, 0.476, 0.436, 0.000)
		colorUpland    (0.509, 0.508, 0.475, 0.000)
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
		SemiMajorAxis   0.334048
		Eccentricity    0.15873
		Inclination     5.71429
		AscendingNode   -171.429
		ArgOfPericenter 114.286
		MeanAnomaly     -62.8571
	}
}

Barycenter	"Erep System"
{
	ParentBody     "Naboo System"
	Mass            0.103209
	Radius          2404.16
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0
	Precession      0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.693856
		Eccentricity    0.0793651
		Inclination     -5.71429
		AscendingNode   91.4286
		ArgOfPericenter 205.714
		MeanAnomaly     17.1429
	}
}

Planet	"Erep"
{
	ParentBody     "Erep System"
	Class	       "Selena"

	Mass            0.0975644
	Radius          3113
	InertiaMoment   0.328194

	Oblateness      0.00396923

	Obliquity       1.19
	EqAscendNode    0
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (1.042 1.042 1.043)

	Surface
	{
		SurfStyle       0.0510387
		OceanStyle      0.423019
		Randomize      (0.959, 0.621, 0.709)
		colorDistMagn   0.0589904
		colorDistFreq   334.6
		detailScale     8006.81
		colorConversion true
		drivenDarkening 0
		seaLevel        0.179819
		snowLevel       1
		tropicLatitude  0.0415265
		icecapLatitude  1
		icecapHeight    0.131783
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99523
		venusFreq       1
		venusMagn       0
		mareFreq        1.93279
		mareDensity     0.0261673
		terraceProb     0.483744
		erosion         0
		montesMagn      0.228005
		montesFreq      159.425
		montesSpiky     0.945299
		montesFraction  0.372037
		dunesMagn       0.0330139
		dunesFreq       100
		dunesFraction   0.125081
		hillsMagn       0.103771
		hillsFreq       379.885
		hillsFraction   0.98936
		hills2Fraction  0
		riversMagn      63.4984
		riversFreq      2.49471
		riversSin       7.17378
		riversOctaves   0
		canyonsMagn     0.402953
		canyonsFreq     0.965582
		canyonFraction  0.854724
		cracksMagn      0.0561051
		cracksFreq      0.737034
		cracksOctaves   0
		craterMagn      0.549056
		craterFreq      8.327
		craterDensity   0.74994
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.577632
		volcanoFreq     0.720131
		volcanoDensity  0.235701
		volcanoOctaves  3
		volcanoActivity 0.182687
		volcanoFlows    0.20504
		volcanoRadius   0.458425
		volcanoTemp     1187.01
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
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.344, 0.325, 0.303, 0.000)
		colorDesert    (0.426, 0.390, 0.345, 0.200)
		colorLowland   (0.461, 0.416, 0.388, 0.500)
		colorUpland    (0.481, 0.435, 0.400, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.955481
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          63.084
		Density         0.00445187
		Pressure        0.00259006
		Greenhouse      0.166647
		Bright          5.36671
		Opacity         1
		SkyLight        1.7889
		Hue             0
		Saturation      1

		Composition
		{
			SO2   	99.9511
			CO2   	0.0483782
			C3H8  	0.000248829
			Cl2   	0.000229701
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.17948e-005
		Eccentricity    0.002
		Inclination     22.8571
		AscendingNode   0
		ArgOfPericenter 22.8571
		MeanAnomaly     -22.412
	}
}

Moon	"Erep 1"
{
	ParentBody     "Erep System"
	Class	       "Selena"

	Mass            0.0056446
	Radius          1204
	InertiaMoment   0.388902

	Obliquity       1.19
	EqAscendNode    0
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.990 0.991 0.991)

	Surface
	{
		SurfStyle       0.516486
		OceanStyle      0.403111
		Randomize      (-0.715, -0.351, -0.400)
		colorDistMagn   0.0499329
		colorDistFreq   154.699
		detailScale     3096.76
		colorConversion true
		drivenDarkening 0
		seaLevel        0.228362
		snowLevel       1
		tropicLatitude  0.0415265
		icecapLatitude  1
		icecapHeight    0.194105
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96583
		venusFreq       1
		venusMagn       0
		mareFreq        0.510551
		mareDensity     0.00325646
		terraceProb     0.120131
		erosion         0
		montesMagn      0.0721483
		montesFreq      57.2134
		montesSpiky     0.958089
		montesFraction  0.952617
		dunesMagn       0.0405916
		dunesFreq       100
		dunesFraction   0.354424
		hillsMagn       0.124592
		hillsFreq       138.679
		hillsFraction   0.621857
		hills2Fraction  0
		riversMagn      56.0087
		riversFreq      4.14192
		riversSin       6.20644
		riversOctaves   0
		canyonsMagn     0.568685
		canyonsFreq     0.299344
		canyonFraction  0.34246
		cracksMagn      0.0534161
		cracksFreq      0.531412
		cracksOctaves   0
		craterMagn      0.535969
		craterFreq      3.63694
		craterDensity   0.0848353
		craterOctaves   1
		craterRayedFactor 0
		volcanoMagn     0.174685
		volcanoFreq     0.550444
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.258015
		volcanoRadius   0.132605
		volcanoTemp     1788.86
		lavaCoverTidal  1
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.458, 0.450, 0.398, 0.000)
		colorDesert    (0.481, 0.458, 0.405, 0.000)
		colorLowland   (0.377, 0.340, 0.309, 0.000)
		colorUpland    (0.555, 0.524, 0.457, 0.000)
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
		SemiMajorAxis   0.00032206
		Eccentricity    0.002
		Inclination     22.8571
		AscendingNode   0
		ArgOfPericenter 200
		MeanAnomaly     -22.412
	}
}

Planet	"Naboo"
{
	ParentBody     "Naboo System"
	Class	       "Terra"

	Mass            0.98
	Radius          6060
	InertiaMoment   0.328782

	Oblateness      0.00246313

	RotationPeriod  26
	RotationOffset  -102.857
	Obliquity       -45.4468
	EqAscendNode    0.871529
	Precession      0

	AlbedoBond      0.32443
	AlbedoGeom      0.389316
	Brightness      2
	Color          (1.015 1.034 1.036)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.344504
		OceanStyle      0.665073
		Randomize      (0.047, 0.055, 0.530)
		colorDistMagn   0.0420566
		colorDistFreq   883.503
		detailScale     15586.7
		colorConversion true
		drivenDarkening -1
		seaLevel        0.347294
		snowLevel       0.795072
		tropicLatitude  0.7126
		icecapLatitude  0.819841
		icecapHeight    0.364001
		climatePole     1
		climateTropic   0.619
		climateEquator  0.632
		heightTempGrad  0
		tropicWidth     0.07
		mainFreq        2.103
		venusFreq       0.795072
		venusMagn       0.533329
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.284926
		erosion         0.108962
		montesMagn      0.212326
		montesFreq      323.801
		montesSpiky     0.946373
		montesFraction  0.760199
		dunesMagn       0.0513222
		dunesFreq       55.1379
		dunesFraction   0.728277
		hillsMagn       0.11163
		hillsFreq       693.352
		hillsFraction   0.36632
		hills2Fraction  0.818251
		riversMagn      65.9843
		riversFreq      2.55672
		riversSin       5.8835
		riversOctaves   2
		canyonsMagn     0.0599787
		canyonsFreq     100
		canyonFraction  0.103896
		cracksMagn      0.0791459
		cracksFreq      0.481649
		cracksOctaves   0
		craterMagn      0.677755
		craterFreq      19.0026
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.695095
		volcanoFreq     0.75606
		volcanoDensity  0.323641
		volcanoOctaves  3
		volcanoActivity 0.719305
		volcanoFlows    0.702759
		volcanoRadius   0.574076
		volcanoTemp     1706.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.17203
		stripeFluct     0
		stripeTwist     0.0291049
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.071, 0.165, 0.180, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.780, 0.750, 0.740, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.480, 0.380, 0.280, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.502, 0.667, 0.651, 0.000)
		colorUpPlants  (0.114, 0.227, 0.220, 0.075)
		BumpHeight      19.1953
		BumpOffset      6.66642
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
		Height          29.9355
		Velocity        146.035
		BumpHeight      5.94019
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.06683
		mainOctaves     10
		Coverage        0.207383
		stripeZones     2.17203
		stripeFluct     0
		stripeTwist     0.0291049
	}

	Clouds
	{
		Height          29.9355
		Velocity        118.347
		BumpHeight      5.39611
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.06683
		mainOctaves     10
		Coverage        0.207383
		stripeZones     2.17203
		stripeFluct     0
		stripeTwist     0.0291049
	}

	Ocean
	{
		Height          6.66642
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          61.8202
		Density         1.20045
		Pressure        1
		Greenhouse      7
		Bright          5
		Opacity         1
		SkyLight        1.66667
		Hue             0
		Saturation      1

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	Aurora
	{
		Height      78.9045
		NorthLat    74.1343
		NorthLon    -164.172
		NorthRadius 2400.43
		NorthWidth  737.502
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -61.6666
		SouthLon    6.91055
		SouthRadius 1358.34
		SouthWidth  436.276
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
		SemiMajorAxis   1.00481
		Period          0.926027
		Eccentricity    0.032
		Inclination     -0.743
		AscendingNode   131.429
		ArgOfPericenter -154.286
		MeanAnomaly     -85.714
	}
}

Moon	"Ohma-D'un/Naboo 1"
{
	ParentBody     "Naboo"
	Class	       "Terra"

	Mass            0.34
	Radius          4132
	InertiaMoment   0.32996

	Obliquity       0.571429
	EqAscendNode    -74.2857
	Precession      0
	TidalLocked     true

	AlbedoBond      0.348134
	AlbedoGeom      0.417761
	Brightness      2
	Color          (1.037 1.040 1.039)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		SurfStyle       0.732639
		OceanStyle      0.892741
		Randomize      (0.711, -0.533, -0.883)
		colorDistMagn   0.0714625
		colorDistFreq   459.293
		detailScale     10627.7
		colorConversion true
		drivenDarkening -1
		seaLevel        0.476202
		snowLevel       1
		tropicLatitude  0
		icecapLatitude  0.504561
		icecapHeight    0.768052
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709047
		venusFreq       1
		venusMagn       0.243537
		mareFreq        4.48332
		mareDensity     0.0406245
		terraceProb     0.249206
		erosion         0.11513
		montesMagn      0.257401
		montesFreq      173.574
		montesSpiky     0.889752
		montesFraction  0.3154
		dunesMagn       0.0417709
		dunesFreq       39.8356
		dunesFraction   0.0536069
		hillsMagn       0.143158
		hillsFreq       462.38
		hillsFraction   0.23403
		hills2Fraction  0.117434
		riversMagn      51.7538
		riversFreq      3.25738
		riversSin       5.36811
		riversOctaves   2
		canyonsMagn     0.0593784
		canyonsFreq     100
		canyonFraction  0.247579
		cracksMagn      0.0841901
		cracksFreq      0.40133
		cracksOctaves   0
		craterMagn      0.637537
		craterFreq      15.2423
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.68193
		volcanoFreq     2
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 1.907
		volcanoFlows    0.709649
		volcanoRadius   0.250319
		volcanoTemp     1587.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.45696
		stripeFluct     0
		stripeTwist     0.933671
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.040, 0.200, 0.100, 1.000)
		colorShelf     (0.150, 0.460, 0.280, 1.000)
		colorBeach     (0.780, 0.750, 0.740, 0.000)
		colorDesert    (0.470, 0.420, 0.390, 0.000)
		colorLowland   (0.270, 0.250, 0.230, 0.000)
		colorUpland    (0.490, 0.480, 0.460, 0.000)
		colorRock      (0.260, 0.240, 0.230, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20
		BumpOffset      9.52404
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          19.3071
		Velocity        146.195
		BumpHeight      5.15603
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.962966
		mainOctaves     10
		Coverage        0.24689
		stripeZones     1.45696
		stripeFluct     0
		stripeTwist     0.933671
	}

	Clouds
	{
		Height          26.8271
		Velocity        186.743
		BumpHeight      5.15603
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.962966
		mainOctaves     10
		Coverage        0.24689
		stripeZones     1.45696
		stripeFluct     0
		stripeTwist     0.933671
	}

	Ocean
	{
		Height          9.52404
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          73.5756
		Density         0.412561
		Pressure        0.34
		Greenhouse      4
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	Aurora
	{
		Height      34.1354
		NorthLat    74.6885
		NorthLon    -151.506
		NorthRadius 1218.78
		NorthWidth  398.9
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -63.3728
		SouthLon    4.62819
		SouthRadius 1025.81
		SouthWidth  346.288
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
		SemiMajorAxis   0.000942
		Eccentricity    0
		Inclination     5.71429
		AscendingNode   -108.571
		ArgOfPericenter -114.286
		MeanAnomaly     62.8571
	}
}

Moon	"Rori/Naboo 2"
{
	ParentBody     "Naboo"
	Class	       "Desert"

	Mass            0.29
	Radius          3214
	InertiaMoment   0.330092

	Obliquity       -0.114286
	EqAscendNode    102.857
	Precession      0
	TidalLocked     true

	AlbedoBond      0.332802
	AlbedoGeom      0.399362
	Brightness      2
	Color          (1.024 1.034 1.036)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		SurfStyle       0.673251
		OceanStyle      0.138924
		Randomize      (-0.412, 0.289, 0.578)
		colorDistMagn   0.0546708
		colorDistFreq   433.415
		detailScale     8266.59
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0791773
		snowLevel       0.85
		tropicLatitude  0
		icecapLatitude  0.956515
		icecapHeight    0.0823486
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.77956
		venusFreq       0.818568
		venusMagn       0
		mareFreq        1.47337
		mareDensity     0.201342
		terraceProb     0.326657
		erosion         0
		montesMagn      0.179006
		montesFreq      129.216
		montesSpiky     0.980015
		montesFraction  0.0724857
		dunesMagn       0.0467541
		dunesFreq       34.5044
		dunesFraction   0.559835
		hillsMagn       0.13574
		hillsFreq       451.64
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.6794
		riversFreq      3.01983
		riversSin       6.42774
		riversOctaves   0
		canyonsMagn     0.0466665
		canyonsFreq     77.4078
		canyonFraction  0
		cracksMagn      0.0962674
		cracksFreq      0.217149
		cracksOctaves   0
		craterMagn      0.645387
		craterFreq      8.53426
		craterDensity   0.140968
		craterOctaves   2
		craterRayedFactor 0
		volcanoMagn     0.762663
		volcanoFreq     0.520205
		volcanoDensity  0.250055
		volcanoOctaves  3
		volcanoActivity 0.405949
		volcanoFlows    0.912467
		volcanoRadius   0.445354
		volcanoTemp     1328.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.63451
		stripeFluct     0
		stripeTwist     1.01319
		cycloneMagn     1.84646
		cycloneFreq     0.760414
		cycloneDensity  0.328857
		cycloneOctaves  4
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.400, 0.380, 0.270, 0.000)
		colorDesert    (0.800, 0.680, 0.500, 0.000)
		colorLowland   (0.670, 0.600, 0.490, 0.000)
		colorUpland    (0.580, 0.490, 0.350, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      18.7147
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
		Height          18.2771
		Velocity        71.5555
		BumpHeight      5.17167
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.961297
		mainOctaves     10
		Coverage        0.265604
		stripeZones     1.63451
		stripeFluct     0
		stripeTwist     1.01319
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          50.628
		Density         0.357022
		Pressure        0.29
		Greenhouse      11.2671
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	Aurora
	{
		Height      43.7113
		NorthLat    74.1553
		NorthLon    -88.5963
		NorthRadius 846.606
		NorthWidth  316.469
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -65.8282
		SouthLon    94.9019
		SouthRadius 654.029
		SouthWidth  204.892
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
		SemiMajorAxis   0.00221
		Eccentricity    0.0793651
		Inclination     2.6654
		AscendingNode   -262.857
		ArgOfPericenter -108.571
		MeanAnomaly     222.857
	}
}

Moon	"Naboo 3"
{
	ParentBody     "Naboo"
	Class	       "Selena"

	Mass            0.000342334
	Radius          421.14
	InertiaMoment   0.396962

	Obliquity       34.2857
	EqAscendNode    -148.571
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.926 0.926 0.927)

	Surface
	{
		SurfStyle       0.26402
		OceanStyle      0.280236
		Randomize      (0.864, 0.424, 0.245)
		colorDistMagn   0.0601407
		colorDistFreq   57.0274
		detailScale     1083.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.184989
		snowLevel       1
		tropicLatitude  0
		icecapLatitude  1
		icecapHeight    0.17057
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.63509
		venusFreq       0.533299
		venusMagn       0
		mareFreq        0.001
		mareDensity     0.00078559
		terraceProb     0.239111
		erosion         0
		montesMagn      0.0587434
		montesFreq      18.2072
		montesSpiky     0.88966
		montesFraction  0.757624
		dunesMagn       0.0215273
		dunesFreq       100
		dunesFraction   0.474006
		hillsMagn       0.132538
		hillsFreq       49.2373
		hillsFraction   0.410849
		hills2Fraction  0
		riversMagn      50.5811
		riversFreq      3.82361
		riversSin       6.06331
		riversOctaves   0
		canyonsMagn     0.405288
		canyonsFreq     0.203037
		canyonFraction  0.844287
		cracksMagn      0.0475247
		cracksFreq      0.110254
		cracksOctaves   0
		craterMagn      0.541214
		craterFreq      1.3689
		craterDensity   0.975159
		craterOctaves   9
		craterRayedFactor 0.11477
		volcanoMagn     0.171529
		volcanoFreq     0.662385
		volcanoDensity  0.225954
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.185993
		volcanoRadius   0.129015
		volcanoTemp     1410.75
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
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.435, 0.450, 0.473, 0.000)
		colorDesert    (0.380, 0.363, 0.363, 0.000)
		colorLowland   (0.483, 0.482, 0.442, 0.000)
		colorUpland    (0.515, 0.513, 0.481, 0.000)
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
		SemiMajorAxis   0.0054
		Eccentricity    0.285714
		Inclination     -11.4286
		AscendingNode   85.7143
		ArgOfPericenter -194.286
		MeanAnomaly     74.2857
	}
}

Planet	"Widow"
{
	ParentBody     "Naboo System"
	Class	       "Selena"

	Mass            0.0432974
	Radius          2702
	InertiaMoment   0.346421

	Oblateness      0.00349689

	RotationPeriod  31.9248
	Obliquity       45.966
	EqAscendNode    -0.217922
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.993 0.994 0.993)

	Surface
	{
		SurfStyle       0.964734
		OceanStyle      0.398917
		Randomize      (-0.280, 0.596, -0.799)
		colorDistMagn   0.0719673
		colorDistFreq   368.248
		detailScale     6949.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.158833
		snowLevel       1
		tropicLatitude  0.627026
		icecapLatitude  1
		icecapHeight    0.135707
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76529
		venusFreq       0.828068
		venusMagn       0
		mareFreq        1.27594
		mareDensity     0.0078631
		terraceProb     0.482874
		erosion         0
		montesMagn      0.136502
		montesFreq      96.4818
		montesSpiky     0.990118
		montesFraction  0.58308
		dunesMagn       0.0424373
		dunesFreq       100
		dunesFraction   0.744488
		hillsMagn       0.124807
		hillsFreq       277.432
		hillsFraction   0.351271
		hills2Fraction  0
		riversMagn      60.8573
		riversFreq      1.82749
		riversSin       6.54174
		riversOctaves   0
		canyonsMagn     0.44151
		canyonsFreq     0.934738
		canyonFraction  0.943027
		cracksMagn      0.0481961
		cracksFreq      1.38173
		cracksOctaves   0
		craterMagn      0.56612
		craterFreq      8.14841
		craterDensity   0.932068
		craterOctaves   12
		craterRayedFactor 0.0888355
		volcanoMagn     0.507748
		volcanoFreq     0.715687
		volcanoDensity  0.217489
		volcanoOctaves  3
		volcanoActivity 0.0589963
		volcanoFlows    0.183194
		volcanoRadius   0.460267
		volcanoTemp     1846.03
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
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.454, 0.363, 0.183, 0.000)
		colorDesert    (0.525, 0.406, 0.187, 0.000)
		colorLowland   (0.403, 0.294, 0.135, 0.000)
		colorUpland    (0.378, 0.272, 0.126, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999999
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
		Height          163.518
		Density         6.42471e-008
		Pressure        1.78334e-008
		Greenhouse      0.000685216
		Bright          0.577525
		Opacity         0
		SkyLight        0.192508
		Hue             0
		Saturation      1

		Composition
		{
			SO2   	99.9595
			Cl2   	0.0370941
			Kr    	0.00293251
			Xe    	0.000459445
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.092
		Eccentricity    0.16
		Inclination     -7.135
		AscendingNode   102.857
		ArgOfPericenter -102.857
		MeanAnomaly     51.4286
	}
}

Moon	"Widow 1"
{
	ParentBody     "Widow"
	Class	       "Selena"

	Mass            5.90835e-005
	Radius          299.7
	InertiaMoment   0.399907

	Obliquity       21.04
	EqAscendNode    -228.571
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.920 0.920 0.920)

	Surface
	{
		SurfStyle       0.905618
		OceanStyle      0.596999
		Randomize      (-0.632, 0.324, 0.813)
		colorDistMagn   0.0706761
		colorDistFreq   31.2975
		detailScale     770.845
		colorConversion true
		drivenDarkening 0
		seaLevel        0.297212
		snowLevel       1
		tropicLatitude  0.670168
		icecapLatitude  1
		icecapHeight    0.167676
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00667
		venusFreq       0.985412
		venusMagn       0
		mareFreq        0.001
		mareDensity     0.0001059
		terraceProb     0.665308
		erosion         0
		montesMagn      0.0484863
		montesFreq      16.0281
		montesSpiky     0.973588
		montesFraction  0.281105
		dunesMagn       0.0376441
		dunesFreq       100
		dunesFraction   0.193582
		hillsMagn       0.12788
		hillsFreq       26.8133
		hillsFraction   0.0595719
		hills2Fraction  0
		riversMagn      62.4538
		riversFreq      3.10557
		riversSin       6.27729
		riversOctaves   0
		canyonsMagn     0.670887
		canyonsFreq     0.115422
		canyonFraction  0.220249
		cracksMagn      0.0730677
		cracksFreq      0.163823
		cracksOctaves   0
		craterMagn      0.772566
		craterFreq      0.909425
		craterDensity   0.936282
		craterOctaves   8
		craterRayedFactor 0.0648549
		volcanoMagn     0.186276
		volcanoFreq     0.788859
		volcanoDensity  0.153697
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.306532
		volcanoRadius   0.153863
		volcanoTemp     1414.67
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
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.545, 0.483, 0.399, 0.000)
		colorDesert    (0.637, 0.563, 0.441, 0.000)
		colorLowland   (0.506, 0.424, 0.331, 0.000)
		colorUpland    (0.453, 0.380, 0.310, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      14.985
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
		SemiMajorAxis   0.00168
		Eccentricity    0.412698
		Inclination     21.04
		AscendingNode   -142.857
		ArgOfPericenter 211.429
		MeanAnomaly     22.8571
	}
}

Planet	"Storm"
{
	ParentBody     "Naboo System"
	Class	       "GasGiant"

	Mass            68.93
	Radius          64494.6
	InertiaMoment   0.236289

	Oblateness      0.0701457

	RotationPeriod  13.3796
	RotationOffset  194.286
	Obliquity       11.4286
	EqAscendNode    -4.73182
	Precession      0

	AlbedoBond      0.495996
	AlbedoGeom      0.595195
	Brightness      2
	Color          (0.919 0.917 0.914)

	Surface
	{
		SurfStyle       0.665557
		OceanStyle      0
		Randomize      (0.690, 0.604, -0.715)
		colorDistMagn   0
		colorDistFreq   -1.#IND
		detailScale     140592
		colorConversion true
		drivenDarkening -1
		seaLevel        -1
		snowLevel       0
		tropicLatitude  0.664822
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
		stripeZones     2.98668
		stripeFluct     0.462384
		stripeTwist     12.8735
		cycloneMagn     13.1018
		cycloneFreq     0.608188
		cycloneDensity  0.434115
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
		BumpHeight      20
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
		Height          230.648
		Velocity        1508.56
		BumpHeight      62.0241
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.962087
		mainOctaves     12
		Coverage        0.459958
		stripeZones     2.98668
		stripeFluct     0.462384
		stripeTwist     12.8735
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          546.612
		Density         3452.31
		Pressure        636311
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2    	92.247
			He    	7.3447
			CH4   	0.354254
			N2    	0.0391087
			O2    	0.00957695
			C2H4  	0.00154979
			Ne    	0.00138451
			Ar    	0.000957361
			C2H2  	0.000811824
			C2H6  	0.000624493
		}
	}

	Aurora
	{
		Height      2805.33
		NorthLat    85.1299
		NorthLon    8.4617
		NorthRadius 17384.4
		NorthWidth  11577.3
		NorthRings  2
		NorthBright 1
		NorthParticles 0
		SouthLat    -86.5183
		SouthLon    189.782
		SouthRadius 14852.4
		SouthWidth  7490.92
		SouthRings  5
		SouthBright 1
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.218
		Eccentricity    0.015873
		Inclination     0.285714
		AscendingNode   160
		ArgOfPericenter -17.1429
		MeanAnomaly     142.857
	}
}

Moon	"Storm 1"
{
	ParentBody     "Storm"
	Class	       "Selena"

	Mass            0.0307874
	Radius          2713.03
	InertiaMoment   0.353223

	Oblateness      0.00965059

	Obliquity       -0.178955
	EqAscendNode    -63.5357
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.916 0.910 0.914)

	Surface
	{
		SurfStyle       0.801626
		OceanStyle      0.238032
		Randomize      (0.425, 0.455, 0.633)
		colorDistMagn   0.0740895
		colorDistFreq   322.803
		detailScale     6978.06
		colorConversion true
		drivenDarkening 0
		seaLevel        0.185717
		snowLevel       2
		tropicLatitude  0.0053153
		icecapLatitude  10
		icecapHeight    0.138476
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.63248
		venusFreq       2
		venusMagn       0
		mareFreq        1.82073
		mareDensity     0.00514308
		terraceProb     0.178722
		erosion         0
		montesMagn      0.177762
		montesFreq      139.103
		montesSpiky     0.810215
		montesFraction  0.926354
		dunesMagn       0.0538589
		dunesFreq       3591.43
		dunesFraction   0.540518
		hillsMagn       0.138138
		hillsFreq       315.732
		hillsFraction   0.328734
		hills2Fraction  0
		riversMagn      54.9828
		riversFreq      3.61592
		riversSin       6.37158
		riversOctaves   0
		canyonsMagn     0.352131
		canyonsFreq     1.04204
		canyonFraction  0.856191
		cracksMagn      0.0469491
		cracksFreq      0.590815
		cracksOctaves   0
		craterMagn      0.65526
		craterFreq      8.88376
		craterDensity   0.45825
		craterOctaves   6.09285
		craterRayedFactor 0
		volcanoMagn     0.493566
		volcanoFreq     0.658506
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.1864
		volcanoRadius   0.43482
		volcanoTemp     1403.62
		lavaCoverTidal  0.546959
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.476, 0.374, 0.312, 0.000)
		colorDesert    (0.434, 0.350, 0.275, 0.000)
		colorLowland   (0.332, 0.271, 0.208, 0.000)
		colorUpland    (0.561, 0.478, 0.386, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999985
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
		Height          305.216
		Density         1.53725e-006
		Pressure        9.12963e-007
		Greenhouse      0.00707646
		Bright          1.08981
		Opacity         0
		SkyLight        0.363268
		Hue             0.0126603
		Saturation      1

		Composition
		{
			SO2   	99.9993
			Cl2   	0.000555425
			Kr    	0.000173521
			Xe    	1.34603e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00129666
		Period          0.00264883
		Eccentricity    0.0460126
		Inclination     -0.178955
		AscendingNode   -63.5357
		ArgOfPericenter 44.9594
		MeanAnomaly     -115.173
	}
}

Moon	"Storm 2"
{
	ParentBody     "Storm"
	Class	       "Desert"

	Mass            0.37168
	Radius          5643.33
	InertiaMoment   0.32824

	Obliquity       -1.4567
	EqAscendNode    135.011
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (1.042 1.042 1.042)

	Surface
	{
		SurfStyle       0.7366
		OceanStyle      0.0296965
		Randomize      (0.860, 0.400, 0.107)
		colorDistMagn   0.058849
		colorDistFreq   650.534
		detailScale     14515
		colorConversion true
		seaLevel        0.190129
		snowLevel       2
		tropicLatitude  0.0194508
		icecapLatitude  0.653756
		icecapHeight    0.21472
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.850634
		venusFreq       2
		venusMagn       0
		mareFreq        1.00244
		mareDensity     0.0467183
		terraceProb     0.556524
		erosion         0
		montesMagn      0.24054
		montesFreq      280.981
		montesSpiky     0.894079
		montesFraction  0.650628
		dunesMagn       0.0474254
		dunesFreq       41.0998
		dunesFraction   0.0372525
		hillsMagn       0.126594
		hillsFreq       617.981
		hillsFraction   0
		hills2Fraction  0
		riversMagn      67.7667
		riversFreq      3.73498
		riversSin       6.33207
		riversOctaves   0
		canyonsMagn     0.0280851
		canyonsFreq     121.956
		canyonFraction  0
		cracksMagn      0.078904
		cracksFreq      0.515967
		cracksOctaves   0
		craterMagn      0.693532
		craterFreq      13.443
		craterDensity   0.590697
		craterOctaves   7.93384
		volcanoMagn     0.630714
		volcanoFreq     0.580432
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.754353
		volcanoRadius   0.467662
		volcanoTemp     1582.77
		lavaCoverTidal  0.429261
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
		Hapke           0.983134
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          52.5733
		Density         0.00168659
		Pressure        0.00103866
		Greenhouse      0.79467
		Bright          4.41979
		Opacity         1
		SkyLight        1.47326
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	39.2813
			C2H2  	27.605
			H2S   	16.9118
			CO2   	9.22199
			NH3   	3.143
			SO2   	1.96387
			C2H6  	1.3616
			C3H8  	0.296138
			C2H4  	0.199405
			N2    	0.0133956
			H2O   	0.00116493
			Ar    	0.000928964
			Cl2   	0.000318165
			Ne    	7.16966e-005
			CO    	5.30731e-005
		}
	}

	Aurora
	{
		Height      50.1981
		NorthLat    63.6554
		NorthLon    -67.1203
		NorthRadius 1420.2
		NorthWidth  402.839
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -50.2908
		SouthLon    113.414
		SouthRadius 1550.19
		SouthWidth  403.582
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
		SemiMajorAxis   0.00258073
		Period          0.0074254
		Eccentricity    0.0361565
		Inclination     -1.4567
		AscendingNode   135.011
		ArgOfPericenter -39.8664
		MeanAnomaly     -123.029
	}
}

Moon	"Storm 3"
{
	ParentBody     "Storm"
	Class	       "IceWorld"

	Mass            0.0454327
	Radius          2674.34
	InertiaMoment   0.341074

	Obliquity       1.43594
	EqAscendNode    58.0601
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.974 0.962 0.956)

	Surface
	{
		SurfStyle       0.593068
		OceanStyle      0.838562
		Randomize      (0.440, 0.802, 0.840)
		colorDistMagn   0.0708635
		colorDistFreq   368.415
		detailScale     6878.54
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.193789
		snowLevel       2
		tropicLatitude  0.0438112
		icecapLatitude  0.949315
		icecapHeight    0.198053
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.97932
		venusFreq       2
		venusMagn       0.171492
		mareFreq        1.76526
		mareDensity     0.0112661
		terraceProb     0.243025
		erosion         0
		montesMagn      0.174556
		montesFreq      153.288
		montesSpiky     0.946263
		montesFraction  0.57993
		dunesMagn       0.0223935
		dunesFreq       3615.22
		dunesFraction   0.194914
		hillsMagn       0.146931
		hillsFreq       254.719
		hillsFraction   0.587666
		hills2Fraction  0.0568071
		riversMagn      53.0607
		riversFreq      2.61712
		riversSin       7.62576
		riversOctaves   0
		canyonsMagn     0.595321
		canyonsFreq     0.973446
		canyonFraction  0
		cracksMagn      0.0577671
		cracksFreq      1.29984
		cracksOctaves   2
		craterMagn      0.611929
		craterFreq      9.00611
		craterDensity   0.995948
		craterOctaves   12
		craterRayedFactor 0.0843411
		volcanoMagn     0.494911
		volcanoFreq     0.514721
		volcanoDensity  0.184266
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.327321
		volcanoRadius   0.385511
		volcanoTemp     1592.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.175, 0.144, 0.000)
		colorShelf     (0.280, 0.217, 0.183, 0.000)
		colorBeach     (0.424, 0.329, 0.275, 0.200)
		colorDesert    (0.386, 0.308, 0.242, 0.500)
		colorLowland   (0.295, 0.238, 0.183, 0.800)
		colorUpland    (0.499, 0.420, 0.341, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.295, 0.238, 0.183, 0.800)
		colorUpPlants  (0.499, 0.420, 0.341, 1.000)
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
		SemiMajorAxis   0.00364084
		Period          0.012462
		Eccentricity    0.0138053
		Inclination     1.43594
		AscendingNode   58.0601
		ArgOfPericenter 20.3502
		MeanAnomaly     -82.0714
	}
}

Moon	"Storm 4"
{
	ParentBody     "Storm"
	Class	       "IceWorld"

	Mass            0.0564292
	Radius          3301.37
	InertiaMoment   0.343462

	Obliquity       1.0771
	EqAscendNode    -120.006
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.993 0.992 0.992)

	Surface
	{
		SurfStyle       0.0267502
		OceanStyle      0.540576
		Randomize      (0.572, 0.657, 0.489)
		colorDistMagn   0.0887529
		colorDistFreq   383.399
		detailScale     8491.32
		colorConversion true
		drivenDarkening 0
		seaLevel        0.211143
		snowLevel       2
		tropicLatitude  0.0187964
		icecapLatitude  0.747486
		icecapHeight    0.22754
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.89374
		venusFreq       2
		venusMagn       0
		mareFreq        2.08142
		mareDensity     0.00588457
		terraceProb     0.124529
		erosion         0
		montesMagn      0.25155
		montesFreq      113.669
		montesSpiky     0.95913
		montesFraction  0.80292
		dunesMagn       0.0371032
		dunesFreq       4223.81
		dunesFraction   0.740412
		hillsMagn       0.118229
		hillsFreq       387.699
		hillsFraction   0.195653
		hills2Fraction  0.222707
		riversMagn      63.3159
		riversFreq      2.65337
		riversSin       5.93312
		riversOctaves   0
		canyonsMagn     0.482379
		canyonsFreq     1.1088
		canyonFraction  0
		cracksMagn      0.0736637
		cracksFreq      1.89757
		cracksOctaves   3
		craterMagn      0.569026
		craterFreq      5.94915
		craterDensity   0.988965
		craterOctaves   12
		craterRayedFactor 0
		volcanoMagn     0.560863
		volcanoFreq     0.652868
		volcanoDensity  0.189624
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.1558
		volcanoRadius   0.465627
		volcanoTemp     1231.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.757, 0.750, 0.747, 0.500)
		colorShelf     (0.719, 0.712, 0.710, 0.500)
		colorBeach     (0.530, 0.525, 0.523, 0.750)
		colorDesert    (0.643, 0.637, 0.635, 1.000)
		colorLowland   (0.666, 0.660, 0.657, 1.000)
		colorUpland    (0.704, 0.697, 0.695, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.666, 0.660, 0.657, 1.000)
		colorUpPlants  (0.704, 0.697, 0.695, 1.000)
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

	Atmosphere
	{
		Model          "Pluto"
		Height          221.714
		Density         1.39423e-008
		Pressure        2.76062e-009
		Greenhouse      0.000164248
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             0.0359144
		Saturation      1

		Composition
		{
			CO2   	90.9993
			Ar    	3.76115
			Kr    	3.68783
			C3H8  	1.45654
			Xe    	0.0951486
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00513642
		Period          0.0208811
		Eccentricity    0.0185741
		Inclination     1.0771
		AscendingNode   -120.006
		ArgOfPericenter -65.7924
		MeanAnomaly     -25.7754
	}
}

Moon	"Storm 5"
{
	ParentBody     "Storm"
	Class	       "IceWorld"

	Mass            0.071578
	Radius          3351.42
	InertiaMoment   0.337505

	Obliquity       1.30354
	EqAscendNode    -69.6965
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.993 0.993 0.993)

	Surface
	{
		SurfStyle       0.297283
		OceanStyle      0.662538
		Randomize      (0.946, -0.890, -0.012)
		colorDistMagn   0.0521045
		colorDistFreq   464.742
		detailScale     8620.03
		colorConversion true
		drivenDarkening 0
		seaLevel        0.208658
		snowLevel       2
		tropicLatitude  0.0373318
		icecapLatitude  0.630719
		icecapHeight    0.22989
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71329
		venusFreq       2
		venusMagn       0.22314
		mareFreq        1.71886
		mareDensity     0.008301
		terraceProb     0.424004
		erosion         0
		montesMagn      0.246865
		montesFreq      183.625
		montesSpiky     0.993661
		montesFraction  0.506782
		dunesMagn       0.0510998
		dunesFreq       4454.81
		dunesFraction   0.817879
		hillsMagn       0.136777
		hillsFreq       380.841
		hillsFraction   0.430043
		hills2Fraction  0.147512
		riversMagn      61.7352
		riversFreq      3.75842
		riversSin       6.62705
		riversOctaves   0
		canyonsMagn     0.599521
		canyonsFreq     1.13493
		canyonFraction  0
		cracksMagn      0.0699579
		cracksFreq      1.59057
		cracksOctaves   4
		craterMagn      0.626584
		craterFreq      9.21071
		craterDensity   0.906313
		craterOctaves   12
		craterRayedFactor 0.103163
		volcanoMagn     0.545055
		volcanoFreq     0.891433
		volcanoDensity  0.181201
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.251154
		volcanoRadius   0.470589
		volcanoTemp     1595.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.419, 0.415, 0.412, 0.500)
		colorShelf     (0.398, 0.394, 0.392, 0.500)
		colorBeach     (0.293, 0.290, 0.289, 0.750)
		colorDesert    (0.356, 0.353, 0.351, 1.000)
		colorLowland   (0.369, 0.365, 0.363, 1.000)
		colorUpland    (0.390, 0.386, 0.384, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.369, 0.365, 0.363, 1.000)
		colorUpPlants  (0.390, 0.386, 0.384, 1.000)
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
		Height          205.131
		Density         1.96051e-007
		Pressure        4.0901e-008
		Greenhouse      0.00140977
		Bright          0.721895
		Opacity         0
		SkyLight        0.240632
		Hue             0.0436658
		Saturation      1

		Composition
		{
			CO2   	84.7133
			H2S   	7.62213
			Ar    	7.22111
			Kr    	0.282124
			O2    	0.0775082
			C2H6  	0.0586042
			Xe    	0.0231732
			C3H8  	0.00207566
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00724635
		Period          0.0349873
		Eccentricity    0.0281976
		Inclination     1.30354
		AscendingNode   -69.6965
		ArgOfPericenter -30.6065
		MeanAnomaly     33.0675
	}
}

Moon	"Storm 6"
{
	ParentBody     "Storm"
	Class	       "IceWorld"

	Mass            0.0934423
	Radius          3882.85
	InertiaMoment   0.331172

	Obliquity       -1.18165
	EqAscendNode    127.934
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.029 1.027 1.026)

	Surface
	{
		SurfStyle       0.804156
		OceanStyle      0.890011
		Randomize      (0.944, 0.179, 0.175)
		colorDistMagn   0.0801737
		colorDistFreq   469.9
		detailScale     9986.92
		colorConversion true
		drivenDarkening 0
		seaLevel        0.206957
		snowLevel       2
		tropicLatitude  0.0181019
		icecapLatitude  0.627609
		icecapHeight    0.23052
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77816
		venusFreq       2
		venusMagn       0
		mareFreq        1.33255
		mareDensity     0.00865371
		terraceProb     0.207824
		erosion         0
		montesMagn      0.232367
		montesFreq      227.625
		montesSpiky     0.92947
		montesFraction  0.91089
		dunesMagn       0.050002
		dunesFreq       5073.74
		dunesFraction   0.615135
		hillsMagn       0.128842
		hillsFreq       377.218
		hillsFraction   0.0996906
		hills2Fraction  0.217782
		riversMagn      55.456
		riversFreq      3.76331
		riversSin       8.37234
		riversOctaves   0
		canyonsMagn     0.536323
		canyonsFreq     0.989226
		canyonFraction  0
		cracksMagn      0.0599214
		cracksFreq      1.32703
		cracksOctaves   3
		craterMagn      0.657442
		craterFreq      14.6188
		craterDensity   0.931336
		craterOctaves   12
		craterRayedFactor 0.239805
		volcanoMagn     0.613283
		volcanoFreq     0.9295
		volcanoDensity  0.184142
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.38345
		volcanoRadius   0.470902
		volcanoTemp     1371.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.636, 0.475, 0.362, 0.000)
		colorShelf     (0.604, 0.450, 0.344, 0.000)
		colorBeach     (0.318, 0.237, 0.181, 0.000)
		colorDesert    (0.540, 0.404, 0.308, 0.000)
		colorLowland   (0.515, 0.418, 0.344, 0.000)
		colorUpland    (0.591, 0.441, 0.337, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.515, 0.418, 0.344, 0.000)
		colorUpPlants  (0.591, 0.441, 0.337, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999187
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
		Height          171.753
		Density         8.12591e-005
		Pressure        2.60066e-005
		Greenhouse      0.103626
		Bright          2.40976
		Opacity         0
		SkyLight        0.803254
		Hue             -0.0485828
		Saturation      1

		Composition
		{
			C2H4  	97.7245
			C2H6  	1.45963
			N2    	0.488826
			Ar    	0.153195
			CO    	0.150391
			H2S   	0.0136145
			CO2   	0.00438209
			O2    	0.00275676
			Kr    	0.00216761
			Xe    	0.000566817
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.010223
		Period          0.0586209
		Eccentricity    0.00221209
		Inclination     -1.18165
		AscendingNode   127.934
		ArgOfPericenter 126.796
		MeanAnomaly     162.094
	}
}

Moon	"Storm 7"
{
	ParentBody     "Storm"
	Class	       "IceWorld"

	Mass            0.000488247
	Radius          652.563
	InertiaMoment   0.397826

	Obliquity       -0.749224
	EqAscendNode    139.343
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.868 0.759)

	Surface
	{
		SurfStyle       0.592368
		OceanStyle      0.800159
		Randomize      (-0.050, 0.907, 0.216)
		colorDistMagn   0.0820925
		colorDistFreq   89.4555
		detailScale     1678.43
		colorConversion true
		drivenDarkening 0.387909
		seaLevel        0.117171
		snowLevel       2
		tropicLatitude  0.00908246
		icecapLatitude  0.477095
		icecapHeight    0.158097
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72714
		venusFreq       2
		venusMagn       0
		mareFreq        0.0443321
		mareDensity     0.00035493
		terraceProb     0.540176
		erosion         0
		montesMagn      0.0691826
		montesFreq      30.754
		montesSpiky     0.924546
		montesFraction  0.915285
		dunesMagn       0.0384705
		dunesFreq       829.853
		dunesFraction   0.668632
		hillsMagn       0.130094
		hillsFreq       83.5215
		hillsFraction   0.0456751
		hills2Fraction  0.195759
		riversMagn      62.0199
		riversFreq      3.5557
		riversSin       3.67826
		riversOctaves   0
		canyonsMagn     0.492341
		canyonsFreq     0.189464
		canyonFraction  0
		cracksMagn      0.065031
		cracksFreq      0.4007
		cracksOctaves   0
		craterMagn      0.672759
		craterFreq      2.1175
		craterDensity   0.985765
		craterOctaves   9
		craterRayedFactor 0.139091
		volcanoMagn     0.192557
		volcanoFreq     0.570103
		volcanoDensity  0.186295
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.289533
		volcanoRadius   0.159289
		volcanoTemp     1867.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.173, 0.133, 0.000)
		colorShelf     (0.295, 0.215, 0.169, 0.000)
		colorBeach     (0.446, 0.325, 0.254, 0.200)
		colorDesert    (0.406, 0.305, 0.224, 0.500)
		colorLowland   (0.311, 0.235, 0.169, 0.800)
		colorUpland    (0.526, 0.415, 0.314, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.311, 0.235, 0.169, 0.800)
		colorUpPlants  (0.526, 0.415, 0.314, 1.000)
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
		SemiMajorAxis   0.0144224
		Period          0.0982731
		Eccentricity    0.0346404
		Inclination     -0.749224
		AscendingNode   139.343
		ArgOfPericenter -64.3173
		MeanAnomaly     29.7799
	}
}

Moon	"Storm 8"
{
	ParentBody     "Storm"
	Class	       "IceWorld"

	Mass            0.000122131
	Radius          380.799
	InertiaMoment   0.396657

	RotationPeriod  205.751
	Obliquity       -1.72224
	EqAscendNode    91.1151
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.982 0.974)

	Surface
	{
		SurfStyle       0.664925
		OceanStyle      0.924246
		Randomize      (-0.525, 0.986, 0.734)
		colorDistMagn   0.0570078
		colorDistFreq   45.352
		detailScale     979.437
		colorConversion true
		drivenDarkening 0.274961
		seaLevel        0.278984
		snowLevel       2
		tropicLatitude  0.0374179
		icecapLatitude  0.865841
		icecapHeight    0.283159
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76553
		venusFreq       2
		venusMagn       0
		mareFreq        0
		mareDensity     0.000192581
		terraceProb     0.148216
		erosion         0
		montesMagn      0.0700596
		montesFreq      22.9538
		montesSpiky     0.778188
		montesFraction  0.663171
		dunesMagn       0.0399106
		dunesFreq       491.327
		dunesFraction   0.175958
		hillsMagn       0.124768
		hillsFreq       34.8612
		hillsFraction   0.203803
		hills2Fraction  0.0631181
		riversMagn      65.3615
		riversFreq      1.88892
		riversSin       5.29507
		riversOctaves   0
		canyonsMagn     0.553621
		canyonsFreq     0.0883235
		canyonFraction  0
		cracksMagn      0.0434252
		cracksFreq      0.119261
		cracksOctaves   0
		craterMagn      0.544829
		craterFreq      0.761626
		craterDensity   0.850174
		craterOctaves   9
		craterRayedFactor 0.0547976
		volcanoMagn     0.170815
		volcanoFreq     0.964016
		volcanoDensity  0.178864
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.213587
		volcanoRadius   0.143959
		volcanoTemp     1191.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.317, 0.329, 0.250)
		colorShelf     (0.353, 0.362, 0.373, 0.250)
		colorBeach     (0.287, 0.267, 0.285, 0.200)
		colorDesert    (0.267, 0.243, 0.251, 0.200)
		colorLowland   (0.197, 0.188, 0.206, 0.200)
		colorUpland    (0.373, 0.367, 0.373, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.197, 0.188, 0.206, 0.200)
		colorUpPlants  (0.373, 0.367, 0.373, 0.250)
		BumpHeight      19.0399
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
		SemiMajorAxis   0.0203468
		Period          0.164673
		Eccentricity    0.0206841
		Inclination     -1.30779
		AscendingNode   90.9874
		ArgOfPericenter -96.8888
		MeanAnomaly     50.1428
	}
}

Moon	"Storm 9"
{
	ParentBody     "Storm"
	Class	       "IceWorld"

	Mass            0.000208073
	Radius          522.337
	InertiaMoment   0.399779

	RotationPeriod  96.9452
	Obliquity       39.0961
	EqAscendNode    -182.679
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.936 0.826)

	Surface
	{
		SurfStyle       0.295341
		OceanStyle      0.810141
		Randomize      (-0.717, 0.386, 0.929)
		colorDistMagn   0.0575738
		colorDistFreq   71.2442
		detailScale     1343.48
		colorConversion true
		drivenDarkening 0.1949
		seaLevel        0.16332
		snowLevel       2
		tropicLatitude  0.631055
		icecapLatitude  1
		icecapHeight    0.16332
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.0327
		venusFreq       2
		venusMagn       0.233516
		mareFreq        0
		mareDensity     0.000145328
		terraceProb     0.134127
		erosion         0
		montesMagn      0.0714655
		montesFreq      23.0817
		montesSpiky     0.921636
		montesFraction  0.103415
		dunesMagn       0.0599537
		dunesFreq       678.729
		dunesFraction   0.30833
		hillsMagn       0.111479
		hillsFreq       53.9245
		hillsFraction   0.667107
		hills2Fraction  0.264719
		riversMagn      60.8215
		riversFreq      1.92325
		riversSin       7.72218
		riversOctaves   0
		canyonsMagn     0.765215
		canyonsFreq     0.164334
		canyonFraction  0
		cracksMagn      0.043141
		cracksFreq      0.267195
		cracksOctaves   0
		craterMagn      0.585303
		craterFreq      1.04035
		craterDensity   0.966197
		craterOctaves   9
		craterRayedFactor 0.145934
		volcanoMagn     0.187123
		volcanoFreq     0.510583
		volcanoDensity  0.227867
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.313268
		volcanoRadius   0.156653
		volcanoTemp     1587.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.783, 0.733, 0.647, 0.500)
		colorShelf     (0.744, 0.697, 0.615, 0.500)
		colorBeach     (0.548, 0.513, 0.453, 0.750)
		colorDesert    (0.666, 0.623, 0.550, 1.000)
		colorLowland   (0.689, 0.645, 0.570, 1.000)
		colorUpland    (0.729, 0.682, 0.602, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.689, 0.645, 0.570, 1.000)
		colorUpPlants  (0.729, 0.682, 0.602, 1.000)
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
		SemiMajorAxis   0.0287048
		Period          0.275938
		Eccentricity    0.0224497
		Inclination     -0.0319567
		AscendingNode   -177.028
		ArgOfPericenter -17.1121
		MeanAnomaly     -5.54564
	}
}

DwarfMoon	"Storm D1"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            1.40883e-007
	Radius          79.7826
	InertiaMoment   0.398349

	Oblateness      0.249

	Obliquity       -0.0118528
	EqAscendNode    -47.3018
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.723 0.723)

	Surface
	{
		SurfStyle       0.690476
		OceanStyle      0.488775
		Randomize      (-0.970, -0.555, -0.411)
		colorDistMagn   0.487319
		colorDistFreq   0.633873
		detailScale     2178.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433986
		venusFreq       2
		terraceProb     0.265202
		erosion         0
		montesMagn      0.323234
		montesFreq      2.81363
		montesSpiky     0.984533
		montesFraction  0.569222
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.0037
		hillsFraction   0.525393
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217479
		craterFreq      0.197742
		craterDensity   1.06932
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492825
		volcanoTemp     1631.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.240, 0.197, 0.000)
		colorShelf     (0.285, 0.248, 0.226, 0.000)
		colorBeach     (0.335, 0.290, 0.268, 0.000)
		colorDesert    (0.363, 0.311, 0.261, 0.000)
		colorLowland   (0.399, 0.332, 0.296, 0.000)
		colorUpland    (0.441, 0.403, 0.360, 0.000)
		colorRock      (0.477, 0.439, 0.388, 0.000)
		colorSnow      (0.520, 0.467, 0.409, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000631941
		Period          0.000901355
		Eccentricity    6.48558e-005
		Inclination     -0.0118528
		AscendingNode   -47.3018
		ArgOfPericenter -57.6741
		MeanAnomaly     -148.115
	}
}

DwarfMoon	"Storm D2"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            1.9364e-007
	Radius          83.6439
	InertiaMoment   0.399386

	Oblateness      0.249

	Obliquity       -0.0120598
	EqAscendNode    92.1459
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.993 0.989)

	Surface
	{
		SurfStyle       0.224809
		OceanStyle      0.331438
		Randomize      (-0.100, 0.574, -0.340)
		colorDistMagn   0.963443
		colorDistFreq   3.59094
		detailScale     2284.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396996
		venusFreq       2
		terraceProb     0.163807
		erosion         0
		montesMagn      0.446763
		montesFreq      2.74147
		montesSpiky     0.890198
		montesFraction  0.596502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.5764
		hillsFraction   0.606462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221745
		craterFreq      0.211739
		craterDensity   0.825501
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459154
		volcanoTemp     1432.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.283, 0.282, 0.000)
		colorShelf     (0.303, 0.300, 0.299, 0.000)
		colorBeach     (0.321, 0.318, 0.317, 0.000)
		colorDesert    (0.338, 0.336, 0.334, 0.000)
		colorLowland   (0.356, 0.353, 0.352, 0.000)
		colorUpland    (0.374, 0.371, 0.370, 0.000)
		colorRock      (0.392, 0.389, 0.387, 0.000)
		colorSnow      (0.410, 0.406, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00072684
		Period          0.00111183
		Eccentricity    8.68094e-006
		Inclination     -0.0120598
		AscendingNode   92.1459
		ArgOfPericenter 133.814
		MeanAnomaly     -175.038
	}
}

DwarfMoon	"Storm D3"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            2.67657e-007
	Radius          89.4514
	InertiaMoment   0.396793

	Oblateness      0.209474

	Obliquity       0.00271097
	EqAscendNode    -82.8922
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.997 0.995)

	Surface
	{
		SurfStyle       0.201917
		OceanStyle      0.964037
		Randomize      (-0.233, -0.778, 0.667)
		colorDistMagn   0.928056
		colorDistFreq   6.80253
		detailScale     2442.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483982
		venusFreq       2
		terraceProb     0.422096
		erosion         0
		montesMagn      0.596204
		montesFreq      3.72163
		montesSpiky     0.893573
		montesFraction  0.638481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.4135
		hillsFraction   0.555647
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252958
		craterFreq      0.285556
		craterDensity   0.82586
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533143
		volcanoTemp     1656.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.299, 0.000)
		colorShelf     (0.319, 0.318, 0.317, 0.000)
		colorBeach     (0.338, 0.337, 0.336, 0.000)
		colorDesert    (0.356, 0.355, 0.354, 0.000)
		colorLowland   (0.375, 0.374, 0.373, 0.000)
		colorUpland    (0.394, 0.393, 0.392, 0.000)
		colorRock      (0.413, 0.411, 0.410, 0.000)
		colorSnow      (0.431, 0.430, 0.429, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000786792
		Period          0.00125219
		Eccentricity    8.67113e-005
		Inclination     0.00271097
		AscendingNode   -82.8922
		ArgOfPericenter 139.075
		MeanAnomaly     44.8414
	}
}

DwarfMoon	"Storm D4"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            3.7253e-007
	Radius          95.3214
	InertiaMoment   0.398518

	Oblateness      0.160029

	Obliquity       0.0027086
	EqAscendNode    -12.2332
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.997 0.993)

	Surface
	{
		SurfStyle       0.999893
		OceanStyle      0.539017
		Randomize      (-0.123, -0.084, 0.325)
		colorDistMagn   0.680143
		colorDistFreq   1.5844
		detailScale     2602.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.336907
		venusFreq       2
		terraceProb     0.515511
		erosion         0
		montesMagn      0.445282
		montesFreq      2.32833
		montesSpiky     0.93206
		montesFraction  0.667172
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.1616
		hillsFraction   0.355484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224448
		craterFreq      0.334114
		craterDensity   1.05954
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.408201
		volcanoTemp     1492.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.203, 0.231, 0.050)
		colorShelf     (0.233, 0.238, 0.266, 0.040)
		colorBeach     (0.268, 0.273, 0.301, 0.030)
		colorDesert    (0.303, 0.308, 0.341, 0.020)
		colorLowland   (0.338, 0.343, 0.376, 0.030)
		colorUpland    (0.373, 0.377, 0.411, 0.050)
		colorRock      (0.408, 0.412, 0.457, 0.020)
		colorSnow      (0.408, 0.412, 0.457, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000823221
		Period          0.00134016
		Eccentricity    3.93052e-005
		Inclination     0.0027086
		AscendingNode   -12.2332
		ArgOfPericenter 14.437
		MeanAnomaly     -137.32
	}
}

DwarfMoon	"Storm D5"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            5.22841e-007
	Radius          125.247
	InertiaMoment   0.399516

	Oblateness      0.198407

	Obliquity       0.00480944
	EqAscendNode    153.622
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.829 0.657)

	Surface
	{
		SurfStyle       0.0232406
		OceanStyle      0.815572
		Randomize      (0.929, -0.754, -0.141)
		colorDistMagn   0.766933
		colorDistFreq   3.41145
		detailScale     3420.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468741
		venusFreq       2
		terraceProb     0.272739
		erosion         0
		montesMagn      0.699574
		montesFreq      3.23721
		montesSpiky     0.979759
		montesFraction  0.867581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.5322
		hillsFraction   0.797943
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237554
		craterFreq      0.587498
		craterDensity   1.04665
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499792
		volcanoTemp     1419.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.201, 0.160, 0.000)
		colorShelf     (0.258, 0.214, 0.170, 0.000)
		colorBeach     (0.273, 0.226, 0.179, 0.000)
		colorDesert    (0.288, 0.239, 0.189, 0.000)
		colorLowland   (0.303, 0.252, 0.199, 0.000)
		colorUpland    (0.319, 0.264, 0.209, 0.000)
		colorRock      (0.334, 0.277, 0.219, 0.000)
		colorSnow      (0.349, 0.289, 0.229, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000900425
		Period          0.00153303
		Eccentricity    5.28148e-005
		Inclination     0.00480944
		AscendingNode   153.622
		ArgOfPericenter 87.7344
		MeanAnomaly     -116.386
	}
}

DwarfMoon	"Storm D6"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            9.85505e-011
	Radius          6.52043
	InertiaMoment   0.397962

	RotationPeriod  1686.82
	Obliquity       37.6156
	EqAscendNode    -62.1068
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.996 0.993)

	Surface
	{
		SurfStyle       0.340137
		OceanStyle      0.0848104
		Randomize      (-0.486, 0.975, -0.290)
		colorDistMagn   0.49396
		colorDistFreq   0.0261717
		detailScale     178.051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.674104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476047
		venusFreq       2
		terraceProb     0.381888
		erosion         0
		montesMagn      0.409965
		montesFreq      2.45895
		montesSpiky     0.974094
		montesFraction  0.551989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.107436
		hillsFraction   0.611069
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264816
		craterFreq      0.147724
		craterDensity   0.988329
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498779
		volcanoTemp     1636.12
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
		colorSnow      (0.391, 0.390, 0.389, 1.000)
		BumpHeight      5.86839
		BumpOffset      1.17368
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.404013
		Period          14.5705
		Eccentricity    0.345811
		Inclination     9.69249
		AscendingNode   -65.7656
		ArgOfPericenter 163.109
		MeanAnomaly     6.71872
	}
}

DwarfMoon	"Storm D7"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            1.59914e-010
	Radius          7.3535
	InertiaMoment   0.399115

	RotationPeriod  1500.11
	Obliquity       38.7073
	EqAscendNode    -107.432
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.992 0.987)

	Surface
	{
		SurfStyle       0.94853
		OceanStyle      0.997018
		Randomize      (0.016, 0.831, 0.536)
		colorDistMagn   0.041627
		colorDistFreq   0.0425965
		detailScale     200.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64473
		venusFreq       2
		terraceProb     0.248855
		erosion         0
		montesMagn      0.572436
		montesFreq      2.2487
		montesSpiky     0.955372
		montesFraction  0.343709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.122107
		hillsFraction   0.760153
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262868
		craterFreq      0.222906
		craterDensity   0.931037
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487469
		volcanoTemp     1376.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.213, 0.242, 0.050)
		colorShelf     (0.245, 0.249, 0.278, 0.040)
		colorBeach     (0.282, 0.286, 0.315, 0.030)
		colorDesert    (0.319, 0.322, 0.357, 0.020)
		colorLowland   (0.356, 0.359, 0.393, 0.030)
		colorUpland    (0.393, 0.395, 0.430, 0.050)
		colorRock      (0.429, 0.432, 0.478, 0.020)
		colorSnow      (0.429, 0.432, 0.478, 1.000)
		BumpHeight      6.61815
		BumpOffset      1.32363
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.404551
		Period          14.5996
		Eccentricity    0.141523
		Inclination     76.7862
		AscendingNode   -99.368
		ArgOfPericenter -21.6781
		MeanAnomaly     100.705
	}
}

DwarfMoon	"Storm D8"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            2.50618e-010
	Radius          10.9429
	InertiaMoment   0.394704

	RotationPeriod  1765.88
	Obliquity       -62.2825
	EqAscendNode    3.74792
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.995 0.992)

	Surface
	{
		SurfStyle       0.387115
		OceanStyle      0.259769
		Randomize      (0.814, 0.103, 0.034)
		colorDistMagn   0.848768
		colorDistFreq   0.0807772
		detailScale     298.813
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983339
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.729037
		venusFreq       2
		terraceProb     0.151039
		erosion         0
		montesMagn      0.670941
		montesFreq      3.05834
		montesSpiky     0.856067
		montesFraction  0.668654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.283288
		hillsFraction   0.72215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252738
		craterFreq      0.215517
		craterDensity   0.97802
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51831
		volcanoTemp     1596.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.305, 0.303, 0.000)
		colorShelf     (0.325, 0.324, 0.322, 0.000)
		colorBeach     (0.344, 0.343, 0.341, 0.000)
		colorDesert    (0.364, 0.362, 0.360, 0.000)
		colorLowland   (0.383, 0.381, 0.379, 0.000)
		colorUpland    (0.402, 0.400, 0.398, 0.000)
		colorRock      (0.421, 0.419, 0.417, 0.000)
		colorSnow      (0.440, 0.438, 0.436, 1.000)
		BumpHeight      9.84859
		BumpOffset      1.96972
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.405125
		Period          14.6307
		Eccentricity    0.388118
		Inclination     -38.2016
		AscendingNode   -1.46481
		ArgOfPericenter -38.4574
		MeanAnomaly     147.936
	}
}

DwarfMoon	"Storm D9"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            3.82037e-010
	Radius          10.793
	InertiaMoment   0.398162

	RotationPeriod  1424.64
	Obliquity       -62.5076
	EqAscendNode    -143.356
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.924 0.802)

	Surface
	{
		SurfStyle       0.160317
		OceanStyle      0.292502
		Randomize      (-0.393, -0.132, -0.861)
		colorDistMagn   0.833625
		colorDistFreq   0.0720333
		detailScale     294.721
		colorConversion true
		snowLevel       2
		tropicLatitude  0.492873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.363327
		venusFreq       2
		terraceProb     0.199367
		erosion         0
		montesMagn      0.650046
		montesFreq      3.43149
		montesSpiky     0.915155
		montesFraction  0.379922
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.31651
		hillsFraction   0.465331
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271842
		craterFreq      0.224936
		craterDensity   0.915606
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518335
		volcanoTemp     1268.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.180, 0.156, 0.000)
		colorShelf     (0.206, 0.191, 0.166, 0.000)
		colorBeach     (0.218, 0.202, 0.176, 0.000)
		colorDesert    (0.231, 0.213, 0.185, 0.000)
		colorLowland   (0.243, 0.224, 0.195, 0.000)
		colorUpland    (0.255, 0.236, 0.205, 0.000)
		colorRock      (0.267, 0.247, 0.215, 0.000)
		colorSnow      (0.279, 0.258, 0.225, 1.000)
		BumpHeight      9.7137
		BumpOffset      1.94274
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.40558
		Period          14.6553
		Eccentricity    0.132979
		Inclination     -52.4247
		AscendingNode   -146.846
		ArgOfPericenter -72.6966
		MeanAnomaly     -86.3956
	}
}

DwarfMoon	"Storm D10"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            5.69437e-010
	Radius          11.7673
	InertiaMoment   0.399251

	RotationPeriod  1277.01
	Obliquity       114.453
	EqAscendNode    -71.8026
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.993 0.983)

	Surface
	{
		SurfStyle       0.334911
		OceanStyle      0.489301
		Randomize      (-0.842, -0.414, 0.929)
		colorDistMagn   0.857555
		colorDistFreq   0.0586688
		detailScale     321.325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893936
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457414
		venusFreq       2
		terraceProb     0.272087
		erosion         0
		montesMagn      0.504496
		montesFreq      3.5881
		montesSpiky     0.768972
		montesFraction  0.45174
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.277148
		hillsFraction   0.533854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27873
		craterFreq      0.198244
		craterDensity   0.813684
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537571
		volcanoTemp     1811.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.235, 0.232, 0.000)
		colorShelf     (0.251, 0.249, 0.247, 0.000)
		colorBeach     (0.266, 0.264, 0.262, 0.000)
		colorDesert    (0.281, 0.279, 0.276, 0.000)
		colorLowland   (0.296, 0.293, 0.291, 0.000)
		colorUpland    (0.310, 0.308, 0.305, 0.000)
		colorRock      (0.325, 0.323, 0.320, 0.000)
		colorSnow      (0.340, 0.337, 0.334, 1.000)
		BumpHeight      10.5906
		BumpOffset      2.11811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.405948
		Period          14.6753
		Eccentricity    0.252254
		Inclination     30.5383
		AscendingNode   -78.5693
		ArgOfPericenter 100.168
		MeanAnomaly     -25.84
	}
}

DwarfMoon	"Storm D11"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            8.33252e-010
	Radius          12.8297
	InertiaMoment   0.396208

	RotationPeriod  1148.95
	Obliquity       -86.9882
	EqAscendNode    32.4709
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.860 0.711)

	Surface
	{
		SurfStyle       0.7123
		OceanStyle      0.0997114
		Randomize      (0.784, -0.319, 0.683)
		colorDistMagn   0.00242448
		colorDistFreq   0.0572745
		detailScale     350.335
		colorConversion true
		snowLevel       2
		tropicLatitude  0.625291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442259
		venusFreq       2
		terraceProb     0.42238
		erosion         0
		montesMagn      0.56641
		montesFreq      3.57637
		montesSpiky     0.96614
		montesFraction  0.77062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.492653
		hillsFraction   0.780559
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262462
		craterFreq      0.198754
		craterDensity   0.772542
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496017
		volcanoTemp     1435.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.200, 0.136, 0.000)
		colorShelf     (0.274, 0.206, 0.156, 0.000)
		colorBeach     (0.322, 0.241, 0.185, 0.000)
		colorDesert    (0.349, 0.259, 0.180, 0.000)
		colorLowland   (0.384, 0.277, 0.204, 0.000)
		colorUpland    (0.425, 0.336, 0.248, 0.000)
		colorRock      (0.459, 0.365, 0.268, 0.000)
		colorSnow      (0.500, 0.389, 0.282, 1.000)
		BumpHeight      11.5467
		BumpOffset      2.30934
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.406457
		Period          14.7029
		Eccentricity    0.471368
		Inclination     -64.9014
		AscendingNode   27.4272
		ArgOfPericenter -164.251
		MeanAnomaly     -42.6194
	}
}

DwarfMoon	"Storm D12"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            1.2008e-009
	Radius          13.4896
	InertiaMoment   0.398345

	RotationPeriod  1011.26
	Obliquity       -18.7681
	EqAscendNode    -11.4604
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.758 0.578)

	Surface
	{
		SurfStyle       0.907167
		OceanStyle      0.588654
		Randomize      (-0.073, -0.820, -0.129)
		colorDistMagn   0.737455
		colorDistFreq   0.0772672
		detailScale     368.357
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661582
		venusFreq       2
		terraceProb     0.306116
		erosion         0
		montesMagn      0.502411
		montesFreq      3.21708
		montesSpiky     0.823059
		montesFraction  0.111502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.244797
		hillsFraction   0.914874
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264755
		craterFreq      0.208229
		craterDensity   0.941312
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494455
		volcanoTemp     1514.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.136, 0.119, 0.050)
		colorShelf     (0.205, 0.159, 0.136, 0.040)
		colorBeach     (0.235, 0.182, 0.154, 0.030)
		colorDesert    (0.266, 0.205, 0.175, 0.020)
		colorLowland   (0.297, 0.229, 0.193, 0.030)
		colorUpland    (0.328, 0.252, 0.210, 0.050)
		colorRock      (0.358, 0.275, 0.234, 0.020)
		colorSnow      (0.358, 0.275, 0.234, 1.000)
		BumpHeight      12.1407
		BumpOffset      2.42813
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.406853
		Period          14.7244
		Eccentricity    0.0417733
		Inclination     -50.6793
		AscendingNode   -9.78109
		ArgOfPericenter 54.2185
		MeanAnomaly     -135.047
	}
}

DwarfMoon	"Storm D13"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            1.70857e-009
	Radius          17.9371
	InertiaMoment   0.399383

	RotationPeriod  1126.74
	Obliquity       107.746
	EqAscendNode    -174.119
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.857 0.797)

	Surface
	{
		SurfStyle       0.251843
		OceanStyle      0.69883
		Randomize      (0.740, -0.337, 0.119)
		colorDistMagn   0.71738
		colorDistFreq   0.240669
		detailScale     489.801
		colorConversion true
		snowLevel       2
		tropicLatitude  0.720502
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511373
		venusFreq       2
		terraceProb     0.206171
		erosion         0
		montesMagn      0.586872
		montesFreq      2.60102
		montesSpiky     0.942858
		montesFraction  0.267834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.411667
		hillsFraction   0.378106
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211974
		craterFreq      0.200291
		craterDensity   0.933423
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5206
		volcanoTemp     1332.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.269, 0.250, 0.000)
		colorShelf     (0.333, 0.286, 0.266, 0.000)
		colorBeach     (0.353, 0.302, 0.281, 0.000)
		colorDesert    (0.372, 0.319, 0.297, 0.000)
		colorLowland   (0.392, 0.336, 0.313, 0.000)
		colorUpland    (0.412, 0.353, 0.328, 0.000)
		colorRock      (0.431, 0.370, 0.344, 0.000)
		colorSnow      (0.451, 0.387, 0.360, 1.000)
		BumpHeight      16.1433
		BumpOffset      3.22867
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.407405
		Period          14.7544
		Eccentricity    0.073965
		Inclination     61.8369
		AscendingNode   -175.716
		ArgOfPericenter 26.3312
		MeanAnomaly     157.552
	}
}

DwarfMoon	"Storm D14"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            2.40534e-009
	Radius          19.1325
	InertiaMoment   0.396783

	RotationPeriod  1011.47
	Obliquity       -140.082
	EqAscendNode    -132.732
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.994 0.983)

	Surface
	{
		SurfStyle       0.586326
		OceanStyle      0.420922
		Randomize      (0.397, -0.388, 0.700)
		colorDistMagn   0.149683
		colorDistFreq   0.165258
		detailScale     522.444
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96765
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429993
		venusFreq       2
		terraceProb     0.483126
		erosion         0
		montesMagn      0.67286
		montesFreq      2.50327
		montesSpiky     0.964383
		montesFraction  0.409666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.827216
		hillsFraction   0.615943
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25856
		craterFreq      0.220822
		craterDensity   0.788727
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475022
		volcanoTemp     1564.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.160, 0.130, 0.000)
		colorShelf     (0.189, 0.164, 0.149, 0.000)
		colorBeach     (0.222, 0.193, 0.177, 0.000)
		colorDesert    (0.241, 0.207, 0.172, 0.000)
		colorLowland   (0.265, 0.221, 0.195, 0.000)
		colorUpland    (0.293, 0.268, 0.237, 0.000)
		colorRock      (0.317, 0.291, 0.256, 0.000)
		colorSnow      (0.345, 0.310, 0.269, 1.000)
		BumpHeight      17.2192
		BumpOffset      3.44385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.407875
		Period          14.7799
		Eccentricity    0.0267335
		Inclination     -79.9888
		AscendingNode   -127.607
		ArgOfPericenter 31.9338
		MeanAnomaly     -117.584
	}
}

DwarfMoon	"Storm D15"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            3.35637e-009
	Radius          20.5373
	InertiaMoment   0.398515

	RotationPeriod  922.436
	Obliquity       -36.7417
	EqAscendNode    149.154
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.991 0.982)

	Surface
	{
		SurfStyle       0.645788
		OceanStyle      0.74517
		Randomize      (0.955, -0.757, 0.887)
		colorDistMagn   0.429251
		colorDistFreq   0.298649
		detailScale     560.805
		colorConversion true
		snowLevel       2
		tropicLatitude  0.292975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742231
		venusFreq       2
		terraceProb     0.118263
		erosion         0
		montesMagn      0.513747
		montesFreq      2.59355
		montesSpiky     0.974256
		montesFraction  0.466722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03708
		hillsFraction   0.893148
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249651
		craterFreq      0.234112
		craterDensity   0.909184
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490576
		volcanoTemp     1478.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.186, 0.151, 0.000)
		colorShelf     (0.220, 0.191, 0.173, 0.000)
		colorBeach     (0.259, 0.224, 0.206, 0.000)
		colorDesert    (0.281, 0.240, 0.200, 0.000)
		colorLowland   (0.308, 0.257, 0.227, 0.000)
		colorUpland    (0.341, 0.311, 0.276, 0.000)
		colorRock      (0.369, 0.339, 0.298, 0.000)
		colorSnow      (0.402, 0.360, 0.314, 1.000)
		BumpHeight      18.4836
		BumpOffset      3.69671
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.408231
		Period          14.7992
		Eccentricity    0.352674
		Inclination     -30.6469
		AscendingNode   151.002
		ArgOfPericenter 170.983
		MeanAnomaly     43.4258
	}
}

DwarfMoon	"Storm D16"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            4.64911e-009
	Radius          21.6108
	InertiaMoment   0.399513

	RotationPeriod  827.023
	Obliquity       53.721
	EqAscendNode    -15.4295
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.997 0.992)

	Surface
	{
		SurfStyle       0.0620842
		OceanStyle      0.979922
		Randomize      (0.111, -0.915, 0.022)
		colorDistMagn   0.162467
		colorDistFreq   0.298753
		detailScale     590.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.860945
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500816
		venusFreq       2
		terraceProb     0.313909
		erosion         0
		montesMagn      0.375045
		montesFreq      3.49779
		montesSpiky     0.887764
		montesFraction  0.426315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.05751
		hillsFraction   0.7366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233929
		craterFreq      0.198863
		craterDensity   0.77801
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.456192
		volcanoTemp     1279.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.259, 0.000)
		colorShelf     (0.278, 0.276, 0.275, 0.000)
		colorBeach     (0.294, 0.293, 0.292, 0.000)
		colorDesert    (0.310, 0.309, 0.308, 0.000)
		colorLowland   (0.327, 0.325, 0.324, 0.000)
		colorUpland    (0.343, 0.342, 0.340, 0.000)
		colorRock      (0.359, 0.358, 0.356, 0.000)
		colorSnow      (0.375, 0.374, 0.372, 1.000)
		BumpHeight      19.4497
		BumpOffset      3.88995
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.408794
		Period          14.8299
		Eccentricity    0.299946
		Inclination     5.81778
		AscendingNode   -11.8582
		ArgOfPericenter 7.06219
		MeanAnomaly     -26.3139
	}
}

DwarfMoon	"Storm D17"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            6.40103e-009
	Radius          28.1318
	InertiaMoment   0.397174

	RotationPeriod  913.599
	Obliquity       62.3594
	EqAscendNode    113.513
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.984 0.974)

	Surface
	{
		SurfStyle       0.340502
		OceanStyle      0.956529
		Randomize      (-0.030, 0.448, 0.761)
		colorDistMagn   0.844
		colorDistFreq   0.329524
		detailScale     768.187
		colorConversion true
		snowLevel       2
		tropicLatitude  0.903045
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429519
		venusFreq       2
		terraceProb     0.159489
		erosion         0
		montesMagn      0.389041
		montesFreq      3.28024
		montesSpiky     0.938308
		montesFraction  0.793224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.94836
		hillsFraction   0.697621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254278
		craterFreq      0.250328
		craterDensity   0.662093
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471526
		volcanoTemp     1371.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.168, 0.166, 0.000)
		colorShelf     (0.181, 0.178, 0.176, 0.000)
		colorBeach     (0.192, 0.189, 0.187, 0.000)
		colorDesert    (0.202, 0.199, 0.197, 0.000)
		colorLowland   (0.213, 0.210, 0.207, 0.000)
		colorUpland    (0.224, 0.220, 0.218, 0.000)
		colorRock      (0.234, 0.231, 0.228, 0.000)
		colorSnow      (0.245, 0.241, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.409372
		Period          14.8614
		Eccentricity    0.370278
		Inclination     80.4581
		AscendingNode   113.807
		ArgOfPericenter 123.394
		MeanAnomaly     30.5986
	}
}

DwarfMoon	"Storm D18"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            8.77039e-009
	Radius          29.6235
	InertiaMoment   0.398675

	RotationPeriod  824.59
	Obliquity       -9.73721
	EqAscendNode    5.83166
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.983 0.973)

	Surface
	{
		SurfStyle       0.0394257
		OceanStyle      0.327217
		Randomize      (0.556, 0.519, 0.222)
		colorDistMagn   0.171927
		colorDistFreq   0.247179
		detailScale     808.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.265039
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5085
		venusFreq       2
		terraceProb     0.306854
		erosion         0
		montesMagn      0.3536
		montesFreq      3.39289
		montesSpiky     0.978129
		montesFraction  0.684342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2775
		hillsFraction   0.713017
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25268
		craterFreq      0.249214
		craterDensity   1.0745
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423876
		volcanoTemp     1488.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.205, 0.203, 0.000)
		colorShelf     (0.222, 0.218, 0.216, 0.000)
		colorBeach     (0.235, 0.230, 0.228, 0.000)
		colorDesert    (0.248, 0.243, 0.241, 0.000)
		colorLowland   (0.261, 0.256, 0.254, 0.000)
		colorUpland    (0.274, 0.269, 0.266, 0.000)
		colorRock      (0.287, 0.281, 0.279, 0.000)
		colorSnow      (0.300, 0.294, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.409758
		Period          14.8824
		Eccentricity    0.433227
		Inclination     -5.63651
		AscendingNode   2.84908
		ArgOfPericenter -168.64
		MeanAnomaly     173.443
	}
}

DwarfMoon	"Storm D19"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            1.19713e-008
	Radius          31.5627
	InertiaMoment   0.399641

	RotationPeriod  753.749
	Obliquity       5.77757
	EqAscendNode    -173.374
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.810 0.729)

	Surface
	{
		SurfStyle       0.908579
		OceanStyle      0.313091
		Randomize      (0.584, 0.567, -0.572)
		colorDistMagn   0.935961
		colorDistFreq   0.763637
		detailScale     861.873
		colorConversion true
		snowLevel       2
		tropicLatitude  0.171205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761312
		venusFreq       2
		terraceProb     0.623099
		erosion         0
		montesMagn      0.568526
		montesFreq      3.71496
		montesSpiky     0.990973
		montesFraction  0.49787
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.61393
		hillsFraction   0.538085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235834
		craterFreq      0.148547
		craterDensity   0.775071
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59991
		volcanoTemp     1179.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.133, 0.136, 0.050)
		colorShelf     (0.187, 0.155, 0.157, 0.040)
		colorBeach     (0.215, 0.178, 0.177, 0.030)
		colorDesert    (0.243, 0.201, 0.201, 0.020)
		colorLowland   (0.271, 0.223, 0.222, 0.030)
		colorUpland    (0.299, 0.246, 0.242, 0.050)
		colorRock      (0.327, 0.269, 0.269, 0.020)
		colorSnow      (0.327, 0.269, 0.269, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.410211
		Period          14.907
		Eccentricity    0.496686
		Inclination     -4.11974
		AscendingNode   -169.634
		ArgOfPericenter 31.5115
		MeanAnomaly     -176.544
	}
}

DwarfMoon	"Storm D20"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            1.62944e-008
	Radius          33.2434
	InertiaMoment   0.397479

	RotationPeriod  679.415
	Obliquity       -80.813
	EqAscendNode    -155.869
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.997 0.995)

	Surface
	{
		SurfStyle       0.960058
		OceanStyle      0.270608
		Randomize      (0.471, -0.064, 0.799)
		colorDistMagn   0.305393
		colorDistFreq   0.498816
		detailScale     907.766
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845621
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287166
		venusFreq       2
		terraceProb     0.169693
		erosion         0
		montesMagn      0.413506
		montesFreq      3.22087
		montesSpiky     0.998512
		montesFraction  0.551603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.62176
		hillsFraction   0.638816
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263567
		craterFreq      0.184689
		craterDensity   0.948449
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428315
		volcanoTemp     1641.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.271, 0.309, 0.050)
		colorShelf     (0.310, 0.317, 0.355, 0.040)
		colorBeach     (0.357, 0.364, 0.401, 0.030)
		colorDesert    (0.404, 0.410, 0.455, 0.020)
		colorLowland   (0.450, 0.457, 0.502, 0.030)
		colorUpland    (0.497, 0.503, 0.548, 0.050)
		colorRock      (0.543, 0.550, 0.610, 0.020)
		colorSnow      (0.543, 0.550, 0.610, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.41055
		Period          14.9255
		Eccentricity    0.133645
		Inclination     -24.7084
		AscendingNode   -160.406
		ArgOfPericenter 67.0902
		MeanAnomaly     86.4045
	}
}

DwarfMoon	"Storm D21"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            2.21369e-008
	Radius          43.0269
	InertiaMoment   0.398827

	RotationPeriod  754.868
	Obliquity       102.57
	EqAscendNode    -4.89135
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.995 0.992)

	Surface
	{
		SurfStyle       0.064058
		OceanStyle      0.371524
		Randomize      (-0.973, -0.630, 0.359)
		colorDistMagn   0.816131
		colorDistFreq   0.968508
		detailScale     1174.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.796282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407626
		venusFreq       2
		terraceProb     0.562582
		erosion         0
		montesMagn      0.509092
		montesFreq      2.22717
		montesSpiky     0.966923
		montesFraction  0.626696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.02924
		hillsFraction   0.765718
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255533
		craterFreq      0.213805
		craterDensity   0.84666
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526087
		volcanoTemp     1195.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.241, 0.240, 0.000)
		colorShelf     (0.257, 0.256, 0.255, 0.000)
		colorBeach     (0.272, 0.271, 0.270, 0.000)
		colorDesert    (0.287, 0.286, 0.285, 0.000)
		colorLowland   (0.302, 0.301, 0.300, 0.000)
		colorUpland    (0.317, 0.316, 0.315, 0.000)
		colorRock      (0.333, 0.331, 0.330, 0.000)
		colorSnow      (0.348, 0.346, 0.345, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.411171
		Period          14.9594
		Eccentricity    0.0651906
		Inclination     24.677
		AscendingNode   2.29512
		ArgOfPericenter 90.0402
		MeanAnomaly     57.6712
	}
}

DwarfMoon	"Storm D22"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            3.00439e-008
	Radius          44.9323
	InertiaMoment   0.399767

	RotationPeriod  678.273
	Obliquity       46.7311
	EqAscendNode    -32.2583
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.990 0.978)

	Surface
	{
		SurfStyle       0.492849
		OceanStyle      0.0942729
		Randomize      (-0.785, 0.260, 0.617)
		colorDistMagn   0.0229983
		colorDistFreq   1.08293
		detailScale     1226.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736581
		venusFreq       2
		terraceProb     0.265137
		erosion         0
		montesMagn      0.454384
		montesFreq      2.55603
		montesSpiky     0.991695
		montesFraction  0.63234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.68375
		hillsFraction   0.453769
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255569
		craterFreq      0.279772
		craterDensity   0.6233
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550893
		volcanoTemp     1714.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.202, 0.199, 0.000)
		colorShelf     (0.217, 0.215, 0.212, 0.000)
		colorBeach     (0.229, 0.227, 0.224, 0.000)
		colorDesert    (0.242, 0.240, 0.237, 0.000)
		colorLowland   (0.255, 0.253, 0.249, 0.000)
		colorUpland    (0.268, 0.265, 0.262, 0.000)
		colorRock      (0.280, 0.278, 0.274, 0.000)
		colorSnow      (0.293, 0.290, 0.287, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.411786
		Period          14.993
		Eccentricity    0.399773
		Inclination     34.8398
		AscendingNode   -28.3488
		ArgOfPericenter -60.4748
		MeanAnomaly     169.826
	}
}

DwarfMoon	"Storm D23"
{
	ParentBody     "Storm"
	Class	       "Asteroid"

	Mass            4.07694e-008
	Radius          47.7591
	InertiaMoment   0.397734

	RotationPeriod  617.895
	Obliquity       22.2125
	EqAscendNode    37.0204
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (1.000 0.902 0.744)

	Surface
	{
		SurfStyle       0.382131
		OceanStyle      0.198301
		Randomize      (0.312, 0.761, -0.578)
		colorDistMagn   0.0826667
		colorDistFreq   1.62812
		detailScale     1304.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.803686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382879
		venusFreq       2
		terraceProb     0.494848
		erosion         0
		montesMagn      0.649066
		montesFreq      3.74851
		montesSpiky     0.924793
		montesFraction  0.293559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.32218
		hillsFraction   0.582525
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22111
		craterFreq      0.249327
		craterDensity   0.929411
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425211
		volcanoTemp     1793.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.240, 0.198, 0.000)
		colorShelf     (0.283, 0.255, 0.210, 0.000)
		colorBeach     (0.299, 0.270, 0.223, 0.000)
		colorDesert    (0.316, 0.285, 0.235, 0.000)
		colorLowland   (0.333, 0.300, 0.248, 0.000)
		colorUpland    (0.349, 0.315, 0.260, 0.000)
		colorRock      (0.366, 0.330, 0.272, 0.000)
		colorSnow      (0.382, 0.345, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.412148
		Eccentricity    0.0287091
		Inclination     36.3232
		AscendingNode   47.6529
		ArgOfPericenter -67.0565
		MeanAnomaly     -17.2911
	}
}
