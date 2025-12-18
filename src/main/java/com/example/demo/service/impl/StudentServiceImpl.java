@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository stdRepo;

    @Override
    public Student postStudent(Student st) {
        return stdRepo.save(st);
    }

    @Override
    public List<Student> getAllStudents() {
        return stdRepo.findAll();
    }

    @Override
    public Optional<Student> getById(Long id) {
        return stdRepo.findById(id);
    }

    @Override
    public String updateData(Long id, Student st) {
        boolean status = stdRepo.existsById(id);

        if (status) {
            st.setId(id);
            stdRepo.save(st);
            return "Student updated successfully";
        } else {
            return "Student with ID " + id + " not found";
        }
    }
}
