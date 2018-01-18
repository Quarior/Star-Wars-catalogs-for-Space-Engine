// http://starwars.wikia.com/wiki/Mustafar
// Region : Outer Rim
// Sector : Atravis Sector
// Grid location : L19
// X : 267.85, Y : -14770.12, Z : 528.8424721481081
Planet	"Schada"
{
	ParentBody     "Priate"
	Class	       "Selena"

	Mass            0.26
	Radius          1865.5
	InertiaMoment   0.3975344

	Albedo          0.45
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.24534
		//Period          0.32
		Eccentricity    0.004
		Inclination     0.035
		AscendingNode   340
		ArgOfPericenter 8.2
		MeanAnomaly     140
		RefPlane       "Equator"
	}
}

Barycenter "Jestefad-Lefrani"
{
	ParentBody	"Priate"
	Orbit
	{
		SemiMajorAxis   0.901
		Eccentricity    0.0035
		Inclination     3.5
		AscendingNode   337
		ArgOfPericenter 9.5
		MeanAnomaly     142
		RefPlane       "Equator"
	}

}

Planet	"Mustafar"
{
	ParentBody     "Jestefad-Lefrani"
	Class	       "Desert"

	Mass            0.73
	Radius          2100
	InertiaMoment   0.2975344
	RotationPeriod	36
	Obliquity	0

	Albedo          0.32
	Brightness		5.540
	Color         ( 1.000 0.000 0.000 )

	NoLife true
	
	/*Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia true
	}*/

	Surface
	{
		/* //No procedural
		DiffMap        "Mustafar/Diff"
		DiffTileSize    130
		DiffTileBorder  1  
		DiffMapAlpha   "Water"
		GlowMap        "Mustafar/Glow.*"
		GlowMode       "Permanent"
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
		GlowTileSize    130
		GlowTileBorder  1 
		 */
		
		//Procedural
		seaLevel		0
		mareFreq        0
		mareDensity     0
		twistZones      1.984
		twistMagn       0.397
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0 
		volcanoMagn     0.31746
		volcanoFreq     3.37302
		volcanoDensity  0.785714
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.555556
		volcanoTemp     2261.9
		lavaCoverTidal	0.4
		lavaCoverSun	0
		lavaCoverYoung	0.075
		ModulateColor  (0.250, 0.250, 0.250, 1.000)
		colorLowland   (0.000, 0.000, 0.000, 0.000)
		colorUpland    (0.000, 0.000, 0.000, 0.125)
		colorRock      (0.000, 0.000, 0.000, 0.000)
		GlowMode		"Thermal"
		GlowBright		3.5
	}
	
	Clouds
	{
		GlowBright		0.250
		Height          14.00244
		ModulateColor  (1.000 1.000 1.000 0.256)
		mainFreq		1.881
		Coverage        0.671
		twistZones      1.984
		twistMagn       0.397
	}
	
	Clouds
	{
		GlowBright		0.250
		Height          12.00244
		ModulateColor  (0.898 0.824 0.722 0.256)
		mainFreq		1.881
		Coverage        0.671
		twistZones      1.484
		twistMagn       0.297
	}
	
	Atmosphere
	{
		Model          "Venus"
		Height          95.7
		Density         57.6294
		Pressure        1.7
		Greenhouse      1627
		Bright          1.249
		Opacity         1
		SkyLight        0.873
		Hue             -0.119
		Saturation      1.190

		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoOcean    true
	
	NoRings	   true

	Orbit
	{
		SemiMajorAxis   0.0005
		Period		0.007731856 //2.824 days, same as Lefrani
		Eccentricity    0.004
		Inclination     0
		AscendingNode   -90 //Aligns orbit with Jestefad
		ArgOfPericenter 0
		MeanAnomaly     142
		RefPlane       "Equator"
	}
}
Planet	"Jestefad"
{
	ParentBody     "Jestefad-Lefrani"
	Class	       "GasGiant"

	Mass            194
	Radius          64000
	InertiaMoment   0.3975344
	Obliquity	0

	Albedo          0.7
	Color         ( 0.909 0.850 0.764 )
	

	Orbit
	{
		SemiMajorAxis   0.002
		Eccentricity    0.004
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     142
		RefPlane       "Equator"
	}
}

Planet	"Lefrani"
{
	ParentBody     "Jestefad-Lefrani"
	Class	       "GasGiant"

	Mass            164
	Radius          54500
	InertiaMoment   0.3975344
	Obliquity	0

	Albedo          0.7
	Color         ( 0.909 0.850 0.764 )
	

	Orbit
	{
		SemiMajorAxis   0.002
		Eccentricity    0.004
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 180
		MeanAnomaly     142
		RefPlane       "Equator"
	}
}

Planet	"Rietta"
{
	ParentBody     "Priate"
	Class	       "GasGiant"

	Mass            173
	Radius          72000
	InertiaMoment   0.3975344

	Albedo          0.5
	Color         ( 1.000 1.000 1.000 )
	

	Orbit
	{
		SemiMajorAxis   1.64
		//Period          1.55
		Eccentricity    0.002
		Inclination     0.005
		AscendingNode   345
		ArgOfPericenter 5.5
		MeanAnomaly     140
		RefPlane       "Equator"
	}
}

Moon	"Rietta 1"
{
	ParentBody     "Rietta"
	Class	       "Selena"

	Mass            0.32
	Radius          1755
	InertiaMoment   0.3975344

	Albedo          0.35

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.00101605724
		//Period          0.0219032741
		Eccentricity    0.004
		Inclination     0.002
		AscendingNode   345
		ArgOfPericenter 2.5
		MeanAnomaly     140
		RefPlane       "Equator"
	}
}

Moon	"Rietta 2"
{
	ParentBody     "Rietta"
	Class	       "Desert"

	Mass            0.74
	Radius          364

	Albedo          0.5

	Orbit
	{
		SemiMajorAxis   0.0012433332
		//Period          0.026
		Eccentricity    0.003
		Inclination     5
		AscendingNode   340
		ArgOfPericenter 7.2
		MeanAnomaly     145.5
		RefPlane       "Equator"
	}
}

Asteroid	"Unidentified Mustafar system planetoid/UMSP/Priate 6"
{
	ParentBody     "Priate"

	Radius          274
	InertiaMoment   0.3975344

	Albedo          0.75	

	Orbit
	{
		SemiMajorAxis   1.84
		//Period          2
		Eccentricity    0.005
		Inclination     20
		AscendingNode   340
		ArgOfPericenter 9.2
		MeanAnomaly     137
		RefPlane       "Equator"
	}
}
