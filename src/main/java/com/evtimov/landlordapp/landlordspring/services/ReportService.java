package com.evtimov.landlordapp.landlordspring.services;

import com.evtimov.landlordapp.landlordspring.models.Report;
import com.evtimov.landlordapp.landlordspring.repositories.base.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {
    private final ReportRepository repository;

    @Autowired
    public ReportService(ReportRepository repository) {
        this.repository = repository;
    }

    public void createReport(Report report) {

    }

    public void updateReportStatus(int id){

    }

    public List<Report> getAllResolvedReports(int id){
        return null;
    }

    public List<Report> getAllUnresolvedReports(int id){
        return null;
    }

    public Report getReportById(int id) {
        return null;
    }

    private List<Report> getAllReportsByPlaceId(int id) {
        return null;
    }
}
