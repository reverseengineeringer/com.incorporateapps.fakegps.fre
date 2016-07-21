package android.support.v4.os;

import android.os.Parcel;

public abstract interface ParcelableCompatCreatorCallbacks
{
  public abstract Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader);
  
  public abstract Object[] newArray(int paramInt);
}

/* Location:
 * Qualified Name:     android.support.v4.os.ParcelableCompatCreatorCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */