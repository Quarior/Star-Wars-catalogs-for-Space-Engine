// http://starwars.wikia.com/wiki/Dagobah
// Region : Outer Rim
// Sector : Sluis Sector
// Grid location : M19
// X : 2460.87, Y : -14267.52, Z : -337.2718411166642
Planet	"Ness"
{
	ParentBody     "Darlo"
	Class          "Terra"
	Mass			1.219

	Orbit
	{
		RefPlane        "Equator"
		Epoch           2454762
		Period          0.274633452
		SemiMajorAxis   0.4196
		Eccentricity    0.03
		Inclination     0.1
		AscendingNode   2.14096679
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

Planet	"Dagobah"
{
	ParentBody     "Darlo"
	Class          "Terra"
	Mass            0.9234
	Radius          4450
	InertiaMoment   0.33145
	Oblateness      0.020119
	RotationPeriod  23
	RotationOffset  269.21
	Obliquity       -2.1953
	EqAscendNode    269.7

	Albedo          0.26
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_LB_green.cfg"
		SurfStyle       0.13171
		Randomize      (-0.883, 0.466, 0.626)
		colorDistMagn   0.046073
		colorDistFreq   417.53
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.1192
		snowLevel       1.5878
		tropicLatitude  0.038959
		icecapLatitude  0.9489
		icecapHeight    0.039061
		climatePole     0.69466
		climateTropic   0.70992
		climateEquator  0.73282
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        1
		heightTempGrad  0.52976
		beachWidth      0.00097858
		tropicWidth     0.1324
		mainFreq        2.5191
		venusFreq       0.076336
		venusMagn       0
		mareFreq        7.2074
		mareDensity     0
		terraceProb     0.4723
		erosion         0.72519
		montesMagn      0.25204
		montesFreq      233.7
		montesSpiky     0.94293
		montesFraction  0.082492
		dunesMagn       0.058309
		dunesFreq       50.892
		dunesFraction   0.64516
		hillsMagn       0.12668
		hillsFreq       634.24
		hillsFraction   0.95075
		hills2Fraction  0.01754
		riversMagn      53.264
		riversFreq      3.2737
		riversSin       6.347
		riftsMagn       0
		riftsFreq       3.6686
		riftsSin        7.3145
		canyonsMagn     0.032265
		canyonsFreq     112.11
		canyonsFraction 0.3912
		cracksMagn      0.13238
		cracksFreq      0.37962
		cracksOctaves   0
		craterMagn      0.84958
		craterFreq      12.321
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.17557
		volcanoFreq     0.27481
		volcanoDensity  0.14504
		volcanoOctaves  1
		volcanoActivity 0.38168
		volcanoFlows    0.34351
		volcanoRadius   0.25191
		volcanoTemp     319.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.2901
		stripeFluct     0.19847
		stripeTwist     0.14723
		cycloneMagn     2.5494
		cycloneFreq     0.74809
		cycloneDensity  0.42228
		cycloneOctaves  4
		BumpHeight      14.439
		BumpOffset      1.7212
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.9774
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           1.7212
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      2
		ModulateBright  1

		Composition
		{
			H2O       	99.862
			SO2       	0.1229
			NH3       	0.014819
			C8H18     	0.00013942
			C3H8      	1.8989e-05
		}
	}

	Clouds
	{
		Height          23.201
		Velocity        42.281
		BumpHeight      2.5379
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.93893
		mainOctaves     8
		Coverage        0.41985
		stripeZones     2.2901
		stripeFluct     0.19847
		stripeTwist     0.14723
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          72.878
		Density         100
		Pressure        1.1112
		Greenhouse      38.331
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	83.276
			N2        	10.048
			SO2       	2.8508
			H2O       	2.0974
			NH3       	1.1154
			C2H2      	0.23239
			H2S       	0.18597
			CH4       	0.14148
			C2H4      	0.025153
			CO        	0.0149
			C2H6      	0.0067743
			C3H8      	0.0035124
			Ar        	0.0018375
			Ne        	0.00020146
			C8H18     	1.9396e-05
		}
	}

	Aurora
	{
		Height         33.88
		NorthLat       49.099
		NorthLon       -41.683
		NorthRadius    984.28
		NorthWidth     188.08
		NorthRings     2
		NorthBright    0.3
		NorthFlashFreq 83.262
		NorthMoveSpeed 1.54
		NorthParticles 50000
		SouthLat       -39.49
		SouthLon       116.42
		SouthRadius    1440
		SouthWidth     231.06
		SouthRings     5
		SouthBright    0.3
		SouthFlashFreq 74.171
		SouthMoveSpeed 1.2337
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
		Period          0.895288493
		SemiMajorAxis   0.922518969
		Eccentricity    0.005060218
		Inclination     0.123
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
	}
}

Moon	"Dagobah 1"
{
	ParentBody     "Dagobah"
	Class          "Ferria"

	Orbit
	{
		RefPlane        "Equator"
		Epoch           2454762
		PeriodDays      5.22289504
		SemiMajorAxisKm 125811.809
		Eccentricity    0.03
		Inclination     0.1
		AscendingNode   0
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

Planet	"Undar"
{
	ParentBody     "Darlo"
	Class          "Terra"
	Mass			0.078

	NoAtmosphere	true	

	NoRings		true

	Orbit
	{
		RefPlane        "Equator"
		Epoch           2454762
		Period          2.22415024
		SemiMajorAxis   1.69216366
		Eccentricity    0.03
		Inclination     0.127
		AscendingNode   143.086249
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

DwarfMoon	"Undar 1"
{
	ParentBody     "Undar"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      3.13625747
		SemiMajorAxisKm 34718.0388
		Eccentricity    0.149296045
		Inclination     140.089441
		AscendingNode   21.1339336
		ArgOfPericenter 137.614962
		MeanAnomaly     -74.1930265
	}
}

DwarfMoon	"Undar 2"
{
	ParentBody     "Undar"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      23.0358188
		SemiMajorAxisKm 131184.714
		Eccentricity    0.0919927083
		Inclination     154.210754
		AscendingNode   81.4137713
		ArgOfPericenter -167.539488
		MeanAnomaly     -177.411197
	}
}

Planet	"Bubbok"
{
	ParentBody     "Darlo"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		Epoch           2454762
		Period          10.8401227
		SemiMajorAxis   4.86432855
		Eccentricity    0.03
		Inclination     0.127
		AscendingNode   163.912248
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

Moon	"Bubbok 1"
{
	ParentBody     "Bubbok"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.84082722
		//SemiMajorAxisKm 36698.5547
		Eccentricity    0.000244473806
		Inclination     -0.764386159
		AscendingNode   -64.5868423
		ArgOfPericenter 154.093513
		MeanAnomaly     111.285844
	}
}

DwarfMoon	"Bubbok 2"
{
	ParentBody     "Bubbok"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      11.7444506
		//SemiMajorAxisKm 212821.44
		Eccentricity    0.182276692
		Inclination     141.091505
		AscendingNode   82.1903315
		ArgOfPericenter -8.88690781
		MeanAnomaly     26.5865554
	}
}

DwarfMoon	"Bubbok 3"
{
	ParentBody     "Bubbok"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.242088
		//SemiMajorAxisKm 274907.641
		Eccentricity    0.167980738
		Inclination     194.135408
		AscendingNode   -179.960114
		ArgOfPericenter -169.907444
		MeanAnomaly     55.5986273
	}
}

Planet	"Sty"
{
	ParentBody     "Darlo"
	Class          "GasGiant"
	Mass			309.6

	Orbit
	{
		RefPlane        "Equator"
		Epoch           2454762
		Period          18.3605734
		SemiMajorAxis   6.9134473
		Eccentricity    0.03
		Inclination     0.127
		AscendingNode   150.863805
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

DwarfMoon	"Sty 1"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.330512961
		SemiMajorAxisKm 134056.483
		Eccentricity    1.14952932e-05
		Inclination     0.000294613398
		AscendingNode   -133.094811
		ArgOfPericenter 157.656858
		MeanAnomaly     124.686209
	}
}

DwarfMoon	"Sty 2"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.339446116
		SemiMajorAxisKm 136461.263
		Eccentricity    1.94633879e-05
		Inclination     0.00709199547
		AscendingNode   -77.3513288
		ArgOfPericenter -134.556888
		MeanAnomaly     144.358673
	}
}

DwarfMoon	"Sty 3"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.346750283
		SemiMajorAxisKm 138411.882
		Eccentricity    2.07085613e-05
		Inclination     -0.0117953205
		AscendingNode   -62.5820209
		ArgOfPericenter -3.38076068
		MeanAnomaly     -13.3684074
	}
}

DwarfMoon	"Sty 4"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.359467304
		SemiMajorAxisKm 141775.685
		Eccentricity    1.85825012e-05
		Inclination     -0.00412493445
		AscendingNode   -51.7999236
		ArgOfPericenter -30.3480818
		MeanAnomaly     -22.9088751
	}
}

DwarfMoon	"Sty 5"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.377225574
		SemiMajorAxisKm 146407.36
		Eccentricity    6.09899208e-05
		Inclination     -0.014593553
		AscendingNode   107.726825
		ArgOfPericenter 88.6924972
		MeanAnomaly     -120.809598
	}
}

DwarfMoon	"Sty 6"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.39780548
		SemiMajorAxisKm 151685.011
		Eccentricity    6.69072309e-05
		Inclination     0.00996417476
		AscendingNode   -26.3081909
		ArgOfPericenter 137.04253
		MeanAnomaly     -156.453035
	}
}

DwarfMoon	"Sty 7"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.421471265
		SemiMajorAxisKm 157642.8
		Eccentricity    1.28693268e-05
		Inclination     0.0029933295
		AscendingNode   106.034444
		ArgOfPericenter 49.8805279
		MeanAnomaly     -131.600808
	}
}

DwarfMoon	"Sty 8"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.434586005
		SemiMajorAxisKm 160896.273
		Eccentricity    6.40267492e-05
		Inclination     0.0141644716
		AscendingNode   -146.904205
		ArgOfPericenter -32.4540259
		MeanAnomaly     43.8078867
	}
}

DwarfMoon	"Sty 9"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.450036993
		SemiMajorAxisKm 164687.626
		Eccentricity    8.61840283e-05
		Inclination     0.00953484854
		AscendingNode   149.489827
		ArgOfPericenter 165.793369
		MeanAnomaly     159.872469
	}
}

Moon	"Sty 10"
{
	ParentBody     "Sty"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1.01945374
		SemiMajorAxisKm 284058.147
		Eccentricity    0.000593834207
		Inclination     -1.1206597
		AscendingNode   -74.4787894
		ArgOfPericenter -46.0359951
		MeanAnomaly     38.0114141
	}
}

Moon	"Sty 11"
{
	ParentBody     "Sty"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      2.28213006
		SemiMajorAxisKm 486101.193
		Eccentricity    0.00161084265
		Inclination     1.38088489
		AscendingNode   -81.2841745
		ArgOfPericenter -126.34979
		MeanAnomaly     64.4868108
	}
}

Moon	"Sty 12"
{
	ParentBody     "Sty"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      5.10252622
		SemiMajorAxisKm 831852.113
		Eccentricity    0.00208839262
		Inclination     -0.685331744
		AscendingNode   -68.2788053
		ArgOfPericenter -93.3410999
		MeanAnomaly     -53.386797
	}
}

Moon	"Sty 13"
{
	ParentBody     "Sty"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      11.4360956
		SemiMajorAxisKm 1423526.52
		Eccentricity    0.0164855729
		Inclination     -0.17556229
		AscendingNode   -108.199802
		ArgOfPericenter 40.1323049
		MeanAnomaly     -30.9264714
	}
}

DwarfMoon	"Sty 14"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      135.902531
		SemiMajorAxisKm 7412769.95
		Eccentricity    0.0230989642
		Inclination     200.740253
		AscendingNode   54.4850382
		ArgOfPericenter 134.163276
		MeanAnomaly     -126.739911
	}
}

DwarfMoon	"Sty 15"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      138.357642
		SemiMajorAxisKm 7501778.89
		Eccentricity    0.122396707
		Inclination     220.4288
		AscendingNode   -32.2737432
		ArgOfPericenter 53.8164626
		MeanAnomaly     -87.3676461
	}
}

DwarfMoon	"Sty 16"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      141.121127
		SemiMajorAxisKm 7601340.44
		Eccentricity    0.404647666
		Inclination     3.71251375
		AscendingNode   -163.16226
		ArgOfPericenter -74.5564135
		MeanAnomaly     23.4764395
	}
}

DwarfMoon	"Sty 17"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      143.030386
		SemiMajorAxisKm 7669746.92
		Eccentricity    0.0975204841
		Inclination     185.596464
		AscendingNode   86.8934821
		ArgOfPericenter 94.294043
		MeanAnomaly     -21.6978602
	}
}

DwarfMoon	"Sty 18"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      145.450155
		SemiMajorAxisKm 7756008.64
		Eccentricity    0.111337295
		Inclination     204.253737
		AscendingNode   149.459889
		ArgOfPericenter 123.55739
		MeanAnomaly     7.21873121
	}
}

DwarfMoon	"Sty 19"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      147.597453
		SemiMajorAxisKm 7832157.3
		Eccentricity    0.428384975
		Inclination     137.199614
		AscendingNode   83.1998138
		ArgOfPericenter 74.3426214
		MeanAnomaly     -144.881988
	}
}

DwarfMoon	"Sty 20"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      148.914698
		SemiMajorAxisKm 7878687.37
		Eccentricity    0.305367993
		Inclination     192.155668
		AscendingNode   -160.529238
		ArgOfPericenter -149.27332
		MeanAnomaly     115.110969
	}
}

DwarfMoon	"Sty 21"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      150.866243
		SemiMajorAxisKm 7947371.99
		Eccentricity    0.00372835645
		Inclination     144.156605
		AscendingNode   79.0402019
		ArgOfPericenter -66.9489839
		MeanAnomaly     -42.8819465
	}
}

DwarfMoon	"Sty 22"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      151.963174
		SemiMajorAxisKm 7985848.43
		Eccentricity    0.376324344
		Inclination     153.009476
		AscendingNode   101.583506
		ArgOfPericenter 74.5018035
		MeanAnomaly     -29.9090795
	}
}

DwarfMoon	"Sty 23"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      154.412679
		SemiMajorAxisKm 8071435.82
		Eccentricity    0.13753109
		Inclination     216.592749
		AscendingNode   -12.668441
		ArgOfPericenter 6.74649445
		MeanAnomaly     148.270144
	}
}

DwarfMoon	"Sty 24"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      155.497123
		SemiMajorAxisKm 8109182.31
		Eccentricity    0.238347734
		Inclination     193.811764
		AscendingNode   -110.271053
		ArgOfPericenter 33.8048547
		MeanAnomaly     40.834754
	}
}

DwarfMoon	"Sty 25"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      157.896844
		SemiMajorAxisKm 8192399.55
		Eccentricity    0.105201045
		Inclination     49.5050407
		AscendingNode   47.7227281
		ArgOfPericenter 63.8331552
		MeanAnomaly     -40.9572107
	}
}

DwarfMoon	"Sty 26"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      160.340565
		SemiMajorAxisKm 8276710.5
		Eccentricity    0.145774277
		Inclination     139.78501
		AscendingNode   -102.482197
		ArgOfPericenter -1.71811296
		MeanAnomaly     105.301124
	}
}

DwarfMoon	"Sty 27"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      161.400421
		SemiMajorAxisKm 8313143.3
		Eccentricity    0.0854024303
		Inclination     140.569205
		AscendingNode   -32.3474022
		ArgOfPericenter -17.8137116
		MeanAnomaly     65.3993525
	}
}

DwarfMoon	"Sty 28"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      162.676462
		SemiMajorAxisKm 8356901.92
		Eccentricity    0.438721427
		Inclination     157.098383
		AscendingNode   71.770064
		ArgOfPericenter -75.0353154
		MeanAnomaly     30.7827398
	}
}

DwarfMoon	"Sty 29"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      165.196213
		SemiMajorAxisKm 8442975.91
		Eccentricity    0.438649421
		Inclination     -6.32050317
		AscendingNode   71.0050726
		ArgOfPericenter 167.739233
		MeanAnomaly     3.45898245
	}
}

DwarfMoon	"Sty 30"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      166.267915
		SemiMajorAxisKm 8479452.12
		Eccentricity    0.377046372
		Inclination     135.699012
		AscendingNode   -98.8308241
		ArgOfPericenter 40.3755336
		MeanAnomaly     27.5405869
	}
}

DwarfMoon	"Sty 31"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      168.10342
		SemiMajorAxisKm 8541743.49
		Eccentricity    0.0498240003
		Inclination     168.654339
		AscendingNode   1.57564709
		ArgOfPericenter -7.82450292
		MeanAnomaly     -171.043663
	}
}

DwarfMoon	"Sty 32"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      170.699199
		SemiMajorAxisKm 8629450.6
		Eccentricity    0.234069314
		Inclination     145.381972
		AscendingNode   85.2033887
		ArgOfPericenter -63.8340352
		MeanAnomaly     175.53907
	}
}

DwarfMoon	"Sty 33"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      173.02128
		SemiMajorAxisKm 8707533.86
		Eccentricity    0.379268554
		Inclination     190.278487
		AscendingNode   -24.4121281
		ArgOfPericenter 32.0729523
		MeanAnomaly     127.433729
	}
}

DwarfMoon	"Sty 34"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      174.365185
		SemiMajorAxisKm 8752564.95
		Eccentricity    0.0215854675
		Inclination     220.696216
		AscendingNode   70.0093966
		ArgOfPericenter -145.392553
		MeanAnomaly     115.918337
	}
}

DwarfMoon	"Sty 35"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      175.968326
		SemiMajorAxisKm 8806131.38
		Eccentricity    0.0826908748
		Inclination     185.487185
		AscendingNode   69.4255035
		ArgOfPericenter -127.307448
		MeanAnomaly     -148.740507
	}
}

DwarfMoon	"Sty 36"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      177.484182
		SemiMajorAxisKm 8856631.9
		Eccentricity    0.407400027
		Inclination     187.908978
		AscendingNode   105.953458
		ArgOfPericenter -40.123784
		MeanAnomaly     64.8448025
	}
}

DwarfMoon	"Sty 37"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      179.009485
		SemiMajorAxisKm 8907302.2
		Eccentricity    0.00194063736
		Inclination     155.765623
		AscendingNode   -62.1930123
		ArgOfPericenter 22.584499
		MeanAnomaly     -138.74124
	}
}

DwarfMoon	"Sty 38"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      181.427774
		SemiMajorAxisKm 8987343.48
		Eccentricity    0.380455013
		Inclination     131.805228
		AscendingNode   54.3081255
		ArgOfPericenter 136.810907
		MeanAnomaly     -122.390344
	}
}

DwarfMoon	"Sty 39"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      184.458154
		SemiMajorAxisKm 9087143.75
		Eccentricity    0.495326681
		Inclination     168.051411
		AscendingNode   0.118992515
		ArgOfPericenter -140.785873
		MeanAnomaly     151.000348
	}
}

DwarfMoon	"Sty 40"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      186.49309
		SemiMajorAxisKm 9153854.16
		Eccentricity    0.162459799
		Inclination     143.390782
		AscendingNode   22.0464
		ArgOfPericenter -2.16446363
		MeanAnomaly     -91.0844158
	}
}

DwarfMoon	"Sty 41"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      187.477889
		SemiMajorAxisKm 9186051.2
		Eccentricity    0.495046861
		Inclination     151.84847
		AscendingNode   -136.502591
		ArgOfPericenter -173.829741
		MeanAnomaly     -51.0112487
	}
}

DwarfMoon	"Sty 42"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      190.519852
		SemiMajorAxisKm 9285151.24
		Eccentricity    0.150039652
		Inclination     204.584037
		AscendingNode   130.297431
		ArgOfPericenter 143.123243
		MeanAnomaly     -24.1677246
	}
}

DwarfMoon	"Sty 43"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      193.038827
		SemiMajorAxisKm 9366814.91
		Eccentricity    0.479099834
		Inclination     222.001579
		AscendingNode   -52.4756129
		ArgOfPericenter -60.2140929
		MeanAnomaly     -84.5922201
	}
}

DwarfMoon	"Sty 44"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      195.135914
		SemiMajorAxisKm 9434530.57
		Eccentricity    0.0537676316
		Inclination     154.566836
		AscendingNode   -152.713981
		ArgOfPericenter 63.7993987
		MeanAnomaly     -155.04684
	}
}

DwarfMoon	"Sty 45"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      196.873192
		SemiMajorAxisKm 9490444.35
		Eccentricity    0.463551721
		Inclination     226.749542
		AscendingNode   85.5005412
		ArgOfPericenter -32.9690447
		MeanAnomaly     153.385742
	}
}

DwarfMoon	"Sty 46"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      198.010558
		SemiMajorAxisKm 9526961.06
		Eccentricity    0.185318797
		Inclination     -6.64844914
		AscendingNode   -150.666484
		ArgOfPericenter 104.296882
		MeanAnomaly     -164.08507
	}
}

DwarfMoon	"Sty 47"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      200.64452
		SemiMajorAxisKm 9611260.77
		Eccentricity    0.35134725
		Inclination     201.050272
		AscendingNode   -8.07374585
		ArgOfPericenter -170.381164
		MeanAnomaly     -66.8334903
	}
}

DwarfMoon	"Sty 48"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      203.341844
		SemiMajorAxisKm 9697206.95
		Eccentricity    0.252810736
		Inclination     162.057778
		AscendingNode   57.34762
		ArgOfPericenter 36.7090243
		MeanAnomaly     112.210145
	}
}

DwarfMoon	"Sty 49"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      206.086979
		SemiMajorAxisKm 9784287.25
		Eccentricity    0.115387572
		Inclination     -2.28320056
		AscendingNode   -169.574508
		ArgOfPericenter 124.771528
		MeanAnomaly     -43.2793501
	}
}

DwarfMoon	"Sty 50"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      207.550864
		SemiMajorAxisKm 9830565.98
		Eccentricity    0.0929803514
		Inclination     193.400012
		AscendingNode   -28.0788289
		ArgOfPericenter -140.559948
		MeanAnomaly     -107.645548
	}
}

DwarfMoon	"Sty 51"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      209.557044
		SemiMajorAxisKm 9893812.32
		Eccentricity    0.331194558
		Inclination     229.216087
		AscendingNode   91.2283317
		ArgOfPericenter 8.28252951
		MeanAnomaly     -36.1926416
	}
}

DwarfMoon	"Sty 52"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      211.579145
		SemiMajorAxisKm 9957356.66
		Eccentricity    0.386522567
		Inclination     203.308509
		AscendingNode   148.949144
		ArgOfPericenter 107.804371
		MeanAnomaly     178.727759
	}
}

DwarfMoon	"Sty 53"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      212.954067
		SemiMajorAxisKm 10000447.9
		Eccentricity    0.436297817
		Inclination     151.604323
		AscendingNode   93.1487308
		ArgOfPericenter 9.15026754
		MeanAnomaly     76.1620067
	}
}

DwarfMoon	"Sty 54"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      214.994886
		SemiMajorAxisKm 10064238.3
		Eccentricity    0.107324989
		Inclination     189.162765
		AscendingNode   21.6040022
		ArgOfPericenter -171.462663
		MeanAnomaly     86.7651393
	}
}

DwarfMoon	"Sty 55"
{
	ParentBody     "Sty"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      217.056998
		SemiMajorAxisKm 10128489.6
		Eccentricity    0.103127596
		Inclination     137.993994
		AscendingNode   -110.375289
		ArgOfPericenter 58.103328
		MeanAnomaly     57.1166027
	}
}
