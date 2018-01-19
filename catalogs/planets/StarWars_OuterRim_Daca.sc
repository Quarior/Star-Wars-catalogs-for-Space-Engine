// http://starwars.wikia.com/wiki/Dac
// Region : Outer Rim
// Sector : Calamari Sector
// Grid location : U6
// X : 13608.12, Y : 4951.81, Z : 302.65217002946963
Star	"Daca A"
{
	ParentBody     "Daca"
	Class	       "F9 V"
	MassSol 1.24185
	RadSol 1.20768
	Lum 1.70016
	Teff 6010
	
	Orbit
	{
		SemiMajorAxis   0.0988276060892
		Eccentricity    0.0541014
		Inclination     270.80684
		AscendingNode   160.68941
		ArgOfPericenter 64.12457
		MeanAnomaly     -336.84184
		RefPlane       "Equator"
	}
}

Star	"Daca B"
{
	ParentBody     "Daca"
	Class	       "M1 V"
	MassSol 0.51469
	RadSol 0.50411
	Lum 0.039188
	Teff 3622
	
	Orbit
	{
		SemiMajorAxis   0.2384523939108
		Eccentricity    0.0541014
		Inclination     270.80684
		AscendingNode   160.68941
		ArgOfPericenter 244.12457
		MeanAnomaly     -336.84184
		RefPlane       "Equator"
	}
}

DwarfPlanet	"Mon Luxu"
{
	ParentBody     "Daca"
	Class	       "Selena"

	Mass            0.00528256
	Radius          1098.12
	InertiaMoment   0.391942

	RotationPeriod  48.9959
	Obliquity       -117.082
	EqAscendNode    160.403

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.929 0.889 0.857)

	Surface
	{
		SurfStyle       0.330392
		OceanStyle      0.659302
		Randomize      (-0.770, 0.287, -0.162)
		colorDistMagn   0.0690787
		colorDistFreq   121.894
		detailScale     2824.43
		colorConversion true
		drivenDarkening 0
		seaLevel        0.249393
		snowLevel       2
		tropicLatitude  0.538657
		icecapLatitude  10
		icecapHeight    0.205022
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.98963
		venusFreq       2
		venusMagn       0
		mareFreq        0.361149
		mareDensity     0.00296146
		terraceProb     0.47625
		erosion         0
		montesMagn      0.0615228
		montesFreq      42.6844
		montesSpiky     0.869046
		montesFraction  0.269323
		dunesMagn       0.0296185
		dunesFreq       1442.59
		dunesFraction   0.876676
		hillsMagn       0.116541
		hillsFreq       136.298
		hillsFraction   0.0524894
		hills2Fraction  0
		riversMagn      73.0551
		riversFreq      2.11756
		riversSin       5.86441
		riversOctaves   0
		canyonsMagn     0.510901
		canyonsFreq     0.306521
		canyonFraction  0.068988
		cracksMagn      0.0309773
		cracksFreq      0.638414
		cracksOctaves   0
		craterMagn      0.527177
		craterFreq      2.73614
		craterDensity   0.912395
		craterOctaves   10
		craterRayedFactor 0.168086
		volcanoMagn     0.159025
		volcanoFreq     0.64737
		volcanoDensity  0.188661
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.178417
		volcanoRadius   0.165563
		volcanoTemp     1446.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.237, 0.244, 0.255, 0.000)
		colorDesert    (0.207, 0.197, 0.195, 0.000)
		colorLowland   (0.263, 0.261, 0.238, 0.000)
		colorUpland    (0.280, 0.278, 0.259, 0.000)
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
		SemiMajorAxis   0.91304
		Period          0.65816
		Eccentricity    0.032929
		Inclination     270.185
		AscendingNode   161.43
		ArgOfPericenter 328.245
		MeanAnomaly     -200.32
	}
}




Planet	"Mon Calamari/Dac/Calamari/Mon Cala"
{
	ParentBody     "Daca"
	Class	       "Terra"

	Mass            0.54249
	Radius          5515.01
	InertiaMoment   0.329909

	Oblateness      0.00513353

	RotationPeriod  21.0586
	Obliquity       -91.601
	EqAscendNode    156.929

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.853 0.819 0.830)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.115049
		OceanStyle      0.8
		Randomize      (-0.518, -0.862, -0.069)
		colorDistMagn   0.0522856
		colorDistFreq   766.954
		detailScale     14184.9
		colorConversion true
		drivenDarkening -1
		seaLevel        0.979285
		snowLevel       1
		tropicLatitude  0.337456
		icecapLatitude  0.987539
		icecapHeight    0.179647
		climatePole     0.690476
		climateTropic   0.492063
		climateEquator  0.571429
		heightTempGrad  0.625
		tropicWidth     0.0816573
		mainFreq        1.84912
		venusFreq       1
		venusMagn       0
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.409557
		erosion         0.113271
		montesMagn      0.189775
		montesFreq      266.19
		montesSpiky     0.871855
		montesFraction  0.330392
		dunesMagn       0.0412341
		dunesFreq       38.4502
		dunesFraction   0.659302
		hillsMagn       0.122711
		hillsFreq       551.04
		hillsFraction   0.269323
		hills2Fraction  0.876676
		riversMagn      100
		riversFreq      0
		riversSin       0
		riversOctaves   0
		canyonsMagn     0.0524796
		canyonsFreq     100
		canyonFraction  0.596232
		cracksMagn      0.0703947
		cracksFreq      0.379182
		cracksOctaves   0
		craterMagn      0
		craterFreq      11.2531
		craterDensity   0.193116
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.659365
		volcanoFreq     1.476095
		volcanoDensity  0.0793016
		volcanoOctaves  5
		volcanoActivity 0.301587
		volcanoFlows    0.5851
		volcanoRadius   1.0
		volcanoTemp     1489.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.39837
		stripeFluct     0
		stripeTwist     0.3015
		cycloneMagn     14.7619
		cycloneFreq     1.12698
		cycloneDensity  0.453247
		cycloneOctaves  2
		colorSea       (0.010, 0.050, 0.390, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.820, 0.730, 0.570, 0.000)
		colorDesert    (0.420, 0.360, 0.220, 0.000)
		colorLowland   (0.220, 0.230, 0.220, 0.000)
		colorUpland    (0.570, 0.540, 0.420, 0.000)
		colorRock      (0.100, 0.100, 0.100, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20
		BumpOffset      19.0857
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0.927059
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          5.83789
		Velocity        73.7016
		BumpHeight      5.83813
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.2015
		mainOctaves     10
		Coverage        0.281905
		stripeZones     2.39837
		stripeFluct     0
		stripeTwist     0.3015
	}

	Ocean
	{
		Height          19.0857
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          80.291
		Density         1.68999
		Pressure        1.20872
		Greenhouse      18.1074
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			N2    	58.7169
			O2    	37.6107
			Ar    	2.4317
			CO2   	0.5479
			H2O   	0.53828
			Ne    	0.15441
		}
	}

	Aurora
	{
		Height      62.4332
		NorthLat    63.3354
		NorthLon    72.7421
		NorthRadius 1061.51
		NorthWidth  199.617
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -49.2776
		SouthLon    256.474
		SouthRadius 1164.78
		SouthWidth  314.246
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
		SemiMajorAxis   1.27813
		Period          1.09008
		Eccentricity    0.0079415
		Inclination     269.084
		AscendingNode   160.285
		ArgOfPericenter -31.948
		MeanAnomaly     137.891
	}
}



Moon	"Dac's Moon"
{
	ParentBody     "Mon Calamari"
	Class	       "Selena"

	Mass            0.000130097
	Radius          342.64
	InertiaMoment   0.399188

	Oblateness      0.00181302

	Obliquity       28.2042
	EqAscendNode    257.348
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.799 0.760 0.723)

	Surface
	{
		SurfStyle       0.330392
		OceanStyle      0.659302
		Randomize      (-0.770, 0.287, -0.162)
		colorDistMagn   0.0690787
		colorDistFreq   38.0339
		detailScale     881.29
		colorConversion true
		drivenDarkening 0
		seaLevel        0.249393
		snowLevel       1
		tropicLatitude  0.564317
		icecapLatitude  1
		icecapHeight    0.239344
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.98963
		venusFreq       0.724754
		venusMagn       0
		mareFreq        1.7302
		mareDensity     0.436508
		terraceProb     0.269276
		erosion         0
		montesMagn      0.0615228
		montesFreq      13.3186
		montesSpiky     0.869046
		montesFraction  0.269323
		dunesMagn       0.0296185
		dunesFreq       100
		dunesFraction   0.876676
		hillsMagn       0.116541
		hillsFreq       42.5284
		hillsFraction   0.0524894
		hills2Fraction  0
		riversMagn      73.0551
		riversFreq      2.11756
		riversSin       5.86441
		riversOctaves   0
		canyonsMagn     0.510901
		canyonsFreq     0.095642
		canyonFraction  0.228863
		cracksMagn      0.0309773
		cracksFreq      0.199201
		cracksOctaves   0
		craterMagn      0.2341
		craterFreq      2.85714
		craterDensity   0.761905
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.159025
		volcanoFreq     0.64737
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.23779
		volcanoFlows    0.178417
		volcanoRadius   0.165563
		volcanoTemp     1446.2
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
		colorBeach     (0.440, 0.433, 0.434, 0.000)
		colorDesert    (0.384, 0.349, 0.333, 0.000)
		colorLowland   (0.488, 0.463, 0.405, 0.000)
		colorUpland    (0.519, 0.494, 0.441, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      11.7132
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
		SemiMajorAxis   0.00032488
		Period          0.00459744
		Eccentricity    0.086223
		Inclination     28.2042
		AscendingNode   257.348
		ArgOfPericenter 246.261
		MeanAnomaly     -58.3172
	}
}




DwarfPlanet	"Iceberg I"
{
	ParentBody     "Daca"
	Class	       "IceWorld"

	Mass            0.00362914
	Radius          1418.2
	InertiaMoment   0.394932

	Oblateness      0.00193282

	RotationPeriod  61.7348
	Obliquity       -76.89073
	EqAscendNode    172.691

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.832 0.750 0.674)

	Surface
	{
		SurfStyle       0.0792887
		OceanStyle      0.217408
		Randomize      (0.363, 0.876, -0.285)
		colorDistMagn   0.055084
		colorDistFreq   165.208
		detailScale     3647.69
		colorConversion true
		drivenDarkening 0
		seaLevel        0.130083
		snowLevel       2
		tropicLatitude  0.995038
		icecapLatitude  3.93443
		icecapHeight    0.122856
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86326
		venusFreq       1.14877
		venusMagn       0
		mareFreq        0.781231
		mareDensity     0.000633629
		terraceProb     0.185024
		erosion         0
		montesMagn      0.0588575
		montesFreq      86.2267
		montesSpiky     0.981121
		montesFraction  0.746358
		dunesMagn       0.0502439
		dunesFreq       1895.12
		dunesFraction   0.75691
		hillsMagn       0.101358
		hillsFreq       142.994
		hillsFraction   0.350381
		hills2Fraction  0.25936
		riversMagn      57.5944
		riversFreq      2.75782
		riversSin       7.01136
		riversOctaves   0
		canyonsMagn     0.567413
		canyonsFreq     0.431752
		canyonFraction  0
		cracksMagn      0.0523991
		cracksFreq      0.45136
		cracksOctaves   1
		craterMagn      0.578787
		craterFreq      3.41852
		craterDensity   0.948308
		craterOctaves   11
		craterRayedFactor 0.191699
		volcanoMagn     0.186447
		volcanoFreq     0.582215
		volcanoDensity  0.229176
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0649006
		volcanoRadius   0.154626
		volcanoTemp     1505.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.466, 0.455, 0.452, 0.500)
		colorShelf     (0.443, 0.433, 0.429, 0.500)
		colorBeach     (0.326, 0.319, 0.316, 0.750)
		colorDesert    (0.396, 0.387, 0.384, 1.000)
		colorLowland   (0.410, 0.401, 0.398, 1.000)
		colorUpland    (0.433, 0.424, 0.420, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.410, 0.401, 0.398, 1.000)
		colorUpPlants  (0.433, 0.424, 0.420, 1.000)
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
		SemiMajorAxis   2.08008
		Period          2.26317
		Eccentricity    0.0883558
		Inclination     271.017
		AscendingNode   167.512
		ArgOfPericenter 90.2343
		MeanAnomaly     18.0523
	}
}



DwarfMoon	"Iceberg I.D1"
{
	ParentBody     "Iceberg I"
	Class	       "Asteroid"

	Mass            8.86136e-008
	Radius          39.6936
	InertiaMoment   0.3944

	Obliquity       0.00955631
	EqAscendNode    -25.4481
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.620 0.619)

	Surface
	{
		SurfStyle       0.0788932
		OceanStyle      0.931707
		Randomize      (-0.902, 0.319, 0.596)
		colorDistMagn   0.321784
		colorDistFreq   0.903633
		detailScale     1083.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624913
		terraceProb     0.224729
		erosion         0
		montesMagn      0.503293
		montesFreq      2.14525
		montesSpiky     0.756335
		montesFraction  0.400405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.62401
		hillsFraction   0.692618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22949
		craterFreq      0.230039
		craterDensity   0.670923
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454379
		volcanoTemp     1506.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.247, 0.000)
		colorShelf     (0.266, 0.264, 0.263, 0.000)
		colorBeach     (0.281, 0.279, 0.278, 0.000)
		colorDesert    (0.297, 0.295, 0.294, 0.000)
		colorLowland   (0.313, 0.310, 0.309, 0.000)
		colorUpland    (0.328, 0.326, 0.325, 0.000)
		colorRock      (0.344, 0.341, 0.340, 0.000)
		colorSnow      (0.360, 0.357, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.96799e-005
		Eccentricity    8.46104e-005
		Inclination     0.00955631
		AscendingNode   -25.4481
		ArgOfPericenter -149.201
		MeanAnomaly     51.1334
	}
}



Planet	"Iceberg II"
{
	ParentBody     "Daca"
	Class	       "IceWorld"

	Mass            0.0212399
	Radius          2443.2
	InertiaMoment   0.344634

	Oblateness      0.00315935

	RotationPeriod  41.0965
	Obliquity       -101.337
	EqAscendNode    152.014

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.796 0.709 0.681)

	Surface
	{
		SurfStyle       0.781938
		OceanStyle      0.112123
		Randomize      (-0.542, 0.464, -0.030)
		colorDistMagn   0.0536052
		colorDistFreq   315.035
		detailScale     6284.05
		colorConversion true
		drivenDarkening 0
		seaLevel        0.118848
		snowLevel       2
		tropicLatitude  0.403312
		icecapLatitude  0.853086
		icecapHeight    0.121159
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.60977
		venusFreq       1.36895
		venusMagn       0
		mareFreq        1.11286
		mareDensity     0.00284484
		terraceProb     0.340817
		erosion         0
		montesMagn      0.138289
		montesFreq      97.4969
		montesSpiky     0.999603
		montesFraction  0.00512611
		dunesMagn       0.0282565
		dunesFreq       3208.93
		dunesFraction   0.781367
		hillsMagn       0.145686
		hillsFreq       311.189
		hillsFraction   0.0893561
		hills2Fraction  0.211363
		riversMagn      62.1365
		riversFreq      2.17705
		riversSin       6.96891
		riversOctaves   0
		canyonsMagn     0.609719
		canyonsFreq     1.00812
		canyonFraction  0
		cracksMagn      0.0220347
		cracksFreq      0.708805
		cracksOctaves   1
		craterMagn      0.631939
		craterFreq      5.78933
		craterDensity   0.89427
		craterOctaves   12
		craterRayedFactor 0.0752395
		volcanoMagn     0.427598
		volcanoFreq     0.620591
		volcanoDensity  0.226743
		volcanoOctaves  3
		volcanoActivity 0.00199387
		volcanoFlows    0.322143
		volcanoRadius   0.352321
		volcanoTemp     1540.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.509, 0.482, 0.473, 0.250)
		colorShelf     (0.557, 0.550, 0.536, 0.250)
		colorBeach     (0.454, 0.407, 0.409, 0.200)
		colorDesert    (0.422, 0.369, 0.360, 0.200)
		colorLowland   (0.310, 0.286, 0.296, 0.200)
		colorUpland    (0.589, 0.557, 0.536, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.310, 0.286, 0.296, 0.200)
		colorUpPlants  (0.589, 0.557, 0.536, 0.250)
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
		SemiMajorAxis   2.44207
		Period          2.87895
		Eccentricity    0.0805299
		Inclination     269.655
		AscendingNode   158.762
		ArgOfPericenter 172.26
		MeanAnomaly     189.201
	}
}




Planet	"Mon Eron"
{
	ParentBody     "Daca"
	Class	       "Terra"

	Mass            1.19429
	Radius          6521.02
	InertiaMoment   0.327743

	Oblateness      0.00830001

	RotationPeriod  64.2948
	Obliquity       -70.0447
	EqAscendNode    149.433

	AlbedoBond      0.359103
	AlbedoGeom      0.310924
	Brightness      2
	Color          (0.704 0.637 0.574)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		SurfStyle       0.75691
		OceanStyle      0.350381
		Randomize      (-0.565, 0.823, 0.493)
		colorDistMagn   0.0418697
		colorDistFreq   898.413
		detailScale     16772.4
		colorConversion true
		drivenDarkening -1
		seaLevel        0.568958
		snowLevel       0.888889
		tropicLatitude  0.4768
		icecapLatitude  0.690476
		icecapHeight    0.206349
		climatePole     1
		climateTropic   0.309524
		climateEquator  0.5
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631627
		venusFreq       2
		venusMagn       0.319733
		mareFreq        2.45754
		mareDensity     0.208317
		terraceProb     0.120051
		erosion         0
		montesMagn      0.234496
		montesFreq      287.619
		montesSpiky     0.981943
		montesFraction  0.280882
		dunesMagn       0.0538427
		dunesFreq       36.5079
		dunesFraction   0.460317
		hillsMagn       0.123098
		hillsFreq       624.924
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.2907
		riversFreq      3.26123
		riversSin       7.19876
		riversOctaves   0
		canyonsMagn     0.0528914
		canyonsFreq     100
		canyonFraction  0.732245
		cracksMagn      0.0994455
		cracksFreq      0.794949
		cracksOctaves   0
		craterMagn      0.660736
		craterFreq      11.5154
		craterDensity   0.355206
		craterOctaves   3
		craterRayedFactor 0
		volcanoMagn     0.657446
		volcanoFreq     0.575784
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.571429
		volcanoFlows    0.787474
		volcanoRadius   0.554235
		volcanoTemp     1680.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.81773
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     3.1652
		cycloneFreq     0.859026
		cycloneDensity  0.303064
		cycloneOctaves  3
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.780, 0.750, 0.740, 0.000)
		colorDesert    (0.470, 0.420, 0.390, 0.000)
		colorLowland   (0.270, 0.250, 0.230, 0.000)
		colorUpland    (0.490, 0.480, 0.460, 0.000)
		colorRock      (0.260, 0.240, 0.230, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      18.711
		BumpOffset      10.6458
		DiffMapAlpha   "Water"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.459093
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          4.53809
		Velocity        73.7016
		BumpHeight      3.11827
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0688
		mainOctaves     10
		Coverage        0.22602
		stripeZones     1.81773
		stripeFluct     0
		stripeTwist     0
	}

	Clouds
	{
		Height          9.07666
		Velocity        107.984
		BumpHeight      4.53827
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0688
		mainOctaves     10
		Coverage        0.22602
		stripeZones     1.81773
		stripeFluct     0
		stripeTwist     0
	}

	Ocean
	{
		Height          10.6458
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          50.7747
		Density         1.01681
		Pressure        0.753213
		Greenhouse      130.154
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			O2    	56.8223
			N2    	40.8116
			CO2   	1.16483
			H2O   	0.39302
			CH4   	0.35968
			Ar    	0.299993
			He    	0.14859
		}
	}

	Aurora
	{
		Height      88.535
		NorthLat    69.7639
		NorthLon    -125.997
		NorthRadius 1973.45
		NorthWidth  624.42
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -79.7201
		SouthLon    71.0043
		SouthRadius 1853.93
		SouthWidth  456.024
		SouthRings  5		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     8157.93
		OuterRadius     10108.7
		RotationPeriod  2.21295
		RotationOffset  0
		FrontBright     0.673016
		BackBright      0.822736
		Density         0.556095
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.55929
		Period          5.06572
		Eccentricity    0.0172828
		Inclination     271.384
		AscendingNode   157.92
		ArgOfPericenter 86.6901
		MeanAnomaly     57.6266
	}
}




Moon	"Mon Eron.1"
{
	ParentBody     "Mon Eron"
	Class	       "IceWorld"

	Mass            0.000442297
	Radius          660.654
	InertiaMoment   0.399852

	Oblateness      0.0101137

	Obliquity       1.46018
	EqAscendNode    79.6876
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.637 0.558 0.504)

	Surface
	{
		SurfStyle       0.555252
		OceanStyle      0.711977
		Randomize      (0.322, -0.943, -0.173)
		colorDistMagn   0.0498569
		colorDistFreq   75.8914
		detailScale     1699.24
		colorConversion true
		drivenDarkening 0
		seaLevel        0.197327
		snowLevel       2
		tropicLatitude  0.0391221
		icecapLatitude  0.707198
		icecapHeight    0.22278
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82393
		venusFreq       1.13876
		venusMagn       0.255979
		mareFreq        0.033361
		mareDensity     0.000292419
		terraceProb     0.549094
		erosion         0
		montesMagn      0.0537159
		montesFreq      32.8493
		montesSpiky     0.898121
		montesFraction  0.659408
		dunesMagn       0.0512392
		dunesFreq       866.635
		dunesFraction   0.797903
		hillsMagn       0.125375
		hillsFreq       77.1378
		hillsFraction   0.0788932
		hills2Fraction  0.279512
		riversMagn      56.6828
		riversFreq      4.1787
		riversSin       5.63417
		riversOctaves   0
		canyonsMagn     0.513359
		canyonsFreq     0.196688
		canyonFraction  0
		cracksMagn      0.0218692
		cracksFreq      0.25102
		cracksOctaves   0
		craterMagn      0.635415
		craterFreq      2.16195
		craterDensity   0.895122
		craterOctaves   9
		craterRayedFactor 0.0779083
		volcanoMagn     0.175191
		volcanoFreq     0.826035
		volcanoDensity  0.178395
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.264568
		volcanoRadius   0.154089
		volcanoTemp     1590.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.114, 0.099, 0.000)
		colorShelf     (0.171, 0.142, 0.127, 0.000)
		colorBeach     (0.259, 0.215, 0.190, 0.200)
		colorDesert    (0.236, 0.201, 0.167, 0.500)
		colorLowland   (0.180, 0.155, 0.127, 0.800)
		colorUpland    (0.305, 0.274, 0.235, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.180, 0.155, 0.127, 0.800)
		colorUpPlants  (0.305, 0.274, 0.235, 1.000)
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
		SemiMajorAxis   0.00030584
		Period          0.00283
		Eccentricity    0.0114912
		Inclination     1.46018
		AscendingNode   79.6876
		ArgOfPericenter -132.965
		MeanAnomaly     165.406
	}
}




DwarfMoon	"Mon Eron.D1"
{
	ParentBody     "Mon Eron"
	Class	       "Asteroid"

	Mass            4.1114e-010
	Radius          10.6427
	InertiaMoment   0.396872

	Obliquity       -88.6103
	EqAscendNode    -113.965
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.479 0.473 0.467)

	Surface
	{
		SurfStyle       0.114679
		OceanStyle      0.923844
		Randomize      (0.484, -0.330, -0.003)
		colorDistMagn   0.482598
		colorDistFreq   0.0426452
		detailScale     290.616
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913637
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688725
		terraceProb     0.237719
		erosion         0
		montesMagn      0.500825
		montesFreq      2.88222
		montesSpiky     0.974429
		montesFraction  0.600253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.317743
		hillsFraction   0.493642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212864
		craterFreq      0.146108
		craterDensity   0.958071
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511626
		volcanoTemp     1483.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.189, 0.187, 0.000)
		colorShelf     (0.204, 0.201, 0.198, 0.000)
		colorBeach     (0.216, 0.213, 0.210, 0.000)
		colorDesert    (0.228, 0.225, 0.222, 0.000)
		colorLowland   (0.240, 0.237, 0.233, 0.000)
		colorUpland    (0.252, 0.248, 0.245, 0.000)
		colorRock      (0.264, 0.260, 0.257, 0.000)
		colorSnow      (0.275, 0.272, 0.269, 1.000)
		BumpHeight      9.57842
		BumpOffset      1.91568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00200129
		Period          0.0473794
		Eccentricity    0.155502
		Inclination     -88.6103
		AscendingNode   -113.965
		ArgOfPericenter -92.5577
		MeanAnomaly     86.5924
	}
}






Planet	"Sep Elopon"
{
	ParentBody     "Daca"
	Class	       "GasGiant"

	Mass            1255.2
	Radius          77479.9
	InertiaMoment   0.213772

	Oblateness      0.0258311

	RotationPeriod  8.39957
	Obliquity       -98.7472
	EqAscendNode    160.2273

	AlbedoBond      0.507769
	AlbedoGeom      0.609323
	Brightness      2

	Surface
	{
		SurfStyle       0.697906
		Randomize      (-0.749, -0.763, 0.932)
		detailScale     199283
		colorConversion true
		tropicLatitude  0.320907
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.71743
		stripeFluct     0.430799
		stripeTwist     8.50585
		cycloneMagn     14.1946
		cycloneFreq     0.856186
		cycloneDensity  0.402329
		cycloneOctaves  5
		colorLayer0    (0.840, 0.730, 0.570, 1.100)
		colorLayer1    (0.850, 0.750, 0.600, 0.600)
		colorLayer2    (0.340, 0.290, 0.200, 0.100)
		colorLayer3    (0.460, 0.380, 0.270, 0.000)
		colorLayer4    (0.560, 0.470, 0.320, 0.000)
		colorLayer5    (0.580, 0.500, 0.360, 0.000)
		colorLayer6    (0.730, 0.630, 0.480, 0.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.560, 0.470, 0.320, 0.000)
		colorUpPlants  (0.580, 0.500, 0.360, 0.000)
		BumpHeight      6.85754
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          29.5547
		Velocity        -453.87
		BumpHeight      22.6954
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.683091
		mainOctaves     12
		Coverage        0.577694
		stripeZones     3.71743
		stripeFluct     0.430799
		stripeTwist     8.50585
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          120.335
		Density         5441.26
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0113344
		Saturation      0.5749

		Composition
		{
			H2    	92.136
			He    	7.42867
			CH4   	0.368424
			N2    	0.0454401
			O2    	0.00841189
			NH3   	0.00459494
			C2H2  	0.00381027
			C2H4  	0.00148231
			Ne    	0.0011729
			Ar    	0.000904157
			C2H6  	0.000645283
			C3H8  	0.000403651
		}
	}

	Aurora
	{
		Height      6385.96
		NorthLat    82.3507
		NorthLon    -127.28
		NorthRadius 19919.2
		NorthWidth  12593.3
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.9618
		SouthLon    47.9638
		SouthRadius 17747.7
		SouthWidth  11036.2
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     90887.8
		OuterRadius     217647
		RotationPeriod  4.73846
		RotationOffset  0
		FrontBright     0.952511
		BackBright      0.85574
		Density         0.944909
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.16255
		Period          8.83950
		Eccentricity    0.0917025
		Inclination     270.860601
		AscendingNode   160.2273
		ArgOfPericenter 224.139
		MeanAnomaly     259.629
	}
}



Moon	"Sep Elopon.1"
{
	ParentBody     "Sep Elopon"
	Class	       "Desert"

	Mass            0.0861931
	Radius          3557.26
	InertiaMoment   0.331006

	Oblateness      0.00689427

	Obliquity       0.111501
	EqAscendNode    127.834
	TidalLocked     true

	AlbedoBond      0.368676
	AlbedoGeom      0.442411
	Brightness      2
	Color          (0.489 0.482 0.478)

	Surface
	{
		SurfStyle       0.238086
		OceanStyle      0.0326808
		Randomize      (0.882, 0.806, -0.402)
		colorDistMagn   0.0928863
		colorDistFreq   474.561
		detailScale     9149.47
		colorConversion true
		seaLevel        0.115556
		snowLevel       2
		tropicLatitude  0.00172633
		icecapLatitude  10
		icecapHeight    0.135121
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.731886
		venusFreq       1.01873
		venusMagn       0
		mareFreq        1.17113
		mareDensity     0.0154058
		terraceProb     0.192858
		erosion         0
		montesMagn      0.204542
		montesFreq      200.437
		montesSpiky     0.969521
		montesFraction  0.762052
		dunesMagn       0.0423116
		dunesFreq       40.1962
		dunesFraction   0.3902
		hillsMagn       0.160914
		hillsFreq       372.43
		hillsFraction   0
		hills2Fraction  0
		riversMagn      57.1722
		riversFreq      3.34306
		riversSin       5.10779
		riversOctaves   0
		canyonsMagn     0.0285035
		canyonsFreq     91.8178
		canyonFraction  0
		cracksMagn      0.0850927
		cracksFreq      0.285726
		cracksOctaves   0
		craterMagn      0.557455
		craterFreq      10.7483
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.700985
		volcanoFreq     0.587683
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.499202
		volcanoRadius   0.548652
		volcanoTemp     1489.93
		lavaCoverTidal  0.608553
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.46319
		stripeTwist     0
		cycloneMagn     2.29468
		cycloneFreq     0.434419
		cycloneDensity  0.416447
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
		Height          15.9919
		Velocity        167.44
		BumpHeight      5.94681
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01941
		mainOctaves     10
		Coverage        0.337352
		stripeZones     2.46319
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          177.863
		Density         3.78705
		Pressure        3.6483
		Greenhouse      3.5993
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0284179
		Saturation      0.922578

		Composition
		{
			CO2   	88.7972
			SO2   	11.2027
			Kr    	2.90899e-005
		}
	}

	Aurora
	{
		Height      72.5631
		NorthLat    88.0128
		NorthLon    51.3874
		NorthRadius 820.51
		NorthWidth  189.673
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    248.335
		SouthRadius 831.401
		SouthWidth  239.211
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
		SemiMajorAxis   0.0030129
		Period          0.00269951
		Eccentricity    0.0452806
		Inclination     0.111501
		AscendingNode   127.834
		ArgOfPericenter 65.4264
		MeanAnomaly     -86.1982
	}
}



Moon	"Sep Elopon.2"
{
	ParentBody     "Sep Elopon"
	Class	       "Desert"

	Mass            0.997667
	Radius          7034.4
	InertiaMoment   0.333938

	Oblateness      0.00125322

	Obliquity       -0.726219
	EqAscendNode    13.3172
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.709 0.704 0.700)

	Surface
	{
		SurfStyle       0.948254
		OceanStyle      0.256363
		Randomize      (-0.864, 0.902, 0.158)
		colorDistMagn   0.0476206
		colorDistFreq   990.19
		detailScale     18092.9
		colorConversion true
		seaLevel        0.146681
		snowLevel       2
		tropicLatitude  0.0251765
		icecapLatitude  1
		icecapHeight    0.146681
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.732924
		venusFreq       0.585647
		venusMagn       0.390277
		mareFreq        1.40296
		mareDensity     0.139206
		terraceProb     0.430888
		erosion         0
		montesMagn      0.262089
		montesFreq      229.892
		montesSpiky     0.901001
		montesFraction  0.100099
		dunesMagn       0.0499296
		dunesFreq       57.1934
		dunesFraction   0.611489
		hillsMagn       0.14867
		hillsFreq       721.13
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.0362
		riversFreq      3.536
		riversSin       4.83733
		riversOctaves   0
		canyonsMagn     0.0658838
		canyonsFreq     198.656
		canyonFraction  0
		cracksMagn      0.109117
		cracksFreq      0.634159
		cracksOctaves   0
		craterMagn      0.620394
		craterFreq      20.0422
		craterDensity   0.322966
		craterOctaves   5.6645
		volcanoMagn     0.672216
		volcanoFreq     0.718364
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.334279
		volcanoRadius   0.533845
		volcanoTemp     1520.26
		lavaCoverTidal  0.578814
		lavaCoverSun    0
		lavaCoverYoung  0
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
		Hapke           0.986723
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
		Height          73.7311
		Density         0.00132768
		Pressure        0.00186802
		Greenhouse      1.78842
		Bright          4.21326
		Opacity         1
		SkyLight        1.40442
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	78.5201
			CO2   	10.4017
			H2O   	4.23266
			C2H4  	3.32107
			H2S   	0.96231
			NH3   	0.879564
			C2H2  	0.753603
			SO2   	0.514349
			C3H8  	0.351236
			C2H6  	0.0537264
			N2    	0.00827747
			CO    	0.00129123
			O2    	7.26842e-005
			Cl2   	2.74865e-005
			Ar    	1.47562e-005
		}
	}

	Aurora
	{
		Height      66.5618
		NorthLat    78.6944
		NorthLon    68.5312
		NorthRadius 2180.2
		NorthWidth  689.569
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    248.764
		SouthRadius 1715.47
		SouthWidth  431.174
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
		SemiMajorAxis   0.00466734
		Period          0.005203
		Eccentricity    0.0348935
		Inclination     -0.726219
		AscendingNode   13.3172
		ArgOfPericenter -160.59
		MeanAnomaly     -77.8025
	}
}



Moon	"Sep Elopon.3"
{
	ParentBody     "Sep Elopon"
	Class	       "Selena"

	Mass            0.115589
	Radius          4156.25
	InertiaMoment   0.331634

	Obliquity       -0.828439
	EqAscendNode    -105.86
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.601 0.595 0.592)

	Surface
	{
		SurfStyle       0.845042
		OceanStyle      0.219614
		Randomize      (-0.985, -0.775, 0.929)
		colorDistMagn   0.073157
		colorDistFreq   434.99
		detailScale     10690.1
		colorConversion true
		drivenDarkening 0
		seaLevel        0.129847
		snowLevel       2
		tropicLatitude  0.017431
		icecapLatitude  0.833926
		icecapHeight    0.143812
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76694
		venusFreq       1.29307
		venusMagn       0
		mareFreq        2.13903
		mareDensity     0.00893506
		terraceProb     0.114617
		erosion         0
		montesMagn      0.2576
		montesFreq      260.297
		montesSpiky     0.893648
		montesFraction  0.898433
		dunesMagn       0.0341545
		dunesFreq       5391.28
		dunesFraction   0.050379
		hillsMagn       0.110215
		hillsFreq       488.283
		hillsFraction   0.28159
		hills2Fraction  0
		riversMagn      61.2114
		riversFreq      2.6773
		riversSin       4.69208
		riversOctaves   0
		canyonsMagn     0.530612
		canyonsFreq     1.3253
		canyonFraction  0.532334
		cracksMagn      0.0272731
		cracksFreq      2.41332
		cracksOctaves   0
		craterMagn      0.589348
		craterFreq      15.9625
		craterDensity   0.647131
		craterOctaves   8.94678
		craterRayedFactor 0
		volcanoMagn     0.698197
		volcanoFreq     0.715281
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.197397
		volcanoRadius   0.456177
		volcanoTemp     1802.63
		lavaCoverTidal  0.282706
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.336, 0.280, 0.249, 0.000)
		colorDesert    (0.306, 0.262, 0.219, 0.000)
		colorLowland   (0.234, 0.202, 0.166, 0.000)
		colorUpland    (0.396, 0.357, 0.308, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.991629
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
		Height          114.674
		Density         0.000837112
		Pressure        0.000290113
		Greenhouse      0.0300333
		Bright          3.84199
		Opacity         0
		SkyLight        1.28066
		Hue             -0.0129151
		Saturation      1

		Composition
		{
			CO2   	87.0775
			SO2   	12.4682
			C3H8  	0.454266
			Ar    	1.45333e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00723026
		Period          0.0100354
		Eccentricity    0.0322858
		Inclination     -0.828439
		AscendingNode   -105.86
		ArgOfPericenter 112.125
		MeanAnomaly     0.9179
	}
}



DwarfMoon	"Sep Elopon.D1"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            9.46179e-008
	Radius          68.0347
	InertiaMoment   0.398152

	Obliquity       -32.855
	EqAscendNode    138.287
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.478 0.474 0.473)

	Surface
	{
		SurfStyle       0.498018
		OceanStyle      0.519696
		Randomize      (0.128, -0.499, -0.896)
		colorDistMagn   0.345615
		colorDistFreq   3.29838
		detailScale     1857.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.379026
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564551
		terraceProb     0.249721
		erosion         0
		montesMagn      0.45542
		montesFreq      2.70983
		montesSpiky     0.903303
		montesFraction  0.637746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.1904
		hillsFraction   0.645759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212683
		craterFreq      0.270212
		craterDensity   0.910498
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548415
		volcanoTemp     1722.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.190, 0.189, 0.000)
		colorShelf     (0.203, 0.202, 0.201, 0.000)
		colorBeach     (0.215, 0.214, 0.213, 0.000)
		colorDesert    (0.227, 0.225, 0.225, 0.000)
		colorLowland   (0.239, 0.237, 0.237, 0.000)
		colorUpland    (0.251, 0.249, 0.248, 0.000)
		colorRock      (0.263, 0.261, 0.260, 0.000)
		colorSnow      (0.275, 0.273, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0399487
		Period          0.13034
		Eccentricity    0.272685
		Inclination     -32.855
		AscendingNode   138.287
		ArgOfPericenter 65.1862
		MeanAnomaly     56.1985
	}
}



DwarfMoon	"Sep Elopon.D2"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            1.29331e-007
	Radius          71.9801
	InertiaMoment   0.399244

	RotationPeriod  1923.4
	Obliquity       -26.6714
	EqAscendNode    173.758

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.605 0.600)

	Surface
	{
		SurfStyle       0.969193
		OceanStyle      0.641392
		Randomize      (-0.685, 0.969, -0.594)
		colorDistMagn   0.229914
		colorDistFreq   1.80753
		detailScale     1965.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0488672
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622417
		terraceProb     0.114333
		erosion         0
		montesMagn      0.616188
		montesFreq      2.5031
		montesSpiky     0.983755
		montesFraction  0.754082
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.1986
		hillsFraction   0.521202
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213745
		craterFreq      0.220611
		craterDensity   0.828127
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.581366
		volcanoTemp     1565.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.212, 0.240, 0.050)
		colorShelf     (0.243, 0.248, 0.276, 0.040)
		colorBeach     (0.280, 0.284, 0.312, 0.030)
		colorDesert    (0.316, 0.320, 0.354, 0.020)
		colorLowland   (0.353, 0.357, 0.390, 0.030)
		colorUpland    (0.390, 0.393, 0.426, 0.050)
		colorRock      (0.426, 0.429, 0.474, 0.020)
		colorSnow      (0.426, 0.429, 0.474, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0402164
		Period          0.131652
		Eccentricity    0.149407
		Inclination     -26.6714
		AscendingNode   173.758
		ArgOfPericenter -115.512
		MeanAnomaly     158.13
	}
}



DwarfMoon	"Sep Elopon.D3"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            1.77526e-007
	Radius          76.8359
	InertiaMoment   0.396168

	Obliquity       -60.3127
	EqAscendNode    -174.358
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.545 0.541 0.540)

	Surface
	{
		SurfStyle       0.243457
		OceanStyle      0.916896
		Randomize      (0.519, -0.310, -0.419)
		colorDistMagn   0.830821
		colorDistFreq   4.54415
		detailScale     2098.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0854386
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511929
		terraceProb     0.253502
		erosion         0
		montesMagn      0.392387
		montesFreq      2.48457
		montesSpiky     0.834526
		montesFraction  0.929504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.2866
		hillsFraction   0.355025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238164
		craterFreq      0.214917
		craterDensity   0.959054
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558869
		volcanoTemp     1387.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.217, 0.216, 0.000)
		colorShelf     (0.231, 0.230, 0.229, 0.000)
		colorBeach     (0.245, 0.244, 0.243, 0.000)
		colorDesert    (0.259, 0.257, 0.256, 0.000)
		colorLowland   (0.272, 0.271, 0.270, 0.000)
		colorUpland    (0.286, 0.284, 0.283, 0.000)
		colorRock      (0.300, 0.298, 0.297, 0.000)
		colorSnow      (0.313, 0.311, 0.310, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.040672
		Period          0.133895
		Eccentricity    0.0150388
		Inclination     -60.3127
		AscendingNode   -174.358
		ArgOfPericenter 43.6199
		MeanAnomaly     43.1693
	}
}



DwarfMoon	"Sep Elopon.D4"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            2.4498e-007
	Radius          80.2568
	InertiaMoment   0.398336

	RotationPeriod  2962.89
	Obliquity       -82.5711
	EqAscendNode    -164.907

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.683 0.600 0.499)

	Surface
	{
		SurfStyle       0.741143
		OceanStyle      0.644436
		Randomize      (0.414, 0.990, 0.729)
		colorDistMagn   0.424522
		colorDistFreq   4.02288
		detailScale     2191.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.258234
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325795
		terraceProb     0.261274
		erosion         0
		montesMagn      0.503555
		montesFreq      2.20371
		montesSpiky     0.87893
		montesFraction  0.866582
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.6038
		hillsFraction   0.741668
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203096
		craterFreq      0.204253
		craterDensity   0.851587
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515892
		volcanoTemp     1835.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.204, 0.140, 0.000)
		colorShelf     (0.273, 0.210, 0.160, 0.000)
		colorBeach     (0.321, 0.246, 0.190, 0.000)
		colorDesert    (0.348, 0.264, 0.185, 0.000)
		colorLowland   (0.383, 0.282, 0.210, 0.000)
		colorUpland    (0.424, 0.342, 0.255, 0.000)
		colorRock      (0.458, 0.372, 0.275, 0.000)
		colorSnow      (0.499, 0.396, 0.290, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0409362
		Period          0.135202
		Eccentricity    0.206862
		Inclination     -82.5711
		AscendingNode   -164.907
		ArgOfPericenter -93.1489
		MeanAnomaly     -77.452
	}
}



DwarfMoon	"Sep Elopon.D5"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            3.40283e-007
	Radius          105.191
	InertiaMoment   0.399377

	RotationPeriod  3592.23
	Obliquity       84.838
	EqAscendNode    107.973

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.572 0.479)

	Surface
	{
		SurfStyle       0.0164137
		OceanStyle      0.271877
		Randomize      (0.172, -0.571, 0.376)
		colorDistMagn   0.750439
		colorDistFreq   6.73227
		detailScale     2872.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949366
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652687
		terraceProb     0.301615
		erosion         0
		montesMagn      0.484846
		montesFreq      2.96982
		montesSpiky     0.874818
		montesFraction  0.408569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.6316
		hillsFraction   0.751671
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236752
		craterFreq      0.321094
		craterDensity   0.719991
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501719
		volcanoTemp     1212.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.229, 0.192, 0.000)
		colorShelf     (0.287, 0.243, 0.203, 0.000)
		colorBeach     (0.304, 0.258, 0.215, 0.000)
		colorDesert    (0.321, 0.272, 0.227, 0.000)
		colorLowland   (0.338, 0.286, 0.239, 0.000)
		colorUpland    (0.355, 0.300, 0.251, 0.000)
		colorRock      (0.372, 0.315, 0.263, 0.000)
		colorSnow      (0.389, 0.329, 0.275, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0412179
		Period          0.1366
		Eccentricity    0.492919
		Inclination     84.838
		AscendingNode   107.973
		ArgOfPericenter 167.111
		MeanAnomaly     171.035
	}
}



DwarfMoon	"Sep Elopon.D6"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            4.76427e-007
	Radius          111.821
	InertiaMoment   0.39676

	Obliquity       13.2787
	EqAscendNode    -91.7948
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.707 0.654)

	Surface
	{
		SurfStyle       0.199203
		OceanStyle      0.321976
		Randomize      (0.663, 0.151, 0.130)
		colorDistMagn   0.684993
		colorDistFreq   3.43602
		detailScale     3053.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.315589
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.271104
		terraceProb     0.281872
		erosion         0
		montesMagn      0.435389
		montesFreq      3.14153
		montesSpiky     0.981917
		montesFraction  0.485399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.1565
		hillsFraction   0.892257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27264
		craterFreq      0.536676
		craterDensity   1.02359
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45865
		volcanoTemp     1353.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.283, 0.261, 0.000)
		colorShelf     (0.321, 0.300, 0.278, 0.000)
		colorBeach     (0.340, 0.318, 0.294, 0.000)
		colorDesert    (0.359, 0.336, 0.310, 0.000)
		colorLowland   (0.378, 0.353, 0.327, 0.000)
		colorUpland    (0.397, 0.371, 0.343, 0.000)
		colorRock      (0.416, 0.389, 0.360, 0.000)
		colorSnow      (0.435, 0.407, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0417669
		Period          0.139339
		Eccentricity    0.280669
		Inclination     13.2787
		AscendingNode   -91.7948
		ArgOfPericenter -74.691
		MeanAnomaly     95.0175
	}
}



DwarfMoon	"Sep Elopon.D7"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            6.73437e-007
	Radius          120.549
	InertiaMoment   0.398506

	Obliquity       78.2748
	EqAscendNode    -128.664
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.437 0.433 0.427)

	Surface
	{
		SurfStyle       0.962078
		OceanStyle      0.837189
		Randomize      (-0.947, 0.409, -0.309)
		colorDistMagn   0.725424
		colorDistFreq   7.88635
		detailScale     3291.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.768172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390863
		terraceProb     0.268036
		erosion         0
		montesMagn      0.451584
		montesFreq      3.74636
		montesSpiky     0.990256
		montesFraction  0.206845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.7826
		hillsFraction   0.607922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264254
		craterFreq      0.55651
		craterDensity   0.985469
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478814
		volcanoTemp     1805.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.149, 0.152, 0.171, 0.050)
		colorShelf     (0.175, 0.178, 0.196, 0.040)
		colorBeach     (0.201, 0.204, 0.222, 0.030)
		colorDesert    (0.227, 0.229, 0.252, 0.020)
		colorLowland   (0.253, 0.255, 0.277, 0.030)
		colorUpland    (0.280, 0.281, 0.303, 0.050)
		colorRock      (0.306, 0.307, 0.337, 0.020)
		colorSnow      (0.306, 0.307, 0.337, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0423885
		Period          0.142461
		Eccentricity    0.105765
		Inclination     78.2748
		AscendingNode   -128.664
		ArgOfPericenter 137.313
		MeanAnomaly     -26.4034
	}
}



DwarfMoon	"Sep Elopon.D8"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            9.62859e-007
	Radius          128.646
	InertiaMoment   0.399507

	Obliquity       -35.0201
	EqAscendNode    -77.9377
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.620 0.587 0.524)

	Surface
	{
		SurfStyle       0.210738
		OceanStyle      0.240469
		Randomize      (-0.604, -0.712, -0.725)
		colorDistMagn   0.307462
		colorDistFreq   13.2936
		detailScale     3512.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798602
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503822
		terraceProb     0.480972
		erosion         0
		montesMagn      0.456259
		montesFreq      2.09573
		montesSpiky     0.929229
		montesFraction  0.583906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       42.2361
		hillsFraction   0.78608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215256
		craterFreq      0.579506
		craterDensity   0.849621
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496942
		volcanoTemp     1619.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.235, 0.209, 0.000)
		colorShelf     (0.264, 0.249, 0.223, 0.000)
		colorBeach     (0.279, 0.264, 0.236, 0.000)
		colorDesert    (0.295, 0.279, 0.249, 0.000)
		colorLowland   (0.310, 0.293, 0.262, 0.000)
		colorUpland    (0.326, 0.308, 0.275, 0.000)
		colorRock      (0.341, 0.323, 0.288, 0.000)
		colorSnow      (0.357, 0.337, 0.301, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0426114
		Period          0.143586
		Eccentricity    0.429193
		Inclination     -35.0201
		AscendingNode   -77.9377
		ArgOfPericenter 125.361
		MeanAnomaly     36.8752
	}
}



DwarfMoon	"Sep Elopon.D9"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            1.39565e-006
	Radius          170.138
	InertiaMoment   0.397156

	Obliquity       -26.2653
	EqAscendNode    -115.24
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.561 0.558)

	Surface
	{
		SurfStyle       0.51759
		OceanStyle      0.886716
		Randomize      (0.016, 0.264, -0.036)
		colorDistMagn   0.919317
		colorDistFreq   9.79976
		detailScale     4645.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.460476
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512183
		terraceProb     0.361355
		erosion         0
		montesMagn      0.521817
		montesFreq      2.36278
		montesSpiky     0.998372
		montesFraction  0.553207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       76.8476
		hillsFraction   0.666402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244217
		craterFreq      0.982703
		craterDensity   1.00341
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508548
		volcanoTemp     1523.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.191, 0.156, 0.000)
		colorShelf     (0.228, 0.196, 0.179, 0.000)
		colorBeach     (0.267, 0.230, 0.212, 0.000)
		colorDesert    (0.290, 0.247, 0.206, 0.000)
		colorLowland   (0.319, 0.264, 0.234, 0.000)
		colorUpland    (0.353, 0.320, 0.285, 0.000)
		colorRock      (0.381, 0.348, 0.307, 0.000)
		colorSnow      (0.415, 0.370, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0428644
		Period          0.144867
		Eccentricity    0.0811986
		Inclination     -26.2653
		AscendingNode   -115.24
		ArgOfPericenter 48.6226
		MeanAnomaly     -26.9238
	}
}



DwarfMoon	"Sep Elopon.D10"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            2.05656e-006
	Radius          183.172
	InertiaMoment   0.398667

	Obliquity       -79.7688
	EqAscendNode    -136.047
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.404 0.345)

	Surface
	{
		SurfStyle       0.050227
		OceanStyle      0.254812
		Randomize      (-0.098, 0.156, 0.126)
		colorDistMagn   0.874641
		colorDistFreq   24.5447
		detailScale     5001.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.684789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60579
		terraceProb     0.4234
		erosion         0
		montesMagn      0.421843
		montesFreq      2.96248
		montesSpiky     0.848292
		montesFraction  0.433363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       89.9368
		hillsFraction   0.679364
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23656
		craterFreq      1.01
		craterDensity   0.953771
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463769
		volcanoTemp     1991.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.161, 0.138, 0.000)
		colorShelf     (0.208, 0.172, 0.147, 0.000)
		colorBeach     (0.220, 0.182, 0.155, 0.000)
		colorDesert    (0.233, 0.192, 0.164, 0.000)
		colorLowland   (0.245, 0.202, 0.172, 0.000)
		colorUpland    (0.257, 0.212, 0.181, 0.000)
		colorRock      (0.269, 0.222, 0.190, 0.000)
		colorSnow      (0.282, 0.232, 0.198, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0432999
		Period          0.14708
		Eccentricity    0.345458
		Inclination     -79.7688
		AscendingNode   -136.047
		ArgOfPericenter -168.15
		MeanAnomaly     121.701
	}
}



DwarfMoon	"Sep Elopon.D11"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            3.09147e-006
	Radius          201.51
	InertiaMoment   0.399634

	Obliquity       -40.4898
	EqAscendNode    -122.684
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.645 0.641)

	Surface
	{
		SurfStyle       0.279394
		OceanStyle      0.849617
		Randomize      (0.455, 0.565, 0.907)
		colorDistMagn   0.10932
		colorDistFreq   17.8252
		detailScale     5502.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.591832
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.738664
		terraceProb     0.139668
		erosion         0
		montesMagn      0.444208
		montesFreq      2.6065
		montesSpiky     0.910388
		montesFraction  0.466114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       109.686
		hillsFraction   0.666082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261578
		craterFreq      1.07631
		craterDensity   0.921439
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5384
		volcanoTemp     1288.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.256, 0.000)
		colorShelf     (0.276, 0.274, 0.273, 0.000)
		colorBeach     (0.292, 0.290, 0.289, 0.000)
		colorDesert    (0.308, 0.306, 0.305, 0.000)
		colorLowland   (0.325, 0.322, 0.321, 0.000)
		colorUpland    (0.341, 0.339, 0.337, 0.000)
		colorRock      (0.357, 0.355, 0.353, 0.000)
		colorSnow      (0.373, 0.371, 0.369, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0436488
		Period          0.148861
		Eccentricity    0.000428394
		Inclination     -40.4898
		AscendingNode   -122.684
		ArgOfPericenter -30.4433
		MeanAnomaly     -31.6645
	}
}



DwarfMoon	"Sep Elopon.D12"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            4.76191e-006
	Radius          221.628
	InertiaMoment   0.397465

	Obliquity       -5.93478
	EqAscendNode    -148.755
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.634 0.577)

	Surface
	{
		SurfStyle       0.944401
		OceanStyle      0.348066
		Randomize      (0.350, 0.017, -0.555)
		colorDistMagn   0.482999
		colorDistFreq   22.2293
		detailScale     6051.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0556682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.33168
		terraceProb     0.370493
		erosion         0
		montesMagn      0.461081
		montesFreq      3.96916
		montesSpiky     0.877486
		montesFraction  0.560811
		dunesFraction   0
		hillsMagn       0
		hillsFreq       111.359
		hillsFraction   0.765899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268268
		craterFreq      1.4107
		craterDensity   0.828263
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468498
		volcanoTemp     1834.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.222, 0.231, 0.050)
		colorShelf     (0.292, 0.260, 0.265, 0.040)
		colorBeach     (0.336, 0.298, 0.300, 0.030)
		colorDesert    (0.380, 0.336, 0.341, 0.020)
		colorLowland   (0.424, 0.374, 0.375, 0.030)
		colorUpland    (0.468, 0.412, 0.410, 0.050)
		colorRock      (0.512, 0.450, 0.456, 0.020)
		colorSnow      (0.512, 0.450, 0.456, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0440282
		Period          0.150806
		Eccentricity    0.342448
		Inclination     -5.93478
		AscendingNode   -148.755
		ArgOfPericenter 57.5968
		MeanAnomaly     -78.54
	}
}



DwarfMoon	"Sep Elopon.D13"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            1.34983e-011
	Radius          3.66968
	InertiaMoment   0.398819

	Obliquity       21.41
	EqAscendNode    -177.772
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.533 0.530 0.529)

	Surface
	{
		SurfStyle       0.33886
		OceanStyle      0.180311
		Randomize      (-0.151, 0.403, -0.260)
		colorDistMagn   0.353361
		colorDistFreq   0.0118854
		detailScale     100.207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0141934
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361068
		terraceProb     0.158747
		erosion         0
		montesMagn      0.374833
		montesFreq      2.51135
		montesSpiky     0.735871
		montesFraction  0.262272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0348018
		hillsFraction   0.536303
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255883
		craterFreq      0.258617
		craterDensity   0.969417
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449106
		volcanoTemp     1402.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.212, 0.211, 0.000)
		colorShelf     (0.227, 0.225, 0.225, 0.000)
		colorBeach     (0.240, 0.238, 0.238, 0.000)
		colorDesert    (0.253, 0.252, 0.251, 0.000)
		colorLowland   (0.267, 0.265, 0.264, 0.000)
		colorUpland    (0.280, 0.278, 0.278, 0.000)
		colorRock      (0.293, 0.291, 0.291, 0.000)
		colorSnow      (0.307, 0.305, 0.304, 1.000)
		BumpHeight      3.30271
		BumpOffset      0.660542
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0445302
		Period          0.153393
		Eccentricity    0.079183
		Inclination     21.41
		AscendingNode   -177.772
		ArgOfPericenter 39.1843
		MeanAnomaly     21.7063
	}
}



DwarfMoon	"Sep Elopon.D14"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            2.71425e-011
	Radius          4.35599
	InertiaMoment   0.399761

	RotationPeriod  8176.17
	Obliquity       55.4745
	EqAscendNode    -61.1384

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.645 0.643)

	Surface
	{
		SurfStyle       0.906639
		OceanStyle      0.411246
		Randomize      (-0.577, -0.553, 0.188)
		colorDistMagn   0.0342904
		colorDistFreq   0.00998344
		detailScale     118.948
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999979
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323469
		terraceProb     0.254555
		erosion         0
		montesMagn      0.585991
		montesFreq      3.65014
		montesSpiky     0.907187
		montesFraction  0.320992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0467198
		hillsFraction   0.56292
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242448
		craterFreq      0.212566
		craterDensity   0.832059
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.429321
		volcanoTemp     1591.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.226, 0.257, 0.050)
		colorShelf     (0.260, 0.265, 0.296, 0.040)
		colorBeach     (0.300, 0.303, 0.334, 0.030)
		colorDesert    (0.339, 0.342, 0.379, 0.020)
		colorLowland   (0.378, 0.381, 0.418, 0.030)
		colorUpland    (0.417, 0.420, 0.456, 0.050)
		colorRock      (0.456, 0.458, 0.508, 0.020)
		colorSnow      (0.456, 0.458, 0.508, 1.000)
		BumpHeight      3.92039
		BumpOffset      0.784079
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0449286
		Period          0.155456
		Eccentricity    0.224698
		Inclination     55.4745
		AscendingNode   -61.1384
		ArgOfPericenter -52.6585
		MeanAnomaly     -146.077
	}
}



DwarfMoon	"Sep Elopon.D15"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            4.98369e-011
	Radius          5.11946
	InertiaMoment   0.397722

	Obliquity       72.3977
	EqAscendNode    85.4892
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.678 0.654)

	Surface
	{
		SurfStyle       0.640514
		OceanStyle      0.60817
		Randomize      (-0.290, -0.112, 0.504)
		colorDistMagn   0.849959
		colorDistFreq   0.00613014
		detailScale     139.795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576891
		terraceProb     0.372633
		erosion         0
		montesMagn      0.470021
		montesFreq      3.53732
		montesSpiky     0.894913
		montesFraction  0.42105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0968048
		hillsFraction   0.432349
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238143
		craterFreq      0.22227
		craterDensity   0.657567
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45591
		volcanoTemp     1422.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.231, 0.183, 0.000)
		colorShelf     (0.292, 0.237, 0.209, 0.000)
		colorBeach     (0.343, 0.278, 0.249, 0.000)
		colorDesert    (0.372, 0.298, 0.242, 0.000)
		colorLowland   (0.408, 0.319, 0.275, 0.000)
		colorUpland    (0.452, 0.387, 0.334, 0.000)
		colorRock      (0.489, 0.420, 0.360, 0.000)
		colorSnow      (0.532, 0.448, 0.379, 1.000)
		BumpHeight      4.60751
		BumpOffset      0.921503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0454178
		Period          0.158002
		Eccentricity    0.229619
		Inclination     72.3977
		AscendingNode   85.4892
		ArgOfPericenter -102.889
		MeanAnomaly     41.1282
	}
}



DwarfMoon	"Sep Elopon.D16"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            8.57905e-011
	Radius          5.86284
	InertiaMoment   0.398965

	Obliquity       -47.9414
	EqAscendNode    -110.351
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.540 0.530 0.526)

	Surface
	{
		SurfStyle       0.101961
		OceanStyle      0.788026
		Randomize      (0.899, 0.156, 0.399)
		colorDistMagn   0.825024
		colorDistFreq   0.0175638
		detailScale     160.095
		colorConversion true
		snowLevel       2
		tropicLatitude  0.767989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631909
		terraceProb     0.199314
		erosion         0
		montesMagn      0.546306
		montesFreq      3.01846
		montesSpiky     0.973859
		montesFraction  0.410967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0883177
		hillsFraction   0.619516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248385
		craterFreq      0.250724
		craterDensity   0.924556
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.605906
		volcanoTemp     1413.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.212, 0.211, 0.000)
		colorShelf     (0.230, 0.225, 0.224, 0.000)
		colorBeach     (0.243, 0.238, 0.237, 0.000)
		colorDesert    (0.257, 0.252, 0.250, 0.000)
		colorLowland   (0.270, 0.265, 0.263, 0.000)
		colorUpland    (0.284, 0.278, 0.276, 0.000)
		colorRock      (0.297, 0.291, 0.290, 0.000)
		colorSnow      (0.311, 0.305, 0.303, 1.000)
		BumpHeight      5.27655
		BumpOffset      1.05531
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0458769
		Period          0.160404
		Eccentricity    0.000964582
		Inclination     -47.9414
		AscendingNode   -110.351
		ArgOfPericenter -158.458
		MeanAnomaly     -144.888
	}
}



DwarfMoon	"Sep Elopon.D17"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            1.40749e-010
	Radius          8.14034
	InertiaMoment   0.399886

	Obliquity       16.0133
	EqAscendNode    -38.7158
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.718 0.645)

	Surface
	{
		SurfStyle       0.582219
		OceanStyle      0.55612
		Randomize      (-0.120, 0.860, 0.409)
		colorDistMagn   0.889165
		colorDistFreq   0.0367943
		detailScale     222.286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.502591
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349526
		terraceProb     0.299099
		erosion         0
		montesMagn      0.515427
		montesFreq      2.63349
		montesSpiky     0.869519
		montesFraction  0.496665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.2192
		hillsFraction   0.708484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217243
		craterFreq      0.153841
		craterDensity   1.02981
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475338
		volcanoTemp     1338.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.244, 0.181, 0.000)
		colorShelf     (0.305, 0.251, 0.206, 0.000)
		colorBeach     (0.359, 0.294, 0.245, 0.000)
		colorDesert    (0.389, 0.316, 0.239, 0.000)
		colorLowland   (0.427, 0.337, 0.271, 0.000)
		colorUpland    (0.473, 0.409, 0.329, 0.000)
		colorRock      (0.511, 0.445, 0.355, 0.000)
		colorSnow      (0.557, 0.474, 0.374, 1.000)
		BumpHeight      7.32631
		BumpOffset      1.46526
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0462544
		Period          0.162387
		Eccentricity    0.243519
		Inclination     16.0133
		AscendingNode   -38.7158
		ArgOfPericenter 136.104
		MeanAnomaly     -165.584
	}
}



DwarfMoon	"Sep Elopon.D18"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            2.22498e-010
	Radius          8.84108
	InertiaMoment   0.397947

	Obliquity       -2.25157
	EqAscendNode    136.381
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.466 0.463 0.461)

	Surface
	{
		SurfStyle       0.785705
		OceanStyle      0.332028
		Randomize      (0.448, 0.442, 0.078)
		colorDistMagn   0.158174
		colorDistFreq   0.056227
		detailScale     241.421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0291898
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421499
		terraceProb     0.136015
		erosion         0
		montesMagn      0.414832
		montesFreq      3.77484
		montesSpiky     0.846171
		montesFraction  0.381802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.183836
		hillsFraction   0.516095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252223
		craterFreq      0.225975
		craterDensity   0.867225
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536236
		volcanoTemp     1534.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.157, 0.129, 0.000)
		colorShelf     (0.186, 0.162, 0.147, 0.000)
		colorBeach     (0.219, 0.190, 0.175, 0.000)
		colorDesert    (0.238, 0.204, 0.171, 0.000)
		colorLowland   (0.261, 0.218, 0.194, 0.000)
		colorUpland    (0.289, 0.264, 0.235, 0.000)
		colorRock      (0.312, 0.287, 0.253, 0.000)
		colorSnow      (0.340, 0.305, 0.267, 1.000)
		BumpHeight      7.95697
		BumpOffset      1.59139
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0469053
		Period          0.165827
		Eccentricity    0.350056
		Inclination     -2.25157
		AscendingNode   136.381
		ArgOfPericenter -33.8371
		MeanAnomaly     89.8448
	}
}



DwarfMoon	"Sep Elopon.D19"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            3.41534e-010
	Radius          9.77896
	InertiaMoment   0.399105

	Obliquity       -38.3566
	EqAscendNode    -6.46401
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.810 0.789 0.755)

	Surface
	{
		SurfStyle       0.530777
		OceanStyle      0.920637
		Randomize      (0.724, 0.589, 0.028)
		colorDistMagn   0.46143
		colorDistFreq   0.0714039
		detailScale     267.031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972651
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70819
		terraceProb     0.372074
		erosion         0
		montesMagn      0.433164
		montesFreq      3.58712
		montesSpiky     0.859571
		montesFraction  0.802794
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.156013
		hillsFraction   0.492609
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224774
		craterFreq      0.191873
		craterDensity   0.777852
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.580403
		volcanoTemp     1860.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.268, 0.211, 0.000)
		colorShelf     (0.324, 0.276, 0.242, 0.000)
		colorBeach     (0.380, 0.323, 0.287, 0.000)
		colorDesert    (0.413, 0.347, 0.279, 0.000)
		colorLowland   (0.453, 0.371, 0.317, 0.000)
		colorUpland    (0.502, 0.450, 0.385, 0.000)
		colorRock      (0.542, 0.489, 0.415, 0.000)
		colorSnow      (0.591, 0.521, 0.438, 1.000)
		BumpHeight      8.80107
		BumpOffset      1.76021
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0471346
		Period          0.167045
		Eccentricity    0.483368
		Inclination     -38.3566
		AscendingNode   -6.46401
		ArgOfPericenter 1.1609
		MeanAnomaly     -107.372
	}
}



DwarfMoon	"Sep Elopon.D20"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            5.11956e-010
	Radius          10.7181
	InertiaMoment   0.394313

	Obliquity       -24.4831
	EqAscendNode    -166.283
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.663 0.624)

	Surface
	{
		SurfStyle       0.168551
		OceanStyle      0.248798
		Randomize      (0.977, 0.125, 0.451)
		colorDistMagn   0.790388
		colorDistFreq   0.020708
		detailScale     292.677
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0988572
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626104
		terraceProb     0.526726
		erosion         0
		montesMagn      0.532204
		montesFreq      3.13486
		montesSpiky     0.985673
		montesFraction  0.534782
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.273276
		hillsFraction   0.886497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244225
		craterFreq      0.2055
		craterDensity   1.01815
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.400733
		volcanoTemp     1736.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.265, 0.250, 0.000)
		colorShelf     (0.296, 0.282, 0.265, 0.000)
		colorBeach     (0.313, 0.298, 0.281, 0.000)
		colorDesert    (0.331, 0.315, 0.297, 0.000)
		colorLowland   (0.348, 0.331, 0.312, 0.000)
		colorUpland    (0.365, 0.348, 0.328, 0.000)
		colorRock      (0.383, 0.364, 0.343, 0.000)
		colorSnow      (0.400, 0.381, 0.359, 1.000)
		BumpHeight      9.64633
		BumpOffset      1.92927
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0473758
		Period          0.168328
		Eccentricity    0.430871
		Inclination     -24.4831
		AscendingNode   -166.283
		ArgOfPericenter -153.017
		MeanAnomaly     131.201
	}
}



DwarfMoon	"Sep Elopon.D21"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            7.52643e-010
	Radius          14.5344
	InertiaMoment   0.398148

	Obliquity       -9.36883
	EqAscendNode    91.1117
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.844 0.806 0.738)

	Surface
	{
		SurfStyle       0.232083
		OceanStyle      0.879292
		Randomize      (0.341, -0.739, 0.646)
		colorDistMagn   0.913099
		colorDistFreq   0.165984
		detailScale     396.886
		colorConversion true
		snowLevel       2
		tropicLatitude  0.226489
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287946
		terraceProb     0.316851
		erosion         0
		montesMagn      0.45996
		montesFreq      1.89246
		montesSpiky     0.839365
		montesFraction  0.500459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.543589
		hillsFraction   0.617699
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245092
		craterFreq      0.228417
		craterDensity   0.917422
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579994
		volcanoTemp     1188.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.338, 0.322, 0.295, 0.000)
		colorShelf     (0.359, 0.342, 0.314, 0.000)
		colorBeach     (0.380, 0.363, 0.332, 0.000)
		colorDesert    (0.401, 0.383, 0.350, 0.000)
		colorLowland   (0.422, 0.403, 0.369, 0.000)
		colorUpland    (0.443, 0.423, 0.387, 0.000)
		colorRock      (0.464, 0.443, 0.406, 0.000)
		colorSnow      (0.486, 0.463, 0.424, 1.000)
		BumpHeight      13.081
		BumpOffset      2.61619
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0478988
		Period          0.171123
		Eccentricity    0.371441
		Inclination     -9.36883
		AscendingNode   91.1117
		ArgOfPericenter -139.875
		MeanAnomaly     -115.359
	}
}



DwarfMoon	"Sep Elopon.D22"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            1.08884e-009
	Radius          15.1153
	InertiaMoment   0.399241

	Obliquity       16.559
	EqAscendNode    -146.124
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.525 0.521 0.519)

	Surface
	{
		SurfStyle       0.190429
		OceanStyle      0.683032
		Randomize      (0.899, -0.927, 0.299)
		colorDistMagn   0.182652
		colorDistFreq   0.102993
		detailScale     412.749
		colorConversion true
		snowLevel       2
		tropicLatitude  0.165488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533103
		terraceProb     0.212621
		erosion         0
		montesMagn      0.542158
		montesFreq      2.58683
		montesSpiky     0.86206
		montesFraction  0.349764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.421303
		hillsFraction   0.732708
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247695
		craterFreq      0.188585
		craterDensity   0.82693
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435144
		volcanoTemp     1383.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.208, 0.000)
		colorShelf     (0.223, 0.221, 0.221, 0.000)
		colorBeach     (0.236, 0.234, 0.234, 0.000)
		colorDesert    (0.249, 0.247, 0.247, 0.000)
		colorLowland   (0.262, 0.260, 0.259, 0.000)
		colorUpland    (0.276, 0.273, 0.272, 0.000)
		colorRock      (0.289, 0.286, 0.285, 0.000)
		colorSnow      (0.302, 0.299, 0.298, 1.000)
		BumpHeight      13.6038
		BumpOffset      2.72075
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.048303
		Period          0.173294
		Eccentricity    0.249156
		Inclination     16.559
		AscendingNode   -146.124
		ArgOfPericenter 124.867
		MeanAnomaly     49.8651
	}
}



DwarfMoon	"Sep Elopon.D23"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            1.55429e-009
	Radius          16.2966
	InertiaMoment   0.396151

	Obliquity       22.0181
	EqAscendNode    -119.811
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.520 0.428 0.312)

	Surface
	{
		SurfStyle       0.814672
		OceanStyle      0.24842
		Randomize      (-0.053, -0.215, -0.417)
		colorDistMagn   0.653444
		colorDistFreq   0.141122
		detailScale     445.005
		colorConversion true
		snowLevel       2
		tropicLatitude  0.369267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502199
		terraceProb     0.280368
		erosion         0
		montesMagn      0.601042
		montesFreq      3.30508
		montesSpiky     0.988247
		montesFraction  0.481553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.711042
		hillsFraction   0.558541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221897
		craterFreq      0.211044
		craterDensity   0.785052
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528745
		volcanoTemp     1311.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.146, 0.087, 0.000)
		colorShelf     (0.208, 0.150, 0.100, 0.000)
		colorBeach     (0.244, 0.176, 0.118, 0.000)
		colorDesert    (0.265, 0.188, 0.115, 0.000)
		colorLowland   (0.291, 0.201, 0.131, 0.000)
		colorUpland    (0.322, 0.244, 0.159, 0.000)
		colorRock      (0.348, 0.265, 0.172, 0.000)
		colorSnow      (0.380, 0.283, 0.181, 1.000)
		BumpHeight      14.6669
		BumpOffset      2.93338
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0486897
		Period          0.17538
		Eccentricity    0.0765216
		Inclination     22.0181
		AscendingNode   -119.811
		ArgOfPericenter 16.0564
		MeanAnomaly     64.8487
	}
}



DwarfMoon	"Sep Elopon.D24"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            2.19406e-009
	Radius          17.5338
	InertiaMoment   0.398332

	Obliquity       -71.9133
	EqAscendNode    157.621
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.642 0.639)

	Surface
	{
		SurfStyle       0.448567
		OceanStyle      0.926676
		Randomize      (-0.957, -0.722, -0.563)
		colorDistMagn   0.521826
		colorDistFreq   0.256613
		detailScale     478.789
		colorConversion true
		snowLevel       2
		tropicLatitude  0.362607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470826
		terraceProb     0.253645
		erosion         0
		montesMagn      0.66549
		montesFreq      2.97693
		montesSpiky     0.943323
		montesFraction  0.746559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.717942
		hillsFraction   0.600604
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24403
		craterFreq      0.168653
		craterDensity   0.823734
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520508
		volcanoTemp     1465.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.257, 0.256, 0.000)
		colorShelf     (0.274, 0.273, 0.272, 0.000)
		colorBeach     (0.290, 0.289, 0.288, 0.000)
		colorDesert    (0.306, 0.305, 0.304, 0.000)
		colorLowland   (0.322, 0.321, 0.320, 0.000)
		colorUpland    (0.338, 0.337, 0.336, 0.000)
		colorRock      (0.354, 0.353, 0.352, 0.000)
		colorSnow      (0.370, 0.369, 0.368, 1.000)
		BumpHeight      15.7804
		BumpOffset      3.15608
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0491407
		Period          0.177822
		Eccentricity    0.0626352
		Inclination     -71.9133
		AscendingNode   157.621
		ArgOfPericenter 62.7363
		MeanAnomaly     -179.48
	}
}



DwarfMoon	"Sep Elopon.D25"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            3.06845e-009
	Radius          24.0421
	InertiaMoment   0.399374

	RotationPeriod  2649.81
	Obliquity       26.4885
	EqAscendNode    -73.0205

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.557 0.483 0.452)

	Surface
	{
		SurfStyle       0.281812
		OceanStyle      0.96525
		Randomize      (0.814, 0.028, -0.302)
		colorDistMagn   0.690013
		colorDistFreq   0.206831
		detailScale     656.509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.669321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495211
		terraceProb     0.432134
		erosion         0
		montesMagn      0.558895
		montesFreq      1.64854
		montesSpiky     0.84759
		montesFraction  0.360305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4946
		hillsFraction   0.475585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253281
		craterFreq      0.184769
		craterDensity   0.890557
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558949
		volcanoTemp     1617.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.181, 0.000)
		colorShelf     (0.237, 0.205, 0.192, 0.000)
		colorBeach     (0.250, 0.217, 0.203, 0.000)
		colorDesert    (0.264, 0.230, 0.214, 0.000)
		colorLowland   (0.278, 0.242, 0.226, 0.000)
		colorUpland    (0.292, 0.254, 0.237, 0.000)
		colorRock      (0.306, 0.266, 0.248, 0.000)
		colorSnow      (0.320, 0.278, 0.260, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0497929
		Period          0.181374
		Eccentricity    0.453079
		Inclination     26.4885
		AscendingNode   -73.0205
		ArgOfPericenter 120.28
		MeanAnomaly     -148.988
	}
}



