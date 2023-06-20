// http://starwars.wikia.com/wiki/Dathomir
// Region : Outer Rim
// Sector : Quelii Sector
// Grid location : O6
// X : 4716.6, Y : 5436.59, Z : 111.46904432322435
Planet	"Arro"
{
	ParentBody     "Domir"
	Class	       "Terra"

	Mass            0.850475
	Radius          6706.16

	Clouds
	{
		Height          72.146
		Velocity        50.3607
		BumpHeight      6.92279
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.00359
		mainOctaves     10
		Coverage        0.291616
		stripeZones     1
		stripeFluct     0
		stripeTwist     3.5
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Venus"
		Height          270.953
		Density         188.823
		Pressure        278.268
		Greenhouse      480.792
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.139493
		//Period          0.048996
		Eccentricity    0.043885
		Inclination     1.60778
		AscendingNode   -143.996
		ArgOfPericenter 97.4539
		MeanAnomaly     78.5056
	}
}

Planet	"Euton"
{
	ParentBody     "Domir"
	Class	       "Ferria"

	Mass            0.148363

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.461139
		//Period          0.294497
		Eccentricity    0.0547657
		Inclination     -0.775715
		AscendingNode   -93.4977
		ArgOfPericenter 57.2581
		MeanAnomaly     256.698
	}
}

Planet	"Laseel"
{
	ParentBody     "Domir"
	Class	       "Terra"

	Mass            1.65532
	Radius          8980.18
	Color          (0.457 0.518 0.564)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.415079
		OceanStyle      0.793651
		Randomize      (-0.718, 0.841, 0.226)
		colorDistMagn   0.0963856
		colorDistFreq   1121.43
		detailScale     23097.5
		colorConversion true
		drivenDarkening -1
		seaLevel        0.394579
		snowLevel       0.768962
		tropicLatitude  0.621316
		icecapLatitude  1
		icecapHeight    0.211051
		climatePole     0.809524
		climateTropic   0.690476
		climateEquator  0.492063
		heightTempGrad  0.595238
		tropicWidth     0.5
		mainFreq        1.3115
		venusFreq       0.768962
		venusMagn       0.1843
		mareFreq        0.215443
		mareDensity     0.0613091
		terraceProb     0.327453
		erosion         0.12029
		montesMagn      0.165926
		montesFreq      500
		montesSpiky     0.983196
		montesFraction  0.882997
		dunesMagn       0.0360777
		dunesFreq       79.6283
		dunesFraction   0.551064
		hillsMagn       0.114799
		hillsFreq       731.27
		hillsFraction   0.728687
		hills2Fraction  0.177889
		riversMagn      55.076
		riversFreq      3.48111
		riversSin       5.61545
		riversOctaves   2
		canyonsMagn     0.0440713
		canyonsFreq     100
		canyonFraction  0.98691
		cracksMagn      0.0948502
		cracksFreq      0.493829
		cracksOctaves   0
		craterMagn      0.826363
		craterFreq      26.7381
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.687082
		volcanoFreq     0.785683
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.07722
		volcanoFlows    0.695974
		volcanoRadius   0.5447
		volcanoTemp     1157.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.15493
		stripeFluct     0
		stripeTwist     0.23481
		cycloneMagn     2.93144
		cycloneFreq     0.811138
		cycloneDensity  0.323254
		cycloneOctaves  2
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.229, 0.200, 0.020, 0.000)
		colorUpPlants  (0.498, 0.468, 0.050, 0.000)
		BumpHeight      14.7285
		BumpOffset      5.81156
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
		Height          6.12109
		Velocity        50.3607
		BumpHeight      6.12137
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.12963
		mainOctaves     10
		Coverage        0.37408
		stripeZones     2.15493
		stripeFluct     0
		stripeTwist     0.23481
	}


	Ocean
	{
		Height          5.81156
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          59.4301
		Density         5.64107
		Pressure        4.9354
		Greenhouse      37.0273
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.238161
		Saturation      0.71319

	}

	Aurora
	{
		Height      160.783
		NorthLat    76.0946
		NorthLon    -144.37
		NorthRadius 2246.68
		NorthWidth  686.49
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -55.8508
		SouthLon    49.4074
		SouthRadius 2322.58
		SouthWidth  537.478
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     12828.5
		OuterRadius     28554.6
		Rotation//Period  4.3133
		RotationOffset  0
		FrontBright     0.524441
		BackBright      0.522936
		Density         0.642738
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.733891
		Eccentricity    0.00538491
		Inclination     0.173747
		AscendingNode   -69.4862
		ArgOfPericenter 194.863
		MeanAnomaly     66.8474
	}
}

DwarfMoon	"Laseel 1"
{
	ParentBody     "Laseel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.199182397
		SemiMajorAxisKm 22193.3136
		Eccentricity    0.00152671756
		Inclination     2.7480916
		AscendingNode   5.36993
		ArgOfPericenter 170.219
		MeanAnomaly     28.5037
	}
}

Moon	"Laseel 2"
{
	ParentBody     "Laseel"
	Class	       "Selena"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00104669
		Eccentricity    0.352918
		Inclination     -16.2074
		AscendingNode   4.25586
		ArgOfPericenter 31.6745
		MeanAnomaly     -14.7478
	}
}

Planet	"Dathomir"
{
	ParentBody     "Domir"
	Class          "Terra"
	Mass            0.61485
	Radius          5230
	InertiaMoment   0.32663
	Oblateness      0.0029434
	Rotation//Period  23.981
	RotationEpoch   0
	Obliquity       50.734
	EqAscendNode    -41.723

	AlbedoBond      0.36612
	AlbedoGeom      0.359
	Brightness      1.5
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_rusty_black_plants.cfg"
		SurfStyle       0.03343
		Randomize      (-0.718, 0.762, -0.444)
		colorDistMagn   0.096386
		colorDistFreq   653.11
		detailScale     13452
		drivenDarkening -1
		seaLevel        0.16794
		snowLevel       0.77778
		tropicLatitude  0.7868
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.92063
		climateTropic   0.68254
		climateEquator  0.35714
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        0.64122
		heightTempGrad  0.375
		beachWidth      0.00092671
		tropicWidth     0.20135
		mainFreq        1.9466
		venusFreq       0.44275
		venusMagn       0.2573
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.32745
		erosion         0.12029
		montesMagn      0.16593
		montesFreq      213.74
		montesSpiky     0.53435
		montesFraction  0.45802
		dunesMagn       0.036078
		dunesFreq       46.375
		dunesFraction   0.43511
		hillsMagn       0.1148
		hillsFreq       425.89
		hillsFraction   0.40458
		hills2Fraction  0.17789
		riversMagn      24.427
		riversFreq      0
		riversSin       3.254
		riftsMagn       0
		riftsFreq       3.2872
		riftsSin        4.7601
		canyonsMagn     0.044071
		canyonsFreq     100
		canyonsFraction 0.22137
		cracksMagn      0
		cracksFreq      0.2876
		cracksOctaves   0
		craterMagn      0.60855
		craterFreq      15.572
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.56349
		volcanoFreq     0.29008
		volcanoDensity  0.30887
		volcanoOctaves  2
		volcanoActivity 0.55333
		volcanoFlows    0.40458
		volcanoRadius   0.45238
		volcanoTemp     1157.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.15267
		stripeFluct     0
		stripeTwist     0.4933
		cycloneMagn     4.4275
		cycloneFreq     0.62595
		cycloneDensity  0.17557
		cycloneOctaves  2
		colorSea       (0.030, 0.020, 0.005, 1.000)
		BumpHeight      20
		BumpOffset      9.8382
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.39877
		RoughnessIce    0.39877
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           3.3587
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          7.9458
		Velocity        50.361
		BumpHeight      6.2295
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     10
		Coverage        0.25
		stripeZones     0.15267
		stripeFluct     0
		stripeTwist     0.4933
	}

	Clouds
	{
		Height          7.9458
		Velocity        129.2
		BumpHeight      5.4804
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     10
		Coverage        0.25
		stripeZones     0.15267
		stripeFluct     0
		stripeTwist     0.4933
	}

	NoLava          true

	Atmosphere
	{
		Model          "Chlorine"
		Height          63.453
		Density         2.362
		Pressure        1.8895
		Greenhouse      42.614
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.20853
		Saturation      1.3016

		Composition
		{
			N2        	77.432
			O2        	18.48
			Ar        	2.7124
			H2O       	0.96861
			CO2       	0.40674
		}
	}

	Aurora
	{
		Height         56.854
		NorthLat       66.029
		NorthLon       -144.37
		NorthRadius    1611.5
		NorthWidth     455.62
		NorthRings     4
		NorthBright    0.3
		NorthFlashFreq 76.286
		NorthMoveSpeed 0.77246
		NorthParticles 50000
		SouthLat       -76.06
		SouthLon       56.068
		SouthRadius    1315.8
		SouthWidth     402.07
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 66.011
		SouthMoveSpeed 1.4518
		SouthParticles 50000
		TopColor    (0.000 1.000 0.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          1.34521
		//SemiMajorAxis   1.26854
		Eccentricity    0.0547657
		Inclination     1.48613
		AscendingNode   -39.4683
		ArgOfPericenter 158.839
		MeanAnomaly     207.684
	}
}

Moon	"Dathomir 1"
{
	ParentBody     "Dathomir"
	Class	       "Selena"

	Mass            0.020487

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000130466
		//Period          0.00222417
		Eccentricity    0.0008622
		Inclination     0.246912
		AscendingNode   47.0644
		ArgOfPericenter 309.482
		MeanAnomaly     3.48401
	}
}

DwarfMoon	"Dathomir 2"
{
	ParentBody     "Dathomir"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000384118
		//Period          0.00449651
		Eccentricity    0.00943088
		Inclination     -0.683113
		AscendingNode   -94.684
		ArgOfPericenter 143.685
		MeanAnomaly     67.6413
	}
}

DwarfMoon	"Dathomir 3"
{
	ParentBody     "Dathomir"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000500246
		//Period          0.00887198
		Eccentricity    0.016484
		Inclination     -1.78645
		AscendingNode   37.8417
		ArgOfPericenter 99.8705
		MeanAnomaly     133.894
	}
}

Moon	"Koratas/Dathomir 4"
{
	ParentBody     "Dathomir"
	Class	       "Terra"

	Mass            0.0367166
	Radius          2203.7
	InertiaMoment   0.353255

	Atmosphere
	{
		Model          "Titan"
		Height          38.4515
		Density         0.14758
		Pressure        0.0732951
		Greenhouse      1.07129
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000885139
		//Period          0.0188677
		Eccentricity    0.0223483
		Inclination     3.84615
		AscendingNode   36.8965
		ArgOfPericenter -13.0684
		MeanAnomaly     64.8845
	}
}

Planet	"Babygnon"
{
	ParentBody     "Domir"
	Class	       "Neptune"

	Mass            20.5684
	Radius          22296.2

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32573
		//Period          3.31592
		Eccentricity    0.09407
		Inclination     -2.49765
		AscendingNode   -121.834
		ArgOfPericenter 268.363
		MeanAnomaly     23.6944
	}
}


Moon	"Babygnon 1"
{
	ParentBody     "Babygnon"
	Class	       "Selena"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000753731
		//Period          0.00263876
		Eccentricity    0.0240144
		Inclination     -0.61234
		AscendingNode   161.099
		ArgOfPericenter -80.8383
		MeanAnomaly     -4.21557
	}
}

Moon	"Babygnon 2"
{
	ParentBody     "Babygnon"
	Class	       "Selena"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0012433
		//Period          0.00559034
		Eccentricity    0.04318
		Inclination     -0.961992
		AscendingNode   153.036
		ArgOfPericenter -109.46
		MeanAnomaly     123.476
	}
}

Moon	"Babygnon 3"
{
	ParentBody     "Babygnon"
	Class	       "Selena"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00205086
		//Period          0.0118434
		Eccentricity    0.0353945
		Inclination     0.123812
		AscendingNode   173.393
		ArgOfPericenter -149.671
		MeanAnomaly     -73.2946
	}
}

DwarfMoon	"Babygnon 4"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00916603
		//Period          0.111905
		Eccentricity    0.208424
		Inclination     -34.2329
		AscendingNode   36.542
		ArgOfPericenter 114.423
		MeanAnomaly     -35.2347
	}
}

DwarfMoon	"Babygnon 5"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00967823
		//Period          0.121415
		Eccentricity    0.170461
		Inclination     89.9165
		AscendingNode   -169.644
		ArgOfPericenter 15.1519
		MeanAnomaly     2.01221
	}
}

DwarfMoon	"Babygnon 6"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0103265
		//Period          0.133816
		Eccentricity    0.00622288
		Inclination     -43.9462
		AscendingNode   33.6184
		ArgOfPericenter -83.9208
		MeanAnomaly     53.7941
	}
}

DwarfMoon	"Babygnon 7"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0107624
		//Period          0.142378
		Eccentricity    0.253446
		Inclination     59.9229
		AscendingNode   -102.332
		ArgOfPericenter -68.2257
		MeanAnomaly     138.023
	}
}

DwarfMoon	"Babygnon 8"
{
	ParentBody     "Babygnon"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0110277
		//Period          0.147674
		Eccentricity    0.174825
		Inclination     -33.1655
		AscendingNode   66.1365
		ArgOfPericenter -149.731
		MeanAnomaly     40.9285
	}
}


Planet	"Barmasel"
{
	ParentBody     "Domir"
	Class	       "Neptune"

	Mass            20.6375
	Radius          22510

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.54637
		Eccentricity    0.00490274
		Inclination     -0.701244
		AscendingNode   165.369
		ArgOfPericenter 206.955
		MeanAnomaly     231.841
	}
}

Moon	"Barmasel 1"
{
	ParentBody     "Barmasel"
	Class	       "Selena"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000688654
		//Period          0.00230057
		Eccentricity    0.0375241
		Inclination     1.38462
		AscendingNode   -162.294
		ArgOfPericenter 134.746
		MeanAnomaly     142.95
	}
}

Moon	"Barmasel 2"
{
	ParentBody     "Barmasel"
	Class	       "Selena"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00099847
		//Period          0.0040148
		Eccentricity    0.000935222
		Inclination     0.178674
		AscendingNode   -93.9651
		ArgOfPericenter -101.162
		MeanAnomaly     -84.8717
	}
}

DwarfMoon	"Barmasel 3"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0060002
		//Period          0.0591698
		Eccentricity    0.464002
		Inclination     39.6171
		AscendingNode   70.4584
		ArgOfPericenter -31.4435
		MeanAnomaly     52.7698
	}
}

DwarfMoon	"Barmasel 4"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00643662
		//Period          0.0657412
		Eccentricity    0.404382
		Inclination     -54.2187
		AscendingNode   60.1235
		ArgOfPericenter -80.3494
		MeanAnomaly     -36.5037
	}
}

DwarfMoon	"Barmasel 5"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00673044
		//Period          0.0702937
		Eccentricity    0.300206
		Inclination     -35.0298
		AscendingNode   90.6794
		ArgOfPericenter 61.7282
		MeanAnomaly     -75.9004
	}
}

DwarfMoon	"Barmasel 6"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00737395
		//Period          0.0806124
		Eccentricity    0.350978
		Inclination     70.6608
		AscendingNode   -122.55
		ArgOfPericenter -67.7614
		MeanAnomaly     -161.634
	}
}

DwarfMoon	"Barmasel 7"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0078724
		//Period          0.0889226
		Eccentricity    0.245162
		Inclination     -75.2313
		AscendingNode   154.426
		ArgOfPericenter -142.808
		MeanAnomaly     134.546
	}
}

DwarfMoon	"Barmasel 8"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00821276
		//Period          0.0947511
		Eccentricity    0.23568
		Inclination     76.1431
		AscendingNode   72.2303
		ArgOfPericenter -94.6639
		MeanAnomaly     -30.1886
	}
}

DwarfMoon	"Barmasel 9"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0088681
		//Period          0.106315
		Eccentricity    0.116701
		Inclination     -87.8596
		AscendingNode   169.149
		ArgOfPericenter -128.78
		MeanAnomaly     124.284
	}
}

DwarfMoon	"Barmasel 10"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00916096
		//Period          0.111625
		Eccentricity    0.0762623
		Inclination     -0.442135
		AscendingNode   -138.54
		ArgOfPericenter -6.33799
		MeanAnomaly     14.2237
	}
}

DwarfMoon	"Barmasel 11"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00944937
		//Period          0.116938
		Eccentricity    0.470411
		Inclination     -15.1669
		AscendingNode   75.5108
		ArgOfPericenter -134.608
		MeanAnomaly     90.1313
	}
}

DwarfMoon	"Barmasel 12"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00984147
		//Period          0.124291
		Eccentricity    0.26806
		Inclination     64.8846
		AscendingNode   -108.273
		ArgOfPericenter 150.306
		MeanAnomaly     36.4137
	}
}


DwarfMoon	"Barmasel 13"
{
	ParentBody     "Barmasel"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0104606
		//Period          0.136202
		Eccentricity    0.230173
		Inclination     -69.2912
		AscendingNode   120.894
		ArgOfPericenter -51.8807
		MeanAnomaly     3.91844
	}
}

Planet	"Stindaron"
{
	ParentBody     "Domir"
	Class	       "Jupiter"

	Mass            141.071
	Radius          63525.3

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.54373
		//Period          23.4814
		Eccentricity    0.0598929
		Inclination     -0.103637
		AscendingNode   37.4501
		ArgOfPericenter 204.596
		MeanAnomaly     97.579
	}
}

DwarfMoon	"Stindaron 1"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000797904
		//Period          0.00109746
		Eccentricity    1.9925e-005
		Inclination     -0.00992906
		AscendingNode   -77.7134
		ArgOfPericenter -56.172
		MeanAnomaly     105.098
	}
}

DwarfMoon	"Stindaron 2"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000820567
		//Period          0.00114454
		Eccentricity    5.47962e-005
		Inclination     -0.00298089
		AscendingNode   78.2647
		ArgOfPericenter -102.608
		MeanAnomaly     119.471
	}
}

DwarfMoon	"Stindaron 3"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000843914
		//Period          0.00119374
		Eccentricity    3.77625e-005
		Inclination     -0.0122853
		AscendingNode   -142.779
		ArgOfPericenter 49.4391
		MeanAnomaly     -41.8169
	}
}

DwarfMoon	"Stindaron 4"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000856773
		//Period          0.00122113
		Eccentricity    4.38934e-006
		Inclination     -0.00629087
		AscendingNode   41.7261
		ArgOfPericenter -48.317
		MeanAnomaly     -141.061
	}
}

DwarfMoon	"Stindaron 5"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0008997
		//Period          0.00131404
		Eccentricity    8.54348e-006
		Inclination     0.00080319
		AscendingNode   -158.439
		ArgOfPericenter 67.9604
		MeanAnomaly     -170.638
	}
}

Moon	"Stindaron 6"
{
	ParentBody     "Stindaron"
	Class	       "Terra"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00165908
		//Period          0.00328933
		Eccentricity    0.0310332
		Inclination     0.959354
		AscendingNode   -66.8065
		ArgOfPericenter -40.9843
		MeanAnomaly     99.4886
	}
}

Moon	"Stindaron 7"
{
	ParentBody     "Stindaron"
	Class	       "Selena"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0028183
		//Period          0.00728491
		Eccentricity    0.0211154
		Inclination     1.14112
		AscendingNode   43.4805
		ArgOfPericenter 49.8395
		MeanAnomaly     143.512
	}
}

Moon	"Stindaron 8"
{
	ParentBody     "Stindaron"
	Class	       "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00478747
		//Period          0.0161287
		Eccentricity    0.0189316
		Inclination     -1.4569
		AscendingNode   177.477
		ArgOfPericenter -117.88
		MeanAnomaly     -57.4128
	}
}


Moon	"Stindaron 9"
{
	ParentBody     "Stindaron"
	Class	       "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00813253
		//Period          0.0357088
		Eccentricity    0.0483917
		Inclination     -0.407275
		AscendingNode   75.4123
		ArgOfPericenter 78.5014
		MeanAnomaly     150.125
	}
}

DwarfMoon	"Stindaron 10"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0138148
		//Period          0.0790639
		Eccentricity    0.0266879
		Inclination     -1.08194
		AscendingNode   61.9509
		ArgOfPericenter -26.3072
		MeanAnomaly     96.5423
	}
}

DwarfMoon	"Stindaron 11"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0801793
		//Period          1.10549
		Eccentricity    0.191278
		Inclination     -53.8679
		AscendingNode   57.2781
		ArgOfPericenter 115.917
		MeanAnomaly     -54.0915
	}
}

DwarfMoon	"Stindaron 12"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.080635
		//Period          1.11493
		Eccentricity    0.412468
		Inclination     -41.4151
		AscendingNode   133.921
		ArgOfPericenter 37.0635
		MeanAnomaly     113.474
	}
}

DwarfMoon	"Stindaron 13"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0813034
		//Period          1.12882
		Eccentricity    0.0572569
		Inclination     33.5284
		AscendingNode   -158.979
		ArgOfPericenter 150.948
		MeanAnomaly     -106.966
	}
}


DwarfMoon	"Stindaron 14"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0817022
		//Period          1.13714
		Eccentricity    0.237451
		Inclination     -22.8957
		AscendingNode   5.23158
		ArgOfPericenter -61.5533
		MeanAnomaly     144.79
	}
}

DwarfMoon	"Stindaron 15"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0820434
		//Period          1.14427
		Eccentricity    0.455144
		Inclination     -32.2982
		AscendingNode   51.108
		ArgOfPericenter 133.517
		MeanAnomaly     140.431
	}
}

DwarfMoon	"Stindaron 16"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0825861
		//Period          1.15564
		Eccentricity    0.0919806
		Inclination     -16.0564
		AscendingNode   -65.9998
		ArgOfPericenter -18.2922
		MeanAnomaly     10.7133
	}
}

DwarfMoon	"Stindaron 17"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0831159
		//Period          1.16678
		Eccentricity    0.0766819
		Inclination     87.3637
		AscendingNode   -148.959
		ArgOfPericenter -123.78
		MeanAnomaly     136.51
	}
}

DwarfMoon	"Stindaron 18"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0845308
		//Period          1.1967
		Eccentricity    0.448062
		Inclination     -23.5375
		AscendingNode   145.69
		ArgOfPericenter -96.6921
		MeanAnomaly     -167.475
	}
}

DwarfMoon	"Stindaron 19"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0851773
		//Period          1.21045
		Eccentricity    0.390365
		Inclination     -60.1041
		AscendingNode   -148.332
		ArgOfPericenter 79.0289
		MeanAnomaly     -91.0266
	}
}

DwarfMoon	"Stindaron 20"
{
	ParentBody     "Stindaron"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0858147
		//Period          1.22406
		Eccentricity    0.460782
		Inclination     -65.4893
		AscendingNode   132.138
		ArgOfPericenter 91.6744
		MeanAnomaly     70.7244
	}
}


Planet	"Arodoni"
{
	ParentBody     "Domir"
	Class	       "Jupiter"

	Mass            989.324
	Radius          78301

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.66995
		//Period          69.3535
 		Eccentricity    0.0966971
		Inclination     0.642798
		AscendingNode   -75.8466
		ArgOfPericenter 95.8196
		MeanAnomaly     63.8723
	}
}

DwarfMoon	"Arodoni 1"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00152733
		//Period          0.00109751
		Eccentricity    8.77862e-005
		Inclination     0.0116702
		AscendingNode   -140.903
		ArgOfPericenter 96.5039
		MeanAnomaly     139.598
	}
}

DwarfMoon	"Arodoni 2"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00158439
		//Period          0.00115959
		Eccentricity    1.23621e-006
		Inclination     0.0103377
		AscendingNode   -55.7422
		ArgOfPericenter -104.274
		MeanAnomaly     16.6511
	}
}

DwarfMoon	"Arodoni 3"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00171987
		//Period          0.00131146
		Eccentricity    3.20361e-005
		Inclination     -0.0142392
		AscendingNode   129.577
		ArgOfPericenter -157.841
		MeanAnomaly     77.2861
	}
}

Moon	"Arodoni 4"
{
	ParentBody     "Arodoni"
	Class	       "Terra"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00285995
		//Period          0.00281173
		Eccentricity    0.0192706
		Inclination     0.575772
		AscendingNode   134.043
		ArgOfPericenter -126.857
		MeanAnomaly     8.09948
	}
}

DwarfMoon	"Arodoni 5"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0115633
		//Period          0.0228629
		Eccentricity    0.295738
		Inclination     30.2503
		AscendingNode   11.8242
		ArgOfPericenter 111.108
		MeanAnomaly     -133.793
	}
}

DwarfMoon	"Arodoni 6"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0120707
		//Period          0.0243842
		Eccentricity    0.371381
		Inclination     7.39119
		AscendingNode   23.6927
		ArgOfPericenter -14.8737
		MeanAnomaly     -86.5631
	}
}

DwarfMoon	"Arodoni 7"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0126855
		//Period          0.0262707
		Eccentricity    0.0347155
		Inclination     -4.03874
		AscendingNode   -109.264
		ArgOfPericenter 142.655
		MeanAnomaly     53.3705
	}
}

DwarfMoon	"Arodoni 8"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0133452
		//Period          0.0283464
		Eccentricity    0.104165
		Inclination     21.7947
		AscendingNode   -97.5152
		ArgOfPericenter -105.31
		MeanAnomaly     80.8478
	}
}

DwarfMoon	"Arodoni 9"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0137937
		//Period          0.0297872
		Eccentricity    0.0743632
		Inclination     -14.5728
		AscendingNode   120.309
		ArgOfPericenter 177.357
		MeanAnomaly     -167.154
	}
}

DwarfMoon	"Arodoni 10"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0144317
		//Period          0.0318777
		Eccentricity    0.290639
		Inclination     58.5167
		AscendingNode   147.325
		ArgOfPericenter -122.543
		MeanAnomaly     20.1656
	}
}

DwarfMoon	"Arodoni 11"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.015099
		//Period          0.034114
		Eccentricity    0.435781
		Inclination     70.7632
		AscendingNode   -139.104
		ArgOfPericenter -113.94
		MeanAnomaly     -95.4215
	}
}

DwarfMoon	"Arodoni 12"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0156005
		//Period          0.0358277
		Eccentricity    0.183669
		Inclination     -15.2352
		AscendingNode   -86.8647
		ArgOfPericenter 27.8265
		MeanAnomaly     -88.1623
	}
}

DwarfMoon	"Arodoni 13"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.016116
		//Period          0.037618
		Eccentricity    0.327427
		Inclination     41.7899
		AscendingNode   66.5301
		ArgOfPericenter -56.7449
		MeanAnomaly     135.965
	}
}

DwarfMoon	"Arodoni 14"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0166224
		//Period          0.0394051
		Eccentricity    0.391844
		Inclination     10.7337
		AscendingNode   4.09252
		ArgOfPericenter 106.466
		MeanAnomaly     -94.2005
	}
}

DwarfMoon	"Arodoni 15"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0168736
		//Period          0.0403016
		Eccentricity    0.0656747
		Inclination     -30.9896
		AscendingNode   46.3203
		ArgOfPericenter 116.347
		MeanAnomaly     -168.388
	}
}

DwarfMoon	"Arodoni 16"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0173457
		//Period          0.0420049
		Eccentricity    0.0124757
		Inclination     -18.3743
		AscendingNode   66.7821
		ArgOfPericenter -50.7074
		MeanAnomaly     99.7032
	}
}

DwarfMoon	"Arodoni 17"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0177997
		//Period          0.0436644
		Eccentricity    0.396115
		Inclination     -0.778703
		AscendingNode   -39.6467
		ArgOfPericenter 154.218
		MeanAnomaly     -143.647
	}
}

DwarfMoon	"Arodoni 18"
{
	ParentBody     "Arodoni"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.018184
		//Period          0.0450863
		Eccentricity    0.41751
		Inclination     -2.15552
		AscendingNode   -80.6932
		ArgOfPericenter -10.0484
		MeanAnomaly     -57.0518
	}
}

Planet	"Chirgay"
{
	ParentBody     "Domir"
	Class	       "Aquaria"

	Mass            0.0419917
	Radius          3000.5

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.88629
		Eccentricity    0.0348486
		Inclination     -1.73265
		AscendingNode   -84.6221
		ArgOfPericenter 81.1775
		MeanAnomaly     200.282
	}
}

DwarfMoon	"Chirgay 1"
{
	ParentBody     "Chirgay"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.15321e-005
		//Period          0.00136222
		Eccentricity    0.0393797
		Inclination     0.80372
		AscendingNode   -73.5991
		ArgOfPericenter 42.1447
		MeanAnomaly     -100.303
	}
}

Planet	"Chav"
{
	ParentBody     "Domir"
	Class	       "Aquaria"

	Mass            0.986786
	Radius          7602.21

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.135
		//Period          382.751
		Eccentricity    0.0228256
		Inclination     2.1461
		AscendingNode   -56.7353
		ArgOfPericenter 237.674
		MeanAnomaly     88.5146
	}
}

DwarfMoon	"Chav 1"
{
	ParentBody     "Chav"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.74221e-004
		Eccentricity    6.11189e-005
		Inclination     0.00180678
		AscendingNode   -70.2285
		ArgOfPericenter 39.0444
		MeanAnomaly     112.915
	}
}

DwarfMoon	"Chav 2"
{
	ParentBody     "Chav"
	Class	       "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.79943e-004
		Eccentricity    4.4118e-005
		Inclination     -0.00915934
		AscendingNode   -52.0311
		ArgOfPericenter -125.232
		MeanAnomaly     -33.305
	}
}
