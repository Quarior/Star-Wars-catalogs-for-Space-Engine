// http://starwars.wikia.com/wiki/Cato_Neimoidia
// Region : Colonies
// Sector : 
// Grid location : N11
// X : 3244.57, Y : -2027.38, Z : 252.5448387834124
Planet	"Cato Neimoidia"
{
	ParentBody     "Cato Neimoidia System"
	Class          "Terra"
	Mass            0.9234
	Radius          6312
	InertiaMoment   0.33145
	Oblateness      0.020119
	RotationPeriod  25
	RotationOffset  269.21
	RotationEpoch   1451545
	Obliquity       -2.1953
	EqAscendNode    269.7

	Albedo          0.26
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
		SurfStyle       0.68366
		Randomize      (-0.482, -0.303, -0.714)
		colorDistMagn   0.051726
		colorDistFreq   576.22
		detailScale     18072
		drivenDarkening -1
		seaLevel        0.2
		snowLevel       0.99093
		tropicLatitude  0.57492
		icecapLatitude  2
		icecapHeight    0.23363
		climatePole     0.45
		climateTropic   0.69841
		climateEquator  0.45
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin -0.25191
		climateForestMax 0.083969
		climateGrassMin  0.23664
		climateGrassMax  0.8125
		humidity        0.60305
		heightTempGrad  0.23909
		beachWidth      0.00035115
		tropicWidth     0.59619
		mainFreq        1.8321
		venusFreq       0.82443
		venusMagn       0.68702
		mareFreq        5.4217
		mareDensity     0.017065
		terraceProb     0.5409
		erosion         0.11708
		montesMagn      0.15653
		montesFreq      225.8
		montesSpiky     0.99938
		montesFraction  0.038168
		dunesMagn       0.074375
		dunesFreq       51.257
		dunesFraction   0.3309
		hillsMagn       0.11324
		hillsFreq       391.65
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.326
		riversFreq      1.7277
		riversSin       5.8465
		riftsMagn       9.1603
		riftsFreq       3.0768
		riftsSin        5.6305
		canyonsMagn     0.060519
		canyonsFreq     109.83
		canyonsFraction 0.5166
		cracksMagn      0.11456
		cracksFreq      0.31136
		cracksOctaves   1
		craterMagn      0.072027
		craterFreq      8.3832
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		volcanoMagn     0.72229
		volcanoFreq     0.55073
		volcanoDensity  0.1688
		volcanoOctaves  3
		volcanoActivity 0.26202
		volcanoFlows    0.75532
		volcanoRadius   0.46688
		volcanoTemp     311.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.4
		stripeFluct     0.85496
		stripeTwist     7.7863
		cycloneMagn     5.6489
		cycloneFreq     0.076336
		cycloneDensity  0.32824
		cycloneOctaves  1
		cycloneMagn2     0
		cycloneFreq2     0
		cycloneLatitude2 0
		cycloneOctaves2  0
		BumpHeight      23
		BumpOffset      4
		DiffMapAlpha   "Water"
		SpecBrightWater 2
		SpecBrightIce   2
		RoughnessWater  0.25463
		RoughnessIce    0.25463
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      2.2504
		SpotWidth       0.026293
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           4.6001
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          19.96
		Velocity        130.24
		BumpHeight      2.4576
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.87023
		mainOctaves     13
		Coverage        0.47328
		stripeZones     0.4
		stripeFluct     0.85496
		stripeTwist     7.7863
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          153.97
		Density         100
		Pressure        1.5505
		Greenhouse      18.331
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.07
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
		Height         100.39
		NorthLat       61.756
		NorthLon       75.822
		NorthRadius    1798.6
		NorthWidth     292.25
		NorthRings     2
		NorthBright    0.3
		NorthFlashFreq 74.15
		NorthMoveSpeed 0.8517
		NorthParticles 50000
		SouthLat       -83.913
		SouthLon       -136.76
		SouthRadius    1890.1
		SouthWidth     514.12
		SouthRings     5
		SouthBright    0.3
		SouthFlashFreq 65.644
		SouthMoveSpeed 0.77543
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
		Period          0.761656349
		SemiMajorAxis   0.834012718
		Eccentricity    0.0005060218
		Inclination     0.123
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
	}
}

Moon	"Cato Neimoidia 1"
{
	ParentBody     "Cato Neimoidia"
	Class          "Selena"

    Radius         2245      // Radius in km  
	Mass            0.34
    RotationPeriod  25        // Rotation period in hours 

	NoAtmosphere    true

	Orbit
	{
		Epoch          2454762
		//Period         0.0032     // Orbital period in years 
		SemiMajorAxis  0.001063
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Cato Neimoidia 2"
{
	ParentBody      "Cato Neimoidia"
	Albedo          0.06
	Radius          77
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.0008060295333
		SemiMajorAxis  0.001523729946
		Eccentricity   0.0004
		Inclination    5.167
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}
