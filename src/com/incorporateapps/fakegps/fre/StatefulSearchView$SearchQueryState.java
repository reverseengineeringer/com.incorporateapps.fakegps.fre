package com.incorporateapps.fakegps.fre;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View.BaseSavedState;

class StatefulSearchView$SearchQueryState
  extends View.BaseSavedState
{
  private boolean b;
  private String c;
  
  public StatefulSearchView$SearchQueryState(StatefulSearchView paramStatefulSearchView, Parcelable paramParcelable, String paramString, boolean paramBoolean)
  {
    super(paramParcelable);
    c = paramString;
    b = paramBoolean;
  }
  
  public final boolean a()
  {
    return b;
  }
  
  public final String b()
  {
    return c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(c);
    if (b) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.StatefulSearchView.SearchQueryState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */