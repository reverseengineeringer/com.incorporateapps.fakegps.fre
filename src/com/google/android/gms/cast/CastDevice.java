package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CastDevice
  implements SafeParcelable
{
  public static final int CAPABILITY_AUDIO_IN = 8;
  public static final int CAPABILITY_AUDIO_OUT = 4;
  public static final int CAPABILITY_MULTIZONE_GROUP = 32;
  public static final int CAPABILITY_VIDEO_IN = 2;
  public static final int CAPABILITY_VIDEO_OUT = 1;
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  private int zzBc;
  private String zzZT;
  String zzZU;
  private Inet4Address zzZV;
  private String zzZW;
  private String zzZX;
  private String zzZY;
  private int zzZZ;
  private List zzaaa;
  private int zzaab;
  private String zzaac;
  
  private CastDevice()
  {
    this(4, null, null, null, null, null, -1, new ArrayList(), 0, -1, null);
  }
  
  CastDevice(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, List paramList, int paramInt3, int paramInt4, String paramString6)
  {
    mVersionCode = paramInt1;
    zzZT = zzbZ(paramString1);
    zzZU = zzbZ(paramString2);
    if (!TextUtils.isEmpty(zzZU)) {}
    try
    {
      paramString1 = InetAddress.getByName(zzZU);
      if ((paramString1 instanceof Inet4Address)) {
        zzZV = ((Inet4Address)paramString1);
      }
      zzZW = zzbZ(paramString3);
      zzZX = zzbZ(paramString4);
      zzZY = zzbZ(paramString5);
      zzZZ = paramInt2;
      if (paramList != null)
      {
        zzaaa = paramList;
        zzaab = paramInt3;
        zzBc = paramInt4;
        zzaac = zzbZ(paramString6);
        return;
      }
    }
    catch (UnknownHostException paramString1)
    {
      for (;;)
      {
        Log.i("CastDevice", "Unable to convert host address (" + zzZU + ") to ipaddress: " + paramString1.getMessage());
        continue;
        paramList = new ArrayList();
      }
    }
  }
  
  public static CastDevice getFromBundle(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    paramBundle.setClassLoader(CastDevice.class.getClassLoader());
    return (CastDevice)paramBundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
  }
  
  private static String zzbZ(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      do
      {
        return true;
        if (!(paramObject instanceof CastDevice)) {
          return false;
        }
        paramObject = (CastDevice)paramObject;
        if (zzZT != null) {
          break;
        }
      } while (zzZT == null);
      return false;
    } while ((zzf.zza(zzZT, zzZT)) && (zzf.zza(zzZV, zzZV)) && (zzf.zza(zzZX, zzZX)) && (zzf.zza(zzZW, zzZW)) && (zzf.zza(zzZY, zzZY)) && (zzZZ == zzZZ) && (zzf.zza(zzaaa, zzaaa)) && (zzaab == zzaab) && (zzBc == zzBc) && (zzf.zza(zzaac, zzaac)));
    return false;
  }
  
  public int getCapabilities()
  {
    return zzaab;
  }
  
  public String getDeviceId()
  {
    if (zzZT.startsWith("__cast_nearby__")) {
      return zzZT.substring(16);
    }
    return zzZT;
  }
  
  public String getDeviceVersion()
  {
    return zzZY;
  }
  
  public String getFriendlyName()
  {
    return zzZW;
  }
  
  public WebImage getIcon(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    if (zzaaa.isEmpty()) {
      return null;
    }
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      return (WebImage)zzaaa.get(0);
    }
    Iterator localIterator = zzaaa.iterator();
    Object localObject2 = null;
    WebImage localWebImage;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        localWebImage = (WebImage)localIterator.next();
        int i = localWebImage.getWidth();
        int j = localWebImage.getHeight();
        if ((i >= paramInt1) && (j >= paramInt2))
        {
          if ((localObject2 != null) && ((((WebImage)localObject2).getWidth() <= i) || (((WebImage)localObject2).getHeight() <= j))) {
            break label218;
          }
          localObject2 = localWebImage;
        }
        else
        {
          if ((i >= paramInt1) || (j >= paramInt2)) {
            break label218;
          }
          localObject3 = localWebImage;
          if (localObject1 != null) {
            if ((((WebImage)localObject1).getWidth() >= i) || (((WebImage)localObject1).getHeight() >= j)) {
              break label218;
            }
          }
        }
      }
    }
    label218:
    for (Object localObject3 = localWebImage;; localObject3 = localObject1)
    {
      localObject1 = localObject3;
      break;
      if (localObject2 != null) {}
      for (;;)
      {
        return (WebImage)localObject2;
        if (localObject1 != null) {
          localObject2 = localObject1;
        } else {
          localObject2 = (WebImage)zzaaa.get(0);
        }
      }
    }
  }
  
  public List getIcons()
  {
    return Collections.unmodifiableList(zzaaa);
  }
  
  public Inet4Address getIpAddress()
  {
    return zzZV;
  }
  
  public String getModelName()
  {
    return zzZX;
  }
  
  public int getServicePort()
  {
    return zzZZ;
  }
  
  public int getStatus()
  {
    return zzBc;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public boolean hasCapabilities(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return false;
    }
    int j = paramArrayOfInt.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label33;
      }
      if (!hasCapability(paramArrayOfInt[i])) {
        break;
      }
      i += 1;
    }
    label33:
    return true;
  }
  
  public boolean hasCapability(int paramInt)
  {
    return (zzaab & paramInt) == paramInt;
  }
  
  public boolean hasIcons()
  {
    return !zzaaa.isEmpty();
  }
  
  public int hashCode()
  {
    if (zzZT == null) {
      return 0;
    }
    return zzZT.hashCode();
  }
  
  public boolean isOnLocalNetwork()
  {
    return !zzZT.startsWith("__cast_nearby__");
  }
  
  public boolean isSameDevice(CastDevice paramCastDevice)
  {
    if (paramCastDevice == null) {}
    do
    {
      return false;
      if (zzZT != null) {
        break;
      }
    } while (zzZT != null);
    return true;
    return zzf.zza(zzZT, zzZT);
  }
  
  public void putInBundle(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    paramBundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
  }
  
  public String toString()
  {
    return String.format("\"%s\" (%s)", new Object[] { zzZW, zzZT });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzny()
  {
    return zzZT;
  }
  
  public String zznz()
  {
    return zzaac;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastDevice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */