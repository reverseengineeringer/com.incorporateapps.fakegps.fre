package com.google.android.gms.tagmanager;

class zzde
  extends Number
  implements Comparable
{
  private double zzblB;
  private long zzblC;
  private boolean zzblD;
  
  private zzde(double paramDouble)
  {
    zzblB = paramDouble;
    zzblD = false;
  }
  
  private zzde(long paramLong)
  {
    zzblC = paramLong;
    zzblD = true;
  }
  
  public static zzde zza(Double paramDouble)
  {
    return new zzde(paramDouble.doubleValue());
  }
  
  public static zzde zzam(long paramLong)
  {
    return new zzde(paramLong);
  }
  
  public static zzde zzgs(String paramString)
  {
    try
    {
      zzde localzzde1 = new zzde(Long.parseLong(paramString));
      return localzzde1;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        zzde localzzde2 = new zzde(Double.parseDouble(paramString));
        return localzzde2;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        throw new NumberFormatException(paramString + " is not a valid TypedNumber");
      }
    }
  }
  
  public byte byteValue()
  {
    return (byte)(int)longValue();
  }
  
  public double doubleValue()
  {
    if (zzHv()) {
      return zzblC;
    }
    return zzblB;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof zzde)) && (zza((zzde)paramObject) == 0);
  }
  
  public float floatValue()
  {
    return (float)doubleValue();
  }
  
  public int hashCode()
  {
    return new Long(longValue()).hashCode();
  }
  
  public int intValue()
  {
    return zzHx();
  }
  
  public long longValue()
  {
    return zzHw();
  }
  
  public short shortValue()
  {
    return zzHy();
  }
  
  public String toString()
  {
    if (zzHv()) {
      return Long.toString(zzblC);
    }
    return Double.toString(zzblB);
  }
  
  public boolean zzHu()
  {
    return !zzHv();
  }
  
  public boolean zzHv()
  {
    return zzblD;
  }
  
  public long zzHw()
  {
    if (zzHv()) {
      return zzblC;
    }
    return zzblB;
  }
  
  public int zzHx()
  {
    return (int)longValue();
  }
  
  public short zzHy()
  {
    return (short)(int)longValue();
  }
  
  public int zza(zzde paramzzde)
  {
    if ((zzHv()) && (paramzzde.zzHv())) {
      return new Long(zzblC).compareTo(Long.valueOf(zzblC));
    }
    return Double.compare(doubleValue(), paramzzde.doubleValue());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzde
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */