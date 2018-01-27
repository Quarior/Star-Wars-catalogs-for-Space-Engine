// http://starwars.wikia.com/wiki/Coruscant
// Region : Core
// Sector : Corusca/Coruscant Subsector
// Grid location : L9
// X : 0, Y : 0, Z : 556.1208224106006
Planet	"Revisse"
{
	ParentBody     "Coruscant Prime"
	Class          "Selena"

    Radius          2232      // Radius in km  
	Mass            0.2
    RotationPeriod  56        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.2     // Orbital period in years 
		SemiMajorAxis  0.2873
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Platoril"
{
	ParentBody     "Coruscant Prime"
	Class          "Selena"

    Radius          4262      // Radius in km  
	Mass            0.6
    RotationPeriod  22        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.5     // Orbital period in years 
		SemiMajorAxis  0.5734
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Vandor-1"
{
	ParentBody     "Coruscant Prime"
	Class          "Selena"

    Radius          5931      // Radius in km  
	Mass            0.7
    RotationPeriod  24        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.8     // Orbital period in years 
		SemiMajorAxis  0.7632
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Vandor-2"
{
	ParentBody     "Coruscant Prime"
	Class          "Selena"

    Radius          6055       // Radius in km  
	Mass            0.75
    RotationPeriod  26        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         1.1     // Orbital period in years 
		SemiMajorAxis  0.8745
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Vandor-3"
{
	ParentBody     "Coruscant Prime"
	Class          "Terra"

    Radius          5421      // Radius in km  
	Mass            0.625
    RotationPeriod  28        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
   		seaLevel        0.7948   // Sea level height (0...1) 
	}
	
	Atmosphere
	{
		Model "Earth"
		
		Pressure 0.71
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	Orbit
	{
		Epoch          2454762
        //Period         1.420985     // Orbital period in years 
		SemiMajorAxis  1.0432
		Inclination    2.5
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Coruscant"
{
	ParentBody     "Coruscant Prime"
	Class          "Terra"

	Mass            1.0			// Earth's masses
	Radius          6120     // km
	Oblateness      0.00335

	Age	            4.54        // billions years

	RotationPeriod  23.9344694  // hours
	RotationOffset  100.5       // degrees
	Precession      25592       // years
	Obliquity       23.4392911  // degrees
	EqAscendNode    180.0

	Color         ( 0.850 0.850 1.000 )
	Albedo          0.367

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		DiffMap        "Coruscant/Diff"
		DiffTileSize    130
		DiffTileBorder  1  
		DiffMapAlpha   "Water"
		BumpMap        "Coruscant/Bump"
		BumpTileSize    1024
		BumpTileBorder  1
		BumpHeight 20
		BumpOffset 0
		GlowMap        "Coruscant/Glow"
		GlowMode       "Permanent" //"Night"
		GlowTileSize    130
		GlowTileBorder  1  
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
	}

	NoOcean    true
	/*Ocean
	{
		Height 0.907
	}*/

	Clouds
	{
		Height          19.96016
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.331
		mainOctaves     10
		Coverage        0.114
		twistZones      5.159
		twistMagn       5.000
	}

	Atmosphere
	{
		Height      62		// km
		Greenhouse  55		// degrees K
		Pressure    1.0		// atm
		Density     1.2929	// kg/m^3
		Model      "Earth"
		Bright      5.0
		Opacity     1.0
		SkyLight    3.0
		EclipseBright  250.0
		EclipseColor ( 1.000 0.600 0.200 )
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	Aurora
	{
		Height       100   // km
        TopColor    (0.5 0.5 0.5)	// multiplier
        BottomColor (0.0 1.0 0.0)	// color

		NorthLat     82    // degrees
		NorthLon    -113   // degrees
		NorthRadius  2500  // km
		NorthWidth   600   // km
		NorthRings   3     // number of rings
		NorthBright  0.3

		SouthLat    -63    // degrees
		SouthLon     138   // degrees
		SouthRadius  2000  // km
		SouthWidth   600   // km
		SouthRings   3     // number of rings
		SouthBright  0.3
	}

	NoRings		true

	Orbit
	{
		//Period          1.00755	// years
		SemiMajorAxis   1.3521	// a.u.
		Eccentricity    0.0549
		Inclination     5.15		// deg
		MeanAnomaly     135.27		// deg
		AscendingNode   125.08		// deg
		ArgOfPericen    138.15		// deg
		//AscNodePreces   18.6		// years
		//ArgOfPeriPreces 5.997		// years
	}
}

Moon	"Centax-1"
{
	ParentBody     "Coruscant"
	Class          "Terra"

    Radius          3412      // Radius in km  
	Mass            0.531
    RotationPeriod  21        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
   		seaLevel        0.7948   // Sea level height (0...1) 
	}
	
	Atmosphere
	{
		Model "Earth"
		Pressure 0.62
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	Orbit
	{
		Epoch          2454762
        //Period         0.00624     // Orbital period in years 
		SemiMajorAxis  0.0008321
		Inclination    2.5
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Centax-2"
{
	ParentBody     "Coruscant"
	Class          "Selena"

    Radius          2831      // Radius in km  
	Mass            0.312549
    RotationPeriod  25        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Atmosphere
	{
		Model "Earth"
		Pressure 0.52
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}
	
	Orbit
	{
		Epoch          2454762
        //Period         0.00824     // Orbital period in years 
		SemiMajorAxis  0.0012321
		Inclination    4.2
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Centax-3"
{
	ParentBody     "Coruscant"
	Class          "Desert"

    Radius          3412      // Radius in km  
	Mass            0.472549
    RotationPeriod  33        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.01624     // Orbital period in years 
		SemiMajorAxis  0.0015321
		Inclination    2.2
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Hesperidium"
{
	ParentBody     "Coruscant"
	Class          "Terra"

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

    Radius          4281      // Radius in km  
	Mass            0.631
    RotationPeriod  34        // Rotation period in hours 

	Atmosphere
	{
		Model "Earth"
		Pressure 0.6
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}
	
	Orbit
	{
		Epoch          2454762
        //Period         0.02024     // Orbital period in years 
		SemiMajorAxis  0.0019321
		Inclination    12.5
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Planet	"Muscave"
{
	ParentBody     "Coruscant Prime"
	Class          "GasGiant"

    Radius          85000      // Radius in km  
	Mass            235
    RotationPeriod  14        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         4.920985     // Orbital period in years 
		SemiMajorAxis  1.7432
		Inclination    2.5
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Stentat"
{
	ParentBody     "Coruscant Prime"
	Class          "GasGiant"

    Radius          95000      // Radius in km  
	Mass            250
    RotationPeriod  15.6        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         7.9428     // Orbital period in years 
		SemiMajorAxis  1.9432
		Inclination    2.5
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Improcco"
{
	ParentBody     "Coruscant Prime"
	Class          "IceWorld"

    Radius          2540      // Radius in km  
	Mass            0.23
    RotationPeriod  64        // Rotation period in hours 

	NoAtmosphere    true

	NoClouds        true

	Orbit
	{
		Epoch          2454762
        //Period         7.322     // Orbital period in years 
		SemiMajorAxis  2.5343
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon		"Frozen Moon of Improcco"
{
	ParentBody     "Improcco"
	Class          "IceWorld"

    Radius          1430      // Radius in km  
	Mass            0.16
    RotationPeriod  36        // Rotation period in hours 

	NoAtmosphere    true

	NoClouds        true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.0005321299
		Inclination    125.0
		Eccentricity   0.03
		ArgOfPericen   9.29
	}
}

Planet "Ulabos"
{
 ParentBody     "Coruscant Prime"
 Class          "IceWorld"

 Radius          4159      // Radius in km  
 Mass            0.6
 RotationPeriod  81        // Rotation period in hours 

 NoAtmosphere    true

 NoClouds        true

 NoAurora        true

 NoCometTail     true

 Rings       // Rings tag 
      { 
         InnerRadius      4588.34  // Inner raduis of rings system in km 
         OuterRadius      23195.4 // Outer radius of rings system in km 
         FrontBright      1.0     // Direct lighting brightness 
         BackBright       5.0     // Back lighting brightness (scattering) 
         Density          1.0     // Density (opacity) 
         Brightness       5.0     // Global brightness 
      } 

 Orbit
 {
 Epoch          2454762
 SemiMajorAxis  4.1025
 Inclination    0.275
 Eccentricity   0.1
 ArgOfPericen   9.2
 }
}

DwarfPlanet "Nabatu"
{
 ParentBody     "Coruscant Prime"
 Class          "IceWorld"
 Radius          978      // Radius in km  
 Mass            0.1
 RotationPeriod  14        // Rotation period in hours 

 NoAtmosphere    true

 NoClouds        true

 Orbit
 {
 Epoch          2454762
 SemiMajorAxis  5.616
 Inclination    11.09
 Eccentricity   0.45
 ArgOfPericen   9.2
 }
}
