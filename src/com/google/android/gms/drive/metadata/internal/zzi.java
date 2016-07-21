package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.zzx;

public class zzi
{
  private String zzasR;
  
  private zzi(String paramString)
  {
    zzasR = paramString.toLowerCase();
  }
  
  public static zzi zzdd(String paramString)
  {
    if ((paramString == null) || (!paramString.isEmpty())) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      if (paramString != null) {
        break;
      }
      return null;
    }
    return new zzi(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      if (paramObject == this) {
        return true;
      }
    } while (paramObject.getClass() != getClass());
    paramObject = (zzi)paramObject;
    return zzasR.equals(zzasR);
  }
  
  public int hashCode()
  {
    return zzasR.hashCode();
  }
  
  public boolean isFolder()
  {
    return zzasR.equals("application/vnd.google-apps.folder");
  }
  
  public String toString()
  {
    return zzasR;
  }
  
  public boolean zztH()
  {
    return (!zztI()) && (!isFolder());
  }
  
  public boolean zztI()
  {
    return zzasR.startsWith("application/vnd.google-apps");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */