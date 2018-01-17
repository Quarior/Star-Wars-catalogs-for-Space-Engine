Star	"Daca A"
{
	ParentBody     "Daca"
	Class	       "F9 V" MassSol 1.24185 RadSol 1.20768 Lum 1.70016 Teff 6010
	
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
	Class	       "M1 V" MassSol 0.51469 RadSol 0.50411 Lum 0.039188 Teff 3622
	
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




Planet	"Mon Calamari/Calamari/Mon Cala/Dac"
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
		OceanStyle      0.301587
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
		colorSea       (0.040, 0.100, 0.200, 1.000)
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
		SouthRings  5		SouthBright 0.3
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
		Period          31.8779		Eccentricity    0.0763556
		Inclination     272.56403
		AscendingNode   159.33
		ArgOfPericenter 73.9343
		MeanAnomaly     259.058
	}
}





Comet	"C1"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.7889e-008
	Radius          50.6762
	InertiaMoment   0.399592

	Oblateness      0.00652158

	RotationPeriod  63.0416
	Obliquity       233.783
	EqAscendNode    170.046

	AbsMagn         6.60779
	SlopeParam      2.51609
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.470 0.464)

	Surface
	{
		SurfStyle       0.117945
		OceanStyle      0.764416
		Randomize      (0.029, 0.780, 0.347)
		colorDistMagn   0.369329
		colorDistFreq   1.3205
		detailScale     1383.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824646
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589349
		terraceProb     0.315872
		erosion         0
		montesMagn      0.386464
		montesFreq      2.55092
		montesSpiky     0.841674
		montesFraction  0.719744
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.20887
		hillsFraction   0.839409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253321
		craterFreq      0.212312
		craterDensity   0.884402
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509191
		volcanoTemp     1266.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.186, 0.000)
		colorShelf     (0.202, 0.200, 0.197, 0.000)
		colorBeach     (0.214, 0.212, 0.209, 0.000)
		colorDesert    (0.226, 0.223, 0.220, 0.000)
		colorLowland   (0.238, 0.235, 0.232, 0.000)
		colorUpland    (0.249, 0.247, 0.244, 0.000)
		colorRock      (0.261, 0.259, 0.255, 0.000)
		colorSnow      (0.273, 0.271, 0.267, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.960429
		GasToDust   0.25
		Particles   2920
		GasBright   0.0402021
		DustBright  0.254013
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.216
		Period          192.429
		Eccentricity    0.948313
		Inclination     -100.206
		AscendingNode   125.489
		ArgOfPericenter 67.3358
		MeanAnomaly     141.432
	}
}

Comet	"C2"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.47454e-015
	Radius          0.178099
	InertiaMoment   0.398394

	Oblateness      0.00974742

	RotationPeriod  61.0887
	Obliquity       186.989
	EqAscendNode    154.623

	AbsMagn         0.237422
	SlopeParam      3.18126
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.508 0.503 0.495)

	Surface
	{
		SurfStyle       0.786009
		OceanStyle      0.091548
		Randomize      (-0.003, 0.640, 0.730)
		colorDistMagn   0.00332165
		colorDistFreq   9.52131e-006
		detailScale     4.8633
		colorConversion true
		snowLevel       2
		tropicLatitude  0.355871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479226
		terraceProb     0.467612
		erosion         0
		montesMagn      0.48224
		montesFreq      2.48415
		montesSpiky     0.902484
		montesFraction  0.521893
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.75295e-005
		hillsFraction   0.611898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236914
		craterFreq      0.219697
		craterDensity   1.0637
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452955
		volcanoTemp     1704.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.171, 0.139, 0.000)
		colorShelf     (0.203, 0.176, 0.158, 0.000)
		colorBeach     (0.239, 0.206, 0.188, 0.000)
		colorDesert    (0.259, 0.221, 0.183, 0.000)
		colorLowland   (0.284, 0.236, 0.208, 0.000)
		colorUpland    (0.315, 0.287, 0.252, 0.000)
		colorRock      (0.340, 0.312, 0.272, 0.000)
		colorSnow      (0.370, 0.332, 0.287, 1.000)
		BumpHeight      0.160289
		BumpOffset      0.0320579
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0308711
		GasToDust   0.25
		Particles   1042
		GasBright   0.152382
		DustBright  0.62632
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.3434
		Period          293.963
		Eccentricity    0.960381
		Inclination     -13.9767
		AscendingNode   -167.104
		ArgOfPericenter -166.038
		MeanAnomaly     -75.6674
	}
}

Comet	"C3"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.14045e-011
	Radius          3.13901
	InertiaMoment   0.394432

	Oblateness      0.00724562

	RotationPeriod  59.1737
	Obliquity       140.195
	EqAscendNode    139.2

	AbsMagn         9.88021
	SlopeParam      3.76489
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.437 0.409)

	Surface
	{
		SurfStyle       0.873276
		OceanStyle      0.504642
		Randomize      (-0.642, 0.851, 0.400)
		colorDistMagn   0.949241
		colorDistFreq   0.00191847
		detailScale     85.716
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995364
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437998
		terraceProb     0.321501
		erosion         0
		montesMagn      0.555011
		montesFreq      2.74362
		montesSpiky     0.969528
		montesFraction  0.924984
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0251954
		hillsFraction   0.377838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231923
		craterFreq      0.214183
		craterDensity   0.914622
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500219
		volcanoTemp     1574.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.153, 0.164, 0.050)
		colorShelf     (0.203, 0.179, 0.188, 0.040)
		colorBeach     (0.233, 0.206, 0.213, 0.030)
		colorDesert    (0.263, 0.232, 0.241, 0.020)
		colorLowland   (0.294, 0.258, 0.266, 0.030)
		colorUpland    (0.324, 0.284, 0.290, 0.050)
		colorRock      (0.355, 0.310, 0.323, 0.020)
		colorSnow      (0.355, 0.310, 0.323, 1.000)
		BumpHeight      2.82511
		BumpOffset      0.565022
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.512063
		GasToDust   0.25
		Particles   2014
		GasBright   0.117989
		DustBright  0.345199
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.2808
		Period          245.301
		Eccentricity    0.953019
		Inclination     128.718
		AscendingNode   -39.6956
		ArgOfPericenter 124.397
		MeanAnomaly     9.38143
	}
}

Comet	"C4"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            8.82056e-008
	Radius          69.5122
	InertiaMoment   0.398919

	Oblateness      0.0110375

	RotationPeriod  57.2898
	Obliquity       93.4006
	EqAscendNode    123.778

	AbsMagn         6.38384
	SlopeParam      4.32878
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.486 0.397 0.358)

	Surface
	{
		SurfStyle       0.495124
		OceanStyle      0.986467
		Randomize      (-0.445, -0.001, -0.574)
		colorDistMagn   0.883858
		colorDistFreq   3.33849
		detailScale     1898.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955354
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333747
		terraceProb     0.399787
		erosion         0
		montesMagn      0.562996
		montesFreq      3.0452
		montesSpiky     0.854295
		montesFraction  0.502852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.9629
		hillsFraction   0.583655
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234483
		craterFreq      0.163687
		craterDensity   1.00521
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423462
		volcanoTemp     1476.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.159, 0.143, 0.000)
		colorShelf     (0.207, 0.169, 0.152, 0.000)
		colorBeach     (0.219, 0.178, 0.161, 0.000)
		colorDesert    (0.231, 0.188, 0.170, 0.000)
		colorLowland   (0.243, 0.198, 0.179, 0.000)
		colorUpland    (0.255, 0.208, 0.188, 0.000)
		colorRock      (0.267, 0.218, 0.197, 0.000)
		colorSnow      (0.280, 0.228, 0.206, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.993255
		GasToDust   0.25
		Particles   2986
		GasBright   0.297359
		DustBright  0.650315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.1681
		Period          118.86
		Eccentricity    0.977112
		Inclination     -13.8102
		AscendingNode   -176.586
		ArgOfPericenter 54.4533
		MeanAnomaly     -73.092
	}
}

Comet	"C5"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.71592e-015
	Radius          0.194439
	InertiaMoment   0.397271

	Oblateness      0.00832873

	RotationPeriod  55.431
	Obliquity       46.6063
	EqAscendNode    108.355

	AbsMagn         19.3819
	SlopeParam      4.92068
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.632 0.627)

	Surface
	{
		SurfStyle       0.0914192
		OceanStyle      0.835668
		Randomize      (-0.810, -0.346, -0.210)
		colorDistMagn   0.905728
		colorDistFreq   1.39328e-005
		detailScale     5.30947
		colorConversion true
		snowLevel       2
		tropicLatitude  0.751014
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497352
		terraceProb     0.353549
		erosion         0
		montesMagn      0.350897
		montesFreq      2.79685
		montesSpiky     0.971016
		montesFraction  0.556365
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000114577
		hillsFraction   0.627637
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260897
		craterFreq      0.27908
		craterDensity   0.717182
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559203
		volcanoTemp     1360.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.253, 0.251, 0.000)
		colorShelf     (0.270, 0.269, 0.267, 0.000)
		colorBeach     (0.286, 0.284, 0.282, 0.000)
		colorDesert    (0.301, 0.300, 0.298, 0.000)
		colorLowland   (0.317, 0.316, 0.314, 0.000)
		colorUpland    (0.333, 0.332, 0.329, 0.000)
		colorRock      (0.349, 0.347, 0.345, 0.000)
		colorSnow      (0.365, 0.363, 0.361, 1.000)
		BumpHeight      0.174995
		BumpOffset      0.034999
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0636971
		GasToDust   0.25
		Particles   1108
		GasBright   0.235684
		DustBright  0.396477
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   59.0096
		Period          342.023
		Eccentricity    0.97794
		Inclination     -2.6338
		AscendingNode   141.126
		ArgOfPericenter 139.623
		MeanAnomaly     57.7111
	}
}

Comet	"C6"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.10057e-011
	Radius          4.3002
	InertiaMoment   0.399378

	Oblateness      0.0125608

	RotationPeriod  53.5918
	Obliquity       359.812
	EqAscendNode    92.9326

	AbsMagn         9.65022
	SlopeParam      5.60896
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.593 0.591)

	Surface
	{
		SurfStyle       0.308273
		OceanStyle      0.489269
		Randomize      (0.963, -0.695, -0.913)
		colorDistMagn   0.594372
		colorDistFreq   0.0113111
		detailScale     117.424
		colorConversion true
		snowLevel       2
		tropicLatitude  0.127797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554118
		terraceProb     0.221433
		erosion         0
		montesMagn      0.639863
		montesFreq      2.19616
		montesSpiky     0.924671
		montesFraction  0.372767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.040076
		hillsFraction   0.714345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239108
		craterFreq      0.259958
		craterDensity   0.746656
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444029
		volcanoTemp     1417.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.237, 0.236, 0.000)
		colorShelf     (0.255, 0.252, 0.251, 0.000)
		colorBeach     (0.269, 0.267, 0.266, 0.000)
		colorDesert    (0.284, 0.282, 0.281, 0.000)
		colorLowland   (0.299, 0.297, 0.296, 0.000)
		colorUpland    (0.314, 0.312, 0.310, 0.000)
		colorRock      (0.329, 0.326, 0.325, 0.000)
		colorSnow      (0.344, 0.341, 0.340, 1.000)
		BumpHeight      3.87018
		BumpOffset      0.774037
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.544889
		GasToDust   0.25
		Particles   2080
		GasBright   0.13675
		DustBright  0.179898
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.5399
		Period          337.948
		Eccentricity    0.975365
		Inclination     7.19798
		AscendingNode   139.661
		ArgOfPericenter -172.691
		MeanAnomaly     -84.2136
	}
}

Comet	"C7"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.62463e-007
	Radius          75.9927
	InertiaMoment   0.398089

	Oblateness      0.00955953

	RotationPeriod  51.7671
	Obliquity       313.018
	EqAscendNode    77.51

	AbsMagn         6.15471
	SlopeParam      6.58049
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.537 0.456)

	Surface
	{
		SurfStyle       0.433425
		OceanStyle      0.384158
		Randomize      (-0.637, 0.208, 0.152)
		colorDistMagn   0.474266
		colorDistFreq   4.02152
		detailScale     2075.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.841826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258007
		terraceProb     0.266755
		erosion         0
		montesMagn      0.670725
		montesFreq      3.03928
		montesSpiky     0.954215
		montesFraction  0.63694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.7167
		hillsFraction   0.726267
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.287648
		craterFreq      0.205122
		craterDensity   0.778468
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508113
		volcanoTemp     1104.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.215, 0.182, 0.000)
		colorShelf     (0.295, 0.228, 0.194, 0.000)
		colorBeach     (0.313, 0.242, 0.205, 0.000)
		colorDesert    (0.330, 0.255, 0.217, 0.000)
		colorLowland   (0.348, 0.269, 0.228, 0.000)
		colorUpland    (0.365, 0.282, 0.239, 0.000)
		colorRock      (0.382, 0.296, 0.251, 0.000)
		colorSnow      (0.400, 0.309, 0.262, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.393288
		DustBright  0.407847
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.992
		Period          243.056
		Eccentricity    0.965543
		Inclination     150.864
		AscendingNode   80.9248
		ArgOfPericenter -155.592
		MeanAnomaly     170.623
	}
}

Comet	"C8"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.00239e-015
	Radius          0.266039
	InertiaMoment   0.399806

	Oblateness      0.014399

	RotationPeriod  49.952
	Obliquity       266.223
	EqAscendNode    62.0874

	AbsMagn         15.9797
	SlopeParam      2.10937
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.648 0.607)

	Surface
	{
		SurfStyle       0.508934
		OceanStyle      0.514512
		Randomize      (-0.022, 0.191, -0.870)
		colorDistMagn   0.363481
		colorDistFreq   1.2605e-005
		detailScale     7.26463
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767323
		terraceProb     0.115414
		erosion         0
		montesMagn      0.393283
		montesFreq      1.92464
		montesSpiky     0.80071
		montesFraction  0.453406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000164551
		hillsFraction   0.774538
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211981
		craterFreq      0.239556
		craterDensity   1.01109
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421033
		volcanoTemp     1553.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.220, 0.170, 0.000)
		colorShelf     (0.290, 0.227, 0.194, 0.000)
		colorBeach     (0.340, 0.266, 0.231, 0.000)
		colorDesert    (0.369, 0.285, 0.225, 0.000)
		colorLowland   (0.405, 0.304, 0.255, 0.000)
		colorUpland    (0.449, 0.369, 0.310, 0.000)
		colorRock      (0.485, 0.402, 0.334, 0.000)
		colorSnow      (0.529, 0.428, 0.352, 1.000)
		BumpHeight      0.239435
		BumpOffset      0.0478869
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0965231
		GasToDust   0.25
		Particles   1174
		GasBright   0.024261
		DustBright  0.46136
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.4567
		Period          278.506
		Eccentricity    0.992136
		Inclination     132.385
		AscendingNode   18.2672
		ArgOfPericenter -39.139
		MeanAnomaly     -22.8025
	}
}

Comet	"C9"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.86897e-011
	Radius          4.70718
	InertiaMoment   0.398671

	Oblateness      0.0110553

	RotationPeriod  48.1419
	Obliquity       219.429
	EqAscendNode    46.6649

	AbsMagn         9.42555
	SlopeParam      2.85992
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.622 0.615)

	Surface
	{
		SurfStyle       0.987932
		OceanStyle      0.859723
		Randomize      (-0.945, 0.101, 0.029)
		colorDistMagn   0.500516
		colorDistFreq   0.00618288
		detailScale     128.537
		colorConversion true
		snowLevel       2
		tropicLatitude  0.681512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6585
		terraceProb     0.319272
		erosion         0
		montesMagn      0.432406
		montesFreq      2.21218
		montesSpiky     0.946539
		montesFraction  0.356485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0443785
		hillsFraction   0.702115
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26307
		craterFreq      0.159032
		craterDensity   0.796521
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576854
		volcanoTemp     1300.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.218, 0.246, 0.050)
		colorShelf     (0.250, 0.255, 0.283, 0.040)
		colorBeach     (0.288, 0.292, 0.320, 0.030)
		colorDesert    (0.326, 0.330, 0.363, 0.020)
		colorLowland   (0.363, 0.367, 0.400, 0.030)
		colorUpland    (0.401, 0.404, 0.437, 0.050)
		colorRock      (0.438, 0.442, 0.486, 0.020)
		colorSnow      (0.438, 0.442, 0.486, 1.000)
		BumpHeight      4.23646
		BumpOffset      0.847292
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.577715
		GasToDust   0.25
		Particles   2146
		GasBright   0.105746
		DustBright  0.864362
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.6539
		Period          248.21
		Eccentricity    0.97246
		Inclination     -36.7186
		AscendingNode   72.7421
		ArgOfPericenter 139.819
		MeanAnomaly     -8.21498
	}
}

Comet	"C10"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.99237e-007
	Radius          103.854
	InertiaMoment   0.396608

	Oblateness      0.0164463

	RotationPeriod  46.3321
	Obliquity       172.635
	EqAscendNode    31.2423

	AbsMagn         5.91935
	SlopeParam      3.47466
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.570 0.564 0.561)

	Surface
	{
		SurfStyle       0.133397
		OceanStyle      0.997098
		Randomize      (-0.930, 0.983, -0.656)
		colorDistMagn   0.806929
		colorDistFreq   7.53341
		detailScale     2835.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999103
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516137
		terraceProb     0.261548
		erosion         0
		montesMagn      0.518337
		montesFreq      3.13855
		montesSpiky     0.78201
		montesFraction  0.71729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.1615
		hillsFraction   0.421711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218992
		craterFreq      0.308138
		craterDensity   0.90401
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464564
		volcanoTemp     1905.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.226, 0.224, 0.000)
		colorShelf     (0.242, 0.240, 0.239, 0.000)
		colorBeach     (0.257, 0.254, 0.253, 0.000)
		colorDesert    (0.271, 0.268, 0.267, 0.000)
		colorLowland   (0.285, 0.282, 0.281, 0.000)
		colorUpland    (0.299, 0.296, 0.295, 0.000)
		colorRock      (0.314, 0.310, 0.309, 0.000)
		colorSnow      (0.328, 0.324, 0.323, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.110004
		DustBright  0.54459
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.9841
		Period          359.333
		Eccentricity    0.963614
		Inclination     -83.1117
		AscendingNode   53.0031
		ArgOfPericenter 175.023
		MeanAnomaly     -58.2809
	}
}

Comet	"C11"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            9.21374e-015
	Radius          0.291574
	InertiaMoment   0.399157

	Oblateness      0.0129259

	RotationPeriod  44.5182
	Obliquity       125.84
	EqAscendNode    15.8197

	AbsMagn         14.8313
	SlopeParam      4.04251
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.621 0.617 0.615)

	Surface
	{
		SurfStyle       0.217964
		OceanStyle      0.186489
		Randomize      (0.154, 0.525, 0.677)
		colorDistMagn   0.522086
		colorDistFreq   3.6862e-005
		detailScale     7.96192
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537958
		terraceProb     0.423346
		erosion         0
		montesMagn      0.50296
		montesFreq      2.64834
		montesSpiky     0.852572
		montesFraction  0.251272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000273564
		hillsFraction   0.625967
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215733
		craterFreq      0.195115
		craterDensity   0.822861
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513189
		volcanoTemp     1765.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.247, 0.246, 0.000)
		colorShelf     (0.264, 0.262, 0.261, 0.000)
		colorBeach     (0.279, 0.278, 0.277, 0.000)
		colorDesert    (0.295, 0.293, 0.292, 0.000)
		colorLowland   (0.311, 0.308, 0.307, 0.000)
		colorUpland    (0.326, 0.324, 0.323, 0.000)
		colorRock      (0.342, 0.339, 0.338, 0.000)
		colorSnow      (0.357, 0.355, 0.354, 1.000)
		BumpHeight      0.262417
		BumpOffset      0.0524834
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.129349
		GasToDust   0.25
		Particles   1241
		GasBright   0.0770034
		DustBright  0.262077
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.6127
		Period          255.739
		Eccentricity    0.963022
		Inclination     63.966
		AscendingNode   -68.0438
		ArgOfPericenter -153.954
		MeanAnomaly     -132.78
	}
}

Comet	"C12"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            7.12617e-011
	Radius          6.42583
	InertiaMoment   0.397733

	Oblateness      0.0193453

	RotationPeriod  42.6953
	Obliquity       79.0462
	EqAscendNode    0.397083

	AbsMagn         9.2053
	SlopeParam      4.61388
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.539 0.532 0.527)

	Surface
	{
		SurfStyle       0.937604
		OceanStyle      0.132044
		Randomize      (-0.307, -0.299, 0.637)
		colorDistMagn   0.504126
		colorDistFreq   0.0361994
		detailScale     175.468
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500404
		terraceProb     0.109831
		erosion         0
		montesMagn      0.646059
		montesFreq      3.44602
		montesSpiky     0.94432
		montesFraction  0.276981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0973016
		hillsFraction   0.725956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235401
		craterFreq      0.202211
		craterDensity   0.806973
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.408412
		volcanoTemp     1338.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.186, 0.211, 0.050)
		colorShelf     (0.216, 0.218, 0.242, 0.040)
		colorBeach     (0.248, 0.250, 0.274, 0.030)
		colorDesert    (0.280, 0.282, 0.311, 0.020)
		colorLowland   (0.312, 0.314, 0.342, 0.030)
		colorUpland    (0.345, 0.346, 0.374, 0.050)
		colorRock      (0.377, 0.378, 0.416, 0.020)
		colorSnow      (0.377, 0.378, 0.416, 1.000)
		BumpHeight      5.78325
		BumpOffset      1.15665
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.610541
		GasToDust   0.25
		Particles   2213
		GasBright   0.235655
		DustBright  0.587912
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.0918
		Period          106.397
		Eccentricity    0.918502
		Inclination     -154.779
		AscendingNode   -96.7042
		ArgOfPericenter -88.0004
		MeanAnomaly     -156.582
	}
}

Comet	"C13"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.51157e-007
	Radius          113.956
	InertiaMoment   0.399597

	Oblateness      0.0153394

	RotationPeriod  40.8587
	Obliquity       32.2519
	EqAscendNode    344.974

	AbsMagn         5.67655
	SlopeParam      5.24159
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.617 0.614)

	Surface
	{
		SurfStyle       0.998618
		OceanStyle      0.308515
		Randomize      (-0.635, 0.887, -0.865)
		colorDistMagn   0.539108
		colorDistFreq   3.42195
		detailScale     3111.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.65758
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444476
		terraceProb     0.252435
		erosion         0
		montesMagn      0.478516
		montesFreq      2.4922
		montesSpiky     0.955983
		montesFraction  0.43161
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.7334
		hillsFraction   0.630345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217111
		craterFreq      0.34968
		craterDensity   0.938807
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489235
		volcanoTemp     1568.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.216, 0.246, 0.050)
		colorShelf     (0.248, 0.253, 0.282, 0.040)
		colorBeach     (0.285, 0.290, 0.319, 0.030)
		colorDesert    (0.322, 0.327, 0.362, 0.020)
		colorLowland   (0.359, 0.364, 0.399, 0.030)
		colorUpland    (0.396, 0.401, 0.436, 0.050)
		colorRock      (0.434, 0.438, 0.485, 0.020)
		colorSnow      (0.434, 0.438, 0.485, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.175373
		DustBright  0.332681
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.4124
		Period          372.03
		Eccentricity    0.979724
		Inclination     26.3687
		AscendingNode   -88.9525
		ArgOfPericenter 34.3554
		MeanAnomaly     -79.3022
	}
}

Comet	"C14"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.69706e-014
	Radius          0.397609
	InertiaMoment   0.398401

	Oblateness      0.0231185

	RotationPeriod  39.0033
	Obliquity       345.458
	EqAscendNode    329.552

	AbsMagn         14.0677
	SlopeParam      6.02801
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.512 0.505 0.501)

	Surface
	{
		SurfStyle       0.600814
		OceanStyle      0.841518
		Randomize      (0.935, 0.324, -0.230)
		colorDistMagn   0.0723148
		colorDistFreq   0.000123718
		detailScale     10.8574
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752413
		terraceProb     0.20487
		erosion         0
		montesMagn      0.313874
		montesFreq      3.61008
		montesSpiky     0.853429
		montesFraction  0.519743
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000295284
		hillsFraction   0.44259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249413
		craterFreq      0.247653
		craterDensity   0.795293
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500413
		volcanoTemp     1329.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.172, 0.140, 0.000)
		colorShelf     (0.205, 0.177, 0.160, 0.000)
		colorBeach     (0.241, 0.207, 0.190, 0.000)
		colorDesert    (0.261, 0.222, 0.185, 0.000)
		colorLowland   (0.287, 0.237, 0.210, 0.000)
		colorUpland    (0.318, 0.288, 0.255, 0.000)
		colorRock      (0.343, 0.313, 0.275, 0.000)
		colorSnow      (0.374, 0.333, 0.290, 1.000)
		BumpHeight      0.357848
		BumpOffset      0.0715696
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.162175
		GasToDust   0.25
		Particles   1307
		GasBright   0.401215
		DustBright  0.591326
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.5782
		Period          140.302
		Eccentricity    0.941931
		Inclination     111.355
		AscendingNode   75.2449
		ArgOfPericenter -110.517
		MeanAnomaly     -48.5106
	}
}

Comet	"C15"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.31255e-010
	Radius          7.05871
	InertiaMoment   0.394649

	Oblateness      0.0182028

	RotationPeriod  37.1237
	Obliquity       298.663
	EqAscendNode    314.129

	AbsMagn         8.98864
	SlopeParam      7.4291
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.584 0.582)

	Surface
	{
		SurfStyle       0.153978
		OceanStyle      0.16477
		Randomize      (0.395, -0.594, 0.908)
		colorDistMagn   0.466273
		colorDistFreq   0.0296747
		detailScale     192.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.846575
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491448
		terraceProb     0.347844
		erosion         0
		montesMagn      0.596226
		montesFreq      3.15659
		montesSpiky     0.85678
		montesFraction  0.751343
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0610126
		hillsFraction   0.745857
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242763
		craterFreq      0.175776
		craterDensity   0.942871
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563016
		volcanoTemp     1703.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.234, 0.233, 0.000)
		colorShelf     (0.249, 0.248, 0.247, 0.000)
		colorBeach     (0.264, 0.263, 0.262, 0.000)
		colorDesert    (0.278, 0.277, 0.276, 0.000)
		colorLowland   (0.293, 0.292, 0.291, 0.000)
		colorUpland    (0.308, 0.307, 0.305, 0.000)
		colorRock      (0.322, 0.321, 0.320, 0.000)
		colorSnow      (0.337, 0.336, 0.334, 1.000)
		BumpHeight      6.35284
		BumpOffset      1.27057
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.643367
		GasToDust   0.25
		Particles   2279
		GasBright   0.31365
		DustBright  0.363377
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.1283
		Period          351.795
		Eccentricity    0.957197
		Inclination     -140.627
		AscendingNode   -73.1363
		ArgOfPericenter 101.544
		MeanAnomaly     141.626
	}
}

Comet	"C16"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.04145e-018
	Radius          0.0246039
	InertiaMoment   0.398925

	Oblateness      0.0282741

	RotationPeriod  35.214
	Obliquity       251.869
	EqAscendNode    298.707

	AbsMagn         5.42487
	SlopeParam      2.50591
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.481 0.475 0.467)

	Surface
	{
		SurfStyle       0.525118
		OceanStyle      0.573726
		Randomize      (-0.716, 0.881, -0.957)
		colorDistMagn   0.65635
		colorDistFreq   5.03965e-007
		detailScale     0.67185
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969982
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412295
		terraceProb     0.385328
		erosion         0
		montesMagn      0.573894
		montesFreq      3.0679
		montesSpiky     0.87607
		montesFraction  0.533177
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.48604e-006
		hillsFraction   0.628117
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233475
		craterFreq      0.20512
		craterDensity   0.736192
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481702
		volcanoTemp     1496.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.161, 0.131, 0.000)
		colorShelf     (0.192, 0.166, 0.149, 0.000)
		colorBeach     (0.226, 0.195, 0.177, 0.000)
		colorDesert    (0.245, 0.209, 0.173, 0.000)
		colorLowland   (0.269, 0.223, 0.196, 0.000)
		colorUpland    (0.298, 0.270, 0.238, 0.000)
		colorRock      (0.322, 0.294, 0.257, 0.000)
		colorSnow      (0.351, 0.313, 0.271, 1.000)
		BumpHeight      0.0221435
		BumpOffset      0.0044287
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00806926
		DustBright  0.353444
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.129
		Period          228.747
		Eccentricity    0.963414
		Inclination     -38.7089
		AscendingNode   -144.862
		ArgOfPericenter 76.361
		MeanAnomaly     14.3999
	}
}

Comet	"C17"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.12576e-014
	Radius          0.437232
	InertiaMoment   0.397284

	Oblateness      0.0228462

	RotationPeriod  33.2675
	Obliquity       205.075
	EqAscendNode    283.284

	AbsMagn         13.4773
	SlopeParam      3.17286
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.532 0.528)

	Surface
	{
		SurfStyle       0.945521
		OceanStyle      0.400715
		Randomize      (0.185, -0.991, -0.008)
		colorDistMagn   0.511139
		colorDistFreq   0.000118432
		detailScale     11.9394
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967041
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.27176
		terraceProb     0.578955
		erosion         0
		montesMagn      0.371198
		montesFreq      3.14621
		montesSpiky     0.912425
		montesFraction  0.486359
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000350155
		hillsFraction   0.591304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246439
		craterFreq      0.191942
		craterDensity   0.813166
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557814
		volcanoTemp     1229.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.186, 0.211, 0.050)
		colorShelf     (0.215, 0.218, 0.243, 0.040)
		colorBeach     (0.247, 0.250, 0.274, 0.030)
		colorDesert    (0.280, 0.282, 0.311, 0.020)
		colorLowland   (0.312, 0.314, 0.343, 0.030)
		colorUpland    (0.344, 0.346, 0.375, 0.050)
		colorRock      (0.376, 0.378, 0.417, 0.020)
		colorSnow      (0.376, 0.378, 0.417, 1.000)
		BumpHeight      0.393509
		BumpOffset      0.0787018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.195001
		GasToDust   0.25
		Particles   1373
		GasBright   0.0688357
		DustBright  0.777164
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.238
		Period          229.576
		Eccentricity    0.966755
		Inclination     -98.8791
		AscendingNode   -19.6139
		ArgOfPericenter -13.1097
		MeanAnomaly     45.4389
	}
}

Comet	"C18"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.41755e-010
	Radius          9.6066
	InertiaMoment   0.399384

	Oblateness      0.0357253

	RotationPeriod  31.277
	Obliquity       158.28
	EqAscendNode    267.862

	AbsMagn         8.77485
	SlopeParam      3.75712
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.694 0.590 0.460)

	Surface
	{
		SurfStyle       0.942327
		OceanStyle      0.621287
		Randomize      (-0.543, -0.713, 0.778)
		colorDistMagn   0.291596
		colorDistFreq   0.0158041
		detailScale     262.324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985014
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680989
		terraceProb     0.389656
		erosion         0
		montesMagn      0.572518
		montesFreq      3.20067
		montesSpiky     0.98295
		montesFraction  0.481465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.267868
		hillsFraction   0.591313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237161
		craterFreq      0.198816
		craterDensity   0.871054
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461019
		volcanoTemp     1429.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.206, 0.184, 0.050)
		colorShelf     (0.278, 0.242, 0.212, 0.040)
		colorBeach     (0.319, 0.277, 0.239, 0.030)
		colorDesert    (0.361, 0.313, 0.272, 0.020)
		colorLowland   (0.402, 0.348, 0.299, 0.030)
		colorUpland    (0.444, 0.383, 0.327, 0.050)
		colorRock      (0.486, 0.419, 0.364, 0.020)
		colorSnow      (0.486, 0.419, 0.364, 1.000)
		BumpHeight      8.64594
		BumpOffset      1.72919
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.676193
		GasToDust   0.25
		Particles   2345
		GasBright   0.0744863
		DustBright  0.456
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.8332
		Period          357.999
		Eccentricity    0.969465
		Inclination     118.146
		AscendingNode   35.4666
		ArgOfPericenter -149.082
		MeanAnomaly     -123.474
	}
}

Comet	"C19"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            7.44382e-018
	Radius          0.0270832
	InertiaMoment   0.398098

	Oblateness      0.0296159

	RotationPeriod  29.234
	Obliquity       111.486
	EqAscendNode    252.439

	AbsMagn         5.16256
	SlopeParam      4.32096
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.769 0.765 0.764)

	Surface
	{
		SurfStyle       0.703543
		OceanStyle      0.493827
		Randomize      (0.568, -0.425, -0.826)
		colorDistMagn   0.514288
		colorDistFreq   3.3084e-007
		detailScale     0.739551
		colorConversion true
		snowLevel       2
		tropicLatitude  0.825581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492463
		terraceProb     0.381945
		erosion         0
		montesMagn      0.569734
		montesFreq      3.48566
		montesSpiky     0.996034
		montesFraction  0.79396
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70858e-006
		hillsFraction   0.775406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252245
		craterFreq      0.168074
		craterDensity   0.887464
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500164
		volcanoTemp     1620.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.260, 0.214, 0.000)
		colorShelf     (0.307, 0.268, 0.244, 0.000)
		colorBeach     (0.361, 0.314, 0.290, 0.000)
		colorDesert    (0.392, 0.337, 0.283, 0.000)
		colorLowland   (0.430, 0.360, 0.321, 0.000)
		colorUpland    (0.477, 0.436, 0.390, 0.000)
		colorRock      (0.515, 0.474, 0.420, 0.000)
		colorSnow      (0.561, 0.505, 0.443, 1.000)
		BumpHeight      0.0243748
		BumpOffset      0.00487497
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0428778
		DustBright  0.172095
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.5337
		Period          201.963
		Eccentricity    0.962528
		Inclination     -164.654
		AscendingNode   -31.0051
		ArgOfPericenter -108.39
		MeanAnomaly     66.4905
	}
}

Comet	"C20"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.75726e-014
	Radius          0.594504
	InertiaMoment   0.399812

	Oblateness      0.0473351

	RotationPeriod  27.1286
	Obliquity       64.6918
	EqAscendNode    237.016

	AbsMagn         12.9867
	SlopeParam      4.91211
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.586 0.583)

	Surface
	{
		SurfStyle       0.681418
		OceanStyle      0.987541
		Randomize      (0.786, 0.657, -0.751)
		colorDistMagn   0.70272
		colorDistFreq   0.000162801
		detailScale     16.2339
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962965
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554425
		terraceProb     0.102015
		erosion         0
		montesMagn      0.602518
		montesFreq      2.73857
		montesSpiky     0.970479
		montesFraction  0.725988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000704276
		hillsFraction   0.65648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277327
		craterFreq      0.229657
		craterDensity   0.828049
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487523
		volcanoTemp     1416.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.199, 0.163, 0.000)
		colorShelf     (0.238, 0.205, 0.187, 0.000)
		colorBeach     (0.279, 0.240, 0.222, 0.000)
		colorDesert    (0.303, 0.258, 0.216, 0.000)
		colorLowland   (0.333, 0.275, 0.245, 0.000)
		colorUpland    (0.368, 0.334, 0.297, 0.000)
		colorRock      (0.398, 0.363, 0.321, 0.000)
		colorSnow      (0.434, 0.387, 0.338, 1.000)
		BumpHeight      0.535054
		BumpOffset      0.107011
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.227827
		GasToDust   0.25
		Particles   1440
		GasBright   0.180812
		DustBright  0.518648
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.7985
		Period          449.477
		Eccentricity    0.974866
		Inclination     9.72553
		AscendingNode   -6.55912
		ArgOfPericenter -18.4615
		MeanAnomaly     27.2953
	}
}

Comet	"C21"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.45283e-010
	Radius          10.5849
	InertiaMoment   0.398678

	Oblateness      0.0406677

	RotationPeriod  24.9492
	Obliquity       17.8975
	EqAscendNode    221.594

	AbsMagn         8.56326
	SlopeParam      5.59832
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.611 0.566)

	Surface
	{
		SurfStyle       0.5402
		OceanStyle      0.182363
		Randomize      (-0.838, -0.318, -0.063)
		colorDistMagn   0.834142
		colorDistFreq   0.0635189
		detailScale     289.038
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997619
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652732
		terraceProb     0.177202
		erosion         0
		montesMagn      0.344037
		montesFreq      2.72656
		montesSpiky     0.940996
		montesFraction  0.729829
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.313886
		hillsFraction   0.753764
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224684
		craterFreq      0.241183
		craterDensity   0.962683
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.436281
		volcanoTemp     1583.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.208, 0.158, 0.000)
		colorShelf     (0.297, 0.214, 0.181, 0.000)
		colorBeach     (0.349, 0.251, 0.215, 0.000)
		colorDesert    (0.379, 0.269, 0.209, 0.000)
		colorLowland   (0.416, 0.287, 0.238, 0.000)
		colorUpland    (0.460, 0.348, 0.289, 0.000)
		colorRock      (0.497, 0.379, 0.311, 0.000)
		colorSnow      (0.542, 0.403, 0.328, 1.000)
		BumpHeight      9.52639
		BumpOffset      1.90528
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.709019
		GasToDust   0.25
		Particles   2412
		GasBright   0.121921
		DustBright  0.262025
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.698
		Period          288.645
		Eccentricity    0.973973
		Inclination     70.1949
		AscendingNode   -28.7652
		ArgOfPericenter 20.8078
		MeanAnomaly     3.44302
	}
}

Comet	"C22"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.37106e-017
	Radius          0.0367923
	InertiaMoment   0.39663

	Oblateness      0.0665984

	RotationPeriod  22.6819
	Obliquity       331.103
	EqAscendNode    206.171

	AbsMagn         4.88742
	SlopeParam      6.56286
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.770 0.744)

	Surface
	{
		SurfStyle       0.942812
		OceanStyle      0.240354
		Randomize      (-0.931, -0.710, -0.013)
		colorDistMagn   0.45563
		colorDistFreq   8.99775e-007
		detailScale     1.00468
		colorConversion true
		snowLevel       2
		tropicLatitude  0.840433
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62351
		terraceProb     0.324833
		erosion         0
		montesMagn      0.317732
		montesFreq      3.90208
		montesSpiky     0.965519
		montesFraction  0.156033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.88537e-006
		hillsFraction   0.50745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243695
		craterFreq      0.23442
		craterDensity   1.03583
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504574
		volcanoTemp     1580.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.298, 0.050)
		colorShelf     (0.318, 0.316, 0.342, 0.040)
		colorBeach     (0.366, 0.362, 0.387, 0.030)
		colorDesert    (0.414, 0.408, 0.439, 0.020)
		colorLowland   (0.461, 0.454, 0.484, 0.030)
		colorUpland    (0.509, 0.501, 0.528, 0.050)
		colorRock      (0.557, 0.547, 0.588, 0.020)
		colorSnow      (0.557, 0.547, 0.588, 1.000)
		BumpHeight      0.0331131
		BumpOffset      0.00662262
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.327045
		DustBright  0.541388
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.6486
		Period          140.757
		Eccentricity    0.959173
		Inclination     -121.398
		AscendingNode   -77.9938
		ArgOfPericenter -50.0898
		MeanAnomaly     -77.1721
	}
}

Comet	"C23"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.06042e-013
	Radius          0.65565
	InertiaMoment   0.399163

	Oblateness      0.0613591

	RotationPeriod  20.3094
	Obliquity       284.309
	EqAscendNode    190.749

	AbsMagn         12.5615
	SlopeParam      2.09727
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.755 0.641 0.581)

	Surface
	{
		SurfStyle       0.650163
		OceanStyle      0.962627
		Randomize      (-0.250, 0.119, 0.810)
		colorDistMagn   0.164067
		colorDistFreq   0.000276977
		detailScale     17.9036
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960981
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506561
		terraceProb     0.188879
		erosion         0
		montesMagn      0.547977
		montesFreq      4.07853
		montesSpiky     0.843746
		montesFraction  0.406253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000814173
		hillsFraction   0.668434
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246768
		craterFreq      0.145503
		craterDensity   0.935548
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479317
		volcanoTemp     1476.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.218, 0.163, 0.000)
		colorShelf     (0.302, 0.224, 0.186, 0.000)
		colorBeach     (0.355, 0.263, 0.221, 0.000)
		colorDesert    (0.385, 0.282, 0.215, 0.000)
		colorLowland   (0.423, 0.301, 0.244, 0.000)
		colorUpland    (0.468, 0.365, 0.296, 0.000)
		colorRock      (0.506, 0.397, 0.320, 0.000)
		colorSnow      (0.551, 0.423, 0.337, 1.000)
		BumpHeight      0.590085
		BumpOffset      0.118017
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.260653
		GasToDust   0.25
		Particles   1506
		GasBright   0.240873
		DustBright  0.312047
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   32.3141
		Period          138.599
		Eccentricity    0.968689
		Inclination     79.5616
		AscendingNode   -75.9194
		ArgOfPericenter -12.0699
		MeanAnomaly     -82.8413
	}
}

Comet	"C24"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            8.20155e-010
	Radius          14.3673
	InertiaMoment   0.397743

	Oblateness      0.107975

	RotationPeriod  17.81
	Obliquity       237.515
	EqAscendNode    175.326

	AbsMagn         8.35322
	SlopeParam      2.85084
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.555 0.483)

	Surface
	{
		SurfStyle       0.333054
		OceanStyle      0.0869514
		Randomize      (0.728, -0.447, -0.126)
		colorDistMagn   0.594076
		colorDistFreq   0.170236
		detailScale     392.323
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967931
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434314
		terraceProb     0.395484
		erosion         0
		montesMagn      0.422881
		montesFreq      2.69652
		montesSpiky     0.943621
		montesFraction  0.405171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.400072
		hillsFraction   0.763476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238399
		craterFreq      0.264991
		craterDensity   0.995925
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522909
		volcanoTemp     1617.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.222, 0.193, 0.000)
		colorShelf     (0.269, 0.236, 0.205, 0.000)
		colorBeach     (0.285, 0.250, 0.217, 0.000)
		colorDesert    (0.301, 0.264, 0.230, 0.000)
		colorLowland   (0.316, 0.278, 0.242, 0.000)
		colorUpland    (0.332, 0.292, 0.254, 0.000)
		colorRock      (0.348, 0.305, 0.266, 0.000)
		colorSnow      (0.364, 0.319, 0.278, 1.000)
		BumpHeight      12.9306
		BumpOffset      2.58611
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.741845
		GasToDust   0.25
		Particles   2478
		GasBright   0.117441
		DustBright  0.119965
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.9249
		Period          197.539
		Eccentricity    0.970449
		Inclination     -145.305
		AscendingNode   -66.6416
		ArgOfPericenter -23.2729
		MeanAnomaly     -159.924
	}
}

Comet	"C25"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.52531e-017
	Radius          0.0406122
	InertiaMoment   0.399603

	Oblateness      0.110141

	RotationPeriod  15.1558
	Obliquity       190.72
	EqAscendNode    159.903

	AbsMagn         4.5967
	SlopeParam      3.46667
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.538 0.455)

	Surface
	{
		SurfStyle       0.40503
		OceanStyle      0.0225274
		Randomize      (-0.923, -0.807, 0.906)
		colorDistMagn   0.101212
		colorDistFreq   3.11523e-007
		detailScale     1.10898
		colorConversion true
		snowLevel       2
		tropicLatitude  0.136878
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310763
		terraceProb     0.698791
		erosion         0
		montesMagn      0.530127
		montesFreq      3.88121
		montesSpiky     0.806057
		montesFraction  0.540468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7722e-006
		hillsFraction   0.34426
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228256
		craterFreq      0.185172
		craterDensity   0.991642
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434104
		volcanoTemp     1502.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.215, 0.182, 0.000)
		colorShelf     (0.248, 0.229, 0.193, 0.000)
		colorBeach     (0.263, 0.242, 0.205, 0.000)
		colorDesert    (0.278, 0.255, 0.216, 0.000)
		colorLowland   (0.292, 0.269, 0.227, 0.000)
		colorUpland    (0.307, 0.282, 0.239, 0.000)
		colorRock      (0.322, 0.296, 0.250, 0.000)
		colorSnow      (0.336, 0.309, 0.262, 1.000)
		BumpHeight      0.036551
		BumpOffset      0.0073102
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0387859
		DustBright  0.683107
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.5266
		Period          262.984
		Eccentricity    0.983601
		Inclination     -173.088
		AscendingNode   132.703
		ArgOfPericenter 41.719
		MeanAnomaly     -118.91
	}
}

Comet	"C26"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.95315e-013
	Radius          0.889218
	InertiaMoment   0.398408

	Oblateness      0.225577

	RotationPeriod  12.3098
	Obliquity       143.926
	EqAscendNode    144.481

	AbsMagn         12.1824
	SlopeParam      4.03479
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.422 0.416 0.411)

	Surface
	{
		SurfStyle       0.297213
		OceanStyle      0.392547
		Randomize      (0.175, -0.082, -0.371)
		colorDistMagn   0.254621
		colorDistFreq   0.000381385
		detailScale     24.2816
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997086
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538655
		terraceProb     0.14224
		erosion         0
		montesMagn      0.484779
		montesFreq      3.35974
		montesSpiky     0.784489
		montesFraction  0.537433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00169923
		hillsFraction   0.655436
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21736
		craterFreq      0.158437
		craterDensity   0.884028
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517811
		volcanoTemp     1526.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.167, 0.164, 0.000)
		colorShelf     (0.179, 0.177, 0.175, 0.000)
		colorBeach     (0.190, 0.187, 0.185, 0.000)
		colorDesert    (0.200, 0.198, 0.195, 0.000)
		colorLowland   (0.211, 0.208, 0.205, 0.000)
		colorUpland    (0.221, 0.219, 0.216, 0.000)
		colorRock      (0.232, 0.229, 0.226, 0.000)
		colorSnow      (0.242, 0.239, 0.236, 1.000)
		BumpHeight      0.800297
		BumpOffset      0.160059
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.293478
		GasToDust   0.25
		Particles   1572
		GasBright   0.0458287
		DustBright  0.360551
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   50.3378
		Period          269.472
		Eccentricity    0.975273
		Inclination     -49.6508
		AscendingNode   -5.04051
		ArgOfPericenter -170.107
		MeanAnomaly     143.465
	}
}

Comet	"C27"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.51062e-009
	Radius          15.8724
	InertiaMoment   0.394817

	Oblateness      0.249

	RotationPeriod  9.22115
	Obliquity       97.1317
	EqAscendNode    129.058

	AbsMagn         8.14416
	SlopeParam      4.6058
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.621 0.521)

	Surface
	{
		SurfStyle       0.0932198
		OceanStyle      0.870824
		Randomize      (-0.986, 0.882, -0.288)
		colorDistMagn   0.765426
		colorDistFreq   0.0615966
		detailScale     433.421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993034
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512508
		terraceProb     0.267132
		erosion         0
		montesMagn      0.645192
		montesFreq      2.56519
		montesSpiky     0.893911
		montesFraction  0.593913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.48962
		hillsFraction   0.60423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240192
		craterFreq      0.243859
		craterDensity   1.03284
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480742
		volcanoTemp     1366.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.248, 0.208, 0.000)
		colorShelf     (0.289, 0.264, 0.221, 0.000)
		colorBeach     (0.306, 0.279, 0.234, 0.000)
		colorDesert    (0.323, 0.295, 0.247, 0.000)
		colorLowland   (0.340, 0.310, 0.260, 0.000)
		colorUpland    (0.357, 0.326, 0.274, 0.000)
		colorRock      (0.374, 0.341, 0.287, 0.000)
		colorSnow      (0.391, 0.357, 0.300, 1.000)
		BumpHeight      14.2851
		BumpOffset      2.85703
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.77467
		GasToDust   0.25
		Particles   2544
		GasBright   0.153067
		DustBright  0.737799
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.9804
		Period          324.534
		Eccentricity    0.977422
		Inclination     -48.3889
		AscendingNode   92.734
		ArgOfPericenter 155.665
		MeanAnomaly     24.1707
	}
}

Comet	"C28"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.65132e-017
	Radius          0.0550372
	InertiaMoment   0.398931

	Oblateness      0.249

	RotationPeriod  5.81705
	Obliquity       50.3374
	EqAscendNode    113.636

	AbsMagn         4.28679
	SlopeParam      5.23225
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.743 0.740)

	Surface
	{
		SurfStyle       0.509177
		OceanStyle      0.362629
		Randomize      (-0.856, -0.780, 0.883)
		colorDistMagn   0.00704253
		colorDistFreq   1.69951e-006
		detailScale     1.50288
		colorConversion true
		snowLevel       2
		tropicLatitude  0.825427
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423507
		terraceProb     0.462471
		erosion         0
		montesMagn      0.525355
		montesFreq      2.86776
		montesSpiky     0.973483
		montesFraction  0.34808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.82161e-006
		hillsFraction   0.533663
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261025
		craterFreq      0.255788
		craterDensity   0.76597
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452484
		volcanoTemp     1190.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.253, 0.207, 0.000)
		colorShelf     (0.298, 0.260, 0.237, 0.000)
		colorBeach     (0.350, 0.304, 0.281, 0.000)
		colorDesert    (0.380, 0.327, 0.274, 0.000)
		colorLowland   (0.417, 0.349, 0.311, 0.000)
		colorUpland    (0.462, 0.423, 0.377, 0.000)
		colorRock      (0.499, 0.460, 0.407, 0.000)
		colorSnow      (0.544, 0.490, 0.429, 1.000)
		BumpHeight      0.0495335
		BumpOffset      0.0099067
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.132828
		DustBright  0.442524
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.0647
		Period          184.225
		Eccentricity    0.952185
		Inclination     -102.09
		AscendingNode   -21.947
		ArgOfPericenter 175.223
		MeanAnomaly     124.034
	}
}

Comet	"C29"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.59746e-013
	Radius          0.983164
	InertiaMoment   0.397297

	Oblateness      0.00108965

	RotationPeriod  151.407
	Obliquity       3.54314
	EqAscendNode    98.2131

	AbsMagn         11.8375
	SlopeParam      6.01515
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.755 0.709)

	Surface
	{
		SurfStyle       0.0603217
		OceanStyle      0.164642
		Randomize      (0.471, 0.807, 0.101)
		colorDistMagn   0.6028
		colorDistFreq   0.000437559
		detailScale     26.8469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0507332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.41385
		terraceProb     0.188571
		erosion         0
		montesMagn      0.513885
		montesFreq      2.6447
		montesSpiky     0.938561
		montesFraction  0.384301
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0020454
		hillsFraction   0.517567
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261518
		craterFreq      0.180852
		craterDensity   1.00557
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485542
		volcanoTemp     1476.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.302, 0.284, 0.000)
		colorShelf     (0.339, 0.321, 0.301, 0.000)
		colorBeach     (0.359, 0.340, 0.319, 0.000)
		colorDesert    (0.379, 0.359, 0.337, 0.000)
		colorLowland   (0.399, 0.378, 0.354, 0.000)
		colorUpland    (0.419, 0.396, 0.372, 0.000)
		colorRock      (0.439, 0.415, 0.390, 0.000)
		colorSnow      (0.459, 0.434, 0.408, 1.000)
		BumpHeight      0.884847
		BumpOffset      0.176969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.326304
		GasToDust   0.25
		Particles   1638
		GasBright   0.0753297
		DustBright  0.184509
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.0556
		Period          156.606
		Eccentricity    0.959804
		Inclination     -2.24418
		AscendingNode   -54.9672
		ArgOfPericenter -140.039
		MeanAnomaly     146.205
	}
}

Comet	"C30"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.78238e-009
	Radius          21.494
	InertiaMoment   0.399389

	Oblateness      0.00234442

	RotationPeriod  120.449
	Obliquity       316.749
	EqAscendNode    82.7905

	AbsMagn         7.93549
	SlopeParam      7.39602
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.410 0.325)

	Surface
	{
		SurfStyle       0.804452
		OceanStyle      0.426128
		Randomize      (-0.045, -0.773, -0.299)
		colorDistMagn   0.24572
		colorDistFreq   0.121934
		detailScale     586.931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.73086
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444036
		terraceProb     0.320693
		erosion         0
		montesMagn      0.59647
		montesFreq      2.99345
		montesSpiky     0.894977
		montesFraction  0.49346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1133
		hillsFraction   0.86198
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224302
		craterFreq      0.169142
		craterDensity   0.829422
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540387
		volcanoTemp     1553.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.139, 0.091, 0.000)
		colorShelf     (0.195, 0.143, 0.104, 0.000)
		colorBeach     (0.229, 0.168, 0.123, 0.000)
		colorDesert    (0.249, 0.180, 0.120, 0.000)
		colorLowland   (0.273, 0.193, 0.136, 0.000)
		colorUpland    (0.302, 0.234, 0.166, 0.000)
		colorRock      (0.327, 0.254, 0.179, 0.000)
		colorSnow      (0.356, 0.271, 0.188, 1.000)
		BumpHeight      19.3446
		BumpOffset      3.86893
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.807496
		GasToDust   0.25
		Particles   2611
		GasBright   0.259736
		DustBright  0.48459
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.9896
		Period          316.106
		Eccentricity    0.976563
		Inclination     -90.1954
		AscendingNode   178.68
		ArgOfPericenter -10.3496
		MeanAnomaly     11.0765
	}
}

Comet	"C31"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            8.56716e-017
	Radius          0.0608989
	InertiaMoment   0.398106

	Oblateness      0.00206072

	RotationPeriod  110.152
	Obliquity       269.955
	EqAscendNode    67.3679

	AbsMagn         3.9528
	SlopeParam      2.49569
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.526 0.522 0.520)

	Surface
	{
		SurfStyle       0.978551
		OceanStyle      0.395026
		Randomize      (-0.516, 0.418, -0.859)
		colorDistMagn   0.872944
		colorDistFreq   1.6673e-006
		detailScale     1.66295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891304
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606455
		terraceProb     0.176679
		erosion         0
		montesMagn      0.670195
		montesFreq      3.60141
		montesSpiky     0.903824
		montesFraction  0.618343
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00292e-005
		hillsFraction   0.699403
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214963
		craterFreq      0.249145
		craterDensity   0.809324
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495806
		volcanoTemp     1497.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.183, 0.208, 0.050)
		colorShelf     (0.210, 0.214, 0.239, 0.040)
		colorBeach     (0.242, 0.245, 0.270, 0.030)
		colorDesert    (0.273, 0.277, 0.307, 0.020)
		colorLowland   (0.305, 0.308, 0.338, 0.030)
		colorUpland    (0.337, 0.339, 0.369, 0.050)
		colorRock      (0.368, 0.371, 0.411, 0.020)
		colorSnow      (0.368, 0.371, 0.411, 1.000)
		BumpHeight      0.054809
		BumpOffset      0.0109618
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.174955
		DustBright  0.253857
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.4473
		Period          231.171
		Eccentricity    0.951091
		Inclination     85.4984
		AscendingNode   -117.049
		ArgOfPericenter -104.046
		MeanAnomaly     -14.2382
	}
}

Comet	"C32"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            6.62609e-013
	Radius          1.33043
	InertiaMoment   0.399817

	Oblateness      0.00317789

	RotationPeriod  103.321
	Obliquity       223.16
	EqAscendNode    51.9453

	AbsMagn         11.5191
	SlopeParam      3.16445
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.671 0.668)

	Surface
	{
		SurfStyle       0.428519
		OceanStyle      0.306884
		Randomize      (-0.053, 0.772, 0.608)
		colorDistMagn   0.283204
		colorDistFreq   0.000469059
		detailScale     36.3297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.443218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717774
		terraceProb     0.524983
		erosion         0
		montesMagn      0.516751
		montesFreq      3.44469
		montesSpiky     0.892545
		montesFraction  0.77271
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00459397
		hillsFraction   0.820664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248132
		craterFreq      0.234747
		craterDensity   0.983863
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546892
		volcanoTemp     1366.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.268, 0.267, 0.000)
		colorShelf     (0.286, 0.285, 0.284, 0.000)
		colorBeach     (0.303, 0.302, 0.300, 0.000)
		colorDesert    (0.320, 0.319, 0.317, 0.000)
		colorLowland   (0.337, 0.335, 0.334, 0.000)
		colorUpland    (0.354, 0.352, 0.350, 0.000)
		colorRock      (0.370, 0.369, 0.367, 0.000)
		colorSnow      (0.387, 0.386, 0.384, 1.000)
		BumpHeight      1.19739
		BumpOffset      0.239478
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.359131
		GasToDust   0.25
		Particles   1705
		GasBright   0.426551
		DustBright  0.486747
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.5014
		Period          295.27
		Eccentricity    0.982749
		Inclination     -158.882
		AscendingNode   151.195
		ArgOfPericenter 116.925
		MeanAnomaly     36.2814
	}
}

Comet	"C33"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.12479e-009
	Radius          23.8008
	InertiaMoment   0.398684

	Oblateness      0.00260121

	RotationPeriod  98.0479
	Obliquity       176.366
	EqAscendNode    36.5227

	AbsMagn         7.72665
	SlopeParam      3.74935
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.652 0.647)

	Surface
	{
		SurfStyle       0.330394
		OceanStyle      0.224124
		Randomize      (0.645, 0.370, -0.258)
		colorDistMagn   0.930287
		colorDistFreq   0.30424
		detailScale     649.921
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609572
		terraceProb     0.140905
		erosion         0
		montesMagn      0.485651
		montesFreq      2.54339
		montesSpiky     0.988781
		montesFraction  0.60209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.72834
		hillsFraction   0.626639
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23855
		craterFreq      0.244253
		craterDensity   0.864289
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49959
		volcanoTemp     1010.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.261, 0.259, 0.000)
		colorShelf     (0.279, 0.277, 0.275, 0.000)
		colorBeach     (0.296, 0.293, 0.291, 0.000)
		colorDesert    (0.312, 0.310, 0.308, 0.000)
		colorLowland   (0.329, 0.326, 0.324, 0.000)
		colorUpland    (0.345, 0.342, 0.340, 0.000)
		colorRock      (0.361, 0.359, 0.356, 0.000)
		colorSnow      (0.378, 0.375, 0.372, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.840322
		GasToDust   0.25
		Particles   2677
		GasBright   0.0155963
		DustBright  0.582189
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.1241
		Period          191.769
		Eccentricity    0.959197
		Inclination     -95.1232
		AscendingNode   32.0997
		ArgOfPericenter -66.901
		MeanAnomaly     140.56
	}
}

Comet	"C34"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.57796e-016
	Radius          0.082353
	InertiaMoment   0.396652

	Oblateness      0.0038051

	RotationPeriod  93.672
	Obliquity       129.572
	EqAscendNode    21.1001

	AbsMagn         3.58791
	SlopeParam      4.31314
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.414 0.411 0.408)

	Surface
	{
		SurfStyle       0.788876
		OceanStyle      0.66637
		Randomize      (-0.834, -0.824, 0.764)
		colorDistMagn   0.733729
		colorDistFreq   2.31346e-006
		detailScale     2.24879
		colorConversion true
		snowLevel       2
		tropicLatitude  0.708721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531629
		terraceProb     0.180501
		erosion         0
		montesMagn      0.648792
		montesFreq      3.65281
		montesSpiky     0.940369
		montesFraction  0.39023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.88469e-005
		hillsFraction   0.705474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268743
		craterFreq      0.277798
		craterDensity   0.750953
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548867
		volcanoTemp     1517.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.140, 0.114, 0.000)
		colorShelf     (0.166, 0.144, 0.130, 0.000)
		colorBeach     (0.195, 0.168, 0.155, 0.000)
		colorDesert    (0.211, 0.181, 0.151, 0.000)
		colorLowland   (0.232, 0.193, 0.171, 0.000)
		colorUpland    (0.257, 0.234, 0.208, 0.000)
		colorRock      (0.277, 0.255, 0.224, 0.000)
		colorSnow      (0.302, 0.271, 0.236, 1.000)
		BumpHeight      0.0741177
		BumpOffset      0.0148235
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0240313
		DustBright  0.258241
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.9913
		Period          243.051
		Eccentricity    0.96775
		Inclination     -5.32622
		AscendingNode   174.28
		ArgOfPericenter 5.81965
		MeanAnomaly     150.373
	}
}

Comet	"C35"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.22044e-012
	Radius          1.47426
	InertiaMoment   0.399169

	Oblateness      0.00309448

	RotationPeriod  89.8833
	Obliquity       82.7774
	EqAscendNode    5.67751

	AbsMagn         11.2215
	SlopeParam      4.90356
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.786 0.783 0.780)

	Surface
	{
		SurfStyle       0.743283
		OceanStyle      0.940424
		Randomize      (-0.410, 0.402, -0.465)
		colorDistMagn   0.910853
		colorDistFreq   0.000781953
		detailScale     40.2571
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99656
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582064
		terraceProb     0.407975
		erosion         0
		montesMagn      0.52671
		montesFreq      3.36371
		montesSpiky     0.959755
		montesFraction  0.422419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00495462
		hillsFraction   0.695138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259763
		craterFreq      0.229156
		craterDensity   0.975426
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486741
		volcanoTemp     1610.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.266, 0.218, 0.000)
		colorShelf     (0.314, 0.274, 0.250, 0.000)
		colorBeach     (0.369, 0.321, 0.296, 0.000)
		colorDesert    (0.401, 0.345, 0.289, 0.000)
		colorLowland   (0.440, 0.368, 0.328, 0.000)
		colorUpland    (0.487, 0.446, 0.398, 0.000)
		colorRock      (0.526, 0.486, 0.429, 0.000)
		colorSnow      (0.574, 0.517, 0.452, 1.000)
		BumpHeight      1.32683
		BumpOffset      0.265366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.391956
		GasToDust   0.25
		Particles   1771
		GasBright   0.110552
		DustBright  0.656207
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   57.9594
		Period          332.934
		Eccentricity    0.969794
		Inclination     72.1423
		AscendingNode   82.6118
		ArgOfPericenter -91.5883
		MeanAnomaly     40.363
	}
}

Comet	"C36"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            9.43922e-009
	Radius          32.1646
	InertiaMoment   0.397753

	Oblateness      0.0044618

	RotationPeriod  86.5092
	Obliquity       35.9831
	EqAscendNode    350.255

	AbsMagn         7.51705
	SlopeParam      5.58773
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.463 0.459)

	Surface
	{
		SurfStyle       0.102965
		OceanStyle      0.853906
		Randomize      (0.581, 0.699, 0.304)
		colorDistMagn   0.131954
		colorDistFreq   0.625937
		detailScale     878.308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.465106
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.274779
		terraceProb     0.21827
		erosion         0
		montesMagn      0.50157
		montesFreq      3.25297
		montesSpiky     0.975173
		montesFraction  0.577149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.51044
		hillsFraction   0.701516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24347
		craterFreq      0.159365
		craterDensity   0.904666
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476034
		volcanoTemp     1490.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.185, 0.183, 0.000)
		colorShelf     (0.199, 0.197, 0.195, 0.000)
		colorBeach     (0.211, 0.208, 0.206, 0.000)
		colorDesert    (0.222, 0.220, 0.218, 0.000)
		colorLowland   (0.234, 0.231, 0.229, 0.000)
		colorUpland    (0.246, 0.243, 0.241, 0.000)
		colorRock      (0.258, 0.254, 0.252, 0.000)
		colorSnow      (0.269, 0.266, 0.264, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.873148
		GasToDust   0.25
		Particles   2743
		GasBright   0.0917047
		DustBright  0.35954
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.7904
		Period          148.204
		Eccentricity    0.949286
		Inclination     -31.392
		AscendingNode   -50.5387
		ArgOfPericenter -129.168
		MeanAnomaly     32.2514
	}
}

Comet	"C37"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.90641e-016
	Radius          0.0913176
	InertiaMoment   0.399608

	Oblateness      0.00358907

	RotationPeriod  83.4434
	Obliquity       349.189
	EqAscendNode    334.832

	AbsMagn         3.18204
	SlopeParam      6.54541
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.444 0.437 0.431)

	Surface
	{
		SurfStyle       0.871705
		OceanStyle      0.772903
		Randomize      (0.795, 0.756, 0.893)
		colorDistMagn   0.195841
		colorDistFreq   2.23936e-006
		detailScale     2.49358
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998658
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413765
		terraceProb     0.439354
		erosion         0
		montesMagn      0.625974
		montesFreq      3.12071
		montesSpiky     0.908873
		montesFraction  0.685467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1481e-005
		hillsFraction   0.765881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253031
		craterFreq      0.266794
		craterDensity   0.808327
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519067
		volcanoTemp     1610.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.151, 0.153, 0.173, 0.050)
		colorShelf     (0.178, 0.179, 0.198, 0.040)
		colorBeach     (0.204, 0.205, 0.224, 0.030)
		colorDesert    (0.231, 0.232, 0.254, 0.020)
		colorLowland   (0.258, 0.258, 0.280, 0.030)
		colorUpland    (0.284, 0.284, 0.306, 0.050)
		colorRock      (0.311, 0.310, 0.341, 0.020)
		colorSnow      (0.311, 0.310, 0.341, 1.000)
		BumpHeight      0.0821858
		BumpOffset      0.0164372
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.245415
		DustBright  0.690316
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.8184
		Period          122.857
		Eccentricity    0.964115
		Inclination     88.5877
		AscendingNode   113.911
		ArgOfPericenter -51.5775
		MeanAnomaly     172.369
	}
}

Comet	"C38"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.2479e-012
	Radius          1.99108
	InertiaMoment   0.398415

	Oblateness      0.00513061

	RotationPeriod  80.6151
	Obliquity       302.394
	EqAscendNode    319.41

	AbsMagn         10.9408
	SlopeParam      2.08511
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.682 0.678)

	Surface
	{
		SurfStyle       0.389868
		OceanStyle      0.524259
		Randomize      (-0.884, 0.217, 0.802)
		colorDistMagn   0.146658
		colorDistFreq   0.000495578
		detailScale     54.3697
		colorConversion true
		snowLevel       2
		tropicLatitude  0.80028
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607119
		terraceProb     0.307065
		erosion         0
		montesMagn      0.513006
		montesFreq      3.09281
		montesSpiky     0.889554
		montesFraction  0.393672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00998111
		hillsFraction   0.859652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214795
		craterFreq      0.188102
		craterDensity   0.778882
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575511
		volcanoTemp     1493.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.271, 0.000)
		colorShelf     (0.292, 0.290, 0.288, 0.000)
		colorBeach     (0.309, 0.307, 0.305, 0.000)
		colorDesert    (0.326, 0.324, 0.322, 0.000)
		colorLowland   (0.343, 0.341, 0.339, 0.000)
		colorUpland    (0.360, 0.358, 0.356, 0.000)
		colorRock      (0.377, 0.375, 0.373, 0.000)
		colorSnow      (0.394, 0.392, 0.390, 1.000)
		BumpHeight      1.79197
		BumpOffset      0.358394
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.424782
		GasToDust   0.25
		Particles   1837
		GasBright   0.199286
		DustBright  0.420932
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.0908
		Period          184.409
		Eccentricity    0.962289
		Inclination     -133.548
		AscendingNode   -67.873
		ArgOfPericenter -4.61168
		MeanAnomaly     110.634
	}
}

Comet	"C39"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.73859e-008
	Radius          35.689
	InertiaMoment   0.394955

	Oblateness      0.00403065

	RotationPeriod  77.9752
	Obliquity       255.6
	EqAscendNode    303.987

	AbsMagn         7.30612
	SlopeParam      2.84172
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.705 0.703)

	Surface
	{
		SurfStyle       0.903053
		OceanStyle      0.243387
		Randomize      (0.528, -0.085, -0.375)
		colorDistMagn   0.317067
		colorDistFreq   0.827463
		detailScale     974.548
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433489
		terraceProb     0.201748
		erosion         0
		montesMagn      0.542921
		montesFreq      2.39695
		montesSpiky     0.958828
		montesFraction  0.684327
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.42398
		hillsFraction   0.704014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223724
		craterFreq      0.228615
		craterDensity   0.906623
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491097
		volcanoTemp     1391.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.247, 0.281, 0.050)
		colorShelf     (0.283, 0.289, 0.323, 0.040)
		colorBeach     (0.325, 0.331, 0.366, 0.030)
		colorDesert    (0.367, 0.374, 0.415, 0.020)
		colorLowland   (0.410, 0.416, 0.457, 0.030)
		colorUpland    (0.452, 0.458, 0.499, 0.050)
		colorRock      (0.495, 0.501, 0.555, 0.020)
		colorSnow      (0.495, 0.501, 0.555, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.905974
		GasToDust   0.25
		Particles   2810
		GasBright   0.115898
		DustBright  0.188807
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.8144
		Period          257.332
		Eccentricity    0.962466
		Inclination     101.875
		AscendingNode   91.9771
		ArgOfPericenter -46.3709
		MeanAnomaly     -80.8997
	}
}

Comet	"C40"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.35324e-016
	Radius          0.123256
	InertiaMoment   0.398937

	Oblateness      0.00584016

	RotationPeriod  75.4874
	Obliquity       208.806
	EqAscendNode    288.565

	AbsMagn         2.71939
	SlopeParam      3.45867
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.411 0.408 0.405)

	Surface
	{
		SurfStyle       0.723363
		OceanStyle      0.488964
		Randomize      (-0.645, -0.359, 0.911)
		colorDistMagn   0.395506
		colorDistFreq   3.11008e-006
		detailScale     3.36571
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991658
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426691
		terraceProb     0.304362
		erosion         0
		montesMagn      0.567855
		montesFreq      3.92564
		montesSpiky     0.932946
		montesFraction  0.590864
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.9843e-005
		hillsFraction   0.64245
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240404
		craterFreq      0.217002
		craterDensity   0.854997
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507159
		volcanoTemp     1291.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.139, 0.113, 0.000)
		colorShelf     (0.164, 0.143, 0.130, 0.000)
		colorBeach     (0.193, 0.167, 0.154, 0.000)
		colorDesert    (0.210, 0.180, 0.150, 0.000)
		colorLowland   (0.230, 0.192, 0.170, 0.000)
		colorUpland    (0.255, 0.233, 0.207, 0.000)
		colorRock      (0.275, 0.253, 0.223, 0.000)
		colorSnow      (0.300, 0.270, 0.235, 1.000)
		BumpHeight      0.11093
		BumpOffset      0.0221861
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.346776
		DustBright  0.442415
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.6226
		Period          240.196
		Eccentricity    0.966491
		Inclination     -90.2942
		AscendingNode   -104.961
		ArgOfPericenter 57.5457
		MeanAnomaly     -1.80317
	}
}

Comet	"C41"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.14034e-012
	Radius          2.21062
	InertiaMoment   0.39731

	Oblateness      0.0046142

	RotationPeriod  73.1244
	Obliquity       162.012
	EqAscendNode    273.142

	AbsMagn         10.6739
	SlopeParam      4.02708
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.776 0.775)

	Surface
	{
		SurfStyle       0.77619
		OceanStyle      0.401502
		Randomize      (-0.432, 0.838, 0.932)
		colorDistMagn   0.316774
		colorDistFreq   0.00221822
		detailScale     60.3646
		colorConversion true
		snowLevel       2
		tropicLatitude  0.156831
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433144
		terraceProb     0.633915
		erosion         0
		montesMagn      0.3755
		montesFreq      2.84308
		montesSpiky     0.887542
		montesFraction  0.525178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0111732
		hillsFraction   0.498591
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247977
		craterFreq      0.201763
		craterDensity   0.996537
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439169
		volcanoTemp     1391.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.264, 0.217, 0.000)
		colorShelf     (0.311, 0.272, 0.248, 0.000)
		colorBeach     (0.366, 0.318, 0.295, 0.000)
		colorDesert    (0.397, 0.342, 0.287, 0.000)
		colorLowland   (0.436, 0.365, 0.326, 0.000)
		colorUpland    (0.482, 0.443, 0.395, 0.000)
		colorRock      (0.521, 0.481, 0.426, 0.000)
		colorSnow      (0.568, 0.512, 0.450, 1.000)
		BumpHeight      1.98956
		BumpOffset      0.397911
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.457608
		GasToDust   0.25
		Particles   1904
		GasBright   0.236106
		DustBright  0.237572
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.3641
		Period          294.135
		Eccentricity    0.968448
		Inclination     -10.1345
		AscendingNode   -160.891
		ArgOfPericenter -74.5508
		MeanAnomaly     8.79439
	}
}

Comet	"C42"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.20226e-008
	Radius          48.1436
	InertiaMoment   0.399395

	Oblateness      0.00661312

	RotationPeriod  70.865
	Obliquity       115.217
	EqAscendNode    257.719

	AbsMagn         7.09325
	SlopeParam      4.59773
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.545 0.395)

	Surface
	{
		SurfStyle       0.61025
		OceanStyle      0.969454
		Randomize      (-0.534, -0.425, -0.962)
		colorDistMagn   0.994559
		colorDistFreq   0.717535
		detailScale     1314.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.931853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.278028
		terraceProb     0.500532
		erosion         0
		montesMagn      0.650203
		montesFreq      3.6037
		montesSpiky     0.790647
		montesFraction  0.676658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.44588
		hillsFraction   0.739263
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22789
		craterFreq      0.201461
		craterDensity   0.791308
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509244
		volcanoTemp     1842.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.185, 0.111, 0.000)
		colorShelf     (0.253, 0.191, 0.126, 0.000)
		colorBeach     (0.298, 0.224, 0.150, 0.000)
		colorDesert    (0.323, 0.240, 0.146, 0.000)
		colorLowland   (0.355, 0.256, 0.166, 0.000)
		colorUpland    (0.393, 0.311, 0.201, 0.000)
		colorRock      (0.425, 0.338, 0.217, 0.000)
		colorSnow      (0.463, 0.360, 0.229, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.9388
		GasToDust   0.25
		Particles   2876
		GasBright   0.055092
		DustBright  0.903072
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.4512
		Period          262.384
		Eccentricity    0.970025
		Inclination     -107.078
		AscendingNode   124.35
		ArgOfPericenter -81.8041
		MeanAnomaly     98.2118
	}
}

Comet	"C43"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            9.85998e-016
	Radius          0.136928
	InertiaMoment   0.398114

	Oblateness      0.00523368

	RotationPeriod  68.6924
	Obliquity       68.423
	EqAscendNode    242.297

	AbsMagn         2.17273
	SlopeParam      5.22293
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.672 0.635)

	Surface
	{
		SurfStyle       0.659738
		OceanStyle      0.240668
		Randomize      (-0.512, -0.500, -0.373)
		colorDistMagn   0.687103
		colorDistFreq   7.83612e-006
		detailScale     3.73904
		colorConversion true
		snowLevel       2
		tropicLatitude  0.411585
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49308
		terraceProb     0.171371
		erosion         0
		montesMagn      0.507843
		montesFreq      2.7979
		montesSpiky     0.953401
		montesFraction  0.881246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.43188e-005
		hillsFraction   0.782306
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231349
		craterFreq      0.236946
		craterDensity   0.817291
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538919
		volcanoTemp     1597.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.229, 0.178, 0.000)
		colorShelf     (0.300, 0.235, 0.203, 0.000)
		colorBeach     (0.353, 0.276, 0.241, 0.000)
		colorDesert    (0.383, 0.296, 0.235, 0.000)
		colorLowland   (0.420, 0.316, 0.267, 0.000)
		colorUpland    (0.465, 0.383, 0.324, 0.000)
		colorRock      (0.503, 0.417, 0.349, 0.000)
		colorSnow      (0.548, 0.444, 0.368, 1.000)
		BumpHeight      0.123235
		BumpOffset      0.024647
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0748963
		DustBright  0.567755
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.7181
		Period          174.782
		Eccentricity    0.957633
		Inclination     86.9442
		AscendingNode   -163.808
		ArgOfPericenter -44.3256
		MeanAnomaly     -141.705
	}
}

Comet	"C44"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            7.62598e-012
	Radius          2.98043
	InertiaMoment   0.399822

	Oblateness      0.00747298

	RotationPeriod  66.5926
	Obliquity       21.6287
	EqAscendNode    226.874

	AbsMagn         10.4184
	SlopeParam      6.00237
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.550 0.370 0.300)

	Surface
	{
		SurfStyle       0.343171
		OceanStyle      0.729662
		Randomize      (-0.633, -0.195, -0.841)
		colorDistMagn   0.109309
		colorDistFreq   0.00379878
		detailScale     81.3855
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990569
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614266
		terraceProb     0.24208
		erosion         0
		montesMagn      0.323093
		montesFreq      3.49793
		montesSpiky     0.993759
		montesFraction  0.649847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0197143
		hillsFraction   0.592357
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213122
		craterFreq      0.252707
		craterDensity   0.69091
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514458
		volcanoTemp     1750.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.148, 0.120, 0.000)
		colorShelf     (0.234, 0.157, 0.128, 0.000)
		colorBeach     (0.247, 0.167, 0.135, 0.000)
		colorDesert    (0.261, 0.176, 0.143, 0.000)
		colorLowland   (0.275, 0.185, 0.150, 0.000)
		colorUpland    (0.289, 0.195, 0.158, 0.000)
		colorRock      (0.302, 0.204, 0.165, 0.000)
		colorSnow      (0.316, 0.213, 0.173, 1.000)
		BumpHeight      2.68238
		BumpOffset      0.536477
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.490434
		GasToDust   0.25
		Particles   1970
		GasBright   0.0574414
		DustBright  0.269696
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.1112
		Period          221.052
		Eccentricity    0.97071
		Inclination     -78.7225
		AscendingNode   -151.88
		ArgOfPericenter 71.7685
		MeanAnomaly     -96.3089
	}
}

Comet	"C45"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.89815e-008
	Radius          53.5142
	InertiaMoment   0.398691

	Oblateness      0.00592658

	RotationPeriod  64.5544
	Obliquity       334.834
	EqAscendNode    211.452

	AbsMagn         6.87777
	SlopeParam      7.36384
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.674 0.672)

	Surface
	{
		SurfStyle       0.452907
		OceanStyle      0.899267
		Randomize      (-0.173, -0.890, 0.669)
		colorDistMagn   0.59683
		colorDistFreq   1.38551
		detailScale     1461.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475984
		terraceProb     0.315906
		erosion         0
		montesMagn      0.403485
		montesFreq      2.87167
		montesSpiky     0.884579
		montesFraction  0.498275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.40412
		hillsFraction   0.639795
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220667
		craterFreq      0.24629
		craterDensity   0.959864
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538117
		volcanoTemp     1360.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.270, 0.269, 0.000)
		colorShelf     (0.289, 0.287, 0.286, 0.000)
		colorBeach     (0.306, 0.304, 0.302, 0.000)
		colorDesert    (0.323, 0.320, 0.319, 0.000)
		colorLowland   (0.340, 0.337, 0.336, 0.000)
		colorUpland    (0.357, 0.354, 0.353, 0.000)
		colorRock      (0.374, 0.371, 0.370, 0.000)
		colorSnow      (0.391, 0.388, 0.386, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.971626
		GasToDust   0.25
		Particles   2942
		GasBright   0.190434
		DustBright  0.62119
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.962
		Period          299.091
		Eccentricity    0.975993
		Inclination     -47.1484
		AscendingNode   -22.535
		ArgOfPericenter -121.577
		MeanAnomaly     -111.558
	}
}

Comet	"C46"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.81609e-015
	Radius          0.184513
	InertiaMoment   0.396673

	Oblateness      0.00833534

	RotationPeriod  62.5678
	Obliquity       288.04
	EqAscendNode    196.029

	AbsMagn         1.48848
	SlopeParam      2.48543
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.743 0.725)

	Surface
	{
		SurfStyle       0.264096
		OceanStyle      0.195632
		Randomize      (-0.006, 0.246, 0.126)
		colorDistMagn   0.405155
		colorDistFreq   1.44619e-005
		detailScale     5.03845
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992171
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364019
		terraceProb     0.205281
		erosion         0
		montesMagn      0.442952
		montesFreq      2.9022
		montesSpiky     0.910505
		montesFraction  0.552519
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.79726e-005
		hillsFraction   0.651768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225604
		craterFreq      0.222367
		craterDensity   0.820232
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450333
		volcanoTemp     1485.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.297, 0.290, 0.000)
		colorShelf     (0.330, 0.316, 0.308, 0.000)
		colorBeach     (0.349, 0.334, 0.326, 0.000)
		colorDesert    (0.369, 0.353, 0.344, 0.000)
		colorLowland   (0.388, 0.371, 0.363, 0.000)
		colorUpland    (0.407, 0.390, 0.381, 0.000)
		colorRock      (0.427, 0.408, 0.399, 0.000)
		colorSnow      (0.446, 0.427, 0.417, 1.000)
		BumpHeight      0.166062
		BumpOffset      0.0332124
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0420681
		GasToDust   0.25
		Particles   1064
		GasBright   0.145697
		DustBright  0.350414
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.9599
		Period          242.808
		Eccentricity    0.972302
		Inclination     -89.3429
		AscendingNode   97.3321
		ArgOfPericenter -40.5665
		MeanAnomaly     -170.974
	}
}

Comet	"C47"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.40461e-011
	Radius          3.31471
	InertiaMoment   0.399174

	Oblateness      0.00671787

	RotationPeriod  60.6247
	Obliquity       241.246
	EqAscendNode    180.606

	AbsMagn         10.1724
	SlopeParam      3.15602
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.837 0.787 0.755)

	Surface
	{
		SurfStyle       0.857808
		OceanStyle      0.97083
		Randomize      (0.656, -0.596, -0.198)
		colorDistMagn   0.90502
		colorDistFreq   0.00686427
		detailScale     90.5136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.74172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519466
		terraceProb     0.351532
		erosion         0
		montesMagn      0.517098
		montesFreq      4.42386
		montesSpiky     0.966836
		montesFraction  0.488098
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0188635
		hillsFraction   0.815622
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241559
		craterFreq      0.254589
		craterDensity   0.873196
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45358
		volcanoTemp     1232.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.275, 0.302, 0.050)
		colorShelf     (0.335, 0.323, 0.348, 0.040)
		colorBeach     (0.385, 0.370, 0.393, 0.030)
		colorDesert    (0.435, 0.417, 0.446, 0.020)
		colorLowland   (0.486, 0.464, 0.491, 0.030)
		colorUpland    (0.536, 0.511, 0.536, 0.050)
		colorRock      (0.586, 0.559, 0.597, 0.020)
		colorSnow      (0.586, 0.559, 0.597, 1.000)
		BumpHeight      2.98324
		BumpOffset      0.596648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.52326
		GasToDust   0.25
		Particles   2036
		GasBright   0.34588
		DustBright  0.634717
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.2333
		Period          151.128
		Eccentricity    0.96286
		Inclination     -135.99
		AscendingNode   -122.216
		ArgOfPericenter 24.5921
		MeanAnomaly     171.964
	}
}

Comet	"C48"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.08637e-007
	Radius          72.0752
	InertiaMoment   0.397762

	Oblateness      0.00946881

	RotationPeriod  58.7178
	Obliquity       194.451
	EqAscendNode    165.184

	AbsMagn         6.65898
	SlopeParam      3.74157
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.457 0.454)

	Surface
	{
		SurfStyle       0.625594
		OceanStyle      0.932397
		Randomize      (0.414, -0.693, 0.688)
		colorDistMagn   0.675893
		colorDistFreq   4.34782
		detailScale     1968.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.102172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341717
		terraceProb     0.324878
		erosion         0
		montesMagn      0.546593
		montesFreq      2.5561
		montesSpiky     0.870825
		montesFraction  0.258434
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.7417
		hillsFraction   0.520924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246739
		craterFreq      0.276356
		craterDensity   0.829216
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573245
		volcanoTemp     1420.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.155, 0.127, 0.000)
		colorShelf     (0.185, 0.160, 0.145, 0.000)
		colorBeach     (0.217, 0.187, 0.173, 0.000)
		colorDesert    (0.236, 0.201, 0.168, 0.000)
		colorLowland   (0.259, 0.215, 0.191, 0.000)
		colorUpland    (0.287, 0.260, 0.232, 0.000)
		colorRock      (0.310, 0.283, 0.250, 0.000)
		colorSnow      (0.338, 0.302, 0.263, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.273861
		DustBright  0.391223
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.1567
		Period          236.605
		Eccentricity    0.970999
		Inclination     10.2281
		AscendingNode   -160.593
		ArgOfPericenter -95.1952
		MeanAnomaly     94.128
	}
}

Comet	"C49"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.34499e-015
	Radius          0.205315
	InertiaMoment   0.399613

	Oblateness      0.00763865

	RotationPeriod  56.8404
	Obliquity       147.657
	EqAscendNode    149.761

	AbsMagn         0.53292
	SlopeParam      4.30534
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.563 0.560 0.557)

	Surface
	{
		SurfStyle       0.241145
		OceanStyle      0.443397
		Randomize      (-0.091, 0.647, -0.345)
		colorDistMagn   0.524436
		colorDistFreq   3.69023e-005
		detailScale     5.60646
		colorConversion true
		snowLevel       2
		tropicLatitude  0.704265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459106
		terraceProb     0.195451
		erosion         0
		montesMagn      0.552072
		montesFreq      3.37057
		montesSpiky     0.883172
		montesFraction  0.592341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000116184
		hillsFraction   0.937221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232601
		craterFreq      0.184342
		craterDensity   0.915315
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545518
		volcanoTemp     1183.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.224, 0.223, 0.000)
		colorShelf     (0.239, 0.238, 0.237, 0.000)
		colorBeach     (0.253, 0.252, 0.251, 0.000)
		colorDesert    (0.267, 0.266, 0.265, 0.000)
		colorLowland   (0.281, 0.280, 0.279, 0.000)
		colorUpland    (0.296, 0.294, 0.293, 0.000)
		colorRock      (0.310, 0.308, 0.307, 0.000)
		colorSnow      (0.324, 0.322, 0.320, 1.000)
		BumpHeight      0.184783
		BumpOffset      0.0369566
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0748939
		GasToDust   0.25
		Particles   1131
		GasBright   0.164583
		DustBright  0.184988
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   26.1457
		Period          100.872
		Eccentricity    0.970436
		Inclination     -12.6488
		AscendingNode   12.387
		ArgOfPericenter -161.187
		MeanAnomaly     93.8651
	}
}

Comet	"C50"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.58711e-011
	Radius          4.46223
	InertiaMoment   0.398422

	Oblateness      0.0107858

	RotationPeriod  54.9868
	Obliquity       100.863
	EqAscendNode    134.339

	AbsMagn         9.93432
	SlopeParam      4.89502
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.565 0.504)

	Surface
	{
		SurfStyle       0.214585
		OceanStyle      0.556341
		Randomize      (0.014, 0.252, 0.615)
		colorDistMagn   0.937231
		colorDistFreq   0.00627349
		detailScale     121.849
		colorConversion true
		snowLevel       2
		tropicLatitude  0.809719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378477
		terraceProb     0.381558
		erosion         0
		montesMagn      0.445373
		montesFreq      1.91315
		montesSpiky     0.888702
		montesFraction  0.825978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0539955
		hillsFraction   0.472599
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220945
		craterFreq      0.254257
		craterDensity   0.884393
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532768
		volcanoTemp     1360.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.226, 0.202, 0.000)
		colorShelf     (0.304, 0.240, 0.214, 0.000)
		colorBeach     (0.322, 0.254, 0.227, 0.000)
		colorDesert    (0.340, 0.268, 0.239, 0.000)
		colorLowland   (0.358, 0.283, 0.252, 0.000)
		colorUpland    (0.376, 0.297, 0.265, 0.000)
		colorRock      (0.393, 0.311, 0.277, 0.000)
		colorSnow      (0.411, 0.325, 0.290, 1.000)
		BumpHeight      4.01601
		BumpOffset      0.803202
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.556086
		GasToDust   0.25
		Particles   2103
		GasBright   0.0249045
		DustBright  0.809152
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.3508
		Period          277.647
		Eccentricity    0.957954
		Inclination     147.52
		AscendingNode   144.217
		ArgOfPericenter -167.856
		MeanAnomaly     -98.9313
	}
}

Comet	"C51"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.00095e-007
	Radius          80.2405
	InertiaMoment   0.395072

	Oblateness      0.00857009

	RotationPeriod  53.1516
	Obliquity       54.0686
	EqAscendNode    118.916

	AbsMagn         6.4361
	SlopeParam      5.57717
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.404 0.401 0.398)

	Surface
	{
		SurfStyle       0.867451
		OceanStyle      0.0235266
		Randomize      (0.531, 0.905, 0.152)
		colorDistMagn   0.748961
		colorDistFreq   2.52402
		detailScale     2191.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596156
		terraceProb     0.691498
		erosion         0
		montesMagn      0.509028
		montesFreq      3.11941
		montesSpiky     0.991296
		montesFraction  0.8042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.0589
		hillsFraction   0.594919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221495
		craterFreq      0.280944
		craterDensity   0.639565
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522817
		volcanoTemp     1334.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.137, 0.140, 0.159, 0.050)
		colorShelf     (0.162, 0.165, 0.183, 0.040)
		colorBeach     (0.186, 0.189, 0.207, 0.030)
		colorDesert    (0.210, 0.213, 0.235, 0.020)
		colorLowland   (0.234, 0.237, 0.259, 0.030)
		colorUpland    (0.258, 0.261, 0.283, 0.050)
		colorRock      (0.283, 0.285, 0.315, 0.020)
		colorSnow      (0.283, 0.285, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.046101
		DustBright  0.472443
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.0474
		Period          220.573
		Eccentricity    0.975111
		Inclination     116.647
		AscendingNode   89.1628
		ArgOfPericenter 118.904
		MeanAnomaly     104.319
	}
}

Comet	"C52"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            6.16107e-015
	Radius          0.276266
	InertiaMoment   0.398943

	Oblateness      0.0123585

	RotationPeriod  51.3296
	Obliquity       7.2743
	EqAscendNode    103.493

	AbsMagn         -1.28176
	SlopeParam      6.52817
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.513 0.506)

	Surface
	{
		SurfStyle       0.669815
		OceanStyle      0.627142
		Randomize      (0.814, 0.215, 0.338)
		colorDistMagn   0.947058
		colorDistFreq   4.29362e-005
		detailScale     7.5439
		colorConversion true
		snowLevel       2
		tropicLatitude  0.780061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472073
		terraceProb     0.215011
		erosion         0
		montesMagn      0.559594
		montesFreq      2.58691
		montesSpiky     0.944078
		montesFraction  0.276157
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.06327e-005
		hillsFraction   0.646576
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219941
		craterFreq      0.213589
		craterDensity   0.901867
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.413977
		volcanoTemp     1126.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.142, 0.000)
		colorShelf     (0.207, 0.180, 0.162, 0.000)
		colorBeach     (0.243, 0.210, 0.192, 0.000)
		colorDesert    (0.264, 0.226, 0.187, 0.000)
		colorLowland   (0.290, 0.241, 0.213, 0.000)
		colorUpland    (0.321, 0.292, 0.258, 0.000)
		colorRock      (0.347, 0.318, 0.278, 0.000)
		colorSnow      (0.378, 0.339, 0.294, 1.000)
		BumpHeight      0.248639
		BumpOffset      0.0497279
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.10772
		GasToDust   0.25
		Particles   1197
		GasBright   0.0300383
		DustBright  0.172992
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.0551
		Period          112.122
		Eccentricity    0.944121
		Inclination     136.001
		AscendingNode   -177.392
		ArgOfPericenter 167.061
		MeanAnomaly     143.221
	}
}

Comet	"C53"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.76515e-011
	Radius          4.97012
	InertiaMoment   0.397323

	Oblateness      0.00993725

	RotationPeriod  49.5162
	Obliquity       320.48
	EqAscendNode    88.0709

	AbsMagn         9.70294
	SlopeParam      2.07287
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.642 0.638 0.635)

	Surface
	{
		SurfStyle       0.458081
		OceanStyle      0.937382
		Randomize      (-0.866, 0.528, 0.720)
		colorDistMagn   0.713273
		colorDistFreq   0.0178458
		detailScale     135.717
		colorConversion true
		snowLevel       2
		tropicLatitude  0.868948
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760677
		terraceProb     0.180697
		erosion         0
		montesMagn      0.50032
		montesFreq      3.00117
		montesSpiky     0.88721
		montesFraction  0.518297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0593596
		hillsFraction   0.76693
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236747
		craterFreq      0.274189
		craterDensity   0.911137
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507489
		volcanoTemp     1504.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.255, 0.254, 0.000)
		colorShelf     (0.273, 0.271, 0.270, 0.000)
		colorBeach     (0.289, 0.287, 0.286, 0.000)
		colorDesert    (0.305, 0.303, 0.301, 0.000)
		colorLowland   (0.321, 0.319, 0.317, 0.000)
		colorUpland    (0.337, 0.335, 0.333, 0.000)
		colorRock      (0.353, 0.351, 0.349, 0.000)
		colorSnow      (0.369, 0.367, 0.365, 1.000)
		BumpHeight      4.4731
		BumpOffset      0.894621
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.588912
		GasToDust   0.25
		Particles   2169
		GasBright   0.142313
		DustBright  0.545204
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.7154
		Period          225.61
		Eccentricity    0.949969
		Inclination     -28.6664
		AscendingNode   53.4136
		ArgOfPericenter -122.182
		MeanAnomaly     164.059
	}
}

Comet	"C54"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.6855e-007
	Radius          107.922
	InertiaMoment   0.3994

	Oblateness      0.0142822

	RotationPeriod  47.7066
	Obliquity       273.686
	EqAscendNode    72.6483

	AbsMagn         6.20826
	SlopeParam      2.83258
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.532 0.432 0.308)

	Surface
	{
		SurfStyle       0.542523
		OceanStyle      0.0994822
		Randomize      (-0.434, 0.176, 0.095)
		colorDistMagn   0.443995
		colorDistFreq   7.60213
		detailScale     2946.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536618
		terraceProb     0.199271
		erosion         0
		montesMagn      0.526454
		montesFreq      3.8274
		montesSpiky     0.900594
		montesFraction  0.883681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.3921
		hillsFraction   0.749768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226451
		craterFreq      0.436536
		craterDensity   0.963611
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520035
		volcanoTemp     1073.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.147, 0.086, 0.000)
		colorShelf     (0.213, 0.151, 0.099, 0.000)
		colorBeach     (0.250, 0.177, 0.117, 0.000)
		colorDesert    (0.271, 0.190, 0.114, 0.000)
		colorLowland   (0.298, 0.203, 0.129, 0.000)
		colorUpland    (0.330, 0.246, 0.157, 0.000)
		colorRock      (0.356, 0.268, 0.169, 0.000)
		colorSnow      (0.388, 0.285, 0.179, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0989679
		DustBright  0.273035
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   63.7346
		Period          383.915
		Eccentricity    0.969503
		Inclination     -14.8394
		AscendingNode   177.406
		ArgOfPericenter -120.28
		MeanAnomaly     -73.0989
	}
}

Comet	"C55"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.13479e-014
	Radius          0.307849
	InertiaMoment   0.398122

	Oblateness      0.0115766

	RotationPeriod  45.8962
	Obliquity       226.891
	EqAscendNode    57.2257

	AbsMagn         16.3689
	SlopeParam      3.45066
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.604 0.547)

	Surface
	{
		SurfStyle       0.222569
		OceanStyle      0.302257
		Randomize      (0.589, 0.132, -0.460)
		colorDistMagn   0.380774
		colorDistFreq   4.31038e-005
		detailScale     8.40633
		colorConversion true
		snowLevel       2
		tropicLatitude  0.694695
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536522
		terraceProb     0.562157
		erosion         0
		montesMagn      0.436001
		montesFreq      4.15397
		montesSpiky     0.934371
		montesFraction  0.943548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00022146
		hillsFraction   0.641195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231265
		craterFreq      0.206405
		craterDensity   0.878908
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606056
		volcanoTemp     1478.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.241, 0.219, 0.000)
		colorShelf     (0.273, 0.257, 0.232, 0.000)
		colorBeach     (0.290, 0.272, 0.246, 0.000)
		colorDesert    (0.306, 0.287, 0.260, 0.000)
		colorLowland   (0.322, 0.302, 0.273, 0.000)
		colorUpland    (0.338, 0.317, 0.287, 0.000)
		colorRock      (0.354, 0.332, 0.301, 0.000)
		colorSnow      (0.370, 0.347, 0.314, 1.000)
		BumpHeight      0.277064
		BumpOffset      0.0554128
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.140546
		GasToDust   0.25
		Particles   1263
		GasBright   0.278433
		DustBright  0.578057
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.8279
		Period          189.65
		Eccentricity    0.958009
		Inclination     57.844
		AscendingNode   125.122
		ArgOfPericenter 68.1063
		MeanAnomaly     -77.7318
	}
}

Comet	"C56"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            8.77681e-011
	Radius          6.6819
	InertiaMoment   0.399828

	Oblateness      0.0166988

	RotationPeriod  44.0805
	Obliquity       180.097
	EqAscendNode    41.8031

	AbsMagn         9.47713
	SlopeParam      4.01936
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.777 0.775 0.773)

	Surface
	{
		SurfStyle       0.181952
		OceanStyle      0.833664
		Randomize      (-0.476, -0.414, 0.252)
		colorDistMagn   0.478583
		colorDistFreq   0.012784
		detailScale     182.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431038
		terraceProb     0.103567
		erosion         0
		montesMagn      0.497852
		montesFreq      3.66638
		montesSpiky     0.886557
		montesFraction  0.726033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.070408
		hillsFraction   0.491709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201374
		craterFreq      0.262444
		craterDensity   0.877134
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463682
		volcanoTemp     1500.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.330, 0.330, 0.328, 0.000)
		colorBeach     (0.350, 0.349, 0.348, 0.000)
		colorDesert    (0.369, 0.368, 0.367, 0.000)
		colorLowland   (0.389, 0.388, 0.386, 0.000)
		colorUpland    (0.408, 0.407, 0.406, 0.000)
		colorRock      (0.427, 0.426, 0.425, 0.000)
		colorSnow      (0.447, 0.446, 0.444, 1.000)
		BumpHeight      6.01371
		BumpOffset      1.20274
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.621738
		GasToDust   0.25
		Particles   2235
		GasBright   0.207806
		DustBright  0.333171
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.8167
		Period          449.651
		Eccentricity    0.978719
		Inclination     53.0807
		AscendingNode   146.94
		ArgOfPericenter -49.4566
		MeanAnomaly     -134.495
	}
}

Comet	"C57"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            6.78822e-007
	Radius          120.312
	InertiaMoment   0.398697

	Oblateness      0.0136581

	RotationPeriod  42.2548
	Obliquity       133.303
	EqAscendNode    26.3805

	AbsMagn         5.97444
	SlopeParam      4.58966
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.760 0.757)

	Surface
	{
		SurfStyle       0.834155
		OceanStyle      0.889483
		Randomize      (-0.120, -0.596, -0.754)
		colorDistMagn   0.320988
		colorDistFreq   6.33305
		detailScale     3285.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378636
		terraceProb     0.532917
		erosion         0
		montesMagn      0.614411
		montesFreq      3.54685
		montesSpiky     0.879427
		montesFraction  0.586726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.9852
		hillsFraction   0.669864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226375
		craterFreq      0.509888
		craterDensity   0.800454
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562547
		volcanoTemp     1431.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.258, 0.212, 0.000)
		colorShelf     (0.305, 0.266, 0.242, 0.000)
		colorBeach     (0.359, 0.312, 0.288, 0.000)
		colorDesert    (0.390, 0.334, 0.280, 0.000)
		colorLowland   (0.428, 0.357, 0.318, 0.000)
		colorUpland    (0.474, 0.433, 0.386, 0.000)
		colorRock      (0.512, 0.471, 0.417, 0.000)
		colorSnow      (0.558, 0.501, 0.439, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		DustBright  0.125543
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.0784
		Period          251.534
		Eccentricity    0.956224
		Inclination     -146.568
		AscendingNode   -131.283
		ArgOfPericenter 128.861
		MeanAnomaly     -93.0318
	}
}

Comet	"C58"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.09014e-014
	Radius          0.41371
	InertiaMoment   0.396694

	Oblateness      0.0195685

	RotationPeriod  40.4142
	Obliquity       86.5085
	EqAscendNode    10.9579

	AbsMagn         15.0488
	SlopeParam      5.21364
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.726 0.698)

	Surface
	{
		SurfStyle       0.536148
		OceanStyle      0.278556
		Randomize      (-0.929, -0.493, -0.068)
		colorDistMagn   0.790429
		colorDistFreq   0.000138344
		detailScale     11.2971
		colorConversion true
		snowLevel       2
		tropicLatitude  0.846778
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544357
		terraceProb     0.26512
		erosion         0
		montesMagn      0.489949
		montesFreq      2.1987
		montesSpiky     0.943603
		montesFraction  0.712507
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000291994
		hillsFraction   0.786798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213818
		craterFreq      0.268338
		craterDensity   0.905652
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441748
		volcanoTemp     1296.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.247, 0.195, 0.000)
		colorShelf     (0.312, 0.254, 0.223, 0.000)
		colorBeach     (0.366, 0.298, 0.265, 0.000)
		colorDesert    (0.397, 0.319, 0.258, 0.000)
		colorLowland   (0.436, 0.341, 0.293, 0.000)
		colorUpland    (0.483, 0.414, 0.356, 0.000)
		colorRock      (0.522, 0.450, 0.384, 0.000)
		colorSnow      (0.569, 0.479, 0.405, 1.000)
		BumpHeight      0.372339
		BumpOffset      0.0744679
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.173372
		GasToDust   0.25
		Particles   1330
		GasBright   0.00157714
		DustBright  0.708372
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.1335
		Period          157.128
		Eccentricity    0.960595
		Inclination     -38.4803
		AscendingNode   -158.944
		ArgOfPericenter 18.4097
		MeanAnomaly     -93.8447
	}
}

Comet	"C59"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.61658e-010
	Radius          7.45206
	InertiaMoment   0.39918

	Oblateness      0.0164009

	RotationPeriod  38.5535
	Obliquity       39.7142
	EqAscendNode    355.535

	AbsMagn         9.25593
	SlopeParam      5.98967
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.473 0.469)

	Surface
	{
		SurfStyle       0.0917889
		OceanStyle      0.116226
		Randomize      (0.828, 0.292, -0.978)
		colorDistMagn   0.609243
		colorDistFreq   0.0168981
		detailScale     203.491
		colorConversion true
		snowLevel       2
		tropicLatitude  0.794178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52483
		terraceProb     0.235827
		erosion         0
		montesMagn      0.425488
		montesFreq      2.57068
		montesSpiky     0.841865
		montesFraction  0.795097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.156938
		hillsFraction   0.801503
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263195
		craterFreq      0.255285
		craterDensity   0.906551
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526538
		volcanoTemp     1557.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.189, 0.188, 0.000)
		colorShelf     (0.202, 0.201, 0.199, 0.000)
		colorBeach     (0.214, 0.213, 0.211, 0.000)
		colorDesert    (0.226, 0.225, 0.223, 0.000)
		colorLowland   (0.237, 0.236, 0.234, 0.000)
		colorUpland    (0.249, 0.248, 0.246, 0.000)
		colorRock      (0.261, 0.260, 0.258, 0.000)
		colorSnow      (0.273, 0.272, 0.270, 1.000)
		BumpHeight      6.70685
		BumpOffset      1.34137
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.654564
		GasToDust   0.25
		Particles   2302
		GasBright   0.0241658
		DustBright  0.37027
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.2507
		Period          199.902
		Eccentricity    0.945222
		Inclination     152.505
		AscendingNode   -104.662
		ArgOfPericenter -44.8255
		MeanAnomaly     127.913
	}
}

Comet	"C60"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.97756e-018
	Radius          0.0256154
	InertiaMoment   0.397772

	Oblateness      0.0237902

	RotationPeriod  36.6672
	Obliquity       352.92
	EqAscendNode    340.113

	AbsMagn         5.73348
	SlopeParam      7.33251
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.757 0.755)

	Surface
	{
		SurfStyle       0.506374
		OceanStyle      0.062319
		Randomize      (-0.519, -0.738, 0.966)
		colorDistMagn   0.58736
		colorDistFreq   3.96054e-007
		detailScale     0.69947
		colorConversion true
		snowLevel       2
		tropicLatitude  0.850306
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528459
		terraceProb     0.521993
		erosion         0
		montesMagn      0.455449
		montesFreq      2.81835
		montesSpiky     0.969411
		montesFraction  0.455778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61736e-006
		hillsFraction   0.842705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219578
		craterFreq      0.26895
		craterDensity   0.837552
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532112
		volcanoTemp     1454.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.258, 0.211, 0.000)
		colorShelf     (0.304, 0.265, 0.242, 0.000)
		colorBeach     (0.357, 0.311, 0.287, 0.000)
		colorDesert    (0.387, 0.333, 0.279, 0.000)
		colorLowland   (0.425, 0.356, 0.317, 0.000)
		colorUpland    (0.471, 0.432, 0.385, 0.000)
		colorRock      (0.509, 0.470, 0.415, 0.000)
		colorSnow      (0.554, 0.500, 0.438, 1.000)
		BumpHeight      0.0230538
		BumpOffset      0.00461077
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.105745
		DustBright  0.773178
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.8901
		Period          250.058
		Eccentricity    0.93924
		Inclination     -126.512
		AscendingNode   -130.371
		ArgOfPericenter 91.362
		MeanAnomaly     -31.1649
	}
}

Comet	"C61"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.84978e-014
	Radius          0.461576
	InertiaMoment   0.399619

	Oblateness      0.020178

	RotationPeriod  34.7492
	Obliquity       306.126
	EqAscendNode    324.69

	AbsMagn         14.2249
	SlopeParam      2.47513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.487 0.481 0.474)

	Surface
	{
		SurfStyle       0.539245
		OceanStyle      0.471875
		Randomize      (0.975, -0.643, -0.755)
		colorDistMagn   0.0722612
		colorDistFreq   0.000129862
		detailScale     12.6041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.813998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35397
		terraceProb     0.433578
		erosion         0
		montesMagn      0.520399
		montesFreq      1.89676
		montesSpiky     0.877958
		montesFraction  0.513236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000281015
		hillsFraction   0.613703
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214278
		craterFreq      0.21952
		craterDensity   0.84617
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559619
		volcanoTemp     1843.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.164, 0.133, 0.000)
		colorShelf     (0.195, 0.168, 0.152, 0.000)
		colorBeach     (0.229, 0.197, 0.180, 0.000)
		colorDesert    (0.248, 0.212, 0.175, 0.000)
		colorLowland   (0.273, 0.226, 0.199, 0.000)
		colorUpland    (0.302, 0.274, 0.242, 0.000)
		colorRock      (0.326, 0.298, 0.261, 0.000)
		colorSnow      (0.355, 0.318, 0.275, 1.000)
		BumpHeight      0.415419
		BumpOffset      0.0830837
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.206198
		GasToDust   0.25
		Particles   1396
		GasBright   0.101052
		DustBright  0.462358
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.6473
		Period          304.807
		Eccentricity    0.970259
		Inclination     -144.555
		AscendingNode   77.6018
		ArgOfPericenter 90.091
		MeanAnomaly     51.979
	}
}

Comet	"C62"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.97753e-010
	Radius          10.0072
	InertiaMoment   0.39843

	Oblateness      0.0297205

	RotationPeriod  32.7929
	Obliquity       259.331
	EqAscendNode    309.268

	AbsMagn         9.03851
	SlopeParam      3.14758
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.444 0.441 0.438)

	Surface
	{
		SurfStyle       0.642847
		OceanStyle      0.668786
		Randomize      (0.579, 0.844, 0.994)
		colorDistMagn   0.338498
		colorDistFreq   0.0674032
		detailScale     273.262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409375
		terraceProb     0.440855
		erosion         0
		montesMagn      0.52088
		montesFreq      3.16654
		montesSpiky     0.914736
		montesFraction  0.447526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.259821
		hillsFraction   0.711001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245522
		craterFreq      0.151987
		craterDensity   0.972111
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44657
		volcanoTemp     1537.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.150, 0.123, 0.000)
		colorShelf     (0.178, 0.154, 0.140, 0.000)
		colorBeach     (0.209, 0.181, 0.166, 0.000)
		colorDesert    (0.227, 0.194, 0.162, 0.000)
		colorLowland   (0.249, 0.207, 0.184, 0.000)
		colorUpland    (0.275, 0.252, 0.223, 0.000)
		colorRock      (0.298, 0.274, 0.241, 0.000)
		colorSnow      (0.324, 0.291, 0.254, 1.000)
		BumpHeight      9.00645
		BumpOffset      1.80129
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.68739
		GasToDust   0.25
		Particles   2368
		GasBright   0.059099
		DustBright  0.188797
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.3503
		Period          186.249
		Eccentricity    0.971877
		Inclination     173.326
		AscendingNode   63.5838
		ArgOfPericenter 119.809
		MeanAnomaly     158.034
	}
}

Comet	"C63"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            9.16805e-018
	Radius          0.0285897
	InertiaMoment   0.395175

	Oblateness      0.0252205

	RotationPeriod  30.7906
	Obliquity       212.537
	EqAscendNode    293.845

	AbsMagn         5.484
	SlopeParam      3.73378
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.719 0.669)

	Surface
	{
		SurfStyle       0.910601
		OceanStyle      0.866927
		Randomize      (0.212, 0.694, 0.656)
		colorDistMagn   0.553785
		colorDistFreq   6.04674e-007
		detailScale     0.780688
		colorConversion true
		snowLevel       2
		tropicLatitude  0.34261
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641707
		terraceProb     0.516561
		erosion         0
		montesMagn      0.252504
		montesFreq      3.44218
		montesSpiky     0.857875
		montesFraction  0.656576
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01664e-006
		hillsFraction   0.524974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219315
		craterFreq      0.21122
		craterDensity   1.02158
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472517
		volcanoTemp     1169.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.252, 0.268, 0.050)
		colorShelf     (0.312, 0.295, 0.308, 0.040)
		colorBeach     (0.359, 0.338, 0.348, 0.030)
		colorDesert    (0.406, 0.381, 0.395, 0.020)
		colorLowland   (0.453, 0.424, 0.435, 0.030)
		colorUpland    (0.500, 0.468, 0.475, 0.050)
		colorRock      (0.547, 0.511, 0.528, 0.020)
		colorSnow      (0.547, 0.511, 0.528, 1.000)
		BumpHeight      0.0257307
		BumpOffset      0.00514614
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.217845
		DustBright  0.514537
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.6398
		Period          134.283
		Eccentricity    0.951492
		Inclination     159.945
		AscendingNode   36.8685
		ArgOfPericenter 139.059
		MeanAnomaly     -48.9473
	}
}

Comet	"C64"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            7.09083e-014
	Radius          0.619624
	InertiaMoment   0.398949

	Oblateness      0.0386631

	RotationPeriod  28.7335
	Obliquity       165.743
	EqAscendNode    278.422

	AbsMagn         13.6033
	SlopeParam      4.29753
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.472 0.470)

	Surface
	{
		SurfStyle       0.282986
		OceanStyle      0.952541
		Randomize      (-0.450, 0.721, -0.872)
		colorDistMagn   0.512809
		colorDistFreq   0.000193958
		detailScale     16.9199
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997843
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416478
		terraceProb     0.242778
		erosion         0
		montesMagn      0.614929
		montesFreq      3.25492
		montesSpiky     0.992393
		montesFraction  0.901474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00120071
		hillsFraction   0.730271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2759
		craterFreq      0.231357
		craterDensity   0.827571
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498811
		volcanoTemp     1481.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.189, 0.188, 0.000)
		colorShelf     (0.202, 0.201, 0.200, 0.000)
		colorBeach     (0.214, 0.213, 0.211, 0.000)
		colorDesert    (0.226, 0.224, 0.223, 0.000)
		colorLowland   (0.238, 0.236, 0.235, 0.000)
		colorUpland    (0.249, 0.248, 0.247, 0.000)
		colorRock      (0.261, 0.260, 0.258, 0.000)
		colorSnow      (0.273, 0.272, 0.270, 1.000)
		BumpHeight      0.557662
		BumpOffset      0.111532
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.239024
		GasToDust   0.25
		Particles   1462
		GasBright   0.148611
		DustBright  0.268258
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.0982
		Period          334.13
		Eccentricity    0.96034
		Inclination     -90.7158
		AscendingNode   108.407
		ArgOfPericenter -47.7729
		MeanAnomaly     -173.115
	}
}

Comet	"C65"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.48424e-010
	Radius          11.1731
	InertiaMoment   0.397336

	Oblateness      0.0339644

	RotationPeriod  26.6114
	Obliquity       118.948
	EqAscendNode    263

	AbsMagn         8.82412
	SlopeParam      4.8865
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.554 0.397)

	Surface
	{
		SurfStyle       0.252801
		OceanStyle      0.651079
		Randomize      (-0.288, 0.697, 0.731)
		colorDistMagn   0.33397
		colorDistFreq   0.0689084
		detailScale     305.099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.876768
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352625
		terraceProb     0.14142
		erosion         0
		montesMagn      0.295572
		montesFreq      3.20463
		montesSpiky     0.97186
		montesFraction  0.769402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.261892
		hillsFraction   0.472318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206455
		craterFreq      0.185748
		craterDensity   0.874763
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483658
		volcanoTemp     1341.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.221, 0.159, 0.000)
		colorShelf     (0.273, 0.235, 0.169, 0.000)
		colorBeach     (0.290, 0.249, 0.178, 0.000)
		colorDesert    (0.306, 0.263, 0.188, 0.000)
		colorLowland   (0.322, 0.277, 0.198, 0.000)
		colorUpland    (0.338, 0.291, 0.208, 0.000)
		colorRock      (0.354, 0.304, 0.218, 0.000)
		colorSnow      (0.370, 0.318, 0.228, 1.000)
		BumpHeight      10.0558
		BumpOffset      2.01115
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.720216
		GasToDust   0.25
		Particles   2434
		GasBright   0.374548
		DustBright  0.526808
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.522
		Period          194.629
		Eccentricity    0.957637
		Inclination     -45.167
		AscendingNode   103.006
		ArgOfPericenter 86.8853
		MeanAnomaly     22.425
	}
}

Comet	"C66"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.68864e-017
	Radius          0.0383664
	InertiaMoment   0.399406

	Oblateness      0.0534845

	RotationPeriod  24.4123
	Obliquity       72.1541
	EqAscendNode    247.577

	AbsMagn         5.22432
	SlopeParam      5.56667
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.455 0.451)

	Surface
	{
		SurfStyle       0.773426
		OceanStyle      0.766252
		Randomize      (0.277, -0.541, 0.281)
		colorDistMagn   0.282541
		colorDistFreq   9.82142e-007
		detailScale     1.04766
		colorConversion true
		snowLevel       2
		tropicLatitude  0.900541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335466
		terraceProb     0.180137
		erosion         0
		montesMagn      0.527627
		montesFreq      3.01288
		montesSpiky     0.801536
		montesFraction  0.414271
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.8924e-006
		hillsFraction   0.605705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278133
		craterFreq      0.183888
		craterDensity   1.09778
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454787
		volcanoTemp     1639.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.126, 0.000)
		colorShelf     (0.184, 0.159, 0.144, 0.000)
		colorBeach     (0.216, 0.187, 0.171, 0.000)
		colorDesert    (0.234, 0.200, 0.167, 0.000)
		colorLowland   (0.257, 0.214, 0.190, 0.000)
		colorUpland    (0.285, 0.259, 0.230, 0.000)
		colorRock      (0.308, 0.282, 0.248, 0.000)
		colorSnow      (0.335, 0.300, 0.262, 1.000)
		BumpHeight      0.0345298
		BumpOffset      0.00690596
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.278031
		DustBright  0.307811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   42.9786
		Period          212.594
		Eccentricity    0.960416
		Inclination     118.598
		AscendingNode   -69.8368
		ArgOfPericenter 33.3663
		MeanAnomaly     173.809
	}
}

Comet	"C67"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.30604e-013
	Radius          0.692046
	InertiaMoment   0.39813

	Oblateness      0.0491899

	RotationPeriod  22.1214
	Obliquity       25.3598
	EqAscendNode    232.155

	AbsMagn         13.0935
	SlopeParam      6.5111
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.789 0.787 0.786)

	Surface
	{
		SurfStyle       0.752759
		OceanStyle      0.845079
		Randomize      (0.564, -0.507, -0.413)
		colorDistMagn   0.324444
		colorDistFreq   0.00017813
		detailScale     18.8975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667123
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585004
		terraceProb     0.35559
		erosion         0
		montesMagn      0.492673
		montesFreq      3.00008
		montesSpiky     0.814699
		montesFraction  0.373842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00117602
		hillsFraction   0.618441
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22838
		craterFreq      0.184251
		craterDensity   0.961494
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524941
		volcanoTemp     1346.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.268, 0.220, 0.000)
		colorShelf     (0.316, 0.276, 0.252, 0.000)
		colorBeach     (0.371, 0.323, 0.299, 0.000)
		colorDesert    (0.402, 0.346, 0.291, 0.000)
		colorLowland   (0.442, 0.370, 0.330, 0.000)
		colorUpland    (0.489, 0.449, 0.401, 0.000)
		colorRock      (0.529, 0.488, 0.432, 0.000)
		colorSnow      (0.576, 0.520, 0.456, 1.000)
		BumpHeight      0.622842
		BumpOffset      0.124568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.27185
		GasToDust   0.25
		Particles   1528
		GasBright   0.00909082
		DustBright  0.261238
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.9089
		Period          250.205
		Eccentricity    0.953774
		Inclination     56.3978
		AscendingNode   -133.344
		ArgOfPericenter -162.813
		MeanAnomaly     161.68
	}
}

Comet	"C68"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.01013e-009
	Radius          14.9893
	InertiaMoment   0.399833

	Oblateness      0.0818375

	RotationPeriod  19.7205
	Obliquity       338.566
	EqAscendNode    216.732

	AbsMagn         8.61207
	SlopeParam      2.06056
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.479 0.397 0.322)

	Surface
	{
		SurfStyle       0.746117
		OceanStyle      0.75215
		Randomize      (-0.992, -0.246, 0.013)
		colorDistMagn   0.267801
		colorDistFreq   0.193136
		detailScale     409.307
		colorConversion true
		snowLevel       2
		tropicLatitude  0.113349
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408737
		terraceProb     0.1812
		erosion         0
		montesMagn      0.568567
		montesFreq      2.83921
		montesSpiky     0.857364
		montesFraction  0.143991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.386252
		hillsFraction   0.476737
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24085
		craterFreq      0.257043
		craterDensity   0.898989
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502836
		volcanoTemp     1659.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.135, 0.090, 0.000)
		colorShelf     (0.192, 0.139, 0.103, 0.000)
		colorBeach     (0.225, 0.163, 0.122, 0.000)
		colorDesert    (0.244, 0.175, 0.119, 0.000)
		colorLowland   (0.268, 0.187, 0.135, 0.000)
		colorUpland    (0.297, 0.226, 0.164, 0.000)
		colorRock      (0.321, 0.246, 0.177, 0.000)
		colorSnow      (0.350, 0.262, 0.187, 1.000)
		BumpHeight      13.4903
		BumpOffset      2.69807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.753042
		GasToDust   0.25
		Particles   2501
		GasBright   0.0699518
		DustBright  0.684864
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.9501
		Period          258.406
		Eccentricity    0.945387
		Inclination     155.07
		AscendingNode   -165.987
		ArgOfPericenter -35.0492
		MeanAnomaly     -68.3494
	}
}

Comet	"C69"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.11026e-017
	Radius          0.0428643
	InertiaMoment   0.398704

	Oblateness      0.0814878

	RotationPeriod  17.1867
	Obliquity       291.771
	EqAscendNode    201.309

	AbsMagn         4.95238
	SlopeParam      2.82342
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.555 0.548 0.544)

	Surface
	{
		SurfStyle       0.981045
		OceanStyle      0.530307
		Randomize      (0.244, 0.875, -0.549)
		colorDistMagn   0.454512
		colorDistFreq   1.05926e-006
		detailScale     1.17048
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993372
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395298
		terraceProb     0.43104
		erosion         0
		montesMagn      0.408623
		montesFreq      3.44583
		montesSpiky     0.877472
		montesFraction  0.652307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.94022e-006
		hillsFraction   0.625003
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.289323
		craterFreq      0.219188
		craterDensity   0.955031
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533724
		volcanoTemp     1288.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.192, 0.218, 0.050)
		colorShelf     (0.222, 0.224, 0.250, 0.040)
		colorBeach     (0.255, 0.257, 0.283, 0.030)
		colorDesert    (0.288, 0.290, 0.321, 0.020)
		colorLowland   (0.322, 0.323, 0.354, 0.030)
		colorUpland    (0.355, 0.356, 0.386, 0.050)
		colorRock      (0.388, 0.389, 0.430, 0.020)
		colorSnow      (0.388, 0.389, 0.430, 1.000)
		BumpHeight      0.0385779
		BumpOffset      0.00771557
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0666506
		DustBright  0.372651
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.8325
		Period          298.015
		Eccentricity    0.957341
		Inclination     87.2219
		AscendingNode   83.9994
		ArgOfPericenter -145.653
		MeanAnomaly     28.0847
	}
}

Comet	"C70"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.40556e-013
	Radius          0.928142
	InertiaMoment   0.396714

	Oblateness      0.149358

	RotationPeriod  14.4901
	Obliquity       244.977
	EqAscendNode    185.887

	AbsMagn         12.6552
	SlopeParam      3.44264
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.732 0.726 0.724)

	Surface
	{
		SurfStyle       0.599524
		OceanStyle      0.198155
		Randomize      (0.418, 0.285, 0.859)
		colorDistMagn   0.991064
		colorDistFreq   0.000663384
		detailScale     25.3445
		colorConversion true
		snowLevel       2
		tropicLatitude  0.752313
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581024
		terraceProb     0.652745
		erosion         0
		montesMagn      0.440897
		montesFreq      3.23211
		montesSpiky     0.972015
		montesFraction  0.618694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00223405
		hillsFraction   0.610921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262236
		craterFreq      0.240127
		craterDensity   1.0591
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49702
		volcanoTemp     1413.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.247, 0.203, 0.000)
		colorShelf     (0.293, 0.254, 0.232, 0.000)
		colorBeach     (0.344, 0.298, 0.275, 0.000)
		colorDesert    (0.373, 0.320, 0.268, 0.000)
		colorLowland   (0.410, 0.341, 0.304, 0.000)
		colorUpland    (0.454, 0.414, 0.369, 0.000)
		colorRock      (0.490, 0.450, 0.398, 0.000)
		colorSnow      (0.534, 0.479, 0.420, 1.000)
		BumpHeight      0.835328
		BumpOffset      0.167066
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.304675
		GasToDust   0.25
		Particles   1595
		GasBright   0.194702
		DustBright  0.729087
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.9425
		Period          197.667
		Eccentricity    0.953618
		Inclination     -20.8568
		AscendingNode   35.226
		ArgOfPericenter -31.117
		MeanAnomaly     -10.6767
	}
}

Comet	"C71"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.86053e-009
	Radius          16.7515
	InertiaMoment   0.399186

	Oblateness      0.179082

	RotationPeriod  11.591
	Obliquity       198.183
	EqAscendNode    170.464

	AbsMagn         8.40173
	SlopeParam      4.01164
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.679 0.629)

	Surface
	{
		SurfStyle       0.269065
		OceanStyle      0.903536
		Randomize      (0.924, -0.450, -0.326)
		colorDistMagn   0.910214
		colorDistFreq   0.246683
		detailScale     457.428
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966935
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307114
		terraceProb     0.330232
		erosion         0
		montesMagn      0.475735
		montesFreq      2.51676
		montesSpiky     0.976376
		montesFraction  0.534885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.633364
		hillsFraction   0.665727
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253787
		craterFreq      0.25933
		craterDensity   0.948607
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55534
		volcanoTemp     1366.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.272, 0.252, 0.000)
		colorShelf     (0.308, 0.289, 0.267, 0.000)
		colorBeach     (0.326, 0.306, 0.283, 0.000)
		colorDesert    (0.344, 0.323, 0.299, 0.000)
		colorLowland   (0.363, 0.339, 0.315, 0.000)
		colorUpland    (0.381, 0.356, 0.330, 0.000)
		colorRock      (0.399, 0.373, 0.346, 0.000)
		colorSnow      (0.417, 0.390, 0.362, 1.000)
		BumpHeight      15.0764
		BumpOffset      3.01528
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.785867
		GasToDust   0.25
		Particles   2567
		GasBright   0.164119
		DustBright  0.444156
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.7511
		Period          233.493
		Eccentricity    0.962148
		Inclination     -122.493
		AscendingNode   14.0236
		ArgOfPericenter 27.9632
		MeanAnomaly     122.483
	}
}

Comet	"C72"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.72871e-017
	Radius          0.0574718
	InertiaMoment   0.397782

	Oblateness      0.249

	RotationPeriod  8.43427
	Obliquity       151.388
	EqAscendNode    155.042

	AbsMagn         4.66555
	SlopeParam      4.58161
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.630 0.606)

	Surface
	{
		SurfStyle       0.930637
		OceanStyle      0.0906104
		Randomize      (0.958, 0.257, -0.521)
		colorDistMagn   0.257761
		colorDistFreq   2.66163e-006
		detailScale     1.56936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927749
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525087
		terraceProb     0.168381
		erosion         0
		montesMagn      0.501836
		montesFreq      2.55226
		montesSpiky     0.94944
		montesFraction  0.597328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.22464e-006
		hillsFraction   0.513206
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237914
		craterFreq      0.190889
		craterDensity   0.722807
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499233
		volcanoTemp     1255.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.220, 0.242, 0.050)
		colorShelf     (0.279, 0.258, 0.279, 0.040)
		colorBeach     (0.321, 0.296, 0.315, 0.030)
		colorDesert    (0.363, 0.334, 0.357, 0.020)
		colorLowland   (0.405, 0.372, 0.394, 0.030)
		colorUpland    (0.446, 0.409, 0.430, 0.050)
		colorRock      (0.488, 0.447, 0.479, 0.020)
		colorSnow      (0.488, 0.447, 0.479, 1.000)
		BumpHeight      0.0517246
		BumpOffset      0.0103449
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0962761
		DustBright  0.196485
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.6631
		Period          167.5
		Eccentricity    0.961776
		Inclination     130.484
		AscendingNode   -57.3032
		ArgOfPericenter -147.053
		MeanAnomaly     25.9472
	}
}

Comet	"C73"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.43075e-013
	Radius          1.03756
	InertiaMoment   0.399624

	Oblateness      0.249

	RotationPeriod  4.9397
	Obliquity       104.594
	EqAscendNode    139.619

	AbsMagn         12.2667
	SlopeParam      5.20438
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.688 0.685 0.683)

	Surface
	{
		SurfStyle       0.574363
		OceanStyle      0.294348
		Randomize      (0.664, -0.855, 0.488)
		colorDistMagn   0.166605
		colorDistFreq   0.000101628
		detailScale     28.3322
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967511
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541995
		terraceProb     0.29
		erosion         0
		montesMagn      0.571058
		montesFreq      3.84788
		montesSpiky     0.862159
		montesFraction  0.588333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00286058
		hillsFraction   0.612878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223675
		craterFreq      0.206026
		craterDensity   0.966009
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459395
		volcanoTemp     1581.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.233, 0.191, 0.000)
		colorShelf     (0.275, 0.240, 0.218, 0.000)
		colorBeach     (0.323, 0.281, 0.259, 0.000)
		colorDesert    (0.351, 0.302, 0.253, 0.000)
		colorLowland   (0.385, 0.322, 0.287, 0.000)
		colorUpland    (0.427, 0.391, 0.348, 0.000)
		colorRock      (0.461, 0.425, 0.376, 0.000)
		colorSnow      (0.502, 0.452, 0.396, 1.000)
		BumpHeight      0.9338
		BumpOffset      0.18676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.337501
		GasToDust   0.25
		Particles   1661
		GasBright   0.301495
		DustBright  0.475753
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.9629
		Period          307.451
		Eccentricity    0.969037
		Inclination     -11.0986
		AscendingNode   -91.7142
		ArgOfPericenter -0.194318
		MeanAnomaly     -82.3182
	}
}

Comet	"C74"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.42686e-009
	Radius          22.4543
	InertiaMoment   0.398437

	Oblateness      0.00167836

	RotationPeriod  136.721
	Obliquity       57.7998
	EqAscendNode    124.196

	AbsMagn         8.19249
	SlopeParam      5.97706
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.504 0.502)

	Surface
	{
		SurfStyle       0.734832
		OceanStyle      0.922346
		Randomize      (-0.680, 0.832, 0.011)
		colorDistMagn   0.77915
		colorDistFreq   0.238936
		detailScale     613.153
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464844
		terraceProb     0.317685
		erosion         0
		montesMagn      0.398424
		montesFreq      2.61222
		montesSpiky     0.94
		montesFraction  0.632816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19826
		hillsFraction   0.517512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224285
		craterFreq      0.243959
		craterDensity   0.820429
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606637
		volcanoTemp     991.096
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.171, 0.140, 0.000)
		colorShelf     (0.203, 0.176, 0.161, 0.000)
		colorBeach     (0.239, 0.207, 0.191, 0.000)
		colorDesert    (0.259, 0.222, 0.186, 0.000)
		colorLowland   (0.284, 0.237, 0.211, 0.000)
		colorUpland    (0.315, 0.287, 0.256, 0.000)
		colorRock      (0.340, 0.312, 0.276, 0.000)
		colorSnow      (0.370, 0.333, 0.291, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.818693
		GasToDust   0.25
		Particles   2633
		GasBright   0.20637
		DustBright  0.255364
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.3734
		Period          223.026
		Eccentricity    0.953853
		Inclination     103.057
		AscendingNode   74.9618
		ArgOfPericenter 159.011
		MeanAnomaly     117.491
	}
}

Comet	"C75"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.05515e-016
	Radius          0.0642637
	InertiaMoment   0.395266

	Oblateness      0.00171197

	RotationPeriod  117.418
	Obliquity       11.0055
	EqAscendNode    108.774

	AbsMagn         4.36046
	SlopeParam      7.30198
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.833 0.794 0.767)

	Surface
	{
		SurfStyle       0.271652
		OceanStyle      0.0218067
		Randomize      (-0.091, -0.679, -0.548)
		colorDistMagn   0.328073
		colorDistFreq   2.01e-006
		detailScale     1.75483
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930212
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.271402
		terraceProb     0.314844
		erosion         0
		montesMagn      0.574642
		montesFreq      3.39147
		montesSpiky     0.943002
		montesFraction  0.569583
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.22477e-005
		hillsFraction   0.607395
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267442
		craterFreq      0.148822
		craterDensity   0.86891
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532048
		volcanoTemp     1590.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.318, 0.307, 0.000)
		colorShelf     (0.354, 0.338, 0.326, 0.000)
		colorBeach     (0.375, 0.358, 0.345, 0.000)
		colorDesert    (0.396, 0.377, 0.364, 0.000)
		colorLowland   (0.416, 0.397, 0.383, 0.000)
		colorUpland    (0.437, 0.417, 0.403, 0.000)
		colorRock      (0.458, 0.437, 0.422, 0.000)
		colorSnow      (0.479, 0.457, 0.441, 1.000)
		BumpHeight      0.0578373
		BumpOffset      0.0115675
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00566863
		DustBright  0.940553
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   36.6875
		Period          167.667
		Eccentricity    0.928682
		Inclination     -79.1688
		AscendingNode   13.1796
		ArgOfPericenter -126.733
		MeanAnomaly     -118.654
	}
}

Comet	"C76"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            8.16088e-013
	Radius          1.39043
	InertiaMoment   0.398955

	Oblateness      0.00267194

	RotationPeriod  108.303
	Obliquity       324.211
	EqAscendNode    93.3513

	AbsMagn         11.9147
	SlopeParam      2.46479
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.674 0.672)

	Surface
	{
		SurfStyle       0.300925
		OceanStyle      0.74935
		Randomize      (-0.429, 0.912, 0.534)
		colorDistMagn   0.668411
		colorDistFreq   0.000942697
		detailScale     37.9681
		colorConversion true
		snowLevel       2
		tropicLatitude  0.468929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637145
		terraceProb     0.232309
		erosion         0
		montesMagn      0.473868
		montesFreq      3.73847
		montesSpiky     0.852061
		montesFraction  0.305698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00301568
		hillsFraction   0.532268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253022
		craterFreq      0.270625
		craterDensity   0.767331
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.597277
		volcanoTemp     1618.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.270, 0.269, 0.000)
		colorShelf     (0.289, 0.287, 0.286, 0.000)
		colorBeach     (0.306, 0.304, 0.303, 0.000)
		colorDesert    (0.323, 0.320, 0.319, 0.000)
		colorLowland   (0.341, 0.337, 0.336, 0.000)
		colorUpland    (0.358, 0.354, 0.353, 0.000)
		colorRock      (0.375, 0.371, 0.370, 0.000)
		colorSnow      (0.392, 0.388, 0.387, 1.000)
		BumpHeight      1.25139
		BumpOffset      0.250278
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.370327
		GasToDust   0.25
		Particles   1727
		GasBright   0.0410188
		DustBright  0.589689
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.5205
		Period          247.168
		Eccentricity    0.971936
		Inclination     162.705
		AscendingNode   128.714
		ArgOfPericenter 93.7303
		MeanAnomaly     115.911
	}
}

Comet	"C77"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            6.31185e-009
	Radius          25.1142
	InertiaMoment   0.397349

	Oblateness      0.00228376

	RotationPeriod  101.945
	Obliquity       277.417
	EqAscendNode    77.9287

	AbsMagn         7.98378
	SlopeParam      3.13912
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.690 0.605 0.541)

	Surface
	{
		SurfStyle       0.148023
		OceanStyle      0.39762
		Randomize      (-0.466, -0.851, -0.228)
		colorDistMagn   0.409667
		colorDistFreq   0.176593
		detailScale     685.784
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566911
		terraceProb     0.241787
		erosion         0
		montesMagn      0.389338
		montesFreq      2.39072
		montesSpiky     0.954031
		montesFraction  0.700059
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.11974
		hillsFraction   0.737649
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214879
		craterFreq      0.219436
		craterDensity   0.960836
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.435956
		volcanoTemp     1582.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.242, 0.216, 0.000)
		colorShelf     (0.293, 0.257, 0.230, 0.000)
		colorBeach     (0.311, 0.272, 0.243, 0.000)
		colorDesert    (0.328, 0.288, 0.257, 0.000)
		colorLowland   (0.345, 0.303, 0.270, 0.000)
		colorUpland    (0.362, 0.318, 0.284, 0.000)
		colorRock      (0.380, 0.333, 0.297, 0.000)
		colorSnow      (0.397, 0.348, 0.311, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.851519
		GasToDust   0.25
		Particles   2700
		GasBright   0.0391097
		DustBright  0.276085
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   56.3814
		Period          319.43
		Eccentricity    0.963987
		Inclination     119.325
		AscendingNode   44.7011
		ArgOfPericenter -134.682
		MeanAnomaly     -168.615
	}
}

Comet	"C78"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.94346e-016
	Radius          0.0861005
	InertiaMoment   0.399411

	Oblateness      0.0033318

	RotationPeriod  96.9281
	Obliquity       230.623
	EqAscendNode    62.5061

	AbsMagn         4.03256
	SlopeParam      3.726
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.496 0.494)

	Surface
	{
		SurfStyle       0.940722
		OceanStyle      0.244225
		Randomize      (0.590, -0.921, -1.000)
		colorDistMagn   0.462002
		colorDistFreq   4.4229e-006
		detailScale     2.35112
		colorConversion true
		snowLevel       2
		tropicLatitude  0.516061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330228
		terraceProb     0.1474
		erosion         0
		montesMagn      0.601842
		montesFreq      3.07402
		montesSpiky     0.967676
		montesFraction  0.196048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6461e-005
		hillsFraction   0.916623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280581
		craterFreq      0.169306
		craterDensity   0.971606
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474811
		volcanoTemp     1270.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.173, 0.198, 0.050)
		colorShelf     (0.200, 0.203, 0.227, 0.040)
		colorBeach     (0.230, 0.233, 0.257, 0.030)
		colorDesert    (0.260, 0.263, 0.291, 0.020)
		colorLowland   (0.290, 0.292, 0.321, 0.030)
		colorUpland    (0.319, 0.322, 0.351, 0.050)
		colorRock      (0.349, 0.352, 0.390, 0.020)
		colorSnow      (0.349, 0.352, 0.390, 1.000)
		BumpHeight      0.0774904
		BumpOffset      0.0154981
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.146443
		DustBright  0.653238
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.7224
		Period          225.663
		Eccentricity    0.956615
		Inclination     127.226
		AscendingNode   39.8179
		ArgOfPericenter 161.753
		MeanAnomaly     40.7944
	}
}

Comet	"C79"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.50313e-012
	Radius          1.5555
	InertiaMoment   0.398138

	Oblateness      0.00276298

	RotationPeriod  92.7148
	Obliquity       183.828
	EqAscendNode    47.0835

	AbsMagn         11.5907
	SlopeParam      4.28973
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.669 0.668)

	Surface
	{
		SurfStyle       0.291913
		OceanStyle      0.0277916
		Randomize      (0.110, -0.827, -0.297)
		colorDistMagn   0.588299
		colorDistFreq   0.0019069
		detailScale     42.4755
		colorConversion true
		snowLevel       2
		tropicLatitude  0.71053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519128
		terraceProb     0.240317
		erosion         0
		montesMagn      0.634494
		montesFreq      1.80224
		montesSpiky     0.931091
		montesFraction  0.58073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00353176
		hillsFraction   0.47569
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234109
		craterFreq      0.221892
		craterDensity   0.842403
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467864
		volcanoTemp     1844.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.268, 0.267, 0.000)
		colorShelf     (0.286, 0.285, 0.284, 0.000)
		colorBeach     (0.303, 0.301, 0.301, 0.000)
		colorDesert    (0.320, 0.318, 0.317, 0.000)
		colorLowland   (0.336, 0.335, 0.334, 0.000)
		colorUpland    (0.353, 0.351, 0.351, 0.000)
		colorRock      (0.370, 0.368, 0.368, 0.000)
		colorSnow      (0.387, 0.385, 0.384, 1.000)
		BumpHeight      1.39995
		BumpOffset      0.27999
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.403153
		GasToDust   0.25
		Particles   1794
		GasBright   0.117252
		DustBright  0.366916
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.7517
		Period          196.286
		Eccentricity    0.968597
		Inclination     -131.655
		AscendingNode   -144.286
		ArgOfPericenter -19.0435
		MeanAnomaly     103.848
	}
}

Comet	"C80"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.16256e-008
	Radius          33.6408
	InertiaMoment   0.399838

	Oblateness      0.00394329

	RotationPeriod  89.0384
	Obliquity       137.034
	EqAscendNode    31.661

	AbsMagn         7.77503
	SlopeParam      4.87799
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.543 0.542)

	Surface
	{
		SurfStyle       0.568312
		OceanStyle      0.382283
		Randomize      (0.590, -0.953, 0.156)
		colorDistMagn   0.520796
		colorDistFreq   0.25421
		detailScale     918.617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.837259
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448637
		terraceProb     0.459207
		erosion         0
		montesMagn      0.473067
		montesFreq      3.53816
		montesSpiky     0.977124
		montesFraction  0.624695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.48756
		hillsFraction   0.542615
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228299
		craterFreq      0.243594
		craterDensity   0.888576
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491404
		volcanoTemp     1439.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.185, 0.152, 0.000)
		colorShelf     (0.219, 0.190, 0.173, 0.000)
		colorBeach     (0.257, 0.223, 0.206, 0.000)
		colorDesert    (0.279, 0.239, 0.201, 0.000)
		colorLowland   (0.306, 0.255, 0.228, 0.000)
		colorUpland    (0.339, 0.310, 0.276, 0.000)
		colorRock      (0.367, 0.337, 0.298, 0.000)
		colorSnow      (0.399, 0.359, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.884345
		GasToDust   0.25
		Particles   2766
		GasBright   0.291775
		DustBright  0.676879
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.083
		Period          283.607
		Eccentricity    0.977542
		Inclination     148.951
		AscendingNode   76.8276
		ArgOfPericenter 141.418
		MeanAnomaly     43.4978
	}
}

Comet	"C81"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.57962e-016
	Radius          0.0963425
	InertiaMoment   0.39871

	Oblateness      0.00322983

	RotationPeriod  85.7465
	Obliquity       90.2397
	EqAscendNode    16.2384

	AbsMagn         3.67557
	SlopeParam      5.5562
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.751 0.749)

	Surface
	{
		SurfStyle       0.859336
		OceanStyle      0.886004
		Randomize      (-0.850, 0.074, 0.032)
		colorDistMagn   0.491617
		colorDistFreq   5.65269e-006
		detailScale     2.63079
		colorConversion true
		snowLevel       2
		tropicLatitude  0.688254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.276326
		terraceProb     0.276814
		erosion         0
		montesMagn      0.330582
		montesFreq      3.24732
		montesSpiky     0.927235
		montesFraction  0.870318
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23785e-005
		hillsFraction   0.624868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236941
		craterFreq      0.234933
		craterDensity   0.902926
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469223
		volcanoTemp     1244.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.263, 0.300, 0.050)
		colorShelf     (0.302, 0.308, 0.344, 0.040)
		colorBeach     (0.348, 0.353, 0.389, 0.030)
		colorDesert    (0.393, 0.398, 0.442, 0.020)
		colorLowland   (0.438, 0.443, 0.487, 0.030)
		colorUpland    (0.484, 0.488, 0.532, 0.050)
		colorRock      (0.529, 0.533, 0.592, 0.020)
		colorSnow      (0.529, 0.533, 0.592, 1.000)
		BumpHeight      0.0867083
		BumpOffset      0.0173417
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.235302
		DustBright  0.417839
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.2406
		Period          244.988
		Eccentricity    0.96657
		Inclination     63.6113
		AscendingNode   -144.286
		ArgOfPericenter 70.166
		MeanAnomaly     133.31
	}
}

Comet	"C82"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.76858e-012
	Radius          2.0832
	InertiaMoment   0.396734

	Oblateness      0.00450036

	RotationPeriod  82.7433
	Obliquity       43.4454
	EqAscendNode    0.815775

	AbsMagn         11.2888
	SlopeParam      6.49422
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.434 0.427 0.421)

	Surface
	{
		SurfStyle       0.746907
		OceanStyle      0.729162
		Randomize      (-0.759, -0.133, 0.366)
		colorDistMagn   0.567493
		colorDistFreq   0.00102148
		detailScale     56.8852
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898306
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690451
		terraceProb     0.273502
		erosion         0
		montesMagn      0.604416
		montesFreq      2.66841
		montesSpiky     0.937552
		montesFraction  0.696643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.013443
		hillsFraction   0.685539
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258558
		craterFreq      0.258311
		craterDensity   0.901185
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437518
		volcanoTemp     1266.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.145, 0.118, 0.000)
		colorShelf     (0.173, 0.150, 0.135, 0.000)
		colorBeach     (0.204, 0.175, 0.160, 0.000)
		colorDesert    (0.221, 0.188, 0.156, 0.000)
		colorLowland   (0.243, 0.201, 0.177, 0.000)
		colorUpland    (0.269, 0.244, 0.215, 0.000)
		colorRock      (0.291, 0.265, 0.232, 0.000)
		colorSnow      (0.317, 0.282, 0.244, 1.000)
		BumpHeight      1.87488
		BumpOffset      0.374976
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.435979
		GasToDust   0.25
		Particles   1860
		GasBright   0.14157
		DustBright  0.196058
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.8729
		Period          204.442
		Eccentricity    0.981833
		Inclination     -100.177
		AscendingNode   -33.0004
		ArgOfPericenter -37.0355
		MeanAnomaly     -56.2117
	}
}

Comet	"C83"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.14129e-008
	Radius          37.6499
	InertiaMoment   0.399191

	Oblateness      0.00371196

	RotationPeriod  79.9643
	Obliquity       356.651
	EqAscendNode    345.393

	AbsMagn         7.56566
	SlopeParam      2.04817
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.409 0.406 0.402)

	Surface
	{
		SurfStyle       0.690178
		OceanStyle      0.992375
		Randomize      (-0.950, 0.038, 0.419)
		colorDistMagn   0.629337
		colorDistFreq   1.17856
		detailScale     1028.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938063
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550596
		terraceProb     0.268831
		erosion         0
		montesMagn      0.473927
		montesFreq      2.13453
		montesSpiky     0.999092
		montesFraction  0.690014
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.02856
		hillsFraction   0.687909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247736
		craterFreq      0.160076
		craterDensity   0.884667
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510478
		volcanoTemp     1310.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.192, 0.166, 0.153, 0.000)
		colorDesert    (0.209, 0.179, 0.149, 0.000)
		colorLowland   (0.229, 0.191, 0.169, 0.000)
		colorUpland    (0.254, 0.231, 0.205, 0.000)
		colorRock      (0.274, 0.252, 0.221, 0.000)
		colorSnow      (0.299, 0.268, 0.233, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.917171
		GasToDust   0.25
		Particles   2832
		GasBright   0.393261
		DustBright  0.428853
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   39.2977
		Period          185.876
		Eccentricity    0.95885
		Inclination     68.9347
		AscendingNode   103.098
		ArgOfPericenter -92.6354
		MeanAnomaly     -154.236
	}
}

Comet	"C84"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            6.5932e-016
	Radius          0.129003
	InertiaMoment   0.397792

	Oblateness      0.00515378

	RotationPeriod  77.3638
	Obliquity       309.857
	EqAscendNode    329.971

	AbsMagn         3.28033
	SlopeParam      2.81424
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.525 0.523 0.519)

	Surface
	{
		SurfStyle       0.712625
		OceanStyle      0.389651
		Randomize      (0.964, 0.442, 0.533)
		colorDistMagn   0.311924
		colorDistFreq   4.8567e-006
		detailScale     3.52264
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582344
		terraceProb     0.485829
		erosion         0
		montesMagn      0.422796
		montesFreq      2.63461
		montesSpiky     0.894505
		montesFraction  0.750298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.56988e-005
		hillsFraction   0.508594
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269455
		craterFreq      0.216567
		craterDensity   0.786314
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432361
		volcanoTemp     1673.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.178, 0.145, 0.000)
		colorShelf     (0.210, 0.183, 0.166, 0.000)
		colorBeach     (0.247, 0.214, 0.197, 0.000)
		colorDesert    (0.268, 0.230, 0.192, 0.000)
		colorLowland   (0.294, 0.246, 0.218, 0.000)
		colorUpland    (0.326, 0.298, 0.265, 0.000)
		colorRock      (0.352, 0.324, 0.286, 0.000)
		colorSnow      (0.384, 0.345, 0.301, 1.000)
		BumpHeight      0.116103
		BumpOffset      0.0232205
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0189459
		DustBright  0.487655
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.9234
		Period          204.812
		Eccentricity    0.949752
		Inclination     118.977
		AscendingNode   -65.19
		ArgOfPericenter -110.771
		MeanAnomaly     138.984
	}
}

Comet	"C85"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.09936e-012
	Radius          2.33189
	InertiaMoment   0.399629

	Oblateness      0.00422707

	RotationPeriod  74.9083
	Obliquity       263.063
	EqAscendNode    314.548

	AbsMagn         11.0044
	SlopeParam      3.43462
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.730 0.728 0.727)

	Surface
	{
		SurfStyle       0.744383
		OceanStyle      0.993099
		Randomize      (-0.670, -0.470, 0.218)
		colorDistMagn   0.417343
		colorDistFreq   0.00387936
		detailScale     63.676
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691622
		terraceProb     0.290234
		erosion         0
		montesMagn      0.540362
		montesFreq      2.30342
		montesSpiky     0.976458
		montesFraction  0.581302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0165464
		hillsFraction   0.74953
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225122
		craterFreq      0.172858
		craterDensity   0.825592
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494108
		volcanoTemp     1488.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.248, 0.204, 0.000)
		colorShelf     (0.292, 0.255, 0.233, 0.000)
		colorBeach     (0.343, 0.299, 0.276, 0.000)
		colorDesert    (0.373, 0.320, 0.269, 0.000)
		colorLowland   (0.409, 0.342, 0.305, 0.000)
		colorUpland    (0.453, 0.415, 0.371, 0.000)
		colorRock      (0.489, 0.452, 0.400, 0.000)
		colorSnow      (0.533, 0.481, 0.422, 1.000)
		BumpHeight      2.0987
		BumpOffset      0.419739
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.468805
		GasToDust   0.25
		Particles   1926
		GasBright   0.0955838
		DustBright  0.895503
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.9484
		Period          307.329
		Eccentricity    0.964165
		Inclination     175.041
		AscendingNode   -130.073
		ArgOfPericenter 13.3598
		MeanAnomaly     -95.985
	}
}

Comet	"C86"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.94399e-008
	Radius          50.4049
	InertiaMoment   0.398444

	Oblateness      0.00585473

	RotationPeriod  72.572
	Obliquity       216.268
	EqAscendNode    299.125

	AbsMagn         7.35509
	SlopeParam      4.00393
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.735 0.731 0.727)

	Surface
	{
		SurfStyle       0.127778
		OceanStyle      0.338543
		Randomize      (0.840, -0.176, -0.855)
		colorDistMagn   0.978448
		colorDistFreq   1.63771
		detailScale     1376.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937002
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530628
		terraceProb     0.312284
		erosion         0
		montesMagn      0.455391
		montesFreq      3.40171
		montesSpiky     0.951482
		montesFraction  0.835235
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.94501
		hillsFraction   0.646234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24962
		craterFreq      0.222369
		craterDensity   0.792336
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543206
		volcanoTemp     1129.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.291, 0.000)
		colorShelf     (0.312, 0.311, 0.309, 0.000)
		colorBeach     (0.331, 0.329, 0.327, 0.000)
		colorDesert    (0.349, 0.347, 0.345, 0.000)
		colorLowland   (0.368, 0.366, 0.364, 0.000)
		colorUpland    (0.386, 0.384, 0.382, 0.000)
		colorRock      (0.404, 0.402, 0.400, 0.000)
		colorSnow      (0.423, 0.421, 0.418, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.949997
		GasToDust   0.25
		Particles   2898
		GasBright   0.105044
		DustBright  0.57053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.2693
		Period          222.242
		Eccentricity    0.983725
		Inclination     42.8135
		AscendingNode   52.9699
		ArgOfPericenter -1.14745
		MeanAnomaly     -74.4036
	}
}

Comet	"C87"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.21439e-015
	Radius          0.144427
	InertiaMoment   0.395349

	Oblateness      0.00470727

	RotationPeriod  70.3349
	Obliquity       169.474
	EqAscendNode    283.703

	AbsMagn         2.83268
	SlopeParam      4.57356
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.544 0.539)

	Surface
	{
		SurfStyle       0.145277
		OceanStyle      0.0624965
		Randomize      (-0.260, -0.184, -0.559)
		colorDistMagn   0.569825
		colorDistFreq   1.11824e-005
		detailScale     3.94382
		colorConversion true
		snowLevel       2
		tropicLatitude  0.75738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575337
		terraceProb     0.490427
		erosion         0
		montesMagn      0.386827
		montesFreq      2.8398
		montesSpiky     0.999891
		montesFraction  0.541726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.71585e-005
		hillsFraction   0.573818
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229932
		craterFreq      0.188174
		craterDensity   0.730414
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512156
		volcanoTemp     1435.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.217, 0.216, 0.000)
		colorShelf     (0.232, 0.231, 0.229, 0.000)
		colorBeach     (0.246, 0.245, 0.243, 0.000)
		colorDesert    (0.259, 0.258, 0.256, 0.000)
		colorLowland   (0.273, 0.272, 0.269, 0.000)
		colorUpland    (0.287, 0.285, 0.283, 0.000)
		colorRock      (0.300, 0.299, 0.296, 0.000)
		colorSnow      (0.314, 0.313, 0.310, 1.000)
		BumpHeight      0.129984
		BumpOffset      0.0259969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0204391
		GasToDust   0.25
		Particles   1021
		GasBright   0.0772451
		DustBright  0.282815
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   41.6112
		Period          202.529
		Eccentricity    0.977217
		Inclination     -59.0977
		AscendingNode   -160.811
		ArgOfPericenter -20.1984
		MeanAnomaly     85.5643
	}
}

Comet	"C88"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            9.3924e-012
	Radius          3.12141
	InertiaMoment   0.398961

	Oblateness      0.00662756

	RotationPeriod  68.181
	Obliquity       122.68
	EqAscendNode    268.28

	AbsMagn         10.7346
	SlopeParam      5.19514
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.588 0.585)

	Surface
	{
		SurfStyle       0.473462
		OceanStyle      0.398307
		Randomize      (0.058, 0.382, -0.626)
		colorDistMagn   0.0770147
		colorDistFreq   0.00810574
		detailScale     85.2353
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892399
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410189
		terraceProb     0.340931
		erosion         0
		montesMagn      0.48896
		montesFreq      3.14262
		montesSpiky     0.953784
		montesFraction  0.540319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0179117
		hillsFraction   0.739929
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241968
		craterFreq      0.247824
		craterDensity   0.974515
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.423225
		volcanoTemp     1612.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.235, 0.234, 0.000)
		colorShelf     (0.252, 0.250, 0.249, 0.000)
		colorBeach     (0.267, 0.265, 0.263, 0.000)
		colorDesert    (0.282, 0.279, 0.278, 0.000)
		colorLowland   (0.297, 0.294, 0.293, 0.000)
		colorUpland    (0.311, 0.309, 0.307, 0.000)
		colorRock      (0.326, 0.323, 0.322, 0.000)
		colorSnow      (0.341, 0.338, 0.336, 1.000)
		BumpHeight      2.80927
		BumpOffset      0.561853
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.501631
		GasToDust   0.25
		Particles   1993
		GasBright   0.23105
		DustBright  0.613496
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.0834
		Period          291.817
		Eccentricity    0.983786
		Inclination     77.58
		AscendingNode   65.9405
		ArgOfPericenter 51.9824
		MeanAnomaly     73.4674
	}
}

Comet	"C89"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            7.26435e-008
	Radius          56.44
	InertiaMoment   0.397361

	Oblateness      0.00535797

	RotationPeriod  66.097
	Obliquity       75.8853
	EqAscendNode    252.858

	AbsMagn         7.14273
	SlopeParam      5.96452
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.634 0.632)

	Surface
	{
		SurfStyle       0.567446
		OceanStyle      0.401513
		Randomize      (-0.006, -0.179, -0.076)
		colorDistMagn   0.798661
		colorDistFreq   1.88699
		detailScale     1541.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980626
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533287
		terraceProb     0.261574
		erosion         0
		montesMagn      0.347037
		montesFreq      2.81227
		montesSpiky     0.868046
		montesFraction  0.729429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.98647
		hillsFraction   0.572445
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203463
		craterFreq      0.186348
		craterDensity   0.953709
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441671
		volcanoTemp     1644.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.216, 0.177, 0.000)
		colorShelf     (0.255, 0.222, 0.202, 0.000)
		colorBeach     (0.299, 0.260, 0.240, 0.000)
		colorDesert    (0.325, 0.279, 0.234, 0.000)
		colorLowland   (0.356, 0.298, 0.266, 0.000)
		colorUpland    (0.395, 0.361, 0.322, 0.000)
		colorRock      (0.427, 0.393, 0.348, 0.000)
		colorSnow      (0.465, 0.418, 0.367, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.982823
		GasToDust   0.25
		Particles   2965
		GasBright   0.175969
		DustBright  0.353064
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.2981
		Period          222.459
		Eccentricity    0.972657
		Inclination     -22.4386
		AscendingNode   94.5729
		ArgOfPericenter 56.1352
		MeanAnomaly     113.006
	}
}

Comet	"C90"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.23675e-015
	Radius          0.1933
	InertiaMoment   0.399417

	Oblateness      0.00749704

	RotationPeriod  64.072
	Obliquity       29.091
	EqAscendNode    237.435

	AbsMagn         2.30887
	SlopeParam      7.27219
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.491 0.488 0.486)

	Surface
	{
		SurfStyle       0.125021
		OceanStyle      0.367573
		Randomize      (0.361, -0.644, 0.936)
		colorDistMagn   0.968984
		colorDistFreq   1.61243e-005
		detailScale     5.27838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.430789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557432
		terraceProb     0.382988
		erosion         0
		montesMagn      0.538999
		montesFreq      2.45984
		montesSpiky     0.959957
		montesFraction  0.492826
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.82357e-005
		hillsFraction   0.48869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242231
		craterFreq      0.250972
		craterDensity   0.967516
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520905
		volcanoTemp     1238.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.195, 0.194, 0.000)
		colorShelf     (0.209, 0.207, 0.206, 0.000)
		colorBeach     (0.221, 0.220, 0.219, 0.000)
		colorDesert    (0.233, 0.232, 0.231, 0.000)
		colorLowland   (0.245, 0.244, 0.243, 0.000)
		colorUpland    (0.258, 0.256, 0.255, 0.000)
		colorRock      (0.270, 0.268, 0.267, 0.000)
		colorSnow      (0.282, 0.280, 0.279, 1.000)
		BumpHeight      0.17397
		BumpOffset      0.034794
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0532651
		GasToDust   0.25
		Particles   1087
		GasBright   0.0836293
		DustBright  0.129891
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.6505
		Period          174.312
		Eccentricity    0.960029
		Inclination     -5.55145
		AscendingNode   45.9496
		ArgOfPericenter 98.4751
		MeanAnomaly     -67.5867
	}
}

Comet	"C91"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.72997e-011
	Radius          3.49561
	InertiaMoment   0.398147

	Oblateness      0.00607398

	RotationPeriod  62.0966
	Obliquity       342.297
	EqAscendNode    222.012

	AbsMagn         10.4766
	SlopeParam      2.45441
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.740 0.632 0.555)

	Surface
	{
		SurfStyle       0.602112
		OceanStyle      0.748318
		Randomize      (0.359, -0.574, -0.447)
		colorDistMagn   0.635699
		colorDistFreq   0.0058964
		detailScale     95.4535
		colorConversion true
		snowLevel       2
		tropicLatitude  0.674072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608943
		terraceProb     0.396711
		erosion         0
		montesMagn      0.438838
		montesFreq      2.82176
		montesSpiky     0.689827
		montesFraction  0.489461
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0308711
		hillsFraction   0.794914
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248132
		craterFreq      0.172217
		craterDensity   0.97153
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471394
		volcanoTemp     1422.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.215, 0.155, 0.000)
		colorShelf     (0.296, 0.221, 0.178, 0.000)
		colorBeach     (0.348, 0.259, 0.211, 0.000)
		colorDesert    (0.378, 0.278, 0.205, 0.000)
		colorLowland   (0.415, 0.297, 0.233, 0.000)
		colorUpland    (0.459, 0.360, 0.283, 0.000)
		colorRock      (0.496, 0.392, 0.305, 0.000)
		colorSnow      (0.540, 0.417, 0.322, 1.000)
		BumpHeight      3.14605
		BumpOffset      0.62921
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.534457
		GasToDust   0.25
		Particles   2059
		GasBright   0.314602
		DustBright  0.383405
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.7667
		Period          196.395
		Eccentricity    0.972131
		Inclination     -25.5368
		AscendingNode   22.7251
		ArgOfPericenter -120.946
		MeanAnomaly     56.913
	}
}

Comet	"C92"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.338e-007
	Radius          75.5297
	InertiaMoment   0.399843

	Oblateness      0.00849338

	RotationPeriod  60.1628
	Obliquity       295.502
	EqAscendNode    206.59

	AbsMagn         6.92791
	SlopeParam      3.13065
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.417 0.414 0.409)

	Surface
	{
		SurfStyle       0.826815
		OceanStyle      0.051572
		Randomize      (-0.691, -0.280, 0.449)
		colorDistMagn   0.456137
		colorDistFreq   5.0568
		detailScale     2062.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.896018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478423
		terraceProb     0.189409
		erosion         0
		montesMagn      0.386177
		montesFreq      3.32977
		montesSpiky     0.859953
		montesFraction  0.481868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.982
		hillsFraction   0.540624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26547
		craterFreq      0.228132
		craterDensity   0.889159
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497272
		volcanoTemp     1587.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.141, 0.115, 0.000)
		colorShelf     (0.167, 0.145, 0.131, 0.000)
		colorBeach     (0.196, 0.170, 0.155, 0.000)
		colorDesert    (0.213, 0.182, 0.151, 0.000)
		colorLowland   (0.234, 0.194, 0.172, 0.000)
		colorUpland    (0.259, 0.236, 0.209, 0.000)
		colorRock      (0.280, 0.257, 0.225, 0.000)
		colorSnow      (0.305, 0.273, 0.237, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00373319
		DustBright  0.37876
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.1778
		Period          229.118
		Eccentricity    0.956506
		Inclination     -152.906
		AscendingNode   81.5062
		ArgOfPericenter 28.6
		MeanAnomaly     -128.636
	}
}

Comet	"C93"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.1198e-015
	Radius          0.216499
	InertiaMoment   0.398717

	Oblateness      0.00689767

	RotationPeriod  58.2636
	Obliquity       248.708
	EqAscendNode    191.167

	AbsMagn         1.66381
	SlopeParam      3.71821
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.508 0.501 0.498)

	Surface
	{
		SurfStyle       0.886253
		OceanStyle      0.809818
		Randomize      (-0.673, -0.243, 0.848)
		colorDistMagn   0.493612
		colorDistFreq   1.51347e-005
		detailScale     5.91186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713102
		terraceProb     0.305436
		erosion         0
		montesMagn      0.659356
		montesFreq      3.07184
		montesSpiky     0.853269
		montesFraction  0.470956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.28483e-005
		hillsFraction   0.656539
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238155
		craterFreq      0.196707
		craterDensity   0.893649
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4818
		volcanoTemp     1613.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.175, 0.199, 0.050)
		colorShelf     (0.203, 0.205, 0.229, 0.040)
		colorBeach     (0.234, 0.235, 0.259, 0.030)
		colorDesert    (0.264, 0.266, 0.294, 0.020)
		colorLowland   (0.295, 0.296, 0.324, 0.030)
		colorUpland    (0.325, 0.326, 0.354, 0.050)
		colorRock      (0.356, 0.356, 0.394, 0.020)
		colorSnow      (0.356, 0.356, 0.394, 1.000)
		BumpHeight      0.194849
		BumpOffset      0.0389698
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0860909
		GasToDust   0.25
		Particles   1153
		GasBright   0.0596529
		DustBright  0.807327
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   35.3326
		Period          158.465
		Eccentricity    0.983311
		Inclination     168.281
		AscendingNode   128.021
		ArgOfPericenter 104.455
		MeanAnomaly     -48.7679
	}
}

Comet	"C94"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.18637e-011
	Radius          4.67742
	InertiaMoment   0.396754

	Oblateness      0.00952997

	RotationPeriod  56.3924
	Obliquity       201.914
	EqAscendNode    175.745

	AbsMagn         10.2285
	SlopeParam      4.28194
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.580 0.572)

	Surface
	{
		SurfStyle       0.557149
		OceanStyle      0.0129662
		Randomize      (-0.112, 0.733, 0.206)
		colorDistMagn   0.730361
		colorDistFreq   0.00972084
		detailScale     127.725
		colorConversion true
		snowLevel       2
		tropicLatitude  0.45015
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541037
		terraceProb     0.508092
		erosion         0
		montesMagn      0.555427
		montesFreq      2.24923
		montesSpiky     0.949607
		montesFraction  0.783645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0523901
		hillsFraction   0.59657
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273202
		craterFreq      0.18878
		craterDensity   0.894573
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493882
		volcanoTemp     1940.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.197, 0.160, 0.000)
		colorShelf     (0.233, 0.203, 0.183, 0.000)
		colorBeach     (0.274, 0.238, 0.217, 0.000)
		colorDesert    (0.298, 0.255, 0.212, 0.000)
		colorLowland   (0.327, 0.272, 0.240, 0.000)
		colorUpland    (0.362, 0.330, 0.292, 0.000)
		colorRock      (0.391, 0.359, 0.315, 0.000)
		colorSnow      (0.426, 0.382, 0.332, 1.000)
		BumpHeight      4.20968
		BumpOffset      0.841936
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.567283
		GasToDust   0.25
		Particles   2125
		GasBright   0.0705053
		DustBright  0.480961
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.5278
		Period          262.994
		Eccentricity    0.978246
		Inclination     11.7703
		AscendingNode   78.4173
		ArgOfPericenter -133.758
		MeanAnomaly     50.0037
	}
}

Comet	"C95"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.46443e-007
	Radius          84.6029
	InertiaMoment   0.399197

	Oblateness      0.00786572

	RotationPeriod  54.5437
	Obliquity       155.12
	EqAscendNode    160.322

	AbsMagn         6.70995
	SlopeParam      4.86951
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.466 0.462 0.456)

	Surface
	{
		SurfStyle       0.0053599
		OceanStyle      0.930123
		Randomize      (-0.908, 0.909, -0.694)
		colorDistMagn   0.639067
		colorDistFreq   3.76354
		detailScale     2310.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.943418
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662218
		terraceProb     0.223468
		erosion         0
		montesMagn      0.581018
		montesFreq      3.39447
		montesSpiky     0.995204
		montesFraction  0.278528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.1117
		hillsFraction   0.846994
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250441
		craterFreq      0.221748
		craterDensity   0.949108
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519942
		volcanoTemp     1619.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.185, 0.182, 0.000)
		colorShelf     (0.198, 0.196, 0.194, 0.000)
		colorBeach     (0.210, 0.208, 0.205, 0.000)
		colorDesert    (0.221, 0.219, 0.216, 0.000)
		colorLowland   (0.233, 0.231, 0.228, 0.000)
		colorUpland    (0.245, 0.242, 0.239, 0.000)
		colorRock      (0.256, 0.254, 0.251, 0.000)
		colorSnow      (0.268, 0.266, 0.262, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0440986
		DustBright  0.191854
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.2379
		Period          260.688
		Eccentricity    0.947075
		Inclination     134.247
		AscendingNode   -0.173228
		ArgOfPericenter 101.886
		MeanAnomaly     61.1709
	}
}

Comet	"C96"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            7.58817e-015
	Radius          0.289667
	InertiaMoment   0.397801

	Oblateness      0.0109208

	RotationPeriod  52.7121
	Obliquity       108.325
	EqAscendNode    144.9

	AbsMagn         0.792523
	SlopeParam      5.54578
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.429 0.426 0.423)

	Surface
	{
		SurfStyle       0.212665
		OceanStyle      0.0617874
		Randomize      (-0.238, 0.243, 0.012)
		colorDistMagn   0.319594
		colorDistFreq   3.892e-005
		detailScale     7.90985
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985395
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704234
		terraceProb     0.283159
		erosion         0
		montesMagn      0.364229
		montesFreq      2.47195
		montesSpiky     0.916896
		montesFraction  0.76151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000155041
		hillsFraction   0.627124
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260014
		craterFreq      0.209163
		craterDensity   0.796145
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494275
		volcanoTemp     1400.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.169, 0.000)
		colorShelf     (0.183, 0.181, 0.180, 0.000)
		colorBeach     (0.193, 0.192, 0.190, 0.000)
		colorDesert    (0.204, 0.202, 0.201, 0.000)
		colorLowland   (0.215, 0.213, 0.211, 0.000)
		colorUpland    (0.225, 0.223, 0.222, 0.000)
		colorRock      (0.236, 0.234, 0.232, 0.000)
		colorSnow      (0.247, 0.245, 0.243, 1.000)
		BumpHeight      0.260701
		BumpOffset      0.0521401
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.118917
		GasToDust   0.25
		Particles   1220
		GasBright   0.177186
		DustBright  0.543254
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.0392
		Period          191.161
		Eccentricity    0.980906
		Inclination     -10.108
		AscendingNode   33.3023
		ArgOfPericenter 84.605
		MeanAnomaly     -157.088
	}
}

Comet	"C97"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.8689e-011
	Radius          5.23977
	InertiaMoment   0.399635

	Oblateness      0.00902756

	RotationPeriod  50.8927
	Obliquity       61.5309
	EqAscendNode    129.477

	AbsMagn         9.98878
	SlopeParam      6.47752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.595 0.493 0.322)

	Surface
	{
		SurfStyle       0.786167
		OceanStyle      0.695795
		Randomize      (0.807, 0.655, -0.190)
		colorDistMagn   0.0153124
		colorDistFreq   0.0079571
		detailScale     143.081
		colorConversion true
		snowLevel       2
		tropicLatitude  0.12033
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575078
		terraceProb     0.138387
		erosion         0
		montesMagn      0.645848
		montesFreq      2.95784
		montesSpiky     0.931339
		montesFraction  0.646747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0576884
		hillsFraction   0.662321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.296072
		craterFreq      0.205811
		craterDensity   0.941211
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518403
		volcanoTemp     1576.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.168, 0.090, 0.000)
		colorShelf     (0.238, 0.173, 0.103, 0.000)
		colorBeach     (0.280, 0.202, 0.122, 0.000)
		colorDesert    (0.304, 0.217, 0.119, 0.000)
		colorLowland   (0.333, 0.232, 0.135, 0.000)
		colorUpland    (0.369, 0.281, 0.164, 0.000)
		colorRock      (0.399, 0.306, 0.177, 0.000)
		colorSnow      (0.435, 0.325, 0.187, 1.000)
		BumpHeight      4.71579
		BumpOffset      0.943158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.600109
		GasToDust   0.25
		Particles   2192
		GasBright   0.123497
		DustBright  0.281429
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.2423
		Period          245.001
		Eccentricity    0.958721
		Inclination     -60.0247
		AscendingNode   -7.73048
		ArgOfPericenter -8.49285
		MeanAnomaly     3.59012
	}
}

Comet	"C98"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.53917e-007
	Radius          113.187
	InertiaMoment   0.398451

	Oblateness      0.012594

	RotationPeriod  49.0806
	Obliquity       14.7366
	EqAscendNode    114.054

	AbsMagn         6.4881
	SlopeParam      2.03571
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.803 0.737 0.657)

	Surface
	{
		SurfStyle       0.206577
		OceanStyle      0.64864
		Randomize      (0.827, -0.198, 0.746)
		colorDistMagn   0.631012
		colorDistFreq   2.0414
		detailScale     3090.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.867213
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.33651
		terraceProb     0.352868
		erosion         0
		montesMagn      0.58469
		montesFreq      2.8555
		montesSpiky     0.914794
		montesFraction  0.441174
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.0657
		hillsFraction   0.878507
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214305
		craterFreq      0.507044
		craterDensity   0.881387
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482673
		volcanoTemp     1539.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.295, 0.263, 0.000)
		colorShelf     (0.341, 0.313, 0.279, 0.000)
		colorBeach     (0.361, 0.332, 0.296, 0.000)
		colorDesert    (0.381, 0.350, 0.312, 0.000)
		colorLowland   (0.402, 0.368, 0.329, 0.000)
		colorUpland    (0.422, 0.387, 0.345, 0.000)
		colorRock      (0.442, 0.405, 0.361, 0.000)
		colorSnow      (0.462, 0.424, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.323774
		DustBright  0.565638
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.099
		Period          130.855
		Eccentricity    0.947587
		Inclination     -66.8907
		AscendingNode   59.6095
		ArgOfPericenter 144.415
		MeanAnomaly     76.2027
	}
}

Comet	"C99"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.39765e-014
	Radius          0.324516
	InertiaMoment   0.395424

	Oblateness      0.0102745

	RotationPeriod  47.2712
	Obliquity       327.942
	EqAscendNode    98.6317

	AbsMagn         -0.683041
	SlopeParam      2.80503
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.642 0.636)

	Surface
	{
		SurfStyle       0.397433
		OceanStyle      0.100564
		Randomize      (0.666, 0.502, -0.629)
		colorDistMagn   0.35939
		colorDistFreq   3.34417e-005
		detailScale     8.86144
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998122
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615609
		terraceProb     0.249375
		erosion         0
		montesMagn      0.582424
		montesFreq      3.49921
		montesSpiky     0.906636
		montesFraction  0.648202
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000199857
		hillsFraction   0.715463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250096
		craterFreq      0.251305
		craterDensity   1.00618
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462298
		volcanoTemp     1156.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.257, 0.255, 0.000)
		colorShelf     (0.274, 0.273, 0.270, 0.000)
		colorBeach     (0.290, 0.289, 0.286, 0.000)
		colorDesert    (0.306, 0.305, 0.302, 0.000)
		colorLowland   (0.323, 0.321, 0.318, 0.000)
		colorUpland    (0.339, 0.337, 0.334, 0.000)
		colorRock      (0.355, 0.353, 0.350, 0.000)
		colorSnow      (0.371, 0.369, 0.366, 1.000)
		BumpHeight      0.292064
		BumpOffset      0.0584128
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.151743
		GasToDust   0.25
		Particles   1286
		GasBright   0.242803
		DustBright  0.331096
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.1385
		Period          369.584
		Eccentricity    0.968636
		Inclination     61.7965
		AscendingNode   136.498
		ArgOfPericenter -176.463
		MeanAnomaly     -40.1061
	}
}

Comet	"C100"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.08098e-010
	Radius          7.00964
	InertiaMoment   0.398967

	Oblateness      0.0146699

	RotationPeriod  45.46
	Obliquity       281.148
	EqAscendNode    83.2092

	AbsMagn         9.75596
	SlopeParam      3.42658
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.727 0.723 0.719)

	Surface
	{
		SurfStyle       0.529193
		OceanStyle      0.728684
		Randomize      (-0.618, 0.113, -0.731)
		colorDistMagn   0.561416
		colorDistFreq   0.0267895
		detailScale     191.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946377
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563737
		terraceProb     0.371072
		erosion         0
		montesMagn      0.442804
		montesFreq      3.31712
		montesSpiky     0.909486
		montesFraction  0.62518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.127439
		hillsFraction   0.653128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262326
		craterFreq      0.200494
		craterDensity   0.803751
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448261
		volcanoTemp     1360.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.246, 0.201, 0.000)
		colorShelf     (0.291, 0.253, 0.230, 0.000)
		colorBeach     (0.342, 0.297, 0.273, 0.000)
		colorDesert    (0.371, 0.318, 0.266, 0.000)
		colorLowland   (0.407, 0.340, 0.302, 0.000)
		colorUpland    (0.451, 0.412, 0.367, 0.000)
		colorRock      (0.487, 0.449, 0.395, 0.000)
		colorSnow      (0.531, 0.477, 0.417, 1.000)
		BumpHeight      6.30867
		BumpOffset      1.26173
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.632935
		GasToDust   0.25
		Particles   2258
		GasBright   0.124573
		DustBright  0.133812
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   29.3092
		Period          119.723
		Eccentricity    0.923464
		Inclination     -149.112
		AscendingNode   166.131
		ArgOfPericenter -65.3782
		MeanAnomaly     156.668
	}
}

Comet	"C101"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.32841e-018
	Radius          0.0200981
	InertiaMoment   0.397374

	Oblateness      0.0121125

	RotationPeriod  43.6423
	Obliquity       234.354
	EqAscendNode    67.7866

	AbsMagn         6.26148
	SlopeParam      3.99621
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.411 0.295)

	Surface
	{
		SurfStyle       0.986453
		OceanStyle      0.416595
		Randomize      (0.868, -0.297, 0.370)
		colorDistMagn   0.152615
		colorDistFreq   2.78146e-007
		detailScale     0.548812
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827382
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641714
		terraceProb     0.23752
		erosion         0
		montesMagn      0.343166
		montesFreq      3.39247
		montesSpiky     0.986198
		montesFraction  0.613832
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1016e-006
		hillsFraction   0.722477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239971
		craterFreq      0.174733
		craterDensity   0.866996
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52019
		volcanoTemp     1690.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.144, 0.118, 0.050)
		colorShelf     (0.219, 0.168, 0.136, 0.040)
		colorBeach     (0.252, 0.193, 0.153, 0.030)
		colorDesert    (0.285, 0.218, 0.174, 0.020)
		colorLowland   (0.317, 0.242, 0.192, 0.030)
		colorUpland    (0.350, 0.267, 0.210, 0.050)
		colorRock      (0.383, 0.292, 0.233, 0.020)
		colorSnow      (0.383, 0.292, 0.233, 1.000)
		BumpHeight      0.0180883
		BumpOffset      0.00361766
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0305821
		DustBright  0.71229
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   57.5144
		Period          329.106
		Eccentricity    0.979155
		Inclination     63.5813
		AscendingNode   -114.547
		ArgOfPericenter -139.791
		MeanAnomaly     21.4206
	}
}

Comet	"C102"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.57428e-014
	Radius          0.434109
	InertiaMoment   0.399422

	Oblateness      0.0173246

	RotationPeriod  41.8135
	Obliquity       187.559
	EqAscendNode    52.364

	AbsMagn         16.8585
	SlopeParam      4.56553
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.464 0.459 0.453)

	Surface
	{
		SurfStyle       0.124861
		OceanStyle      0.137544
		Randomize      (0.790, -0.643, 0.682)
		colorDistMagn   0.427283
		colorDistFreq   0.000112714
		detailScale     11.8541
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468902
		terraceProb     0.113689
		erosion         0
		montesMagn      0.630526
		montesFreq      3.26538
		montesSpiky     0.909327
		montesFraction  0.313653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000399281
		hillsFraction   0.776179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239147
		craterFreq      0.238143
		craterDensity   0.838574
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558027
		volcanoTemp     1506.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.184, 0.181, 0.000)
		colorShelf     (0.197, 0.195, 0.192, 0.000)
		colorBeach     (0.209, 0.206, 0.204, 0.000)
		colorDesert    (0.221, 0.218, 0.215, 0.000)
		colorLowland   (0.232, 0.229, 0.226, 0.000)
		colorUpland    (0.244, 0.241, 0.238, 0.000)
		colorRock      (0.255, 0.252, 0.249, 0.000)
		colorSnow      (0.267, 0.264, 0.260, 1.000)
		BumpHeight      0.390698
		BumpOffset      0.0781396
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.184569
		GasToDust   0.25
		Particles   1352
		GasBright   0.0428268
		DustBright  0.384532
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.1343
		Period          334.441
		Eccentricity    0.966841
		Inclination     100.585
		AscendingNode   148.02
		ArgOfPericenter 155.606
		MeanAnomaly     173.416
	}
}

Comet	"C103"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.99102e-010
	Radius          7.85365
	InertiaMoment   0.398155

	Oblateness      0.0144475

	RotationPeriod  39.9685
	Obliquity       140.765
	EqAscendNode    36.9414

	AbsMagn         9.52895
	SlopeParam      5.18593
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.739 0.641 0.584)

	Surface
	{
		SurfStyle       0.208826
		OceanStyle      0.60789
		Randomize      (-0.404, 0.074, 0.683)
		colorDistMagn   0.925667
		colorDistFreq   0.0335096
		detailScale     214.457
		colorConversion true
		snowLevel       2
		tropicLatitude  0.615509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63139
		terraceProb     0.367712
		erosion         0
		montesMagn      0.627124
		montesFreq      2.58008
		montesSpiky     0.985213
		montesFraction  0.135295
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.13144
		hillsFraction   0.65224
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258813
		craterFreq      0.151531
		craterDensity   1.0835
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471298
		volcanoTemp     1366.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.256, 0.234, 0.000)
		colorShelf     (0.314, 0.272, 0.248, 0.000)
		colorBeach     (0.333, 0.288, 0.263, 0.000)
		colorDesert    (0.351, 0.305, 0.278, 0.000)
		colorLowland   (0.370, 0.321, 0.292, 0.000)
		colorUpland    (0.388, 0.337, 0.307, 0.000)
		colorRock      (0.407, 0.353, 0.321, 0.000)
		colorSnow      (0.425, 0.369, 0.336, 1.000)
		BumpHeight      7.06829
		BumpOffset      1.41366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.665761
		GasToDust   0.25
		Particles   2324
		GasBright   0.145219
		DustBright  0.766627
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.3422
		Period          353.674
		Eccentricity    0.96688
		Inclination     -1.92982
		AscendingNode   131.127
		ArgOfPericenter 160.223
		MeanAnomaly     -172.667
	}
}

Comet	"C104"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            6.13051e-018
	Radius          0.0268847
	InertiaMoment   0.399849

	Oblateness      0.0208434

	RotationPeriod  38.1022
	Obliquity       93.9708
	EqAscendNode    21.5188

	AbsMagn         6.02915
	SlopeParam      5.95205
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.624 0.622 0.619)

	Surface
	{
		SurfStyle       0.159198
		OceanStyle      0.376702
		Randomize      (0.536, 0.679, -0.460)
		colorDistMagn   0.874097
		colorDistFreq   2.49684e-007
		detailScale     0.734131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.781931
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688363
		terraceProb     0.231476
		erosion         0
		montesMagn      0.558261
		montesFreq      2.51411
		montesSpiky     0.954961
		montesFraction  0.616141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.03508e-006
		hillsFraction   0.568305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284796
		craterFreq      0.196677
		craterDensity   0.960146
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472364
		volcanoTemp     1616.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.248, 0.000)
		colorShelf     (0.265, 0.264, 0.263, 0.000)
		colorBeach     (0.281, 0.280, 0.278, 0.000)
		colorDesert    (0.297, 0.295, 0.294, 0.000)
		colorLowland   (0.312, 0.311, 0.309, 0.000)
		colorUpland    (0.328, 0.326, 0.325, 0.000)
		colorRock      (0.343, 0.342, 0.340, 0.000)
		colorSnow      (0.359, 0.357, 0.356, 1.000)
		BumpHeight      0.0241962
		BumpOffset      0.00483924
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.130181
		DustBright  0.466151
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   66.0798
		Period          405.298
		Eccentricity    0.994548
		Inclination     -79.9675
		AscendingNode   -49.6956
		ArgOfPericenter -155.123
		MeanAnomaly     52.0112
	}
}

Comet	"C105"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.74151e-014
	Radius          0.48639
	InertiaMoment   0.398723

	Oblateness      0.0175964

	RotationPeriod  36.2088
	Obliquity       47.1766
	EqAscendNode    6.0962

	AbsMagn         15.2894
	SlopeParam      7.24312
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.844 0.763 0.725)

	Surface
	{
		SurfStyle       0.271733
		OceanStyle      0.0364314
		Randomize      (-0.507, 0.330, 0.574)
		colorDistMagn   0.364177
		colorDistFreq   0.000210006
		detailScale     13.2817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902757
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430242
		terraceProb     0.127221
		erosion         0
		montesMagn      0.496934
		montesFreq      2.3919
		montesSpiky     0.996179
		montesFraction  0.688109
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000461073
		hillsFraction   0.749044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195978
		craterFreq      0.194639
		craterDensity   0.831324
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492717
		volcanoTemp     1418.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.338, 0.305, 0.290, 0.000)
		colorShelf     (0.359, 0.324, 0.308, 0.000)
		colorBeach     (0.380, 0.343, 0.326, 0.000)
		colorDesert    (0.401, 0.362, 0.344, 0.000)
		colorLowland   (0.422, 0.381, 0.362, 0.000)
		colorUpland    (0.443, 0.400, 0.381, 0.000)
		colorRock      (0.464, 0.420, 0.399, 0.000)
		colorSnow      (0.485, 0.439, 0.417, 1.000)
		BumpHeight      0.437751
		BumpOffset      0.0875502
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.217395
		GasToDust   0.25
		Particles   1418
		GasBright   0.0778846
		DustBright  0.202934
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.2057
		Period          236.982
		Eccentricity    0.951624
		Inclination     -149.298
		AscendingNode   -65.6639
		ArgOfPericenter -174.299
		MeanAnomaly     -64.9902
	}
}

Comet	"C106"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.66721e-010
	Radius          10.5054
	InertiaMoment   0.396773

	Oblateness      0.0253868

	RotationPeriod  34.2823
	Obliquity       0.382258
	EqAscendNode    350.674

	AbsMagn         9.30676
	SlopeParam      2.44399
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.755 0.752 0.750)

	Surface
	{
		SurfStyle       0.946718
		OceanStyle      0.757749
		Randomize      (-0.208, 0.702, 0.957)
		colorDistMagn   0.177207
		colorDistFreq   0.0667886
		detailScale     286.869
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845277
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435897
		terraceProb     0.230747
		erosion         0
		montesMagn      0.584519
		montesFreq      2.77266
		montesSpiky     0.996737
		montesFraction  0.397233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.149789
		hillsFraction   0.563013
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238415
		craterFreq      0.265707
		craterDensity   0.739398
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.519914
		volcanoTemp     1710.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.263, 0.300, 0.050)
		colorShelf     (0.302, 0.308, 0.345, 0.040)
		colorBeach     (0.348, 0.353, 0.390, 0.030)
		colorDesert    (0.393, 0.398, 0.442, 0.020)
		colorLowland   (0.438, 0.443, 0.487, 0.030)
		colorUpland    (0.484, 0.489, 0.532, 0.050)
		colorRock      (0.529, 0.534, 0.592, 0.020)
		colorSnow      (0.529, 0.534, 0.592, 1.000)
		BumpHeight      9.4549
		BumpOffset      1.89098
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.698587
		GasToDust   0.25
		Particles   2391
		GasBright   0.257444
		DustBright  0.507861
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.717
		Period          174.774
		Eccentricity    0.95278
		Inclination     122.608
		AscendingNode   143.902
		ArgOfPericenter 45.2799
		MeanAnomaly     81.1184
	}
}

Comet	"C107"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.12917e-017
	Radius          0.0301227
	InertiaMoment   0.399203

	Oblateness      0.0220747

	RotationPeriod  32.3156
	Obliquity       313.588
	EqAscendNode    335.251

	AbsMagn         5.78996
	SlopeParam      3.12216
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.793 0.691 0.651)

	Surface
	{
		SurfStyle       0.818964
		OceanStyle      0.91577
		Randomize      (-0.317, 0.845, -0.836)
		colorDistMagn   0.290071
		colorDistFreq   7.25854e-007
		detailScale     0.822549
		colorConversion true
		snowLevel       2
		tropicLatitude  0.803701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543989
		terraceProb     0.240793
		erosion         0
		montesMagn      0.490675
		montesFreq      2.32688
		montesSpiky     0.965594
		montesFraction  0.390568
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.36336e-006
		hillsFraction   0.538422
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249808
		craterFreq      0.204533
		craterDensity   1.00231
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49071
		volcanoTemp     1521.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.235, 0.182, 0.000)
		colorShelf     (0.317, 0.242, 0.208, 0.000)
		colorBeach     (0.373, 0.283, 0.247, 0.000)
		colorDesert    (0.404, 0.304, 0.241, 0.000)
		colorLowland   (0.444, 0.325, 0.273, 0.000)
		colorUpland    (0.492, 0.394, 0.332, 0.000)
		colorRock      (0.531, 0.429, 0.358, 0.000)
		colorSnow      (0.579, 0.456, 0.377, 1.000)
		BumpHeight      0.0271104
		BumpOffset      0.00542208
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.177865
		DustBright  0.271926
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   47.3343
		Period          245.717
		Eccentricity    0.948143
		Inclination     -94.0605
		AscendingNode   -153.018
		ArgOfPericenter -128.363
		MeanAnomaly     -117.065
	}
}

Comet	"C108"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            8.73327e-014
	Radius          0.650619
	InertiaMoment   0.397811

	Oblateness      0.0325404

	RotationPeriod  30.3009
	Obliquity       266.794
	EqAscendNode    319.828

	AbsMagn         14.3924
	SlopeParam      3.71041
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.572 0.528)

	Surface
	{
		SurfStyle       0.544385
		OceanStyle      0.414375
		Randomize      (0.578, 0.418, -0.729)
		colorDistMagn   0.957163
		colorDistFreq   0.000246631
		detailScale     17.7662
		colorConversion true
		snowLevel       2
		tropicLatitude  0.626344
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.359018
		terraceProb     0.307201
		erosion         0
		montesMagn      0.509774
		montesFreq      3.17634
		montesSpiky     0.998825
		montesFraction  0.450075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00114579
		hillsFraction   0.632058
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250201
		craterFreq      0.218713
		craterDensity   1.03196
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548844
		volcanoTemp     1085.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.194, 0.148, 0.000)
		colorShelf     (0.277, 0.200, 0.169, 0.000)
		colorBeach     (0.325, 0.235, 0.200, 0.000)
		colorDesert    (0.353, 0.252, 0.195, 0.000)
		colorLowland   (0.387, 0.269, 0.222, 0.000)
		colorUpland    (0.429, 0.326, 0.269, 0.000)
		colorRock      (0.463, 0.355, 0.290, 0.000)
		colorSnow      (0.505, 0.378, 0.306, 1.000)
		BumpHeight      0.585557
		BumpOffset      0.117111
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.250221
		GasToDust   0.25
		Particles   1485
		GasBright   0.424615
		DustBright  0.509663
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   38.4559
		Period          179.935
		Eccentricity    0.926877
		Inclination     -125.183
		AscendingNode   -5.86036
		ArgOfPericenter -64.3023
		MeanAnomaly     -68.3604
	}
}

Comet	"C109"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            6.75456e-010
	Radius          11.7706
	InertiaMoment   0.39964

	Oblateness      0.0289007

	RotationPeriod  28.2292
	Obliquity       219.999
	EqAscendNode    304.406

	AbsMagn         9.08854
	SlopeParam      4.27414
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.770 0.767 0.764)

	Surface
	{
		SurfStyle       0.451763
		OceanStyle      0.522447
		Randomize      (0.511, -0.262, 0.857)
		colorDistMagn   0.474719
		colorDistFreq   0.0874243
		detailScale     321.415
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610692
		terraceProb     0.130478
		erosion         0
		montesMagn      0.347199
		montesFreq      2.64669
		montesSpiky     0.926366
		montesFraction  0.711791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.150884
		hillsFraction   0.900046
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252085
		craterFreq      0.204343
		craterDensity   0.821139
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507732
		volcanoTemp     1507.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.327, 0.326, 0.325, 0.000)
		colorBeach     (0.347, 0.345, 0.344, 0.000)
		colorDesert    (0.366, 0.364, 0.363, 0.000)
		colorLowland   (0.385, 0.383, 0.382, 0.000)
		colorUpland    (0.404, 0.403, 0.401, 0.000)
		colorRock      (0.424, 0.422, 0.420, 0.000)
		colorSnow      (0.443, 0.441, 0.439, 1.000)
		BumpHeight      10.5935
		BumpOffset      2.1187
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.731413
		GasToDust   0.25
		Particles   2457
		GasBright   0.00837156
		DustBright  0.610393
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.178
		Period          284.383
		Eccentricity    0.974848
		Inclination     -123.898
		AscendingNode   -53.1819
		ArgOfPericenter -2.14695
		MeanAnomaly     146.089
	}
}

Comet	"C110"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.07978e-017
	Radius          0.0402942
	InertiaMoment   0.398458

	Oblateness      0.0438886

	RotationPeriod  26.0898
	Obliquity       173.205
	EqAscendNode    288.983

	AbsMagn         5.54259
	SlopeParam      4.86103
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.716 0.715 0.712)

	Surface
	{
		SurfStyle       0.353471
		OceanStyle      0.570913
		Randomize      (0.933, 0.431, 0.669)
		colorDistMagn   0.765403
		colorDistFreq   1.07927e-006
		detailScale     1.1003
		colorConversion true
		snowLevel       2
		tropicLatitude  0.488622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570853
		terraceProb     0.178505
		erosion         0
		montesMagn      0.308421
		montesFreq      2.83295
		montesSpiky     0.919712
		montesFraction  0.409881
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.36589e-006
		hillsFraction   0.561691
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228461
		craterFreq      0.202608
		craterDensity   1.03598
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539846
		volcanoTemp     853.749
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.286, 0.285, 0.000)
		colorShelf     (0.304, 0.304, 0.303, 0.000)
		colorBeach     (0.322, 0.322, 0.320, 0.000)
		colorDesert    (0.340, 0.339, 0.338, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.375, 0.374, 0.000)
		colorRock      (0.394, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.411, 0.409, 1.000)
		BumpHeight      0.0362647
		BumpOffset      0.00725295
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0220084
		DustBright  0.281243
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   53.4055
		Period          294.476
		Eccentricity    0.960469
		Inclination     156.373
		AscendingNode   -38.2353
		ArgOfPericenter -175.747
		MeanAnomaly     128.357
	}
}

Comet	"C111"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.60856e-013
	Radius          0.72895
	InertiaMoment   0.395493

	Oblateness      0.0396923

	RotationPeriod  23.8701
	Obliquity       126.411
	EqAscendNode    273.561

	AbsMagn         13.7351
	SlopeParam      5.5354
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.662 0.623 0.567)

	Surface
	{
		SurfStyle       0.715692
		OceanStyle      0.145347
		Randomize      (-0.191, -0.224, 0.313)
		colorDistMagn   0.598201
		colorDistFreq   0.000394951
		detailScale     19.9052
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629925
		terraceProb     0.775039
		erosion         0
		montesMagn      0.444581
		montesFreq      3.05446
		montesSpiky     0.891145
		montesFraction  0.568181
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00106042
		hillsFraction   0.604564
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242219
		craterFreq      0.162302
		craterDensity   0.885082
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437845
		volcanoTemp     1830.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.212, 0.159, 0.000)
		colorShelf     (0.265, 0.218, 0.181, 0.000)
		colorBeach     (0.311, 0.256, 0.215, 0.000)
		colorDesert    (0.338, 0.274, 0.210, 0.000)
		colorLowland   (0.371, 0.293, 0.238, 0.000)
		colorUpland    (0.411, 0.355, 0.289, 0.000)
		colorRock      (0.444, 0.387, 0.312, 0.000)
		colorSnow      (0.483, 0.411, 0.329, 1.000)
		BumpHeight      0.656055
		BumpOffset      0.131211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.283046
		GasToDust   0.25
		Particles   1551
		GasBright   0.103682
		DustBright  0.684056
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.7934
		Period          281.244
		Eccentricity    0.975033
		Inclination     32.6902
		AscendingNode   144.716
		ArgOfPericenter 63.4494
		MeanAnomaly     63.841
	}
}

Comet	"C112"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.2441e-009
	Radius          15.7456
	InertiaMoment   0.398973

	Oblateness      0.0642648

	RotationPeriod  21.5545
	Obliquity       79.6165
	EqAscendNode    258.138

	AbsMagn         8.87351
	SlopeParam      6.46098
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.520 0.514 0.510)

	Surface
	{
		SurfStyle       0.073118
		OceanStyle      0.968914
		Randomize      (0.915, 0.314, 0.568)
		colorDistMagn   0.609126
		colorDistFreq   0.161772
		detailScale     429.961
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845243
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482305
		terraceProb     0.383475
		erosion         0
		montesMagn      0.537638
		montesFreq      2.87252
		montesSpiky     0.927859
		montesFraction  0.739551
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.707508
		hillsFraction   0.547257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22643
		craterFreq      0.205565
		craterDensity   1.0263
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530709
		volcanoTemp     1439.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.206, 0.204, 0.000)
		colorShelf     (0.221, 0.218, 0.217, 0.000)
		colorBeach     (0.234, 0.231, 0.229, 0.000)
		colorDesert    (0.247, 0.244, 0.242, 0.000)
		colorLowland   (0.260, 0.257, 0.255, 0.000)
		colorUpland    (0.273, 0.270, 0.268, 0.000)
		colorRock      (0.286, 0.283, 0.280, 0.000)
		colorSnow      (0.299, 0.296, 0.293, 1.000)
		BumpHeight      14.1711
		BumpOffset      2.83422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.764238
		GasToDust   0.25
		Particles   2523
		GasBright   0.0900368
		DustBright  0.382188
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.6472
		Period          225.093
		Eccentricity    0.94925
		Inclination     -137.228
		AscendingNode   -3.5365
		ArgOfPericenter -155.986
		MeanAnomaly     -145.928
	}
}

Comet	"C113"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.83069e-017
	Radius          0.0451434
	InertiaMoment   0.397386

	Oblateness      0.062114

	RotationPeriod  19.1239
	Obliquity       32.8222
	EqAscendNode    242.715

	AbsMagn         5.28543
	SlopeParam      2.02317
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.573 0.442 0.323)

	Surface
	{
		SurfStyle       0.302658
		OceanStyle      0.199363
		Randomize      (0.876, 0.263, 0.631)
		colorDistMagn   0.413379
		colorDistFreq   1.39557e-006
		detailScale     1.23271
		colorConversion true
		snowLevel       2
		tropicLatitude  0.494049
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422301
		terraceProb     0.158586
		erosion         0
		montesMagn      0.448757
		montesFreq      3.04898
		montesSpiky     0.995252
		montesFraction  0.666581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.41177e-006
		hillsFraction   0.795125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222593
		craterFreq      0.227948
		craterDensity   0.977536
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431928
		volcanoTemp     1487.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.177, 0.129, 0.000)
		colorShelf     (0.243, 0.188, 0.137, 0.000)
		colorBeach     (0.258, 0.199, 0.145, 0.000)
		colorDesert    (0.272, 0.210, 0.153, 0.000)
		colorLowland   (0.286, 0.221, 0.161, 0.000)
		colorUpland    (0.301, 0.232, 0.170, 0.000)
		colorRock      (0.315, 0.243, 0.178, 0.000)
		colorSnow      (0.329, 0.254, 0.186, 1.000)
		BumpHeight      0.040629
		BumpOffset      0.00812581
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.238901
		DustBright  0.71781
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.8818
		Period          148.807
		Eccentricity    0.970478
		Inclination     20.2139
		AscendingNode   -115.57
		ArgOfPericenter 143.76
		MeanAnomaly     20.3359
	}
}

Comet	"C114"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.96276e-013
	Radius          0.975173
	InertiaMoment   0.399428

	Oblateness      0.108869

	RotationPeriod  16.554
	Obliquity       346.028
	EqAscendNode    227.293

	AbsMagn         13.2041
	SlopeParam      2.79579
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.621 0.616 0.612)

	Surface
	{
		SurfStyle       0.0765246
		OceanStyle      0.311259
		Randomize      (-0.786, -0.038, -0.800)
		colorDistMagn   0.812402
		colorDistFreq   0.000300421
		detailScale     26.6287
		colorConversion true
		snowLevel       2
		tropicLatitude  0.586361
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66179
		terraceProb     0.373316
		erosion         0
		montesMagn      0.564999
		montesFreq      2.68695
		montesSpiky     0.972004
		montesFraction  0.734977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00243875
		hillsFraction   0.665531
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226161
		craterFreq      0.206218
		craterDensity   0.792529
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.563603
		volcanoTemp     1295.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.246, 0.245, 0.000)
		colorShelf     (0.264, 0.262, 0.260, 0.000)
		colorBeach     (0.279, 0.277, 0.275, 0.000)
		colorDesert    (0.295, 0.293, 0.291, 0.000)
		colorLowland   (0.310, 0.308, 0.306, 0.000)
		colorUpland    (0.326, 0.323, 0.321, 0.000)
		colorRock      (0.341, 0.339, 0.336, 0.000)
		colorSnow      (0.357, 0.354, 0.352, 1.000)
		BumpHeight      0.877655
		BumpOffset      0.175531
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.315872
		GasToDust   0.25
		Particles   1617
		GasBright   0.197973
		DustBright  0.443224
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.888
		Period          340.966
		Eccentricity    0.982651
		Inclination     30.37
		AscendingNode   102.876
		ArgOfPericenter 111.193
		MeanAnomaly     86.2473
	}
}

Comet	"C115"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.29148e-009
	Radius          17.6394
	InertiaMoment   0.398163

	Oblateness      0.119091

	RotationPeriod  13.8128
	Obliquity       299.234
	EqAscendNode    211.87

	AbsMagn         8.66097
	SlopeParam      3.41854
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.624 0.622)

	Surface
	{
		SurfStyle       0.831512
		OceanStyle      0.415144
		Randomize      (0.527, -0.443, -0.567)
		colorDistMagn   0.963554
		colorDistFreq   0.194756
		detailScale     481.674
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389039
		terraceProb     0.186745
		erosion         0
		montesMagn      0.390466
		montesFreq      2.69426
		montesSpiky     0.959482
		montesFraction  0.421766
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.730316
		hillsFraction   0.398862
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247925
		craterFreq      0.167746
		craterDensity   0.946514
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450456
		volcanoTemp     1426.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.212, 0.174, 0.000)
		colorShelf     (0.252, 0.219, 0.199, 0.000)
		colorBeach     (0.296, 0.256, 0.237, 0.000)
		colorDesert    (0.321, 0.275, 0.230, 0.000)
		colorLowland   (0.353, 0.293, 0.261, 0.000)
		colorUpland    (0.391, 0.356, 0.317, 0.000)
		colorRock      (0.422, 0.387, 0.342, 0.000)
		colorSnow      (0.460, 0.412, 0.361, 1.000)
		BumpHeight      15.8755
		BumpOffset      3.1751
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.797064
		GasToDust   0.25
		Particles   2590
		GasBright   0.119787
		DustBright  0.205897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.9664
		Period          227.512
		Eccentricity    0.972728
		Inclination     32.5222
		AscendingNode   114.864
		ArgOfPericenter -110.194
		MeanAnomaly     -42.6116
	}
}

Comet	"C116"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            7.05566e-017
	Radius          0.0603956
	InertiaMoment   0.399854

	Oblateness      0.249

	RotationPeriod  10.8575
	Obliquity       252.439
	EqAscendNode    196.448

	AbsMagn         5.01654
	SlopeParam      3.9885
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.628 0.626 0.621)

	Surface
	{
		SurfStyle       0.297276
		OceanStyle      0.299113
		Randomize      (0.486, -0.571, -0.618)
		colorDistMagn   0.827776
		colorDistFreq   1.71675e-006
		detailScale     1.6492
		colorConversion true
		snowLevel       2
		tropicLatitude  0.908404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.278734
		terraceProb     0.310815
		erosion         0
		montesMagn      0.624202
		montesFreq      2.59497
		montesSpiky     0.89879
		montesFraction  0.641689
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.50935e-006
		hillsFraction   0.709379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249268
		craterFreq      0.204628
		craterDensity   0.865457
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560694
		volcanoTemp     1863.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.250, 0.248, 0.000)
		colorShelf     (0.267, 0.266, 0.264, 0.000)
		colorBeach     (0.283, 0.282, 0.279, 0.000)
		colorDesert    (0.299, 0.297, 0.295, 0.000)
		colorLowland   (0.314, 0.313, 0.311, 0.000)
		colorUpland    (0.330, 0.329, 0.326, 0.000)
		colorRock      (0.346, 0.344, 0.342, 0.000)
		colorSnow      (0.361, 0.360, 0.357, 1.000)
		BumpHeight      0.054356
		BumpOffset      0.0108712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.345818
		DustBright  0.464352
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   48.9263
		Period          258.217
		Eccentricity    0.983957
		Inclination     -16.0347
		AscendingNode   -60.89
		ArgOfPericenter -174.144
		MeanAnomaly     -173.853
	}
}

Comet	"C117"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            5.45704e-013
	Radius          1.09237
	InertiaMoment   0.39873

	Oblateness      0.249

	RotationPeriod  7.62802
	Obliquity       205.645
	EqAscendNode    181.025

	AbsMagn         12.7516
	SlopeParam      4.5575
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.587 0.584 0.582)

	Surface
	{
		SurfStyle       0.192684
		OceanStyle      0.603543
		Randomize      (0.723, -0.290, 0.603)
		colorDistMagn   0.828713
		colorDistFreq   0.000276943
		detailScale     29.8291
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470908
		terraceProb     0.19301
		erosion         0
		montesMagn      0.549216
		montesFreq      3.02075
		montesSpiky     0.889663
		montesFraction  0.568453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00235181
		hillsFraction   0.88529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220015
		craterFreq      0.185296
		craterDensity   0.838384
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505222
		volcanoTemp     1287.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.234, 0.233, 0.000)
		colorShelf     (0.250, 0.248, 0.247, 0.000)
		colorBeach     (0.264, 0.263, 0.262, 0.000)
		colorDesert    (0.279, 0.277, 0.276, 0.000)
		colorLowland   (0.294, 0.292, 0.291, 0.000)
		colorUpland    (0.308, 0.307, 0.305, 0.000)
		colorRock      (0.323, 0.321, 0.320, 0.000)
		colorSnow      (0.338, 0.336, 0.334, 1.000)
		BumpHeight      0.983136
		BumpOffset      0.196627
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.348698
		GasToDust   0.25
		Particles   1684
		GasBright   0.24035
		DustBright  0.254308
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   62.7122
		Period          374.714
		Eccentricity    0.980505
		Inclination     31.6306
		AscendingNode   -25.1639
		ArgOfPericenter 70.2446
		MeanAnomaly     -20.1281
	}
}

Comet	"C118"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.22063e-009
	Radius          23.601
	InertiaMoment   0.396793

	Oblateness      0.249

	RotationPeriod  4.03598
	Obliquity       158.851
	EqAscendNode    165.603

	AbsMagn         8.45029
	SlopeParam      5.17674
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.586 0.503)

	Surface
	{
		SurfStyle       0.0815109
		OceanStyle      0.123187
		Randomize      (0.642, -0.148, -0.489)
		colorDistMagn   0.1163
		colorDistFreq   0.311683
		detailScale     644.466
		colorConversion true
		snowLevel       2
		tropicLatitude  0.544182
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647227
		terraceProb     0.415192
		erosion         0
		montesMagn      0.437089
		montesFreq      2.50931
		montesSpiky     0.924303
		montesFraction  0.334646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.18878
		hillsFraction   0.442885
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228707
		craterFreq      0.211696
		craterDensity   0.831939
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573392
		volcanoTemp     1456.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.234, 0.201, 0.000)
		colorShelf     (0.270, 0.249, 0.214, 0.000)
		colorBeach     (0.286, 0.264, 0.226, 0.000)
		colorDesert    (0.302, 0.278, 0.239, 0.000)
		colorLowland   (0.318, 0.293, 0.251, 0.000)
		colorUpland    (0.334, 0.308, 0.264, 0.000)
		colorRock      (0.350, 0.322, 0.277, 0.000)
		colorSnow      (0.366, 0.337, 0.289, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.82989
		GasToDust   0.25
		Particles   2656
		GasBright   0.0439996
		DustBright  0.935144
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.4564
		Period          223.652
		Eccentricity    0.973655
		Inclination     166.873
		AscendingNode   -32.2395
		ArgOfPericenter -4.8809
		MeanAnomaly     -179.524
	}
}

Comet	"C119"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.29956e-016
	Radius          0.0676475
	InertiaMoment   0.399208

	Oblateness      0.00135019

	RotationPeriod  129.624
	Obliquity       112.056
	EqAscendNode    150.18

	AbsMagn         4.73342
	SlopeParam      5.93967
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.414 0.407 0.404)

	Surface
	{
		SurfStyle       0.884716
		OceanStyle      0.744444
		Randomize      (0.515, -0.414, -0.213)
		colorDistMagn   0.321015
		colorDistFreq   1.29661e-006
		detailScale     1.84723
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905001
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652535
		terraceProb     0.32111
		erosion         0
		montesMagn      0.415787
		montesFreq      3.3893
		montesSpiky     0.982776
		montesFraction  0.613965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.27455e-005
		hillsFraction   0.595085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214981
		craterFreq      0.26459
		craterDensity   0.892757
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508073
		volcanoTemp     1690.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.141, 0.143, 0.161, 0.050)
		colorShelf     (0.165, 0.167, 0.186, 0.040)
		colorBeach     (0.190, 0.192, 0.210, 0.030)
		colorDesert    (0.215, 0.216, 0.238, 0.020)
		colorLowland   (0.240, 0.240, 0.262, 0.030)
		colorUpland    (0.265, 0.265, 0.287, 0.050)
		colorRock      (0.290, 0.289, 0.319, 0.020)
		colorSnow      (0.290, 0.289, 0.319, 1.000)
		BumpHeight      0.0608828
		BumpOffset      0.0121766
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0690056
		DustBright  0.594625
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.3637
		Period          172.324
		Eccentricity    0.943039
		Inclination     -110.951
		AscendingNode   70.3444
		ArgOfPericenter 175.829
		MeanAnomaly     173.61
	}
}

Comet	"C120"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.00512e-012
	Radius          1.46171
	InertiaMoment   0.39782

	Oblateness      0.00223321

	RotationPeriod  114.813
	Obliquity       65.2621
	EqAscendNode    134.757

	AbsMagn         12.353
	SlopeParam      7.21472
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.606 0.490)

	Surface
	{
		SurfStyle       0.743841
		OceanStyle      0.439692
		Randomize      (0.033, -0.027, 0.026)
		colorDistMagn   0.477073
		colorDistFreq   0.00158328
		detailScale     39.9143
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464203
		terraceProb     0.33215
		erosion         0
		montesMagn      0.535236
		montesFreq      2.89855
		montesSpiky     0.84054
		montesFraction  0.550307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00542117
		hillsFraction   0.634819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223008
		craterFreq      0.228894
		craterDensity   0.83339
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550174
		volcanoTemp     1655.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.206, 0.137, 0.000)
		colorShelf     (0.277, 0.212, 0.157, 0.000)
		colorBeach     (0.326, 0.248, 0.186, 0.000)
		colorDesert    (0.353, 0.267, 0.181, 0.000)
		colorLowland   (0.388, 0.285, 0.206, 0.000)
		colorUpland    (0.430, 0.345, 0.250, 0.000)
		colorRock      (0.464, 0.376, 0.269, 0.000)
		colorSnow      (0.506, 0.400, 0.284, 1.000)
		BumpHeight      1.31553
		BumpOffset      0.263107
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.381524
		GasToDust   0.25
		Particles   1750
		GasBright   0.0567526
		DustBright  0.291364
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.879
		Period          306.747
		Eccentricity    0.981276
		Inclination     133.506
		AscendingNode   -160.579
		ArgOfPericenter 58.8566
		MeanAnomaly     95.5241
	}
}

Comet	"C121"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            7.77386e-009
	Radius          26.4319
	InertiaMoment   0.399645

	Oblateness      0.00199407

	RotationPeriod  106.601
	Obliquity       18.4678
	EqAscendNode    119.335

	AbsMagn         8.24085
	SlopeParam      2.43353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.437 0.432 0.427)

	Surface
	{
		SurfStyle       0.345748
		OceanStyle      0.127098
		Randomize      (0.458, 0.329, 0.333)
		colorDistMagn   0.878183
		colorDistFreq   0.149546
		detailScale     721.766
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.283059
		terraceProb     0.149532
		erosion         0
		montesMagn      0.422481
		montesFreq      3.46358
		montesSpiky     0.927284
		montesFraction  0.481399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85275
		hillsFraction   0.662724
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248059
		craterFreq      0.181787
		craterDensity   0.970149
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449023
		volcanoTemp     1244.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.173, 0.171, 0.000)
		colorShelf     (0.186, 0.184, 0.181, 0.000)
		colorBeach     (0.197, 0.195, 0.192, 0.000)
		colorDesert    (0.207, 0.205, 0.203, 0.000)
		colorLowland   (0.218, 0.216, 0.213, 0.000)
		colorUpland    (0.229, 0.227, 0.224, 0.000)
		colorRock      (0.240, 0.238, 0.235, 0.000)
		colorSnow      (0.251, 0.249, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.862716
		GasToDust   0.25
		Particles   2722
		GasBright   0.184898
		DustBright  0.647705
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.4599
		Period          152.631
		Eccentricity    0.957239
		Inclination     89.6109
		AscendingNode   104.333
		ArgOfPericenter 6.35441
		MeanAnomaly     -4.23521
	}
}

Comet	"C122"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.39363e-016
	Radius          0.0905297
	InertiaMoment   0.398465

	Oblateness      0.00290637

	RotationPeriod  100.642
	Obliquity       331.674
	EqAscendNode    103.912

	AbsMagn         4.43291
	SlopeParam      3.11366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.472 0.469)

	Surface
	{
		SurfStyle       0.82372
		OceanStyle      0.725638
		Randomize      (0.282, -0.571, -0.465)
		colorDistMagn   0.533046
		colorDistFreq   4.83878e-006
		detailScale     2.47206
		colorConversion true
		snowLevel       2
		tropicLatitude  0.373634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.695059
		terraceProb     0.258276
		erosion         0
		montesMagn      0.445463
		montesFreq      3.9044
		montesSpiky     0.822858
		montesFraction  0.720806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.92277e-005
		hillsFraction   0.531831
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205015
		craterFreq      0.150492
		craterDensity   0.912198
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517874
		volcanoTemp     1391.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.160, 0.131, 0.000)
		colorShelf     (0.190, 0.165, 0.150, 0.000)
		colorBeach     (0.223, 0.193, 0.178, 0.000)
		colorDesert    (0.242, 0.208, 0.173, 0.000)
		colorLowland   (0.265, 0.222, 0.197, 0.000)
		colorUpland    (0.294, 0.269, 0.239, 0.000)
		colorRock      (0.318, 0.292, 0.258, 0.000)
		colorSnow      (0.346, 0.311, 0.272, 1.000)
		BumpHeight      0.0814767
		BumpOffset      0.0162953
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.145363
		DustBright  0.371727
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.1875
		Period          309.338
		Eccentricity    0.965976
		Inclination     -15.5517
		AscendingNode   128.703
		ArgOfPericenter -62.0984
		MeanAnomaly     -56.1987
	}
}

Comet	"C123"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.8513e-012
	Radius          1.63681
	InertiaMoment   0.395557

	Oblateness      0.00242191

	RotationPeriod  95.8537
	Obliquity       284.879
	EqAscendNode    88.4896

	AbsMagn         11.9935
	SlopeParam      3.70261
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.686 0.652)

	Surface
	{
		SurfStyle       0.80351
		OceanStyle      0.535775
		Randomize      (0.389, -0.157, -0.543)
		colorDistMagn   0.279895
		colorDistFreq   0.000619181
		detailScale     44.6958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.620063
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66779
		terraceProb     0.369613
		erosion         0
		montesMagn      0.453138
		montesFreq      3.29764
		montesSpiky     0.944867
		montesFraction  0.230893
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00749644
		hillsFraction   0.518195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265489
		craterFreq      0.221148
		craterDensity   0.890811
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56292
		volcanoTemp     1643.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.233, 0.183, 0.000)
		colorShelf     (0.290, 0.240, 0.209, 0.000)
		colorBeach     (0.341, 0.281, 0.248, 0.000)
		colorDesert    (0.370, 0.302, 0.241, 0.000)
		colorLowland   (0.406, 0.322, 0.274, 0.000)
		colorUpland    (0.449, 0.391, 0.333, 0.000)
		colorRock      (0.485, 0.425, 0.359, 0.000)
		colorSnow      (0.529, 0.453, 0.378, 1.000)
		BumpHeight      1.47313
		BumpOffset      0.294625
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.41435
		GasToDust   0.25
		Particles   1816
		GasBright   0.068569
		DustBright  0.133008
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   69.6492
		Period          438.577
		Eccentricity    0.974508
		Inclination     117.799
		AscendingNode   -141.042
		ArgOfPericenter -159.883
		MeanAnomaly     117.732
	}
}

Comet	"C124"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.43185e-008
	Radius          35.3773
	InertiaMoment   0.398979

	Oblateness      0.00349251

	RotationPeriod  91.7882
	Obliquity       238.085
	EqAscendNode    73.067

	AbsMagn         8.03207
	SlopeParam      4.26636
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.622 0.578)

	Surface
	{
		SurfStyle       0.836831
		OceanStyle      0.780217
		Randomize      (0.101, -0.370, -0.832)
		colorDistMagn   0.31961
		colorDistFreq   0.427201
		detailScale     966.036
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676173
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662527
		terraceProb     0.428147
		erosion         0
		montesMagn      0.349928
		montesFreq      3.03193
		montesSpiky     0.977122
		montesFraction  0.650863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85246
		hillsFraction   0.547039
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268607
		craterFreq      0.18218
		craterDensity   0.86649
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532265
		volcanoTemp     1563.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.212, 0.162, 0.000)
		colorShelf     (0.288, 0.218, 0.185, 0.000)
		colorBeach     (0.338, 0.255, 0.220, 0.000)
		colorDesert    (0.367, 0.274, 0.214, 0.000)
		colorLowland   (0.403, 0.292, 0.243, 0.000)
		colorUpland    (0.446, 0.355, 0.295, 0.000)
		colorRock      (0.482, 0.386, 0.318, 0.000)
		colorSnow      (0.525, 0.411, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.895542
		GasToDust   0.25
		Particles   2788
		GasBright   0.273882
		DustBright  0.412181
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.1849
		Period          334.879
		Eccentricity    0.968709
		Inclination     -155.96
		AscendingNode   -137.253
		ArgOfPericenter -55.2502
		MeanAnomaly     3.18308
	}
}

Comet	"C125"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.40878e-016
	Radius          0.101359
	InertiaMoment   0.397398

	Oblateness      0.00287102

	RotationPeriod  88.2155
	Obliquity       191.291
	EqAscendNode    57.6444

	AbsMagn         4.11078
	SlopeParam      4.85257
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.655 0.652)

	Surface
	{
		SurfStyle       0.945706
		OceanStyle      0.0926537
		Randomize      (-0.306, 0.569, -0.911)
		colorDistMagn   0.58646
		colorDistFreq   5.84622e-006
		detailScale     2.76777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503329
		terraceProb     0.452604
		erosion         0
		montesMagn      0.396694
		montesFreq      2.67992
		montesSpiky     0.861638
		montesFraction  0.309914
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08254e-005
		hillsFraction   0.750668
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219825
		craterFreq      0.265657
		craterDensity   1.0885
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.403122
		volcanoTemp     1516.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.229, 0.261, 0.050)
		colorShelf     (0.264, 0.269, 0.300, 0.040)
		colorBeach     (0.304, 0.308, 0.339, 0.030)
		colorDesert    (0.343, 0.347, 0.385, 0.020)
		colorLowland   (0.383, 0.387, 0.424, 0.030)
		colorUpland    (0.423, 0.426, 0.463, 0.050)
		colorRock      (0.462, 0.465, 0.515, 0.020)
		colorSnow      (0.462, 0.465, 0.515, 1.000)
		BumpHeight      0.0912229
		BumpOffset      0.0182446
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.169806
		DustBright  0.200744
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.9596
		Period          395.036
		Eccentricity    0.963428
		Inclination     -73.4228
		AscendingNode   -69.6485
		ArgOfPericenter -94.1353
		MeanAnomaly     -119.473
	}
}

Comet	"C126"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            3.40986e-012
	Radius          2.19109
	InertiaMoment   0.399433

	Oblateness      0.00406983

	RotationPeriod  85.0003
	Obliquity       144.496
	EqAscendNode    42.2218

	AbsMagn         11.6636
	SlopeParam      5.52505
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.635 0.523)

	Surface
	{
		SurfStyle       0.715447
		OceanStyle      0.831348
		Randomize      (0.419, 0.770, -0.935)
		colorDistMagn   0.568983
		colorDistFreq   0.00110808
		detailScale     59.8313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966539
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297134
		terraceProb     0.412513
		erosion         0
		montesMagn      0.502652
		montesFreq      3.98753
		montesSpiky     0.889983
		montesFraction  0.661721
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0173005
		hillsFraction   0.639569
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208919
		craterFreq      0.195922
		craterDensity   0.815135
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443664
		volcanoTemp     1511.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.216, 0.147, 0.000)
		colorShelf     (0.292, 0.222, 0.167, 0.000)
		colorBeach     (0.343, 0.260, 0.199, 0.000)
		colorDesert    (0.372, 0.279, 0.194, 0.000)
		colorLowland   (0.408, 0.298, 0.220, 0.000)
		colorUpland    (0.452, 0.362, 0.267, 0.000)
		colorRock      (0.489, 0.394, 0.288, 0.000)
		colorSnow      (0.532, 0.419, 0.303, 1.000)
		BumpHeight      1.97198
		BumpOffset      0.394396
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.447176
		GasToDust   0.25
		Particles   1883
		GasBright   0.0147911
		DustBright  0.840245
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   60.6491
		Period          356.376
		Eccentricity    0.97166
		Inclination     -99.5507
		AscendingNode   -77.7569
		ArgOfPericenter -3.23711
		MeanAnomaly     -51.451
	}
}

Comet	"C127"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            2.63729e-008
	Radius          39.6021
	InertiaMoment   0.398171

	Oblateness      0.00331813

	RotationPeriod  82.0561
	Obliquity       97.702
	EqAscendNode    26.7992

	AbsMagn         7.82338
	SlopeParam      6.44461
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.825 0.764 0.709)

	Surface
	{
		SurfStyle       0.56129
		OceanStyle      0.902117
		Randomize      (-0.057, 0.079, 0.184)
		colorDistMagn   0.331261
		colorDistFreq   1.00872
		detailScale     1081.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508622
		terraceProb     0.382461
		erosion         0
		montesMagn      0.546324
		montesFreq      3.09693
		montesSpiky     0.977686
		montesFraction  0.465985
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.73187
		hillsFraction   0.458045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228665
		craterFreq      0.234415
		craterDensity   0.902756
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.465354
		volcanoTemp     1342.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.260, 0.199, 0.000)
		colorShelf     (0.330, 0.267, 0.227, 0.000)
		colorBeach     (0.388, 0.313, 0.269, 0.000)
		colorDesert    (0.421, 0.336, 0.262, 0.000)
		colorLowland   (0.462, 0.359, 0.298, 0.000)
		colorUpland    (0.512, 0.435, 0.362, 0.000)
		colorRock      (0.553, 0.474, 0.390, 0.000)
		colorSnow      (0.602, 0.504, 0.411, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.928368
		GasToDust   0.25
		Particles   2855
		GasBright   0.0411894
		DustBright  0.498334
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   40.777
		Period          196.469
		Eccentricity    0.965484
		Inclination     168.714
		AscendingNode   55.8887
		ArgOfPericenter -122.752
		MeanAnomaly     82.6788
	}
}

Comet	"C128"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            8.12039e-016
	Radius          0.135706
	InertiaMoment   0.399859

	Oblateness      0.0046696

	RotationPeriod  79.3237
	Obliquity       50.9077
	EqAscendNode    11.3766

	AbsMagn         3.76121
	SlopeParam      2.01056
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.578 0.574)

	Surface
	{
		SurfStyle       0.695217
		OceanStyle      0.531719
		Randomize      (0.141, -0.560, 0.958)
		colorDistMagn   0.779897
		colorDistFreq   1.45207e-005
		detailScale     3.70567
		colorConversion true
		snowLevel       2
		tropicLatitude  0.921246
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410366
		terraceProb     0.38742
		erosion         0
		montesMagn      0.597681
		montesFreq      2.71407
		montesSpiky     0.990143
		montesFraction  0.805715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.75883e-005
		hillsFraction   0.657377
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215506
		craterFreq      0.182353
		craterDensity   0.913701
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511251
		volcanoTemp     1743.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.197, 0.161, 0.000)
		colorShelf     (0.234, 0.202, 0.184, 0.000)
		colorBeach     (0.275, 0.237, 0.218, 0.000)
		colorDesert    (0.298, 0.254, 0.213, 0.000)
		colorLowland   (0.327, 0.272, 0.241, 0.000)
		colorUpland    (0.362, 0.330, 0.293, 0.000)
		colorRock      (0.391, 0.359, 0.316, 0.000)
		colorSnow      (0.426, 0.382, 0.333, 1.000)
		BumpHeight      0.122135
		BumpOffset      0.024427
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0303285
		DustBright  0.193681
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.6539
		Period          225.144
		Eccentricity    0.954786
		Inclination     -71.7457
		AscendingNode   74.9441
		ArgOfPericenter -68.1288
		MeanAnomaly     75.9237
	}
}

Comet	"C129"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            6.28054e-012
	Radius          2.45227
	InertiaMoment   0.398736

	Oblateness      0.00378851

	RotationPeriod  76.7608
	Obliquity       4.11342
	EqAscendNode    355.954

	AbsMagn         11.3569
	SlopeParam      2.78653
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.647 0.521 0.473)

	Surface
	{
		SurfStyle       0.534618
		OceanStyle      0.14941
		Randomize      (-0.710, 0.293, 0.503)
		colorDistMagn   0.947116
		colorDistFreq   0.00316943
		detailScale     66.9634
		colorConversion true
		snowLevel       2
		tropicLatitude  0.929128
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550911
		terraceProb     0.139021
		erosion         0
		montesMagn      0.346407
		montesFreq      3.11499
		montesSpiky     0.946669
		montesFraction  0.86951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0144009
		hillsFraction   0.383877
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269502
		craterFreq      0.264868
		craterDensity   0.748985
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431441
		volcanoTemp     1748.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.177, 0.132, 0.000)
		colorShelf     (0.259, 0.183, 0.151, 0.000)
		colorBeach     (0.304, 0.214, 0.180, 0.000)
		colorDesert    (0.330, 0.229, 0.175, 0.000)
		colorLowland   (0.362, 0.245, 0.199, 0.000)
		colorUpland    (0.401, 0.297, 0.241, 0.000)
		colorRock      (0.433, 0.323, 0.260, 0.000)
		colorSnow      (0.472, 0.344, 0.274, 1.000)
		BumpHeight      2.20705
		BumpOffset      0.441409
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.480002
		GasToDust   0.25
		Particles   1949
		GasBright   0.137756
		DustBright  0.57074
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   44.1118
		Period          221.056
		Eccentricity    0.987889
		Inclination     110.616
		AscendingNode   73.9533
		ArgOfPericenter -170.223
		MeanAnomaly     -59.3823
	}
}

Comet	"C130"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            4.85755e-008
	Radius          53.0321
	InertiaMoment   0.396811

	Oblateness      0.00524449

	RotationPeriod  74.336
	Obliquity       317.319
	EqAscendNode    340.531

	AbsMagn         7.6142
	SlopeParam      3.41048
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.511 0.508)

	Surface
	{
		SurfStyle       0.195875
		OceanStyle      0.899104
		Randomize      (0.468, 0.551, 0.031)
		colorDistMagn   0.173321
		colorDistFreq   0.491131
		detailScale     1448.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554871
		terraceProb     0.381972
		erosion         0
		montesMagn      0.408992
		montesFreq      2.87617
		montesSpiky     0.967626
		montesFraction  0.879132
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.98049
		hillsFraction   0.679738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275929
		craterFreq      0.231231
		craterDensity   0.84369
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570541
		volcanoTemp     1251.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.205, 0.203, 0.000)
		colorShelf     (0.219, 0.217, 0.216, 0.000)
		colorBeach     (0.232, 0.230, 0.229, 0.000)
		colorDesert    (0.245, 0.243, 0.241, 0.000)
		colorLowland   (0.258, 0.256, 0.254, 0.000)
		colorUpland    (0.271, 0.268, 0.267, 0.000)
		colorRock      (0.284, 0.281, 0.280, 0.000)
		colorSnow      (0.297, 0.294, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.961194
		GasToDust   0.25
		Particles   2921
		GasBright   0.0996132
		DustBright  0.29337
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   54.9546
		Period          307.381
		Eccentricity    0.96375
		Inclination     93.5194
		AscendingNode   81.6809
		ArgOfPericenter -153.223
		MeanAnomaly     -60.8827
	}
}

Comet	"C131"
{
	ParentBody     "Daca"
	Class	       "Asteroid"

	Mass            1.49568e-015
	Radius          0.151849
	InertiaMoment   0.399214

	Oblateness      0.00429779

	RotationPeriod  72.0253
	Obliquity       270.525
	EqAscendNode    325.109

	AbsMagn         3.37584
	SlopeParam      3.98078
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.470 0.467 0.465)

	Surface
	{
		SurfStyle       0.00115776
		OceanStyle      0.354464
		Randomize      (-0.687, -0.784, -0.014)
		colorDistMagn   0.192711
		colorDistFreq   3.26829e-006
		detailScale     4.14649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361827
		terraceProb     0.274282
		erosion         0
		montesMagn      0.413085
		montesFreq      2.4625
		montesSpiky     0.954364
		montesFraction  0.833099
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.52955e-005
		hillsFraction   0.548065
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242891
		craterFreq      0.166006
		craterDensity   0.721871
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50482
		volcanoTemp     1026.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.187, 0.186, 0.000)
		colorShelf     (0.200, 0.198, 0.198, 0.000)
		colorBeach     (0.211, 0.210, 0.209, 0.000)
		colorDesert    (0.223, 0.222, 0.221, 0.000)
		colorLowland   (0.235, 0.233, 0.233, 0.000)
		colorUpland    (0.247, 0.245, 0.244, 0.000)
		colorRock      (0.258, 0.257, 0.256, 0.000)
		colorSnow      (0.270, 0.268, 0.267, 1.000)
		BumpHeight      0.136664
		BumpOffset      0.0273328
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0316361
		GasToDust   0.25
		Particles   1043
		GasBright   0.274231
		DustBright  0.603238
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   57.9686
		Period          333.013
		Eccentricity    0.971259
		Inclination     68.6508
		AscendingNode   -83.7973
		ArgOfPericenter 140.273
		MeanAnomaly     101.568
	}
}