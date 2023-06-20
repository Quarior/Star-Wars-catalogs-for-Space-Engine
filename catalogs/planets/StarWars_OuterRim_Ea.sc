// http://starwars.wikia.com/wiki/Geonosis
// Region : Outer Rim
// Sector : Arkanis Sector
// Grid location : R16
// X : 9674.4, Y : -10099.46, Z : -120.62305587004028
Planet	"Geriss"
{
	ParentBody     "Ea"
	Class          "Selena"
	Mass            0.24874
	Radius          3906.6

	NoAtmosphere	true 

	Orbit
	{
		RefPlane        "Equator"
		//Period          0.150217947
		SemiMajorAxis   0.278920794
		Eccentricity    0.0656962613
		Inclination     -1.19240616
		AscendingNode   52.0171957
		ArgOfPericenter 29.4878521
		MeanAnomaly     312.400225
	}
}

DwarfMoon	"Geriss 1"
{
	ParentBody     "Geriss"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      2.55868635
		SemiMajorAxisKm 49697.9938
		Eccentricity    0.0154599426
		Inclination     -11.4672838
		AscendingNode   91.1685737
		ArgOfPericenter -147.611588
		MeanAnomaly     -144.918023
	}
}

Planet	"Geonosis"
{
	ParentBody     "Ea"
	Class          "Terra"
	Mass            0.9
	Radius          5685
	InertiaMoment   0.33051
	Oblateness      0.0073876
	RotationPeriod  30
	RotationOffset  8.18
	RotationEpoch   0
	Obliquity       -68.572
	EqAscendNode    40

	Albedo          0.27672
	Brightness      1.5
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "terra_arid_rusty_blue_plants.cfg"
		SurfStyle       0.03656
		Randomize      (0.166, 0.601, 0.034)
		colorDistMagn   0.090136
		colorDistFreq   533.5
		detailScale     26917
		drivenDarkening -1
		seaLevel        0
		snowLevel       0.98831
		tropicLatitude  0.71586
		icecapLatitude  1
		icecapHeight    0.12528
		climatePole     0.9084
		climateTropic   0.9084
		climateEquator  0.9313
		climateSteppeMin 0
		climateSteppeMax 0.3125
		climateForestMin 0.25
		climateForestMax 0.57252
		climateGrassMin  0.5
		climateGrassMax  0.8125
		humidity        0
		heightTempGrad  0.4875
		beachWidth      0.00081606
		tropicWidth     0.07
		mainFreq        3.626
		venusFreq       0.68702
		venusMagn       1.0305
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.022901
		erosion         0.32824
		montesMagn      0.91603
		montesFreq      15.267
		montesSpiky     0.015267
		montesFraction  0.015267
		dunesMagn       0.22901
		dunesFreq       6106.9
		dunesFraction   0.022901
		hillsMagn       0.12384
		hillsFreq       229.01
		hillsFraction   0.0076336
		hills2Fraction  0.015267
		riversMagn      0
		riversFreq      0
		riversSin       0
		riftsMagn       0
		riftsFreq       1.5267
		riftsSin        2.4427
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.45802
		cracksFreq      2.7481
		cracksOctaves   1
		craterMagn      1.9847
		craterFreq      24.427
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		volcanoMagn     0.28244
		volcanoFreq     0.90076
		volcanoDensity  0.29898
		volcanoOctaves  3
		volcanoActivity 0.27849
		volcanoFlows    0.8115
		volcanoRadius   0.56881
		volcanoTemp     318.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.15267
		stripeTwist     3.2061
		cycloneMagn     0.91603
		cycloneFreq     0.12214
		cycloneDensity  0
		cycloneOctaves  1
		BumpHeight      10
		BumpOffset      3.6731
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.3
		SpecBrightIce   0.3
		RoughnessWater  0.25463
		RoughnessIce    0.25463
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      1.3973
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          18.16
		Velocity        101.41
		BumpHeight      2.721
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.77863
		mainOctaves     14
		Coverage        0.5
		stripeZones     0.15267
		stripeTwist     3.2061
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          75
		Density         1.6358
		Pressure        1.4465
		Greenhouse      34.351
		Bright          5
		Opacity         1
		SkyLight        3
		Hue             0.4
		Saturation      1.25

		Composition
		{
			CO2       	61.786
			N2        	18.419
			SO2       	12.553
			H2O       	6.6669
			CO        	0.47756
			NH3       	0.050527
			C2H4      	0.035017
			H2S       	0.0074453
			C2H2      	0.0023413
			CH4       	0.00088943
			Ar        	0.00075301
			C2H6      	0.00024535
			Ne        	4.9199e-05
			C3H8      	2.4153e-05
		}
	}

	Aurora
	{
		Height         55.127
		NorthLat       58.493
		NorthLon       171.2
		NorthRadius    1665.3
		NorthWidth     452.43
		NorthRings     5
		NorthBright    0.3
		NorthFlashFreq 73.106
		NorthMoveSpeed 0.78022
		NorthParticles 50000
		SouthLat       -64.188
		SouthLon       18.001
		SouthRadius    1129.9
		SouthWidth     428.37
		SouthRings     4
		SouthBright    0.3
		SouthFlashFreq 74.08
		SouthMoveSpeed 0.58188
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     8318.5
		OuterRadius     13133
		EdgeRadius      16432
		MeanRadius      9486.4
		Thickness       0.1
		RocksMaxSize    0.05
		RocksSpacing    1
		DustDrawDist    2
		ChartRadius     17830
		RotationPeriod  4.4937
		Brightness      0.3
		FrontBright     4
		BackBright      4
		Density         1
		Opacity         0.5
		SelfShadow      1
		PlanetShadow    0.1
		Hapke           1
		SpotBright      0
		SpotWidth       0.001
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       4
		densityScale    7.5
		densityOffset   -2
		densityPower    1
		colorContrast   0
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.70137
		SemiMajorAxis   0.779168508
		Eccentricity    0.0282658044
		Inclination     -2.83612769
		AscendingNode   85.6915042
		ArgOfPericenter 67.7379197
		MeanAnomaly     94.3843215
	}
}

DwarfMoon	"Geonosis 1"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.834809231
		SemiMajorAxisKm 24093.1605
		Eccentricity    0.000459540752
		Inclination     1.1894007
		AscendingNode   -91.1128938
		ArgOfPericenter 107.71739
		MeanAnomaly     115.461061
	}
}

DwarfMoon	"Geonosis 2"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.36436246
		SemiMajorAxisKm 33430.7528
		Eccentricity    0.00122275297
		Inclination     -0.409270293
		AscendingNode   54.1626109
		ArgOfPericenter 170.493253
		MeanAnomaly     -55.1077782
	}
}

Moon	"Geonosis 3"
{
	ParentBody     "Geonosis"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.22974193
		SemiMajorAxisKm 46387.2406
		Eccentricity    0.00484260637
		Inclination     -0.273540882
		AscendingNode   59.4245587
		ArgOfPericenter 165.044616
		MeanAnomaly     148.478731
	}
}

DwarfMoon	"Geonosis 4"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      3.64380877
		SemiMajorAxisKm 64365.1701
		Eccentricity    0.0118037406
		Inclination     1.33200376
		AscendingNode   -23.470069
		ArgOfPericenter 42.7050165
		MeanAnomaly     48.3783168
	}
}

Moon	"Geonosis 5"
{
	ParentBody     "Geonosis"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      5.91208581
		SemiMajorAxisKm 89310.6611
		Eccentricity    0.0194869731
		Inclination     0.746458852
		AscendingNode   42.3761166
		ArgOfPericenter 113.306728
		MeanAnomaly     -49.488696
	}
}

Moon	"Geonosis 6"
{
	ParentBody     "Geonosis"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      9.7309596
		SemiMajorAxisKm 123924.075
		Eccentricity    0.0403249223
		Inclination     -0.24957999
		AscendingNode   -157.556227
		ArgOfPericenter 125.408802
		MeanAnomaly     -153.171241
	}
}

Moon	"Geonosis 7"
{
	ParentBody     "Geonosis"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      15.9083133
		SemiMajorAxisKm 171952.332
		Eccentricity    0.00608158136
		Inclination     0.613810063
		AscendingNode   -136.677766
		ArgOfPericenter 161.450038
		MeanAnomaly     -33.4587967
	}
}

DwarfMoon	"Geonosis 8"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      26.0150463
		SemiMajorAxisKm 238594.513
		Eccentricity    0.0210371154
		Inclination     -1.07072597
		AscendingNode   -62.2425047
		ArgOfPericenter 141.093481
		MeanAnomaly     -80.1715948
	}
}

DwarfMoon	"Geonosis 9"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      42.5301127
		SemiMajorAxisKm 331064.668
		Eccentricity    0.0376756211
		Inclination     0.762758575
		AscendingNode   0.0206412748
		ArgOfPericenter -4.40064082
		MeanAnomaly     -117.097676
	}
}

DwarfMoon	"Geonosis 10"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      890.150996
		SemiMajorAxisKm 2514326.32
		Eccentricity    0.098266506
		Inclination     133.159522
		AscendingNode   98.9593336
		ArgOfPericenter 166.408178
		MeanAnomaly     -150.303804
	}
}

DwarfMoon	"Geonosis 11"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      919.167344
		SemiMajorAxisKm 2568673.66
		Eccentricity    0.383363984
		Inclination     206.774183
		AscendingNode   -82.3848725
		ArgOfPericenter 146.956117
		MeanAnomaly     -34.9009465
	}
}

DwarfMoon	"Geonosis 12"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      939.312526
		SemiMajorAxisKm 2606069.24
		Eccentricity    0.0729988153
		Inclination     136.434634
		AscendingNode   -112.514186
		ArgOfPericenter 110.639471
		MeanAnomaly     -150.38732
	}
}

DwarfMoon	"Geonosis 13"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      991.666552
		SemiMajorAxisKm 2702026.79
		Eccentricity    0.226261595
		Inclination     178.048169
		AscendingNode   157.273658
		ArgOfPericenter -118.38935
		MeanAnomaly     140.182356
	}
}

DwarfMoon	"Geonosis 14"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1023.72834
		SemiMajorAxisKm 2759957.26
		Eccentricity    0.31394353
		Inclination     186.357376
		AscendingNode   -85.4444691
		ArgOfPericenter 170.778393
		MeanAnomaly     110.105625
	}
}

DwarfMoon	"Geonosis 15"
{
	ParentBody     "Geonosis"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1077.71421
		SemiMajorAxisKm 2856154.02
		Eccentricity    0.140787101
		Inclination     148.198282
		AscendingNode   179.195649
		ArgOfPericenter -46.94433
		MeanAnomaly     -117.472511
	}
}

Planet	"Conus"
{
	ParentBody     "Ea"
	Class          "Terra"
	Mass            0.74541
	Radius          6264.1

	NoRings		true

	Orbit
	{
		RefPlane        "Equator"
		Period          1.03949022
		SemiMajorAxis   1.01285399
		Eccentricity    0.159772118
		Inclination     -2.6019043
		AscendingNode   64.9218825
		ArgOfPericenter 161.658539
		MeanAnomaly     224.584333
	}
}

DwarfMoon	"Conus 1"
{
	ParentBody     "Conus"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.195106986
		SemiMajorAxisKm 12884.2472
		Eccentricity    8.62854133e-05
		Inclination     -0.0130614357
		AscendingNode   -10.9126802
		ArgOfPericenter -145.018112
		MeanAnomaly     175.978715
	}
}

DwarfMoon	"Conus 2"
{
	ParentBody     "Conus"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.26602698
		SemiMajorAxisKm 15842.6426
		Eccentricity    3.61509957e-05
		Inclination     -0.000142065296
		AscendingNode   45.9263449
		ArgOfPericenter 170.141456
		MeanAnomaly     -5.79035752
	}
}

DwarfMoon	"Conus 3"
{
	ParentBody     "Conus"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.355050307
		SemiMajorAxisKm 19204.5336
		Eccentricity    2.14281324e-05
		Inclination     -0.0111192536
		AscendingNode   -39.3750335
		ArgOfPericenter -175.433096
		MeanAnomaly     -122.698079
	}
}

Moon	"Conus 4"
{
	ParentBody     "Conus"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1.00127005
		SemiMajorAxisKm 38340.9146
		Eccentricity    0.000451241795
		Inclination     -0.0981418937
		AscendingNode   -124.754977
		ArgOfPericenter -29.4529561
		MeanAnomaly     26.2844028
	}
}

Planet	"Mabonte"
{
	ParentBody     "Ea"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//Period          4.46819079
		SemiMajorAxis   2.67776474
		Eccentricity    0.0470000827
		Inclination     2.14576495
		AscendingNode   -36.9983321
		ArgOfPericenter 100.779056
		MeanAnomaly     309.557078
	}
}

DwarfMoon	"Mabonte 1"
{
	ParentBody     "Mabonte"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.164646852
		//SemiMajorAxisKm 7980.47824
		Eccentricity    2.22381259e-05
		Inclination     -0.00894205328
		AscendingNode   -8.30723315
		ArgOfPericenter 10.8126727
		MeanAnomaly     87.7175205
	}
}

DwarfMoon	"Mabonte 2"
{
	ParentBody     "Mabonte"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.265305111
		//SemiMajorAxisKm 10968.7559
		Eccentricity    9.4031486e-06
		Inclination     -0.0106893854
		AscendingNode   9.14312004
		ArgOfPericenter -162.518347
		MeanAnomaly     36.8709106
	}
}

DwarfMoon	"Mabonte 3"
{
	ParentBody     "Mabonte"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      18.0545417
		//SemiMajorAxisKm 182832.181
		Eccentricity    0.0778266448
		Inclination     139.799497
		AscendingNode   -50.8100847
		ArgOfPericenter 128.416267
		MeanAnomaly     -131.183561
	}
}

Planet	"Habon"
{
	ParentBody     "Ea"
	Class          "Jupiter"
	Mass            115.97
	Radius          61044

	Orbit
	{
		RefPlane        "Equator"
		Period          31.1923994
		SemiMajorAxis   9.78177899
		Eccentricity    0.0742857153
		Inclination     1.05545636
		AscendingNode   -92.9603964
		ArgOfPericenter 199.624302
		MeanAnomaly     289.074321
	}
}

DwarfMoon	"Habon 1"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.366109534
		SemiMajorAxisKm 105424.136
		Eccentricity    6.14698347e-05
		Inclination     -0.00424050924
		AscendingNode   165.179149
		ArgOfPericenter -18.7642899
		MeanAnomaly     -51.6294941
	}
}

DwarfMoon	"Habon 2"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.370756383
		SemiMajorAxisKm 106314.324
		Eccentricity    7.62727664e-05
		Inclination     0.000678914886
		AscendingNode   -78.8988178
		ArgOfPericenter -50.8688403
		MeanAnomaly     110.21774
	}
}

DwarfMoon	"Habon 3"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.396227749
		SemiMajorAxisKm 111129.48
		Eccentricity    1.54424987e-05
		Inclination     -0.00207854941
		AscendingNode   86.7468081
		ArgOfPericenter -93.2363159
		MeanAnomaly     -84.2403558
	}
}

DwarfMoon	"Habon 4"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.42165946
		SemiMajorAxisKm 115835.209
		Eccentricity    5.72572374e-05
		Inclination     -0.0102971928
		AscendingNode   -105.632203
		ArgOfPericenter -38.120821
		MeanAnomaly     -117.958483
	}
}

DwarfMoon	"Habon 5"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.43802502
		SemiMajorAxisKm 118813.367
		Eccentricity    6.27325964e-07
		Inclination     0.0118976333
		AscendingNode   -112.847597
		ArgOfPericenter -148.729866
		MeanAnomaly     -1.30840553
	}
}

DwarfMoon	"Habon 6"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.453110944
		SemiMajorAxisKm 121525.959
		Eccentricity    7.25627234e-05
		Inclination     0.00232428452
		AscendingNode   125.283532
		ArgOfPericenter 52.7819584
		MeanAnomaly     96.7272512
	}
}

DwarfMoon	"Habon 7"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.498701967
		SemiMajorAxisKm 129546.816
		Eccentricity    6.99289364e-06
		Inclination     0.00908692271
		AscendingNode   -31.1126716
		ArgOfPericenter -50.0061927
		MeanAnomaly     65.2325829
	}
}

DwarfMoon	"Habon 8"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.535964135
		SemiMajorAxisKm 135922.027
		Eccentricity    9.22057784e-05
		Inclination     0.0145252283
		AscendingNode   -156.13802
		ArgOfPericenter -166.392179
		MeanAnomaly     -33.0807236
	}
}

Moon	"Habon 9"
{
	ParentBody     "Habon"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1.07568707
		SemiMajorAxisKm 216267.319
		Eccentricity    0.00037234131
		Inclination     -1.16060039
		AscendingNode   -145.299586
		ArgOfPericenter 66.4449906
		MeanAnomaly     132.199433
	}
}

Moon	"Habon 10"
{
	ParentBody     "Habon"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      2.05645062
		SemiMajorAxisKm 333128.342
		Eccentricity    0.00464433571
		Inclination     -1.04333896
		AscendingNode   -76.5613061
		ArgOfPericenter 97.4759885
		MeanAnomaly     76.9012977
	}
}

Moon	"Habon 11"
{
	ParentBody     "Habon"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      3.9299097
		SemiMajorAxisKm 513135.748
		Eccentricity    0.002336198
		Inclination     1.28047522
		AscendingNode   155.578081
		ArgOfPericenter -55.7647627
		MeanAnomaly     -149.207841
	}
}

Moon	"Habon 12"
{
	ParentBody     "Habon"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      7.51576829
		SemiMajorAxisKm 790410.969
		Eccentricity    0.02816486
		Inclination     0.992803402
		AscendingNode   2.85326379
		ArgOfPericenter -125.389803
		MeanAnomaly     -66.0996323
	}
}

Moon	"Habon 13"
{
	ParentBody     "Habon"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      14.3684431
		SemiMajorAxisKm 1217513.11
		Eccentricity    0.0149444856
		Inclination     -0.588799962
		AscendingNode   48.7535461
		ArgOfPericenter -177.225423
		MeanAnomaly     21.2664501
	}
}

Moon	"Habon 14"
{
	ParentBody     "Habon"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      27.4689505
		SemiMajorAxisKm 1875401.82
		Eccentricity    0.0153433712
		Inclination     -0.148472486
		AscendingNode   84.8394553
		ArgOfPericenter -144.63361
		MeanAnomaly     -80.7613401
	}
}

DwarfMoon	"Habon 15"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      52.5138063
		SemiMajorAxisKm 2888783.68
		Eccentricity    0.00321679313
		Inclination     0.583917389
		AscendingNode   139.618549
		ArgOfPericenter -65.4534991
		MeanAnomaly     -69.0243225
	}
}

DwarfMoon	"Habon 16"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      524.092773
		SemiMajorAxisKm 13390747
		Eccentricity    0.396240669
		Inclination     141.419441
		AscendingNode   -102.881622
		ArgOfPericenter 125.140479
		MeanAnomaly     172.942551
	}
}

DwarfMoon	"Habon 17"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      526.820705
		SemiMajorAxisKm 13437173.1
		Eccentricity    0.238654981
		Inclination     215.685031
		AscendingNode   -42.2902971
		ArgOfPericenter -59.6450683
		MeanAnomaly     148.228363
	}
}

DwarfMoon	"Habon 18"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      531.063228
		SemiMajorAxisKm 13509217
		Eccentricity    0.423281261
		Inclination     -22.6506133
		AscendingNode   -94.5643892
		ArgOfPericenter -94.7751664
		MeanAnomaly     -104.909821
	}
}

DwarfMoon	"Habon 19"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      535.802908
		SemiMajorAxisKm 13589476.7
		Eccentricity    0.346268624
		Inclination     213.140628
		AscendingNode   -177.123166
		ArgOfPericenter 83.4719089
		MeanAnomaly     106.886709
	}
}

DwarfMoon	"Habon 20"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      540.897886
		SemiMajorAxisKm 13675489.5
		Eccentricity    0.255918214
		Inclination     177.093418
		AscendingNode   42.782221
		ArgOfPericenter 117.651354
		MeanAnomaly     -158.592035
	}
}

DwarfMoon	"Habon 21"
{
	ParentBody     "Habon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      545.869471
		SemiMajorAxisKm 13759159.1
		Eccentricity    0.374954291
		Inclination     23.686288
		AscendingNode   -110.549882
		ArgOfPericenter -54.3699427
		MeanAnomaly     -36.6514047
	}
}

Barycenter	"Abyssissa-Abyssissa 1"
{
	ParentBody     "Ea"
	Mass            2.6117
	Radius          4718.8
	RotationPeriod  24
	RotationEpoch   0
	Obliquity       -inf
	EqAscendNode    -inf


	Orbit
	{
		RefPlane        "Equator"
		//Period          56.3243401
		SemiMajorAxis   14.5031977
		Eccentricity    0.111205451
		Inclination     5.57412909
		AscendingNode   35.7149957
		ArgOfPericenter 284.297184
		MeanAnomaly     68.4981477
	}
}

Planet	"Abyssissa"
{
	ParentBody     "Abyssissa-Abyssissa 1"
	Class          "Aquaria"
	Mass            2.4397
	Radius          9619.9

	NoRings		true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00627195526
		//SemiMajorAxis   4.4500533e-05
		Eccentricity    0.00061882427
		Inclination     -0.770209659
		AscendingNode   -60.7852357
		ArgOfPericenter 43.1503638
		MeanAnomaly     -99.5422609
	}
}

Moon	"Abyssissa 1"
{
	ParentBody     "Abyssissa-Abyssissa 1"
	Class          "Aquaria"
	Mass            0.17199
	Radius          4018.9

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00627195526
		//SemiMajorAxis   0.000631249198
		Eccentricity    0.00061882427
		Inclination     -0.770209659
		AscendingNode   -60.7852357
		ArgOfPericenter -136.849636
		MeanAnomaly     -99.5422609
	}
}