DwarfMoon	"Sep Elopon.D26"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            4.25821e-009
	Radius          23.9934
	InertiaMoment   0.39675

	Obliquity       -34.0359
	EqAscendNode    -106.603
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.506 0.359)

	Surface
	{
		SurfStyle       0.232903
		OceanStyle      0.827587
		Randomize      (-0.473, 0.630, 0.444)
		colorDistMagn   0.715542
		colorDistFreq   0.38363
		detailScale     655.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.274258
		terraceProb     0.310294
		erosion         0
		montesMagn      0.481641
		montesFreq      2.4292
		montesSpiky     0.990826
		montesFraction  0.378824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.76592
		hillsFraction   0.762501
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252918
		craterFreq      0.213325
		craterDensity   0.905591
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493335
		volcanoTemp     1577.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.202, 0.144, 0.000)
		colorShelf     (0.269, 0.215, 0.153, 0.000)
		colorBeach     (0.285, 0.228, 0.162, 0.000)
		colorDesert    (0.301, 0.240, 0.171, 0.000)
		colorLowland   (0.317, 0.253, 0.180, 0.000)
		colorUpland    (0.333, 0.265, 0.189, 0.000)
		colorRock      (0.348, 0.278, 0.198, 0.000)
		colorSnow      (0.364, 0.291, 0.207, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0502284
		Period          0.183758
		Eccentricity    0.340304
		Inclination     -34.0359
		AscendingNode   -106.603
		ArgOfPericenter 119.714
		MeanAnomaly     41.1506
	}
}



DwarfMoon	"Sep Elopon.D27"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            5.87171e-009
	Radius          25.5247
	InertiaMoment   0.398503

	Obliquity       68.5495
	EqAscendNode    168.262
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.627 0.516 0.473)

	Surface
	{
		SurfStyle       0.622624
		OceanStyle      0.828421
		Randomize      (-0.933, -0.920, -0.026)
		colorDistMagn   0.205645
		colorDistFreq   0.43981
		detailScale     696.993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.189478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476003
		terraceProb     0.194317
		erosion         0
		montesMagn      0.555627
		montesFreq      1.94596
		montesSpiky     0.868456
		montesFraction  0.417206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.77378
		hillsFraction   0.645307
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243318
		craterFreq      0.219487
		craterDensity   1.03381
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477966
		volcanoTemp     1554
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.175, 0.132, 0.000)
		colorShelf     (0.251, 0.180, 0.151, 0.000)
		colorBeach     (0.295, 0.211, 0.180, 0.000)
		colorDesert    (0.320, 0.227, 0.175, 0.000)
		colorLowland   (0.351, 0.242, 0.199, 0.000)
		colorUpland    (0.389, 0.294, 0.241, 0.000)
		colorRock      (0.420, 0.320, 0.260, 0.000)
		colorSnow      (0.457, 0.340, 0.274, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0508762
		Period          0.187324
		Eccentricity    0.0773549
		Inclination     68.5495
		AscendingNode   168.262
		ArgOfPericenter 18.15
		MeanAnomaly     147.323
	}
}



DwarfMoon	"Sep Elopon.D28"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            8.0549e-009
	Radius          27.2273
	InertiaMoment   0.399504

	RotationPeriod  2217.76
	Obliquity       0.498029
	EqAscendNode    -69.5956

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.520 0.518 0.514)

	Surface
	{
		SurfStyle       0.087949
		OceanStyle      0.534164
		Randomize      (0.000, 0.563, -0.753)
		colorDistMagn   0.498616
		colorDistFreq   0.636327
		detailScale     743.487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0142772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694866
		terraceProb     0.229688
		erosion         0
		montesMagn      0.470792
		montesFreq      3.30079
		montesSpiky     0.793595
		montesFraction  0.195775
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.78301
		hillsFraction   0.640191
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260361
		craterFreq      0.214326
		craterDensity   1.05685
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475313
		volcanoTemp     1763.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.207, 0.205, 0.000)
		colorShelf     (0.221, 0.220, 0.218, 0.000)
		colorBeach     (0.234, 0.233, 0.231, 0.000)
		colorDesert    (0.247, 0.246, 0.244, 0.000)
		colorLowland   (0.260, 0.259, 0.257, 0.000)
		colorUpland    (0.273, 0.272, 0.270, 0.000)
		colorRock      (0.286, 0.285, 0.283, 0.000)
		colorSnow      (0.299, 0.298, 0.295, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0513146
		Period          0.189751
		Eccentricity    0.0958475
		Inclination     0.498029
		AscendingNode   -69.5956
		ArgOfPericenter -178.625
		MeanAnomaly     141.897
	}
}



DwarfMoon	"Sep Elopon.D29"
{
	ParentBody     "Sep Elopon"
	Class	       "Asteroid"

	Mass            1.10049e-008
	Radius          27.3167
	InertiaMoment   0.397149

	RotationPeriod  3366.2
	Obliquity       -24.9167
	EqAscendNode    -164.557

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.621 0.618 0.614)

	Surface
	{
		SurfStyle       0.00965217
		OceanStyle      0.510661
		Randomize      (0.038, -0.211, 0.853)
		colorDistMagn   0.673042
		colorDistFreq   0.657111
		detailScale     745.929
		colorConversion true
		snowLevel       2
		tropicLatitude  0.113027
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451719
		terraceProb     0.231071
		erosion         0
		montesMagn      0.657687
		montesFreq      3.40811
		montesSpiky     0.950466
		montesFraction  0.776527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.69251
		hillsFraction   0.670063
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23951
		craterFreq      0.229935
		craterDensity   0.856305
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484847
		volcanoTemp     1831.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.247, 0.246, 0.000)
		colorShelf     (0.264, 0.263, 0.261, 0.000)
		colorBeach     (0.280, 0.278, 0.276, 0.000)
		colorDesert    (0.295, 0.294, 0.292, 0.000)
		colorLowland   (0.311, 0.309, 0.307, 0.000)
		colorUpland    (0.326, 0.324, 0.323, 0.000)
		colorRock      (0.342, 0.340, 0.338, 0.000)
		colorSnow      (0.357, 0.355, 0.353, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0517205
		Period          0.192007
		Eccentricity    0.441653
		Inclination     -24.9167
		AscendingNode   -164.557
		ArgOfPericenter -115.062
		MeanAnomaly     62.6219
	}
}


DwarfPlanet	"Iceberg III"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.1568e-07
	Radius          60.28459
	InertiaMoment   0.39783

	Oblateness      0.0059555

	RotationPeriod  69.8096
	Obliquity       223.731
	EqAscendNode    309.686

	AbsMagn         11.0689
	SlopeParam      4.54948
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.751 0.750)

	Surface
	{
		SurfStyle       0.822432
		OceanStyle      0.284119
		Randomize      (0.652, 0.008, -0.552)
		colorDistMagn   0.882518
		colorDistFreq   0.00614531
		detailScale     89.6912
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881934
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.722236
		terraceProb     0.405372
		erosion         0
		montesMagn      0.684974
		montesFreq      3.37137
		montesSpiky     0.942118
		montesFraction  0.348087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0231167
		hillsFraction   0.470178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227879
		craterFreq      0.206906
		craterDensity   0.830974
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.574499
		volcanoTemp     1631.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.210, 0.000)
		colorShelf     (0.302, 0.263, 0.240, 0.000)
		colorBeach     (0.354, 0.308, 0.285, 0.000)
		colorDesert    (0.385, 0.330, 0.277, 0.000)
		colorLowland   (0.422, 0.353, 0.315, 0.000)
		colorUpland    (0.468, 0.428, 0.382, 0.000)
		colorRock      (0.505, 0.466, 0.412, 0.000)
		colorSnow      (0.550, 0.496, 0.435, 1.000)
		BumpHeight      2.95613
		BumpOffset      0.591226
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.512828
		GasToDust   0.25
		Particles   2015
		GasBright   0.208806
		DustBright  0.35315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.53828
		Period          18.8214
		Eccentricity    0.0390094
		Inclination     273.0729
		AscendingNode   162.0011
		ArgOfPericenter 123.742
		MeanAnomaly     112.779
	}
}



Planet	"Iceberg IV"
{
	ParentBody     "Daca"
	Class	       "IceWorld"

	Mass            0.0597894
	Radius          3162.91
	InertiaMoment   0.344414

	Oblateness      0.0043337

	RotationPeriod  30.7932
	Obliquity       -153.7188
	EqAscendNode    159.33

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.633 0.507 0.273)

	Surface
	{
		SurfStyle       0.355172
		OceanStyle      0.809591
		Randomize      (-0.387, 0.062, 0.060)
		colorDistMagn   0.072777
		colorDistFreq   473.755
		detailScale     8135.19
		colorConversion true
		drivenDarkening 0
		seaLevel        0.229172
		snowLevel       2
		tropicLatitude  0.997323
		icecapLatitude  1
		icecapHeight    0.229172
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8191
		venusFreq       1.442
		venusMagn       0.177363
		mareFreq        1.65373
		mareDensity     0.00789953
		terraceProb     0.262488
		erosion         0
		montesMagn      0.181574
		montesFreq      132.961
		montesSpiky     0.925273
		montesFraction  0.21059
		dunesMagn       0.0412899
		dunesFreq       4202.02
		dunesFraction   0.154754
		hillsMagn       0.115787
		hillsFreq       378.989
		hillsFraction   0.588398
		hills2Fraction  0.238495
		riversMagn      59.8399
		riversFreq      2.96236
		riversSin       4.51887
		riversOctaves   0
		canyonsMagn     0.595154
		canyonsFreq     1.18661
		canyonFraction  0
		cracksMagn      0.0376719
		cracksFreq      0.582222
		cracksOctaves   4
		craterMagn      0.585786
		craterFreq      9.85324
		craterDensity   0.924408
		craterOctaves   12
		craterRayedFactor 0.0885799
		volcanoMagn     0.531295
		volcanoFreq     0.525982
		volcanoDensity  0.186065
		volcanoOctaves  3
		volcanoActivity 0.509565
		volcanoFlows    0.22169
		volcanoRadius   0.528276
		volcanoTemp     1545.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.633, 0.507, 0.273, 0.500)
		colorShelf     (0.601, 0.481, 0.259, 0.500)
		colorBeach     (0.443, 0.355, 0.191, 0.750)
		colorDesert    (0.538, 0.431, 0.232, 1.000)
		colorLowland   (0.557, 0.446, 0.240, 1.000)
		colorUpland    (0.589, 0.471, 0.254, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.557, 0.446, 0.240, 1.000)
		colorUpPlants  (0.589, 0.471, 0.254, 1.000)
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
		SemiMajorAxis   12.1319
		Period          31.8779
		Eccentricity    0.0763556
		Inclination     272.56403
		AscendingNode   159.33
		ArgOfPericenter 73.9343
		MeanAnomaly     259.058
	}
}