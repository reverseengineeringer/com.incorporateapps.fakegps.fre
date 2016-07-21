package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class DataSource
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
  public static final int TYPE_DERIVED = 1;
  public static final int TYPE_RAW = 0;
  private final String mName;
  private final int mVersionCode;
  private final int zzabB;
  private final DataType zzavT;
  private final Device zzawr;
  private final Application zzaws;
  private final String zzawt;
  private final String zzawu;
  
  DataSource(int paramInt1, DataType paramDataType, String paramString1, int paramInt2, Device paramDevice, Application paramApplication, String paramString2)
  {
    mVersionCode = paramInt1;
    zzavT = paramDataType;
    zzabB = paramInt2;
    mName = paramString1;
    zzawr = paramDevice;
    zzaws = paramApplication;
    zzawt = paramString2;
    zzawu = zzun();
  }
  
  private DataSource(DataSource.Builder paramBuilder)
  {
    mVersionCode = 3;
    zzavT = DataSource.Builder.zza(paramBuilder);
    zzabB = DataSource.Builder.zzb(paramBuilder);
    mName = DataSource.Builder.zzc(paramBuilder);
    zzawr = DataSource.Builder.zzd(paramBuilder);
    zzaws = DataSource.Builder.zze(paramBuilder);
    zzawt = DataSource.Builder.zzf(paramBuilder);
    zzawu = zzun();
  }
  
  public static DataSource extract(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    return (DataSource)zzc.zza(paramIntent, "vnd.google.fitness.data_source", CREATOR);
  }
  
  private String getTypeString()
  {
    switch (zzabB)
    {
    default: 
      throw new IllegalArgumentException("invalid type value");
    case 0: 
      return "raw";
    }
    return "derived";
  }
  
  private boolean zza(DataSource paramDataSource)
  {
    return zzawu.equals(zzawu);
  }
  
  private String zzun()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getTypeString());
    localStringBuilder.append(":").append(zzavT.getName());
    if (zzaws != null) {
      localStringBuilder.append(":").append(zzaws.getPackageName());
    }
    if (zzawr != null) {
      localStringBuilder.append(":").append(zzawr.getStreamIdentifier());
    }
    if (zzawt != null) {
      localStringBuilder.append(":").append(zzawt);
    }
    return localStringBuilder.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataSource)) && (zza((DataSource)paramObject)));
  }
  
  public String getAppPackageName()
  {
    if (zzaws == null) {
      return null;
    }
    return zzaws.getPackageName();
  }
  
  public DataType getDataType()
  {
    return zzavT;
  }
  
  public Device getDevice()
  {
    return zzawr;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public String getStreamIdentifier()
  {
    return zzawu;
  }
  
  public String getStreamName()
  {
    return zzawt;
  }
  
  public int getType()
  {
    return zzabB;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzawu.hashCode();
  }
  
  public String toDebugString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (zzabB == 0)
    {
      str = "r";
      localStringBuilder = localStringBuilder.append(str).append(":").append(zzavT.zzuo());
      if (zzaws != null) {
        break label148;
      }
      str = "";
      label49:
      localStringBuilder = localStringBuilder.append(str);
      if (zzawr == null) {
        break label193;
      }
      str = ":" + zzawr.getModel() + ":" + zzawr.getUid();
      label100:
      localStringBuilder = localStringBuilder.append(str);
      if (zzawt == null) {
        break label199;
      }
    }
    label148:
    label193:
    label199:
    for (String str = ":" + zzawt;; str = "")
    {
      return str;
      str = "d";
      break;
      if (zzaws.equals(Application.zzawa))
      {
        str = ":gms";
        break label49;
      }
      str = ":" + zzaws.getPackageName();
      break label49;
      str = "";
      break label100;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DataSource{");
    localStringBuilder.append(getTypeString());
    if (mName != null) {
      localStringBuilder.append(":").append(mName);
    }
    if (zzaws != null) {
      localStringBuilder.append(":").append(zzaws);
    }
    if (zzawr != null) {
      localStringBuilder.append(":").append(zzawr);
    }
    if (zzawt != null) {
      localStringBuilder.append(":").append(zzawt);
    }
    localStringBuilder.append(":").append(zzavT);
    return "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public Application zzum()
  {
    return zzaws;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.DataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */