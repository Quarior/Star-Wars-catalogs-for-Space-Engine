// http://starwars.wikia.com/wiki/Tatooine
// Region : Outer Rim
// Sector : Arkanis Sector
// Grid location : R16
// X : 9665.78, Y : -10099.11, Z : -340.74835054541865
Star	"Tatoo I"
{
	ParentBody     "Tatoo System"
	Class	       "G1 V"
	
	Orbit
	{
		SemiMajorAxis   0.06586962
		//Period          0.07854127
		Eccentricity    0.0009978506
		Inclination     72.10184
		AscendingNode   328.1595
		ArgOfPericenter 151.9202
		MeanAnomaly     19.82083
		RefPlane       "Ecliptic"
	}
}

Star	"Tatoo II"
{
	ParentBody     "Tatoo System"
	Class	       "G2 V"
	
	Orbit
	{
		SemiMajorAxis   0.08880806
		//Period          0.07554127
		Eccentricity    0.0009978506
		Inclination     72.10184
		AscendingNode   328.1595
		ArgOfPericenter 331.9203
		MeanAnomaly     19.82083
		RefPlane       "Ecliptic"
	}
}

Planet	"Tatooine"
{
	ParentBody     "Tatoo System"
	Class	       "Desert"

	Mass            0.7981451
	Radius          5232.5
	InertiaMoment   0.330512

	Oblateness      0.00738758

	RotationPeriod  23.04
	RotationOffset  8.18
	Obliquity       -68.5716
	EqAscendNode    40

	Albedo          0.2767181
	Color          (0.816 0.612 0.895)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}
	
	Surface
	{
		Style           0.03656019
		Randomize      (0.166, 0.601, 0.034)
		colorDistMagn   0.09013649
		colorDistFreq   533.4974
		detailScale     26916.58
		colorConversion true
		drivenDarkening -1
		seaLevel        0.1252777
		snowLevel       0.9883075
		tropicLatitude  0
		icecapLatitude  1
		icecapHeight    0.1252777
		climatePole     0
		climateTropic   0
		climateEquator  0
		tropicWidth     1
		mainFreq        0.01
		venusFreq       1.081553
		venusMagn       0.3538713
		mareFreq        2.041626
		mareDensity     0
		terraceProb     0.7443396
		erosion         0
		montesMagn      0.2757629
		montesFreq      299.4542
		montesFraction  0.3138253
		dunesMagn       0.06606267
		dunesFreq       59.79757
		dunesFraction   0.297365
		hillsMagn       0.1238402
		hillsFreq       727.8046
		hillsFraction   0.297365
		hills2Fraction  0.1
		canyonsMagn     0.03595129
		canyonsFreq     108.9345
		canyonFraction  0.2
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      0
		craterFreq      0
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      7.328156
		twistMagn       0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  1
		colorSea       (0.360, 0.260, 0.270, 0.000)
		colorShelf     (0.260, 0.220, 0.270, 0.000)
		colorBeach     (0.850, 0.740, 0.550, 0.000)
		colorDesert    (0.770, 0.670, 0.470, 0.000)
		colorLowland   (0.440, 0.290, 0.170, 0.000)
		colorUpland    (0.640, 0.570, 0.470, 0.000)
		colorRock      (0.220, 0.200, 0.200, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.200)
		colorLowPlants (0.440, 0.290, 0.170, 0.000)
		colorUpPlants  (0.640, 0.570, 0.470, 0.000)
		BumpHeight      18.36556
		BumpOffset      0
		DiffMapAlpha   "Ice"
		SpecularBright  0.3
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          18.15967
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.826782
		mainOctaves     10
		Coverage        0.03968254
		twistZones      7.328156
		twistMagn       0
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Earth"
		Height          39.37659
		Density         100
		Pressure        1.082696
		Greenhouse      61.29678
		Bright          10
		Opacity         1
		SkyLight        0
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		Epoch           2356307
		SemiMajorAxis   2
		//Period          0.835
		Eccentricity    0
		Inclination     245.7143
		AscendingNode   -40
		ArgOfPericenter 217.1429
		MeanAnomaly     120
		RefPlane       "Ecliptic"
	}
}

Moon	"Ghomrassen"
{
	ParentBody     "Tatooine"
	Class	       "Selena"

	Mass            0.0006950907
	Radius          530.5831
	InertiaMoment   0.3993721

	Obliquity       -74.28571
	EqAscendNode    79.85033

	Albedo          0.3
	Color          (0.753 0.669 0.638)

	Surface
	{
		Style           0.3601963
		Randomize      (0.675, -0.388, -0.796)
		colorDistMagn   0.04218215
		colorDistFreq   675.1099
		detailScale     2729.378
		colorConversion true
		drivenDarkening 0
		seaLevel        0.1586618
		snowLevel       0.9954441
		tropicLatitude  1.748456e-007
		icecapLatitude  1
		icecapHeight    0.1586618
		climatePole     1
		climateTropic   0.45
		climateEquator  0.625
		tropicWidth     0.07
		mainFreq        1.976313
		venusFreq       0.9746945
		venusMagn       0
		mareFreq        2.099186
		mareDensity     0.1344638
		terraceProb     0.5229707
		erosion         0
		montesMagn      0.2424502
		montesFreq      331.7054
		montesFraction  0.07196181
		dunesMagn       0.03764286
		dunesFreq       1074.29
		dunesFraction   0.3721819
		hillsMagn       0.1082429
		hillsFreq       695.8246
		hillsFraction   -0.3721819
		hills2Fraction  0.004729599
		canyonsMagn     0.01758564
		canyonsFreq     172.2257
		canyonFraction  0.03183059
		cracksMagn      0.04275627
		cracksFreq      1.587227
		cracksOctaves   1
		craterMagn      1.134933
		craterFreq      12.67809
		craterDensity   0.9366705
		craterOctaves   9
		craterRayedFactor 0.387228
		twistZones      0
		twistMagn       0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  1
		colorSea       (0.450, 0.450, 0.450, 0.000)
		colorShelf     (0.480, 0.480, 0.480, 0.000)
		colorBeach     (0.500, 0.500, 0.500, 0.000)
		colorDesert    (0.620, 0.600, 0.570, 0.200)
		colorLowland   (0.670, 0.640, 0.640, 0.500)
		colorUpland    (0.700, 0.670, 0.660, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.670, 0.640, 0.640, 0.500)
		colorUpPlants  (0.700, 0.670, 0.660, 0.800)
		BumpHeight      10.61166
		BumpOffset      4
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0.8
		Exposure        2
	}

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.0005662657
		//Period          0.005660441
		Eccentricity    0.01587302
		Inclination     74.28571
		AscendingNode   79.85033
		ArgOfPericenter 11.97692
		MeanAnomaly     230.6117
		RefPlane       "Equator"
	}
}

Moon	"Guermessa"
{
	ParentBody     "Tatooine"
	Class	       "Selena"

	Mass            0.0006036727
	Radius          494.1764
	InertiaMoment   0.3993721

	Obliquity       132.5723
	EqAscendNode    79.85033

	Albedo          0.3
	Color          (0.483 0.420 0.401)

	Surface
	{
		Style           0.6601963
		Randomize      (0.275, -0.388, -0.196)
		colorDistMagn   0.04218215
		colorDistFreq   675.1099
		detailScale     2729.378
		colorConversion true
		drivenDarkening 0
		seaLevel        0.1586618
		snowLevel       0.9954441
		tropicLatitude  1.748456e-007
		icecapLatitude  1
		icecapHeight    0.1586618
		climatePole     1
		climateTropic   0.45
		climateEquator  0.625
		tropicWidth     0.07
		mainFreq        0.4159562
		venusFreq       0.9746945
		venusMagn       0.1904762
		mareFreq        2.099186
		mareDensity     0.1344638
		terraceProb     0.5229707
		erosion         0
		montesMagn      0.4047619
		montesFreq      331.7055
		montesFraction  -0.3138253
		dunesMagn       0.03764286
		dunesFreq       1074.29
		dunesFraction   0.3721819
		hillsMagn       0.1082429
		hillsFreq       695.8247
		hillsFraction   -0.3721819
		hills2Fraction  0.004729599
		canyonsMagn     0.01758564
		canyonsFreq     172.2257
		canyonFraction  0.3090957
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      1.161839
		craterFreq      12.67809
		craterDensity   0.9366705
		craterOctaves   9
		craterRayedFactor 0.1031746
		twistZones      0
		twistMagn       0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  1
		colorSea       (0.450, 0.450, 0.450, 0.000)
		colorShelf     (0.480, 0.480, 0.480, 0.000)
		colorBeach     (0.500, 0.500, 0.500, 0.000)
		colorDesert    (0.620, 0.600, 0.570, 0.200)
		colorLowland   (0.670, 0.640, 0.640, 0.500)
		colorUpland    (0.700, 0.670, 0.660, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.670, 0.640, 0.640, 0.500)
		colorUpPlants  (0.700, 0.670, 0.660, 0.800)
		BumpHeight      9.883528
		BumpOffset      4
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0.8
		Exposure        2
	}

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.0008836354
		//Period          0.008030855
		Eccentricity    0.01587302
		Inclination     76.571
		AscendingNode   79.85033
		ArgOfPericenter 11.97692
		MeanAnomaly     230.6117
		RefPlane       "Equator"
	}
}

Moon	"Chenini"
{
	ParentBody     "Tatooine"
	Class	       "Selena"

	Mass            0.0004933496
	Radius          334.0484
	InertiaMoment   0.3537872

	Obliquity       -153.142
	EqAscendNode    139.9444

	Albedo          0.3
	Color          (0.405 0.343 0.327)

	Surface
	{
		Style           0.4918389
		Randomize      (-1.746, 0.952, -0.889)
		colorDistMagn   0.06252906
		colorDistFreq   4368.407
		detailScale     12898.78
		colorConversion true
		drivenDarkening 0
		seaLevel        0.2363345
		snowLevel       0.9871097
		tropicLatitude  0.9194857
		icecapLatitude  0.9001684
		icecapHeight    0.2455642
		climatePole     1
		climateTropic   0.45
		climateEquator  0.625
		tropicWidth     0.07
		mainFreq        1.593645
		venusFreq       1.069627
		venusMagn       0
		mareFreq        1.887734
		mareDensity     0.1230677
		terraceProb     0.4104168
		erosion         0
		montesMagn      0.2069026
		montesFreq      2464.747
		montesFraction  -0.7138653
		dunesMagn       0.04177375
		dunesFreq       1706.339
		dunesFraction   0.5383024
		hillsMagn       0.1319943
		hillsFreq       5219.35
		hillsFraction   -0.5383024
		hills2Fraction  0
		canyonsMagn     0.06257042
		canyonsFreq     972.3755
		canyonFraction  0.7138653
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      0.4057733
		craterFreq      152.1729
		craterDensity   0.8580293
		craterOctaves   12
		craterRayedFactor 0.5396826
		twistZones      0
		twistMagn       0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  1
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.560, 0.470, 0.420, 0.000)
		colorDesert    (0.510, 0.440, 0.370, 0.200)
		colorLowland   (0.390, 0.340, 0.280, 0.500)
		colorUpland    (0.660, 0.600, 0.520, 0.800)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.390, 0.340, 0.280, 0.500)
		colorUpPlants  (0.660, 0.600, 0.520, 0.800)
		BumpHeight      6.680968
		BumpOffset      4
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0.8
		Exposure        2
	}

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.00335762
		//Period          0.06218001
		Eccentricity    0.7619048
		Inclination     76.571
		AscendingNode   -62.85714
		ArgOfPericenter 0
		MeanAnomaly     230.6117
		RefPlane       "Equator"
	}
}

Planet	"Ohann"
{
	ParentBody     "Tatoo System"
	Class	       "GasGiant"

	Mass            434.6856
	Radius          75031.67
	InertiaMoment   0.2479227

	Oblateness      0.06976674

	RotationPeriod  8.76226
	RotationOffset  2.945953
	Obliquity       -125.6143
	EqAscendNode    325.7143

	Albedo          0.5
	Color          (0.059 0.037 0.011)

	Surface
	{
		Style           0.6798549
		Randomize      (-0.711, -0.702, 0.694)
		colorDistMagn   0.223358
		colorDistFreq   0.07596792
		detailScale     385971.7
		colorConversion true
		drivenDarkening -1
		seaLevel        0
		snowLevel       0
		tropicLatitude  0.8412055
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		mainFreq        0.06956026
		venusFreq       0
		venusMagn       0
		mareDensity     0
		terraceProb     0
		erosion         0
		montesMagn      0
		montesFreq      0
		montesFraction  0
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0
		hillsFraction   0
		hills2Fraction  0
		canyonsMagn     0
		canyonsFreq     0
		canyonFraction  0
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      0
		craterFreq      0
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      6.59701
		twistMagn       0.7420347
		cycloneMagn     14.57534
		cycloneFreq     0.2147589
		cycloneDensity  0.1101628
		cycloneOctaves  1
		colorSea       (0.630, 0.600, 0.550, 1.000)
		colorShelf     (0.700, 0.700, 0.690, 1.000)
		colorBeach     (0.800, 0.870, 0.920, 1.000)
		colorDesert    (0.650, 0.420, 0.270, 1.000)
		colorLowland   (0.730, 0.330, 0.270, 1.000)
		colorUpland    (0.750, 0.350, 0.290, 1.000)
		colorRock      (0.900, 0.550, 0.290, 1.000)
		colorSnow      (0.950, 0.590, 0.220, 1.000)
		colorLowPlants (0.730, 0.330, 0.270, 1.000)
		colorUpPlants  (0.750, 0.350, 0.290, 1.000)
		SpecularPower   150
		DayAmbient      1
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          60.02344
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.02923
		mainOctaves     10
		Coverage        0.5053523
		twistZones      6.59701
		twistMagn       0.7420347
	}

	Clouds
	{
		Height          120.0469
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.02923
		mainOctaves     10
		Coverage        0.5053523
		twistZones      6.59701
		twistMagn       0.7420347
	}

	Clouds
	{
		Height          180.0781
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.02923
		mainOctaves     10
		Coverage        0.5053523
		twistZones      6.59701
		twistMagn       0.7420347
	}

	Clouds
	{
		Height          240.1016
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.02923
		mainOctaves     10
		Coverage        0.5053523
		twistZones      6.59701
		twistMagn       0.7420347
	}

	Clouds
	{
		Height          300.125
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.02923
		mainOctaves     10
		Coverage        0.5053523
		twistZones      6.59701
		twistMagn       0.7420347
	}

	Clouds
	{
		Height          360.1484
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.02923
		mainOctaves     10
		Coverage        0.5053523
		twistZones      6.59701
		twistMagn       0.7420347
	}

	Clouds
	{
		Height          420.1797
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.02923
		mainOctaves     10
		Coverage        0.5053523
		twistZones      6.59701
		twistMagn       0.7420347
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Venus"
		Height          525.222
		Density         100
		Pressure        10000
		Greenhouse      0
		Bright          10
		Opacity         1
		SkyLight        3.333333
	}

	Aurora
	{
		Height      1403.871
		NorthLat    84.69055
		NorthLon    -113.8784
		NorthRadius 21135.63
		NorthWidth  13017.63
		NorthRings  3
		NorthBright 1
		NorthParticles 50000
		SouthLat    -84.58112
		SouthLon    63.96181
		SouthRadius 19532.4
		SouthWidth  11995.48
		SouthRings  3
		SouthBright 1
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoCometTail     true

	Orbit
	{
		Epoch           2356307
		SemiMajorAxis   6.47633
		//Period          4.314403
		Eccentricity    0.014
		Inclination     245.9
		AscendingNode   -41.429
		ArgOfPericenter 217.1429
		MeanAnomaly     120
		RefPlane       "Ecliptic"
	}
}

Moon	"Ohann I"
{
	ParentBody     "Ohann"
	Class	       "Selena"

	Mass            0.0368158
	Radius          1954.756
	InertiaMoment   0.3502334

	Obliquity       5.008956e-006
	EqAscendNode    69.75115

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.005678866
		//Period          0.004784128
		Eccentricity    0.0485759
		Inclination     -1.131136
		AscendingNode   69.75115
		ArgOfPericenter 235.4263
		MeanAnomaly     101.8958
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ohann II"
{
	ParentBody     "Ohann"
	Class	       "Asteroid"

	Mass            9.260181e-007
	Radius          58.65711
	InertiaMoment   0.3991553

	Oblateness      0.001179976

	Obliquity       17.14286
	EqAscendNode    263.6325

	Albedo          0.2
	Color          (0.579 0.529 0.513)

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.006545017
		//Period          0.005179474
		Eccentricity    0.0485759
		Inclination     -17.14286
		AscendingNode   69.75115
		ArgOfPericenter 235.4263
		MeanAnomaly     101.8958
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ohann III"
{
	ParentBody     "Ohann"
	Class	       "Asteroid"

	Mass            8.260181e-007
	Radius          56.9345
	InertiaMoment   0.3991553

	Oblateness      0.001301748

	Obliquity       11.42858
	EqAscendNode    263.6325

	Albedo          0.2
	Color          (0.392 0.342 0.330)

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.01275821
		//Period          0.001861406
		Eccentricity    0.1111111
		Inclination     -11.42857
		AscendingNode   69.75115
		ArgOfPericenter 235.4263
		MeanAnomaly     101.8958
		RefPlane       "Equator"
	}
}

Planet	"Adriana"
{
	ParentBody     "Tatoo System"
	Class	       "IceGiant"

	Mass            30.50166
	Radius          28665.2
	InertiaMoment   0.2119358

	Oblateness      0.03784066

	RotationPeriod  9.988173
	RotationOffset  270
	Obliquity       -108.8572
	EqAscendNode    137.1429

	Albedo          0.6
	Color          (0.698 0.649 0.652)

	Surface
	{
		Style           0.2063492
		Randomize      (-1.270, 1.079, -1.302)
		colorDistMagn   0.4761905
		colorDistFreq   0.1988474
		detailScale     340.7803
		colorConversion true
		drivenDarkening -1
		seaLevel        0
		snowLevel       0
		tropicLatitude  0.6457896
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		mainFreq        0.01
		venusFreq       0
		venusMagn       0
		mareDensity     0
		terraceProb     0
		erosion         0
		montesMagn      0
		montesFreq      0
		montesFraction  0
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0
		hillsFraction   0
		hills2Fraction  0
		canyonsMagn     0
		canyonsFreq     0
		canyonFraction  0
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      0
		craterFreq      0
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      7.108271
		twistMagn       1.036743
		cycloneMagn     13.78735
		cycloneFreq     0.3258312
		cycloneDensity  0.07699422
		cycloneOctaves  1
		colorSea       (0.630, 0.600, 0.750, 1.000)
		colorShelf     (0.600, 0.700, 0.790, 1.000)
		colorBeach     (0.800, 0.870, 0.920, 1.000)
		colorDesert    (0.450, 0.420, 0.570, 1.000)
		colorLowland   (0.330, 0.330, 0.470, 1.000)
		colorUpland    (0.350, 0.350, 0.490, 1.000)
		colorRock      (0.500, 0.550, 0.690, 1.000)
		colorSnow      (0.550, 0.590, 0.620, 1.000)
		colorLowPlants (0.330, 0.330, 0.470, 1.000)
		colorUpPlants  (0.350, 0.350, 0.490, 1.000)
		SpecularPower   150
		DayAmbient      1
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          26.75391
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.6410632
		mainOctaves     10
		Coverage        0.5446955
		twistZones      7.108271
		twistMagn       1.036743
	}

	Clouds
	{
		Height          53.50781
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.6410632
		mainOctaves     10
		Coverage        0.5446955
		twistZones      7.108271
		twistMagn       1.036743
	}

	Clouds
	{
		Height          80.26172
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.6410632
		mainOctaves     10
		Coverage        0.5446955
		twistZones      7.108271
		twistMagn       1.036743
	}

	Clouds
	{
		Height          107.0176
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.6410632
		mainOctaves     10
		Coverage        0.5446955
		twistZones      7.108271
		twistMagn       1.036743
	}

	Clouds
	{
		Height          133.7715
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.6410632
		mainOctaves     10
		Coverage        0.5446955
		twistZones      7.108271
		twistMagn       1.036743
	}

	Clouds
	{
		Height          160.5254
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.6410632
		mainOctaves     10
		Coverage        0.5446955
		twistZones      7.108271
		twistMagn       1.036743
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Venus"
		Height          200.6564
		Density         100
		Pressure        10000
		Greenhouse      0
		Bright          10
		Opacity         1
		SkyLight        3.333333
	}

	Aurora
	{
		Height      814.6904
		NorthLat    89.16505
		NorthLon    102.5047
		NorthRadius 6129.358
		NorthWidth  4040.274
		NorthRings  3
		NorthBright 1
		NorthParticles 0
		SouthLat    -88.15962
		SouthLon    291.8504
		SouthRadius 5265.56
		SouthWidth  3457.279
		SouthRings  3
		SouthBright 1
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     32140.59
		OuterRadius     79869.05
		RotationPeriod  6.64905
		RotationOffset  189.3313
		FrontBright     1
		BackBright      1
		Density         1
		Exposure        1
	}

	NoCometTail     true

	Orbit
	{
		Epoch           2356307
		SemiMajorAxis   8.090127
		//Period          6.689549
		Eccentricity    0.01
		Inclination     245.7143
		AscendingNode   -40
		ArgOfPericenter 217.1429
		MeanAnomaly     120
		RefPlane       "Ecliptic"
	}
}

DwarfMoon	"Adriana I"
{
	ParentBody     "Adriana"
	Class	       "Asteroid"

	Mass            1.194676e-007
	Radius          40.65701
	InertiaMoment   0.3991553

	Oblateness      0.001179976

	Obliquity       17.14286
	EqAscendNode    263.6325

	Albedo          0.2
	Color          (1.000 0.914 0.886)

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.0008836354
		//Period          0.001389495
		Eccentricity    0.001
		Inclination     0
		AscendingNode   69.75115
		ArgOfPericenter 235.4263
		MeanAnomaly     101.8958
		RefPlane       "Equator"
	}
}

DwarfMoon	"Adriana II"
{
	ParentBody     "Adriana"
	Class	       "Asteroid"

	Mass            3.382503e-007
	Radius          57.79692
	InertiaMoment   0.3991553

	Obliquity       17.13787
	EqAscendNode    263.6325

	Albedo          0.2
	Color          (0.483 0.418 0.403)

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.001103823
		//Period          0.002154434
		Eccentricity    0.001
		Inclination     0.005
		AscendingNode   69.75115
		ArgOfPericenter 235.4263
		MeanAnomaly     101.8958
		RefPlane       "Equator"
	}
}

DwarfMoon	"Adriana III"
{
	ParentBody     "Adriana"
	Class	       "Asteroid"

	Mass            3.082503e-007
	Radius          60.1571
	InertiaMoment   0.3991553

	Oblateness      0.01885503

	Obliquity       16.74788
	EqAscendNode    263.6325

	Albedo          0.2
	Color          (1.000 0.865 0.834)

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.001722473
		//Period          0.005994841
		Eccentricity    0.001
		Inclination     0.39
		AscendingNode   69.75115
		ArgOfPericenter 235.4263
		MeanAnomaly     101.8958
		RefPlane       "Equator"
	}
}

DwarfMoon	"Adriana IV"
{
	ParentBody     "Adriana"
	Class	       "Asteroid"

	Mass            1.757603e-007
	Radius          35.8739
	InertiaMoment   0.3991553

	Oblateness      0.02885503

	Obliquity       -17.53783
	EqAscendNode    263.6325

	Albedo          0.2
	Color          (1.000 0.865 0.834)

	NoClouds        true

	NoOcean         true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.002722472
		//Period          0.005994841
		Eccentricity    0.1587302
		Inclination     34.28571
		AscendingNode   28.57143
		ArgOfPericenter 194.2857
		MeanAnomaly     102.8571
		RefPlane       "Equator"
	}
}
