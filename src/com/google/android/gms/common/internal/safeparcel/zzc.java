package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzx;

public final class zzc
{
  public static SafeParcelable zza(Intent paramIntent, String paramString, Parcelable.Creator paramCreator)
  {
    paramIntent = paramIntent.getByteArrayExtra(paramString);
    if (paramIntent == null) {
      return null;
    }
    return zza(paramIntent, paramCreator);
  }
  
  public static SafeParcelable zza(byte[] paramArrayOfByte, Parcelable.Creator paramCreator)
  {
    zzx.zzz(paramCreator);
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    paramArrayOfByte = (SafeParcelable)paramCreator.createFromParcel(localParcel);
    localParcel.recycle();
    return paramArrayOfByte;
  }
  
  public static void zza(SafeParcelable paramSafeParcelable, Intent paramIntent, String paramString)
  {
    paramIntent.putExtra(paramString, zza(paramSafeParcelable));
  }
  
  public static byte[] zza(SafeParcelable paramSafeParcelable)
  {
    Parcel localParcel = Parcel.obtain();
    paramSafeParcelable.writeToParcel(localParcel, 0);
    paramSafeParcelable = localParcel.marshall();
    localParcel.recycle();
    return paramSafeParcelable;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */