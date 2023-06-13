// http://starwars.wikia.com/wiki/Kashyyyk
// Region : Mid Rim
// Sector : Mytaranor Sector
// Grid location : P9
// X : 7087.76, Y : 167.46, Z : -427.3491654564043
Planet	"Taakarroo"
{
	ParentBody     "Kashyyyk System"
	Class	       "Selena"

	Mass            0.15
	Radius          1285.5
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.251
		//Period          0.24
		Eccentricity    0.004
		Inclination     0.24555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Taakarroo 1"
{
	ParentBody     "Taakarroo"
	Class	       "Asteroid"

	Mass            3.194917e-006
	Radius          77.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.000381021466
		//Period          0.00958268243
		Eccentricity    0.0001060218
		Inclination     20.3485
		AscendingNode   340.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Kallalarra"
{
	ParentBody     "Kashyyyk System"
	Class	       "Desert"

	Mass            0.765
	Radius          4685
	InertiaMoment   0.3975344

	Albedo          0.5
	Color          (1.000 1.000 1.000)
	
	Atmosphere
	{
		Greenhouse	175
	}
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.573
		//Period          0.694
		Eccentricity    0.002
		Inclination     0.8563
		AscendingNode   340.4993
		ArgOfPericenter 25.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Kallalarra 1"
{
	ParentBody     "Kallalarra"
	Class	       "Asteroid"

	Mass            4.194917e-006
	Radius          53.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.000556244548
		//Period          0.0116361144
		Eccentricity    0.00065
		Inclination     2.3485
		AscendingNode   340.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Kallalarra 2"
{
	ParentBody     "Kallalarra"
	Class	       "Asteroid"

	Mass            1.694917e-006
	Radius          20.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.000677950826
		//Period          0.0116361144
		Eccentricity    0.00035
		Inclination     9.3485
		AscendingNode   340.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Kallalarra 3"
{
	ParentBody     "Kallalarra"
	Class	       "Selena"

	Mass            0.003504
	Radius          295
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.35
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.000842086184
		//Period          0.0186361144
		Eccentricity    0.00025
		Inclination     34.3485
		AscendingNode   335.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Kashyyyk"
{
	ParentBody     "Kashyyyk System"
	Class          "Terra"
	Mass            0.743
	Radius          6382.5
	InertiaMoment   0.32903
	Oblateness      0.0037993
	RotationPeriod  26
	Obliquity       -28.208
	EqAscendNode    169.26

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_earth_green.cfg"
		SurfStyle       0.37143
		Randomize      (-0.858, 0.100, 0.237)
		colorDistMagn   0.085383
		colorDistFreq   992.54
		detailScale     16416
		drivenDarkening -1
		seaLevel        0.44275
		snowLevel       1.2
		tropicLatitude  0.813
		icecapLatitude  0.849
		icecapHeight    1
		climatePole     1
		climateTropic   0.45
		climateEquator  0.5
		climateSteppeMin 0
		climateSteppeMax 0.3125
		climateForestMin 0.25
		climateForestMax 0.5625
		climateGrassMin  0.5
		climateGrassMax  0.8125
		humidity        0.92366
		heightTempGrad  0
		beachWidth      0.00067176
		tropicWidth     0.07
		mainFreq        2.9389
		venusFreq       0.90076
		venusMagn       0.53435
		mareFreq        4.0648
		mareDensity     0.033185
		terraceProb     0.32199
		erosion         0.11714
		montesMagn      0.15873
		montesFreq      111.11
		montesSpiky     0.99206
		montesFraction  0.23492
		dunesMagn       0.035188
		dunesFreq       73.685
		dunesFraction   0.30458
		hillsMagn       1.6778
		hillsFreq       7000
		hillsFraction   0.011111
		hills2Fraction  0.80238
		riversMagn      2.3809
		riversFreq      1.6667
		riversSin       10
		riftsMagn       60.93
		riftsFreq       2.7767
		riftsSin        4.8486
		canyonsMagn     1.3016
		canyonsFreq     46.032
		canyonsFraction 0.084921
		cracksMagn      2.4603
		cracksFreq      1.5079
		cracksOctaves   4
		craterMagn      0.59265
		craterFreq      20.718
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.67152
		volcanoFreq     0.85477
		volcanoDensity  0.29237
		volcanoOctaves  3
		volcanoActivity 0.27951
		volcanoFlows    0.88008
		volcanoRadius   0.52709
		volcanoTemp     1463.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.15267
		stripeFluct     0
		stripeTwist     -20
		cycloneMagn     8.0916
		cycloneFreq     0.24427
		cycloneDensity  0.48092
		cycloneOctaves  3
		BumpHeight      15
		BumpOffset      9.4132
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

	NoOcean         true

	Clouds
	{
		Height          41.98
		Velocity        100
		BumpHeight      2.9114
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     11
		Coverage        0.40458
		stripeZones     0.15267
		stripeFluct     0
		stripeTwist     -20
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          144.78
		Density         100
		Pressure        0.976
		Greenhouse      10.763
		Bright          10.276
		Opacity         1
		SkyLight        2.3016
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

	Aurora
	{
		Height         78.434
		NorthLat       78.286
		NorthLon       32.685
		NorthRadius    1710.1
		NorthWidth     615.16
		NorthRings     2
		NorthBright    0.3
		NorthFlashFreq 72.818
		NorthMoveSpeed 1.2269
		NorthParticles 50000
		SouthLat       -65.424
		SouthLon       -142.65
		SouthRadius    1618.1
		SouthWidth     460.48
		SouthRings     5
		SouthBright    0.3
		SouthFlashFreq 72.092
		SouthMoveSpeed 1.2509
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
		Epoch           2454762
		Period          1.1304739726
		//SemiMajorAxis   1.15402669
		Eccentricity    0.03
		Inclination     0.0889
		AscendingNode   165.410561
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

Moon	"Kashyyyk 1/Wookiee Colony 1"
{
	ParentBody     "Kashyyyk"
	Class          "Terra"
	Mass            0.6121
	Radius          4324
	InertiaMoment   0.32867
	Oblateness      0.0014321
	RotationPeriod  26
	Obliquity       0.1
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_default.cfg"
		SurfStyle       0.81508
		Randomize      (-0.482, -0.571, -0.798)
		colorDistMagn   0.092615
		colorDistFreq   540.09
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.17188
		snowLevel       0.85
		tropicLatitude  0.4725
		icecapLatitude  0.95055
		icecapHeight    0.013614
		climatePole     0.32061
		climateTropic   0.62595
		climateEquator  0.6875
		climateSteppeMin 0
		climateSteppeMax 0.3125
		climateForestMin 0.25
		climateForestMax 0.5625
		climateGrassMin  0.5
		climateGrassMax  0.8125
		humidity        0.83969
		heightTempGrad  0.625
		beachWidth      0.0012591
		tropicWidth     0.07
		mainFreq        0.9977
		venusFreq       0.82443
		venusMagn       0.75978
		mareFreq        1.9828
		mareDensity     0
		terraceProb     0.33469
		erosion         0
		montesMagn      0.2495
		montesFreq      210.82
		montesSpiky     0.92748
		montesFraction  0.2157
		dunesMagn       0.058518
		dunesFreq       35.031
		dunesFraction   0.77366
		hillsMagn       0.14872
		hillsFreq       409.88
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      3.0349
		riversSin       4.6612
		riftsMagn       52.966
		riftsFreq       2.0354
		riftsSin        6.3265
		canyonsMagn     0.046335
		canyonsFreq     117.64
		canyonsFraction 0
		cracksMagn      0.068906
		cracksFreq      0.33465
		cracksOctaves   0
		craterMagn      0.70462
		craterFreq      13.189
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.75573
		volcanoFreq     0.57048
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.78312
		volcanoRadius   0.40987
		volcanoTemp     304.57
		lavaCoverTidal  0.1171
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.9536
		stripeTwist     0.15521
		cycloneMagn     2.253
		cycloneFreq     1.0389
		cycloneDensity  0.37994
		cycloneOctaves  3
		BumpHeight      17.35
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.022
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          30
		Velocity        100
		BumpHeight      2.7753
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.5867
		mainOctaves     10
		Coverage        0.28
		stripeZones     1.9536
		stripeTwist     0.15521
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          80
		Density         100
		Pressure        0.926
		Greenhouse      11.372
		Bright          10.276
		Opacity         1
		SkyLight        2.3016
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

	Aurora
	{
		Height         75.135
		NorthLat       64.849
		NorthLon       113.43
		NorthRadius    1427.7
		NorthWidth     248.75
		NorthRings     5
		NorthBright    0.3
		NorthFlashFreq 72.359
		NorthMoveSpeed 0.65127
		NorthParticles 50000
		SouthLat       -88.404
		SouthLon       -61.264
		SouthRadius    1092.9
		SouthWidth     439.14
		SouthRings     4
		SouthBright    0.3
		SouthFlashFreq 66.791
		SouthMoveSpeed 1.3351
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
		Epoch           2454762
		PeriodDays      1.27382896
		SemiMajorAxisKm 54930.1656
		Eccentricity    0.01
		Inclination     0.1
		AscendingNode   0
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

Moon	"Kashyyyk 2/Wookiee Colony 2"
{
	ParentBody     "Kashyyyk"
	Class          "Terra"
	Mass            0.4921
	Radius          3765
	InertiaMoment   0.32973
	Oblateness      0.0011805
	RotationPeriod  26
	Obliquity       0.2
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_LB_green.cfg"
		SurfStyle       0.66754
		Randomize      (-0.993, -0.446, -0.623)
		colorDistMagn   0.049663
		colorDistFreq   420.03
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.10114
		snowLevel       0.85
		tropicLatitude  0.47096
		icecapLatitude  0.96808
		icecapHeight    0.023479
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin 0
		climateSteppeMax 0.3125
		climateForestMin 0.25
		climateForestMax 0.5625
		climateGrassMin  0.5
		climateGrassMax  0.8125
		humidity        0.53435
		heightTempGrad  0.625
		beachWidth      0.00098617
		tropicWidth     0.07
		mainFreq        0.70451
		venusFreq       0.8235
		venusMagn       0.22901
		mareFreq        2.476
		mareDensity     0
		terraceProb     0.2686
		erosion         0
		montesMagn      0.2405
		montesFreq      161.65
		montesSpiky     0.95837
		montesFraction  0.44373
		dunesMagn       0.067527
		dunesFreq       28.676
		dunesFraction   0.30437
		hillsMagn       0.14975
		hillsFreq       432.14
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      3.7839
		riversSin       5.3673
		riftsMagn       53.9
		riftsFreq       3.0201
		riftsSin        6.9046
		canyonsMagn     0.040026
		canyonsFreq     101.62
		canyonsFraction 0
		cracksMagn      0.10528
		cracksFreq      0.3993
		cracksOctaves   0
		craterMagn      0.76646
		craterFreq      10.14
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.64653
		volcanoFreq     0.7118
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.82191
		volcanoRadius   0.49102
		volcanoTemp     237.07
		lavaCoverTidal  0.18287
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.2345
		stripeTwist     0.15521
		cycloneMagn     2.664
		cycloneFreq     0.62086
		cycloneDensity  0.19225
		cycloneOctaves  3
		BumpHeight      16.848
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.5926
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          30
		Velocity        100
		BumpHeight      2.4997
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.79704
		mainOctaves     10
		Coverage        0.31
		stripeZones     1.2345
		stripeTwist     0.15521
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          80
		Density         100
		Pressure        0.886
		Greenhouse      7.561
		Bright          10.276
		Opacity         1
		SkyLight        2.3016
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

	Aurora
	{
		Height         61.134
		NorthLat       88.71
		NorthLon       60.314
		NorthRadius    904.77
		NorthWidth     192.94
		NorthRings     5
		NorthBright    0.3
		NorthFlashFreq 78.518
		NorthMoveSpeed 1.1158
		NorthParticles 50000
		SouthLat       -60.001
		SouthLon       -129.5
		SouthRadius    990.52
		SouthWidth     229.65
		SouthRings     4
		SouthBright    0.3
		SouthFlashFreq 70.777
		SouthMoveSpeed 0.88105
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
		Epoch           2454762
		PeriodDays      6.4903574
		SemiMajorAxisKm 157697.996
		Eccentricity    0.04
		Inclination     0.2
		AscendingNode   0
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

DwarfMoon	"Kashyyyk 3"
{
	ParentBody     "Kashyyyk"
	Class	       "Selena"

	Mass            0.07504
	Radius          575
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.35
	Color          (1.000 1.000 1.000)

	NoClouds	true

	NoAtmosphere	true

	NoAurora	true

	Orbit
	{
		SemiMajorAxis   0.00103195319
		//Period          0.0176595148
		Eccentricity    0.00065
		Inclination     15
		ArgOfPericenter 5.2
		MeanAnomaly     140.8083
		RefPlane       "Equator"
	}
}

Planet	"Trandosha/Dosha/Hsskhor"
{
	ParentBody     "Kashyyyk System"
	Class          "Terra"
	Mass            0.843
	Radius          6935.3
	InertiaMoment   0.33412
	Oblateness      0.0047339
	RotationPeriod  25
	Obliquity       29.473
	EqAscendNode    135.99

	AlbedoBond      0.3
	AlbedoGeom      0.36
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
		Preset         "terra_wet_rocky_green.cfg"
		SurfStyle       0.49624
		Randomize      (0.007, -0.531, 0.321)
		colorDistMagn   0.046409
		colorDistFreq   762.25
		detailScale     32768
		drivenDarkening 0
		seaLevel        0.19084
		snowLevel       0.81699
		tropicLatitude  0.38931
		icecapLatitude  2
		icecapHeight    0.143
		climatePole     0.73282
		climateTropic   0.80153
		climateEquator  0.85496
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        1
		heightTempGrad  0.4875
		beachWidth      0.00050382
		tropicWidth     0.29771
		mainFreq        0.94363
		venusFreq       0.68602
		venusMagn       0.45802
		mareFreq        0.0031902
		mareDensity     0.038168
		terraceProb     0.21593
		erosion         0.83969
		montesMagn      0.30534
		montesFreq      371.33
		montesSpiky     0.12214
		montesFraction  0.15093
		dunesMagn       0.068713
		dunesFreq       57.776
		dunesFraction   0.4657
		hillsMagn       0.14787
		hillsFreq       878
		hillsFraction   0.13562
		hills2Fraction  0.099939
		riversMagn      59.19
		riversFreq      2.6738
		riversSin       5.907
		riftsMagn       0
		riftsFreq       3.4874
		riftsSin        4.34
		canyonsMagn     0.04084
		canyonsFreq     161.71
		canyonsFraction 0.52342
		cracksMagn      0.081729
		cracksFreq      0.93745
		cracksOctaves   0
		craterMagn      0.60121
		craterFreq      17.525
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.75163
		volcanoFreq     0.68453
		volcanoDensity  0.3344
		volcanoOctaves  3
		volcanoActivity 0.2935
		volcanoFlows    0.75189
		volcanoRadius   0.47095
		volcanoTemp     362.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.45802
		stripeFluct     0.045802
		stripeTwist     9.313
		cycloneMagn     8.5496
		cycloneFreq     0.22901
		cycloneDensity  0.42778
		cycloneOctaves  2
		BumpHeight      20
		BumpOffset      9.2527
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.1582
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           3.8171
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          37.5
		Velocity        100
		BumpHeight      2.7713
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     10
		Coverage        0.38168
		stripeZones     0.45802
		stripeFluct     0.045802
		stripeTwist     9.313
	}

	NoLava          true

	Atmosphere
	{
		Model          "Chlorine"
		Height          55.012
		Density         1.6358
		Pressure        1.1112
		Greenhouse      17.557
		Bright          7.5
		Opacity         1
		SkyLight        2
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

	Aurora
	{
		Height         53.765
		NorthLat       69.533
		NorthLon       1.2255
		NorthRadius    1777
		NorthWidth     489.8
		NorthRings     5
		NorthBright    0.35854
		NorthFlashFreq 77.252
		NorthMoveSpeed 1.1058
		NorthParticles 50000
		SouthLat       -41.138
		SouthLon       -173.29
		SouthRadius    1666.3
		SouthWidth     558.4
		SouthRings     4
		SouthBright    0.35854
		SouthFlashFreq 72.357
		SouthMoveSpeed 1.0877
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
		Epoch           2454762
		Period          1.058722191781
		//SemiMajorAxis   1.13473725
		Eccentricity    0.04
		Inclination     0.0589
		AscendingNode   135.99415
		ArgOfPericenter 189.618321
		MeanAnomaly     -1.2
	}
}

Moon	"Akoshisss"
{
	ParentBody     "Trandosha"
	Class	       "Desert"

	Mass            0.64
	Radius          3285.5
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)
	
	NoAurora		true

	Surface
	{
		colorSea       (0.360, 0.260, 0.270, 0.000)
		colorShelf     (0.260, 0.220, 0.270, 0.000)
		colorBeach     (0.850, 0.740, 0.550, 0.000)
		colorDesert    (0.770, 0.670, 0.470, 0.000)
		colorLowland   (0.440, 0.290, 0.170, 0.000)
		colorUpland    (0.640, 0.570, 0.470, 0.000)
		colorRock      (0.220, 0.200, 0.200, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.440, 0.290, 0.170, 0.000)
		colorUpPlants  (0.640, 0.570, 0.470, 0.000)
	}

	NoRings		true

	Orbit
	{
		SemiMajorAxis   0.00102608412
		//Period          0.0164274556
		Eccentricity    0.002
		Inclination     0.44555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Wasskah"
{
	ParentBody     "Trandosha"
	Class          "Terra"
	Mass            0.443
	Radius          3242
	InertiaMoment   0.33162
	Oblateness      0.06
	OblatenessInfo  0
	RotationPeriod  25
	Obliquity       5.89
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
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
		Preset         "terra_wet_yellow_green_plants.cfg"
		SurfStyle       0.35962
		Randomize      (-0.321, 1.328, -0.402)
		colorDistMagn   0.079905
		colorDistFreq   365.2
		detailScale     8192
		drivenDarkening 0
		seaLevel        0.0076336
		snowLevel       0.99824
		tropicLatitude  0.57792
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.83969
		climateTropic   0.75573
		climateEquator  0.61832
		climateSteppeMin -0.20611
		climateSteppeMax 0.14504
		climateForestMin 0.17557
		climateForestMax 0.29771
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        0.87786
		heightTempGrad  0.625
		beachWidth      0.0013194
		tropicWidth     0.07
		mainFreq        0.72519
		venusFreq       0.32061
		venusMagn       0.30534
		mareFreq        2.9675
		mareDensity     0
		terraceProb     0.26906
		erosion         0.96183
		montesMagn      0.24815
		montesFreq      187.61
		montesSpiky     0.8955
		montesFraction  0.94604
		dunesMagn       0.054439
		dunesFreq       33.933
		dunesFraction   0.93156
		hillsMagn       0.15267
		hillsFreq       303.83
		hillsFraction   0.96207
		hills2Fraction  0.54104
		riversMagn      65.206
		riversFreq      3.6223
		riversSin       6.6194
		riftsMagn       25.954
		riftsFreq       4.4275
		riftsSin        5.6138
		canyonsMagn     0.38168
		canyonsFreq     198.47
		canyonsFraction 0.21374
		cracksMagn      0.11884
		cracksFreq      0.2266
		cracksOctaves   0
		craterMagn      0.81348
		craterFreq      10.438
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.75906
		volcanoFreq     0.68577
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.44275
		volcanoFlows    0.81171
		volcanoRadius   0.50103
		volcanoTemp     953.58
		lavaCoverTidal  0.044006
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.8989
		stripeFluct     0.1374
		stripeTwist     0.15266
		cycloneMagn     2.4119
		cycloneFreq     0.55508
		cycloneDensity  0.22124
		cycloneOctaves  2
		BumpHeight      15.291
		BumpOffset      9.2527
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.5783
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           0.11667
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          13.722
		Velocity        100
		BumpHeight      2.9922
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.57252
		mainOctaves     9
		Coverage        0.37405
		stripeZones     1.8989
		stripeFluct     0.1374
		stripeTwist     0.15266
	}

	NoLava          true

	Atmosphere
	{
		Model          "Chlorine"
		Height          50
		Density         1.2348
		Pressure        0.976
		Greenhouse      53.763
		Bright          2
		Opacity         2.5
		SkyLight        4
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

	Aurora
	{
		Height         42.694
		NorthLat       75.304
		NorthLon       -148.45
		NorthRadius    628.98
		NorthWidth     235.89
		NorthRings     3
		NorthBright    0.3
		NorthFlashFreq 77.788
		NorthMoveSpeed 0.87837
		NorthParticles 50000
		SouthLat       -76.341
		SouthLon       34.665
		SouthRadius    707.8
		SouthWidth     255.95
		SouthRings     2
		SouthBright    0.3
		SouthFlashFreq 71.798
		SouthMoveSpeed 1.1583
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
		Epoch           2454762
		PeriodDays      6.36061615
		SemiMajorAxisKm 157697.996
		Eccentricity    0.02
		Inclination     5.89
		AscendingNode   0
		ArgOfPericenter 3.2
		MeanAnomaly     -3.2
	}
}

Planet	"Alaris"
{
	ParentBody     "Kashyyyk System"
	Class	       "GasGiant"

	Mass            215
	Radius          66000
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   1.29644
		//Period          3.455
		Eccentricity    0.004
		Inclination     0.34555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Alaris 1"
{
	ParentBody     "Alaris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.405967048
		SemiMajorAxisKm 115281.275
		Eccentricity    5.0944419e-05
		Inclination     -0.0103588692
		AscendingNode   173.932711
		ArgOfPericenter 177.069628
		MeanAnomaly     -169.055958
	}
}

DwarfMoon	"Alaris 2"
{
	ParentBody     "Alaris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.437929472
		SemiMajorAxisKm 121255.384
		Eccentricity    4.84933877e-05
		Inclination     0.00978891423
		AscendingNode   20.007989
		ArgOfPericenter -37.7033742
		MeanAnomaly     -77.0841187
	}
}

DwarfMoon	"Alaris 3"
{
	ParentBody     "Alaris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.46966924
		SemiMajorAxisKm 127045.609
		Eccentricity    2.36153016e-05
		Inclination     0.00897905709
		AscendingNode   -178.313049
		ArgOfPericenter 133.502595
		MeanAnomaly     -123.373113
	}
}

DwarfMoon	"Alaris 4"
{
	ParentBody     "Alaris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.503503489
		SemiMajorAxisKm 133076.051
		Eccentricity    3.45283504e-05
		Inclination     0.00870422389
		AscendingNode   -105.586811
		ArgOfPericenter -75.5120679
		MeanAnomaly     -161.093838
	}
}

DwarfMoon	"Alaris 5"
{
	ParentBody     "Alaris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.517031877
		SemiMajorAxisKm 135449.205
		Eccentricity    4.04214645e-05
		Inclination     0.013793731
		AscendingNode   -38.454827
		ArgOfPericenter 26.2439613
		MeanAnomaly     144.14141
	}
}

DwarfMoon	"Alaris 6"
{
	ParentBody     "Alaris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.543891765
		SemiMajorAxisKm 140100.571
		Eccentricity    9.92608579e-05
		Inclination     0.00227121112
		AscendingNode   44.0392035
		ArgOfPericenter -32.3473592
		MeanAnomaly     160.153727
	}
}

DwarfMoon	"Alaris 7"
{
	ParentBody     "Alaris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.584167627
		SemiMajorAxisKm 146934.317
		Eccentricity    5.74008983e-05
		Inclination     0.00645967777
		AscendingNode   29.0324742
		ArgOfPericenter -47.5681059
		MeanAnomaly     44.1134783
	}
}

Moon	"Alaris Prime/Alaris 8/Wookiee Colony 3"
{
	ParentBody     "Alaris"
	Class          "Terra"
	Mass            0.443
	Radius          7844
	InertiaMoment   0.32952
	Oblateness      0.012816
	RotationPeriod  25
	Obliquity       5.89
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_rocky_green.cfg"
		SurfStyle       0.62409
		Randomize      (-0.923, -0.782, -0.123)
		colorDistMagn   0.06015
		colorDistFreq   939.25
		detailScale     32768
		drivenDarkening 0
		seaLevel        0.04
		snowLevel       1.084
		tropicLatitude  0.18254
		icecapLatitude  2
		icecapHeight    0.143
		climatePole     0.83206
		climateTropic   0.82443
		climateEquator  0.84733
		climateSteppeMin 0.35878
		climateSteppeMax 0.52672
		climateForestMin -0.58779
		climateForestMax 0.66412
		climateGrassMin  -0.66412
		climateGrassMax  0.8125
		humidity        1
		heightTempGrad  0.4875
		beachWidth      0.00115
		tropicWidth     0.07
		mainFreq        0.61426
		venusFreq       0.32061
		venusMagn       0.30534
		mareFreq        0.0016944
		mareDensity     0.076336
		terraceProb     0.16527
		erosion         0.82443
		montesMagn      0.20161
		montesFreq      261.07
		montesSpiky     0.46565
		montesFraction  0.28246
		dunesMagn       0.022516
		dunesFreq       73.809
		dunesFraction   0.01988
		hillsMagn       0.13819
		hillsFreq       1094
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      4.5534
		riversSin       6.3863
		riftsMagn       60.443
		riftsFreq       4.2064
		riftsSin        6.4649
		canyonsMagn     0.037448
		canyonsFreq     176.35
		canyonsFraction 0
		cracksMagn      0.075182
		cracksFreq      0.7608
		cracksOctaves   0
		craterMagn      0.55839
		craterFreq      25.164
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.63217
		volcanoFreq     0.66492
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.24427
		volcanoFlows    0.68658
		volcanoRadius   0.41336
		volcanoTemp     301.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.4351
		stripeFluct     0.1374
		stripeTwist     0.15266
		cycloneMagn     2.2295
		cycloneFreq     0.7769
		cycloneDensity  0.21028
		cycloneOctaves  3
		BumpHeight      20
		BumpOffset      9.2527
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
		Depth           0.80002
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          37.5
		Velocity        2.3914
		BumpHeight      2.0106
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.64122
		mainOctaves     9
		Coverage        0.25191
		stripeZones     3.4351
		stripeFluct     0.1374
		stripeTwist     0.15266
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          100
		Density         100
		Pressure        0.976
		Greenhouse      23.763
		Bright          10.276
		Opacity         1
		SkyLight        2.3016
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

	Aurora
	{
		Height         140
		NorthLat       70.098
		NorthLon       -149.99
		NorthRadius    1999.5
		NorthWidth     565.24
		NorthRings     2
		NorthBright    0.45794
		NorthFlashFreq 66.757
		NorthMoveSpeed 1.3297
		NorthParticles 50000
		SouthLat       -72.824
		SouthLon       16.175
		SouthRadius    2018.4
		SouthWidth     335.24
		SouthRings     5
		SouthBright    0.45794
		SouthFlashFreq 73.796
		SouthMoveSpeed 1.2697
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
		Epoch           2454762
		PeriodDays      2.44453924
		SemiMajorAxisKm 459538.454
		Eccentricity    0.02
		Inclination     5.89
		AscendingNode   0
		ArgOfPericenter 3.2
		MeanAnomaly     -3.2
	}
}

Planet	"Shurr"
{
	ParentBody     "Kashyyyk System"
	Class	       "GasGiant"

	//Mass            186
	Radius          55220
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   1.743
		//Period          6.455
		Eccentricity    0.002
		Inclination     0.64555
		AscendingNode   340.4993
		ArgOfPericenter 7.589897
		MeanAnomaly     139
		RefPlane       "Equator"
	}
}

DwarfMoon	"Shurr 1"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.315099049
		SemiMajorAxisKm 79831.1886
		Eccentricity    4.70859275e-05
		Inclination     -0.00921337196
		AscendingNode   -135.419177
		ArgOfPericenter 100.355336
		MeanAnomaly     79.0266625
	}
}

DwarfMoon	"Shurr 2"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.334489205
		SemiMajorAxisKm 83073.5184
		Eccentricity    8.22080057e-05
		Inclination     -0.00292690553
		AscendingNode   -23.9094673
		ArgOfPericenter 173.731908
		MeanAnomaly     178.91077
	}
}

DwarfMoon	"Shurr 3"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.342390686
		SemiMajorAxisKm 84376.6921
		Eccentricity    2.11247712e-05
		Inclination     0.00608186976
		AscendingNode   179.213699
		ArgOfPericenter 169.886935
		MeanAnomaly     47.2193598
	}
}

DwarfMoon	"Shurr 4"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.36561727
		SemiMajorAxisKm 88150.6802
		Eccentricity    9.92566571e-06
		Inclination     -0.0124963693
		AscendingNode   140.493734
		ArgOfPericenter -153.247356
		MeanAnomaly     137.902982
	}
}

DwarfMoon	"Shurr 5"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.394202263
		SemiMajorAxisKm 92687.3806
		Eccentricity    5.80007182e-05
		Inclination     0.00934504157
		AscendingNode   -127.211003
		ArgOfPericenter 1.27848926
		MeanAnomaly     70.098218
	}
}

DwarfMoon	"Shurr 6"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.43844288
		SemiMajorAxisKm 99498.5033
		Eccentricity    3.86287414e-05
		Inclination     0.00670850213
		AscendingNode   -109.082804
		ArgOfPericenter -113.3905
		MeanAnomaly     71.1741317
	}
}

DwarfMoon	"Shurr 7"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.461367439
		SemiMajorAxisKm 102937.234
		Eccentricity    9.80549701e-05
		Inclination     -0.00765814431
		AscendingNode   163.282091
		ArgOfPericenter 80.2625705
		MeanAnomaly     167.836635
	}
}

DwarfMoon	"Shurr 8"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.510017297
		SemiMajorAxisKm 110051.966
		Eccentricity    7.15172899e-05
		Inclination     0.0142023216
		AscendingNode   17.5361865
		ArgOfPericenter 95.1968477
		MeanAnomaly     -14.2103181
	}
}

DwarfMoon	"Shurr 9"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.540825357
		SemiMajorAxisKm 114440.364
		Eccentricity    6.2041426e-05
		Inclination     -0.0145947784
		AscendingNode   -45.7560727
		ArgOfPericenter 25.692868
		MeanAnomaly     -81.9730429
	}
}

DwarfMoon	"Shurr 10"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.564631671
		SemiMajorAxisKm 117774.524
		Eccentricity    3.07503422e-05
		Inclination     -0.00269583987
		AscendingNode   98.4762304
		ArgOfPericenter 57.4851232
		MeanAnomaly     -47.5629909
	}
}

DwarfMoon	"Shurr 11"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      7.67530311
		SemiMajorAxisKm 670818.283
		Eccentricity    0.265287275
		Inclination     213.902837
		AscendingNode   143.867387
		ArgOfPericenter 100.070592
		MeanAnomaly     26.6772413
	}
}

DwarfMoon	"Shurr 12"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      9.24566093
		SemiMajorAxisKm 759451.146
		Eccentricity    0.478341039
		Inclination     214.817487
		AscendingNode   -136.009109
		ArgOfPericenter 44.1796384
		MeanAnomaly     -157.967036
	}
}

DwarfMoon	"Shurr 13"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      10.4200002
		SemiMajorAxisKm 822469.281
		Eccentricity    0.481461172
		Inclination     142.210587
		AscendingNode   127.123924
		ArgOfPericenter 49.5304318
		MeanAnomaly     -125.171082
	}
}

DwarfMoon	"Shurr 14"
{
	ParentBody     "Shurr"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      11.7499863
		SemiMajorAxisKm 891044.595
		Eccentricity    0.34276422
		Inclination     156.382034
		AscendingNode   -71.0759064
		ArgOfPericenter 55.19786
		MeanAnomaly     -18.0998842
	}
}

Planet	"Kuhurrik"
{
	ParentBody     "Kashyyyk System"
	Class	       "IceGiant"

	Mass            175
	Radius          39550
	InertiaMoment   0.3975344

	Albedo          0.6777
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   2.4321
		//Period          9.322
		Eccentricity    0.002
		Inclination     0.64555
		AscendingNode   340.4993
		ArgOfPericenter 7.589897
		MeanAnomaly     139
		RefPlane       "Equator"
	}
}

DwarfMoon	"Kuhurrik 1"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.326931121
		SemiMajorAxisKm 48978.4992
		Eccentricity    7.72786267e-05
		Inclination     -0.00498387161
		AscendingNode   -107.983782
		ArgOfPericenter -151.765648
		MeanAnomaly     -100.234143
	}
}

DwarfMoon	"Kuhurrik 2"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.363962184
		SemiMajorAxisKm 52610.4648
		Eccentricity    8.57708882e-05
		Inclination     0.000281505925
		AscendingNode   -52.695367
		ArgOfPericenter -175.301828
		MeanAnomaly     -110.850375
	}
}

DwarfMoon	"Kuhurrik 3"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.384841462
		SemiMajorAxisKm 54603.7582
		Eccentricity    8.55996806e-05
		Inclination     0.0134596618
		AscendingNode   14.7295977
		ArgOfPericenter -94.8752793
		MeanAnomaly     68.6562353
	}
}

DwarfMoon	"Kuhurrik 4"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.426140505
		SemiMajorAxisKm 58443.5392
		Eccentricity    2.87016151e-05
		Inclination     -0.0111184413
		AscendingNode   53.0662663
		ArgOfPericenter 73.7749766
		MeanAnomaly     -108.16427
	}
}

DwarfMoon	"Kuhurrik 5"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.517440917
		SemiMajorAxisKm 66518.4022
		Eccentricity    6.99286331e-05
		Inclination     0.0114545104
		AscendingNode   158.401583
		ArgOfPericenter -53.6681024
		MeanAnomaly     -159.537489
	}
}

DwarfMoon	"Kuhurrik 6"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.616767006
		SemiMajorAxisKm 74779.4132
		Eccentricity    1.09816779e-05
		Inclination     -0.00178091575
		AscendingNode   -52.3595917
		ArgOfPericenter -70.0817102
		MeanAnomaly     75.6191015
	}
}

DwarfMoon	"Kuhurrik 7"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.729396599
		SemiMajorAxisKm 83626.4996
		Eccentricity    0.000775316672
		Inclination     -0.758416194
		AscendingNode   -29.432711
		ArgOfPericenter 76.6338325
		MeanAnomaly     -78.3014784
	}
}

Moon	"Kuhurrik 8"
{
	ParentBody     "Kuhurrik"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.51632795
		SemiMajorAxisKm 136224.492
		Eccentricity    0.000903484586
		Inclination     0.270925538
		AscendingNode   166.215277
		ArgOfPericenter 130.245444
		MeanAnomaly     -150.88518
	}
}

DwarfMoon	"Kuhurrik 9"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      14.4869999
		SemiMajorAxisKm 613319.747
		Eccentricity    0.39462801
		Inclination     187.214187
		AscendingNode   -157.576962
		ArgOfPericenter 50.9887717
		MeanAnomaly     -107.210714
	}
}

DwarfMoon	"Kuhurrik 10"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      17.1438632
		SemiMajorAxisKm 686183.782
		Eccentricity    0.284726866
		Inclination     161.935757
		AscendingNode   107.542993
		ArgOfPericenter 171.540297
		MeanAnomaly     -114.022098
	}
}

DwarfMoon	"Kuhurrik 11"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      18.8457772
		SemiMajorAxisKm 730876.562
		Eccentricity    0.43508467
		Inclination     11.2837928
		AscendingNode   -26.0835979
		ArgOfPericenter 10.3408986
		MeanAnomaly     4.22970238
	}
}

DwarfMoon	"Kuhurrik 12"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      22.4314513
		SemiMajorAxisKm 820867.246
		Eccentricity    0.15772993
		Inclination     181.418808
		AscendingNode   139.360174
		ArgOfPericenter 38.170748
		MeanAnomaly     58.8850953
	}
}

DwarfMoon	"Kuhurrik 13"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      23.8465571
		SemiMajorAxisKm 855037.352
		Eccentricity    0.285634007
		Inclination     181.655617
		AscendingNode   -138.476177
		ArgOfPericenter 157.783081
		MeanAnomaly     -133.532538
	}
}

DwarfMoon	"Kuhurrik 14"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      25.4939447
		SemiMajorAxisKm 893976.269
		Eccentricity    0.0363548654
		Inclination     204.036627
		AscendingNode   60.1938435
		ArgOfPericenter -34.9032681
		MeanAnomaly     122.377759
	}
}

DwarfMoon	"Kuhurrik 15"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      28.0171658
		SemiMajorAxisKm 952030.285
		Eccentricity    0.228707536
		Inclination     179.702935
		AscendingNode   -166.84749
		ArgOfPericenter 23.2798184
		MeanAnomaly     -92.5289207
	}
}

DwarfMoon	"Kuhurrik 16"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      29.5378303
		SemiMajorAxisKm 986174.324
		Eccentricity    0.116593222
		Inclination     173.441823
		AscendingNode   -101.127012
		ArgOfPericenter -157.194576
		MeanAnomaly     85.0569849
	}
}

DwarfMoon	"Kuhurrik 17"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      33.8153157
		SemiMajorAxisKm 1079220.69
		Eccentricity    0.420014931
		Inclination     45.7359118
		AscendingNode   80.1436572
		ArgOfPericenter -88.1270748
		MeanAnomaly     -34.0208366
	}
}

DwarfMoon	"Kuhurrik 18"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      38.422357
		SemiMajorAxisKm 1175142.77
		Eccentricity    0.0915476346
		Inclination     180.098079
		AscendingNode   -85.1217757
		ArgOfPericenter 96.1986418
		MeanAnomaly     121.306397
	}
}

DwarfMoon	"Kuhurrik 19"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      43.0330462
		SemiMajorAxisKm 1267367.86
		Eccentricity    0.258419134
		Inclination     168.516016
		AscendingNode   -106.463133
		ArgOfPericenter 131.554925
		MeanAnomaly     -101.013222
	}
}

DwarfMoon	"Kuhurrik 20"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.2231896
		SemiMajorAxisKm 1329253.78
		Eccentricity    0.489587389
		Inclination     150.790391
		AscendingNode   113.919366
		ArgOfPericenter 158.115944
		MeanAnomaly     -1.76283737
	}
}

DwarfMoon	"Kuhurrik 21"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      48.2923034
		SemiMajorAxisKm 1368631.65
		Eccentricity    0.224759206
		Inclination     -2.74964238
		AscendingNode   -39.9442425
		ArgOfPericenter -81.3118836
		MeanAnomaly     -65.3244657
	}
}

DwarfMoon	"Kuhurrik 22"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      60.9390988
		SemiMajorAxisKm 1598203.15
		Eccentricity    0.131260048
		Inclination     227.414396
		AscendingNode   -12.6369392
		ArgOfPericenter 109.981912
		MeanAnomaly     23.7879906
	}
}

DwarfMoon	"Kuhurrik 23"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      64.686703
		SemiMajorAxisKm 1663072.98
		Eccentricity    0.139594529
		Inclination     158.771389
		AscendingNode   152.780256
		ArgOfPericenter -54.2568999
		MeanAnomaly     121.05456
	}
}

DwarfMoon	"Kuhurrik 24"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      68.106107
		SemiMajorAxisKm 1721176.21
		Eccentricity    0.274288979
		Inclination     198.323257
		AscendingNode   84.6410685
		ArgOfPericenter -88.387734
		MeanAnomaly     179.550362
	}
}

DwarfMoon	"Kuhurrik 25"
{
	ParentBody     "Kuhurrik"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      73.9663581
		SemiMajorAxisKm 1818545.29
		Eccentricity    0.342835919
		Inclination     183.978315
		AscendingNode   26.0575176
		ArgOfPericenter 18.6762851
		MeanAnomaly     -45.5583342
	}
}
