package com.google.android.gms.location.places.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.R.id;
import com.google.android.gms.R.layout;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLngBounds;

public class SupportPlaceAutocompleteFragment
  extends Fragment
{
  private View zzaRh;
  private View zzaRi;
  private EditText zzaRj;
  private LatLngBounds zzaRk;
  private AutocompleteFilter zzaRl;
  private PlaceSelectionListener zzaRm;
  
  private void zzzF()
  {
    int j = 0;
    View localView;
    if (!zzaRj.getText().toString().isEmpty())
    {
      i = 1;
      localView = zzaRi;
      if (i == 0) {
        break label42;
      }
    }
    label42:
    for (int i = j;; i = 8)
    {
      localView.setVisibility(i);
      return;
      i = 0;
      break;
    }
  }
  
  private void zzzG()
  {
    try
    {
      startActivityForResult(new PlaceAutocomplete.IntentBuilder(2).setBoundsBias(zzaRk).setFilter(zzaRl).zzeq(zzaRj.getText().toString()).zzig(1).build(getActivity()), 1);
      i = -1;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      for (;;)
      {
        i = localGooglePlayServicesRepairableException.getConnectionStatusCode();
        Log.e("Places", "Could not open autocomplete activity", localGooglePlayServicesRepairableException);
      }
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;)
      {
        int i = errorCode;
        Log.e("Places", "Could not open autocomplete activity", localGooglePlayServicesNotAvailableException);
      }
    }
    if (i != -1) {
      GoogleApiAvailability.getInstance().showErrorDialogFragment(getActivity(), i, 2);
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject;
    if (paramInt1 == 1)
    {
      if (paramInt2 != -1) {
        break label62;
      }
      localObject = PlaceAutocomplete.getPlace(getActivity(), paramIntent);
      if (zzaRm != null) {
        zzaRm.onPlaceSelected((Place)localObject);
      }
      setText(((Place)localObject).getName().toString());
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      label62:
      if (paramInt2 == 2)
      {
        localObject = PlaceAutocomplete.getStatus(getActivity(), paramIntent);
        if (zzaRm != null) {
          zzaRm.onError((Status)localObject);
        }
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(R.layout.place_autocomplete_fragment, paramViewGroup, false);
    zzaRh = paramLayoutInflater.findViewById(R.id.place_autocomplete_search_button);
    zzaRi = paramLayoutInflater.findViewById(R.id.place_autocomplete_clear_button);
    zzaRj = ((EditText)paramLayoutInflater.findViewById(R.id.place_autocomplete_search_input));
    paramViewGroup = new SupportPlaceAutocompleteFragment.1(this);
    zzaRh.setOnClickListener(paramViewGroup);
    zzaRj.setOnClickListener(paramViewGroup);
    zzaRi.setOnClickListener(new SupportPlaceAutocompleteFragment.2(this));
    zzzF();
    return paramLayoutInflater;
  }
  
  public void onDestroyView()
  {
    zzaRh = null;
    zzaRi = null;
    zzaRj = null;
    super.onDestroyView();
  }
  
  public void setBoundsBias(LatLngBounds paramLatLngBounds)
  {
    zzaRk = paramLatLngBounds;
  }
  
  public void setFilter(AutocompleteFilter paramAutocompleteFilter)
  {
    zzaRl = paramAutocompleteFilter;
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    zzaRj.setHint(paramCharSequence);
    zzaRh.setContentDescription(paramCharSequence);
  }
  
  public void setOnPlaceSelectedListener(PlaceSelectionListener paramPlaceSelectionListener)
  {
    zzaRm = paramPlaceSelectionListener;
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    zzaRj.setText(paramCharSequence);
    zzzF();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.ui.SupportPlaceAutocompleteFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */