// http://starwars.wikia.com/wiki/Rodia
// Region : Outer Rim
// Sector : Savareen Sector
// Grid location : Q16
// X : 8960.03, Y : -9968.31, Z : 433.80201488442117

// http://starwars.wikia.com/wiki/Mikak
Planet	"Mikak/Tyrius System 1"
{
	ParentBody     "Tyrius System"
	Class	       "Selena"

	Mass            0.0461812
	Radius          2362.61
	InertiaMoment   0.350641

	Oblateness      0.0030943

	RotationPeriod  27.0788
	Obliquity       45.9818
	EqAscendNode    154.13

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.517 0.513 0.505)

	Surface
	{
		SurfStyle       0.484495
		OceanStyle      0.853482
		Randomize      (0.301, -0.265, -0.686)
		colorDistMagn   0.0652247
		colorDistFreq   301.094
		detailScale     6076.76
		colorConversion true
		drivenDarkening 0
		seaLevel        0.268954
		snowLevel       2
		tropicLatitude  0.708224
		icecapLatitude  10
		icecapHeight    0.118203
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.55045
		venusFreq       0.850727
		venusMagn       0
		mareFreq        1.04588
		mareDensity     0.0188828
		terraceProb     0.291633
		erosion         0
		montesMagn      0.11126
		montesFreq      85.8395
		montesSpiky     0.763564
		montesFraction  0.628588
		dunesMagn       0.0202494
		dunesFreq       3050.75
		dunesFraction   0.564123
		hillsMagn       0.114052
		hillsFreq       227.978
		hillsFraction   0.641328
		hills2Fraction  0
		riversMagn      64.9142
		riversFreq      2.33854
		riversSin       4.64957
		riversOctaves   0
		canyonsMagn     0.499611
		canyonsFreq     1.00393
		canyonFraction  0.0261199
		cracksMagn      0.0672827
		cracksFreq      1.42125
		cracksOctaves   0
		craterMagn      0.557621
		craterFreq      5.62811
		craterDensity   0.271847
		craterOctaves   4.0232
		craterRayedFactor 0.0505712
		volcanoMagn     0.422205
		volcanoFreq     0.73627
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.183456
		volcanoRadius   0.416342
		volcanoTemp     1498.76
		lavaCoverTidal  0
		lavaCoverSun    0.738593
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.284, 0.292, 0.303, 0.000)
		colorDesert    (0.248, 0.236, 0.232, 0.000)
		colorLowland   (0.315, 0.313, 0.283, 0.000)
		colorUpland    (0.336, 0.333, 0.308, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999447
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
		Height          118.13
		Density         5.52773e-005
		Pressure        8.49686e-005
		Greenhouse      0.112281
		Bright          2.23105
		Opacity         0
		SkyLight        0.743683
		Hue             -0.00180051
		Saturation      1

		Composition
		{
			SO2   	99.9996
			Cl2   	0.000389442
			Kr    	2.69221e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.63294
		Period          0.581377
		Eccentricity    0.035839
		Inclination     0.978421
		AscendingNode   155.816
		ArgOfPericenter 177.295
		MeanAnomaly     224.248
	}
}

// http://starwars.wikia.com/wiki/Rodia/Legends
Planet	"Rodia/Tyrius System 2"
{
	ParentBody     "Tyrius System"
	Class	       "Terra"

	Radius          3774 // wookieepedia
    Mass            0.36 // wookieepedia
	InertiaMoment   0.372801

	Oblateness      0.00210191

	RotationPeriod  29 // wookieepedia
	Obliquity       -47.1339
	EqAscendNode    0.631442

	AlbedoBond      0.283831
	AlbedoGeom      0.340597
	Brightness      0.634921
	Color          (0.707 0.886 1.000)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.642063
		OceanStyle      0.214286
		Randomize      (-0.730, 0.190, 1.556)
		colorDistMagn   0.769841
		colorDistFreq   0.000774264
		detailScale     101.06
		colorConversion false
		drivenDarkening -0.285714
		seaLevel        0.142857
		snowLevel       0.126984
		tropicLatitude  0.726434
		icecapLatitude  0
		icecapHeight    0
		climatePole     0.452381
		climateTropic   0.793651
		climateEquator  0.214286
		heightTempGrad  0.436508
		tropicWidth     0.0717336
		mainFreq        1.90476
		venusFreq       0
		venusMagn       0.238095
		mareFreq        100
		mareDensity     0.365079
		terraceProb     0.32239
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
		riversFreq      1.74603
		riversSin       0.47619
		riversOctaves   1
		canyonsMagn     0.15873
		canyonsFreq     7.93651
		canyonFraction  0.367535
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
		stripeFluct     0.507937
		stripeTwist     11.1111
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
		colorLowPlants (0.118, 0.166, 0.063, 0.000)
		colorUpPlants  (0.148, 0.161, 0.041, 0.000)
		BumpHeight      16.6667
		BumpOffset      15.0794
		DiffMapAlpha   "Water"
		SpecBrightWater 0.47619
		SpecBrightIce   3.1746
		SpecularPower   2.25878
		Hapke           0.579365
		SpotBright      6.50794
		SpotWidth       0.142857
		DayAmbient      2.22222
	}

	Clouds
	{
		Height          16.3789
		Velocity        25.196
		BumpHeight      5.64433
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.961617
		mainOctaves     10
		Coverage        0.166667
		stripeZones     1.97729
		stripeFluct     0.507937
		stripeTwist     11.1111
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
		Coverage        0.166667
		stripeZones     1.97729
		stripeFluct     0.507937
		stripeTwist     11.1111
	}

	Ocean
	{
		Height         4.76202
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
		Greenhouse      47.619
		Bright          5.55556
		Opacity         0.873016
		SkyLight        4.20635
		Hue             -0.119048
		Saturation      1.06349

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

	NoRings          true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1
		Eccentricity    0.0180743
		Inclination     -2.83744
		AscendingNode   102.386
		ArgOfPericenter 92.227
		MeanAnomaly     256.404
        Period          0.9377113693660456 // 305d wookieepedia
	}
}

// Inner moons (real moons)
// http://starwars.wikia.com/wiki/Enak
Moon	"Rodia 1"
{
	ParentBody     "Rodia"
	Class          "Desert"

    Radius          956      // Radius in km  
	Mass            0.006
    RotationPeriod  10        // Rotation period in hours
    
    NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.0017632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

// http://starwars.wikia.com/wiki/Yasooska
Moon	"Rodia 2"
{
	ParentBody     "Rodia"
	Class          "Desert"

    Radius          1524     // Radius in km  
	Mass            0.0078
    RotationPeriod  12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.002025
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
    
    NoRing          true
}

// Outer moons (asteroids)
// http://starwars.wikia.com/wiki/Soomana
DwarfMoon	"Rodia D1"
{
	ParentBody      "Rodia"
	Albedo          0.949
	Radius          112
	Mass            0.0000017423
	RotationOffset  282

	NoAtmosphere	true

	Orbit
	{
		SemiMajorAxis  0.0034265
		Eccentricity   0.0002
		Inclination    7.31
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

// http://starwars.wikia.com/wiki/Eiska
DwarfMoon	"Rodia D2"
{
	ParentBody      "Rodia"
	Albedo          0.949
	Radius          86
	Mass            0.0000017325
	RotationOffset  282

	NoAtmosphere	true

	Orbit
	{
		SemiMajorAxis  0.0037523
		Eccentricity   0.0002
		Inclination    7.31
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

// http://starwars.wikia.com/wiki/Pirdia
Planet	"Pirdia/Tyrius System 3"
{
	ParentBody     "Tyrius System"
	Class	       "GasGiant"

	Mass            164.069
	Radius          65814.3
	InertiaMoment   0.224906

	Oblateness      0.0853927

	RotationPeriod  10.189
	Obliquity       -29.8677
	EqAscendNode    -116.345

	AlbedoBond      0.495532
	AlbedoGeom      0.594639
	Brightness      2

	Surface
	{
		SurfStyle       0.139928
		Randomize      (-0.688, 0.218, 0.535)
		detailScale     169278
		colorConversion true
		tropicLatitude  0.49035
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.957303
		stripeZones     4.8782
		stripeFluct     0.354161
		stripeTwist     11.4901
		cycloneMagn     9.6046
		cycloneFreq     0.547594
		cycloneDensity  0.409175
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
		BumpHeight      16.1117
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          272.922
		Velocity        -719.923
		BumpHeight      57.1633
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.1385
		mainOctaves     12
		Coverage        0.455323
		stripeZones     4.8782
		stripeFluct     0.354161
		stripeTwist     11.4901
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          658.143
		Density         5440.18
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.048806
		Saturation      0.650567

		Composition
		{
			H2    	91.7853
			He    	7.83318
			CH4   	0.303428
			N2    	0.0355878
			NH3   	0.0257826
			O2    	0.00877785
			C2H2  	0.00318374
			C2H4  	0.00139983
			Ne    	0.00118693
			Ar    	0.00103219
			C2H6  	0.000725035
			C3H8  	0.000414086
		}
	}

	Aurora
	{
		Height      2590.31
		NorthLat    84.6525
		NorthLon    156.198
		NorthRadius 16625.2
		NorthWidth  9372.46
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -84.7345
		SouthLon    337.086
		SouthRadius 20394
		SouthWidth  8115.16
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     101052
		OuterRadius     159381
		RotationPeriod  10.1641
		RotationOffset  0
		FrontBright     0.690044
		BackBright      0.510187
		Density         0.945201
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   127.768
		Period          402.369
		Eccentricity    0.0235841
		Inclination     -1.51038
		AscendingNode   -110.743
		ArgOfPericenter 155.273
		MeanAnomaly     235.186
	}
}

DwarfMoon	"Pirdia D1/Tyrius System 3.D1"
{
	ParentBody     "Pirdia"
	Class	       "Asteroid"

	Mass            1.03966e-011
	Radius          3.12981
	InertiaMoment   0.399764

	Oblateness      0.249

	Obliquity       0.0127286
	EqAscendNode    45.2539
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.746 0.744 0.741)

	Surface
	{
		SurfStyle       0.152194
		OceanStyle      0.259446
		Randomize      (0.316, -0.274, 0.466)
		colorDistMagn   0.508842
		colorDistFreq   0.00818416
		detailScale     85.4646
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482126
		terraceProb     0.335992
		erosion         0
		montesMagn      0.522284
		montesFreq      3.53331
		montesSpiky     0.794474
		montesFraction  0.487911
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0206478
		hillsFraction   0.678778
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246489
		craterFreq      0.268671
		craterDensity   0.839683
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512496
		volcanoTemp     1564.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.317, 0.316, 0.315, 0.000)
		colorBeach     (0.335, 0.335, 0.333, 0.000)
		colorDesert    (0.354, 0.353, 0.352, 0.000)
		colorLowland   (0.373, 0.372, 0.370, 0.000)
		colorUpland    (0.391, 0.390, 0.389, 0.000)
		colorRock      (0.410, 0.409, 0.407, 0.000)
		colorSnow      (0.429, 0.428, 0.426, 1.000)
		BumpHeight      2.81683
		BumpOffset      0.563365
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000798882
		Period          0.00101951
		Eccentricity    7.04508e-005
		Inclination     0.0127286
		AscendingNode   45.2539
		ArgOfPericenter -10.6298
		MeanAnomaly     6.27027
	}
}

DwarfMoon	"Pirdia D2/Tyrius System 3.D2"
{
	ParentBody     "Pirdia"
	Class	       "Asteroid"

	Mass            2.17437e-011
	Radius          3.84464
	InertiaMoment   0.397728

	Oblateness      0.230816

	Obliquity       0.00722105
	EqAscendNode    -116.207
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.429 0.425)

	Surface
	{
		SurfStyle       0.909698
		OceanStyle      0.267259
		Randomize      (-0.889, 0.737, 0.159)
		colorDistMagn   0.537202
		colorDistFreq   0.00686639
		detailScale     104.984
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404895
		terraceProb     0.466989
		erosion         0
		montesMagn      0.538401
		montesFreq      3.36191
		montesSpiky     0.875085
		montesFraction  0.792442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0449925
		hillsFraction   0.863341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229251
		craterFreq      0.238829
		craterDensity   0.959763
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516286
		volcanoTemp     1446.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.148, 0.150, 0.170, 0.050)
		colorShelf     (0.174, 0.176, 0.195, 0.040)
		colorBeach     (0.200, 0.202, 0.221, 0.030)
		colorDesert    (0.226, 0.227, 0.251, 0.020)
		colorLowland   (0.252, 0.253, 0.276, 0.030)
		colorUpland    (0.278, 0.279, 0.302, 0.050)
		colorRock      (0.304, 0.305, 0.336, 0.020)
		colorSnow      (0.304, 0.305, 0.336, 1.000)
		BumpHeight      3.46018
		BumpOffset      0.692036
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000881353
		Period          0.00118138
		Eccentricity    7.0319e-005
		Inclination     0.00722105
		AscendingNode   -116.207
		ArgOfPericenter -63.0289
		MeanAnomaly     131.524
	}
}

Moon	"Pirdia 1/Tyrius System 3.1"
{
	ParentBody     "Pirdia"
	Class	       "Selena"

	Mass            0.00243757
	Radius          1027
	InertiaMoment   0.398607

	Oblateness      0.00599577

	Obliquity       0.624643
	EqAscendNode    -135.245
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.444 0.441 0.439)

	Surface
	{
		SurfStyle       0.386034
		OceanStyle      0.410878
		Randomize      (0.182, 0.537, 0.552)
		colorDistMagn   0.0842831
		colorDistFreq   131.186
		detailScale     2641.51
		colorConversion true
		drivenDarkening 0
		seaLevel        0.260721
		snowLevel       2
		tropicLatitude  0.00830071
		icecapLatitude  4.31317
		icecapHeight    0.135265
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7574
		venusFreq       0.624514
		venusMagn       0
		mareFreq        0.400467
		mareDensity     0.00148522
		terraceProb     0.157669
		erosion         0
		montesMagn      0.0631827
		montesFreq      35.5748
		montesSpiky     0.974242
		montesFraction  0.6202
		dunesMagn       0.0596492
		dunesFreq       1332.68
		dunesFraction   0.912477
		hillsMagn       0.121451
		hillsFreq       97.5771
		hillsFraction   0.798375
		hills2Fraction  0
		riversMagn      52.7858
		riversFreq      3.50035
		riversSin       6.98372
		riversOctaves   0
		canyonsMagn     0.586751
		canyonsFreq     0.357206
		canyonFraction  0.449624
		cracksMagn      0.0614713
		cracksFreq      0.295805
		cracksOctaves   0
		craterMagn      0.578639
		craterFreq      2.75173
		craterDensity   0.820633
		craterOctaves   8.60901
		craterRayedFactor 0.16158
		volcanoMagn     0.194508
		volcanoFreq     0.568873
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.230931
		volcanoRadius   0.140297
		volcanoTemp     1481.38
		lavaCoverTidal  0.154555
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.244, 0.251, 0.264, 0.000)
		colorDesert    (0.213, 0.203, 0.202, 0.000)
		colorLowland   (0.271, 0.269, 0.246, 0.000)
		colorUpland    (0.289, 0.287, 0.268, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999936
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
		Height          51.3501
		Density         6.40051e-006
		Pressure        1.73895e-006
		Greenhouse      0.00418919
		Bright          1.44958
		Opacity         0
		SkyLight        0.483194
		Hue             0.029684
		Saturation      1

		Composition
		{
			SO2   	99.9572
			Cl2   	0.0422599
			Kr    	0.000376776
			Xe    	0.000213593
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00165048
		Period          0.00302745
		Eccentricity    0.0219771
		Inclination     0.624643
		AscendingNode   -135.245
		ArgOfPericenter -45.8208
		MeanAnomaly     124.268
	}
}

Moon	"Pirdia 2/Tyrius System 3.2"
{
	ParentBody     "Pirdia"
	Class	       "Selena"

	Mass            0.00038822
	Radius          604.779
	InertiaMoment   0.397943

	Oblateness      0.00176706

	Obliquity       0.940208
	EqAscendNode    81.412
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.646 0.554 0.421)

	Surface
	{
		SurfStyle       0.739531
		OceanStyle      0.328821
		Randomize      (0.852, -0.840, -0.628)
		colorDistMagn   0.0879316
		colorDistFreq   78.387
		detailScale     1555.52
		colorConversion true
		drivenDarkening 0
		seaLevel        0.208709
		snowLevel       2
		tropicLatitude  0.0248765
		icecapLatitude  2.31325
		icecapHeight    0.142245
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00357
		venusFreq       1.55531
		venusMagn       0
		mareFreq        0.00343252
		mareDensity     0.000250615
		terraceProb     0.397342
		erosion         0
		montesMagn      0.0656683
		montesFreq      36.3336
		montesSpiky     0.939117
		montesFraction  0.419983
		dunesMagn       0.0517705
		dunesFreq       799.053
		dunesFraction   0.901541
		hillsMagn       0.10723
		hillsFreq       73.6056
		hillsFraction   0.914424
		hills2Fraction  0
		riversMagn      67.3315
		riversFreq      1.60264
		riversSin       5.11813
		riversOctaves   0
		canyonsMagn     0.578691
		canyonsFreq     0.180494
		canyonFraction  0.707599
		cracksMagn      0.0484786
		cracksFreq      0.219943
		cracksOctaves   0
		craterMagn      0.591208
		craterFreq      1.77062
		craterDensity   0.725349
		craterOctaves   9
		craterRayedFactor 0.197341
		volcanoMagn     0.16942
		volcanoFreq     0.812262
		volcanoDensity  0.249731
		volcanoOctaves  3
		volcanoActivity 0.221062
		volcanoFlows    0.316389
		volcanoRadius   0.184249
		volcanoTemp     1816.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.407, 0.338, 0.202, 0.000)
		colorDesert    (0.433, 0.344, 0.206, 0.000)
		colorLowland   (0.355, 0.255, 0.164, 0.000)
		colorUpland    (0.504, 0.393, 0.219, 0.000)
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
		SemiMajorAxis   0.00269214
		Period          0.00630684
		Eccentricity    0.00638607
		Inclination     0.940209
		AscendingNode   81.412
		ArgOfPericenter 115.917
		MeanAnomaly     56.6547
	}
}

Moon	"Pirdia 3/Tyrius System 3.3"
{
	ParentBody     "Pirdia"
	Class	       "Selena"

	Mass            0.000556624
	Radius          630.037
	InertiaMoment   0.396901

	Obliquity       0.153318
	EqAscendNode    46.9773
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.748 0.679 0.560)

	Surface
	{
		SurfStyle       0.283582
		OceanStyle      0.130275
		Randomize      (0.071, 0.950, -0.117)
		colorDistMagn   0.0691826
		colorDistFreq   61.7267
		detailScale     1620.49
		colorConversion true
		drivenDarkening 0
		seaLevel        0.243516
		snowLevel       2
		tropicLatitude  0.00490715
		icecapLatitude  2.63454
		icecapHeight    0.215979
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80548
		venusFreq       0.961731
		venusMagn       0
		mareFreq        0.0265411
		mareDensity     0.000539163
		terraceProb     0.510799
		erosion         0
		montesMagn      0.0597942
		montesFreq      19.9044
		montesSpiky     0.825842
		montesFraction  0.707059
		dunesMagn       0.0397874
		dunesFreq       826.445
		dunesFraction   0.103241
		hillsMagn       0.126197
		hillsFreq       65.1311
		hillsFraction   0.840499
		hills2Fraction  0
		riversMagn      58.0279
		riversFreq      1.96087
		riversSin       7.15527
		riversOctaves   0
		canyonsMagn     0.628557
		canyonsFreq     0.221664
		canyonFraction  0.830043
		cracksMagn      0.0396426
		cracksFreq      0.361042
		cracksOctaves   0
		craterMagn      0.56202
		craterFreq      1.91259
		craterDensity   0.961361
		craterOctaves   9
		craterRayedFactor 0.249758
		volcanoMagn     0.154227
		volcanoFreq     0.701977
		volcanoDensity  0.239296
		volcanoOctaves  3
		volcanoActivity 0.0161653
		volcanoFlows    0.282434
		volcanoRadius   0.138982
		volcanoTemp     1475.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.411, 0.387, 0.336, 0.000)
		colorDesert    (0.359, 0.312, 0.258, 0.000)
		colorLowland   (0.456, 0.414, 0.314, 0.000)
		colorUpland    (0.486, 0.441, 0.342, 0.000)
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
		SemiMajorAxis   0.00439122
		Period          0.0131384
		Eccentricity    0.00997739
		Inclination     0.153318
		AscendingNode   46.9772
		ArgOfPericenter -80.4012
		MeanAnomaly     13.3871
	}
}

Moon	"Pirdia 4/Tyrius System 3.4"
{
	ParentBody     "Pirdia"
	Class	       "Selena"

	Mass            0.000751586
	Radius          752.876
	InertiaMoment   0.399846

	Obliquity       0.40153
	EqAscendNode    33.6353
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.666 0.609 0.523)

	Surface
	{
		SurfStyle       0.789988
		OceanStyle      0.427636
		Randomize      (-0.073, -0.196, -0.974)
		colorDistMagn   0.0412659
		colorDistFreq   99.4774
		detailScale     1936.44
		colorConversion true
		drivenDarkening 0
		seaLevel        0.248898
		snowLevel       2
		tropicLatitude  0.0134163
		icecapLatitude  2.47869
		icecapHeight    0.12717
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81332
		venusFreq       1.08981
		venusMagn       0
		mareFreq        0.1195
		mareDensity     0.00047265
		terraceProb     0.208106
		erosion         0
		montesMagn      0.0541619
		montesFreq      30.6326
		montesSpiky     0.966269
		montesFraction  0.680449
		dunesMagn       0.0203272
		dunesFreq       994.263
		dunesFraction   0.439364
		hillsMagn       0.149708
		hillsFreq       90.9089
		hillsFraction   0.0566271
		hills2Fraction  0
		riversMagn      55.6967
		riversFreq      2.26763
		riversSin       5.58754
		riversOctaves   0
		canyonsMagn     0.560127
		canyonsFreq     0.269136
		canyonFraction  0.445136
		cracksMagn      0.0536395
		cracksFreq      0.328054
		cracksOctaves   0
		craterMagn      0.5853
		craterFreq      2.88661
		craterDensity   0.737282
		craterOctaves   10
		craterRayedFactor 0.0824643
		volcanoMagn     0.152154
		volcanoFreq     0.785283
		volcanoDensity  0.21726
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.224487
		volcanoRadius   0.152337
		volcanoTemp     1574.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.419, 0.372, 0.251, 0.000)
		colorDesert    (0.446, 0.378, 0.256, 0.000)
		colorLowland   (0.366, 0.280, 0.204, 0.000)
		colorUpland    (0.519, 0.433, 0.272, 0.000)
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
		SemiMajorAxis   0.00716263
		Period          0.0273699
		Eccentricity    0.0223935
		Inclination     0.40153
		AscendingNode   33.6353
		ArgOfPericenter 163.981
		MeanAnomaly     106.659
	}
}

Moon	"Pirdia 5/Tyrius System 3.5"
{
	ParentBody     "Pirdia"
	Class	       "Selena"

	Mass            0.000976065
	Radius          758.878
	InertiaMoment   0.399379

	Obliquity       0.394826
	EqAscendNode    -69.2718
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.790 0.786 0.784)

	Surface
	{
		SurfStyle       0.157979
		OceanStyle      0.587917
		Randomize      (0.350, -0.428, 0.444)
		colorDistMagn   0.0845775
		colorDistFreq   74.4103
		detailScale     1951.88
		colorConversion true
		drivenDarkening 0
		seaLevel        0.179505
		snowLevel       2
		tropicLatitude  0.0113412
		icecapLatitude  2.46338
		icecapHeight    0.147919
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.07211
		venusFreq       1.16205
		venusMagn       0
		mareFreq        0.117267
		mareDensity     0.000619836
		terraceProb     0.531197
		erosion         0
		montesMagn      0.0759099
		montesFreq      28.3265
		montesSpiky     0.845666
		montesFraction  0.185965
		dunesMagn       0.0248069
		dunesFreq       999.577
		dunesFraction   0.430739
		hillsMagn       0.144716
		hillsFreq       81.3636
		hillsFraction   0.37318
		hills2Fraction  0
		riversMagn      61.272
		riversFreq      4.00473
		riversSin       5.48376
		riversOctaves   0
		canyonsMagn     0.519213
		canyonsFreq     0.25765
		canyonFraction  0.345057
		cracksMagn      0.042174
		cracksFreq      0.202839
		cracksOctaves   0
		craterMagn      0.616196
		craterFreq      1.50985
		craterDensity   0.873523
		craterOctaves   10
		craterRayedFactor 0.10618
		volcanoMagn     0.195609
		volcanoFreq     0.929327
		volcanoDensity  0.173691
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0768383
		volcanoRadius   0.17938
		volcanoTemp     1584.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.395, 0.393, 0.392, 0.000)
		colorDesert    (0.490, 0.472, 0.447, 0.200)
		colorLowland   (0.529, 0.503, 0.502, 0.500)
		colorUpland    (0.553, 0.527, 0.518, 0.800)
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
		SemiMajorAxis   0.0116832
		Period          0.057017
		Eccentricity    0.0210776
		Inclination     0.394826
		AscendingNode   -69.2718
		ArgOfPericenter -100.681
		MeanAnomaly     -132.745
	}
}

Moon	"Pirdia 6/Tyrius System 3.6"
{
	ParentBody     "Pirdia"
	Class	       "Desert"

	Mass            0.0123346
	Radius          1893.77
	InertiaMoment   0.372786

	Oblateness      0.00238745

	RotationPeriod  44.6052
	Obliquity       -29.4919
	EqAscendNode    20.9722

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.591 0.410 0.324)

	Surface
	{
		SurfStyle       0.488028
		OceanStyle      0.458908
		Randomize      (-0.791, -0.813, -0.739)
		colorDistMagn   0.0485162
		colorDistFreq   256.184
		detailScale     4870.89
		colorConversion true
		seaLevel        0.101929
		snowLevel       2
		tropicLatitude  0.511856
		icecapLatitude  0.914758
		icecapHeight    0.109345
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.916588
		venusFreq       1.16769
		venusMagn       0.473489
		mareFreq        1.00241
		mareDensity     0.00392357
		terraceProb     0.124675
		erosion         0
		montesMagn      0.0911053
		montesFreq      92.4401
		montesSpiky     0.903546
		montesFraction  0.53025
		dunesMagn       0.0670551
		dunesFreq       11.9465
		dunesFraction   0.983784
		hillsMagn       0.144119
		hillsFreq       144.308
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.1584
		riversFreq      3.38408
		riversSin       5.50517
		riversOctaves   0
		canyonsMagn     0.0183699
		canyonsFreq     51.8342
		canyonFraction  0
		cracksMagn      0.107672
		cracksFreq      0.160786
		cracksOctaves   0
		craterMagn      0.527268
		craterFreq      5.13633
		craterDensity   0.412083
		craterOctaves   6.06216
		volcanoMagn     0.321451
		volcanoFreq     0.637819
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.828389
		volcanoRadius   0.263026
		volcanoTemp     1802.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
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
		Hapke           0.475774
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
		Height          94.6886
		Density         0.0524226
		Pressure        0.022217
		Greenhouse      0.52117
		Bright          8.78828
		Opacity         1
		SkyLight        2.92943
		Hue             -0.031559
		Saturation      1

		Composition
		{
			CO2   	49.4336
			C2H4  	19.273
			C2H2  	12.4504
			SO2   	10.376
			H2S   	5.41703
			C2H6  	2.06423
			C3H8  	0.8759
			N2    	0.105629
			H2O   	0.00238833
			Ar    	0.000605017
			O2    	0.000391249
			Ne    	0.000365648
			CO    	0.000268673
			Cl2   	0.000122078
			NH3   	3.06054e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0190567
		Period          0.118774
		Eccentricity    0.0436288
		Inclination     -1.48437
		AscendingNode   29.8412
		ArgOfPericenter 68.0244
		MeanAnomaly     122.808
	}
}

Moon	"Pirdia 7/Tyrius System 3.7"
{
	ParentBody     "Pirdia"
	Class	       "Selena"

	Mass            0.00152771
	Radius          880.116
	InertiaMoment   0.398286

	Oblateness      0.00131486

	RotationPeriod  56.7546
	Obliquity       -17.8187
	EqAscendNode    -89.5427

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.616 0.613 0.611)

	Surface
	{
		SurfStyle       0.0507653
		OceanStyle      0.424843
		Randomize      (-0.150, 0.047, 0.909)
		colorDistMagn   0.0653182
		colorDistFreq   107.451
		detailScale     2263.71
		colorConversion true
		drivenDarkening 0
		seaLevel        0.20599
		snowLevel       2
		tropicLatitude  0.30605
		icecapLatitude  2.59893
		icecapHeight    0.166233
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76991
		venusFreq       1.44814
		venusMagn       0
		mareFreq        0.247291
		mareDensity     0.000936597
		terraceProb     0.427328
		erosion         0
		montesMagn      0.0550327
		montesFreq      33.0013
		montesSpiky     0.898072
		montesFraction  0.430622
		dunesMagn       0.0352202
		dunesFreq       1155.44
		dunesFraction   0.0721061
		hillsMagn       0.130374
		hillsFreq       89.4618
		hillsFraction   0.665291
		hills2Fraction  0
		riversMagn      66.0366
		riversFreq      2.52116
		riversSin       6.21046
		riversOctaves   0
		canyonsMagn     0.569998
		canyonsFreq     0.403193
		canyonFraction  0.795463
		cracksMagn      0.0485991
		cracksFreq      0.275486
		cracksOctaves   0
		craterMagn      0.69476
		craterFreq      1.67142
		craterDensity   0.870296
		craterOctaves   10
		craterRayedFactor 0.0839226
		volcanoMagn     0.185338
		volcanoFreq     0.743132
		volcanoDensity  0.150722
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.316738
		volcanoRadius   0.174847
		volcanoTemp     1473.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.308, 0.306, 0.306, 0.000)
		colorDesert    (0.382, 0.368, 0.348, 0.200)
		colorLowland   (0.413, 0.392, 0.391, 0.500)
		colorUpland    (0.431, 0.410, 0.403, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999995
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
		Height          44.0058
		Density         5.08938e-007
		Pressure        1.19466e-007
		Greenhouse      0.00139193
		Bright          0.873641
		Opacity         0
		SkyLight        0.291214
		Hue             -0.0238076
		Saturation      1

		Composition
		{
			Cl2   	89.2792
			Kr    	7.37849
			SO2   	2.90392
			Xe    	0.438343
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0310839
		Period          0.247438
		Eccentricity    0.0426611
		Inclination     -1.0619
		AscendingNode   -91.5104
		ArgOfPericenter 120.337
		MeanAnomaly     62.0469
	}
}

DwarfMoon	"Pirdia D3/Tyrius System 3.D3"
{
	ParentBody     "Pirdia"
	Class	       "Asteroid"

	Mass            9.63885e-010
	Radius          13.7628
	InertiaMoment   0.396172

	RotationPeriod  1151.42
	Obliquity       -112.502
	EqAscendNode    -92.2274

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.407 0.402)

	Surface
	{
		SurfStyle       0.95375
		OceanStyle      0.635143
		Randomize      (-0.577, -0.369, 0.863)
		colorDistMagn   0.216405
		colorDistFreq   0.0111755
		detailScale     375.816
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991304
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536386
		terraceProb     0.303561
		erosion         0
		montesMagn      0.495558
		montesFreq      2.90912
		montesSpiky     0.984877
		montesFraction  0.500723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.448739
		hillsFraction   0.842105
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231406
		craterFreq      0.240582
		craterDensity   1.04674
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512744
		volcanoTemp     1709.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.142, 0.161, 0.050)
		colorShelf     (0.164, 0.167, 0.185, 0.040)
		colorBeach     (0.188, 0.191, 0.209, 0.030)
		colorDesert    (0.213, 0.216, 0.237, 0.020)
		colorLowland   (0.237, 0.240, 0.261, 0.030)
		colorUpland    (0.262, 0.264, 0.286, 0.050)
		colorRock      (0.287, 0.289, 0.318, 0.020)
		colorSnow      (0.287, 0.289, 0.318, 1.000)
		BumpHeight      12.3865
		BumpOffset      2.4773
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.582017
		Period          20.0479
		Eccentricity    0.249837
		Inclination     -78.487
		AscendingNode   -86.504
		ArgOfPericenter -57.1154
		MeanAnomaly     136.11
	}
}

DwarfMoon	"Pirdia D4/Tyrius System 3.D4"
{
	ParentBody     "Pirdia"
	Class	       "Asteroid"

	Mass            1.38172e-009
	Radius          14.8386
	InertiaMoment   0.398336

	RotationPeriod  1041.04
	Obliquity       -66.7467
	EqAscendNode    81.2281

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.761 0.758)

	Surface
	{
		SurfStyle       0.205422
		OceanStyle      0.132931
		Randomize      (0.174, -0.016, 0.451)
		colorDistMagn   0.637461
		colorDistFreq   0.140672
		detailScale     405.193
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924898
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461312
		terraceProb     0.348246
		erosion         0
		montesMagn      0.406837
		montesFreq      3.43488
		montesSpiky     0.896391
		montesFraction  0.462652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.523863
		hillsFraction   0.365757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226874
		craterFreq      0.254611
		craterDensity   1.0934
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.580727
		volcanoTemp     1537.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.304, 0.303, 0.000)
		colorShelf     (0.324, 0.323, 0.322, 0.000)
		colorBeach     (0.343, 0.342, 0.341, 0.000)
		colorDesert    (0.363, 0.361, 0.360, 0.000)
		colorLowland   (0.382, 0.380, 0.379, 0.000)
		colorUpland    (0.401, 0.399, 0.398, 0.000)
		colorRock      (0.420, 0.418, 0.417, 0.000)
		colorSnow      (0.439, 0.437, 0.436, 1.000)
		BumpHeight      13.3548
		BumpOffset      2.67095
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.582659
		Period          20.0811
		Eccentricity    0.183557
		Inclination     -6.72964
		AscendingNode   83.6745
		ArgOfPericenter -78.8282
		MeanAnomaly     -167.742
	}
}

// http://starwars.wikia.com/wiki/Toosma
Planet	"Toosma/Tyrius System 4"
{
	ParentBody     "Tyrius System"
	Class	       "GasGiant"

	Mass            1299.47
	Radius          77182.6
	InertiaMoment   0.270285

	Oblateness      0.0237776

	RotationPeriod  9.41149
	Obliquity       -51.5412
	EqAscendNode    -26.765

	AlbedoBond      0.506505
	AlbedoGeom      0.607806
	Brightness      2

	Surface
	{
		SurfStyle       0.206424
		Randomize      (0.953, -0.458, 0.466)
		detailScale     198518
		colorConversion true
		tropicLatitude  0.800165
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.986828
		stripeZones     8.23606
		stripeFluct     0.360117
		stripeTwist     11.2287
		cycloneMagn     12.239
		cycloneFreq     0.631686
		cycloneDensity  0.283846
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
		BumpHeight      6.71385
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          17.6094
		Velocity        -357.297
		BumpHeight      10.8992
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.736177
		mainOctaves     12
		Coverage        0.565053
		stripeZones     8.23606
		stripeFluct     0.360117
		stripeTwist     11.2287
	}

	Clouds
	{
		Height          28.5156
		Velocity        58.9315
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.089)
		mainFreq        0.736177
		mainOctaves     12
		Coverage        0.565053
		stripeZones     8.23606
		stripeFluct     0.360117
		stripeTwist     11.2287
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          115.706
		Density         5424.29
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0138873
		Saturation      0.767587

		Composition
		{
			H2    	92.123
			He    	7.48749
			CH4   	0.321221
			N2    	0.0321232
			NH3   	0.0215651
			O2    	0.0081953
			C2H2  	0.00272793
			C2H4  	0.00118923
			Ne    	0.00101376
			Ar    	0.000681638
			C2H6  	0.000542011
			C3H8  	0.000270938
		}
	}

	Aurora
	{
		Height      5167.7
		NorthLat    84.0885
		NorthLon    -37.7675
		NorthRadius 21535.8
		NorthWidth  8998.77
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.7575
		SouthLon    141.063
		SouthRadius 23263.5
		SouthWidth  11607
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
		SemiMajorAxis   412.845
		Period          2336.76
		Eccentricity    0.0192512
		Inclination     -1.7773
		AscendingNode   -25.7587
		ArgOfPericenter 184.553
		MeanAnomaly     152.354
	}
}

DwarfMoon	"Toosma D1/Tyrius System 4.D1"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            6.45425e-008
	Radius          53.89
	InertiaMoment   0.399442

	Oblateness      0.213192

	Obliquity       -0.00576485
	EqAscendNode    81.467
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.499 0.495)

	Surface
	{
		SurfStyle       0.199965
		OceanStyle      0.672828
		Randomize      (0.307, -0.487, -0.035)
		colorDistMagn   0.283337
		colorDistFreq   0.748342
		detailScale     1471.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66831
		terraceProb     0.319171
		erosion         0
		montesMagn      0.39619
		montesFreq      3.29921
		montesSpiky     0.921798
		montesFraction  0.406204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.1566
		hillsFraction   0.625006
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215013
		craterFreq      0.166432
		craterDensity   1.02086
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498374
		volcanoTemp     1511.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.199, 0.198, 0.000)
		colorShelf     (0.215, 0.212, 0.210, 0.000)
		colorBeach     (0.228, 0.224, 0.223, 0.000)
		colorDesert    (0.240, 0.237, 0.235, 0.000)
		colorLowland   (0.253, 0.249, 0.247, 0.000)
		colorUpland    (0.266, 0.262, 0.260, 0.000)
		colorRock      (0.278, 0.274, 0.272, 0.000)
		colorSnow      (0.291, 0.287, 0.284, 1.000)
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
		SemiMajorAxis   0.00176322
		Period          0.00118783
		Eccentricity    9.32375e-005
		Inclination     -0.00576485
		AscendingNode   81.467
		ArgOfPericenter 33.2633
		MeanAnomaly     -101.908
	}
}

Moon	"Toosma 1/Tyrius System 4.1"
{
	ParentBody     "Toosma"
	Class	       "Desert"

	Mass            0.134012
	Radius          4356.97
	InertiaMoment   0.330132

	Oblateness      0.00693909

	Obliquity       -0.495069
	EqAscendNode    10.393
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.775 0.706 0.681)

	Surface
	{
		SurfStyle       0.147269
		OceanStyle      0.945561
		Randomize      (-0.646, 0.454, -0.885)
		colorDistMagn   0.0528633
		colorDistFreq   451.752
		detailScale     11206.4
		colorConversion true
		seaLevel        0.150009
		snowLevel       2
		tropicLatitude  0.0172108
		icecapLatitude  0.726147
		icecapHeight    0.160968
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.04786
		venusFreq       0.399393
		venusMagn       0.442345
		mareFreq        1.80943
		mareDensity     0.0169234
		terraceProb     0.334644
		erosion         0
		montesMagn      0.258785
		montesFreq      234.767
		montesSpiky     0.920128
		montesFraction  0.0490295
		dunesMagn       0.0540525
		dunesFreq       36.2015
		dunesFraction   0.0188091
		hillsMagn       0.114519
		hillsFreq       603.02
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.4863
		riversFreq      1.85046
		riversSin       5.49654
		riversOctaves   0
		canyonsMagn     0.0506986
		canyonsFreq     120.674
		canyonFraction  0
		cracksMagn      0.0732433
		cracksFreq      0.341274
		cracksOctaves   0
		craterMagn      0.695501
		craterFreq      10.2018
		craterDensity   0.396818
		craterOctaves   6.97053
		volcanoMagn     0.731918
		volcanoFreq     0.91353
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.483917
		volcanoRadius   0.413027
		volcanoTemp     1809.32
		lavaCoverTidal  0.111598
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
		Hapke           0.729263
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
		Height          111.796
		Density         0.0270737
		Pressure        0.016286
		Greenhouse      2.75183
		Bright          7.70033
		Opacity         1
		SkyLight        2.56678
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	99.5628
			N2    	0.248386
			C2H4  	0.184661
			CO    	0.00242412
			C2H2  	0.00112324
			Ar    	0.0003106
			O2    	0.000106881
			H2    	7.4559e-005
			He    	7.00862e-005
			C2H6  	5.94113e-005
			Ne    	1.99932e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00321208
		Period          0.00292047
		Eccentricity    0.000321692
		Inclination     -0.495069
		AscendingNode   10.393
		ArgOfPericenter -8.45764
		MeanAnomaly     59.0657
	}
}

Moon	"Toosma 2/Tyrius System 4.2"
{
	ParentBody     "Toosma"
	Class	       "Oceania"

	Mass            1.55769
	Radius          8702.71
	InertiaMoment   0.329196

	Obliquity       0.867142
	EqAscendNode    -111.106
	TidalLocked     true

	AlbedoBond      0.38065
	AlbedoGeom      0.45678
	Brightness      2
	Color          (0.517 0.513 0.509)

	Surface
	{
		SurfStyle       0.261951
		OceanStyle      0.204518
		Randomize      (-0.178, 0.852, 0.274)
		colorDistMagn   0.0511966
		colorDistFreq   1068.66
		detailScale     22383.9
		colorConversion true
		seaLevel        0.966991
		snowLevel       2
		tropicLatitude  0.0171206
		icecapLatitude  10
		icecapHeight    1.01624
		climatePole     0.877201
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.841699
		venusFreq       1.61097
		venusMagn       0
		mareFreq        0
		mareDensity     0
		terraceProb     0.579005
		erosion         0
		montesMagn      0.252592
		montesFreq      536.447
		montesSpiky     0.98218
		montesFraction  0.825063
		dunesMagn       0.0434552
		dunesFreq       78.1157
		dunesFraction   0.982706
		hillsMagn       0.147911
		hillsFreq       985.188
		hillsFraction   0.820351
		hills2Fraction  0.629252
		riversMagn      58.0032
		riversFreq      1.47552
		riversSin       6.80335
		riversOctaves   0
		canyonsMagn     0.0468985
		canyonsFreq     204.272
		canyonFraction  0.238523
		cracksMagn      0.0746001
		cracksFreq      0.945394
		cracksOctaves   1
		craterMagn      0.0180296
		craterFreq      77.3335
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.687496
		volcanoFreq     0.714706
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.500133
		volcanoTemp     1509.8
		lavaCoverTidal  0.567436
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.90813
		stripeTwist     0.330531
		cycloneMagn     2.39127
		cycloneFreq     0.618338
		cycloneDensity  0.380682
		cycloneOctaves  4
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      110.813
		BumpOffset      107.155
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
		Height          5.95898
		Velocity        104.067
		BumpHeight      5.58437
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.974004
		mainOctaves     10
		Coverage        0.301083
		stripeZones     1.90813
		stripeTwist     0.330531
	}

	Ocean
	{
		Height          107.155
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          161.058
		Density         2.60039
		Pressure        3.80539
		Greenhouse      60.5436
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2    	30.078
			CH4   	16.5509
			NH3   	16.4196
			CO2   	16.037
			C2H4  	7.62277
			H2O   	5.06275
			H2S   	2.57826
			SO2   	2.2058
			C2H6  	1.43014
			C2H2  	1.34336
			N2    	0.58534
			C3H8  	0.0788703
			CO    	0.00538002
			Ar    	0.00151369
			He    	0.000207502
			O2    	8.48327e-005
			Cl2   	5.48062e-005
			Kr    	1.17022e-005
		}
	}

	Aurora
	{
		Height      143.1
		NorthLat    59.5932
		NorthLon    17.6854
		NorthRadius 2499.04
		NorthWidth  619.13
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -50.1359
		SouthLon    190.836
		SouthRadius 1564.87
		SouthWidth  464.096
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
		SemiMajorAxis   0.00539815
		Period          0.00635922
		Eccentricity    0.0294039
		Inclination     0.867142
		AscendingNode   -111.106
		ArgOfPericenter -111.048
		MeanAnomaly     -157.731
	}
}

Moon	"Toosma 3/Tyrius System 4.3"
{
	ParentBody     "Toosma"
	Class	       "Desert"

	Mass            0.181569
	Radius          4798.13
	InertiaMoment   0.328022

	Obliquity       -0.279063
	EqAscendNode    -8.85027
	TidalLocked     true

	AlbedoBond      0.267333
	AlbedoGeom      0.3208
	Brightness      2
	Color          (0.784 0.782 0.780)

	Surface
	{
		SurfStyle       0.918902
		OceanStyle      0.446073
		Randomize      (0.807, 0.077, -0.410)
		colorDistMagn   0.0541248
		colorDistFreq   703.671
		detailScale     12341.1
		colorConversion true
		seaLevel        0.0585434
		snowLevel       2
		tropicLatitude  0.00971042
		icecapLatitude  0.892246
		icecapHeight    0.0630146
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.931146
		venusFreq       1.51642
		venusMagn       0.454997
		mareFreq        1.32595
		mareDensity     0.0208619
		terraceProb     0.17636
		erosion         0
		montesMagn      0.214184
		montesFreq      262.818
		montesSpiky     0.898795
		montesFraction  0.53374
		dunesMagn       0.0356865
		dunesFreq       33.7799
		dunesFraction   0.550463
		hillsMagn       0.160946
		hillsFreq       405.602
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.2832
		riversFreq      1.84828
		riversSin       3.97237
		riversOctaves   0
		canyonsMagn     0.0695286
		canyonsFreq     124.81
		canyonFraction  0
		cracksMagn      0.135265
		cracksFreq      0.308177
		cracksOctaves   0
		craterMagn      0.656774
		craterFreq      18.4649
		craterDensity   0.293077
		craterOctaves   4.66029
		volcanoMagn     0.668709
		volcanoFreq     0.656294
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.699336
		volcanoRadius   0.508212
		volcanoTemp     1736.6
		lavaCoverTidal  0.0777113
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.34025
		stripeTwist     0.355047
		cycloneMagn     2.21008
		cycloneFreq     1.07965
		cycloneDensity  0.507628
		cycloneOctaves  4
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.02
		Velocity        117.094
		BumpHeight      4.01982
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.889161
		mainOctaves     10
		Coverage        0.134666
		stripeZones     2.34025
		stripeTwist     0.355047
	}

	Clouds
	{
		Height          18.0396
		Velocity        45.0342
		BumpHeight      4.01982
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.889161
		mainOctaves     10
		Coverage        0.134666
		stripeZones     2.34025
		stripeTwist     0.355047
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          119.48
		Density         0.112358
		Pressure        0.069771
		Greenhouse      4.90147
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	97.3069
			H2    	2.15656
			N2    	0.483818
			C2H4  	0.0475403
			CO    	0.004188
			C2H2  	0.000511784
			He    	0.000215478
			C2H6  	9.87715e-005
			Ne    	9.05821e-005
			Ar    	2.58738e-005
			O2    	2.43051e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00907202
		Period          0.0138619
		Eccentricity    0.0108465
		Inclination     -0.279063
		AscendingNode   -8.85027
		ArgOfPericenter -30.1452
		MeanAnomaly     142.744
	}
}

Moon	"Toosma 4/Tyrius System 4.4"
{
	ParentBody     "Toosma"
	Class	       "Titan"

	Mass            0.212412
	Radius          4737.79
	InertiaMoment   0.334063

	Obliquity       0.0873443
	EqAscendNode    170.257
	TidalLocked     true

	AlbedoBond      0.630959
	AlbedoGeom      0.757151
	Brightness      2
	Color          (0.666 0.662 0.660)

	Surface
	{
		SurfStyle       0.0633683
		OceanStyle      0.291252
		Randomize      (0.632, 0.428, -0.385)
		colorDistMagn   0.0625784
		colorDistFreq   519.47
		detailScale     12185.9
		colorConversion true
		seaLevel        0.683202
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  10
		icecapHeight    0.149253
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92302
		venusFreq       0.585862
		venusMagn       -1
		mareFreq        1.78873
		mareDensity     0.0299347
		terraceProb     0.142196
		erosion         0.11144
		montesMagn      0.15725
		montesFreq      286.371
		montesSpiky     0.970757
		montesFraction  0.507597
		dunesMagn       0.0523135
		dunesFreq       44.8981
		dunesFraction   0.155146
		hillsMagn       0.102047
		hillsFreq       416.177
		hillsFraction   0.129295
		hills2Fraction  0.184588
		riversMagn      56.0718
		riversFreq      3.24885
		riversSin       6.48328
		riversOctaves   2
		canyonsMagn     0.0475628
		canyonsFreq     135.442
		canyonFraction  0.394915
		cracksMagn      0.0472666
		cracksFreq      2.57139
		cracksOctaves   3
		craterMagn      0.640348
		craterFreq      14.2277
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0.0784432
		volcanoMagn     0.624761
		volcanoFreq     0.81046
		volcanoDensity  0.168524
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.848795
		volcanoRadius   0.528376
		volcanoTemp     1143.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.40879
		stripeTwist     1.23251
		cycloneMagn     2.74844
		cycloneFreq     0.545319
		cycloneDensity  0.403588
		cycloneOctaves  3
		colorSea       (0.090, 0.110, 0.150, 1.000)
		colorShelf     (0.250, 0.480, 0.460, 1.000)
		colorBeach     (0.333, 0.248, 0.189, 0.000)
		colorDesert    (0.566, 0.422, 0.322, 0.000)
		colorLowland   (0.540, 0.437, 0.360, 0.000)
		colorUpland    (0.620, 0.461, 0.352, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.540, 0.437, 0.360, 0.000)
		colorUpPlants  (0.620, 0.461, 0.352, 0.000)
		BumpHeight      20
		BumpOffset      13.664
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecularPower   55
		Hapke           0.51542
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          4.3457
		Velocity        171.182
		BumpHeight      4.34589
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.09474
		mainOctaves     10
		Coverage        0.138082
		stripeZones     1.40879
		stripeTwist     1.23251
	}

	Clouds
	{
		Height          8.69189
		Velocity        139.117
		BumpHeight      4.34589
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.09474
		mainOctaves     10
		Coverage        0.138082
		stripeZones     1.40879
		stripeTwist     1.23251
	}

	Clouds
	{
		Height          13.0376
		Velocity        79.0706
		BumpHeight      4.34589
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.09474
		mainOctaves     10
		Coverage        0.138082
		stripeZones     1.40879
		stripeTwist     1.23251
	}

	Ocean
	{
		Height          13.664
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          236.889
		Density         0.048458
		Pressure        0.0790884
		Greenhouse      6.10229
		Bright          8.65114
		Opacity         1
		SkyLight        2.88371
		Hue             0
		Saturation      1

		Composition
		{
			H2    	72.8641
			CH4   	25.2135
			N2    	1.77025
			C2H4  	0.114076
			C2H2  	0.0162806
			CO    	0.0144314
			C2H6  	0.00601525
			He    	0.000990519
			Ar    	0.000195778
			Ne    	5.05471e-005
			O2    	3.03597e-005
			Kr    	2.67825e-005
		}
	}

	Aurora
	{
		Height      51.7379
		NorthLat    67.3959
		NorthLon    -59.6006
		NorthRadius 1161.13
		NorthWidth  246.907
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -63.9161
		SouthLon    141.443
		SouthRadius 1177.48
		SouthWidth  301.729
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
		SemiMajorAxis   0.0152462
		Period          0.0301999
		Eccentricity    0.00327396
		Inclination     0.0873443
		AscendingNode   170.257
		ArgOfPericenter -166.392
		MeanAnomaly     -96.0169
	}
}

Moon	"Toosma 5/Tyrius System 4.5"
{
	ParentBody     "Toosma"
	Class	       "Titan"

	Mass            0.249635
	Radius          4601.7
	InertiaMoment   0.331658

	Oblateness      0.00143817

	RotationPeriod  44.8457
	Obliquity       -2.31061
	EqAscendNode    4.74672

	AlbedoBond      0.65
	AlbedoGeom      0.78
	Brightness      2
	Color          (0.575 0.570 0.560)

	Surface
	{
		SurfStyle       0.176796
		OceanStyle      0.207951
		Randomize      (0.338, -0.106, -0.673)
		colorDistMagn   0.0938114
		colorDistFreq   515.177
		detailScale     11835.8
		colorConversion true
		seaLevel        0.122409
		snowLevel       0.85
		tropicLatitude  0.038618
		icecapLatitude  10
		icecapHeight    0.171901
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90378
		venusFreq       0.832857
		venusMagn       -1
		mareFreq        1.56755
		mareDensity     0.0461652
		terraceProb     0.292455
		erosion         0.120145
		montesMagn      0.155143
		montesFreq      224.264
		montesSpiky     0.927587
		montesFraction  0.637245
		dunesMagn       0.0486733
		dunesFreq       43.8932
		dunesFraction   0.769062
		hillsMagn       0.106048
		hillsFreq       357.543
		hillsFraction   0.00636588
		hills2Fraction  0.409679
		riversMagn      49.4243
		riversFreq      3.83951
		riversSin       5.90986
		riversOctaves   2
		canyonsMagn     0.0407967
		canyonsFreq     120.922
		canyonFraction  0.958392
		cracksMagn      0.0708017
		cracksFreq      1.90626
		cracksOctaves   2
		craterMagn      0.65697
		craterFreq      17.1038
		craterDensity   0.0510423
		craterOctaves   1.89126
		craterRayedFactor 0
		volcanoMagn     0.662372
		volcanoFreq     0.748654
		volcanoDensity  0.19924
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.608991
		volcanoRadius   0.489481
		volcanoTemp     1617.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.85672
		stripeTwist     0.272542
		cycloneMagn     2.35697
		cycloneFreq     0.760886
		cycloneDensity  0.184965
		cycloneOctaves  4
		colorSea       (0.090, 0.110, 0.150, 1.000)
		colorShelf     (0.250, 0.480, 0.460, 1.000)
		colorBeach     (0.288, 0.214, 0.161, 0.000)
		colorDesert    (0.489, 0.364, 0.273, 0.000)
		colorLowland   (0.466, 0.376, 0.305, 0.000)
		colorUpland    (0.535, 0.397, 0.299, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.466, 0.376, 0.305, 0.000)
		colorUpPlants  (0.535, 0.397, 0.299, 0.000)
		BumpHeight      20
		BumpOffset      2.44818
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          4.67188
		Velocity        116.959
		BumpHeight      4.67196
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.00335
		mainOctaves     10
		Coverage        0.1
		stripeZones     1.85672
		stripeTwist     0.272542
	}

	Ocean
	{
		Height          2.44818
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          98.4799
		Density         0.564739
		Pressure        0.366062
		Greenhouse      9.48003
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	95.5391
			H2    	3.48233
			N2    	0.948009
			C2H4  	0.0206439
			CO    	0.00727837
			He    	0.000666422
			O2    	0.00055341
			C2H2  	0.000472145
			Ne    	0.000412836
			C2H6  	0.00029794
			Ar    	0.000216818
			CO2   	1.53017e-005
			H2S   	1.14957e-005
			Kr    	1.07613e-005
		}
	}

	Aurora
	{
		Height      48.1609
		NorthLat    74.1482
		NorthLon    -63.2543
		NorthRadius 1179.9
		NorthWidth  401.714
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -85.2806
		SouthLon    117.895
		SouthRadius 1485.05
		SouthWidth  475.064
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
		SemiMajorAxis   0.0256225
		Period          0.0657941
		Eccentricity    0.0492742
		Inclination     0.0977425
		AscendingNode   4.31442
		ArgOfPericenter 158.894
		MeanAnomaly     -90.3994
	}
}

DwarfMoon	"Toosma D2/Tyrius System 4.D2"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            4.39434e-007
	Radius          112.876
	InertiaMoment   0.399697

	RotationPeriod  449.745
	Obliquity       64.4408
	EqAscendNode    86.1093

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.663 0.526)

	Surface
	{
		SurfStyle       0.985435
		OceanStyle      0.746059
		Randomize      (0.097, 0.560, -0.864)
		colorDistMagn   0.56271
		colorDistFreq   8.16796
		detailScale     3082.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609863
		terraceProb     0.404935
		erosion         0
		montesMagn      0.536411
		montesFreq      3.69309
		montesSpiky     0.981218
		montesFraction  0.364217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.5211
		hillsFraction   0.603477
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232859
		craterFreq      0.428186
		craterDensity   1.02911
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470081
		volcanoTemp     1368.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.232, 0.211, 0.050)
		colorShelf     (0.296, 0.272, 0.242, 0.040)
		colorBeach     (0.340, 0.312, 0.274, 0.030)
		colorDesert    (0.385, 0.351, 0.311, 0.020)
		colorLowland   (0.429, 0.391, 0.342, 0.030)
		colorUpland    (0.473, 0.431, 0.374, 0.050)
		colorRock      (0.518, 0.471, 0.416, 0.020)
		colorSnow      (0.518, 0.471, 0.416, 1.000)
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
		SemiMajorAxis   3.76534
		Period          117.22
		Eccentricity    0.0876984
		Inclination     10.1392
		AscendingNode   92.3573
		ArgOfPericenter -52.48
		MeanAnomaly     -118.289
	}
}

DwarfMoon	"Toosma D3/Tyrius System 4.D3"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            6.19641e-007
	Radius          120.877
	InertiaMoment   0.397598

	RotationPeriod  404.557
	Obliquity       -99.9792
	EqAscendNode    57.2655

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.502 0.496)

	Surface
	{
		SurfStyle       0.522744
		OceanStyle      0.905364
		Randomize      (0.223, -0.884, -0.059)
		colorDistMagn   0.442558
		colorDistFreq   7.37808
		detailScale     3300.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824051
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698445
		terraceProb     0.493001
		erosion         0
		montesMagn      0.46296
		montesFreq      2.71667
		montesSpiky     0.988591
		montesFraction  0.73058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.6347
		hillsFraction   0.673941
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213267
		craterFreq      0.485581
		craterDensity   0.773241
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480721
		volcanoTemp     1264.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.171, 0.139, 0.000)
		colorShelf     (0.203, 0.176, 0.159, 0.000)
		colorBeach     (0.239, 0.206, 0.189, 0.000)
		colorDesert    (0.259, 0.221, 0.184, 0.000)
		colorLowland   (0.285, 0.236, 0.208, 0.000)
		colorUpland    (0.315, 0.286, 0.253, 0.000)
		colorRock      (0.341, 0.311, 0.273, 0.000)
		colorSnow      (0.371, 0.332, 0.288, 1.000)
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
		SemiMajorAxis   3.76589
		Period          117.246
		Eccentricity    0.275369
		Inclination     -88.2788
		AscendingNode   55.2365
		ArgOfPericenter -1.09633
		MeanAnomaly     15.9174
	}
}

DwarfMoon	"Toosma D4/Tyrius System 4.D4"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            8.83369e-007
	Radius          130.634
	InertiaMoment   0.398892

	RotationPeriod  366.8
	Obliquity       -116.614
	EqAscendNode    -3.07114

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.616 0.581 0.522)

	Surface
	{
		SurfStyle       0.799288
		OceanStyle      0.547011
		Randomize      (-0.459, -0.625, -0.369)
		colorDistMagn   0.94248
		colorDistFreq   6.46383
		detailScale     3567.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.287913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582765
		terraceProb     0.122472
		erosion         0
		montesMagn      0.612928
		montesFreq      2.82304
		montesSpiky     0.896166
		montesFraction  0.356483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.7398
		hillsFraction   0.592341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228007
		craterFreq      0.650942
		craterDensity   1.04534
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50677
		volcanoTemp     1849.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.198, 0.146, 0.000)
		colorShelf     (0.246, 0.204, 0.167, 0.000)
		colorBeach     (0.289, 0.238, 0.198, 0.000)
		colorDesert    (0.314, 0.256, 0.193, 0.000)
		colorLowland   (0.345, 0.273, 0.219, 0.000)
		colorUpland    (0.382, 0.331, 0.266, 0.000)
		colorRock      (0.412, 0.361, 0.287, 0.000)
		colorSnow      (0.449, 0.384, 0.303, 1.000)
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
		SemiMajorAxis   3.76629
		Period          117.264
		Eccentricity    0.306927
		Inclination     -78.9116
		AscendingNode   6.62281
		ArgOfPericenter -63.5547
		MeanAnomaly     5.05562
	}
}

DwarfMoon	"Toosma D5/Tyrius System 4.D5"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            1.27597e-006
	Radius          136.61
	InertiaMoment   0.399823

	RotationPeriod  319.559
	Obliquity       92.8036
	EqAscendNode    146.233

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.611 0.558)

	Surface
	{
		SurfStyle       0.577611
		OceanStyle      0.806115
		Randomize      (-0.478, 0.667, -0.833)
		colorDistMagn   0.39902
		colorDistFreq   9.63142
		detailScale     3730.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.649136
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.733478
		terraceProb     0.720666
		erosion         0
		montesMagn      0.585531
		montesFreq      3.20176
		montesSpiky     0.95564
		montesFraction  0.332231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.1131
		hillsFraction   0.640618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214644
		craterFreq      0.720555
		craterDensity   0.953557
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586274
		volcanoTemp     1559.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.208, 0.156, 0.000)
		colorShelf     (0.267, 0.214, 0.178, 0.000)
		colorBeach     (0.314, 0.251, 0.212, 0.000)
		colorDesert    (0.341, 0.269, 0.206, 0.000)
		colorLowland   (0.374, 0.287, 0.234, 0.000)
		colorUpland    (0.414, 0.348, 0.284, 0.000)
		colorRock      (0.447, 0.379, 0.307, 0.000)
		colorSnow      (0.488, 0.403, 0.323, 1.000)
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
		SemiMajorAxis   3.76672
		Period          117.285
		Eccentricity    0.0168783
		Inclination     76.5079
		AscendingNode   142.65
		ArgOfPericenter -22.6436
		MeanAnomaly     17.7367
	}
}

DwarfMoon	"Toosma D6/Tyrius System 4.D6"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            1.87233e-006
	Radius          184.548
	InertiaMoment   0.397837

	RotationPeriod  355.465
	Obliquity       -56.4124
	EqAscendNode    132.605

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.563 0.561)

	Surface
	{
		SurfStyle       0.840747
		OceanStyle      0.444208
		Randomize      (0.176, -0.276, 0.400)
		colorDistMagn   0.878733
		colorDistFreq   28.4559
		detailScale     5039.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.52862
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616821
		terraceProb     0.200821
		erosion         0
		montesMagn      0.600098
		montesFreq      3.0701
		montesSpiky     0.950899
		montesFraction  0.814925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       85.7235
		hillsFraction   0.629186
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217092
		craterFreq      1.301
		craterDensity   0.8625
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468508
		volcanoTemp     1578.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.191, 0.157, 0.000)
		colorShelf     (0.226, 0.197, 0.180, 0.000)
		colorBeach     (0.266, 0.231, 0.213, 0.000)
		colorDesert    (0.289, 0.248, 0.208, 0.000)
		colorLowland   (0.317, 0.265, 0.236, 0.000)
		colorUpland    (0.351, 0.321, 0.286, 0.000)
		colorRock      (0.379, 0.349, 0.309, 0.000)
		colorSnow      (0.413, 0.372, 0.326, 1.000)
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
		SemiMajorAxis   3.76736
		Period          117.314
		Eccentricity    0.00635796
		Inclination     -46.7061
		AscendingNode   140.745
		ArgOfPericenter 134.612
		MeanAnomaly     83.1107
	}
}

DwarfMoon	"Toosma D7/Tyrius System 4.D7"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            2.80021e-006
	Radius          201.001
	InertiaMoment   0.399035

	RotationPeriod  317.079
	Obliquity       13.6074
	EqAscendNode    -163.912

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.794 0.793)

	Surface
	{
		SurfStyle       0.713111
		OceanStyle      0.522383
		Randomize      (-0.617, -0.113, 0.804)
		colorDistMagn   0.353254
		colorDistFreq   30.8097
		detailScale     5488.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.599728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337097
		terraceProb     0.313447
		erosion         0
		montesMagn      0.506212
		montesFreq      3.39368
		montesSpiky     0.871643
		montesFraction  0.30674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       82.4342
		hillsFraction   0.554111
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259059
		craterFreq      1.68473
		craterDensity   0.909307
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530518
		volcanoTemp     1391.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.270, 0.222, 0.000)
		colorShelf     (0.319, 0.278, 0.254, 0.000)
		colorBeach     (0.375, 0.326, 0.301, 0.000)
		colorDesert    (0.407, 0.349, 0.293, 0.000)
		colorLowland   (0.447, 0.373, 0.333, 0.000)
		colorUpland    (0.494, 0.453, 0.404, 0.000)
		colorRock      (0.534, 0.492, 0.436, 0.000)
		colorSnow      (0.582, 0.524, 0.460, 1.000)
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
		SemiMajorAxis   3.76765
		Period          117.328
		Eccentricity    0.175361
		Inclination     49.3156
		AscendingNode   -159.049
		ArgOfPericenter 161.406
		MeanAnomaly     -51.8671
	}
}

Moon	"Toosma 6/Tyrius System 4.6"
{
	ParentBody     "Toosma"
	Class	       "Desert"

	Mass            10.1605
	Radius          14526.5
	InertiaMoment   0.330096

	Oblateness      0.0185443

	RotationPeriod  10.9482
	Obliquity       -49.2234
	EqAscendNode    120.905

	AlbedoBond      0.318577
	AlbedoGeom      0.382293
	Brightness      2
	Color          (0.669 0.666 0.663)

	Surface
	{
		SurfStyle       0.217358
		OceanStyle      0.072829
		Randomize      (-0.182, -0.514, 0.190)
		colorDistMagn   0.0435098
		colorDistFreq   1887.77
		detailScale     37363.1
		colorConversion true
		seaLevel        0.187047
		snowLevel       2
		tropicLatitude  0.665148
		icecapLatitude  10
		icecapHeight    0.242605
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.948181
		venusFreq       0.638644
		venusMagn       0
		mareFreq        1.79195
		mareDensity     0.201757
		terraceProb     0.160116
		erosion         0
		montesMagn      0.161475
		montesFreq      515.48
		montesSpiky     0.969594
		montesFraction  0.551922
		dunesMagn       0.0624534
		dunesFreq       151.238
		dunesFraction   0.818186
		hillsMagn       0.103854
		hillsFreq       1980.39
		hillsFraction   0
		hills2Fraction  0
		riversMagn      69.1283
		riversFreq      2.94746
		riversSin       7.48086
		riversOctaves   0
		canyonsMagn     0.0109904
		canyonsFreq     390.165
		canyonFraction  0
		cracksMagn      0.116522
		cracksFreq      1.54779
		cracksOctaves   0
		craterMagn      0.900346
		craterFreq      42.9721
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.721944
		volcanoFreq     0.812978
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.961498
		volcanoRadius   0.44902
		volcanoTemp     1273.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.843479
		stripeZones     1.53224
		stripeTwist     0
		cycloneMagn     2.89244
		cycloneFreq     1.03305
		cycloneDensity  0.503433
		cycloneOctaves  2
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
		BumpHeight      14.2903
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
		Height          44.5957
		Velocity        131.442
		BumpHeight      5.32983
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.973922
		mainOctaves     10
		Coverage        0.237154
		stripeZones     1.53224
		stripeTwist     0
	}

	Clouds
	{
		Height          82.0459
		Velocity        128.187
		BumpHeight      5.51267
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.973922
		mainOctaves     10
		Coverage        0.237154
		stripeZones     1.53224
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          270.559
		Density         21.0374
		Pressure        88.3987
		Greenhouse      459.233
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	49.8331
			CO2   	14.9222
			CH4   	14.0774
			SO2   	7.4165
			NH3   	6.54723
			H2    	2.60308
			C2H2  	1.64851
			H2S   	1.55543
			C2H4  	1.01174
			C2H6  	0.166446
			N2    	0.163649
			C3H8  	0.0535123
			CO    	0.000825613
			Cl2   	0.000204046
			Ne    	0.000136771
			Ar    	6.05422e-005
			Kr    	1.84986e-005
		}
	}

	Aurora
	{
		Height      286.552
		NorthLat    46.8476
		NorthLon    103.082
		NorthRadius 4453.05
		NorthWidth  1353.49
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -66.2948
		SouthLon    289.588
		SouthRadius 3501.67
		SouthWidth  724.498
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     19636
		OuterRadius     34741.4
		RotationPeriod  3.89681
		RotationOffset  0
		FrontBright     0.297954
		BackBright      0.366092
		Density         0.100672
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.76793
		Period          116.885
		Eccentricity    0.286218
		Inclination     -13.2451
		AscendingNode   129.763
		ArgOfPericenter -121.9
		MeanAnomaly     127.33
	}
}

DwarfMoon	"Toosma D8/Tyrius System 4.D8"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            1.12304e-011
	Radius          2.88934
	InertiaMoment   0.398049

	RotationPeriod  2264.53
	Obliquity       -17.8264
	EqAscendNode    58.1394

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.617 0.584)

	Surface
	{
		SurfStyle       0.605194
		OceanStyle      0.29148
		Randomize      (0.057, 0.561, -0.131)
		colorDistMagn   0.0917746
		colorDistFreq   0.00622583
		detailScale     78.8982
		colorConversion true
		snowLevel       2
		tropicLatitude  0.401833
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580385
		terraceProb     0.303376
		erosion         0
		montesMagn      0.511763
		montesFreq      3.3284
		montesSpiky     0.920443
		montesFraction  0.837502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0177353
		hillsFraction   0.760497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246261
		craterFreq      0.188252
		craterDensity   0.851973
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499311
		volcanoTemp     1641.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.210, 0.163, 0.000)
		colorShelf     (0.267, 0.216, 0.187, 0.000)
		colorBeach     (0.313, 0.253, 0.222, 0.000)
		colorDesert    (0.340, 0.272, 0.216, 0.000)
		colorLowland   (0.373, 0.290, 0.245, 0.000)
		colorUpland    (0.414, 0.352, 0.298, 0.000)
		colorRock      (0.447, 0.383, 0.321, 0.000)
		colorSnow      (0.487, 0.407, 0.339, 1.000)
		BumpHeight      2.6004
		BumpOffset      0.520081
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.76846
		Period          117.366
		Eccentricity    0.0583199
		Inclination     -10.1142
		AscendingNode   66.4484
		ArgOfPericenter -118.317
		MeanAnomaly     -174.937
	}
}

DwarfMoon	"Toosma D9/Tyrius System 4.D9"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            2.32087e-011
	Radius          4.31172
	InertiaMoment   0.399173

	RotationPeriod  2353.65
	Obliquity       66.76
	EqAscendNode    -38.1513

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.395 0.357)

	Surface
	{
		SurfStyle       0.0667681
		OceanStyle      0.375586
		Randomize      (0.572, -0.100, -0.747)
		colorDistMagn   0.340745
		colorDistFreq   0.00902666
		detailScale     117.739
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996279
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.296897
		terraceProb     0.217339
		erosion         0
		montesMagn      0.382187
		montesFreq      2.86915
		montesSpiky     0.884271
		montesFraction  0.778129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0390531
		hillsFraction   0.686196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222663
		craterFreq      0.25301
		craterDensity   0.995535
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533898
		volcanoTemp     1771.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.158, 0.143, 0.000)
		colorShelf     (0.198, 0.168, 0.152, 0.000)
		colorBeach     (0.209, 0.178, 0.161, 0.000)
		colorDesert    (0.221, 0.188, 0.170, 0.000)
		colorLowland   (0.232, 0.198, 0.179, 0.000)
		colorUpland    (0.244, 0.208, 0.188, 0.000)
		colorRock      (0.256, 0.217, 0.197, 0.000)
		colorSnow      (0.267, 0.227, 0.206, 1.000)
		BumpHeight      3.88055
		BumpOffset      0.776109
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.76874
		Period          117.379
		Eccentricity    0.294098
		Inclination     20.4743
		AscendingNode   -28.1192
		ArgOfPericenter 117.716
		MeanAnomaly     10.2985
	}
}

Moon	"Toosma 7/Tyrius System 4.7"
{
	ParentBody     "Toosma"
	Class	       "IceWorld"

	Mass            0.00203349
	Radius          967.346
	InertiaMoment   0.399929

	Oblateness      0.00132136

	RotationPeriod  56.7193
	Obliquity       -124.078
	EqAscendNode    44.209

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.713 0.659 0.581)

	Surface
	{
		SurfStyle       0.257859
		OceanStyle      0.818303
		Randomize      (0.455, 0.164, -0.484)
		colorDistMagn   0.0939234
		colorDistFreq   107.077
		detailScale     2488.07
		colorConversion true
		drivenDarkening 0
		seaLevel        0.115945
		snowLevel       2
		tropicLatitude  0.643339
		icecapLatitude  1
		icecapHeight    0.115945
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81947
		venusFreq       0.779485
		venusMagn       0.112029
		mareFreq        0.332196
		mareDensity     0.00140463
		terraceProb     0.571654
		erosion         0
		montesMagn      0.0494882
		montesFreq      44.3587
		montesSpiky     0.943407
		montesFraction  0.528692
		dunesMagn       0.0393558
		dunesFreq       1319.97
		dunesFraction   0.598045
		hillsMagn       0.129693
		hillsFreq       97.8526
		hillsFraction   0.423555
		hills2Fraction  0.192987
		riversMagn      72.451
		riversFreq      4.34226
		riversSin       7.29771
		riversOctaves   0
		canyonsMagn     0.575821
		canyonsFreq     0.35642
		canyonFraction  0
		cracksMagn      0.0617131
		cracksFreq      0.43214
		cracksOctaves   0
		craterMagn      0.698942
		craterFreq      2.99001
		craterDensity   0.924261
		craterOctaves   10
		craterRayedFactor 0.209886
		volcanoMagn     0.182687
		volcanoFreq     0.907791
		volcanoDensity  0.197235
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.220892
		volcanoRadius   0.12824
		volcanoTemp     1667.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.713, 0.659, 0.581, 0.500)
		colorShelf     (0.677, 0.626, 0.552, 0.500)
		colorBeach     (0.499, 0.461, 0.407, 0.750)
		colorDesert    (0.606, 0.560, 0.494, 1.000)
		colorLowland   (0.627, 0.580, 0.511, 1.000)
		colorUpland    (0.663, 0.613, 0.540, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.627, 0.580, 0.511, 1.000)
		colorUpPlants  (0.663, 0.613, 0.540, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999979
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
		Height          48.3673
		Density         2.09746e-006
		Pressure        4.98555e-007
		Greenhouse      0.00399768
		Bright          1.15968
		Opacity         0
		SkyLight        0.386561
		Hue             0.0135653
		Saturation      1

		Composition
		{
			CO2   	57.0347
			H2S   	31.3448
			C2H6  	10.2024
			Ar    	1.36089
			Kr    	0.0267437
			C3H8  	0.0164707
			O2    	0.0125818
			Xe    	0.00140865
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.76924
		Period          117.402
		Eccentricity    0.0362457
		Inclination     -73.9978
		AscendingNode   39.865
		ArgOfPericenter -85.2059
		MeanAnomaly     123.868
	}
}

DwarfMoon	"Toosma D10/Tyrius System 4.D10"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            7.57631e-011
	Radius          5.83054
	InertiaMoment   0.398241

	RotationPeriod  1761.53
	Obliquity       -14.4271
	EqAscendNode    -127.512

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.405 0.401 0.396)

	Surface
	{
		SurfStyle       0.796662
		OceanStyle      0.824411
		Randomize      (0.588, -0.715, 0.560)
		colorDistMagn   0.409622
		colorDistFreq   0.0191939
		detailScale     159.213
		colorConversion true
		snowLevel       2
		tropicLatitude  0.653449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380833
		terraceProb     0.212297
		erosion         0
		montesMagn      0.445233
		montesFreq      4.1578
		montesSpiky     0.903392
		montesFraction  0.406324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0837549
		hillsFraction   0.619698
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250492
		craterFreq      0.240818
		craterDensity   0.912815
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501062
		volcanoTemp     1619.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.136, 0.111, 0.000)
		colorShelf     (0.162, 0.140, 0.127, 0.000)
		colorBeach     (0.190, 0.164, 0.150, 0.000)
		colorDesert    (0.206, 0.176, 0.146, 0.000)
		colorLowland   (0.227, 0.189, 0.166, 0.000)
		colorUpland    (0.251, 0.229, 0.202, 0.000)
		colorRock      (0.271, 0.249, 0.218, 0.000)
		colorSnow      (0.295, 0.265, 0.230, 1.000)
		BumpHeight      5.24749
		BumpOffset      1.0495
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.76947
		Period          117.413
		Eccentricity    0.256201
		Inclination     -48.7089
		AscendingNode   -129.034
		ArgOfPericenter -158.508
		MeanAnomaly     -61.7637
	}
}

DwarfMoon	"Toosma D11/Tyrius System 4.D11"
{
	ParentBody     "Toosma"
	Class	       "Asteroid"

	Mass            1.25582e-010
	Radius          6.54982
	InertiaMoment   0.399308

	RotationPeriod  1539.73
	Obliquity       -24.2629
	EqAscendNode    13.6373

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.566 0.562)

	Surface
	{
		SurfStyle       0.897057
		OceanStyle      0.815512
		Randomize      (-0.716, 0.140, -0.272)
		colorDistMagn   0.374021
		colorDistFreq   0.0198688
		detailScale     178.854
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314569
		terraceProb     0.303945
		erosion         0
		montesMagn      0.612679
		montesFreq      3.90373
		montesSpiky     0.81125
		montesFraction  0.249056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0743735
		hillsFraction   0.611184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233677
		craterFreq      0.269601
		craterDensity   1.03905
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525448
		volcanoTemp     1428.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.198, 0.225, 0.050)
		colorShelf     (0.229, 0.232, 0.259, 0.040)
		colorBeach     (0.263, 0.266, 0.292, 0.030)
		colorDesert    (0.297, 0.300, 0.332, 0.020)
		colorLowland   (0.332, 0.334, 0.366, 0.030)
		colorUpland    (0.366, 0.368, 0.399, 0.050)
		colorRock      (0.400, 0.402, 0.444, 0.020)
		colorSnow      (0.400, 0.402, 0.444, 1.000)
		BumpHeight      5.89484
		BumpOffset      1.17897
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.76975
		Period          117.426
		Eccentricity    0.0738679
		Inclination     -32.5428
		AscendingNode   8.83842
		ArgOfPericenter -14.1766
		MeanAnomaly     89.7689
	}
}

// http://starwars.wikia.com/wiki/Taoska
Planet	"Taoska/Tyrius System 5"
{
	ParentBody     "Tyrius System"
	Class	       "IceWorld"

	Mass            1.25424
	Radius          8164.93
	InertiaMoment   0.330983

	Oblateness      0.0104286

	RotationPeriod  17.5384
	Obliquity       39.2956
	EqAscendNode    -80.491

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.482 0.479 0.476)

	Surface
	{
		SurfStyle       0.273533
		OceanStyle      0.594511
		Randomize      (0.582, 0.347, -0.697)
		colorDistMagn   0.0756598
		colorDistFreq   780.474
		detailScale     21000.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.221738
		snowLevel       0.85
		tropicLatitude  0.636915
		icecapLatitude  1
		icecapHeight    0.221738
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88142
		venusFreq       1.29075
		venusMagn       0
		mareFreq        2.04366
		mareDensity     0.0950412
		terraceProb     0.260716
		erosion         0
		montesMagn      0.152803
		montesFreq      474.783
		montesSpiky     0.967799
		montesFraction  0.176959
		dunesMagn       0.0565584
		dunesFreq       10807
		dunesFraction   0.0543903
		hillsMagn       0.139384
		hillsFreq       934.839
		hillsFraction   0.20184
		hills2Fraction  0.0275665
		riversMagn      56.1386
		riversFreq      2.90094
		riversSin       4.9392
		riversOctaves   0
		canyonsMagn     0.401876
		canyonsFreq     3.18291
		canyonFraction  0
		cracksMagn      0.0416423
		cracksFreq      1.63517
		cracksOctaves   7
		craterMagn      0.61688
		craterFreq      24.8815
		craterDensity   0.211553
		craterOctaves   3.00653
		craterRayedFactor 0
		volcanoMagn     0.632524
		volcanoFreq     0.892375
		volcanoDensity  0.196519
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.35506
		volcanoRadius   0.500194
		volcanoTemp     1202.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.80543
		stripeTwist     0
		cycloneMagn     2.20016
		cycloneFreq     0.817802
		cycloneDensity  0.327016
		cycloneOctaves  4
		colorSea       (0.482, 0.479, 0.476, 0.500)
		colorShelf     (0.458, 0.456, 0.452, 0.500)
		colorBeach     (0.337, 0.336, 0.333, 0.750)
		colorDesert    (0.410, 0.408, 0.404, 1.000)
		colorLowland   (0.424, 0.422, 0.419, 1.000)
		colorUpland    (0.448, 0.446, 0.443, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.424, 0.422, 0.419, 1.000)
		colorUpPlants  (0.448, 0.446, 0.443, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	Clouds
	{
		Height          15.145
		Velocity        115.648
		BumpHeight      5.14508
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04053
		mainOctaves     10
		Coverage        0.228819
		stripeZones     1.80543
		stripeTwist     0
	}

	Clouds
	{
		Height          20.29
		Velocity        173.027
		BumpHeight      5.14508
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04053
		mainOctaves     10
		Coverage        0.228819
		stripeZones     1.80543
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          58.6316
		Density         0.351125
		Pressure        0.226852
		Greenhouse      10.0058
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			C2H4  	49.945
			H2    	29.4432
			CH4   	15.2585
			CO2   	4.28947
			C2H2  	0.629512
			C2H6  	0.325331
			N2    	0.100701
			H2S   	0.00651223
			Ne    	0.000708038
			O2    	0.000440597
			CO    	0.000327466
			NH3   	0.000113976
			Ar    	8.44919e-005
			He    	4.74467e-005
			C3H8  	1.49535e-005
		}
	}

	Aurora
	{
		Height      137.368
		NorthLat    57.3438
		NorthLon    -147.073
		NorthRadius 1927.17
		NorthWidth  489.362
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -57.7546
		SouthLon    7.20403
		SouthRadius 2836.38
		SouthWidth  663.291
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     12158.7
		OuterRadius     19322.4
		RotationPeriod  4.88566
		RotationOffset  0
		FrontBright     0.677472
		BackBright      0.847671
		Density         0.659306
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   468
		Period          1195.63
		Eccentricity    0.0621339
		Inclination     1.73169
		AscendingNode   -82.1871
		ArgOfPericenter 67.1488
		MeanAnomaly     289.479
	}
}

Comet	"C1"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.6346e-008
	Radius          63.9425
	InertiaMoment   0.399512

	Oblateness      0.0208684

	RotationPeriod  39.5546
	Obliquity       165.506
	EqAscendNode    16.0284

	AbsMagn         2.24031
	SlopeParam      4.60439
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.672 0.623 0.550)

	Surface
	{
		SurfStyle       0.610419
		OceanStyle      0.291163
		Randomize      (0.144, -0.340, -0.551)
		colorDistMagn   0.320415
		colorDistFreq   2.81104
		detailScale     1746.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.224691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500854
		terraceProb     0.349216
		erosion         0
		montesMagn      0.50769
		montesFreq      2.68805
		montesSpiky     0.946979
		montesFraction  0.120891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.87693
		hillsFraction   0.674419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226645
		craterFreq      0.202819
		craterDensity   0.904288
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478361
		volcanoTemp     1517.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.212, 0.154, 0.000)
		colorShelf     (0.269, 0.218, 0.176, 0.000)
		colorBeach     (0.316, 0.255, 0.209, 0.000)
		colorDesert    (0.343, 0.274, 0.203, 0.000)
		colorLowland   (0.376, 0.293, 0.231, 0.000)
		colorUpland    (0.417, 0.355, 0.280, 0.000)
		colorRock      (0.450, 0.386, 0.302, 0.000)
		colorSnow      (0.491, 0.411, 0.319, 1.000)
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
		MaxLength   0.985495
		GasToDust   0.25
		Particles   2970
		GasBright   0.114139
		DustBright  0.60043
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   552.496
		Period          3618.22
		Eccentricity    0.913247
		Inclination     177.463
		AscendingNode   -130.569
		ArgOfPericenter 154.952
		MeanAnomaly     63.8498
	}
}

Comet	"C2"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.35075e-015
	Radius          0.182304
	InertiaMoment   0.398283

	Oblateness      0.0172264

	RotationPeriod  37.6827
	Obliquity       118.712
	EqAscendNode    0.605815

	AbsMagn         10.4468
	SlopeParam      5.23062
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.466 0.459 0.454)

	Surface
	{
		SurfStyle       0.929034
		OceanStyle      0.482883
		Randomize      (-0.531, 0.878, 0.322)
		colorDistMagn   0.371733
		colorDistFreq   2.648e-005
		detailScale     4.97811
		colorConversion true
		snowLevel       2
		tropicLatitude  0.294223
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635389
		terraceProb     0.261668
		erosion         0
		montesMagn      0.463484
		montesFreq      2.92693
		montesSpiky     0.964964
		montesFraction  0.501674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000100718
		hillsFraction   0.567234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254727
		craterFreq      0.266673
		craterDensity   0.980164
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478529
		volcanoTemp     1425.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.161, 0.182, 0.050)
		colorShelf     (0.187, 0.188, 0.209, 0.040)
		colorBeach     (0.214, 0.216, 0.236, 0.030)
		colorDesert    (0.242, 0.243, 0.268, 0.020)
		colorLowland   (0.270, 0.271, 0.295, 0.030)
		colorUpland    (0.298, 0.298, 0.322, 0.050)
		colorRock      (0.326, 0.326, 0.359, 0.020)
		colorSnow      (0.326, 0.326, 0.359, 1.000)
		BumpHeight      0.164073
		BumpOffset      0.0328147
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0559368
		GasToDust   0.25
		Particles   1092
		GasBright   0.0873037
		DustBright  0.311751
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   479.577
		Period          2926.09
		Eccentricity    0.909365
		Inclination     44.7264
		AscendingNode   -5.43738
		ArgOfPericenter -166.861
		MeanAnomaly     142.972
	}
}

Comet	"C3"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.81814e-011
	Radius          3.95886
	InertiaMoment   0.399935

	Oblateness      0.0254527

	RotationPeriod  35.7825
	Obliquity       71.9177
	EqAscendNode    345.183

	AbsMagn         6.90237
	SlopeParam      6.01291
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.599 0.594)

	Surface
	{
		SurfStyle       0.92612
		OceanStyle      0.572361
		Randomize      (0.678, -0.725, 0.024)
		colorDistMagn   0.0472865
		colorDistFreq   0.0107594
		detailScale     108.103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350787
		terraceProb     0.3899
		erosion         0
		montesMagn      0.58522
		montesFreq      2.75655
		montesSpiky     0.902986
		montesFraction  0.307865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0420036
		hillsFraction   0.394074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229504
		craterFreq      0.252152
		craterDensity   0.837446
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51754
		volcanoTemp     1363.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.210, 0.238, 0.050)
		colorShelf     (0.241, 0.245, 0.273, 0.040)
		colorBeach     (0.277, 0.281, 0.309, 0.030)
		colorDesert    (0.313, 0.317, 0.350, 0.020)
		colorLowland   (0.349, 0.353, 0.386, 0.030)
		colorUpland    (0.385, 0.389, 0.422, 0.050)
		colorRock      (0.422, 0.425, 0.469, 0.020)
		colorSnow      (0.422, 0.425, 0.469, 1.000)
		BumpHeight      3.56298
		BumpOffset      0.712596
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.537129
		GasToDust   0.25
		Particles   2064
		GasBright   0.245467
		DustBright  0.638075
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   407.49
		Period          2291.8
		Eccentricity    0.812582
		Inclination     159.677
		AscendingNode   154.064
		ArgOfPericenter -120.312
		MeanAnomaly     -108.201
	}
}

Comet	"C4"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.4062e-007
	Radius          71.2471
	InertiaMoment   0.398827

	Oblateness      0.0213493

	RotationPeriod  33.8477
	Obliquity       25.1234
	EqAscendNode    329.761

	AbsMagn         1.57597
	SlopeParam      7.39033
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.559 0.405 0.324)

	Surface
	{
		SurfStyle       0.459956
		OceanStyle      0.347141
		Randomize      (0.535, -0.294, 0.074)
		colorDistMagn   0.926837
		colorDistFreq   1.9638
		detailScale     1945.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.645179
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.261003
		terraceProb     0.320438
		erosion         0
		montesMagn      0.554772
		montesFreq      2.3872
		montesSpiky     0.951305
		montesFraction  0.428868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.7258
		hillsFraction   0.575652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244814
		craterFreq      0.228821
		craterDensity   0.88951
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486717
		volcanoTemp     1774.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.162, 0.130, 0.000)
		colorShelf     (0.237, 0.172, 0.138, 0.000)
		colorBeach     (0.251, 0.182, 0.146, 0.000)
		colorDesert    (0.265, 0.192, 0.154, 0.000)
		colorLowland   (0.279, 0.202, 0.162, 0.000)
		colorUpland    (0.293, 0.212, 0.170, 0.000)
		colorRock      (0.307, 0.223, 0.178, 0.000)
		colorSnow      (0.321, 0.233, 0.187, 1.000)
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
		GasBright   0.19135
		DustBright  0.376678
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   241.687
		Period          1046.84
		Eccentricity    0.727726
		Inclination     -16.1118
		AscendingNode   -153.894
		ArgOfPericenter -36.4563
		MeanAnomaly     24.5916
	}
}

Comet	"C5"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.32979e-015
	Radius          0.245109
	InertiaMoment   0.397057

	Oblateness      0.0316316

	RotationPeriod  31.871
	Obliquity       338.329
	EqAscendNode    314.338

	AbsMagn         10.1998
	SlopeParam      2.4939
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.510 0.390)

	Surface
	{
		SurfStyle       0.645144
		OceanStyle      0.298625
		Randomize      (0.788, -0.666, -0.344)
		colorDistMagn   0.0932178
		colorDistFreq   2.60484e-005
		detailScale     6.69311
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.685872
		terraceProb     0.67093
		erosion         0
		montesMagn      0.326773
		montesFreq      4.01608
		montesSpiky     0.983642
		montesFraction  0.492379
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000136569
		hillsFraction   0.538442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240055
		craterFreq      0.254517
		craterDensity   0.790382
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5027
		volcanoTemp     1246.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.173, 0.109, 0.000)
		colorShelf     (0.266, 0.178, 0.125, 0.000)
		colorBeach     (0.312, 0.209, 0.148, 0.000)
		colorDesert    (0.339, 0.224, 0.144, 0.000)
		colorLowland   (0.372, 0.239, 0.164, 0.000)
		colorUpland    (0.412, 0.290, 0.199, 0.000)
		colorRock      (0.445, 0.316, 0.215, 0.000)
		colorSnow      (0.485, 0.336, 0.226, 1.000)
		BumpHeight      0.220598
		BumpOffset      0.0441196
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0887628
		GasToDust   0.25
		Particles   1159
		GasBright   0.0999736
		DustBright  0.152541
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   512.556
		Period          3233.05
		Eccentricity    0.817783
		Inclination     -100.992
		AscendingNode   176.297
		ArgOfPericenter 174.648
		MeanAnomaly     104.433
	}
}

Comet	"C6"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.34877e-011
	Radius          4.41303
	InertiaMoment   0.399295

	Oblateness      0.0274502

	RotationPeriod  29.8445
	Obliquity       291.535
	EqAscendNode    298.915

	AbsMagn         6.684
	SlopeParam      3.16298
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.751 0.748 0.745)

	Surface
	{
		SurfStyle       0.762246
		OceanStyle      0.276792
		Randomize      (0.097, -0.964, 0.632)
		colorDistMagn   0.73469
		colorDistFreq   0.00951706
		detailScale     120.505
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970543
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.308158
		terraceProb     0.106516
		erosion         0
		montesMagn      0.452758
		montesFreq      3.86248
		montesSpiky     0.837928
		montesFraction  0.32541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0482211
		hillsFraction   0.591013
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207104
		craterFreq      0.24704
		craterDensity   1.07739
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472788
		volcanoTemp     1561.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.254, 0.208, 0.000)
		colorShelf     (0.300, 0.262, 0.238, 0.000)
		colorBeach     (0.353, 0.307, 0.283, 0.000)
		colorDesert    (0.383, 0.329, 0.275, 0.000)
		colorLowland   (0.420, 0.351, 0.313, 0.000)
		colorUpland    (0.466, 0.426, 0.380, 0.000)
		colorRock      (0.503, 0.464, 0.409, 0.000)
		colorSnow      (0.548, 0.494, 0.432, 1.000)
		BumpHeight      3.97173
		BumpOffset      0.794346
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.569955
		GasToDust   0.25
		Particles   2131
		GasBright   0.335304
		DustBright  0.401697
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   319.663
		Period          1592.35
		Eccentricity    0.694993
		Inclination     7.59963
		AscendingNode   -177.616
		ArgOfPericenter 123.786
		MeanAnomaly     104.987
	}
}

Comet	"C7"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.59004e-007
	Radius          95.7536
	InertiaMoment   0.397962

	Oblateness      0.0417002

	RotationPeriod  27.7587
	Obliquity       244.74
	EqAscendNode    283.493

	AbsMagn         0.664044
	SlopeParam      3.74799
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.766 0.764 0.762)

	Surface
	{
		SurfStyle       0.0311774
		OceanStyle      0.758515
		Randomize      (-0.116, 0.108, -0.243)
		colorDistMagn   0.512883
		colorDistFreq   3.13475
		detailScale     2614.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.439655
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400305
		terraceProb     0.171538
		erosion         0
		montesMagn      0.551783
		montesFreq      3.61729
		montesSpiky     0.906007
		montesFraction  0.755824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.4897
		hillsFraction   0.49129
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241533
		craterFreq      0.255114
		craterDensity   0.794847
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459573
		volcanoTemp     1291.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.306, 0.305, 0.000)
		colorShelf     (0.325, 0.325, 0.324, 0.000)
		colorBeach     (0.345, 0.344, 0.343, 0.000)
		colorDesert    (0.364, 0.363, 0.362, 0.000)
		colorLowland   (0.383, 0.382, 0.381, 0.000)
		colorUpland    (0.402, 0.401, 0.400, 0.000)
		colorRock      (0.421, 0.420, 0.419, 0.000)
		colorSnow      (0.440, 0.439, 0.438, 1.000)
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
		GasBright   0.00590188
		DustBright  0.415586
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   360.857
		Period          1909.86
		Eccentricity    0.864968
		Inclination     -95.3525
		AscendingNode   -162.415
		ArgOfPericenter 84.6593
		MeanAnomaly     -98.8128
	}
}

Comet	"C8"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.97492e-015
	Radius          0.273342
	InertiaMoment   0.399727

	Oblateness      0.0372802

	RotationPeriod  25.6025
	Obliquity       197.946
	EqAscendNode    268.07

	AbsMagn         9.96097
	SlopeParam      4.31178
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.483 0.481 0.478)

	Surface
	{
		SurfStyle       0.524474
		OceanStyle      0.758734
		Randomize      (-0.160, -0.694, 0.808)
		colorDistMagn   0.318583
		colorDistFreq   3.80776e-005
		detailScale     7.46405
		colorConversion true
		snowLevel       2
		tropicLatitude  0.605491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398709
		terraceProb     0.329476
		erosion         0
		montesMagn      0.540866
		montesFreq      2.43722
		montesSpiky     0.998342
		montesFraction  0.54454
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000150464
		hillsFraction   0.324553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264968
		craterFreq      0.200418
		craterDensity   1.0717
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569711
		volcanoTemp     1337.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.164, 0.134, 0.000)
		colorShelf     (0.193, 0.168, 0.153, 0.000)
		colorBeach     (0.227, 0.197, 0.182, 0.000)
		colorDesert    (0.247, 0.212, 0.177, 0.000)
		colorLowland   (0.271, 0.226, 0.201, 0.000)
		colorUpland    (0.300, 0.274, 0.244, 0.000)
		colorRock      (0.324, 0.298, 0.263, 0.000)
		colorSnow      (0.353, 0.317, 0.278, 1.000)
		BumpHeight      0.246008
		BumpOffset      0.0492015
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.121589
		GasToDust   0.25
		Particles   1225
		GasBright   0.0661794
		DustBright  0.839795
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   343.36
		Period          1772.66
		Eccentricity    0.895766
		Inclination     145.354
		AscendingNode   85.6794
		ArgOfPericenter 88.8108
		MeanAnomaly     47.0076
	}
}

Comet	"C9"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.16803e-011
	Radius          5.92868
	InertiaMoment   0.398572

	Oblateness      0.0588091

	RotationPeriod  23.3629
	Obliquity       151.152
	EqAscendNode    252.648

	AbsMagn         6.46162
	SlopeParam      4.90206
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.747 0.746)

	Surface
	{
		SurfStyle       0.372547
		OceanStyle      0.846954
		Randomize      (-0.163, 0.976, 0.729)
		colorDistMagn   0.673288
		colorDistFreq   0.0110835
		detailScale     161.892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367761
		terraceProb     0.286992
		erosion         0
		montesMagn      0.606396
		montesFreq      2.69522
		montesSpiky     0.977324
		montesFraction  0.731125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0821317
		hillsFraction   0.70832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273119
		craterFreq      0.198051
		craterDensity   0.897843
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.608577
		volcanoTemp     1571.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.299, 0.298, 0.000)
		colorShelf     (0.319, 0.318, 0.317, 0.000)
		colorBeach     (0.338, 0.336, 0.336, 0.000)
		colorDesert    (0.356, 0.355, 0.354, 0.000)
		colorLowland   (0.375, 0.374, 0.373, 0.000)
		colorUpland    (0.394, 0.392, 0.392, 0.000)
		colorRock      (0.413, 0.411, 0.410, 0.000)
		colorSnow      (0.431, 0.430, 0.429, 1.000)
		BumpHeight      5.33581
		BumpOffset      1.06716
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.602781
		GasToDust   0.25
		Particles   2197
		GasBright   0.0779958
		DustBright  0.512465
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   321.061
		Period          1602.81
		Eccentricity    0.781169
		Inclination     104.849
		AscendingNode   70.9792
		ArgOfPericenter 174.025
		MeanAnomaly     88.4221
	}
}

Comet	"C10"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.77053e-007
	Radius          106.825
	InertiaMoment   0.396218

	Oblateness      0.0544479

	RotationPeriod  21.0235
	Obliquity       104.358
	EqAscendNode    237.225

	AbsMagn         -0.963203
	SlopeParam      5.58588
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.469 0.372 0.334)

	Surface
	{
		SurfStyle       0.960702
		OceanStyle      0.122418
		Randomize      (0.928, -0.618, 0.199)
		colorDistMagn   0.516625
		colorDistFreq   7.89005
		detailScale     2917.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520825
		terraceProb     0.363548
		erosion         0
		montesMagn      0.376075
		montesFreq      3.14676
		montesSpiky     0.994417
		montesFraction  0.425768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.2017
		hillsFraction   0.60711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228917
		craterFreq      0.26619
		craterDensity   0.923953
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537941
		volcanoTemp     1730.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.130, 0.133, 0.050)
		colorShelf     (0.188, 0.152, 0.153, 0.040)
		colorBeach     (0.216, 0.175, 0.174, 0.030)
		colorDesert    (0.244, 0.197, 0.197, 0.020)
		colorLowland   (0.272, 0.219, 0.217, 0.030)
		colorUpland    (0.300, 0.242, 0.237, 0.050)
		colorRock      (0.328, 0.264, 0.264, 0.020)
		colorSnow      (0.328, 0.264, 0.264, 1.000)
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
		GasBright   0.052553
		DustBright  0.222394
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   566.645
		Period          3758.09
		Eccentricity    0.797251
		Inclination     -24.5633
		AscendingNode   96.3133
		ArgOfPericenter 36.8287
		MeanAnomaly     109.687
	}
}

Comet	"C11"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.46888e-014
	Radius          0.367086
	InertiaMoment   0.399071

	Oblateness      0.0930134

	RotationPeriod  18.5642
	Obliquity       57.5633
	EqAscendNode    221.803

	AbsMagn         9.72889
	SlopeParam      6.54239
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.597 0.592 0.590)

	Surface
	{
		SurfStyle       0.96497
		OceanStyle      0.382891
		Randomize      (-0.560, -0.700, -0.309)
		colorDistMagn   0.233808
		colorDistFreq   6.33091e-005
		detailScale     10.0239
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976692
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584354
		terraceProb     0.136451
		erosion         0
		montesMagn      0.486632
		montesFreq      2.80186
		montesSpiky     0.966465
		montesFraction  0.668347
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000297524
		hillsFraction   0.449715
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250068
		craterFreq      0.245191
		craterDensity   0.816276
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54038
		volcanoTemp     1565.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.207, 0.236, 0.050)
		colorShelf     (0.239, 0.243, 0.271, 0.040)
		colorBeach     (0.275, 0.278, 0.307, 0.030)
		colorDesert    (0.310, 0.314, 0.348, 0.020)
		colorLowland   (0.346, 0.350, 0.383, 0.030)
		colorUpland    (0.382, 0.385, 0.419, 0.050)
		colorRock      (0.418, 0.421, 0.466, 0.020)
		colorSnow      (0.418, 0.421, 0.466, 1.000)
		BumpHeight      0.330377
		BumpOffset      0.0660754
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.154415
		GasToDust   0.25
		Particles   1291
		GasBright   0.189998
		DustBright  0.569436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   390.994
		Period          2154.05
		Eccentricity    0.785906
		Inclination     -22.9898
		AscendingNode   -147.861
		ArgOfPericenter 29.7244
		MeanAnomaly     141.067
	}
}

Comet	"C12"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.13607e-010
	Radius          6.61667
	InertiaMoment   0.397577

	Oblateness      0.0947634

	RotationPeriod  15.9592
	Obliquity       10.769
	EqAscendNode    206.38

	AbsMagn         6.23439
	SlopeParam      2.08297
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.603 0.601 0.598)

	Surface
	{
		SurfStyle       0.918503
		OceanStyle      0.958643
		Randomize      (-0.873, 0.723, 0.295)
		colorDistMagn   0.751461
		colorDistFreq   0.0155895
		detailScale     180.679
		colorConversion true
		snowLevel       2
		tropicLatitude  0.472766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671542
		terraceProb     0.202382
		erosion         0
		montesMagn      0.555632
		montesFreq      2.77681
		montesSpiky     0.956499
		montesFraction  0.845714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.116949
		hillsFraction   0.664887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220257
		craterFreq      0.242671
		craterDensity   0.789855
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486431
		volcanoTemp     1606.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.210, 0.239, 0.050)
		colorShelf     (0.241, 0.246, 0.275, 0.040)
		colorBeach     (0.278, 0.282, 0.311, 0.030)
		colorDesert    (0.314, 0.318, 0.353, 0.020)
		colorLowland   (0.350, 0.354, 0.389, 0.030)
		colorUpland    (0.386, 0.390, 0.424, 0.050)
		colorRock      (0.422, 0.426, 0.472, 0.020)
		colorSnow      (0.422, 0.426, 0.472, 1.000)
		BumpHeight      5.955
		BumpOffset      1.191
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.635607
		GasToDust   0.25
		Particles   2263
		GasBright   0.137273
		DustBright  0.306648
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   429.943
		Period          2483.81
		Eccentricity    0.964346
		Inclination     26.2519
		AscendingNode   -90.0866
		ArgOfPericenter 133.767
		MeanAnomaly     66.133
	}
}

Comet	"C13"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.49806e-018
	Radius          0.0227292
	InertiaMoment   0.399517

	Oblateness      0.184402

	RotationPeriod  13.1745
	Obliquity       323.975
	EqAscendNode    190.957

	AbsMagn         16.5929
	SlopeParam      2.84013
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.560 0.464)

	Surface
	{
		SurfStyle       0.0567681
		OceanStyle      0.181378
		Randomize      (-0.935, -0.659, 0.850)
		colorDistMagn   0.67279
		colorDistFreq   3.91436e-007
		detailScale     0.620658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.193172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576452
		terraceProb     0.112881
		erosion         0
		montesMagn      0.498371
		montesFreq      3.72301
		montesSpiky     0.848416
		montesFraction  0.463182
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.411e-006
		hillsFraction   0.622197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223177
		craterFreq      0.189525
		craterDensity   0.72254
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488086
		volcanoTemp     1568.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.224, 0.186, 0.000)
		colorShelf     (0.262, 0.238, 0.197, 0.000)
		colorBeach     (0.277, 0.252, 0.209, 0.000)
		colorDesert    (0.293, 0.266, 0.221, 0.000)
		colorLowland   (0.308, 0.280, 0.232, 0.000)
		colorUpland    (0.324, 0.294, 0.244, 0.000)
		colorRock      (0.339, 0.308, 0.255, 0.000)
		colorSnow      (0.355, 0.322, 0.267, 1.000)
		BumpHeight      0.0204562
		BumpOffset      0.00409125
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.341908
		DustBright  0.586499
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   331.809
		Period          1683.96
		Eccentricity    0.747377
		Inclination     -39.7501
		AscendingNode   162.85
		ArgOfPericenter 107.121
		MeanAnomaly     -123.244
	}
}

Comet	"C14"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.70549e-014
	Radius          0.409829
	InertiaMoment   0.39829

	Oblateness      0.233745

	RotationPeriod  10.164
	Obliquity       277.18
	EqAscendNode    175.535

	AbsMagn         9.5025
	SlopeParam      3.45727
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.544 0.468 0.364)

	Surface
	{
		SurfStyle       0.88249
		OceanStyle      0.0785882
		Randomize      (-0.684, -0.872, -0.886)
		colorDistMagn   0.867697
		colorDistFreq   0.000126645
		detailScale     11.1911
		colorConversion true
		snowLevel       2
		tropicLatitude  0.776434
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559843
		terraceProb     0.31936
		erosion         0
		montesMagn      0.564101
		montesFreq      2.97929
		montesSpiky     0.860055
		montesFraction  0.667496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00041677
		hillsFraction   0.763644
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239409
		craterFreq      0.190586
		craterDensity   0.95514
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455152
		volcanoTemp     1560.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.164, 0.146, 0.050)
		colorShelf     (0.218, 0.192, 0.168, 0.040)
		colorBeach     (0.250, 0.220, 0.190, 0.030)
		colorDesert    (0.283, 0.248, 0.215, 0.020)
		colorLowland   (0.316, 0.276, 0.237, 0.030)
		colorUpland    (0.348, 0.304, 0.259, 0.050)
		colorRock      (0.381, 0.333, 0.288, 0.020)
		colorSnow      (0.381, 0.333, 0.288, 1.000)
		BumpHeight      0.368846
		BumpOffset      0.0737693
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.18724
		GasToDust   0.25
		Particles   1358
		GasBright   0.261901
		DustBright  0.350992
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   408.959
		Period          2304.2
		Eccentricity    0.922639
		Inclination     140.152
		AscendingNode   147.178
		ArgOfPericenter 140.222
		MeanAnomaly     -146.08
	}
}

Comet	"C15"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.0925e-010
	Radius          8.87983
	InertiaMoment   0.39994

	Oblateness      0.249

	RotationPeriod  6.86269
	Obliquity       230.386
	EqAscendNode    160.112

	AbsMagn         6.00131
	SlopeParam      4.02573
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.618 0.614 0.611)

	Surface
	{
		SurfStyle       0.621934
		OceanStyle      0.317191
		Randomize      (-0.394, -0.541, 0.992)
		colorDistMagn   0.939328
		colorDistFreq   0.0112999
		detailScale     242.479
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667513
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495439
		terraceProb     0.370087
		erosion         0
		montesMagn      0.552718
		montesFreq      3.29536
		montesSpiky     0.900793
		montesFraction  0.637208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.166073
		hillsFraction   0.646346
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261491
		craterFreq      0.193477
		craterDensity   0.987495
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.397862
		volcanoTemp     1302.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.209, 0.171, 0.000)
		colorShelf     (0.247, 0.215, 0.196, 0.000)
		colorBeach     (0.291, 0.252, 0.232, 0.000)
		colorDesert    (0.315, 0.270, 0.226, 0.000)
		colorLowland   (0.346, 0.288, 0.257, 0.000)
		colorUpland    (0.383, 0.350, 0.312, 0.000)
		colorRock      (0.414, 0.381, 0.336, 0.000)
		colorSnow      (0.451, 0.405, 0.355, 1.000)
		BumpHeight      7.99185
		BumpOffset      1.59837
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.668432
		GasToDust   0.25
		Particles   2330
		GasBright   0.144635
		DustBright  0.152745
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   469.863
		Period          2837.64
		Eccentricity    0.892244
		Inclination     -169.514
		AscendingNode   147.039
		ArgOfPericenter -1.83972
		MeanAnomaly     -17.5243
	}
}

Comet	"C16"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.44297e-018
	Radius          0.0253843
	InertiaMoment   0.398833

	Oblateness      0.249

	RotationPeriod  3.17344
	Obliquity       183.592
	EqAscendNode    144.69

	AbsMagn         15.1635
	SlopeParam      4.59632
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.531 0.525)

	Surface
	{
		SurfStyle       0.298787
		OceanStyle      0.980978
		Randomize      (-0.814, 0.934, 0.475)
		colorDistMagn   0.0175564
		colorDistFreq   7.57966e-008
		detailScale     0.693162
		colorConversion true
		snowLevel       2
		tropicLatitude  0.349416
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378967
		terraceProb     0.112158
		erosion         0
		montesMagn      0.481413
		montesFreq      2.78244
		montesSpiky     0.916653
		montesFraction  0.381922
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.431e-006
		hillsFraction   0.524118
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257845
		craterFreq      0.204434
		craterDensity   0.895545
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506981
		volcanoTemp     1712.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.212, 0.210, 0.000)
		colorShelf     (0.229, 0.225, 0.223, 0.000)
		colorBeach     (0.242, 0.239, 0.236, 0.000)
		colorDesert    (0.256, 0.252, 0.249, 0.000)
		colorLowland   (0.269, 0.265, 0.263, 0.000)
		colorUpland    (0.282, 0.279, 0.276, 0.000)
		colorRock      (0.296, 0.292, 0.289, 0.000)
		colorSnow      (0.309, 0.305, 0.302, 1.000)
		BumpHeight      0.0228459
		BumpOffset      0.00456918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0355044
		DustBright  0.746363
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   435.921
		Period          2535.78
		Eccentricity    0.816208
		Inclination     -160.234
		AscendingNode   -83.8596
		ArgOfPericenter 120.916
		MeanAnomaly     157.977
	}
}

Comet	"C17"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.98318e-014
	Radius          0.549836
	InertiaMoment   0.397072

	Oblateness      0.002015

	RotationPeriod  125.061
	Obliquity       136.798
	EqAscendNode    129.267

	AbsMagn         9.28082
	SlopeParam      5.22131
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.496 0.494)

	Surface
	{
		SurfStyle       0.901571
		OceanStyle      0.494666
		Randomize      (0.265, 0.327, 0.143)
		colorDistMagn   0.939227
		colorDistFreq   0.000171704
		detailScale     15.0142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.485415
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427896
		terraceProb     0.356463
		erosion         0
		montesMagn      0.509111
		montesFreq      3.32536
		montesSpiky     0.874642
		montesFraction  0.516396
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000385365
		hillsFraction   0.645164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249192
		craterFreq      0.228312
		craterDensity   0.892007
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586556
		volcanoTemp     1529.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.174, 0.197, 0.050)
		colorShelf     (0.200, 0.203, 0.227, 0.040)
		colorBeach     (0.231, 0.233, 0.257, 0.030)
		colorDesert    (0.261, 0.263, 0.291, 0.020)
		colorLowland   (0.291, 0.293, 0.321, 0.030)
		colorUpland    (0.321, 0.322, 0.350, 0.050)
		colorRock      (0.351, 0.352, 0.390, 0.020)
		colorSnow      (0.351, 0.352, 0.390, 1.000)
		BumpHeight      0.494852
		BumpOffset      0.0989704
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.220066
		GasToDust   0.25
		Particles   1424
		GasBright   0.048713
		DustBright  0.417641
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   443.895
		Period          2605.68
		Eccentricity    0.834016
		Inclination     158.014
		AscendingNode   -140.71
		ArgOfPericenter -37.9231
		MeanAnomaly     -46.3028
	}
}

Comet	"C18"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.85413e-010
	Radius          9.92034
	InertiaMoment   0.399301

	Oblateness      0.00190084

	RotationPeriod  112.676
	Obliquity       90.0032
	EqAscendNode    113.844

	AbsMagn         5.76122
	SlopeParam      6.00014
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.802 0.799 0.797)

	Surface
	{
		SurfStyle       0.404651
		OceanStyle      0.159534
		Randomize      (0.752, 0.220, -0.019)
		colorDistMagn   0.0337557
		colorDistFreq   0.00676734
		detailScale     270.892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319974
		terraceProb     0.591129
		erosion         0
		montesMagn      0.358267
		montesFreq      3.48097
		montesSpiky     0.869913
		montesFraction  0.861317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.303621
		hillsFraction   0.626363
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221996
		craterFreq      0.157877
		craterDensity   0.9239
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501
		volcanoTemp     1353.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.320, 0.319, 0.000)
		colorShelf     (0.341, 0.340, 0.339, 0.000)
		colorBeach     (0.361, 0.360, 0.358, 0.000)
		colorDesert    (0.381, 0.380, 0.378, 0.000)
		colorLowland   (0.401, 0.400, 0.398, 0.000)
		colorUpland    (0.421, 0.420, 0.418, 0.000)
		colorRock      (0.441, 0.440, 0.438, 0.000)
		colorSnow      (0.461, 0.460, 0.458, 1.000)
		BumpHeight      8.92831
		BumpOffset      1.78566
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.701258
		GasToDust   0.25
		Particles   2396
		GasBright   0.155463
		DustBright  0.795377
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   544.843
		Period          3543.3
		Eccentricity    0.857654
		Inclination     -23.1749
		AscendingNode   -113.062
		ArgOfPericenter 96.6474
		MeanAnomaly     45.9798
	}
}

Comet	"C19"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.18672e-017
	Radius          0.034046
	InertiaMoment   0.39797

	Oblateness      0.00285207

	RotationPeriod  105.134
	Obliquity       43.2089
	EqAscendNode    98.4218

	AbsMagn         14.3057
	SlopeParam      7.3583
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.729 0.726)

	Surface
	{
		SurfStyle       0.674787
		OceanStyle      0.20503
		Randomize      (-0.576, 0.700, -0.424)
		colorDistMagn   0.608644
		colorDistFreq   2.9981e-007
		detailScale     0.929684
		colorConversion true
		snowLevel       2
		tropicLatitude  0.650566
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712098
		terraceProb     0.587817
		erosion         0
		montesMagn      0.285962
		montesFreq      2.74307
		montesSpiky     0.953373
		montesFraction  0.558874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.22006e-006
		hillsFraction   0.685398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232465
		craterFreq      0.153349
		craterDensity   1.07784
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493017
		volcanoTemp     1383.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.248, 0.203, 0.000)
		colorShelf     (0.292, 0.255, 0.232, 0.000)
		colorBeach     (0.343, 0.299, 0.276, 0.000)
		colorDesert    (0.373, 0.321, 0.269, 0.000)
		colorLowland   (0.409, 0.343, 0.305, 0.000)
		colorUpland    (0.453, 0.416, 0.370, 0.000)
		colorRock      (0.490, 0.452, 0.399, 0.000)
		colorSnow      (0.533, 0.481, 0.421, 1.000)
		BumpHeight      0.0306414
		BumpOffset      0.00612829
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.141389
		DustBright  0.493937
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   372.255
		Period          2001.07
		Eccentricity    0.783433
		Inclination     7.58583
		AscendingNode   -114.142
		ArgOfPericenter -41.4046
		MeanAnomaly     -73.9769
	}
}

Comet	"C20"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            9.1784e-014
	Radius          0.614449
	InertiaMoment   0.399733

	Oblateness      0.00243641

	RotationPeriod  99.4949
	Obliquity       356.415
	EqAscendNode    82.9992

	AbsMagn         9.06301
	SlopeParam      2.48363
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.555 0.551 0.549)

	Surface
	{
		SurfStyle       0.045277
		OceanStyle      0.954932
		Randomize      (0.905, 0.203, -0.848)
		colorDistMagn   0.327217
		colorDistFreq   0.000203654
		detailScale     16.7786
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682459
		terraceProb     0.227616
		erosion         0
		montesMagn      0.326514
		montesFreq      1.28387
		montesSpiky     0.939404
		montesFraction  0.646274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000797469
		hillsFraction   0.55143
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202037
		craterFreq      0.267414
		craterDensity   0.893329
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566646
		volcanoTemp     1777.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.220, 0.000)
		colorShelf     (0.236, 0.234, 0.233, 0.000)
		colorBeach     (0.250, 0.248, 0.247, 0.000)
		colorDesert    (0.264, 0.262, 0.261, 0.000)
		colorLowland   (0.278, 0.275, 0.275, 0.000)
		colorUpland    (0.292, 0.289, 0.288, 0.000)
		colorRock      (0.305, 0.303, 0.302, 0.000)
		colorSnow      (0.319, 0.317, 0.316, 1.000)
		BumpHeight      0.553004
		BumpOffset      0.110601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.252892
		GasToDust   0.25
		Particles   1490
		GasBright   0.0900565
		DustBright  0.229757
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   405.972
		Period          2279
		Eccentricity    0.797767
		Inclination     -96.5058
		AscendingNode   79.0755
		ArgOfPericenter 78.7426
		MeanAnomaly     -63.7573
	}
}

Comet	"C21"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.09882e-010
	Radius          13.3017
	InertiaMoment   0.398578

	Oblateness      0.00349803

	RotationPeriod  94.8952
	Obliquity       309.62
	EqAscendNode    67.5766

	AbsMagn         5.51279
	SlopeParam      3.15455
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.744 0.742 0.741)

	Surface
	{
		SurfStyle       0.498407
		OceanStyle      0.470651
		Randomize      (0.122, -0.081, 0.967)
		colorDistMagn   0.382973
		colorDistFreq   0.140649
		detailScale     363.224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.185833
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566356
		terraceProb     0.102138
		erosion         0
		montesMagn      0.476491
		montesFreq      1.91022
		montesSpiky     0.945204
		montesFraction  0.684443
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.4919
		hillsFraction   0.603725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24705
		craterFreq      0.240679
		craterDensity   0.865047
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483514
		volcanoTemp     1391.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.297, 0.296, 0.000)
		colorShelf     (0.316, 0.315, 0.315, 0.000)
		colorBeach     (0.335, 0.334, 0.333, 0.000)
		colorDesert    (0.353, 0.353, 0.352, 0.000)
		colorLowland   (0.372, 0.371, 0.370, 0.000)
		colorUpland    (0.390, 0.390, 0.389, 0.000)
		colorRock      (0.409, 0.408, 0.407, 0.000)
		colorSnow      (0.428, 0.427, 0.426, 1.000)
		BumpHeight      11.9715
		BumpOffset      2.3943
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.734084
		GasToDust   0.25
		Particles   2462
		GasBright   0.273974
		DustBright  0.530326
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   375.198
		Period          2024.84
		Eccentricity    0.773975
		Inclination     -119.015
		AscendingNode   -1.81194
		ArgOfPericenter 143.635
		MeanAnomaly     -80.6744
	}
}

Comet	"C22"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.18579e-017
	Radius          0.0380578
	InertiaMoment   0.396249

	Oblateness      0.00287115

	RotationPeriod  90.955
	Obliquity       262.826
	EqAscendNode    52.154

	AbsMagn         13.6671
	SlopeParam      3.74021
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.744 0.743 0.740)

	Surface
	{
		SurfStyle       0.859282
		OceanStyle      0.847887
		Randomize      (0.201, 0.757, -0.508)
		colorDistMagn   0.729813
		colorDistFreq   1.72181e-007
		detailScale     1.03923
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674662
		terraceProb     0.33644
		erosion         0
		montesMagn      0.460777
		montesFreq      3.20746
		montesSpiky     0.992909
		montesFraction  0.632527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.98331e-006
		hillsFraction   0.515873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237804
		craterFreq      0.229503
		craterDensity   1.02469
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551654
		volcanoTemp     1767.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.260, 0.296, 0.050)
		colorShelf     (0.298, 0.304, 0.341, 0.040)
		colorBeach     (0.342, 0.349, 0.385, 0.030)
		colorDesert    (0.387, 0.394, 0.437, 0.020)
		colorLowland   (0.432, 0.438, 0.481, 0.030)
		colorUpland    (0.476, 0.483, 0.526, 0.050)
		colorRock      (0.521, 0.527, 0.585, 0.020)
		colorSnow      (0.521, 0.527, 0.585, 1.000)
		BumpHeight      0.034252
		BumpOffset      0.0068504
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.195359
		DustBright  0.293428
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   380.105
		Period          2064.69
		Eccentricity    0.899655
		Inclination     -113.802
		AscendingNode   -78.8106
		ArgOfPericenter 126.012
		MeanAnomaly     178.106
	}
}

Comet	"C23"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.69054e-013
	Radius          0.823664
	InertiaMoment   0.399076

	Oblateness      0.00411228

	RotationPeriod  87.4715
	Obliquity       216.032
	EqAscendNode    36.7314

	AbsMagn         8.84831
	SlopeParam      4.30397
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.500 0.497 0.493)

	Surface
	{
		SurfStyle       0.503536
		OceanStyle      0.00789818
		Randomize      (-0.613, 0.510, -0.108)
		colorDistMagn   0.912436
		colorDistFreq   0.000597683
		detailScale     22.4915
		colorConversion true
		snowLevel       2
		tropicLatitude  0.594647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438894
		terraceProb     0.105429
		erosion         0
		montesMagn      0.460782
		montesFreq      3.79639
		montesSpiky     0.978179
		montesFraction  0.490309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00182631
		hillsFraction   0.629731
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24096
		craterFreq      0.212152
		craterDensity   0.886512
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482902
		volcanoTemp     1143.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.169, 0.138, 0.000)
		colorShelf     (0.200, 0.174, 0.158, 0.000)
		colorBeach     (0.235, 0.204, 0.187, 0.000)
		colorDesert    (0.255, 0.219, 0.183, 0.000)
		colorLowland   (0.280, 0.234, 0.207, 0.000)
		colorUpland    (0.310, 0.283, 0.252, 0.000)
		colorRock      (0.335, 0.308, 0.271, 0.000)
		colorSnow      (0.365, 0.328, 0.286, 1.000)
		BumpHeight      0.741297
		BumpOffset      0.148259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.285718
		GasToDust   0.25
		Particles   1557
		GasBright   0.446466
		DustBright  0.526807
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   405.542
		Period          2275.38
		Eccentricity    0.771206
		Inclination     -177.891
		AscendingNode   78.9269
		ArgOfPericenter -52.49
		MeanAnomaly     94.3876
	}
}

Comet	"C24"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.30751e-009
	Radius          14.873
	InertiaMoment   0.397588

	Oblateness      0.00334983

	RotationPeriod  84.323
	Obliquity       169.237
	EqAscendNode    21.3088

	AbsMagn         5.25436
	SlopeParam      4.89353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.747 0.707 0.635)

	Surface
	{
		SurfStyle       0.277796
		OceanStyle      0.415141
		Randomize      (-0.941, 0.892, -0.686)
		colorDistMagn   0.466438
		colorDistFreq   0.0954436
		detailScale     406.131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.772393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460517
		terraceProb     0.214694
		erosion         0
		montesMagn      0.613849
		montesFreq      2.27592
		montesSpiky     0.940334
		montesFraction  0.850671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.589182
		hillsFraction   0.577809
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235306
		craterFreq      0.22142
		craterDensity   0.980134
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548945
		volcanoTemp     1309.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.283, 0.254, 0.000)
		colorShelf     (0.317, 0.301, 0.270, 0.000)
		colorBeach     (0.336, 0.318, 0.286, 0.000)
		colorDesert    (0.355, 0.336, 0.301, 0.000)
		colorLowland   (0.373, 0.354, 0.317, 0.000)
		colorUpland    (0.392, 0.371, 0.333, 0.000)
		colorRock      (0.411, 0.389, 0.349, 0.000)
		colorSnow      (0.429, 0.407, 0.365, 1.000)
		BumpHeight      13.3857
		BumpOffset      2.67714
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.76691
		GasToDust   0.25
		Particles   2529
		GasBright   0.0116896
		DustBright  0.64607
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   457.823
		Period          2729.27
		Eccentricity    0.885782
		Inclination     121.949
		AscendingNode   -136.684
		ArgOfPericenter 64.2035
		MeanAnomaly     -75.1692
	}
}

Comet	"C25"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.02593e-017
	Radius          0.0510035
	InertiaMoment   0.399522

	Oblateness      0.0047389

	RotationPeriod  81.4304
	Obliquity       122.443
	EqAscendNode    5.88624

	AbsMagn         13.1472
	SlopeParam      5.57533
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.442 0.438 0.435)

	Surface
	{
		SurfStyle       0.0684108
		OceanStyle      0.649034
		Randomize      (-0.816, -0.409, -0.988)
		colorDistMagn   0.856239
		colorDistFreq   1.68946e-006
		detailScale     1.39273
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385994
		terraceProb     0.635273
		erosion         0
		montesMagn      0.34422
		montesFreq      2.74042
		montesSpiky     0.890953
		montesFraction  0.697699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.6546e-006
		hillsFraction   0.584462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215992
		craterFreq      0.206086
		craterDensity   0.728912
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568343
		volcanoTemp     1701.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.175, 0.174, 0.000)
		colorShelf     (0.188, 0.186, 0.185, 0.000)
		colorBeach     (0.199, 0.197, 0.196, 0.000)
		colorDesert    (0.210, 0.208, 0.207, 0.000)
		colorLowland   (0.221, 0.219, 0.217, 0.000)
		colorUpland    (0.232, 0.230, 0.228, 0.000)
		colorRock      (0.243, 0.241, 0.239, 0.000)
		colorSnow      (0.254, 0.252, 0.250, 1.000)
		BumpHeight      0.0459031
		BumpOffset      0.00918062
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0262903
		DustBright  0.315956
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   362.02
		Period          1919.11
		Eccentricity    0.788003
		Inclination     -115.457
		AscendingNode   80.4413
		ArgOfPericenter 55.6374
		MeanAnomaly     -137.957
	}
}

Comet	"C26"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.11377e-013
	Radius          0.921194
	InertiaMoment   0.398298

	Oblateness      0.00384336

	RotationPeriod  78.739
	Obliquity       75.6488
	EqAscendNode    350.464

	AbsMagn         8.63603
	SlopeParam      6.52517
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.743 0.699 0.679)

	Surface
	{
		SurfStyle       0.0721619
		OceanStyle      0.440691
		Randomize      (0.214, -0.724, 0.398)
		colorDistMagn   0.795637
		colorDistFreq   0.000421308
		detailScale     25.1547
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950672
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517296
		terraceProb     0.423013
		erosion         0
		montesMagn      0.529453
		montesFreq      3.2103
		montesSpiky     0.740708
		montesFraction  0.721596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00208848
		hillsFraction   0.631728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232176
		craterFreq      0.234365
		craterDensity   0.950752
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560812
		volcanoTemp     1614.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.280, 0.272, 0.000)
		colorShelf     (0.316, 0.297, 0.289, 0.000)
		colorBeach     (0.334, 0.315, 0.305, 0.000)
		colorDesert    (0.353, 0.332, 0.322, 0.000)
		colorLowland   (0.372, 0.350, 0.339, 0.000)
		colorUpland    (0.390, 0.367, 0.356, 0.000)
		colorRock      (0.409, 0.385, 0.373, 0.000)
		colorSnow      (0.427, 0.402, 0.390, 1.000)
		BumpHeight      0.829075
		BumpOffset      0.165815
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.318544
		GasToDust   0.25
		Particles   1623
		GasBright   0.112322
		DustBright  0.714411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   459.662
		Period          2745.74
		Eccentricity    0.778467
		Inclination     -42.8223
		AscendingNode   -138.342
		ArgOfPericenter -52.0485
		MeanAnomaly     -101.016
	}
}

Comet	"C27"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.40828e-009
	Radius          19.9276
	InertiaMoment   0.399946

	Oblateness      0.00540315

	RotationPeriod  76.2094
	Obliquity       28.8545
	EqAscendNode    335.041

	AbsMagn         4.98393
	SlopeParam      2.07072
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.481 0.476 0.473)

	Surface
	{
		SurfStyle       0.613762
		OceanStyle      0.411474
		Randomize      (-0.953, 0.840, -0.527)
		colorDistMagn   0.649503
		colorDistFreq   0.225109
		detailScale     544.155
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984422
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358862
		terraceProb     0.243359
		erosion         0
		montesMagn      0.565908
		montesFreq      3.34676
		montesSpiky     0.964341
		montesFraction  0.261248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.09893
		hillsFraction   0.460972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242718
		craterFreq      0.241875
		craterDensity   0.60668
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433675
		volcanoTemp     1351.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.162, 0.133, 0.000)
		colorShelf     (0.192, 0.167, 0.151, 0.000)
		colorBeach     (0.226, 0.195, 0.180, 0.000)
		colorDesert    (0.245, 0.209, 0.175, 0.000)
		colorLowland   (0.269, 0.224, 0.199, 0.000)
		colorUpland    (0.298, 0.271, 0.241, 0.000)
		colorRock      (0.322, 0.295, 0.260, 0.000)
		colorSnow      (0.351, 0.314, 0.275, 1.000)
		BumpHeight      17.9348
		BumpOffset      3.58696
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.799736
		GasToDust   0.25
		Particles   2595
		GasBright   0.0996405
		DustBright  0.411579
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   461.11
		Period          2758.72
		Eccentricity    0.901688
		Inclination     81.643
		AscendingNode   95.833
		ArgOfPericenter 91.7356
		MeanAnomaly     164.818
	}
}

Comet	"C28"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.41527e-017
	Radius          0.0570561
	InertiaMoment   0.39884

	Oblateness      0.00437254

	RotationPeriod  73.8119
	Obliquity       342.06
	EqAscendNode    319.618

	AbsMagn         12.7021
	SlopeParam      2.83098
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.591 0.526)

	Surface
	{
		SurfStyle       0.264305
		OceanStyle      0.20287
		Randomize      (0.138, -0.384, 0.735)
		colorDistMagn   0.0906255
		colorDistFreq   1.37429e-006
		detailScale     1.55801
		colorConversion true
		snowLevel       2
		tropicLatitude  0.425986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539823
		terraceProb     0.205698
		erosion         0
		montesMagn      0.654714
		montesFreq      3.20891
		montesSpiky     0.905991
		montesFraction  0.112215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.4062e-006
		hillsFraction   0.603168
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217295
		craterFreq      0.231448
		craterDensity   0.869756
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509622
		volcanoTemp     1720.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.237, 0.211, 0.000)
		colorShelf     (0.288, 0.251, 0.224, 0.000)
		colorBeach     (0.305, 0.266, 0.237, 0.000)
		colorDesert    (0.322, 0.281, 0.250, 0.000)
		colorLowland   (0.339, 0.296, 0.263, 0.000)
		colorUpland    (0.356, 0.310, 0.276, 0.000)
		colorRock      (0.373, 0.325, 0.290, 0.000)
		colorSnow      (0.390, 0.340, 0.303, 1.000)
		BumpHeight      0.0513505
		BumpOffset      0.0102701
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.252862
		DustBright  0.742843
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   485.937
		Period          2984.49
		Eccentricity    0.804852
		Inclination     -170.943
		AscendingNode   135.844
		ArgOfPericenter -174.766
		MeanAnomaly     50.3357
	}
}

Comet	"C29"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.73518e-013
	Radius          1.234
	InertiaMoment   0.397087

	Oblateness      0.00605125

	RotationPeriod  71.5238
	Obliquity       295.266
	EqAscendNode    304.196

	AbsMagn         8.42553
	SlopeParam      3.44926
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.714 0.712)

	Surface
	{
		SurfStyle       0.201484
		OceanStyle      0.752108
		Randomize      (0.736, -0.693, 0.243)
		colorDistMagn   0.869978
		colorDistFreq   0.000820354
		detailScale     33.6963
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897597
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.623168
		terraceProb     0.127274
		erosion         0
		montesMagn      0.425752
		montesFreq      2.50236
		montesSpiky     0.970866
		montesFraction  0.608943
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00461439
		hillsFraction   0.474553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231531
		craterFreq      0.199976
		craterDensity   0.800028
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506492
		volcanoTemp     1466.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.285, 0.000)
		colorShelf     (0.304, 0.303, 0.302, 0.000)
		colorBeach     (0.322, 0.321, 0.320, 0.000)
		colorDesert    (0.340, 0.339, 0.338, 0.000)
		colorLowland   (0.357, 0.357, 0.356, 0.000)
		colorUpland    (0.375, 0.375, 0.374, 0.000)
		colorRock      (0.393, 0.393, 0.391, 0.000)
		colorSnow      (0.411, 0.410, 0.409, 1.000)
		BumpHeight      1.1106
		BumpOffset      0.222119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.35137
		GasToDust   0.25
		Particles   1689
		GasBright   0.212899
		DustBright  0.467293
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   220.693
		Period          913.447
		Eccentricity    0.824311
		Inclination     179.109
		AscendingNode   -177.546
		ArgOfPericenter -76.4699
		MeanAnomaly     -68.9284
	}
}

Comet	"C30"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.43574e-009
	Radius          22.2972
	InertiaMoment   0.399307

	Oblateness      0.00495391

	RotationPeriod  69.3271
	Obliquity       248.472
	EqAscendNode    288.773

	AbsMagn         4.69894
	SlopeParam      4.01801
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.754 0.665 0.620)

	Surface
	{
		SurfStyle       0.144559
		OceanStyle      0.556544
		Randomize      (-0.057, -0.042, 0.289)
		colorDistMagn   0.924412
		colorDistFreq   0.0778266
		detailScale     608.863
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.601847
		terraceProb     0.147353
		erosion         0
		montesMagn      0.541865
		montesFreq      2.63122
		montesSpiky     0.915918
		montesFraction  0.582777
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.830963
		hillsFraction   0.512673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233111
		craterFreq      0.21592
		craterDensity   0.977429
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525114
		volcanoTemp     1048.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.266, 0.248, 0.000)
		colorShelf     (0.321, 0.283, 0.264, 0.000)
		colorBeach     (0.340, 0.299, 0.279, 0.000)
		colorDesert    (0.358, 0.316, 0.295, 0.000)
		colorLowland   (0.377, 0.332, 0.310, 0.000)
		colorUpland    (0.396, 0.349, 0.326, 0.000)
		colorRock      (0.415, 0.366, 0.341, 0.000)
		colorSnow      (0.434, 0.382, 0.357, 1.000)
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
		MaxLength   0.832562
		GasToDust   0.25
		Particles   2661
		GasBright   0.135676
		DustBright  0.229003
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   391.501
		Period          2158.24
		Eccentricity    0.757905
		Inclination     169.335
		AscendingNode   -121.298
		ArgOfPericenter -115.674
		MeanAnomaly     26.2436
	}
}

Comet	"C31"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.3658e-016
	Radius          0.0764147
	InertiaMoment   0.397979

	Oblateness      0.0068568

	RotationPeriod  67.207
	Obliquity       201.677
	EqAscendNode    273.351

	AbsMagn         12.3087
	SlopeParam      4.58825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.562 0.561)

	Surface
	{
		SurfStyle       0.372267
		OceanStyle      0.857906
		Randomize      (0.593, -0.196, 0.535)
		colorDistMagn   0.893744
		colorDistFreq   4.15954e-006
		detailScale     2.08663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885903
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646872
		terraceProb     0.109177
		erosion         0
		montesMagn      0.422645
		montesFreq      2.91085
		montesSpiky     0.921083
		montesFraction  0.449895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3709e-005
		hillsFraction   0.636529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.188743
		craterFreq      0.240858
		craterDensity   0.889067
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571012
		volcanoTemp     1314.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.225, 0.224, 0.000)
		colorShelf     (0.240, 0.239, 0.238, 0.000)
		colorBeach     (0.254, 0.253, 0.252, 0.000)
		colorDesert    (0.268, 0.267, 0.266, 0.000)
		colorLowland   (0.283, 0.281, 0.280, 0.000)
		colorUpland    (0.297, 0.295, 0.294, 0.000)
		colorRock      (0.311, 0.309, 0.308, 0.000)
		colorSnow      (0.325, 0.323, 0.322, 1.000)
		BumpHeight      0.0687733
		BumpOffset      0.0137547
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.366066
		DustBright  0.4831
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   255.294
		Period          1136.48
		Eccentricity    0.749255
		Inclination     50.0665
		AscendingNode   -62.0777
		ArgOfPericenter -89.0445
		MeanAnomaly     21.6348
	}
}

Comet	"C32"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.05635e-012
	Radius          1.38101
	InertiaMoment   0.399738

	Oblateness      0.00560538

	RotationPeriod  65.1516
	Obliquity       154.883
	EqAscendNode    257.928

	AbsMagn         8.2162
	SlopeParam      5.21202
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.561 0.558 0.553)

	Surface
	{
		SurfStyle       0.486391
		OceanStyle      0.411145
		Randomize      (0.601, -0.003, 0.531)
		colorDistMagn   0.64471
		colorDistFreq   0.000238528
		detailScale     37.7108
		colorConversion true
		snowLevel       2
		tropicLatitude  0.779369
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62316
		terraceProb     0.195132
		erosion         0
		montesMagn      0.385548
		montesFreq      2.73504
		montesSpiky     0.936662
		montesFraction  0.70133
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00443283
		hillsFraction   0.565682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260596
		craterFreq      0.191259
		craterDensity   0.984386
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437019
		volcanoTemp     1560.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.221, 0.000)
		colorShelf     (0.239, 0.237, 0.235, 0.000)
		colorBeach     (0.253, 0.251, 0.249, 0.000)
		colorDesert    (0.267, 0.265, 0.263, 0.000)
		colorLowland   (0.281, 0.279, 0.277, 0.000)
		colorUpland    (0.295, 0.293, 0.290, 0.000)
		colorRock      (0.309, 0.307, 0.304, 0.000)
		colorSnow      (0.323, 0.321, 0.318, 1.000)
		BumpHeight      1.24291
		BumpOffset      0.248582
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.384196
		GasToDust   0.25
		Particles   1755
		GasBright   0.261561
		DustBright  0.272091
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   446.497
		Period          2628.62
		Eccentricity    0.880346
		Inclination     150.659
		AscendingNode   38.5209
		ArgOfPericenter -96.7529
		MeanAnomaly     -65.4523
	}
}

Comet	"C33"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            8.17009e-009
	Radius          29.857
	InertiaMoment   0.398585

	Oblateness      0.00776151

	RotationPeriod  63.1507
	Obliquity       108.089
	EqAscendNode    242.506

	AbsMagn         4.39612
	SlopeParam      5.98746
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.829 0.795 0.769)

	Surface
	{
		SurfStyle       0.0455602
		OceanStyle      0.364016
		Randomize      (-0.157, -0.225, -0.772)
		colorDistMagn   0.457051
		colorDistFreq   0.28147
		detailScale     815.295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.369641
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459286
		terraceProb     0.178571
		erosion         0
		montesMagn      0.596428
		montesFreq      3.34744
		montesSpiky     0.90334
		montesFraction  0.738464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23458
		hillsFraction   0.627601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231519
		craterFreq      0.267263
		craterDensity   0.969512
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531271
		volcanoTemp     1424.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.318, 0.308, 0.000)
		colorShelf     (0.352, 0.338, 0.327, 0.000)
		colorBeach     (0.373, 0.358, 0.346, 0.000)
		colorDesert    (0.394, 0.378, 0.365, 0.000)
		colorLowland   (0.415, 0.398, 0.385, 0.000)
		colorUpland    (0.435, 0.418, 0.404, 0.000)
		colorRock      (0.456, 0.437, 0.423, 0.000)
		colorSnow      (0.477, 0.457, 0.442, 1.000)
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
		MaxLength   0.865388
		GasToDust   0.25
		Particles   2728
		GasBright   0.0107279
		DustBright  0.207411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   512.521
		Period          3232.72
		Eccentricity    0.806326
		Inclination     -127.357
		AscendingNode   -11.3619
		ArgOfPericenter 96.8593
		MeanAnomaly     -91.0469
	}
}

Comet	"C34"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.51563e-016
	Radius          0.0855345
	InertiaMoment   0.396279

	Oblateness      0.00625711

	RotationPeriod  61.1956
	Obliquity       61.2945
	EqAscendNode    227.083

	AbsMagn         11.9531
	SlopeParam      7.32712
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.655 0.653)

	Surface
	{
		SurfStyle       0.868815
		OceanStyle      0.381992
		Randomize      (-0.266, -0.741, 0.085)
		colorDistMagn   0.583467
		colorDistFreq   1.83449e-006
		detailScale     2.33566
		colorConversion true
		snowLevel       2
		tropicLatitude  0.947165
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428655
		terraceProb     0.484384
		erosion         0
		montesMagn      0.623528
		montesFreq      2.82726
		montesSpiky     0.988132
		montesFraction  0.572504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.66367e-005
		hillsFraction   0.660491
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.291527
		craterFreq      0.192489
		craterDensity   0.913801
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506917
		volcanoTemp     1246.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.229, 0.261, 0.050)
		colorShelf     (0.263, 0.268, 0.300, 0.040)
		colorBeach     (0.302, 0.308, 0.340, 0.030)
		colorDesert    (0.342, 0.347, 0.385, 0.020)
		colorLowland   (0.381, 0.386, 0.424, 0.030)
		colorUpland    (0.421, 0.426, 0.464, 0.050)
		colorRock      (0.460, 0.465, 0.516, 0.020)
		colorSnow      (0.460, 0.465, 0.516, 1.000)
		BumpHeight      0.0769811
		BumpOffset      0.0153962
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0760412
		DustBright  0.626584
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   344.928
		Period          1784.82
		Eccentricity    0.88246
		Inclination     -124.594
		AscendingNode   93.8156
		ArgOfPericenter 161.722
		MeanAnomaly     -41.0406
	}
}

Comet	"C35"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.94566e-012
	Radius          1.84892
	InertiaMoment   0.399082

	Oblateness      0.00880023

	RotationPeriod  59.2786
	Obliquity       14.5002
	EqAscendNode    211.66

	AbsMagn         8.00746
	SlopeParam      2.47333
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.582 0.576 0.573)

	Surface
	{
		SurfStyle       0.138244
		OceanStyle      0.219709
		Randomize      (-0.070, -0.086, -0.598)
		colorDistMagn   0.60866
		colorDistFreq   0.00236317
		detailScale     50.4879
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0859778
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.296122
		terraceProb     0.388446
		erosion         0
		montesMagn      0.562484
		montesFreq      3.3323
		montesSpiky     0.965649
		montesFraction  0.877617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00814149
		hillsFraction   0.700027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256429
		craterFreq      0.203364
		craterDensity   0.926079
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499334
		volcanoTemp     1548.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.229, 0.000)
		colorShelf     (0.247, 0.245, 0.243, 0.000)
		colorBeach     (0.262, 0.259, 0.258, 0.000)
		colorDesert    (0.277, 0.274, 0.272, 0.000)
		colorLowland   (0.291, 0.288, 0.286, 0.000)
		colorUpland    (0.306, 0.303, 0.301, 0.000)
		colorRock      (0.320, 0.317, 0.315, 0.000)
		colorSnow      (0.335, 0.331, 0.329, 1.000)
		BumpHeight      1.66403
		BumpOffset      0.332806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.417022
		GasToDust   0.25
		Particles   1822
		GasBright   0.064752
		DustBright  0.32236
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   362.52
		Period          1923.08
		Eccentricity    0.835464
		Inclination     170.046
		AscendingNode   -9.20151
		ArgOfPericenter 140.205
		MeanAnomaly     48.7266
	}
}

Comet	"C36"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.50483e-008
	Radius          33.4259
	InertiaMoment   0.397598

	Oblateness      0.00713227

	RotationPeriod  57.3931
	Obliquity       327.706
	EqAscendNode    196.238

	AbsMagn         4.07109
	SlopeParam      3.1461
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.519 0.474 0.415)

	Surface
	{
		SurfStyle       0.877608
		OceanStyle      0.0769479
		Randomize      (0.471, -0.183, -0.187)
		colorDistMagn   0.750847
		colorDistFreq   0.57699
		detailScale     912.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0.607846
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385289
		terraceProb     0.204885
		erosion         0
		montesMagn      0.405283
		montesFreq      3.05611
		montesSpiky     0.975806
		montesFraction  0.357278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.20662
		hillsFraction   0.721659
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270323
		craterFreq      0.17928
		craterDensity   0.971839
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460686
		volcanoTemp     1661.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.166, 0.166, 0.050)
		colorShelf     (0.208, 0.194, 0.191, 0.040)
		colorBeach     (0.239, 0.223, 0.216, 0.030)
		colorDesert    (0.270, 0.251, 0.245, 0.020)
		colorLowland   (0.301, 0.279, 0.270, 0.030)
		colorUpland    (0.332, 0.308, 0.295, 0.050)
		colorRock      (0.364, 0.336, 0.328, 0.020)
		colorSnow      (0.364, 0.336, 0.328, 1.000)
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
		MaxLength   0.898214
		GasToDust   0.25
		Particles   2794
		GasBright   0.197256
		DustBright  0.674343
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   425.023
		Period          2441.29
		Eccentricity    0.88781
		Inclination     -112.991
		AscendingNode   -19.4059
		ArgOfPericenter -144.37
		MeanAnomaly     -93.0479
	}
}

Comet	"C37"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.63348e-016
	Radius          0.114497
	InertiaMoment   0.399528

	Oblateness      0.0100162

	RotationPeriod  55.5331
	Obliquity       280.912
	EqAscendNode    180.815

	AbsMagn         11.6263
	SlopeParam      3.73242
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.605 0.530 0.399)

	Surface
	{
		SurfStyle       0.149195
		OceanStyle      0.603175
		Randomize      (-0.651, 0.131, 0.862)
		colorDistMagn   0.509055
		colorDistFreq   1.0197e-005
		detailScale     3.12654
		colorConversion true
		snowLevel       2
		tropicLatitude  0.287347
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423683
		terraceProb     0.122621
		erosion         0
		montesMagn      0.45192
		montesFreq      3.05376
		montesSpiky     0.965823
		montesFraction  0.512128
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.8715e-005
		hillsFraction   0.685686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252713
		craterFreq      0.232311
		craterDensity   0.893721
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509532
		volcanoTemp     1669.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.212, 0.160, 0.000)
		colorShelf     (0.257, 0.225, 0.170, 0.000)
		colorBeach     (0.272, 0.239, 0.180, 0.000)
		colorDesert    (0.287, 0.252, 0.190, 0.000)
		colorLowland   (0.302, 0.265, 0.200, 0.000)
		colorUpland    (0.317, 0.279, 0.210, 0.000)
		colorRock      (0.333, 0.292, 0.220, 0.000)
		colorSnow      (0.348, 0.305, 0.230, 1.000)
		BumpHeight      0.103048
		BumpOffset      0.0206095
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.158684
		DustBright  0.3974
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   385.892
		Period          2112.02
		Eccentricity    0.809483
		Inclination     -106.857
		AscendingNode   -16.0862
		ArgOfPericenter -8.22691
		MeanAnomaly     -135.95
	}
}

Comet	"C38"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.58366e-012
	Radius          2.07025
	InertiaMoment   0.398305

	Oblateness      0.00815156

	RotationPeriod  53.693
	Obliquity       234.117
	EqAscendNode    165.393

	AbsMagn         7.79874
	SlopeParam      4.29617
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.531 0.424 0.344)

	Surface
	{
		SurfStyle       0.918347
		OceanStyle      0.485317
		Randomize      (0.450, -0.973, -0.354)
		colorDistMagn   0.342585
		colorDistFreq   0.00098408
		detailScale     56.5315
		colorConversion true
		snowLevel       2
		tropicLatitude  0.646662
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581013
		terraceProb     0.44349
		erosion         0
		montesMagn      0.579839
		montesFreq      3.12737
		montesSpiky     0.948764
		montesFraction  0.667608
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0123369
		hillsFraction   0.671171
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234979
		craterFreq      0.217863
		craterDensity   0.846364
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53832
		volcanoTemp     1457.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.148, 0.138, 0.050)
		colorShelf     (0.212, 0.174, 0.158, 0.040)
		colorBeach     (0.244, 0.199, 0.179, 0.030)
		colorDesert    (0.276, 0.224, 0.203, 0.020)
		colorLowland   (0.308, 0.250, 0.224, 0.030)
		colorUpland    (0.340, 0.275, 0.244, 0.050)
		colorRock      (0.372, 0.301, 0.272, 0.020)
		colorSnow      (0.372, 0.301, 0.272, 1.000)
		BumpHeight      1.86322
		BumpOffset      0.372644
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.449848
		GasToDust   0.25
		Particles   1888
		GasBright   0.0828541
		DustBright  0.157717
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   346.452
		Period          1796.65
		Eccentricity    0.863055
		Inclination     163.788
		AscendingNode   -27.8771
		ArgOfPericenter -146.044
		MeanAnomaly     130.152
	}
}

Comet	"C39"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.7717e-008
	Radius          44.738
	InertiaMoment   0.399951

	Oblateness      0.0114685

	RotationPeriod  51.8676
	Obliquity       187.323
	EqAscendNode    149.97

	AbsMagn         3.7178
	SlopeParam      4.88501
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.620 0.438 0.362)

	Surface
	{
		SurfStyle       0.118074
		OceanStyle      0.380874
		Randomize      (-0.704, -0.762, -0.948)
		colorDistMagn   0.0600971
		colorDistFreq   0.0532026
		detailScale     1221.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456461
		terraceProb     0.288068
		erosion         0
		montesMagn      0.512044
		montesFreq      2.30218
		montesSpiky     0.722126
		montesFraction  0.563857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.7066
		hillsFraction   0.537441
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264645
		craterFreq      0.193843
		craterDensity   0.809827
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480764
		volcanoTemp     1846.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.175, 0.145, 0.000)
		colorShelf     (0.264, 0.186, 0.154, 0.000)
		colorBeach     (0.279, 0.197, 0.163, 0.000)
		colorDesert    (0.295, 0.208, 0.172, 0.000)
		colorLowland   (0.310, 0.219, 0.181, 0.000)
		colorUpland    (0.326, 0.230, 0.190, 0.000)
		colorRock      (0.341, 0.241, 0.199, 0.000)
		colorSnow      (0.357, 0.252, 0.208, 1.000)
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
		MaxLength   0.93104
		GasToDust   0.25
		Particles   2860
		GasBright   0.292525
		DustBright  0.432533
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   316.674
		Period          1570.07
		Eccentricity    0.825841
		Inclination     105.537
		AscendingNode   56.823
		ArgOfPericenter -127.631
		MeanAnomaly     -17.9459
	}
}

Comet	"C40"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            8.53426e-016
	Radius          0.128221
	InertiaMoment   0.398846

	Oblateness      0.00937733

	RotationPeriod  50.0521
	Obliquity       140.529
	EqAscendNode    134.547

	AbsMagn         11.3221
	SlopeParam      5.56483
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.822 0.771 0.742)

	Surface
	{
		SurfStyle       0.000300589
		OceanStyle      0.573615
		Randomize      (-0.327, 0.843, 0.111)
		colorDistMagn   0.472829
		colorDistFreq   8.74132e-006
		detailScale     3.50128
		colorConversion true
		snowLevel       2
		tropicLatitude  0.489538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259481
		terraceProb     0.106166
		erosion         0
		montesMagn      0.530796
		montesFreq      2.85473
		montesSpiky     0.907935
		montesFraction  0.630546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.35299e-005
		hillsFraction   0.58264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256295
		craterFreq      0.211573
		craterDensity   0.999959
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483103
		volcanoTemp     1367.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.309, 0.297, 0.000)
		colorShelf     (0.349, 0.328, 0.315, 0.000)
		colorBeach     (0.370, 0.347, 0.334, 0.000)
		colorDesert    (0.390, 0.366, 0.352, 0.000)
		colorLowland   (0.411, 0.386, 0.371, 0.000)
		colorUpland    (0.431, 0.405, 0.389, 0.000)
		colorRock      (0.452, 0.424, 0.408, 0.000)
		colorSnow      (0.472, 0.444, 0.426, 1.000)
		BumpHeight      0.115399
		BumpOffset      0.0230797
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.189413
		DustBright  0.220132
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   428.837
		Period          2474.22
		Eccentricity    0.815907
		Inclination     35.2755
		AscendingNode   -48.8077
		ArgOfPericenter 78.2475
		MeanAnomaly     -142.77
	}
}

Comet	"C41"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.60064e-012
	Radius          2.77052
	InertiaMoment   0.397102

	Oblateness      0.0130805

	RotationPeriod  48.2419
	Obliquity       93.7344
	EqAscendNode    119.125

	AbsMagn         7.58947
	SlopeParam      6.50814
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.603 0.600 0.597)

	Surface
	{
		SurfStyle       0.410605
		OceanStyle      0.678491
		Randomize      (0.115, -0.316, 0.041)
		colorDistMagn   0.658632
		colorDistFreq   0.00445932
		detailScale     75.6536
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330601
		terraceProb     0.115032
		erosion         0
		montesMagn      0.641931
		montesFreq      2.87554
		montesSpiky     0.957203
		montesFraction  0.559628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0161703
		hillsFraction   0.685847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273525
		craterFreq      0.2663
		craterDensity   0.796725
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486333
		volcanoTemp     1574.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.240, 0.239, 0.000)
		colorShelf     (0.256, 0.255, 0.254, 0.000)
		colorBeach     (0.271, 0.270, 0.269, 0.000)
		colorDesert    (0.286, 0.285, 0.284, 0.000)
		colorLowland   (0.301, 0.300, 0.298, 0.000)
		colorUpland    (0.316, 0.315, 0.313, 0.000)
		colorRock      (0.331, 0.330, 0.328, 0.000)
		colorSnow      (0.347, 0.345, 0.343, 1.000)
		BumpHeight      2.49346
		BumpOffset      0.498693
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.482674
		GasToDust   0.25
		Particles   1954
		GasBright   0.0192585
		DustBright  0.874773
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   300.439
		Period          1450.89
		Eccentricity    0.81074
		Inclination     -48.8535
		AscendingNode   126.209
		ArgOfPericenter -86.4789
		MeanAnomaly     83.0453
	}
}

Comet	"C42"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.10514e-008
	Radius          50.1062
	InertiaMoment   0.399312

	Oblateness      0.0108894

	RotationPeriod  46.4322
	Obliquity       46.9401
	EqAscendNode    103.702

	AbsMagn         3.32748
	SlopeParam      2.0584
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.412 0.410)

	Surface
	{
		SurfStyle       0.202693
		OceanStyle      0.27582
		Randomize      (-0.824, -0.390, 0.411)
		colorDistMagn   0.179614
		colorDistFreq   1.44496
		detailScale     1368.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566502
		terraceProb     0.355614
		erosion         0
		montesMagn      0.521293
		montesFreq      2.73604
		montesSpiky     0.892197
		montesFraction  0.644382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.72578
		hillsFraction   0.587012
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251226
		craterFreq      0.228615
		craterDensity   0.94024
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509379
		volcanoTemp     1509.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.165, 0.164, 0.000)
		colorShelf     (0.177, 0.175, 0.174, 0.000)
		colorBeach     (0.187, 0.185, 0.184, 0.000)
		colorDesert    (0.198, 0.196, 0.195, 0.000)
		colorLowland   (0.208, 0.206, 0.205, 0.000)
		colorUpland    (0.218, 0.216, 0.215, 0.000)
		colorRock      (0.229, 0.227, 0.225, 0.000)
		colorSnow      (0.239, 0.237, 0.236, 1.000)
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
		MaxLength   0.963866
		GasToDust   0.25
		Particles   2927
		GasBright   0.0466207
		DustBright  0.531897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   475.632
		Period          2890.06
		Eccentricity    0.860521
		Inclination     101.045
		AscendingNode   -125.118
		ArgOfPericenter 144.566
		MeanAnomaly     139.289
	}
}

Comet	"C43"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.57191e-015
	Radius          0.171573
	InertiaMoment   0.397988

	Oblateness      0.0153006

	RotationPeriod  44.6186
	Obliquity       0.145781
	EqAscendNode    88.2796

	AbsMagn         11.0359
	SlopeParam      2.82182
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.513 0.505 0.499)

	Surface
	{
		SurfStyle       0.521879
		OceanStyle      0.240837
		Randomize      (-0.066, 0.402, 0.546)
		colorDistMagn   0.79225
		colorDistFreq   2.21139e-005
		detailScale     4.68509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.408956
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478818
		terraceProb     0.155817
		erosion         0
		montesMagn      0.522624
		montesFreq      3.72012
		montesSpiky     0.949378
		montesFraction  0.566117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.29109e-005
		hillsFraction   0.551045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276563
		craterFreq      0.261743
		craterDensity   0.88254
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545547
		volcanoTemp     1385.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.172, 0.140, 0.000)
		colorShelf     (0.205, 0.177, 0.160, 0.000)
		colorBeach     (0.241, 0.207, 0.189, 0.000)
		colorDesert    (0.262, 0.222, 0.184, 0.000)
		colorLowland   (0.287, 0.237, 0.209, 0.000)
		colorUpland    (0.318, 0.288, 0.254, 0.000)
		colorRock      (0.344, 0.313, 0.274, 0.000)
		colorSnow      (0.374, 0.333, 0.289, 1.000)
		BumpHeight      0.154416
		BumpOffset      0.0308832
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0343078
		GasToDust   0.25
		Particles   1049
		GasBright   0.0367237
		DustBright  0.226281
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   303.263
		Period          1471.39
		Eccentricity    0.821967
		Inclination     24.2837
		AscendingNode   -172.385
		ArgOfPericenter -179.313
		MeanAnomaly     -77.8525
	}
}

Comet	"C44"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.21576e-011
	Radius          3.10329
	InertiaMoment   0.399743

	Oblateness      0.0128081

	RotationPeriod  42.7963
	Obliquity       313.352
	EqAscendNode    72.857

	AbsMagn         7.37907
	SlopeParam      3.44124
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.785 0.784)

	Surface
	{
		SurfStyle       0.176522
		OceanStyle      0.906551
		Randomize      (-0.983, 0.110, -0.303)
		colorDistMagn   0.414817
		colorDistFreq   0.00341722
		detailScale     84.7404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.266772
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458606
		terraceProb     0.202473
		erosion         0
		montesMagn      0.639934
		montesFreq      3.61058
		montesSpiky     0.975805
		montesFraction  0.437714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0224055
		hillsFraction   0.538232
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232544
		craterFreq      0.189872
		craterDensity   0.966031
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421479
		volcanoTemp     1645.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.314, 0.313, 0.000)
		colorShelf     (0.336, 0.334, 0.333, 0.000)
		colorBeach     (0.355, 0.353, 0.353, 0.000)
		colorDesert    (0.375, 0.373, 0.372, 0.000)
		colorLowland   (0.395, 0.393, 0.392, 0.000)
		colorUpland    (0.415, 0.412, 0.411, 0.000)
		colorRock      (0.434, 0.432, 0.431, 0.000)
		colorSnow      (0.454, 0.452, 0.451, 1.000)
		BumpHeight      2.79296
		BumpOffset      0.558591
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.5155
		GasToDust   0.25
		Particles   2021
		GasBright   0.148509
		DustBright  0.598982
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   451.431
		Period          2672.32
		Eccentricity    0.879677
		Inclination     32.0413
		AscendingNode   -8.17253
		ArgOfPericenter 27.9415
		MeanAnomaly     -112.243
	}
}

Comet	"C45"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            9.40301e-008
	Radius          67.0412
	InertiaMoment   0.398592

	Oblateness      0.018148

	RotationPeriod  40.9606
	Obliquity       266.557
	EqAscendNode    57.4344

	AbsMagn         2.88674
	SlopeParam      4.0103
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.487 0.481 0.474)

	Surface
	{
		SurfStyle       0.83627
		OceanStyle      0.469989
		Randomize      (-0.732, 0.893, 0.302)
		colorDistMagn   0.633212
		colorDistFreq   2.37168
		detailScale     1830.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999529
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714554
		terraceProb     0.120547
		erosion         0
		montesMagn      0.561986
		montesFreq      3.80239
		montesSpiky     0.925701
		montesFraction  0.587439
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.6063
		hillsFraction   0.450417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227996
		craterFreq      0.264277
		craterDensity   0.826656
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549955
		volcanoTemp     1545.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.163, 0.133, 0.000)
		colorShelf     (0.195, 0.168, 0.152, 0.000)
		colorBeach     (0.229, 0.197, 0.180, 0.000)
		colorDesert    (0.248, 0.211, 0.175, 0.000)
		colorLowland   (0.273, 0.226, 0.199, 0.000)
		colorUpland    (0.302, 0.274, 0.242, 0.000)
		colorRock      (0.326, 0.298, 0.261, 0.000)
		colorSnow      (0.356, 0.317, 0.275, 1.000)
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
		MaxLength   0.996692
		GasToDust   0.25
		Particles   2993
		GasBright   0.11133
		DustBright  0.320647
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   217.058
		Period          890.97
		Eccentricity    0.450259
		Inclination     -177.769
		AscendingNode   -41.0405
		ArgOfPericenter -1.04558
		MeanAnomaly     -76.5582
	}
}

Comet	"C46"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.89526e-015
	Radius          0.192198
	InertiaMoment   0.396308

	Oblateness      0.0151059

	RotationPeriod  39.1064
	Obliquity       219.763
	EqAscendNode    42.0118

	AbsMagn         10.7645
	SlopeParam      4.5802
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.679 0.677)

	Surface
	{
		SurfStyle       0.028213
		OceanStyle      0.43675
		Randomize      (-0.536, 1.000, -0.535)
		colorDistMagn   0.51747
		colorDistFreq   2.60312e-005
		detailScale     5.24829
		colorConversion true
		snowLevel       2
		tropicLatitude  0.646544
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743499
		terraceProb     0.281843
		erosion         0
		montesMagn      0.460298
		montesFreq      3.71778
		montesSpiky     0.953503
		montesFraction  0.294706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.34341e-005
		hillsFraction   0.72813
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245464
		craterFreq      0.230281
		craterDensity   0.989504
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500952
		volcanoTemp     1472.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.272, 0.271, 0.000)
		colorShelf     (0.289, 0.289, 0.288, 0.000)
		colorBeach     (0.306, 0.306, 0.305, 0.000)
		colorDesert    (0.323, 0.323, 0.322, 0.000)
		colorLowland   (0.340, 0.340, 0.338, 0.000)
		colorUpland    (0.357, 0.357, 0.355, 0.000)
		colorRock      (0.374, 0.374, 0.372, 0.000)
		colorSnow      (0.391, 0.391, 0.389, 1.000)
		BumpHeight      0.172978
		BumpOffset      0.0345957
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0671338
		GasToDust   0.25
		Particles   1115
		GasBright   0.290306
		DustBright  0.626158
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   355.949
		Period          1871.04
		Eccentricity    0.778284
		Inclination     174.405
		AscendingNode   91.984
		ArgOfPericenter 29.3217
		MeanAnomaly     124.779
	}
}

Comet	"C47"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.23928e-011
	Radius          4.15181
	InertiaMoment   0.399088

	Oblateness      0.0219518

	RotationPeriod  37.2283
	Obliquity       172.969
	EqAscendNode    26.5893

	AbsMagn         7.16693
	SlopeParam      5.20276
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.540 0.462)

	Surface
	{
		SurfStyle       0.849961
		OceanStyle      0.906927
		Randomize      (-0.129, 0.833, -0.366)
		colorDistMagn   0.725043
		colorDistFreq   0.00605073
		detailScale     113.372
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980817
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543681
		terraceProb     0.171144
		erosion         0
		montesMagn      0.630645
		montesFreq      3.33574
		montesSpiky     0.985879
		montesFraction  0.683762
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0483092
		hillsFraction   0.478688
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248526
		craterFreq      0.258544
		craterDensity   0.82188
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511663
		volcanoTemp     1310.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.184, 0.129, 0.000)
		colorShelf     (0.271, 0.189, 0.148, 0.000)
		colorBeach     (0.319, 0.221, 0.175, 0.000)
		colorDesert    (0.346, 0.238, 0.171, 0.000)
		colorLowland   (0.380, 0.254, 0.194, 0.000)
		colorUpland    (0.420, 0.308, 0.235, 0.000)
		colorRock      (0.454, 0.335, 0.254, 0.000)
		colorSnow      (0.495, 0.356, 0.268, 1.000)
		BumpHeight      3.73663
		BumpOffset      0.747326
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.548326
		GasToDust   0.25
		Particles   2087
		GasBright   0.225845
		DustBright  0.375106
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   461.539
		Period          2762.57
		Eccentricity    0.822914
		Inclination     80.3209
		AscendingNode   76.5518
		ArgOfPericenter -178.753
		MeanAnomaly     -93.3925
	}
}

Comet	"C48"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.73192e-007
	Radius          75.1057
	InertiaMoment   0.397609

	Oblateness      0.0185628

	RotationPeriod  35.3204
	Obliquity       126.174
	EqAscendNode    11.1667

	AbsMagn         2.37327
	SlopeParam      5.97486
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.724 0.695)

	Surface
	{
		SurfStyle       0.838678
		OceanStyle      0.365389
		Randomize      (0.248, -0.068, 0.498)
		colorDistMagn   0.546686
		colorDistFreq   2.71458
		detailScale     2050.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463155
		terraceProb     0.201703
		erosion         0
		montesMagn      0.504054
		montesFreq      3.57215
		montesSpiky     0.849046
		montesFraction  0.702453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.0249
		hillsFraction   0.639719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202846
		craterFreq      0.184433
		craterDensity   0.976497
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543555
		volcanoTemp     1659.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.246, 0.195, 0.000)
		colorShelf     (0.312, 0.254, 0.222, 0.000)
		colorBeach     (0.367, 0.297, 0.264, 0.000)
		colorDesert    (0.398, 0.319, 0.257, 0.000)
		colorLowland   (0.437, 0.341, 0.292, 0.000)
		colorUpland    (0.484, 0.413, 0.355, 0.000)
		colorRock      (0.523, 0.449, 0.382, 0.000)
		colorSnow      (0.570, 0.478, 0.403, 1.000)
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
		GasBright   0.124125
		DustBright  0.161313
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   401.379
		Period          2240.44
		Eccentricity    0.895958
		Inclination     115.803
		AscendingNode   -51.1058
		ArgOfPericenter 45.0298
		MeanAnomaly     -113.895
	}
}

Comet	"C49"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.33269e-015
	Radius          0.25712
	InertiaMoment   0.399533

	Oblateness      0.0272851

	RotationPeriod  33.3762
	Obliquity       79.38
	EqAscendNode    355.744

	AbsMagn         10.5053
	SlopeParam      7.29672
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.487 0.396 0.359)

	Surface
	{
		SurfStyle       0.0622365
		OceanStyle      0.524471
		Randomize      (0.755, -0.772, 0.964)
		colorDistMagn   0.00156999
		colorDistFreq   2.05928e-005
		detailScale     7.0211
		colorConversion true
		snowLevel       2
		tropicLatitude  0.328634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.749705
		terraceProb     0.417458
		erosion         0
		montesMagn      0.468414
		montesFreq      3.60441
		montesSpiky     0.968953
		montesFraction  0.826963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000171584
		hillsFraction   0.895496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244547
		craterFreq      0.195343
		craterDensity   0.946526
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446153
		volcanoTemp     939.627
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.158, 0.144, 0.000)
		colorShelf     (0.207, 0.168, 0.153, 0.000)
		colorBeach     (0.219, 0.178, 0.162, 0.000)
		colorDesert    (0.231, 0.188, 0.171, 0.000)
		colorLowland   (0.243, 0.198, 0.179, 0.000)
		colorUpland    (0.256, 0.208, 0.188, 0.000)
		colorRock      (0.268, 0.218, 0.197, 0.000)
		colorSnow      (0.280, 0.228, 0.206, 1.000)
		BumpHeight      0.231408
		BumpOffset      0.0462817
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0999596
		GasToDust   0.25
		Particles   1181
		GasBright   0.380268
		DustBright  0.389656
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   302.413
		Period          1465.21
		Eccentricity    0.818303
		Inclination     -90.4876
		AscendingNode   163.608
		ArgOfPericenter -120.974
		MeanAnomaly     -93.9371
	}
}

Comet	"C50"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.12445e-011
	Radius          4.6515
	InertiaMoment   0.398313

	Oblateness      0.0235086

	RotationPeriod  31.3883
	Obliquity       32.5857
	EqAscendNode    340.322

	AbsMagn         6.95243
	SlopeParam      2.46298
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.762 0.759 0.756)

	Surface
	{
		SurfStyle       0.955086
		OceanStyle      0.909979
		Randomize      (0.777, 0.543, -0.058)
		colorDistMagn   0.342983
		colorDistFreq   0.0177424
		detailScale     127.017
		colorConversion true
		snowLevel       2
		tropicLatitude  0.782243
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.292314
		terraceProb     0.30722
		erosion         0
		montesMagn      0.538047
		montesFreq      2.50916
		montesSpiky     0.963244
		montesFraction  0.611653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0478487
		hillsFraction   0.476438
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210744
		craterFreq      0.269194
		craterDensity   0.865895
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447657
		volcanoTemp     1948.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.266, 0.303, 0.050)
		colorShelf     (0.305, 0.311, 0.348, 0.040)
		colorBeach     (0.351, 0.357, 0.393, 0.030)
		colorDesert    (0.396, 0.402, 0.446, 0.020)
		colorLowland   (0.442, 0.448, 0.492, 0.030)
		colorUpland    (0.488, 0.493, 0.537, 0.050)
		colorRock      (0.533, 0.539, 0.598, 0.020)
		colorSnow      (0.533, 0.539, 0.598, 1.000)
		BumpHeight      4.18635
		BumpOffset      0.83727
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.581152
		GasToDust   0.25
		Particles   2153
		GasBright   0.0240603
		DustBright  0.43035
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   415.09
		Period          2356.21
		Eccentricity    0.809234
		Inclination     -25.7424
		AscendingNode   -125.548
		ArgOfPericenter -61.2848
		MeanAnomaly     -23.5193
	}
}

Comet	"C51"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.18997e-007
	Radius          100.471
	InertiaMoment   0.399956

	Oblateness      0.0352523

	RotationPeriod  29.3484
	Obliquity       345.791
	EqAscendNode    324.899

	AbsMagn         1.74548
	SlopeParam      3.13764
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.578 0.573)

	Surface
	{
		SurfStyle       0.387249
		OceanStyle      0.0909031
		Randomize      (0.317, 0.154, -0.681)
		colorDistMagn   0.206863
		colorDistFreq   5.83195
		detailScale     2743.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988664
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704391
		terraceProb     0.333343
		erosion         0
		montesMagn      0.521858
		montesFreq      3.31874
		montesSpiky     0.864479
		montesFraction  0.452668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.9244
		hillsFraction   0.649471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231713
		craterFreq      0.404647
		craterDensity   0.846822
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511353
		volcanoTemp     1430.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.229, 0.000)
		colorShelf     (0.248, 0.246, 0.243, 0.000)
		colorBeach     (0.262, 0.260, 0.258, 0.000)
		colorDesert    (0.277, 0.274, 0.272, 0.000)
		colorLowland   (0.292, 0.289, 0.286, 0.000)
		colorUpland    (0.306, 0.303, 0.301, 0.000)
		colorRock      (0.321, 0.318, 0.315, 0.000)
		colorSnow      (0.335, 0.332, 0.329, 1.000)
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
		GasBright   0.105151
		DustBright  0.833746
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   342.632
		Period          1767.03
		Eccentricity    0.879217
		Inclination     -103.529
		AscendingNode   -108.732
		ArgOfPericenter -64.5083
		MeanAnomaly     -157.395
	}
}

Comet	"C52"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            9.82216e-015
	Radius          0.288078
	InertiaMoment   0.398852

	Oblateness      0.0311833

	RotationPeriod  27.2467
	Obliquity       298.997
	EqAscendNode    309.476

	AbsMagn         10.2562
	SlopeParam      3.72464
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.757 0.755)

	Surface
	{
		SurfStyle       0.615532
		OceanStyle      0.235725
		Randomize      (0.053, 0.441, 0.727)
		colorDistMagn   0.493964
		colorDistFreq   6.62101e-005
		detailScale     7.86646
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380249
		terraceProb     0.400801
		erosion         0
		montesMagn      0.587277
		montesFreq      3.08459
		montesSpiky     0.956459
		montesFraction  0.509064
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000170642
		hillsFraction   0.707263
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2479
		craterFreq      0.188123
		craterDensity   0.8098
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.407279
		volcanoTemp     1206.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.258, 0.211, 0.000)
		colorShelf     (0.304, 0.265, 0.242, 0.000)
		colorBeach     (0.357, 0.311, 0.287, 0.000)
		colorDesert    (0.387, 0.333, 0.279, 0.000)
		colorLowland   (0.425, 0.356, 0.317, 0.000)
		colorUpland    (0.470, 0.432, 0.385, 0.000)
		colorRock      (0.508, 0.470, 0.415, 0.000)
		colorSnow      (0.554, 0.500, 0.438, 1.000)
		BumpHeight      0.25927
		BumpOffset      0.0518541
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.132786
		GasToDust   0.25
		Particles   1248
		GasBright   0.106623
		DustBright  0.516761
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   337.376
		Period          1726.52
		Eccentricity    0.877677
		Inclination     89.4717
		AscendingNode   -53.8302
		ArgOfPericenter -64.193
		MeanAnomaly     177.54
	}
}

Comet	"C53"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.59674e-011
	Radius          6.22222
	InertiaMoment   0.397117

	Oblateness      0.0476692

	RotationPeriod  25.0718
	Obliquity       252.203
	EqAscendNode    294.054

	AbsMagn         6.73486
	SlopeParam      4.28837
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.431 0.428 0.424)

	Surface
	{
		SurfStyle       0.841239
		OceanStyle      0.106855
		Randomize      (0.974, 0.077, 0.808)
		colorDistMagn   0.310841
		colorDistFreq   0.0209242
		detailScale     169.908
		colorConversion true
		snowLevel       2
		tropicLatitude  0.919121
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419217
		terraceProb     0.123372
		erosion         0
		montesMagn      0.613761
		montesFreq      3.18964
		montesSpiky     0.913486
		montesFraction  0.239239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.126586
		hillsFraction   0.763519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252356
		craterFreq      0.242166
		craterDensity   0.760836
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438649
		volcanoTemp     1500.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.146, 0.119, 0.000)
		colorShelf     (0.173, 0.150, 0.136, 0.000)
		colorBeach     (0.203, 0.176, 0.161, 0.000)
		colorDesert    (0.220, 0.188, 0.157, 0.000)
		colorLowland   (0.242, 0.201, 0.178, 0.000)
		colorUpland    (0.268, 0.244, 0.216, 0.000)
		colorRock      (0.289, 0.265, 0.233, 0.000)
		colorSnow      (0.315, 0.283, 0.246, 1.000)
		BumpHeight      5.59999
		BumpOffset      1.12
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.613978
		GasToDust   0.25
		Particles   2220
		GasBright   0.0708361
		DustBright  0.237034
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   416.299
		Period          2366.51
		Eccentricity    0.879424
		Inclination     6.14514
		AscendingNode   152.107
		ArgOfPericenter 141.29
		MeanAnomaly     -152.448
	}
}

Comet	"C54"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.87552e-007
	Radius          112.57
	InertiaMoment   0.399318

	Oblateness      0.0444598

	RotationPeriod  22.8098
	Obliquity       205.409
	EqAscendNode    278.631

	AbsMagn         0.90943
	SlopeParam      4.87651
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.431 0.422 0.419)

	Surface
	{
		SurfStyle       0.491217
		OceanStyle      0.260569
		Randomize      (0.291, 0.244, -0.821)
		colorDistMagn   0.342288
		colorDistFreq   4.18371
		detailScale     3073.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.576377
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655189
		terraceProb     0.199142
		erosion         0
		montesMagn      0.504739
		montesFreq      4.13325
		montesSpiky     0.969468
		montesFraction  0.704446
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.4937
		hillsFraction   0.72737
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241786
		craterFreq      0.428015
		craterDensity   0.703949
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553285
		volcanoTemp     1284.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.169, 0.168, 0.000)
		colorShelf     (0.183, 0.179, 0.178, 0.000)
		colorBeach     (0.194, 0.190, 0.189, 0.000)
		colorDesert    (0.205, 0.201, 0.199, 0.000)
		colorLowland   (0.216, 0.211, 0.209, 0.000)
		colorUpland    (0.227, 0.222, 0.220, 0.000)
		colorRock      (0.237, 0.232, 0.230, 0.000)
		colorSnow      (0.248, 0.243, 0.241, 1.000)
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
		GasBright   0.229094
		DustBright  0.563263
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   438.821
		Period          2561.13
		Eccentricity    0.813117
		Inclination     -163.341
		AscendingNode   66.9427
		ArgOfPericenter -39.5326
		MeanAnomaly     -11.8048
	}
}

Comet	"C55"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.80912e-014
	Radius          0.385349
	InertiaMoment   0.397997

	Oblateness      0.0717489

	RotationPeriod  20.4436
	Obliquity       158.614
	EqAscendNode    263.209

	AbsMagn         10.0156
	SlopeParam      5.55437
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.614 0.611 0.609)

	Surface
	{
		SurfStyle       0.233876
		OceanStyle      0.975236
		Randomize      (0.720, -0.868, -0.345)
		colorDistMagn   0.981139
		colorDistFreq   7.60078e-005
		detailScale     10.5226
		colorConversion true
		snowLevel       2
		tropicLatitude  0.205775
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616235
		terraceProb     0.185822
		erosion         0
		montesMagn      0.415806
		montesFreq      2.57722
		montesSpiky     0.944357
		montesFraction  0.887075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000410332
		hillsFraction   0.575984
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232712
		craterFreq      0.226477
		craterDensity   0.900355
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.601031
		volcanoTemp     1466.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.244, 0.244, 0.000)
		colorShelf     (0.261, 0.259, 0.259, 0.000)
		colorBeach     (0.276, 0.275, 0.274, 0.000)
		colorDesert    (0.292, 0.290, 0.289, 0.000)
		colorLowland   (0.307, 0.305, 0.304, 0.000)
		colorUpland    (0.322, 0.321, 0.320, 0.000)
		colorRock      (0.338, 0.336, 0.335, 0.000)
		colorSnow      (0.353, 0.351, 0.350, 1.000)
		BumpHeight      0.346814
		BumpOffset      0.0693628
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.165612
		GasToDust   0.25
		Particles   1314
		GasBright   0.166025
		DustBright  0.310818
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   248.15
		Period          1089.11
		Eccentricity    0.584805
		Inclination     -153.154
		AscendingNode   26.1567
		ArgOfPericenter 112.713
		MeanAnomaly     159.382
	}
}

Comet	"C56"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.39922e-010
	Radius          6.97161
	InertiaMoment   0.399749

	Oblateness      0.0717105

	RotationPeriod  17.9518
	Obliquity       111.82
	EqAscendNode    247.786

	AbsMagn         6.51349
	SlopeParam      6.49129
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.723 0.719)

	Surface
	{
		SurfStyle       0.919174
		OceanStyle      0.523539
		Randomize      (-0.566, 0.921, 0.897)
		colorDistMagn   0.412414
		colorDistFreq   0.0162309
		detailScale     190.371
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899039
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551364
		terraceProb     0.207003
		erosion         0
		montesMagn      0.449083
		montesFreq      2.98089
		montesSpiky     0.993785
		montesFraction  0.948105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.129846
		hillsFraction   0.607242
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224552
		craterFreq      0.185618
		craterDensity   0.912906
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480139
		volcanoTemp     1582.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.253, 0.288, 0.050)
		colorShelf     (0.291, 0.296, 0.331, 0.040)
		colorBeach     (0.334, 0.340, 0.374, 0.030)
		colorDesert    (0.378, 0.383, 0.424, 0.020)
		colorLowland   (0.421, 0.426, 0.467, 0.030)
		colorUpland    (0.465, 0.470, 0.511, 0.050)
		colorRock      (0.508, 0.513, 0.568, 0.020)
		colorSnow      (0.508, 0.513, 0.568, 1.000)
		BumpHeight      6.27445
		BumpOffset      1.25489
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.646803
		GasToDust   0.25
		Particles   2286
		GasBright   0.391473
		DustBright  0.569857
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   225.962
		Period          946.354
		Eccentricity    0.596336
		Inclination     -117.128
		AscendingNode   137.315
		ArgOfPericenter 75.0443
		MeanAnomaly     17.5253
	}
}

Comet	"C57"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.3083e-018
	Radius          0.0238652
	InertiaMoment   0.398599

	Oblateness      0.127945

	RotationPeriod  15.307
	Obliquity       65.0256
	EqAscendNode    232.363

	AbsMagn         -0.448709
	SlopeParam      2.046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.411 0.407 0.404)

	Surface
	{
		SurfStyle       0.948767
		OceanStyle      0.197792
		Randomize      (0.769, -0.658, 0.812)
		colorDistMagn   0.287031
		colorDistFreq   3.09472e-007
		detailScale     0.65168
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397043
		terraceProb     0.278443
		erosion         0
		montesMagn      0.501078
		montesFreq      3.18135
		montesSpiky     0.940421
		montesFraction  0.81399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.89299e-006
		hillsFraction   0.63852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24781
		craterFreq      0.198837
		craterDensity   0.823581
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.379327
		volcanoTemp     1230.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.140, 0.143, 0.161, 0.050)
		colorShelf     (0.164, 0.167, 0.186, 0.040)
		colorBeach     (0.189, 0.192, 0.210, 0.030)
		colorDesert    (0.214, 0.216, 0.238, 0.020)
		colorLowland   (0.238, 0.240, 0.262, 0.030)
		colorUpland    (0.263, 0.265, 0.287, 0.050)
		colorRock      (0.288, 0.289, 0.319, 0.020)
		colorSnow      (0.288, 0.289, 0.319, 1.000)
		BumpHeight      0.0214787
		BumpOffset      0.00429574
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.301122
		DustBright  0.344695
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   586.773
		Period          3960.1
		Eccentricity    0.873544
		Inclination     -142.177
		AscendingNode   -20.5846
		ArgOfPericenter -167.598
		MeanAnomaly     -127.126
	}
}

Comet	"C58"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.33216e-014
	Radius          0.431756
	InertiaMoment   0.396337

	Oblateness      0.146282

	RotationPeriod  12.4728
	Obliquity       18.2313
	EqAscendNode    216.941

	AbsMagn         9.78206
	SlopeParam      2.81263
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.720 0.714 0.711)

	Surface
	{
		SurfStyle       0.0136887
		OceanStyle      0.499339
		Randomize      (0.696, -0.801, 0.515)
		colorDistMagn   0.984644
		colorDistFreq   6.37998e-005
		detailScale     11.7898
		colorConversion true
		snowLevel       2
		tropicLatitude  0.30855
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584756
		terraceProb     0.169575
		erosion         0
		montesMagn      0.429011
		montesFreq      2.11544
		montesSpiky     0.940023
		montesFraction  0.377193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000405159
		hillsFraction   0.769743
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257237
		craterFreq      0.194451
		craterDensity   0.998531
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559548
		volcanoTemp     1403.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.286, 0.285, 0.000)
		colorShelf     (0.306, 0.304, 0.302, 0.000)
		colorBeach     (0.324, 0.321, 0.320, 0.000)
		colorDesert    (0.342, 0.339, 0.338, 0.000)
		colorLowland   (0.360, 0.357, 0.356, 0.000)
		colorUpland    (0.378, 0.375, 0.374, 0.000)
		colorRock      (0.396, 0.393, 0.391, 0.000)
		colorSnow      (0.414, 0.411, 0.409, 1.000)
		BumpHeight      0.38858
		BumpOffset      0.0777161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.198437
		GasToDust   0.25
		Particles   1380
		GasBright   0.00836013
		DustBright  0.321943
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   309.997
		Period          1520.68
		Eccentricity    0.949951
		Inclination     -34.1713
		AscendingNode   -19.755
		ArgOfPericenter -137.975
		MeanAnomaly     70.1697
	}
}

Comet	"C59"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.57719e-010
	Radius          9.32568
	InertiaMoment   0.399094

	Oblateness      0.249

	RotationPeriod  9.39926
	Obliquity       331.437
	EqAscendNode    201.518

	AbsMagn         6.28747
	SlopeParam      3.43321
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.677 0.671)

	Surface
	{
		SurfStyle       0.450016
		OceanStyle      0.0647235
		Randomize      (-0.980, -0.905, 0.560)
		colorDistMagn   0.476917
		colorDistFreq   0.0579345
		detailScale     254.653
		colorConversion true
		snowLevel       2
		tropicLatitude  0.471096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450083
		terraceProb     0.400261
		erosion         0
		montesMagn      0.363852
		montesFreq      3.24424
		montesSpiky     0.903815
		montesFraction  0.485881
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.202498
		hillsFraction   0.828394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232361
		craterFreq      0.203511
		craterDensity   1.02659
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494225
		volcanoTemp     1287.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.268, 0.000)
		colorShelf     (0.289, 0.288, 0.285, 0.000)
		colorBeach     (0.306, 0.304, 0.302, 0.000)
		colorDesert    (0.323, 0.321, 0.319, 0.000)
		colorLowland   (0.340, 0.338, 0.335, 0.000)
		colorUpland    (0.357, 0.355, 0.352, 0.000)
		colorRock      (0.374, 0.372, 0.369, 0.000)
		colorSnow      (0.391, 0.389, 0.386, 1.000)
		BumpHeight      8.39311
		BumpOffset      1.67862
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.679629
		GasToDust   0.25
		Particles   2352
		GasBright   0.0687322
		DustBright  0.746057
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   516.33
		Period          3268.82
		Eccentricity    0.891533
		Inclination     179.347
		AscendingNode   134.868
		ArgOfPericenter -147.446
		MeanAnomaly     -59.2506
	}
}

Comet	"C60"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.93537e-018
	Radius          0.0267387
	InertiaMoment   0.39762

	Oblateness      0.249

	RotationPeriod  6.01503
	Obliquity       284.643
	EqAscendNode    186.096

	AbsMagn         17.157
	SlopeParam      4.00258
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.694 0.691 0.689)

	Surface
	{
		SurfStyle       0.0485998
		OceanStyle      0.895444
		Randomize      (0.362, 0.716, -0.614)
		colorDistMagn   0.286434
		colorDistFreq   5.38217e-007
		detailScale     0.730144
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971941
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.728233
		terraceProb     0.263755
		erosion         0
		montesMagn      0.290165
		montesFreq      1.95881
		montesSpiky     0.88062
		montesFraction  0.653722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.05718e-006
		hillsFraction   0.573418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238934
		craterFreq      0.184271
		craterDensity   0.939804
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439444
		volcanoTemp     1891.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.276, 0.276, 0.000)
		colorShelf     (0.295, 0.294, 0.293, 0.000)
		colorBeach     (0.312, 0.311, 0.310, 0.000)
		colorDesert    (0.330, 0.328, 0.327, 0.000)
		colorLowland   (0.347, 0.345, 0.345, 0.000)
		colorUpland    (0.365, 0.363, 0.362, 0.000)
		colorRock      (0.382, 0.380, 0.379, 0.000)
		colorSnow      (0.399, 0.397, 0.396, 1.000)
		BumpHeight      0.0240648
		BumpOffset      0.00481296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0715967
		DustBright  0.427679
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   297.663
		Period          1430.83
		Eccentricity    0.84613
		Inclination     115.243
		AscendingNode   98.3722
		ArgOfPericenter -11.5108
		MeanAnomaly     44.2172
	}
}

Comet	"C61"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.13744e-014
	Radius          0.577562
	InertiaMoment   0.399539

	Oblateness      0.00116877

	RotationPeriod  160.034
	Obliquity       237.848
	EqAscendNode    170.673

	AbsMagn         9.55445
	SlopeParam      4.57216
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.634 0.632)

	Surface
	{
		SurfStyle       0.211202
		OceanStyle      0.578198
		Randomize      (-0.434, 0.896, 0.992)
		colorDistMagn   0.952547
		colorDistFreq   0.000193926
		detailScale     15.7713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991253
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489986
		terraceProb     0.379555
		erosion         0
		montesMagn      0.599493
		montesFreq      3.59803
		montesSpiky     0.997903
		montesFraction  0.461404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000798644
		hillsFraction   0.825982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27165
		craterFreq      0.268067
		craterDensity   0.924799
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488735
		volcanoTemp     1845.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.253, 0.000)
		colorShelf     (0.272, 0.269, 0.268, 0.000)
		colorBeach     (0.288, 0.285, 0.284, 0.000)
		colorDesert    (0.304, 0.301, 0.300, 0.000)
		colorLowland   (0.320, 0.317, 0.316, 0.000)
		colorUpland    (0.336, 0.333, 0.332, 0.000)
		colorRock      (0.352, 0.349, 0.347, 0.000)
		colorSnow      (0.368, 0.365, 0.363, 1.000)
		BumpHeight      0.519806
		BumpOffset      0.103961
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.231263
		GasToDust   0.25
		Particles   1446
		GasBright   0.199159
		DustBright  0.784604
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   407.566
		Period          2292.44
		Eccentricity    0.827007
		Inclination     85.2801
		AscendingNode   95.9993
		ArgOfPericenter 80.6203
		MeanAnomaly     -12.1878
	}
}

Comet	"C62"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.74686e-010
	Radius          10.4481
	InertiaMoment   0.39832

	Oblateness      0.00155201

	RotationPeriod  121.223
	Obliquity       191.054
	EqAscendNode    155.25

	AbsMagn         6.05583
	SlopeParam      5.19353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.789 0.713 0.686)

	Surface
	{
		SurfStyle       0.558369
		OceanStyle      0.691571
		Randomize      (0.173, -0.816, -0.854)
		colorDistMagn   0.268642
		colorDistFreq   0.0406433
		detailScale     285.302
		colorConversion true
		snowLevel       2
		tropicLatitude  0.957653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614207
		terraceProb     0.271365
		erosion         0
		montesMagn      0.440143
		montesFreq      3.67839
		montesSpiky     0.987985
		montesFraction  0.437441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.305872
		hillsFraction   0.717337
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23737
		craterFreq      0.14062
		craterDensity   0.877701
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45446
		volcanoTemp     1326.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.242, 0.192, 0.000)
		colorShelf     (0.315, 0.250, 0.220, 0.000)
		colorBeach     (0.371, 0.292, 0.261, 0.000)
		colorDesert    (0.402, 0.314, 0.254, 0.000)
		colorLowland   (0.442, 0.335, 0.288, 0.000)
		colorUpland    (0.489, 0.406, 0.350, 0.000)
		colorRock      (0.528, 0.442, 0.377, 0.000)
		colorSnow      (0.576, 0.471, 0.398, 1.000)
		BumpHeight      9.40326
		BumpOffset      1.88065
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.712455
		GasToDust   0.25
		Particles   2419
		GasBright   0.174742
		DustBright  0.493508
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   322.733
		Period          1615.35
		Eccentricity    0.822963
		Inclination     -83.3503
		AscendingNode   23.7811
		ArgOfPericenter -166.938
		MeanAnomaly     41.5968
	}
}

Comet	"C63"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.4616e-017
	Radius          0.03577
	InertiaMoment   0.399961

	Oblateness      0.00244483

	RotationPeriod  110.6
	Obliquity       144.26
	EqAscendNode    139.828

	AbsMagn         15.4176
	SlopeParam      5.96233
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.694 0.691 0.690)

	Surface
	{
		SurfStyle       0.143104
		OceanStyle      0.789096
		Randomize      (0.115, -0.787, -0.067)
		colorDistMagn   0.638686
		colorDistFreq   3.44101e-007
		detailScale     0.97676
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955695
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440627
		terraceProb     0.296242
		erosion         0
		montesMagn      0.623728
		montesFreq      2.48865
		montesSpiky     0.758669
		montesFraction  0.809523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.08517e-006
		hillsFraction   0.647696
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.29836
		craterFreq      0.192619
		craterDensity   0.766683
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.447457
		volcanoTemp     1572.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.276, 0.000)
		colorShelf     (0.295, 0.294, 0.293, 0.000)
		colorBeach     (0.312, 0.311, 0.310, 0.000)
		colorDesert    (0.330, 0.328, 0.328, 0.000)
		colorLowland   (0.347, 0.345, 0.345, 0.000)
		colorUpland    (0.364, 0.363, 0.362, 0.000)
		colorRock      (0.382, 0.380, 0.379, 0.000)
		colorSnow      (0.399, 0.397, 0.397, 1.000)
		BumpHeight      0.032193
		BumpOffset      0.0064386
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.113065
		DustBright  0.239671
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   486.408
		Period          2988.83
		Eccentricity    0.856466
		Inclination     138.163
		AscendingNode   -37.1897
		ArgOfPericenter 27.5121
		MeanAnomaly     97.5894
	}
}

Comet	"C64"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.13044e-013
	Radius          0.647036
	InertiaMoment   0.398858

	Oblateness      0.00212149

	RotationPeriod  103.649
	Obliquity       97.4655
	EqAscendNode    124.405

	AbsMagn         9.33176
	SlopeParam      7.26706
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.675 0.673)

	Surface
	{
		SurfStyle       0.0755147
		OceanStyle      0.28788
		Randomize      (0.113, -0.990, 0.192)
		colorDistMagn   0.400968
		colorDistFreq   0.000258854
		detailScale     17.6684
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848377
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.299839
		terraceProb     0.329247
		erosion         0
		montesMagn      0.420767
		montesFreq      2.96025
		montesSpiky     0.96078
		montesFraction  0.377125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0011295
		hillsFraction   0.545949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248542
		craterFreq      0.263744
		craterDensity   0.798489
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469516
		volcanoTemp     1755.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.269, 0.000)
		colorShelf     (0.288, 0.287, 0.286, 0.000)
		colorBeach     (0.305, 0.304, 0.303, 0.000)
		colorDesert    (0.322, 0.321, 0.320, 0.000)
		colorLowland   (0.339, 0.338, 0.337, 0.000)
		colorUpland    (0.356, 0.355, 0.354, 0.000)
		colorRock      (0.373, 0.371, 0.370, 0.000)
		colorSnow      (0.390, 0.388, 0.387, 1.000)
		BumpHeight      0.582332
		BumpOffset      0.116466
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.264089
		GasToDust   0.25
		Particles   1513
		GasBright   0.317795
		DustBright  0.519428
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   325.11
		Period          1633.23
		Eccentricity    0.777407
		Inclination     137.737
		AscendingNode   20.2679
		ArgOfPericenter 175.366
		MeanAnomaly     50.9686
	}
}

Comet	"C65"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            8.74313e-010
	Radius          13.9779
	InertiaMoment   0.397132

	Oblateness      0.00305402

	RotationPeriod  98.312
	Obliquity       50.6712
	EqAscendNode    108.983

	AbsMagn         5.81748
	SlopeParam      2.45259
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.688 0.609)

	Surface
	{
		SurfStyle       0.609147
		OceanStyle      0.391329
		Randomize      (-0.071, 0.543, 0.862)
		colorDistMagn   0.467521
		colorDistFreq   0.146702
		detailScale     381.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995508
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587157
		terraceProb     0.41009
		erosion         0
		montesMagn      0.335079
		montesFreq      3.55943
		montesSpiky     0.97951
		montesFraction  0.881406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.436438
		hillsFraction   0.521028
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236302
		craterFreq      0.153947
		craterDensity   0.870293
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513811
		volcanoTemp     1552.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.234, 0.171, 0.000)
		colorShelf     (0.291, 0.241, 0.195, 0.000)
		colorBeach     (0.342, 0.282, 0.232, 0.000)
		colorDesert    (0.371, 0.303, 0.225, 0.000)
		colorLowland   (0.408, 0.324, 0.256, 0.000)
		colorUpland    (0.452, 0.392, 0.311, 0.000)
		colorRock      (0.488, 0.427, 0.335, 0.000)
		colorSnow      (0.532, 0.454, 0.353, 1.000)
		BumpHeight      12.5801
		BumpOffset      2.51602
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.745281
		GasToDust   0.25
		Particles   2485
		GasBright   0.228836
		DustBright  0.292873
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   292.969
		Period          1397.12
		Eccentricity    0.806867
		Inclination     -133.213
		AscendingNode   20.3338
		ArgOfPericenter 158.303
		MeanAnomaly     11.4717
	}
}

Comet	"C66"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.69207e-017
	Radius          0.0400696
	InertiaMoment   0.399323

	Oblateness      0.00258258

	RotationPeriod  93.8965
	Obliquity       3.87695
	EqAscendNode    93.5601

	AbsMagn         14.4788
	SlopeParam      3.12917
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.732 0.729 0.726)

	Surface
	{
		SurfStyle       0.368312
		OceanStyle      0.929972
		Randomize      (-0.811, -0.064, 0.951)
		colorDistMagn   0.257826
		colorDistFreq   8.16107e-007
		detailScale     1.09417
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873452
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325131
		terraceProb     0.146834
		erosion         0
		montesMagn      0.507776
		montesFreq      2.65452
		montesSpiky     0.975647
		montesFraction  0.695946
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.13238e-006
		hillsFraction   0.504728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242894
		craterFreq      0.249254
		craterDensity   0.700075
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516744
		volcanoTemp     1277.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.290, 0.000)
		colorShelf     (0.311, 0.310, 0.308, 0.000)
		colorBeach     (0.329, 0.328, 0.327, 0.000)
		colorDesert    (0.348, 0.346, 0.345, 0.000)
		colorLowland   (0.366, 0.365, 0.363, 0.000)
		colorUpland    (0.384, 0.383, 0.381, 0.000)
		colorRock      (0.403, 0.401, 0.399, 0.000)
		colorSnow      (0.421, 0.419, 0.417, 1.000)
		BumpHeight      0.0360626
		BumpOffset      0.00721253
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.102618
		DustBright  0.103578
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   433.793
		Period          2517.24
		Eccentricity    0.850324
		Inclination     -122.83
		AscendingNode   18.1057
		ArgOfPericenter 147.977
		MeanAnomaly     -76.8858
	}
}

Comet	"C67"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.08212e-013
	Radius          0.8657
	InertiaMoment   0.398005

	Oblateness      0.00364067

	RotationPeriod  90.0806
	Obliquity       317.083
	EqAscendNode    78.1375

	AbsMagn         9.11312
	SlopeParam      3.71684
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.822 0.793 0.772)

	Surface
	{
		SurfStyle       0.575562
		OceanStyle      0.872215
		Randomize      (0.080, -0.443, -0.153)
		colorDistMagn   0.711193
		colorDistFreq   0.000283918
		detailScale     23.6394
		colorConversion true
		snowLevel       2
		tropicLatitude  0.159793
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.274707
		terraceProb     0.47005
		erosion         0
		montesMagn      0.41214
		montesFreq      3.18888
		montesSpiky     0.990235
		montesFraction  0.546758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000876771
		hillsFraction   0.481625
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22465
		craterFreq      0.150693
		craterDensity   0.820122
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534586
		volcanoTemp     1532.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.270, 0.216, 0.000)
		colorShelf     (0.329, 0.277, 0.247, 0.000)
		colorBeach     (0.386, 0.325, 0.293, 0.000)
		colorDesert    (0.419, 0.349, 0.286, 0.000)
		colorLowland   (0.460, 0.373, 0.324, 0.000)
		colorUpland    (0.510, 0.452, 0.394, 0.000)
		colorRock      (0.551, 0.492, 0.424, 0.000)
		colorSnow      (0.600, 0.523, 0.448, 1.000)
		BumpHeight      0.77913
		BumpOffset      0.155826
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.296915
		GasToDust   0.25
		Particles   1579
		GasBright   0.039174
		DustBright  0.651508
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   293.241
		Period          1399.07
		Eccentricity    0.822286
		Inclination     -33.725
		AscendingNode   179.65
		ArgOfPericenter 25.4336
		MeanAnomaly     60.3543
	}
}

Comet	"C68"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.61037e-009
	Radius          15.6566
	InertiaMoment   0.399754

	Oblateness      0.00302659

	RotationPeriod  86.6868
	Obliquity       270.288
	EqAscendNode    62.7149

	AbsMagn         5.57111
	SlopeParam      4.28057
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.709 0.707 0.706)

	Surface
	{
		SurfStyle       0.0279874
		OceanStyle      0.888372
		Randomize      (0.184, -0.761, 0.041)
		colorDistMagn   0.174109
		colorDistFreq   0.0841611
		detailScale     427.529
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993822
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494151
		terraceProb     0.362535
		erosion         0
		montesMagn      0.403732
		montesFreq      2.99758
		montesSpiky     0.97997
		montesFraction  0.598908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.433241
		hillsFraction   0.709352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267637
		craterFreq      0.250007
		craterDensity   0.710674
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531702
		volcanoTemp     1437.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.282, 0.000)
		colorShelf     (0.301, 0.301, 0.300, 0.000)
		colorBeach     (0.319, 0.318, 0.317, 0.000)
		colorDesert    (0.337, 0.336, 0.335, 0.000)
		colorLowland   (0.355, 0.354, 0.353, 0.000)
		colorUpland    (0.372, 0.371, 0.370, 0.000)
		colorRock      (0.390, 0.389, 0.388, 0.000)
		colorSnow      (0.408, 0.407, 0.406, 1.000)
		BumpHeight      14.0909
		BumpOffset      2.81818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.778107
		GasToDust   0.25
		Particles   2551
		GasBright   0.0434307
		DustBright  0.331738
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   510.589
		Period          3214.46
		Eccentricity    0.840138
		Inclination     35.9214
		AscendingNode   101.311
		ArgOfPericenter -29.1243
		MeanAnomaly     -1.17248
	}
}

Comet	"C69"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.95846e-017
	Radius          0.0536162
	InertiaMoment   0.398605

	Oblateness      0.00422562

	RotationPeriod  83.606
	Obliquity       223.494
	EqAscendNode    47.2923

	AbsMagn         13.8021
	SlopeParam      4.86802
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.643 0.637)

	Surface
	{
		SurfStyle       0.659087
		OceanStyle      0.823016
		Randomize      (-0.670, 0.651, -0.446)
		colorDistMagn   0.981368
		colorDistFreq   2.17946e-006
		detailScale     1.46408
		colorConversion true
		snowLevel       2
		tropicLatitude  0.654288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.320652
		terraceProb     0.156547
		erosion         0
		montesMagn      0.553422
		montesFreq      3.55816
		montesSpiky     0.908592
		montesFraction  0.650954
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.75002e-006
		hillsFraction   0.618754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255627
		craterFreq      0.236242
		craterDensity   0.935294
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46741
		volcanoTemp     1683.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.218, 0.178, 0.000)
		colorShelf     (0.258, 0.225, 0.204, 0.000)
		colorBeach     (0.303, 0.263, 0.242, 0.000)
		colorDesert    (0.329, 0.283, 0.236, 0.000)
		colorLowland   (0.361, 0.302, 0.268, 0.000)
		colorUpland    (0.400, 0.366, 0.325, 0.000)
		colorRock      (0.432, 0.398, 0.351, 0.000)
		colorSnow      (0.471, 0.424, 0.370, 1.000)
		BumpHeight      0.0482546
		BumpOffset      0.00965092
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.150275
		DustBright  0.70938
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   520.783
		Period          3311.21
		Eccentricity    0.883901
		Inclination     20.6566
		AscendingNode   -108.598
		ArgOfPericenter 24.4116
		MeanAnomaly     -131.223
	}
}

Comet	"C70"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.83502e-013
	Radius          0.969558
	InertiaMoment   0.396365

	Oblateness      0.00343298

	RotationPeriod  80.7661
	Obliquity       176.7
	EqAscendNode    31.8697

	AbsMagn         8.89777
	SlopeParam      5.54396
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.811 0.750 0.715)

	Surface
	{
		SurfStyle       0.341578
		OceanStyle      0.500014
		Randomize      (-0.729, -0.850, -0.329)
		colorDistMagn   0.994773
		colorDistFreq   0.000776087
		detailScale     26.4754
		colorConversion true
		snowLevel       2
		tropicLatitude  0.527887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640203
		terraceProb     0.383368
		erosion         0
		montesMagn      0.489353
		montesFreq      3.21408
		montesSpiky     0.933977
		montesFraction  0.159842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00249604
		hillsFraction   0.755226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213561
		craterFreq      0.232258
		craterDensity   0.765648
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510183
		volcanoTemp     1468.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.300, 0.286, 0.000)
		colorShelf     (0.345, 0.319, 0.304, 0.000)
		colorBeach     (0.365, 0.337, 0.322, 0.000)
		colorDesert    (0.385, 0.356, 0.339, 0.000)
		colorLowland   (0.406, 0.375, 0.357, 0.000)
		colorUpland    (0.426, 0.394, 0.375, 0.000)
		colorRock      (0.446, 0.412, 0.393, 0.000)
		colorSnow      (0.467, 0.431, 0.411, 1.000)
		BumpHeight      0.872602
		BumpOffset      0.17452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.329741
		GasToDust   0.25
		Particles   1645
		GasBright   0.12725
		DustBright  0.416892
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   471.127
		Period          2849.1
		Eccentricity    0.861506
		Inclination     151.1
		AscendingNode   27.4065
		ArgOfPericenter 108.399
		MeanAnomaly     -130.695
	}
}

Comet	"C71"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.9661e-009
	Radius          20.9521
	InertiaMoment   0.3991

	Oblateness      0.00483765

	RotationPeriod  78.1168
	Obliquity       129.905
	EqAscendNode    16.4471

	AbsMagn         5.31516
	SlopeParam      6.47461
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.658 0.502 0.366)

	Surface
	{
		SurfStyle       0.621159
		OceanStyle      0.733504
		Randomize      (0.176, 0.340, 0.104)
		colorDistMagn   0.462189
		colorDistFreq   0.293027
		detailScale     572.131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.46826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620176
		terraceProb     0.26056
		erosion         0
		montesMagn      0.587351
		montesFreq      2.8598
		montesSpiky     0.918242
		montesFraction  0.50557
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21266
		hillsFraction   0.83499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263617
		craterFreq      0.181736
		craterDensity   0.903772
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53785
		volcanoTemp     1338.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.171, 0.102, 0.000)
		colorShelf     (0.263, 0.176, 0.117, 0.000)
		colorBeach     (0.309, 0.206, 0.139, 0.000)
		colorDesert    (0.336, 0.221, 0.135, 0.000)
		colorLowland   (0.369, 0.236, 0.154, 0.000)
		colorUpland    (0.408, 0.286, 0.187, 0.000)
		colorRock      (0.441, 0.311, 0.201, 0.000)
		colorSnow      (0.481, 0.331, 0.212, 1.000)
		BumpHeight      18.8568
		BumpOffset      3.77137
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.810933
		GasToDust   0.25
		Particles   2618
		GasBright   0.066965
		DustBright  0.161663
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   313.885
		Period          1549.38
		Eccentricity    0.76441
		Inclination     27.95
		AscendingNode   -28.1893
		ArgOfPericenter -67.9823
		MeanAnomaly     -128.433
	}
}

Comet	"C72"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            9.13288e-017
	Radius          0.0600405
	InertiaMoment   0.397631

	Oblateness      0.0039235

	RotationPeriod  75.6214
	Obliquity       83.1112
	EqAscendNode    1.02451

	AbsMagn         13.2597
	SlopeParam      2.03352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.630 0.627)

	Surface
	{
		SurfStyle       0.137582
		OceanStyle      0.441991
		Randomize      (-0.786, 0.437, 0.507)
		colorDistMagn   0.217373
		colorDistFreq   2.24144e-006
		detailScale     1.63951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.865724
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516428
		terraceProb     0.396925
		erosion         0
		montesMagn      0.371503
		montesFreq      2.67146
		montesSpiky     0.947299
		montesFraction  0.749073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.36383e-006
		hillsFraction   0.52468
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221465
		craterFreq      0.238392
		craterDensity   0.726285
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.577518
		volcanoTemp     1160.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.252, 0.251, 0.000)
		colorShelf     (0.268, 0.268, 0.266, 0.000)
		colorBeach     (0.284, 0.283, 0.282, 0.000)
		colorDesert    (0.300, 0.299, 0.298, 0.000)
		colorLowland   (0.316, 0.315, 0.314, 0.000)
		colorUpland    (0.331, 0.331, 0.329, 0.000)
		colorRock      (0.347, 0.346, 0.345, 0.000)
		colorSnow      (0.363, 0.362, 0.361, 1.000)
		BumpHeight      0.0540365
		BumpOffset      0.0108073
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.250977
		DustBright  0.462138
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   278.703
		Period          1296.32
		Eccentricity    0.771321
		Inclination     112.278
		AscendingNode   -60.3082
		ArgOfPericenter 88.6955
		MeanAnomaly     -50.9627
	}
}

Comet	"C73"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.06362e-013
	Radius          1.29766
	InertiaMoment   0.399544

	Oblateness      0.00549752

	RotationPeriod  73.2521
	Obliquity       36.3169
	EqAscendNode    345.602

	AbsMagn         8.68498
	SlopeParam      2.80341
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.548 0.544 0.539)

	Surface
	{
		SurfStyle       0.52648
		OceanStyle      0.790692
		Randomize      (0.395, 0.100, 0.134)
		colorDistMagn   0.378118
		colorDistFreq   0.000790185
		detailScale     35.4347
		colorConversion true
		snowLevel       2
		tropicLatitude  0.896293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699702
		terraceProb     0.119348
		erosion         0
		montesMagn      0.650719
		montesFreq      2.33961
		montesSpiky     0.953182
		montesFraction  0.477227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00439911
		hillsFraction   0.684437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239141
		craterFreq      0.210297
		craterDensity   0.848618
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469118
		volcanoTemp     1520.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.185, 0.151, 0.000)
		colorShelf     (0.219, 0.190, 0.172, 0.000)
		colorBeach     (0.257, 0.223, 0.205, 0.000)
		colorDesert    (0.279, 0.239, 0.199, 0.000)
		colorLowland   (0.307, 0.256, 0.226, 0.000)
		colorUpland    (0.339, 0.310, 0.275, 0.000)
		colorRock      (0.367, 0.337, 0.296, 0.000)
		colorSnow      (0.400, 0.359, 0.312, 1.000)
		BumpHeight      1.16789
		BumpOffset      0.233578
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.362567
		GasToDust   0.25
		Particles   1712
		GasBright   0.16341
		DustBright  0.234192
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   307.501
		Period          1502.35
		Eccentricity    0.831746
		Inclination     -32.2623
		AscendingNode   -138.807
		ArgOfPericenter -12.9926
		MeanAnomaly     -117.026
	}
}

Comet	"C74"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.4632e-009
	Radius          23.459
	InertiaMoment   0.398328

	Oblateness      0.00445133

	RotationPeriod  70.9875
	Obliquity       349.523
	EqAscendNode    330.179

	AbsMagn         5.04771
	SlopeParam      3.42518
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.580 0.577 0.573)

	Surface
	{
		SurfStyle       0.76908
		OceanStyle      0.315793
		Randomize      (-0.587, 0.735, 0.384)
		colorDistMagn   0.663234
		colorDistFreq   0.265898
		detailScale     640.586
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579614
		terraceProb     0.514429
		erosion         0
		montesMagn      0.580578
		montesFreq      1.86841
		montesSpiky     0.915957
		montesFraction  0.302936
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06741
		hillsFraction   0.70152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221199
		craterFreq      0.184775
		craterDensity   0.857204
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558533
		volcanoTemp     1638.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.196, 0.160, 0.000)
		colorShelf     (0.232, 0.202, 0.183, 0.000)
		colorBeach     (0.272, 0.237, 0.218, 0.000)
		colorDesert    (0.296, 0.254, 0.212, 0.000)
		colorLowland   (0.325, 0.271, 0.241, 0.000)
		colorUpland    (0.359, 0.329, 0.292, 0.000)
		colorRock      (0.388, 0.358, 0.315, 0.000)
		colorSnow      (0.423, 0.381, 0.332, 1.000)
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
		MaxLength   0.843759
		GasToDust   0.25
		Particles   2684
		GasBright   0.414612
		DustBright  0.467476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   372.821
		Period          2005.63
		Eccentricity    0.827725
		Inclination     -79.6833
		AscendingNode   112.004
		ArgOfPericenter -134.321
		MeanAnomaly     101.198
	}
}

Comet	"C75"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.68216e-016
	Radius          0.0803702
	InertiaMoment   0.399967

	Oblateness      0.00622519

	RotationPeriod  68.8104
	Obliquity       302.728
	EqAscendNode    314.757

	AbsMagn         12.7999
	SlopeParam      3.99486
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.630 0.628)

	Surface
	{
		SurfStyle       0.148128
		OceanStyle      0.437224
		Randomize      (-0.838, 0.240, 0.936)
		colorDistMagn   0.0146633
		colorDistFreq   2.43195e-006
		detailScale     2.19464
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894754
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59604
		terraceProb     0.398469
		erosion         0
		montesMagn      0.597304
		montesFreq      2.65516
		montesSpiky     0.790575
		montesFraction  0.29244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.52693e-005
		hillsFraction   0.695908
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233152
		craterFreq      0.238704
		craterDensity   0.870901
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571743
		volcanoTemp     1884.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.252, 0.251, 0.000)
		colorShelf     (0.270, 0.268, 0.267, 0.000)
		colorBeach     (0.286, 0.283, 0.283, 0.000)
		colorDesert    (0.301, 0.299, 0.298, 0.000)
		colorLowland   (0.317, 0.315, 0.314, 0.000)
		colorUpland    (0.333, 0.331, 0.330, 0.000)
		colorRock      (0.349, 0.346, 0.345, 0.000)
		colorSnow      (0.365, 0.362, 0.361, 1.000)
		BumpHeight      0.0723332
		BumpOffset      0.0144666
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0164759
		DustBright  0.550099
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   495.083
		Period          3069.14
		Eccentricity    0.91522
		Inclination     -68.7546
		AscendingNode   34.9744
		ArgOfPericenter -166.685
		MeanAnomaly     118.319
	}
}

Comet	"C76"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.30103e-012
	Radius          1.45267
	InertiaMoment   0.398864

	Oblateness      0.00503639

	RotationPeriod  66.707
	Obliquity       255.934
	EqAscendNode    299.334

	AbsMagn         8.47412
	SlopeParam      4.56412
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.733 0.730)

	Surface
	{
		SurfStyle       0.165589
		OceanStyle      0.0861302
		Randomize      (-0.202, 0.279, -0.700)
		colorDistMagn   0.656412
		colorDistFreq   0.00161056
		detailScale     39.6676
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973197
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611322
		terraceProb     0.4004
		erosion         0
		montesMagn      0.597752
		montesFreq      3.17381
		montesSpiky     0.744013
		montesFraction  0.361867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00580479
		hillsFraction   0.440976
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24665
		craterFreq      0.166107
		craterDensity   0.806775
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469923
		volcanoTemp     1790.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.292, 0.000)
		colorShelf     (0.312, 0.312, 0.310, 0.000)
		colorBeach     (0.330, 0.330, 0.329, 0.000)
		colorDesert    (0.349, 0.348, 0.347, 0.000)
		colorLowland   (0.367, 0.367, 0.365, 0.000)
		colorUpland    (0.386, 0.385, 0.383, 0.000)
		colorRock      (0.404, 0.403, 0.402, 0.000)
		colorSnow      (0.422, 0.421, 0.420, 1.000)
		BumpHeight      1.3074
		BumpOffset      0.261481
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.395393
		GasToDust   0.25
		Particles   1778
		GasBright   0.0221248
		DustBright  0.228936
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   276.008
		Period          1277.56
		Eccentricity    0.773684
		Inclination     8.70043
		AscendingNode   85.9858
		ArgOfPericenter 123.479
		MeanAnomaly     -4.46354
	}
}

Comet	"C77"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.00625e-008
	Radius          31.4075
	InertiaMoment   0.397147

	Oblateness      0.00695818

	RotationPeriod  64.6656
	Obliquity       209.14
	EqAscendNode    283.912

	AbsMagn         4.76635
	SlopeParam      5.18432
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.784 0.783)

	Surface
	{
		SurfStyle       0.573426
		OceanStyle      0.781831
		Randomize      (-0.574, 0.718, -0.872)
		colorDistMagn   0.66665
		colorDistFreq   0.454405
		detailScale     857.633
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928095
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634062
		terraceProb     0.355889
		erosion         0
		montesMagn      0.50929
		montesFreq      2.83848
		montesSpiky     0.997328
		montesFraction  0.755886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.07407
		hillsFraction   0.710738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238779
		craterFreq      0.20555
		craterDensity   0.978826
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.453417
		volcanoTemp     1457.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.267, 0.219, 0.000)
		colorShelf     (0.315, 0.274, 0.251, 0.000)
		colorBeach     (0.370, 0.321, 0.297, 0.000)
		colorDesert    (0.401, 0.345, 0.290, 0.000)
		colorLowland   (0.440, 0.368, 0.329, 0.000)
		colorUpland    (0.488, 0.447, 0.399, 0.000)
		colorRock      (0.527, 0.486, 0.431, 0.000)
		colorSnow      (0.574, 0.517, 0.454, 1.000)
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
		MaxLength   0.876585
		GasToDust   0.25
		Particles   2750
		GasBright   0.108251
		DustBright  0.627297
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   452.384
		Period          2680.78
		Eccentricity    0.801851
		Inclination     93.9201
		AscendingNode   -152.794
		ArgOfPericenter 5.75445
		MeanAnomaly     -11.8718
	}
}

Comet	"C78"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.09833e-016
	Radius          0.0899537
	InertiaMoment   0.399329

	Oblateness      0.00569803

	RotationPeriod  62.6764
	Obliquity       162.345
	EqAscendNode    268.489

	AbsMagn         12.396
	SlopeParam      5.94988
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.469 0.426)

	Surface
	{
		SurfStyle       0.00310762
		OceanStyle      0.954508
		Randomize      (0.280, -0.652, -0.354)
		colorDistMagn   0.163855
		colorDistFreq   6.48901e-006
		detailScale     2.45634
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630242
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346653
		terraceProb     0.232583
		erosion         0
		montesMagn      0.389736
		montesFreq      2.86078
		montesSpiky     0.951095
		montesFraction  0.629937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0291e-005
		hillsFraction   0.857925
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204807
		craterFreq      0.216792
		craterDensity   0.811089
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54709
		volcanoTemp     1644.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.188, 0.171, 0.000)
		colorShelf     (0.246, 0.199, 0.181, 0.000)
		colorBeach     (0.261, 0.211, 0.192, 0.000)
		colorDesert    (0.275, 0.223, 0.202, 0.000)
		colorLowland   (0.290, 0.235, 0.213, 0.000)
		colorUpland    (0.304, 0.246, 0.224, 0.000)
		colorRock      (0.319, 0.258, 0.234, 0.000)
		colorSnow      (0.333, 0.270, 0.245, 1.000)
		BumpHeight      0.0809583
		BumpOffset      0.0161917
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0866176
		DustBright  0.333417
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   302.041
		Period          1462.51
		Eccentricity    0.750923
		Inclination     -32.6409
		AscendingNode   80.8512
		ArgOfPericenter 83.3974
		MeanAnomaly     118.767
	}
}

Comet	"C79"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.39633e-012
	Radius          1.94524
	InertiaMoment   0.398014

	Oblateness      0.00789607

	RotationPeriod  60.7311
	Obliquity       115.551
	EqAscendNode    253.066

	AbsMagn         8.26457
	SlopeParam      7.23811
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.587 0.513)

	Surface
	{
		SurfStyle       0.15717
		OceanStyle      0.955236
		Randomize      (0.966, -0.772, -0.874)
		colorDistMagn   0.434225
		colorDistFreq   0.00243087
		detailScale     53.118
		colorConversion true
		snowLevel       2
		tropicLatitude  0.821552
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702009
		terraceProb     0.107497
		erosion         0
		montesMagn      0.624692
		montesFreq      3.64903
		montesSpiky     0.954972
		montesFraction  0.517278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00688785
		hillsFraction   0.553355
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246974
		craterFreq      0.274802
		craterDensity   0.718328
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.443324
		volcanoTemp     1527.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.235, 0.205, 0.000)
		colorShelf     (0.282, 0.250, 0.218, 0.000)
		colorBeach     (0.299, 0.264, 0.231, 0.000)
		colorDesert    (0.315, 0.279, 0.244, 0.000)
		colorLowland   (0.332, 0.294, 0.257, 0.000)
		colorUpland    (0.348, 0.308, 0.269, 0.000)
		colorRock      (0.365, 0.323, 0.282, 0.000)
		colorSnow      (0.382, 0.338, 0.295, 1.000)
		BumpHeight      1.75072
		BumpOffset      0.350143
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.428219
		GasToDust   0.25
		Particles   1844
		GasBright   0.239934
		DustBright  0.664587
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   396.043
		Period          2195.91
		Eccentricity    0.838525
		Inclination     170.508
		AscendingNode   166.581
		ArgOfPericenter -161.774
		MeanAnomaly     64.7756
	}
}

Comet	"C80"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.85339e-008
	Radius          35.145
	InertiaMoment   0.399759

	Oblateness      0.00646016

	RotationPeriod  58.8223
	Obliquity       68.7568
	EqAscendNode    237.644

	AbsMagn         4.46801
	SlopeParam      2.44216
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.482 0.480 0.477)

	Surface
	{
		SurfStyle       0.0739898
		OceanStyle      0.166729
		Randomize      (-0.391, -0.887, -0.627)
		colorDistMagn   0.659072
		colorDistFreq   0.915605
		detailScale     959.692
		colorConversion true
		snowLevel       2
		tropicLatitude  0.846106
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548611
		terraceProb     0.306353
		erosion         0
		montesMagn      0.614194
		montesFreq      2.90652
		montesSpiky     0.952728
		montesFraction  0.608606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.99538
		hillsFraction   0.488045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278289
		craterFreq      0.225736
		craterDensity   0.579963
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503246
		volcanoTemp     1701.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.192, 0.191, 0.000)
		colorShelf     (0.205, 0.204, 0.203, 0.000)
		colorBeach     (0.217, 0.216, 0.215, 0.000)
		colorDesert    (0.229, 0.228, 0.227, 0.000)
		colorLowland   (0.241, 0.240, 0.239, 0.000)
		colorUpland    (0.253, 0.252, 0.250, 0.000)
		colorRock      (0.265, 0.264, 0.262, 0.000)
		colorSnow      (0.277, 0.276, 0.274, 1.000)
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
		MaxLength   0.909411
		GasToDust   0.25
		Particles   2816
		GasBright   0.191019
		DustBright  0.397989
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   418.681
		Period          2386.85
		Eccentricity    0.85847
		Inclination     -11.0008
		AscendingNode   -4.35004
		ArgOfPericenter 13.3576
		MeanAnomaly     -162.541
	}
}

Comet	"C81"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.70672e-016
	Radius          0.12048
	InertiaMoment   0.398612

	Oblateness      0.0089806

	RotationPeriod  56.9435
	Obliquity       21.9625
	EqAscendNode    222.221

	AbsMagn         12.0326
	SlopeParam      3.12067
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.740 0.657 0.573)

	Surface
	{
		SurfStyle       0.294035
		OceanStyle      0.23243
		Randomize      (-0.531, -0.161, 0.808)
		colorDistMagn   0.738837
		colorDistFreq   4.84032e-006
		detailScale     3.2899
		colorConversion true
		snowLevel       2
		tropicLatitude  0.100742
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614003
		terraceProb     0.286991
		erosion         0
		montesMagn      0.401
		montesFreq      2.71134
		montesSpiky     0.961083
		montesFraction  0.640431
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.0431e-005
		hillsFraction   0.59254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234439
		craterFreq      0.22113
		craterDensity   0.884582
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49458
		volcanoTemp     1426.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.263, 0.229, 0.000)
		colorShelf     (0.315, 0.279, 0.244, 0.000)
		colorBeach     (0.333, 0.296, 0.258, 0.000)
		colorDesert    (0.352, 0.312, 0.272, 0.000)
		colorLowland   (0.370, 0.328, 0.287, 0.000)
		colorUpland    (0.389, 0.345, 0.301, 0.000)
		colorRock      (0.407, 0.361, 0.315, 0.000)
		colorSnow      (0.426, 0.378, 0.330, 1.000)
		BumpHeight      0.108432
		BumpOffset      0.0216864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.104844
		DustBright  0.16865
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   338.498
		Period          1735.14
		Eccentricity    0.882168
		Inclination     152.632
		AscendingNode   4.94692
		ArgOfPericenter 74.4179
		MeanAnomaly     21.6249
	}
}

Comet	"C82"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.41374e-012
	Radius          2.17621
	InertiaMoment   0.396392

	Oblateness      0.00725085

	RotationPeriod  55.0887
	Obliquity       335.168
	EqAscendNode    206.799

	AbsMagn         8.05575
	SlopeParam      3.70905
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.795 0.792 0.791)

	Surface
	{
		SurfStyle       0.947133
		OceanStyle      0.867705
		Randomize      (0.850, -0.259, -0.778)
		colorDistMagn   0.170948
		colorDistFreq   0.00279033
		detailScale     59.425
		colorConversion true
		snowLevel       2
		tropicLatitude  0.446705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51812
		terraceProb     0.228015
		erosion         0
		montesMagn      0.463977
		montesFreq      3.88074
		montesSpiky     0.955772
		montesFraction  0.507338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0103042
		hillsFraction   0.758226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243633
		craterFreq      0.220343
		craterDensity   0.927367
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527901
		volcanoTemp     1584.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.277, 0.316, 0.050)
		colorShelf     (0.318, 0.325, 0.364, 0.040)
		colorBeach     (0.366, 0.372, 0.411, 0.030)
		colorDesert    (0.414, 0.420, 0.467, 0.020)
		colorLowland   (0.461, 0.468, 0.514, 0.030)
		colorUpland    (0.509, 0.515, 0.561, 0.050)
		colorRock      (0.557, 0.563, 0.625, 0.020)
		colorSnow      (0.557, 0.563, 0.625, 1.000)
		BumpHeight      1.95859
		BumpOffset      0.391717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.461045
		GasToDust   0.25
		Particles   1911
		GasBright   0.335328
		DustBright  0.422653
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   340.166
		Period          1747.98
		Eccentricity    0.739482
		Inclination     -2.06899
		AscendingNode   -35.9657
		ArgOfPericenter 159.861
		MeanAnomaly     73.4301
	}
}

Comet	"C83"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.41372e-008
	Radius          47.0824
	InertiaMoment   0.399106

	Oblateness      0.0102638

	RotationPeriod  53.2526
	Obliquity       288.374
	EqAscendNode    191.376

	AbsMagn         4.14858
	SlopeParam      4.27278
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.560 0.557)

	Surface
	{
		SurfStyle       0.752456
		OceanStyle      0.758852
		Randomize      (-0.780, -0.213, 0.334)
		colorDistMagn   0.961038
		colorDistFreq   1.54897
		detailScale     1285.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.941928
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589885
		terraceProb     0.151708
		erosion         0
		montesMagn      0.39931
		montesFreq      2.74621
		montesSpiky     0.997999
		montesFraction  0.88147
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.77383
		hillsFraction   0.4374
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246804
		craterFreq      0.185601
		craterDensity   0.927372
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523155
		volcanoTemp     1641.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.190, 0.156, 0.000)
		colorShelf     (0.226, 0.196, 0.178, 0.000)
		colorBeach     (0.266, 0.229, 0.211, 0.000)
		colorDesert    (0.289, 0.246, 0.206, 0.000)
		colorLowland   (0.317, 0.263, 0.234, 0.000)
		colorUpland    (0.351, 0.319, 0.284, 0.000)
		colorRock      (0.379, 0.347, 0.306, 0.000)
		colorSnow      (0.413, 0.369, 0.323, 1.000)
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
		MaxLength   0.942237
		GasToDust   0.25
		Particles   2883
		GasBright   0.000637982
		DustBright  0.441829
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   444.111
		Period          2607.58
		Eccentricity    0.820662
		Inclination     168.872
		AscendingNode   98.3267
		ArgOfPericenter 101.007
		MeanAnomaly     104.669
	}
}

Comet	"C84"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.05111e-015
	Radius          0.13475
	InertiaMoment   0.397641

	Oblateness      0.00833226

	RotationPeriod  51.43
	Obliquity       241.58
	EqAscendNode    175.953

	AbsMagn         11.6998
	SlopeParam      4.85955
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.657 0.582)

	Surface
	{
		SurfStyle       0.55676
		OceanStyle      0.739065
		Randomize      (-0.266, 0.764, -0.993)
		colorDistMagn   0.431572
		colorDistFreq   1.01609e-005
		detailScale     3.67958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556715
		terraceProb     0.554903
		erosion         0
		montesMagn      0.505652
		montesFreq      2.75432
		montesSpiky     0.702208
		montesFraction  0.50617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.42276e-005
		hillsFraction   0.859898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206749
		craterFreq      0.246405
		craterDensity   0.883795
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508074
		volcanoTemp     1581.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.223, 0.163, 0.000)
		colorShelf     (0.282, 0.230, 0.186, 0.000)
		colorBeach     (0.331, 0.269, 0.221, 0.000)
		colorDesert    (0.359, 0.289, 0.215, 0.000)
		colorLowland   (0.395, 0.309, 0.244, 0.000)
		colorUpland    (0.437, 0.374, 0.297, 0.000)
		colorRock      (0.472, 0.407, 0.320, 0.000)
		colorSnow      (0.515, 0.434, 0.337, 1.000)
		BumpHeight      0.121275
		BumpOffset      0.024255
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0126788
		GasToDust   0.25
		Particles   1005
		GasBright   0.0560688
		DustBright  0.870885
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   466.019
		Period          2802.89
		Eccentricity    0.903714
		Inclination     61.3971
		AscendingNode   -58.4759
		ArgOfPericenter 62.4375
		MeanAnomaly     151.634
	}
}

Comet	"C85"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            8.12956e-012
	Radius          2.91612
	InertiaMoment   0.399549

	Oblateness      0.0118158

	RotationPeriod  49.6162
	Obliquity       194.785
	EqAscendNode    160.531

	AbsMagn         7.84707
	SlopeParam      5.53358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.573 0.536)

	Surface
	{
		SurfStyle       0.840609
		OceanStyle      0.0861461
		Randomize      (0.707, -0.836, 0.258)
		colorDistMagn   0.389969
		colorDistFreq   0.00577384
		detailScale     79.6294
		colorConversion true
		snowLevel       2
		tropicLatitude  0.220095
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55923
		terraceProb     0.48578
		erosion         0
		montesMagn      0.442763
		montesFreq      3.59528
		montesSpiky     0.915475
		montesFraction  0.70447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0203572
		hillsFraction   0.520645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224772
		craterFreq      0.249867
		craterDensity   0.785114
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506069
		volcanoTemp     1538.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.195, 0.150, 0.000)
		colorShelf     (0.257, 0.201, 0.171, 0.000)
		colorBeach     (0.303, 0.235, 0.204, 0.000)
		colorDesert    (0.328, 0.252, 0.198, 0.000)
		colorLowland   (0.360, 0.269, 0.225, 0.000)
		colorUpland    (0.399, 0.327, 0.273, 0.000)
		colorRock      (0.431, 0.355, 0.295, 0.000)
		colorSnow      (0.470, 0.378, 0.311, 1.000)
		BumpHeight      2.6245
		BumpOffset      0.524901
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.493871
		GasToDust   0.25
		Particles   1977
		GasBright   0.0730869
		DustBright  0.538354
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   404.201
		Period          2264.11
		Eccentricity    0.771811
		Inclination     -172.659
		AscendingNode   120.429
		ArgOfPericenter -116.635
		MeanAnomaly     16.6706
	}
}

Comet	"C86"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.28763e-008
	Radius          52.6442
	InertiaMoment   0.398335

	Oblateness      0.00963772

	RotationPeriod  47.8065
	Obliquity       147.991
	EqAscendNode    145.108

	AbsMagn         3.80248
	SlopeParam      6.45811
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.702 0.699)

	Surface
	{
		SurfStyle       0.50753
		OceanStyle      0.597405
		Randomize      (0.667, -0.041, 0.822)
		colorDistMagn   0.717665
		colorDistFreq   1.76321
		detailScale     1437.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.869309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.430672
		terraceProb     0.132557
		erosion         0
		montesMagn      0.588601
		montesFreq      3.05243
		montesSpiky     0.907218
		montesFraction  0.841096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.47433
		hillsFraction   0.638001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243516
		craterFreq      0.156765
		craterDensity   0.885824
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552583
		volcanoTemp     1545.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.239, 0.196, 0.000)
		colorShelf     (0.282, 0.246, 0.224, 0.000)
		colorBeach     (0.332, 0.288, 0.266, 0.000)
		colorDesert    (0.360, 0.309, 0.259, 0.000)
		colorLowland   (0.395, 0.330, 0.294, 0.000)
		colorUpland    (0.437, 0.400, 0.357, 0.000)
		colorRock      (0.473, 0.435, 0.385, 0.000)
		colorSnow      (0.515, 0.463, 0.406, 1.000)
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
		MaxLength   0.975063
		GasToDust   0.25
		Particles   2949
		GasBright   0.0528459
		DustBright  0.243081
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   148.385
		Period          503.6
		Eccentricity    0.838599
		Inclination     -76.5998
		AscendingNode   125.272
		ArgOfPericenter 50.6016
		MeanAnomaly     -19.4474
	}
}

Comet	"C87"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.93601e-015
	Radius          0.180615
	InertiaMoment   0.399972

	Oblateness      0.013739

	RotationPeriod  45.9963
	Obliquity       101.197
	EqAscendNode    129.686

	AbsMagn         11.3907
	SlopeParam      2.02097
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.469 0.465 0.459)

	Surface
	{
		SurfStyle       0.273775
		OceanStyle      0.0054252
		Randomize      (0.714, 0.941, 0.913)
		colorDistMagn   0.508449
		colorDistFreq   2.04002e-005
		detailScale     4.93198
		colorConversion true
		snowLevel       2
		tropicLatitude  0.617074
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476256
		terraceProb     0.528663
		erosion         0
		montesMagn      0.517195
		montesFreq      2.43673
		montesSpiky     0.882944
		montesFraction  0.253509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.87348e-005
		hillsFraction   0.703811
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21664
		craterFreq      0.196975
		craterDensity   0.848864
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488879
		volcanoTemp     2017.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.186, 0.184, 0.000)
		colorShelf     (0.199, 0.198, 0.195, 0.000)
		colorBeach     (0.211, 0.209, 0.207, 0.000)
		colorDesert    (0.223, 0.221, 0.218, 0.000)
		colorLowland   (0.234, 0.233, 0.230, 0.000)
		colorUpland    (0.246, 0.244, 0.241, 0.000)
		colorRock      (0.258, 0.256, 0.253, 0.000)
		colorSnow      (0.270, 0.267, 0.264, 1.000)
		BumpHeight      0.162553
		BumpOffset      0.0325106
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0455048
		GasToDust   0.25
		Particles   1071
		GasBright   0.185444
		DustBright  0.594969
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   389.539
		Period          2142.03
		Eccentricity    0.860132
		Inclination     -79.2367
		AscendingNode   -31.3322
		ArgOfPericenter 123.761
		MeanAnomaly     -106.197
	}
}

Comet	"C88"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.49736e-011
	Radius          3.25958
	InertiaMoment   0.39887

	Oblateness      0.0112705

	RotationPeriod  44.1811
	Obliquity       54.4024
	EqAscendNode    114.263

	AbsMagn         7.63798
	SlopeParam      2.79417
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.690 0.686 0.683)

	Surface
	{
		SurfStyle       0.197165
		OceanStyle      0.706244
		Randomize      (-0.371, 0.375, 0.535)
		colorDistMagn   0.680583
		colorDistFreq   0.00495708
		detailScale     89.0083
		colorConversion true
		snowLevel       2
		tropicLatitude  0.820332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566463
		terraceProb     0.27193
		erosion         0
		montesMagn      0.53057
		montesFreq      4.09941
		montesSpiky     0.965406
		montesFraction  0.790325
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0222809
		hillsFraction   0.656716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248339
		craterFreq      0.266148
		craterDensity   0.880993
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55042
		volcanoTemp     1392.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.275, 0.273, 0.000)
		colorShelf     (0.293, 0.292, 0.290, 0.000)
		colorBeach     (0.310, 0.309, 0.307, 0.000)
		colorDesert    (0.328, 0.326, 0.324, 0.000)
		colorLowland   (0.345, 0.343, 0.341, 0.000)
		colorUpland    (0.362, 0.360, 0.358, 0.000)
		colorRock      (0.379, 0.377, 0.376, 0.000)
		colorSnow      (0.397, 0.395, 0.393, 1.000)
		BumpHeight      2.93362
		BumpOffset      0.586725
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.526697
		GasToDust   0.25
		Particles   2043
		GasBright   0.137921
		DustBright  0.326979
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   392.765
		Period          2168.7
		Eccentricity    0.833486
		Inclination     -178.968
		AscendingNode   46.3309
		ArgOfPericenter -116.697
		MeanAnomaly     5.08616
	}
}

Comet	"C89"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.1581e-007
	Radius          70.5834
	InertiaMoment   0.397161

	Oblateness      0.0159957

	RotationPeriod  42.356
	Obliquity       7.60811
	EqAscendNode    98.8405

	AbsMagn         3.42172
	SlopeParam      3.41713
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.606 0.534)

	Surface
	{
		SurfStyle       0.593769
		OceanStyle      0.424735
		Randomize      (-0.523, 0.565, -0.246)
		colorDistMagn   0.629929
		colorDistFreq   1.73543
		detailScale     1927.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.288664
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737744
		terraceProb     0.272067
		erosion         0
		montesMagn      0.355767
		montesFreq      3.0214
		montesSpiky     0.697261
		montesFraction  0.626874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.37024
		hillsFraction   0.605879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253314
		craterFreq      0.171034
		craterDensity   0.938363
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504733
		volcanoTemp     1259.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.206, 0.150, 0.000)
		colorShelf     (0.283, 0.212, 0.171, 0.000)
		colorBeach     (0.332, 0.249, 0.203, 0.000)
		colorDesert    (0.361, 0.267, 0.198, 0.000)
		colorLowland   (0.396, 0.285, 0.224, 0.000)
		colorUpland    (0.438, 0.346, 0.273, 0.000)
		colorRock      (0.474, 0.376, 0.294, 0.000)
		colorSnow      (0.516, 0.400, 0.310, 1.000)
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
		GasBright   0.33771
		DustBright  0.611677
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   182.604
		Period          687.491
		Eccentricity    0.737892
		Inclination     14.0535
		AscendingNode   82.6747
		ArgOfPericenter -77.9368
		MeanAnomaly     134.792
	}
}

Comet	"C90"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.56588e-015
	Radius          0.20182
	InertiaMoment   0.399334

	Oblateness      0.0133806

	RotationPeriod  40.5164
	Obliquity       320.814
	EqAscendNode    83.4179

	AbsMagn         11.1007
	SlopeParam      3.98715
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.431 0.428 0.422)

	Surface
	{
		SurfStyle       0.397836
		OceanStyle      0.0752341
		Randomize      (-0.645, -0.086, -0.278)
		colorDistMagn   0.368938
		colorDistFreq   1.05681e-005
		detailScale     5.51102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.813465
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307026
		terraceProb     0.147066
		erosion         0
		montesMagn      0.555698
		montesFreq      2.87401
		montesSpiky     0.863536
		montesFraction  0.493611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.51257e-005
		hillsFraction   0.739345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221287
		craterFreq      0.277752
		craterDensity   0.954432
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478162
		volcanoTemp     1457.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.171, 0.169, 0.000)
		colorShelf     (0.183, 0.182, 0.180, 0.000)
		colorBeach     (0.194, 0.193, 0.190, 0.000)
		colorDesert    (0.205, 0.203, 0.201, 0.000)
		colorLowland   (0.216, 0.214, 0.211, 0.000)
		colorUpland    (0.226, 0.225, 0.222, 0.000)
		colorRock      (0.237, 0.235, 0.232, 0.000)
		colorSnow      (0.248, 0.246, 0.243, 1.000)
		BumpHeight      0.181638
		BumpOffset      0.0363276
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0783305
		GasToDust   0.25
		Particles   1138
		GasBright   0.262904
		DustBright  0.370969
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   374.765
		Period          2021.34
		Eccentricity    0.838666
		Inclination     63.2986
		AscendingNode   -65.5833
		ArgOfPericenter -69.1205
		MeanAnomaly     11.944
	}
}

Comet	"C91"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.75795e-011
	Radius          4.37174
	InertiaMoment   0.398022

	Oblateness      0.0192219

	RotationPeriod  38.6569
	Obliquity       274.02
	EqAscendNode    67.9953

	AbsMagn         7.4279
	SlopeParam      4.5561
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.494 0.487 0.482)

	Surface
	{
		SurfStyle       0.167928
		OceanStyle      0.835284
		Randomize      (0.283, -0.003, 0.985)
		colorDistMagn   0.336031
		colorDistFreq   0.00985134
		detailScale     119.378
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991415
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393188
		terraceProb     0.247554
		erosion         0
		montesMagn      0.253435
		montesFreq      2.81603
		montesSpiky     0.970088
		montesFraction  0.814272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0317549
		hillsFraction   0.567034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232151
		craterFreq      0.272066
		craterDensity   0.886911
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.410189
		volcanoTemp     1358.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.195, 0.193, 0.000)
		colorShelf     (0.210, 0.207, 0.205, 0.000)
		colorBeach     (0.223, 0.219, 0.217, 0.000)
		colorDesert    (0.235, 0.231, 0.229, 0.000)
		colorLowland   (0.247, 0.243, 0.241, 0.000)
		colorUpland    (0.260, 0.256, 0.253, 0.000)
		colorRock      (0.272, 0.268, 0.265, 0.000)
		colorSnow      (0.284, 0.280, 0.277, 1.000)
		BumpHeight      3.93456
		BumpOffset      0.786912
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.559523
		GasToDust   0.25
		Particles   2110
		GasBright   0.15084
		DustBright  0.16752
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   535.3
		Period          3450.61
		Eccentricity    0.897799
		Inclination     -165.606
		AscendingNode   75.3171
		ArgOfPericenter -141.055
		MeanAnomaly     82.5526
	}
}

Comet	"C92"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.13308e-007
	Radius          78.8416
	InertiaMoment   0.399765

	Oblateness      0.0162156

	RotationPeriod  36.7722
	Obliquity       227.225
	EqAscendNode    52.5727

	AbsMagn         2.9942
	SlopeParam      5.17514
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.529 0.522 0.520)

	Surface
	{
		SurfStyle       0.266642
		OceanStyle      0.79851
		Randomize      (0.599, 0.094, -0.149)
		colorDistMagn   0.688759
		colorDistFreq   4.40765
		detailScale     2152.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.777802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508663
		terraceProb     0.233731
		erosion         0
		montesMagn      0.381899
		montesFreq      3.4945
		montesSpiky     0.865967
		montesFraction  0.662988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.2939
		hillsFraction   0.867669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246118
		craterFreq      0.253813
		craterDensity   0.853416
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502511
		volcanoTemp     1447.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.209, 0.208, 0.000)
		colorShelf     (0.225, 0.222, 0.221, 0.000)
		colorBeach     (0.238, 0.235, 0.234, 0.000)
		colorDesert    (0.251, 0.248, 0.247, 0.000)
		colorLowland   (0.264, 0.261, 0.260, 0.000)
		colorUpland    (0.278, 0.274, 0.273, 0.000)
		colorRock      (0.291, 0.287, 0.286, 0.000)
		colorSnow      (0.304, 0.300, 0.299, 1.000)
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
		GasBright   0.0263728
		DustBright  0.776474
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   401.454
		Period          2241.06
		Eccentricity    0.797539
		Inclination     92.4538
		AscendingNode   35.1762
		ArgOfPericenter -140.487
		MeanAnomaly     27.5352
	}
}

Comet	"C93"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.56791e-015
	Radius          0.270774
	InertiaMoment   0.398619

	Oblateness      0.0236419

	RotationPeriod  34.8562
	Obliquity       180.431
	EqAscendNode    37.1501

	AbsMagn         10.8262
	SlopeParam      5.93751
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.824 0.780 0.721)

	Surface
	{
		SurfStyle       0.479659
		OceanStyle      0.310395
		Randomize      (-0.338, -0.014, -0.507)
		colorDistMagn   0.346235
		colorDistFreq   2.33288e-005
		detailScale     7.39394
		colorConversion true
		snowLevel       2
		tropicLatitude  0.584321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376632
		terraceProb     0.276902
		erosion         0
		montesMagn      0.476524
		montesFreq      2.73318
		montesSpiky     0.834871
		montesFraction  0.939293
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000182517
		hillsFraction   0.654109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218164
		craterFreq      0.211981
		craterDensity   0.740044
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536366
		volcanoTemp     1472.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.312, 0.288, 0.000)
		colorShelf     (0.350, 0.331, 0.306, 0.000)
		colorBeach     (0.371, 0.351, 0.324, 0.000)
		colorDesert    (0.391, 0.370, 0.342, 0.000)
		colorLowland   (0.412, 0.390, 0.360, 0.000)
		colorUpland    (0.432, 0.409, 0.378, 0.000)
		colorRock      (0.453, 0.429, 0.396, 0.000)
		colorSnow      (0.474, 0.448, 0.414, 1.000)
		BumpHeight      0.243697
		BumpOffset      0.0487394
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.111157
		GasToDust   0.25
		Particles   1204
		GasBright   0.0447832
		DustBright  0.44255
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   434.491
		Period          2523.32
		Eccentricity    0.796862
		Inclination     143.815
		AscendingNode   -3.78726
		ArgOfPericenter 61.5833
		MeanAnomaly     -121.665
	}
}

Comet	"C94"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.07981e-011
	Radius          4.88131
	InertiaMoment   0.396418

	Oblateness      0.0199332

	RotationPeriod  32.9021
	Obliquity       133.637
	EqAscendNode    21.7275

	AbsMagn         7.21622
	SlopeParam      7.20981
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.670 0.665)

	Surface
	{
		SurfStyle       0.936176
		OceanStyle      0.332692
		Randomize      (-0.464, -0.638, -0.295)
		colorDistMagn   0.744231
		colorDistFreq   0.0113099
		detailScale     133.292
		colorConversion true
		snowLevel       2
		tropicLatitude  0.814172
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743451
		terraceProb     0.114996
		erosion         0
		montesMagn      0.662218
		montesFreq      3.49592
		montesSpiky     0.947106
		montesFraction  0.883635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0552698
		hillsFraction   0.66544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218902
		craterFreq      0.194472
		craterDensity   0.927697
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543784
		volcanoTemp     1151.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.234, 0.266, 0.050)
		colorShelf     (0.269, 0.275, 0.306, 0.040)
		colorBeach     (0.309, 0.315, 0.346, 0.030)
		colorDesert    (0.350, 0.355, 0.392, 0.020)
		colorLowland   (0.390, 0.395, 0.432, 0.030)
		colorUpland    (0.430, 0.435, 0.472, 0.050)
		colorRock      (0.471, 0.476, 0.526, 0.020)
		colorSnow      (0.471, 0.476, 0.526, 1.000)
		BumpHeight      4.39318
		BumpOffset      0.878636
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.592349
		GasToDust   0.25
		Particles   2176
		GasBright   0.146686
		DustBright  0.825133
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   185.761
		Period          705.393
		Eccentricity    0.577374
		Inclination     -92.1779
		AscendingNode   39.952
		ArgOfPericenter -141.82
		MeanAnomaly     68.3593
	}
}

Comet	"C95"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.92886e-007
	Radius          105.819
	InertiaMoment   0.399111

	Oblateness      0.0300664

	RotationPeriod  30.9025
	Obliquity       86.8423
	EqAscendNode    6.30493

	AbsMagn         2.50029
	SlopeParam      2.43169
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.815 0.750 0.681)

	Surface
	{
		SurfStyle       0.427511
		OceanStyle      0.544643
		Randomize      (0.164, -0.592, -0.920)
		colorDistMagn   0.53558
		colorDistFreq   8.44871
		detailScale     2889.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99771
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523621
		terraceProb     0.474761
		erosion         0
		montesMagn      0.426191
		montesFreq      2.64159
		montesSpiky     0.979822
		montesFraction  0.367515
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.4177
		hillsFraction   0.550119
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216584
		craterFreq      0.406738
		craterDensity   0.698826
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.579876
		volcanoTemp     1696.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.300, 0.272, 0.000)
		colorShelf     (0.346, 0.319, 0.289, 0.000)
		colorBeach     (0.367, 0.337, 0.307, 0.000)
		colorDesert    (0.387, 0.356, 0.324, 0.000)
		colorLowland   (0.407, 0.375, 0.341, 0.000)
		colorUpland    (0.428, 0.394, 0.358, 0.000)
		colorRock      (0.448, 0.412, 0.375, 0.000)
		colorSnow      (0.469, 0.431, 0.392, 1.000)
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
		GasBright   0.137814
		DustBright  0.518492
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   441.36
		Period          2583.39
		Eccentricity    0.882923
		Inclination     -145.732
		AscendingNode   -92.2546
		ArgOfPericenter 91.8671
		MeanAnomaly     88.3615
	}
}

Comet	"C96"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.20973e-014
	Radius          0.302208
	InertiaMoment   0.397652

	Oblateness      0.0259566

	RotationPeriod  28.8487
	Obliquity       40.048
	EqAscendNode    350.882

	AbsMagn         10.5644
	SlopeParam      3.11217
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.693 0.691)

	Surface
	{
		SurfStyle       0.430921
		OceanStyle      0.846496
		Randomize      (0.209, -0.140, -0.626)
		colorDistMagn   0.705657
		colorDistFreq   7.18131e-005
		detailScale     8.25229
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999982
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394822
		terraceProb     0.305772
		erosion         0
		montesMagn      0.331641
		montesFreq      3.89018
		montesSpiky     0.968695
		montesFraction  0.580297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000209568
		hillsFraction   0.336029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228093
		craterFreq      0.165715
		craterDensity   0.762496
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462104
		volcanoTemp     1613.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.277, 0.276, 0.000)
		colorShelf     (0.295, 0.295, 0.294, 0.000)
		colorBeach     (0.313, 0.312, 0.311, 0.000)
		colorDesert    (0.330, 0.329, 0.328, 0.000)
		colorLowland   (0.347, 0.347, 0.345, 0.000)
		colorUpland    (0.365, 0.364, 0.363, 0.000)
		colorRock      (0.382, 0.381, 0.380, 0.000)
		colorSnow      (0.399, 0.398, 0.397, 1.000)
		BumpHeight      0.271987
		BumpOffset      0.0543974
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.143983
		GasToDust   0.25
		Particles   1270
		GasBright   0.0916835
		DustBright  0.249109
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   398.922
		Period          2219.89
		Eccentricity    0.852366
		Inclination     -107.871
		AscendingNode   68.0482
		ArgOfPericenter 88.1058
		MeanAnomaly     -176.104
	}
}

Comet	"C97"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            9.35636e-011
	Radius          6.55419
	InertiaMoment   0.399555

	Oblateness      0.040161

	RotationPeriod  26.7306
	Obliquity       353.254
	EqAscendNode    335.46

	AbsMagn         7.00232
	SlopeParam      3.70125
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.824 0.715 0.677)

	Surface
	{
		SurfStyle       0.987338
		OceanStyle      0.230648
		Randomize      (0.772, -0.883, 0.194)
		colorDistMagn   0.65219
		colorDistFreq   0.0284199
		detailScale     178.973
		colorConversion true
		snowLevel       2
		tropicLatitude  0.116075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540026
		terraceProb     0.286387
		erosion         0
		montesMagn      0.613109
		montesFreq      2.64578
		montesSpiky     0.915847
		montesFraction  0.407342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.113372
		hillsFraction   0.735186
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24119
		craterFreq      0.263553
		craterDensity   0.883303
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547408
		volcanoTemp     1366.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.250, 0.271, 0.050)
		colorShelf     (0.330, 0.293, 0.311, 0.040)
		colorBeach     (0.379, 0.336, 0.352, 0.030)
		colorDesert    (0.429, 0.379, 0.399, 0.020)
		colorLowland   (0.478, 0.422, 0.440, 0.030)
		colorUpland    (0.528, 0.465, 0.481, 0.050)
		colorRock      (0.577, 0.508, 0.535, 0.020)
		colorSnow      (0.577, 0.508, 0.535, 1.000)
		BumpHeight      5.89877
		BumpOffset      1.17975
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.625174
		GasToDust   0.25
		Particles   2242
		GasBright   0.270754
		DustBright  0.554525
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   316.953
		Period          1572.14
		Eccentricity    0.850137
		Inclination     -174.79
		AscendingNode   -66.4195
		ArgOfPericenter -62.9035
		MeanAnomaly     -177.032
	}
}

Comet	"C98"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.23647e-007
	Radius          118.049
	InertiaMoment   0.398343

	Oblateness      0.0358466

	RotationPeriod  24.5361
	Obliquity       306.459
	EqAscendNode    320.037

	AbsMagn         1.90445
	SlopeParam      4.265
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.725 0.670)

	Surface
	{
		SurfStyle       0.726476
		OceanStyle      0.200673
		Randomize      (-0.163, -0.175, 0.205)
		colorDistMagn   0.275171
		colorDistFreq   10.988
		detailScale     3223.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.722671
		terraceProb     0.370834
		erosion         0
		montesMagn      0.559346
		montesFreq      2.91579
		montesSpiky     0.993815
		montesFraction  0.53543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.572
		hillsFraction   0.725721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264406
		craterFreq      0.550218
		craterDensity   0.817437
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446573
		volcanoTemp     1298.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.246, 0.188, 0.000)
		colorShelf     (0.305, 0.254, 0.215, 0.000)
		colorBeach     (0.358, 0.297, 0.255, 0.000)
		colorDesert    (0.389, 0.319, 0.248, 0.000)
		colorLowland   (0.427, 0.341, 0.282, 0.000)
		colorUpland    (0.473, 0.413, 0.342, 0.000)
		colorRock      (0.511, 0.449, 0.369, 0.000)
		colorSnow      (0.557, 0.478, 0.389, 1.000)
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
		GasBright   0.197341
		DustBright  0.312425
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   321.488
		Period          1606.01
		Eccentricity    0.681856
		Inclination     120.331
		AscendingNode   -38.5043
		ArgOfPericenter 154.717
		MeanAnomaly     71.9987
	}
}

Comet	"C99"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.22816e-014
	Radius          0.405955
	InertiaMoment   0.399977

	Oblateness      0.057924

	RotationPeriod  22.2507
	Obliquity       259.665
	EqAscendNode    304.615

	AbsMagn         10.3131
	SlopeParam      4.8511
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.606 0.466 0.359)

	Surface
	{
		SurfStyle       0.675208
		OceanStyle      0.650119
		Randomize      (-0.637, 0.656, -0.912)
		colorDistMagn   0.537312
		colorDistFreq   0.000133242
		detailScale     11.0853
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381381
		terraceProb     0.181385
		erosion         0
		montesMagn      0.345727
		montesFreq      2.57062
		montesSpiky     0.84621
		montesFraction  0.315611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000404335
		hillsFraction   0.831428
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220503
		craterFreq      0.203717
		craterDensity   1.0428
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446858
		volcanoTemp     1575.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.158, 0.101, 0.000)
		colorShelf     (0.243, 0.163, 0.115, 0.000)
		colorBeach     (0.285, 0.191, 0.137, 0.000)
		colorDesert    (0.309, 0.205, 0.133, 0.000)
		colorLowland   (0.340, 0.219, 0.151, 0.000)
		colorUpland    (0.376, 0.265, 0.183, 0.000)
		colorRock      (0.406, 0.289, 0.198, 0.000)
		colorSnow      (0.443, 0.307, 0.208, 1.000)
		BumpHeight      0.365359
		BumpOffset      0.0730718
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.176808
		GasToDust   0.25
		Particles   1336
		GasBright   0.443602
		DustBright  0.550651
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   357.094
		Period          1880.07
		Eccentricity    0.855584
		Inclination     23.6766
		AscendingNode   59.6812
		ArgOfPericenter -56.8123
		MeanAnomaly     -171.755
	}
}

Comet	"C100"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.72332e-010
	Radius          7.30811
	InertiaMoment   0.398877

	Oblateness      0.0546406

	RotationPeriod  19.8564
	Obliquity       212.871
	EqAscendNode    289.192

	AbsMagn         6.78553
	SlopeParam      5.52325
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.627 0.598)

	Surface
	{
		SurfStyle       0.878991
		OceanStyle      0.0515533
		Randomize      (0.537, -0.913, -0.394)
		colorDistMagn   0.37138
		colorDistFreq   0.015151
		detailScale     199.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.582274
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.755682
		terraceProb     0.414426
		erosion         0
		montesMagn      0.36625
		montesFreq      2.95404
		montesSpiky     0.863623
		montesFraction  0.455532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0946992
		hillsFraction   0.546675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218594
		craterFreq      0.218842
		craterDensity   0.947305
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53966
		volcanoTemp     1409.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.219, 0.239, 0.050)
		colorShelf     (0.284, 0.257, 0.275, 0.040)
		colorBeach     (0.326, 0.295, 0.311, 0.030)
		colorDesert    (0.369, 0.332, 0.353, 0.020)
		colorLowland   (0.412, 0.370, 0.388, 0.030)
		colorUpland    (0.454, 0.407, 0.424, 0.050)
		colorRock      (0.497, 0.445, 0.472, 0.020)
		colorSnow      (0.497, 0.445, 0.472, 1.000)
		BumpHeight      6.5773
		BumpOffset      1.31546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.658
		GasToDust   0.25
		Particles   2309
		GasBright   0.00353705
		DustBright  0.675202
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   333.785
		Period          1699.03
		Eccentricity    0.86589
		Inclination     -129.062
		AscendingNode   132.318
		ArgOfPericenter 42.0939
		MeanAnomaly     66.7802
	}
}

Comet	"C101"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.30624e-018
	Radius          0.0251442
	InertiaMoment   0.397175

	Oblateness      0.0942744

	RotationPeriod  17.3306
	Obliquity       166.077
	EqAscendNode    273.769

	AbsMagn         1.13071
	SlopeParam      6.44177
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.472 0.467)

	Surface
	{
		SurfStyle       0.0894937
		OceanStyle      0.786397
		Randomize      (-0.524, 0.970, -0.388)
		colorDistMagn   0.69754
		colorDistFreq   4.13774e-007
		detailScale     0.686604
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891505
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586716
		terraceProb     0.253816
		erosion         0
		montesMagn      0.477966
		montesFreq      2.58371
		montesSpiky     0.908715
		montesFraction  0.131495
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.22168e-006
		hillsFraction   0.73011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239465
		craterFreq      0.206441
		craterDensity   0.886449
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525966
		volcanoTemp     1066.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.189, 0.187, 0.000)
		colorShelf     (0.202, 0.201, 0.198, 0.000)
		colorBeach     (0.214, 0.212, 0.210, 0.000)
		colorDesert    (0.225, 0.224, 0.222, 0.000)
		colorLowland   (0.237, 0.236, 0.233, 0.000)
		colorUpland    (0.249, 0.248, 0.245, 0.000)
		colorRock      (0.261, 0.260, 0.257, 0.000)
		colorSnow      (0.273, 0.271, 0.269, 1.000)
		BumpHeight      0.0226298
		BumpOffset      0.00452595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0233396
		DustBright  0.339886
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   315.655
		Period          1562.5
		Eccentricity    0.800038
		Inclination     126.863
		AscendingNode   47.8231
		ArgOfPericenter 50.3759
		MeanAnomaly     110.177
	}
}

Comet	"C102"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.104e-014
	Radius          0.452412
	InertiaMoment   0.39934

	Oblateness      0.100253

	RotationPeriod  14.644
	Obliquity       119.282
	EqAscendNode    258.347

	AbsMagn         10.0706
	SlopeParam      2.00834
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.410 0.408)

	Surface
	{
		SurfStyle       0.36409
		OceanStyle      0.826377
		Randomize      (-0.888, -0.519, -0.925)
		colorDistMagn   0.780293
		colorDistFreq   6.94515e-005
		detailScale     12.3539
		colorConversion true
		snowLevel       2
		tropicLatitude  0.357415
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489166
		terraceProb     0.158675
		erosion         0
		montesMagn      0.444676
		montesFreq      2.061
		montesSpiky     0.843104
		montesFraction  0.37396
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000495896
		hillsFraction   0.620443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235969
		craterFreq      0.233115
		craterDensity   0.985463
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522459
		volcanoTemp     1519.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.163, 0.000)
		colorShelf     (0.177, 0.174, 0.173, 0.000)
		colorBeach     (0.187, 0.185, 0.184, 0.000)
		colorDesert    (0.198, 0.195, 0.194, 0.000)
		colorLowland   (0.208, 0.205, 0.204, 0.000)
		colorUpland    (0.218, 0.215, 0.214, 0.000)
		colorRock      (0.229, 0.226, 0.224, 0.000)
		colorSnow      (0.239, 0.236, 0.235, 1.000)
		BumpHeight      0.40717
		BumpOffset      0.0814341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.209634
		GasToDust   0.25
		Particles   1403
		GasBright   0.104524
		DustBright  0.743188
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   333.809
		Period          1699.21
		Eccentricity    0.854363
		Inclination     -140.152
		AscendingNode   2.29768
		ArgOfPericenter -10.0726
		MeanAnomaly     -100.992
	}
}

Comet	"C103"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.17415e-010
	Radius          9.8265
	InertiaMoment   0.398031

	Oblateness      0.20504

	RotationPeriod  11.7574
	Obliquity       72.4879
	EqAscendNode    242.924

	AbsMagn         6.56511
	SlopeParam      2.7849
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.612 0.478)

	Surface
	{
		SurfStyle       0.221706
		OceanStyle      0.110473
		Randomize      (-0.955, -0.429, 0.833)
		colorDistMagn   0.264323
		colorDistFreq   0.023945
		detailScale     268.329
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964668
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47963
		terraceProb     0.316323
		erosion         0
		montesMagn      0.398292
		montesFreq      2.9596
		montesSpiky     0.904506
		montesFraction  0.221478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.251626
		hillsFraction   0.716145
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261747
		craterFreq      0.207778
		craterDensity   1.09751
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.446276
		volcanoTemp     1428.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.245, 0.191, 0.000)
		colorShelf     (0.289, 0.260, 0.203, 0.000)
		colorBeach     (0.306, 0.275, 0.215, 0.000)
		colorDesert    (0.323, 0.291, 0.227, 0.000)
		colorLowland   (0.340, 0.306, 0.239, 0.000)
		colorUpland    (0.357, 0.321, 0.251, 0.000)
		colorRock      (0.374, 0.337, 0.263, 0.000)
		colorSnow      (0.391, 0.352, 0.275, 1.000)
		BumpHeight      8.84385
		BumpOffset      1.76877
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.690826
		GasToDust   0.25
		Particles   2375
		GasBright   0.0970448
		DustBright  0.435154
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   413.416
		Period          2341.97
		Eccentricity    0.917199
		Inclination     -32.8002
		AscendingNode   -178.389
		ArgOfPericenter 131.418
		MeanAnomaly     11.2873
	}
}

Comet	"C104"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            9.77345e-018
	Radius          0.0280057
	InertiaMoment   0.39977

	Oblateness      0.249

	RotationPeriod  8.61664
	Obliquity       25.6937
	EqAscendNode    227.502

	AbsMagn         -0.0448303
	SlopeParam      3.40907
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.679 0.676 0.672)

	Surface
	{
		SurfStyle       0.640541
		OceanStyle      0.206268
		Randomize      (-0.338, -0.482, 0.960)
		colorDistMagn   0.433929
		colorDistFreq   3.12082e-007
		detailScale     0.764742
		colorConversion true
		snowLevel       2
		tropicLatitude  0.480934
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364749
		terraceProb     0.242025
		erosion         0
		montesMagn      0.544171
		montesFreq      2.74505
		montesSpiky     0.910656
		montesFraction  0.661727
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.54363e-006
		hillsFraction   0.661151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233352
		craterFreq      0.212394
		craterDensity   0.81712
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495382
		volcanoTemp     1604.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.230, 0.188, 0.000)
		colorShelf     (0.272, 0.237, 0.215, 0.000)
		colorBeach     (0.319, 0.277, 0.255, 0.000)
		colorDesert    (0.346, 0.298, 0.249, 0.000)
		colorLowland   (0.380, 0.318, 0.282, 0.000)
		colorUpland    (0.421, 0.385, 0.343, 0.000)
		colorRock      (0.455, 0.419, 0.369, 0.000)
		colorSnow      (0.496, 0.446, 0.390, 1.000)
		BumpHeight      0.0252051
		BumpOffset      0.00504102
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0523061
		DustBright  0.164379
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   338.92
		Period          1738.39
		Eccentricity    0.827502
		Inclination     -3.32718
		AscendingNode   155.24
		ArgOfPericenter 32.9674
		MeanAnomaly     -91.0077
	}
}

Comet	"C105"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.55905e-014
	Radius          0.608642
	InertiaMoment   0.398625

	Oblateness      0.249

	RotationPeriod  5.14343
	Obliquity       338.899
	EqAscendNode    212.079

	AbsMagn         9.83555
	SlopeParam      3.97943
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.720 0.630 0.501)

	Surface
	{
		SurfStyle       0.51961
		OceanStyle      0.513756
		Randomize      (-0.137, 0.040, -0.513)
		colorDistMagn   0.570559
		colorDistFreq   6.0586e-005
		detailScale     16.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.360876
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269244
		terraceProb     0.448211
		erosion         0
		montesMagn      0.562519
		montesFreq      2.174
		montesSpiky     0.884615
		montesFraction  0.221268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000862003
		hillsFraction   0.593268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251264
		craterFreq      0.196773
		craterDensity   0.852741
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.596841
		volcanoTemp     1575.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.214, 0.140, 0.000)
		colorShelf     (0.288, 0.221, 0.160, 0.000)
		colorBeach     (0.338, 0.258, 0.191, 0.000)
		colorDesert    (0.367, 0.277, 0.186, 0.000)
		colorLowland   (0.403, 0.296, 0.211, 0.000)
		colorUpland    (0.446, 0.359, 0.256, 0.000)
		colorRock      (0.482, 0.391, 0.276, 0.000)
		colorSnow      (0.525, 0.416, 0.291, 1.000)
		BumpHeight      0.547777
		BumpOffset      0.109555
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.24246
		GasToDust   0.25
		Particles   1469
		GasBright   0.210658
		DustBright  0.490514
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   407.207
		Period          2289.41
		Eccentricity    0.710991
		Inclination     179.935
		AscendingNode   -35.0066
		ArgOfPericenter -7.70386
		MeanAnomaly     19.7716
	}
}

Comet	"C106"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.84638e-010
	Radius          10.9381
	InertiaMoment   0.396444

	Oblateness      0.00109245

	RotationPeriod  138.97
	Obliquity       292.105
	EqAscendNode    196.656

	AbsMagn         6.34024
	SlopeParam      4.54808
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.699 0.696 0.695)

	Surface
	{
		SurfStyle       0.556467
		OceanStyle      0.0857214
		Randomize      (-0.444, 0.557, 0.881)
		colorDistMagn   0.833326
		colorDistFreq   0.0735521
		detailScale     298.683
		colorConversion true
		snowLevel       2
		tropicLatitude  0.915375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698886
		terraceProb     0.356603
		erosion         0
		montesMagn      0.585454
		montesFreq      3.57632
		montesSpiky     0.985364
		montesFraction  0.769567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.202233
		hillsFraction   0.732333
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248802
		craterFreq      0.204422
		craterDensity   1.03529
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487282
		volcanoTemp     1761.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.237, 0.195, 0.000)
		colorShelf     (0.279, 0.244, 0.222, 0.000)
		colorBeach     (0.328, 0.285, 0.264, 0.000)
		colorDesert    (0.356, 0.306, 0.257, 0.000)
		colorLowland   (0.391, 0.327, 0.292, 0.000)
		colorUpland    (0.433, 0.397, 0.354, 0.000)
		colorRock      (0.468, 0.432, 0.382, 0.000)
		colorSnow      (0.510, 0.459, 0.403, 1.000)
		BumpHeight      9.84428
		BumpOffset      1.96886
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.723652
		GasToDust   0.25
		Particles   2441
		GasBright   0.138638
		DustBright  0.247021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   488.074
		Period          3004.2
		Eccentricity    0.801891
		Inclination     -136.437
		AscendingNode   -78.259
		ArgOfPericenter -77.0216
		MeanAnomaly     31.9778
	}
}

Comet	"C107"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.80014e-017
	Radius          0.0376986
	InertiaMoment   0.399117

	Oblateness      0.00203254

	RotationPeriod  118.071
	Obliquity       245.311
	EqAscendNode    181.234

	AbsMagn         17.9985
	SlopeParam      5.16598
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.561 0.460 0.361)

	Surface
	{
		SurfStyle       0.675384
		OceanStyle      0.221198
		Randomize      (0.494, -0.010, 0.038)
		colorDistMagn   0.908157
		colorDistFreq   1.17069e-006
		detailScale     1.02942
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951372
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446492
		terraceProb     0.254306
		erosion         0
		montesMagn      0.334813
		montesFreq      3.02803
		montesSpiky     0.862293
		montesFraction  0.42805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.77969e-006
		hillsFraction   0.485238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253168
		craterFreq      0.169371
		craterDensity   0.869402
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.568089
		volcanoTemp     1600.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.156, 0.101, 0.000)
		colorShelf     (0.224, 0.161, 0.115, 0.000)
		colorBeach     (0.263, 0.189, 0.137, 0.000)
		colorDesert    (0.286, 0.202, 0.133, 0.000)
		colorLowland   (0.314, 0.216, 0.151, 0.000)
		colorUpland    (0.348, 0.262, 0.184, 0.000)
		colorRock      (0.376, 0.285, 0.198, 0.000)
		colorSnow      (0.409, 0.304, 0.209, 1.000)
		BumpHeight      0.0339288
		BumpOffset      0.00678576
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.36418
		DustBright  0.505965
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   235.249
		Period          1005.29
		Eccentricity    0.845323
		Inclination     173.208
		AscendingNode   173.279
		ArgOfPericenter 115.421
		MeanAnomaly     -88.8554
	}
}

Comet	"C108"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.39228e-013
	Radius          0.677045
	InertiaMoment   0.397662

	Oblateness      0.00178585

	RotationPeriod  108.714
	Obliquity       198.516
	EqAscendNode    165.811

	AbsMagn         9.60666
	SlopeParam      5.92521
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.415 0.410 0.408)

	Surface
	{
		SurfStyle       0.107509
		OceanStyle      0.0683038
		Randomize      (0.313, 0.040, -0.006)
		colorDistMagn   0.60973
		colorDistFreq   0.000178561
		detailScale     18.4878
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954825
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753406
		terraceProb     0.117022
		erosion         0
		montesMagn      0.402233
		montesFreq      2.53235
		montesSpiky     0.982636
		montesFraction  0.703085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000934345
		hillsFraction   0.659238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217261
		craterFreq      0.184365
		craterDensity   0.880275
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495606
		volcanoTemp     1289.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.163, 0.000)
		colorShelf     (0.176, 0.174, 0.174, 0.000)
		colorBeach     (0.187, 0.185, 0.184, 0.000)
		colorDesert    (0.197, 0.195, 0.194, 0.000)
		colorLowland   (0.207, 0.205, 0.204, 0.000)
		colorUpland    (0.218, 0.215, 0.214, 0.000)
		colorRock      (0.228, 0.226, 0.225, 0.000)
		colorSnow      (0.239, 0.236, 0.235, 1.000)
		BumpHeight      0.60934
		BumpOffset      0.121868
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.275286
		GasToDust   0.25
		Particles   1535
		GasBright   0.264877
		DustBright  0.289754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   362.208
		Period          1920.6
		Eccentricity    0.787743
		Inclination     116.542
		AscendingNode   116.451
		ArgOfPericenter 153.193
		MeanAnomaly     156.034
	}
}

Comet	"C109"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.07683e-009
	Radius          14.733
	InertiaMoment   0.39956

	Oblateness      0.00270862

	RotationPeriod  102.254
	Obliquity       151.722
	EqAscendNode    150.389

	AbsMagn         6.11
	SlopeParam      7.18215
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.505 0.499)

	Surface
	{
		SurfStyle       0.10869
		OceanStyle      0.98031
		Randomize      (0.230, 0.184, -0.032)
		colorDistMagn   0.443097
		colorDistFreq   0.183016
		detailScale     402.309
		colorConversion true
		snowLevel       2
		tropicLatitude  0.819874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657749
		terraceProb     0.544428
		erosion         0
		montesMagn      0.377071
		montesFreq      3.27814
		montesSpiky     0.874676
		montesFraction  0.429478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.483846
		hillsFraction   0.602089
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227805
		craterFreq      0.259318
		craterDensity   1.02164
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495878
		volcanoTemp     1335.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.202, 0.200, 0.000)
		colorShelf     (0.217, 0.214, 0.212, 0.000)
		colorBeach     (0.230, 0.227, 0.225, 0.000)
		colorDesert    (0.243, 0.240, 0.237, 0.000)
		colorLowland   (0.255, 0.252, 0.250, 0.000)
		colorUpland    (0.268, 0.265, 0.262, 0.000)
		colorRock      (0.281, 0.278, 0.274, 0.000)
		colorSnow      (0.294, 0.290, 0.287, 1.000)
		BumpHeight      13.2597
		BumpOffset      2.65194
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.756478
		GasToDust   0.25
		Particles   2508
		GasBright   0.00875615
		DustBright  0.230362
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   267.518
		Period          1219.07
		Eccentricity    0.757538
		Inclination     -99.3709
		AscendingNode   -23.348
		ArgOfPericenter -94.6666
		MeanAnomaly     62.3783
	}
}

Comet	"C110"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.31564e-017
	Radius          0.0419057
	InertiaMoment   0.39835

	Oblateness      0.00223099

	RotationPeriod  97.1811
	Obliquity       104.928
	EqAscendNode    134.966

	AbsMagn         15.7058
	SlopeParam      2.42118
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.714 0.710 0.706)

	Surface
	{
		SurfStyle       0.299483
		OceanStyle      0.219387
		Randomize      (0.858, -0.744, -0.874)
		colorDistMagn   0.61501
		colorDistFreq   3.76629e-007
		detailScale     1.1443
		colorConversion true
		snowLevel       2
		tropicLatitude  0.783186
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417702
		terraceProb     0.421221
		erosion         0
		montesMagn      0.4673
		montesFreq      2.95608
		montesSpiky     0.988441
		montesFraction  0.743829
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.1993e-006
		hillsFraction   0.60462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259035
		craterFreq      0.276758
		craterDensity   0.999685
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491448
		volcanoTemp     1615.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.284, 0.283, 0.000)
		colorShelf     (0.304, 0.302, 0.300, 0.000)
		colorBeach     (0.321, 0.320, 0.318, 0.000)
		colorDesert    (0.339, 0.337, 0.336, 0.000)
		colorLowland   (0.357, 0.355, 0.353, 0.000)
		colorUpland    (0.375, 0.373, 0.371, 0.000)
		colorRock      (0.393, 0.391, 0.389, 0.000)
		colorSnow      (0.411, 0.408, 0.406, 1.000)
		BumpHeight      0.0377151
		BumpOffset      0.00754302
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0692227
		DustBright  0.654382
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   448.297
		Period          2644.54
		Eccentricity    0.842754
		Inclination     129.328
		AscendingNode   127.841
		ArgOfPericenter 125.262
		MeanAnomaly     52.4448
	}
}

Comet	"C111"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.56441e-013
	Radius          0.912554
	InertiaMoment   0.399982

	Oblateness      0.00327738

	RotationPeriod  92.9318
	Obliquity       58.1336
	EqAscendNode    119.544

	AbsMagn         9.38291
	SlopeParam      3.10364
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.563 0.497 0.461)

	Surface
	{
		SurfStyle       0.931867
		OceanStyle      0.947592
		Randomize      (0.669, -0.848, -0.038)
		colorDistMagn   0.400222
		colorDistFreq   0.000554764
		detailScale     24.9188
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502116
		terraceProb     0.235278
		erosion         0
		montesMagn      0.545119
		montesFreq      3.07361
		montesSpiky     0.934494
		montesFraction  0.617283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00186231
		hillsFraction   0.512113
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231827
		craterFreq      0.244478
		craterDensity   0.776025
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474494
		volcanoTemp     1646.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.174, 0.184, 0.050)
		colorShelf     (0.225, 0.204, 0.212, 0.040)
		colorBeach     (0.259, 0.234, 0.240, 0.030)
		colorDesert    (0.293, 0.263, 0.272, 0.020)
		colorLowland   (0.327, 0.293, 0.300, 0.030)
		colorUpland    (0.361, 0.323, 0.327, 0.050)
		colorRock      (0.394, 0.353, 0.364, 0.020)
		colorSnow      (0.394, 0.353, 0.364, 1.000)
		BumpHeight      0.821299
		BumpOffset      0.16426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.308112
		GasToDust   0.25
		Particles   1602
		GasBright   0.0631354
		DustBright  0.344956
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   323.552
		Period          1621.5
		Eccentricity    0.691074
		Inclination     36.3593
		AscendingNode   -63.8125
		ArgOfPericenter -83.0896
		MeanAnomaly     178.542
	}
}

Comet	"C112"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.98339e-009
	Radius          16.3646
	InertiaMoment   0.398883

	Oblateness      0.00263974

	RotationPeriod  89.2304
	Obliquity       11.3393
	EqAscendNode    104.121

	AbsMagn         5.87331
	SlopeParam      3.69344
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.618 0.615 0.614)

	Surface
	{
		SurfStyle       0.0253514
		OceanStyle      0.340685
		Randomize      (0.067, 0.730, 0.727)
		colorDistMagn   0.580531
		colorDistFreq   0.180649
		detailScale     446.863
		colorConversion true
		snowLevel       2
		tropicLatitude  0.518641
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386487
		terraceProb     0.357494
		erosion         0
		montesMagn      0.535386
		montesFreq      2.37064
		montesSpiky     0.956608
		montesFraction  0.556423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.511736
		hillsFraction   0.789766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222192
		craterFreq      0.235742
		craterDensity   0.800617
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546402
		volcanoTemp     1216.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.246, 0.245, 0.000)
		colorShelf     (0.263, 0.261, 0.261, 0.000)
		colorBeach     (0.278, 0.277, 0.276, 0.000)
		colorDesert    (0.293, 0.292, 0.291, 0.000)
		colorLowland   (0.309, 0.307, 0.307, 0.000)
		colorUpland    (0.324, 0.323, 0.322, 0.000)
		colorRock      (0.340, 0.338, 0.337, 0.000)
		colorSnow      (0.355, 0.354, 0.353, 1.000)
		BumpHeight      14.7282
		BumpOffset      2.94563
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.789304
		GasToDust   0.25
		Particles   2574
		GasBright   0.190792
		DustBright  0.701786
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   432.878
		Period          2509.28
		Eccentricity    0.788296
		Inclination     159.667
		AscendingNode   160.47
		ArgOfPericenter -61.2876
		MeanAnomaly     -41.3988
	}
}

Comet	"C113"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.107e-017
	Radius          0.0565232
	InertiaMoment   0.397189

	Oblateness      0.00378602

	RotationPeriod  85.9201
	Obliquity       324.545
	EqAscendNode    88.6983

	AbsMagn         14.665
	SlopeParam      4.25721
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.782 0.781)

	Surface
	{
		SurfStyle       0.134687
		OceanStyle      0.5464
		Randomize      (0.665, -0.111, -0.963)
		colorDistMagn   0.776263
		colorDistFreq   1.74916e-006
		detailScale     1.54346
		colorConversion true
		snowLevel       2
		tropicLatitude  0.552862
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.356274
		terraceProb     0.350266
		erosion         0
		montesMagn      0.543175
		montesFreq      2.27283
		montesSpiky     0.854437
		montesFraction  0.332995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.77986e-006
		hillsFraction   0.57172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229741
		craterFreq      0.228888
		craterDensity   0.900251
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516606
		volcanoTemp     1561.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.312, 0.000)
		colorShelf     (0.334, 0.332, 0.332, 0.000)
		colorBeach     (0.353, 0.352, 0.351, 0.000)
		colorDesert    (0.373, 0.372, 0.371, 0.000)
		colorLowland   (0.393, 0.391, 0.391, 0.000)
		colorUpland    (0.412, 0.411, 0.410, 0.000)
		colorRock      (0.432, 0.430, 0.430, 0.000)
		colorSnow      (0.452, 0.450, 0.449, 1.000)
		BumpHeight      0.0508709
		BumpOffset      0.0101742
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.157423
		DustBright  0.419642
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   284.036
		Period          1333.7
		Eccentricity    0.756357
		Inclination     -167.314
		AscendingNode   72.3675
		ArgOfPericenter 146.065
		MeanAnomaly     111.946
	}
}

Comet	"C114"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.72332e-013
	Radius          1.01278
	InertiaMoment   0.399345

	Oblateness      0.00304918

	RotationPeriod  82.9029
	Obliquity       277.751
	EqAscendNode    73.2757

	AbsMagn         9.16341
	SlopeParam      4.84266
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.762 0.713 0.690)

	Surface
	{
		SurfStyle       5.64933e-005
		OceanStyle      0.270626
		Randomize      (0.050, 0.746, -0.689)
		colorDistMagn   0.406082
		colorDistFreq   0.000348151
		detailScale     27.6555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.605288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595195
		terraceProb     0.181296
		erosion         0
		montesMagn      0.429458
		montesFreq      4.18105
		montesSpiky     0.936209
		montesFraction  0.287335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00253166
		hillsFraction   0.617052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246539
		craterFreq      0.221499
		craterDensity   0.912986
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489048
		volcanoTemp     1674.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.285, 0.276, 0.000)
		colorShelf     (0.324, 0.303, 0.293, 0.000)
		colorBeach     (0.343, 0.321, 0.310, 0.000)
		colorDesert    (0.362, 0.338, 0.328, 0.000)
		colorLowland   (0.381, 0.356, 0.345, 0.000)
		colorUpland    (0.400, 0.374, 0.362, 0.000)
		colorRock      (0.419, 0.392, 0.379, 0.000)
		colorSnow      (0.438, 0.410, 0.397, 1.000)
		BumpHeight      0.911498
		BumpOffset      0.1823
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.340938
		GasToDust   0.25
		Particles   1668
		GasBright   0.0867943
		DustBright  0.174757
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   238.616
		Period          1026.95
		Eccentricity    0.73364
		Inclination     118.158
		AscendingNode   -10.2525
		ArgOfPericenter 42.8965
		MeanAnomaly     13.3903
	}
}

Comet	"C115"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.65315e-009
	Radius          22.09
	InertiaMoment   0.398039

	Oblateness      0.00435935

	RotationPeriod  80.1128
	Obliquity       230.956
	EqAscendNode    57.8531

	AbsMagn         5.62893
	SlopeParam      5.51296
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.487 0.482 0.479)

	Surface
	{
		SurfStyle       0.621605
		OceanStyle      0.711927
		Randomize      (0.887, 0.752, -0.508)
		colorDistMagn   0.497959
		colorDistFreq   0.28303
		detailScale     603.205
		colorConversion true
		snowLevel       2
		tropicLatitude  0.364743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510147
		terraceProb     0.368375
		erosion         0
		montesMagn      0.455349
		montesFreq      3.17031
		montesSpiky     0.939325
		montesFraction  0.648441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.04021
		hillsFraction   0.617761
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225608
		craterFreq      0.250396
		craterDensity   0.989407
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496694
		volcanoTemp     1335.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.164, 0.134, 0.000)
		colorShelf     (0.195, 0.169, 0.153, 0.000)
		colorBeach     (0.229, 0.198, 0.182, 0.000)
		colorDesert    (0.249, 0.212, 0.177, 0.000)
		colorLowland   (0.273, 0.227, 0.201, 0.000)
		colorUpland    (0.302, 0.275, 0.244, 0.000)
		colorRock      (0.327, 0.299, 0.263, 0.000)
		colorSnow      (0.356, 0.318, 0.278, 1.000)
		BumpHeight      19.881
		BumpOffset      3.97621
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.82213
		GasToDust   0.25
		Particles   2640
		GasBright   0.291619
		DustBright  0.454419
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   348.902
		Period          1815.75
		Eccentricity    0.872844
		Inclination     -139.898
		AscendingNode   -153.904
		ArgOfPericenter 142.953
		MeanAnomaly     -106.223
	}
}

Comet	"C116"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.12483e-016
	Radius          0.0626747
	InertiaMoment   0.399775

	Oblateness      0.00347759

	RotationPeriod  77.5035
	Obliquity       184.162
	EqAscendNode    42.4305

	AbsMagn         13.944
	SlopeParam      6.42559
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.615 0.504 0.420)

	Surface
	{
		SurfStyle       0.469669
		OceanStyle      0.961655
		Randomize      (0.015, -0.077, 0.173)
		colorDistMagn   0.724664
		colorDistFreq   1.67323e-006
		detailScale     1.71144
		colorConversion true
		snowLevel       2
		tropicLatitude  0.281447
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422738
		terraceProb     0.236427
		erosion         0
		montesMagn      0.509243
		montesFreq      3.47332
		montesSpiky     0.864874
		montesFraction  0.660136
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.87937e-006
		hillsFraction   0.733167
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227019
		craterFreq      0.204585
		craterDensity   0.893364
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565087
		volcanoTemp     1390.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.201, 0.168, 0.000)
		colorShelf     (0.261, 0.214, 0.179, 0.000)
		colorBeach     (0.277, 0.227, 0.189, 0.000)
		colorDesert    (0.292, 0.239, 0.200, 0.000)
		colorLowland   (0.307, 0.252, 0.210, 0.000)
		colorUpland    (0.323, 0.264, 0.221, 0.000)
		colorRock      (0.338, 0.277, 0.231, 0.000)
		colorSnow      (0.354, 0.290, 0.242, 1.000)
		BumpHeight      0.0564073
		BumpOffset      0.0112815
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.193708
		DustBright  0.236816
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   285.965
		Period          1347.32
		Eccentricity    0.77731
		Inclination     -20.4171
		AscendingNode   -10.7993
		ArgOfPericenter -168.553
		MeanAnomaly     -14.9138
	}
}

Comet	"C117"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            8.69975e-013
	Radius          1.36825
	InertiaMoment   0.398632

	Oblateness      0.004969

	RotationPeriod  75.0406
	Obliquity       137.368
	EqAscendNode    27.008

	AbsMagn         8.94736
	SlopeParam      10.5508
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.661 0.656 0.652)

	Surface
	{
		SurfStyle       0.887751
		OceanStyle      0.432084
		Randomize      (0.210, -0.913, 0.964)
		colorDistMagn   0.278968
		colorDistFreq   0.00150075
		detailScale     37.3625
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909164
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470061
		terraceProb     0.374922
		erosion         0
		montesMagn      0.549982
		montesFreq      3.52219
		montesSpiky     0.919161
		montesFraction  0.419231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00243594
		hillsFraction   0.663797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209742
		craterFreq      0.2338
		craterDensity   0.797888
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505565
		volcanoTemp     1690.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.230, 0.261, 0.050)
		colorShelf     (0.265, 0.269, 0.300, 0.040)
		colorBeach     (0.304, 0.309, 0.339, 0.030)
		colorDesert    (0.344, 0.348, 0.385, 0.020)
		colorLowland   (0.384, 0.387, 0.424, 0.030)
		colorUpland    (0.423, 0.427, 0.463, 0.050)
		colorRock      (0.463, 0.466, 0.515, 0.020)
		colorSnow      (0.463, 0.466, 0.515, 1.000)
		BumpHeight      1.23143
		BumpOffset      0.246286
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.373764
		GasToDust   0.25
		Particles   1734
		GasBright   0.00821729
		DustBright  0.906793
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   593.208
		Period          4025.42
		Eccentricity    0.869489
		Inclination     -90.1148
		AscendingNode   52.2161
		ArgOfPericenter -132.328
		MeanAnomaly     58.2432
	}
}

Comet	"C118"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.72863e-009
	Radius          24.4704
	InertiaMoment   0.396469

	Oblateness      0.00388411

	RotationPeriod  72.6983
	Obliquity       90.5735
	EqAscendNode    11.5854

	AbsMagn         5.37535
	SlopeParam      2.77561
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.704 0.699)

	Surface
	{
		SurfStyle       0.685686
		OceanStyle      0.15295
		Randomize      (0.213, 0.245, 0.243)
		colorDistMagn   0.526491
		colorDistFreq   0.270516
		detailScale     668.204
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980022
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.28926
		terraceProb     0.382999
		erosion         0
		montesMagn      0.410023
		montesFreq      2.98391
		montesSpiky     0.985488
		montesFraction  0.294478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28074
		hillsFraction   0.710434
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252668
		craterFreq      0.190983
		craterDensity   0.891232
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545855
		volcanoTemp     1407.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.239, 0.196, 0.000)
		colorShelf     (0.283, 0.246, 0.224, 0.000)
		colorBeach     (0.332, 0.288, 0.266, 0.000)
		colorDesert    (0.361, 0.310, 0.259, 0.000)
		colorLowland   (0.396, 0.331, 0.294, 0.000)
		colorUpland    (0.438, 0.401, 0.356, 0.000)
		colorRock      (0.474, 0.436, 0.384, 0.000)
		colorSnow      (0.516, 0.464, 0.405, 1.000)
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
		MaxLength   0.854956
		GasToDust   0.25
		Particles   2706
		GasBright   0.0407813
		DustBright  0.558716
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   288.459
		Period          1364.98
		Eccentricity    0.684761
		Inclination     36.7337
		AscendingNode   110.241
		ArgOfPericenter -140.772
		MeanAnomaly     11.7412
	}
}

Comet	"C119"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.0718e-016
	Radius          0.0847498
	InertiaMoment   0.399123

	Oblateness      0.00563506

	RotationPeriod  70.4562
	Obliquity       43.7792
	EqAscendNode    356.163

	AbsMagn         13.3766
	SlopeParam      3.40101
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.403 0.355)

	Surface
	{
		SurfStyle       0.343571
		OceanStyle      0.900346
		Randomize      (0.658, 0.048, 0.977)
		colorDistMagn   0.704276
		colorDistFreq   2.94034e-006
		detailScale     2.31424
		colorConversion true
		snowLevel       2
		tropicLatitude  0.88157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382762
		terraceProb     0.179397
		erosion         0
		montesMagn      0.556454
		montesFreq      2.59622
		montesSpiky     0.877238
		montesFraction  0.744286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.7737e-006
		hillsFraction   0.893817
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237963
		craterFreq      0.248481
		craterDensity   0.98892
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464249
		volcanoTemp     1215.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.161, 0.142, 0.000)
		colorShelf     (0.218, 0.171, 0.151, 0.000)
		colorBeach     (0.231, 0.182, 0.160, 0.000)
		colorDesert    (0.244, 0.192, 0.169, 0.000)
		colorLowland   (0.257, 0.202, 0.178, 0.000)
		colorUpland    (0.270, 0.212, 0.187, 0.000)
		colorRock      (0.283, 0.222, 0.195, 0.000)
		colorSnow      (0.295, 0.232, 0.204, 1.000)
		BumpHeight      0.0762748
		BumpOffset      0.015255
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0360861
		DustBright  0.247898
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   443.867
		Period          2605.43
		Eccentricity    0.870243
		Inclination     -20.8264
		AscendingNode   145.523
		ArgOfPericenter -151.534
		MeanAnomaly     99.2139
	}
}

Comet	"C120"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.60239e-012
	Radius          1.51409
	InertiaMoment   0.397672

	Oblateness      0.00439725

	RotationPeriod  68.298
	Obliquity       356.985
	EqAscendNode    340.74

	AbsMagn         8.73404
	SlopeParam      3.97171
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.691 0.655)

	Surface
	{
		SurfStyle       0.573804
		OceanStyle      0.657227
		Randomize      (-0.708, 0.573, -0.229)
		colorDistMagn   0.586269
		colorDistFreq   0.00168613
		detailScale     41.3449
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361295
		terraceProb     0.421001
		erosion         0
		montesMagn      0.599197
		montesFreq      2.41152
		montesSpiky     0.945913
		montesFraction  0.186575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00481154
		hillsFraction   0.600805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263243
		craterFreq      0.237924
		craterDensity   0.889844
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437135
		volcanoTemp     1307.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.235, 0.183, 0.000)
		colorShelf     (0.297, 0.242, 0.209, 0.000)
		colorBeach     (0.349, 0.283, 0.249, 0.000)
		colorDesert    (0.378, 0.304, 0.242, 0.000)
		colorLowland   (0.415, 0.325, 0.275, 0.000)
		colorUpland    (0.460, 0.394, 0.334, 0.000)
		colorRock      (0.497, 0.429, 0.360, 0.000)
		colorSnow      (0.541, 0.456, 0.380, 1.000)
		BumpHeight      1.36269
		BumpOffset      0.272537
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.40659
		GasToDust   0.25
		Particles   1801
		GasBright   0.143025
		DustBright  0.625446
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   380.205
		Period          2065.51
		Eccentricity    0.783011
		Inclination     -83.2594
		AscendingNode   54.4272
		ArgOfPericenter 121.791
		MeanAnomaly     -165.924
	}
}

Comet	"C121"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.23933e-008
	Radius          33.1217
	InertiaMoment   0.399565

	Oblateness      0.00637798

	RotationPeriod  66.2105
	Obliquity       310.191
	EqAscendNode    325.318

	AbsMagn         5.11075
	SlopeParam      4.54008
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.672 0.586)

	Surface
	{
		SurfStyle       0.904418
		OceanStyle      0.980377
		Randomize      (0.885, 0.152, 0.332)
		colorDistMagn   0.931856
		colorDistFreq   0.928217
		detailScale     904.442
		colorConversion true
		snowLevel       2
		tropicLatitude  0.519005
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.763941
		terraceProb     0.345775
		erosion         0
		montesMagn      0.463665
		montesFreq      3.61209
		montesSpiky     0.963389
		montesFraction  0.233632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.04489
		hillsFraction   0.456146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242607
		craterFreq      0.161722
		craterDensity   0.939812
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495663
		volcanoTemp     1461.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.235, 0.235, 0.050)
		colorShelf     (0.297, 0.276, 0.270, 0.040)
		colorBeach     (0.341, 0.316, 0.305, 0.030)
		colorDesert    (0.386, 0.356, 0.346, 0.020)
		colorLowland   (0.430, 0.397, 0.381, 0.030)
		colorUpland    (0.475, 0.437, 0.416, 0.050)
		colorRock      (0.520, 0.477, 0.463, 0.020)
		colorSnow      (0.520, 0.477, 0.463, 1.000)
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
		MaxLength   0.887782
		GasToDust   0.25
		Particles   2773
		GasBright   0.111048
		DustBright  0.341909
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   430.166
		Period          2485.73
		Eccentricity    0.829728
		Inclination     18.546
		AscendingNode   -0.71814
		ArgOfPericenter -77.5672
		MeanAnomaly     99.3591
	}
}

Comet	"C122"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.816e-016
	Radius          0.0936753
	InertiaMoment   0.398358

	Oblateness      0.00496427

	RotationPeriod  64.1825
	Obliquity       263.396
	EqAscendNode    309.895

	AbsMagn         12.9006
	SlopeParam      5.15685
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.801 0.710 0.680)

	Surface
	{
		SurfStyle       0.691522
		OceanStyle      0.425823
		Randomize      (-0.313, -0.263, -0.512)
		colorDistMagn   0.0925958
		colorDistFreq   4.85502e-006
		detailScale     2.55796
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347598
		terraceProb     0.103713
		erosion         0
		montesMagn      0.493254
		montesFreq      2.08969
		montesSpiky     0.864815
		montesFraction  0.833838
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.12264e-005
		hillsFraction   0.605482
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251085
		craterFreq      0.249734
		craterDensity   0.735655
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.477188
		volcanoTemp     1251.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.241, 0.190, 0.000)
		colorShelf     (0.320, 0.249, 0.218, 0.000)
		colorBeach     (0.376, 0.291, 0.258, 0.000)
		colorDesert    (0.408, 0.312, 0.252, 0.000)
		colorLowland   (0.448, 0.334, 0.286, 0.000)
		colorUpland    (0.496, 0.405, 0.347, 0.000)
		colorRock      (0.536, 0.440, 0.374, 0.000)
		colorSnow      (0.585, 0.469, 0.394, 1.000)
		BumpHeight      0.0843078
		BumpOffset      0.0168616
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.285177
		DustBright  0.652267
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   431.571
		Period          2497.92
		Eccentricity    0.809903
		Inclination     -40.1
		AscendingNode   -81.7651
		ArgOfPericenter 157.327
		MeanAnomaly     120.87
	}
}

Comet	"C123"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.95139e-012
	Radius          2.05157
	InertiaMoment   0.399988

	Oblateness      0.00722206

	RotationPeriod  62.2046
	Obliquity       216.602
	EqAscendNode    294.472

	AbsMagn         8.52279
	SlopeParam      5.91298
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.489 0.483 0.479)

	Surface
	{
		SurfStyle       0.263224
		OceanStyle      0.605113
		Randomize      (-0.779, -0.072, -0.435)
		colorDistMagn   0.34138
		colorDistFreq   0.000806837
		detailScale     56.0214
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452382
		terraceProb     0.359188
		erosion         0
		montesMagn      0.588996
		montesFreq      2.53212
		montesSpiky     0.864657
		montesFraction  0.324752
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00895953
		hillsFraction   0.529217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24311
		craterFreq      0.23827
		craterDensity   0.820157
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491753
		volcanoTemp     1758.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.193, 0.191, 0.000)
		colorShelf     (0.208, 0.205, 0.203, 0.000)
		colorBeach     (0.220, 0.218, 0.215, 0.000)
		colorDesert    (0.232, 0.230, 0.227, 0.000)
		colorLowland   (0.244, 0.242, 0.239, 0.000)
		colorUpland    (0.257, 0.254, 0.251, 0.000)
		colorRock      (0.269, 0.266, 0.263, 0.000)
		colorSnow      (0.281, 0.278, 0.275, 1.000)
		BumpHeight      1.84641
		BumpOffset      0.369282
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.439416
		GasToDust   0.25
		Particles   1867
		GasBright   0.225917
		DustBright  0.396013
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   330.289
		Period          1672.41
		Eccentricity    0.80379
		Inclination     -117.901
		AscendingNode   -23.757
		ArgOfPericenter 158.719
		MeanAnomaly     131.791
	}
}

Comet	"C124"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.28269e-008
	Radius          36.5637
	InertiaMoment   0.398889

	Oblateness      0.00560799

	RotationPeriod  60.2687
	Obliquity       169.808
	EqAscendNode    279.05

	AbsMagn         4.83286
	SlopeParam      7.15508
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.573 0.497)

	Surface
	{
		SurfStyle       0.0230448
		OceanStyle      0.959553
		Randomize      (-0.610, 0.698, 0.849)
		colorDistMagn   0.653151
		colorDistFreq   0.432483
		detailScale     998.434
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61955
		terraceProb     0.33084
		erosion         0
		montesMagn      0.554853
		montesFreq      3.10091
		montesSpiky     0.961144
		montesFraction  0.456191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.85279
		hillsFraction   0.580086
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264039
		craterFreq      0.145288
		craterDensity   0.872137
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505414
		volcanoTemp     1815.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.229, 0.199, 0.000)
		colorShelf     (0.290, 0.244, 0.211, 0.000)
		colorBeach     (0.307, 0.258, 0.224, 0.000)
		colorDesert    (0.324, 0.272, 0.236, 0.000)
		colorLowland   (0.341, 0.287, 0.248, 0.000)
		colorUpland    (0.358, 0.301, 0.261, 0.000)
		colorRock      (0.375, 0.315, 0.273, 0.000)
		colorSnow      (0.392, 0.330, 0.286, 1.000)
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
		MaxLength   0.920608
		GasToDust   0.25
		Particles   2839
		GasBright   0.129399
		DustBright  0.177018
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   243.653
		Period          1059.64
		Eccentricity    0.712145
		Inclination     -78.9965
		AscendingNode   -129.682
		ArgOfPericenter -108.881
		MeanAnomaly     126.852
	}
}

Comet	"C125"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.02857e-016
	Radius          0.127075
	InertiaMoment   0.397204

	Oblateness      0.0081005

	RotationPeriod  58.3677
	Obliquity       123.013
	EqAscendNode    263.627

	AbsMagn         12.4855
	SlopeParam      2.41062
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.577 0.573)

	Surface
	{
		SurfStyle       0.573874
		OceanStyle      0.257413
		Randomize      (0.354, 0.271, 0.651)
		colorDistMagn   0.873137
		colorDistFreq   6.69975e-006
		detailScale     3.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.655724
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555052
		terraceProb     0.167775
		erosion         0
		montesMagn      0.569358
		montesFreq      3.0411
		montesSpiky     0.944558
		montesFraction  0.830629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.25137e-005
		hillsFraction   0.699047
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225407
		craterFreq      0.182243
		craterDensity   0.963099
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44873
		volcanoTemp     1787.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.196, 0.160, 0.000)
		colorShelf     (0.233, 0.202, 0.183, 0.000)
		colorBeach     (0.274, 0.237, 0.218, 0.000)
		colorDesert    (0.297, 0.254, 0.212, 0.000)
		colorLowland   (0.327, 0.271, 0.241, 0.000)
		colorUpland    (0.362, 0.329, 0.292, 0.000)
		colorRock      (0.391, 0.358, 0.315, 0.000)
		colorSnow      (0.426, 0.381, 0.332, 1.000)
		BumpHeight      0.114368
		BumpOffset      0.0228735
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.380695
		DustBright  0.410208
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   472.68
		Period          2863.2
		Eccentricity    0.8459
		Inclination     -159.974
		AscendingNode   32.1568
		ArgOfPericenter 4.2314
		MeanAnomaly     -45.7971
	}
}

Comet	"C126"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.4361e-012
	Radius          2.26163
	InertiaMoment   0.399351

	Oblateness      0.00635323

	RotationPeriod  56.4952
	Obliquity       76.2191
	EqAscendNode    248.205

	AbsMagn         8.31299
	SlopeParam      3.0951
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.590 0.563)

	Surface
	{
		SurfStyle       0.465603
		OceanStyle      0.106492
		Randomize      (-0.046, 0.342, -0.611)
		colorDistMagn   0.671161
		colorDistFreq   0.00346855
		detailScale     61.7576
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997074
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367859
		terraceProb     0.241791
		erosion         0
		montesMagn      0.55133
		montesFreq      3.17078
		montesSpiky     0.984544
		montesFraction  0.566482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0120229
		hillsFraction   0.57749
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218438
		craterFreq      0.231386
		craterDensity   0.902154
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51582
		volcanoTemp     1395.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.236, 0.225, 0.000)
		colorShelf     (0.276, 0.251, 0.239, 0.000)
		colorBeach     (0.292, 0.265, 0.254, 0.000)
		colorDesert    (0.308, 0.280, 0.268, 0.000)
		colorLowland   (0.325, 0.295, 0.282, 0.000)
		colorUpland    (0.341, 0.310, 0.296, 0.000)
		colorRock      (0.357, 0.324, 0.310, 0.000)
		colorSnow      (0.373, 0.339, 0.324, 1.000)
		BumpHeight      2.03547
		BumpOffset      0.407094
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.472242
		GasToDust   0.25
		Particles   1933
		GasBright   0.0192
		DustBright  0.45619
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   390.358
		Period          2148.8
		Eccentricity    0.843597
		Inclination     33.1651
		AscendingNode   -58.7227
		ArgOfPericenter 142.494
		MeanAnomaly     -36.9065
	}
}

Comet	"C127"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.20443e-008
	Radius          49.6635
	InertiaMoment   0.398048

	Oblateness      0.00925154

	RotationPeriod  54.6454
	Obliquity       29.4248
	EqAscendNode    232.782

	AbsMagn         4.53876
	SlopeParam      3.68563
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.505 0.500 0.497)

	Surface
	{
		SurfStyle       0.902856
		OceanStyle      0.367833
		Randomize      (-0.213, -0.648, 0.360)
		colorDistMagn   0.453067
		colorDistFreq   0.488201
		detailScale     1356.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889012
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387349
		terraceProb     0.267907
		erosion         0
		montesMagn      0.508482
		montesFreq      3.15866
		montesSpiky     0.866697
		montesFraction  0.508627
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.9649
		hillsFraction   0.645822
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279347
		craterFreq      0.23119
		craterDensity   0.896229
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52019
		volcanoTemp     1335.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.175, 0.199, 0.050)
		colorShelf     (0.202, 0.205, 0.229, 0.040)
		colorBeach     (0.232, 0.235, 0.259, 0.030)
		colorDesert    (0.263, 0.265, 0.293, 0.020)
		colorLowland   (0.293, 0.295, 0.323, 0.030)
		colorUpland    (0.323, 0.325, 0.353, 0.050)
		colorRock      (0.354, 0.355, 0.393, 0.020)
		colorSnow      (0.354, 0.355, 0.393, 1.000)
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
		MaxLength   0.953434
		GasToDust   0.25
		Particles   2905
		GasBright   0.0954435
		DustBright  0.864433
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   476.975
		Period          2902.31
		Eccentricity    0.827354
		Inclination     -146.306
		AscendingNode   11.7899
		ArgOfPericenter -28.167
		MeanAnomaly     75.5137
	}
}

Comet	"C128"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.29458e-015
	Radius          0.139872
	InertiaMoment   0.39978

	Oblateness      0.00723302

	RotationPeriod  52.813
	Obliquity       342.631
	EqAscendNode    217.359

	AbsMagn         12.1137
	SlopeParam      4.24944
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.632 0.631)

	Surface
	{
		SurfStyle       0.581052
		OceanStyle      0.144245
		Randomize      (0.641, -0.811, 0.783)
		colorDistMagn   0.854467
		colorDistFreq   1.05294e-005
		detailScale     3.81943
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558355
		terraceProb     0.11878
		erosion         0
		montesMagn      0.601304
		montesFreq      3.15707
		montesSpiky     0.881891
		montesFraction  0.375939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.03345e-005
		hillsFraction   0.754258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256468
		craterFreq      0.197735
		craterDensity   0.838756
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537514
		volcanoTemp     1395.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.215, 0.177, 0.000)
		colorShelf     (0.254, 0.221, 0.202, 0.000)
		colorBeach     (0.298, 0.259, 0.240, 0.000)
		colorDesert    (0.324, 0.278, 0.233, 0.000)
		colorLowland   (0.355, 0.297, 0.265, 0.000)
		colorUpland    (0.394, 0.360, 0.322, 0.000)
		colorRock      (0.425, 0.392, 0.347, 0.000)
		colorSnow      (0.463, 0.417, 0.366, 1.000)
		BumpHeight      0.125885
		BumpOffset      0.0251769
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0238758
		GasToDust   0.25
		Particles   1028
		GasBright   0.102118
		DustBright  0.542245
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   548
		Period          3574.14
		Eccentricity    0.872971
		Inclination     114.15
		AscendingNode   -74.0757
		ArgOfPericenter -85.7212
		MeanAnomaly     -80.1063
	}
}

Comet	"C129"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.00126e-011
	Radius          3.0762
	InertiaMoment   0.398639

	Oblateness      0.0106256

	RotationPeriod  50.993
	Obliquity       295.836
	EqAscendNode    201.937

	AbsMagn         8.10405
	SlopeParam      4.83423
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.683 0.681 0.680)

	Surface
	{
		SurfStyle       0.0694127
		OceanStyle      0.380141
		Randomize      (-0.481, 0.803, -0.896)
		colorDistMagn   0.67279
		colorDistFreq   0.00278177
		detailScale     84.0007
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998513
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494062
		terraceProb     0.253153
		erosion         0
		montesMagn      0.551002
		montesFreq      1.99223
		montesSpiky     0.92511
		montesFraction  0.37417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0200569
		hillsFraction   0.454216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243992
		craterFreq      0.195962
		craterDensity   1.02315
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496017
		volcanoTemp     1342.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.272, 0.272, 0.000)
		colorShelf     (0.290, 0.290, 0.289, 0.000)
		colorBeach     (0.308, 0.307, 0.306, 0.000)
		colorDesert    (0.325, 0.324, 0.323, 0.000)
		colorLowland   (0.342, 0.341, 0.340, 0.000)
		colorUpland    (0.359, 0.358, 0.357, 0.000)
		colorRock      (0.376, 0.375, 0.374, 0.000)
		colorSnow      (0.393, 0.392, 0.391, 1.000)
		BumpHeight      2.76858
		BumpOffset      0.553715
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.505068
		GasToDust   0.25
		Particles   2000
		GasBright   0.0715325
		DustBright  0.257317
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   296.21
		Period          1420.37
		Eccentricity    0.749163
		Inclination     133.223
		AscendingNode   57.4406
		ArgOfPericenter 111.051
		MeanAnomaly     -124.996
	}
}

Comet	"C130"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.74403e-008
	Radius          54.571
	InertiaMoment   0.396494

	Oblateness      0.00817931

	RotationPeriod  49.1806
	Obliquity       249.042
	EqAscendNode    186.514

	AbsMagn         4.22465
	SlopeParam      5.50271
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.436 0.433 0.431)

	Surface
	{
		SurfStyle       0.382881
		OceanStyle      0.0960738
		Randomize      (0.837, 0.874, 0.541)
		colorDistMagn   0.627792
		colorDistFreq   1.33266
		detailScale     1490.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998454
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.284348
		terraceProb     0.248075
		erosion         0
		montesMagn      0.529197
		montesFreq      3.13892
		montesSpiky     0.897713
		montesFraction  0.43588
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.96238
		hillsFraction   0.711673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271079
		craterFreq      0.192121
		craterDensity   0.695341
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491885
		volcanoTemp     1350.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.173, 0.172, 0.000)
		colorShelf     (0.185, 0.184, 0.183, 0.000)
		colorBeach     (0.196, 0.195, 0.194, 0.000)
		colorDesert    (0.207, 0.206, 0.205, 0.000)
		colorLowland   (0.218, 0.216, 0.216, 0.000)
		colorUpland    (0.229, 0.227, 0.226, 0.000)
		colorRock      (0.240, 0.238, 0.237, 0.000)
		colorSnow      (0.251, 0.249, 0.248, 1.000)
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
		MaxLength   0.98626
		GasToDust   0.25
		Particles   2972
		GasBright   0.224943
		DustBright  0.588393
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   498.204
		Period          3098.21
		Eccentricity    0.860255
		Inclination     -44.7987
		AscendingNode   118.048
		ArgOfPericenter -175.248
		MeanAnomaly     82.1752
	}
}

Comet	"C131"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.38445e-015
	Radius          0.190543
	InertiaMoment   0.399129

	Oblateness      0.0123094

	RotationPeriod  47.3712
	Obliquity       202.248
	EqAscendNode    171.092

	AbsMagn         11.7745
	SlopeParam      6.40957
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.690 0.615 0.547)

	Surface
	{
		SurfStyle       0.20244
		OceanStyle      0.939285
		Randomize      (0.047, 0.066, 0.138)
		colorDistMagn   0.162398
		colorDistFreq   1.54019e-005
		detailScale     5.20308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.931673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465149
		terraceProb     0.350263
		erosion         0
		montesMagn      0.42217
		montesFreq      3.89061
		montesSpiky     0.943424
		montesFraction  0.450963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00010784
		hillsFraction   0.634919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241939
		craterFreq      0.269861
		craterDensity   0.8208
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.589128
		volcanoTemp     1253.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.246, 0.219, 0.000)
		colorShelf     (0.293, 0.261, 0.232, 0.000)
		colorBeach     (0.310, 0.277, 0.246, 0.000)
		colorDesert    (0.328, 0.292, 0.260, 0.000)
		colorLowland   (0.345, 0.308, 0.273, 0.000)
		colorUpland    (0.362, 0.323, 0.287, 0.000)
		colorRock      (0.379, 0.338, 0.301, 0.000)
		colorSnow      (0.397, 0.354, 0.314, 1.000)
		BumpHeight      0.171488
		BumpOffset      0.0342977
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0567018
		GasToDust   0.25
		Particles   1094
		GasBright   0.167076
		DustBright  0.330746
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   302.895
		Period          1468.72
		Eccentricity    0.774494
		Inclination     97.5632
		AscendingNode   49.9547
		ArgOfPericenter -58.7206
		MeanAnomaly     -26.0395
	}
}

Comet	"C132"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.84419e-011
	Radius          3.37366
	InertiaMoment   0.397683

	Oblateness      0.00949832

	RotationPeriod  45.5602
	Obliquity       155.453
	EqAscendNode    155.669

	AbsMagn         7.89539
	SlopeParam      9.7356
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.433 0.429 0.424)

	Surface
	{
		SurfStyle       0.164138
		OceanStyle      0.78976
		Randomize      (-0.199, 0.755, -0.982)
		colorDistMagn   0.869466
		colorDistFreq   0.00846796
		detailScale     92.1233
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92617
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417938
		terraceProb     0.14628
		erosion         0
		montesMagn      0.588949
		montesFreq      3.17494
		montesSpiky     0.825067
		montesFraction  0.359604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0285577
		hillsFraction   0.566319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245241
		craterFreq      0.183494
		craterDensity   0.831934
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54802
		volcanoTemp     1243.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.172, 0.169, 0.000)
		colorShelf     (0.184, 0.182, 0.180, 0.000)
		colorBeach     (0.195, 0.193, 0.191, 0.000)
		colorDesert    (0.206, 0.204, 0.201, 0.000)
		colorLowland   (0.217, 0.214, 0.212, 0.000)
		colorUpland    (0.227, 0.225, 0.222, 0.000)
		colorRock      (0.238, 0.236, 0.233, 0.000)
		colorSnow      (0.249, 0.247, 0.244, 1.000)
		BumpHeight      3.03629
		BumpOffset      0.607258
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.537894
		GasToDust   0.25
		Particles   2066
		GasBright   0.387678
		DustBright  0.594632
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   482.525
		Period          2953.11
		Eccentricity    0.856402
		Inclination     -87.6289
		AscendingNode   -2.32062
		ArgOfPericenter 162.097
		MeanAnomaly     -122.627
	}
}

Comet	"C133"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.42635e-007
	Radius          74.4682
	InertiaMoment   0.399571

	Oblateness      0.01443

	RotationPeriod  43.743
	Obliquity       108.659
	EqAscendNode    140.247

	AbsMagn         3.88533
	SlopeParam      2.76629
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.722 0.719)

	Surface
	{
		SurfStyle       0.808212
		OceanStyle      0.212188
		Randomize      (-0.185, -0.177, -0.552)
		colorDistMagn   0.445935
		colorDistFreq   1.30841
		detailScale     2033.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980507
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544672
		terraceProb     0.361385
		erosion         0
		montesMagn      0.642213
		montesFreq      2.22619
		montesSpiky     0.880453
		montesFraction  0.590405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.9326
		hillsFraction   0.581217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235561
		craterFreq      0.191839
		craterDensity   1.01048
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606422
		volcanoTemp     1410.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.246, 0.201, 0.000)
		colorShelf     (0.290, 0.253, 0.230, 0.000)
		colorBeach     (0.341, 0.296, 0.273, 0.000)
		colorDesert    (0.370, 0.318, 0.266, 0.000)
		colorLowland   (0.406, 0.339, 0.302, 0.000)
		colorUpland    (0.449, 0.412, 0.367, 0.000)
		colorRock      (0.486, 0.448, 0.395, 0.000)
		colorSnow      (0.529, 0.477, 0.417, 1.000)
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
		GasBright   0.302528
		DustBright  0.364268
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   354.29
		Period          1857.97
		Eccentricity    0.845743
		Inclination     57.073
		AscendingNode   -117.759
		ArgOfPericenter -152.521
		MeanAnomaly     -140.187
	}
}

Comet	"C134"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.39185e-015
	Radius          0.208509
	InertiaMoment   0.398365

	Oblateness      0.0111538

	RotationPeriod  41.9149
	Obliquity       61.8647
	EqAscendNode    124.824

	AbsMagn         11.4604
	SlopeParam      3.39293
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.754 0.751)

	Surface
	{
		SurfStyle       0.708663
		OceanStyle      0.0480241
		Randomize      (0.184, -0.373, 0.132)
		colorDistMagn   0.218011
		colorDistFreq   3.28054e-005
		detailScale     5.69368
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585068
		terraceProb     0.272943
		erosion         0
		montesMagn      0.539152
		montesFreq      3.19104
		montesSpiky     0.992927
		montesFraction  0.531206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.17646e-005
		hillsFraction   0.535273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271704
		craterFreq      0.206308
		craterDensity   0.755247
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505642
		volcanoTemp     1597.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.256, 0.210, 0.000)
		colorShelf     (0.303, 0.264, 0.240, 0.000)
		colorBeach     (0.356, 0.309, 0.286, 0.000)
		colorDesert    (0.386, 0.332, 0.278, 0.000)
		colorLowland   (0.424, 0.355, 0.316, 0.000)
		colorUpland    (0.470, 0.430, 0.383, 0.000)
		colorRock      (0.507, 0.468, 0.413, 0.000)
		colorSnow      (0.553, 0.498, 0.436, 1.000)
		BumpHeight      0.187658
		BumpOffset      0.0375316
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.0895275
		GasToDust   0.25
		Particles   1160
		GasBright   0.00447881
		DustBright  0.346804
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   422.117
		Period          2416.3
		Eccentricity    0.699556
		Inclination     -99.6547
		AscendingNode   -89.1411
		ArgOfPericenter 41.3541
		MeanAnomaly     75.823
	}
}

Comet	"C135"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.39678e-011
	Radius          4.61265
	InertiaMoment   0.399993

	Oblateness      0.0171874

	RotationPeriod  40.0709
	Obliquity       15.0704
	EqAscendNode    109.401

	AbsMagn         7.68644
	SlopeParam      3.964
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.786 0.698 0.614)

	Surface
	{
		SurfStyle       0.179116
		OceanStyle      0.321473
		Randomize      (0.956, -0.004, 0.943)
		colorDistMagn   0.138307
		colorDistFreq   0.00945029
		detailScale     125.956
		colorConversion true
		snowLevel       2
		tropicLatitude  0.433151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593654
		terraceProb     0.136448
		erosion         0
		montesMagn      0.614204
		montesFreq      2.38252
		montesSpiky     0.89995
		montesFraction  0.694951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0550367
		hillsFraction   0.595286
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227885
		craterFreq      0.212489
		craterDensity   0.824587
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491424
		volcanoTemp     1693.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.279, 0.246, 0.000)
		colorShelf     (0.334, 0.297, 0.261, 0.000)
		colorBeach     (0.354, 0.314, 0.277, 0.000)
		colorDesert    (0.373, 0.332, 0.292, 0.000)
		colorLowland   (0.393, 0.349, 0.307, 0.000)
		colorUpland    (0.412, 0.367, 0.323, 0.000)
		colorRock      (0.432, 0.384, 0.338, 0.000)
		colorSnow      (0.452, 0.401, 0.353, 1.000)
		BumpHeight      4.15138
		BumpOffset      0.830277
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.57072
		GasToDust   0.25
		Particles   2132
		GasBright   0.0600041
		DustBright  0.775765
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   402.323
		Period          2248.34
		Eccentricity    0.811592
		Inclination     -141.401
		AscendingNode   -154.714
		ArgOfPericenter -21.6176
		MeanAnomaly     122.779
	}
}

Comet	"C136"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.62716e-007
	Radius          81.2827
	InertiaMoment   0.398895

	Oblateness      0.0133212

	RotationPeriod  38.2059
	Obliquity       328.276
	EqAscendNode    93.9787

	AbsMagn         3.51347
	SlopeParam      4.53208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.698 0.633)

	Surface
	{
		SurfStyle       0.229026
		OceanStyle      0.91198
		Randomize      (0.118, 0.296, 0.592)
		colorDistMagn   0.0688509
		colorDistFreq   2.90764
		detailScale     2219.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.165856
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453072
		terraceProb     0.396014
		erosion         0
		montesMagn      0.437801
		montesFreq      3.06612
		montesSpiky     0.989661
		montesFraction  0.723585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.7103
		hillsFraction   0.528825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259535
		craterFreq      0.245324
		craterDensity   0.839533
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450064
		volcanoTemp     1149.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.279, 0.253, 0.000)
		colorShelf     (0.328, 0.297, 0.269, 0.000)
		colorBeach     (0.347, 0.314, 0.285, 0.000)
		colorDesert    (0.367, 0.332, 0.301, 0.000)
		colorLowland   (0.386, 0.349, 0.317, 0.000)
		colorUpland    (0.405, 0.367, 0.333, 0.000)
		colorRock      (0.424, 0.384, 0.348, 0.000)
		colorSnow      (0.444, 0.402, 0.364, 1.000)
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
		GasBright   0.0680704
		DustBright  0.452185
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   371.014
		Period          1991.07
		Eccentricity    0.776074
		Inclination     28.7738
		AscendingNode   -18.1
		ArgOfPericenter -176.124
		MeanAnomaly     43.6573
	}
}

Comet	"C137"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            8.08924e-015
	Radius          0.285714
	InertiaMoment   0.397217

	Oblateness      0.0206679

	RotationPeriod  36.3143
	Obliquity       281.482
	EqAscendNode    78.5562

	AbsMagn         11.1664
	SlopeParam      5.14774
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.539 0.536)

	Surface
	{
		SurfStyle       0.892559
		OceanStyle      0.318509
		Randomize      (-0.512, 0.475, -0.391)
		colorDistMagn   0.860028
		colorDistFreq   6.85469e-005
		detailScale     7.80189
		colorConversion true
		snowLevel       2
		tropicLatitude  0.712912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54992
		terraceProb     0.138932
		erosion         0
		montesMagn      0.429334
		montesFreq      4.1408
		montesSpiky     0.954767
		montesFraction  0.540098
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000210982
		hillsFraction   0.715262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228001
		craterFreq      0.148379
		craterDensity   1.06685
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508989
		volcanoTemp     1321.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.188, 0.214, 0.050)
		colorShelf     (0.218, 0.221, 0.246, 0.040)
		colorBeach     (0.251, 0.253, 0.279, 0.030)
		colorDesert    (0.284, 0.285, 0.316, 0.020)
		colorLowland   (0.317, 0.318, 0.348, 0.030)
		colorUpland    (0.349, 0.350, 0.380, 0.050)
		colorRock      (0.382, 0.382, 0.423, 0.020)
		colorSnow      (0.382, 0.382, 0.423, 1.000)
		BumpHeight      0.257142
		BumpOffset      0.0514285
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.122354
		GasToDust   0.25
		Particles   1226
		GasBright   0.0388776
		DustBright  0.165865
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   389.346
		Period          2140.45
		Eccentricity    0.829367
		Inclination     -106.949
		AscendingNode   46.6729
		ArgOfPericenter -112.8
		MeanAnomaly     -55.0004
	}
}

Comet	"C138"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.25645e-011
	Radius          5.01964
	InertiaMoment   0.399357

	Oblateness      0.0162885

	RotationPeriod  34.3897
	Obliquity       234.688
	EqAscendNode    63.1336

	AbsMagn         7.47664
	SlopeParam      5.90083
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.563 0.561 0.557)

	Surface
	{
		SurfStyle       0.102088
		OceanStyle      0.757113
		Randomize      (-0.322, 0.905, -0.929)
		colorDistMagn   0.293868
		colorDistFreq   0.00751249
		detailScale     137.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.807242
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531194
		terraceProb     0.679996
		erosion         0
		montesMagn      0.600417
		montesFreq      3.49501
		montesSpiky     0.885511
		montesFraction  0.36791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0598675
		hillsFraction   0.890607
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224612
		craterFreq      0.255932
		craterDensity   0.77978
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438881
		volcanoTemp     1386.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.224, 0.223, 0.000)
		colorShelf     (0.239, 0.238, 0.237, 0.000)
		colorBeach     (0.253, 0.252, 0.251, 0.000)
		colorDesert    (0.268, 0.266, 0.265, 0.000)
		colorLowland   (0.282, 0.280, 0.279, 0.000)
		colorUpland    (0.296, 0.294, 0.292, 0.000)
		colorRock      (0.310, 0.308, 0.306, 0.000)
		colorSnow      (0.324, 0.322, 0.320, 1.000)
		BumpHeight      4.51768
		BumpOffset      0.903536
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.603546
		GasToDust   0.25
		Particles   2199
		GasBright   0.17157
		DustBright  0.517658
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   382.475
		Period          2084.03
		Eccentricity    0.87282
		Inclination     1.09769
		AscendingNode   -141.844
		ArgOfPericenter -40.7224
		MeanAnomaly     -31.8097
	}
}

Comet	"C139"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.83891e-007
	Radius          111.664
	InertiaMoment   0.398056

	Oblateness      0.0259506

	RotationPeriod  32.4255
	Obliquity       187.893
	EqAscendNode    47.711

	AbsMagn         3.09817
	SlopeParam      7.12858
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.741 0.647 0.541)

	Surface
	{
		SurfStyle       0.763435
		OceanStyle      0.607528
		Randomize      (0.329, 0.235, -0.693)
		colorDistMagn   0.181058
		colorDistFreq   7.34121
		detailScale     3049.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.515452
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397715
		terraceProb     0.486575
		erosion         0
		montesMagn      0.492415
		montesFreq      3.5479
		montesSpiky     0.959518
		montesFraction  0.557712
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.6935
		hillsFraction   0.62304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255989
		craterFreq      0.479127
		craterDensity   0.975021
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522075
		volcanoTemp     1387.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.220, 0.151, 0.000)
		colorShelf     (0.296, 0.226, 0.173, 0.000)
		colorBeach     (0.348, 0.265, 0.205, 0.000)
		colorDesert    (0.378, 0.285, 0.200, 0.000)
		colorLowland   (0.415, 0.304, 0.227, 0.000)
		colorUpland    (0.459, 0.369, 0.276, 0.000)
		colorRock      (0.497, 0.401, 0.297, 0.000)
		colorSnow      (0.541, 0.427, 0.314, 1.000)
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
		GasBright   0.115095
		DustBright  0.25862
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   473.764
		Period          2873.05
		Eccentricity    0.908623
		Inclination     145.483
		AscendingNode   -58.4083
		ArgOfPericenter -5.18255
		MeanAnomaly     -77.8142
	}
}

Comet	"C140"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.48993e-014
	Radius          0.309786
	InertiaMoment   0.399786

	Oblateness      0.0205887

	RotationPeriod  30.4137
	Obliquity       141.099
	EqAscendNode    32.2884

	AbsMagn         10.8885
	SlopeParam      2.40001
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.629 0.627)

	Surface
	{
		SurfStyle       0.489706
		OceanStyle      0.877119
		Randomize      (-0.194, -0.518, -0.674)
		colorDistMagn   0.142651
		colorDistFreq   7.55728e-005
		detailScale     8.45923
		colorConversion true
		snowLevel       2
		tropicLatitude  0.890132
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632222
		terraceProb     0.271796
		erosion         0
		montesMagn      0.518664
		montesFreq      2.7592
		montesSpiky     0.893217
		montesFraction  0.926069
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000239337
		hillsFraction   0.681603
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262832
		craterFreq      0.269355
		craterDensity   0.730082
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457508
		volcanoTemp     1549.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.252, 0.251, 0.000)
		colorShelf     (0.269, 0.267, 0.266, 0.000)
		colorBeach     (0.285, 0.283, 0.282, 0.000)
		colorDesert    (0.301, 0.299, 0.298, 0.000)
		colorLowland   (0.316, 0.315, 0.313, 0.000)
		colorUpland    (0.332, 0.330, 0.329, 0.000)
		colorRock      (0.348, 0.346, 0.345, 0.000)
		colorSnow      (0.364, 0.362, 0.360, 1.000)
		BumpHeight      0.278808
		BumpOffset      0.0557615
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.155179
		GasToDust   0.25
		Particles   1293
		GasBright   0.314978
		DustBright  0.543223
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   445.053
		Period          2615.88
		Eccentricity    0.841185
		Inclination     155.878
		AscendingNode   7.2854
		ArgOfPericenter -150.106
		MeanAnomaly     135.812
	}
}

Comet	"C141"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.15236e-010
	Radius          6.91662
	InertiaMoment   0.398645

	Oblateness      0.0339642

	RotationPeriod  28.3454
	Obliquity       94.3047
	EqAscendNode    16.8658

	AbsMagn         7.26538
	SlopeParam      3.08655
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.581 0.486 0.418)

	Surface
	{
		SurfStyle       0.235641
		OceanStyle      0.319453
		Randomize      (0.652, 0.313, 0.991)
		colorDistMagn   0.907663
		colorDistFreq   0.0214786
		detailScale     188.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414919
		terraceProb     0.597302
		erosion         0
		montesMagn      0.489914
		montesFreq      2.62514
		montesSpiky     0.811465
		montesFraction  0.745504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.135937
		hillsFraction   0.46546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231099
		craterFreq      0.221285
		craterDensity   0.871851
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462391
		volcanoTemp     1223.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.194, 0.167, 0.000)
		colorShelf     (0.247, 0.206, 0.178, 0.000)
		colorBeach     (0.261, 0.218, 0.188, 0.000)
		colorDesert    (0.276, 0.231, 0.199, 0.000)
		colorLowland   (0.290, 0.243, 0.209, 0.000)
		colorUpland    (0.305, 0.255, 0.220, 0.000)
		colorRock      (0.319, 0.267, 0.230, 0.000)
		colorSnow      (0.334, 0.279, 0.241, 1.000)
		BumpHeight      6.22496
		BumpOffset      1.24499
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.636371
		GasToDust   0.25
		Particles   2265
		GasBright   0.231221
		DustBright  0.311467
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   381.786
		Period          2078.41
		Eccentricity    0.886237
		Inclination     167.671
		AscendingNode   136.36
		ArgOfPericenter -164.496
		MeanAnomaly     137.754
	}
}

Comet	"C142"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.54819e-018
	Radius          0.019099
	InertiaMoment   0.396518

	Oblateness      0.0269475

	RotationPeriod  26.21
	Obliquity       47.5104
	EqAscendNode    1.4432

	AbsMagn         2.62199
	SlopeParam      3.67782
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.663 0.528 0.470)

	Surface
	{
		SurfStyle       0.300274
		OceanStyle      0.397036
		Randomize      (0.947, 0.340, 0.283)
		colorDistMagn   0.826329
		colorDistFreq   1.70854e-007
		detailScale     0.521531
		colorConversion true
		snowLevel       2
		tropicLatitude  0.697117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410703
		terraceProb     0.474941
		erosion         0
		montesMagn      0.4286
		montesFreq      2.75269
		montesSpiky     0.999037
		montesFraction  0.578655
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.73711e-007
		hillsFraction   0.751525
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25654
		craterFreq      0.203843
		craterDensity   0.899762
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516371
		volcanoTemp     1589.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.211, 0.188, 0.000)
		colorShelf     (0.282, 0.224, 0.200, 0.000)
		colorBeach     (0.298, 0.238, 0.211, 0.000)
		colorDesert    (0.315, 0.251, 0.223, 0.000)
		colorLowland   (0.331, 0.264, 0.235, 0.000)
		colorUpland    (0.348, 0.277, 0.247, 0.000)
		colorRock      (0.365, 0.290, 0.258, 0.000)
		colorSnow      (0.381, 0.304, 0.270, 1.000)
		BumpHeight      0.0171891
		BumpOffset      0.00343783
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.110205
		DustBright  0.11697
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   338.637
		Period          1736.21
		Eccentricity    0.815679
		Inclination     -169.377
		AscendingNode   -112.983
		ArgOfPericenter -22.2725
		MeanAnomaly     142.376
	}
}

Comet	"C143"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.74427e-014
	Radius          0.428427
	InertiaMoment   0.399134

	Oblateness      0.0473856

	RotationPeriod  23.9951
	Obliquity       0.716064
	EqAscendNode    346.021

	AbsMagn         10.6239
	SlopeParam      4.24166
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.640 0.634)

	Surface
	{
		SurfStyle       0.640483
		OceanStyle      0.385093
		Randomize      (0.292, -0.979, -0.587)
		colorDistMagn   0.459745
		colorDistFreq   0.000114922
		detailScale     11.6989
		colorConversion true
		snowLevel       2
		tropicLatitude  0.440298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391439
		terraceProb     0.269748
		erosion         0
		montesMagn      0.486937
		montesFreq      3.3079
		montesSpiky     0.95182
		montesFraction  0.609778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000396194
		hillsFraction   0.80597
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268796
		craterFreq      0.26394
		craterDensity   0.91831
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515994
		volcanoTemp     1470.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.177, 0.000)
		colorShelf     (0.258, 0.224, 0.203, 0.000)
		colorBeach     (0.303, 0.262, 0.241, 0.000)
		colorDesert    (0.329, 0.282, 0.234, 0.000)
		colorLowland   (0.361, 0.301, 0.266, 0.000)
		colorUpland    (0.399, 0.365, 0.323, 0.000)
		colorRock      (0.432, 0.397, 0.349, 0.000)
		colorSnow      (0.470, 0.422, 0.368, 1.000)
		BumpHeight      0.385584
		BumpOffset      0.0771169
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.188005
		GasToDust   0.25
		Particles   1359
		GasBright   0.031425
		DustBright  0.680237
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   434.723
		Period          2525.33
		Eccentricity    0.89872
		Inclination     -26.812
		AscendingNode   -15.5648
		ArgOfPericenter -74.8885
		MeanAnomaly     -30.5295
	}
}

Comet	"C144"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.1225e-010
	Radius          7.41612
	InertiaMoment   0.397693

	Oblateness      0.0386984

	RotationPeriod  21.6853
	Obliquity       313.922
	EqAscendNode    330.598

	AbsMagn         7.05206
	SlopeParam      4.82582
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.543 0.536 0.530)

	Surface
	{
		SurfStyle       0.229018
		OceanStyle      0.546071
		Randomize      (-0.675, 0.814, -0.656)
		colorDistMagn   0.96745
		colorDistFreq   0.0357703
		detailScale     202.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.289007
		terraceProb     0.193557
		erosion         0
		montesMagn      0.545383
		montesFreq      4.00324
		montesSpiky     0.791553
		montesFraction  0.64123
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.150038
		hillsFraction   0.787035
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261378
		craterFreq      0.275493
		craterDensity   0.755661
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527044
		volcanoTemp     1545.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.215, 0.212, 0.000)
		colorShelf     (0.231, 0.228, 0.225, 0.000)
		colorBeach     (0.244, 0.241, 0.239, 0.000)
		colorDesert    (0.258, 0.255, 0.252, 0.000)
		colorLowland   (0.271, 0.268, 0.265, 0.000)
		colorUpland    (0.285, 0.282, 0.278, 0.000)
		colorRock      (0.298, 0.295, 0.292, 0.000)
		colorSnow      (0.312, 0.308, 0.305, 1.000)
		BumpHeight      6.67451
		BumpOffset      1.3349
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.669197
		GasToDust   0.25
		Particles   2331
		GasBright   0.0408835
		DustBright  0.355265
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   424.497
		Period          2436.76
		Eccentricity    0.864726
		Inclination     -111.882
		AscendingNode   -172.582
		ArgOfPericenter 93.9066
		MeanAnomaly     -163.906
	}
}

Comet	"C145"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            6.53534e-018
	Radius          0.0265375
	InertiaMoment   0.399576

	Oblateness      0.0735079

	RotationPeriod  19.2616
	Obliquity       267.127
	EqAscendNode    315.175

	AbsMagn         2.05434
	SlopeParam      5.49249
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.693 0.690)

	Surface
	{
		SurfStyle       0.325037
		OceanStyle      0.0348637
		Randomize      (-0.617, -0.735, -0.958)
		colorDistMagn   0.200916
		colorDistFreq   3.8122e-007
		detailScale     0.724652
		colorConversion true
		snowLevel       2
		tropicLatitude  0.701989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.755944
		terraceProb     0.61948
		erosion         0
		montesMagn      0.44929
		montesFreq      3.70366
		montesSpiky     0.907417
		montesFraction  0.512972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26129e-006
		hillsFraction   0.549796
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240439
		craterFreq      0.179388
		craterDensity   0.916717
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511014
		volcanoTemp     1327.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.277, 0.276, 0.000)
		colorShelf     (0.295, 0.295, 0.293, 0.000)
		colorBeach     (0.313, 0.312, 0.310, 0.000)
		colorDesert    (0.330, 0.329, 0.328, 0.000)
		colorLowland   (0.348, 0.347, 0.345, 0.000)
		colorUpland    (0.365, 0.364, 0.362, 0.000)
		colorRock      (0.382, 0.381, 0.379, 0.000)
		colorSnow      (0.400, 0.399, 0.397, 1.000)
		BumpHeight      0.0238838
		BumpOffset      0.00477676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.142881
		DustBright  0.737754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   357.223
		Period          1881.09
		Eccentricity    0.835069
		Inclination     54.9864
		AscendingNode   -25.0673
		ArgOfPericenter 51.781
		MeanAnomaly     -11.4117
	}
}

Comet	"C146"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.05461e-014
	Radius          0.454416
	InertiaMoment   0.398372

	Oblateness      0.0631943

	RotationPeriod  16.7001
	Obliquity       220.333
	EqAscendNode    299.753

	AbsMagn         10.3704
	SlopeParam      6.3937
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.572 0.485)

	Surface
	{
		SurfStyle       0.873744
		OceanStyle      0.184783
		Randomize      (0.617, -0.479, -0.894)
		colorDistMagn   0.709679
		colorDistFreq   0.000165784
		detailScale     12.4086
		colorConversion true
		snowLevel       2
		tropicLatitude  0.400773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398171
		terraceProb     0.199354
		erosion         0
		montesMagn      0.6866
		montesFreq      2.80292
		montesSpiky     0.886666
		montesFraction  0.63134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00055291
		hillsFraction   0.558117
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250302
		craterFreq      0.219418
		craterDensity   0.839067
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463319
		volcanoTemp     1290.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.200, 0.194, 0.050)
		colorShelf     (0.257, 0.234, 0.223, 0.040)
		colorBeach     (0.296, 0.269, 0.252, 0.030)
		colorDesert    (0.334, 0.303, 0.286, 0.020)
		colorLowland   (0.373, 0.337, 0.315, 0.030)
		colorUpland    (0.411, 0.372, 0.345, 0.050)
		colorRock      (0.450, 0.406, 0.383, 0.020)
		colorSnow      (0.450, 0.406, 0.383, 1.000)
		BumpHeight      0.408974
		BumpOffset      0.0817949
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.220831
		GasToDust   0.25
		Particles   1425
		GasBright   0.125057
		DustBright  0.440064
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   358.727
		Period          1892.98
		Eccentricity    0.885348
		Inclination     45.2504
		AscendingNode   145.654
		ArgOfPericenter -49.3649
		MeanAnomaly     -167.076
	}
}

Comet	"C147"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.90937e-010
	Radius          10.3716
	InertiaMoment   0.399998

	Oblateness      0.139689

	RotationPeriod  13.9694
	Obliquity       173.539
	EqAscendNode    284.33

	AbsMagn         6.836
	SlopeParam      9.37381
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.775 0.691 0.634)

	Surface
	{
		SurfStyle       0.174016
		OceanStyle      0.718806
		Randomize      (0.101, 0.610, 0.946)
		colorDistMagn   0.981518
		colorDistFreq   0.069826
		detailScale     283.213
		colorConversion true
		snowLevel       2
		tropicLatitude  0.279686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412663
		terraceProb     0.226488
		erosion         0
		montesMagn      0.552685
		montesFreq      3.31765
		montesSpiky     0.906121
		montesFraction  0.698749
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.195405
		hillsFraction   0.650616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238683
		craterFreq      0.251175
		craterDensity   0.867387
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476243
		volcanoTemp     1543.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.277, 0.254, 0.000)
		colorShelf     (0.329, 0.294, 0.270, 0.000)
		colorBeach     (0.349, 0.311, 0.285, 0.000)
		colorDesert    (0.368, 0.328, 0.301, 0.000)
		colorLowland   (0.387, 0.346, 0.317, 0.000)
		colorUpland    (0.407, 0.363, 0.333, 0.000)
		colorRock      (0.426, 0.380, 0.349, 0.000)
		colorSnow      (0.445, 0.398, 0.365, 1.000)
		BumpHeight      9.33441
		BumpOffset      1.86688
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.702023
		GasToDust   0.25
		Particles   2398
		GasBright   0.0699746
		DustBright  0.179633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   323.623
		Period          1622.03
		Eccentricity    0.855397
		Inclination     165.473
		AscendingNode   -86.3606
		ArgOfPericenter 109.143
		MeanAnomaly     -168.509
	}
}

Comet	"C148"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.20372e-017
	Radius          0.0435143
	InertiaMoment   0.398901

	Oblateness      0.249

	RotationPeriod  11.0273
	Obliquity       126.745
	EqAscendNode    268.908

	AbsMagn         1.33277
	SlopeParam      2.75694
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.517 0.514)

	Surface
	{
		SurfStyle       0.720591
		OceanStyle      0.353325
		Randomize      (0.369, 0.956, 0.059)
		colorDistMagn   0.623846
		colorDistFreq   4.46143e-008
		detailScale     1.18823
		colorConversion true
		snowLevel       2
		tropicLatitude  0.755131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514874
		terraceProb     0.160889
		erosion         0
		montesMagn      0.569518
		montesFreq      2.89196
		montesSpiky     0.951218
		montesFraction  0.556506
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.60399e-006
		hillsFraction   0.75832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251839
		craterFreq      0.236714
		craterDensity   0.900761
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.432466
		volcanoTemp     1882.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.176, 0.144, 0.000)
		colorShelf     (0.209, 0.181, 0.164, 0.000)
		colorBeach     (0.246, 0.212, 0.195, 0.000)
		colorDesert    (0.267, 0.227, 0.190, 0.000)
		colorLowland   (0.293, 0.243, 0.216, 0.000)
		colorUpland    (0.324, 0.295, 0.262, 0.000)
		colorRock      (0.350, 0.320, 0.283, 0.000)
		colorSnow      (0.382, 0.341, 0.298, 1.000)
		BumpHeight      0.0391629
		BumpOffset      0.00783258
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.24914
		DustBright  0.484955
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   300.595
		Period          1452.02
		Eccentricity    0.71622
		Inclination     4.34152
		AscendingNode   13.2621
		ArgOfPericenter 55.6466
		MeanAnomaly     164.459
	}
}

Comet	"C149"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            9.30994e-014
	Radius          0.642435
	InertiaMoment   0.397231

	Oblateness      0.249

	RotationPeriod  7.81496
	Obliquity       79.9503
	EqAscendNode    253.485

	AbsMagn         10.126
	SlopeParam      3.38485
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.469 0.462 0.458)

	Surface
	{
		SurfStyle       0.827026
		OceanStyle      0.0588531
		Randomize      (-0.350, 0.405, -0.896)
		colorDistMagn   0.648094
		colorDistFreq   0.000219915
		detailScale     17.5428
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445964
		terraceProb     0.257042
		erosion         0
		montesMagn      0.515949
		montesFreq      3.82667
		montesSpiky     0.853309
		montesFraction  0.352336
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000944273
		hillsFraction   0.723553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267276
		craterFreq      0.175156
		craterDensity   1.09181
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566821
		volcanoTemp     1153.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.157, 0.128, 0.000)
		colorShelf     (0.188, 0.162, 0.147, 0.000)
		colorBeach     (0.221, 0.189, 0.174, 0.000)
		colorDesert    (0.239, 0.203, 0.170, 0.000)
		colorLowland   (0.263, 0.217, 0.193, 0.000)
		colorUpland    (0.291, 0.263, 0.234, 0.000)
		colorRock      (0.314, 0.286, 0.252, 0.000)
		colorSnow      (0.343, 0.305, 0.266, 1.000)
		BumpHeight      0.578191
		BumpOffset      0.115638
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.253657
		GasToDust   0.25
		Particles   1492
		GasBright   0.166775
		DustBright  0.251806
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   348.492
		Period          1812.55
		Eccentricity    0.761667
		Inclination     99.0901
		AscendingNode   96.5303
		ArgOfPericenter -127.977
		MeanAnomaly     -36.1675
	}
}

Comet	"C150"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.20057e-010
	Radius          16.0617
	InertiaMoment   0.399362

	Oblateness      0.249

	RotationPeriod  4.24596
	Obliquity       33.156
	EqAscendNode    238.062

	AbsMagn         6.61649
	SlopeParam      3.95628
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.638 0.634)

	Surface
	{
		SurfStyle       0.193777
		OceanStyle      0.299884
		Randomize      (-0.534, 0.974, -0.830)
		colorDistMagn   0.854893
		colorDistFreq   0.192438
		detailScale     438.592
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99678
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.264519
		terraceProb     0.453138
		erosion         0
		montesMagn      0.628374
		montesFreq      2.25668
		montesSpiky     0.963832
		montesFraction  0.400685
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.707266
		hillsFraction   0.458924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239047
		craterFreq      0.20398
		craterDensity   0.891432
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466902
		volcanoTemp     1589.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.255, 0.254, 0.000)
		colorShelf     (0.272, 0.271, 0.270, 0.000)
		colorBeach     (0.288, 0.287, 0.285, 0.000)
		colorDesert    (0.304, 0.303, 0.301, 0.000)
		colorLowland   (0.320, 0.319, 0.317, 0.000)
		colorUpland    (0.336, 0.335, 0.333, 0.000)
		colorRock      (0.352, 0.351, 0.349, 0.000)
		colorSnow      (0.368, 0.367, 0.365, 1.000)
		BumpHeight      14.4556
		BumpOffset      2.89111
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.734849
		GasToDust   0.25
		Particles   2464
		GasBright   0.41313
		DustBright  0.489938
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   245.15
		Period          1069.42
		Eccentricity    0.707012
		Inclination     66.9722
		AscendingNode   35.9103
		ArgOfPericenter -70.8419
		MeanAnomaly     -61.6765
	}
}

Comet	"C151"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.21711e-017
	Radius          0.0397937
	InertiaMoment   0.398065

	Oblateness      0.00157086

	RotationPeriod  130.988
	Obliquity       346.362
	EqAscendNode    222.64

	AbsMagn         0.290593
	SlopeParam      4.52409
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.762 0.760 0.758)

	Surface
	{
		SurfStyle       0.741725
		OceanStyle      0.977504
		Randomize      (0.370, -0.530, 0.941)
		colorDistMagn   0.0321044
		colorDistFreq   9.80021e-007
		detailScale     1.08663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.736888
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507288
		terraceProb     0.389189
		erosion         0
		montesMagn      0.521215
		montesFreq      2.18091
		montesSpiky     0.958446
		montesFraction  0.479922
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.04157e-006
		hillsFraction   0.812667
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214594
		craterFreq      0.21129
		craterDensity   0.995926
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48108
		volcanoTemp     1594.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.258, 0.212, 0.000)
		colorShelf     (0.305, 0.266, 0.243, 0.000)
		colorBeach     (0.358, 0.311, 0.288, 0.000)
		colorDesert    (0.388, 0.334, 0.281, 0.000)
		colorLowland   (0.426, 0.357, 0.319, 0.000)
		colorUpland    (0.472, 0.433, 0.387, 0.000)
		colorRock      (0.510, 0.471, 0.417, 0.000)
		colorSnow      (0.556, 0.501, 0.440, 1.000)
		BumpHeight      0.0358143
		BumpOffset      0.00716287
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.00970593
		DustBright  0.577848
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   393.085
		Period          2171.35
		Eccentricity    0.779395
		Inclination     -42.6109
		AscendingNode   75.7843
		ArgOfPericenter -125.357
		MeanAnomaly     137.176
	}
}

Comet	"C152"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.71478e-013
	Radius          0.971123
	InertiaMoment   0.399791

	Oblateness      0.0038292

	RotationPeriod  115.38
	Obliquity       299.567
	EqAscendNode    207.217

	AbsMagn         9.88937
	SlopeParam      5.13865
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.409 0.407 0.404)

	Surface
	{
		SurfStyle       0.526754
		OceanStyle      0.273581
		Randomize      (-0.019, -0.382, 0.304)
		colorDistMagn   0.465044
		colorDistFreq   0.000211147
		detailScale     26.5181
		colorConversion true
		snowLevel       2
		tropicLatitude  0.887283
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634019
		terraceProb     0.294121
		erosion         0
		montesMagn      0.430975
		montesFreq      3.58826
		montesSpiky     0.975604
		montesFraction  0.604378
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00184622
		hillsFraction   0.524802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219507
		craterFreq      0.191318
		craterDensity   1.05247
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472886
		volcanoTemp     1260.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.192, 0.167, 0.154, 0.000)
		colorDesert    (0.209, 0.179, 0.149, 0.000)
		colorLowland   (0.229, 0.191, 0.170, 0.000)
		colorUpland    (0.254, 0.232, 0.206, 0.000)
		colorRock      (0.274, 0.252, 0.222, 0.000)
		colorSnow      (0.299, 0.269, 0.234, 1.000)
		BumpHeight      0.874011
		BumpOffset      0.174802
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.286483
		GasToDust   0.25
		Particles   1558
		GasBright   0.0205566
		DustBright  0.251484
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   462.096
		Period          2767.57
		Eccentricity    0.826498
		Inclination     150.312
		AscendingNode   -94.3338
		ArgOfPericenter -16.6778
		MeanAnomaly     171.057
	}
}

Comet	"C153"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.32626e-009
	Radius          15.5525
	InertiaMoment   0.398652

	Oblateness      0.0023554

	RotationPeriod  106.981
	Obliquity       252.773
	EqAscendNode    191.795

	AbsMagn         6.39273
	SlopeParam      5.88874
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.629 0.626)

	Surface
	{
		SurfStyle       0.484839
		OceanStyle      0.655854
		Randomize      (0.352, 0.155, 0.072)
		colorDistMagn   0.0372322
		colorDistFreq   0.190573
		detailScale     424.687
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907661
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582701
		terraceProb     0.163324
		erosion         0
		montesMagn      0.366639
		montesFreq      3.31555
		montesSpiky     0.918089
		montesFraction  0.475181
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.557763
		hillsFraction   0.76298
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248767
		craterFreq      0.204455
		craterDensity   1.07293
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494474
		volcanoTemp     1723.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.251, 0.251, 0.000)
		colorShelf     (0.269, 0.267, 0.266, 0.000)
		colorBeach     (0.285, 0.283, 0.282, 0.000)
		colorDesert    (0.301, 0.299, 0.297, 0.000)
		colorLowland   (0.317, 0.314, 0.313, 0.000)
		colorUpland    (0.333, 0.330, 0.329, 0.000)
		colorRock      (0.348, 0.346, 0.344, 0.000)
		colorSnow      (0.364, 0.361, 0.360, 1.000)
		BumpHeight      13.9973
		BumpOffset      2.79945
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.767675
		GasToDust   0.25
		Particles   2530
		GasBright   0.101836
		DustBright  0.654691
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   432.275
		Period          2504.04
		Eccentricity    0.847437
		Inclination     -103.387
		AscendingNode   58.2993
		ArgOfPericenter 151.324
		MeanAnomaly     -61.8615
	}
}

Comet	"C154"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.08365e-017
	Radius          0.0592346
	InertiaMoment   0.396542

	Oblateness      0.00471037

	RotationPeriod  100.935
	Obliquity       205.979
	EqAscendNode    176.372

	AbsMagn         19.9555
	SlopeParam      7.10262
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.534 0.526)

	Surface
	{
		SurfStyle       0.00229189
		OceanStyle      0.136676
		Randomize      (-0.656, -0.986, -0.317)
		colorDistMagn   0.429047
		colorDistFreq   1.60495e-006
		detailScale     1.6175
		colorConversion true
		snowLevel       2
		tropicLatitude  0.947781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413942
		terraceProb     0.53866
		erosion         0
		montesMagn      0.3391
		montesFreq      2.19169
		montesSpiky     0.975922
		montesFraction  0.321208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.16523e-006
		hillsFraction   0.776454
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24983
		craterFreq      0.249203
		craterDensity   1.04173
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461368
		volcanoTemp     1525.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.214, 0.210, 0.000)
		colorShelf     (0.229, 0.227, 0.224, 0.000)
		colorBeach     (0.243, 0.240, 0.237, 0.000)
		colorDesert    (0.256, 0.254, 0.250, 0.000)
		colorLowland   (0.270, 0.267, 0.263, 0.000)
		colorUpland    (0.283, 0.280, 0.276, 0.000)
		colorRock      (0.297, 0.294, 0.289, 0.000)
		colorSnow      (0.310, 0.307, 0.303, 1.000)
		BumpHeight      0.0533111
		BumpOffset      0.0106622
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0854045
		DustBright  0.355609
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   366.279
		Period          1953.08
		Eccentricity    0.901041
		Inclination     85.9454
		AscendingNode   125.762
		ArgOfPericenter -175.819
		MeanAnomaly     73.5096
	}
}

Comet	"C155"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            3.15841e-013
	Radius          0.963356
	InertiaMoment   0.39914

	Oblateness      0.00291858

	RotationPeriod  96.0967
	Obliquity       159.185
	EqAscendNode    160.95

	AbsMagn         9.65914
	SlopeParam      2.38936
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.787 0.785)

	Surface
	{
		SurfStyle       0.0597587
		OceanStyle      0.0217931
		Randomize      (-0.750, 0.673, -0.603)
		colorDistMagn   0.214714
		colorDistFreq   0.000220151
		detailScale     26.306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993001
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532228
		terraceProb     0.187075
		erosion         0
		montesMagn      0.455496
		montesFreq      2.92985
		montesSpiky     0.885759
		montesFraction  0.874119
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00239538
		hillsFraction   0.783107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260073
		craterFreq      0.20509
		craterDensity   0.990574
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476973
		volcanoTemp     1398.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.315, 0.314, 0.000)
		colorShelf     (0.336, 0.334, 0.333, 0.000)
		colorBeach     (0.355, 0.354, 0.353, 0.000)
		colorDesert    (0.375, 0.374, 0.373, 0.000)
		colorLowland   (0.395, 0.393, 0.392, 0.000)
		colorUpland    (0.415, 0.413, 0.412, 0.000)
		colorRock      (0.434, 0.433, 0.432, 0.000)
		colorSnow      (0.454, 0.452, 0.451, 1.000)
		BumpHeight      0.86702
		BumpOffset      0.173404
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.319309
		GasToDust   0.25
		Particles   1624
		GasBright   0.233874
		DustBright  0.691626
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   359.984
		Period          1902.94
		Eccentricity    0.819845
		Inclination     77.7734
		AscendingNode   -103.292
		ArgOfPericenter 79.6912
		MeanAnomaly     -9.97428
	}
}

Comet	"C156"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.4428e-009
	Radius          22.8916
	InertiaMoment   0.397703

	Oblateness      0.00549463

	RotationPeriod  91.9984
	Obliquity       112.39
	EqAscendNode    145.527

	AbsMagn         6.16382
	SlopeParam      3.07798
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.672 0.593 0.543)

	Surface
	{
		SurfStyle       0.688049
		OceanStyle      0.879184
		Randomize      (-0.313, 0.759, -0.247)
		colorDistMagn   0.320823
		colorDistFreq   0.258375
		detailScale     625.094
		colorConversion true
		snowLevel       2
		tropicLatitude  0.868673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355905
		terraceProb     0.486037
		erosion         0
		montesMagn      0.445407
		montesFreq      3.65095
		montesSpiky     0.950523
		montesFraction  0.496283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.42531
		hillsFraction   0.715475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239962
		craterFreq      0.236356
		craterDensity   0.87301
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.425578
		volcanoTemp     1585.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.202, 0.152, 0.000)
		colorShelf     (0.269, 0.208, 0.174, 0.000)
		colorBeach     (0.316, 0.243, 0.206, 0.000)
		colorDesert    (0.343, 0.261, 0.201, 0.000)
		colorLowland   (0.376, 0.279, 0.228, 0.000)
		colorUpland    (0.417, 0.338, 0.277, 0.000)
		colorRock      (0.450, 0.368, 0.299, 0.000)
		colorSnow      (0.491, 0.392, 0.315, 1.000)
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
		MaxLength   0.800501
		GasToDust   0.25
		Particles   2596
		GasBright   0.190161
		DustBright  0.419826
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   431.954
		Period          2501.25
		Eccentricity    0.816514
		Inclination     121.204
		AscendingNode   -112.139
		ArgOfPericenter 176.119
		MeanAnomaly     108.731
	}
}

Comet	"C157"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            7.52154e-017
	Radius          0.0596724
	InertiaMoment   0.399582

	Oblateness      0.00344745

	RotationPeriod  88.4026
	Obliquity       65.5959
	EqAscendNode    130.104

	AbsMagn         16.0405
	SlopeParam      3.67
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.521 0.514 0.509)

	Surface
	{
		SurfStyle       0.0139877
		OceanStyle      0.118593
		Randomize      (-0.743, -0.899, 0.902)
		colorDistMagn   0.509495
		colorDistFreq   2.36232e-006
		detailScale     1.62945
		colorConversion true
		snowLevel       2
		tropicLatitude  0.28605
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739142
		terraceProb     0.404173
		erosion         0
		montesMagn      0.529775
		montesFreq      2.99103
		montesSpiky     0.89152
		montesFraction  0.514664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.53722e-006
		hillsFraction   0.482785
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253508
		craterFreq      0.194293
		craterDensity   0.930099
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50708
		volcanoTemp     1638.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.206, 0.204, 0.000)
		colorShelf     (0.221, 0.219, 0.216, 0.000)
		colorBeach     (0.234, 0.231, 0.229, 0.000)
		colorDesert    (0.247, 0.244, 0.242, 0.000)
		colorLowland   (0.260, 0.257, 0.255, 0.000)
		colorUpland    (0.273, 0.270, 0.267, 0.000)
		colorRock      (0.286, 0.283, 0.280, 0.000)
		colorSnow      (0.299, 0.296, 0.293, 1.000)
		BumpHeight      0.0537051
		BumpOffset      0.010741
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.109188
		DustBright  0.185286
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   535.477
		Period          3452.32
		Eccentricity    0.837864
		Inclination     99.2265
		AscendingNode   -7.10605
		ArgOfPericenter 46.3772
		MeanAnomaly     -153.022
	}
}

Comet	"C158"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            5.81737e-013
	Radius          1.4055
	InertiaMoment   0.39838

	Oblateness      0.00624659

	RotationPeriod  85.1702
	Obliquity       18.8016
	EqAscendNode    114.682

	AbsMagn         9.43429
	SlopeParam      4.23389
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.756 0.752)

	Surface
	{
		SurfStyle       0.224897
		OceanStyle      0.217684
		Randomize      (0.004, 0.504, 0.528)
		colorDistMagn   0.439986
		colorDistFreq   0.00138696
		detailScale     38.3794
		colorConversion true
		snowLevel       2
		tropicLatitude  0.315892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598934
		terraceProb     0.315945
		erosion         0
		montesMagn      0.463197
		montesFreq      2.99562
		montesSpiky     0.980803
		montesFraction  0.506071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0047689
		hillsFraction   0.59304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263399
		craterFreq      0.220002
		craterDensity   0.991135
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524551
		volcanoTemp     1591.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.302, 0.301, 0.000)
		colorShelf     (0.322, 0.321, 0.320, 0.000)
		colorBeach     (0.341, 0.340, 0.338, 0.000)
		colorDesert    (0.360, 0.359, 0.357, 0.000)
		colorLowland   (0.379, 0.378, 0.376, 0.000)
		colorUpland    (0.398, 0.397, 0.395, 0.000)
		colorRock      (0.417, 0.416, 0.414, 0.000)
		colorSnow      (0.436, 0.435, 0.432, 1.000)
		BumpHeight      1.26495
		BumpOffset      0.252989
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.352135
		GasToDust   0.25
		Particles   1691
		GasBright   0.334825
		DustBright  0.444135
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   272.409
		Period          1252.66
		Eccentricity    0.617437
		Inclination     -177.009
		AscendingNode   101.82
		ArgOfPericenter 148.815
		MeanAnomaly     -57.6379
	}
}

Comet	"C159"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            4.49932e-009
	Radius          23.3217
	InertiaMoment   0.393571

	Oblateness      0.0038894

	RotationPeriod  82.2128
	Obliquity       332.007
	EqAscendNode    99.2592

	AbsMagn         5.92873
	SlopeParam      4.81743
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.667 0.538 0.488)

	Surface
	{
		SurfStyle       0.324633
		OceanStyle      0.517577
		Randomize      (-0.441, -0.087, 0.935)
		colorDistMagn   0.601512
		colorDistFreq   0.412125
		detailScale     636.838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992257
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.25896
		terraceProb     0.405704
		erosion         0
		montesMagn      0.473856
		montesFreq      3.64602
		montesSpiky     0.945884
		montesFraction  0.459172
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.18694
		hillsFraction   0.506461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253567
		craterFreq      0.212181
		craterDensity   0.736722
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493738
		volcanoTemp     1049.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.215, 0.195, 0.000)
		colorShelf     (0.283, 0.228, 0.207, 0.000)
		colorBeach     (0.300, 0.242, 0.219, 0.000)
		colorDesert    (0.317, 0.255, 0.232, 0.000)
		colorLowland   (0.334, 0.269, 0.244, 0.000)
		colorUpland    (0.350, 0.282, 0.256, 0.000)
		colorRock      (0.367, 0.296, 0.268, 0.000)
		colorSnow      (0.384, 0.309, 0.280, 1.000)
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
		MaxLength   0.833327
		GasToDust   0.25
		Particles   2663
		GasBright   0.22657
		DustBright  0.236876
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   377.488
		Period          2043.41
		Eccentricity    0.797284
		Inclination     71.7539
		AscendingNode   154.006
		ArgOfPericenter -104.778
		MeanAnomaly     140.608
	}
}

Comet	"C160"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.38538e-016
	Radius          0.0864315
	InertiaMoment   0.398907

	Oblateness      0.00702036

	RotationPeriod  79.4699
	Obliquity       285.213
	EqAscendNode    83.8366

	AbsMagn         14.8668
	SlopeParam      5.48232
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.656 0.650 0.648)

	Surface
	{
		SurfStyle       0.0699741
		OceanStyle      0.941504
		Randomize      (0.066, -0.582, 0.281)
		colorDistMagn   0.769542
		colorDistFreq   3.56224e-006
		detailScale     2.36015
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.360474
		terraceProb     0.453511
		erosion         0
		montesMagn      0.545333
		montesFreq      2.65718
		montesSpiky     0.968939
		montesFraction  0.65423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.45174e-005
		hillsFraction   0.474273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.28167
		craterFreq      0.214288
		craterDensity   0.788789
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515176
		volcanoTemp     1723.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.259, 0.000)
		colorShelf     (0.279, 0.276, 0.275, 0.000)
		colorBeach     (0.295, 0.292, 0.292, 0.000)
		colorDesert    (0.312, 0.309, 0.308, 0.000)
		colorLowland   (0.328, 0.325, 0.324, 0.000)
		colorUpland    (0.345, 0.341, 0.340, 0.000)
		colorRock      (0.361, 0.357, 0.356, 0.000)
		colorSnow      (0.377, 0.374, 0.373, 1.000)
		BumpHeight      0.0777883
		BumpOffset      0.0155577
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.0454311
		DustBright  0.902502
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   385.197
		Period          2106.32
		Eccentricity    0.828748
		Inclination     64.1099
		AscendingNode   57.9587
		ArgOfPericenter -73.3025
		MeanAnomaly     -74.477
	}
}

Comet	"C161"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.07149e-012
	Radius          1.4446
	InertiaMoment   0.397245

	Oblateness      0.00449811

	RotationPeriod  76.8986
	Obliquity       238.419
	EqAscendNode    68.414

	AbsMagn         9.21388
	SlopeParam      6.37798
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.481 0.391 0.331)

	Surface
	{
		SurfStyle       0.94778
		OceanStyle      0.978602
		Randomize      (0.101, -0.933, -0.501)
		colorDistMagn   0.413704
		colorDistFreq   0.00171295
		detailScale     39.4473
		colorConversion true
		snowLevel       2
		tropicLatitude  0.429854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337112
		terraceProb     0.253314
		erosion         0
		montesMagn      0.477639
		montesFreq      3.59882
		montesSpiky     0.943616
		montesFraction  0.268009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00530519
		hillsFraction   0.677397
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239901
		craterFreq      0.183301
		craterDensity   0.947965
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.543218
		volcanoTemp     1771.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.137, 0.132, 0.050)
		colorShelf     (0.192, 0.160, 0.152, 0.040)
		colorBeach     (0.221, 0.184, 0.172, 0.030)
		colorDesert    (0.250, 0.207, 0.195, 0.020)
		colorLowland   (0.279, 0.231, 0.215, 0.030)
		colorUpland    (0.308, 0.254, 0.235, 0.050)
		colorRock      (0.336, 0.278, 0.261, 0.020)
		colorSnow      (0.336, 0.278, 0.261, 1.000)
		BumpHeight      1.30014
		BumpOffset      0.260028
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.384961
		GasToDust   0.25
		Particles   1757
		GasBright   0.0676511
		DustBright  0.564769
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   470.105
		Period          2839.84
		Eccentricity    0.932855
		Inclination     96.1394
		AscendingNode   0.976611
		ArgOfPericenter -82.0194
		MeanAnomaly     -20.8567
	}
}

Comet	"C162"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            8.2872e-009
	Radius          33.5739
	InertiaMoment   0.399368

	Oblateness      0.00784759

	RotationPeriod  74.4669
	Obliquity       191.624
	EqAscendNode    52.9914

	AbsMagn         5.68625
	SlopeParam      9.13186
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.678 0.675)

	Surface
	{
		SurfStyle       0.917728
		OceanStyle      0.346277
		Randomize      (0.506, 0.062, 0.057)
		colorDistMagn   0.486046
		colorDistFreq   0.792451
		detailScale     916.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.126496
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670869
		terraceProb     0.165718
		erosion         0
		montesMagn      0.665873
		montesFreq      3.38846
		montesSpiky     0.896212
		montesFraction  0.316743
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.14315
		hillsFraction   0.821439
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221439
		craterFreq      0.231028
		craterDensity   0.818537
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515479
		volcanoTemp     1539.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.237, 0.270, 0.050)
		colorShelf     (0.272, 0.278, 0.310, 0.040)
		colorBeach     (0.313, 0.319, 0.351, 0.030)
		colorDesert    (0.354, 0.359, 0.398, 0.020)
		colorLowland   (0.394, 0.400, 0.439, 0.030)
		colorUpland    (0.435, 0.441, 0.479, 0.050)
		colorRock      (0.476, 0.482, 0.533, 0.020)
		colorSnow      (0.476, 0.482, 0.533, 1.000)
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
		MaxLength   0.866153
		GasToDust   0.25
		Particles   2729
		GasBright   0.0526119
		DustBright  0.264295
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   420.34
		Period          2401.05
		Eccentricity    0.839798
		Inclination     172.094
		AscendingNode   -38.1753
		ArgOfPericenter -119.103
		MeanAnomaly     -9.79358
	}
}

Comet	"C163"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            2.55169e-016
	Radius          0.0894822
	InertiaMoment   0.398073

	Oblateness      0.0051152

	RotationPeriod  72.1503
	Obliquity       144.83
	EqAscendNode    37.5688

	AbsMagn         14.0937
	SlopeParam      2.74757
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.743 0.739)

	Surface
	{
		SurfStyle       0.250643
		OceanStyle      0.391202
		Randomize      (0.431, -0.950, -0.709)
		colorDistMagn   0.925166
		colorDistFreq   5.81138e-006
		detailScale     2.44346
		colorConversion true
		snowLevel       2
		tropicLatitude  0.49779
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357712
		terraceProb     0.456718
		erosion         0
		montesMagn      0.495894
		montesFreq      3.67511
		montesSpiky     0.934895
		montesFraction  0.625417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15914e-005
		hillsFraction   0.698257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244341
		craterFreq      0.253988
		craterDensity   0.647817
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43373
		volcanoTemp     1652.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.317, 0.316, 0.314, 0.000)
		colorBeach     (0.336, 0.334, 0.333, 0.000)
		colorDesert    (0.354, 0.353, 0.351, 0.000)
		colorLowland   (0.373, 0.371, 0.369, 0.000)
		colorUpland    (0.392, 0.390, 0.388, 0.000)
		colorRock      (0.410, 0.408, 0.406, 0.000)
		colorSnow      (0.429, 0.427, 0.425, 1.000)
		BumpHeight      0.080534
		BumpOffset      0.0161068
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		GasBright   0.180363
		DustBright  0.62103
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   378.896
		Period          2054.85
		Eccentricity    0.815743
		Inclination     -56.7528
		AscendingNode   -150.467
		ArgOfPericenter 67.5211
		MeanAnomaly     39.064
	}
}

Comet	"C164"
{
	ParentBody     "Tyrius System"
	Class	       "Asteroid"

	Mass            1.97354e-012
	Radius          2.06868
	InertiaMoment   0.399796

	Oblateness      0.00875531

	RotationPeriod  69.9298
	Obliquity       98.0358
	EqAscendNode    22.1462

	AbsMagn         8.99709
	SlopeParam      3.37675
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.786 0.785 0.784)

	Surface
	{
		SurfStyle       0.382575
		OceanStyle      0.279382
		Randomize      (-0.347, -0.081, 0.439)
		colorDistMagn   0.948164
		colorDistFreq   0.00303934
		detailScale     56.4887
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872399
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269603
		terraceProb     0.422929
		erosion         0
		montesMagn      0.578743
		montesFreq      3.69442
		montesSpiky     0.957299
		montesFraction  0.348151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0123092
		hillsFraction   0.740529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2497
		craterFreq      0.261984
		craterDensity   0.795159
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.604775
		volcanoTemp     1170.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.314, 0.314, 0.000)
		colorShelf     (0.334, 0.334, 0.333, 0.000)
		colorBeach     (0.354, 0.353, 0.353, 0.000)
		colorDesert    (0.373, 0.373, 0.372, 0.000)
		colorLowland   (0.393, 0.393, 0.392, 0.000)
		colorUpland    (0.413, 0.412, 0.412, 0.000)
		colorRock      (0.432, 0.432, 0.431, 0.000)
		colorSnow      (0.452, 0.452, 0.451, 1.000)
		BumpHeight      1.86181
		BumpOffset      0.372362
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		MaxLength   0.417787
		GasToDust   0.25
		Particles   1823
		GasBright   0.138042
		DustBright  0.347838
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   496.817
		Period          3085.29
		Eccentricity    0.876735
		Inclination     -39.4667
		AscendingNode   -18.5432
		ArgOfPericenter 63.6972
		MeanAnomaly     -82.8328
	}
}
