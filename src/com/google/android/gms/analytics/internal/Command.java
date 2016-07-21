package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new Command.1();
  private String mValue;
  private String zzRt;
  private String zzyv;
  
  public Command() {}
  
  Command(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }
  
  private void readFromParcel(Parcel paramParcel)
  {
    zzyv = paramParcel.readString();
    zzRt = paramParcel.readString();
    mValue = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getId()
  {
    return zzyv;
  }
  
  public String getValue()
  {
    return mValue;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(zzyv);
    paramParcel.writeString(zzRt);
    paramParcel.writeString(mValue);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.Command
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */