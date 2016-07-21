package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zzb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

public class zzo
  extends zzb
{
  public zzo(String paramString, int paramInt)
  {
    super(paramString, Collections.singleton(paramString), Collections.emptySet(), paramInt);
  }
  
  public static Collection zzde(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramString = new JSONArray(paramString);
    int i = 0;
    while (i < paramString.length())
    {
      localArrayList.add(paramString.getString(i));
      i += 1;
    }
    return Collections.unmodifiableCollection(localArrayList);
  }
  
  protected void zza(Bundle paramBundle, Collection paramCollection)
  {
    paramBundle.putStringArrayList(getName(), new ArrayList(paramCollection));
  }
  
  protected Collection zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    try
    {
      paramDataHolder = zzde(paramDataHolder.zzd(getName(), paramInt1, paramInt2));
      return paramDataHolder;
    }
    catch (JSONException paramDataHolder)
    {
      throw new IllegalStateException("DataHolder supplied invalid JSON", paramDataHolder);
    }
  }
  
  protected Collection zzs(Bundle paramBundle)
  {
    return paramBundle.getStringArrayList(getName());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */