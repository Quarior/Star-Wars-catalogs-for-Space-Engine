// http://starwars.wikia.com/wiki/Cato_Neimoidia
// Region : Colonies
// Sector : 
// Grid location : N11
// X : 3244.57, Y : -2027.38, Z : 252.5448387834124
Planet	"Cato Neimoidia"
{
	ParentBody     "Cato Neimoidia System"
	Class	       "Terra"

	Mass            0.9234
	Radius          6312
	InertiaMoment   0.3314455

	Oblateness      0.02011874

	RotationPeriod  25
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.738 0.603 0.595)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Style           0.683656
		Randomize      (-0.482, -0.303, -0.714)
		colorDistMagn   0.05172634
		colorDistFreq   576.2198
		detailScale     18072.34
		colorConversion true
		drivenDarkening -1
		seaLevel        0.1111111
		snowLevel       0.9909271
		tropicLatitude  0.5749153
		icecapLatitude  10
		icecapHeight    0.2336271
		climatePole     0.45
		climateTropic   0.6984127
		climateEquator  0.45
		tropicWidth     0.5961905
		mainFreq        0.9108183
		venusFreq       0.8259138
		venusMagn       0
		mareFreq        5.421675
		mareDensity     0.01706513
		terraceProb     0.540899
		erosion         0.1170817
		montesMagn      0.1565344
		montesFreq      225.8035
		montesFraction  -0.5165958
		dunesMagn       0.07437452
		dunesFreq       51.25729
		dunesFraction   0.3309036
		hillsMagn       0.1132356
		hillsFreq       391.6493
		hillsFraction   -0.3309036
		hills2Fraction  0
		canyonsMagn     0.06051871
		canyonsFreq     109.8331
		canyonFraction  0.5165958
		cracksMagn      0.1145637
		cracksFreq      0.3113596
		cracksOctaves   1
		craterMagn      0.0720275
		craterFreq      8.383234
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      2.039773
		twistMagn       0.960201
		cycloneMagn     4.03878
		cycloneFreq     0.5158418
		cycloneDensity  0.04512824
		cycloneOctaves  1
		colorSea       (0.105, 0.266, 0.203, 1.000)
		colorShelf     (0.105, 0.266, 0.203, 1.000)
		colorBeach     (0.325, 0.788, 0.670, 0.000)
		colorDesert    (0.325, 0.788, 0.670, 0.000)
		colorLowland   (0.164, 0.419, 0.380, 0.000)
		colorUpland    (0.078, 0.172, 0.180, 0.000)
		colorRock      (0.278, 0.792, 0.588, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.137, 0.486, 0.427, 0.000)
		colorUpPlants  (0.192, 0.501, 0.501, 0.000)
		BumpHeight      23
		BumpOffset      4
		DiffMapAlpha   "Water"
		SpecularBright  20
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          19.96016
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.331
		mainOctaves     10
		Coverage        0.190
		twistZones      5.159
		twistMagn       5.000
	}

	Ocean
	{
		Height          1.721191
		DayAmbient      2
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          153.96852
		Density         100
		Pressure        1.550516
		Greenhouse      18.33102
		Bright          10
		Opacity         1
		SkyLight        3.333333
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoRings         true
	
	Orbit
	{
		SemiMajorAxis   0.89821
		//Period          0.61209
		Eccentricity    0.0005060218
		Inclination     0.123
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
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
